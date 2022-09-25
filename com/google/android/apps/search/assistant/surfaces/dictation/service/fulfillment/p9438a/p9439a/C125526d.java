package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a;

import android.content.Context;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.d */
/* compiled from: PG */
public final class C125526d {

    /* renamed from: a */
    public final C69585o f346130a;

    /* renamed from: b */
    private final Context f346131b;

    /* renamed from: c */
    private final C69626l f346132c = new C59425c(new C125524b(this, (C69577g) null));

    public C125526d(Context context, C69585o oVar) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(oVar, "backgroundContext");
        this.f346131b = context;
        this.f346130a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107035a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125525c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.c r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125525c) r0
            int r1 = r0.f346129d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346129d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.c r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f346127b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346129d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f346126a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            r0.f346126a = r4
            r0.f346129d = r3
            h.f.a.l r5 = r4.f346132c
            java.lang.Object r5 = r5.mo5761a(r0)
            if (r5 == r1) goto L_0x006b
            r0 = r4
        L_0x0041:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0064
            int r5 = r5.intValue()
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.d r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125526d) r0
            java.lang.String r0 = r0.mo107036b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " @ cl/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L_0x0064:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.d r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125526d) r0
            java.lang.String r5 = r0.mo107036b()
            return r5
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125526d.mo107035a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo107036b() {
        String packageName = this.f346131b.getPackageName();
        if (C69664n.m101066l(packageName, "com.google.android.googlequicksearchbox")) {
            return "AGSA";
        }
        if (C69664n.m101066l(packageName, "com.google.android.apps.search.assistant.surfaces.dictation.devapp")) {
            return "DevApp";
        }
        C69664n.m101060f(packageName, "packageName");
        return packageName;
    }
}
