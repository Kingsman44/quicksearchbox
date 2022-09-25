package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiq */
/* compiled from: PG */
public final class aiq implements agu {

    /* renamed from: a */
    private final ahp f20709a;

    public aiq(ahp ahp) {
        this.f20709a = ahp;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.ads.interactivemedia.v3.internal.agt] */
    /* JADX WARNING: type inference failed for: r8v14, types: [com.google.ads.interactivemedia.v3.internal.agt] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.ads.interactivemedia.p367v3.internal.agt m18777b(com.google.ads.interactivemedia.p367v3.internal.ahp r8, com.google.ads.interactivemedia.p367v3.internal.age r9, com.google.ads.interactivemedia.p367v3.internal.akz r10, com.google.ads.interactivemedia.p367v3.internal.agv r11) {
        /*
            java.lang.Class r0 = r11.mo14749a()
            com.google.ads.interactivemedia.v3.internal.akz r0 = com.google.ads.interactivemedia.p367v3.internal.akz.m18868d(r0)
            com.google.ads.interactivemedia.v3.internal.aid r8 = r8.mo14769a(r0)
            java.lang.Object r8 = r8.mo14768a()
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.p367v3.internal.agt
            if (r0 == 0) goto L_0x0017
            com.google.ads.interactivemedia.v3.internal.agt r8 = (com.google.ads.interactivemedia.p367v3.internal.agt) r8
            goto L_0x006f
        L_0x0017:
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.p367v3.internal.agu
            if (r0 == 0) goto L_0x0022
            com.google.ads.interactivemedia.v3.internal.agu r8 = (com.google.ads.interactivemedia.p367v3.internal.agu) r8
            com.google.ads.interactivemedia.v3.internal.agt r8 = r8.mo14748a(r9, r10)
            goto L_0x006f
        L_0x0022:
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.p367v3.internal.agp
            r1 = 0
            if (r0 != 0) goto L_0x005a
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.p367v3.internal.agi
            if (r0 == 0) goto L_0x002d
            r3 = r1
            goto L_0x005e
        L_0x002d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r11.<init>(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x005a:
            r0 = r8
            com.google.ads.interactivemedia.v3.internal.agp r0 = (com.google.ads.interactivemedia.p367v3.internal.agp) r0
            r3 = r0
        L_0x005e:
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.p367v3.internal.agi
            if (r0 == 0) goto L_0x0065
            r1 = r8
            com.google.ads.interactivemedia.v3.internal.agi r1 = (com.google.ads.interactivemedia.p367v3.internal.agi) r1
        L_0x0065:
            r4 = r1
            com.google.ads.interactivemedia.v3.internal.aji r8 = new com.google.ads.interactivemedia.v3.internal.aji
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x006f:
            if (r8 == 0) goto L_0x007b
            boolean r9 = r11.mo14750b()
            if (r9 == 0) goto L_0x007b
            com.google.ads.interactivemedia.v3.internal.agt r8 = r8.nullSafe()
        L_0x007b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aiq.m18777b(com.google.ads.interactivemedia.v3.internal.ahp, com.google.ads.interactivemedia.v3.internal.age, com.google.ads.interactivemedia.v3.internal.akz, com.google.ads.interactivemedia.v3.internal.agv):com.google.ads.interactivemedia.v3.internal.agt");
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        agv agv = (agv) akz.mo14887a().getAnnotation(agv.class);
        if (agv == null) {
            return null;
        }
        return m18777b(this.f20709a, age, akz, agv);
    }
}
