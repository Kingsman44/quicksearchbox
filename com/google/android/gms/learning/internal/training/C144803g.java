package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.g */
/* compiled from: PG */
public final class C144803g extends C8848a implements C144805i {
    public C144803g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    public final boolean init(C144165j jVar, C144165j jVar2) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        Parcel gT = mo17261gT(9, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final void onDestroy() {
        mo17262he(2, mo17260gA());
    }

    public final void onRebind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(6, gA);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        gA.writeInt(i);
        gA.writeInt(i2);
        Parcel gT = mo17261gT(4, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, jobParameters);
        Parcel gT = mo17261gT(7, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, jobParameters);
        Parcel gT = mo17261gT(8, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final void onTrimMemory(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(3, gA);
    }

    public final boolean onUnbind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(5, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
