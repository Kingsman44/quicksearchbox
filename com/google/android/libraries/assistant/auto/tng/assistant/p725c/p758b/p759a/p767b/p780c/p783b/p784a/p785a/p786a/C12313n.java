package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p783b.p784a.p785a.p786a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p863a.C12892c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.b.a.a.a.n */
/* compiled from: PG */
public final class C12313n extends C68247h {

    /* renamed from: a */
    private final C68283d f39116a;

    /* renamed from: c */
    private final C68283d f39117c;

    public C12313n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12313n.class), aVar);
        this.f39116a = C68236af.m98549d(dVar);
        this.f39117c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12892c cVar = (C12892c) list.get(1);
        C12989g a = C12989g.m29225a(((C12991i) list.get(0)).f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        return cVar.mo20838a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39116a.mo60297gq(), this.f39117c.mo60297gq());
    }
}
