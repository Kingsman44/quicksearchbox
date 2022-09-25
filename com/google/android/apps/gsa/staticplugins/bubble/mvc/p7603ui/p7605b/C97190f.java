package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97102q;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97084f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97085g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97137ai;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97192c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a.C97160aj;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.libraries.p2460r.p2469c.C32145w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57441dl;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57442dm;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57470en;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.f */
/* compiled from: PG */
public final class C97190f implements C97192c, C97085g {

    /* renamed from: a */
    public static final C57442dm f271543a;

    /* renamed from: j */
    private static final C59071e f271544j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.f");

    /* renamed from: b */
    public final C32145w f271545b;

    /* renamed from: c */
    public final C32145w f271546c;

    /* renamed from: d */
    public C97137ai f271547d;

    /* renamed from: e */
    public final C97102q f271548e;

    /* renamed from: f */
    public final C97040c f271549f;

    /* renamed from: g */
    public C60870cx f271550g = C60856cj.m92900i(C58485gu.m89845m());

    /* renamed from: h */
    public final C97160aj f271551h;

    /* renamed from: i */
    public final C97084f f271552i;

    static {
        C57441dl dlVar = (C57441dl) C57442dm.f153433e.createBuilder();
        dlVar.copyOnWrite();
        C57442dm dmVar = (C57442dm) dlVar.instance;
        dmVar.f153435a |= 1;
        dmVar.f153436b = "TextStyles";
        C57470en enVar = (C57470en) C57472ep.f153516y.createBuilder();
        enVar.copyOnWrite();
        C57472ep epVar = (C57472ep) enVar.instance;
        epVar.f153517a |= 1;
        epVar.f153522f = "LargeColorfulBoldItalicText";
        enVar.copyOnWrite();
        C57472ep epVar2 = (C57472ep) enVar.instance;
        epVar2.f153517a |= 2;
        epVar2.f153524h = -65536;
        dlVar.copyOnWrite();
        C57442dm dmVar2 = (C57442dm) dlVar.instance;
        C57472ep epVar3 = (C57472ep) enVar.build();
        epVar3.getClass();
        dmVar2.mo54486a();
        dmVar2.f153437c.add(epVar3);
        f271543a = (C57442dm) dlVar.build();
    }

    public C97190f(C32145w wVar, C32145w wVar2, C97084f fVar, C97102q qVar, C97040c cVar, C97160aj ajVar) {
        this.f271545b = wVar;
        this.f271546c = wVar2;
        this.f271552i = fVar;
        this.f271548e = qVar;
        this.f271549f = cVar;
        this.f271551h = ajVar;
    }

    /* renamed from: a */
    public final View mo90573a() {
        return this.f271545b.mo37954a();
    }

    /* renamed from: b */
    public final View mo90574b() {
        return this.f271546c.mo37954a();
    }

    /* renamed from: c */
    public final C60870cx mo90575c() {
        if (!this.f271551h.f271485a.mo56113h()) {
            return this.f271550g;
        }
        ((C59052c) ((C59052c) f271544j.mo56226d()).mo56372aa(18446)).mo56386p("Extended bubble VEs requested while they were being collected.");
        int i = C90755l.f253831a;
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* renamed from: d */
    public final void mo90576d() {
    }

    /* renamed from: e */
    public final void mo90577e(C97137ai aiVar) {
        this.f271547d = aiVar;
    }

    /* renamed from: f */
    public final boolean mo90578f() {
        return this.f271552i.f271279e;
    }
}
