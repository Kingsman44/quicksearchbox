package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C145051b implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145060k f392107a;

    /* renamed from: b */
    public final /* synthetic */ LatestFootprintFilter f392108b;

    public /* synthetic */ C145051b(C145060k kVar, LatestFootprintFilter latestFootprintFilter) {
        this.f392107a = kVar;
        this.f392108b = latestFootprintFilter;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145060k kVar = this.f392107a;
        LatestFootprintFilter latestFootprintFilter = this.f392108b;
        C145054e eVar = new C145054e((C146010af) obj2);
        C145064o oVar = (C145064o) ((C145071v) obj).mo119451G();
        Account account = kVar.f392128c;
        int i = kVar.f392129d;
        int i2 = kVar.f392130e;
        Parcel gA = oVar.mo17260gA();
        C8850c.m23499h(gA, eVar);
        C8850c.m23497f(gA, account);
        gA.writeInt(i);
        gA.writeInt(i2);
        C8850c.m23497f(gA, latestFootprintFilter);
        oVar.mo17262he(19, gA);
    }
}
