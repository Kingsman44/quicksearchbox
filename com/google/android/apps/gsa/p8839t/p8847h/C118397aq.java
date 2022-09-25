package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.t.h.aq */
/* compiled from: PG */
public final /* synthetic */ class C118397aq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ ConcurrentHashMap f328628a;

    /* renamed from: b */
    public final /* synthetic */ C123728av f328629b;

    /* renamed from: c */
    public final /* synthetic */ C58974d f328630c;

    /* renamed from: d */
    public final /* synthetic */ String f328631d;

    public /* synthetic */ C118397aq(ConcurrentHashMap concurrentHashMap, C123728av avVar, C58974d dVar, String str) {
        this.f328628a = concurrentHashMap;
        this.f328629b = avVar;
        this.f328630c = dVar;
        this.f328631d = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        ConcurrentHashMap concurrentHashMap = this.f328628a;
        C123728av avVar = this.f328629b;
        C58974d dVar = this.f328630c;
        String str = this.f328631d;
        String str2 = (String) obj;
        concurrentHashMap.remove(new ComponentName(avVar.f341756b, avVar.f341757c));
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(7002)).mo56389s("#updateOnDeviceMediaInCache() Cleaned up pending future %s.", str);
    }
}
