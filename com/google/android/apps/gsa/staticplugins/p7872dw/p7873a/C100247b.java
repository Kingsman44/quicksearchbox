package com.google.android.apps.gsa.staticplugins.p7872dw.p7873a;

import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.p6990an.C89225p;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100249a;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100252d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.a.b */
/* compiled from: PG */
public final class C100247b extends C23056g implements C100249a {

    /* renamed from: e */
    private static final C59071e f280361e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dw.a.b");

    /* renamed from: a */
    public final Context f280362a;

    /* renamed from: b */
    public final C100252d f280363b;

    /* renamed from: c */
    public final C85355a f280364c;

    /* renamed from: d */
    public final C87290c f280365d;

    public C100247b(Context context, C23052c cVar, C100252d dVar, C87290c cVar2, C85355a aVar) {
        super(cVar);
        this.f280362a = context;
        this.f280363b = dVar;
        this.f280365d = cVar2;
        this.f280364c = aVar;
    }

    /* renamed from: e */
    public static boolean m166145e(int i, String str) {
        if (i != 0) {
            return i != 7 || !TextUtils.isEmpty(str);
        }
        return false;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58976aa aaVar = C58975e.f156826a;
        C89225p pVar = (C89225p) C23245b.m43557b(protoParcelable, C89225p.f241917e.getParserForType(), C62921ba.m95368a(), true);
        if (pVar == null) {
            C59104x c = f280361e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SuggestFeedbaController");
            ((C59052c) ((C59052c) c).mo56372aa(33285)).mo56386p("Invalid proto sent to controller");
            return;
        }
        C23251a aVar = (C23251a) this.f280363b.mo91832j();
        int i = pVar.f241919a & 1;
        String str = BuildConfig.FLAVOR;
        aVar.mo28730f(i != 0 ? pVar.f241920b : str, false);
        this.f280363b.mo91834l().mo28730f((pVar.f241919a & 2) != 0 ? pVar.f241921c : str, false);
        C23251a k = this.f280363b.mo91833k();
        if ((pVar.f241919a & 4) != 0) {
            str = pVar.f241922d;
        }
        k.mo28730f(str, false);
        ((C23251a) this.f280363b.mo91829g()).mo28730f(false, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C58976aa aaVar = C58975e.f156826a;
        ((C23251a) this.f280363b.mo91825c()).mo28730f((String) ((C23251a) this.f280363b.mo91824b()).f63720e, false);
        ((C23251a) this.f280363b.mo91826d()).mo28730f((String) ((C23251a) this.f280363b.mo91828f()).f63720e, false);
    }
}
