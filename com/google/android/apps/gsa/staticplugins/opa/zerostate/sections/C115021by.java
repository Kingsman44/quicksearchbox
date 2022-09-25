package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114822bs;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.assistant.p3897e.p3921j.p3926e.C52015hn;
import com.google.assistant.p3994s.p3995a.C53418nd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.by */
/* compiled from: PG */
public final class C115021by extends C114989at {

    /* renamed from: h */
    private final C114994ay f319275h;

    public C115021by(Context context, C114822bs bsVar, C58833ax axVar, C114994ay ayVar, C91097g gVar) {
        super(context, bsVar, gVar, axVar);
        this.f319275h = ayVar;
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319154f == null) {
            this.f319154f = LayoutInflater.from(this.f319149a).inflate(R.layout.contextual_greeting_section_vertical_view, (ViewGroup) null);
            TextView textView = (TextView) this.f319154f.findViewById(R.id.contextual_temperature_message);
            ImageView imageView = (ImageView) this.f319154f.findViewById(R.id.contextual_greeting_weather_icon);
            TextView textView2 = (TextView) this.f319154f.findViewById(R.id.contextual_weather_description);
            if (this.f319275h.mo101806d().mo56113h() && (((C53418nd) this.f319275h.mo101806d().mo56107c()).f140161a & 1) != 0) {
                C52013hl hlVar = ((C53418nd) this.f319275h.mo101806d().mo56107c()).f140162b;
                if (hlVar == null) {
                    hlVar = C52013hl.f136508e;
                }
                this.f319151c.mo101629b(hlVar, textView);
                C28292j jVar = new C28292j(61897);
                jVar.mo33795i(5);
                this.f319152d.add(C28293k.m52908e(jVar, new C28293k[0]));
                textView.getClass();
                C28295m.m52919e(textView, jVar);
                mo101802h(textView);
                this.f319151c.mo101628a(hlVar, imageView);
                C28292j jVar2 = new C28292j(61898);
                jVar2.mo33795i(5);
                this.f319152d.add(C28293k.m52908e(jVar2, new C28293k[0]));
                imageView.getClass();
                C28295m.m52919e(imageView, jVar2);
                mo101802h(imageView);
                C52015hn hnVar = hlVar.f136512c;
                if (hnVar == null) {
                    hnVar = C52015hn.f136515e;
                }
                if ((hnVar.f136517a & 1) != 0) {
                    C52015hn hnVar2 = hlVar.f136512c;
                    if (hnVar2 == null) {
                        hnVar2 = C52015hn.f136515e;
                    }
                    textView2.setText(hnVar2.f136518b);
                } else {
                    ((C59052c) ((C59052c) C114822bs.f318591a.mo56226d()).mo56372aa(29571)).mo56386p("setWeatherDescriptionView: missing weather description.");
                }
                C28292j jVar3 = new C28292j(61899);
                jVar3.mo33795i(5);
                this.f319152d.add(C28293k.m52908e(jVar3, new C28293k[0]));
                textView2.getClass();
                C28295m.m52919e(textView2, jVar3);
                mo101802h(textView2);
            }
        }
        mo101803j();
        View view = this.f319154f;
        view.getClass();
        return view;
    }
}
