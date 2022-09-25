package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.p10405b.C137398c;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137941aa;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137963w;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C138381ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138382ad f376455a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f376456b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f376457c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f376458d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f376459e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f376460f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f376461g;

    public /* synthetic */ C138381ac(C138382ad adVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C60870cx cxVar6) {
        this.f376455a = adVar;
        this.f376456b = cxVar;
        this.f376457c = cxVar2;
        this.f376458d = cxVar3;
        this.f376459e = cxVar4;
        this.f376460f = cxVar5;
        this.f376461g = cxVar6;
    }

    public final Object call() {
        C138382ad adVar = this.f376455a;
        C60870cx cxVar = this.f376456b;
        C60870cx cxVar2 = this.f376457c;
        C60870cx cxVar3 = this.f376458d;
        C60870cx cxVar4 = this.f376459e;
        C60870cx cxVar5 = this.f376460f;
        C60870cx cxVar6 = this.f376461g;
        C137398c cVar = (C137398c) C60856cj.m92909r(cxVar);
        String str = (String) C60856cj.m92909r(cxVar2);
        C137963w wVar = (C137963w) C60856cj.m92909r(cxVar3);
        C137965y yVar = (C137965y) C60856cj.m92909r(cxVar4);
        String str2 = (String) C60856cj.m92909r(cxVar5);
        C137941aa aaVar = (C137941aa) C60856cj.m92909r(cxVar6);
        String str3 = adVar.f376471j;
        if (str != null) {
            String str4 = (!adVar.f376474m || ((long) wVar.f375351b) >= adVar.f376473l) ? BuildConfig.FLAVOR : "1";
            String str5 = cVar.f373720b;
            if (str5 == null) {
                throw new NullPointerException("Null searchLanguageHl");
            } else if (str2 != null) {
                String format = String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(adVar.f376463b.getResources().getDisplayMetrics().density)});
                if (format == null) {
                    throw new NullPointerException("Null devicePixelRatioParameter");
                } else if (yVar == null) {
                    throw new NullPointerException("Null previousQueryData");
                } else if (aaVar != null) {
                    return new C138367a(str5, str2, str3, format, str, yVar, str4, aaVar);
                } else {
                    throw new NullPointerException("Null userSettings");
                }
            } else {
                throw new NullPointerException("Null countryCode");
            }
        } else {
            throw new NullPointerException("Null psychicSessionId");
        }
    }
}
