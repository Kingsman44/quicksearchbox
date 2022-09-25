package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102723d;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102749a;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102752d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.e */
/* compiled from: PG */
public final class C102736e extends C23056g implements C102749a {

    /* renamed from: a */
    public final C102752d f286822a;

    /* renamed from: b */
    public final C102735d f286823b;

    public C102736e(C23052c cVar, C102752d dVar, C102735d dVar2) {
        super(cVar);
        this.f286822a = dVar;
        this.f286823b = dVar2;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C102723d dVar = (C102723d) C23245b.m43557b(protoParcelable, C102723d.f286770e.getParserForType(), C62921ba.m95368a(), true);
        dVar.getClass();
        C23251a aVar = ((C102729a) this.f286822a).f286798c;
        C102721b a = C102721b.m170317a(dVar.f286773b);
        if (a == null) {
            a = C102721b.UNKNOWN_BUTTON;
        }
        aVar.mo28730f(C58833ax.m90834k(a), false);
        ((C102729a) this.f286822a).f286797b.mo28730f(Integer.valueOf(dVar.f286774c), false);
        ((C102729a) this.f286822a).f286796a.mo28730f(Integer.valueOf(dVar.f286775d), false);
    }
}
