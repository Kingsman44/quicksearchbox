package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.g */
/* compiled from: PG */
public final class C12381g extends C68247h {

    /* renamed from: a */
    private final C68283d f39217a;

    /* renamed from: c */
    private final C68283d f39218c;

    /* renamed from: d */
    private final C68283d f39219d;

    public C12381g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12381g.class), aVar);
        this.f39217a = C68236af.m98549d(dVar);
        this.f39218c = C68236af.m98549d(dVar2);
        this.f39219d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Set set = (Set) list.get(0);
        Executor executor = (Executor) list.get(1);
        C15481g gVar = (C15481g) list.get(2);
        if (set.isEmpty()) {
            ((C59052c) ((C59052c) C12380f.f39216a.mo56226d()).mo56372aa(44216)).mo56386p("No CDC Update handlers were bound. This means there will be no handling of ClientDiscourseContext updates, which will impact several features.");
        }
        ((C59052c) ((C59052c) C12380f.f39216a.mo56224b()).mo56372aa(44215)).mo56387q("Creating S3Request Source with %1$d CDC Update handlers", set.size());
        return C60856cj.m92900i(new C12379e(set, executor, gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39217a.mo60297gq(), this.f39218c.mo60297gq(), this.f39219d.mo60297gq());
    }
}
