package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9540a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.p4582b.C60943b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.a.d */
/* compiled from: PG */
public final class C127179d implements C32597b {

    /* renamed from: a */
    public static final C59071e f350130a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f350131b = C60943b.m93087c(1);

    /* renamed from: c */
    public final C32597b f350132c;

    /* renamed from: d */
    public final C58889cz f350133d;

    /* renamed from: e */
    private final C71422aw f350134e;

    public C127179d(C32597b bVar, C71422aw awVar, C58889cz czVar) {
        C69664n.m101061g(bVar, "delegate");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(czVar, "ticker");
        this.f350132c = bVar;
        this.f350134e = awVar;
        this.f350133d = czVar;
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f350132c.mo38173c();
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        C32836cd d = this.f350132c.mo38174d();
        C69664n.m101060f(d, "delegate.supportedContextKey");
        return d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350134e, (C71424ay) null, new C127178c(this, beVar, (C69577g) null), 3);
    }
}
