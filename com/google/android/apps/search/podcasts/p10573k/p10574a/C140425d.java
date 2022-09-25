package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.p484e.p485a.C9053c;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.k.a.d */
/* compiled from: PG */
public final /* synthetic */ class C140425d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140433l f381441a;

    /* renamed from: b */
    public final /* synthetic */ List f381442b;

    /* renamed from: c */
    public final /* synthetic */ String f381443c;

    /* renamed from: d */
    public final /* synthetic */ List f381444d;

    public /* synthetic */ C140425d(C140433l lVar, List list, String str, List list2) {
        this.f381441a = lVar;
        this.f381442b = list;
        this.f381443c = str;
        this.f381444d = list2;
    }

    public final void run() {
        C140433l lVar = this.f381441a;
        List list = this.f381442b;
        String str = this.f381443c;
        List list2 = this.f381444d;
        try {
            if (!list.isEmpty()) {
                C9053c cVar = lVar.f381471m;
                cVar.getClass();
                Bundle b = C140433l.m228139b(str, list);
                Parcel gA = cVar.mo17260gA();
                C8850c.m23497f(gA, b);
                C8850c.m23499h(gA, (IInterface) null);
                cVar.mo17263hf(8, gA);
            }
            if (!list2.isEmpty()) {
                C9053c cVar2 = lVar.f381471m;
                cVar2.getClass();
                Bundle b2 = C140433l.m228139b(str, list2);
                Parcel gA2 = cVar2.mo17260gA();
                C8850c.m23497f(gA2, b2);
                C8850c.m23499h(gA2, (IInterface) null);
                cVar2.mo17263hf(9, gA2);
            }
        } catch (RemoteException unused) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
