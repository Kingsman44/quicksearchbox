package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bu */
/* compiled from: PG */
public final class C23702bu extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public boolean f64825a;

    /* renamed from: b */
    final /* synthetic */ C23707bz f64826b;

    /* renamed from: c */
    private final View f64827c;

    public C23702bu(C23707bz bzVar, View view) {
        C69664n.m101061g(view, "view");
        this.f64826b = bzVar;
        this.f64827c = view;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C69664n.m101061g(motionEvent, "e");
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C69664n.m101061g(motionEvent, "e");
        if (!this.f64825a) {
            ((C23674at) this.f64826b.mo29054f()).f64756g.mo29113d(this.f64826b.mo29054f());
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C69664n.m101061g(motionEvent, "e1");
        C69664n.m101061g(motionEvent2, "e2");
        Drawable drawable = null;
        if (!this.f64825a) {
            this.f64827c.getParent().requestDisallowInterceptTouchEvent(true);
            C23707bz bzVar = this.f64826b;
            ((C23674at) bzVar.mo29054f()).f64737A = true;
            C23656ab f3 = bzVar.mo29054f();
            Context context = bzVar.f64842h;
            if (context == null) {
                C69664n.m101065k("context");
                context = null;
            }
            f3.mo29004d((float) context.getResources().getDimensionPixelSize(R.dimen.control_status_expanded));
            this.f64825a = true;
        }
        int width = (int) (((f * ((float) (this.f64827c.getLayoutDirection() != 1 ? -1 : 1))) / ((float) this.f64827c.getWidth())) * 10000.0f);
        C23707bz bzVar2 = this.f64826b;
        Drawable drawable2 = bzVar2.f64836b;
        if (drawable2 == null) {
            C69664n.m101065k("clipLayer");
        } else {
            drawable = drawable2;
        }
        bzVar2.mo29056h(drawable.getLevel() + width, true, true);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.home.coreui.devicetile.model.Control} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "e"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            com.google.android.libraries.home.coreui.devicetile.bz r6 = r5.f64826b
            boolean r0 = r6.f64844j
            r1 = 0
            if (r0 == 0) goto L_0x0030
            com.google.android.libraries.home.coreui.devicetile.ab r6 = r6.mo29054f()
            com.google.android.libraries.home.coreui.devicetile.at r6 = (com.google.android.libraries.home.coreui.devicetile.C23674at) r6
            com.google.android.libraries.home.coreui.devicetile.n r6 = r6.f64756g
            com.google.android.libraries.home.coreui.devicetile.bz r0 = r5.f64826b
            com.google.android.libraries.home.coreui.devicetile.ab r0 = r0.mo29054f()
            com.google.android.libraries.home.coreui.devicetile.bz r2 = r5.f64826b
            java.lang.String r2 = r2.f64837c
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "templateId"
            p5462h.p5473f.p5475b.C69664n.m101065k(r2)
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            com.google.android.libraries.home.coreui.devicetile.bz r2 = r5.f64826b
            boolean r2 = r2.f64843i
            r6.mo29116g(r0, r1, r2)
            r6 = 1
            goto L_0x005f
        L_0x0030:
            com.google.android.libraries.home.coreui.devicetile.ab r6 = r6.mo29054f()
            com.google.android.libraries.home.coreui.devicetile.at r6 = (com.google.android.libraries.home.coreui.devicetile.C23674at) r6
            com.google.android.libraries.home.coreui.devicetile.n r6 = r6.f64756g
            com.google.android.libraries.home.coreui.devicetile.bz r0 = r5.f64826b
            com.google.android.libraries.home.coreui.devicetile.ab r0 = r0.mo29054f()
            com.google.android.libraries.home.coreui.devicetile.bz r2 = r5.f64826b
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = r2.f64838d
            java.lang.String r3 = "control"
            if (r2 != 0) goto L_0x004a
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)
            r2 = r1
        L_0x004a:
            com.google.android.libraries.home.coreui.devicetile.a.d r2 = r2.f64889g
            java.lang.String r2 = r2.mo28966a()
            com.google.android.libraries.home.coreui.devicetile.bz r4 = r5.f64826b
            com.google.android.libraries.home.coreui.devicetile.model.Control r4 = r4.f64838d
            if (r4 != 0) goto L_0x005a
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)
            goto L_0x005b
        L_0x005a:
            r1 = r4
        L_0x005b:
            r6.mo29117h(r0, r2, r1)
            r6 = 0
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.devicetile.C23702bu.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
