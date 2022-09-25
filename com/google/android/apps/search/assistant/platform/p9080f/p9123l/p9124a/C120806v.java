package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120518a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120609d;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.v */
/* compiled from: PG */
public final class C120806v extends C68247h {

    /* renamed from: a */
    private final C68283d f335960a;

    /* renamed from: c */
    private final C68283d f335961c;

    /* renamed from: d */
    private final C68283d f335962d;

    public C120806v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C120806v.class), aVar);
        this.f335960a = C68236af.m98549d(dVar);
        this.f335961c = C68236af.m98549d(dVar2);
        this.f335962d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(1);
        Optional optional2 = (Optional) list.get(2);
        C60870cx i = C60856cj.m92900i(((C120609d) list.get(0)).mo104698a());
        if (optional.isPresent()) {
            return ((C120782c) optional.get()).mo104927c(i, false);
        }
        if (!optional2.isPresent()) {
            return i;
        }
        return ((C120518a) optional2.get()).mo104801b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335960a.mo60297gq(), this.f335961c.mo60297gq(), this.f335962d.mo60297gq());
    }
}
