package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bb */
/* compiled from: PG */
final class C95092bb extends C95091ba {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266009a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95092bb(C95097bg bgVar) {
        super(bgVar, "PLAYING_TTS_RESPONSE");
        this.f266009a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        this.f266009a.f266044p.mo89277r(7);
        C88356yq yqVar = this.f266009a.f266022F;
        if (yqVar == null) {
            C59104x c = C95097bg.f266015a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) c).mo56372aa(18017)).mo56386p("ttsResultEventData is null");
            mo89006d();
        } else if ((yqVar.f238946a & 1) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            Uri build = new Uri.Builder().path(yqVar.f238947b).build();
            if (build == null) {
                C59104x c2 = C95097bg.f266015a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c2).mo56372aa(18021)).mo56386p("Missing uri in audio result.");
                mo89006d();
                return;
            }
            String path = build.getPath();
            if (path == null || path.isEmpty()) {
                C59104x d = C95097bg.f266015a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) d).mo56372aa(18019)).mo56386p("Empty audio result");
                mo89006d();
                return;
            }
            int i = C95873a.f268446a;
            Uri parse = Uri.parse(path);
            C95097bg bgVar = this.f266008b;
            super.mo89011g(new C95102bl(bgVar.f266031c, parse, (C95101bk) this, bgVar.f266041m, bgVar.f266033e));
        } else {
            C59104x c3 = C95097bg.f266015a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) c3).mo56372aa(18015)).mo56386p("getAudioResultUris - Missing tts.");
            this.f266009a.f266034f.mo89058a();
            this.f266009a.mo89018e("RUNNING_ACTION");
        }
    }

    /* renamed from: f */
    public final void mo89008f() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
        this.f266009a.f266034f.mo89058a();
        this.f266009a.mo89018e("RUNNING_ACTION");
    }
}
