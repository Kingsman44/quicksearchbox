package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132634a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132635b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132636c;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132639f;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132641h;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bb */
/* compiled from: PG */
public final /* synthetic */ class C132612bb implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132613bc f361911a;

    /* renamed from: b */
    public final /* synthetic */ C63042fg f361912b;

    /* renamed from: c */
    public final /* synthetic */ int f361913c;

    public /* synthetic */ C132612bb(C132613bc bcVar, int i, C63042fg fgVar) {
        this.f361911a = bcVar;
        this.f361913c = i;
        this.f361912b = fgVar;
    }

    public final Object apply(Object obj) {
        C132613bc bcVar = this.f361911a;
        int i = this.f361913c;
        C63042fg fgVar = this.f361912b;
        C132639f fVar = (C132639f) obj;
        for (int i2 = 0; i2 < fVar.f361976d.size(); i2++) {
            C132636c cVar = (C132636c) fVar.f361976d.get(i2);
            int b = C132641h.m215616b(cVar.f361964b);
            if (b == 0) {
                b = 1;
            }
            if (b == i) {
                C59104x b2 = C132613bc.f361914a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
                C59052c cVar2 = (C59052c) ((C59052c) b2).mo56372aa(39749);
                String a = C132641h.m215615a(i);
                C63042fg fgVar2 = cVar.f361965c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                cVar2.mo56353F("#updateLastActivityForUIType, found last activity of %s stored in dataStore with timestamp %d.", a, fgVar2.f170154a);
                C63042fg fgVar3 = cVar.f361965c;
                if (fgVar3 == null) {
                    fgVar3 = C63042fg.f170152c;
                }
                if (C62953e.m95476a(C62953e.m95481f(C62953e.m95486k(fgVar3.f170154a, 0), C62948a.m95457h(24)), fgVar) >= 0) {
                    C59104x b3 = C132613bc.f361914a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
                    ((C59052c) ((C59052c) b3).mo56372aa(39751)).mo56386p("#updateLastActivityForUIType, stored activity is less than 24 hours old, returning without any updates.");
                    return fVar;
                }
                C59104x b4 = C132613bc.f361914a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
                ((C59052c) ((C59052c) b4).mo56372aa(39750)).mo56388r("#updateLastActivityForUIType, stored activity is more than 24 hours old, incrementing streamz counter and updating timestamp stored in the dataStore with the current timestamp (seconds): %d.", fgVar.f170154a);
                bcVar.f361915b.mo110837d(i);
                C132634a aVar = (C132634a) fVar.toBuilder();
                C132635b bVar = (C132635b) C132636c.f361961d.createBuilder();
                bVar.copyOnWrite();
                C132636c cVar3 = (C132636c) bVar.instance;
                cVar3.f361964b = i - 1;
                cVar3.f361963a |= 1;
                bVar.copyOnWrite();
                C132636c cVar4 = (C132636c) bVar.instance;
                fgVar.getClass();
                cVar4.f361965c = fgVar;
                cVar4.f361963a |= 2;
                C132636c cVar5 = (C132636c) bVar.build();
                aVar.copyOnWrite();
                C132639f fVar2 = (C132639f) aVar.instance;
                cVar5.getClass();
                fVar2.mo110847b();
                fVar2.f361976d.set(i2, cVar5);
                return (C132639f) aVar.build();
            }
        }
        C59104x b5 = C132613bc.f361914a.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
        ((C59052c) ((C59052c) b5).mo56372aa(39748)).mo56353F("#updateLastActivityForUIType, didn't find stored activity of %s. Incrementing streamz counter and adding activity timestamp (seconds) to the dataStore: %d", C132641h.m215615a(i), fgVar.f170154a);
        bcVar.f361915b.mo110837d(i);
        C132634a aVar2 = (C132634a) fVar.toBuilder();
        C132635b bVar2 = (C132635b) C132636c.f361961d.createBuilder();
        bVar2.copyOnWrite();
        C132636c cVar6 = (C132636c) bVar2.instance;
        cVar6.f361964b = i - 1;
        cVar6.f361963a |= 1;
        bVar2.copyOnWrite();
        C132636c cVar7 = (C132636c) bVar2.instance;
        fgVar.getClass();
        cVar7.f361965c = fgVar;
        cVar7.f361963a |= 2;
        C132636c cVar8 = (C132636c) bVar2.build();
        aVar2.copyOnWrite();
        C132639f fVar3 = (C132639f) aVar2.instance;
        cVar8.getClass();
        fVar3.mo110847b();
        fVar3.f361976d.add(cVar8);
        return (C132639f) aVar2.build();
    }
}
