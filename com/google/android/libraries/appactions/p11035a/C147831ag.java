package com.google.android.libraries.appactions.p11035a;

import java.util.List;
import java.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.appactions.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C147831ag implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C147832ah f398839a;

    /* renamed from: b */
    public final /* synthetic */ Map f398840b;

    /* renamed from: c */
    public final /* synthetic */ List f398841c;

    public /* synthetic */ C147831ag(C147832ah ahVar, Map map, List list) {
        this.f398839a = ahVar;
        this.f398840b = map;
        this.f398841c = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            com.google.android.libraries.appactions.a.ah r0 = r10.f398839a
            java.util.Map r1 = r10.f398840b
            java.util.List r2 = r10.f398841c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.util.Map r3 = r0.f398842a
            java.lang.Object r3 = r3.get(r12)
            com.google.protobuf.ga r3 = (com.google.protobuf.C63063ga) r3
            r4 = 0
            if (r3 != 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r5 = r3.f170181a
            int r6 = com.google.protobuf.C63061fz.m96003b(r5)
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x009e
            r4 = 1
            r6 = 2
            if (r7 == r4) goto L_0x0071
            r4 = 3
            if (r7 == r6) goto L_0x0066
            r6 = 4
            if (r7 == r4) goto L_0x0055
            if (r7 == r6) goto L_0x0041
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r12 = com.google.protobuf.C63061fz.m96003b(r5)
            java.lang.String r12 = com.google.protobuf.C63061fz.m96002a(r12)
            java.lang.String r0 = "Unsupported parameter value type: "
            java.lang.String r12 = r0.concat(r12)
            r11.<init>(r12)
            throw r11
        L_0x0041:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r12 = com.google.protobuf.C63061fz.m96003b(r5)
            java.lang.String r12 = com.google.protobuf.C63061fz.m96002a(r12)
            java.lang.String r0 = "Struct arguments must be flattened: "
            java.lang.String r12 = r0.concat(r12)
            r11.<init>(r12)
            throw r11
        L_0x0055:
            if (r5 != r6) goto L_0x0060
            java.lang.Object r3 = r3.f170182b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            java.lang.String r4 = java.lang.String.valueOf(r3)
            goto L_0x008d
        L_0x0066:
            if (r5 != r4) goto L_0x006e
            java.lang.Object r3 = r3.f170182b
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x008d
        L_0x006e:
            java.lang.String r4 = ""
            goto L_0x008d
        L_0x0071:
            if (r5 != r6) goto L_0x007c
            java.lang.Object r3 = r3.f170182b
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x007e
        L_0x007c:
            r3 = 0
        L_0x007e:
            long r5 = (long) r3
            double r7 = (double) r5
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0089
            java.lang.String r4 = java.lang.Long.toString(r5)
            goto L_0x008d
        L_0x0089:
            java.lang.String r4 = java.lang.Double.toString(r3)
        L_0x008d:
            if (r4 == 0) goto L_0x009d
            r1.put(r11, r4)
            java.util.List r0 = r0.f398843b
            boolean r12 = r0.contains(r12)
            if (r12 == 0) goto L_0x009d
            r2.add(r11)
        L_0x009d:
            return
        L_0x009e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.p11035a.C147831ag.accept(java.lang.Object, java.lang.Object):void");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
