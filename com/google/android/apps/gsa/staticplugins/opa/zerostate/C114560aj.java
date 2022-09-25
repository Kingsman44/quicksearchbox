package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.apps.gsa.assistant.shared.l.aa;
import com.google.android.apps.gsa.assistant.shared.l.ab;
import com.google.android.apps.gsa.contacts.cn;
import com.google.android.apps.gsa.p8839t.p8844e.C118356e;
import com.google.android.apps.gsa.p8839t.p8844e.C118357f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114723c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114724d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114725e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114726f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114728h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114729i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114741k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115034ck;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115035cl;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115049cz;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115052db;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115054dd;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115055de;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.aj */
/* compiled from: PG */
public final class C114560aj {

    /* renamed from: a */
    public static final C59071e f317664a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.aj");

    /* renamed from: b */
    public final C86124t f317665b;

    /* renamed from: c */
    public final C22871g f317666c;

    /* renamed from: d */
    public final C53306j f317667d;

    /* renamed from: e */
    public final C68214a f317668e;

    /* renamed from: f */
    public C114723c f317669f;

    /* renamed from: g */
    public C114728h f317670g;

    /* renamed from: h */
    public C114725e f317671h;

    /* renamed from: i */
    public C118356e f317672i;

    /* renamed from: j */
    public List f317673j = new ArrayList();

    /* renamed from: k */
    public C58485gu f317674k = C58485gu.m89845m();

    /* renamed from: l */
    public Map f317675l = new HashMap();

    /* renamed from: m */
    public List f317676m = new ArrayList();

    /* renamed from: n */
    SettableFuture f317677n = new SettableFuture();

    /* renamed from: o */
    private final C115035cl f317678o;

    /* renamed from: p */
    private final C115055de f317679p;

    /* renamed from: q */
    private final cn f317680q;

    public C114560aj(Context context, C53306j jVar, C86124t tVar, C22871g gVar, C115035cl clVar, C115055de deVar, C114724d dVar, C114729i iVar, C114726f fVar, C118357f fVar2, C68214a aVar, cn cnVar) {
        this.f317667d = jVar;
        this.f317665b = tVar;
        this.f317666c = gVar;
        this.f317678o = clVar;
        this.f317679p = deVar;
        this.f317680q = cnVar;
        if (jVar == C53306j.AMBIENT) {
            this.f317669f = dVar.mo101542a(context);
        } else if (tVar.mo79746e(C90014bt.f247835ov)) {
            this.f317669f = dVar.mo101542a(context);
            context.getClass();
            C86124t tVar2 = (C86124t) iVar.f318369a.mo17428b();
            tVar2.getClass();
            C91077d dVar2 = (C91077d) iVar.f318370b.mo17428b();
            dVar2.getClass();
            C22871g gVar2 = (C22871g) iVar.f318371c.mo17428b();
            gVar2.getClass();
            C22871g gVar3 = (C22871g) iVar.f318372d.mo17428b();
            gVar3.getClass();
            this.f317670g = new C114728h(context, tVar2, dVar2, gVar2, gVar3);
            this.f317671h = fVar.mo101545a();
            this.f317672i = fVar2.mo103678a();
        } else if (tVar.mo79746e(C90014bt.f247626kh)) {
            this.f317672i = fVar2.mo103678a();
        }
        this.f317668e = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo101405a() {
        C114723c cVar = this.f317669f;
        if (cVar == null) {
            return C118826c.f331423b;
        }
        C22871g gVar = this.f317666c;
        C89849ae aeVar = C89849ae.OPA_ZERO_STATE_CALL_MANAGER_START_INIT;
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) cVar.f318334h.mo27525b()).mo83702b(aeVar);
        if (!cVar.f318335i) {
            cVar.mo101541a();
            cVar.f318335i = true;
        }
        C60870cx e = C90877ak.m148471e(cVar.f318336j, cVar.f318330d.mo79743a(C90014bt.f247829op), TimeUnit.SECONDS, cVar.f318332f);
        C114741k.m190203a(e, (C89859i) cVar.f318334h.mo27525b(), cVar.f318332f, C89849ae.OPA_ZERO_STATE_CALL_MANAGER_FINISH_INIT, C89849ae.OPA_ZERO_STATE_CALL_MANAGER_INIT_TIMEOUT);
        return gVar.mo28209i(e, "callManager.getMissedCallListFromRecentToPreviousFuture()", new C114555ae(this));
    }

    /* renamed from: b */
    public final void mo101406b() {
        C58833ax axVar;
        C58833ax axVar2;
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = this.f317674k;
        if (guVar == null || guVar.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            C115035cl clVar = this.f317678o;
            C58485gu guVar2 = this.f317674k;
            C21370a aVar = (C21370a) clVar.f319312a.mo17428b();
            aVar.getClass();
            guVar2.getClass();
            axVar = C58833ax.m90834k(new C115034ck(aVar, guVar2));
        }
        if (axVar.mo56113h()) {
            e.mo55395g((C114758l) axVar.mo56107c());
        }
        Map map = this.f317675l;
        if (map == null || map.isEmpty()) {
            axVar2 = C58836b.f156633a;
        } else {
            HashMap hashMap = new HashMap();
            for (Map.Entry value : this.f317675l.entrySet()) {
                ab abVar = (ab) value.getValue();
                C58485gu j = C58485gu.m89842j(this.f317680q.a(abVar.b));
                if (j.isEmpty()) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    Contact contact = (Contact) j.get(0);
                    aa builder = abVar.toBuilder();
                    String g = C58837ba.m90858g(contact.f236353d);
                    builder.copyOnWrite();
                    ab abVar2 = builder.instance;
                    abVar2.a |= 8;
                    abVar2.f = g;
                    Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, contact.f236351b);
                    String uri = Uri.withAppendedPath(withAppendedId, "photo").toString();
                    String uri2 = Uri.withAppendedPath(withAppendedId, "display_photo").toString();
                    if (uri2 != null) {
                        builder.copyOnWrite();
                        ab abVar3 = builder.instance;
                        abVar3.a |= 16;
                        abVar3.g = uri2;
                        builder.copyOnWrite();
                        ab abVar4 = builder.instance;
                        uri.getClass();
                        abVar4.a |= 32;
                        abVar4.h = uri;
                    }
                    hashMap.put(abVar.b, builder.build());
                }
            }
            if (hashMap.isEmpty()) {
                axVar2 = C58836b.f156633a;
            } else {
                C21370a aVar2 = (C21370a) this.f317679p.f319379a.mo17428b();
                aVar2.getClass();
                axVar2 = C58833ax.m90834k(new C115054dd(aVar2, hashMap));
            }
        }
        if (axVar2.mo56113h()) {
            e.mo55395g((C114758l) axVar2.mo56107c());
        }
        if (!this.f317673j.isEmpty()) {
            this.f317673j.getClass();
            e.mo55395g(new C115052db());
        }
        if (!Collection.EL.stream(this.f317676m).allMatch(C114556af.f317660a)) {
            List list = this.f317676m;
            list.getClass();
            e.mo55395g(new C115049cz(list));
        }
        C58485gu f = e.mo55394f();
        if (this.f317677n.isDone()) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f317677n = new SettableFuture();
        }
        this.f317677n.mo57356n(f);
    }

    /* renamed from: c */
    public final boolean mo101407c() {
        return !this.f317665b.mo79746e(C90014bt.f247835ov) && !this.f317665b.mo79746e(C90063do.f249587gO) && this.f317667d != C53306j.AMBIENT;
    }
}
