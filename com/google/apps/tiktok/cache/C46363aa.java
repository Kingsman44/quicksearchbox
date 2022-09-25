package com.google.apps.tiktok.cache;

import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.cache.aa */
/* compiled from: PG */
public final class C46363aa implements C47352j {

    /* renamed from: a */
    public static final C59071e f121371a = C59071e.m91332i("com.google.apps.tiktok.cache.aa");

    /* renamed from: b */
    public final Map f121372b;

    /* renamed from: c */
    private final C46092j f121373c;

    /* renamed from: d */
    private final C60887da f121374d;

    public C46363aa(Map map, C46092j jVar, C60887da daVar) {
        this.f121372b = map;
        this.f121373c = jVar;
        this.f121374d = daVar;
    }

    /* renamed from: a */
    private final C60870cx m82667a(C47153d dVar) {
        return C60922j.m93044g(this.f121373c.mo50202b(dVar), new C46410y(this), this.f121374d);
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        return C60856cj.m92895d(m82667a(C47153d.m83864c(1)), m82667a(C47153d.m83864c(2))).mo57334a(new C60934v((Object) null), this.f121374d);
    }
}
