package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135464j;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.be */
/* compiled from: PG */
final class C135512be implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C135511bd f369149a;

    public C135512be(C135511bd bdVar) {
        this.f369149a = bdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135462h hVar;
        C139762c cVar = (C139762c) bVar;
        C135511bd bdVar = this.f369149a;
        C69664n.m101061g(cVar, "event");
        C139779t a = C139779t.m227245a(cVar.mo115221a().f379872b);
        if (a == null) {
            a = C139779t.UNSPECIFIED;
        }
        if (a != C139779t.GOOGLE_APP_BROWSER) {
            return C47392e.f123116b;
        }
        C46496q c = bdVar.f369142a.mo50482c(bdVar.mo112375k().getChildFragmentManager().f650q);
        C139770k kVar = cVar.mo115221a().f379877g;
        if (kVar == null) {
            kVar = C139770k.f379882c;
        }
        if (kVar.f379884a == 4) {
            hVar = (C135462h) kVar.f379885b;
        } else {
            hVar = C135462h.f369059n;
        }
        C69664n.m101060f(hVar, "event.navigationEventDat…ppbrowserFragmentArgument");
        C62934bn builder = hVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C135464j a2 = C69664n.m101061g((C135459e) builder, "builder");
        a2.mo112353b();
        c.mo50509e(R.id.googleapp_browser_fragment_destination, a2.mo112352a());
        return C47392e.f123115a;
    }
}
