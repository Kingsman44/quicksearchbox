package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76146c;
import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76149f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76605q;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a.C76899c;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18063a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18065b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18066c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18067d;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18068e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c.C18069f;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.C18109a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.h */
/* compiled from: PG */
public final class C76857h extends C76899c {

    /* renamed from: a */
    public static final C58974d f212270a = C58974d.m91136j();

    /* renamed from: d */
    private static final C58495hd f212271d = C58495hd.m89902p(C79330v.m127277b("Add_recipient_to"), C18069f.f51543a, C79330v.m127277b("Add_recipient_cc"), C18068e.f51542a, C79330v.m127277b("Add_recipient_bcc"), C18063a.f51537a);

    /* renamed from: e */
    private static final C58495hd f212272e = C58495hd.m89902p(C79330v.m127277b("Add_recipient_to"), C18067d.f51541a, C79330v.m127277b("Add_recipient_cc"), C18066c.f51540a, C79330v.m127277b("Add_recipient_bcc"), C18065b.f51539a);

    /* renamed from: f */
    private final bf f212273f;

    /* renamed from: g */
    private final C76146c f212274g;

    /* renamed from: h */
    private final C22871g f212275h;

    public C76857h(bf bfVar, C76146c cVar, r rVar, C22871g gVar, C22871g gVar2) {
        super(rVar, gVar2);
        this.f212273f = bfVar;
        this.f212274g = cVar;
        this.f212275h = gVar;
    }

    /* renamed from: e */
    public static Optional m123471e(C76590bg bgVar, Optional optional, C76856g gVar) {
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        C58495hd hdVar = C58729pv.f156485a;
        C76856g gVar2 = C76856g.EMAIL_ADDRESS;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            hdVar = f212271d;
        } else if (ordinal == 1) {
            hdVar = f212272e;
        }
        C18109a aVar = (C18109a) hdVar.get(bgVar.f211838b);
        if (aVar != null) {
            return Optional.m71637of(C18100a.m35256b(aVar, optional.get()));
        }
        ((C58970a) ((C58970a) f212270a.mo56225c()).mo56372aa(3762)).mo56354G("Failed to find an ActionSchema for intent '%s' and recipientDescriptionType %s.", bgVar, gVar);
        return Optional.empty();
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.ADD_RECIPIENT));
        h.mo72277g("Add_recipient_to", C90126fx.f251224el);
        h.mo72277g("Add_recipient_cc", C90126fx.f251224el);
        h.mo72277g("Add_recipient_bcc", C90126fx.f251224el);
        h.mo72244c(C58485gu.m89848p("Add_recipient_to", "Add_recipient_cc", "Add_recipient_bcc"));
        ((C76541a) h).f211766c = 10205;
        return h.mo72276f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C60870cx mo72338k(C76590bg bgVar) {
        Optional g = bgVar.mo72265g(C76605q.f211852a, "contact");
        if (g.isPresent()) {
            C22871g gVar = this.f212275h;
            C22871g gVar2 = this.f212275h;
            C58485gu a = ((df) g.get()).a();
            bf bfVar = this.f212273f;
            Objects.requireNonNull(bfVar);
            return gVar.mo28209i(gVar2.mo28209i(C80905at.m128762f(a, new C76852c(bfVar)), "[NGA] AddRecipientFulfiller.toEmailAddress", C76853d.f212264a), "[NGA] AddRecipientFulfiller.getActionRequest.withEmail", new C76830a(bgVar));
        }
        Optional g2 = bgVar.mo72265g(C76564ah.f211801a, "contact");
        if (!g2.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return this.f212275h.mo28209i(((C76149f) this.f212274g).mo72091a((String) g2.get()), "[NGA] AddRecipientFulfiller.getSystemResponseForContacts", new C76851b(bgVar, g2));
    }
}
