package com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.b.e */
/* compiled from: PG */
public final class C97039e implements C97037c {

    /* renamed from: a */
    private final C68214a f271164a;

    /* renamed from: b */
    private final C68214a f271165b;

    /* renamed from: c */
    private final C96982b f271166c;

    public C97039e(C68214a aVar, C68214a aVar2, C96982b bVar) {
        this.f271165b = aVar;
        this.f271164a = aVar2;
        this.f271166c = bVar;
    }

    /* renamed from: b */
    public final String mo90402b() {
        C96982b bVar = this.f271166c;
        return (bVar.f271037a & 2) != 0 ? bVar.f271039c : ((C86338r) this.f271164a.mo27525b()).getString("selected_search_country_code", BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public final String mo90403c() {
        C96982b bVar = this.f271166c;
        return (bVar.f271037a & 1) != 0 ? bVar.f271038b : ((C85854al) this.f271165b.mo27525b()).mo79488a();
    }

    /* renamed from: d */
    public final void mo90404d() {
    }

    /* renamed from: a */
    public final int mo90401a() {
        Locale locale;
        C96982b bVar = this.f271166c;
        if ((bVar.f271037a & 1) != 0) {
            locale = new Locale(bVar.f271038b, mo90402b());
        } else {
            locale = C90772bp.m148313u(((C85854al) this.f271165b.mo27525b()).mo79488a());
        }
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
