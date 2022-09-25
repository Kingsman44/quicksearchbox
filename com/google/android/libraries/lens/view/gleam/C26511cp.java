package com.google.android.libraries.lens.view.gleam;

import android.graphics.RectF;
import com.google.android.libraries.lens.view.gleam.region.C26615f;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.gleam.cp */
/* compiled from: PG */
public final /* synthetic */ class C26511cp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72251a;

    public /* synthetic */ C26511cp(C26526dd ddVar) {
        this.f72251a = ddVar;
    }

    public final void run() {
        C58833ax axVar;
        C26526dd ddVar = this.f72251a;
        if (ddVar.f72278A && ddVar.mo31776l()) {
            C26615f fVar = ddVar.f72302l;
            fVar.getClass();
            RectF h = ((C26620k) fVar).f72593f.mo31882h();
            C25664y yVar = ddVar.f72296f;
            float width = h.width() * h.height();
            C58485gu f = yVar.mo30772f();
            int size = f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    axVar = C58836b.f156633a;
                    break;
                }
                C26504ci ciVar = (C26504ci) f.get(i);
                RectF c = ciVar.mo31759c();
                float width2 = c.width() * c.height();
                if (c.intersect(h)) {
                    float width3 = c.width() * c.height();
                    if (width3 / width >= 0.9f && width3 / width2 >= 0.9f) {
                        axVar = C58833ax.m90834k(ciVar);
                        break;
                    }
                }
                i++;
            }
            if (axVar.mo56113h()) {
                ddVar.f72296f.mo30777k();
                ((C26504ci) axVar.mo56107c()).f72224r = true;
                ddVar.mo31805y();
            }
        }
    }
}
