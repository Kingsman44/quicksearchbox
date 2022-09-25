package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.net.URISyntaxException;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.j */
/* compiled from: PG */
public final class C77333j implements C76591c {

    /* renamed from: e */
    private static final C58974d f213266e = C58974d.m91136j();

    /* renamed from: a */
    public final af f213267a;

    /* renamed from: b */
    public final al f213268b;

    /* renamed from: c */
    public final bz f213269c;

    /* renamed from: d */
    public final Set f213270d;

    /* renamed from: f */
    private final Context f213271f;

    /* renamed from: g */
    private final C22871g f213272g;

    /* renamed from: h */
    private final C22871g f213273h;

    /* renamed from: i */
    private final C32160b f213274i;

    /* renamed from: j */
    private final C77338o f213275j;

    /* renamed from: k */
    private final C77335l f213276k;

    public C77333j(Context context, C22871g gVar, C22871g gVar2, C32160b bVar, af afVar, al alVar, bz bzVar, C77338o oVar, Set set, C77335l lVar) {
        this.f213271f = context;
        this.f213272g = gVar;
        this.f213273h = gVar2;
        this.f213274i = bVar;
        this.f213267a = afVar;
        this.f213268b = alVar;
        this.f213269c = bzVar;
        this.f213275j = oVar;
        this.f213270d = set;
        this.f213276k = lVar;
    }

    /* renamed from: c */
    private final Optional m124101c(String str, String str2, C79326x xVar) {
        if (str.isEmpty()) {
            xVar.mo73900a(String.format("ABORT - Template is empty", new Object[]{str}));
            return Optional.empty();
        }
        String replace = str.replace("$query", Uri.encode(str2));
        try {
            xVar.mo73900a(String.format("OK - %s", new Object[]{replace}));
            Intent parseUri = Intent.parseUri(replace, 1);
            if (parseUri.resolveActivity(this.f213271f.getPackageManager()) == null) {
                xVar.mo73900a(String.format("Package did not accept generated template: %s.", new Object[]{parseUri.toUri(1)}));
                return Optional.empty();
            }
            xVar.mo73900a("Generated intent from template.");
            return Optional.m71637of(parseUri);
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) f213266e.mo56226d()).mo56372aa(3872)).mo56389s("Failed to parse generated search intent: %s.", replace);
            xVar.mo73900a(String.format("ABORT - Failed to parse generated search intent: %s", new Object[]{e.getMessage()}));
            return Optional.empty();
        }
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220559c = true;
        h.mo72245d((C80379i) hVar.build());
        h.mo72246e(Optional.m71637of(C82831ca.FIND_ON_APP));
        h.mo72244c(C58485gu.m89847o("FindOnApp", "Install_app"));
        ((C76541a) h).f211766c = 10805;
        return h.mo72276f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0314, code lost:
        if (r3.isPresent() != false) goto L_0x042e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo71712b(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r17, com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n r18) {
        /*
            r16 = this;
            r7 = r16
            r6 = r17
            r3 = r18
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.x
            com.google.common.f.a.d r1 = f213266e
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            r0.<init>(r1)
            java.lang.String r1 = "\nFindOnAppFulfiller"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r2 = r0.mo73900a(r1)
            java.lang.String r0 = "Input FunctionCall"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r2.mo73900a(r0)
            com.google.knowledge.a.a.n r1 = r6.f211837a
            java.lang.String r1 = r1.toString()
            r0.mo73900a(r1)
            com.google.android.apps.gsa.nga.engine.understanding.v r0 = r6.f211838b
            java.lang.String r1 = "FindOnApp"
            boolean r0 = r0.mo73901d(r1)
            java.lang.String r4 = "android.intent.action.VIEW"
            r5 = 3
            java.lang.String r8 = "query"
            java.lang.String r9 = ""
            r10 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0126
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.String r12 = "translateQuery"
            r0[r10] = r12
            com.google.android.apps.gsa.nga.engine.o.c.ah r12 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r0 = r6.mo72265g(r12, r0)
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0126
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.String r1 = "sourceLanguage"
            r0[r10] = r1
            com.google.android.apps.gsa.nga.engine.o.c.ah r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r0 = r6.mo72265g(r1, r0)
            java.lang.Object r0 = r0.orElse(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r12 = "targetLanguage"
            r1[r10] = r12
            com.google.android.apps.gsa.nga.engine.o.c.ah r12 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r1 = r6.mo72265g(r12, r1)
            java.lang.Object r1 = r1.orElse(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r12 = new java.lang.String[r11]
            r12[r10] = r8
            com.google.android.apps.gsa.nga.engine.o.c.ah r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r8 = r6.mo72265g(r8, r12)
            java.lang.Object r8 = r8.orElse(r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r10] = r0
            r5[r11] = r1
            r10 = 2
            r5[r10] = r8
            java.lang.String r10 = "Creating translate intent in find on app fulfiller: %s %s [%s]."
            java.lang.String r5 = java.lang.String.format(r10, r5)
            r2.mo73900a(r5)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x00a0
            java.lang.String r0 = "Abort - query is empty"
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            goto L_0x0125
        L_0x00a0:
            com.google.android.apps.gsa.nga.engine.ag.af r5 = r7.f213267a
            java.lang.String r10 = "com.google.android.apps.translate"
            boolean r5 = r5.r(r10)
            if (r5 != 0) goto L_0x00b2
            java.lang.String r0 = "Abort - translate app is not installed"
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            goto L_0x0125
        L_0x00b2:
            com.google.android.libraries.gsa.k.g r5 = r7.f213272g
            boolean r11 = r0.isEmpty()
            java.lang.String r12 = "&"
            if (r11 != 0) goto L_0x00ce
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "sl="
            r11.<init>(r13)
            r11.append(r0)
            r11.append(r12)
            java.lang.String r0 = r11.toString()
            goto L_0x00cf
        L_0x00ce:
            r0 = r9
        L_0x00cf:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x00e6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "tl="
            r9.<init>(r11)
            r9.append(r1)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
        L_0x00e6:
            android.content.Intent r1 = new android.content.Intent
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "googletranslate:///open?"
            r11.<init>(r12)
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "q="
            r11.append(r0)
            r11.append(r8)
            java.lang.String r0 = r11.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.<init>(r4, r0)
            android.content.Intent r0 = r1.setPackage(r10)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            android.content.Intent r0 = r0.addFlags(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            com.google.android.apps.gsa.nga.engine.o.e.g.e r1 = new com.google.android.apps.gsa.nga.engine.o.e.g.e
            r1.<init>(r7, r2, r3, r6)
            java.lang.String r2 = "[NGA] FindOnAppFulfiller.fulfill (for translate)"
            com.google.common.util.concurrent.cx r0 = r5.mo28209i(r0, r2, r1)
        L_0x0125:
            return r0
        L_0x0126:
            com.google.android.apps.gsa.nga.engine.understanding.v r0 = r6.f211838b
            boolean r0 = r0.mo73901d(r1)
            java.lang.String r1 = "app"
            if (r0 == 0) goto L_0x0161
            java.lang.String[] r0 = new java.lang.String[r11]
            r0[r10] = r1
            com.google.android.apps.gsa.nga.engine.o.c.ai r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai.f211802a
            j$.util.Optional r0 = r6.mo72265g(r1, r0)
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x0148
            java.lang.String r0 = "Abort - App argument not found."
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        L_0x0148:
            java.lang.Object r0 = r0.get()
            com.google.protos.as.a.d r0 = (com.google.protos.p4883as.p4884a.C63775d) r0
            java.lang.String r0 = r0.f172523d
            java.lang.String[] r1 = new java.lang.String[r11]
            r1[r10] = r8
            com.google.android.apps.gsa.nga.engine.o.c.ah r12 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r1 = r6.mo72265g(r12, r1)
            java.lang.Object r1 = r1.orElse(r9)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0194
        L_0x0161:
            com.google.android.apps.gsa.nga.engine.understanding.v r0 = r6.f211838b
            java.lang.String r12 = "Install_app"
            boolean r0 = r0.mo73901d(r12)
            if (r0 == 0) goto L_0x044b
            java.lang.String[] r0 = new java.lang.String[r11]
            r0[r10] = r1
            com.google.android.apps.gsa.nga.engine.o.c.ai r12 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai.f211802a
            j$.util.Optional r0 = r6.mo72265g(r12, r0)
            com.google.android.apps.gsa.nga.engine.o.e.g.b r12 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77325b.f213251a
            j$.util.Optional r0 = r0.map(r12)
            java.lang.String[] r12 = new java.lang.String[r11]
            r12[r10] = r1
            com.google.android.apps.gsa.nga.engine.o.c.ah r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r1 = r6.mo72265g(r1, r12)
            java.lang.Object r1 = r1.orElse(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.orElse(r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "com.android.vending"
        L_0x0194:
            r9 = r0
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01a3
            java.lang.String r0 = "Abort - package is not specified"
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        L_0x01a3:
            java.lang.String r0 = "Package is specified: "
            java.lang.String r12 = java.lang.String.valueOf(r9)
            java.lang.String r0 = r0.concat(r12)
            r2.mo73900a(r0)
            com.google.android.apps.gsa.nga.engine.ag.af r0 = r7.f213267a
            boolean r0 = r0.r(r9)
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = "Abort - package is not installed"
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        L_0x01c0:
            java.lang.String r0 = "Package is installed"
            r2.mo73900a(r0)
            com.google.android.apps.gsa.nga.engine.o.e.g.o r0 = r7.f213275j
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r12 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.x
            com.google.common.f.a.d r13 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77338o.f213287a
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r13)
            r12.<init>(r13)
            java.lang.String r13 = "FulfillmentBlacklistHandler"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r12 = r12.mo73900a(r13)
            com.google.android.apps.gsa.shared.util.v.g r13 = r0.f213288b
            com.google.android.apps.gsa.shared.m.h r14 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251720oD
            java.lang.String r13 = r13.mo85403h(r14)
            com.google.common.b.hd r13 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77338o.m124110b(r13)
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r10] = r13
            java.lang.String r15 = "FindOnApp blacklist: %s."
            java.lang.String r14 = java.lang.String.format(r15, r14)
            r12.mo73900a(r14)
            java.lang.Object r12 = r13.get(r9)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x01fa
            goto L_0x0214
        L_0x01fa:
            int r0 = r0.mo72523a()
            boolean r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77338o.m124111c(r12, r0)
            if (r0 == 0) goto L_0x0214
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r9
            java.lang.String r1 = "Abort - App [%s] is blacklisted."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        L_0x0214:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0222
            java.lang.String r0 = "Abort - Query to search for in the app is empty. Should not happen."
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        L_0x0222:
            java.lang.String r0 = "Query to search for: "
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r10)
            r2.mo73900a(r0)
            com.google.android.apps.gsa.nga.engine.o.e.g.l r0 = r7.f213276k
            com.google.android.apps.gsa.shared.util.v.g r10 = r0.f213279c
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251482je
            boolean r10 = r10.mo85405j(r12)
            if (r10 != 0) goto L_0x0241
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x023f:
            r5 = r0
            goto L_0x02a3
        L_0x0241:
            com.google.android.apps.gsa.nga.engine.o.e.a.e r10 = r0.f213277a
            j$.util.Optional r10 = r10.mo72327a(r9, r3)
            r12 = 0
            java.lang.Object r10 = r10.orElse(r12)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.apps.gsa.nga.engine.c.b r12 = r0.f213278b
            com.google.protobuf.ga r13 = com.google.protobuf.C63063ga.f170179c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.protobuf.fy r13 = (com.google.protobuf.C63060fy) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.protobuf.ga r14 = (com.google.protobuf.C63063ga) r14
            r1.getClass()
            r14.f170181a = r5
            r14.f170182b = r1
            com.google.protobuf.bv r13 = r13.build()
            com.google.protobuf.ga r13 = (com.google.protobuf.C63063ga) r13
            java.lang.String r14 = "thing.name"
            com.google.common.b.hd r13 = com.google.common.p4522b.C58495hd.m89900n(r14, r13)
            java.lang.String r14 = "actions.intent.GET_THING"
            j$.util.Optional r10 = r12.a(r9, r14, r13, r10)
            boolean r12 = r10.isPresent()
            if (r12 != 0) goto L_0x0283
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x023f
        L_0x0283:
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.appactions.a.h r10 = (com.google.android.libraries.appactions.p11035a.C147840h) r10
            int r12 = r10.mo124509d()
            if (r12 == r5) goto L_0x0294
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x023f
        L_0x0294:
            com.google.android.apps.gsa.nga.engine.o.e.a.e r0 = r0.f213277a
            java.lang.String r5 = r10.mo124506a()
            boolean r10 = r10.mo124508c()
            j$.util.Optional r0 = r0.mo72328b(r5, r9, r10, r11)
            goto L_0x023f
        L_0x02a3:
            boolean r0 = r5.isPresent()
            if (r0 == 0) goto L_0x02b0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
        L_0x02ad:
            r8 = r0
            goto L_0x0434
        L_0x02b0:
            java.lang.String r0 = "com.google.android.gm"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = "\nGmail search"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r2.mo73900a(r0)
            com.google.android.libraries.gsa.k.g r4 = r7.f213273h
            com.google.android.libraries.search.a.b r8 = r7.f213274i
            com.google.common.util.concurrent.cx r8 = r8.mo37974b()
            com.google.android.apps.gsa.nga.engine.o.e.g.d r10 = new com.google.android.apps.gsa.nga.engine.o.e.g.d
            r10.<init>(r0, r1)
            java.lang.String r0 = "[NGA] AppQueryFulfiller.completeGmailSearchIntent.getPrimaryAccountName"
            com.google.common.util.concurrent.cx r0 = r4.mo28209i(r8, r0, r10)
            goto L_0x02ad
        L_0x02d2:
            com.google.android.apps.gsa.nga.engine.au.al r0 = r7.f213268b
            com.google.android.apps.gsa.nga.engine.au.ak r0 = r0.a()
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            j$.util.Optional r0 = r0.b(r9, r10)
            boolean r10 = r0.isPresent()
            java.lang.String r11 = "Search query is transformed to an action.SEARCH intent"
            java.lang.String r12 = "com.google.android.gms.actions.SEARCH_ACTION"
            java.lang.String r13 = "Package does not support action.SEARCH."
            java.lang.String r14 = "android.intent.action.SEARCH"
            if (r10 == 0) goto L_0x03cb
            java.lang.Object r0 = r0.get()
            a.d.a.a.n r0 = (p001a.p014d.p015a.p016a.C0069n) r0
            java.lang.String r10 = "Try to create search intent."
            r2.mo73900a(r10)
            com.google.protobuf.cj r10 = new com.google.protobuf.cj
            com.google.protobuf.ch r15 = r0.f193c
            com.google.protobuf.ci r3 = p001a.p014d.p015a.p016a.C0069n.f188d
            r10.<init>(r15, r3)
            a.d.a.a.l r3 = p001a.p014d.p015a.p016a.C0067l.SEARCH_INTENT_TEMPLATE
            boolean r3 = r10.contains(r3)
            if (r3 == 0) goto L_0x0318
            java.lang.String r3 = r0.f195f
            j$.util.Optional r3 = r7.m124101c(r3, r1, r2)
            boolean r10 = r3.isPresent()
            if (r10 == 0) goto L_0x0318
            goto L_0x042e
        L_0x0318:
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r10 = r0.f193c
            com.google.protobuf.ci r15 = p001a.p014d.p015a.p016a.C0069n.f188d
            r3.<init>(r10, r15)
            a.d.a.a.l r10 = p001a.p014d.p015a.p016a.C0067l.VIEW_ACTION_WITH_URL_INTENT
            boolean r3 = r3.contains(r10)
            if (r3 == 0) goto L_0x0345
            com.google.protos.at.a.a.p r3 = r0.f194e
            if (r3 == 0) goto L_0x0345
            java.lang.String r1 = com.google.android.apps.gsa.nga.engine.au.ce.a(r1, r3)
            android.content.Intent r3 = new android.content.Intent
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r3.<init>(r4, r1)
            java.lang.String r0 = r0.f191a
            r3.setPackage(r0)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x042e
        L_0x0345:
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r0.f193c
            com.google.protobuf.ci r10 = p001a.p014d.p015a.p016a.C0069n.f188d
            r3.<init>(r4, r10)
            a.d.a.a.l r4 = p001a.p014d.p015a.p016a.C0067l.SEARCH_INTENT
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0384
            r2.mo73900a(r11)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r14)
            android.content.Intent r3 = r3.putExtra(r8, r1)
            java.lang.String r4 = r0.f191a
            android.content.Intent r3 = r3.setPackage(r4)
            r4 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r3 = r3.addFlags(r4)
            android.content.Context r4 = r7.f213271f
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.ComponentName r4 = r3.resolveActivity(r4)
            if (r4 == 0) goto L_0x0381
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x042e
        L_0x0381:
            r2.mo73900a(r13)
        L_0x0384:
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r0.f193c
            com.google.protobuf.ci r10 = p001a.p014d.p015a.p016a.C0069n.f188d
            r3.<init>(r4, r10)
            a.d.a.a.l r4 = p001a.p014d.p015a.p016a.C0067l.SEARCH_ACTION_INTENT
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x03c6
            java.lang.String r3 = "Search query is transformed to an actions.SEARCH_ACTION intent"
            r2.mo73900a(r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r12)
            android.content.Intent r1 = r3.putExtra(r8, r1)
            java.lang.String r0 = r0.f191a
            android.content.Intent r0 = r1.setPackage(r0)
            r1 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.f213271f
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            if (r1 == 0) goto L_0x03c1
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x042e
        L_0x03c1:
            java.lang.String r0 = "Package does not support actions.SEARCH_ACTION."
            r2.mo73900a(r0)
        L_0x03c6:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x042e
        L_0x03cb:
            java.lang.String r0 = "Try to create search intent for unknown app."
            r2.mo73900a(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r14)
            android.content.Intent r0 = r0.putExtra(r8, r1)
            android.content.Intent r0 = r0.setPackage(r9)
            r3 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r0 = r0.addFlags(r3)
            android.content.Context r3 = r7.f213271f
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.content.ComponentName r3 = r0.resolveActivity(r3)
            if (r3 == 0) goto L_0x03f8
            r2.mo73900a(r11)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x042e
        L_0x03f8:
            r2.mo73900a(r13)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r12)
            android.content.Intent r0 = r0.putExtra(r8, r1)
            android.content.Intent r0 = r0.setPackage(r9)
            r1 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.f213271f
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            if (r1 == 0) goto L_0x0425
            java.lang.String r1 = "Search query is transformed to an actions.GWS_SEARCH_ACTION_INTENT intent"
            r2.mo73900a(r1)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x042e
        L_0x0425:
            java.lang.String r0 = "Package does not support actions.GMS_SEARCH_ACTION_INTENT_NAME."
            r2.mo73900a(r0)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x042e:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            goto L_0x02ad
        L_0x0434:
            com.google.android.libraries.gsa.k.g r10 = r7.f213272g
            com.google.android.apps.gsa.nga.engine.o.e.g.c r11 = new com.google.android.apps.gsa.nga.engine.o.e.g.c
            r0 = r11
            r1 = r16
            r3 = r18
            r4 = r5
            r5 = r9
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "[NGA] FindOnAppFulfiller.fulfill"
            com.google.common.util.concurrent.cx r0 = r10.mo28209i(r8, r0, r11)
            return r0
        L_0x044b:
            java.lang.String r0 = "Abort - Got an unknown intent, this should never happen!"
            r2.mo73900a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77333j.mo71712b(com.google.android.apps.gsa.nga.engine.o.c.bg, com.google.android.apps.gsa.nga.engine.am.u.n):com.google.common.util.concurrent.cx");
    }
}
