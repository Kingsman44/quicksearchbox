package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.c.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C17146i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17151n f49839a;

    /* renamed from: b */
    public final /* synthetic */ String f49840b;

    /* renamed from: c */
    public final /* synthetic */ String f49841c;

    public /* synthetic */ C17146i(C17151n nVar, String str, String str2) {
        this.f49839a = nVar;
        this.f49840b = str;
        this.f49841c = str2;
    }

    public final C60870cx apply(Object obj) {
        C17151n nVar = this.f49839a;
        String str = this.f49840b;
        String str2 = this.f49841c;
        C17046am amVar = (C17046am) obj;
        if ((amVar.f49657a & 1) == 0) {
            return nVar.f49852c.mo23206a(str2, str);
        }
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        if (!a.equals(C29689e.DOWNLOADED)) {
            return nVar.f49851b.mo23206a(str2, str);
        }
        return C60856cj.m92900i(fVar);
    }
}
