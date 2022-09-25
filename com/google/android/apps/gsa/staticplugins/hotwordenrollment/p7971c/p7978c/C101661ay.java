package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.assistant.p3861at.C49891cv;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ay */
/* compiled from: PG */
public final class C101661ay {

    /* renamed from: a */
    public final C101654ar f283669a;

    /* renamed from: b */
    public final String f283670b;

    /* renamed from: c */
    public final dn f283671c;

    /* renamed from: d */
    public final C90743b f283672d;

    /* renamed from: e */
    public C83975q f283673e;

    /* renamed from: f */
    public final int f283674f;

    public C101661ay(C101654ar arVar, String str, dn dnVar, ei eiVar, C90743b bVar) {
        this.f283669a = arVar;
        this.f283670b = str;
        this.f283671c = dnVar;
        C49891cv cvVar = eiVar.a(str).f129639j;
        int i = 2;
        if (!(cvVar == null ? C49891cv.f129647N : cvVar).f129655F) {
            if (!ei.m(eiVar.a(str), 1)) {
                i = 1;
            }
        } else if (!ei.m(eiVar.a(str), 1)) {
            i = 3;
        } else {
            i = !ei.m(eiVar.a(str), 2) ? 4 : 5;
        }
        this.f283674f = i;
        this.f283672d = bVar;
    }
}
