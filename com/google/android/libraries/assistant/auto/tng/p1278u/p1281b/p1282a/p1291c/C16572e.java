package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1291c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.C16443a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.c.e */
/* compiled from: PG */
public final class C16572e extends C68247h {

    /* renamed from: a */
    private final C68283d f48609a;

    /* renamed from: c */
    private final C68283d f48610c;

    public C16572e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16572e.class), aVar);
        this.f48609a = C68236af.m98549d(dVar);
        this.f48610c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C16443a aVar = (C16443a) list.get(0);
        C12989g a = C12989g.m29225a(((C12991i) list.get(1)).f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        return aVar.mo22922a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48609a.mo60297gq(), this.f48610c.mo60297gq());
    }
}
