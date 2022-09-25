package com.google.android.libraries.lens.view.gleam;

import android.graphics.Paint;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62202ao;
import com.google.lens.p4699e.C62203ap;

/* renamed from: com.google.android.libraries.lens.view.gleam.az */
/* compiled from: PG */
abstract class C26467az {
    /* renamed from: d */
    static C58833ax m48866d(C58833ax axVar, Paint paint) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        String str = (String) axVar.mo56107c();
        if (str.length() > 32) {
            str = String.valueOf(str.substring(0, 29)).concat("…");
        }
        return C58833ax.m90834k(new C26598g((String) axVar.mo56107c(), str, paint.measureText(str)));
    }

    /* renamed from: e */
    static C58833ax m48867e(C26447af afVar) {
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
            if ((aoVar.f167944a & 4) != 0) {
                if (ahVar.f167933a == 3) {
                    apVar2 = (C62203ap) ahVar.f167934b;
                } else {
                    apVar2 = C62203ap.f167949d;
                }
                C62202ao aoVar2 = apVar2.f167953c;
                if (aoVar2 == null) {
                    aoVar2 = C62202ao.f167942f;
                }
                return C58833ax.m90834k(aoVar2.f167947d);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public abstract float mo31726a();

    /* renamed from: b */
    public abstract String mo31727b();

    /* renamed from: c */
    public abstract String mo31728c();
}
