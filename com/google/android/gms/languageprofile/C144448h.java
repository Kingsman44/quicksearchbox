package com.google.android.gms.languageprofile;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.languageprofile.p10819a.C144439c;
import com.google.android.gms.languageprofile.p10819a.C144440d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.languageprofile.h */
/* compiled from: PG */
public final /* synthetic */ class C144448h implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ ClientLanguageSettings f391060a;

    public /* synthetic */ C144448h(ClientLanguageSettings clientLanguageSettings) {
        this.f391060a = clientLanguageSettings;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        ClientLanguageSettings clientLanguageSettings = this.f391060a;
        C144439c cVar = (C144439c) ((C144440d) obj).mo119451G();
        C144451k kVar = new C144451k((C146010af) obj2);
        Parcel gA = cVar.mo17260gA();
        gA.writeString((String) null);
        C8850c.m23497f(gA, clientLanguageSettings);
        C8850c.m23499h(gA, kVar);
        cVar.mo17262he(5, gA);
    }
}
