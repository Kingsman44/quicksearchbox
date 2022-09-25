package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137968a;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.y */
/* compiled from: PG */
public final class C138315y {

    /* renamed from: a */
    public final C137968a f376322a;

    /* renamed from: b */
    public final C71422aw f376323b;

    /* renamed from: c */
    private final Context f376324c;

    public C138315y(Context context, C137968a aVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f376324c = context;
        this.f376322a = aVar;
        this.f376323b = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114240a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138314x
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.x r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138314x) r0
            int r1 = r0.f376321d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376321d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.x r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.x
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f376319b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376321d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f376318a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.search.suggest.a.c.a r5 = r4.f376322a
            com.google.common.util.concurrent.cx r5 = r5.mo114061a()
            r0.f376318a = r4
            r0.f376321d = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x00b0
            r0 = r4
        L_0x0045:
            com.google.android.apps.search.googleapp.search.suggest.f r5 = (com.google.android.apps.search.googleapp.search.suggest.C138081f) r5
            int r5 = r5.f375687b
            com.google.android.apps.search.googleapp.search.suggest.e r5 = com.google.android.apps.search.googleapp.search.suggest.C138078e.m224410a(r5)
            if (r5 != 0) goto L_0x0051
            com.google.android.apps.search.googleapp.search.suggest.e r5 = com.google.android.apps.search.googleapp.search.suggest.C138078e.NONE
        L_0x0051:
            com.google.android.apps.search.googleapp.search.suggest.e r1 = com.google.android.apps.search.googleapp.search.suggest.C138078e.FIRST_RUN
            if (r5 != r1) goto L_0x00ae
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138252ch.f376145d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cg r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138251cg) r5
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            java.lang.String r1 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r1)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138252ch) r1
            int r2 = r1.f376147a
            r2 = r2 | r3
            r1.f376147a = r2
            java.lang.String r2 = "LOCATION_FIRST_RUN"
            r1.f376148b = r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.y r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138315y) r0
            android.content.Context r0 = r0.f376324c
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132087596(0x7f15132c, float:1.9815452E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.resources.getStr…ocation_permission_toast)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138252ch) r1
            r0.getClass()
            int r2 = r1.f376147a
            r2 = r2 | 2
            r1.f376147a = r2
            r1.f376149c = r0
            com.google.protobuf.bv r5 = r5.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138252ch) r5
            return r5
        L_0x00ae:
            r5 = 0
            return r5
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138315y.mo114240a(h.c.g):java.lang.Object");
    }
}
