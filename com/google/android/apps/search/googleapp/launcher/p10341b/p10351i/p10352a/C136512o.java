package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.o */
/* compiled from: PG */
public final class C136512o extends C136498af implements C47231d {

    /* renamed from: a */
    public C136521x f371641a;

    public C136512o(C47274n nVar) {
        super(nVar);
        m221852d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final void m221852d() {
        if (this.f371641a == null) {
            try {
                C136523z zVar = (C136523z) mo113096b().mo17653jN();
                C136511n nVar = new C136511n(this);
                C47240i.m84036c(nVar);
                try {
                    C136521x l = zVar.mo113153l();
                    this.f371641a = l;
                    if (l == null) {
                        C47240i.m84035b(nVar);
                    }
                    this.f371641a.f371690I = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f371641a == null) {
                        C47240i.m84035b(nVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C136521x mo17754z() {
        C136521x xVar = this.f371641a;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m221852d();
        C136521x xVar = this.f371641a;
        if (xVar.f371661F && (!C58890d.m90990e(Build.MANUFACTURER, "samsung") || !C58890d.m90990e(Build.DEVICE, "q2q"))) {
            WindowInsets rootWindowInsets = xVar.f371667d.getRootWindowInsets();
            if (Build.VERSION.SDK_INT < 30) {
                windowInsets = xVar.f371667d.getRootWindowInsets().replaceSystemWindowInsets(new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom()));
            } else {
                windowInsets = new WindowInsets.Builder().setInsets(WindowInsets.Type.systemBars(), rootWindowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())).build();
            }
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m221852d();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m221852d();
        C136521x xVar = this.f371641a;
        xVar.mo113133a(motionEvent);
        if (xVar.f371667d.getChildCount() <= 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            if (xVar.f371681r == 1) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 6) {
                            ((C59052c) ((C59052c) C136521x.f371653a.mo56226d()).mo56372aa(40808)).mo56387q("Unidentified action value received: %s", action);
                        } else {
                            xVar.mo113142j(motionEvent);
                            xVar.mo113144l();
                            xVar.f371686w.mo113057a(String.format(Locale.US, "onInterceptTouchEvent: ACTION_POINTER_UP touchState = %d", new Object[]{Integer.valueOf(xVar.f371681r)}));
                        }
                    }
                } else if (xVar.f371680q != -1) {
                    xVar.mo113136d(motionEvent);
                }
            }
            xVar.mo113145m();
            xVar.f371686w.mo113057a(String.format(Locale.US, "onInterceptTouchEvent: ACTION_UP/ACTION_CANCEL touchState = %d, panelPositionRatio= %f, downTime = %d, eventTime = %d, source = %d", new Object[]{Integer.valueOf(xVar.f371681r), Float.valueOf(xVar.f371671h), Long.valueOf(motionEvent.getDownTime()), Long.valueOf(motionEvent.getEventTime()), Integer.valueOf(motionEvent.getSource())}));
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            xVar.f371674k = x;
            xVar.f371675l = y;
            xVar.f371677n = (float) xVar.f371670g;
            xVar.f371678o = x;
            xVar.f371679p = 0.0f;
            xVar.f371680q = motionEvent.getPointerId(0);
            boolean z = xVar.f371683t.f371649b.isEmpty() || Math.abs(xVar.f371683t.f371648a - xVar.f371670g) < xVar.f371656A / 3;
            if (!z || xVar.f371689z) {
                xVar.f371689z = false;
                xVar.mo113149q();
                xVar.f371676m = x;
            }
            xVar.f371686w.mo113057a(String.format(Locale.US, "onInterceptTouchEvent: ACTION_DOWN finishedScrolling = %b, forceDrag = %b, touchState = %d, panelPositionRatio = %f, downTime = %d, eventTime = %d, source = %d", new Object[]{Boolean.valueOf(z), Boolean.valueOf(xVar.f371689z), Integer.valueOf(xVar.f371681r), Float.valueOf(xVar.f371671h), Long.valueOf(motionEvent.getDownTime()), Long.valueOf(motionEvent.getEventTime()), Integer.valueOf(motionEvent.getSource())}));
        }
        return xVar.f371681r != 0;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m221852d();
        C136521x xVar = this.f371641a;
        if (z) {
            xVar.mo113150r();
        }
        View view = xVar.f371669f;
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), xVar.f371669f.getMeasuredHeight());
        }
        View view2 = xVar.f371668e;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = xVar.f371668e.getMeasuredHeight();
            boolean z2 = xVar.f371673j;
            xVar.f371668e.layout(z2 ? measuredWidth : -measuredWidth, 0, z2 ? measuredWidth + measuredWidth : 0, measuredHeight);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m221852d();
        C136521x xVar = this.f371641a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View view = xVar.f371669f;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        View view2 = xVar.f371668e;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        xVar.f371667d.setMeasuredDimension(size, size2);
        xVar.mo113148p((int) (((float) size) * xVar.f371671h));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0135, code lost:
        if (r3 < 0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x019a, code lost:
        if (r3 > 0) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01aa, code lost:
        if (r2.f371670g >= (r2.f371667d.getMeasuredWidth() / 2)) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b0, code lost:
        r2.mo113135c(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r19
            r18.m221852d()
            r1 = r18
            com.google.android.apps.search.googleapp.launcher.b.i.a.x r2 = r1.f371641a
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r3 = r2.f371690I
            super.onTouchEvent(r0)
            android.view.View r3 = r2.f371668e
            if (r3 != 0) goto L_0x001a
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r2 = r2.f371690I
            boolean r0 = super.onTouchEvent(r0)
            goto L_0x024d
        L_0x001a:
            r2.mo113133a(r0)
            int r3 = r19.getAction()
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6 = 5
            r7 = 6
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 1
            if (r4 == 0) goto L_0x01b8
            if (r4 == r12) goto L_0x009c
            if (r4 == r10) goto L_0x0063
            if (r4 == r9) goto L_0x009c
            if (r4 == r7) goto L_0x0043
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136521x.f371653a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Unidentified action value received: %s"
            r4 = 40810(0x9f6a, float:5.7187E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56387q(r2, r3)
            goto L_0x0060
        L_0x0043:
            r2.mo113142j(r0)
            r2.mo113144l()
            com.google.android.apps.search.googleapp.launcher.b.c.f r0 = r2.f371686w
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r12]
            int r2 = r2.f371681r
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r11] = r2
            java.lang.String r2 = "onTouchEvent: ACTION_POINTER_UP touchState = %d"
            java.lang.String r2 = java.lang.String.format(r3, r2, r4)
            r0.mo113057a(r2)
        L_0x0060:
            r0 = 1
            goto L_0x024d
        L_0x0063:
            int r3 = r2.f371681r
            if (r3 != r12) goto L_0x0098
            int r3 = r2.f371680q
            int r3 = r0.findPointerIndex(r3)
            r4 = -1
            if (r3 != r4) goto L_0x0071
            goto L_0x00a0
        L_0x0071:
            float r0 = r0.getX(r3)
            float r3 = r2.f371679p
            float r4 = r2.f371678o
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r3 = r3 + r4
            r2.f371679p = r3
            r2.f371678o = r0
            float r3 = r2.f371676m
            float r0 = r0 - r3
            float r3 = r2.f371677n
            boolean r4 = r2.f371673j
            if (r4 == 0) goto L_0x008e
            float r0 = -r0
        L_0x008e:
            float r3 = r3 + r0
            int r0 = (int) r3
            r2.mo113148p(r0)
            float r0 = r2.f371671h
            r2.f371672i = r0
            goto L_0x0060
        L_0x0098:
            r2.mo113136d(r0)
            goto L_0x0060
        L_0x009c:
            int r3 = r2.f371681r
            if (r3 == r12) goto L_0x00a1
        L_0x00a0:
            goto L_0x0060
        L_0x00a1:
            android.view.VelocityTracker r3 = r2.f371682s
            int r4 = r2.f371657B
            float r4 = (float) r4
            r13 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r13, r4)
            android.view.VelocityTracker r3 = r2.f371682s
            int r4 = r2.f371680q
            float r3 = r3.getXVelocity(r4)
            int r3 = (int) r3
            float r4 = r2.f371679p
            r13 = 1103626240(0x41c80000, float:25.0)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c6
            int r4 = java.lang.Math.abs(r3)
            int r13 = r2.f371658C
            if (r4 <= r13) goto L_0x00c6
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            float r14 = r2.f371679p
            java.lang.Math.abs(r3)
            int r14 = r2.f371658C
            com.google.android.apps.search.googleapp.launcher.b.c.f r14 = r2.f371686w
            java.util.Locale r15 = java.util.Locale.US
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r11] = r13
            float r11 = r2.f371679p
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r5[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r5[r10] = r11
            int r11 = r2.f371681r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5[r9] = r11
            float r11 = r2.f371671h
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r5[r8] = r11
            long r16 = r19.getDownTime()
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
            r5[r6] = r11
            long r16 = r19.getEventTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r5[r7] = r6
            int r0 = r19.getSource()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 7
            r5[r6] = r0
            java.lang.String r0 = "onTouchEvent: ACTION_UP/ACTION_CANCEL isFling = %b, totalMotionX = %.2f, velocity = %d, touchState = %d, panelPositionRatio = %f, downTime = %d, eventTime = %d, source = %d"
            java.lang.String r0 = java.lang.String.format(r15, r0, r5)
            r14.mo113057a(r0)
            r0 = 750(0x2ee, float:1.051E-42)
            if (r4 == 0) goto L_0x019d
            boolean r4 = r2.f371673j
            if (r4 == 0) goto L_0x012b
            int r3 = -r3
        L_0x012b:
            int r4 = java.lang.Math.abs(r3)
            int r5 = r2.f371659D
            if (r4 >= r5) goto L_0x0139
            r2.f371663H = r8
            if (r3 >= 0) goto L_0x01ac
            goto L_0x01b0
        L_0x0139:
            if (r3 >= 0) goto L_0x013e
            int r0 = r2.f371670g
            goto L_0x0147
        L_0x013e:
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r0 = r2.f371667d
            int r0 = r0.getMeasuredWidth()
            int r4 = r2.f371670g
            int r0 = r0 - r4
        L_0x0147:
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r4 = r2.f371667d
            int r4 = r4.getMeasuredWidth()
            float r0 = (float) r0
            float r4 = (float) r4
            float r0 = r0 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r4, r0)
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r4 = r2.f371667d
            int r4 = r4.getMeasuredWidth()
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r5 = r2.f371667d
            int r5 = r5.getMeasuredWidth()
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            float r0 = r0 + r6
            double r6 = (double) r0
            r13 = 4602160705557665991(0x3fde28c7460698c7, double:0.4712389167638204)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r13
            float r0 = (float) r6
            double r6 = (double) r0
            double r6 = java.lang.Math.sin(r6)
            int r0 = java.lang.Math.abs(r3)
            int r4 = r4 / r10
            float r4 = (float) r4
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r5 = r2.f371660E
            int r0 = java.lang.Math.max(r5, r0)
            float r0 = (float) r0
            float r4 = r4 / r0
            float r0 = java.lang.Math.abs(r4)
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 * 4
            r2.f371663H = r9
            if (r3 <= 0) goto L_0x01b0
            goto L_0x01ac
        L_0x019d:
            float r3 = r2.f371671h
            r2.f371663H = r8
            int r3 = r2.f371670g
            com.google.android.apps.search.googleapp.launcher.b.i.a.o r4 = r2.f371667d
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 / r10
            if (r3 < r4) goto L_0x01b0
        L_0x01ac:
            r2.mo113143k(r0)
            goto L_0x01b3
        L_0x01b0:
            r2.mo113135c(r0)
        L_0x01b3:
            r2.mo113145m()
            goto L_0x0060
        L_0x01b8:
            float r3 = r19.getX()
            float r4 = r19.getY()
            r2.f371674k = r3
            r2.f371675l = r4
            int r4 = r2.f371670g
            float r4 = (float) r4
            r2.f371677n = r4
            r2.f371678o = r3
            r4 = 0
            r2.f371679p = r4
            int r4 = r0.getPointerId(r11)
            r2.f371680q = r4
            com.google.android.apps.search.googleapp.launcher.b.i.a.w r4 = r2.f371683t
            int r4 = r4.f371648a
            int r5 = r2.f371670g
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)
            com.google.android.apps.search.googleapp.launcher.b.i.a.w r5 = r2.f371683t
            j$.util.Optional r5 = r5.f371649b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01f1
            int r5 = r2.f371656A
            int r5 = r5 / r9
            if (r4 >= r5) goto L_0x01ef
            goto L_0x01f1
        L_0x01ef:
            r4 = 0
            goto L_0x01f2
        L_0x01f1:
            r4 = 1
        L_0x01f2:
            if (r4 == 0) goto L_0x01f8
            boolean r5 = r2.f371689z
            if (r5 == 0) goto L_0x01ff
        L_0x01f8:
            r2.f371689z = r11
            r2.mo113149q()
            r2.f371676m = r3
        L_0x01ff:
            com.google.android.apps.search.googleapp.launcher.b.c.f r3 = r2.f371686w
            java.util.Locale r5 = java.util.Locale.US
            r13 = 7
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13[r11] = r4
            boolean r4 = r2.f371689z
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13[r12] = r4
            int r4 = r2.f371681r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r10] = r4
            float r2 = r2.f371671h
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r13[r9] = r2
            long r9 = r19.getDownTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r13[r8] = r2
            long r8 = r19.getEventTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r13[r6] = r2
            int r0 = r19.getSource()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r7] = r0
            java.lang.String r0 = "onTouchEvent: ACTION_DOWN finishedScrolling = %b, forceDrag = %b, touchState = %d, panelPositionRatio = %f, downTime = %d, eventTime = %d, source = %s"
            java.lang.String r0 = java.lang.String.format(r5, r0, r13)
            r3.mo113057a(r0)
            goto L_0x0060
        L_0x024d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
