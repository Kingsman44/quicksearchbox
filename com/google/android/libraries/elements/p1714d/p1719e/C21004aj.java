package com.google.android.libraries.elements.p1714d.p1719e;

import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.e.aj */
/* compiled from: PG */
public final class C21004aj implements C21270bm {

    /* renamed from: a */
    private final C69464a f58884a;

    /* renamed from: b */
    private final C68214a f58885b;

    public C21004aj(C69464a aVar, C68214a aVar2) {
        this.f58884a = aVar;
        this.f58885b = aVar2;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.f179518b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.libraries.elements.interfaces.CommandHandlerResolver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo25838b(com.facebook.litho.C6411u r5, com.google.android.libraries.elements.interfaces.C21319z r6, java.lang.String r7, java.lang.Object r8, com.google.android.libraries.elements.interfaces.C21248ar r9, com.google.android.libraries.elements.interfaces.C21310q r10) {
        /*
            r4 = this;
            com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties r8 = (com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties) r8
            g.a.a r7 = r4.f58884a
            java.lang.Object r7 = r7.mo17428b()
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            java.lang.Object r7 = r7.mo56111f()
            com.google.android.libraries.elements.interfaces.ByteStore r7 = (com.google.android.libraries.elements.interfaces.ByteStore) r7
            if (r7 == 0) goto L_0x0155
            java.util.Map r10 = r9.mo25930c()
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ALPHA
            java.lang.Object r0 = r10.get(r0)
            com.facebook.litho.bs r0 = (com.facebook.litho.C6138bs) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r0.f18160a
            boolean r2 = r2 instanceof java.lang.Float
            if (r2 == 0) goto L_0x0030
            com.facebook.litho.o r2 = r9.mo25928E()
            r2.mo13442o(r0)
            goto L_0x0045
        L_0x0030:
            com.facebook.litho.bs r0 = new com.facebook.litho.bs
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r0.<init>(r2)
            com.google.protos.youtube.elements.ca r2 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ALPHA
            r9.mo25934h(r2, r0)
            com.facebook.litho.o r2 = r9.mo25928E()
            r2.mo13442o(r0)
        L_0x0045:
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ROTATION
            java.lang.Object r0 = r10.get(r0)
            com.facebook.litho.bs r0 = (com.facebook.litho.C6138bs) r0
            r2 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.Object r3 = r0.f18160a
            boolean r3 = r3 instanceof java.lang.Float
            if (r3 == 0) goto L_0x005e
            com.facebook.litho.o r3 = r9.mo25928E()
            r3.mo13417A(r0)
            goto L_0x0073
        L_0x005e:
            com.facebook.litho.bs r0 = new com.facebook.litho.bs
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            r0.<init>(r3)
            com.google.protos.youtube.elements.ca r3 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ROTATION
            r9.mo25934h(r3, r0)
            com.facebook.litho.o r3 = r9.mo25928E()
            r3.mo13417A(r0)
        L_0x0073:
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_SCALE
            java.lang.Object r0 = r10.get(r0)
            com.facebook.litho.bs r0 = (com.facebook.litho.C6138bs) r0
            if (r0 == 0) goto L_0x0092
            java.lang.Object r3 = r0.f18160a
            boolean r3 = r3 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0092
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13418B(r0)
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13419C(r0)
            goto L_0x00ae
        L_0x0092:
            com.facebook.litho.bs r0 = new com.facebook.litho.bs
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.<init>(r1)
            com.google.protos.youtube.elements.ca r1 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_SCALE
            r9.mo25934h(r1, r0)
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13418B(r0)
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13419C(r0)
        L_0x00ae:
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_X
            java.lang.Object r0 = r10.get(r0)
            com.facebook.litho.bs r0 = (com.facebook.litho.C6138bs) r0
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r1 = r0.f18160a
            boolean r1 = r1 instanceof java.lang.Float
            if (r1 == 0) goto L_0x00c6
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13422F(r0)
            goto L_0x00db
        L_0x00c6:
            com.facebook.litho.bs r0 = new com.facebook.litho.bs
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r0.<init>(r1)
            com.google.protos.youtube.elements.ca r1 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_X
            r9.mo25934h(r1, r0)
            com.facebook.litho.o r1 = r9.mo25928E()
            r1.mo13422F(r0)
        L_0x00db:
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_Y
            java.lang.Object r10 = r10.get(r0)
            com.facebook.litho.bs r10 = (com.facebook.litho.C6138bs) r10
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r0 = r10.f18160a
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L_0x00f3
            com.facebook.litho.o r0 = r9.mo25928E()
            r0.mo13423G(r10)
            goto L_0x0108
        L_0x00f3:
            com.facebook.litho.bs r10 = new com.facebook.litho.bs
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r10.<init>(r0)
            com.google.protos.youtube.elements.ca r0 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_Y
            r9.mo25934h(r0, r10)
            com.facebook.litho.o r0 = r9.mo25928E()
            r0.mo13423G(r10)
        L_0x0108:
            dagger.a r10 = r4.f58885b
            java.lang.Object r10 = r10.mo27525b()
            j$.util.Optional r10 = (p3186j$.util.Optional) r10
            r0 = 0
            java.lang.Object r10 = r10.orElse(r0)
            com.google.android.libraries.elements.d.e.a.a.b r10 = (com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a.C20935b) r10
            com.google.android.libraries.elements.d.b.b r1 = new com.google.android.libraries.elements.d.b.b
            java.util.Map r9 = r9.mo25930c()
            android.content.Context r5 = r5.f19009b
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r1.<init>(r9, r5)
            if (r10 == 0) goto L_0x0135
            com.google.common.base.cr r5 = r10.f58707a
            java.lang.Object r5 = r5.mo6453a()
            r0 = r5
            com.google.android.libraries.elements.interfaces.CommandHandlerResolver r0 = (com.google.android.libraries.elements.interfaces.CommandHandlerResolver) r0
        L_0x0135:
            com.google.android.libraries.elements.interfaces.DirectUpdateProcessor r5 = com.google.android.libraries.elements.interfaces.DirectUpdateProcessor.create(r1, r7, r0)
            if (r5 == 0) goto L_0x014d
            io.b.e.a.b r6 = r6.mo26811l()
            if (r6 == 0) goto L_0x0149
            com.google.android.libraries.elements.d.e.ai r7 = new com.google.android.libraries.elements.d.e.ai
            r7.<init>(r5)
            r6.mo61462b(r7)
        L_0x0149:
            r5.processProperties(r8)
            return
        L_0x014d:
            com.google.android.libraries.elements.interfaces.bc r5 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r6 = "Error creating DirectUpdateProcessor"
            r5.<init>(r6)
            throw r5
        L_0x0155:
            com.google.android.libraries.elements.interfaces.bc r5 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r6 = "ByteStore is not provided"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.C21004aj.mo25838b(com.facebook.litho.u, com.google.android.libraries.elements.interfaces.z, java.lang.String, java.lang.Object, com.google.android.libraries.elements.interfaces.ar, com.google.android.libraries.elements.interfaces.q):void");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
