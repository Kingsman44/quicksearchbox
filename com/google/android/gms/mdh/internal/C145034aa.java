package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21651p;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.aa */
/* compiled from: PG */
public final /* synthetic */ class C145034aa implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145050aq f392059a;

    /* renamed from: b */
    public final /* synthetic */ C145044ak f392060b;

    /* renamed from: c */
    public final /* synthetic */ C21651p f392061c;

    public /* synthetic */ C145034aa(C145050aq aqVar, C145044ak akVar, C21651p pVar) {
        this.f392059a = aqVar;
        this.f392060b = akVar;
        this.f392061c = pVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145043aj ajVar;
        C145050aq aqVar = this.f392059a;
        C145044ak akVar = this.f392060b;
        C21651p pVar = this.f392061c;
        C145074y yVar = (C145074y) obj;
        synchronized (akVar.f392085c.f392106i) {
            if (!akVar.f392084b) {
                ajVar = null;
            } else {
                if (akVar.f392083a == null) {
                    akVar.f392083a = new C145043aj(akVar.f392085c.f392099b, pVar);
                }
                ajVar = akVar.f392083a;
            }
        }
        if (ajVar == null) {
            ((C146010af) obj2).f394698a.mo122508v((Object) null);
            return;
        }
        C145063n nVar = (C145063n) yVar.mo119451G();
        C145038ae aeVar = new C145038ae((C146010af) obj2);
        Account account = aqVar.f392102e;
        int i = aqVar.f392103f;
        int i2 = aqVar.f392104g;
        Parcel gA = nVar.mo17260gA();
        C8850c.m23499h(gA, aeVar);
        C8850c.m23497f(gA, account);
        gA.writeInt(i);
        gA.writeInt(i2);
        C8850c.m23499h(gA, ajVar);
        nVar.mo17262he(3, gA);
    }
}
