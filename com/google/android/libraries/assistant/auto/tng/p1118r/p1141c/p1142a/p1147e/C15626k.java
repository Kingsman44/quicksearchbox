package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1147e;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.gmm.p990b.C13575a;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15672d;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15675g;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15677i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p3186j$.net.URLEncoder;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.e.k */
/* compiled from: PG */
public final class C15626k implements C15593a {

    /* renamed from: a */
    public static final C59071e f46713a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.e.k");

    /* renamed from: b */
    public final Executor f46714b;

    /* renamed from: c */
    public final C69464a f46715c;

    /* renamed from: d */
    public final C69464a f46716d;

    /* renamed from: e */
    public final C69464a f46717e;

    /* renamed from: f */
    public final C15672d f46718f;

    /* renamed from: g */
    public final C15677i f46719g;

    /* renamed from: h */
    private final PackageManager f46720h;

    /* renamed from: i */
    private final C69464a f46721i;

    /* renamed from: j */
    private final C11836c f46722j;

    public C15626k(Executor executor, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, PackageManager packageManager, C11836c cVar, C15672d dVar, C15677i iVar) {
        this.f46714b = executor;
        this.f46715c = aVar;
        this.f46716d = aVar2;
        this.f46717e = aVar3;
        this.f46721i = aVar4;
        this.f46720h = packageManager;
        this.f46722j = cVar;
        this.f46718f = dVar;
        this.f46719g = iVar;
    }

    /* renamed from: g */
    private final C58833ax m32360g(String str, String str2, int i) {
        ArrayList arrayList;
        String b = C13587a.m29864b(new Intent("android.intent.action.VIEW", Uri.parse(str)), this.f46720h);
        if (b == null) {
            C59104x c = f46713a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(46212)).mo56386p("Google Maps is not installed on device.");
            return C58836b.f156633a;
        }
        acz acz = (acz) ada.f134865f.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 32;
        evVar.f132949g = str;
        esVar.copyOnWrite();
        C51058ev evVar2 = (C51058ev) esVar.instance;
        evVar2.f132943a |= 1;
        evVar2.f132944b = b;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar3 = (C51058ev) esVar.build();
        evVar3.getClass();
        ghVar.f133013c = evVar3;
        ghVar.f133012b = 1;
        acz.copyOnWrite();
        ada ada = (ada) acz.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        ada.f134868b = ghVar2;
        ada.f134867a |= 1;
        C51809dy a = C15670b.m32466a("provider.OPEN", "open_provider_args", "assistant.api.client_op.OpenProviderArgs", (ada) acz.build());
        if (str2 != null) {
            arrayList = new ArrayList(Arrays.asList(new C51809dy[]{C15669a.m32462a(str2)}));
            arrayList.add(a);
        } else {
            arrayList = new ArrayList(Arrays.asList(new C51809dy[]{a}));
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b2 = C15669a.m32463b(arrayList, Arrays.asList(new Integer[]{Integer.valueOf(i)}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b2.getClass();
        jVar.f133275j = b2;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* renamed from: h */
    private static String m32361h(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C59104x c = f46713a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46223)).mo56389s("Failed to URL encode '%s'\n", str);
            return str;
        }
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15616a aVar = new C15616a(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f46714b);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* renamed from: b */
    public final C58833ax mo22426b(String str) {
        return m32360g("http://maps.google.com/maps?entry=sar&q=".concat(m32361h(str)), (String) null, 23214);
    }

    /* renamed from: c */
    public final C60870cx mo22427c(String str, boolean z) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C9309a aVar = this.f46722j.f38023a;
        C60870cx i = C60856cj.m92900i(aVar.mo17491a(aVar.f32300b).getConfiguration());
        C15624i iVar = new C15624i(str);
        C60870cx g = C60922j.m93044g(i, C47810es.m84963c(iVar), this.f46714b);
        C15618c cVar = new C15618c(this, z, str);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(cVar), this.f46714b);
        if (((Boolean) this.f46721i.mo17428b()).booleanValue()) {
            C15677i iVar2 = this.f46719g;
            if (z) {
                C60870cx d = iVar2.f46803c.mo23069d();
                C15675g gVar = new C15675g(iVar2, str);
                cxVar = C60922j.m93045h(d, C47810es.m84966f(gVar), iVar2.f46802b);
            } else {
                cxVar = C60856cj.m92900i(false);
            }
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        C15619d dVar = new C15619d(this);
        C60870cx h2 = C60922j.m93045h(cxVar, C47810es.m84966f(dVar), this.f46714b);
        C15620e eVar = new C15620e(this, str);
        C60870cx h3 = C60922j.m93045h(g, C47810es.m84966f(eVar), this.f46714b);
        C60870cx b = C47638k.m84751b(h3, g).mo51521b(new C15621f(this, h3, g, str), this.f46714b);
        C15672d dVar2 = this.f46718f;
        if (dVar2.f46793b.mo56113h()) {
            C59104x b2 = C15672d.f46792a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GmmOffroadHelper");
            ((C59052c) ((C59052c) b2).mo56372aa(46250)).mo56386p("Starting searchGmmOffroadWithPersonalResultsAsync call");
            cxVar2 = ((C13575a) dVar2.f46793b.mo56107c()).mo21172a(str);
        } else {
            cxVar2 = C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx b3 = this.f46722j.mo20178b(R.string.punt_destination_out_of_range, str);
        C60870cx a = C47638k.m84751b(cxVar2, b3).mo51520a(new C15622g(this, cxVar2, b3, str), this.f46714b);
        C60870cx b4 = this.f46722j.mo20178b(R.string.start_navigation, str);
        return C47638k.m84753d(h, h2, b, a, b4).mo51521b(new C15623h(this, h, h2, b, a, b4, str), this.f46714b);
    }

    /* renamed from: d */
    public final C60870cx mo22428d(int i) {
        C60870cx a = this.f46722j.mo20177a(i);
        C15625j jVar = C15625j.f46712a;
        return C60922j.m93044g(a, C47810es.m84963c(jVar), this.f46714b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C60870cx mo22429e(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, String str) {
        String str2;
        if (((C58833ax) C60856cj.m92909r(cxVar)).mo56113h()) {
            return cxVar;
        }
        if (((C58833ax) C60856cj.m92909r(cxVar2)).mo56113h()) {
            return cxVar2;
        }
        if (((C58833ax) C60856cj.m92909r(cxVar3)).mo56113h()) {
            return cxVar3;
        }
        if (((C58833ax) C60856cj.m92909r(cxVar4)).mo56113h()) {
            return cxVar4;
        }
        try {
            str2 = (String) C60856cj.m92909r(cxVar5);
        } catch (Resources.NotFoundException e) {
            C59104x c = f46713a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46218)).mo56386p("Didn't build TTS, usually due to the string not yet translated for a locale. Continues to perform actions without TTS.");
            str2 = null;
        }
        return C60856cj.m92900i(m32360g("google.navigation:q=".concat(m32361h(str)), str2, 23133));
    }

    /* renamed from: f */
    public final C58833ax mo22430f(int i) {
        return m32360g("google.maps:?act=".concat(Integer.toString(i - 1)).concat("&entry=s:si"), (String) null, 23131);
    }
}
