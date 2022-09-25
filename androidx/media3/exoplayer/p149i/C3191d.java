package androidx.media3.exoplayer.p149i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2680x;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2836bf;
import androidx.media3.exoplayer.C2841bk;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.C3001g;
import androidx.media3.extractor.p163j.C3486d;
import androidx.media3.extractor.p163j.C3493e;
import androidx.media3.extractor.p163j.C3496f;
import androidx.media3.extractor.p163j.C3508g;
import com.google.common.p4522b.C58485gu;

/* renamed from: androidx.media3.exoplayer.i.d */
/* compiled from: PG */
public final class C3191d extends C3001g implements Handler.Callback {

    /* renamed from: f */
    public long f9546f;

    /* renamed from: g */
    private final Handler f9547g;

    /* renamed from: h */
    private final C2874cc f9548h;

    /* renamed from: i */
    private boolean f9549i;

    /* renamed from: j */
    private boolean f9550j;

    /* renamed from: k */
    private boolean f9551k;

    /* renamed from: l */
    private int f9552l;

    /* renamed from: m */
    private C2680x f9553m;

    /* renamed from: n */
    private C3486d f9554n;

    /* renamed from: o */
    private C3496f f9555o;

    /* renamed from: p */
    private C3508g f9556p;

    /* renamed from: q */
    private C3508g f9557q;

    /* renamed from: r */
    private int f9558r;

    /* renamed from: s */
    private long f9559s;

    /* renamed from: t */
    private long f9560t;

    /* renamed from: u */
    private final C2845bo f9561u;

    public C3191d(C2845bo boVar, Looper looper) {
        super(3);
        Handler handler;
        boVar.getClass();
        this.f9561u = boVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C2612ak.m6921D(looper, this);
        }
        this.f9547g = handler;
        this.f9548h = new C2874cc();
        this.f9546f = -9223372036854775807L;
        this.f9559s = -9223372036854775807L;
        this.f9560t = -9223372036854775807L;
    }

    /* renamed from: M */
    private final long m9335M() {
        int i = this.f9558r;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        C3508g gVar = this.f9556p;
        gVar.getClass();
        if (i >= gVar.mo7193a()) {
            return Long.MAX_VALUE;
        }
        return this.f9556p.mo7196ff(this.f9558r);
    }

    /* renamed from: N */
    private final void m9336N() {
        C58485gu m = C58485gu.m89845m();
        m9343U(this.f9560t);
        m9342T(new C2568d(m));
    }

    /* renamed from: O */
    private final void m9337O(C3493e eVar) {
        C2633u.m7048c("TextRenderer", C2633u.m7046a("Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.f9553m))), eVar));
        m9336N();
        m9341S();
        m9338P();
    }

    /* renamed from: Q */
    private final void m9339Q(C2568d dVar) {
        C2845bo boVar = this.f9561u;
        C58485gu guVar = dVar.f7102a;
        C2632t tVar = boVar.f7944a.f7992d;
        tVar.mo6204c(27, new C2836bf(guVar));
        tVar.mo6203b();
        C2632t tVar2 = this.f9561u.f7944a.f7992d;
        tVar2.mo6204c(27, new C2841bk(dVar));
        tVar2.mo6203b();
    }

    /* renamed from: R */
    private final void m9340R() {
        this.f9555o = null;
        this.f9558r = -1;
        C3508g gVar = this.f9556p;
        if (gVar != null) {
            gVar.mo5962c();
            this.f9556p = null;
        }
        C3508g gVar2 = this.f9557q;
        if (gVar2 != null) {
            gVar2.mo5962c();
            this.f9557q = null;
        }
    }

    /* renamed from: S */
    private final void m9341S() {
        m9340R();
        C3486d dVar = this.f9554n;
        dVar.getClass();
        dVar.mo5959e();
        this.f9554n = null;
        this.f9552l = 0;
    }

    /* renamed from: T */
    private final void m9342T(C2568d dVar) {
        Handler handler = this.f9547g;
        if (handler != null) {
            handler.obtainMessage(0, dVar).sendToTarget();
        } else {
            m9339Q(dVar);
        }
    }

    /* renamed from: U */
    private final void m9343U(long j) {
        boolean z = true;
        C2601a.m6832d(j != -9223372036854775807L);
        if (this.f9559s == -9223372036854775807L) {
            z = false;
        }
        C2601a.m6832d(z);
    }

    /* renamed from: H */
    public final String mo6504H() {
        return "TextRenderer";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r11 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[LOOP:1: B:59:0x00e0->B:97:0x00e0, LOOP_START, SYNTHETIC, Splitter:B:59:0x00e0] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6686I(long r9, long r11) {
        /*
            r8 = this;
            r8.f9560t = r9
            boolean r11 = r8.f8684e
            r12 = 1
            if (r11 == 0) goto L_0x001b
            long r0 = r8.f9546f
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x001b
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x001b
            r8.m9340R()
            r8.f9550j = r12
        L_0x001b:
            boolean r11 = r8.f9550j
            if (r11 == 0) goto L_0x0020
            return
        L_0x0020:
            androidx.media3.extractor.j.g r11 = r8.f9557q
            if (r11 != 0) goto L_0x003f
            androidx.media3.extractor.j.d r11 = r8.f9554n
            r11.getClass()
            r11.mo7197r(r9)
            androidx.media3.extractor.j.d r11 = r8.f9554n     // Catch:{ e -> 0x003a }
            r11.getClass()
            java.lang.Object r11 = r11.mo5956b()     // Catch:{ e -> 0x003a }
            androidx.media3.extractor.j.g r11 = (androidx.media3.extractor.p163j.C3508g) r11     // Catch:{ e -> 0x003a }
            r8.f9557q = r11     // Catch:{ e -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r9 = move-exception
            r8.m9337O(r9)
            return
        L_0x003f:
            int r11 = r8.f8682c
            r0 = 2
            if (r11 == r0) goto L_0x0045
            return
        L_0x0045:
            androidx.media3.extractor.j.g r11 = r8.f9556p
            r1 = 0
            if (r11 == 0) goto L_0x005e
            long r2 = r8.m9335M()
            r11 = 0
        L_0x004f:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x005f
            int r11 = r8.f9558r
            int r11 = r11 + r12
            r8.f9558r = r11
            long r2 = r8.m9335M()
            r11 = 1
            goto L_0x004f
        L_0x005e:
            r11 = 0
        L_0x005f:
            androidx.media3.extractor.j.g r2 = r8.f9557q
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x00a3
            boolean r5 = r2.mo5954fh(r4)
            if (r5 == 0) goto L_0x008b
            if (r11 != 0) goto L_0x00a5
            long r9 = r8.m9335M()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x00dc
            int r9 = r8.f9552l
            if (r9 != r0) goto L_0x0085
            r8.m9341S()
            r8.m9338P()
            goto L_0x00dc
        L_0x0085:
            r8.m9340R()
            r8.f9550j = r12
            goto L_0x00dc
        L_0x008b:
            long r5 = r2.f6960b
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x00a3
            androidx.media3.extractor.j.g r11 = r8.f9556p
            if (r11 == 0) goto L_0x0098
            r11.mo5962c()
        L_0x0098:
            int r11 = r2.mo7194b(r9)
            r8.f9558r = r11
            r8.f9556p = r2
            r8.f9557q = r3
            goto L_0x00a5
        L_0x00a3:
            if (r11 == 0) goto L_0x00dc
        L_0x00a5:
            androidx.media3.extractor.j.g r11 = r8.f9556p
            r11.getClass()
            int r11 = r11.mo7194b(r9)
            if (r11 != 0) goto L_0x00b5
            androidx.media3.extractor.j.g r11 = r8.f9556p
            long r5 = r11.f6960b
            goto L_0x00cb
        L_0x00b5:
            r2 = -1
            if (r11 != r2) goto L_0x00c4
            androidx.media3.extractor.j.g r11 = r8.f9556p
            int r5 = r11.mo7193a()
            int r5 = r5 + r2
            long r5 = r11.mo7196ff(r5)
            goto L_0x00cb
        L_0x00c4:
            androidx.media3.extractor.j.g r5 = r8.f9556p
            int r11 = r11 + r2
            long r5 = r5.mo7196ff(r11)
        L_0x00cb:
            r8.m9343U(r5)
            androidx.media3.common.a.d r11 = new androidx.media3.common.a.d
            androidx.media3.extractor.j.g r2 = r8.f9556p
            java.util.List r9 = r2.mo7195d(r9)
            r11.<init>(r9)
            r8.m9342T(r11)
        L_0x00dc:
            int r9 = r8.f9552l
            if (r9 == r0) goto L_0x014c
        L_0x00e0:
            boolean r9 = r8.f9549i     // Catch:{ e -> 0x0148 }
            if (r9 != 0) goto L_0x0147
            androidx.media3.extractor.j.f r9 = r8.f9555o     // Catch:{ e -> 0x0148 }
            if (r9 != 0) goto L_0x00f8
            androidx.media3.extractor.j.d r9 = r8.f9554n     // Catch:{ e -> 0x0148 }
            r9.getClass()
            java.lang.Object r9 = r9.mo5955a()     // Catch:{ e -> 0x0148 }
            androidx.media3.extractor.j.f r9 = (androidx.media3.extractor.p163j.C3496f) r9     // Catch:{ e -> 0x0148 }
            if (r9 != 0) goto L_0x00f6
            return
        L_0x00f6:
            r8.f9555o = r9     // Catch:{ e -> 0x0148 }
        L_0x00f8:
            int r10 = r8.f9552l     // Catch:{ e -> 0x0148 }
            if (r10 != r12) goto L_0x010b
            r9.f6941a = r4     // Catch:{ e -> 0x0148 }
            androidx.media3.extractor.j.d r10 = r8.f9554n     // Catch:{ e -> 0x0148 }
            r10.getClass()
            r10.mo5958d(r9)     // Catch:{ e -> 0x0148 }
            r8.f9555o = r3     // Catch:{ e -> 0x0148 }
            r8.f9552l = r0     // Catch:{ e -> 0x0148 }
            return
        L_0x010b:
            androidx.media3.exoplayer.cc r10 = r8.f9548h     // Catch:{ e -> 0x0148 }
            int r10 = r8.mo6933eW(r10, r9, r1)     // Catch:{ e -> 0x0148 }
            r11 = -4
            if (r10 != r11) goto L_0x0144
            boolean r10 = r9.mo5954fh(r4)     // Catch:{ e -> 0x0148 }
            if (r10 == 0) goto L_0x011f
            r8.f9549i = r12     // Catch:{ e -> 0x0148 }
            r8.f9551k = r1     // Catch:{ e -> 0x0148 }
            goto L_0x0139
        L_0x011f:
            androidx.media3.exoplayer.cc r10 = r8.f9548h     // Catch:{ e -> 0x0148 }
            androidx.media3.common.x r10 = r10.f8096a     // Catch:{ e -> 0x0148 }
            if (r10 != 0) goto L_0x0126
            return
        L_0x0126:
            long r10 = r10.f7500r     // Catch:{ e -> 0x0148 }
            r9.f10887g = r10     // Catch:{ e -> 0x0148 }
            r9.mo5961d()     // Catch:{ e -> 0x0148 }
            boolean r10 = r8.f9551k     // Catch:{ e -> 0x0148 }
            boolean r11 = r9.mo5954fh(r12)     // Catch:{ e -> 0x0148 }
            r11 = r11 ^ r12
            r10 = r10 & r11
            r8.f9551k = r10     // Catch:{ e -> 0x0148 }
            if (r10 != 0) goto L_0x00e0
        L_0x0139:
            androidx.media3.extractor.j.d r10 = r8.f9554n     // Catch:{ e -> 0x0148 }
            r10.getClass()
            r10.mo5958d(r9)     // Catch:{ e -> 0x0148 }
            r8.f9555o = r3     // Catch:{ e -> 0x0148 }
            goto L_0x00e0
        L_0x0144:
            r9 = -3
            if (r10 != r9) goto L_0x00e0
        L_0x0147:
            return
        L_0x0148:
            r9 = move-exception
            r8.m9337O(r9)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p149i.C3191d.mo6686I(long, long):void");
    }

    /* renamed from: J */
    public final boolean mo6505J() {
        return this.f9550j;
    }

    /* renamed from: K */
    public final boolean mo6506K() {
        return true;
    }

    /* renamed from: L */
    public final int mo6699L(C2680x xVar) {
        String str = xVar.f7496n;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return (xVar.f7483G == 0 ? 4 : 2) | 128;
        } else if (C2598ay.m6816o(xVar.f7496n)) {
            return 129;
        } else {
            return 128;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m9339Q((C2568d) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6527q() {
        this.f9553m = null;
        this.f9546f = -9223372036854775807L;
        m9336N();
        this.f9559s = -9223372036854775807L;
        this.f9560t = -9223372036854775807L;
        m9341S();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6529s(long j, boolean z) {
        this.f9560t = j;
        m9336N();
        this.f9549i = false;
        this.f9550j = false;
        this.f9546f = -9223372036854775807L;
        if (this.f9552l != 0) {
            m9341S();
            m9338P();
            return;
        }
        m9340R();
        C3486d dVar = this.f9554n;
        dVar.getClass();
        dVar.mo5957c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6920w(C2680x[] xVarArr, long j, long j2) {
        this.f9559s = j2;
        this.f9553m = xVarArr[0];
        if (this.f9554n != null) {
            this.f9552l = 1;
        } else {
            m9338P();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r2.equals("text/x-ssa") != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r4.f9554n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        return;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9338P() {
        /*
            r4 = this;
            r0 = 1
            r4.f9551k = r0
            androidx.media3.common.x r1 = r4.f9553m
            r1.getClass()
            java.lang.String r2 = r1.f7496n
            if (r2 == 0) goto L_0x00e7
            int r3 = r2.hashCode()
            switch(r3) {
                case -1351681404: goto L_0x0087;
                case -1248334819: goto L_0x007c;
                case -1026075066: goto L_0x0072;
                case -1004728940: goto L_0x0068;
                case 691401887: goto L_0x005e;
                case 822864842: goto L_0x0055;
                case 930165504: goto L_0x004b;
                case 1201784583: goto L_0x0040;
                case 1566015601: goto L_0x0036;
                case 1566016562: goto L_0x002b;
                case 1668750253: goto L_0x0020;
                case 1693976202: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0092
        L_0x0015:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 3
            goto L_0x0093
        L_0x0020:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 4
            goto L_0x0093
        L_0x002b:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 8
            goto L_0x0093
        L_0x0036:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 6
            goto L_0x0093
        L_0x0040:
            java.lang.String r0 = "text/x-exoplayer-cues"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 11
            goto L_0x0093
        L_0x004b:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 7
            goto L_0x0093
        L_0x0055:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0092
            goto L_0x0093
        L_0x005e:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 5
            goto L_0x0093
        L_0x0068:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 0
            goto L_0x0093
        L_0x0072:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 2
            goto L_0x0093
        L_0x007c:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 10
            goto L_0x0093
        L_0x0087:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 9
            goto L_0x0093
        L_0x0092:
            r0 = -1
        L_0x0093:
            switch(r0) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c5;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00b5;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00a3;
                case 10: goto L_0x009d;
                case 11: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x00e7
        L_0x0097:
            androidx.media3.exoplayer.i.c r0 = new androidx.media3.exoplayer.i.c
            r0.<init>()
            goto L_0x00e4
        L_0x009d:
            androidx.media3.extractor.j.c.b r0 = new androidx.media3.extractor.j.c.b
            r0.<init>()
            goto L_0x00e4
        L_0x00a3:
            androidx.media3.extractor.j.b.a r0 = new androidx.media3.extractor.j.b.a
            java.util.List r1 = r1.f7498p
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00ab:
            androidx.media3.extractor.j.a.h r0 = new androidx.media3.extractor.j.a.h
            int r2 = r1.f7482F
            java.util.List r1 = r1.f7498p
            r0.<init>(r2, r1)
            goto L_0x00e4
        L_0x00b5:
            androidx.media3.extractor.j.a.c r0 = new androidx.media3.extractor.j.a.c
            int r1 = r1.f7482F
            r0.<init>(r2, r1)
            goto L_0x00e4
        L_0x00bd:
            androidx.media3.extractor.j.g.a r0 = new androidx.media3.extractor.j.g.a
            java.util.List r1 = r1.f7498p
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00c5:
            androidx.media3.extractor.j.e.a r0 = new androidx.media3.extractor.j.e.a
            r0.<init>()
            goto L_0x00e4
        L_0x00cb:
            androidx.media3.extractor.j.f.f r0 = new androidx.media3.extractor.j.f.f
            r0.<init>()
            goto L_0x00e4
        L_0x00d1:
            androidx.media3.extractor.j.h.a r0 = new androidx.media3.extractor.j.h.a
            r0.<init>()
            goto L_0x00e4
        L_0x00d7:
            androidx.media3.extractor.j.d.a r0 = new androidx.media3.extractor.j.d.a
            java.util.List r1 = r1.f7498p
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00df:
            androidx.media3.extractor.j.h.l r0 = new androidx.media3.extractor.j.h.l
            r0.<init>()
        L_0x00e4:
            r4.f9554n = r0
            return
        L_0x00e7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p149i.C3191d.m9338P():void");
    }
}
