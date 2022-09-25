package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import androidx.core.p097i.C1966a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.x */
/* compiled from: PG */
public final /* synthetic */ class C116068x implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321837a;

    /* renamed from: b */
    public final /* synthetic */ String f321838b;

    public /* synthetic */ C116068x(C116070z zVar, String str) {
        this.f321837a = zVar;
        this.f321838b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116070z zVar = this.f321837a;
        String str = this.f321838b;
        C116046b bVar = zVar.f321843d;
        C58976aa aaVar = C58975e.f156826a;
        C22831b bVar2 = C22831b.f62860b;
        C58833ax axVar = C58836b.f156633a;
        try {
            axVar = bVar.mo102428a(str);
        } catch (SecurityException e) {
            C59104x c = C116046b.f321792a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RecentlyDataStorage");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30915)).mo56386p("SecurityException when reading data.");
        }
        if (!axVar.mo56113h() || !((File) axVar.mo56107c()).exists()) {
            File file = new File(bVar.mo102429b(), str);
            if (file.exists()) {
                axVar = C58833ax.m90834k(file);
            }
            C60870cx p = zVar.mo102446p();
            C116049e eVar = new C116049e(zVar, bVar2, str);
            C60870cx g = C60922j.m93044g(p, C47810es.m84963c(eVar), zVar.f321844e);
            C116050f fVar = new C116050f(zVar);
            C60922j.m93045h(g, C47810es.m84966f(fVar), zVar.f321844e);
            return g;
        }
        try {
            bVar2 = (C22831b) C62942bv.parseFrom((C62942bv) C22831b.f62860b, new C1966a((File) axVar.mo56107c()).mo5122d());
        } catch (IOException e2) {
            C59104x c2 = C116046b.f321792a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "RecentlyDataStorage");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(30914)).mo56386p("Exception when reading data");
        }
        C60870cx p2 = zVar.mo102446p();
        C116049e eVar2 = new C116049e(zVar, bVar2, str);
        C60870cx g2 = C60922j.m93044g(p2, C47810es.m84963c(eVar2), zVar.f321844e);
        C116050f fVar2 = new C116050f(zVar);
        C60922j.m93045h(g2, C47810es.m84966f(fVar2), zVar.f321844e);
        return g2;
    }
}
