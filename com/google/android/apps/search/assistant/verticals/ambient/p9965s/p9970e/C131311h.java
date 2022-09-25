package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9970e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131244m;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131252u;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9970e.p9971a.C131304a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53715bm;
import com.google.assistant.p4016z.C53727l;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60944c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.e.h */
/* compiled from: PG */
public final class C131311h implements C131258a {

    /* renamed from: a */
    public final C58974d f358990a;

    /* renamed from: b */
    public final Context f358991b;

    /* renamed from: c */
    public final C131428a f358992c;

    /* renamed from: d */
    public final String f358993d;

    /* renamed from: e */
    public final String f358994e;

    /* renamed from: f */
    public final Duration f358995f;

    /* renamed from: g */
    public final C131252u f358996g;

    /* renamed from: h */
    private final boolean f358997h;

    /* renamed from: i */
    private final String f358998i;

    /* renamed from: j */
    private final String f358999j;

    /* renamed from: k */
    private final String f359000k;

    /* renamed from: l */
    private final C131244m f359001l;

    /* renamed from: m */
    private final C60888db f359002m;

    /* renamed from: n */
    private final C131304a f359003n;

    public C131311h(C130603a aVar, Context context, C131428a aVar2, C131304a aVar3, boolean z, String str, String str2, String str3, String str4, String str5, long j, C131244m mVar, C131252u uVar, C60888db dbVar) {
        this.f358990a = aVar.mo109740b(this);
        this.f358991b = context;
        this.f358992c = aVar2;
        this.f359003n = aVar3;
        this.f358997h = z;
        this.f358998i = str;
        this.f358993d = str2;
        this.f358999j = str3;
        this.f358994e = str4;
        this.f359000k = str5;
        this.f359001l = mVar;
        this.f358996g = uVar;
        this.f359002m = dbVar;
        this.f358995f = Duration.ofMillis(j);
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.GAS_STATION_PAYMENT);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C53727l lVar;
        C60870cx cxVar;
        C60870cx cxVar2;
        C53727l lVar2;
        C60870cx cxVar3;
        Void voidR = (Void) obj;
        if (!this.f358997h) {
            ((C58970a) ((C58970a) this.f358990a.mo56224b()).mo56372aa(39193)).mo56386p("Gas station feature disabled.");
            return C60856cj.m92900i(Optional.empty());
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(hVar.f297214i).map(C131306c.f358982a).filter(C131307d.f358983a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) this.f358990a.mo56224b()).mo56372aa(39192)).mo56386p("No gas stations nearby.");
            return C60856cj.m92900i(Optional.empty());
        }
        C53692aq aqVar = (C53692aq) guVar.get(0);
        String str = aqVar.f140944f;
        C58495hd a = this.f358996g.mo110137a(this.f358999j);
        if (aqVar.f140940b == 7) {
            lVar = (C53727l) aqVar.f140941c;
        } else {
            lVar = C53727l.f141047b;
        }
        String str2 = (String) a.getOrDefault(Integer.toString(lVar.f141049a), (Object) null);
        if (str2 == null) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            cxVar = this.f359001l.mo110127a(str2);
        }
        if (this.f358998i.isEmpty()) {
            ((C58970a) ((C58970a) this.f358990a.mo56225c()).mo56372aa(39195)).mo56386p("discoveryDeeplink is empty.");
            cxVar2 = C60856cj.m92900i(Optional.empty());
        } else {
            Uri parse = Uri.parse(this.f358998i);
            Optional findFirst = Stream.CC.m71936of((T[]) new String[]{"com.google.android.apps.nbu.paisa.user", "com.google.android.apps.nbu.paisa.user.dev"}).filter(new C131305b(this)).findFirst();
            if (findFirst.isEmpty()) {
                cxVar2 = C60856cj.m92900i(Optional.empty());
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", parse).setPackage((String) findFirst.get());
                if (intent.resolveActivity(this.f358991b.getPackageManager()) == null) {
                    ((C58970a) ((C58970a) this.f358990a.mo56224b()).mo56372aa(39194)).mo56386p("Cannot resolve intent.");
                    cxVar2 = C60856cj.m92900i(Optional.empty());
                } else {
                    if (aqVar.f140940b == 7) {
                        lVar2 = (C53727l) aqVar.f140941c;
                    } else {
                        lVar2 = C53727l.f141047b;
                    }
                    int i = lVar2.f141049a;
                    String str3 = (String) this.f358996g.mo110137a(this.f359000k).getOrDefault(Integer.toString(i), BuildConfig.FLAVOR);
                    if (str3.isEmpty()) {
                        ((C58970a) ((C58970a) this.f358990a.mo56225c()).mo56372aa(39196)).mo56387q("No card networks JSON array for brand number: %d", i);
                        cxVar3 = C60856cj.m92900i(false);
                    } else {
                        String d = new C58827ar("\n").mo56097d(new C58825ap(new Object[]{"    \"apiVersionMinor\": 0,", "    \"allowedPaymentMethods\": [", "        {", "            \"type\": \"CARD\",", "            \"parameters\": {", "                \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],", "                \"allowedCardNetworks\": ".concat(String.valueOf(str3)), "            }", "        }", "    ],", "    \"existingPaymentMethodRequired\": true", "}"}, "{", "    \"apiVersion\": 2,"));
                        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                        isReadyToPayRequest.f395292f = d;
                        cxVar3 = C47633f.m84733g(C43205e.m76192b(this.f359003n.f358980a.mo122977a(isReadyToPayRequest))).mo51517j(C60944c.m93091d(this.f358995f), TimeUnit.NANOSECONDS, this.f359002m).mo51513e(TimeoutException.class, new C131303a(this), this.f359002m);
                    }
                    C131310g gVar = new C131310g(intent);
                    cxVar2 = C60922j.m93044g(cxVar3, C47810es.m84963c(gVar), this.f359002m);
                }
            }
        }
        return C47638k.m84753d(cxVar, cxVar2).mo51520a(new C131308e(this, aqVar, cxVar, cxVar2), this.f359002m);
    }
}
