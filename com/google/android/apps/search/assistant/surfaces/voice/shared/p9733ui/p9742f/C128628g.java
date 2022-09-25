package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p098j.C2043bi;
import kotlinx.coroutines.C71808r;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.f.g */
/* compiled from: PG */
public final class C128628g {
    /* renamed from: a */
    public static final Object m209923a(View view, C69577g gVar) {
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        if (!C2043bi.m5570ax(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C128627f(rVar));
        } else {
            rVar.mo61338mb(C69788q.f186170a);
        }
        Object n = rVar.mo63043n();
        return n == C69554a.COROUTINE_SUSPENDED ? n : C69788q.f186170a;
    }

    /* renamed from: b */
    public static final void m209924b(ViewGroup viewGroup, View view, Rect rect) {
        C69664n.m101061g(view, "descendant");
        C69664n.m101061g(rect, "outRect");
        view.getDrawingRect(rect);
        if (!C69664n.m101066l(view, viewGroup)) {
            ViewParent parent = view.getParent();
            while (parent != null && (parent instanceof View) && !C69664n.m101066l(parent, viewGroup)) {
                m209925c(view, rect);
                view = (View) parent;
                parent = view.getParent();
            }
            if (C69664n.m101066l(parent, viewGroup)) {
                m209925c(view, rect);
                return;
            }
            throw new IllegalArgumentException("parameter must be a descendant of receiver view [" + viewGroup + "]");
        }
    }

    /* renamed from: c */
    private static final void m209925c(View view, Rect rect) {
        rect.offset(((int) view.getX()) - view.getScrollX(), ((int) view.getY()) - view.getScrollY());
    }
}
