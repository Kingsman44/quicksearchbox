package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ba */
/* compiled from: PG */
final class C120932ba extends C120923as {

    /* renamed from: a */
    private final int f336244a;

    /* renamed from: b */
    private final C120924at f336245b;

    /* renamed from: c */
    private final C120946bo f336246c;

    /* renamed from: d */
    private final int f336247d;

    public C120932ba(int i, int i2, C120924at atVar, C120946bo boVar) {
        this.f336244a = i;
        this.f336247d = i2;
        this.f336245b = atVar;
        this.f336246c = boVar;
    }

    /* renamed from: a */
    public final int mo104993a() {
        return this.f336244a;
    }

    /* renamed from: c */
    public final C120924at mo104994c() {
        return this.f336245b;
    }

    /* renamed from: d */
    public final C120946bo mo104995d() {
        return this.f336246c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r4.f336246c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f336245b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120923as
            r2 = 0
            if (r1 == 0) goto L_0x0047
            com.google.android.apps.search.assistant.platform.g.a.as r5 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120923as) r5
            int r1 = r4.f336244a
            int r3 = r5.mo104993a()
            if (r1 != r3) goto L_0x0047
            int r1 = r4.f336247d
            int r3 = r5.mo104997f()
            if (r1 != r3) goto L_0x0047
            com.google.android.apps.search.assistant.platform.g.a.at r1 = r4.f336245b
            if (r1 != 0) goto L_0x0026
            com.google.android.apps.search.assistant.platform.g.a.at r1 = r5.mo104994c()
            if (r1 != 0) goto L_0x0047
            goto L_0x0030
        L_0x0026:
            com.google.android.apps.search.assistant.platform.g.a.at r3 = r5.mo104994c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
        L_0x0030:
            com.google.android.apps.search.assistant.platform.g.a.bo r1 = r4.f336246c
            if (r1 != 0) goto L_0x003b
            com.google.android.apps.search.assistant.platform.g.a.bo r5 = r5.mo104995d()
            if (r5 != 0) goto L_0x0047
            goto L_0x0046
        L_0x003b:
            com.google.android.apps.search.assistant.platform.g.a.bo r5 = r5.mo104995d()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            return r0
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120932ba.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo104997f() {
        return this.f336247d;
    }

    public final String toString() {
        int i = this.f336244a;
        int i2 = this.f336247d;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "BIND_WIDGET_NOT_ALLOWED" : "NO_PROVIDER_FOUND_WITHOUT_CONFIG_ACTIVITY" : "NO_PROVIDER_FOUND" : "INSUFFICIENT_SDK_VERSION" : "OK";
        String valueOf = String.valueOf(this.f336245b);
        String valueOf2 = String.valueOf(this.f336246c);
        return "AppWidgetRenderResponse{appWidgetId=" + i + ", resultCode=" + str + ", host=" + valueOf + ", widgetExtensionSender=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (((this.f336244a ^ 1000003) * 1000003) ^ this.f336247d) * 1000003;
        C120924at atVar = this.f336245b;
        int i3 = 0;
        if (atVar == null) {
            i = 0;
        } else {
            i = atVar.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        C120946bo boVar = this.f336246c;
        if (boVar != null) {
            i3 = boVar.hashCode();
        }
        return i4 ^ i3;
    }
}
