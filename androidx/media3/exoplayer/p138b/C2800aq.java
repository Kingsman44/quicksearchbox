package androidx.media3.exoplayer.p138b;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2665i;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.common.p136b.C2635w;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2851bu;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.C2876ce;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3187i;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p142e.C2970af;
import androidx.media3.exoplayer.p142e.C2985o;
import androidx.media3.exoplayer.p142e.C2986p;
import androidx.media3.exoplayer.p142e.C2989s;
import androidx.media3.exoplayer.p142e.C2992v;
import androidx.media3.exoplayer.p142e.C2994x;
import androidx.media3.p134c.C2529g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60757n;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.b.aq */
/* compiled from: PG */
public final class C2800aq extends C2992v implements C2876ce {

    /* renamed from: f */
    public final C2820p f7771f;

    /* renamed from: g */
    public boolean f7772g;

    /* renamed from: h */
    public C2851bu f7773h;

    /* renamed from: r */
    private final C2825u f7774r;

    /* renamed from: s */
    private int f7775s;

    /* renamed from: t */
    private C2680x f7776t;

    /* renamed from: u */
    private long f7777u;

    /* renamed from: v */
    private boolean f7778v;

    /* renamed from: w */
    private boolean f7779w;

    public C2800aq(Context context, C2986p pVar, C2994x xVar, Handler handler, C2845bo boVar, C2825u uVar) {
        super(1, xVar, 44100.0f);
        context.getApplicationContext();
        this.f7774r = uVar;
        this.f7771f = new C2820p(handler, boVar);
        ((C2796am) uVar).f7736K = new C2799ap(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        if (r10 != false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0340 A[LOOP:1: B:111:0x032a->B:115:0x0340, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b1  */
    /* renamed from: an */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7685an() {
        /*
            r31 = this;
            r0 = r31
            androidx.media3.exoplayer.b.u r1 = r0.f7774r
            boolean r2 = r31.mo6505J()
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1
            boolean r3 = r1.mo6499q()
            if (r3 == 0) goto L_0x03dc
            boolean r3 = r1.f7766x
            if (r3 == 0) goto L_0x0016
            goto L_0x03dc
        L_0x0016:
            androidx.media3.exoplayer.b.x r3 = r1.f7751i
            android.media.AudioTrack r7 = r3.f7895b
            r7.getClass()
            int r7 = r7.getPlayState()
            r9 = 3
            r10 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 1
            if (r7 != r9) goto L_0x025e
            long r4 = r3.mo6566b()
            long r4 = r3.mo6565a(r4)
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0037
            goto L_0x025e
        L_0x0037:
            long r17 = java.lang.System.nanoTime()
            long r6 = r17 / r12
            long r12 = r3.f7904k
            long r12 = r6 - r12
            r19 = 30000(0x7530, double:1.4822E-319)
            int r21 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0078
            long[] r12 = r3.f7894a
            int r13 = r3.f7913t
            long r19 = r4 - r6
            r12[r13] = r19
            int r13 = r13 + r14
            r12 = 10
            int r13 = r13 % r12
            r3.f7913t = r13
            int r13 = r3.f7914u
            if (r13 >= r12) goto L_0x005c
            int r13 = r13 + r14
            r3.f7914u = r13
        L_0x005c:
            r3.f7904k = r6
            r3.f7903j = r10
            r12 = 0
        L_0x0061:
            int r13 = r3.f7914u
            if (r12 >= r13) goto L_0x0078
            long r10 = r3.f7903j
            long[] r15 = r3.f7894a
            r22 = r15[r12]
            long r8 = (long) r13
            long r22 = r22 / r8
            long r10 = r10 + r22
            r3.f7903j = r10
            int r12 = r12 + 1
            r9 = 3
            r10 = 0
            goto L_0x0061
        L_0x0078:
            androidx.media3.exoplayer.b.w r8 = r3.f7897d
            r8.getClass()
            androidx.media3.exoplayer.b.v r9 = r8.f7883a
            long r10 = r8.f7887e
            long r10 = r6 - r10
            long r12 = r8.f7886d
            r22 = 500000(0x7a120, double:2.47033E-318)
            java.lang.String r15 = "DefaultAudioSink"
            r24 = 5000000(0x4c4b40, double:2.470328E-317)
            int r26 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r26 >= 0) goto L_0x0099
            r28 = r1
            r29 = r2
            r0 = r3
            r1 = r15
            goto L_0x0205
        L_0x0099:
            r8.f7887e = r6
            android.media.AudioTrack r10 = r9.f7878a
            android.media.AudioTimestamp r11 = r9.f7879b
            boolean r10 = r10.getTimestamp(r11)
            if (r10 == 0) goto L_0x00c5
            android.media.AudioTimestamp r11 = r9.f7879b
            long r11 = r11.framePosition
            r26 = r15
            long r14 = r9.f7881d
            int r27 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r27 <= 0) goto L_0x00b9
            long r14 = r9.f7880c
            r27 = 1
            long r14 = r14 + r27
            r9.f7880c = r14
        L_0x00b9:
            r9.f7881d = r11
            long r14 = r9.f7880c
            r27 = 32
            long r14 = r14 << r27
            long r11 = r11 + r14
            r9.f7882e = r11
            goto L_0x00c7
        L_0x00c5:
            r26 = r15
        L_0x00c7:
            int r9 = r8.f7884b
            if (r9 == 0) goto L_0x0104
            r11 = 1
            if (r9 == r11) goto L_0x00ee
            r11 = 2
            if (r9 == r11) goto L_0x00e7
            r12 = 3
            if (r9 == r12) goto L_0x00d7
            if (r10 == 0) goto L_0x00de
            goto L_0x011c
        L_0x00d7:
            if (r10 == 0) goto L_0x00de
            r9 = 0
            r8.mo6564a(r9)
            goto L_0x011c
        L_0x00de:
            r28 = r1
            r29 = r2
            r0 = r3
            r1 = r26
            goto L_0x0205
        L_0x00e7:
            r9 = 0
            if (r10 != 0) goto L_0x011c
            r8.mo6564a(r9)
            goto L_0x00de
        L_0x00ee:
            if (r10 == 0) goto L_0x00ff
            androidx.media3.exoplayer.b.v r9 = r8.f7883a
            long r9 = r9.f7882e
            long r14 = r8.f7888f
            int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x011c
            r9 = 2
            r8.mo6564a(r9)
            goto L_0x011c
        L_0x00ff:
            r10 = 0
            r8.mo6564a(r10)
            goto L_0x00de
        L_0x0104:
            if (r10 == 0) goto L_0x01ee
            androidx.media3.exoplayer.b.v r10 = r8.f7883a
            long r10 = r10.mo6563a()
            long r14 = r8.f7885c
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 < 0) goto L_0x01e6
            androidx.media3.exoplayer.b.v r10 = r8.f7883a
            long r10 = r10.f7882e
            r8.f7888f = r10
            r10 = 1
            r8.mo6564a(r10)
        L_0x011c:
            androidx.media3.exoplayer.b.v r10 = r8.f7883a
            long r10 = r10.mo6563a()
            androidx.media3.exoplayer.b.v r12 = r8.f7883a
            long r14 = r12.f7882e
            long r27 = r10 - r6
            long r27 = java.lang.Math.abs(r27)
            java.lang.String r9 = ", "
            int r16 = (r27 > r24 ? 1 : (r27 == r24 ? 0 : -1))
            if (r16 <= 0) goto L_0x017d
            androidx.media3.exoplayer.b.ai r13 = r3.f7893E
            androidx.media3.exoplayer.b.am r12 = r13.f7717a
            r28 = r1
            long r0 = r12.mo6489g()
            androidx.media3.exoplayer.b.am r12 = r13.f7717a
            long r12 = r12.mo6490h()
            r29 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r30 = r3
            java.lang.String r3 = "Spurious audio timestamp (system clock mismatch): "
            r2.<init>(r3)
            r2.append(r14)
            r2.append(r9)
            r2.append(r10)
            r2.append(r9)
            r2.append(r6)
            r2.append(r9)
            r2.append(r4)
            r2.append(r9)
            r2.append(r0)
            r2.append(r9)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            r1 = r26
            androidx.media3.common.p136b.C2633u.m7050e(r1, r0)
            r0 = 4
            r8.mo6564a(r0)
            goto L_0x0203
        L_0x017d:
            r28 = r1
            r29 = r2
            r0 = r3
            r1 = r26
            long r2 = r0.mo6565a(r14)
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            int r12 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r12 <= 0) goto L_0x01d9
            androidx.media3.exoplayer.b.ai r2 = r0.f7893E
            androidx.media3.exoplayer.b.am r3 = r2.f7717a
            long r12 = r3.mo6489g()
            androidx.media3.exoplayer.b.am r2 = r2.f7717a
            long r2 = r2.mo6490h()
            r30 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r26 = r8
            java.lang.String r8 = "Spurious audio timestamp (frame position mismatch): "
            r0.<init>(r8)
            r0.append(r14)
            r0.append(r9)
            r0.append(r10)
            r0.append(r9)
            r0.append(r6)
            r0.append(r9)
            r0.append(r4)
            r0.append(r9)
            r0.append(r12)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r1, r0)
            r0 = r26
            r2 = 4
            r0.mo6564a(r2)
            goto L_0x0203
        L_0x01d9:
            r30 = r0
            r0 = r8
            r2 = 4
            int r3 = r0.f7884b
            if (r3 != r2) goto L_0x0203
            r2 = 0
            r0.mo6564a(r2)
            goto L_0x0203
        L_0x01e6:
            r28 = r1
            r29 = r2
            r1 = r26
            r0 = r3
            goto L_0x0205
        L_0x01ee:
            r28 = r1
            r29 = r2
            r30 = r3
            r0 = r8
            r1 = r26
            long r2 = r0.f7885c
            long r2 = r6 - r2
            int r4 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r4 <= 0) goto L_0x0203
            r2 = 3
            r0.mo6564a(r2)
        L_0x0203:
            r0 = r30
        L_0x0205:
            boolean r2 = r0.f7908o
            if (r2 == 0) goto L_0x0263
            java.lang.reflect.Method r2 = r0.f7905l
            if (r2 == 0) goto L_0x0263
            long r3 = r0.f7909p
            long r3 = r6 - r3
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 < 0) goto L_0x0263
            android.media.AudioTrack r3 = r0.f7895b     // Catch:{ Exception -> 0x0258 }
            r3.getClass()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0258 }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ Exception -> 0x0258 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0258 }
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ Exception -> 0x0258 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0258 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0258 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r4 = r0.f7900g     // Catch:{ Exception -> 0x0258 }
            long r2 = r2 - r4
            r0.f7906m = r2     // Catch:{ Exception -> 0x0258 }
            r4 = 0
            long r2 = java.lang.Math.max(r2, r4)     // Catch:{ Exception -> 0x0258 }
            r0.f7906m = r2     // Catch:{ Exception -> 0x0258 }
            int r4 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r4 <= 0) goto L_0x025b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0258 }
            r4.<init>()     // Catch:{ Exception -> 0x0258 }
            java.lang.String r5 = "Ignoring impossibly large audio latency: "
            r4.append(r5)     // Catch:{ Exception -> 0x0258 }
            r4.append(r2)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0258 }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r2)     // Catch:{ Exception -> 0x0258 }
            r1 = 0
            r0.f7906m = r1     // Catch:{ Exception -> 0x0258 }
            goto L_0x025b
        L_0x0258:
            r1 = 0
            r0.f7905l = r1
        L_0x025b:
            r0.f7909p = r6
            goto L_0x0263
        L_0x025e:
            r28 = r1
            r29 = r2
            r0 = r3
        L_0x0263:
            long r1 = java.lang.System.nanoTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            androidx.media3.exoplayer.b.w r3 = r0.f7897d
            r3.getClass()
            int r4 = r3.f7884b
            r5 = 2
            if (r4 != r5) goto L_0x0276
            r11 = 1
            goto L_0x0277
        L_0x0276:
            r11 = 0
        L_0x0277:
            if (r11 == 0) goto L_0x0291
            androidx.media3.exoplayer.b.v r4 = r3.f7883a
            long r4 = r4.f7882e
            long r4 = r0.mo6565a(r4)
            androidx.media3.exoplayer.b.v r3 = r3.f7883a
            long r6 = r3.mo6563a()
            long r6 = r1 - r6
            float r3 = r0.f7901h
            long r6 = androidx.media3.common.p136b.C2612ak.m6995t(r6, r3)
            long r4 = r4 + r6
            goto L_0x02ad
        L_0x0291:
            int r3 = r0.f7914u
            if (r3 != 0) goto L_0x029e
            long r3 = r0.mo6566b()
            long r3 = r0.mo6565a(r3)
            goto L_0x02a1
        L_0x029e:
            long r3 = r0.f7903j
            long r3 = r3 + r1
        L_0x02a1:
            r4 = r3
            if (r29 != 0) goto L_0x02ad
            long r6 = r0.f7906m
            long r4 = r4 - r6
            r6 = 0
            long r4 = java.lang.Math.max(r6, r4)
        L_0x02ad:
            boolean r3 = r0.f7890B
            if (r3 == r11) goto L_0x02b9
            long r6 = r0.f7889A
            r0.f7892D = r6
            long r6 = r0.f7919z
            r0.f7891C = r6
        L_0x02b9:
            long r6 = r0.f7892D
            long r6 = r1 - r6
            r8 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x02da
            r12 = 1000(0x3e8, double:4.94E-321)
            long r14 = r6 * r12
            long r14 = r14 / r8
            long r4 = r4 * r14
            long r8 = r12 - r14
            long r14 = r0.f7891C
            float r3 = r0.f7901h
            long r6 = androidx.media3.common.p136b.C2612ak.m6995t(r6, r3)
            long r14 = r14 + r6
            long r8 = r8 * r14
            long r4 = r4 + r8
            long r4 = r4 / r12
        L_0x02da:
            boolean r3 = r0.f7902i
            if (r3 != 0) goto L_0x0314
            long r6 = r0.f7919z
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0314
            r3 = 1
            r0.f7902i = r3
            long r6 = r4 - r6
            long r6 = androidx.media3.common.p136b.C2612ak.m6918A(r6)
            float r3 = r0.f7901h
            long r6 = androidx.media3.common.p136b.C2612ak.m6997v(r6, r3)
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = androidx.media3.common.p136b.C2612ak.m6918A(r6)
            long r8 = r8 - r6
            androidx.media3.exoplayer.b.ai r3 = r0.f7893E
            androidx.media3.exoplayer.b.am r3 = r3.f7717a
            androidx.media3.exoplayer.b.ap r3 = r3.f7736K
            if (r3 == 0) goto L_0x0314
            androidx.media3.exoplayer.b.aq r3 = r3.f7770a
            androidx.media3.exoplayer.b.p r3 = r3.f7771f
            android.os.Handler r6 = r3.f7869a
            if (r6 == 0) goto L_0x0314
            androidx.media3.exoplayer.b.i r7 = new androidx.media3.exoplayer.b.i
            r7.<init>(r3, r8)
            r6.post(r7)
        L_0x0314:
            r0.f7889A = r1
            r0.f7919z = r4
            r0.f7890B = r11
            r1 = r28
            androidx.media3.exoplayer.b.ae r0 = r1.f7757o
            long r2 = r1.mo6490h()
            long r2 = r0.mo6476a(r2)
            long r2 = java.lang.Math.min(r4, r2)
        L_0x032a:
            java.util.ArrayDeque r0 = r1.f7752j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x034b
            java.util.ArrayDeque r0 = r1.f7752j
            java.lang.Object r0 = r0.getFirst()
            androidx.media3.exoplayer.b.ag r0 = (androidx.media3.exoplayer.p138b.C2790ag) r0
            long r4 = r0.f7714d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x034b
            java.util.ArrayDeque r0 = r1.f7752j
            java.lang.Object r0 = r0.remove()
            androidx.media3.exoplayer.b.ag r0 = (androidx.media3.exoplayer.p138b.C2790ag) r0
            r1.f7761s = r0
            goto L_0x032a
        L_0x034b:
            androidx.media3.exoplayer.b.ag r0 = r1.f7761s
            long r4 = r0.f7714d
            long r6 = r2 - r4
            androidx.media3.common.bb r0 = r0.f7711a
            androidx.media3.common.bb r4 = androidx.media3.common.C2640bb.f7312a
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0361
            androidx.media3.exoplayer.b.ag r0 = r1.f7761s
            long r2 = r0.f7713c
            long r2 = r2 + r6
            goto L_0x03cc
        L_0x0361:
            java.util.ArrayDeque r0 = r1.f7752j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03b3
            androidx.media3.exoplayer.b.af r0 = r1.f7735J
            androidx.media3.exoplayer.b.au r0 = r0.f7710c
            long r10 = r0.f7818i
            r2 = 1024(0x400, double:5.06E-321)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x03a0
            long r2 = r0.f7817h
            androidx.media3.exoplayer.b.at r4 = r0.f7816g
            r4.getClass()
            int r5 = r4.f7795g
            int r4 = r4.f7789a
            int r5 = r5 * r4
            int r5 = r5 + r5
            long r4 = (long) r5
            long r8 = r2 - r4
            androidx.media3.exoplayer.b.c r2 = r0.f7814e
            int r2 = r2.f7839b
            androidx.media3.exoplayer.b.c r0 = r0.f7813d
            int r0 = r0.f7839b
            if (r2 != r0) goto L_0x0395
            long r2 = androidx.media3.common.p136b.C2612ak.m7000y(r6, r8, r10)
            goto L_0x03ad
        L_0x0395:
            long r2 = (long) r2
            long r8 = r8 * r2
            long r2 = (long) r0
            long r10 = r10 * r2
            long r2 = androidx.media3.common.p136b.C2612ak.m7000y(r6, r8, r10)
            goto L_0x03ad
        L_0x03a0:
            float r0 = r0.f7811b
            double r2 = (double) r0
            double r4 = (double) r6
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            long r2 = (long) r2
        L_0x03ad:
            androidx.media3.exoplayer.b.ag r0 = r1.f7761s
            long r4 = r0.f7713c
            long r2 = r2 + r4
            goto L_0x03cc
        L_0x03b3:
            java.util.ArrayDeque r0 = r1.f7752j
            java.lang.Object r0 = r0.getFirst()
            androidx.media3.exoplayer.b.ag r0 = (androidx.media3.exoplayer.p138b.C2790ag) r0
            long r4 = r0.f7714d
            androidx.media3.exoplayer.b.ag r6 = r1.f7761s
            androidx.media3.common.bb r6 = r6.f7711a
            float r6 = r6.f7313b
            long r4 = r4 - r2
            long r2 = androidx.media3.common.p136b.C2612ak.m6995t(r4, r6)
            long r4 = r0.f7713c
            long r2 = r4 - r2
        L_0x03cc:
            androidx.media3.exoplayer.b.ae r0 = r1.f7757o
            androidx.media3.exoplayer.b.af r1 = r1.f7735J
            androidx.media3.exoplayer.b.as r1 = r1.f7709b
            long r4 = r1.f7781e
            long r0 = r0.mo6476a(r4)
            long r2 = r2 + r0
            r0 = -9223372036854775808
            goto L_0x03e0
        L_0x03dc:
            r0 = -9223372036854775808
            r2 = -9223372036854775808
        L_0x03e0:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x03f7
            r0 = r31
            boolean r1 = r0.f7772g
            if (r1 == 0) goto L_0x03eb
            goto L_0x03f1
        L_0x03eb:
            long r4 = r0.f7777u
            long r2 = java.lang.Math.max(r4, r2)
        L_0x03f1:
            r0.f7777u = r2
            r1 = 0
            r0.f7772g = r1
            return
        L_0x03f7:
            r0 = r31
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2800aq.m7685an():void");
    }

    /* renamed from: ao */
    private static final int m7686ao(C2989s sVar, C2680x xVar) {
        if ("OMX.google.raw.decoder".equals(sVar.f8587a)) {
            int i = C2612ak.f7249a;
        }
        return xVar.f7497o;
    }

    /* renamed from: ap */
    private static List m7687ap(C2680x xVar, boolean z, C2825u uVar) {
        C2989s b;
        String str = xVar.f7496n;
        if (str == null) {
            return C58485gu.m89845m();
        }
        if (uVar.mo6488f(xVar) && (b = C2970af.m8386b()) != null) {
            return C58485gu.m89846n(b);
        }
        List d = C2970af.m8388d(str, false, false);
        String c = C2970af.m8387c(xVar);
        if (c == null) {
            return C58485gu.m89842j(d);
        }
        List d2 = C2970af.m8388d(c, false, false);
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(d);
        e.mo55396h(d2);
        return e.mo55394f();
    }

    /* renamed from: H */
    public final String mo6504H() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: J */
    public final boolean mo6505J() {
        if (!this.f8643m) {
            return false;
        }
        C2796am amVar = (C2796am) this.f7774r;
        if (amVar.mo6499q()) {
            return amVar.f7728C && !amVar.mo6487e();
        }
        return true;
    }

    /* renamed from: K */
    public final boolean mo6506K() {
        return this.f7774r.mo6487e() || super.mo6506K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final C3187i mo6507M(C2989s sVar, C2680x xVar, C2680x xVar2) {
        int i;
        int i2;
        C3187i b = sVar.mo6903b(xVar, xVar2);
        int i3 = b.f9538e;
        if (m7686ao(sVar, xVar2) > this.f7775s) {
            i3 |= 64;
        }
        String str = sVar.f8587a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f9537d;
            i = 0;
        }
        return new C3187i(str, xVar, xVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final C3187i mo6508N(C2874cc ccVar) {
        C3187i N = super.mo6508N(ccVar);
        C2820p pVar = this.f7771f;
        C2680x xVar = ccVar.f8096a;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2818n(pVar, xVar, N));
        }
        return N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final C2985o mo6509O(C2989s sVar, C2680x xVar, MediaCrypto mediaCrypto, float f) {
        C2680x[] G = mo6931G();
        int ao = m7686ao(sVar, xVar);
        if (r1 != 1) {
            for (C2680x xVar2 : G) {
                if (sVar.mo6903b(xVar, xVar2).f9537d != 0) {
                    ao = Math.max(ao, m7686ao(sVar, xVar2));
                }
            }
        }
        this.f7775s = ao;
        String str = sVar.f8587a;
        int i = C2612ak.f7249a;
        String str2 = sVar.f8589c;
        int i2 = this.f7775s;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", xVar.f7477A);
        mediaFormat.setInteger("sample-rate", xVar.f7478B);
        C2635w.m7054b(mediaFormat, xVar.f7498p);
        C2635w.m7053a(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f7774r.mo6483a(C2612ak.m6924G(4, xVar.f7477A, xVar.f7478B)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (C2612ak.f7249a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        C2680x xVar3 = null;
        if ("audio/raw".equals(sVar.f8588b) && !"audio/raw".equals(xVar.f7496n)) {
            xVar3 = xVar;
        }
        this.f7776t = xVar3;
        return new C2985o(sVar, mediaFormat, xVar, (Surface) null, (MediaCrypto) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo6510P(Exception exc) {
        C2633u.m7048c("MediaCodecAudioRenderer", C2633u.m7046a("Audio codec error", exc));
        C2820p pVar = this.f7771f;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2810f(pVar, exc));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo6511Q(String str) {
        C2820p pVar = this.f7771f;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2817m(pVar, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo6513S() {
        ((C2796am) this.f7774r).f7765w = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo6514T(C2529g gVar) {
        if (this.f7778v && !gVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
            if (Math.abs(gVar.f6957e - this.f7777u) > 500000) {
                this.f7777u = gVar.f6957e;
            }
            this.f7778v = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo6515U() {
        try {
            C2825u uVar = this.f7774r;
            if (!((C2796am) uVar).f7728C && ((C2796am) uVar).mo6499q() && ((C2796am) uVar).mo6498p()) {
                ((C2796am) uVar).mo6494l();
                ((C2796am) uVar).f7728C = true;
            }
        } catch (C2824t e) {
            throw mo6934g(e, e.f7877c, e.f7876b, 5002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final boolean mo6517W(C2680x xVar) {
        return this.f7774r.mo6488f(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final float mo6518X(float f, C2680x[] xVarArr) {
        int i = -1;
        for (C2680x xVar : xVarArr) {
            int i2 = xVar.f7478B;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo6519Y(String str, long j, long j2) {
        C2820p pVar = this.f7771f;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2815k(pVar, str, j, j2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final List mo6520Z(C2680x xVar, boolean z) {
        return C2970af.m8389e(m7687ap(xVar, false, this.f7774r), xVar);
    }

    /* renamed from: a */
    public final long mo6521a() {
        if (this.f8682c == 2) {
            m7685an();
        }
        return this.f7777u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final int mo6522aa(C2680x xVar) {
        boolean z;
        int i = 128;
        if (!C2598ay.m6813l(xVar.f7496n)) {
            return 128;
        }
        int i2 = C2612ak.f7249a;
        int i3 = xVar.f7483G;
        boolean al = m8470al(xVar);
        if (al && this.f7774r.mo6488f(xVar) && (i3 == 0 || C2970af.m8386b() != null)) {
            return 172;
        }
        if (("audio/raw".equals(xVar.f7496n) && !this.f7774r.mo6488f(xVar)) || !this.f7774r.mo6488f(C2612ak.m6924G(2, xVar.f7477A, xVar.f7478B))) {
            return 129;
        }
        List ap = m7687ap(xVar, false, this.f7774r);
        if (ap.isEmpty()) {
            return 129;
        }
        if (!al) {
            return 130;
        }
        C2989s sVar = (C2989s) ap.get(0);
        boolean c = sVar.mo6904c(xVar);
        if (!c) {
            int i4 = 1;
            while (true) {
                if (i4 >= ap.size()) {
                    break;
                }
                C2989s sVar2 = (C2989s) ap.get(i4);
                if (sVar2.mo6904c(xVar)) {
                    sVar = sVar2;
                    z = false;
                    c = true;
                    break;
                }
                i4++;
            }
        }
        z = true;
        int i5 = true != c ? 3 : 4;
        int i6 = 8;
        if (c && sVar.mo6905d(xVar)) {
            i6 = 16;
        }
        int i7 = true != sVar.f8593g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        return i7 | i5 | i6 | 32 | i;
    }

    /* renamed from: b */
    public final C2640bb mo6523b() {
        return ((C2796am) this.f7774r).mo6492j().f7711a;
    }

    /* renamed from: c */
    public final void mo6524c(C2640bb bbVar) {
        C2796am amVar = (C2796am) this.f7774r;
        amVar.mo6496n(new C2640bb(C2612ak.m6944a(bbVar.f7313b, 0.1f, 8.0f), C2612ak.m6944a(bbVar.f7314c, 0.1f, 8.0f)), amVar.mo6492j().f7712b);
    }

    /* renamed from: i */
    public final C2876ce mo6525i() {
        return this;
    }

    /* renamed from: n */
    public final void mo6526n(int i, Object obj) {
        if (i == 2) {
            C2825u uVar = this.f7774r;
            float floatValue = ((Float) obj).floatValue();
            C2796am amVar = (C2796am) uVar;
            if (amVar.f7768z != floatValue) {
                amVar.f7768z = floatValue;
                amVar.mo6497o();
            }
        } else if (i == 3) {
            C2664h hVar = (C2664h) obj;
            C2796am amVar2 = (C2796am) this.f7774r;
            if (!amVar2.f7759q.equals(hVar)) {
                amVar2.f7759q = hVar;
                amVar2.mo6484b();
            }
        } else if (i != 6) {
            switch (i) {
                case 9:
                    C2825u uVar2 = this.f7774r;
                    C2796am amVar3 = (C2796am) uVar2;
                    amVar3.mo6496n(amVar3.mo6492j().f7711a, ((Boolean) obj).booleanValue());
                    return;
                case 10:
                    C2825u uVar3 = this.f7774r;
                    int intValue = ((Integer) obj).intValue();
                    C2796am amVar4 = (C2796am) uVar3;
                    if (amVar4.f7730E != intValue) {
                        amVar4.f7730E = intValue;
                        amVar4.mo6484b();
                        return;
                    }
                    return;
                case 11:
                    this.f7773h = (C2851bu) obj;
                    return;
                default:
                    return;
            }
        } else {
            C2665i iVar = (C2665i) obj;
            C2796am amVar5 = (C2796am) this.f7774r;
            if (!amVar5.f7731F.equals(iVar)) {
                int i2 = iVar.f7425a;
                float f = iVar.f7426b;
                if (amVar5.f7758p != null) {
                    int i3 = amVar5.f7731F.f7425a;
                }
                amVar5.f7731F = iVar;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6527q() {
        this.f7779w = true;
        try {
            this.f7774r.mo6484b();
            try {
                super.mo6527q();
            } finally {
                this.f7771f.mo6562a(this.f8646p);
            }
        } catch (Throwable th) {
            super.mo6527q();
            throw th;
        } finally {
            this.f7771f.mo6562a(this.f8646p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo6528r(boolean z, boolean z2) {
        super.mo6528r(z, z2);
        C2820p pVar = this.f7771f;
        C3004h hVar = this.f8646p;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2812h(pVar, hVar));
        }
        this.f8680a.getClass();
        C2825u uVar = this.f7774r;
        C2731bt btVar = this.f8681b;
        btVar.getClass();
        ((C2796am) uVar).f7755m = btVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6529s(long j, boolean z) {
        super.mo6529s(j, z);
        this.f7774r.mo6484b();
        this.f7777u = j;
        this.f7778v = true;
        this.f7772g = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo6530t() {
        try {
            super.mo6530t();
            if (this.f7779w) {
                this.f7779w = false;
                this.f7774r.mo6486d();
            }
        } catch (Throwable th) {
            if (this.f7779w) {
                this.f7779w = false;
                this.f7774r.mo6486d();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6531u() {
        this.f7774r.mo6485c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo6532v() {
        m7685an();
        C2796am amVar = (C2796am) this.f7774r;
        amVar.f7729D = false;
        if (amVar.mo6499q()) {
            C2828x xVar = amVar.f7751i;
            xVar.mo6567c();
            if (xVar.f7915v == -9223372036854775807L) {
                C2827w wVar = xVar.f7897d;
                wVar.getClass();
                wVar.mo6564a(0);
                amVar.f7758p.pause();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2800aq(android.content.Context r11, androidx.media3.exoplayer.p142e.C2994x r12, android.os.Handler r13, androidx.media3.exoplayer.C2845bo r14) {
        /*
            r10 = this;
            androidx.media3.exoplayer.b.b r0 = androidx.media3.exoplayer.p138b.C2806b.f7833a
            r1 = 0
            androidx.media3.exoplayer.b.e[] r1 = new androidx.media3.exoplayer.p138b.C2809e[r1]
            androidx.media3.exoplayer.b.ad r2 = new androidx.media3.exoplayer.b.ad
            r2.<init>()
            androidx.media3.exoplayer.b.b r3 = androidx.media3.exoplayer.p138b.C2806b.f7833a
            java.lang.Object r0 = com.google.common.base.C58831av.m90830c(r0, r3)
            androidx.media3.exoplayer.b.b r0 = (androidx.media3.exoplayer.p138b.C2806b) r0
            r2.f7696a = r0
            androidx.media3.exoplayer.b.af r0 = new androidx.media3.exoplayer.b.af
            r0.<init>(r1)
            r2.f7698c = r0
            androidx.media3.exoplayer.b.am r9 = r2.mo6475a()
            androidx.media3.exoplayer.e.p r5 = androidx.media3.exoplayer.p142e.C2986p.f8585c
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2800aq.<init>(android.content.Context, androidx.media3.exoplayer.e.x, android.os.Handler, androidx.media3.exoplayer.bo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo6512R(C2680x xVar, MediaFormat mediaFormat) {
        C2680x xVar2;
        C2809e[] eVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int f;
        int i8;
        C2680x xVar3 = xVar;
        MediaFormat mediaFormat2 = mediaFormat;
        C2680x xVar4 = this.f7776t;
        if (xVar4 != null) {
            xVar2 = xVar4;
        } else {
            if (this.f8640j != null) {
                if ("audio/raw".equals(xVar3.f7496n)) {
                    i8 = xVar3.f7479C;
                } else {
                    int i9 = C2612ak.f7249a;
                    if (mediaFormat2.containsKey("pcm-encoding")) {
                        i8 = mediaFormat2.getInteger("pcm-encoding");
                    } else {
                        i8 = mediaFormat2.containsKey("v-bits-per-sample") ? C2612ak.m6988m(mediaFormat2.getInteger("v-bits-per-sample")) : 2;
                    }
                }
                C2679w wVar = new C2679w();
                wVar.f7459k = "audio/raw";
                wVar.f7474z = i8;
                wVar.f7445A = xVar3.f7480D;
                wVar.f7446B = xVar3.f7481E;
                wVar.f7472x = mediaFormat2.getInteger("channel-count");
                wVar.f7473y = mediaFormat2.getInteger("sample-rate");
                xVar3 = new C2680x(wVar);
            }
            xVar2 = xVar3;
        }
        try {
            C2825u uVar = this.f7774r;
            if ("audio/raw".equals(xVar2.f7496n)) {
                C2601a.m6830b(C2612ak.m6956af(xVar2.f7479C));
                i6 = C2612ak.m6989n(xVar2.f7479C, xVar2.f7477A);
                int i10 = xVar2.f7479C;
                C2809e[] eVarArr2 = ((C2796am) uVar).f7749g;
                C2805av avVar = ((C2796am) uVar).f7748f;
                int i11 = xVar2.f7480D;
                int i12 = xVar2.f7481E;
                avVar.f7826d = i11;
                avVar.f7827e = i12;
                ((C2796am) uVar).f7747e.f7926d = null;
                C2807c cVar = new C2807c(xVar2.f7478B, xVar2.f7477A, xVar2.f7479C);
                for (C2809e eVar : eVarArr2) {
                    C2807c a = eVar.mo6540a(cVar);
                    if (true == eVar.mo6533g()) {
                        cVar = a;
                    }
                }
                i5 = cVar.f7841d;
                int i13 = cVar.f7839b;
                int i14 = cVar.f7840c;
                eVarArr = eVarArr2;
                i2 = i13;
                i = C2612ak.m6983h(i14);
                i4 = 0;
                i3 = C2612ak.m6989n(i5, i14);
            } else {
                C2809e[] eVarArr3 = new C2809e[0];
                int i15 = xVar2.f7478B;
                int i16 = C2612ak.f7249a;
                Pair a2 = ((C2796am) uVar).f7746d.mo6546a(xVar2);
                if (a2 != null) {
                    int intValue = ((Integer) a2.first).intValue();
                    eVarArr = eVarArr3;
                    i2 = i15;
                    i = ((Integer) a2.second).intValue();
                    i5 = intValue;
                    i6 = -1;
                    i4 = 2;
                    i3 = -1;
                } else {
                    throw new C2821q("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(xVar2))), xVar2);
                }
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i2, i, i5);
            C2601a.m6832d(minBufferSize != -2);
            int i17 = 250000;
            if (i4 == 0) {
                i7 = i6;
                f = C2612ak.m6981f(minBufferSize * 4, C2797an.m7678a(250000, i2, i3), C2797an.m7678a(750000, i2, i3));
            } else if (i4 != 1) {
                int i18 = 5;
                if (i5 == 5) {
                    i17 = 500000;
                    i7 = i6;
                    i5 = 5;
                } else {
                    i7 = i6;
                    i18 = i5;
                }
                long j = (long) i17;
                int b = C2797an.m7679b(i5);
                i5 = i18;
                f = C60757n.m92740a((j * ((long) b)) / 1000000);
            } else {
                i7 = i6;
                f = C60757n.m92740a((((long) C2797an.m7679b(i5)) * 50000000) / 1000000);
            }
            int i19 = i5;
            int max = (((Math.max(minBufferSize, (int) ((double) f)) + i3) - 1) / i3) * i3;
            if (i19 == 0) {
                throw new C2821q("Invalid output encoding (mode=" + i4 + ") for: " + String.valueOf(xVar2), xVar2);
            } else if (i != 0) {
                ((C2796am) uVar).f7733H = false;
                C2788ae aeVar = new C2788ae(xVar2, i7, i4, i3, i2, i, i19, max, eVarArr);
                if (((C2796am) uVar).mo6499q()) {
                    ((C2796am) uVar).f7756n = aeVar;
                } else {
                    ((C2796am) uVar).f7757o = aeVar;
                }
            } else {
                throw new C2821q("Invalid output channel config (mode=" + i4 + ") for: " + String.valueOf(xVar2), xVar2);
            }
        } catch (C2808d e) {
            throw new C2821q((Throwable) e, xVar2);
        } catch (C2821q e2) {
            throw mo6934g(e2, e2.f7871a, false, 5001);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0265, code lost:
        ((androidx.media3.exoplayer.p138b.C2796am) r9).f7754l.mo6479a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d3, code lost:
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05da, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05db, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05e6, code lost:
        throw r1.mo6934g(r2, r40, r2.f7876b, 5002);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r12 = ((androidx.media3.exoplayer.p138b.C2796am) r9).f7757o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        if (r12.f7706h > 1000000) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r16 = new androidx.media3.exoplayer.p138b.C2788ae(r12.f7699a, r12.f7700b, r12.f7701c, r12.f7702d, r12.f7703e, r12.f7704f, r12.f7705g, 1000000, r12.f7707i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1 = ((androidx.media3.exoplayer.p138b.C2796am) r9).mo6491i(r16);
        ((androidx.media3.exoplayer.p138b.C2796am) r9).f7757o = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014a, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", new java.lang.Class[]{java.lang.Throwable.class}).invoke(r10, new java.lang.Object[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0252, code lost:
        if (((androidx.media3.exoplayer.p138b.C2796am) r9).f7757o.mo6478c() != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0254, code lost:
        ((androidx.media3.exoplayer.p138b.C2796am) r9).f7733H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025a, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0260, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0263, code lost:
        if (r1.f7873b == false) goto L_0x0265;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x027d A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02dc A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0305 A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0568 A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[Catch:{ r -> 0x05e7, t -> 0x05da }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x057b A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0589 A[Catch:{ r -> 0x05d6, t -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05d2 A[ExcHandler: t (e androidx.media3.exoplayer.b.t), Splitter:B:46:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05da A[ExcHandler: t (e androidx.media3.exoplayer.b.t), Splitter:B:11:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0254 A[Catch:{ r -> 0x0106, t -> 0x05da, r -> 0x025f, t -> 0x05d2 }] */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6516V(long r27, long r29, androidx.media3.exoplayer.p142e.C2987q r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, androidx.media3.common.C2680x r40) {
        /*
            r26 = this;
            r1 = r26
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r6 = r36
            java.lang.String r8 = "Unexpected audio encoding: "
            r32.getClass()
            androidx.media3.common.x r9 = r1.f7776t
            r10 = 1
            if (r9 == 0) goto L_0x0021
            r9 = r34 & 2
            if (r9 == 0) goto L_0x0021
            r31.getClass()
            r2.mo6882p(r4)
            return r10
        L_0x0021:
            if (r38 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x0028
            r2.mo6882p(r4)
        L_0x0028:
            androidx.media3.exoplayer.h r2 = r1.f8646p
            int r3 = r2.f8699f
            int r3 = r3 + r5
            r2.f8699f = r3
            androidx.media3.exoplayer.b.u r2 = r1.f7774r
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2
            r2.f7765w = r10
            return r10
        L_0x0036:
            androidx.media3.exoplayer.b.u r9 = r1.f7774r     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r11 = r9
            androidx.media3.exoplayer.b.am r11 = (androidx.media3.exoplayer.p138b.C2796am) r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            java.nio.ByteBuffer r11 = r11.f7726A     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r11 == 0) goto L_0x0044
            if (r3 != r11) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r11 = 0
            goto L_0x0045
        L_0x0044:
            r11 = 1
        L_0x0045:
            androidx.media3.common.p136b.C2601a.m6830b(r11)     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r11 = r9
            androidx.media3.exoplayer.b.am r11 = (androidx.media3.exoplayer.p138b.C2796am) r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            androidx.media3.exoplayer.b.ae r11 = r11.f7756n     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r13 = 3
            r14 = 0
            if (r11 == 0) goto L_0x00e2
            r11 = r9
            androidx.media3.exoplayer.b.am r11 = (androidx.media3.exoplayer.p138b.C2796am) r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            boolean r11 = r11.mo6498p()     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r11 != 0) goto L_0x005d
        L_0x005a:
            r2 = 0
            goto L_0x05d1
        L_0x005d:
            r11 = r9
            androidx.media3.exoplayer.b.am r11 = (androidx.media3.exoplayer.p138b.C2796am) r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            androidx.media3.exoplayer.b.ae r11 = r11.f7756n     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r15 = r9
            androidx.media3.exoplayer.b.am r15 = (androidx.media3.exoplayer.p138b.C2796am) r15     // Catch:{ r -> 0x05e7, t -> 0x05da }
            androidx.media3.exoplayer.b.ae r15 = r15.f7757o     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r15.f7701c     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r10 = r11.f7701c     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r12 != r10) goto L_0x00c7
            int r10 = r15.f7705g     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r11.f7705g     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != r12) goto L_0x00c7
            int r10 = r15.f7703e     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r11.f7703e     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != r12) goto L_0x00c7
            int r10 = r15.f7704f     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r11.f7704f     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != r12) goto L_0x00c7
            int r10 = r15.f7702d     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r11.f7702d     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != r12) goto L_0x00c7
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.f7757o = r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.f7756n = r14     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            android.media.AudioTrack r10 = r10.f7758p     // Catch:{ r -> 0x05e7, t -> 0x05da }
            boolean r10 = androidx.media3.exoplayer.p138b.C2796am.m7657r(r10)     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 == 0) goto L_0x00dc
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            android.media.AudioTrack r10 = r10.f7758p     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r10 = r10.getPlayState()     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != r13) goto L_0x00ad
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            android.media.AudioTrack r10 = r10.f7758p     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.setOffloadEndOfStream()     // Catch:{ r -> 0x05e7, t -> 0x05da }
        L_0x00ad:
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            android.media.AudioTrack r10 = r10.f7758p     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r11 = r9
            androidx.media3.exoplayer.b.am r11 = (androidx.media3.exoplayer.p138b.C2796am) r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            androidx.media3.exoplayer.b.ae r11 = r11.f7757o     // Catch:{ r -> 0x05e7, t -> 0x05da }
            androidx.media3.common.x r11 = r11.f7699a     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r12 = r11.f7480D     // Catch:{ r -> 0x05e7, t -> 0x05da }
            int r11 = r11.f7481E     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.setOffloadDelayPadding(r12, r11)     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r11 = 1
            r10.f7734I = r11     // Catch:{ r -> 0x05e7, t -> 0x05da }
            goto L_0x00dc
        L_0x00c7:
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.mo6494l()     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            boolean r10 = r10.mo6487e()     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != 0) goto L_0x005a
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.mo6484b()     // Catch:{ r -> 0x05e7, t -> 0x05da }
        L_0x00dc:
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            r10.mo6493k(r6)     // Catch:{ r -> 0x05e7, t -> 0x05da }
        L_0x00e2:
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x05e7, t -> 0x05da }
            boolean r10 = r10.mo6499q()     // Catch:{ r -> 0x05e7, t -> 0x05da }
            if (r10 != 0) goto L_0x026e
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.common.b.g r10 = r10.f7750h     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            boolean r10 = r10.mo6191c()     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r10 == 0) goto L_0x025b
            r10 = r9
            androidx.media3.exoplayer.b.am r10 = (androidx.media3.exoplayer.p138b.C2796am) r10     // Catch:{ r -> 0x0106, t -> 0x05da }
            androidx.media3.exoplayer.b.ae r10 = r10.f7757o     // Catch:{ r -> 0x0106, t -> 0x05da }
            r10.getClass()
            r12 = r9
            androidx.media3.exoplayer.b.am r12 = (androidx.media3.exoplayer.p138b.C2796am) r12     // Catch:{ r -> 0x0106, t -> 0x05da }
            android.media.AudioTrack r10 = r12.mo6491i(r10)     // Catch:{ r -> 0x0106, t -> 0x05da }
            goto L_0x014b
        L_0x0106:
            r0 = move-exception
            r10 = r0
            r12 = r9
            androidx.media3.exoplayer.b.am r12 = (androidx.media3.exoplayer.p138b.C2796am) r12     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r12 = r12.f7757o     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r15 = r12.f7706h     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r15 <= r13) goto L_0x0249
            androidx.media3.exoplayer.b.ae r13 = new androidx.media3.exoplayer.b.ae     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.common.x r14 = r12.f7699a     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r15 = r12.f7700b     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r11 = r12.f7701c     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r1 = r12.f7702d     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r4 = r12.f7703e     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r2 = r12.f7704f     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r5 = r12.f7705g     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r24 = 1000000(0xf4240, float:1.401298E-39)
            androidx.media3.exoplayer.b.e[] r12 = r12.f7707i     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r16 = r13
            r17 = r14
            r18 = r15
            r19 = r11
            r20 = r1
            r21 = r4
            r22 = r2
            r23 = r5
            r25 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x022f, t -> 0x05d2 }
            android.media.AudioTrack r1 = r1.mo6491i(r13)     // Catch:{ r -> 0x022f, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x022f, t -> 0x05d2 }
            r2.f7757o = r13     // Catch:{ r -> 0x022f, t -> 0x05d2 }
            r10 = r1
        L_0x014b:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7758p = r10     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r1 = r1.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            boolean r1 = androidx.media3.exoplayer.p138b.C2796am.m7657r(r1)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r1 == 0) goto L_0x019b
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r1 = r1.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.al r2 = r2.f7753k     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r2 != 0) goto L_0x0174
            androidx.media3.exoplayer.b.al r2 = new androidx.media3.exoplayer.b.al     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2.<init>(r4)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r4.f7753k = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
        L_0x0174:
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.al r2 = r2.f7753k     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.os.Handler r4 = r2.f7720a     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.aj r5 = new androidx.media3.exoplayer.b.aj     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r5.<init>(r4)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack$StreamEventCallback r2 = r2.f7721b     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.registerStreamEventCallback(r5, r2)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r1 = r1.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r2 = r2.f7757o     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.common.x r2 = r2.f7699a     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r4 = r2.f7480D     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r2 = r2.f7481E     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.setOffloadDelayPadding(r4, r2)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
        L_0x019b:
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 31
            if (r1 < r2) goto L_0x01b0
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.a.bt r1 = r1.f7755m     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r1 == 0) goto L_0x01b0
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r2 = r2.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.p138b.C2785ab.m7651a(r2, r1)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
        L_0x01b0:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r1 = r1.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r1 = r1.getAudioSessionId()     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2.f7730E = r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.x r1 = r1.f7751i     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            android.media.AudioTrack r2 = r2.f7758p     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r4 = r4.f7757o     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r5 = r4.f7701c     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r5 = r4.f7705g     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r10 = r4.f7702d     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r4 = r4.f7706h     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7895b = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7896c = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.w r11 = new androidx.media3.exoplayer.b.w     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r11.<init>(r2)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7897d = r11     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r2 = r2.getSampleRate()     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7898e = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 0
            r1.f7899f = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            boolean r2 = androidx.media3.common.p136b.C2612ak.m6956af(r5)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7908o = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r2 == 0) goto L_0x01f8
            int r4 = r4 / r10
            long r4 = (long) r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            long r4 = r1.mo6565a(r4)     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            goto L_0x01fd
        L_0x01f8:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01fd:
            r1.f7900g = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r4 = 0
            r1.f7910q = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7911r = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7912s = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 0
            r1.f7907n = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f7915v = r10     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7916w = r10     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7909p = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.f7906m = r4     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f7901h = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1.mo6497o()     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.common.i r1 = r1.f7731F     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            int r1 = r1.f7425a     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 1
            r1.f7766x = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            goto L_0x026e
        L_0x022f:
            r0 = move-exception
            r1 = r0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0249 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x0249 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0249 }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0249 }
            r5[r4] = r1     // Catch:{ Exception -> 0x0249 }
            r2.invoke(r10, r5)     // Catch:{ Exception -> 0x0249 }
        L_0x0249:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r1 = r1.f7757o     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            boolean r1 = r1.mo6478c()     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            if (r1 == 0) goto L_0x025a
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x025f, t -> 0x05d2 }
            r2 = 1
            r1.f7733H = r2     // Catch:{ r -> 0x025f, t -> 0x05d2 }
        L_0x025a:
            throw r10     // Catch:{ r -> 0x025f, t -> 0x05d2 }
        L_0x025b:
            r1 = r26
            goto L_0x005a
        L_0x025f:
            r0 = move-exception
            r1 = r0
            boolean r2 = r1.f7873b     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r2 != 0) goto L_0x026d
            androidx.media3.exoplayer.b.am r9 = (androidx.media3.exoplayer.p138b.C2796am) r9     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ah r2 = r9.f7754l     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.mo6479a(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x025b
        L_0x026d:
            throw r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x026e:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ah r1 = r1.f7754l     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = 0
            r1.f7715a = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r1 = r1.f7766x     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x02a6
            r1 = 0
            long r4 = java.lang.Math.max(r1, r6)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.f7767y = r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = 0
            r1.f7765w = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.f7766x = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.mo6493k(r6)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r1 = r1.f7729D     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x02a6
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.mo6485c()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x02a6:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.x r1 = r1.f7751i     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r2.mo6490h()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            android.media.AudioTrack r2 = r1.f7895b     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.getClass()
            int r2 = r2.getPlayState()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r10 = r1.f7899f     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r10 = r1.f7907n     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r4 = r1.mo6568d(r4)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.f7907n = r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r10 == 0) goto L_0x02fe
            if (r4 != 0) goto L_0x02fe
            r4 = 1
            if (r2 == r4) goto L_0x02fe
            androidx.media3.exoplayer.b.ai r2 = r1.f7893E     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r1.f7896c     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r10 = r1.f7900g     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r19 = androidx.media3.common.p136b.C2612ak.m6918A(r10)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.am r1 = r2.f7717a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ap r1 = r1.f7736K     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x02fe
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.am r1 = r2.f7717a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r12 = r1.f7732G     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r21 = r10 - r12
            androidx.media3.exoplayer.b.ap r1 = r1.f7736K     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.aq r1 = r1.f7770a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.p r1 = r1.f7771f     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            android.os.Handler r2 = r1.f7869a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r2 == 0) goto L_0x02fe
            androidx.media3.exoplayer.b.o r5 = new androidx.media3.exoplayer.b.o     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r16 = r5
            r17 = r1
            r18 = r4
            r16.<init>(r17, r18, r19, r21)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.post(r5)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x02fe:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            java.nio.ByteBuffer r1 = r1.f7726A     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 != 0) goto L_0x0568
            java.nio.ByteOrder r1 = r32.order()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 != r2) goto L_0x030f
            r1 = 1
            goto L_0x0310
        L_0x030f:
            r1 = 0
        L_0x0310:
            androidx.media3.common.p136b.C2601a.m6830b(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r1 = r32.hasRemaining()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 != 0) goto L_0x031f
        L_0x0319:
            r1 = r31
            r8 = r35
            goto L_0x05c0
        L_0x031f:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r1 = r1.f7757o     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r2 = r1.f7701c     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r2 == 0) goto L_0x0488
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r2 = r2.f7764v     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r2 != 0) goto L_0x0488
            int r1 = r1.f7705g     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = -2
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 16
            r10 = -1
            switch(r1) {
                case 5: goto L_0x0433;
                case 6: goto L_0x0433;
                case 7: goto L_0x03cd;
                case 8: goto L_0x03cd;
                case 9: goto L_0x03b7;
                case 10: goto L_0x03b3;
                case 11: goto L_0x03af;
                case 12: goto L_0x03af;
                case 13: goto L_0x033a;
                case 14: goto L_0x035d;
                case 15: goto L_0x0359;
                case 16: goto L_0x03b3;
                case 17: goto L_0x033e;
                case 18: goto L_0x0433;
                default: goto L_0x033a;
            }     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x033a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x0478
        L_0x033e:
            int r1 = androidx.media3.extractor.C3387e.f10256a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            byte[] r1 = new byte[r5]     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r2 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r3.position(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.common.b.ab r2 = new androidx.media3.common.b.ab     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.<init>(r1, r5)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.extractor.d r1 = androidx.media3.extractor.C3387e.m9794a(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1.f10225c     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x0470
        L_0x0359:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x0470
        L_0x035d:
            int[] r1 = androidx.media3.extractor.C3375c.f10200a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r32.limit()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r4 + -10
            r8 = r1
        L_0x036a:
            if (r8 > r4) goto L_0x037d
            int r11 = r8 + 4
            int r11 = androidx.media3.common.p136b.C2612ak.m6984i(r3, r11)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r11 = r11 & r2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r11 != r12) goto L_0x037a
            int r8 = r8 - r1
            goto L_0x037e
        L_0x037a:
            int r8 = r8 + 1
            goto L_0x036a
        L_0x037d:
            r8 = -1
        L_0x037e:
            if (r8 != r10) goto L_0x0383
            r1 = 0
            goto L_0x0470
        L_0x0383:
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 + r8
            int r1 = r1 + 7
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r2 = r2 + r8
            r4 = 187(0xbb, float:2.62E-43)
            if (r1 != r4) goto L_0x039c
            r1 = 9
            goto L_0x039e
        L_0x039c:
            r1 = 8
        L_0x039e:
            int r2 = r2 + r1
            byte r1 = r3.get(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 >> 4
            r1 = r1 & 7
            r2 = 40
            int r1 = r2 << r1
            int r1 = r1 * 16
            goto L_0x0470
        L_0x03af:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0470
        L_0x03b3:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0470
        L_0x03b7:
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = androidx.media3.common.p136b.C2612ak.m6984i(r3, r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = androidx.media3.extractor.C3344as.m9690c(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == r10) goto L_0x03c7
            goto L_0x0470
        L_0x03c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.<init>()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            throw r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x03cd:
            int[] r1 = androidx.media3.extractor.C3634x.f11580a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            byte r4 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r4 == r2) goto L_0x041a
            if (r4 == r10) goto L_0x0403
            r2 = 31
            if (r4 == r2) goto L_0x03f2
            int r2 = r1 + 4
            byte r2 = r3.get(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = 1
            r2 = r2 & r4
            int r2 = r2 << 6
            int r1 = r1 + 5
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 252(0xfc, float:3.53E-43)
            goto L_0x0415
        L_0x03f2:
            int r2 = r1 + 5
            byte r2 = r3.get(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = r2 & 7
            int r2 = r2 << 4
            int r1 = r1 + 6
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x0413
        L_0x0403:
            int r2 = r1 + 4
            byte r2 = r3.get(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = r2 & 7
            int r2 = r2 << 4
            int r1 = r1 + 7
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x0413:
            r1 = r1 & 60
        L_0x0415:
            int r1 = r1 >> 2
            r1 = r1 | r2
            r4 = 1
            goto L_0x042f
        L_0x041a:
            int r2 = r1 + 5
            byte r2 = r3.get(r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = 1
            r2 = r2 & r4
            int r2 = r2 << 6
            int r1 = r1 + 4
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 252(0xfc, float:3.53E-43)
            int r1 = r1 >> 2
            r1 = r1 | r2
        L_0x042f:
            int r1 = r1 + r4
            int r1 = r1 * 32
            goto L_0x0470
        L_0x0433:
            int[] r1 = androidx.media3.extractor.C3375c.f10200a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 + 5
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 248(0xf8, float:3.48E-43)
            r2 = 3
            int r1 = r1 >> r2
            r4 = 10
            if (r1 <= r4) goto L_0x046e
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 + 4
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            if (r1 != r2) goto L_0x0459
            r13 = 3
            goto L_0x0467
        L_0x0459:
            int r1 = r32.position()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 + 4
            byte r1 = r3.get(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1 & 48
            int r13 = r1 >> 4
        L_0x0467:
            int[] r1 = androidx.media3.extractor.C3375c.f10200a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r1[r13]     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1 * 256
            goto L_0x0470
        L_0x046e:
            r1 = 1536(0x600, float:2.152E-42)
        L_0x0470:
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.f7764v = r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x0319
            goto L_0x0488
        L_0x0478:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r3.<init>(r8)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r3.append(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            java.lang.String r1 = r3.toString()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2.<init>(r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            throw r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x0488:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ag r1 = r1.f7760r     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x04a4
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r1 = r1.mo6498p()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 == 0) goto L_0x025b
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.mo6493k(r6)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = 0
            r1.f7760r = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x04a4:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r1 = r1.f7767y     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r4 = r4.f7757o     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r5 = r9
            androidx.media3.exoplayer.b.am r5 = (androidx.media3.exoplayer.p138b.C2796am) r5     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r10 = r5.mo6489g()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r5 = r9
            androidx.media3.exoplayer.b.am r5 = (androidx.media3.exoplayer.p138b.C2796am) r5     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.av r5 = r5.f7748f     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r12 = r5.f7828f     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r10 = r10 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r12
            androidx.media3.common.x r4 = r4.f7699a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r4.f7478B     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = (long) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r10 = r10 / r4
            long r1 = r1 + r10
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r4 = r4.f7765w     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r4 != 0) goto L_0x04f0
            long r4 = r1 - r6
            long r4 = java.lang.Math.abs(r4)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r10 = 200000(0x30d40, double:9.8813E-319)
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x04f0
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ap r4 = r4.f7736K     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.s r5 = new androidx.media3.exoplayer.b.s     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r5.<init>(r6, r1)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4.mo6502a(r5)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r5 = 1
            r4.f7765w = r5     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x04f0:
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r4 = r4.f7765w     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r4 == 0) goto L_0x052b
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r4 = r4.mo6498p()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r4 == 0) goto L_0x025b
            long r1 = r6 - r1
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r4.f7767y     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r4 + r1
            r8 = r9
            androidx.media3.exoplayer.b.am r8 = (androidx.media3.exoplayer.p138b.C2796am) r8     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r8.f7767y = r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r5 = 0
            r4.f7765w = r5     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4.mo6493k(r6)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ap r4 = r4.f7736K     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r4 == 0) goto L_0x052b
            r10 = 0
            int r5 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x052b
            androidx.media3.exoplayer.b.aq r1 = r4.f7770a     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = 1
            r1.f7772g = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x052b:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.ae r1 = r1.f7757o     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r1 = r1.f7701c     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 != 0) goto L_0x0547
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r1 = r1.f7762t     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r32.remaining()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = (long) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r1 = r1 + r4
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4.f7762t = r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r8 = r35
            goto L_0x055d
        L_0x0547:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r1 = r1.f7763u     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            int r4 = r4.f7764v     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = (long) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r8 = r35
            long r10 = (long) r8     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r4 * r10
            long r1 = r1 + r4
            r4 = r9
            androidx.media3.exoplayer.b.am r4 = (androidx.media3.exoplayer.p138b.C2796am) r4     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r4.f7763u = r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x055d:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.f7726A = r3     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.f7727B = r8     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x056a
        L_0x0568:
            r8 = r35
        L_0x056a:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1.mo6495m(r6)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            java.nio.ByteBuffer r1 = r1.f7726A     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            boolean r1 = r1.hasRemaining()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            if (r1 != 0) goto L_0x0589
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = 0
            r1.f7726A = r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.am r9 = (androidx.media3.exoplayer.p138b.C2796am) r9     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r1 = 0
            r9.f7727B = r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
        L_0x0586:
            r1 = r31
            goto L_0x05c0
        L_0x0589:
            r1 = r9
            androidx.media3.exoplayer.b.am r1 = (androidx.media3.exoplayer.p138b.C2796am) r1     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.x r1 = r1.f7751i     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r2 = r9
            androidx.media3.exoplayer.b.am r2 = (androidx.media3.exoplayer.p138b.C2796am) r2     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r2 = r2.mo6490h()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r1.f7916w     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x025b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x025b
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r4 = r1.f7916w     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x025b
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            androidx.media3.common.p136b.C2633u.m7050e(r1, r2)     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            androidx.media3.exoplayer.b.am r9 = (androidx.media3.exoplayer.p138b.C2796am) r9     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            r9.mo6484b()     // Catch:{ r -> 0x05d6, t -> 0x05d2 }
            goto L_0x0586
        L_0x05c0:
            if (r1 == 0) goto L_0x05c7
            r2 = r33
            r1.mo6882p(r2)
        L_0x05c7:
            r1 = r26
            androidx.media3.exoplayer.h r2 = r1.f8646p
            int r3 = r2.f8698e
            int r3 = r3 + r8
            r2.f8698e = r3
            r2 = 1
        L_0x05d1:
            return r2
        L_0x05d2:
            r0 = move-exception
            r1 = r26
            goto L_0x05db
        L_0x05d6:
            r0 = move-exception
            r1 = r26
            goto L_0x05e8
        L_0x05da:
            r0 = move-exception
        L_0x05db:
            r2 = r0
            boolean r3 = r2.f7876b
            r4 = 5002(0x138a, float:7.009E-42)
            r5 = r40
            androidx.media3.exoplayer.o r2 = r1.mo6934g(r2, r5, r3, r4)
            throw r2
        L_0x05e7:
            r0 = move-exception
        L_0x05e8:
            r2 = r0
            androidx.media3.common.x r3 = r2.f7874c
            boolean r4 = r2.f7873b
            r5 = 5001(0x1389, float:7.008E-42)
            androidx.media3.exoplayer.o r2 = r1.mo6934g(r2, r3, r4, r5)
            goto L_0x05f5
        L_0x05f4:
            throw r2
        L_0x05f5:
            goto L_0x05f4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2800aq.mo6516V(long, long, androidx.media3.exoplayer.e.q, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.x):boolean");
    }
}
