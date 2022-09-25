package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95459a;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95460b;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63142h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.bc */
/* compiled from: PG */
public final /* synthetic */ class C96007bc implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268809a;

    /* renamed from: b */
    public final /* synthetic */ String f268810b;

    /* renamed from: c */
    public final /* synthetic */ boolean f268811c;

    /* renamed from: d */
    public final /* synthetic */ Intent f268812d;

    public /* synthetic */ C96007bc(C96017bm bmVar, String str, boolean z, Intent intent) {
        this.f268809a = bmVar;
        this.f268810b = str;
        this.f268811c = z;
        this.f268812d = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268809a;
        String str = this.f268810b;
        boolean z = this.f268811c;
        Intent intent = this.f268812d;
        C124548d dVar = (C124548d) obj;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15673)).mo56358K("gacsless oobe: %s, oobe in progress: %s", dVar.mo106485Z(), C124633az.OOBE_IN_PROGRESS.equals(dVar.mo106520r()));
        if (dVar.mo106485Z()) {
            C95465g gVar = bmVar.f268842l;
            Class<Exception> cls = Exception.class;
            new C90873ag(C60846c.m92878g((C60838bs) C60856cj.m92908q(C60922j.m93044g(C60838bs.m92859i(gVar.mo89377a().mo89378a(dVar.mo106477R(), "/assistant/activate", C63142h.f170512a.toByteArray())), new C95459a(), gVar.f267136b), 35000, TimeUnit.MILLISECONDS, gVar.f267136b), cls, C95460b.f267129a, C60826bg.f164896a), bmVar.f268837g, "send-userenabledassistant-datalayer", new C95960ai(bmVar, str)).mo85223a(C95961aj.f268684a);
            return;
        }
        String stringExtra = intent.getStringExtra("host_device_id");
        String stringExtra2 = intent.getStringExtra("account_name");
        if (!z) {
            bmVar.f268834d.mo83394aj(str, C124636bb.OPA_ENABLED, C124633az.OOBE_FINISHED);
            C94892p pVar = bmVar.f268847q;
            if (pVar != null) {
                pVar.mo88766c(str);
            }
        } else if (C58837ba.m90859h(stringExtra) || C58837ba.m90859h(stringExtra2)) {
            C59104x c = C96017bm.f268828a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) c).mo56372aa(15710)).mo56386p("Missing required account sync info.");
        } else {
            bmVar.f268834d.mo83418x(str, stringExtra2, stringExtra);
            C59104x d = C96017bm.f268828a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) d).mo56372aa(15711)).mo56386p("enableUntetheredAccountSynchronization --- ");
            bmVar.mo89877a().mo88766c(str);
        }
    }
}
