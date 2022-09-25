package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.p10289a;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.h.p.a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135505b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135568a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.silk.p3205a.p3228q.C41731a;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.a.a */
/* compiled from: PG */
public final class C135758a implements C41731a {

    /* renamed from: a */
    private final C43262m f369781a;

    /* renamed from: b */
    private final C136832c f369782b;

    /* renamed from: c */
    private final Fragment f369783c;

    /* renamed from: d */
    private final a f369784d;

    public C135758a(C43262m mVar, C136832c cVar, Fragment fragment, a aVar) {
        this.f369781a = mVar;
        this.f369782b = cVar;
        this.f369783c = fragment;
        this.f369784d = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo42557a(C56796d dVar) {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }

    /* renamed from: b */
    public final C60870cx mo42558b(C56800h hVar) {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }

    /* renamed from: c */
    public final C60870cx mo42559c(C56802j jVar) {
        if (jVar == null || jVar.f151581a.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid request supplied to silk navigation API."));
        }
        C47393f.m84236g(new C135505b(), this.f369783c);
        Uri parse = Uri.parse(jVar.f151581a);
        if (this.f369782b.mo113404j(parse)) {
            a aVar = this.f369784d;
            C136832c cVar = this.f369782b;
            C58893dc.m90996a(parse);
            String b = cVar.mo113396b(parse);
            C58893dc.m90996a(b);
            aVar.mo41490e(a.b(b, Optional.empty(), C58729pv.f156485a));
        } else {
            C135568a aVar2 = (C135568a) C135569b.f369275f.createBuilder();
            C135461g gVar = C135461g.GOC;
            aVar2.copyOnWrite();
            C135569b bVar = (C135569b) aVar2.instance;
            bVar.f369279b = gVar.f369058p;
            bVar.f369278a |= 1;
            C43255f m = C43257h.m76306m(jVar.f151581a);
            C43316a aVar3 = (C43316a) C43323b.f113174a.createBuilder();
            aVar3.mo58885m(C135569b.f369276g, (C135569b) aVar2.build());
            m.mo46343d((C43323b) aVar3.build());
            this.f369781a.mo46333b(m.mo46365k());
        }
        return C60866ct.f164955a;
    }
}
