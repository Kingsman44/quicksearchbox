package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.core.service.C86781x;
import com.google.android.apps.gsa.search.core.service.C86782y;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b */
/* compiled from: PG */
public final class C105858b implements C86781x {

    /* renamed from: a */
    private final Context f295445a;

    /* renamed from: b */
    private final C90476a f295446b;

    /* renamed from: c */
    private final C90479a f295447c;

    /* renamed from: d */
    private final String f295448d;

    /* renamed from: e */
    private final C68214a f295449e;

    /* renamed from: f */
    private final C68214a f295450f;

    /* renamed from: g */
    private final C68214a f295451g;

    /* renamed from: h */
    private final C68214a f295452h;

    /* renamed from: i */
    private final C89994f f295453i;

    /* renamed from: j */
    private final C68214a f295454j;

    /* renamed from: k */
    private final C68214a f295455k;

    /* renamed from: l */
    private final C58833ax f295456l;

    /* renamed from: m */
    private final C84885a f295457m;

    /* renamed from: n */
    private final C84516aa f295458n;

    /* renamed from: o */
    private final b f295459o;

    /* renamed from: p */
    private final OfflineLoader f295460p;

    /* renamed from: q */
    private final C91123v f295461q;

    public C105858b(C68214a aVar, Context context, C90476a aVar2, C90479a aVar3, String str, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C91123v vVar, C89994f fVar, C68214a aVar8, C58833ax axVar, C84885a aVar9, C84516aa aaVar, b bVar, OfflineLoader offlineLoader) {
        this.f295445a = context;
        this.f295446b = aVar2;
        this.f295447c = aVar3;
        this.f295448d = str;
        this.f295449e = aVar4;
        this.f295450f = aVar5;
        this.f295451g = aVar6;
        this.f295452h = aVar7;
        this.f295461q = vVar;
        this.f295453i = fVar;
        this.f295454j = aVar8;
        this.f295455k = aVar;
        this.f295456l = axVar;
        this.f295457m = aVar9;
        this.f295458n = aaVar;
        this.f295459o = bVar;
        this.f295460p = offlineLoader;
    }

    /* renamed from: a */
    public final C86782y mo80397a(Query query, C118575h hVar) {
        C89356b a = ((C84466a) this.f295454j.mo27525b()).mo78025a("offline", 133, hVar.f330812sk);
        query.getClass();
        Context context = this.f295445a;
        context.getClass();
        C90476a aVar = this.f295446b;
        aVar.getClass();
        C90479a aVar2 = this.f295447c;
        aVar2.getClass();
        String str = this.f295448d;
        str.getClass();
        C86054o oVar = (C86054o) this.f295449e.mo27525b();
        oVar.getClass();
        C86159h hVar2 = (C86159h) this.f295450f.mo27525b();
        hVar2.getClass();
        C86124t tVar = (C86124t) this.f295451g.mo27525b();
        tVar.getClass();
        C89911f fVar = (C89911f) this.f295452h.mo27525b();
        fVar.getClass();
        C91123v vVar = this.f295461q;
        vVar.getClass();
        C89994f fVar2 = this.f295453i;
        fVar2.getClass();
        C89859i iVar = (C89859i) this.f295455k.mo27525b();
        iVar.getClass();
        C58833ax axVar = this.f295456l;
        C84516aa aaVar = this.f295458n;
        aaVar.getClass();
        b bVar = this.f295459o;
        bVar.getClass();
        OfflineLoader offlineLoader = this.f295460p;
        offlineLoader.getClass();
        return new C105855a(context, aVar, aVar2, str, oVar, hVar2, fVar, vVar, fVar2, tVar, a, iVar, query, axVar, aaVar, bVar, offlineLoader);
    }
}
