package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bu */
/* compiled from: PG */
public final /* synthetic */ class C102348bu implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C102355ca f285634a;

    public /* synthetic */ C102348bu(C102355ca caVar) {
        this.f285634a = caVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        Object obj2;
        C102355ca caVar = this.f285634a;
        Boolean bool = (Boolean) obj;
        long f = caVar.f285642a.mo26874f();
        if (f - caVar.f285648g > 500) {
            caVar.f285648g = f;
            C102328ba e = caVar.mo93152e();
            if (e != null) {
                int i = e.f285585i;
                if (i != -1 && i < e.f285586j.f179291a.size()) {
                    C65926d dVar = e.f285586j;
                    C65930h hVar = (C65930h) dVar.f179291a.get(e.f285585i);
                    C102358cd cdVar = e.f285584h;
                    C65928f fVar = hVar.f179305d;
                    if (fVar == null) {
                        fVar = C65928f.f179293f;
                    }
                    String str2 = fVar.f179296b;
                    C62940bt r3 = C62942bv.checkIsLite(C65937o.f179333l);
                    hVar.mo58887l(r3);
                    if (hVar.f169962ag.mo58857o(r3.f169971d)) {
                        C62940bt r32 = C62942bv.checkIsLite(C65937o.f179333l);
                        hVar.mo58887l(r32);
                        Object l = hVar.f169962ag.mo58854l(r32.f169971d);
                        if (l == null) {
                            obj2 = r32.f169969b;
                        } else {
                            obj2 = r32.mo58889c(l);
                        }
                        str = ((C65937o) obj2).f179338d;
                    } else {
                        str = null;
                    }
                    cdVar.f285657a.mo93141h(cdVar.f285658b, 27, str2, str);
                }
                e.mo93132f(false);
            }
        }
    }
}
