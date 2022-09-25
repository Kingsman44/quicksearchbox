package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91778ab;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91853a;
import com.google.android.apps.gsa.sidekick.shared.monet.util.ClientControllerAction;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104682y;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105451u;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7941pq;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dl */
/* compiled from: PG */
public final class C105271dl extends C23056g implements C105447q {

    /* renamed from: a */
    public final C105451u f293687a;

    /* renamed from: b */
    public final String f293688b;

    /* renamed from: c */
    public final String f293689c;

    /* renamed from: d */
    public final String f293690d;

    /* renamed from: e */
    public final C22871g f293691e;

    /* renamed from: f */
    public final C87334q f293692f;

    /* renamed from: g */
    public C91405d f293693g;

    /* renamed from: h */
    public C7941pq f293694h;

    /* renamed from: i */
    public C60870cx f293695i;

    /* renamed from: j */
    public C87316ao f293696j;

    /* renamed from: k */
    public boolean f293697k = false;

    /* renamed from: l */
    public boolean f293698l;

    /* renamed from: m */
    public C104682y f293699m;

    /* renamed from: n */
    private C8142xb f293700n;

    public C105271dl(C23052c cVar, C105451u uVar, Context context, C22871g gVar, C87334q qVar) {
        super(cVar);
        this.f293692f = qVar;
        this.f293687a = uVar;
        this.f293691e = gVar;
        this.f293688b = context.getString(R.string.undo_string);
        this.f293689c = context.getString(R.string.reaction_show_more);
        this.f293690d = context.getString(R.string.reaction_ads_show_more);
    }

    /* renamed from: e */
    public final void mo94696e(C7681g gVar, C8178yk ykVar) {
        if (this.f293693g != null) {
            C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
            int i = gVar.f26835cv;
            yVar.copyOnWrite();
            C9141ad adVar = (C9141ad) yVar.instance;
            adVar.f31535a |= 2;
            adVar.f31538d = i;
            C91853a aVar = new C91853a();
            aVar.f256166a = (C9141ad) yVar.build();
            aVar.mo86355b(this.f293700n);
            aVar.f256169d = ykVar;
            ClientControllerAction a = aVar.mo86354a();
            C91405d dVar = this.f293693g;
            if (dVar != null) {
                dVar.mo85746f(a);
            }
        }
    }

    /* renamed from: f */
    public final void mo94697f() {
        C91405d dVar;
        C7941pq pqVar = (C7941pq) ((C105189ak) this.f293687a).f293362b.f63720e;
        if ((pqVar.f27882a & 4) != 0 && (dVar = this.f293693g) != null) {
            C8178yk ykVar = pqVar.f27885d;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            dVar.mo85748h(ykVar);
        }
    }

    /* renamed from: h */
    public final void mo94698h(C8178yk ykVar, C8178yk ykVar2) {
        C91405d dVar = this.f293693g;
        if (dVar != null) {
            dVar.mo85748h(ykVar);
            this.f293693g.mo85750j(ykVar2);
        }
    }

    /* renamed from: i */
    public final void mo94699i() {
        ((C105189ak) this.f293687a).f293363c.mo28730f(C58833ax.m90834k(C105450t.COLLAPSED), false);
        C104682y yVar = this.f293699m;
        if (yVar != null) {
            yVar.mo94294a();
        }
        C60870cx cxVar = this.f293695i;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f293695i = null;
        }
        this.f293699m = null;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91778ab abVar = (C91778ab) C23245b.m43557b(protoParcelable, C91778ab.f255931d.getParserForType(), C62921ba.m95368a(), true);
        abVar.getClass();
        C8142xb a = C8142xb.m22954a(abVar.f255934b);
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        this.f293700n = a;
        ((C105189ak) this.f293687a).f293363c.mo28730f(C58833ax.m90834k(C105450t.COLLAPSED), false);
        ((C105189ak) this.f293687a).f293361a.mo28730f(Boolean.valueOf(abVar.f255935c), false);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f293699m = null;
        this.f293698l = true;
    }
}
