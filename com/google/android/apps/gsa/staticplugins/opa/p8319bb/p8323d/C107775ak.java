package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import android.util.LruCache;
import com.google.android.apps.gsa.search.core.p6491a.C84378x;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107491q;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107493s;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.ak */
/* compiled from: PG */
public final class C107775ak {

    /* renamed from: a */
    public static final C59071e f299889a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.d.ak");

    /* renamed from: b */
    public final C84378x f299890b;

    /* renamed from: c */
    public final C90719ac f299891c;

    /* renamed from: d */
    public final LruCache f299892d = new LruCache(100);

    /* renamed from: e */
    public final LruCache f299893e = new LruCache(100);

    public C107775ak(C84378x xVar, C90719ac acVar) {
        this.f299890b = xVar;
        this.f299891c = acVar;
    }

    /* renamed from: a */
    public final void mo96280a(C51809dy dyVar, SettableFuture settableFuture, C107491q qVar) {
        String str = (qVar.f299086a & 2) != 0 ? qVar.f299088c : "Unknown error";
        int a = C107493s.m178391a(qVar.f299087b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            settableFuture.mo57357o(new C22428d(dyVar));
        } else if (i == 2) {
            settableFuture.mo57357o(new C22371a(str));
        } else if (i == 3) {
            settableFuture.mo57357o(new C62974ct(str));
        } else if (i != 4) {
            settableFuture.mo57357o(new RuntimeException(str));
        } else {
            settableFuture.mo57357o(new C22534k());
        }
    }
}
