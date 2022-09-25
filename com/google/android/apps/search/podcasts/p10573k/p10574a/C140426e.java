package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.p484e.p485a.C9053c;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.k.a.e */
/* compiled from: PG */
public final /* synthetic */ class C140426e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140433l f381445a;

    /* renamed from: b */
    public final /* synthetic */ String f381446b;

    /* renamed from: c */
    public final /* synthetic */ Set f381447c;

    /* renamed from: d */
    public final /* synthetic */ String f381448d;

    public /* synthetic */ C140426e(C140433l lVar, String str, Set set, String str2) {
        this.f381445a = lVar;
        this.f381446b = str;
        this.f381447c = set;
        this.f381448d = str2;
    }

    public final void run() {
        C140433l lVar = this.f381445a;
        String str = this.f381446b;
        Set set = this.f381447c;
        String str2 = this.f381448d;
        try {
            if (!TextUtils.isEmpty(str)) {
                C9053c cVar = lVar.f381471m;
                cVar.getClass();
                Bundle a = C140433l.m228138a(str);
                a.putBoolean("fetch_subscriptions", false);
                C140432k kVar = new C140432k(lVar, str, set);
                Parcel gA = cVar.mo17260gA();
                C8850c.m23497f(gA, a);
                C8850c.m23499h(gA, kVar);
                cVar.mo17263hf(6, gA);
            }
            if (!TextUtils.isEmpty(str2)) {
                C9053c cVar2 = lVar.f381471m;
                cVar2.getClass();
                Bundle a2 = C140433l.m228138a(str2);
                Parcel gA2 = cVar2.mo17260gA();
                C8850c.m23497f(gA2, a2);
                C8850c.m23499h(gA2, (IInterface) null);
                cVar2.mo17263hf(7, gA2);
            }
        } catch (RemoteException unused) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
