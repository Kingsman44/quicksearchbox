package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.internal.C143810dd;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.j */
/* compiled from: PG */
final class C145059j extends C143810dd {

    /* renamed from: a */
    final /* synthetic */ C145060k f392123a;

    /* renamed from: e */
    private final SyncPolicy f392124e;

    /* renamed from: f */
    private final LatestFootprintFilter f392125f;

    public C145059j(C145060k kVar, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.f392123a = kVar;
        this.f392124e = syncPolicy;
        this.f392125f = latestFootprintFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo57751a(C143717b bVar, C146010af afVar) {
        C145058i iVar = new C145058i(afVar);
        C145064o oVar = (C145064o) ((C145071v) bVar).mo119451G();
        C145060k kVar = this.f392123a;
        Account account = kVar.f392128c;
        int i = kVar.f392129d;
        int i2 = kVar.f392130e;
        SyncPolicy syncPolicy = this.f392124e;
        LatestFootprintFilter latestFootprintFilter = this.f392125f;
        Parcel gA = oVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        C8850c.m23497f(gA, account);
        gA.writeInt(i);
        gA.writeInt(i2);
        C8850c.m23497f(gA, syncPolicy);
        C8850c.m23497f(gA, latestFootprintFilter);
        oVar.mo17262he(11, gA);
    }
}
