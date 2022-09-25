package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132634a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132637d;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132638e;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132639f;
import com.google.android.libraries.p1635au.C19569f;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.az */
/* compiled from: PG */
public final /* synthetic */ class C132607az implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132613bc f361904a;

    /* renamed from: b */
    public final /* synthetic */ C53258hf f361905b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f361906c;

    public /* synthetic */ C132607az(C132613bc bcVar, C53258hf hfVar, C63042fg fgVar) {
        this.f361904a = bcVar;
        this.f361905b = hfVar;
        this.f361906c = fgVar;
    }

    public final Object apply(Object obj) {
        C132613bc bcVar = this.f361904a;
        C53258hf hfVar = this.f361905b;
        C63042fg fgVar = this.f361906c;
        C132639f fVar = (C132639f) obj;
        int i = 0;
        while (i < fVar.f361974b.size()) {
            C132638e eVar = (C132638e) fVar.f361974b.get(i);
            C53258hf a = C53258hf.m86798a(eVar.f361969b);
            if (a == null) {
                a = C53258hf.WIDGET_TYPE_UNKNOWN;
            }
            if (a != hfVar) {
                i++;
            } else {
                C63042fg fgVar2 = eVar.f361970c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                C59104x b = C132613bc.f361914a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
                int i2 = i;
                ((C59052c) ((C59052c) b).mo56372aa(39753)).mo56360M("#updateLastPeriodicBroadcastTimestamp %s. %s minutes since last periodic update broadcast. Last timestamp %s. New timestamp %s.", hfVar.name(), Long.valueOf(C62948a.m95454e(C62953e.m95480e(fgVar2, fgVar))), Long.valueOf(fgVar2.f170154a), Long.valueOf(fgVar.f170154a));
                C132610b bVar = bcVar.f361915b;
                Duration d = C62950b.m95473d(C62953e.m95480e(fgVar2, fgVar));
                if (d.compareTo(C132610b.f361907a) >= 0) {
                    ((C19569f) bVar.f361909b.f103004dc.mo6453a()).mo24824b((double) d.toSeconds(), hfVar.name());
                }
                C132634a aVar = (C132634a) fVar.toBuilder();
                C132637d dVar = (C132637d) C132638e.f361966d.createBuilder();
                dVar.copyOnWrite();
                C132638e eVar2 = (C132638e) dVar.instance;
                eVar2.f361969b = hfVar.f139611e;
                eVar2.f361968a |= 1;
                dVar.copyOnWrite();
                C132638e eVar3 = (C132638e) dVar.instance;
                fgVar.getClass();
                eVar3.f361970c = fgVar;
                eVar3.f361968a |= 2;
                C132638e eVar4 = (C132638e) dVar.build();
                aVar.copyOnWrite();
                C132639f fVar2 = (C132639f) aVar.instance;
                eVar4.getClass();
                fVar2.mo110846a();
                fVar2.f361974b.set(i2, eVar4);
                return (C132639f) aVar.build();
            }
        }
        C59104x b2 = C132613bc.f361914a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
        ((C59052c) ((C59052c) b2).mo56372aa(39752)).mo56353F("#updateLastPeriodicBroadcastTimestamp %s. First periodic update broadcast. Timestamp %s.", hfVar.name(), fgVar.f170154a);
        C132634a aVar2 = (C132634a) fVar.toBuilder();
        C132637d dVar2 = (C132637d) C132638e.f361966d.createBuilder();
        dVar2.copyOnWrite();
        C132638e eVar5 = (C132638e) dVar2.instance;
        eVar5.f361969b = hfVar.f139611e;
        eVar5.f361968a |= 1;
        dVar2.copyOnWrite();
        C132638e eVar6 = (C132638e) dVar2.instance;
        fgVar.getClass();
        eVar6.f361970c = fgVar;
        eVar6.f361968a |= 2;
        C132638e eVar7 = (C132638e) dVar2.build();
        aVar2.copyOnWrite();
        C132639f fVar3 = (C132639f) aVar2.instance;
        eVar7.getClass();
        fVar3.mo110846a();
        fVar3.f361974b.add(eVar7);
        return (C132639f) aVar2.build();
    }
}
