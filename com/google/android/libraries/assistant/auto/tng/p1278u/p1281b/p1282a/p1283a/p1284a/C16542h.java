package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1288d.C16533a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.h */
/* compiled from: PG */
public final class C16542h extends C68247h {

    /* renamed from: a */
    private final C68283d f48533a;

    /* renamed from: c */
    private final C68283d f48534c;

    public C16542h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16542h.class), aVar);
        this.f48533a = C68236af.m98549d(dVar);
        this.f48534c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Executor executor = (Executor) list.get(1);
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        C16533a aVar = (C16533a) axVar.mo56107c();
        return C60856cj.m92900i("AUTO-Toy-ProjectedCar-2021");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48533a.mo60297gq(), this.f48534c.mo60297gq());
    }
}
