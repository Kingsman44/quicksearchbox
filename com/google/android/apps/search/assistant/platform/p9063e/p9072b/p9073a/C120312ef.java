package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.libraries.search.assistant.p2783s.p2785b.C36404w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ef */
/* compiled from: PG */
public final class C120312ef extends C68247h {

    /* renamed from: a */
    private final C68283d f334739a;

    /* renamed from: c */
    private final C68283d f334740c;

    /* renamed from: d */
    private final C68283d f334741d;

    /* renamed from: e */
    private final C68283d f334742e;

    /* renamed from: f */
    private final C68283d f334743f;

    /* renamed from: g */
    private final C68283d f334744g;

    /* renamed from: h */
    private final C68283d f334745h;

    public C120312ef(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C120312ef.class), aVar);
        this.f334739a = C68236af.m98549d(dVar);
        this.f334740c = C68236af.m98549d(dVar2);
        this.f334741d = C68236af.m98549d(dVar3);
        this.f334742e = C68236af.m98549d(dVar4);
        this.f334743f = C68236af.m98549d(dVar5);
        this.f334744g = C68236af.m98549d(dVar6);
        this.f334745h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C71422aw awVar = (C71422aw) list.get(0);
        C71604be beVar = (C71604be) list.get(1);
        C71604be beVar2 = (C71604be) list.get(2);
        C71604be beVar3 = (C71604be) list.get(3);
        boolean booleanValue = ((Boolean) list.get(4)).booleanValue();
        C119829bx bxVar = (C119829bx) list.get(5);
        C36404w wVar = (C36404w) list.get(6);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(beVar, "userLocaleDeferred");
        C69664n.m101061g(beVar2, "spokenLocalesDeferred");
        C69664n.m101061g(beVar3, "spokenLangDeferred");
        C69664n.m101061g(bxVar, "fulfillmentConfiguration");
        C69664n.m101061g(wVar, "userInfoProvider");
        return C71663i.m104692e(awVar, (C71424ay) null, new C120297dy(wVar, booleanValue, beVar3, beVar, beVar2, bxVar, (C69577g) null), 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334739a.mo60297gq(), this.f334740c.mo60297gq(), this.f334741d.mo60297gq(), this.f334742e.mo60297gq(), this.f334743f.mo60297gq(), this.f334744g.mo60297gq(), this.f334745h.mo60297gq());
    }
}
