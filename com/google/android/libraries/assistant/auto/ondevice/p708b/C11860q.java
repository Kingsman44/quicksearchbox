package com.google.android.libraries.assistant.auto.ondevice.p708b;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.g.b;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7169g.C91038a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11944g;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
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
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4243a.p4245b.C56151j;
import com.google.p4242bp.p4243a.p4245b.C56152k;
import com.google.p440an.C8844b;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.p4854c.C63408ai;
import com.google.protos.p4850an.p4854c.C63413b;
import com.google.protos.p4850an.p4854c.C63415d;
import com.google.protos.p4850an.p4854c.C63417f;
import com.google.protos.p4850an.p4854c.C63419h;
import com.google.protos.p4850an.p4854c.C63421j;
import com.google.protos.p4850an.p4854c.C63429r;
import com.google.protos.p4850an.p4854c.C63431t;
import com.google.protos.p4850an.p4854c.C63433v;
import com.google.protos.p4850an.p4854c.C63435x;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.q */
/* compiled from: PG */
public final class C11860q implements a {

    /* renamed from: a */
    private static final C58974d f38181a = C58974d.m91134h("LocalActionBuilder");

    /* renamed from: b */
    private static final C58495hd f38182b;

    /* renamed from: c */
    private static final C58495hd f38183c;

    /* renamed from: d */
    private final PackageManager f38184d;

    /* renamed from: e */
    private final SemanticsBuilderUtil f38185e;

    /* renamed from: f */
    private final C85726n f38186f;

    /* renamed from: g */
    private final C68214a f38187g;

    /* renamed from: h */
    private final C86124t f38188h;

    /* renamed from: i */
    private final C11944g f38189i;

    /* renamed from: j */
    private final C9309a f38190j;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("en-US", "home");
        gzVar.mo55429h("en-GB", "home");
        gzVar.mo55429h("de-DE", "zuhause");
        gzVar.mo55429h("fr-FR", "domicile");
        gzVar.mo55429h("es-ES", "casa");
        gzVar.mo55429h("pl-PL", "dom");
        gzVar.mo55429h("ko-KR", "집");
        gzVar.mo55429h("id-ID", "rumah");
        gzVar.mo55429h("it-IT", "casa");
        gzVar.mo55429h("ja-JP", "自宅");
        gzVar.mo55429h("nb-NO", "hjem");
        gzVar.mo55429h("nl-NL", "thuis");
        gzVar.mo55429h("no-NO", "hjem");
        gzVar.mo55429h("sv-SE", "hem");
        gzVar.mo55429h("es-US", "casa");
        gzVar.mo55429h("it-CH", "casa");
        gzVar.mo55429h("nl-BE", "thuis");
        gzVar.mo55429h("fr-CA", "domicile");
        gzVar.mo55429h("pt-BR", "casa");
        gzVar.mo55429h("ar-SA", "المنزل");
        gzVar.mo55429h("pt-PT", "casa");
        gzVar.mo55429h("es-MX", "casa");
        f38182b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("en-US", "work");
        gzVar2.mo55429h("en-GB", "work");
        gzVar2.mo55429h("de-DE", "arbeit");
        gzVar2.mo55429h("fr-CA", "travail");
        gzVar2.mo55429h("es-ES", "trabajo");
        gzVar2.mo55429h("pl-PL", "praca");
        gzVar2.mo55429h("ko-KR", "직장");
        gzVar2.mo55429h("id-ID", "kantor");
        gzVar2.mo55429h("it-IT", "lavoro");
        gzVar2.mo55429h("ja-JP", "職場");
        gzVar2.mo55429h("nb-NO", "jobb");
        gzVar2.mo55429h("nl-NL", "werk");
        gzVar2.mo55429h("no-NO", "jobb");
        gzVar2.mo55429h("sv-SE", "arbete");
        gzVar2.mo55429h("es-US", "trabajo");
        gzVar2.mo55429h("it-CH", "lavoro");
        gzVar2.mo55429h("nl-BE", "werk");
        gzVar2.mo55429h("fr-FR", "travail");
        gzVar2.mo55429h("pt-BR", "trabalho");
        gzVar2.mo55429h("ar-SA", "العمل");
        gzVar2.mo55429h("pt-PT", "trabalho");
        gzVar2.mo55429h("es-MX", "trabajo");
        f38183c = gzVar2.mo55427f(false);
    }

    public C11860q(PackageManager packageManager, SemanticsBuilderUtil semanticsBuilderUtil, C85726n nVar, C9309a aVar, C68214a aVar2, C11944g gVar, C86124t tVar) {
        this.f38184d = packageManager;
        this.f38185e = semanticsBuilderUtil;
        this.f38186f = nVar;
        this.f38190j = aVar;
        this.f38187g = aVar2;
        this.f38189i = gVar;
        this.f38188h = tVar;
    }

    /* renamed from: d */
    private final C58833ax m27607d(String str, String str2, int i) {
        ArrayList arrayList;
        String a = C91038a.m148714a(new Intent("android.intent.action.VIEW", Uri.parse(str)), this.f38184d);
        if (a == null) {
            ((C58970a) ((C58970a) f38181a.mo56225c()).mo56372aa(43597)).mo56386p("Google Maps is not installed on device.");
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
        evVar2.f132944b = a;
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
        C51809dy a2 = C15670b.m32466a("provider.OPEN", "open_provider_args", "assistant.api.client_op.OpenProviderArgs", (ada) acz.build());
        if (str2 != null) {
            arrayList = new ArrayList(Arrays.asList(new C51809dy[]{C15669a.m32462a(str2)}));
            arrayList.add(a2);
        } else {
            arrayList = new ArrayList(Arrays.asList(new C51809dy[]{a2}));
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(arrayList, Arrays.asList(new Integer[]{Integer.valueOf(i)}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (((com.google.android.apps.gsa.search.core.google.gaia.C86054o) r8.f38187g.mo27525b()).mo79668a() == null) goto L_0x0080;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.base.C58833ax m27608e(java.lang.String r9) {
        /*
            r8 = this;
            com.google.android.apps.gsa.search.core.carassistant.f.n r0 = r8.f38186f
            boolean r0 = r0.mo79375b(r9)
            if (r0 != 0) goto L_0x0243
            com.google.android.apps.gsa.a.c.a r0 = r8.f38190j
            android.content.Context r1 = r0.f32300b
            android.content.res.Resources r0 = r0.mo17491a(r1)
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
            java.lang.String r0 = r0.toLanguageTag()
            com.google.common.b.hd r2 = f38182b
            boolean r3 = r2.containsKey(r0)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x003a
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x003a
            r0 = 2
            goto L_0x0051
        L_0x003a:
            com.google.common.b.hd r2 = f38183c
            boolean r3 = r2.containsKey(r0)
            if (r3 == 0) goto L_0x0050
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0050
            r0 = 3
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            com.google.android.apps.gsa.search.core.i.t r2 = r8.f38188h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250300aY
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0096
            boolean r2 = m27612i(r0)
            if (r2 != 0) goto L_0x0062
            goto L_0x0096
        L_0x0062:
            dagger.a r2 = r8.f38187g     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ Exception -> 0x0071 }
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r2     // Catch:{ Exception -> 0x0071 }
            android.accounts.Account r2 = r2.mo79668a()     // Catch:{ Exception -> 0x0071 }
            if (r2 != 0) goto L_0x0096
            goto L_0x0080
        L_0x0071:
            r0 = move-exception
            com.google.common.f.a.d r1 = f38181a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Failed to retrieve user login info, therefore assuming user is signed-out"
            r3 = 43608(0xaa58, float:6.1108E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0080:
            com.google.common.f.a.d r0 = f38181a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "User is signed out so punt for destination: %s."
            r2 = 43602(0xaa52, float:6.11E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r1, r9)
            r9 = 2132092403(0x7f1525f3, float:1.9825201E38)
            com.google.common.base.ax r9 = r8.m27610g(r9)
            return r9
        L_0x0096:
            com.google.android.apps.gsa.search.core.i.t r2 = r8.f38188h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250301aZ
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x00d1
            boolean r2 = m27612i(r0)
            if (r2 != 0) goto L_0x00a7
            goto L_0x00d1
        L_0x00a7:
            com.google.android.apps.gsa.search.core.carassistant.f.n r2 = r8.f38186f
            boolean r2 = r2.mo79374a(r9)
            if (r2 != 0) goto L_0x00d1
            com.google.common.f.a.d r2 = f38181a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Alias is not set so punt for destination: %s."
            r7 = 43601(0xaa51, float:6.1098E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56389s(r3, r9)
            if (r0 != r5) goto L_0x00c7
            r9 = 2132088005(0x7f1514c5, float:1.9816281E38)
            com.google.common.base.ax r9 = r8.m27610g(r9)
            return r9
        L_0x00c7:
            if (r0 != r4) goto L_0x00d1
            r9 = 2132093753(0x7f152b39, float:1.982794E38)
            com.google.common.base.ax r9 = r8.m27610g(r9)
            return r9
        L_0x00d1:
            com.google.android.libraries.assistant.auto.ondevice.utils.g r0 = r8.f38189i
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f38378b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250261M
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x012d
            com.google.android.apps.b.b.b.b.l r0 = com.google.android.apps.p453b.p457b.p460b.p462b.C9012l.f31137c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.b.b.b.b.k r0 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9011k) r0
            com.google.android.apps.b.b.b.b.h r2 = com.google.android.apps.p453b.p457b.p460b.p462b.C9008h.f31125c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.b.b.b.b.g r2 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9007g) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.b.b.b.b.h r3 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9008h) r3
            r9.getClass()
            int r4 = r3.f31127a
            r4 = r4 | 4
            r3.f31127a = r4
            r3.f31128b = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.b.b.b.b.l r3 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9012l) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.b.b.b.b.h r2 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9008h) r2
            r2.getClass()
            com.google.protobuf.cq r4 = r3.f31139a
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x011d
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r3.f31139a = r4
        L_0x011d:
            com.google.protobuf.cq r3 = r3.f31139a
            r3.add(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.b.b.b.b.l r0 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9012l) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0155
        L_0x012d:
            com.google.android.apps.gsa.shared.search.Query r2 = com.google.android.apps.gsa.shared.search.Query.f252741b     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo84268aE(r9, r1)     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            com.google.android.apps.gsa.search.core.al.ao.a.a r0 = r0.f38379c     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            com.google.common.util.concurrent.cx r0 = r0.mo78438a(r2)     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            com.google.android.apps.gsa.shared.s.a.a r2 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ ExecutionException -> 0x0144, InterruptedException -> 0x0142 }
            goto L_0x0155
        L_0x0142:
            r0 = move-exception
            goto L_0x0145
        L_0x0144:
            r0 = move-exception
        L_0x0145:
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11944g.f38377a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Got exception trying to conduct Gmm Offroad Search."
            r4 = 43890(0xab72, float:6.1503E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0155:
            com.google.android.libraries.assistant.auto.ondevice.utils.g r2 = r8.f38189i
            com.google.android.apps.gsa.search.core.i.t r2 = r2.f38378b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250265Q
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x01da
            java.lang.Object r2 = r0.mo56107c()
            com.google.android.apps.b.b.b.b.l r2 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9012l) r2
            com.google.protobuf.cq r2 = r2.f31139a
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0176
            goto L_0x01da
        L_0x0176:
            com.google.common.f.a.d r0 = f38181a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "Destination not in range for offline downloaded maps: %s."
            r3 = 43600(0xaa50, float:6.1097E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56389s(r2, r9)
            com.google.android.apps.gsa.a.c.a r0 = r8.f38190j
            android.content.Context r2 = r0.f32300b
            android.content.res.Resources r0 = r0.mo17491a(r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r1] = r9
            r9 = 2132086138(0x7f150d7a, float:1.9812495E38)
            java.lang.String r9 = r0.getString(r9, r2)
            com.google.assistant.e.j.dy r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r9)
            com.google.assistant.e.e.a.j r0 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.e.a.e r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r0
            com.google.assistant.e.j.dy[] r2 = new com.google.assistant.p3897e.p3921j.C51809dy[r6]
            r2[r1] = r9
            java.util.List r9 = java.util.Arrays.asList(r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r6]
            r3 = 23202(0x5aa2, float:3.2513E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.util.List r1 = java.util.Arrays.asList(r2)
            com.google.assistant.e.j.en r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r9, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.e.a.j r1 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r1
            r9.getClass()
            r1.f133275j = r9
            int r9 = r1.f133266a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r1.f133266a = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        L_0x01da:
            com.google.android.libraries.assistant.auto.ondevice.utils.g r2 = r8.f38189i
            com.google.android.apps.gsa.search.core.i.t r2 = r2.f38378b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250264P
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x020e
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x020e
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.b.b.b.b.l r0 = (com.google.android.apps.p453b.p457b.p460b.p462b.C9012l) r0
            com.google.protobuf.cq r0 = r0.f31139a
            int r0 = r0.size()
            if (r0 > r6) goto L_0x01fb
            goto L_0x020e
        L_0x01fb:
            com.google.common.f.a.d r0 = f38181a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Destination has > 1 result so triggering SAR: %s."
            r2 = 43598(0xaa4e, float:6.1094E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r1, r9)
            com.google.common.base.ax r9 = r8.m27609f(r9)
            return r9
        L_0x020e:
            com.google.android.apps.gsa.a.c.a r0 = r8.f38190j     // Catch:{ NotFoundException -> 0x0222 }
            android.content.Context r2 = r0.f32300b     // Catch:{ NotFoundException -> 0x0222 }
            android.content.res.Resources r0 = r0.mo17491a(r2)     // Catch:{ NotFoundException -> 0x0222 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ NotFoundException -> 0x0222 }
            r2[r1] = r9     // Catch:{ NotFoundException -> 0x0222 }
            r1 = 2132092625(0x7f1526d1, float:1.9825652E38)
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ NotFoundException -> 0x0222 }
            goto L_0x0232
        L_0x0222:
            r0 = move-exception
            com.google.common.f.a.d r1 = f38181a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Didn't build TTS, usually due to the string not yet translated for a locale. Continues to perform actions without TTS."
            r3 = 43599(0xaa4f, float:6.1095E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            r0 = 0
        L_0x0232:
            java.lang.String r1 = "google.navigation:q="
            java.lang.String r9 = m27611h(r9)
            java.lang.String r9 = r1.concat(r9)
            r1 = 23133(0x5a5d, float:3.2416E-41)
            com.google.common.base.ax r9 = r8.m27607d(r9, r0, r1)
            return r9
        L_0x0243:
            r9 = 2132091116(0x7f1520ec, float:1.9822591E38)
            com.google.common.base.ax r9 = r8.m27610g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11860q.m27608e(java.lang.String):com.google.common.base.ax");
    }

    /* renamed from: f */
    private final C58833ax m27609f(String str) {
        if (this.f38186f.mo79375b(str)) {
            return m27610g(R.string.personal_result_punt);
        }
        return m27607d("http://maps.google.com/maps?entry=sar&q=".concat(m27611h(str)), (String) null, 23214);
    }

    /* renamed from: g */
    private final C58833ax m27610g(int i) {
        C9309a aVar = this.f38190j;
        C51809dy a = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(i));
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(Arrays.asList(new C51809dy[]{a}), Arrays.asList(new Integer[]{23202}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* renamed from: h */
    private static String m27611h(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ((C58970a) ((C58970a) ((C58970a) f38181a.mo56225c()).mo56382g(e)).mo56372aa(43607)).mo56389s("Failed to URL encode '%s'\n", str);
            return str;
        }
    }

    /* renamed from: i */
    private static boolean m27612i(int i) {
        return i == 2 || i == 3;
    }

    /* renamed from: j */
    private final C58833ax m27613j(int i) {
        return m27607d("google.maps:?act=".concat(Integer.toString(i - 1)).concat("&entry=s:si"), (String) null, 23131);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo20239a(com.google.knowledge.p4661a.p4662a.C61752n r7, com.google.android.apps.gsa.shared.search.Query r8) {
        /*
            r6 = this;
            java.lang.String r8 = r7.f166811b
            int r0 = r8.hashCode()
            r1 = 3
            r2 = 10
            r3 = 9
            r4 = 2
            java.lang.String r5 = "Destination"
            switch(r0) {
                case -1372315690: goto L_0x0085;
                case -1307780404: goto L_0x007a;
                case -1305707300: goto L_0x0070;
                case -1199858686: goto L_0x0066;
                case -830889775: goto L_0x005b;
                case -356192338: goto L_0x0051;
                case 238021614: goto L_0x0048;
                case 473881282: goto L_0x003d;
                case 955468664: goto L_0x0033;
                case 1282019566: goto L_0x0029;
                case 1498399618: goto L_0x001e;
                case 1668672753: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x008f
        L_0x0013:
            java.lang.String r0 = "MuteVoiceGuidance"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 6
            goto L_0x0090
        L_0x001e:
            java.lang.String r0 = "LocalOpeningHours"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 3
            goto L_0x0090
        L_0x0029:
            java.lang.String r0 = "TravelNavigation"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 0
            goto L_0x0090
        L_0x0033:
            java.lang.String r0 = "UnmuteVoiceGuidance"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 7
            goto L_0x0090
        L_0x003d:
            java.lang.String r0 = "RouteOverview"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 11
            goto L_0x0090
        L_0x0048:
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x008f
            r8 = 10
            goto L_0x0090
        L_0x0051:
            java.lang.String r0 = "TravelDirections"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 1
            goto L_0x0090
        L_0x005b:
            java.lang.String r0 = "NavigationTurn"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 9
            goto L_0x0090
        L_0x0066:
            java.lang.String r0 = "AddAStop"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 4
            goto L_0x0090
        L_0x0070:
            java.lang.String r0 = "LocalEntityInfo"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 2
            goto L_0x0090
        L_0x007a:
            java.lang.String r0 = "TravelArrivalTime"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 8
            goto L_0x0090
        L_0x0085:
            java.lang.String r0 = "StopNavigation"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x008f
            r8 = 5
            goto L_0x0090
        L_0x008f:
            r8 = -1
        L_0x0090:
            switch(r8) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00f6;
                case 2: goto L_0x00da;
                case 3: goto L_0x00da;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00af;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00a1;
                case 10: goto L_0x009a;
                case 11: goto L_0x0095;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x0110
        L_0x0095:
            com.google.common.base.ax r7 = r6.m27613j(r3)
            return r7
        L_0x009a:
            r7 = 28
            com.google.common.base.ax r7 = r6.m27613j(r7)
            return r7
        L_0x00a1:
            r7 = 12
            com.google.common.base.ax r7 = r6.m27613j(r7)
            return r7
        L_0x00a8:
            r7 = 17
            com.google.common.base.ax r7 = r6.m27613j(r7)
            return r7
        L_0x00af:
            com.google.common.base.ax r7 = r6.m27613j(r1)
            return r7
        L_0x00b4:
            com.google.common.base.ax r7 = r6.m27613j(r4)
            return r7
        L_0x00b9:
            com.google.common.base.ax r7 = r6.m27613j(r2)
            return r7
        L_0x00be:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r8 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r8.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r7)
            java.lang.String r0 = "location"
            com.google.common.base.ax r8 = r8.mo22500e(r0)
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r7 = r8.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.base.ax r7 = r6.m27609f(r7)
            return r7
        L_0x00da:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r8 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r8.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r7)
            java.lang.String r0 = "Location"
            com.google.common.base.ax r8 = r8.mo22500e(r0)
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r7 = r8.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.base.ax r7 = r6.m27609f(r7)
            return r7
        L_0x00f6:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r8 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r8.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r7)
            com.google.common.base.ax r8 = r8.mo22500e(r5)
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r7 = r8.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.base.ax r7 = r6.m27608e(r7)
            return r7
        L_0x0110:
            com.google.common.f.a.d r8 = f38181a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            r0 = 43603(0xaa53, float:6.1101E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            java.lang.String r0 = "Cannot process the FunctionCall received: \n%s"
            java.lang.String r7 = r7.f166811b
            r8.mo56389s(r0, r7)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11860q.mo20239a(com.google.knowledge.a.a.n, com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final C60870cx mo20240b(C66525q qVar, Query query) {
        C63433v vVar;
        if (qVar == null) {
            ((C58970a) ((C58970a) f38181a.mo56225c()).mo56372aa(43606)).mo56386p("Received null HypothesisResult");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        SemanticsBuilderUtil semanticsBuilderUtil = this.f38185e;
        C56151j jVar = (C56151j) C56152k.f149611f.createBuilder();
        String obj = query.f252768g.toString();
        jVar.copyOnWrite();
        C56152k kVar = (C56152k) jVar.instance;
        obj.getClass();
        kVar.f149613a |= 1;
        kVar.f149614b = obj;
        C8844b a = b.a(semanticsBuilderUtil.f38328a.mo79344b());
        jVar.copyOnWrite();
        C56152k kVar2 = (C56152k) jVar.instance;
        kVar2.f149615c = a.f30754cC;
        kVar2.f149613a |= 2;
        String id = TimeZone.getDefault().getID();
        jVar.copyOnWrite();
        C56152k kVar3 = (C56152k) jVar.instance;
        id.getClass();
        kVar3.f149613a |= 4;
        kVar3.f149616d = id;
        C58833ax a2 = semanticsBuilderUtil.mo20311a(qVar, (C56152k) jVar.build());
        if (!a2.mo56113h()) {
            ((C58970a) ((C58970a) f38181a.mo56225c()).mo56372aa(43604)).mo56386p("Can't build AnalyzerResponse from HypothesisResult.");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C63417f fVar = (C63417f) C15669a.m32464c((C63595f) a2.mo56107c(), C63417f.f171386e);
        if (fVar == null) {
            C63431t tVar = (C63431t) C15669a.m32464c((C63595f) a2.mo56107c(), C63431t.f171424g);
            if (tVar != null) {
                C63433v vVar2 = tVar.f171427b;
                if (vVar2 == null) {
                    vVar2 = C63433v.f171433e;
                }
                if (!vVar2.f171438d) {
                    C63433v vVar3 = tVar.f171427b;
                    if (!(vVar3 == null ? C63433v.f171433e : vVar3).f171437c) {
                        if (vVar3 == null) {
                            vVar = C63433v.f171433e;
                        } else {
                            vVar = vVar3;
                        }
                        if (vVar.f171436b) {
                            int i = tVar.f171428c;
                            int a3 = C63413b.m96235a(i);
                            if (a3 == 0 || a3 == 1) {
                                return C60856cj.m92900i(m27613j(15));
                            }
                            int a4 = C63413b.m96235a(i);
                            if (a4 != 0 && a4 == 2) {
                                return C60856cj.m92900i(m27613j(13));
                            }
                        } else {
                            if (vVar3 == null) {
                                vVar3 = C63433v.f171433e;
                            }
                            if (vVar3.f171435a) {
                                return C60856cj.m92900i(m27613j(20));
                            }
                            if ((tVar.f171426a & 2) != 0) {
                                int a5 = C63413b.m96235a(tVar.f171428c);
                                if (a5 == 0 || a5 == 1) {
                                    return C60856cj.m92900i(m27613j(28));
                                }
                                if (a5 != 2) {
                                    return C60856cj.m92900i(m27613j(22));
                                }
                                return C60856cj.m92900i(m27613j(12));
                            } else if (tVar.f171429d) {
                                return C60856cj.m92900i(m27613j(30));
                            } else {
                                C63419h hVar = tVar.f171430e;
                                if (hVar == null) {
                                    hVar = C63419h.f171392d;
                                }
                                if ((hVar.f171394a & 2) != 0) {
                                    C63419h hVar2 = tVar.f171430e;
                                    if ((hVar2 == null ? C63419h.f171392d : hVar2).f171395b) {
                                        if (hVar2 == null) {
                                            hVar2 = C63419h.f171392d;
                                        }
                                        int a6 = C63421j.m96236a(hVar2.f171396c);
                                        if (a6 == 0 || a6 == 1) {
                                            return C60856cj.m92900i(m27613j(37));
                                        }
                                        if (a6 != 2) {
                                            return C60856cj.m92900i(m27613j(39));
                                        }
                                        return C60856cj.m92900i(m27613j(41));
                                    }
                                }
                                C63419h hVar3 = tVar.f171430e;
                                if (((hVar3 == null ? C63419h.f171392d : hVar3).f171394a & 2) != 0) {
                                    if (!(hVar3 == null ? C63419h.f171392d : hVar3).f171395b) {
                                        if (hVar3 == null) {
                                            hVar3 = C63419h.f171392d;
                                        }
                                        int a7 = C63421j.m96236a(hVar3.f171396c);
                                        if (a7 == 0 || a7 == 1) {
                                            return C60856cj.m92900i(m27613j(36));
                                        }
                                        if (a7 != 2) {
                                            return C60856cj.m92900i(m27613j(38));
                                        }
                                        return C60856cj.m92900i(m27613j(40));
                                    }
                                }
                            }
                        }
                        return C60856cj.m92900i(C58836b.f156633a);
                    }
                }
                if ((tVar.f171426a & 2) == 0) {
                    return C60856cj.m92900i(m27613j(17));
                }
                int i2 = tVar.f171428c;
                int a8 = C63413b.m96235a(i2);
                if (a8 != 0 && a8 == 2) {
                    return C60856cj.m92900i(m27613j(14));
                }
                int a9 = C63413b.m96235a(i2);
                if (a9 == 0 || a9 == 1) {
                    return C60856cj.m92900i(m27613j(16));
                }
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C63429r rVar = (C63429r) C15669a.m32464c((C63595f) a2.mo56107c(), C63429r.f171416c);
            if (rVar != null) {
                C63408ai aiVar = rVar.f171418a;
                if (aiVar == null) {
                    aiVar = C63408ai.f171351e;
                }
                if ((aiVar.f171353a & 16) == 0) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                C63408ai aiVar2 = rVar.f171418a;
                if (aiVar2 == null) {
                    aiVar2 = C63408ai.f171351e;
                }
                return C60856cj.m92900i(m27608e(aiVar2.f171356d));
            }
            C63415d dVar = (C63415d) C15669a.m32464c((C63595f) a2.mo56107c(), C63415d.f171378c);
            if (dVar == null) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C63408ai aiVar3 = dVar.f171380a;
            if (aiVar3 == null) {
                aiVar3 = C63408ai.f171351e;
            }
            if ((aiVar3.f171353a & 16) == 0) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C63408ai aiVar4 = dVar.f171380a;
            if (aiVar4 == null) {
                aiVar4 = C63408ai.f171351e;
            }
            return C60856cj.m92900i(m27609f(aiVar4.f171356d));
        } else if (fVar.f171390c) {
            return C60856cj.m92900i(m27613j(10));
        } else {
            C63435x xVar = fVar.f171388a;
            if (xVar == null) {
                xVar = C63435x.f171440e;
            }
            if (!xVar.f171442a) {
                C63435x xVar2 = fVar.f171388a;
                if ((xVar2 == null ? C63435x.f171440e : xVar2).f171445d) {
                    return C60856cj.m92900i(m27613j(8));
                }
                if ((xVar2 == null ? C63435x.f171440e : xVar2).f171443b) {
                    return C60856cj.m92900i(m27613j(29));
                }
                if (xVar2 == null) {
                    xVar2 = C63435x.f171440e;
                }
                if (xVar2.f171444c) {
                    return C60856cj.m92900i(m27613j(9));
                }
                return C60856cj.m92900i(C58836b.f156633a);
            } else if (fVar.f171389b) {
                return C60856cj.m92900i(m27613j(2));
            } else {
                return C60856cj.m92900i(m27613j(3));
            }
        }
    }

    /* renamed from: c */
    public final C60870cx mo20241c(C52081en enVar) {
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }
}
