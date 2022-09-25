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

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.f */
/* compiled from: PG */
public final class C123185f implements C123181b {

    /* renamed from: a */
    public static final C59071e f340871a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.f");

    /* renamed from: b */
    private final C122142c f340872b;

    /* renamed from: c */
    private final Set f340873c;

    /* renamed from: d */
    private final Set f340874d;

    /* renamed from: e */
    private final boolean f340875e;

    public C123185f(C122142c cVar, boolean z, Set set, Set set2) {
        this.f340872b = cVar;
        this.f340873c = set;
        this.f340874d = set2;
        this.f340875e = z;
    }

    /* renamed from: a */
    public final C18207ak mo105904a() {
        if (this.f340875e) {
            C60870cx b = this.f340872b.mo105545b(C62912at.f169862a);
            C123184e eVar = new C123184e();
            C60856cj.m92911t(b, C47810es.m84974n(eVar), C60826bg.f164896a);
        }
        C58480gp e = C58485gu.m89837e();
        Collection.EL.forEach(this.f340874d, new C123183d(e));
        return C18207ak.m35459a(this.f340873c, e.mo55394f());
    }

    /* renamed from: b */
    public final C18207ak mo105905b(C123166f fVar) {
        C58480gp e = C58485gu.m89837e();
        Collection.EL.forEach(this.f340874d, new C123182c(e, fVar));
        return C18207ak.m35459a(e.mo55394f(), C58485gu.m89845m());
    }
}
