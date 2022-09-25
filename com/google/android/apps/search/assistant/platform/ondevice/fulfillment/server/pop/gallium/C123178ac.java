package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123166f;
import com.google.android.apps.search.assistant.platform.ondevice.p9264c.p9265a.p9267b.C122142c;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.ac */
/* compiled from: PG */
public final class C123178ac implements C123181b {

    /* renamed from: a */
    public static final C59071e f340863a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.ac");

    /* renamed from: b */
    private final C122142c f340864b;

    /* renamed from: c */
    private final Set f340865c;

    /* renamed from: d */
    private final Set f340866d;

    /* renamed from: e */
    private final boolean f340867e;

    public C123178ac(C122142c cVar, boolean z, Set set, Set set2) {
        this.f340864b = cVar;
        this.f340865c = set;
        this.f340866d = set2;
        this.f340867e = z;
    }

    /* renamed from: a */
    public final C18207ak mo105904a() {
        if (this.f340867e) {
            C60870cx b = this.f340864b.mo105545b(C62912at.f169862a);
            C123177ab abVar = new C123177ab();
            C60856cj.m92911t(b, C47810es.m84974n(abVar), C60826bg.f164896a);
        }
        C58480gp e = C58485gu.m89837e();
        Collection.EL.stream(this.f340866d).forEach(new C123552z(e));
        e.mo55396h(this.f340865c);
        return C18207ak.m35459a(e.mo55394f(), C58485gu.m89845m());
    }

    /* renamed from: b */
    public final C18207ak mo105905b(C123166f fVar) {
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(this.f340865c);
        Collection.EL.stream(this.f340866d).forEach(new C123551y(e, fVar));
        return C18207ak.m35459a(e.mo55394f(), C58485gu.m89845m());
    }
}
