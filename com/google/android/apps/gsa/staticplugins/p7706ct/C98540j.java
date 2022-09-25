package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66528t;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.j */
/* compiled from: PG */
public final class C98540j extends C66528t {

    /* renamed from: a */
    public final C98530ac f275154a;

    /* renamed from: b */
    public final C98530ac f275155b;

    /* renamed from: c */
    private final C118831d f275156c;

    public C98540j(C68214a aVar, C68214a aVar2, C118827a aVar3, C22871g gVar) {
        this.f275154a = new C98530ac(aVar, gVar);
        this.f275155b = new C98530ac(aVar2, gVar);
        this.f275156c = aVar3.mo77944g(C118569b.PUMPKIN_USER_VALIDATOR_GET_POSTERIOR_LATENCY, C118575h.PUMPKIN_VALIDATOR_LOCAL);
    }

    /* renamed from: c */
    public static final Float m163227c(C60870cx cxVar) {
        try {
            return (Float) C90877ak.m148472f(cxVar);
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        long a = this.f275156c.mo104019a();
        C60870cx c = this.f275154a.mo91163c(str);
        C60870cx c2 = this.f275155b.mo91163c(str);
        Float c3 = m163227c(C60856cj.m92893b(c, c2).mo57334a(new C98538h(c, c2), C60826bg.f164896a));
        C118837d.m197250d(this.f275156c, a);
        return c3.floatValue();
    }

    /* renamed from: b */
    public final String mo59674b(String str) {
        C60870cx c = this.f275154a.mo91163c(str);
        C60870cx c2 = this.f275155b.mo91163c(str);
        try {
            return (String) C90877ak.m148472f(C60856cj.m92893b(c, c2).mo57334a(new C98539i(this, c, c2, str), C60826bg.f164896a));
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            return str;
        }
    }
}
