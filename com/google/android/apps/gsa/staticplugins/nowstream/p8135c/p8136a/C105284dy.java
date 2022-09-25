package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87315an;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90225a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91795b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105389aa;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105456z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dy */
/* compiled from: PG */
public final class C105284dy extends C23056g implements C105389aa, C90232h {

    /* renamed from: a */
    private static final C59071e f293752a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.dy");

    /* renamed from: b */
    private final C105456z f293753b;

    /* renamed from: c */
    private C90225a f293754c;

    static {
        TimeUnit.SECONDS.toMillis(5);
    }

    public C105284dy(C23052c cVar, C105456z zVar) {
        super(cVar);
        this.f293753b = zVar;
    }

    /* renamed from: e */
    public final void mo94701e() {
        C90225a aVar = this.f293754c;
        if (aVar != null) {
            aVar.mo80973a();
            this.f293754c = null;
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91795b bVar = (C91795b) C23245b.m43557b(protoParcelable, C91795b.f255983c.getParserForType(), C62921ba.m95368a(), true);
        if (bVar != null) {
            C23251a aVar = (C23251a) this.f293753b.mo94656f();
            C90229e a = C90229e.m146771a(bVar.f255986b);
            if (a == null) {
                a = C90229e.UNKNOWN;
            }
            aVar.mo28730f(C58833ax.m90834k(a), false);
        }
    }

    /* renamed from: iv */
    public final void mo83943iv(C90231g gVar) {
        if (!(gVar instanceof C87315an)) {
            ((C59052c) ((C59052c) f293752a.mo56226d()).mo56372aa(22289)).mo56386p("Failed to show snackbar: Trying to set params of invalid type");
            int i = C90755l.f253831a;
            ((C23251a) this.f293753b.mo94655e()).mo28730f(BuildConfig.FLAVOR, false);
            ((C23251a) this.f293753b.mo94652b()).mo28730f(C58836b.f156633a, false);
            return;
        }
        C87315an anVar = (C87315an) gVar;
        ((C23251a) this.f293753b.mo94655e()).mo28730f((String) anVar.f235805a.f252077a, false);
        ((C23251a) this.f293753b.mo94652b()).mo28730f(C58833ax.m90834k((String) anVar.f235806b.f252077a), false);
        ((C23251a) this.f293753b.mo94654d()).mo28730f((Boolean) anVar.f235807c.f252077a, false);
        ((C23251a) this.f293753b.mo94653c()).mo28730f(true, false);
        this.f293754c = anVar.f235806b.f252078b;
    }
}
