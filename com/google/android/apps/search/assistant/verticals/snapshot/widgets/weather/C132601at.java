package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132634a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132639f;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.at */
/* compiled from: PG */
public final /* synthetic */ class C132601at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361872a;

    /* renamed from: b */
    public final /* synthetic */ C63042fg f361873b;

    public /* synthetic */ C132601at(C132606ay ayVar, C63042fg fgVar) {
        this.f361872a = ayVar;
        this.f361873b = fgVar;
    }

    public final Object apply(Object obj) {
        C132606ay ayVar = this.f361872a;
        C63042fg fgVar = this.f361873b;
        C132639f fVar = (C132639f) obj;
        if ((fVar.f361973a & 1) != 0) {
            C59052c cVar = (C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39732);
            C63042fg fgVar2 = fVar.f361975c;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            Long valueOf = Long.valueOf(C62948a.m95454e(C62953e.m95480e(fgVar2, fgVar)));
            C63042fg fgVar3 = fVar.f361975c;
            if (fgVar3 == null) {
                fgVar3 = C63042fg.f170152c;
            }
            cVar.mo56359L("#setLastWidgetsUpdateTimestamp. %s minutes since last successful update. Last timestamp %s. New timestamp %s.", valueOf, Long.valueOf(fgVar3.f170154a), Long.valueOf(fgVar.f170154a));
            C132610b bVar = ayVar.f361891h;
            C63042fg fgVar4 = fVar.f361975c;
            if (fgVar4 == null) {
                fgVar4 = C63042fg.f170152c;
            }
            Duration d = C62950b.m95473d(C62953e.m95480e(fgVar4, fgVar));
            if (d.compareTo(C132610b.f361907a) >= 0) {
                ((C19569f) bVar.f361909b.f103009dh.mo6453a()).mo24824b((double) d.toSeconds(), new Object[0]);
            }
        } else {
            ((C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39731)).mo56388r("#setLastWidgetsUpdateTimestamp. First update. Timestamp %s.", fgVar.f170154a);
        }
        C132634a aVar = (C132634a) fVar.toBuilder();
        aVar.copyOnWrite();
        C132639f fVar2 = (C132639f) aVar.instance;
        fgVar.getClass();
        fVar2.f361975c = fgVar;
        fVar2.f361973a |= 1;
        return (C132639f) aVar.build();
    }
}
