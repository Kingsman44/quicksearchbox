package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9077d;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.d.c */
/* compiled from: PG */
public final class C120272c extends C68247h {

    /* renamed from: a */
    private final C68283d f334653a;

    /* renamed from: c */
    private final C68283d f334654c;

    /* renamed from: d */
    private final C68283d f334655d;

    public C120272c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C120272c.class), aVar);
        this.f334653a = C68236af.m98549d(dVar);
        this.f334654c = C68236af.m98549d(dVar2);
        this.f334655d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        if (!((Optional) list.get(1)).isPresent() || !optional.isPresent() || !booleanValue) {
            obj2 = C58733pz.f156496a;
        } else {
            obj2 = new C58759qy((C17268f) optional.get());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334653a.mo60297gq(), this.f334654c.mo60297gq(), this.f334655d.mo60297gq());
    }
}
