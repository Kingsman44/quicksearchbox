package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p417d.C8600b;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bo */
/* compiled from: PG */
public final class C116604bo extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323380a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.bo");

    /* renamed from: b */
    static final C58485gu f323381b = C58485gu.m89847o(C8600b.WEB, C8600b.IN_APPS);

    /* renamed from: c */
    public final C68214a f323382c;

    /* renamed from: d */
    public final C68214a f323383d;

    /* renamed from: e */
    public final C22871g f323384e;

    /* renamed from: f */
    public boolean f323385f;

    /* renamed from: g */
    public boolean f323386g;

    /* renamed from: h */
    public long f323387h = 0;

    /* renamed from: i */
    public List f323388i;

    /* renamed from: j */
    public boolean f323389j;

    public C116604bo(C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar) {
        super(aVar, 188);
        this.f323382c = aVar2;
        this.f323383d = aVar3;
        this.f323384e = gVar;
    }

    /* renamed from: e */
    public static boolean m193482e(C116611bv bvVar) {
        SearchError searchError = bvVar.f323415e;
        return searchError != null && searchError.mo81138R(16);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CorpusState");
    }
}
