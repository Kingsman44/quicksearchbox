package com.google.android.gms.languageprofile;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.languageprofile.p10819a.C144439c;
import com.google.android.gms.languageprofile.p10819a.C144440d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.languageprofile.g */
/* compiled from: PG */
public final /* synthetic */ class C144447g implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f391058a;

    /* renamed from: b */
    public final /* synthetic */ LanguagePreferenceParams f391059b;

    public /* synthetic */ C144447g(String str, LanguagePreferenceParams languagePreferenceParams) {
        this.f391058a = str;
        this.f391059b = languagePreferenceParams;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f391058a;
        LanguagePreferenceParams languagePreferenceParams = this.f391059b;
        C144439c cVar = (C144439c) ((C144440d) obj).mo119451G();
        C144450j jVar = new C144450j((C146010af) obj2);
        Parcel gA = cVar.mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, languagePreferenceParams);
        C8850c.m23499h(gA, jVar);
        cVar.mo17262he(3, gA);
    }
}
