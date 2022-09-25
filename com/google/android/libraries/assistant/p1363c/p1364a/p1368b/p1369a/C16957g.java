package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import androidx.media3.common.C2666j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C16957g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16972v f49547a;

    /* renamed from: b */
    public final /* synthetic */ C62910ar f49548b;

    public /* synthetic */ C16957g(C16972v vVar, C62910ar arVar) {
        this.f49547a = vVar;
        this.f49548b = arVar;
    }

    public final void run() {
        C16972v vVar = this.f49547a;
        long max = Math.max(0, C62948a.m95453d(this.f49548b));
        if (max > vVar.f49576g.mo6005l()) {
            vVar.mo23165h(new C16966p(vVar));
            return;
        }
        C2666j jVar = (C2666j) vVar.f49576g;
        jVar.mo5973A(jVar.mo5996c(), max);
    }
}
