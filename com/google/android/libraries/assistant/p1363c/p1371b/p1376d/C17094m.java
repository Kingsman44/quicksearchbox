package com.google.android.libraries.assistant.p1363c.p1371b.p1376d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17060e;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.b.d.m */
/* compiled from: PG */
public final class C17094m {

    /* renamed from: a */
    public static final C59071e f49748a = C59071e.m91332i("com.google.android.libraries.assistant.c.b.d.m");

    /* renamed from: b */
    public final C17078w f49749b;

    /* renamed from: c */
    public final Object f49750c = new Object();

    /* renamed from: d */
    public final Consumer f49751d;

    /* renamed from: e */
    public final C17060e f49752e;

    /* renamed from: f */
    public final Object f49753f = new Object();

    /* renamed from: g */
    public volatile Optional f49754g = Optional.empty();

    /* renamed from: h */
    public volatile Optional f49755h = Optional.empty();

    /* renamed from: i */
    public volatile boolean f49756i = false;

    /* renamed from: j */
    public volatile boolean f49757j = false;

    /* renamed from: k */
    public volatile boolean f49758k = false;

    /* renamed from: l */
    public volatile Optional f49759l = Optional.empty();

    static {
        C58528ij.m90011K(C17072q.READY_TO_DOWNLOAD, C17072q.DOWNLOADING);
    }

    public C17094m(C17078w wVar, Consumer consumer, C17060e eVar) {
        this.f49749b = wVar;
        this.f49751d = consumer;
        this.f49752e = eVar;
    }

    /* renamed from: a */
    public final C17093l mo23184a() {
        C17093l lVar;
        synchronized (this.f49753f) {
            if (!this.f49754g.isEmpty()) {
                lVar = new C17093l(this.f49755h, this.f49759l, this.f49756i, this.f49758k, this.f49757j);
            } else {
                throw new IllegalStateException("The download was never initialized, did you close the download?");
            }
        }
        return lVar;
    }
}
