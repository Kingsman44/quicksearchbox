package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126311at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126320ba;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.m */
/* compiled from: PG */
public final class C125257m {

    /* renamed from: a */
    public final C126311at f345544a;

    /* renamed from: b */
    private final boolean f345545b;

    /* renamed from: c */
    private final C126320ba f345546c;

    public C125257m(C126311at atVar, C126320ba baVar, boolean z) {
        C69664n.m101061g(baVar, "screenState");
        this.f345544a = atVar;
        this.f345546c = baVar;
        this.f345545b = z;
    }

    /* renamed from: a */
    public final C125258n mo106883a(af afVar, Locale locale) {
        C69664n.m101061g(afVar, "keyboardConfig");
        C69664n.m101061g(locale, "locale");
        if (!this.f345545b) {
            locale = this.f345544a.mo107523b();
        }
        boolean z = false;
        if (this.f345546c.mo107530a() && afVar.t) {
            z = true;
        }
        return new C125258n(locale, z, afVar.i);
    }
}
