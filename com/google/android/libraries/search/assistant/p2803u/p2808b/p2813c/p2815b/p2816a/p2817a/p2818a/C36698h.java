package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import android.accounts.Account;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C36698h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95594a;

    /* renamed from: b */
    public final /* synthetic */ boolean f95595b;

    public /* synthetic */ C36698h(C36701k kVar, boolean z) {
        this.f95594a = kVar;
        this.f95595b = z;
    }

    public final C60870cx apply(Object obj) {
        C36701k kVar = this.f95594a;
        boolean z = this.f95595b;
        Account account = (Account) obj;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(kVar.f95600a.mo40250n(account));
        }
        arrayList.add(kVar.f95600a.mo40249m(account));
        return C47638k.m84752c(arrayList).mo51521b(C36696f.f95589a, C60826bg.f164896a);
    }
}
