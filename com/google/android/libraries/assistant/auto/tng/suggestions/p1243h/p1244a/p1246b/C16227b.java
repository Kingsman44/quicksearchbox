package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.p1246b;

import com.google.assistant.p3994s.p3995a.C53253ha;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53454om;
import com.google.assistant.p3994s.p3995a.C53455on;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.b */
/* compiled from: PG */
public final class C16227b extends C68247h {

    /* renamed from: a */
    private final C68283d f47808a;

    /* renamed from: c */
    private final C68283d f47809c;

    public C16227b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16227b.class), aVar);
        this.f47808a = C68236af.m98549d(dVar);
        this.f47809c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C53253ha haVar = (C53253ha) list.get(0);
        C53271hs hsVar = (C53271hs) list.get(1);
        C53454om omVar = (C53454om) C53455on.f140296d.createBuilder();
        omVar.copyOnWrite();
        C53455on onVar = (C53455on) omVar.instance;
        haVar.getClass();
        onVar.f140299b = haVar;
        onVar.f140298a |= 1;
        omVar.copyOnWrite();
        C53455on onVar2 = (C53455on) omVar.instance;
        hsVar.getClass();
        onVar2.f140300c = hsVar;
        onVar2.f140298a |= 2;
        return C60856cj.m92900i((C53455on) omVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47808a.mo60297gq(), this.f47809c.mo60297gq());
    }
}
