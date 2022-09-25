package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import android.accounts.Account;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3861at.C50363uh;
import com.google.assistant.p3861at.C50364ui;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.adw;
import com.google.assistant.p3861at.adz;
import com.google.assistant.p3861at.aed;
import com.google.assistant.p3861at.aef;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C36693c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95584a;

    /* renamed from: b */
    public final /* synthetic */ String f95585b;

    public /* synthetic */ C36693c(C36701k kVar, String str) {
        this.f95584a = kVar;
        this.f95585b = str;
    }

    public final C60870cx apply(Object obj) {
        C36701k kVar = this.f95584a;
        String str = this.f95585b;
        Account account = (Account) obj;
        C36624a aVar = kVar.f95600a;
        acu acu = (acu) acv.f128920X.createBuilder();
        adw adw = (adw) aed.f129097f.createBuilder();
        adz d = C36701k.m65296d();
        adw.copyOnWrite();
        aed aed = (aed) adw.instance;
        d.getClass();
        aed.f129100b = d;
        aed.f129099a |= 1;
        adz d2 = C36701k.m65296d();
        adw.copyOnWrite();
        aed aed2 = (aed) adw.instance;
        d2.getClass();
        aed2.f129101c = d2;
        aed2.f129099a |= 2;
        aed aed3 = (aed) adw.build();
        C50363uh uhVar = (C50363uh) C50364ui.f131105e.createBuilder();
        int a = aef.m85735a(Integer.parseInt(str));
        if (a != 0) {
            uhVar.copyOnWrite();
            C50364ui uiVar = (C50364ui) uhVar.instance;
            uiVar.f131108b = a - 1;
            uiVar.f131107a |= 1;
            uhVar.copyOnWrite();
            C50364ui uiVar2 = (C50364ui) uhVar.instance;
            aed3.getClass();
            uiVar2.f131109c = aed3;
            uiVar2.f131107a |= 2;
            C50364ui uiVar3 = (C50364ui) uhVar.build();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            uiVar3.getClass();
            acv.f128926E = uiVar3;
            acv.f128946b |= 64;
            C60870cx b = aVar.mo40238b(account, (acv) acu.build());
            C60870cx b2 = kVar.f95604e.mo40299b(account);
            C60870cx a2 = kVar.f95604e.mo40298a(account);
            return C47638k.m84751b(b, b2, a2).mo51521b(new C36697g(kVar, a2, b, b2), C60826bg.f164896a);
        }
        throw null;
    }
}
