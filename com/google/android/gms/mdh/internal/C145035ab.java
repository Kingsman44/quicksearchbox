package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.ab */
/* compiled from: PG */
public final /* synthetic */ class C145035ab implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145050aq f392062a;

    /* renamed from: b */
    public final /* synthetic */ C145044ak f392063b;

    public /* synthetic */ C145035ab(C145050aq aqVar, C145044ak akVar) {
        this.f392062a = aqVar;
        this.f392063b = akVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145043aj ajVar;
        C145050aq aqVar = this.f392062a;
        C145044ak akVar = this.f392063b;
        C145074y yVar = (C145074y) obj;
        C146010af afVar = new C146010af();
        C146010af afVar2 = (C146010af) obj2;
        afVar.f394698a.mo122493l(C146013ai.f394700a, new C145075z(afVar2));
        synchronized (akVar.f392085c.f392106i) {
            try {
                ajVar = akVar.f392083a;
                akVar.f392083a = null;
            } catch (Throwable th) {
                akVar.f392083a = null;
                throw th;
            }
        }
        if (ajVar != null) {
            C145063n nVar = (C145063n) yVar.mo119451G();
            C145038ae aeVar = new C145038ae(afVar);
            Account account = aqVar.f392102e;
            int i = aqVar.f392103f;
            int i2 = aqVar.f392104g;
            Parcel gA = nVar.mo17260gA();
            C8850c.m23499h(gA, aeVar);
            C8850c.m23497f(gA, account);
            gA.writeInt(i);
            gA.writeInt(i2);
            C8850c.m23499h(gA, ajVar);
            nVar.mo17262he(4, gA);
            return;
        }
        afVar2.f394698a.mo122507u(new C143842n(new Status(1, 13, "No listener registered", (PendingIntent) null, (ConnectionResult) null)));
    }
}
