package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.h */
/* compiled from: PG */
public final class C107597h extends C107609t {

    /* renamed from: a */
    public final Context f299332a;

    /* renamed from: b */
    private final C28292j f299333b;

    /* renamed from: c */
    private final C22871g f299334c;

    public C107597h(Context context, C22871g gVar) {
        C28292j jVar = new C28292j(79903);
        jVar.mo33795i(5);
        this.f299333b = jVar;
        this.f299332a = context;
        this.f299334c = gVar;
    }

    /* renamed from: a */
    public final C107608s mo96062a(int i, String str) {
        View inflate = LayoutInflater.from(this.f299332a).inflate(R.layout.rich_input_content_coin, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.opa_rich_input_generic_icon)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.opa_richinput_content_text)).setText(str);
        C107607r f = C107608s.m178492f();
        f.mo96047b(inflate);
        C107581a aVar = (C107581a) f;
        aVar.f299301a = C58833ax.m90834k(str);
        aVar.f299302b = this.f299333b;
        return f.mo96046a();
    }

    /* renamed from: b */
    public final C60870cx mo96061b() {
        return this.f299334c.mo28209i(this.f299334c.mo28201a("NavigateSuggestionBldr", C107594e.f299320a), "NavigateSuggestionBldr", new C107595f(this));
    }
}
