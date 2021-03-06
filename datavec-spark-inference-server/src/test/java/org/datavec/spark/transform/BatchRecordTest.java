package org.datavec.spark.transform;

import org.datavec.spark.transform.model.BatchRecord;
import org.junit.Test;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.factory.Nd4j;

import static org.junit.Assert.assertEquals;

/**
 * Created by agibsonccc on 2/12/17.
 */
public class BatchRecordTest {

    @Test
    public void testBatchRecordCreationFromDataSet() {
        DataSet dataSet = new DataSet(Nd4j.create(2, 2), Nd4j.create(new double[][] {{1, 1}, {1, 1}}));

        BatchRecord batchRecord = BatchRecord.fromDataSet(dataSet);
        assertEquals(2, batchRecord.getRecords().size());
    }

}
