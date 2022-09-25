package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.staticplugins.bisto.sbcdecoder.JniSbcDecoder;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.r */
/* compiled from: PG */
public final class C95055r {

    /* renamed from: a */
    private static final C59071e f265940a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.a.r");

    /* renamed from: b */
    private final JniSbcDecoder f265941b;

    /* renamed from: c */
    private final Queue f265942c = new ArrayDeque();

    /* renamed from: d */
    private boolean f265943d;

    public C95055r(JniSbcDecoder jniSbcDecoder) {
        this.f265941b = jniSbcDecoder;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo88984a() {
        if (!this.f265943d) {
            C59104x b = f265940a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "JniSbcDecoderAccessor");
            ((C59052c) ((C59052c) b).mo56372aa(18144)).mo56386p("getDecoder: provided immediately");
            this.f265943d = true;
            return C60856cj.m92900i(this.f265941b);
        }
        C59104x b2 = f265940a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "JniSbcDecoderAccessor");
        ((C59052c) ((C59052c) b2).mo56372aa(18143)).mo56386p("getDecoder: queued");
        SettableFuture settableFuture = new SettableFuture();
        this.f265942c.add(settableFuture);
        return settableFuture;
    }

    /* renamed from: b */
    public final synchronized void mo88985b() {
        this.f265941b.mo89827a();
        if (this.f265942c.isEmpty()) {
            C59104x b = f265940a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "JniSbcDecoderAccessor");
            ((C59052c) ((C59052c) b).mo56372aa(18146)).mo56386p("releaseDecoder");
            this.f265943d = false;
            return;
        }
        C59104x b2 = f265940a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "JniSbcDecoderAccessor");
        ((C59052c) ((C59052c) b2).mo56372aa(18145)).mo56386p("releaseDecoder. Provided to another requester.");
        ((SettableFuture) this.f265942c.remove()).mo57356n(this.f265941b);
    }
}
