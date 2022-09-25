package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.lens.view.gleam.C26559ej;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2154p.p2155a.C27535e;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.ei */
/* compiled from: PG */
final class C26558ei extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ GleamingView f72380a;

    public C26558ei(GleamingView gleamingView) {
        this.f72380a = gleamingView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C26559ej e = this.f72380a.mo17754z();
        PointF c = e.mo31824c(motionEvent);
        C26637y yVar = e.f72417w;
        float a = e.mo31819a();
        if (yVar.mo31919d()) {
            C27535e eVar = (C27535e) yVar.f72644b.mo27525b();
            eVar.mo33089a();
            eVar.f75317d = eVar.f75315b;
            if (((C27535e) yVar.f72644b.mo27525b()).mo33094f(c.x, c.y, a)) {
                if (((C27535e) yVar.f72644b.mo27525b()).mo33092d()) {
                    yVar.f72645c.mo19974a(C37194a.f98488ay);
                    return true;
                } else if (!((C27535e) yVar.f72644b.mo27525b()).mo33093e()) {
                    return true;
                } else {
                    yVar.f72645c.mo19974a(C37194a.f98438aA);
                    return true;
                }
            }
        }
        C58833ax e2 = e.mo31826e(motionEvent.getX(), motionEvent.getY());
        if (!e2.mo56113h()) {
            return false;
        }
        if (!e.f72382A) {
            return true;
        }
        C25349y a2 = C25349y.m46667a(((C26441a) e2.mo56107c()).f71963a.f68848i);
        if (a2 == null) {
            a2 = C25349y.UNRECOGNIZED;
        }
        if (a2 != C25349y.TEXT_GLEAM) {
            return true;
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C26559ej e = this.f72380a.mo17754z();
        PointF c = e.mo31824c(motionEvent2);
        C26637y yVar = e.f72417w;
        float f3 = c.x;
        float f4 = c.y;
        float a = e.mo31819a();
        if (!yVar.mo31918c()) {
            z = false;
        } else {
            z = ((C27535e) yVar.f72644b.mo27525b()).mo33094f(f3, f4, a);
        }
        if (z) {
            C47393f.m84237h(new C26559ej.C26560a(), e.f72403i);
        }
        return z;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C26559ej e = this.f72380a.mo17754z();
        C58833ax e2 = e.mo31826e(motionEvent.getX(), motionEvent.getY());
        if (!e2.mo56113h()) {
            return false;
        }
        if (e.f72382A) {
            C25349y a = C25349y.m46667a(((C26441a) e2.mo56107c()).f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (a == C25349y.TEXT_GLEAM) {
                return false;
            }
        }
        C25349y a2 = C25349y.m46667a(((C26441a) e2.mo56107c()).f71963a.f68848i);
        if (a2 == null) {
            a2 = C25349y.UNRECOGNIZED;
        }
        C47393f.m84237h(new C26559ej.C26561b((C26441a) e2.mo56107c(), a2 == C25349y.TEXT_GLEAM ? e.mo31824c(motionEvent) : ((C26441a) e2.mo56107c()).mo31653c()), e.f72403i);
        return true;
    }
}
