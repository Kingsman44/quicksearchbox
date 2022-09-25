package com.google.android.gms.location.reporting.p10843a;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.reporting.a.a */
/* compiled from: PG */
public final class C144959a extends C8848a implements IInterface {
    public C144959a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
    }

    /* renamed from: e */
    public final ReportingState mo120468e(Account account) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, account);
        Parcel gT = mo17261gT(1, gA);
        ReportingState reportingState = (ReportingState) C8850c.m23492a(gT, ReportingState.CREATOR);
        gT.recycle();
        return reportingState;
    }
}
