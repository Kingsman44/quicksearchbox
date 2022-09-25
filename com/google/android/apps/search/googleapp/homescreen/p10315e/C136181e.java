package com.google.android.apps.search.googleapp.homescreen.p10315e;

import android.view.View;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.xblend.p10707b.C142269a;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.apps.search.xblend.p10708c.C142274d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58495hd;
import com.google.p4283bv.p4287b.p4342b.C56941e;
import com.google.p4283bv.p4287b.p4342b.C56942f;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4287b.p4342b.C56945i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.e */
/* compiled from: PG */
final class C136181e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C136183g f370863a;

    public C136181e(C136183g gVar) {
        this.f370863a = gVar;
    }

    public final void onClick(View view) {
        C136183g gVar = this.f370863a;
        if (gVar.f370875j) {
            C142269a aVar = gVar.f370874i;
            C142271a aVar2 = (C142271a) C142272b.f385977e.createBuilder();
            C69664n.m101060f(aVar2, "newBuilder()");
            C142274d a = C69664n.m101061g(aVar2, "builder");
            C56942f fVar = (C56942f) C56943g.f151982f.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C56945i a2 = C69664n.m101061g(fVar, "builder");
            a2.mo54439b("https://www.google.com/httpservice/retry/WeatherAppService/GetWeatherApp");
            a2.mo54440c(C56941e.PLATFORM_GWS);
            a2.mo54441d();
            a.mo117100b(a2.mo54438a());
            a.mo117102d();
            a.mo117101c();
            aVar.mo41490e(a.mo117099a());
            return;
        }
        C47393f.m84237h(C139762c.m227231c(this.f370863a.f370867b.getString(R.string.weather_search_text), C58495hd.m89900n("ved", C28294l.m52913c(gVar.f370872g.mo33851a(C28485y.m53234a(view))))), view);
    }
}
