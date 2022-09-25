package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.util.LruCache;
import android.util.Pair;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.u */
/* compiled from: PG */
public final class C94800u {

    /* renamed from: a */
    public static final C59071e f265090a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.u");

    /* renamed from: b */
    public static final LruCache f265091b = new LruCache(20);

    /* renamed from: c */
    public final C94785f f265092c;

    /* renamed from: d */
    public final C22871g f265093d;

    public C94800u(C94785f fVar, C22871g gVar) {
        this.f265092c = fVar;
        this.f265093d = gVar;
    }

    /* renamed from: a */
    public static Pair m156368a(C51809dy dyVar) {
        SettableFuture settableFuture = new SettableFuture();
        StringBuilder sb = new StringBuilder();
        sb.append(C90719ac.f253778a.f253779b.nextLong());
        sb.append('_');
        sb.append(dyVar.hashCode());
        String sb2 = sb.toString();
        Pair pair = new Pair(dyVar, settableFuture);
        f265091b.put(sb2, pair);
        return new Pair(sb2, (SettableFuture) pair.second);
    }
}
