package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17060e;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.an */
/* compiled from: PG */
public final class C122348an {

    /* renamed from: a */
    public static final C59071e f339226a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.an");

    /* renamed from: b */
    public final C122334a f339227b;

    /* renamed from: c */
    public final C17060e f339228c;

    /* renamed from: d */
    public final ConnectivityManager f339229d;

    /* renamed from: e */
    public final C60888db f339230e;

    /* renamed from: f */
    public final Context f339231f;

    /* renamed from: g */
    public final C122362n f339232g;

    /* renamed from: h */
    public final C122360l f339233h;

    /* renamed from: i */
    public Optional f339234i = Optional.empty();

    /* renamed from: j */
    public boolean f339235j = false;

    public C122348an(C122334a aVar, C17060e eVar, ConnectivityManager connectivityManager, C60888db dbVar, Context context, C122362n nVar, C122360l lVar) {
        this.f339227b = aVar;
        this.f339228c = eVar;
        this.f339229d = connectivityManager;
        this.f339230e = dbVar;
        this.f339231f = context;
        this.f339232g = nVar;
        this.f339233h = lVar;
    }

    /* renamed from: b */
    public static String m201836b(C58485gu guVar) {
        return (String) Collection.EL.stream(guVar).map(C122335aa.f339207a).collect(Collectors.joining(","));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo105600a(Locale locale, C60870cx cxVar, C60870cx cxVar2, C28716av avVar) {
        C60870cx a = this.f339232g.mo105606a(this.f339231f, "com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.CANCEL", locale);
        C122360l lVar = this.f339233h;
        lVar.mo105605d(lVar.mo105604b(Optional.empty()), false);
        C122345ak akVar = new C122345ak(this, cxVar2, a);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(akVar), this.f339230e);
        C122337ac acVar = new C122337ac(new C122346al(this, locale, avVar));
        return C60922j.m93045h(h, C47810es.m84966f(acVar), this.f339230e);
    }

    /* renamed from: c */
    public final boolean mo105601c() {
        if (!((Boolean) this.f339234i.map(C122374z.f339283a).map(C122336ab.f339208a).orElse(true)).booleanValue()) {
            return true;
        }
        return false;
    }
}
