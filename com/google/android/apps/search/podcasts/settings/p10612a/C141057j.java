package com.google.android.apps.search.podcasts.settings.p10612a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.podcasts.language.p10578b.C140536p;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10576l.C140441ac;
import com.google.android.apps.search.podcasts.p10576l.C140443ae;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140504p;
import com.google.android.apps.search.podcasts.p10576l.C140508t;
import com.google.android.apps.search.podcasts.p10576l.C140511w;
import com.google.android.apps.search.podcasts.p10576l.C140513y;
import com.google.android.apps.search.podcasts.p10588n.C140672au;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54315as;
import com.google.p4017at.p4082j.p4083a.C54359bl;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.j */
/* compiled from: PG */
public final class C141057j {

    /* renamed from: a */
    public final C140459au f382964a;

    /* renamed from: b */
    public final Executor f382965b;

    /* renamed from: c */
    public final C140536p f382966c;

    /* renamed from: d */
    public final C140672au f382967d;

    /* renamed from: e */
    public final C21370a f382968e;

    /* renamed from: f */
    public final C140022ao f382969f;

    /* renamed from: g */
    public final C140962c f382970g;

    /* renamed from: h */
    public final C46778cv f382971h;

    /* renamed from: i */
    private final Context f382972i;

    public C141057j(C140459au auVar, Executor executor, Context context, C140536p pVar, C140672au auVar2, C21370a aVar, C140022ao aoVar, C140962c cVar, C46778cv cvVar) {
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f382964a = auVar;
        this.f382965b = executor;
        this.f382972i = context;
        this.f382966c = pVar;
        this.f382967d = auVar2;
        this.f382968e = aVar;
        this.f382969f = aoVar;
        this.f382970g = cVar;
        this.f382971h = cvVar;
    }

    /* renamed from: d */
    private final C141048a m229053d(String str) {
        try {
            PackageInfo packageInfo = this.f382972i.getPackageManager().getPackageInfo(str, 0);
            CharSequence applicationLabel = this.f382972i.getPackageManager().getApplicationLabel(packageInfo.applicationInfo);
            C69664n.m101060f(applicationLabel, "context.packageManager.g…bel(info.applicationInfo)");
            String str2 = packageInfo.versionName;
            C69664n.m101060f(str2, "info.versionName");
            Uri parse = Uri.parse("https://play.google.com/store/apps/details?id=" + str);
            C69664n.m101060f(parse, "parse(\"https://play.goog…details?id=$packageName\")");
            return new C141048a(applicationLabel, str2, parse);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static final C141051d m229054e(long j) {
        C141051d dVar = C141051d.MILLIS_NEVER;
        Duration ofMillis = Duration.ofMillis(j);
        C69664n.m101060f(ofMillis, "ofMillis(this)");
        C69664n.m101061g(ofMillis, "duration");
        if (C69664n.m101066l(ofMillis, C141051d.MILLIS_24HOURS.f382951f)) {
            return C141051d.MILLIS_24HOURS;
        }
        if (C69664n.m101066l(ofMillis, C141051d.MILLIS_7DAYS.f382951f)) {
            return C141051d.MILLIS_7DAYS;
        }
        if (C69664n.m101066l(ofMillis, C141051d.MILLIS_30DAYS.f382951f)) {
            return C141051d.MILLIS_30DAYS;
        }
        return C69664n.m101066l(ofMillis, C141051d.MILLIS_90DAYS.f382951f) ? C141051d.MILLIS_90DAYS : C141051d.MILLIS_NEVER;
    }

    /* renamed from: a */
    public final C141050c mo116114a(C54315as asVar, C140450al alVar, List list, String str) {
        C140449ak a;
        C54315as asVar2 = asVar;
        C140450al alVar2 = alVar;
        C140449ak a2 = C140449ak.m228147a(alVar2.f381518d);
        if (a2 == null) {
            a2 = C140449ak.UNRECOGNIZED;
        }
        if (a2 == C140449ak.DEFAULT) {
            a = C140449ak.SYSTEM_DEFAULT;
        } else {
            a = C140449ak.m228147a(alVar2.f381518d);
            if (a == null) {
                a = C140449ak.UNRECOGNIZED;
            }
            C69664n.m101060f(a, "{\n        preference.themeSetting\n      }");
        }
        C140449ak akVar = a;
        C140441ac acVar = alVar2.f381515a;
        if (acVar == null) {
            acVar = C140441ac.f381485d;
        }
        C62971cq cqVar = acVar.f381487a;
        C69664n.m101060f(cqVar, "preference.languagePrefe…referredLanguageCodesList");
        Iterable iterable = asVar2 != null ? asVar2.f142686a : null;
        if (iterable == null) {
            iterable = C69496am.f185918a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (cqVar.contains(((C54359bl) next).f142797a)) {
                arrayList.add(next);
            }
        }
        C141049b bVar = new C141049b(asVar2 != null, C69540x.m100851ag(arrayList, ", ", (CharSequence) null, (CharSequence) null, C141052e.f382952a, 30));
        C140513y yVar = alVar2.f381517c;
        if (yVar == null) {
            yVar = C140513y.f381639d;
        }
        C141051d e = m229054e(yVar.f381641a);
        C140513y yVar2 = alVar2.f381517c;
        if (yVar2 == null) {
            yVar2 = C140513y.f381639d;
        }
        C141051d e2 = m229054e(yVar2.f381642b);
        C140508t tVar = alVar2.f381525k;
        if (tVar == null) {
            tVar = C140508t.f381626c;
        }
        boolean z = tVar.f381628a;
        C140508t tVar2 = alVar2.f381525k;
        if (tVar2 == null) {
            tVar2 = C140508t.f381626c;
        }
        boolean z2 = tVar2.f381629b;
        C140443ae aeVar = alVar2.f381519e;
        if (aeVar == null) {
            aeVar = C140443ae.f381490d;
        }
        C54362bo a3 = C54362bo.m87369a(aeVar.f381492a);
        if (a3 == null) {
            a3 = C54362bo.UNRECOGNIZED;
        }
        C54362bo boVar = a3;
        C69664n.m101060f(boVar, "preference.personalizati…ce.personalizationSetting");
        C140511w wVar = alVar2.f381524j;
        if (wVar == null) {
            wVar = C140511w.f381636b;
        }
        boolean z3 = wVar.f381638a;
        C141048a d = m229053d("com.google.android.apps.podcasts");
        C141048a d2 = m229053d("com.google.android.googlequicksearchbox");
        boolean z4 = !TextUtils.isEmpty(str);
        C140504p pVar = alVar2.f381529o;
        if (pVar == null) {
            pVar = C140504p.f381619c;
        }
        return new C141050c(bVar, e, e2, z, z2, boVar, z3, list, akVar, d, d2, z4, pVar.f381622b);
    }

    /* renamed from: b */
    public final void mo116115b(C60870cx cxVar) {
        C140989k.m228950h(cxVar, new C141056i(this));
    }

    /* renamed from: c */
    public final void mo116116c(boolean z) {
        this.f382964a.mo115691p(z);
    }
}
