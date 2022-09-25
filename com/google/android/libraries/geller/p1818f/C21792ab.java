package com.google.android.libraries.geller.p1818f;

import android.content.Context;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.geller.f.ab */
/* compiled from: PG */
public final /* synthetic */ class C21792ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f60108a;

    /* renamed from: b */
    public final /* synthetic */ Context f60109b;

    /* renamed from: c */
    public final /* synthetic */ String f60110c;

    public /* synthetic */ C21792ab(C58833ax axVar, Context context, String str) {
        this.f60108a = axVar;
        this.f60109b = context;
        this.f60110c = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x010c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.common.base.ax r0 = r11.f60108a
            android.content.Context r1 = r11.f60109b
            java.lang.String r2 = r11.f60110c
            java.util.List r12 = (java.util.List) r12
            long r3 = com.google.android.libraries.geller.p1818f.C21796af.f60120a
            com.google.common.base.bk r0 = (com.google.common.base.C58847bk) r0
            java.lang.Object r0 = r0.f156646a
            com.google.android.libraries.geller.b r0 = (com.google.android.libraries.geller.C21756b) r0
            int r3 = r0.ordinal()
            r4 = 0
            if (r3 != 0) goto L_0x0120
            int r3 = r0.ordinal()
            if (r3 != 0) goto L_0x011f
            r3 = 0
            java.lang.Object r5 = r12.get(r3)
            com.google.protos.p.b.cw r5 = (com.google.protos.p5129p.p5131b.C65819cw) r5
            byte[] r6 = r5.toByteArray()
            long r7 = r5.f178934g
            int r5 = r0.ordinal()
            if (r5 != 0) goto L_0x011e
            com.google.protos.p.b.dl r4 = com.google.protos.p5129p.p5131b.C65835dl.f178966c
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0074 }
            com.google.protos.p.b.cw r9 = com.google.protos.p5129p.p5131b.C65819cw.f178926i     // Catch:{ ct -> 0x0074 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r6, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x0074 }
            com.google.protos.p.b.cw r5 = (com.google.protos.p5129p.p5131b.C65819cw) r5     // Catch:{ ct -> 0x0074 }
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.cq r5 = r5.f178932e
            java.util.Iterator r5 = r5.iterator()
        L_0x0048:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x006f
            java.lang.Object r9 = r5.next()
            com.google.protos.p.b.az r9 = (com.google.protos.p5129p.p5131b.C65768az) r9
            com.google.protobuf.eb r10 = r4.getParserForType()     // Catch:{ ct -> 0x006a }
            com.google.protobuf.h r9 = r9.f178799e     // Catch:{ ct -> 0x006a }
            if (r9 != 0) goto L_0x005e
            com.google.protobuf.h r9 = com.google.protobuf.C63070h.f170215c     // Catch:{ ct -> 0x006a }
        L_0x005e:
            com.google.protobuf.z r9 = r9.f170218b     // Catch:{ ct -> 0x006a }
            java.lang.Object r9 = r10.mo59008g(r9)     // Catch:{ ct -> 0x006a }
            com.google.protobuf.MessageLite r9 = (com.google.protobuf.MessageLite) r9     // Catch:{ ct -> 0x006a }
            r6.mo55395g(r9)     // Catch:{ ct -> 0x006a }
            goto L_0x0048
        L_0x006a:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0078
        L_0x006f:
            com.google.common.b.gu r4 = r6.mo55394f()
            goto L_0x0078
        L_0x0074:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0078:
            java.lang.String r0 = r0.name()
            java.io.File r5 = new java.io.File
            java.io.File r1 = r1.getFilesDir()
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r9 = "geller"
            r6[r3] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "_"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = r9.toString()
            r2 = 1
            r6[r2] = r0
            r0 = 2
            java.lang.String r7 = java.lang.Long.toString(r7)
            r6[r0] = r7
            java.lang.String r0 = com.google.common.util.C60790c.m92793a(r6)
            r5.<init>(r1, r0)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r5.mkdirs()
            if (r0 != 0) goto L_0x00c9
            com.google.common.f.e r0 = com.google.android.libraries.geller.C21756b.f60056b
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Unable to create output directory"
            r2 = 47963(0xbb5b, float:6.721E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x011d
        L_0x00c9:
            com.google.common.b.sm r0 = r4.listIterator(r3)
        L_0x00cd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011d
            java.lang.Object r1 = r0.next()
            com.google.protos.p.b.dl r1 = (com.google.protos.p5129p.p5131b.C65835dl) r1
            java.io.File r4 = new java.io.File
            java.lang.String r6 = r1.f178968a
            r4.<init>(r5, r6)
            r4.getAbsolutePath()
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x010d }
            r6.<init>(r4, r3)     // Catch:{ IOException -> 0x010d }
            com.google.protobuf.z r1 = r1.f178969b     // Catch:{ all -> 0x00f1 }
            r1.mo59046r(r6)     // Catch:{ all -> 0x00f1 }
            r6.close()     // Catch:{ IOException -> 0x010d }
            goto L_0x00cd
        L_0x00f1:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00f6 }
            goto L_0x010c
        L_0x00f6:
            r6 = move-exception
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x010c }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r3] = r8     // Catch:{ Exception -> 0x010c }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r7)     // Catch:{ Exception -> 0x010c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x010c }
            r8[r3] = r6     // Catch:{ Exception -> 0x010c }
            r7.invoke(r1, r8)     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            throw r1     // Catch:{ IOException -> 0x010d }
        L_0x010d:
            r1 = move-exception
            com.google.common.f.e r6 = com.google.android.libraries.geller.C21756b.f60056b
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Write to file %sfailed."
            r8 = 47962(0xbb5a, float:6.7209E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r1)).mo56372aa(r8)).mo56389s(r7, r4)
            goto L_0x00cd
        L_0x011d:
            return r12
        L_0x011e:
            throw r4
        L_0x011f:
            throw r4
        L_0x0120:
            goto L_0x0122
        L_0x0121:
            throw r4
        L_0x0122:
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.p1818f.C21792ab.apply(java.lang.Object):java.lang.Object");
    }
}
