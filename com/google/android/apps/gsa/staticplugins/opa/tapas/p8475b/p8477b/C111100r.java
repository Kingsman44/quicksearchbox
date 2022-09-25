package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48616be;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48618bg;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48620bi;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48621bj;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.r */
/* compiled from: PG */
public final /* synthetic */ class C111100r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111102t f309338a;

    public /* synthetic */ C111100r(C111102t tVar) {
        this.f309338a = tVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111102t tVar = this.f309338a;
        long b = tVar.f309341b.mo26870b();
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        UsageStatsManager usageStatsManager = (UsageStatsManager) tVar.f309340a.getSystemService("usagestats");
        if (usageStatsManager == null) {
            return (C48635bx) bvVar.build();
        }
        UsageEvents queryEvents = usageStatsManager.queryEvents(b - Duration.ofDays(tVar.f309342c.mo79743a(C90063do.f249283ac)).toMillis(), b);
        HashMap hashMap = new HashMap();
        UsageEvents.Event event = new UsageEvents.Event();
        while (queryEvents.getNextEvent(event)) {
            event.getPackageName();
            event.getTimeStamp();
            event.getEventType();
            C48620bi biVar = (C48620bi) C48621bj.f125640d.createBuilder();
            long timeStamp = event.getTimeStamp();
            biVar.copyOnWrite();
            ((C48621bj) biVar.instance).f125642a = timeStamp;
            int eventType = event.getEventType();
            biVar.copyOnWrite();
            ((C48621bj) biVar.instance).f125643b = eventType;
            if (event.getShortcutId() != null) {
                String shortcutId = event.getShortcutId();
                biVar.copyOnWrite();
                shortcutId.getClass();
                ((C48621bj) biVar.instance).f125644c = shortcutId;
            }
            Map.EL.putIfAbsent(hashMap, event.getPackageName(), new ArrayList());
            List list = (List) hashMap.get(event.getPackageName());
            list.getClass();
            list.add((C48621bj) biVar.build());
        }
        C48616be beVar = (C48616be) C48618bg.f125637b.createBuilder();
        C58495hd h = C59364ae.m92266l(hashMap).mo56892c(C111101s.f309339a).mo56899h();
        beVar.copyOnWrite();
        C48618bg bgVar = (C48618bg) beVar.instance;
        C62995dn dnVar = bgVar.f125639a;
        if (!dnVar.f170058b) {
            bgVar.f125639a = dnVar.mo58980a();
        }
        bgVar.f125639a.putAll(h);
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        C48618bg bgVar2 = (C48618bg) beVar.build();
        bgVar2.getClass();
        bxVar.f125707b = bgVar2;
        bxVar.f125706a = 27;
        return (C48635bx) bvVar.build();
    }
}
