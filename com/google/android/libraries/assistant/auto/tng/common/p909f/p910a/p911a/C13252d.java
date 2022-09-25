package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13252d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f40915a;

    /* renamed from: b */
    public final /* synthetic */ String f40916b;

    /* renamed from: c */
    public final /* synthetic */ long f40917c;

    public /* synthetic */ C13252d(String str, String str2, long j) {
        this.f40915a = str;
        this.f40916b = str2;
        this.f40917c = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f40915a
            java.lang.String r1 = r10.f40916b
            long r2 = r10.f40917c
            java.util.List r11 = (java.util.List) r11
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13254f.f40921a
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            r5 = 0
            java.lang.Object r6 = r11.get(r5)
            if (r6 == 0) goto L_0x001e
            java.lang.Object r5 = r11.get(r5)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            r4.mo55396h(r5)
        L_0x001e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 1
            java.lang.Object r7 = r11.get(r6)
            if (r7 == 0) goto L_0x0031
            java.lang.Object r11 = r11.get(r6)
            r5 = r11
            java.util.Map r5 = (java.util.Map) r5
        L_0x0031:
            java.lang.String r11 = "display_name"
            java.lang.Object r11 = p3186j$.util.Map.EL.getOrDefault(r5, r11, r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "photo_thumb_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "_id"
            java.lang.String r8 = ""
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r7, r8)
            java.lang.String r5 = (java.lang.String) r5
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r7 = com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b.f40927g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.a r7 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13255a) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r8 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r8
            int r9 = r8.f40929a
            r9 = r9 | 2
            r8.f40929a = r9
            r8.f40931c = r1
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r1 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r1
            r11.getClass()
            int r8 = r1.f40929a
            r6 = r6 | r8
            r1.f40929a = r6
            r1.f40930b = r11
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r11 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r11
            r5.getClass()
            int r1 = r11.f40929a
            r1 = r1 | 16
            r11.f40929a = r1
            r11.f40934f = r5
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r11 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r11
            int r1 = r11.f40929a
            r1 = r1 | 4
            r11.f40929a = r1
            r11.f40932d = r2
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x00ae
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r11 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r11
            r0.getClass()
            int r1 = r11.f40929a
            r1 = r1 | 8
            r11.f40929a = r1
            r11.f40933e = r0
        L_0x00ae:
            com.google.protobuf.bv r11 = r7.build()
            com.google.android.libraries.assistant.auto.tng.common.f.a.b.b r11 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b) r11
            r4.mo55395g(r11)
            com.google.common.b.gu r11 = r4.mo55394f()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13252d.apply(java.lang.Object):java.lang.Object");
    }
}
