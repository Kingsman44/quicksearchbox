package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114876h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.o */
/* compiled from: PG */
public final /* synthetic */ class C114689o implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114690p f318227a;

    public /* synthetic */ C114689o(C114690p pVar) {
        this.f318227a = pVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114690p pVar = this.f318227a;
        ViewGroup viewGroup = (ViewGroup) pVar.f318231d.inflate(R.layout.ambient_weather_card, (ViewGroup) null);
        C28292j jVar = new C28292j(83312);
        jVar.mo33795i(5);
        C28295m.m52919e(viewGroup, jVar);
        pVar.f318235h = C28293k.m52908e(jVar, new C28293k[0]);
        if (pVar.f318233f.f139569c.size() < 3) {
            C59104x d = C114690p.f318228a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AMWeatherCard");
            ((C59052c) ((C59052c) d).mo56372aa(29268)).mo56386p("No weather forcast for tomorrow.");
            viewGroup.setVisibility(8);
        } else {
            C53230ge geVar = (C53230ge) pVar.f318233f.f139569c.get(2);
            TextView textView = (TextView) viewGroup.findViewById(R.id.amb_weather_disclaimer);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.amb_weather_icon_description);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.amb_weather_icon);
            ((TextView) viewGroup.findViewById(R.id.amb_weather_description)).setText(pVar.f318229b.getResources().getString(R.string.ambient_agenda_tomorrow, new Object[]{geVar.f139506b}));
            ((TextView) viewGroup.findViewById(R.id.amb_weather_detailed_info)).setText(pVar.f318229b.getResources().getString(R.string.ambient_weather_detailed_info, new Object[]{geVar.f139508d, geVar.f139509e, geVar.f139511g}));
            if (pVar.f318233f.f139576j.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setText(pVar.f318233f.f139576j);
                pVar.mo101522g(textView);
            }
            textView2.setText(String.format("%s%s", new Object[]{geVar.f139507c, "°"}));
            ((C91189au) pVar.f318230c.mo27525b()).mo85421i(geVar.f139512h, imageView);
        }
        Context context = pVar.f318229b;
        C114876h.m190421b(context, viewGroup, context.getResources().getString(R.string.ambient_weather_tomorrow), pVar.f318232e);
        viewGroup.getClass();
        return viewGroup;
    }
}
