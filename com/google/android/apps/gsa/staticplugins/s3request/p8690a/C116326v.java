package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.search.core.p6517ak.C84568a;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.v */
/* compiled from: PG */
public final class C116326v extends C68247h {

    /* renamed from: a */
    private final C68283d f322496a;

    /* renamed from: c */
    private final C68283d f322497c;

    /* renamed from: d */
    private final C68283d f322498d;

    /* renamed from: e */
    private final C68283d f322499e;

    /* renamed from: f */
    private final C68283d f322500f;

    /* renamed from: g */
    private final C68283d f322501g;

    /* renamed from: h */
    private final C68283d f322502h;

    /* renamed from: i */
    private final C68283d f322503i;

    /* renamed from: j */
    private final C68283d f322504j;

    public C116326v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C116326v.class), aVar);
        this.f322496a = C68236af.m98549d(dVar);
        this.f322497c = C68236af.m98549d(dVar2);
        this.f322498d = C68236af.m98549d(dVar3);
        this.f322499e = C68236af.m98549d(dVar4);
        this.f322500f = C68236af.m98549d(dVar5);
        this.f322501g = C68236af.m98549d(dVar6);
        this.f322502h = C68236af.m98549d(dVar7);
        this.f322503i = C68236af.m98549d(dVar8);
        this.f322504j = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        C84568a a = ((C84600b) list.get(2)).mo78367a(d.mo41492a());
        C92444a aVar = new C92444a();
        aVar.mo87128d((C92302a) list.get(0));
        aVar.mo87130f((C89994f) list.get(1));
        aVar.f257822c = C58833ax.m90834k(a);
        aVar.mo87131g((C58833ax) list.get(4));
        aVar.mo87129e((C58833ax) list.get(5));
        aVar.mo87127c((C58833ax) list.get(6));
        aVar.f257828i = C58833ax.m90834k(Boolean.valueOf(booleanValue));
        aVar.mo87126b((C58833ax) list.get(8));
        return ((C60887da) list.get(7)).mo19399b(new C92452i(aVar.mo87125a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322496a.mo60297gq(), this.f322497c.mo60297gq(), this.f322498d.mo60297gq(), this.f322499e.mo60297gq(), this.f322500f.mo60297gq(), this.f322501g.mo60297gq(), this.f322502h.mo60297gq(), this.f322503i.mo60297gq(), this.f322504j.mo60297gq());
    }
}
