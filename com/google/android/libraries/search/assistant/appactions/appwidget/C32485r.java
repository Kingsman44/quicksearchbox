package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.content.ComponentName;
import com.google.assistant.p3931f.p3939c.C52846w;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.r */
/* compiled from: PG */
final class C32485r extends C32473f {

    /* renamed from: a */
    public final String f87054a;

    /* renamed from: b */
    public final ComponentName f87055b;

    /* renamed from: c */
    public final C52846w f87056c;

    /* renamed from: d */
    public final Consumer f87057d;

    public C32485r(String str, ComponentName componentName, C52846w wVar, Consumer consumer) {
        this.f87054a = str;
        this.f87055b = componentName;
        this.f87056c = wVar;
        this.f87057d = consumer;
    }

    /* renamed from: a */
    public final ComponentName mo38093a() {
        return this.f87055b;
    }

    /* renamed from: b */
    public final C32472e mo38094b() {
        return new C32484q(this);
    }

    /* renamed from: c */
    public final C52846w mo38095c() {
        return this.f87056c;
    }

    /* renamed from: d */
    public final Consumer mo38096d() {
        return this.f87057d;
    }

    /* renamed from: e */
    public final String mo38097e() {
        return this.f87054a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f87056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f87057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f87055b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.search.assistant.appactions.appwidget.C32473f
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.android.libraries.search.assistant.appactions.appwidget.f r5 = (com.google.android.libraries.search.assistant.appactions.appwidget.C32473f) r5
            java.lang.String r1 = r4.f87054a
            java.lang.String r3 = r5.mo38097e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            android.content.ComponentName r1 = r4.f87055b
            if (r1 != 0) goto L_0x0022
            android.content.ComponentName r1 = r5.mo38093a()
            if (r1 != 0) goto L_0x0058
            goto L_0x002c
        L_0x0022:
            android.content.ComponentName r3 = r5.mo38093a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x002c:
            com.google.assistant.f.c.w r1 = r4.f87056c
            if (r1 != 0) goto L_0x0037
            com.google.assistant.f.c.w r1 = r5.mo38095c()
            if (r1 != 0) goto L_0x0058
            goto L_0x0041
        L_0x0037:
            com.google.assistant.f.c.w r3 = r5.mo38095c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x0041:
            j$.util.function.Consumer r1 = r4.f87057d
            if (r1 != 0) goto L_0x004c
            j$.util.function.Consumer r5 = r5.mo38096d()
            if (r5 != 0) goto L_0x0058
            goto L_0x0057
        L_0x004c:
            j$.util.function.Consumer r5 = r5.mo38096d()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.appactions.appwidget.C32485r.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f87054a.hashCode() ^ 1000003) * 1000003;
        ComponentName componentName = this.f87055b;
        int i3 = 0;
        if (componentName == null) {
            i = 0;
        } else {
            i = componentName.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C52846w wVar = this.f87056c;
        if (wVar == null) {
            i2 = 0;
        } else {
            i2 = wVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Consumer consumer = this.f87057d;
        if (consumer != null) {
            i3 = consumer.hashCode();
        }
        return i5 ^ i3;
    }

    public final String toString() {
        String str = this.f87054a;
        String valueOf = String.valueOf(this.f87055b);
        String valueOf2 = String.valueOf(this.f87056c);
        String valueOf3 = String.valueOf(this.f87057d);
        return "AppWidgetRenderRequest{packageName=" + str + ", componentName=" + valueOf + ", appActionsFulfillmentRequest=" + valueOf2 + ", onSpeechResponse=" + valueOf3 + "}";
    }
}
