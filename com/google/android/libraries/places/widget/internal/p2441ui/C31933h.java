package com.google.android.libraries.places.widget.internal.p2441ui;

import android.content.Context;
import android.support.p031v4.app.C0173as;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.places.p2424a.p2425a.C31770a;
import com.google.android.libraries.places.p2424a.p2425a.C31772c;
import com.google.android.libraries.places.p2424a.p2425a.C31773d;
import com.google.android.libraries.places.p2424a.p2425a.C31777h;
import com.google.android.libraries.places.widget.internal.common.AutocompleteOptions;
import com.google.android.libraries.places.widget.internal.logging.C31924b;
import com.google.android.libraries.places.widget.internal.logging.C31925c;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.h */
/* compiled from: PG */
public final class C31933h extends C0173as {

    /* renamed from: a */
    private final int f85894a;

    /* renamed from: b */
    private final C31863s f85895b;

    /* renamed from: c */
    private final AutocompleteOptions f85896c;

    /* renamed from: d */
    private final C31924b f85897d;

    /* renamed from: e */
    private final C21370a f85898e = new C21375e();

    public C31933h(int i, Context context, AutocompleteOptions autocompleteOptions) {
        this.f85894a = i;
        Context applicationContext = context.getApplicationContext();
        C31772c d = C31773d.m59126d(applicationContext);
        ((C31770a) d).f85381d = 2;
        C31773d b = d.mo37379b();
        C31777h hVar = new C31777h(applicationContext);
        this.f85895b = C31779a.m59137b(applicationContext, b);
        this.f85896c = autocompleteOptions;
        this.f85897d = new C31925c(hVar, b);
    }

    /* renamed from: a */
    public final Fragment mo586a(ClassLoader classLoader, String str) {
        if (m390b(classLoader, str) == AutocompleteImplFragment.class) {
            return new AutocompleteImplFragment(this.f85894a, this.f85895b, this.f85896c, this.f85897d, this.f85898e);
        }
        return super.mo586a(classLoader, str);
    }
}
