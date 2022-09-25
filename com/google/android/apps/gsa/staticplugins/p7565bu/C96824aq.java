package com.google.android.apps.gsa.staticplugins.p7565bu;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4526f.C59052c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.aq */
/* compiled from: PG */
public final /* synthetic */ class C96824aq implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C96826as f270768a;

    /* renamed from: b */
    public final /* synthetic */ long f270769b;

    public /* synthetic */ C96824aq(C96826as asVar, long j) {
        this.f270768a = asVar;
        this.f270769b = j;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C96826as asVar = this.f270768a;
        long j = this.f270769b;
        synchronized (asVar.f270772b) {
            Map map = asVar.f270773c;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                ((C59052c) ((C59052c) C96826as.f270771a.mo56226d()).mo56372aa(20903)).mo56388r("Duplicate callback batchID=%d; overwriting...", j);
            }
            asVar.f270773c.put(valueOf, new C96825ar(cVar));
        }
        return "GddBackgroundTaskProxyPopulator listener callback";
    }
}
