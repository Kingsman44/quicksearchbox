package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132627b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132628c;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132629d;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132630e;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132631f;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132632g;
import com.google.android.libraries.assistant.pcp.C18525a;
import com.google.android.libraries.assistant.pcp.C18773h;
import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53256hd;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.assistant.p3994s.p3995a.C53259hg;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.an */
/* compiled from: PG */
public final /* synthetic */ class C132595an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361856a;

    public /* synthetic */ C132595an(C132606ay ayVar) {
        this.f361856a = ayVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C132606ay ayVar = this.f361856a;
        C53259hg hgVar = (C53259hg) obj;
        String languageTag = Locale.getDefault().toLanguageTag();
        ((C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39736)).mo56389s("locale: %s", languageTag);
        C59052c cVar = (C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39737);
        C53258hf a = C53258hf.m86798a(hgVar.f139616c);
        if (a == null) {
            a = C53258hf.WIDGET_TYPE_UNKNOWN;
        }
        String name = a.name();
        int b = C53256hd.m86797b(hgVar.f139615b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        String a2 = C53256hd.m86796a(b);
        String str = hgVar.f139618e;
        Integer valueOf = Integer.valueOf(hgVar.f139619f);
        Integer valueOf2 = Integer.valueOf(hgVar.f139620g);
        C63042fg fgVar = hgVar.f139617d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        cVar.mo56362O("requestInfo: widget %s, trigger_type %s, agsa_version %s, square widgets# %s, freeform widgets# %s, last_update_timestamp %s", name, a2, str, valueOf, valueOf2, Long.valueOf(fgVar.f170154a));
        C132632g gVar = ayVar.f361897n;
        if (gVar.f361958b) {
            int b2 = C53256hd.m86797b(hgVar.f139615b);
            if (b2 != 0) {
                i = b2;
            }
            C132629d dVar = gVar.f361957a;
            C53306j jVar = C53306j.UNKNOWNN;
            C18773h c = C18777i.m36178c();
            ((C18525a) c).f52500a = i + -1 != 5 ? 4 : 2;
            c.mo24039a();
            cxVar = C47633f.m84733g(C47633f.m84733g(C60856cj.m92900i(C58485gu.m89845m())).mo51516i(C132627b.f361952a, dVar.f361954a).mo51516i(C132628c.f361953a, dVar.f361954a)).mo51515h(C132630e.f361955a, gVar.f361959c).mo51515h(C132631f.f361956a, gVar.f361959c);
        } else {
            cxVar = C60922j.m93045h(C60922j.m93045h(ayVar.mo110827c(), C47810es.m84966f(new C132592ak(ayVar)), ayVar.f361888e), C47810es.m84966f(new C132602au(ayVar, languageTag, hgVar)), ayVar.f361888e);
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C132598aq(ayVar)), ayVar.f361888e);
    }
}
