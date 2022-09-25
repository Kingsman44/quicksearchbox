package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1496c.C18104a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.d.b */
/* compiled from: PG */
public final /* synthetic */ class C18165b implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C18173j f51653a;

    /* renamed from: b */
    public final /* synthetic */ C18102c f51654b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f51655c;

    public /* synthetic */ C18165b(C18173j jVar, C18102c cVar, Bundle bundle) {
        this.f51653a = jVar;
        this.f51654b = cVar;
        this.f51655c = bundle;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C18173j jVar = this.f51653a;
        C18102c cVar2 = this.f51654b;
        Bundle bundle = this.f51655c;
        try {
            C18104a aVar = jVar.f51668c;
            String e = cVar2.mo23599e();
            C18171h hVar = new C18171h(cVar);
            Parcel gA = aVar.mo17260gA();
            gA.writeString(e);
            C8850c.m23497f(gA, bundle);
            C8850c.m23499h(gA, hVar);
            aVar.mo17263hf(3, gA);
            return "PerformDirectAction - Backported";
        } catch (RemoteException e2) {
            cVar.mo5439d(C18175l.m35385c(e2, 6));
            return "PerformDirectAction - Backported";
        }
    }
}
