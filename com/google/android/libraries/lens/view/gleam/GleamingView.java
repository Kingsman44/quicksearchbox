package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.view.p2069am.C25303ak;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2154p.p2155a.C27535e;
import com.google.android.libraries.lens.view.utils.homography.HomographyUtilImpl;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.lens.p4699e.C62230k;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62491dn;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class GleamingView extends C26597fq implements C47231d {

    /* renamed from: a */
    public C26559ej f71933a;

    @Deprecated
    public GleamingView(Context context) {
        super(context);
        mo31637f();
    }

    /* renamed from: b */
    public final C24107a mo29504b() {
        mo31637f();
        return C24107a.GLEAMS;
    }

    /* renamed from: d */
    public final boolean mo29505d(MotionEvent motionEvent) {
        mo31637f();
        C26559ej ejVar = this.f71933a;
        if (motionEvent.getAction() == 1) {
            C26637y yVar = ejVar.f72417w;
            if (yVar.mo31919d()) {
                if (((C27535e) yVar.f72644b.mo27525b()).mo33092d()) {
                    yVar.f72645c.mo19974a(C37194a.f98487ax);
                } else if (((C27535e) yVar.f72644b.mo27525b()).mo33093e()) {
                    yVar.f72645c.mo19974a(C37194a.f98489az);
                }
                C27535e eVar = (C27535e) yVar.f72644b.mo27525b();
                eVar.mo33089a();
                eVar.f75317d = null;
                C58833ax a = yVar.mo31917a();
                if (a.mo56113h()) {
                    C62230k kVar = (C62230k) ((C62231l) a.mo56107c()).toBuilder();
                    kVar.copyOnWrite();
                    C62231l lVar = (C62231l) kVar.instance;
                    lVar.f168025a |= 8;
                    lVar.f168028d = true;
                    a = C58833ax.m90834k((C62231l) kVar.build());
                }
                yVar.f72643a.mo33109l(a);
            }
        }
        return ejVar.f72413s.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        super.dispatchHoverEvent(motionEvent);
        mo31637f();
        return this.f71933a.f72405k.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        super.dispatchKeyEvent(keyEvent);
        mo31637f();
        return this.f71933a.f72405k.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C58833ax axVar;
        C58833ax axVar2;
        C25303ak akVar;
        Canvas canvas2 = canvas;
        View view2 = view;
        long j2 = j;
        mo31637f();
        C26559ej ejVar = this.f71933a;
        if (!(view2 instanceof HomographyTrackedTextContainerView)) {
            return super.drawChild(canvas2, view2, j2);
        }
        C26571er erVar = ejVar.f72399e;
        HomographyUtilImpl homographyUtilImpl = erVar.f72431c;
        if (erVar.f72430b.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            int i = ((C58724pq) erVar.f72430b).f156474d * 8;
            float[] fArr = new float[i];
            float[] fArr2 = new float[i];
            int i2 = 0;
            while (true) {
                C58485gu guVar = erVar.f72430b;
                if (i2 >= ((C58724pq) guVar).f156474d) {
                    break;
                }
                C26491bw bwVar = (C26491bw) guVar.get(i2);
                C25308ap apVar = bwVar.f71963a;
                if (apVar.f68843d == 12) {
                    akVar = (C25303ak) apVar.f68844e;
                } else {
                    akVar = C25303ak.f68821f;
                }
                C62491dn dnVar = akVar.f68824b;
                if (dnVar == null) {
                    dnVar = C62491dn.f168710e;
                }
                C62491dn dnVar2 = akVar.f68823a;
                if (dnVar2 == null) {
                    dnVar2 = C62491dn.f168710e;
                }
                int i3 = 0;
                while (i3 < 4) {
                    int i4 = (i2 * 8) + i3 + i3;
                    fArr[i4] = ((C62488dk) dnVar.f168713b.get(i3)).f168702b * ((float) bwVar.f71966d.getWidth());
                    int i5 = i4 + 1;
                    fArr[i5] = ((C62488dk) dnVar.f168713b.get(i3)).f168703c * ((float) bwVar.f71966d.getHeight());
                    fArr2[i4] = ((C62488dk) dnVar2.f168713b.get(i3)).f168702b * ((float) bwVar.f71966d.getWidth());
                    fArr2[i5] = ((C62488dk) dnVar2.f168713b.get(i3)).f168703c * ((float) bwVar.f71966d.getHeight());
                    i3++;
                    dnVar = dnVar;
                }
                i2++;
            }
            if (!erVar.f72431c.f76516a.isDone()) {
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90834k(HomographyUtilImpl.nativeFindHomography(fArr, fArr2));
            }
            if (!axVar2.mo56113h()) {
                ((C58970a) ((C58970a) C26571er.f72429a.mo56224b()).mo56372aa(49460)).mo56386p("Could not retrieve homography values.");
                axVar = C58836b.f156633a;
            } else {
                Matrix matrix = new Matrix();
                matrix.setValues((float[]) axVar2.mo56107c());
                axVar = C58833ax.m90834k(matrix);
            }
        }
        if (!axVar.mo56113h()) {
            return false;
        }
        int save = canvas.save();
        canvas2.concat((Matrix) axVar.mo56107c());
        super.drawChild(canvas2, view2, j2);
        canvas2.restoreToCount(save);
        return true;
    }

    /* renamed from: e */
    public final C26559ej mo17754z() {
        C26559ej ejVar = this.f71933a;
        if (ejVar != null) {
            return ejVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final void mo31637f() {
        if (this.f71933a == null) {
            try {
                C26567en enVar = (C26567en) mo31858h().mo17653jN();
                C26552ec ecVar = new C26552ec(this);
                C47240i.m84036c(ecVar);
                try {
                    C26559ej O = enVar.mo31829O();
                    this.f71933a = O;
                    if (O == null) {
                        C47240i.m84035b(ecVar);
                    }
                    this.f71933a.f72425L = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f71933a == null) {
                        C47240i.m84035b(ecVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo31638g() {
        super.invalidate();
    }

    public final void invalidate() {
        mo31637f();
        this.f71933a.mo31827f();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r12 != com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x034e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r19
            super.onDraw(r19)
            r18.mo31637f()
            r1 = r18
            com.google.android.libraries.lens.view.gleam.ej r2 = r1.f71933a
            java.lang.String r3 = "GleamingView:onDraw"
            android.os.Trace.beginSection(r3)
            com.google.android.libraries.lens.view.gleam.fa r3 = r2.f72389H
            r4 = 0
            if (r3 == 0) goto L_0x0037
            com.google.android.libraries.lens.view.am.ar r5 = r2.f72384C
            long r5 = r5.f68868b
            boolean r7 = r3.f72460f
            if (r7 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            r3.f72463i = r4
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.android.libraries.f.a r8 = r3.f72458d
            long r8 = r8.mo26872d()
            long r7 = r7.toMicros(r8)
            long r9 = r3.f72462h
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0037
            r3.f72461g = r7
            r3.f72462h = r5
        L_0x0037:
            com.google.android.libraries.lens.view.x.e r3 = r2.f72420z
            com.google.android.libraries.lens.view.gleam.ap r5 = r2.f72398d
            com.google.common.b.gu r5 = r5.f72053b
            com.google.common.b.gu r12 = r2.f72385D
            java.lang.String r6 = "GleamEngine.updateContext"
            android.os.Trace.beginSection(r6)     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.f.a r6 = r3.f76820c     // Catch:{ all -> 0x0386 }
            long r6 = r6.mo26871c()     // Catch:{ all -> 0x0386 }
            long r8 = r3.f76821d     // Catch:{ all -> 0x0386 }
            r10 = -9223372036854775808
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0057
            r8 = -4
            long r8 = r8 + r6
            r3.f76821d = r8     // Catch:{ all -> 0x0386 }
        L_0x0057:
            long r8 = r6 - r8
            r10 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0064
            r8 = -2000(0xfffffffffffff830, double:NaN)
            long r8 = r8 + r6
            r3.f76821d = r8     // Catch:{ all -> 0x0386 }
        L_0x0064:
            boolean r8 = r12.isEmpty()     // Catch:{ all -> 0x0386 }
            if (r8 == 0) goto L_0x0081
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0386 }
            if (r8 == 0) goto L_0x0081
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0386 }
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.lens.view.x.a r6 = new com.google.android.libraries.lens.view.x.a     // Catch:{ all -> 0x0386 }
            r6.<init>(r3, r5)     // Catch:{ all -> 0x0386 }
        L_0x007d:
            android.os.Trace.endSection()
            goto L_0x00e1
        L_0x0081:
            r13 = 0
        L_0x0082:
            boolean r8 = r3.f76822e     // Catch:{ all -> 0x0386 }
            if (r8 == 0) goto L_0x00ae
            long r8 = r3.f76821d     // Catch:{ all -> 0x0386 }
            long r8 = r6 - r8
            r10 = 4
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x00ae
            int r13 = r13 + 1
            java.util.List r8 = r3.f76818a     // Catch:{ all -> 0x0386 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0386 }
        L_0x0098:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0386 }
            if (r9 == 0) goto L_0x00a8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.lens.view.x.c r9 = (com.google.android.libraries.lens.view.p2178x.C28209c) r9     // Catch:{ all -> 0x0386 }
            r9.mo33723a(r12)     // Catch:{ all -> 0x0386 }
            goto L_0x0098
        L_0x00a8:
            long r8 = r3.f76821d     // Catch:{ all -> 0x0386 }
            long r8 = r8 + r10
            r3.f76821d = r8     // Catch:{ all -> 0x0386 }
            goto L_0x0082
        L_0x00ae:
            com.google.common.b.gp r14 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0386 }
            com.google.common.b.gp r15 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0386 }
            if (r13 <= 0) goto L_0x00d3
            java.util.List r3 = r3.f76819b     // Catch:{ all -> 0x0386 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0386 }
        L_0x00be:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0386 }
            if (r6 == 0) goto L_0x00d3
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.lens.view.x.b r6 = (com.google.android.libraries.lens.view.p2178x.C28208b) r6     // Catch:{ all -> 0x0386 }
            r7 = r13
            r8 = r12
            r9 = r5
            r10 = r15
            r11 = r14
            r6.mo33722a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0386 }
            goto L_0x00be
        L_0x00d3:
            com.google.common.b.gu r3 = r15.mo55394f()     // Catch:{ all -> 0x0386 }
            com.google.common.b.gu r5 = r14.mo55394f()     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.lens.view.x.a r6 = new com.google.android.libraries.lens.view.x.a     // Catch:{ all -> 0x0386 }
            r6.<init>(r3, r5)     // Catch:{ all -> 0x0386 }
            goto L_0x007d
        L_0x00e1:
            com.google.common.b.gu r3 = r6.f76816a
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0113
            boolean r5 = r2.f72383B
            if (r5 != 0) goto L_0x00ee
            goto L_0x0113
        L_0x00ee:
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r7 = r2.f72385D
            r5.mo55396h(r7)
            r7 = r3
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r8 = 0
        L_0x00fd:
            if (r8 >= r7) goto L_0x010d
            java.lang.Object r9 = r3.get(r8)
            com.google.android.libraries.lens.view.gleam.as r9 = (com.google.android.libraries.lens.view.gleam.C26460as) r9
            if (r9 == 0) goto L_0x010a
            r5.mo55395g(r9)
        L_0x010a:
            int r8 = r8 + 1
            goto L_0x00fd
        L_0x010d:
            com.google.common.b.gu r3 = r5.mo55394f()
            r2.f72385D = r3
        L_0x0113:
            com.google.common.b.gu r3 = r6.f76817b
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x011c
            goto L_0x014a
        L_0x011c:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r5.addAll(r3)
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r6 = r2.f72385D
            r7 = r6
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r8 = 0
        L_0x0130:
            if (r8 >= r7) goto L_0x0144
            java.lang.Object r9 = r6.get(r8)
            com.google.android.libraries.lens.view.gleam.as r9 = (com.google.android.libraries.lens.view.gleam.C26460as) r9
            boolean r10 = r5.contains(r9)
            if (r10 != 0) goto L_0x0141
            r3.mo55395g(r9)
        L_0x0141:
            int r8 = r8 + 1
            goto L_0x0130
        L_0x0144:
            com.google.common.b.gu r3 = r3.mo55394f()
            r2.f72385D = r3
        L_0x014a:
            boolean r3 = r2.f72386E
            if (r3 == 0) goto L_0x0157
            r2.f72386E = r4
            com.google.android.libraries.search.b.b r3 = r2.f72395a
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98411A
            r3.mo19974a(r5)
        L_0x0157:
            com.google.android.libraries.lens.view.gleam.av r3 = r2.f72388G
            if (r3 == 0) goto L_0x0305
            boolean r5 = r2.f72382A
            if (r5 != 0) goto L_0x0305
            boolean r5 = r3.f72085h
            if (r5 == 0) goto L_0x0233
            com.google.android.libraries.lens.view.gleam.ap r5 = r2.f72398d
            com.google.common.b.gu r5 = r5.f72053b
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r7 = 0
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
        L_0x0171:
            r10 = 1
            if (r9 >= r6) goto L_0x01ee
            java.lang.Object r11 = r5.get(r9)
            com.google.android.libraries.lens.view.gleam.af r11 = (com.google.android.libraries.lens.view.gleam.C26447af) r11
            boolean r12 = r11.f72001l
            if (r12 != 0) goto L_0x0195
            boolean r12 = r11.mo31671A()
            if (r12 == 0) goto L_0x0195
            com.google.android.libraries.lens.view.am.ap r12 = r11.f71963a
            int r12 = r12.f68848i
            com.google.android.libraries.lens.view.am.y r12 = com.google.android.libraries.lens.view.p2069am.C25349y.m46667a(r12)
            if (r12 != 0) goto L_0x0190
            com.google.android.libraries.lens.view.am.y r12 = com.google.android.libraries.lens.view.p2069am.C25349y.UNRECOGNIZED
        L_0x0190:
            com.google.android.libraries.lens.view.am.y r13 = com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM
            if (r12 == r13) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r10 = 0
        L_0x0196:
            com.google.android.libraries.lens.view.gleam.al r12 = r11.f72008s
            if (r12 == 0) goto L_0x01a3
            if (r10 == 0) goto L_0x01eb
            boolean r10 = r12.mo31700k()
            if (r10 == 0) goto L_0x01eb
            goto L_0x01a6
        L_0x01a3:
            if (r10 != 0) goto L_0x01a6
            goto L_0x01eb
        L_0x01a6:
            android.graphics.PointF r10 = r11.f71964b
            float r12 = r10.x
            android.graphics.RectF r13 = r3.f72083f
            float r13 = r13.left
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x01eb
            float r12 = r10.x
            android.graphics.RectF r13 = r3.f72083f
            float r13 = r13.right
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x01eb
            float r12 = r10.y
            android.graphics.RectF r13 = r3.f72083f
            float r13 = r13.top
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x01eb
            float r12 = r10.y
            android.graphics.RectF r13 = r3.f72083f
            float r13 = r13.bottom
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x01eb
            android.graphics.PointF r12 = new android.graphics.PointF
            android.graphics.RectF r13 = r3.f72082e
            float r13 = r13.centerX()
            android.graphics.RectF r14 = r3.f72082e
            float r14 = r14.centerY()
            r12.<init>(r13, r14)
            float r10 = com.google.android.libraries.lens.common.p1998a.C24094b.m44752a(r10, r12)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x01eb
            r8 = r10
            r7 = r11
        L_0x01eb:
            int r9 = r9 + 1
            goto L_0x0171
        L_0x01ee:
            if (r7 == 0) goto L_0x01fa
            r7.mo31682z(r10)
            com.google.android.libraries.lens.view.gleam.av r3 = r2.f72388G
            r5 = 2
            r3.mo31716a(r5)
            goto L_0x01ff
        L_0x01fa:
            com.google.android.libraries.lens.view.gleam.av r3 = r2.f72388G
            r3.mo31716a(r10)
        L_0x01ff:
            com.google.android.libraries.lens.view.gleam.ap r3 = r2.f72398d
            com.google.common.b.gu r3 = r3.f72053b
            r5 = r3
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5
            int r5 = r5.f156474d
            r6 = 0
        L_0x0209:
            if (r6 >= r5) goto L_0x0223
            java.lang.Object r8 = r3.get(r6)
            com.google.android.libraries.lens.view.gleam.af r8 = (com.google.android.libraries.lens.view.gleam.C26447af) r8
            boolean r9 = r8.equals(r7)
            if (r9 != 0) goto L_0x0220
            com.google.android.libraries.lens.view.am.ap r9 = r8.f71963a
            boolean r9 = r9.f68853n
            if (r9 != 0) goto L_0x0220
            r8.mo31682z(r4)
        L_0x0220:
            int r6 = r6 + 1
            goto L_0x0209
        L_0x0223:
            com.google.android.libraries.lens.view.gleam.af r3 = r2.f72390I
            if (r3 == r7) goto L_0x0233
            com.google.android.libraries.lens.view.gleam.ej$c r3 = new com.google.android.libraries.lens.view.gleam.ej$c
            r3.<init>(r7)
            com.google.android.libraries.lens.view.gleam.GleamingView r5 = r2.f72403i
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84237h(r3, r5)
            r2.f72390I = r7
        L_0x0233:
            com.google.android.libraries.lens.view.gleam.av r3 = r2.f72388G
            com.google.android.libraries.lens.view.gleam.by r5 = com.google.android.libraries.lens.view.gleam.C26493by.SHADOW_LAYER
            boolean r5 = r3.f72086i
            if (r5 == 0) goto L_0x0305
            android.graphics.RectF r5 = r3.f72082e
            float r5 = r5.left
            float r6 = r3.f72084g
            float r5 = r5 + r6
            android.graphics.RectF r6 = r3.f72082e
            float r6 = r6.top
            float r7 = r3.f72084g
            float r6 = r6 + r7
            android.graphics.RectF r7 = r3.f72082e
            float r7 = r7.right
            float r8 = r3.f72084g
            float r15 = r7 - r8
            android.graphics.RectF r7 = r3.f72082e
            float r7 = r7.bottom
            float r8 = r3.f72084g
            float r14 = r7 - r8
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            float r7 = r3.f72080c
            float r7 = r7 + r6
            r13.moveTo(r5, r7)
            float r7 = r3.f72079b
            float r7 = r7 + r6
            r13.lineTo(r5, r7)
            float r7 = r3.f72079b
            float r7 = r7 + r7
            float r10 = r5 + r7
            float r11 = r6 + r7
            r12 = 1127481344(0x43340000, float:180.0)
            r16 = 1119092736(0x42b40000, float:90.0)
            r17 = 1
            r7 = r13
            r8 = r5
            r9 = r6
            r4 = r13
            r13 = r16
            r1 = r14
            r14 = r17
            r7.arcTo(r8, r9, r10, r11, r12, r13, r14)
            float r7 = r3.f72080c
            float r7 = r7 + r5
            r4.lineTo(r7, r6)
            float r7 = r3.f72080c
            float r7 = r15 - r7
            r4.moveTo(r7, r6)
            float r7 = r3.f72079b
            float r7 = r15 - r7
            r4.lineTo(r7, r6)
            float r7 = r3.f72079b
            float r7 = r7 + r7
            float r9 = r15 - r7
            float r12 = r6 + r7
            r13 = 1132920832(0x43870000, float:270.0)
            r14 = 1119092736(0x42b40000, float:90.0)
            r7 = 1
            r8 = r4
            r10 = r6
            r11 = r15
            r17 = r2
            r2 = r15
            r15 = r7
            r8.arcTo(r9, r10, r11, r12, r13, r14, r15)
            float r7 = r3.f72080c
            float r6 = r6 + r7
            r4.lineTo(r2, r6)
            float r6 = r3.f72080c
            float r6 = r6 + r5
            r4.moveTo(r6, r1)
            float r6 = r3.f72079b
            float r6 = r6 + r5
            r4.lineTo(r6, r1)
            float r6 = r3.f72079b
            float r6 = r6 + r6
            float r9 = r1 - r6
            float r10 = r5 + r6
            r12 = 1119092736(0x42b40000, float:90.0)
            r13 = 1119092736(0x42b40000, float:90.0)
            r14 = 1
            r7 = r4
            r8 = r5
            r11 = r1
            r7.arcTo(r8, r9, r10, r11, r12, r13, r14)
            float r6 = r3.f72080c
            float r14 = r1 - r6
            r4.lineTo(r5, r14)
            float r5 = r3.f72080c
            float r14 = r1 - r5
            r4.moveTo(r2, r14)
            float r5 = r3.f72079b
            float r14 = r1 - r5
            r4.lineTo(r2, r14)
            float r5 = r3.f72079b
            float r5 = r5 + r5
            float r10 = r2 - r5
            float r11 = r1 - r5
            r14 = 0
            r15 = 1119092736(0x42b40000, float:90.0)
            r16 = 1
            r9 = r4
            r12 = r2
            r13 = r1
            r9.arcTo(r10, r11, r12, r13, r14, r15, r16)
            float r5 = r3.f72080c
            float r15 = r2 - r5
            r4.lineTo(r15, r1)
            android.graphics.Paint r1 = r3.f72078a
            r0.drawPath(r4, r1)
            goto L_0x0307
        L_0x0305:
            r17 = r2
        L_0x0307:
            com.google.android.libraries.lens.view.gleam.by r1 = com.google.android.libraries.lens.view.gleam.C26493by.SHADOW_LAYER
            java.lang.String r2 = "drawingGleams"
            android.os.Trace.beginSection(r2)
            r2 = r17
            com.google.android.libraries.lens.view.gleam.ap r3 = r2.f72398d
            com.google.common.b.gu r3 = r3.f72053b
            r4 = r3
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4
            int r4 = r4.f156474d
            r5 = 0
        L_0x031a:
            if (r5 >= r4) goto L_0x033c
            java.lang.Object r6 = r3.get(r5)
            com.google.android.libraries.lens.view.gleam.af r6 = (com.google.android.libraries.lens.view.gleam.C26447af) r6
            com.google.common.b.ij r7 = r6.mo31678v()
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x0339
            boolean r7 = r6 instanceof com.google.android.libraries.lens.view.gleam.C26491bw
            if (r7 == 0) goto L_0x0336
            com.google.android.libraries.lens.view.gleam.bw r6 = (com.google.android.libraries.lens.view.gleam.C26491bw) r6
            r6.mo31743F(r0, r1)
            goto L_0x0339
        L_0x0336:
            r6.mo31665m(r0, r1)
        L_0x0339:
            int r5 = r5 + 1
            goto L_0x031a
        L_0x033c:
            android.os.Trace.endSection()
            java.lang.String r1 = "drawParticles"
            android.os.Trace.beginSection(r1)
            com.google.common.b.gu r1 = r2.f72385D
            r3 = r1
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r4 = 0
        L_0x034c:
            if (r4 >= r3) goto L_0x037f
            java.lang.Object r5 = r1.get(r4)
            com.google.android.libraries.lens.view.gleam.as r5 = (com.google.android.libraries.lens.view.gleam.C26460as) r5
            boolean r6 = r2.f72383B
            if (r6 != 0) goto L_0x035c
            boolean r6 = r5.f72060f
            if (r6 == 0) goto L_0x037c
        L_0x035c:
            p3186j$.util.Objects.requireNonNull(r19)
            android.graphics.PointF r6 = r5.f72055a
            float r6 = r5.f72058d
            android.graphics.Paint r6 = r5.f72059e
            p3186j$.util.Objects.requireNonNull(r6)
            android.graphics.Paint r6 = r5.f72059e
            p3186j$.util.Objects.requireNonNull(r6)
            android.graphics.PointF r6 = r5.f72055a
            float r6 = r6.x
            android.graphics.PointF r7 = r5.f72055a
            float r7 = r7.y
            float r8 = r5.f72058d
            android.graphics.Paint r5 = r5.f72059e
            r0.drawCircle(r6, r7, r8, r5)
        L_0x037c:
            int r4 = r4 + 1
            goto L_0x034c
        L_0x037f:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
        L_0x0386:
            r0 = move-exception
            android.os.Trace.endSection()
            goto L_0x038c
        L_0x038b:
            throw r0
        L_0x038c:
            goto L_0x038b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.GleamingView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo31637f();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo31637f();
        this.f71933a.f72405k.onFocusChanged(z, i, rect);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo31637f();
        C26559ej ejVar = this.f71933a;
        C58485gu guVar = ejVar.f72398d.f72053b;
        int i5 = ((C58724pq) guVar).f156474d;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C26447af) guVar.get(i6)).mo31681y(i, i2);
        }
        C26527de deVar = ejVar.f72391J;
        if (deVar != null) {
            C26540dr drVar = deVar.f72317a;
            C26586ff ffVar = drVar.f72342i;
            ffVar.f72475b = new Size(i, i2);
            ffVar.mo31853e();
            drVar.f72338e.f72312v.mo5708l(C58833ax.m90834k(new Size(i, i2)));
        }
    }

    public GleamingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GleamingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public GleamingView(C47274n nVar) {
        super(nVar);
        mo31637f();
    }
}
