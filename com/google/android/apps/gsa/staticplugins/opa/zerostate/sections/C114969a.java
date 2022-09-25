package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114876h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.assistant.p3994s.p3995a.C53418nd;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.a */
/* compiled from: PG */
public final /* synthetic */ class C114969a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C115050d f319077a;

    public /* synthetic */ C114969a(C115050d dVar) {
        this.f319077a = dVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C115050d dVar = this.f319077a;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(dVar.f319366c).inflate(R.layout.ambient_header_view, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(R.id.ambient_header_clock_text);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ambient_header_weather_widget);
        dVar.f319373j = textView;
        dVar.mo101824h();
        C28292j jVar = new C28292j(77130);
        jVar.mo33795i(5);
        textView.getClass();
        C28295m.m52919e(textView, jVar);
        dVar.f319370g.add(C28293k.m52908e(jVar, new C28293k[0]));
        textView.setOnClickListener(new C89943l(new C114996b(dVar)));
        dVar.f319375l.mo26881h(dVar.f319369f);
        dVar.f319375l.mo26880g(dVar.f319369f);
        if (!dVar.f319368e.mo101781a().mo56113h() || !((C114994ay) dVar.f319368e.mo101781a().mo56107c()).mo101806d().mo56113h() || (((C53418nd) ((C114994ay) dVar.f319368e.mo101781a().mo56107c()).mo101806d().mo56107c()).f140161a & 1) == 0) {
            C59104x d = C115050d.f319364a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbientHeaderSC");
            ((C59052c) ((C59052c) d).mo56372aa(29445)).mo56386p("#setWeatherWidget(): missing weather widget.");
        } else {
            C52013hl hlVar = ((C53418nd) ((C114994ay) dVar.f319368e.mo101781a().mo56107c()).mo101806d().mo56107c()).f140162b;
            if (hlVar == null) {
                hlVar = C52013hl.f136508e;
            }
            dVar.f319367d.mo101628a(hlVar, (ImageView) viewGroup2.findViewById(R.id.ambient_header_weather_icon));
            dVar.f319367d.mo101629b(hlVar, (TextView) viewGroup2.findViewById(R.id.ambient_header_weather_description));
            C28292j jVar2 = new C28292j(75924);
            jVar2.mo33795i(5);
            viewGroup2.getClass();
            C28295m.m52919e(viewGroup2, jVar2);
            dVar.f319370g.add(C28293k.m52908e(jVar2, new C28293k[0]));
            Context context = dVar.f319365b;
            C114876h.m190421b(context, viewGroup2, context.getString(R.string.ambient_what_is_the_weather), dVar.f319371h);
        }
        C28292j jVar3 = new C28292j(75845);
        dVar.f319374k = C28293k.m52907d(jVar3, dVar.f319370g);
        viewGroup.getClass();
        C28295m.m52919e(viewGroup, jVar3);
        return viewGroup;
    }
}
