package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132634a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132638e;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132639f;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ba */
/* compiled from: PG */
public final /* synthetic */ class C132611ba implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53258hf f361910a;

    public /* synthetic */ C132611ba(C53258hf hfVar) {
        this.f361910a = hfVar;
    }

    public final Object apply(Object obj) {
        C53258hf hfVar = this.f361910a;
        C132639f fVar = (C132639f) obj;
        for (int i = 0; i < fVar.f361974b.size(); i++) {
            C53258hf a = C53258hf.m86798a(((C132638e) fVar.f361974b.get(i)).f361969b);
            if (a == null) {
                a = C53258hf.WIDGET_TYPE_UNKNOWN;
            }
            if (a == hfVar) {
                C59104x b = C132613bc.f361914a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
                ((C59052c) ((C59052c) b).mo56372aa(39747)).mo56389s("#clearWeatherDataUpdateTimestamp %s.", hfVar.name());
                C132634a aVar = (C132634a) fVar.toBuilder();
                aVar.copyOnWrite();
                C132639f fVar2 = (C132639f) aVar.instance;
                fVar2.mo110846a();
                fVar2.f361974b.remove(i);
                return (C132639f) aVar.build();
            }
        }
        return fVar;
    }
}
