package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.gsa.nga.api.C74724cb;
import com.google.android.apps.gsa.shared.bisto.C89605ac;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89641l;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94933a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94937e;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.assistant.p3739a.p3740a.C48051al;
import com.google.assistant.p3739a.p3740a.C48062aw;
import com.google.assistant.p3739a.p3740a.C48063ax;
import com.google.assistant.p3739a.p3740a.C48064ay;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48127x;
import com.google.assistant.p3739a.p3740a.C48128y;
import com.google.assistant.p3739a.p3740a.C48129z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.l */
/* compiled from: PG */
public final class C94914l implements C94937e {

    /* renamed from: a */
    public static final C59071e f265483a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.b.l");

    /* renamed from: b */
    public final C94905c f265484b;

    /* renamed from: c */
    public final C89492cd f265485c;

    /* renamed from: d */
    public final String f265486d;

    /* renamed from: e */
    final C95458i f265487e;

    /* renamed from: f */
    C89605ac f265488f;

    /* renamed from: g */
    private final C94933a f265489g;

    /* renamed from: h */
    private final Context f265490h;

    /* renamed from: i */
    private final C91093c f265491i;

    /* renamed from: j */
    private final C94917o f265492j;

    /* renamed from: k */
    private final C94926x f265493k;

    /* renamed from: l */
    private final C94964a f265494l;

    /* renamed from: m */
    private final C94925w f265495m;

    /* renamed from: n */
    private final Executor f265496n;

    /* renamed from: o */
    private final C32160b f265497o;

    /* renamed from: p */
    private final C94934b f265498p;

    public C94914l(C89492cd cdVar, Context context, Executor executor, C94905c cVar, C94926x xVar, C95458i iVar, C32160b bVar, C94933a aVar, String str, C94917o oVar, C94964a aVar2, C94925w wVar, C94934b bVar2) {
        this.f265484b = cVar;
        this.f265485c = cdVar;
        this.f265490h = context;
        this.f265496n = executor;
        this.f265489g = aVar;
        this.f265486d = str;
        this.f265491i = new C91093c(context);
        this.f265492j = oVar;
        this.f265493k = xVar;
        this.f265487e = iVar;
        this.f265497o = bVar;
        this.f265494l = aVar2;
        this.f265495m = wVar;
        this.f265498p = bVar2;
    }

    /* renamed from: k */
    private final synchronized void m156646k() {
        C59104x b = f265483a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17560)).mo56386p("onHostInfo");
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        Context context = this.f265490h;
        String valueOf2 = String.valueOf(C89641l.m145912a(context, context.getPackageName()));
        Context context2 = this.f265490h;
        String c = C89641l.m145914c(context2, context2.getPackageName());
        C48062aw awVar = (C48062aw) C48063ax.f124391e.createBuilder();
        awVar.copyOnWrite();
        ((C48063ax) awVar.instance).f124393a = 1;
        awVar.copyOnWrite();
        valueOf2.getClass();
        ((C48063ax) awVar.instance).f124395c = valueOf2;
        awVar.copyOnWrite();
        valueOf.getClass();
        ((C48063ax) awVar.instance).f124394b = valueOf;
        if (c != null) {
            awVar.copyOnWrite();
            ((C48063ax) awVar.instance).f124396d = c;
        }
        C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
        C48063ax axVar = (C48063ax) awVar.build();
        ayVar.copyOnWrite();
        C48065az azVar = (C48065az) ayVar.instance;
        axVar.getClass();
        azVar.f124400b = axVar;
        azVar.f124399a = 5;
        mo88808j((C48065az) ayVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m156647l(com.google.assistant.p3739a.p3740a.C48061av r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.f124389a     // Catch:{ all -> 0x0064 }
            r1 = 1
            if (r0 != r1) goto L_0x0062
            java.lang.Object r4 = r4.f124390b     // Catch:{ all -> 0x0064 }
            com.google.assistant.a.a.aq r4 = (com.google.assistant.p3739a.p3740a.C48056aq) r4     // Catch:{ all -> 0x0064 }
            int r0 = r4.f124380a     // Catch:{ all -> 0x0064 }
            if (r0 == r1) goto L_0x004a
            r1 = 2
            if (r0 == r1) goto L_0x0032
            r1 = 3
            if (r0 != r1) goto L_0x0062
            android.content.Context r0 = r3.f265490h     // Catch:{ all -> 0x0064 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0064 }
            int r2 = r4.f124380a     // Catch:{ all -> 0x0064 }
            if (r2 != r1) goto L_0x0023
            java.lang.Object r4 = r4.f124381b     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0064 }
            goto L_0x0025
        L_0x0023:
            java.lang.String r4 = ""
        L_0x0025:
            android.content.Intent r4 = r0.getLaunchIntentForPackage(r4)     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0062
            com.google.android.apps.gsa.shared.util.t.c r0 = r3.f265491i     // Catch:{ all -> 0x0064 }
            r0.mo65089a(r4)     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)
            return
        L_0x0032:
            com.google.android.apps.gsa.shared.util.t.c r0 = r3.f265491i     // Catch:{ all -> 0x0064 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.Object r4 = r4.f124381b     // Catch:{ all -> 0x0064 }
            com.google.assistant.a.a.au r4 = (com.google.assistant.p3739a.p3740a.C48060au) r4     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r4.f124386a     // Catch:{ all -> 0x0064 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0064 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0064 }
            r0.mo65089a(r1)     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)
            return
        L_0x004a:
            com.google.android.apps.gsa.shared.util.t.c r0 = r3.f265491i     // Catch:{ all -> 0x0064 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.Object r4 = r4.f124381b     // Catch:{ all -> 0x0064 }
            com.google.assistant.a.a.au r4 = (com.google.assistant.p3739a.p3740a.C48060au) r4     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r4.f124386a     // Catch:{ all -> 0x0064 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0064 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0064 }
            r0.mo65089a(r1)     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)
            return
        L_0x0062:
            monitor-exit(r3)
            return
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94914l.m156647l(com.google.assistant.a.a.av):void");
    }

    /* renamed from: m */
    private final void m156648m(boolean z) {
        C60856cj.m92911t(this.f265485c.mo83408n(this.f265486d), new C94913k(this, z), this.f265496n);
    }

    /* renamed from: a */
    public final C124548d mo88799a() {
        return this.f265485c.mo83401b(this.f265486d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06fd, code lost:
        if ((r4.f124403a == 3 ? (java.lang.String) r4.f124404b : r6).isEmpty() == false) goto L_0x06ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b1 A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bf A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c1 A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cc A[SYNTHETIC, Splitter:B:114:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d3 A[SYNTHETIC, Splitter:B:119:0x01d3] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01ef A[SYNTHETIC, Splitter:B:128:0x01ef] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0214 A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x055f A[Catch:{ IOException -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x058e A[Catch:{ IOException -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05d2 A[Catch:{ IOException -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0662 A[Catch:{ IOException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x076a A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0771 A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x077b A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0894 A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x08a2 A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x08b5 A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x08bf A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08dd A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x08ea A[Catch:{ IOException -> 0x091a }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0177 A[SYNTHETIC, Splitter:B:84:0x0177] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018c A[Catch:{ IOException -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0199 A[Catch:{ IOException -> 0x05e5 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88800b(com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d r34, byte[] r35) {
        /*
            r33 = this;
            r1 = r33
            r2 = r35
            java.lang.String r3 = "SodaEvent Voice Format not supported"
            java.lang.String r4 = "GacsVoiceInputManager"
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.d r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d.CONTROL_INPUT
            int r5 = r34.ordinal()
            java.lang.String r6 = "Unable to parse incoming message"
            r7 = 6
            java.lang.String r8 = "QueryEntryPoint"
            java.lang.String r9 = "BistoGacsDataHandler"
            r10 = 2
            r11 = 4
            r12 = 3
            r13 = 1
            if (r5 == 0) goto L_0x00b2
            if (r5 == r11) goto L_0x008e
            if (r5 == r7) goto L_0x0034
            com.google.common.f.e r2 = f265483a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r9)
            java.lang.String r3 = "Unknown category: %s"
            r4 = 17561(0x4499, float:2.4608E-41)
            r5 = r34
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r5)
            return
        L_0x0034:
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.w r3 = r1.f265495m
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94925w.f265529a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "BistoProxyHandler"
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "handleNotification"
            r8 = 17607(0x44c7, float:2.4673E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56386p(r5)
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.f169869a     // Catch:{ IOException -> 0x007b }
            com.google.assistant.a.a.bm r5 = com.google.assistant.p3739a.p3740a.C48079bm.f124433c     // Catch:{ IOException -> 0x007b }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ IOException -> 0x007b }
            com.google.assistant.a.a.bm r2 = (com.google.assistant.p3739a.p3740a.C48079bm) r2     // Catch:{ IOException -> 0x007b }
            int r4 = r2.f124435a     // Catch:{ IOException -> 0x007b }
            if (r4 != r13) goto L_0x0062
            java.lang.Object r2 = r2.f124436b     // Catch:{ IOException -> 0x007b }
            com.google.assistant.a.a.cb r2 = (com.google.assistant.p3739a.p3740a.C48095cb) r2     // Catch:{ IOException -> 0x007b }
            long r4 = r2.f124465a     // Catch:{ IOException -> 0x007b }
            r3.mo88832c(r4)     // Catch:{ IOException -> 0x007b }
            return
        L_0x0062:
            if (r4 != r12) goto L_0x0072
            java.lang.Object r2 = r2.f124436b     // Catch:{ IOException -> 0x007b }
            com.google.assistant.a.a.bq r2 = (com.google.assistant.p3739a.p3740a.C48083bq) r2     // Catch:{ IOException -> 0x007b }
            com.google.protobuf.z r2 = r2.f124443a     // Catch:{ IOException -> 0x007b }
            byte[] r2 = r2.mo59174N()     // Catch:{ IOException -> 0x007b }
            r3.mo88831b(r2)     // Catch:{ IOException -> 0x007b }
            return
        L_0x0072:
            if (r4 != r10) goto L_0x0078
            r3.mo88830a()     // Catch:{ IOException -> 0x007b }
            return
        L_0x0078:
            r3 = r1
            goto L_0x0919
        L_0x007b:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94925w.f265529a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r7)
            r4 = 17608(0x44c8, float:2.4674E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r6)
            return
        L_0x008e:
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r3 = r1.f265493k
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94926x.f265536a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r8)
            java.lang.String r5 = "onAudioData"
            r6 = 17609(0x44c9, float:2.4675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            boolean r4 = r3.f265544i
            if (r4 == 0) goto L_0x00ac
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.q r3 = r3.f265538c
            r3.mo88885f(r2)
            return
        L_0x00ac:
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.v r3 = r3.f265543h
            r3.mo88866e(r2)
            return
        L_0x00b2:
            com.google.common.f.e r5 = f265483a
            com.google.common.f.x r14 = r5.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r9)
            java.lang.String r15 = "handleControlData"
            r7 = 17552(0x4490, float:2.4596E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r7)).mo56386p(r15)
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.f169869a     // Catch:{ IOException -> 0x0924 }
            com.google.assistant.a.a.d r14 = com.google.assistant.p3739a.p3740a.C48107d.f124510c     // Catch:{ IOException -> 0x0924 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r14, (byte[]) r2, (com.google.protobuf.C62921ba) r7)     // Catch:{ IOException -> 0x0924 }
            com.google.assistant.a.a.d r2 = (com.google.assistant.p3739a.p3740a.C48107d) r2     // Catch:{ IOException -> 0x0924 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.j r7 = new com.google.android.apps.gsa.staticplugins.bisto.ac.b.j     // Catch:{ IOException -> 0x0924 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0924 }
            com.google.common.base.cr r7 = com.google.common.base.C58886cw.m90973a(r7)     // Catch:{ IOException -> 0x0924 }
            java.lang.Object r7 = r7.mo6453a()     // Catch:{ IOException -> 0x0924 }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d) r7     // Catch:{ IOException -> 0x0924 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r14 = r1.f265493k     // Catch:{ IOException -> 0x0924 }
            if (r7 == 0) goto L_0x00e3
            r14.f265545j = r7     // Catch:{ IOException -> 0x0924 }
        L_0x00e3:
            int r14 = r2.f124512a     // Catch:{ IOException -> 0x0924 }
            java.lang.String r15 = "GacsDialogHandler"
            if (r14 != r11) goto L_0x0605
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r14 = r1.f265493k     // Catch:{ IOException -> 0x05fc }
            java.lang.Object r12 = r2.f124513b     // Catch:{ IOException -> 0x05fc }
            com.google.assistant.a.a.cd r12 = (com.google.assistant.p3739a.p3740a.C48097cd) r12     // Catch:{ IOException -> 0x05fc }
            com.google.common.f.e r16 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94926x.f265536a     // Catch:{ IOException -> 0x05fc }
            com.google.common.f.x r11 = r16.mo56224b()     // Catch:{ IOException -> 0x05fc }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05fc }
            r11.mo56378ag(r10, r8)     // Catch:{ IOException -> 0x05fc }
            java.lang.String r10 = "onStartStreaming"
            r13 = 17614(0x44ce, float:2.4682E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r10)     // Catch:{ IOException -> 0x05fc }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r10 = r14.f265545j     // Catch:{ IOException -> 0x05fc }
            if (r10 == 0) goto L_0x05e7
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r10 = r14.f265545j     // Catch:{ IOException -> 0x05fc }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r10 = r10.mo106521s()     // Catch:{ IOException -> 0x05fc }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb.OPA_ENABLED     // Catch:{ IOException -> 0x05fc }
            if (r10 == r11) goto L_0x0120
            r14.mo88837c()     // Catch:{ IOException -> 0x0924 }
            r1 = r2
            r20 = r5
            r17 = r6
            r18 = r7
            r19 = r8
        L_0x011b:
            r21 = r9
        L_0x011d:
            r2 = 0
            goto L_0x0614
        L_0x0120:
            int r10 = r12.f124473f     // Catch:{ IOException -> 0x05fc }
            if (r10 == 0) goto L_0x0135
            r11 = 1
            if (r10 == r11) goto L_0x0133
            r11 = 2
            if (r10 == r11) goto L_0x0131
            r11 = 3
            if (r10 == r11) goto L_0x012f
            r10 = 0
            goto L_0x0136
        L_0x012f:
            r10 = 5
            goto L_0x0136
        L_0x0131:
            r10 = 4
            goto L_0x0136
        L_0x0133:
            r10 = 3
            goto L_0x0136
        L_0x0135:
            r10 = 2
        L_0x0136:
            if (r10 != 0) goto L_0x0139
            r10 = 1
        L_0x0139:
            r11 = 5
            if (r10 == r11) goto L_0x013e
            r13 = 0
            goto L_0x013f
        L_0x013e:
            r13 = 1
        L_0x013f:
            if (r10 != r11) goto L_0x0170
            com.google.android.apps.gsa.shared.bisto.k r11 = r14.f265537b     // Catch:{ IOException -> 0x016a }
            r17 = r6
            r6 = 122(0x7a, float:1.71E-43)
            boolean r11 = r11.mo83555j(r6)     // Catch:{ IOException -> 0x0168 }
            if (r11 != 0) goto L_0x0172
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94926x.f265536a     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0168 }
            r6.mo56378ag(r11, r8)     // Catch:{ IOException -> 0x0168 }
            r11 = 17618(0x44d2, float:2.4688E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r11)).mo56386p(r3)     // Catch:{ IOException -> 0x0168 }
            com.google.assistant.a.a.ce r6 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x0168 }
            com.google.assistant.a.a.az r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c.m156742a(r6, r3)     // Catch:{ IOException -> 0x0168 }
            r14.mo88838d(r3)     // Catch:{ IOException -> 0x0168 }
            r3 = 1
            goto L_0x0173
        L_0x0168:
            r0 = move-exception
            goto L_0x016d
        L_0x016a:
            r0 = move-exception
            r17 = r6
        L_0x016d:
            r3 = r1
            goto L_0x0928
        L_0x0170:
            r17 = r6
        L_0x0172:
            r3 = 0
        L_0x0173:
            com.google.assistant.a.a.bx r6 = r12.f124468a     // Catch:{ IOException -> 0x05e5 }
            if (r6 != 0) goto L_0x0179
            com.google.assistant.a.a.bx r6 = com.google.assistant.p3739a.p3740a.C48090bx.f124451f     // Catch:{ IOException -> 0x0168 }
        L_0x0179:
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.y r11 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94928z.m156711h()     // Catch:{ IOException -> 0x05e5 }
            r18 = r7
            int r7 = r12.f124469b     // Catch:{ IOException -> 0x05e5 }
            r11.mo88783c(r7)     // Catch:{ IOException -> 0x05e5 }
            int r7 = r6.f124454b     // Catch:{ IOException -> 0x05e5 }
            int r7 = com.google.assistant.p3739a.p3740a.C48089bw.m85181b(r7)     // Catch:{ IOException -> 0x05e5 }
            if (r7 != 0) goto L_0x018d
            r7 = 1
        L_0x018d:
            r11.mo88786f(r7)     // Catch:{ IOException -> 0x05e5 }
            boolean r7 = r12.f124471d     // Catch:{ IOException -> 0x05e5 }
            r11.mo88785e(r7)     // Catch:{ IOException -> 0x05e5 }
            int r7 = r12.f124472e     // Catch:{ IOException -> 0x05e5 }
            if (r7 == 0) goto L_0x01ac
            r19 = r8
            r8 = 1
            if (r7 == r8) goto L_0x01aa
            r8 = 2
            if (r7 == r8) goto L_0x01a8
            r8 = 3
            if (r7 == r8) goto L_0x01a6
            r7 = 0
            goto L_0x01af
        L_0x01a6:
            r7 = 5
            goto L_0x01af
        L_0x01a8:
            r7 = 4
            goto L_0x01af
        L_0x01aa:
            r7 = 3
            goto L_0x01af
        L_0x01ac:
            r19 = r8
            r7 = 2
        L_0x01af:
            if (r7 != 0) goto L_0x01b2
            r7 = 1
        L_0x01b2:
            r8 = r11
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.d r8 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94906d) r8     // Catch:{ IOException -> 0x05e5 }
            r8.f265458b = r7     // Catch:{ IOException -> 0x05e5 }
            int r7 = r12.f124470c     // Catch:{ IOException -> 0x05e5 }
            r11.mo88784d(r7)     // Catch:{ IOException -> 0x05e5 }
            r7 = 4
            if (r10 != r7) goto L_0x01c1
            r8 = 4
            goto L_0x01c7
        L_0x01c1:
            r8 = 5
            if (r10 != r8) goto L_0x01c6
            r8 = 5
            goto L_0x01c7
        L_0x01c6:
            r8 = 1
        L_0x01c7:
            r11.mo88782b(r8)     // Catch:{ IOException -> 0x05e5 }
            if (r10 != r7) goto L_0x01cf
            r14.mo88835a()     // Catch:{ IOException -> 0x0168 }
        L_0x01cf:
            com.google.speech.j.je r7 = r12.f124474g     // Catch:{ IOException -> 0x05e5 }
            if (r7 == 0) goto L_0x01e7
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)     // Catch:{ IOException -> 0x0168 }
            if (r7 == 0) goto L_0x01df
            r8 = r11
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.d r8 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94906d) r8     // Catch:{ IOException -> 0x0168 }
            r8.f265457a = r7     // Catch:{ IOException -> 0x0168 }
            goto L_0x01e7
        L_0x01df:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x0168 }
            java.lang.String r3 = "Null hotwordEvent"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0168 }
            throw r2     // Catch:{ IOException -> 0x0168 }
        L_0x01e7:
            j$.util.Optional r7 = r14.f265541f     // Catch:{ IOException -> 0x05e5 }
            boolean r7 = r7.isPresent()     // Catch:{ IOException -> 0x05e5 }
            if (r7 == 0) goto L_0x020d
            j$.util.Optional r7 = r14.f265541f     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r7 = r7.get()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.m.d r7 = (com.google.android.apps.gsa.nga.shared.p6356m.C81428d) r7     // Catch:{ IOException -> 0x0168 }
            boolean r7 = r7.mo75077d()     // Catch:{ IOException -> 0x0168 }
            if (r7 == 0) goto L_0x020d
            if (r13 != 0) goto L_0x020b
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r7 = r14.f265545j     // Catch:{ IOException -> 0x0168 }
            if (r7 == 0) goto L_0x020d
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r7 = r14.f265545j     // Catch:{ IOException -> 0x0168 }
            boolean r7 = r7.mo106497ak()     // Catch:{ IOException -> 0x0168 }
            if (r7 != 0) goto L_0x020d
        L_0x020b:
            r7 = 1
            goto L_0x020e
        L_0x020d:
            r7 = 0
        L_0x020e:
            r14.f265544i = r7     // Catch:{ IOException -> 0x05e5 }
            boolean r7 = r14.f265544i     // Catch:{ IOException -> 0x05e5 }
            if (r7 == 0) goto L_0x05d2
            dagger.a r7 = r14.f265539d     // Catch:{ IOException -> 0x05e5 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ IOException -> 0x05e5 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.a r7 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a) r7     // Catch:{ IOException -> 0x05e5 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.z r8 = r11.mo88781a()     // Catch:{ IOException -> 0x05e5 }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r10 = r14.f265545j     // Catch:{ IOException -> 0x05e5 }
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x05e5 }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ IOException -> 0x05e5 }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05e5 }
            r11.mo56378ag(r12, r15)     // Catch:{ IOException -> 0x05e5 }
            java.lang.String r12 = "#onStartStreaming"
            r13 = 17738(0x454a, float:2.4856E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)     // Catch:{ IOException -> 0x05e5 }
            int r11 = r8.mo88787a()     // Catch:{ IOException -> 0x05e5 }
            java.lang.String r12 = "invocation suppressed by follow on"
            java.lang.String r13 = "Device has been notified of an error"
            r14 = 5
            if (r11 != r14) goto L_0x03f5
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.c r4 = r7.f265653c     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ IOException -> 0x0168 }
            r7.f265658h = r4     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.c r4 = r7.f265653c     // Catch:{ IOException -> 0x0168 }
            boolean r11 = r7.f265660j     // Catch:{ IOException -> 0x0168 }
            r4.f265676e = r3     // Catch:{ IOException -> 0x0168 }
            boolean r3 = r4.f265676e     // Catch:{ IOException -> 0x0168 }
            if (r3 == 0) goto L_0x0265
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94966c.f265672a     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0168 }
            java.lang.String r11 = "GacsRohanManager"
            r3.mo56378ag(r4, r11)     // Catch:{ IOException -> 0x0168 }
            r4 = 17746(0x4552, float:2.4867E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56386p(r13)     // Catch:{ IOException -> 0x0168 }
            r3 = 0
            goto L_0x0266
        L_0x0265:
            r3 = 1
        L_0x0266:
            boolean r4 = r8.mo88791e()     // Catch:{ IOException -> 0x0168 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ IOException -> 0x0168 }
            r7.f265661k = r4     // Catch:{ IOException -> 0x0168 }
            int r4 = r6.f124456d     // Catch:{ IOException -> 0x0168 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ IOException -> 0x0168 }
            r7.f265662l = r4     // Catch:{ IOException -> 0x0168 }
            boolean r4 = r7.f265660j     // Catch:{ IOException -> 0x0168 }
            if (r4 == 0) goto L_0x02b2
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0168 }
            r4.mo56378ag(r6, r15)     // Catch:{ IOException -> 0x0168 }
            r6 = 17720(0x4538, float:2.4831E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r12)     // Catch:{ IOException -> 0x0168 }
            if (r3 != 0) goto L_0x02ad
            j$.util.Optional r3 = r7.f265659i     // Catch:{ IOException -> 0x0168 }
            boolean r3 = r3.isPresent()     // Catch:{ IOException -> 0x0168 }
            if (r3 == 0) goto L_0x02ad
            com.google.android.apps.gsa.nga.api.bh r3 = r7.f265654d     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = r7.f265659i     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r4 = r4.get()     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r4 = (com.google.android.libraries.search.p2904c.C37672hs) r4     // Catch:{ IOException -> 0x0168 }
            r3.c(r4)     // Catch:{ IOException -> 0x0168 }
            goto L_0x03f0
        L_0x02ad:
            r7.mo88874i()     // Catch:{ IOException -> 0x0168 }
            goto L_0x03f0
        L_0x02b2:
            if (r3 == 0) goto L_0x03f0
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ IOException -> 0x0168 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0168 }
            r3.mo56378ag(r4, r15)     // Catch:{ IOException -> 0x0168 }
            java.lang.String r4 = "Starting Invocation"
            r11 = 17719(0x4537, float:2.483E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r4)     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.c r3 = r7.f265653c     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.api.a.cf r3 = r3.mo88878c()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.b.c r4 = r7.f265664n     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r4 = r4.mo74823a()     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ IOException -> 0x0168 }
            r7.f265659i = r4     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r4 = r8.mo88790d()     // Catch:{ IOException -> 0x0168 }
            boolean r4 = r4.isPresent()     // Catch:{ IOException -> 0x0168 }
            if (r4 == 0) goto L_0x03c2
            j$.util.Optional r4 = r8.mo88790d()     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r4 = r4.get()     // Catch:{ IOException -> 0x0168 }
            com.google.speech.j.je r4 = (com.google.speech.p5218j.C67050je) r4     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.shared.speech.hotword.p r8 = com.google.android.apps.gsa.shared.speech.hotword.HotwordResult.m147742F()     // Catch:{ IOException -> 0x0168 }
            r11 = 0
            r8.mo84725n(r11)     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r11 = r7.f265659i     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r12 = com.google.android.libraries.search.p2904c.C37672hs.f100056c     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r11 = r11.orElse(r12)     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r11 = (com.google.android.libraries.search.p2904c.C37672hs) r11     // Catch:{ IOException -> 0x0168 }
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)     // Catch:{ IOException -> 0x0168 }
            r12 = r8
            com.google.android.apps.gsa.shared.speech.hotword.a r12 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r12     // Catch:{ IOException -> 0x0168 }
            r12.f253217g = r11     // Catch:{ IOException -> 0x0168 }
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ IOException -> 0x0168 }
            r12 = r8
            com.google.android.apps.gsa.shared.speech.hotword.a r12 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r12     // Catch:{ IOException -> 0x0168 }
            r12.f253218h = r11     // Catch:{ IOException -> 0x0168 }
            r11 = 2
            r8.mo84733v(r11)     // Catch:{ IOException -> 0x0168 }
            com.google.speech.k.a.g r11 = com.google.speech.p5224k.p5225a.C67229g.UNKNOWN     // Catch:{ IOException -> 0x0168 }
            r8.mo84713b(r11)     // Catch:{ IOException -> 0x0168 }
            r11 = 0
            r8.mo84719h(r11)     // Catch:{ IOException -> 0x0168 }
            com.google.speech.h.cx r11 = com.google.speech.p5208h.C66626cx.WRIST_WORN     // Catch:{ IOException -> 0x0168 }
            r8.mo84718g(r11)     // Catch:{ IOException -> 0x0168 }
            r11 = 1
            r8.mo84732u(r11)     // Catch:{ IOException -> 0x0168 }
            int r11 = r4.f182264a     // Catch:{ IOException -> 0x0168 }
            r12 = 8
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0350
            com.google.speech.j.jg r11 = r4.f182268e     // Catch:{ IOException -> 0x0168 }
            if (r11 != 0) goto L_0x0334
            com.google.speech.j.jg r11 = com.google.speech.p5218j.C67052jg.f182269e     // Catch:{ IOException -> 0x0168 }
        L_0x0334:
            int r12 = r11.f182271a     // Catch:{ IOException -> 0x0168 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0350
            com.google.speech.j.il r12 = r11.f182273c     // Catch:{ IOException -> 0x0168 }
            if (r12 != 0) goto L_0x0340
            com.google.speech.j.il r12 = com.google.speech.p5218j.C67030il.f182195e     // Catch:{ IOException -> 0x0168 }
        L_0x0340:
            float r12 = r12.f182198b     // Catch:{ IOException -> 0x0168 }
            r8.mo84722k(r12)     // Catch:{ IOException -> 0x0168 }
            com.google.speech.j.il r11 = r11.f182273c     // Catch:{ IOException -> 0x0168 }
            if (r11 != 0) goto L_0x034b
            com.google.speech.j.il r11 = com.google.speech.p5218j.C67030il.f182195e     // Catch:{ IOException -> 0x0168 }
        L_0x034b:
            float r11 = r11.f182199c     // Catch:{ IOException -> 0x0168 }
            r8.mo84715d(r11)     // Catch:{ IOException -> 0x0168 }
        L_0x0350:
            int r11 = r4.f182264a     // Catch:{ IOException -> 0x0168 }
            r12 = 1
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0374
            com.google.speech.j.jc r11 = r4.f182265b     // Catch:{ IOException -> 0x0168 }
            if (r11 != 0) goto L_0x035c
            com.google.speech.j.jc r11 = com.google.speech.p5218j.C67048jc.f182253h     // Catch:{ IOException -> 0x0168 }
        L_0x035c:
            java.lang.String r12 = r11.f182261g     // Catch:{ IOException -> 0x0168 }
            r13 = r8
            com.google.android.apps.gsa.shared.speech.hotword.a r13 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r13     // Catch:{ IOException -> 0x0168 }
            r13.f253211a = r12     // Catch:{ IOException -> 0x0168 }
            float r12 = r11.f182258d     // Catch:{ IOException -> 0x0168 }
            r8.mo84731t(r12)     // Catch:{ IOException -> 0x0168 }
            boolean r12 = r11.f182259e     // Catch:{ IOException -> 0x0168 }
            r8.mo84726o(r12)     // Catch:{ IOException -> 0x0168 }
            java.lang.String r11 = r11.f182257c     // Catch:{ IOException -> 0x0168 }
            r12 = r8
            com.google.android.apps.gsa.shared.speech.hotword.a r12 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r12     // Catch:{ IOException -> 0x0168 }
            r12.f253215e = r11     // Catch:{ IOException -> 0x0168 }
        L_0x0374:
            int r11 = r4.f182264a     // Catch:{ IOException -> 0x0168 }
            r12 = 4
            r11 = r11 & r12
            if (r11 == 0) goto L_0x038f
            com.google.speech.j.ks r4 = r4.f182267d     // Catch:{ IOException -> 0x0168 }
            if (r4 != 0) goto L_0x0380
            com.google.speech.j.ks r4 = com.google.speech.p5218j.C67091ks.f182386h     // Catch:{ IOException -> 0x0168 }
        L_0x0380:
            boolean r11 = r4.f182389b     // Catch:{ IOException -> 0x0168 }
            r8.mo84735x(r11)     // Catch:{ IOException -> 0x0168 }
            float r11 = r4.f182391d     // Catch:{ IOException -> 0x0168 }
            r8.mo84734w(r11)     // Catch:{ IOException -> 0x0168 }
            boolean r4 = r4.f182392e     // Catch:{ IOException -> 0x0168 }
            r8.mo84730s(r4)     // Catch:{ IOException -> 0x0168 }
        L_0x038f:
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r4 = r8.mo84712a()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.api.bh r8 = r7.f265654d     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r11 = r7.f265659i     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r11 = r11.get()     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r11 = (com.google.android.libraries.search.p2904c.C37672hs) r11     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r12 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b.f222115h     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.a r12 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81043a) r12     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.h r6 = r7.mo88872g(r10, r6)     // Catch:{ IOException -> 0x0168 }
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r7 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r7     // Catch:{ IOException -> 0x0168 }
            r6.getClass()     // Catch:{ IOException -> 0x0168 }
            r7.f222119c = r6     // Catch:{ IOException -> 0x0168 }
            r6 = 5
            r7.f222118b = r6     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bv r6 = r12.build()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r6 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r6     // Catch:{ IOException -> 0x0168 }
            r8.h(r3, r11, r4, r6)     // Catch:{ IOException -> 0x0168 }
            goto L_0x03f0
        L_0x03c2:
            com.google.android.apps.gsa.nga.api.bh r4 = r7.f265654d     // Catch:{ IOException -> 0x0168 }
            j$.util.Optional r8 = r7.f265659i     // Catch:{ IOException -> 0x0168 }
            java.lang.Object r8 = r8.get()     // Catch:{ IOException -> 0x0168 }
            com.google.android.libraries.search.c.hs r8 = (com.google.android.libraries.search.p2904c.C37672hs) r8     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r11 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b.f222115h     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.a r11 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81043a) r11     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.h r6 = r7.mo88872g(r10, r6)     // Catch:{ IOException -> 0x0168 }
            r11.copyOnWrite()     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bv r7 = r11.instance     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r7 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r7     // Catch:{ IOException -> 0x0168 }
            r6.getClass()     // Catch:{ IOException -> 0x0168 }
            r7.f222119c = r6     // Catch:{ IOException -> 0x0168 }
            r6 = 5
            r7.f222118b = r6     // Catch:{ IOException -> 0x0168 }
            com.google.protobuf.bv r6 = r11.build()     // Catch:{ IOException -> 0x0168 }
            com.google.android.apps.gsa.nga.shared.f.c.b r6 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r6     // Catch:{ IOException -> 0x0168 }
            r4.i(r3, r8, r6)     // Catch:{ IOException -> 0x0168 }
        L_0x03f0:
            r1 = r2
            r20 = r5
            goto L_0x011b
        L_0x03f5:
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.m r11 = r7.f265652b     // Catch:{ IOException -> 0x05e5 }
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)     // Catch:{ IOException -> 0x05e5 }
            r7.f265658h = r11     // Catch:{ IOException -> 0x05e5 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.m r11 = r7.f265652b     // Catch:{ IOException -> 0x05e5 }
            boolean r14 = r7.f265660j     // Catch:{ IOException -> 0x05e5 }
            com.google.common.f.e r20 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05e5 }
            r21 = r9
            com.google.common.f.x r9 = r20.mo56224b()     // Catch:{ IOException -> 0x05f8 }
            r20 = r5
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r9.mo56378ag(r5, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r5 = "onStartStreaming: samplingRate: %d"
            int r1 = r8.mo88789c()     // Catch:{ IOException -> 0x05f8 }
            r22 = r2
            r2 = 17756(0x455c, float:2.4881E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56387q(r5, r1)     // Catch:{ IOException -> 0x05f8 }
            r11.f265697g = r3     // Catch:{ IOException -> 0x05f8 }
            boolean r1 = r11.f265697g     // Catch:{ IOException -> 0x05f8 }
            if (r1 == 0) goto L_0x0436
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            r2 = 17764(0x4564, float:2.4893E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r13)     // Catch:{ IOException -> 0x05f8 }
        L_0x0433:
            r1 = 0
            goto L_0x0541
        L_0x0436:
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.z r1 = r11.f265695e     // Catch:{ IOException -> 0x05f8 }
            if (r14 == 0) goto L_0x0476
            if (r1 != 0) goto L_0x044f
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Follow-on with unknown params"
            r3 = 17763(0x4563, float:2.4891E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0433
        L_0x044f:
            int r2 = r1.mo88787a()     // Catch:{ IOException -> 0x05f8 }
            int r3 = r8.mo88787a()     // Catch:{ IOException -> 0x05f8 }
            if (r2 != r3) goto L_0x0463
            int r1 = r1.mo88789c()     // Catch:{ IOException -> 0x05f8 }
            int r2 = r8.mo88789c()     // Catch:{ IOException -> 0x05f8 }
            if (r1 == r2) goto L_0x0476
        L_0x0463:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Follow-on with inconsistent params"
            r3 = 17762(0x4562, float:2.489E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0433
        L_0x0476:
            int r1 = r8.mo88787a()     // Catch:{ IOException -> 0x05f8 }
            r2 = 1
            if (r1 == r2) goto L_0x04a3
            int r1 = r8.mo88787a()     // Catch:{ IOException -> 0x05f8 }
            r2 = 2
            if (r1 == r2) goto L_0x04a3
            int r1 = r8.mo88787a()     // Catch:{ IOException -> 0x05f8 }
            r2 = 3
            if (r1 == r2) goto L_0x04a3
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Unsupported audio format"
            r3 = 17761(0x4561, float:2.4888E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x05f8 }
        L_0x049f:
            r11.mo88884e(r1)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0433
        L_0x04a3:
            int r1 = r8.mo88789c()     // Catch:{ IOException -> 0x05f8 }
            r2 = 8000(0x1f40, float:1.121E-41)
            if (r1 < r2) goto L_0x052b
            int r1 = r8.mo88789c()     // Catch:{ IOException -> 0x05f8 }
            r2 = 64000(0xfa00, float:8.9683E-41)
            if (r1 <= r2) goto L_0x04b6
            goto L_0x052b
        L_0x04b6:
            int r1 = r8.mo88788b()     // Catch:{ IOException -> 0x05f8 }
            if (r1 <= 0) goto L_0x0515
            int r1 = r8.mo88788b()     // Catch:{ IOException -> 0x05f8 }
            r2 = 4
            if (r1 <= r2) goto L_0x04c4
            goto L_0x0515
        L_0x04c4:
            int r1 = r8.mo88793f()     // Catch:{ IOException -> 0x05f8 }
            r3 = 3
            if (r1 == r3) goto L_0x04e6
            int r1 = r8.mo88793f()     // Catch:{ IOException -> 0x05f8 }
            if (r1 == r2) goto L_0x04e6
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Unsupported response method"
            r3 = 17760(0x4560, float:2.4887E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x05f8 }
            goto L_0x049f
        L_0x04e6:
            int r1 = r8.mo88794g()     // Catch:{ IOException -> 0x05f8 }
            r2 = 3
            if (r1 == r2) goto L_0x0509
            int r1 = r8.mo88794g()     // Catch:{ IOException -> 0x05f8 }
            r2 = 4
            if (r1 == r2) goto L_0x0509
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Unsupported query mode"
            r3 = 17759(0x455f, float:2.4886E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x05f8 }
            goto L_0x049f
        L_0x0509:
            r11.f265695e = r8     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.d r1 = new com.google.android.apps.gsa.staticplugins.bisto.ac.g.d     // Catch:{ IOException -> 0x05f8 }
            r1.<init>(r11, r8)     // Catch:{ IOException -> 0x05f8 }
            r11.mo88886g(r1)     // Catch:{ IOException -> 0x05f8 }
            r1 = 1
            goto L_0x0541
        L_0x0515:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Bad channel count"
            r3 = 17758(0x455e, float:2.4884E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x05f8 }
            goto L_0x049f
        L_0x052b:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94976m.f265691a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r1.mo56378ag(r2, r4)     // Catch:{ IOException -> 0x05f8 }
            java.lang.String r2 = "Bad sample rate"
            r3 = 17757(0x455d, float:2.4883E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNSUPPORTED_CONFIG     // Catch:{ IOException -> 0x05f8 }
            goto L_0x049f
        L_0x0541:
            boolean r2 = r8.mo88791e()     // Catch:{ IOException -> 0x05f8 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ IOException -> 0x05f8 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ IOException -> 0x05f8 }
            r7.f265661k = r2     // Catch:{ IOException -> 0x05f8 }
            int r2 = r6.f124456d     // Catch:{ IOException -> 0x05f8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x05f8 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ IOException -> 0x05f8 }
            r7.f265662l = r2     // Catch:{ IOException -> 0x05f8 }
            boolean r2 = r7.f265660j     // Catch:{ IOException -> 0x05f8 }
            if (r2 == 0) goto L_0x058e
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ IOException -> 0x05f8 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x05f8 }
            r2.mo56378ag(r3, r15)     // Catch:{ IOException -> 0x05f8 }
            r3 = 17718(0x4536, float:2.4828E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56386p(r12)     // Catch:{ IOException -> 0x05f8 }
            if (r1 != 0) goto L_0x0587
            j$.util.Optional r1 = r7.f265659i     // Catch:{ IOException -> 0x05f8 }
            boolean r1 = r1.isPresent()     // Catch:{ IOException -> 0x05f8 }
            if (r1 == 0) goto L_0x0587
            com.google.android.apps.gsa.nga.api.bh r1 = r7.f265654d     // Catch:{ IOException -> 0x05f8 }
            j$.util.Optional r2 = r7.f265659i     // Catch:{ IOException -> 0x05f8 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x05f8 }
            com.google.android.libraries.search.c.hs r2 = (com.google.android.libraries.search.p2904c.C37672hs) r2     // Catch:{ IOException -> 0x05f8 }
            r1.c(r2)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x058a
        L_0x0587:
            r7.mo88874i()     // Catch:{ IOException -> 0x05f8 }
        L_0x058a:
            r1 = r22
            goto L_0x011d
        L_0x058e:
            if (r1 == 0) goto L_0x0611
            com.google.android.apps.gsa.nga.shared.f.b.c r1 = r7.f265664n     // Catch:{ IOException -> 0x05f8 }
            com.google.android.libraries.search.c.hs r1 = r1.mo74823a()     // Catch:{ IOException -> 0x05f8 }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ IOException -> 0x05f8 }
            r7.f265659i = r1     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.m r1 = r7.f265652b     // Catch:{ IOException -> 0x05f8 }
            r2 = 0
            com.google.android.libraries.search.c.ab.c r1 = r1.mo88881c(r2)     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.api.bh r3 = r7.f265654d     // Catch:{ IOException -> 0x05f8 }
            j$.util.Optional r4 = r7.f265659i     // Catch:{ IOException -> 0x05f8 }
            java.lang.Object r4 = r4.get()     // Catch:{ IOException -> 0x05f8 }
            com.google.android.libraries.search.c.hs r4 = (com.google.android.libraries.search.p2904c.C37672hs) r4     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.shared.f.c.b r5 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b.f222115h     // Catch:{ IOException -> 0x05f8 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.shared.f.c.a r5 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81043a) r5     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.shared.f.c.h r6 = r7.mo88872g(r10, r6)     // Catch:{ IOException -> 0x05f8 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x05f8 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.shared.f.c.b r7 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r7     // Catch:{ IOException -> 0x05f8 }
            r6.getClass()     // Catch:{ IOException -> 0x05f8 }
            r7.f222119c = r6     // Catch:{ IOException -> 0x05f8 }
            r6 = 5
            r7.f222118b = r6     // Catch:{ IOException -> 0x05f8 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.nga.shared.f.c.b r5 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r5     // Catch:{ IOException -> 0x05f8 }
            r3.e(r1, r4, r5)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0612
        L_0x05d2:
            r22 = r2
            r20 = r5
            r21 = r9
            r2 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.v r1 = r14.f265543h     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.z r4 = r11.mo88781a()     // Catch:{ IOException -> 0x05f8 }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r5 = r14.f265545j     // Catch:{ IOException -> 0x05f8 }
            r1.mo88868g(r4, r5, r6, r3)     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0612
        L_0x05e5:
            r0 = move-exception
            goto L_0x05ff
        L_0x05e7:
            r22 = r2
            r20 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r21 = r9
            r2 = 0
            r14.mo88837c()     // Catch:{ IOException -> 0x05f8 }
            goto L_0x0612
        L_0x05f8:
            r0 = move-exception
            r3 = r33
            goto L_0x0656
        L_0x05fc:
            r0 = move-exception
            r17 = r6
        L_0x05ff:
            r3 = r33
            r1 = r0
            r7 = r9
            goto L_0x092a
        L_0x0605:
            r22 = r2
            r20 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r21 = r9
        L_0x0611:
            r2 = 0
        L_0x0612:
            r1 = r22
        L_0x0614:
            int r3 = r1.f124512a     // Catch:{ IOException -> 0x091e }
            r4 = 1
            if (r3 != r4) goto L_0x065b
            r3 = r33
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r4 = r3.f265493k     // Catch:{ IOException -> 0x0655 }
            boolean r5 = r4.f265544i     // Catch:{ IOException -> 0x0655 }
            if (r5 == 0) goto L_0x064f
            dagger.a r4 = r4.f265539d     // Catch:{ IOException -> 0x0655 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ IOException -> 0x0655 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.a r4 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a) r4     // Catch:{ IOException -> 0x0655 }
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x0655 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ IOException -> 0x0655 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0655 }
            r5.mo56378ag(r6, r15)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r6 = "#onStopStreaming"
            r7 = 17739(0x454b, float:2.4858E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ IOException -> 0x0655 }
            j$.util.Optional r5 = r4.f265658h     // Catch:{ IOException -> 0x0655 }
            boolean r5 = r5.isPresent()     // Catch:{ IOException -> 0x0655 }
            if (r5 == 0) goto L_0x065d
            j$.util.Optional r4 = r4.f265658h     // Catch:{ IOException -> 0x0655 }
            java.lang.Object r4 = r4.get()     // Catch:{ IOException -> 0x0655 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.b r4 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94965b) r4     // Catch:{ IOException -> 0x0655 }
            r4.mo88877b()     // Catch:{ IOException -> 0x0655 }
            goto L_0x065d
        L_0x064f:
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.v r4 = r4.f265543h     // Catch:{ IOException -> 0x0655 }
            r4.mo88869h()     // Catch:{ IOException -> 0x0655 }
            goto L_0x065d
        L_0x0655:
            r0 = move-exception
        L_0x0656:
            r1 = r0
            r7 = r21
            goto L_0x092a
        L_0x065b:
            r3 = r33
        L_0x065d:
            int r4 = r1.f124512a     // Catch:{ IOException -> 0x091c }
            r5 = 3
            if (r4 != r5) goto L_0x076a
            java.lang.Object r4 = r1.f124513b     // Catch:{ IOException -> 0x091c }
            com.google.assistant.a.a.ad r4 = (com.google.assistant.p3739a.p3740a.C48043ad) r4     // Catch:{ IOException -> 0x091c }
            com.google.common.f.x r5 = r20.mo56224b()     // Catch:{ IOException -> 0x091c }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091c }
            r7 = r21
            r5.mo56378ag(r6, r7)     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = "handleDeviceInformation"
            r8 = 17555(0x4493, float:2.46E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r6)     // Catch:{ IOException -> 0x091a }
            java.lang.String r5 = r4.f124362b     // Catch:{ IOException -> 0x091a }
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r5 != 0) goto L_0x06a1
            com.google.android.apps.gsa.shared.bisto.a.cd r5 = r3.f265485c     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = r3.f265486d     // Catch:{ IOException -> 0x091a }
            java.lang.String r8 = r4.f124362b     // Catch:{ IOException -> 0x091a }
            r24 = 0
            com.google.android.apps.search.assistant.surfaces.bisto.d.s r25 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s.GENERIC_SCALED     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r26 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.GACS_DEVICE     // Catch:{ IOException -> 0x091a }
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r21 = r5
            r22 = r6
            r23 = r8
            r21.mo83383Y(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ IOException -> 0x091a }
        L_0x06a1:
            java.lang.String r5 = r4.f124361a     // Catch:{ IOException -> 0x091a }
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r5 != 0) goto L_0x06b2
            com.google.android.apps.gsa.shared.bisto.a.cd r5 = r3.f265485c     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = r3.f265486d     // Catch:{ IOException -> 0x091a }
            java.lang.String r8 = r4.f124361a     // Catch:{ IOException -> 0x091a }
            r5.mo83385aa(r6, r8)     // Catch:{ IOException -> 0x091a }
        L_0x06b2:
            boolean r5 = r4.f124363c     // Catch:{ IOException -> 0x091a }
            if (r5 != 0) goto L_0x06cd
            com.google.common.f.x r5 = r20.mo56224b()     // Catch:{ IOException -> 0x091a }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091a }
            r5.mo56378ag(r6, r7)     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = "GA disabled on device"
            r8 = 17557(0x4495, float:2.4603E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r6)     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.a r5 = r3.f265489g     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = r3.f265486d     // Catch:{ IOException -> 0x091a }
            r5.mo88843a(r6)     // Catch:{ IOException -> 0x091a }
        L_0x06cd:
            com.google.assistant.a.a.b r4 = r4.f124364d     // Catch:{ IOException -> 0x091a }
            if (r4 != 0) goto L_0x06d3
            com.google.assistant.a.a.b r4 = com.google.assistant.p3739a.p3740a.C48066b.f124401d     // Catch:{ IOException -> 0x091a }
        L_0x06d3:
            java.lang.String r5 = r4.f124405c     // Catch:{ IOException -> 0x091a }
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r5 != 0) goto L_0x076c
            int r5 = r4.f124403a     // Catch:{ IOException -> 0x091a }
            java.lang.String r6 = ""
            r8 = 2
            if (r5 != r8) goto L_0x06e7
            java.lang.Object r5 = r4.f124404b     // Catch:{ IOException -> 0x091a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x091a }
            goto L_0x06e8
        L_0x06e7:
            r5 = r6
        L_0x06e8:
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r5 == 0) goto L_0x06ff
            int r5 = r4.f124403a     // Catch:{ IOException -> 0x091a }
            r8 = 3
            if (r5 != r8) goto L_0x06f8
            java.lang.Object r5 = r4.f124404b     // Catch:{ IOException -> 0x091a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x091a }
            goto L_0x06f9
        L_0x06f8:
            r5 = r6
        L_0x06f9:
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r5 != 0) goto L_0x076c
        L_0x06ff:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r5 = r33.mo88799a()     // Catch:{ IOException -> 0x091a }
            if (r5 == 0) goto L_0x076c
            java.lang.String r8 = r4.f124405c     // Catch:{ IOException -> 0x091a }
            int r9 = r4.f124403a     // Catch:{ IOException -> 0x091a }
            r10 = 3
            if (r9 != r10) goto L_0x0711
            java.lang.Object r9 = r4.f124404b     // Catch:{ IOException -> 0x091a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x091a }
            goto L_0x0712
        L_0x0711:
            r9 = r6
        L_0x0712:
            boolean r9 = r9.isEmpty()     // Catch:{ IOException -> 0x091a }
            if (r9 != 0) goto L_0x0723
            int r9 = r4.f124403a     // Catch:{ IOException -> 0x091a }
            r10 = 3
            if (r9 != r10) goto L_0x072d
            java.lang.Object r4 = r4.f124404b     // Catch:{ IOException -> 0x091a }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x091a }
            goto L_0x072d
        L_0x0723:
            int r9 = r4.f124403a     // Catch:{ IOException -> 0x091a }
            r10 = 2
            if (r9 != r10) goto L_0x072d
            java.lang.Object r4 = r4.f124404b     // Catch:{ IOException -> 0x091a }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x091a }
        L_0x072d:
            com.google.android.apps.search.assistant.surfaces.bisto.d.am r4 = r5.mo106518p(r8)     // Catch:{ IOException -> 0x091a }
            java.lang.String r4 = r4.f343764b     // Catch:{ IOException -> 0x091a }
            boolean r4 = r6.equals(r4)     // Catch:{ IOException -> 0x091a }
            if (r4 != 0) goto L_0x075f
            com.google.common.f.x r4 = r20.mo56224b()     // Catch:{ IOException -> 0x091a }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091a }
            r4.mo56378ag(r9, r7)     // Catch:{ IOException -> 0x091a }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x091a }
            r9 = 17551(0x448f, float:2.4594E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r9)     // Catch:{ IOException -> 0x091a }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x091a }
            java.lang.String r9 = "Device ID/DUSI Updated %s %s"
            java.lang.String r10 = r3.f265486d     // Catch:{ IOException -> 0x091a }
            r4.mo56354G(r9, r10, r6)     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.shared.bisto.a.cd r4 = r3.f265485c     // Catch:{ IOException -> 0x091a }
            java.lang.String r9 = r3.f265486d     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.h r10 = new com.google.android.apps.gsa.staticplugins.bisto.ac.b.h     // Catch:{ IOException -> 0x091a }
            r10.<init>(r6)     // Catch:{ IOException -> 0x091a }
            r4.mo83380V(r9, r8, r10)     // Catch:{ IOException -> 0x091a }
        L_0x075f:
            java.util.concurrent.Executor r4 = r3.f265496n     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.i r6 = new com.google.android.apps.gsa.staticplugins.bisto.ac.b.i     // Catch:{ IOException -> 0x091a }
            r6.<init>(r3, r5)     // Catch:{ IOException -> 0x091a }
            r4.execute(r6)     // Catch:{ IOException -> 0x091a }
            goto L_0x076c
        L_0x076a:
            r7 = r21
        L_0x076c:
            int r4 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r5 = 2
            if (r4 != r5) goto L_0x0776
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r4 = r3.f265493k     // Catch:{ IOException -> 0x091a }
            r4.mo88836b()     // Catch:{ IOException -> 0x091a }
        L_0x0776:
            int r4 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r5 = 5
            if (r4 != r5) goto L_0x088f
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r4 = r3.f265493k     // Catch:{ IOException -> 0x091a }
            java.lang.Object r5 = r1.f124513b     // Catch:{ IOException -> 0x091a }
            com.google.assistant.a.a.bf r5 = (com.google.assistant.p3739a.p3740a.C48072bf) r5     // Catch:{ IOException -> 0x091a }
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94926x.f265536a     // Catch:{ IOException -> 0x091a }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ IOException -> 0x091a }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091a }
            r9 = r19
            r6.mo56378ag(r8, r9)     // Catch:{ IOException -> 0x091a }
            java.lang.String r8 = "onIssueQuery"
            r9 = 17610(0x44ca, float:2.4677E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r8)     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r6 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            if (r6 == 0) goto L_0x07a3
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r6 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r6 = r6.mo106521s()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb.OPA_ENABLED     // Catch:{ IOException -> 0x091a }
            if (r6 == r8) goto L_0x07a8
        L_0x07a3:
            r4.mo88837c()     // Catch:{ IOException -> 0x091a }
            goto L_0x088f
        L_0x07a8:
            com.google.assistant.a.a.bx r6 = r5.f124415a     // Catch:{ IOException -> 0x091a }
            if (r6 != 0) goto L_0x07ae
            com.google.assistant.a.a.bx r6 = com.google.assistant.p3739a.p3740a.C48090bx.f124451f     // Catch:{ IOException -> 0x091a }
        L_0x07ae:
            java.lang.String r5 = r5.f124416b     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r8 = r4.f265541f     // Catch:{ IOException -> 0x091a }
            boolean r8 = r8.isPresent()     // Catch:{ IOException -> 0x091a }
            if (r8 == 0) goto L_0x07de
            j$.util.Optional r8 = r4.f265541f     // Catch:{ IOException -> 0x091a }
            java.lang.Object r8 = r8.get()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.m.d r8 = (com.google.android.apps.gsa.nga.shared.p6356m.C81428d) r8     // Catch:{ IOException -> 0x091a }
            boolean r8 = r8.mo75077d()     // Catch:{ IOException -> 0x091a }
            if (r8 == 0) goto L_0x07de
            com.google.android.apps.gsa.shared.bisto.k r8 = r4.f265537b     // Catch:{ IOException -> 0x091a }
            r9 = 122(0x7a, float:1.71E-43)
            boolean r8 = r8.mo83555j(r9)     // Catch:{ IOException -> 0x091a }
            if (r8 != 0) goto L_0x07dc
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r8 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            if (r8 == 0) goto L_0x07de
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r8 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            boolean r8 = r8.mo106497ak()     // Catch:{ IOException -> 0x091a }
            if (r8 != 0) goto L_0x07de
        L_0x07dc:
            r12 = 1
            goto L_0x07df
        L_0x07de:
            r12 = 0
        L_0x07df:
            r4.f265544i = r12     // Catch:{ IOException -> 0x091a }
            boolean r2 = r4.f265544i     // Catch:{ IOException -> 0x091a }
            if (r2 == 0) goto L_0x0888
            dagger.a r2 = r4.f265539d     // Catch:{ IOException -> 0x091a }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.a r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a) r2     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r4 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a.f265651a     // Catch:{ IOException -> 0x091a }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ IOException -> 0x091a }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091a }
            r8.mo56378ag(r9, r15)     // Catch:{ IOException -> 0x091a }
            java.lang.String r9 = "#onWatchSuggestionQuery"
            r10 = 17740(0x454c, float:2.4859E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.b.c r8 = r2.f265664n     // Catch:{ IOException -> 0x091a }
            com.google.android.libraries.search.c.hs r8 = r8.mo74823a()     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ IOException -> 0x091a }
            r2.f265659i = r8     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r8 = r2.f265659i     // Catch:{ IOException -> 0x091a }
            r8.get()     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r8 = p3186j$.util.Optional.empty()     // Catch:{ IOException -> 0x091a }
            r2.f265661k = r8     // Catch:{ IOException -> 0x091a }
            int r8 = r6.f124456d     // Catch:{ IOException -> 0x091a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ IOException -> 0x091a }
            r2.f265662l = r8     // Catch:{ IOException -> 0x091a }
            r8 = 1
            r2.f265663m = r8     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.api.ce r8 = r2.f265655e     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r9 = r2.f265659i     // Catch:{ IOException -> 0x091a }
            java.lang.Object r9 = r9.get()     // Catch:{ IOException -> 0x091a }
            com.google.android.libraries.search.c.hs r9 = (com.google.android.libraries.search.p2904c.C37672hs) r9     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.b r10 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b.f222115h     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.a r10 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81043a) r10     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.h r2 = r2.mo88872g(r4, r6)     // Catch:{ IOException -> 0x091a }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bv r4 = r10.instance     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.b r4 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r4     // Catch:{ IOException -> 0x091a }
            r2.getClass()     // Catch:{ IOException -> 0x091a }
            r4.f222119c = r2     // Catch:{ IOException -> 0x091a }
            r2 = 5
            r4.f222118b = r2     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.p r2 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81058p.f222170c     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.o r2 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81057o) r2     // Catch:{ IOException -> 0x091a }
            r2.copyOnWrite()     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.p r4 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81058p) r4     // Catch:{ IOException -> 0x091a }
            r5.getClass()     // Catch:{ IOException -> 0x091a }
            int r6 = r4.f222172a     // Catch:{ IOException -> 0x091a }
            r11 = 1
            r6 = r6 | r11
            r4.f222172a = r6     // Catch:{ IOException -> 0x091a }
            r4.f222173b = r5     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.p r2 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81058p) r2     // Catch:{ IOException -> 0x091a }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bv r4 = r10.instance     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.b r4 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r4     // Catch:{ IOException -> 0x091a }
            r2.getClass()     // Catch:{ IOException -> 0x091a }
            r4.f222123g = r2     // Catch:{ IOException -> 0x091a }
            int r2 = r4.f222117a     // Catch:{ IOException -> 0x091a }
            r2 = r2 | 32
            r4.f222117a = r2     // Catch:{ IOException -> 0x091a }
            com.google.protobuf.bv r2 = r10.build()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.shared.f.c.b r2 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b) r2     // Catch:{ IOException -> 0x091a }
            r8.mo71100a(r9, r2)     // Catch:{ IOException -> 0x091a }
            goto L_0x088f
        L_0x0888:
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.h r2 = r4.f265542g     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r4 = r4.f265545j     // Catch:{ IOException -> 0x091a }
            r2.mo88855a(r5, r4, r6)     // Catch:{ IOException -> 0x091a }
        L_0x088f:
            int r2 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r4 = 6
            if (r2 != r4) goto L_0x089d
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.o r2 = r3.f265492j     // Catch:{ IOException -> 0x091a }
            java.lang.Object r4 = r1.f124513b     // Catch:{ IOException -> 0x091a }
            com.google.assistant.a.a.ck r4 = (com.google.assistant.p3739a.p3740a.C48104ck) r4     // Catch:{ IOException -> 0x091a }
            r2.mo88824o(r4)     // Catch:{ IOException -> 0x091a }
        L_0x089d:
            int r2 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r4 = 7
            if (r2 != r4) goto L_0x08a5
            r33.m156646k()     // Catch:{ IOException -> 0x091a }
        L_0x08a5:
            int r2 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r4 = 8
            if (r2 != r4) goto L_0x08d7
            if (r18 == 0) goto L_0x08d7
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r2 = r18.mo106521s()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb.OPA_ENABLED     // Catch:{ IOException -> 0x091a }
            if (r2 != r4) goto L_0x08bf
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r2 = r33.mo88799a()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.c r4 = r3.f265484b     // Catch:{ IOException -> 0x091a }
            r4.mo88779a(r2)     // Catch:{ IOException -> 0x091a }
            goto L_0x08d7
        L_0x08bf:
            com.google.common.f.x r2 = r20.mo56224b()     // Catch:{ IOException -> 0x091a }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x091a }
            r2.mo56378ag(r4, r7)     // Catch:{ IOException -> 0x091a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ IOException -> 0x091a }
            r4 = 17554(0x4492, float:2.4598E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ IOException -> 0x091a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ IOException -> 0x091a }
            java.lang.String r4 = "Ignore accountInfo request."
            r2.mo56386p(r4)     // Catch:{ IOException -> 0x091a }
        L_0x08d7:
            int r2 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r4 = 9
            if (r2 != r4) goto L_0x08e4
            java.lang.Object r2 = r1.f124513b     // Catch:{ IOException -> 0x091a }
            com.google.assistant.a.a.av r2 = (com.google.assistant.p3739a.p3740a.C48061av) r2     // Catch:{ IOException -> 0x091a }
            r3.m156647l(r2)     // Catch:{ IOException -> 0x091a }
        L_0x08e4:
            int r2 = r1.f124512a     // Catch:{ IOException -> 0x091a }
            r4 = 11
            if (r2 != r4) goto L_0x0919
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.x r2 = r3.f265493k     // Catch:{ IOException -> 0x091a }
            java.lang.Object r1 = r1.f124513b     // Catch:{ IOException -> 0x091a }
            com.google.speech.j.ko r1 = (com.google.speech.p5218j.C67087ko) r1     // Catch:{ IOException -> 0x091a }
            dagger.a r2 = r2.f265540e     // Catch:{ IOException -> 0x091a }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.staticplugins.bisto.ac.g.c r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94966c) r2     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r4 = r2.f265675d     // Catch:{ IOException -> 0x091a }
            boolean r4 = r4.isPresent()     // Catch:{ IOException -> 0x091a }
            if (r4 == 0) goto L_0x090e
            com.google.android.apps.gsa.nga.api.b.b r4 = r2.f265673b     // Catch:{ IOException -> 0x091a }
            j$.util.Optional r2 = r2.f265675d     // Catch:{ IOException -> 0x091a }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x091a }
            com.google.android.apps.gsa.nga.api.a.cf r2 = (com.google.android.apps.gsa.nga.api.a.cf) r2     // Catch:{ IOException -> 0x091a }
            r4.d(r2, r1)     // Catch:{ IOException -> 0x091a }
            return
        L_0x090e:
            boolean r1 = r2.f265676e     // Catch:{ IOException -> 0x091a }
            if (r1 != 0) goto L_0x0919
            com.google.android.apps.gsa.staticplugins.bisto.ac.h.y r1 = r2.f265674c     // Catch:{ IOException -> 0x091a }
            com.google.assistant.a.a.ce r2 = com.google.assistant.p3739a.p3740a.C48098ce.UNEXPECTED_SODA_EVENT     // Catch:{ IOException -> 0x091a }
            r1.mo88812c(r2)     // Catch:{ IOException -> 0x091a }
        L_0x0919:
            return
        L_0x091a:
            r0 = move-exception
            goto L_0x0929
        L_0x091c:
            r0 = move-exception
            goto L_0x0921
        L_0x091e:
            r0 = move-exception
            r3 = r33
        L_0x0921:
            r7 = r21
            goto L_0x0929
        L_0x0924:
            r0 = move-exception
            r3 = r1
            r17 = r6
        L_0x0928:
            r7 = r9
        L_0x0929:
            r1 = r0
        L_0x092a:
            com.google.common.f.e r2 = f265483a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r7)
            r4 = 17553(0x4491, float:2.4597E-41)
            r5 = r17
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94914l.mo88800b(com.google.android.apps.gsa.staticplugins.bisto.ac.d.d, byte[]):void");
    }

    /* renamed from: c */
    public final void mo88801c() {
        C59071e eVar = f265483a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17565)).mo56386p("onConnected");
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(17566)).mo56386p("Requesting device params");
        C48051al alVar = C48051al.f124374a;
        C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
        ayVar.copyOnWrite();
        C48065az azVar = (C48065az) ayVar.instance;
        alVar.getClass();
        azVar.f124400b = alVar;
        azVar.f124399a = 1;
        mo88808j((C48065az) ayVar.build());
        m156648m(false);
        this.f265485c.mo83384Z(this.f265486d, C124715m.FULLY_CONNECTED);
        mo88807i(false);
        C94909g gVar = new C94909g(this);
        this.f265488f = gVar;
        this.f265487e.mo83463i(gVar);
        C94964a aVar = this.f265494l;
        aVar.f265657g.mo88892d(aVar, false);
        if (aVar.f265656f.isPresent()) {
            ((C74724cb) aVar.f265656f.get()).mo71098a(aVar);
        }
    }

    /* renamed from: d */
    public final void mo88802d() {
        this.f265487e.mo89374C();
        this.f265485c.mo83384Z(this.f265486d, C124715m.NOT_CONNECTED);
        C89605ac acVar = this.f265488f;
        if (acVar != null) {
            this.f265487e.mo83475u(acVar);
            this.f265488f = null;
        }
        C94964a aVar = this.f265494l;
        C59104x b = C94964a.f265651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsDialogHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17717)).mo56386p("cleanUp");
        aVar.mo88873h();
        aVar.f265657g.mo88893e(aVar);
        if (aVar.f265656f.isPresent()) {
            ((C74724cb) aVar.f265656f.get()).mo71099b(aVar);
        }
    }

    /* renamed from: e */
    public final void mo88803e() {
        m156648m(true);
    }

    /* renamed from: f */
    public final void mo88804f() {
        this.f265493k.mo88836b();
    }

    /* renamed from: g */
    public final void mo88805g(Account account) {
        C94905c cVar = this.f265484b;
        C124548d a = mo88799a();
        C59104x b = C94905c.f265453a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAccountInfoHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17546)).mo56386p("handleGetAccountInfo");
        if (a != null && a.mo106484Y()) {
            cVar.mo88780b(account, a);
        }
    }

    /* renamed from: h */
    public final void mo88806h(C48128y yVar, String str) {
        C48127x xVar = (C48127x) C48129z.f124560c.createBuilder();
        xVar.copyOnWrite();
        ((C48129z) xVar.instance).f124562a = yVar.getNumber();
        if (str != null) {
            xVar.copyOnWrite();
            ((C48129z) xVar.instance).f124563b = str;
        }
        C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
        ayVar.copyOnWrite();
        C48065az azVar = (C48065az) ayVar.instance;
        C48129z zVar = (C48129z) xVar.build();
        zVar.getClass();
        azVar.f124400b = zVar;
        azVar.f124399a = 3;
        mo88808j((C48065az) ayVar.build());
    }

    /* renamed from: i */
    public final void mo88807i(boolean z) {
        C60870cx n = this.f265485c.mo83408n(this.f265486d);
        C60870cx b = this.f265497o.mo37974b();
        C60856cj.m92895d(n, b).mo57336c(new C94908f(this, n, b, z), this.f265496n);
    }

    /* renamed from: j */
    public final synchronized void mo88808j(C48065az azVar) {
        this.f265498p.mo88663s(C94936d.CONTROL_OUTPUT, azVar.toByteArray());
    }
}
