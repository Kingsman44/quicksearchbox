package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import android.support.p033v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134640h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.j */
/* compiled from: PG */
public final class C134649j {

    /* renamed from: a */
    public static final Map f366665a = C69505av.m100867i(new C69685i("JP", C69540x.m100944b("ja-JP")), new C69685i("RU", C69540x.m100944b("ru-RU")), new C69685i("GB", C69540x.m100944b("en-GB")), new C69685i("US", C69540x.m100947e("en-US", "es-ES")), new C69685i("BR", C69540x.m100947e("pt-BR", "en-US")), new C69685i("TH", C69540x.m100947e("th-TH", "en-US")), new C69685i("ID", C69540x.m100947e("id-ID", "jw")), new C69685i("MX", C69540x.m100947e("es-MX", "en-US")), new C69685i("BD", C69540x.m100947e("bn", "en-US")), new C69685i("PK", C69540x.m100947e("ur", "pa", "en-US", "ps")), new C69685i("DE", C69540x.m100947e("de-DE", "en-US", "fr-FR", "nl-NL")), new C69685i("NG", C69540x.m100947e("en-US", "pcm", "ha", "ig", "yo")), new C69685i("IN", C69540x.m100947e("hi-IN", "en-IN", "bn", "te", "mr", "ta", "ml", "kn", "gu", "pa")));

    /* renamed from: b */
    public final TelephonyManager f366666b;

    /* renamed from: c */
    public final C28310af f366667c;

    /* renamed from: d */
    public final C28306ab f366668d;

    /* renamed from: e */
    public final AccountId f366669e;

    /* renamed from: f */
    public final C134640h f366670f;

    /* renamed from: g */
    public final C46801dp f366671g;

    /* renamed from: h */
    public final C47770dh f366672h;

    /* renamed from: i */
    public final C28443m f366673i;

    /* renamed from: j */
    public final C46778cv f366674j;

    /* renamed from: k */
    public final C59071e f366675k = C59071e.m91331h();

    /* renamed from: l */
    public final Map f366676l = new LinkedHashMap();

    /* renamed from: m */
    public String f366677m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public final List f366678n = new ArrayList();

    /* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.j$a */
    /* compiled from: PG */
    final class C134650a implements C46792di {

        /* renamed from: a */
        final /* synthetic */ C134649j f366679a;

        /* renamed from: b */
        private final View f366680b;

        public C134650a(C134649j jVar, View view) {
            C69664n.m101061g(view, "root");
            this.f366679a = jVar;
            this.f366680b = view;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) this.f366679a.f366675k.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40422));
            cVar.mo56386p("discoverLanguageDataService failed to fetch discover preferred language.");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "languageCode"
                p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
                com.google.android.apps.search.googleapp.discover.settings.c.j r0 = r7.f366679a
                java.util.Map r1 = r0.f366676l
                boolean r1 = r1.containsKey(r8)
                java.lang.String r2 = ""
                if (r1 != 0) goto L_0x0048
                java.util.Locale r8 = java.util.Locale.forLanguageTag(r8)
                java.lang.String r8 = r8.getLanguage()
                java.util.Map r1 = r0.f366676l
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0025:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r1.next()
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
                java.lang.String r4 = r4.getLanguage()
                boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r8)
                if (r4 == 0) goto L_0x0025
                goto L_0x0042
            L_0x0041:
                r3 = 0
            L_0x0042:
                r8 = r3
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L_0x0048
                r8 = r2
            L_0x0048:
                r0.f366677m = r8
                com.google.android.apps.search.googleapp.discover.settings.c.j r8 = r7.f366679a
                android.view.View r0 = r7.f366680b
                java.util.Map r1 = r8.f366676l
                java.lang.String r8 = r8.f366677m
                java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r1, r8, r2)
                java.lang.String r8 = (java.lang.String) r8
                r1 = 2131431476(0x7f0b1034, float:1.8484682E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r1.setText(r8)
                r1 = 2131431475(0x7f0b1033, float:1.848468E38)
                android.view.View r0 = r0.findViewById(r1)
                int r8 = r8.length()
                r1 = 0
                if (r8 != 0) goto L_0x0075
                r8 = 8
                goto L_0x0076
            L_0x0075:
                r8 = 0
            L_0x0076:
                r0.setVisibility(r8)
                com.google.android.apps.search.googleapp.discover.settings.c.j r8 = r7.f366679a
                android.view.View r0 = r7.f366680b
                java.util.List r2 = r8.f366678n
                java.util.Iterator r2 = r2.iterator()
            L_0x0083:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00b1
                java.lang.Object r3 = r2.next()
                int r4 = r1 + 1
                if (r1 >= 0) goto L_0x0094
                p5462h.p5463a.C69540x.m100952j()
            L_0x0094:
                com.google.android.apps.search.googleapp.discover.settings.c.r r3 = (com.google.android.apps.search.googleapp.discover.settings.p10218c.C134658r) r3
                java.lang.String r5 = r8.f366677m
                java.lang.String r6 = r3.f366695c
                boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
                boolean r6 = r3.f366696d
                if (r6 == r5) goto L_0x00af
                r3.f366696d = r5
                android.support.v7.widget.RecyclerView r3 = com.google.android.apps.search.googleapp.discover.settings.p10218c.C134649j.m218414a(r0)
                android.support.v7.widget.fb r3 = r3.mAdapter
                if (r3 == 0) goto L_0x00af
                r3.notifyItemChanged(r1)
            L_0x00af:
                r1 = r4
                goto L_0x0083
            L_0x00b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.settings.p10218c.C134649j.C134650a.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C134649j(TelephonyManager telephonyManager, C28310af afVar, C28306ab abVar, AccountId accountId, C134640h hVar, C46801dp dpVar, C47770dh dhVar, C28443m mVar, C46778cv cvVar) {
        C69664n.m101061g(telephonyManager, "telephonyManager");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(hVar, "discoverLanguageDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f366666b = telephonyManager;
        this.f366667c = afVar;
        this.f366668d = abVar;
        this.f366669e = accountId;
        this.f366670f = hVar;
        this.f366671g = dpVar;
        this.f366672h = dhVar;
        this.f366673i = mVar;
        this.f366674j = cvVar;
    }

    /* renamed from: a */
    public static final RecyclerView m218414a(View view) {
        View findViewById = view.findViewById(R.id.googleapp_disco_lang_language_list);
        C69664n.m101060f(findViewById, "findViewById(R.id.google…disco_lang_language_list)");
        return (RecyclerView) findViewById;
    }
}
