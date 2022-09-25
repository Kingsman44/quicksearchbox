package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91794ar;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105428aa;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105431ad;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import p5451f.p5452a.p5453a.p5454a.C69400av;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ea */
/* compiled from: PG */
public final class C105287ea extends C23056g implements C105428aa {

    /* renamed from: a */
    public static final C59071e f293760a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.ea");

    /* renamed from: b */
    public final C105431ad f293761b;

    /* renamed from: c */
    public final C89409b f293762c;

    /* renamed from: d */
    public final C85536a f293763d;

    /* renamed from: e */
    final List f293764e;

    /* renamed from: f */
    boolean f293765f;

    /* renamed from: g */
    private final C91097g f293766g;

    /* renamed from: h */
    private int f293767h = 0;

    public C105287ea(C23052c cVar, C105431ad adVar, C91097g gVar, C89409b bVar, C85536a aVar) {
        super(cVar);
        this.f293761b = adVar;
        this.f293766g = gVar;
        this.f293762c = bVar;
        this.f293763d = aVar;
        this.f293764e = new ArrayList();
    }

    /* renamed from: k */
    public static boolean m174879k(C9251ef efVar) {
        int i = efVar.f31990a;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) ? false : true;
    }

    /* renamed from: e */
    public final void mo94703e(boolean z) {
        C9251ef efVar = (C9251ef) ((C23251a) this.f293761b.mo94658c()).f63720e;
        if ((efVar.f31990a & 1) != 0) {
            this.f293763d.mo79059k(efVar.f31991b, true != z ? 2 : 3);
        }
        ((C23251a) this.f293761b.mo94658c()).mo28730f(C9251ef.f31988f, false);
    }

    /* renamed from: f */
    public final void mo94704f(boolean z) {
        C9251ef efVar = (C9251ef) ((C23251a) this.f293761b.mo94658c()).f63720e;
        this.f293765f = false;
        if (!z || (efVar.f31990a & 1) == 0) {
            ((C23251a) this.f293761b.mo94658c()).mo28730f(C9251ef.f31988f, false);
            if (!this.f293764e.isEmpty()) {
                mo94706i((C9251ef) this.f293764e.remove(0));
                return;
            }
            return;
        }
        this.f293761b.mo94659d().mo28730f(efVar, false);
        this.f293764e.clear();
        this.f293763d.mo79055g(efVar.f31991b);
    }

    /* renamed from: h */
    public final void mo94705h() {
        C9251ef efVar = (C9251ef) ((C23251a) this.f293761b.mo94658c()).f63720e;
        C69400av avVar = efVar.f31992c;
        if (avVar == null) {
            avVar = C69400av.f185693h;
        }
        if ((avVar.f185695a & 8) != 0) {
            try {
                C91097g gVar = this.f293766g;
                C69400av avVar2 = efVar.f31992c;
                if (avVar2 == null) {
                    avVar2 = C69400av.f185693h;
                }
                gVar.mo65089a(Intent.parseUri(avVar2.f185699e, 1));
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f293760a.mo56225c()).mo56382g(e)).mo56372aa(22294)).mo56386p("Failed to parse Intent.");
            }
            if ((1 & efVar.f31990a) != 0) {
                this.f293763d.mo79051c(efVar.f31991b);
            }
            ((C23251a) this.f293761b.mo94658c()).mo28730f(C9251ef.f31988f, false);
            return;
        }
        ((C59052c) ((C59052c) f293760a.mo56225c()).mo56372aa(22295)).mo56386p("Tooltip view is not clicklable without Intent URI.");
    }

    /* renamed from: i */
    public final void mo94706i(C9251ef efVar) {
        if (m174879k(efVar)) {
            if (this.f293765f) {
                ((C59052c) ((C59052c) f293760a.mo56225c()).mo56372aa(22297)).mo56386p("Should not happen.");
            } else if (this.f293762c.mo83328d(efVar.f31991b)) {
                this.f293765f = true;
                ((C23251a) this.f293761b.mo94658c()).mo28730f(efVar, false);
            }
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        mo94703e(false);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91794ar arVar = (C91794ar) C23245b.m43557b(protoParcelable, C91794ar.f255978d.getParserForType(), C62921ba.m95368a(), true);
        arVar.getClass();
        ((C23251a) this.f293761b.mo94657b()).mo28730f(Boolean.valueOf(arVar.f255982c), false);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        mo94703e(false);
    }

    /* renamed from: j */
    public final void mo94707j(int i) {
        if (i != 0 && this.f293767h == 0) {
            if (C58832aw.m90831a(this.f293761b.mo94659d().f63720e, C9251ef.f31988f)) {
                ((C23251a) this.f293761b.mo94658c()).mo28730f(C9251ef.f31988f, false);
            }
            this.f293764e.clear();
        }
        this.f293767h = i;
    }
}
