package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1496c.C18104a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.d.c */
/* compiled from: PG */
public final /* synthetic */ class C18166c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C18173j f51656a;

    public /* synthetic */ C18166c(C18173j jVar) {
        this.f51656a = jVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C18173j jVar = this.f51656a;
        try {
            C18104a aVar = jVar.f51668c;
            C18170g gVar = new C18170g(jVar, cVar);
            Parcel gA = aVar.mo17260gA();
            C8850c.m23499h(gA, gVar);
            aVar.mo17263hf(1, gA);
            return "RequestDirectActions - Backported";
        } catch (RemoteException e) {
            cVar.mo5439d(C18175l.m35385c(e, 6));
            return "RequestDirectActions - Backported";
        }
    }
}
