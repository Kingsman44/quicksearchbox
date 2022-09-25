package com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a;

import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.a.a */
/* compiled from: PG */
final class C134633a implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C134640h f366631a;

    public C134633a(C134640h hVar) {
        this.f366631a = hVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C38495d dVar = (C38495d) obj;
        C63042fg fgVar = dVar.f101852d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "data.lastSyncTime");
        if (C134640h.f366638a.compareTo(Duration.between(C62949a.m95469d(fgVar), this.f366631a.f366645h.mo57444a())) <= 0) {
            return C46688af.m83206c(dVar.f101851c);
        }
        String str = dVar.f101851c;
        C63042fg fgVar2 = dVar.f101852d;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        return C46688af.m83205b(str, C62953e.m95478c(fgVar2));
    }
}
