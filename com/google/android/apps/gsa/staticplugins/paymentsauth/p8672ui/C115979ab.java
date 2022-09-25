package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.content.Context;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22946k;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import dagger.p5294a.C68221g;
import java.util.HashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.ab */
/* compiled from: PG */
public final class C115979ab implements C22946k {

    /* renamed from: a */
    private final C69464a f321609a;

    public C115979ab(C69464a aVar) {
        this.f321609a = aVar;
    }

    /* renamed from: a */
    public final C23115k mo28317a() {
        return new C23115k(new HashMap());
    }

    /* renamed from: b */
    public final /* synthetic */ C22939d mo28318b(C22945j jVar) {
        return new PasswordRenderer(jVar, new C115981ad(jVar), (Context) ((C68221g) this.f321609a).f184583a);
    }
}
