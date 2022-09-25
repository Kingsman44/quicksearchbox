package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.t.h.af */
/* compiled from: PG */
public final /* synthetic */ class C118386af implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328613a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f328614b;

    /* renamed from: c */
    public final /* synthetic */ ConcurrentHashMap f328615c;

    public /* synthetic */ C118386af(C118426bs bsVar, C53306j jVar, ConcurrentHashMap concurrentHashMap) {
        this.f328613a = bsVar;
        this.f328614b = jVar;
        this.f328615c = concurrentHashMap;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118426bs bsVar = this.f328613a;
        C53306j jVar = this.f328614b;
        ConcurrentHashMap concurrentHashMap = this.f328615c;
        C123728av avVar = (C123728av) obj;
        C58974d dVar = bsVar.f328686g;
        String format = String.format("{%s/%s}", new Object[]{avVar.f341756b, avVar.f341757c});
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(7004)).mo56352E("Maybe caching content {%s} size {%s}.", format, avVar.f341758d.size());
        if (!avVar.f341758d.isEmpty()) {
            new C90873ag(bsVar.f328689j.mo76938m(avVar.f341756b, avVar.f341757c, jVar, avVar), bsVar.f328694o, "#updateOnDeviceMediaInCache() Clean up on-device media futures.", new C118397aq(concurrentHashMap, avVar, dVar, format)).mo85223a(new C118398ar(dVar, format));
            return;
        }
        concurrentHashMap.remove(new ComponentName(avVar.f341756b, avVar.f341757c));
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(7005)).mo56389s("#updateOnDeviceMediaInCache() No update in cache, still clean up future %s.", format);
    }
}
