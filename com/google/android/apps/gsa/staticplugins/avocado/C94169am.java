package com.google.android.apps.gsa.staticplugins.avocado;

import android.media.Image;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.am */
/* compiled from: PG */
final class C94169am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C94170an f263046a;

    /* renamed from: b */
    private final Image f263047b;

    public C94169am(C94170an anVar, Image image) {
        this.f263046a = anVar;
        this.f263047b = image;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r38 = this;
            r1 = r38
            java.lang.String r2 = "Unsupported image format: "
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "start to process."
            r5 = 14143(0x373f, float:1.9819E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            android.media.Image r3 = r1.f263047b
            int r3 = r3.getFormat()
            r4 = 35
            if (r3 == r4) goto L_0x002e
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "ImageFormat %d "
            android.media.Image r6 = r1.f263047b
            int r6 = r6.getFormat()
            r7 = 14145(0x3741, float:1.9821E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56387q(r5, r6)
        L_0x002e:
            r3 = 0
            android.media.Image r5 = r1.f263047b     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.ey r6 = new com.google.android.apps.gsa.staticplugins.avocado.ey     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r6.<init>(r5)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.an r5 = r1.f263046a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f263104m     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249910aZ     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            long r7 = r5.mo79743a(r7)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r5 = (int) r7     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r7 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r7 = r7.getFormat()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r8 = 2
            r9 = 1
            if (r7 == r9) goto L_0x00b3
            if (r7 == r8) goto L_0x00b3
            if (r7 == r4) goto L_0x007d
            r4 = 256(0x100, float:3.59E-43)
            if (r7 != r4) goto L_0x0065
            android.media.Image r2 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image$Plane[] r2 = r2.getPlanes()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r2 = r2[r3]     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96153z(r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            goto L_0x00e1
        L_0x0065:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r5 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r5 = r5.getFormat()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r6.<init>(r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r6.append(r5)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r4.<init>(r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            throw r4     // Catch:{ Exception -> 0x08de, all -> 0x08da }
        L_0x007d:
            android.graphics.YuvImage r2 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            byte[] r11 = r6.mo88441b()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r12 = 17
            android.media.Image r4 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r13 = r4.getWidth()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r4 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r14 = r4.getHeight()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r15 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r7 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r7 = r7.getWidth()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r10 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r10 = r10.getHeight()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r4.<init>(r3, r3, r7, r10)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.protobuf.y r7 = com.google.protobuf.C63088z.m96150v()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r2.compressToJpeg(r4, r5, r7)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.protobuf.z r2 = r7.mo59165b()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            goto L_0x00e1
        L_0x00b3:
            android.media.Image r2 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r2 = r2.getWidth()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r4 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r4 = r4.getHeight()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r7)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r4 = r6.f263513a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image$Plane[] r4 = r4.getPlanes()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r4 = r4[r3]     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r2.copyPixelsFromBuffer(r4)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.protobuf.y r4 = com.google.protobuf.C63088z.m96150v()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r2.compress(r7, r5, r4)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.protobuf.z r2 = r4.mo59165b()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
        L_0x00e1:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r5 = 14147(0x3743, float:1.9824E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.lang.String r5 = "After convert."
            r4.mo56386p(r5)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r1.f263046a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.dy r4 = r4.f263053E     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r4 = r4.mo88425a()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            if (r4 == 0) goto L_0x0120
            r7 = 90
            if (r4 == r7) goto L_0x011e
            r7 = 180(0xb4, float:2.52E-43)
            if (r4 == r7) goto L_0x011c
            r7 = 270(0x10e, float:3.78E-43)
            if (r4 == r7) goto L_0x011a
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.lang.String r10 = "Orientation is invalid %d"
            r11 = 14192(0x3770, float:1.9887E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r11)).mo56387q(r10, r4)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            goto L_0x0121
        L_0x011a:
            r4 = 3
            goto L_0x0121
        L_0x011c:
            r4 = 2
            goto L_0x0121
        L_0x011e:
            r4 = 1
            goto L_0x0121
        L_0x0120:
            r4 = 0
        L_0x0121:
            com.google.android.apps.gsa.staticplugins.avocado.an r7 = r1.f263046a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.libraries.gcoreclient.aa.a r7 = r7.f263082ah     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            byte[] r6 = r6.mo88441b()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r10 = r1.f263047b     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r10 = r10.getWidth()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.media.Image r11 = r1.f263047b     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r11 = r11.getHeight()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.b r12 = r7.f59885a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            if (r6 == 0) goto L_0x08cf
            int r13 = r6.capacity()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r14 = r10 * r11
            if (r13 < r14) goto L_0x08c6
            com.google.android.gms.vision.d r12 = r12.f395156a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r12.f395163b = r6     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.c r6 = r12.f395162a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r6.f395157a = r10     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r6.f395158b = r11     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r10 = 17
            r6.f395161e = r10     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.an r6 = r1.f263046a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r6 = r6.f263050B     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.b r7 = r7.f59885a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.d r10 = r7.f395156a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.c r10 = r10.f395162a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r10.f395159c = r6     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r10.f395160d = r4     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.d r6 = r7.mo122865a()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.apps.gsa.staticplugins.avocado.an r7 = r1.f263046a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.libraries.gcoreclient.aa.a.b r7 = r7.f263083ai     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            com.google.android.gms.vision.face.d r7 = r7.f59887a     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            android.graphics.Bitmap r10 = r6.f395164c     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            if (r10 == 0) goto L_0x0249
            int r15 = r10.getWidth()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r14 = r10.getHeight()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r13 = r15 * r14
            int[] r12 = new int[r13]     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r16 = 0
            r17 = 0
            r18 = 0
            r11 = r12
            r19 = r12
            r12 = r16
            r20 = r13
            r13 = r15
            r21 = r14
            r14 = r17
            r22 = r15
            r15 = r18
            r16 = r22
            r17 = r21
            r10.getPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r10 = r21
            double r11 = (double) r10
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double.isNaN(r11)
            double r11 = r11 / r13
            double r11 = java.lang.Math.ceil(r11)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r11 = (int) r11
            int r11 = r11 + r11
            r12 = r22
            double r8 = (double) r12
            java.lang.Double.isNaN(r8)
            double r8 = r8 / r13
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r8 = (int) r8     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r11 = r11 * r8
            int r13 = r20 + r11
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r13)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r13 = r20
            r9 = 0
            r11 = 0
            r14 = 0
        L_0x01c0:
            if (r9 >= r10) goto L_0x0246
            r15 = 0
        L_0x01c3:
            if (r15 >= r12) goto L_0x023b
            r5 = r19[r11]     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r3 = r5 >> 16
            r21 = r10
            r10 = 255(0xff, float:3.57E-43)
            r3 = r3 & r10
            r22 = r12
            int r12 = r5 >> 8
            r12 = r12 & r10
            r5 = r5 & r10
            int r23 = r3 * 66
            int r10 = r12 * 129
            int r23 = r23 + r10
            int r10 = r5 * 25
            int r10 = r23 + r10
            int r10 = r10 + 128
            int r10 = r10 >> 8
            int r10 = r10 + 16
            int r23 = r3 * -38
            int r25 = r12 * 74
            int r23 = r23 - r25
            int r25 = r5 * 112
            r26 = r2
            int r2 = r23 + r25
            int r2 = r2 + 128
            int r2 = r2 >> 8
            int r2 = r2 + 128
            int r3 = r3 * 112
            int r12 = r12 * 94
            int r3 = r3 - r12
            int r5 = r5 * 18
            int r3 = r3 - r5
            int r3 = r3 + 128
            int r3 = r3 >> 8
            int r3 = r3 + 128
            int r5 = r14 + 1
            r12 = 255(0xff, float:3.57E-43)
            int r10 = java.lang.Math.min(r12, r10)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r8.put(r14, r10)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r10 = r9 % 2
            if (r10 != 0) goto L_0x022e
            int r10 = r11 % 2
            if (r10 != 0) goto L_0x022e
            int r10 = r13 + 1
            r12 = 255(0xff, float:3.57E-43)
            int r3 = java.lang.Math.min(r12, r3)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r8.put(r13, r3)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            int r13 = r10 + 1
            int r2 = java.lang.Math.min(r12, r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            r8.put(r10, r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
        L_0x022e:
            int r11 = r11 + 1
            int r15 = r15 + 1
            r14 = r5
            r10 = r21
            r12 = r22
            r2 = r26
            r3 = 0
            goto L_0x01c3
        L_0x023b:
            r26 = r2
            r21 = r10
            r22 = r12
            int r9 = r9 + 1
            r3 = 0
            goto L_0x01c0
        L_0x0246:
            r26 = r2
            goto L_0x024f
        L_0x0249:
            r26 = r2
            java.nio.ByteBuffer r8 = r6.mo122866a()     // Catch:{ Exception -> 0x08de, all -> 0x08da }
        L_0x024f:
            java.lang.Object r2 = r7.f395182d     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            monitor-enter(r2)     // Catch:{ Exception -> 0x08de, all -> 0x08da }
            boolean r3 = r7.f395183e     // Catch:{ all -> 0x08c1 }
            if (r3 == 0) goto L_0x08b6
            com.google.android.gms.vision.face.internal.client.b r3 = r7.f395181c     // Catch:{ all -> 0x08c1 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)     // Catch:{ all -> 0x08c1 }
            com.google.android.gms.vision.internal.client.FrameMetadataParcel r5 = com.google.android.gms.vision.internal.client.C146320c.m238272a(r6)     // Catch:{ all -> 0x08c1 }
            boolean r6 = r3.mo122884c()     // Catch:{ all -> 0x08c1 }
            if (r6 != 0) goto L_0x026e
            r6 = 0
            com.google.android.gms.vision.face.b[] r3 = new com.google.android.gms.vision.face.C146307b[r6]     // Catch:{ all -> 0x08c1 }
        L_0x0268:
            r21 = r4
            r22 = r7
            goto L_0x0365
        L_0x026e:
            com.google.android.gms.f.k r6 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x0355 }
            r6.<init>(r8)     // Catch:{ RemoteException -> 0x0355 }
            java.lang.Object r3 = r3.mo122883b()     // Catch:{ RemoteException -> 0x0355 }
            com.google.android.gms.vision.face.internal.client.e r3 = (com.google.android.gms.vision.face.internal.client.C146315e) r3     // Catch:{ RemoteException -> 0x0355 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)     // Catch:{ RemoteException -> 0x0355 }
            android.os.Parcel r8 = r3.mo17260gA()     // Catch:{ RemoteException -> 0x0355 }
            com.google.android.p445a.C8850c.m23499h(r8, r6)     // Catch:{ RemoteException -> 0x0355 }
            com.google.android.p445a.C8850c.m23497f(r8, r5)     // Catch:{ RemoteException -> 0x0355 }
            r5 = 1
            android.os.Parcel r3 = r3.mo17261gT(r5, r8)     // Catch:{ RemoteException -> 0x0355 }
            android.os.Parcelable$Creator r5 = com.google.android.gms.vision.face.internal.client.FaceParcel.CREATOR     // Catch:{ RemoteException -> 0x0355 }
            java.lang.Object[] r5 = r3.createTypedArray(r5)     // Catch:{ RemoteException -> 0x0355 }
            com.google.android.gms.vision.face.internal.client.FaceParcel[] r5 = (com.google.android.gms.vision.face.internal.client.FaceParcel[]) r5     // Catch:{ RemoteException -> 0x0355 }
            r3.recycle()     // Catch:{ RemoteException -> 0x0355 }
            int r3 = r5.length     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.b[] r3 = new com.google.android.gms.vision.face.C146307b[r3]     // Catch:{ all -> 0x0350 }
            r6 = 0
        L_0x029a:
            int r8 = r5.length     // Catch:{ all -> 0x0350 }
            if (r6 >= r8) goto L_0x034c
            r8 = r5[r6]     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.b r9 = new com.google.android.gms.vision.face.b     // Catch:{ all -> 0x0350 }
            int r10 = r8.f395187b     // Catch:{ all -> 0x0350 }
            android.graphics.PointF r11 = new android.graphics.PointF     // Catch:{ all -> 0x0350 }
            float r12 = r8.f395188c     // Catch:{ all -> 0x0350 }
            float r13 = r8.f395189d     // Catch:{ all -> 0x0350 }
            r11.<init>(r12, r13)     // Catch:{ all -> 0x0350 }
            float r12 = r8.f395190e     // Catch:{ all -> 0x0350 }
            float r13 = r8.f395191f     // Catch:{ all -> 0x0350 }
            float r14 = r8.f395192g     // Catch:{ all -> 0x0350 }
            float r15 = r8.f395193h     // Catch:{ all -> 0x0350 }
            r19 = r5
            float r5 = r8.f395194i     // Catch:{ all -> 0x0350 }
            r21 = r4
            com.google.android.gms.vision.face.internal.client.LandmarkParcel[] r4 = r8.f395195j     // Catch:{ all -> 0x0350 }
            if (r4 != 0) goto L_0x02cc
            r1 = 0
            com.google.android.gms.vision.face.e[] r4 = new com.google.android.gms.vision.face.C146310e[r1]     // Catch:{ all -> 0x0350 }
            r23 = r3
            r35 = r4
            r34 = r5
            r37 = r6
            r22 = r7
            goto L_0x0300
        L_0x02cc:
            int r1 = r4.length     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.e[] r1 = new com.google.android.gms.vision.face.C146310e[r1]     // Catch:{ all -> 0x0350 }
            r23 = r3
            r22 = r7
            r7 = 0
        L_0x02d4:
            int r3 = r4.length     // Catch:{ all -> 0x0350 }
            if (r7 >= r3) goto L_0x02fa
            r3 = r4[r7]     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.e r24 = new com.google.android.gms.vision.face.e     // Catch:{ all -> 0x0350 }
            r25 = r4
            android.graphics.PointF r4 = new android.graphics.PointF     // Catch:{ all -> 0x0350 }
            r37 = r6
            float r6 = r3.f395208b     // Catch:{ all -> 0x0350 }
            r34 = r5
            float r5 = r3.f395209c     // Catch:{ all -> 0x0350 }
            r4.<init>(r6, r5)     // Catch:{ all -> 0x0350 }
            int r3 = r3.f395210d     // Catch:{ all -> 0x0350 }
            r24.<init>()     // Catch:{ all -> 0x0350 }
            r1[r7] = r24     // Catch:{ all -> 0x0350 }
            int r7 = r7 + 1
            r4 = r25
            r5 = r34
            r6 = r37
            goto L_0x02d4
        L_0x02fa:
            r34 = r5
            r37 = r6
            r35 = r1
        L_0x0300:
            com.google.android.gms.vision.face.internal.client.ContourParcel[] r1 = r8.f395199n     // Catch:{ all -> 0x0350 }
            if (r1 != 0) goto L_0x030a
            r3 = 0
            com.google.android.gms.vision.face.a[] r1 = new com.google.android.gms.vision.face.C146306a[r3]     // Catch:{ all -> 0x0350 }
            r36 = r1
            goto L_0x0323
        L_0x030a:
            int r3 = r1.length     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.a[] r3 = new com.google.android.gms.vision.face.C146306a[r3]     // Catch:{ all -> 0x0350 }
            r4 = 0
        L_0x030e:
            int r5 = r1.length     // Catch:{ all -> 0x0350 }
            if (r4 >= r5) goto L_0x0321
            r5 = r1[r4]     // Catch:{ all -> 0x0350 }
            com.google.android.gms.vision.face.a r6 = new com.google.android.gms.vision.face.a     // Catch:{ all -> 0x0350 }
            android.graphics.PointF[] r7 = r5.f395184a     // Catch:{ all -> 0x0350 }
            int r5 = r5.f395185b     // Catch:{ all -> 0x0350 }
            r6.<init>()     // Catch:{ all -> 0x0350 }
            r3[r4] = r6     // Catch:{ all -> 0x0350 }
            int r4 = r4 + 1
            goto L_0x030e
        L_0x0321:
            r36 = r3
        L_0x0323:
            float r1 = r8.f395196k     // Catch:{ all -> 0x0350 }
            float r1 = r8.f395197l     // Catch:{ all -> 0x0350 }
            float r1 = r8.f395198m     // Catch:{ all -> 0x0350 }
            float r1 = r8.f395200o     // Catch:{ all -> 0x0350 }
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0350 }
            r23[r37] = r9     // Catch:{ all -> 0x0350 }
            int r6 = r37 + 1
            r1 = r38
            r5 = r19
            r4 = r21
            r7 = r22
            r3 = r23
            goto L_0x029a
        L_0x034c:
            r23 = r3
            goto L_0x0268
        L_0x0350:
            r0 = move-exception
            r3 = r38
            goto L_0x08c3
        L_0x0355:
            r0 = move-exception
            r21 = r4
            r22 = r7
            r1 = r0
            java.lang.String r3 = "FaceNativeHandle"
            java.lang.String r4 = "Could not call native face detector"
            android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x0350 }
            r1 = 0
            com.google.android.gms.vision.face.b[] r3 = new com.google.android.gms.vision.face.C146307b[r1]     // Catch:{ all -> 0x0350 }
        L_0x0365:
            monitor-exit(r2)     // Catch:{ all -> 0x0350 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r1.<init>()     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r2 = r3.length     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            android.util.SparseArray r4 = new android.util.SparseArray     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r4.<init>(r2)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r5 = 0
            r6 = 0
        L_0x0373:
            r7 = -1
            if (r5 >= r2) goto L_0x03c0
            r8 = r3[r5]     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r9 = r8.f395169a     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r6 = java.lang.Math.max(r6, r9)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            boolean r10 = r1.contains(r10)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            if (r10 == 0) goto L_0x038b
            int r9 = r6 + 1
            r6 = r9
        L_0x038b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r1.add(r10)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r10 = r22
            com.google.android.gms.vision.e r11 = r10.f395180b     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            java.lang.Object r12 = com.google.android.gms.vision.C146304e.f395165a     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            monitor-enter(r12)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            android.util.SparseIntArray r13 = r11.f395167c     // Catch:{ all -> 0x03bc }
            int r13 = r13.get(r9, r7)     // Catch:{ all -> 0x03bc }
            if (r13 == r7) goto L_0x03a3
            monitor-exit(r12)     // Catch:{ all -> 0x03bc }
            goto L_0x03b4
        L_0x03a3:
            int r13 = com.google.android.gms.vision.C146304e.f395166b     // Catch:{ all -> 0x03bc }
            int r7 = r13 + 1
            com.google.android.gms.vision.C146304e.f395166b = r7     // Catch:{ all -> 0x03bc }
            android.util.SparseIntArray r7 = r11.f395167c     // Catch:{ all -> 0x03bc }
            r7.append(r9, r13)     // Catch:{ all -> 0x03bc }
            android.util.SparseIntArray r7 = r11.f395168d     // Catch:{ all -> 0x03bc }
            r7.append(r13, r9)     // Catch:{ all -> 0x03bc }
            monitor-exit(r12)     // Catch:{ all -> 0x03bc }
        L_0x03b4:
            r4.append(r13, r8)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r5 = r5 + 1
            r22 = r10
            goto L_0x0373
        L_0x03bc:
            r0 = move-exception
            r1 = r0
            monitor-exit(r12)     // Catch:{ all -> 0x03bc }
            throw r1     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
        L_0x03c0:
            android.util.SparseArray r1 = new android.util.SparseArray     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r2 = r4.size()     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r1.<init>(r2)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r2 = 0
        L_0x03ca:
            int r3 = r4.size()     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            if (r2 >= r3) goto L_0x03e5
            int r3 = r4.keyAt(r2)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            com.google.android.libraries.gcoreclient.aa.a.c r5 = new com.google.android.libraries.gcoreclient.aa.a.c     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            java.lang.Object r6 = r4.valueAt(r2)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            com.google.android.gms.vision.face.b r6 = (com.google.android.gms.vision.face.C146307b) r6     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r5.<init>(r6)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r1.append(r3, r5)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            int r2 = r2 + 1
            goto L_0x03ca
        L_0x03e5:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r3 = 14151(0x3747, float:1.983E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            java.lang.String r3 = "After detect."
            r2.mo56386p(r3)     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r1.size()     // Catch:{ Exception -> 0x08b2, all -> 0x08ae }
            r3 = r38
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.search.core.i.t r2 = r2.f263104m     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249906aV     // Catch:{ Exception -> 0x08d8 }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ Exception -> 0x08d8 }
            if (r2 == 0) goto L_0x0445
            int r2 = r1.size()     // Catch:{ Exception -> 0x08d8 }
            if (r2 != 0) goto L_0x0445
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            r2 = 4
            r1.mo88364h(r2)     // Catch:{ Exception -> 0x08d8 }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r1 = r1.f263094c
            monitor-enter(r1)
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x0441 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0441 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0441 }
            r4 = 14154(0x374a, float:1.9834E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x0441 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0441 }
            java.lang.String r4 = "set isInProcess to false"
            r2.mo56386p(r4)     // Catch:{ all -> 0x0441 }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x0441 }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0441 }
            r2.f263054F = r4     // Catch:{ all -> 0x0441 }
            monitor-exit(r1)     // Catch:{ all -> 0x0441 }
            return
        L_0x0441:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x0441 }
            throw r2
        L_0x0445:
            r2 = 0
        L_0x0446:
            int r4 = r1.size()     // Catch:{ Exception -> 0x08d8 }
            if (r2 >= r4) goto L_0x085f
            java.lang.Object r4 = r1.valueAt(r2)     // Catch:{ Exception -> 0x08d8 }
            com.google.android.libraries.gcoreclient.aa.a.c r4 = (com.google.android.libraries.gcoreclient.p1739aa.p1740a.C21415c) r4     // Catch:{ Exception -> 0x08d8 }
            if (r4 != 0) goto L_0x046c
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x08d8 }
            r5 = 14189(0x376d, float:1.9883E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r5 = "nullf!a!c!e!"
            r4.mo56386p(r5)     // Catch:{ Exception -> 0x08d8 }
            int r2 = r2 + 1
            goto L_0x0446
        L_0x046c:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f263104m     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249987bx     // Catch:{ Exception -> 0x08d8 }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ Exception -> 0x08d8 }
            r2 = 5
            if (r1 == 0) goto L_0x053b
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            boolean r1 = r1.mo88368m()     // Catch:{ Exception -> 0x08d8 }
            if (r1 == 0) goto L_0x053b
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            int r5 = r1.f263074Z     // Catch:{ Exception -> 0x08d8 }
            if (r5 == 0) goto L_0x04c0
            int r5 = r5 + r7
            r1.f263074Z = r5     // Catch:{ Exception -> 0x08d8 }
            float[] r1 = r1.f263097f     // Catch:{ Exception -> 0x08d8 }
            float r2 = r4.mo26921a()     // Catch:{ Exception -> 0x08d8 }
            r1[r5] = r2     // Catch:{ Exception -> 0x08d8 }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r1 = r1.f263094c
            monitor-enter(r1)
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x04bc }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x04bc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x04bc }
            r4 = 14187(0x376b, float:1.988E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x04bc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "set isInProcess to false"
            r2.mo56386p(r4)     // Catch:{ all -> 0x04bc }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x04bc }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x04bc }
            r2.f263054F = r4     // Catch:{ all -> 0x04bc }
            monitor-exit(r1)     // Catch:{ all -> 0x04bc }
            return
        L_0x04bc:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x04bc }
            throw r2
        L_0x04c0:
            float[] r1 = r1.f263097f     // Catch:{ Exception -> 0x08d8 }
            int r5 = r1.length     // Catch:{ Exception -> 0x08d8 }
            r5 = 0
        L_0x04c4:
            if (r5 >= r2) goto L_0x04d1
            r6 = r1[r5]     // Catch:{ Exception -> 0x08d8 }
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x04ce
            goto L_0x053b
        L_0x04ce:
            int r5 = r5 + 1
            goto L_0x04c4
        L_0x04d1:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            dagger.a r1 = r1.f263107p     // Catch:{ Exception -> 0x08d8 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.search.core.preferences.r r1 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r1     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.search.core.preferences.q r1 = r1.mo80076b()     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r2 = "PROBLEM_WITH_UP_DOWN_POSE_KEY"
            r4 = 1
            r1.mo80067b(r2, r4)     // Catch:{ Exception -> 0x08d8 }
            r1.commit()     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            r2 = 0
            r1.f263075aa = r2     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.ak r1 = r1.f263084aj     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.fa r2 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.UP_DOWN_POSES_NOT_SUPPORTED     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.n r2 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155379c(r2)     // Catch:{ Exception -> 0x08d8 }
            r1.mo88359a(r2)     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x08d8 }
            r2 = 14182(0x3766, float:1.9873E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r2 = "fallback"
            r1.mo56386p(r2)     // Catch:{ Exception -> 0x08d8 }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r1 = r1.f263094c
            monitor-enter(r1)
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x0537 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0537 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0537 }
            r4 = 14184(0x3768, float:1.9876E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x0537 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0537 }
            java.lang.String r4 = "set isInProcess to false"
            r2.mo56386p(r4)     // Catch:{ all -> 0x0537 }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x0537 }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0537 }
            r2.f263054F = r4     // Catch:{ all -> 0x0537 }
            monitor-exit(r1)     // Catch:{ all -> 0x0537 }
            return
        L_0x0537:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x0537 }
            throw r2
        L_0x053b:
            com.google.android.gms.vision.face.b r1 = r4.f59888a     // Catch:{ Exception -> 0x08d8 }
            float r5 = r1.f395173e     // Catch:{ Exception -> 0x08d8 }
            float r1 = r1.f395174f     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            java.lang.Object r1 = r1.f263095d     // Catch:{ Exception -> 0x08d8 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x08d8 }
            com.google.android.apps.gsa.staticplugins.avocado.an r5 = r3.f263046a     // Catch:{ all -> 0x085b }
            boolean r6 = r5.f263113v     // Catch:{ all -> 0x085b }
            if (r6 == 0) goto L_0x0590
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x085b }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x085b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x085b }
            r4 = 14178(0x3762, float:1.9868E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x085b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x085b }
            java.lang.String r4 = "Inside process sync"
            r2.mo56386p(r4)     // Catch:{ all -> 0x085b }
            monitor-exit(r1)     // Catch:{ all -> 0x085b }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r2 = r1.f263094c
            monitor-enter(r2)
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x058c }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x058c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x058c }
            r4 = 14180(0x3764, float:1.987E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x058c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x058c }
            java.lang.String r4 = "set isInProcess to false"
            r1.mo56386p(r4)     // Catch:{ all -> 0x058c }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ all -> 0x058c }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x058c }
            r1.f263054F = r4     // Catch:{ all -> 0x058c }
            monitor-exit(r2)     // Catch:{ all -> 0x058c }
            return
        L_0x058c:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x058c }
            throw r1
        L_0x0590:
            com.google.android.apps.gsa.search.core.i.t r6 = r5.f263104m     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249906aV     // Catch:{ all -> 0x085b }
            boolean r6 = r6.mo79746e(r7)     // Catch:{ all -> 0x085b }
            if (r6 == 0) goto L_0x06d1
            android.util.Size r6 = r5.f263077ac     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.search.core.i.t r7 = r5.f263104m     // Catch:{ all -> 0x085b }
            int r8 = r6.getWidth()     // Catch:{ all -> 0x085b }
            int r9 = r6.getHeight()     // Catch:{ all -> 0x085b }
            r10 = r21
            r11 = 1
            if (r10 == r11) goto L_0x05af
            r11 = 3
            if (r10 != r11) goto L_0x05b8
            goto L_0x05b0
        L_0x05af:
            r11 = 3
        L_0x05b0:
            int r8 = r6.getHeight()     // Catch:{ all -> 0x085b }
            int r9 = r6.getWidth()     // Catch:{ all -> 0x085b }
        L_0x05b8:
            android.graphics.PointF r6 = r4.mo26922b()     // Catch:{ all -> 0x085b }
            float r6 = r6.x     // Catch:{ all -> 0x085b }
            android.graphics.PointF r10 = r4.mo26922b()     // Catch:{ all -> 0x085b }
            float r10 = r10.y     // Catch:{ all -> 0x085b }
            com.google.android.gms.vision.face.b r12 = r4.f59888a     // Catch:{ all -> 0x085b }
            float r13 = r12.f395171c     // Catch:{ all -> 0x085b }
            float r13 = r13 + r6
            float r12 = r12.f395172d     // Catch:{ all -> 0x085b }
            float r12 = r12 + r10
            android.graphics.RectF r14 = new android.graphics.RectF     // Catch:{ all -> 0x085b }
            r14.<init>(r6, r10, r13, r12)     // Catch:{ all -> 0x085b }
            float r6 = r14.width()     // Catch:{ all -> 0x085b }
            float r10 = r14.height()     // Catch:{ all -> 0x085b }
            float r6 = java.lang.Math.max(r6, r10)     // Catch:{ all -> 0x085b }
            double r12 = (double) r6     // Catch:{ all -> 0x085b }
            int r6 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x085b }
            double r2 = (double) r6
            com.google.android.apps.gsa.shared.m.e r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249964ba     // Catch:{ all -> 0x06cc }
            double r18 = r7.mo79747m(r6)     // Catch:{ all -> 0x06cc }
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r18
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x05f5
            r8 = 1
            goto L_0x0672
        L_0x05f5:
            float r2 = r14.width()     // Catch:{ all -> 0x06cc }
            float r3 = r14.height()     // Catch:{ all -> 0x06cc }
            float r2 = java.lang.Math.min(r2, r3)     // Catch:{ all -> 0x06cc }
            double r2 = (double) r2     // Catch:{ all -> 0x06cc }
            int r6 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x06cc }
            double r12 = (double) r6     // Catch:{ all -> 0x06cc }
            com.google.android.apps.gsa.shared.m.e r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249969bf     // Catch:{ all -> 0x06cc }
            double r18 = r7.mo79747m(r6)     // Catch:{ all -> 0x06cc }
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r18
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0618
            r8 = 2
            goto L_0x0672
        L_0x0618:
            com.google.android.apps.gsa.shared.m.e r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249974bk     // Catch:{ all -> 0x06cc }
            double r2 = r7.mo79747m(r2)     // Catch:{ all -> 0x06cc }
            float r2 = (float) r2     // Catch:{ all -> 0x06cc }
            float r3 = -r2
            float r6 = (float) r8     // Catch:{ all -> 0x06cc }
            float r8 = r3 * r6
            float r9 = (float) r9     // Catch:{ all -> 0x06cc }
            float r3 = r3 * r9
            r12 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r12
            float r12 = r2 * r6
            float r2 = r2 * r9
            android.graphics.RectF r13 = new android.graphics.RectF     // Catch:{ all -> 0x06cc }
            r13.<init>(r8, r3, r12, r2)     // Catch:{ all -> 0x06cc }
            boolean r2 = r13.contains(r14)     // Catch:{ all -> 0x06cc }
            if (r2 != 0) goto L_0x063a
        L_0x0638:
            r8 = 3
            goto L_0x0672
        L_0x063a:
            r2 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r2
            float r9 = r9 / r2
            boolean r2 = r14.contains(r6, r9)     // Catch:{ all -> 0x06cc }
            if (r2 != 0) goto L_0x0645
            goto L_0x0638
        L_0x0645:
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249986bw     // Catch:{ all -> 0x06cc }
            boolean r2 = r7.mo79746e(r2)     // Catch:{ all -> 0x06cc }
            if (r2 != 0) goto L_0x0671
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249976bm     // Catch:{ all -> 0x06cc }
            boolean r2 = r7.mo79746e(r2)     // Catch:{ all -> 0x06cc }
            if (r2 == 0) goto L_0x0671
            float r2 = r4.mo26921a()     // Catch:{ all -> 0x06cc }
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249977bn     // Catch:{ all -> 0x06cc }
            long r8 = r7.mo79743a(r3)     // Catch:{ all -> 0x06cc }
            float r3 = (float) r8     // Catch:{ all -> 0x06cc }
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x066f
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249975bl     // Catch:{ all -> 0x06cc }
            long r6 = r7.mo79743a(r3)     // Catch:{ all -> 0x06cc }
            float r3 = (float) r6     // Catch:{ all -> 0x06cc }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0671
        L_0x066f:
            r8 = 5
            goto L_0x0672
        L_0x0671:
            r8 = 0
        L_0x0672:
            if (r8 == 0) goto L_0x06a8
            r5.mo88364h(r8)     // Catch:{ all -> 0x06cc }
            monitor-exit(r1)     // Catch:{ all -> 0x06cc }
            r3 = r38
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r2 = r1.f263094c
            monitor-enter(r2)
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x06a4 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x06a4 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x06a4 }
            r4 = 14176(0x3760, float:1.9865E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x06a4 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x06a4 }
            java.lang.String r4 = "set isInProcess to false"
            r1.mo56386p(r4)     // Catch:{ all -> 0x06a4 }
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ all -> 0x06a4 }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x06a4 }
            r1.f263054F = r4     // Catch:{ all -> 0x06a4 }
            monitor-exit(r2)     // Catch:{ all -> 0x06a4 }
            return
        L_0x06a4:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x06a4 }
            throw r1
        L_0x06a8:
            r3 = r38
            int r2 = r5.f263114w     // Catch:{ all -> 0x085b }
            if (r2 <= 0) goto L_0x06b8
            com.google.android.apps.gsa.staticplugins.avocado.ak r6 = r5.f263084aj     // Catch:{ all -> 0x085b }
            java.lang.String[] r7 = r5.f263056H     // Catch:{ all -> 0x085b }
            r2 = r7[r2]     // Catch:{ all -> 0x085b }
            r6.mo88360b(r2)     // Catch:{ all -> 0x085b }
            goto L_0x06bf
        L_0x06b8:
            com.google.android.apps.gsa.staticplugins.avocado.ak r2 = r5.f263084aj     // Catch:{ all -> 0x085b }
            java.lang.String r6 = ""
            r2.mo88360b(r6)     // Catch:{ all -> 0x085b }
        L_0x06bf:
            com.google.android.libraries.gsa.k.g r2 = r5.f263100i     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.v r6 = new com.google.android.apps.gsa.staticplugins.avocado.v     // Catch:{ all -> 0x085b }
            r6.<init>(r5)     // Catch:{ all -> 0x085b }
            java.lang.String r5 = "Reset the UI when face not rejected"
            r2.mo28212l(r5, r6)     // Catch:{ all -> 0x085b }
            goto L_0x06d1
        L_0x06cc:
            r0 = move-exception
            r3 = r38
            goto L_0x085c
        L_0x06d1:
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x085b }
            int r5 = r2.f263114w     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.search.core.i.t r6 = r2.f263104m     // Catch:{ all -> 0x085b }
            int r2 = r2.f263076ab     // Catch:{ all -> 0x085b }
            if (r5 >= r2) goto L_0x06dd
            r7 = 1
            goto L_0x06de
        L_0x06dd:
            r7 = 0
        L_0x06de:
            com.google.common.base.C58838bb.m90868c(r7)     // Catch:{ all -> 0x085b }
            com.google.android.gms.vision.face.b r7 = r4.f59888a     // Catch:{ all -> 0x085b }
            float r7 = r7.f395173e     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249903aS     // Catch:{ all -> 0x085b }
            long r8 = r6.mo79743a(r8)     // Catch:{ all -> 0x085b }
            float r8 = (float) r8     // Catch:{ all -> 0x085b }
            r9 = 5
            if (r2 != r9) goto L_0x0772
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249905aU     // Catch:{ all -> 0x085b }
            long r9 = r6.mo79743a(r2)     // Catch:{ all -> 0x085b }
            float r2 = (float) r9     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249904aT     // Catch:{ all -> 0x085b }
            long r9 = r6.mo79743a(r9)     // Catch:{ all -> 0x085b }
            float r6 = (float) r9     // Catch:{ all -> 0x085b }
            float r4 = r4.mo26921a()     // Catch:{ all -> 0x085b }
            java.lang.String r9 = "forward"
            com.google.common.b.gu r10 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263582b     // Catch:{ all -> 0x085b }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ all -> 0x085b }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x085b }
            if (r9 == 0) goto L_0x0723
            int r5 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0859
            float r5 = -r8
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0859
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0859
            float r2 = -r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0859
            goto L_0x07b0
        L_0x0723:
            java.lang.String r9 = "left"
            com.google.common.b.gu r10 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263582b     // Catch:{ all -> 0x085b }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ all -> 0x085b }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x085b }
            if (r9 == 0) goto L_0x0737
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0859
            goto L_0x07b0
        L_0x0737:
            java.lang.String r9 = "up"
            com.google.common.b.gu r10 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263582b     // Catch:{ all -> 0x085b }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ all -> 0x085b }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x085b }
            if (r9 == 0) goto L_0x074a
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0859
            goto L_0x07b0
        L_0x074a:
            java.lang.String r2 = "right"
            com.google.common.b.gu r9 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263582b     // Catch:{ all -> 0x085b }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ all -> 0x085b }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x075e
            float r2 = -r8
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0859
            goto L_0x07b0
        L_0x075e:
            java.lang.String r2 = "down"
            com.google.common.b.gu r7 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263582b     // Catch:{ all -> 0x085b }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x085b }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x084a
            float r2 = -r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0859
            goto L_0x07b0
        L_0x0772:
            java.lang.String r2 = "forward"
            com.google.common.b.gu r4 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263581a     // Catch:{ all -> 0x085b }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x085b }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x078a
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0859
            float r2 = -r8
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0859
            goto L_0x07b0
        L_0x078a:
            java.lang.String r2 = "left"
            com.google.common.b.gu r4 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263581a     // Catch:{ all -> 0x085b }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x085b }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x079d
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0859
            goto L_0x07b0
        L_0x079d:
            java.lang.String r2 = "right"
            com.google.common.b.gu r4 = com.google.android.apps.gsa.staticplugins.avocado.C94322i.f263581a     // Catch:{ all -> 0x085b }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x085b }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x084a
            float r2 = -r8
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0859
        L_0x07b0:
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x085b }
            boolean r2 = r2.f263066R     // Catch:{ all -> 0x085b }
            if (r2 == 0) goto L_0x07e0
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x085b }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x085b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x085b }
            r4 = 14174(0x375e, float:1.9862E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x085b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x085b }
            java.lang.String r4 = "First"
            r2.mo56386p(r4)     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x085b }
            r4 = 0
            r2.f263066R = r4     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.ak r2 = r2.f263084aj     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r2.f263044a     // Catch:{ all -> 0x085b }
            com.google.android.libraries.gsa.k.g r4 = r4.f263100i     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.ae r5 = new com.google.android.apps.gsa.staticplugins.avocado.ae     // Catch:{ all -> 0x085b }
            r5.<init>(r2)     // Catch:{ all -> 0x085b }
            java.lang.String r2 = "Update Ui first capture"
            r4.mo28212l(r2, r5)     // Catch:{ all -> 0x085b }
        L_0x07e0:
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x085b }
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x085b }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x085b }
            java.lang.String r5 = "#rotateAndSend"
            r6 = 14231(0x3797, float:1.9942E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.dh r4 = r2.f263103l     // Catch:{ all -> 0x085b }
            byte[] r5 = r26.mo59174N()     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.dy r6 = r2.f263053E     // Catch:{ all -> 0x085b }
            int r6 = r6.mo88425a()     // Catch:{ all -> 0x085b }
            int r7 = r5.length     // Catch:{ all -> 0x085b }
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.avocado.C94256dh.f263378a     // Catch:{ all -> 0x085b }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x085b }
            java.lang.String r9 = "Start transform. rotation %d"
            r10 = 14340(0x3804, float:2.0095E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56387q(r9, r6)     // Catch:{ all -> 0x085b }
            r8 = 0
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r5, r8, r7)     // Catch:{ all -> 0x085b }
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ all -> 0x085b }
            r14.<init>()     // Catch:{ all -> 0x085b }
            float r5 = (float) r6     // Catch:{ all -> 0x085b }
            r14.postRotate(r5)     // Catch:{ all -> 0x085b }
            int r12 = r9.getWidth()     // Catch:{ all -> 0x085b }
            int r13 = r9.getHeight()     // Catch:{ all -> 0x085b }
            r10 = 0
            r11 = 0
            r15 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x085b }
            com.google.android.libraries.gsa.k.g r4 = r4.f263393h     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.cx r6 = new com.google.android.apps.gsa.staticplugins.avocado.cx     // Catch:{ all -> 0x085b }
            r6.<init>(r5)     // Catch:{ all -> 0x085b }
            java.lang.String r5 = "Compress bitmap to image"
            com.google.common.util.concurrent.cx r4 = r4.mo28201a(r5, r6)     // Catch:{ all -> 0x085b }
            com.google.android.libraries.gsa.k.g r5 = r2.f263099h     // Catch:{ all -> 0x085b }
            java.lang.String r6 = "Send image"
            com.google.android.apps.gsa.staticplugins.avocado.r r7 = new com.google.android.apps.gsa.staticplugins.avocado.r     // Catch:{ all -> 0x085b }
            r7.<init>(r2)     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.shared.util.c.ag r8 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ all -> 0x085b }
            r8.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x085b }
            com.google.android.apps.gsa.staticplugins.avocado.s r4 = new com.google.android.apps.gsa.staticplugins.avocado.s     // Catch:{ all -> 0x085b }
            r4.<init>(r2)     // Catch:{ all -> 0x085b }
            r8.mo85223a(r4)     // Catch:{ all -> 0x085b }
            goto L_0x0859
        L_0x084a:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.f263017a     // Catch:{ all -> 0x085b }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x085b }
            java.lang.String r4 = "This should not never happen since we should cover all the FaceDirection before this."
            r5 = 14380(0x382c, float:2.015E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x085b }
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x085b }
        L_0x0859:
            monitor-exit(r1)     // Catch:{ all -> 0x085b }
            goto L_0x085f
        L_0x085b:
            r0 = move-exception
        L_0x085c:
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x085b }
            throw r2     // Catch:{ Exception -> 0x08d8 }
        L_0x085f:
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            int r2 = r1.f263050B     // Catch:{ Exception -> 0x08d8 }
            r4 = 1
            int r2 = r2 + r4
            r1.f263050B = r2     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x08d8 }
            r2 = 14163(0x3753, float:1.9847E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ Exception -> 0x08d8 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r2 = "end process %d"
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r3.f263046a     // Catch:{ Exception -> 0x08d8 }
            int r4 = r4.f263050B     // Catch:{ Exception -> 0x08d8 }
            r1.mo56387q(r2, r4)     // Catch:{ Exception -> 0x08d8 }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r1 = r1.f263094c
            monitor-enter(r1)
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x08aa }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x08aa }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x08aa }
            r4 = 14165(0x3755, float:1.985E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x08aa }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x08aa }
            java.lang.String r4 = "set isInProcess to false"
            r2.mo56386p(r4)     // Catch:{ all -> 0x08aa }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x08aa }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x08aa }
            r2.f263054F = r4     // Catch:{ all -> 0x08aa }
            monitor-exit(r1)     // Catch:{ all -> 0x08aa }
            return
        L_0x08aa:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x08aa }
            throw r2
        L_0x08ae:
            r0 = move-exception
            r3 = r38
            goto L_0x08dc
        L_0x08b2:
            r0 = move-exception
            r3 = r38
            goto L_0x08e0
        L_0x08b6:
            r3 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x08bf }
            java.lang.String r4 = "Cannot use detector after release()"
            r1.<init>(r4)     // Catch:{ all -> 0x08bf }
            throw r1     // Catch:{ all -> 0x08bf }
        L_0x08bf:
            r0 = move-exception
            goto L_0x08c3
        L_0x08c1:
            r0 = move-exception
            r3 = r1
        L_0x08c3:
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x08bf }
            throw r1     // Catch:{ Exception -> 0x08d8 }
        L_0x08c6:
            r3 = r1
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r2 = "Invalid image data size."
            r1.<init>(r2)     // Catch:{ Exception -> 0x08d8 }
            throw r1     // Catch:{ Exception -> 0x08d8 }
        L_0x08cf:
            r3 = r1
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r2 = "Null image data supplied."
            r1.<init>(r2)     // Catch:{ Exception -> 0x08d8 }
            throw r1     // Catch:{ Exception -> 0x08d8 }
        L_0x08d8:
            r0 = move-exception
            goto L_0x08e0
        L_0x08da:
            r0 = move-exception
            r3 = r1
        L_0x08dc:
            r1 = r0
            goto L_0x092c
        L_0x08de:
            r0 = move-exception
            r3 = r1
        L_0x08e0:
            r1 = r0
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x092a }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x092a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x092a }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x092a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x092a }
            r2 = 14156(0x374c, float:1.9837E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x092a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x092a }
            java.lang.String r2 = "Exception!!!"
            r1.mo56386p(r2)     // Catch:{ all -> 0x092a }
            android.media.Image r1 = r3.f263047b
            r1.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r1 = r3.f263046a
            java.lang.Object r1 = r1.f263094c
            monitor-enter(r1)
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x0926 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0926 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0926 }
            r4 = 14158(0x374e, float:1.984E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x0926 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0926 }
            java.lang.String r4 = "set isInProcess to false"
            r2.mo56386p(r4)     // Catch:{ all -> 0x0926 }
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a     // Catch:{ all -> 0x0926 }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0926 }
            r2.f263054F = r4     // Catch:{ all -> 0x0926 }
            monitor-exit(r1)     // Catch:{ all -> 0x0926 }
            return
        L_0x0926:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x0926 }
            throw r2
        L_0x092a:
            r0 = move-exception
            goto L_0x08dc
        L_0x092c:
            android.media.Image r2 = r3.f263047b
            r2.close()
            com.google.android.apps.gsa.staticplugins.avocado.an r2 = r3.f263046a
            java.lang.Object r2 = r2.f263094c
            monitor-enter(r2)
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.avocado.C94170an.f263048b     // Catch:{ all -> 0x0956 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0956 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0956 }
            r5 = 14161(0x3751, float:1.9844E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x0956 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0956 }
            java.lang.String r5 = "set isInProcess to false"
            r4.mo56386p(r5)     // Catch:{ all -> 0x0956 }
            com.google.android.apps.gsa.staticplugins.avocado.an r4 = r3.f263046a     // Catch:{ all -> 0x0956 }
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0956 }
            r4.f263054F = r5     // Catch:{ all -> 0x0956 }
            monitor-exit(r2)     // Catch:{ all -> 0x0956 }
            throw r1
        L_0x0956:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0956 }
            goto L_0x095b
        L_0x095a:
            throw r1
        L_0x095b:
            goto L_0x095a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94169am.run():void");
    }
}
