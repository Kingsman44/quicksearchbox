package com.google.android.gms.languageprofile;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.languageprofile.m */
/* compiled from: PG */
public final class C144453m extends C143847s {

    /* renamed from: a */
    public static final C143840l f391063a;

    /* renamed from: b */
    static final C143707a f391064b;

    /* renamed from: c */
    public static final C143841m f391065c;

    static {
        C143840l lVar = new C143840l();
        f391063a = lVar;
        C144449i iVar = new C144449i();
        f391064b = iVar;
        f391065c = new C143841m("LanguageProfile.API", iVar, lVar);
    }

    public C144453m(Context context) {
        super(context, (Activity) null, f391065c, (C143724i) null, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119924a(String str, LanguagePreferenceParams languagePreferenceParams) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144447g(str, languagePreferenceParams);
        dcVar.f389863d = 14401;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo119925b(ClientLanguageSettings clientLanguageSettings) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144448h(clientLanguageSettings);
        dcVar.f389862c = new Feature[]{C144442b.f391055a};
        dcVar.f389863d = 14404;
        dcVar.f389861b = false;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
