package com.google.android.remotesearch;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;

/* renamed from: com.google.android.remotesearch.k */
/* compiled from: PG */
public final class C45225k extends C45219e {

    /* renamed from: a */
    public static final C59071e f118014a = C59071e.m91332i("com.google.android.remotesearch.k");

    /* renamed from: b */
    public final C87673aa f118015b;

    /* renamed from: c */
    public final AtomicLong f118016c = new AtomicLong(-1);

    /* renamed from: d */
    private final C21370a f118017d;

    /* renamed from: e */
    private final C22871g f118018e;

    public C45225k(C21370a aVar, C45221g gVar, C22871g gVar2, C87677ae aeVar) {
        C88486g gVar3 = new C88486g();
        gVar3.f239201c = amo.REMOTE_SEARCH_SERVICE;
        gVar3.f239199a = 562949953421312L;
        gVar3.f239204f = "rss_gmm_commute_update";
        C87673aa a = aeVar.mo81958a(new C45224j(gVar), (C90757ba) null, new ClientConfig(gVar3));
        this.f118015b = a;
        this.f118017d = aVar;
        this.f118018e = gVar2;
        Objects.requireNonNull(a);
        gVar2.mo28212l("Connect searchServiceClient", new C45223i(a));
    }

    /* renamed from: a */
    public final void mo49084a(byte[] bArr) {
        try {
            C87741bw bwVar = (C87741bw) C62942bv.parseFrom((C62942bv) C87741bw.f237477c, bArr, C62921ba.m95368a());
            C87739bu a = C87739bu.m142761a(bwVar.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            int i = a.f237476dL + 1000;
            if (Math.random() < 0.01d) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1563;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                ufVar2.f164255j |= 536870912;
                ufVar2.f164206cG = i;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
            this.f118016c.set(this.f118017d.mo26870b());
            this.f118015b.mo81937i(new C88489j(bwVar).mo82013a());
        } catch (C62974ct e) {
            C59104x d = f118014a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PublicSession");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(54269)).mo56386p("Invalid ClientEventProto received.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49085b() {
        this.f118018e.mo28212l("Dispose searchServiceClient", new C45222h(this, this.f118016c.get()));
    }
}
