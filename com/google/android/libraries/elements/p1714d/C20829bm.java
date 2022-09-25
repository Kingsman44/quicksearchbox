package com.google.android.libraries.elements.p1714d;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.google.android.libraries.elements.C21366j;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66148c;
import com.google.protos.youtube.elements.C66161cf;
import com.google.protos.youtube.elements.C66162cg;
import com.google.protos.youtube.elements.C66182d;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.p5283a.p5284a.C68038aa;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.elements.d.bm */
/* compiled from: PG */
public final class C20829bm {

    /* renamed from: a */
    public static final String f58355a = "bm";

    /* renamed from: b */
    public static final AtomicInteger f58356b = new AtomicInteger();

    /* renamed from: c */
    private static final BreakIterator f58357c = BreakIterator.getCharacterInstance();

    private C20829bm() {
    }

    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        r6 = r27;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r15v1, types: [boolean, int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.litho.C6407q m39125a(com.facebook.litho.C6411u r21, @com.facebook.litho.p323b.C6118b com.youtube.p5283a.p5284a.C68038aa r22, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r23, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r24, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r25, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r26, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21296cl r27, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21259bb r28, @com.facebook.litho.p323b.C6118b boolean r29, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21313t r30, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21319z r31, @com.facebook.litho.p323b.C6118b java.util.Map r32, com.google.android.libraries.elements.p1714d.C20827bk r33) {
        /*
            r1 = r21
            r2 = r26
            r11 = r28
            r12 = r31
            r13 = r33
            com.facebook.litho.widget.dt r14 = new com.facebook.litho.widget.dt
            r14.<init>()
            com.facebook.litho.widget.dv r0 = new com.facebook.litho.widget.dv
            r0.<init>()
            r14.mo13602d(r1, r0)
            int r0 = r22.mo60084h()
            r15 = 0
            r10 = 1
            if (r0 != r10) goto L_0x0028
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r15)
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19366C = r0
        L_0x0028:
            long r3 = r22.mo60087k()
            r16 = 0
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            long r3 = r22.mo60087k()
            com.facebook.litho.widget.dv r0 = r14.f19358a
            int r4 = (int) r3
            r0.f19386a = r4
        L_0x003b:
            if (r29 == 0) goto L_0x0043
            boolean r0 = com.google.android.libraries.elements.C21366j.f59736a
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19388c = r0
            com.youtube.a.a.g r0 = r22.mo60089m()
            r9 = 6
            r8 = 3
            r7 = 2
            if (r0 == 0) goto L_0x01c2
            r3 = 0
        L_0x0052:
            int r4 = r0.mo60222q()
            if (r3 >= r4) goto L_0x009c
            com.youtube.a.a.bi r4 = r0.mo60228w(r3)
            if (r4 != 0) goto L_0x0061
        L_0x005e:
            r6 = r27
            goto L_0x0099
        L_0x0061:
            long r5 = r4.mo60189r()
            int r18 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x005e
            float r3 = r4.mo60180h()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0080
            float r3 = r4.mo60180h()
            com.facebook.litho.widget.dv r5 = r14.f19358a
            com.facebook.litho.fk r6 = r14.f18979b
            int r3 = r6.mo13258b(r3)
            r5.f19375L = r3
        L_0x0080:
            java.lang.String r3 = r0.mo60230y()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x009c
            android.content.Context r3 = r1.f19009b
            r6 = r27
            android.graphics.Typeface r3 = com.google.android.libraries.elements.p1714d.C21071eg.m39584a(r3, r4, r6, r11, r12)
            if (r3 == 0) goto L_0x009e
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19377N = r3
            goto L_0x009e
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x009c:
            r6 = r27
        L_0x009e:
            android.content.Context r4 = r1.f19009b
            r3 = r31
            r5 = r0
            r6 = r30
            r7 = r27
            r8 = r28
            r9 = r32
            r15 = 1
            r10 = r29
            java.lang.CharSequence r3 = com.google.android.libraries.elements.p1714d.C21071eg.m39589f(r3, r4, r5, r6, r7, r8, r9, r10)
            int r4 = r0.mo60222q()
            if (r4 == r15) goto L_0x00ba
        L_0x00b8:
            r10 = 6
            goto L_0x0125
        L_0x00ba:
            r4 = 0
            com.youtube.a.a.bi r5 = r0.mo60228w(r4)
            if (r5 == 0) goto L_0x00b8
            java.lang.String r4 = r0.mo60230y()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00ce
            r6 = r16
            goto L_0x00d7
        L_0x00ce:
            java.lang.String r4 = r0.mo60230y()
            int r4 = r4.length()
            long r6 = (long) r4
        L_0x00d7:
            r10 = 6
            boolean r4 = com.google.p370af.C7490c.m22726p(r5, r10)
            if (r4 == 0) goto L_0x00e3
            long r8 = r5.mo60188q()
            goto L_0x00e4
        L_0x00e3:
            r8 = r6
        L_0x00e4:
            long r19 = r5.mo60189r()
            int r4 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0125
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0125
            long r6 = r5.mo60187p()
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0105
            long r4 = r5.mo60187p()
            int r5 = (int) r4
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            com.facebook.litho.widget.dv r5 = r14.f19358a
            r5.f19374K = r4
        L_0x0105:
            boolean r4 = r3 instanceof android.text.SpannableString
            if (r4 == 0) goto L_0x0125
            r4 = r3
            android.text.SpannableString r4 = (android.text.SpannableString) r4
            int r5 = r4.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r6 = android.text.style.ForegroundColorSpan.class
            r7 = 0
            java.lang.Object[] r5 = r4.getSpans(r7, r5, r6)
            android.text.style.ForegroundColorSpan[] r5 = (android.text.style.ForegroundColorSpan[]) r5
            int r6 = r5.length
            r7 = 0
        L_0x011b:
            if (r7 >= r6) goto L_0x0125
            r8 = r5[r7]
            r4.removeSpan(r8)
            int r7 = r7 + 1
            goto L_0x011b
        L_0x0125:
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19365B = r3
            java.lang.String r3 = r3.toString()
            monitor-enter(r33)
            java.lang.String r4 = r13.f58348b     // Catch:{ all -> 0x01bf }
            r13.f58348b = r3     // Catch:{ all -> 0x01bf }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x01bf }
            if (r4 == 0) goto L_0x013c
            java.lang.String r3 = r13.f58349c     // Catch:{ all -> 0x01bf }
            monitor-exit(r33)     // Catch:{ all -> 0x01bf }
            goto L_0x016f
        L_0x013c:
            java.util.List r4 = r13.f58347a     // Catch:{ all -> 0x01bf }
            int r3 = r4.indexOf(r3)     // Catch:{ all -> 0x01bf }
            if (r3 < 0) goto L_0x0155
        L_0x0144:
            java.util.List r4 = r13.f58347a     // Catch:{ all -> 0x01bf }
            r4.remove(r3)     // Catch:{ all -> 0x01bf }
            java.util.List r4 = r13.f58347a     // Catch:{ all -> 0x01bf }
            int r4 = r4.size()     // Catch:{ all -> 0x01bf }
            if (r3 < r4) goto L_0x0144
            java.lang.String r3 = r13.f58349c     // Catch:{ all -> 0x01bf }
            monitor-exit(r33)     // Catch:{ all -> 0x01bf }
            goto L_0x016f
        L_0x0155:
            java.lang.String r3 = f58355a     // Catch:{ all -> 0x01bf }
            java.util.concurrent.atomic.AtomicInteger r4 = f58356b     // Catch:{ all -> 0x01bf }
            int r4 = r4.incrementAndGet()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r5.<init>()     // Catch:{ all -> 0x01bf }
            r5.append(r3)     // Catch:{ all -> 0x01bf }
            r5.append(r4)     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01bf }
            r13.f58349c = r3     // Catch:{ all -> 0x01bf }
            monitor-exit(r33)     // Catch:{ all -> 0x01bf }
        L_0x016f:
            r14.mo13450x(r3)
            int r3 = r0.mo60217h()
            if (r3 == r15) goto L_0x0194
            r4 = 5
            r9 = 2
            if (r3 == r9) goto L_0x018e
            r8 = 3
            if (r3 == r8) goto L_0x0189
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r3.f19389d = r5
            r3.f19373J = r4
            goto L_0x019a
        L_0x0189:
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19389d = r15
            goto L_0x019a
        L_0x018e:
            r8 = 3
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19389d = r4
            goto L_0x019a
        L_0x0194:
            r8 = 3
            r9 = 2
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19389d = r8
        L_0x019a:
            int r3 = r0.mo60221p()
            if (r3 == r15) goto L_0x01ac
            int r3 = r0.mo60221p()
            android.text.TextUtils$TruncateAt r3 = com.google.android.libraries.elements.p1714d.C21071eg.m39586c(r3)
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19387b = r3
        L_0x01ac:
            int r3 = r0.mo60221p()
            if (r3 != 0) goto L_0x01c5
            int r0 = r0.mo60223r()
            android.text.TextUtils$TruncateAt r0 = com.google.android.libraries.elements.p1714d.C21071eg.m39587d(r0)
            com.facebook.litho.widget.dv r3 = r14.f19358a
            r3.f19387b = r0
            goto L_0x01c5
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r33)     // Catch:{ all -> 0x01bf }
            throw r0
        L_0x01c2:
            r9 = 2
            r10 = 6
            r15 = 1
        L_0x01c5:
            com.youtube.a.a.g r0 = r22.mo60088l()
            if (r0 == 0) goto L_0x01e8
            android.content.Context r4 = r1.f19009b
            com.youtube.a.a.g r5 = r22.mo60088l()
            r3 = r31
            r6 = r30
            r7 = r27
            r0 = 3
            r8 = r28
            r13 = 2
            r9 = r32
            r10 = r29
            java.lang.CharSequence r3 = com.google.android.libraries.elements.p1714d.C21071eg.m39589f(r3, r4, r5, r6, r7, r8, r9, r10)
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19391f = r3
            goto L_0x01ea
        L_0x01e8:
            r0 = 3
            r13 = 2
        L_0x01ea:
            if (r23 == 0) goto L_0x0202
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r4 = 0
            r3[r4] = r1
            r3[r15] = r23
            java.lang.Class<com.google.android.libraries.elements.d.be> r4 = com.google.android.libraries.elements.p1714d.C20821be.class
            java.lang.String r5 = "EditableText"
            r6 = 378110312(0x16898168, float:2.221521E-25)
            com.facebook.litho.cb r3 = com.google.android.libraries.elements.p1714d.C20821be.m15817L(r4, r5, r1, r6, r3)
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19378O = r3
        L_0x0202:
            if (r24 != 0) goto L_0x0206
            if (r25 == 0) goto L_0x0227
        L_0x0206:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            r3[r4] = r1
            r3[r15] = r24
            r3[r13] = r25
            java.lang.Class<com.google.android.libraries.elements.d.be> r4 = com.google.android.libraries.elements.p1714d.C20821be.class
            java.lang.String r5 = "EditableText"
            r6 = -1974694341(0xffffffff8a4c8e3b, float:-9.848993E-33)
            com.facebook.litho.cb r3 = com.google.android.libraries.elements.p1714d.C20821be.m15817L(r4, r5, r1, r6, r3)
            com.facebook.litho.q r4 = r14.f18980c
            com.facebook.litho.l r4 = r4.mo13456J()
            com.facebook.litho.ev r4 = r4.mo13411E()
            r4.mo13050T(r3)
        L_0x0227:
            int r3 = r22.mo60083g()
            if (r3 == r13) goto L_0x023a
            if (r3 == r0) goto L_0x0237
            r4 = 4
            if (r3 == r4) goto L_0x0234
            r3 = 0
            goto L_0x023c
        L_0x0234:
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x023c
        L_0x0237:
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x023c
        L_0x023a:
            r3 = 16384(0x4000, float:2.2959E-41)
        L_0x023c:
            int r4 = r22.mo60085i()
            switch(r4) {
                case 2: goto L_0x0259;
                case 3: goto L_0x0257;
                case 4: goto L_0x0254;
                case 5: goto L_0x0251;
                case 6: goto L_0x024e;
                case 7: goto L_0x024b;
                case 8: goto L_0x0243;
                case 9: goto L_0x0251;
                default: goto L_0x0243;
            }
        L_0x0243:
            int r0 = r22.mo60086j()
            if (r0 != r15) goto L_0x025b
        L_0x0249:
            r10 = 1
            goto L_0x026e
        L_0x024b:
            r10 = 96
            goto L_0x026e
        L_0x024e:
            r10 = 16
            goto L_0x026e
        L_0x0251:
            r10 = 32
            goto L_0x026e
        L_0x0254:
            r10 = 8194(0x2002, float:1.1482E-41)
            goto L_0x026e
        L_0x0257:
            r10 = 3
            goto L_0x026e
        L_0x0259:
            r10 = 2
            goto L_0x026e
        L_0x025b:
            com.facebook.litho.widget.dv r0 = r14.f19358a
            r0.f19371H = r15
            int r0 = r22.mo60086j()
            if (r0 <= r15) goto L_0x0249
            int r0 = r22.mo60086j()
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19369F = r0
            goto L_0x0249
        L_0x026e:
            r3 = r3 | r10
            com.facebook.litho.widget.dv r0 = r14.f19358a
            r0.f19368E = r3
            boolean r0 = r22.mo60094r()
            if (r0 == 0) goto L_0x028c
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r4 = 0
            r0[r4] = r1
            java.lang.Class<com.google.android.libraries.elements.d.be> r4 = com.google.android.libraries.elements.p1714d.C20821be.class
            java.lang.String r5 = "EditableText"
            r6 = 1803022739(0x6b77f193, float:2.9974548E26)
            com.facebook.litho.cb r0 = com.google.android.libraries.elements.p1714d.C20821be.m15817L(r4, r5, r1, r6, r0)
            r14.mo13425I(r0)
        L_0x028c:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r1.f19009b
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r5 = 16842905(0x1010099, float:2.3693987E-38)
            boolean r0 = r0.resolveAttribute(r5, r4, r15)
            if (r0 == 0) goto L_0x02c4
            android.content.Context r0 = r1.f19009b     // Catch:{ NotFoundException -> 0x02aa }
            int r5 = r4.resourceId     // Catch:{ NotFoundException -> 0x02aa }
            int r4 = androidx.core.content.C1878d.m5128a(r0, r5)     // Catch:{ NotFoundException -> 0x02aa }
            r8 = 0
            goto L_0x02c6
        L_0x02aa:
            r0 = move-exception
            com.google.protos.youtube.elements.r r5 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r15]
            int r4 = r4.resourceId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r7[r8] = r4
            java.lang.String r4 = "Highlight Color (attribute = android.R.attr.textColorHighlight) is associated with undefined (colorId = %d)"
            java.lang.String r4 = java.lang.String.format(r6, r4, r7)
            r11.mo25782a(r5, r4, r12, r0)
            goto L_0x02c5
        L_0x02c4:
            r8 = 0
        L_0x02c5:
            r4 = 0
        L_0x02c6:
            if (r4 == 0) goto L_0x02d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.facebook.litho.widget.dv r4 = r14.f19358a
            r4.f19390e = r0
        L_0x02d0:
            if (r2 == 0) goto L_0x039d
            int r0 = r22.mo60085i()
            r4 = 8
            if (r0 == r4) goto L_0x02e6
            int r0 = r22.mo60085i()
            if (r0 == r15) goto L_0x02e6
            int r0 = r22.mo60085i()
            if (r0 != 0) goto L_0x02e7
        L_0x02e6:
            r8 = 1
        L_0x02e7:
            int r0 = r22.mo60086j()
            if (r0 == r15) goto L_0x0395
            if (r8 != 0) goto L_0x02f1
            goto L_0x0395
        L_0x02f1:
            com.google.protos.youtube.elements.CommandOuterClass$Command r0 = r26.mo26862a()
            if (r0 != 0) goto L_0x02f9
            goto L_0x0375
        L_0x02f9:
            com.google.protobuf.bt r4 = com.google.protos.youtube.elements.p5165a.C66018f.f179538b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r5 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x030d
            goto L_0x0361
        L_0x030d:
            com.google.protobuf.bt r4 = com.google.protos.youtube.elements.C66218ee.f180063c
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r5 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x0375
            com.google.protobuf.bt r4 = com.google.protos.youtube.elements.C66218ee.f180063c
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r0 = r0.mo58854l(r5)
            if (r0 != 0) goto L_0x0336
            java.lang.Object r0 = r4.f169969b
            goto L_0x033a
        L_0x0336:
            java.lang.Object r0 = r4.mo58889c(r0)
        L_0x033a:
            com.google.protos.youtube.elements.ee r0 = (com.google.protos.youtube.elements.C66218ee) r0
            com.google.protobuf.cq r0 = r0.f180065a
            java.util.Iterator r0 = r0.iterator()
        L_0x0342:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0375
            java.lang.Object r4 = r0.next()
            com.google.protos.youtube.elements.CommandOuterClass$Command r4 = (com.google.protos.youtube.elements.CommandOuterClass$Command) r4
            com.google.protobuf.bt r5 = com.google.protos.youtube.elements.p5165a.C66018f.f179538b
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r4 = r4.mo58857o(r5)
            if (r4 == 0) goto L_0x0342
        L_0x0361:
            com.facebook.litho.widget.dv r0 = r14.f19358a
            r4 = 6
            r0.f19364A = r4
            r4 = -131073(0xfffffffffffdffff, float:NaN)
            r3 = r3 & r4
            r0.f19372I = r3
            com.facebook.litho.cb r0 = com.google.android.libraries.elements.p1714d.C20821be.m39095b(r1, r2)
            com.facebook.litho.widget.dv r1 = r14.f19358a
            r1.f19379P = r0
            goto L_0x039d
        L_0x0375:
            com.google.android.libraries.elements.d.bl r0 = new com.google.android.libraries.elements.d.bl
            r1 = r30
            r0.<init>(r2, r1, r12)
            com.facebook.litho.widget.dv r1 = r14.f19358a
            java.util.List r1 = r1.f19376M
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            if (r1 != r2) goto L_0x038d
            com.facebook.litho.widget.dv r1 = r14.f19358a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f19376M = r2
        L_0x038d:
            com.facebook.litho.widget.dv r1 = r14.f19358a
            java.util.List r1 = r1.f19376M
            r1.add(r0)
            goto L_0x039d
        L_0x0395:
            com.facebook.litho.cb r0 = com.google.android.libraries.elements.p1714d.C20821be.m39095b(r1, r2)
            com.facebook.litho.widget.dv r1 = r14.f19358a
            r1.f19379P = r0
        L_0x039d:
            com.facebook.litho.widget.dv r0 = r14.mo13259a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20829bm.m39125a(com.facebook.litho.u, com.youtube.a.a.aa, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.interfaces.cl, com.google.android.libraries.elements.interfaces.bb, boolean, com.google.android.libraries.elements.interfaces.t, com.google.android.libraries.elements.interfaces.z, java.util.Map, com.google.android.libraries.elements.d.bk):com.facebook.litho.q");
    }

    /* renamed from: b */
    public static C21311r m39126b(View view, C21256az azVar) {
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59560a = view;
        aVar.f59565f = azVar;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String obj = editText.getText().toString();
            C66148c cVar = (C66148c) C66182d.f179960e.createBuilder();
            cVar.copyOnWrite();
            C66182d dVar = (C66182d) cVar.instance;
            obj.getClass();
            dVar.f179962a |= 1;
            dVar.f179963b = obj;
            C66182d dVar2 = (C66182d) cVar.build();
            C66161cf cfVar = (C66161cf) C66162cg.f179907f.createBuilder();
            cfVar.copyOnWrite();
            C66162cg cgVar = (C66162cg) cfVar.instance;
            dVar2.getClass();
            cgVar.f179911b = dVar2;
            cgVar.f179910a |= 1;
            boolean isFocused = view.isFocused();
            cfVar.copyOnWrite();
            C66162cg cgVar2 = (C66162cg) cfVar.instance;
            cgVar2.f179910a |= 8;
            cgVar2.f179913d = isFocused;
            int selectionEnd = editText.getSelectionEnd();
            cfVar.copyOnWrite();
            C66162cg cgVar3 = (C66162cg) cfVar.instance;
            cgVar3.f179910a |= 2;
            cgVar3.f179912c = selectionEnd;
            BreakIterator breakIterator = f58357c;
            breakIterator.setText(obj);
            breakIterator.first();
            int i = 0;
            while (f58357c.next() != -1) {
                i++;
            }
            cfVar.copyOnWrite();
            C66162cg cgVar4 = (C66162cg) cfVar.instance;
            cgVar4.f179910a |= 16;
            cgVar4.f179914e = i;
            C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
            ecVar.mo58885m(C66162cg.f179908g, (C66162cg) cfVar.build());
            aVar.f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        }
        return k.mo26698a();
    }

    /* renamed from: c */
    static void m39127c(C6411u uVar, @C6118b boolean z, @C6118b boolean z2, C6281fx fxVar, C6281fx fxVar2) {
        fxVar.f18496a = new C20827bk();
        fxVar2.f18496a = new AtomicBoolean(true);
        if (z && z2) {
            C21366j.m40408a(uVar.f19009b);
        }
    }

    /* renamed from: d */
    static boolean m39128d(C21357r rVar, TextView textView, @C6118b C21313t tVar, @C6118b C21319z zVar) {
        if (rVar == null || textView == null) {
            return false;
        }
        tVar.mo26124a(rVar.mo26862a(), m39126b(textView, zVar.mo26806h())).mo61453k();
        return true;
    }

    /* renamed from: f */
    static void m39130f(@C6118b C68038aa aaVar, AtomicBoolean atomicBoolean, View view) {
        if (aaVar.mo60094r() && (view instanceof EditText) && atomicBoolean.getAndSet(false)) {
            view.post(new C20826bj(view));
        }
    }

    /* renamed from: e */
    static void m39129e(C21357r rVar, C21357r rVar2, View view, boolean z, @C6118b C21313t tVar, @C6118b C21319z zVar) {
        if (z) {
            if (rVar != null) {
                tVar.mo26124a(rVar.mo26862a(), m39126b(view, zVar.mo26806h())).mo61453k();
            }
        } else if (rVar2 != null) {
            tVar.mo26124a(rVar2.mo26862a(), m39126b(view, zVar.mo26806h())).mo61453k();
        }
    }
}
