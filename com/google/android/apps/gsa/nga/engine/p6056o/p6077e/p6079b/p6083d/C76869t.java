package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76146c;
import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76149f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.t */
/* compiled from: PG */
public final class C76869t implements C76591c {

    /* renamed from: a */
    public static final C58974d f212293a = C58974d.m91136j();

    /* renamed from: b */
    public final C76832ab f212294b;

    /* renamed from: c */
    public final C22871g f212295c;

    /* renamed from: d */
    private final C76146c f212296d;

    public C76869t(C76146c cVar, C76832ab abVar, C22871g gVar) {
        this.f212296d = cVar;
        this.f212294b = abVar;
        this.f212295c = gVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEND_EMAIL_TO_CLOUD_CONTACT));
        h.mo72277g("Send_email_to_cloud_contact", C90126fx.f251228ep);
        h.mo72244c(C58485gu.m89846n("Send_email_to_cloud_contact"));
        ((C76541a) h).f211766c = 10202;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C58485gu d = bgVar.mo72262d("recipient");
        d.size();
        if (d.size() != 1) {
            return C81442m.f222851a;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(d).filter(C76868s.f212292a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) f212293a.mo56224b()).mo56372aa(3769)).mo56386p("No contact in the intent.");
            return C81442m.f222851a;
        }
        return this.f212295c.mo28210j(this.f212295c.mo28209i(((C76149f) this.f212296d).mo72091a((String) guVar.get(0)), "[NGA] ComposeEmailFulfiller.fulfill", C76864o.f212287a), "[NGA] ComposeEmailFulfiller.fulfillForCloudContacts", new C76865p(this, nVar));
    }
}
