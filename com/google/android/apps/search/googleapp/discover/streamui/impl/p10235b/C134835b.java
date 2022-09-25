package com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134463a;
import com.google.android.apps.search.googleapp.discover.p10181d.C134199ad;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59722dg;
import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62940bt;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b.b */
/* compiled from: PG */
public final class C134835b implements C134463a {

    /* renamed from: a */
    public C134834a f367074a;

    /* renamed from: b */
    public int f367075b = 2;

    /* renamed from: c */
    private final Fragment f367076c;

    /* renamed from: d */
    private final C134199ad f367077d;

    public C134835b(Fragment fragment, C134199ad adVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(adVar, "nextPageAppFlowLogger");
        this.f367076c = fragment;
        this.f367077d = adVar;
    }

    /* renamed from: a */
    public final void mo112018a(C134834a aVar) {
        C134199ad adVar = this.f367077d;
        C57528m mVar = aVar.f367072b;
        C59722dg dgVar = aVar.f367073c;
        C37258g gVar = C37182a.f97812ar;
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        dgVar.getClass();
        czVar.f160213d = dgVar;
        czVar.f160210a |= 16;
        UUID b = adVar.mo111608b(mVar, gVar.mo40812e(btVar, (C59711cz) cyVar.build()));
        C135359p pVar = aVar.f367071a;
        C69664n.m101060f(b, "uuid");
        C47393f.m84236g(new C134840g(pVar, b), this.f367076c);
    }

    /* renamed from: g */
    public final void mo111496g() {
        this.f367075b = 2;
    }

    /* renamed from: h */
    public final void mo111497h() {
        this.f367075b = 1;
        C134834a aVar = this.f367074a;
        if (aVar != null) {
            mo112018a(aVar);
            this.f367074a = null;
        }
    }
}
