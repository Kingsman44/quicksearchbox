package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88261vc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90738av;
import com.google.android.apps.gsa.staticplugins.accl.C92718b;
import com.google.android.libraries.gsa.conversation.p1855h.C22688aa;
import com.google.android.libraries.gsa.conversation.p1855h.C22689ab;
import com.google.android.libraries.gsa.conversation.p1855h.C22697b;
import com.google.android.libraries.gsa.conversation.p1855h.C22708l;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4553a.C59449a;
import com.google.common.p4552o.p4553a.C59476b;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.a.h */
/* compiled from: PG */
public final class C84362h extends C22697b {

    /* renamed from: a */
    public final C68214a f229592a;

    /* renamed from: b */
    public final C68214a f229593b;

    /* renamed from: c */
    private final C86610af f229594c;

    /* renamed from: e */
    private final C22871g f229595e;

    /* renamed from: f */
    private final C84378x f229596f;

    /* renamed from: g */
    private final int f229597g;

    /* renamed from: h */
    private final C68214a f229598h;

    /* renamed from: i */
    private final C68214a f229599i;

    /* renamed from: j */
    private boolean f229600j;

    public C84362h(int i, C86610af afVar, C68214a aVar, C68214a aVar2, C22871g gVar, C84378x xVar, C68214a aVar3, C68214a aVar4) {
        this.f229597g = i;
        this.f229594c = afVar;
        this.f229592a = aVar;
        this.f229593b = aVar2;
        this.f229595e = gVar;
        this.f229596f = xVar;
        this.f229598h = aVar3;
        this.f229599i = aVar4;
    }

    /* renamed from: a */
    public final void mo27813a(C22722z zVar) {
        if (this.f229597g != 3) {
            C58976aa aaVar = C58975e.f156826a;
            C84378x xVar = this.f229596f;
            Objects.requireNonNull(xVar);
            m42246p(zVar, new C84358d(xVar));
            this.f229596f.mo77899d(zVar);
        }
    }

    /* renamed from: b */
    public final C60870cx mo27814b(C51809dy dyVar, C58833ax axVar) {
        mo27820i(dyVar, axVar);
        return f62475d;
    }

    /* renamed from: c */
    public final void mo27815c(C59476b bVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1237;
        C59449a aVar = (C59449a) bVar.toBuilder();
        int i = this.f229597g;
        aVar.copyOnWrite();
        C59476b bVar2 = (C59476b) aVar.instance;
        bVar2.f157799a |= 1;
        bVar2.f157802d = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C59476b bVar3 = (C59476b) aVar.build();
        bVar3.getClass();
        ufVar2.f164175bc = bVar3;
        ufVar2.f164251f |= 67108864;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: d */
    public final void mo27816d(C58833ax axVar) {
        if (this.f229597g != 3) {
            C58976aa aaVar = C58975e.f156826a;
            this.f229595e.mo28212l("onConversationEnded", new C84359e(this));
            if (this.f229600j) {
                this.f229595e.mo28212l("update CCL audio status", new C84360f(this));
            }
        }
    }

    /* renamed from: e */
    public final void mo27817e(C22688aa aaVar, C58833ax axVar) {
        if (this.f229597g != 3) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f229600j = false;
            C22708l lVar = (C22708l) aaVar;
            ((C92718b) this.f229598h.mo27525b()).mo87450b(this.f229597g, lVar.f62509b);
            this.f229596f.mo77904i(lVar.f62508a, ((C90738av) this.f229599i.mo27525b()).mo85088a(lVar.f62509b));
        }
    }

    /* renamed from: f */
    public final void mo27818f(C22689ab abVar) {
        if (this.f229597g != 3) {
            C58976aa aaVar = C58975e.f156826a;
            this.f229596f.mo77901f(abVar);
        }
    }

    /* renamed from: g */
    public final void mo27819g() {
        this.f229596f.mo77902g();
    }

    /* renamed from: h */
    public final void mo27694h(String str, String str2, boolean z) {
        if (this.f229594c.mo80227h()) {
            C86610af afVar = this.f229594c;
            C87684al alVar = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            C62940bt btVar = C88380zn.f238990a;
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            str.getClass();
            zpVar.f238993a |= 1;
            zpVar.f238994b = str;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            str2.getClass();
            zpVar2.f238993a |= 2;
            zpVar2.f238995c = str2;
            alVar.mo81965b(btVar, (C88382zp) zoVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
        if (z && this.f229594c.mo80227h()) {
            C86610af afVar2 = this.f229594c;
            C87684al alVar2 = new C87684al(C88244um.SET_FINAL_RECOGNIZED_TEXT);
            C62940bt btVar2 = C88260vb.f238727a;
            C88261vc vcVar = (C88261vc) C88262vd.f238728d.createBuilder();
            vcVar.copyOnWrite();
            C88262vd vdVar = (C88262vd) vcVar.instance;
            str.getClass();
            vdVar.f238730a |= 1;
            vdVar.f238731b = str;
            alVar2.mo81965b(btVar2, (C88262vd) vcVar.build());
            afVar2.mo80228i(alVar2.mo81964a());
        }
    }

    /* renamed from: i */
    public final void mo27820i(C51809dy dyVar, C58833ax axVar) {
        this.f229596f.mo77903h(dyVar, C58836b.f156633a, axVar);
    }

    /* renamed from: j */
    public final void mo27821j(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z2 = this.f229600j;
        if (z2) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        this.f229600j = z2 | z;
        this.f229595e.mo28212l("update CCL audio status", new C84361g(this, z));
    }
}
