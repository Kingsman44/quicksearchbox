package com.google.android.libraries.assistant.auto.tng.common.p897a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.a.c */
/* compiled from: PG */
public final class C13207c extends C68247h {

    /* renamed from: a */
    private final C68283d f40850a;

    /* renamed from: c */
    private final C68283d f40851c;

    public C13207c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C13207c.class), aVar);
        this.f40850a = C68236af.m98549d(dVar);
        this.f40851c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C46175b) list.get(0)).mo50246c((AccountId) list.get(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f40850a.mo60297gq(), this.f40851c.mo60297gq());
    }
}
