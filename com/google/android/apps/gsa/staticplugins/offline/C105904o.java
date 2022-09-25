package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.o */
/* compiled from: PG */
public final class C105904o extends C68247h {

    /* renamed from: a */
    private final C68283d f295576a;

    /* renamed from: c */
    private final C68283d f295577c;

    /* renamed from: d */
    private final C68283d f295578d;

    /* renamed from: e */
    private final C68283d f295579e;

    /* renamed from: f */
    private final C68283d f295580f;

    /* renamed from: g */
    private final C69464a f295581g;

    /* renamed from: h */
    private final C69464a f295582h;

    /* renamed from: i */
    private final C69464a f295583i;

    /* renamed from: j */
    private final C69464a f295584j;

    /* renamed from: k */
    private final C69464a f295585k;

    /* renamed from: l */
    private final C68283d f295586l;

    /* renamed from: m */
    private final C68283d f295587m;

    /* renamed from: n */
    private final C68283d f295588n;

    /* renamed from: o */
    private final C68283d f295589o;

    /* renamed from: p */
    private final C68283d f295590p;

    /* renamed from: q */
    private final C68283d f295591q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105904o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10, C68283d dVar11) {
        super(aVar2, new C68277d(C105904o.class), aVar);
        C69464a aVar8 = aVar;
        C69464a aVar9 = aVar2;
        this.f295576a = C68236af.m98549d(dVar);
        this.f295577c = C68236af.m98549d(dVar2);
        this.f295578d = C68236af.m98549d(dVar3);
        this.f295579e = C68236af.m98549d(dVar4);
        this.f295580f = C68236af.m98549d(dVar5);
        this.f295581g = aVar3;
        this.f295582h = aVar4;
        this.f295583i = aVar5;
        this.f295584j = aVar6;
        this.f295585k = aVar7;
        this.f295586l = C68236af.m98549d(dVar6);
        this.f295587m = C68236af.m98549d(dVar7);
        this.f295588n = C68236af.m98549d(dVar8);
        this.f295589o = C68236af.m98549d(dVar9);
        this.f295590p = C68236af.m98549d(dVar10);
        this.f295591q = C68236af.m98549d(dVar11);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        Context context = (Context) list.get(1);
        Locale locale = (Locale) list.get(3);
        C68214a a = C68219e.m98518a(this.f295581g);
        C68214a a2 = C68219e.m98518a(this.f295582h);
        C68214a a3 = C68219e.m98518a(this.f295583i);
        C68219e.m98518a(this.f295584j);
        C68214a a4 = C68219e.m98518a(this.f295585k);
        C90476a aVar = (C90476a) list.get(5);
        C90479a aVar2 = (C90479a) list.get(6);
        b bVar = (b) list.get(8);
        return C60856cj.m92900i(C58833ax.m90834k(new OfflineActionBuilder((C86054o) a.mo27525b(), (C86159h) a2.mo27525b(), locale, (String) list.get(2), (String) list.get(4), (C86124t) a3.mo27525b(), (C89859i) a4.mo27525b(), (C84516aa) list.get(7), (C91123v) list.get(9), (OfflineLoader) list.get(10))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f295576a.mo60297gq(), this.f295577c.mo60297gq(), this.f295578d.mo60297gq(), this.f295579e.mo60297gq(), this.f295580f.mo60297gq(), this.f295586l.mo60297gq(), this.f295587m.mo60297gq(), this.f295588n.mo60297gq(), this.f295589o.mo60297gq(), this.f295590p.mo60297gq(), this.f295591q.mo60297gq());
    }
}
