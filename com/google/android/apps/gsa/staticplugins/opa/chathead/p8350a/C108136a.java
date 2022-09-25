package com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.C90743b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.a.a */
/* compiled from: PG */
public final class C108136a {

    /* renamed from: a */
    public final Context f300764a;

    /* renamed from: b */
    public final C87568k f300765b;

    /* renamed from: c */
    public final C90743b f300766c;

    /* renamed from: d */
    private final C86124t f300767d;

    public C108136a(Context context, C87568k kVar, C90743b bVar, C86124t tVar) {
        this.f300764a = context;
        this.f300765b = kVar;
        this.f300766c = bVar;
        this.f300767d = tVar;
    }

    /* renamed from: a */
    public final boolean mo96479a() {
        return this.f300767d.mo79746e(C90037cp.f248616l);
    }

    /* renamed from: b */
    public final boolean mo96480b() {
        return this.f300767d.mo79746e(C90037cp.f248402J);
    }

    /* renamed from: c */
    public final boolean mo96481c() {
        return Settings.canDrawOverlays(this.f300764a) && !this.f300766c.f253818a.isEnabled() && mo96480b() && !mo96479a();
    }
}
