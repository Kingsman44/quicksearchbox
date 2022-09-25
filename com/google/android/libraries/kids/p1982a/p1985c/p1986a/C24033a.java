package com.google.android.libraries.kids.p1982a.p1985c.p1986a;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.libraries.kids.a.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C24033a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C24036d f65679a;

    /* renamed from: b */
    public final /* synthetic */ String f65680b;

    public /* synthetic */ C24033a(C24036d dVar, String str) {
        this.f65679a = dVar;
        this.f65680b = str;
    }

    public final C60870cx apply(Object obj) {
        C24036d dVar = this.f65679a;
        String str = this.f65680b;
        return C43205e.m76192b(dVar.f65686d.mo117812c((Account) obj, String.format(Locale.US, "weblogin:service=gaia&continue=%s", new Object[]{Uri.encode(str)}), new Bundle()));
    }
}
