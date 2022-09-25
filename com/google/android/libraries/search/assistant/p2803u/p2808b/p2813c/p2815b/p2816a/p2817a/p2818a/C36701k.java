package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36724ar;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.C36690a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.adx;
import com.google.assistant.p3861at.adz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.k */
/* compiled from: PG */
public final class C36701k implements C36690a {

    /* renamed from: a */
    public final C36624a f95600a;

    /* renamed from: b */
    public final AccountId f95601b;

    /* renamed from: c */
    public final C46128f f95602c;

    /* renamed from: d */
    public final C21370a f95603d;

    /* renamed from: e */
    public final C36657a f95604e;

    /* renamed from: f */
    public final C36680d f95605f;

    /* renamed from: g */
    public C58833ax f95606g = C58836b.f156633a;

    public C36701k(AccountId accountId, C36624a aVar, C46128f fVar, C36657a aVar2, C21370a aVar3, C36680d dVar) {
        this.f95601b = accountId;
        this.f95600a = aVar;
        this.f95602c = fVar;
        this.f95604e = aVar2;
        this.f95603d = aVar3;
        this.f95605f = dVar;
    }

    /* renamed from: d */
    public static adz m65296d() {
        adx adx = (adx) adz.f129082c.createBuilder();
        adx.copyOnWrite();
        adz adz = (adz) adx.instance;
        adz.f129085b = 0;
        adz.f129084a |= 1;
        return (adz) adx.build();
    }

    /* renamed from: a */
    public final C46689ag mo40332a(String str) {
        return new C36700j(this, str);
    }

    /* renamed from: b */
    public final C60870cx mo40333b(boolean z) {
        C60870cx a = this.f95602c.mo50214a(this.f95601b);
        C36698h hVar = new C36698h(this, z);
        return C60922j.m93045h(a, C47810es.m84966f(hVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo40334c(C36724ar arVar) {
        C60870cx a = this.f95602c.mo50214a(this.f95601b);
        C36699i iVar = new C36699i(this, arVar);
        return C60922j.m93045h(a, C47810es.m84966f(iVar), C60826bg.f164896a);
    }
}
