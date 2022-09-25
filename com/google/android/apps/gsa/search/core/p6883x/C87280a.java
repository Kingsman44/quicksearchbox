package com.google.android.apps.gsa.search.core.p6883x;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21602b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.x.a */
/* compiled from: PG */
public final class C87280a {

    /* renamed from: a */
    private final Context f235741a;

    /* renamed from: b */
    private final C68214a f235742b;

    /* renamed from: c */
    private final C68214a f235743c;

    /* renamed from: d */
    private final C68214a f235744d;

    public C87280a(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f235741a = context;
        this.f235744d = aVar;
        this.f235742b = aVar2;
        this.f235743c = aVar3;
    }

    /* renamed from: a */
    public final void mo80926a(Intent intent) {
        if ("com.google.android.apps.books".equals(intent.getPackage())) {
            String F = ((C86054o) this.f235744d.mo27525b()).mo79659F();
            if (!TextUtils.isEmpty(F)) {
                C21601a aVar = (C21601a) this.f235742b.mo27525b();
                C21602b a = C21601a.m40714a(F);
                C21603c cVar = (C21603c) this.f235743c.mo27525b();
                C144354b.m234631a(this.f235741a, intent, a.f59976a);
            }
        }
    }
}
