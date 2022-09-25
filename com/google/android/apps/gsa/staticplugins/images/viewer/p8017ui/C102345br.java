package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.br */
/* compiled from: PG */
public final class C102345br {

    /* renamed from: a */
    public static final C102345br f285630a = new C102345br();

    /* renamed from: b */
    public final Map f285631b = new HashMap();

    /* renamed from: c */
    public String f285632c;

    private C102345br() {
    }

    /* renamed from: a */
    public final boolean mo93150a(C65930h hVar) {
        Object obj;
        if (this.f285631b.containsKey(hVar.f179303b)) {
            return ((Boolean) this.f285631b.get(hVar.f179303b)).booleanValue();
        }
        C62940bt r0 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r0);
        if (!hVar.f169962ag.mo58857o(r0.f169971d)) {
            return false;
        }
        C62940bt r02 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r02);
        Object l = hVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return ((C65937o) obj).f179341g;
    }
}
