package com.google.android.gms.learning.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.learning.internal.s */
/* compiled from: PG */
public interface C144787s extends IInterface {
    void init(C144165j jVar, C144784p pVar);

    IBinder onBind(Intent intent);

    void onDestroy();

    void onRebind(Intent intent);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
