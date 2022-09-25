package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90005bk;
import com.google.android.libraries.mdi.download.C28729bg;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.hk */
/* compiled from: PG */
public final /* synthetic */ class C104100hk implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C86124t f289611a;

    public /* synthetic */ C104100hk(C86124t tVar) {
        this.f289611a = tVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        try {
            return (C28730bh) Objects.requireNonNull((C28730bh) this.f289611a.mo79754t(C90005bk.f246876d, C28730bh.f78048d.getParserForType()));
        } catch (NullPointerException e) {
            C59104x c = C104103hn.f289614a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SyncModule");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21783)).mo56386p("'nga_webref_manifest_file' is null, using the fallback URL instead.");
            C28729bg bgVar = (C28729bg) C28730bh.f78048d.createBuilder();
            bgVar.copyOnWrite();
            C28730bh bhVar = (C28730bh) bgVar.instance;
            bhVar.f78050a |= 1;
            bhVar.f78051b = "nga-webref-manifest";
            bgVar.copyOnWrite();
            C28730bh bhVar2 = (C28730bh) bgVar.instance;
            bhVar2.f78050a |= 2;
            bhVar2.f78052c = "https://www.gstatic.com/webref-ondevice/manifest_configs/nga/webref_manifest_config.pb";
            return (C28730bh) bgVar.build();
        }
    }
}
