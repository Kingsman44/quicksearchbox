package com.google.android.gms.learning.internal.training;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.learning.internal.training.u */
/* compiled from: PG */
public interface C144817u extends IInterface {
    void addHttpUrlConnectionFactory(String str, C144802f fVar);

    IBinder onBind(Intent intent);

    void onCreate(C144165j jVar);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);

    @Deprecated
    void setPRFSdkImpl();
}
