package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1131g.p1132a;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1120a.p1121a.C15536b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1138a.C15591d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.g.a.f */
/* compiled from: PG */
public final class C15579f extends C68247h {

    /* renamed from: a */
    private final C68283d f46599a;

    /* renamed from: c */
    private final C68283d f46600c;

    /* renamed from: d */
    private final C68283d f46601d;

    public C15579f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C15579f.class), aVar);
        this.f46599a = C68236af.m98549d(dVar);
        this.f46600c = C68236af.m98549d(dVar2);
        this.f46601d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C15591d dVar = (C15591d) list.get(0);
        C15536b bVar = (C15536b) list.get(1);
        if (!((Boolean) list.get(2)).booleanValue()) {
            return C60856cj.m92900i(dVar.mo22409b());
        }
        C60870cx a = bVar.mo22395a();
        C15574a aVar = new C15574a(dVar);
        return C60922j.m93044g(a, C47810es.m84963c(aVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f46599a.mo60297gq(), this.f46600c.mo60297gq(), this.f46601d.mo60297gq());
    }
}
