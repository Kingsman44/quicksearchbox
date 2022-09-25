package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.telephony.TelephonyManager;
import com.google.android.apps.search.googleapp.search.settings.p10424a.C137563c;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.l */
/* compiled from: PG */
public final class C137609l {

    /* renamed from: a */
    public static final Map f374297a = C69505av.m100867i(new C69685i("in", C69540x.m100947e("hi-IN", "en-IN", "bn", "te", "mr", "ta")), new C69685i("us", C69540x.m100947e("en-US", "es-ES")), new C69685i("br", C69540x.m100947e("pt-BR", "en-US")), new C69685i("jp", C69540x.m100944b("ja-JP")), new C69685i("id", C69540x.m100947e("id-ID", "jw")), new C69685i("ru", C69540x.m100944b("ru-RU")), new C69685i("mx", C69540x.m100947e("es-MX", "en-US")), new C69685i("th", C69540x.m100947e("th-TH", "en-US")), new C69685i("ng", C69540x.m100947e("en-US", "pcm", "ha", "ig", "yo")), new C69685i("de", C69540x.m100947e("de-DE", "en-US", "fr-FR", "nl-NL")), new C69685i("gb", C69540x.m100944b("en-GB")), new C69685i("bd", C69540x.m100947e("bn", "en-US")), new C69685i("pk", C69540x.m100947e("ur", "pa", "en-US", "ps")));

    /* renamed from: b */
    public static final C59071e f374298b = C59071e.m91331h();

    /* renamed from: c */
    public final Context f374299c;

    /* renamed from: d */
    public final Fragment f374300d;

    /* renamed from: e */
    public final C137563c f374301e;

    /* renamed from: f */
    public final C46855i f374302f;

    /* renamed from: g */
    public final TelephonyManager f374303g;

    /* renamed from: h */
    public final C137604g f374304h;

    /* renamed from: i */
    public final Map f374305i = new LinkedHashMap();

    /* renamed from: j */
    public final List f374306j = new ArrayList();

    /* renamed from: k */
    public final C137608k f374307k = new C137608k(this);

    public C137609l(Context context, Fragment fragment, C137563c cVar, C46855i iVar, TelephonyManager telephonyManager, C137604g gVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(cVar, "searchSettingsDataService");
        C69664n.m101061g(iVar, "subscriptionMixin");
        C69664n.m101061g(telephonyManager, "telephonyManager");
        this.f374299c = context;
        this.f374300d = fragment;
        this.f374301e = cVar;
        this.f374302f = iVar;
        this.f374303g = telephonyManager;
        this.f374304h = gVar;
    }
}
