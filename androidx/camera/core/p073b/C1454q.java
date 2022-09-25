package androidx.camera.core.p073b;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.b.q */
/* compiled from: PG */
public final class C1454q implements C1303aq {

    /* renamed from: d */
    private static final Rect f4019d = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    public final Object f4020a = new Object();

    /* renamed from: b */
    public int f4021b;

    /* renamed from: c */
    C2164c f4022c;

    /* renamed from: e */
    private final int f4023e;

    /* renamed from: f */
    private boolean f4024f = false;

    /* renamed from: g */
    private int f4025g = 0;

    /* renamed from: h */
    private ImageWriter f4026h;

    /* renamed from: i */
    private Rect f4027i = f4019d;

    /* renamed from: j */
    private C60870cx f4028j;

    public C1454q(int i, int i2) {
        this.f4021b = i;
        this.f4023e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1.mo5437b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4164b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4020a
            monitor-enter(r0)
            boolean r1 = r4.f4024f     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r1 = 1
            r4.f4024f = r1     // Catch:{ all -> 0x0033 }
            int r1 = r4.f4025g     // Catch:{ all -> 0x0033 }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            android.media.ImageWriter r1 = r4.f4026h     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r3 = "No processing in progress. Closing immediately."
            androidx.camera.core.C1477bw.m3978a(r1, r3)     // Catch:{ all -> 0x0033 }
            android.media.ImageWriter r1 = r4.f4026h     // Catch:{ all -> 0x0033 }
            r1.close()     // Catch:{ all -> 0x0033 }
            androidx.d.a.c r1 = r4.f4022c     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r3 = "close() called while processing. Will close after completion."
            androidx.camera.core.C1477bw.m3978a(r1, r3)     // Catch:{ all -> 0x0033 }
            r1 = r2
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0032
            r1.mo5437b(r2)
        L_0x0032:
            return
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p073b.C1454q.mo4164b():void");
    }

    /* renamed from: e */
    public final void mo4165e(Surface surface, int i) {
        C1974i.m5315c(i == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f4020a) {
            if (this.f4024f) {
                C1477bw.m3983f("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f4026h == null) {
                this.f4026h = ImageWriter.newInstance(surface, this.f4023e, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    /* renamed from: f */
    public final void mo4166f(Size size) {
        synchronized (this.f4020a) {
            this.f4027i = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.camera.core.bs} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    public final void mo4167g(androidx.camera.core.p069a.C1329bp r28) {
        /*
            r27 = this;
            r1 = r27
            java.util.List r0 = r28.mo4197b()
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Processing image bundle have single capture id, but found "
            r5.<init>(r6)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            androidx.core.p097i.C1974i.m5314b(r2, r5)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r28
            com.google.common.util.concurrent.cx r0 = r2.mo4196a(r0)
            boolean r2 = r0.isDone()
            androidx.core.p097i.C1974i.m5313a(r2)
            java.lang.Object r2 = r1.f4020a
            monitor-enter(r2)
            android.media.ImageWriter r5 = r1.f4026h     // Catch:{ all -> 0x03ff }
            boolean r6 = r1.f4024f     // Catch:{ all -> 0x03ff }
            r6 = r6 ^ r4
            android.graphics.Rect r7 = r1.f4027i     // Catch:{ all -> 0x03ff }
            if (r6 == 0) goto L_0x004e
            int r8 = r1.f4025g     // Catch:{ all -> 0x03ff }
            int r8 = r8 + r4
            r1.f4025g = r8     // Catch:{ all -> 0x03ff }
        L_0x004e:
            int r8 = r1.f4021b     // Catch:{ all -> 0x03ff }
            monitor-exit(r2)     // Catch:{ all -> 0x03ff }
            java.lang.Object r9 = r0.get()     // Catch:{ Exception -> 0x0365, all -> 0x035c }
            androidx.camera.core.bs r9 = (androidx.camera.core.C1473bs) r9     // Catch:{ Exception -> 0x0365, all -> 0x035c }
            if (r6 != 0) goto L_0x006b
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r7 = "Image enqueued for processing on closed processor."
            androidx.camera.core.C1477bw.m3983f(r0, r7)     // Catch:{ Exception -> 0x0356, all -> 0x034f }
            r9.close()     // Catch:{ Exception -> 0x0356, all -> 0x034f }
            java.lang.Object r7 = r1.f4020a
            monitor-enter(r7)
            monitor-exit(r7)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            android.media.Image r10 = r5.dequeueInputImage()     // Catch:{ Exception -> 0x0356, all -> 0x034f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0347, all -> 0x033e }
            r11 = r0
            androidx.camera.core.bs r11 = (androidx.camera.core.C1473bs) r11     // Catch:{ Exception -> 0x0347, all -> 0x033e }
            int r0 = r11.mo4300a()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r9 = 35
            if (r0 != r9) goto L_0x0080
            r0 = 1
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            java.lang.String r9 = "Input image is not expected YUV_420_888 image format"
            androidx.core.p097i.C1974i.m5315c(r0, r9)     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            androidx.camera.core.a[] r0 = r11.mo4306f()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r0 = r0[r3]     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            androidx.camera.core.a[] r9 = r11.mo4306f()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r9 = r9[r4]     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            androidx.camera.core.a[] r12 = r11.mo4306f()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r13 = 2
            r12 = r12[r13]     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            android.media.Image$Plane r14 = r0.f3625a     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            java.nio.ByteBuffer r14 = r14.getBuffer()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            android.media.Image$Plane r15 = r9.f3625a     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            java.nio.ByteBuffer r15 = r15.getBuffer()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            android.media.Image$Plane r2 = r12.f3625a     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r14.rewind()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r15.rewind()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r2.rewind()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            int r4 = r14.remaining()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            int r17 = r11.mo4302c()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            int r18 = r11.mo4301b()     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            int r17 = r17 * r18
            int r17 = r17 / 2
            int r3 = r4 + r17
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0335, all -> 0x032c }
            r25 = r6
            r6 = 0
            r13 = 0
        L_0x00cc:
            int r1 = r11.mo4301b()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            if (r13 >= r1) goto L_0x00fd
            int r1 = r11.mo4302c()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            r14.get(r3, r6, r1)     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r1 = r11.mo4302c()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r6 = r6 + r1
            int r1 = r14.position()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r19 = r11.mo4302c()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r1 = r1 - r19
            r19 = r6
            android.media.Image$Plane r6 = r0.f3625a     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r6 = r6.getRowStride()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r1 = r1 + r6
            int r1 = java.lang.Math.min(r4, r1)     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            r14.position(r1)     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r13 = r13 + 1
            r6 = r19
            goto L_0x00cc
        L_0x00fd:
            int r0 = r11.mo4301b()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            r1 = 2
            int r0 = r0 / r1
            int r4 = r11.mo4302c()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r4 = r4 / r1
            android.media.Image$Plane r1 = r12.f3625a     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r1 = r1.getRowStride()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            android.media.Image$Plane r13 = r9.f3625a     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r13 = r13.getRowStride()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            android.media.Image$Plane r12 = r12.f3625a     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r12 = r12.getPixelStride()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            android.media.Image$Plane r9 = r9.f3625a     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            int r9 = r9.getPixelStride()     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            byte[] r14 = new byte[r1]     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            r19 = r6
            byte[] r6 = new byte[r13]     // Catch:{ Exception -> 0x0327, all -> 0x0322 }
            r26 = r5
            r5 = 0
        L_0x0129:
            if (r5 >= r0) goto L_0x0169
            r20 = r0
            int r0 = r2.remaining()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r21 = r1
            r1 = 0
            r2.get(r14, r1, r0)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r0 = r15.remaining()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r15.get(r6, r1, r0)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r22 = r19
            r0 = 0
            r1 = 0
            r19 = 0
        L_0x014c:
            if (r0 >= r4) goto L_0x0160
            int r23 = r22 + 1
            byte r24 = r14[r1]     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r3[r22] = r24     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r22 = r23 + 1
            byte r24 = r6[r19]     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r3[r23] = r24     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r1 = r1 + r12
            int r19 = r19 + r9
            int r0 = r0 + 1
            goto L_0x014c
        L_0x0160:
            int r5 = r5 + 1
            r0 = r20
            r1 = r21
            r19 = r22
            goto L_0x0129
        L_0x0169:
            android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r21 = 17
            int r22 = r11.mo4302c()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r23 = r11.mo4301b()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r24 = 0
            r19 = r0
            r20 = r3
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            android.media.Image$Plane[] r1 = r10.getPlanes()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r2 = r1.position()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            androidx.camera.core.a.a.l r3 = new androidx.camera.core.a.a.l     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            androidx.camera.core.b.b r4 = new androidx.camera.core.b.b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r5 = androidx.camera.core.p069a.p070a.C1280k.f3700e     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            androidx.camera.core.a.a.j r5 = new androidx.camera.core.a.a.j     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r6 = "1"
            java.lang.String r9 = "Orientation"
            java.util.List r12 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r9, r6, r12)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r9 = "XResolution"
            java.lang.String r12 = "72/1"
            java.util.List r13 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r9, r12, r13)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r9 = "YResolution"
            java.lang.String r12 = "72/1"
            java.util.List r13 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r9, r12, r13)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r9 = "ResolutionUnit"
            java.lang.String r12 = "2"
            java.util.List r13 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r9, r12, r13)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r9 = "YCbCrPositioning"
            java.util.List r12 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r9, r6, r12)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r6 = "Make"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.util.List r12 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r6, r9, r12)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r6 = "Model"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.util.List r12 = r5.f3695b     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4140b(r6, r9, r12)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            androidx.camera.core.br r6 = r11.mo4305e()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r6.mo4334e(r5)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r6 = 0
            r5.mo4141c(r6)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r6 = r11.mo4302c()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4143e(r6)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            int r6 = r11.mo4301b()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r5.mo4142d(r6)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r6 = "0"
            java.lang.String r9 = "2"
            java.lang.String r12 = "3"
            java.lang.String r13 = "1"
            androidx.camera.core.a.a.i r14 = new androidx.camera.core.a.a.i     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r14.<init>(r5)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.util.ArrayList r14 = java.util.Collections.list(r14)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            r15 = 1
            java.lang.Object r16 = r14.get(r15)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.util.Map r16 = (java.util.Map) r16     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            boolean r16 = r16.isEmpty()     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            if (r16 != 0) goto L_0x0260
            java.lang.String r15 = "ExposureProgram"
            r5.mo4139a(r15, r6, r14)     // Catch:{ Exception -> 0x031b, all -> 0x0314 }
            java.lang.String r15 = "ExifVersion"
            r19 = r10
            java.lang.String r10 = "0230"
            r5.mo4139a(r15, r10, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r10 = "ComponentsConfiguration"
            java.lang.String r15 = "1,2,3,0"
            r5.mo4139a(r10, r15, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r10 = "MeteringMode"
            r5.mo4139a(r10, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r10 = "LightSource"
            r5.mo4139a(r10, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r10 = "FlashpixVersion"
            java.lang.String r15 = "0100"
            r5.mo4139a(r10, r15, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r10 = "FocalPlaneResolutionUnit"
            r5.mo4139a(r10, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "FileSource"
            r5.mo4139a(r9, r12, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "SceneType"
            r5.mo4139a(r9, r13, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "CustomRendered"
            r5.mo4139a(r9, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "SceneCaptureType"
            r5.mo4139a(r9, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "Contrast"
            r5.mo4139a(r9, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "Saturation"
            r5.mo4139a(r9, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r9 = "Sharpness"
            r5.mo4139a(r9, r6, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            goto L_0x0262
        L_0x0260:
            r19 = r10
        L_0x0262:
            r6 = 2
            java.lang.Object r6 = r14.get(r6)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            if (r6 != 0) goto L_0x0299
            java.lang.String r6 = "GPSVersionID"
            java.lang.String r9 = "2300"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r6 = "GPSSpeedRef"
            java.lang.String r9 = "K"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r6 = "GPSTrackRef"
            java.lang.String r9 = "T"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r6 = "GPSImgDirectionRef"
            java.lang.String r9 = "T"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r6 = "GPSDestBearingRef"
            java.lang.String r9 = "T"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.lang.String r6 = "GPSDestDistanceRef"
            java.lang.String r9 = "K"
            r5.mo4139a(r6, r9, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
        L_0x0299:
            androidx.camera.core.a.a.k r6 = new androidx.camera.core.a.a.k     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            java.nio.ByteOrder r5 = r5.f3696c     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            r6.<init>(r5, r14)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            r0.compressToJpeg(r7, r8, r3)     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            r11.close()     // Catch:{ Exception -> 0x030e, all -> 0x0308 }
            int r0 = r1.position()     // Catch:{ Exception -> 0x02fd, all -> 0x02f1 }
            r1.limit(r0)     // Catch:{ Exception -> 0x02fd, all -> 0x02f1 }
            r1.position(r2)     // Catch:{ Exception -> 0x02fd, all -> 0x02f1 }
            r2 = r19
            r1 = r26
            r1.queueInputImage(r2)     // Catch:{ Exception -> 0x02ed, all -> 0x02e9 }
            r3 = r27
            java.lang.Object r4 = r3.f4020a
            monitor-enter(r4)
            int r0 = r3.f4025g     // Catch:{ all -> 0x02e6 }
            int r2 = r0 + -1
            r3.f4025g = r2     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x02ce
            boolean r0 = r3.f4024f     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02ce
            r18 = 1
            goto L_0x02d0
        L_0x02ce:
            r18 = 0
        L_0x02d0:
            androidx.d.a.c r0 = r3.f4022c     // Catch:{ all -> 0x02e6 }
            monitor-exit(r4)     // Catch:{ all -> 0x02e6 }
            if (r18 == 0) goto L_0x03fc
            r1.close()
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            androidx.camera.core.C1477bw.m3978a(r1, r2)
            if (r0 == 0) goto L_0x03fc
        L_0x02e1:
            r1 = 0
            r0.mo5437b(r1)
            return
        L_0x02e6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02e6 }
            throw r0
        L_0x02e9:
            r0 = move-exception
            r3 = r27
            goto L_0x02f8
        L_0x02ed:
            r0 = move-exception
            r3 = r27
            goto L_0x0304
        L_0x02f1:
            r0 = move-exception
            r3 = r27
            r2 = r19
            r1 = r26
        L_0x02f8:
            r10 = r2
            r2 = 0
            r9 = 0
            goto L_0x0392
        L_0x02fd:
            r0 = move-exception
            r3 = r27
            r2 = r19
            r1 = r26
        L_0x0304:
            r10 = r2
            r9 = 0
            goto L_0x036c
        L_0x0308:
            r0 = move-exception
            r3 = r27
            r2 = r19
            goto L_0x0318
        L_0x030e:
            r0 = move-exception
            r3 = r27
            r2 = r19
            goto L_0x031f
        L_0x0314:
            r0 = move-exception
            r3 = r27
            r2 = r10
        L_0x0318:
            r1 = r26
            goto L_0x0332
        L_0x031b:
            r0 = move-exception
            r3 = r27
            r2 = r10
        L_0x031f:
            r1 = r26
            goto L_0x033b
        L_0x0322:
            r0 = move-exception
            r3 = r27
            r1 = r5
            goto L_0x0331
        L_0x0327:
            r0 = move-exception
            r3 = r27
            r1 = r5
            goto L_0x033a
        L_0x032c:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
        L_0x0331:
            r2 = r10
        L_0x0332:
            r10 = r2
            r9 = r11
            goto L_0x0345
        L_0x0335:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
        L_0x033a:
            r2 = r10
        L_0x033b:
            r10 = r2
            r9 = r11
            goto L_0x036c
        L_0x033e:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            r2 = r10
            r10 = r2
        L_0x0345:
            r2 = 0
            goto L_0x0392
        L_0x0347:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            r2 = r10
            r10 = r2
            goto L_0x036c
        L_0x034f:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            r2 = 0
            goto L_0x0363
        L_0x0356:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            goto L_0x036b
        L_0x035c:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            r2 = 0
            r9 = 0
        L_0x0363:
            r10 = 0
            goto L_0x0392
        L_0x0365:
            r0 = move-exception
            r3 = r1
            r1 = r5
            r25 = r6
            r9 = 0
        L_0x036b:
            r10 = 0
        L_0x036c:
            if (r25 == 0) goto L_0x03c9
            java.lang.String r2 = "YuvToJpegProcessor"
            java.lang.String r4 = "Failed to process YUV -> JPEG"
            androidx.camera.core.C1477bw.m3981d(r2, r4, r0)     // Catch:{ all -> 0x0390 }
            android.media.Image r10 = r1.dequeueInputImage()     // Catch:{ all -> 0x0390 }
            android.media.Image$Plane[] r0 = r10.getPlanes()     // Catch:{ all -> 0x0390 }
            r2 = 0
            r0 = r0[r2]     // Catch:{ all -> 0x038e }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x038e }
            r0.rewind()     // Catch:{ all -> 0x038e }
            r0.limit(r2)     // Catch:{ all -> 0x038e }
            r1.queueInputImage(r10)     // Catch:{ all -> 0x038e }
            goto L_0x03ca
        L_0x038e:
            r0 = move-exception
            goto L_0x0392
        L_0x0390:
            r0 = move-exception
            goto L_0x0345
        L_0x0392:
            java.lang.Object r4 = r3.f4020a
            monitor-enter(r4)
            if (r25 == 0) goto L_0x03a7
            int r5 = r3.f4025g     // Catch:{ all -> 0x03a5 }
            int r6 = r5 + -1
            r3.f4025g = r6     // Catch:{ all -> 0x03a5 }
            if (r5 != 0) goto L_0x03a7
            boolean r5 = r3.f4024f     // Catch:{ all -> 0x03a5 }
            if (r5 == 0) goto L_0x03a7
            r2 = 1
            goto L_0x03a7
        L_0x03a5:
            r0 = move-exception
            goto L_0x03c7
        L_0x03a7:
            androidx.d.a.c r5 = r3.f4022c     // Catch:{ all -> 0x03a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x03a5 }
            if (r10 == 0) goto L_0x03af
            r10.close()
        L_0x03af:
            if (r9 == 0) goto L_0x03b4
            r9.close()
        L_0x03b4:
            if (r2 == 0) goto L_0x03c6
            r1.close()
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            androidx.camera.core.C1477bw.m3978a(r1, r2)
            if (r5 == 0) goto L_0x03c6
            r1 = 0
            r5.mo5437b(r1)
        L_0x03c6:
            throw r0
        L_0x03c7:
            monitor-exit(r4)     // Catch:{ all -> 0x03a5 }
            throw r0
        L_0x03c9:
            r2 = 0
        L_0x03ca:
            java.lang.Object r4 = r3.f4020a
            monitor-enter(r4)
            if (r25 == 0) goto L_0x03df
            int r0 = r3.f4025g     // Catch:{ all -> 0x03dd }
            int r5 = r0 + -1
            r3.f4025g = r5     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x03df
            boolean r0 = r3.f4024f     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x03df
            r2 = 1
            goto L_0x03df
        L_0x03dd:
            r0 = move-exception
            goto L_0x03fd
        L_0x03df:
            androidx.d.a.c r0 = r3.f4022c     // Catch:{ all -> 0x03dd }
            monitor-exit(r4)     // Catch:{ all -> 0x03dd }
            if (r10 == 0) goto L_0x03e7
            r10.close()
        L_0x03e7:
            if (r9 == 0) goto L_0x03ec
            r9.close()
        L_0x03ec:
            if (r2 == 0) goto L_0x03fc
            r1.close()
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            androidx.camera.core.C1477bw.m3978a(r1, r2)
            if (r0 == 0) goto L_0x03fc
            goto L_0x02e1
        L_0x03fc:
            return
        L_0x03fd:
            monitor-exit(r4)     // Catch:{ all -> 0x03dd }
            throw r0
        L_0x03ff:
            r0 = move-exception
            r3 = r1
        L_0x0401:
            monitor-exit(r2)     // Catch:{ all -> 0x0403 }
            throw r0
        L_0x0403:
            r0 = move-exception
            goto L_0x0401
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p073b.C1454q.mo4167g(androidx.camera.core.a.bp):void");
    }

    /* renamed from: a */
    public final C60870cx mo4163a() {
        C60870cx cxVar;
        synchronized (this.f4020a) {
            if (!this.f4024f || this.f4025g != 0) {
                if (this.f4028j == null) {
                    this.f4028j = C2169h.m6027a(new C1453p(this));
                }
                cxVar = C1263l.m3431c(this.f4028j);
            } else {
                cxVar = C1266o.f3667a;
            }
        }
        return cxVar;
    }
}
