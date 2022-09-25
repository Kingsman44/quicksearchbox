package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106062r;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ii */
/* compiled from: PG */
public final class C109274ii extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final float f304399a;

    /* renamed from: b */
    private final float f304400b;

    /* renamed from: c */
    private final GestureDetector.SimpleOnGestureListener f304401c;

    /* renamed from: d */
    private final C113989h f304402d;

    /* renamed from: e */
    private final C109042fl f304403e;

    /* renamed from: f */
    private final C108230ba f304404f;

    /* renamed from: g */
    private final C107659as f304405g;

    /* renamed from: h */
    private final C86124t f304406h;

    /* renamed from: i */
    private final C106062r f304407i;

    public C109274ii(GestureDetector.SimpleOnGestureListener simpleOnGestureListener, C108230ba baVar, C109042fl flVar, C113989h hVar, Context context, C107659as asVar, C86124t tVar, C106062r rVar) {
        this.f304401c = simpleOnGestureListener;
        this.f304402d = hVar;
        this.f304403e = flVar;
        this.f304404f = baVar;
        this.f304399a = C91115n.m148870b((float) ((int) tVar.mo79743a(C90014bt.f247213cs)), context);
        this.f304400b = C91115n.m148870b((float) ((int) tVar.mo79743a(C90014bt.f247214ct)), context);
        this.f304405g = asVar;
        this.f304406h = tVar;
        this.f304407i = rVar;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y = motionEvent2.getY();
        float y2 = motionEvent.getY();
        C58976aa aaVar = C58975e.f156826a;
        if (y - y2 > this.f304399a && f2 > this.f304400b && !this.f304404f.mo95399aj() && !this.f304402d.mo100913dr() && !this.f304407i.mo95240v() && !this.f304402d.mo100885cZ() && !this.f304402d.mo100904da() && !this.f304402d.mo100912dq() && ((this.f304406h.mo79746e(C90063do.f249383cW) && this.f304406h.mo79746e(C90063do.f249273aS)) || !this.f304405g.mo96131aD())) {
            this.f304403e.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_FLING);
        }
        return this.f304401c.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f304402d.mo100849bK(motionEvent, motionEvent2, f, f2);
        if (this.f304402d.mo100902dF(motionEvent, motionEvent2)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return this.f304401c.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
