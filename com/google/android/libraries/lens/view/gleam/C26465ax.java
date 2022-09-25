package com.google.android.libraries.lens.view.gleam;

import android.graphics.Paint;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62202ao;
import com.google.lens.p4699e.C62203ap;

/* renamed from: com.google.android.libraries.lens.view.gleam.ax */
/* compiled from: PG */
abstract class C26465ax {
    /* renamed from: e */
    static C58833ax m48855e(C58833ax axVar, Paint paint) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        String f = Float.toString(((Float) axVar.mo56107c()).floatValue());
        return C58833ax.m90834k(new C26549e(((Float) axVar.mo56107c()).floatValue(), f, paint.measureText(f), (-paint.getFontMetrics().ascent) * 0.5f));
    }

    /* renamed from: f */
    static C58833ax m48856f(C26447af afVar) {
        C62203ap apVar;
        C62203ap apVar2;
        for (C62195ah ahVar : afVar.f71963a.f68862w) {
            if (ahVar.f167933a == 3) {
                apVar = (C62203ap) ahVar.f167934b;
            } else {
                apVar = C62203ap.f167949d;
            }
            C62202ao aoVar = apVar.f167953c;
            if (aoVar == null) {
                aoVar = C62202ao.f167942f;
            }
            if ((aoVar.f167944a & 1) != 0) {
                if (ahVar.f167933a == 3) {
                    apVar2 = (C62203ap) ahVar.f167934b;
                } else {
                    apVar2 = C62203ap.f167949d;
                }
                C62202ao aoVar2 = apVar2.f167953c;
                if (aoVar2 == null) {
                    aoVar2 = C62202ao.f167942f;
                }
                return C58833ax.m90834k(Float.valueOf(aoVar2.f167945b));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public abstract float mo31719a();

    /* renamed from: b */
    public abstract float mo31720b();

    /* renamed from: c */
    public abstract float mo31721c();

    /* renamed from: d */
    public abstract String mo31722d();
}
