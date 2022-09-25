package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.internal.C143810dd;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.ap */
/* compiled from: PG */
final class C145049ap extends C143810dd {

    /* renamed from: a */
    final /* synthetic */ C145050aq f392095a;

    /* renamed from: e */
    private final SyncPolicy f392096e;

    /* renamed from: f */
    private final TimeSeriesFootprintsSubscriptionFilter f392097f;

    public C145049ap(C145050aq aqVar, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        this.f392095a = aqVar;
        this.f392096e = syncPolicy;
        this.f392097f = timeSeriesFootprintsSubscriptionFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo57751a(C143717b bVar, C146010af afVar) {
        C145048ao aoVar = new C145048ao(afVar);
        C145064o oVar = (C145064o) ((C145071v) bVar).mo119451G();
        C145050aq aqVar = this.f392095a;
        Account account = aqVar.f392102e;
        int i = aqVar.f392103f;
        int i2 = aqVar.f392104g;
        SyncPolicy syncPolicy = this.f392096e;
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = this.f392097f;
        Parcel gA = oVar.mo17260gA();
        C8850c.m23499h(gA, aoVar);
        C8850c.m23497f(gA, account);
        gA.writeInt(i);
        gA.writeInt(i2);
        C8850c.m23497f(gA, syncPolicy);
        C8850c.m23497f(gA, timeSeriesFootprintsSubscriptionFilter);
        oVar.mo17262he(14, gA);
    }
}
