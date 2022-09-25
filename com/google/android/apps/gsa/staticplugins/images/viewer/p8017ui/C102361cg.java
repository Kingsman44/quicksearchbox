package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89945m;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.cg */
/* compiled from: PG */
public final class C102361cg implements C102360cf {
    /* renamed from: i */
    private static C60321oe m169687i(C60321oe oeVar, String str, String str2) {
        aqm aqm = oeVar.f163230e;
        if (aqm == null) {
            aqm = aqm.f159760n;
        }
        aql aql = (aql) aqm.toBuilder();
        if (str != null) {
            aql.copyOnWrite();
            aqm aqm2 = (aqm) aql.instance;
            aqm2.f159762a |= 1024;
            aqm2.f159771j = str;
        }
        if (str2 != null) {
            aql.copyOnWrite();
            aqm aqm3 = (aqm) aql.instance;
            aqm3.f159762a |= 2048;
            aqm3.f159772k = str2;
        }
        C60320od odVar = (C60320od) oeVar.toBuilder();
        aqm aqm4 = (aqm) aql.build();
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        aqm4.getClass();
        oeVar2.f163230e = aqm4;
        oeVar2.f163226a |= 16;
        return (C60321oe) odVar.build();
    }

    /* renamed from: a */
    public final void mo93134a(View view) {
        mo93141h(view, 5, (String) null, (String) null);
    }

    /* renamed from: b */
    public final void mo93135b(View view) {
        C89949q.m146521e(C28285c.m52874a(view, 472), false);
    }

    /* renamed from: c */
    public final void mo93136c(View view, View view2) {
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(view), view2), false);
    }

    /* renamed from: d */
    public final void mo93137d(C60321oe oeVar) {
        C89949q.m146521e(oeVar, false);
    }

    /* renamed from: e */
    public final void mo93138e(View view, View.OnClickListener onClickListener) {
        C60321oe i = C28285c.m52882i(view, 5, (Integer) null);
        if (i != null) {
            onClickListener = new C89945m(i, onClickListener);
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: f */
    public final void mo93139f(View view, C65930h hVar, View.OnClickListener onClickListener) {
        mo93140g(view, view, hVar, onClickListener);
    }

    /* renamed from: g */
    public final void mo93140g(View view, View view2, C65930h hVar, View.OnClickListener onClickListener) {
        String str;
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r0);
        if (hVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r02);
            Object l = hVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            str = ((C65937o) obj).f179338d;
        } else {
            str = null;
        }
        C65928f fVar = hVar.f179305d;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        String str2 = fVar.f179296b;
        C60321oe i = C28285c.m52882i(view2, 5, (Integer) null);
        if (i != null) {
            i = m169687i(i, str2, str);
        }
        if (i != null) {
            onClickListener = new C89945m(i, onClickListener);
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: h */
    public final void mo93141h(View view, int i, String str, String str2) {
        C60321oe i2 = C28285c.m52882i(view, i, (Integer) null);
        if (i2 != null) {
            C89949q.m146521e(m169687i(i2, str, str2), false);
        }
    }
}
