package com.google.android.apps.search.googleapp.search.suggest.sources.p10463c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e;
import com.google.android.apps.search.googleapp.search.suggest.C138020al;
import com.google.android.apps.search.googleapp.search.suggest.C138023ao;
import com.google.android.apps.search.googleapp.search.suggest.C138024ap;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.c.g */
/* compiled from: PG */
public final class C138506g implements C138366a {

    /* renamed from: a */
    public static final /* synthetic */ int f376742a = 0;

    /* renamed from: b */
    private static final Uri f376743b;

    /* renamed from: c */
    private static final String[] f376744c = {"suggest_text_1", "suggest_icon_1", "suggest_intent_data", "suggest_intent_action"};

    /* renamed from: d */
    private final C46877q f376745d;

    /* renamed from: e */
    private final Executor f376746e;

    /* renamed from: f */
    private final C71422aw f376747f;

    /* renamed from: g */
    private final boolean f376748g;

    static {
        Uri parse = Uri.parse("content://com.google.android.apps.nexuslauncher.appssearch/");
        C69664n.m101060f(parse, "parse(\"content://com.goo…xuslauncher.appssearch/\")");
        f376743b = parse;
    }

    public C138506g(C46877q qVar, Executor executor, C71422aw awVar, boolean z) {
        C69664n.m101061g(qVar, "contentResolver");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f376745d = qVar;
        this.f376746e = executor;
        this.f376747f = awVar;
        this.f376748g = z;
    }

    /* renamed from: l */
    public static final C138030av m224929l(String str, String str2, Intent intent) {
        C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
        asVar.copyOnWrite();
        C138030av avVar = (C138030av) asVar.instance;
        str.getClass();
        avVar.f375538a |= 1;
        avVar.f375539b = str;
        C138029au auVar = C138029au.ON_DEVICE_APP;
        asVar.copyOnWrite();
        C138030av avVar2 = (C138030av) asVar.instance;
        avVar2.f375541d = auVar.f375534n;
        avVar2.f375538a |= 4;
        asVar.mo114079a(C64369b.SUBTYPE_PIXEL_APPS);
        C138032ax axVar = C138032ax.APP_STRIP;
        asVar.copyOnWrite();
        C138030av avVar3 = (C138030av) asVar.instance;
        avVar3.f375547k = axVar.f375579B;
        avVar3.f375538a |= 128;
        asVar.copyOnWrite();
        C138030av avVar4 = (C138030av) asVar.instance;
        avVar4.f375538a |= 64;
        avVar4.f375546j = 1;
        C138034az azVar = C138034az.PIXEL_LAUNCHER;
        asVar.copyOnWrite();
        C138030av avVar5 = (C138030av) asVar.instance;
        avVar5.f375545i = azVar.f375590i;
        avVar5.f375538a |= 32;
        C138020al alVar = (C138020al) C138025aq.f375512e.createBuilder();
        C138023ao aoVar = (C138023ao) C138024ap.f375507d.createBuilder();
        aoVar.copyOnWrite();
        C138024ap apVar = (C138024ap) aoVar.instance;
        str2.getClass();
        apVar.f375509a = 1 | apVar.f375509a;
        apVar.f375510b = str2;
        String uri = intent.toUri(0);
        aoVar.copyOnWrite();
        C138024ap apVar2 = (C138024ap) aoVar.instance;
        uri.getClass();
        apVar2.f375509a |= 2;
        apVar2.f375511c = uri;
        alVar.copyOnWrite();
        C138025aq aqVar = (C138025aq) alVar.instance;
        C138024ap apVar3 = (C138024ap) aoVar.build();
        apVar3.getClass();
        aqVar.f375517d = apVar3;
        aqVar.f375514a |= 4;
        asVar.copyOnWrite();
        C138030av avVar6 = (C138030av) asVar.instance;
        C138025aq aqVar2 = (C138025aq) alVar.build();
        aqVar2.getClass();
        avVar6.f375548l = aqVar2;
        avVar6.f375538a |= 256;
        C62942bv build = asVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .setT… )\n      )\n      .build()");
        return (C138030av) build;
    }

    /* renamed from: a */
    public final C138034az mo114248a() {
        return C138034az.PIXEL_LAUNCHER;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo114249b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo114250c(C138133o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104688a(C71803m.m105042c(this.f376747f, (C69585o) null, (C71424ay) null, new C138502c(this, oVar, (C69577g) null), 3));
    }

    /* renamed from: d */
    public final C60870cx mo114251d(C138030av avVar) {
        C69664n.m101061g(avVar, "suggestion");
        return C60866ct.f164955a;
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo114252e() {
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final boolean mo114253f(C138133o oVar) {
        C69664n.m101061g(oVar, "request");
        C139704d a = C139704d.m227141a(oVar.f375830g);
        if (a == null) {
            a = C139704d.UNKNOWN;
        }
        if (!C139705e.m227143a(a)) {
            return false;
        }
        String str = oVar.f375825b;
        C69664n.m101060f(str, "request.query");
        return str.length() != 0 || !this.f376748g;
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo114254g() {
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo114255h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114294i(com.google.android.apps.search.googleapp.search.suggest.C138133o r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138500a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.googleapp.search.suggest.sources.c.a r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138500a) r0
            int r1 = r0.f376729c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376729c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.sources.c.a r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.c.a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f376727a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376729c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r12)
            goto L_0x005d
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            p5462h.C69714l.m101134b(r12)
            java.lang.String r12 = r11.f375825b
            android.net.Uri r12 = f376743b
            android.net.Uri$Builder r12 = r12.buildUpon()
            java.lang.String r11 = r11.f375825b
            android.net.Uri$Builder r11 = r12.appendPath(r11)
            android.net.Uri r5 = r11.build()
            com.google.apps.tiktok.dataservice.q r4 = r10.f376745d
            java.lang.String[] r6 = f376744c
            r7 = 0
            r8 = 0
            r9 = 0
            com.google.apps.tiktok.concurrent.o r11 = r4.mo50872b(r5, r6, r7, r8, r9)
            com.google.android.apps.search.googleapp.search.suggest.sources.c.b r12 = new com.google.android.apps.search.googleapp.search.suggest.sources.c.b
            r12.<init>(r10)
            r0.f376729c = r3
            java.lang.Object r12 = r10.mo114296k(r11, r12, r0)
            if (r12 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.util.List r12 = (java.util.List) r12
            r12.size()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138506g.mo114294i(com.google.android.apps.search.googleapp.search.suggest.o, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114295j(com.google.android.apps.search.googleapp.search.suggest.C138133o r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138503d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.suggest.sources.c.d r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138503d) r0
            int r1 = r0.f376737e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376737e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.sources.c.d r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.c.d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f376735c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376737e
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r7 = r0.f376734b
            java.lang.Object r0 = r0.f376733a
            p5462h.C69714l.m101134b(r8)
            goto L_0x00cf
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.googleapp.search.suggest.v r8 = com.google.android.apps.search.googleapp.search.suggest.C138678v.f377195e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.u r8 = (com.google.android.apps.search.googleapp.search.suggest.C138543u) r8
            java.lang.String r2 = r7.f375825b
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.v r4 = (com.google.android.apps.search.googleapp.search.suggest.C138678v) r4
            r2.getClass()
            int r5 = r4.f377197a
            r5 = r5 | r3
            r4.f377197a = r5
            r4.f377198b = r2
            java.lang.String r2 = r7.f375825b
            java.lang.String r4 = "request.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00c0
            int r0 = r7.f375824a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00ba
            com.google.android.apps.search.googleapp.h.p r0 = r7.f375834k
            if (r0 != 0) goto L_0x006b
            com.google.android.apps.search.googleapp.h.p r0 = com.google.android.apps.search.googleapp.p10310h.C136135p.f370764b
        L_0x006b:
            com.google.protobuf.cq r0 = r0.f370766a
            r0.size()
            com.google.android.apps.search.googleapp.h.p r7 = r7.f375834k
            if (r7 != 0) goto L_0x0076
            com.google.android.apps.search.googleapp.h.p r7 = com.google.android.apps.search.googleapp.p10310h.C136135p.f370764b
        L_0x0076:
            com.google.protobuf.cq r7 = r7.f370766a
            java.lang.String r0 = "request.pixelLauncherData.predictedAppsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p5462h.p5463a.C69540x.m100804k(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x008c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r7.next()
            com.google.android.apps.search.googleapp.h.n r1 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r1
            java.lang.String r2 = r1.f370763d
            r3 = 0
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)
            java.lang.String r3 = r1.f370762c
            java.lang.String r4 = "app.label"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.lang.String r1 = r1.f370761b
            java.lang.String r4 = "app.iconUri"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            java.lang.String r4 = "intent"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.apps.search.googleapp.search.suggest.av r1 = m224929l(r3, r1, r2)
            r0.add(r1)
            goto L_0x008c
        L_0x00ba:
            h.a.am r0 = p5462h.p5463a.C69496am.f185918a
        L_0x00bc:
            r8.mo114309a(r0)
            goto L_0x00d7
        L_0x00c0:
            r0.f376733a = r8
            r0.f376734b = r8
            r0.f376737e = r3
            java.lang.Object r7 = r6.mo114294i(r7, r0)
            if (r7 == r1) goto L_0x00e3
            r0 = r8
            r8 = r7
            r7 = r0
        L_0x00cf:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.google.android.apps.search.googleapp.search.suggest.u r7 = (com.google.android.apps.search.googleapp.search.suggest.C138543u) r7
            r7.mo114309a(r8)
            r8 = r0
        L_0x00d7:
            com.google.protobuf.bn r8 = (com.google.protobuf.C62934bn) r8
            com.google.protobuf.bv r7 = r8.build()
            java.lang.String r8 = "responseBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            return r7
        L_0x00e3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138506g.mo114295j(com.google.android.apps.search.googleapp.search.suggest.o, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114296k(com.google.apps.tiktok.concurrent.C46463o r5, p5462h.p5473f.p5474a.C69626l r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138504e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.suggest.sources.c.e r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138504e) r0
            int r1 = r0.f376740c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376740c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.sources.c.e r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.c.e
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f376738a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376740c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0055
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            com.google.common.util.concurrent.ay r5 = r5.f121591a
            com.google.android.apps.search.googleapp.search.suggest.sources.c.f r7 = new com.google.android.apps.search.googleapp.search.suggest.sources.c.f
            r7.<init>(r6)
            com.google.common.util.concurrent.al r6 = com.google.apps.tiktok.tracing.C47810es.m84970j(r7)
            java.util.concurrent.Executor r7 = r4.f376746e
            com.google.common.util.concurrent.ay r5 = r5.mo57272e(r6, r7)
            com.google.common.util.concurrent.bs r5 = r5.mo57275g()
            java.lang.String r6 = "converter: (Cursor) -> T…)\n      .finishToFuture()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f376740c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            java.lang.String r5 = "converter: (Cursor) -> T…ToFuture()\n      .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10463c.C138506g.mo114296k(com.google.apps.tiktok.concurrent.o, h.f.a.l, h.c.g):java.lang.Object");
    }
}
