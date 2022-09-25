package com.google.android.apps.search.googleapp.compliance.p10144a;

import android.util.Base64;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p395al.p417d.p418a.C8538ar;
import com.google.p395al.p417d.p418a.C8539as;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.w */
/* compiled from: PG */
public final /* synthetic */ class C133572w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133543al f363913a;

    /* renamed from: b */
    public final /* synthetic */ C8539as f363914b;

    public /* synthetic */ C133572w(C133543al alVar, C8539as asVar) {
        this.f363913a = alVar;
        this.f363914b = asVar;
    }

    public final C60870cx apply(Object obj) {
        C133543al alVar = this.f363913a;
        C8539as asVar = this.f363914b;
        C133546ao aoVar = (C133546ao) obj;
        C8538ar arVar = (C8538ar) asVar.toBuilder();
        boolean z = aoVar.f363864d;
        arVar.copyOnWrite();
        C8539as asVar2 = (C8539as) arVar.instance;
        asVar2.f29626a |= 32;
        asVar2.f29629d = z;
        boolean z2 = aoVar.f363863c;
        arVar.copyOnWrite();
        C8539as asVar3 = (C8539as) arVar.instance;
        asVar3.f29626a |= 16;
        asVar3.f29628c = z2;
        return alVar.f363851d.mo42484a(alVar.mo111256n(C133543al.m216759k().path("setprefs").appendQueryParameter("prefs", new String(Base64.encode(((C8539as) arVar.build()).toByteArray(), 10), StandardCharsets.UTF_8)).appendQueryParameter("sig", asVar.f29627b).appendQueryParameter("xgaUserInitiated", C133569t.USER_INITIATED.f363912c).build().toString()));
    }
}
