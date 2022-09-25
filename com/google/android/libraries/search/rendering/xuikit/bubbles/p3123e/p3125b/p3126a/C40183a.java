package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a;

import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.a */
/* compiled from: PG */
public final class C40183a {

    /* renamed from: a */
    public static final C59071e f105563a = C59071e.m91331h();

    /* renamed from: b */
    public final C40364q f105564b;

    /* renamed from: c */
    public final Object f105565c = new Object();

    /* renamed from: d */
    public final HashMap f105566d = new HashMap();

    public C40183a(C40364q qVar) {
        C69664n.m101061g(qVar, "logMetadataFactory");
        this.f105564b = qVar;
    }

    /* renamed from: a */
    public final Optional mo42302a(C40111d dVar) {
        Optional optional;
        synchronized (this.f105565c) {
            optional = (Optional) this.f105566d.get(dVar);
            if (optional == null) {
                optional = Optional.empty();
                C69664n.m101060f(optional, "empty()");
            }
        }
        return optional;
    }
}
