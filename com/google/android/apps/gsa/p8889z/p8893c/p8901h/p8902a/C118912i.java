package com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8902a;

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

/* renamed from: com.google.android.apps.gsa.z.c.h.a.i */
/* compiled from: PG */
public final class C118912i extends C68247h {

    /* renamed from: a */
    private final C68283d f331631a;

    /* renamed from: c */
    private final C68283d f331632c;

    /* renamed from: d */
    private final C68283d f331633d;

    /* renamed from: e */
    private final C68283d f331634e;

    /* renamed from: f */
    private final C68283d f331635f;

    /* renamed from: g */
    private final C68283d f331636g;

    /* renamed from: h */
    private final C68283d f331637h;

    /* renamed from: i */
    private final C68283d f331638i;

    /* renamed from: j */
    private final C68283d f331639j;

    /* renamed from: k */
    private final C68283d f331640k;

    public C118912i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10) {
        super(aVar2, new C68277d(C118912i.class), aVar);
        this.f331631a = C68236af.m98549d(dVar);
        this.f331632c = C68236af.m98549d(dVar2);
        this.f331633d = C68236af.m98549d(dVar3);
        this.f331634e = C68236af.m98549d(dVar4);
        this.f331635f = C68236af.m98549d(dVar5);
        this.f331636g = C68236af.m98549d(dVar6);
        this.f331637h = C68236af.m98549d(dVar7);
        this.f331638i = C68236af.m98549d(dVar8);
        this.f331639j = C68236af.m98549d(dVar9);
        this.f331640k = C68236af.m98549d(dVar10);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        C60887da daVar = (C60887da) list.get(7);
        C58833ax axVar = (C58833ax) list.get(9);
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
        if (axVar != null) {
            aVar.f257830k = axVar;
            return daVar.mo19399b(new C92452i(aVar.mo87125a()));
        }
        throw new NullPointerException("Null impersonatedUser");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331631a.mo60297gq(), this.f331632c.mo60297gq(), this.f331633d.mo60297gq(), this.f331634e.mo60297gq(), this.f331635f.mo60297gq(), this.f331636g.mo60297gq(), this.f331637h.mo60297gq(), this.f331638i.mo60297gq(), this.f331639j.mo60297gq(), this.f331640k.mo60297gq());
    }
}
