package com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65804ch;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.c.b */
/* compiled from: PG */
public final class C125293b implements C125292a {

    /* renamed from: a */
    private static final C59071e f345639a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f345640b;

    /* renamed from: c */
    private final C46175b f345641c;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.c.b$a */
    /* compiled from: PG */
    public interface C125294a {
        /* renamed from: fN */
        C38469m mo106901fN();
    }

    public C125293b(Context context, C46175b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bVar, "accountDataService");
        this.f345640b = context;
        this.f345641c = bVar;
    }

    /* renamed from: c */
    private final boolean m205225c(C58485gu guVar, C65806cj cjVar, AccountId accountId) {
        Boolean bool;
        Object obj;
        C65804ch chVar;
        Iterator it = guVar.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C65806cj a = C65806cj.m96809a(((C65798cb) obj).f178859d);
            if (a == null) {
                a = C65806cj.UNKNOWN_SETTING_TYPE;
            }
            if (a.equals(cjVar)) {
                break;
            }
        }
        C65798cb cbVar = (C65798cb) obj;
        if (cbVar != null) {
            if (cbVar.f178857b == 3) {
                chVar = (C65804ch) cbVar.f178858c;
            } else {
                chVar = C65804ch.f178869c;
            }
            if (chVar != null) {
                bool = Boolean.valueOf(chVar.f178872b);
            }
        }
        C59052c cVar = (C59052c) f345639a.mo56224b();
        C69664n.m101061g(cjVar, "<this>");
        C61301b c = C126290c.m206498c(Integer.valueOf(cjVar.f178896v));
        C61301b a2 = C126290c.m206496a(accountId);
        C61301b c2 = C126290c.m206498c(bool);
        cVar.mo56379ah(new C59094n(36485));
        cVar.mo56359L("SAA bit for setting %s, account %s: %s. [SD]", c, a2, c2);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106899a(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125296d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.d r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125296d) r0
            int r1 = r0.f345651e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345651e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.d r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.c.d
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f345649c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345651e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r2 = r0.f345648b
            java.lang.Object r6 = r0.f345647a
            p5462h.C69714l.m101134b(r9)
            goto L_0x008e
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0037:
            java.lang.Object r2 = r0.f345647a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0056
        L_0x003d:
            p5462h.C69714l.m101134b(r9)
            com.google.apps.tiktok.account.data.b r9 = r8.f345641c
            com.google.common.util.concurrent.cx r9 = r9.mo50247d()
            java.lang.String r2 = "accountDataService.enabledAccountIds"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f345647a = r8
            r0.f345651e = r5
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x009e
            r2 = r8
        L_0x0056:
            java.util.Set r9 = (java.util.Set) r9
            java.lang.String r6 = "accountIds"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)
            boolean r6 = r9 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0068
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L_0x0068
            goto L_0x0099
        L_0x0068:
            java.util.Iterator r9 = r9.iterator()
            r6 = r2
            r2 = r9
        L_0x006e:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0099
            java.lang.Object r9 = r2.next()
            com.google.apps.tiktok.account.AccountId r9 = (com.google.apps.tiktok.account.AccountId) r9
            java.lang.String r7 = "accountId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            r0.f345647a = r6
            r0.f345648b = r2
            r0.f345651e = r4
            r7 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b) r7
            java.lang.Object r9 = r7.mo106900b(r9, r0)
            if (r9 == r1) goto L_0x0098
        L_0x008e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x006e
            r3 = 1
            goto L_0x0099
        L_0x0098:
            return r1
        L_0x0099:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b.mo106899a(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.c.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[Catch:{ GellerException -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[Catch:{ GellerException -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106900b(com.google.apps.tiktok.account.AccountId r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125295c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.c r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125295c) r0
            int r1 = r0.f345646e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345646e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.c r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.c.c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f345644c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345646e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r9 = r0.f345643b
            java.lang.Object r0 = r0.f345642a
            p5462h.C69714l.m101134b(r10)     // Catch:{ GellerException -> 0x002c }
            goto L_0x0065
        L_0x002c:
            r10 = move-exception
            goto L_0x00ad
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            p5462h.C69714l.m101134b(r10)
            android.content.Context r10 = r8.f345640b     // Catch:{ GellerException -> 0x002c }
            java.lang.Class<com.google.android.apps.search.assistant.surfaces.dictation.service.c.b$a> r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b.C125294a.class
            java.lang.Object r10 = com.google.apps.tiktok.inject.C47245e.m84045a(r10, r2, r9)     // Catch:{ GellerException -> 0x002c }
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b$a r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b.C125294a) r10     // Catch:{ GellerException -> 0x002c }
            com.google.android.libraries.search.i.m r10 = r10.mo106901fN()     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.ak r2 = com.google.protos.p5129p.p5131b.C65753ak.PRIVACY_SETTINGS     // Catch:{ GellerException -> 0x002c }
            com.google.protos.ap.a.a.ac r5 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.cb r6 = com.google.protos.p5129p.p5131b.C65798cb.f178854e     // Catch:{ GellerException -> 0x002c }
            r7 = 0
            com.google.common.util.concurrent.cx r10 = r10.mo41431b(r2, r7, r5, r6)     // Catch:{ GellerException -> 0x002c }
            java.lang.String r2 = "getEntryPoint(context, A…ultInstance()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)     // Catch:{ GellerException -> 0x002c }
            r0.f345642a = r8     // Catch:{ GellerException -> 0x002c }
            r0.f345643b = r9     // Catch:{ GellerException -> 0x002c }
            r0.f345646e = r4     // Catch:{ GellerException -> 0x002c }
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)     // Catch:{ GellerException -> 0x002c }
            if (r10 == r1) goto L_0x00ac
            r0 = r8
        L_0x0065:
            com.google.common.b.gu r10 = (com.google.common.p4522b.C58485gu) r10     // Catch:{ GellerException -> 0x002c }
            java.lang.String r1 = "privacySettingsStates"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.cj r1 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT     // Catch:{ GellerException -> 0x002c }
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b) r2     // Catch:{ GellerException -> 0x002c }
            r5 = r9
            com.google.apps.tiktok.account.AccountId r5 = (com.google.apps.tiktok.account.AccountId) r5     // Catch:{ GellerException -> 0x002c }
            boolean r1 = r2.m205225c(r10, r1, r5)     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.cj r2 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE     // Catch:{ GellerException -> 0x002c }
            r5 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b) r5     // Catch:{ GellerException -> 0x002c }
            r6 = r9
            com.google.apps.tiktok.account.AccountId r6 = (com.google.apps.tiktok.account.AccountId) r6     // Catch:{ GellerException -> 0x002c }
            boolean r2 = r5.m205225c(r10, r2, r6)     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.cj r5 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_PRIVATE_DEVICE     // Catch:{ GellerException -> 0x002c }
            r6 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b r6 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b) r6     // Catch:{ GellerException -> 0x002c }
            r7 = r9
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7     // Catch:{ GellerException -> 0x002c }
            boolean r5 = r6.m205225c(r10, r5, r7)     // Catch:{ GellerException -> 0x002c }
            com.google.protos.p.b.cj r6 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_ANY_DEVICE     // Catch:{ GellerException -> 0x002c }
            com.google.android.apps.search.assistant.surfaces.dictation.service.c.b r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b) r0     // Catch:{ GellerException -> 0x002c }
            r7 = r9
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7     // Catch:{ GellerException -> 0x002c }
            boolean r10 = r0.m205225c(r10, r6, r7)     // Catch:{ GellerException -> 0x002c }
            if (r1 == 0) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            if (r5 == 0) goto L_0x00a6
            if (r10 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r10 = 0
            goto L_0x00a7
        L_0x00a6:
            r10 = 1
        L_0x00a7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)     // Catch:{ GellerException -> 0x002c }
            return r9
        L_0x00ac:
            return r1
        L_0x00ad:
            com.google.net.a.a.b r0 = r10.f60397a
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d8
            com.google.common.f.e r0 = f345639a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r10 = r10.getMessage()
            com.google.frameworks.client.a.a.b r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r9)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 36483(0x8e83, float:5.1124E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "GellerException: (%s) for accountId: %s. Skipping account. [SD]"
            r0.mo56354G(r1, r10, r9)
            goto L_0x00fb
        L_0x00d8:
            com.google.common.f.e r0 = f345639a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r10 = r0.mo56382g(r10)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.frameworks.client.a.a.b r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r9)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36482(0x8e82, float:5.1122E-41)
            r0.<init>(r1)
            r10.mo56379ah(r0)
            java.lang.String r0 = "Encountered GellerException for accountId: %s. Assuming SAA disabled. [SD]"
            r10.mo56389s(r0, r9)
            r3 = 1
        L_0x00fb:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9431c.C125293b.mo106900b(com.google.apps.tiktok.account.AccountId, h.c.g):java.lang.Object");
    }
}
