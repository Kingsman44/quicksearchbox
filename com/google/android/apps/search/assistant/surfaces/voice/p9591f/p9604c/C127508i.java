package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.i */
/* compiled from: PG */
public final class C127508i {

    /* renamed from: a */
    public static final C59071e f351083a = C59071e.m91331h();

    /* renamed from: b */
    public final C126978e f351084b;

    /* renamed from: c */
    public final C69585o f351085c;

    /* renamed from: d */
    public final C121090b f351086d;

    public C127508i(C126978e eVar, C69585o oVar, C121090b bVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(bVar, "localeSettingsAccessor");
        this.f351084b = eVar;
        this.f351085c = oVar;
        this.f351086d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108104a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127507h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.f.c.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127507h) r0
            int r1 = r0.f351082e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351082e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.f.c.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.f.c.h
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f351080c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351082e
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r1 = r0.f351079b
            java.util.Locale[] r1 = (java.util.Locale[]) r1
            java.lang.Object r0 = r0.f351078a
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            p5462h.C69714l.m101134b(r6)
            goto L_0x0056
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            p5462h.C69714l.m101134b(r6)
            java.util.Locale[] r6 = new java.util.Locale[r3]
            com.google.android.apps.search.assistant.platform.h.f.b r2 = r5.f351086d
            com.google.common.util.concurrent.cx r2 = r2.mo105044b()
            java.lang.String r4 = "localeSettingsAccessor.primaryAssistantLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.f351078a = r6
            r0.f351079b = r6
            r0.f351082e = r3
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r0 == r1) goto L_0x0096
            r1 = r6
            r6 = r0
            r0 = r1
        L_0x0056:
            r2 = 0
            java.util.Locale r6 = (java.util.Locale) r6
            r1[r2] = r6
            androidx.core.f.j r6 = androidx.core.p094f.C1897j.m5164a(r0)
            androidx.core.f.k r6 = r6.f5774b
            android.os.LocaleList r6 = r6.f5775a
            java.lang.String r6 = r6.toLanguageTags()
            java.lang.String r0 = "create(localeSettingsAcc…        .toLanguageTags()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0095
            com.google.common.f.e r6 = f351083a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37477(0x9265, float:5.2516E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Primary locale is not received. Hardcoding to en-US"
            r6.mo56386p(r0)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "US.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
        L_0x0095:
            return r6
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127508i.mo108104a(h.c.g):java.lang.Object");
    }
}
