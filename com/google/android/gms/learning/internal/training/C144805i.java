package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IInterface;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.learning.internal.training.i */
/* compiled from: PG */
public interface C144805i extends IInterface {
    boolean init(C144165j jVar, C144165j jVar2);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    boolean onStartJob(JobParameters jobParameters);

    boolean onStopJob(JobParameters jobParameters);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
