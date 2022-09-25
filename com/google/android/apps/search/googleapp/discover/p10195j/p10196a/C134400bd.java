package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134646g;
import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38493b;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38494c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57087bb;
import com.google.p4648g.p4650b.C61641d;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64211bf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.bd */
/* compiled from: PG */
final class C134400bd implements C61641d {

    /* renamed from: a */
    final /* synthetic */ C134401be f366110a;

    /* renamed from: b */
    final /* synthetic */ C64211bf f366111b;

    public C134400bd(C134401be beVar, C64211bf bfVar) {
        this.f366110a = beVar;
        this.f366111b = bfVar;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C133939b bVar = this.f366110a.f366112a;
        C57087bb bbVar = this.f366111b.f173619a;
        if (bbVar == null) {
            bbVar = C57087bb.f152401b;
        }
        C69664n.m101060f(bbVar, "command.updateDiscoverLanguageData");
        C69664n.m101061g(bbVar, "data");
        C134646g gVar = bVar.f364805n;
        String str = bbVar.f152403a;
        C69664n.m101060f(str, "data.preferredLanguage");
        C69664n.m101061g(str, "preferredLanguage");
        C38497c cVar = gVar.f366657a;
        C38494c cVar2 = (C38494c) C38495d.f101847e.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C38493b a = C69664n.m101061g(cVar2, "builder");
        a.mo41444b(str);
        C60870cx c = cVar.mo41447c(a.mo41443a());
        C69664n.m101060f(c, "store.writeDiscoverLangu…ge = preferredLanguage })");
        C47633f g = C47633f.m84733g(c);
        C69664n.m101060f(g, "from(\n      discoverLang….preferredLanguage)\n    )");
        return g;
    }
}
