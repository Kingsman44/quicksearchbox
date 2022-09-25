package com.google.android.apps.search.googleapp.search.suggest.plugins.p10455b.p10456a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p395al.p417d.p418a.p421b.C8564q;
import com.google.p395al.p417d.p418a.p421b.C8570w;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.b.a.a */
/* compiled from: PG */
public final class C138148a extends C46756m {
    static {
        C58974d.m91134h("WeatherViewBinder");
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_weather_suggestion, viewGroup, false);
        C69664n.m101060f(inflate, "from(parent.getContext()…* attachToRoot= */ false)");
        return inflate;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C8570w wVar;
        C138015ag agVar = (C138015ag) obj;
        C69664n.m101061g(view, "view");
        C69664n.m101061g(agVar, "container");
        if (agVar.f375483c.size() == 1) {
            C138030av avVar = (C138030av) agVar.f375483c.get(0);
            C69664n.m101060f(avVar, "container.getSuggestion(0)");
            C54228aq aqVar = avVar.f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            C8564q qVar = aqVar.f142349u;
            if (qVar == null) {
                qVar = C8564q.f29673c;
            }
            if (qVar.f29675a == 8) {
                wVar = (C8570w) qVar.f29676b;
            } else {
                wVar = C8570w.f29681a;
            }
            C69664n.m101060f(wVar, "suggestion.serverSuggest…ters().getWeatherAnswer()");
            return;
        }
        int size = agVar.f375483c.size();
        throw new IllegalArgumentException("Expected exactly 1 suggestion but received " + size);
    }
}
