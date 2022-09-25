package com.google.android.apps.gsa.staticplugins.p7536bj;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6564av.C84750a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bj.a */
/* compiled from: PG */
public final class C96638a extends C86734a implements C84750a {

    /* renamed from: a */
    final List f270333a;

    /* renamed from: b */
    final List f270334b;

    /* renamed from: c */
    private final C86054o f270335c;

    /* renamed from: f */
    private final C85664bo f270336f;

    /* renamed from: g */
    private final Context f270337g;

    /* renamed from: h */
    private final C90931ca f270338h;

    protected C96638a(C86054o oVar, C85664bo boVar, Context context, C90931ca caVar, C86124t tVar) {
        super(C118575h.WORKER_ICING, "icing");
        this.f270335c = oVar;
        this.f270336f = boVar;
        this.f270338h = caVar;
        this.f270337g = context;
        this.f270333a = tVar.mo79749o(C90085ej.f250181bE);
        this.f270334b = tVar.mo79749o(C90085ej.f250180bD);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78460a(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r0.f270335c
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 == 0) goto L_0x0020
            com.google.android.apps.gsa.search.core.bo r2 = r0.f270336f
            com.google.android.apps.gsa.search.core.bm r3 = com.google.android.apps.gsa.search.core.C85662bm.WEB_HISTORY
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            com.google.android.apps.gsa.search.core.bl r2 = r2.mo79189a(r3)
            boolean r2 = r2.mo79180f()
            if (r2 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r2 = r19.mo44269v()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x012d
            r3 = 0
            if (r1 == 0) goto L_0x0067
            boolean r4 = r19.mo44265s()
            if (r4 != 0) goto L_0x0034
            goto L_0x0067
        L_0x0034:
            com.google.at.h.d.a.aq r4 = r1.f108906A
            java.util.List r5 = r0.f270333a
            int r6 = r1.f108910k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0045
            goto L_0x0067
        L_0x0045:
            com.google.common.b.gu r1 = r1.f108925z
            java.util.Iterator r1 = r1.iterator()
        L_0x004b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r1.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.List r6 = r0.f270334b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x004b
        L_0x0067:
            r4 = r3
        L_0x0068:
            com.google.android.gms.appdatasearch.h r1 = new com.google.android.gms.appdatasearch.h
            r1.<init>()
            if (r4 == 0) goto L_0x0072
            java.lang.String r5 = "suggestion"
            goto L_0x0074
        L_0x0072:
            java.lang.String r5 = "searchhistoryquery"
        L_0x0074:
            com.google.android.gms.appdatasearch.DocumentSection r6 = new com.google.android.gms.appdatasearch.DocumentSection
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r9 = 1
            com.google.android.gms.appdatasearch.RegisterSectionInfo r5 = com.google.android.gms.appdatasearch.C142791ag.m231730a(r5, r3, r8, r9, r7)
            java.lang.String r7 = "text1"
            int r7 = com.google.android.gms.appdatasearch.C142828y.m231758a(r7)
            r6.<init>(r2, r5, r7, r3)
            r1.mo117732a(r6)
            com.google.android.gms.appdatasearch.DocumentSection r5 = new com.google.android.gms.appdatasearch.DocumentSection
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = "intent_action"
            com.google.android.gms.appdatasearch.RegisterSectionInfo r6 = com.google.android.gms.appdatasearch.C142791ag.m231730a(r7, r3, r9, r8, r6)
            int r7 = com.google.android.gms.appdatasearch.C142828y.m231758a(r7)
            java.lang.String r10 = "android.intent.action.MAIN"
            r5.<init>(r10, r6, r7, r3)
            r1.mo117732a(r5)
            com.google.android.gms.appdatasearch.DocumentSection r5 = new com.google.android.gms.appdatasearch.DocumentSection
            java.lang.String r6 = ""
            if (r4 == 0) goto L_0x00b7
            byte[] r4 = r4.toByteArray()
            r7 = 8
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r7)
            goto L_0x00b8
        L_0x00b7:
            r4 = r6
        L_0x00b8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r10 = "intent_data"
            com.google.android.gms.appdatasearch.RegisterSectionInfo r7 = com.google.android.gms.appdatasearch.C142791ag.m231730a(r10, r3, r9, r8, r7)
            int r10 = com.google.android.gms.appdatasearch.C142828y.m231758a(r10)
            r5.<init>(r4, r7, r10, r3)
            r1.mo117732a(r5)
            com.google.android.gms.appdatasearch.DocumentSection r4 = new com.google.android.gms.appdatasearch.DocumentSection
            java.lang.String r5 = java.lang.Boolean.toString(r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r10 = "intent_extra_data"
            com.google.android.gms.appdatasearch.RegisterSectionInfo r7 = com.google.android.gms.appdatasearch.C142791ag.m231730a(r10, r3, r9, r8, r7)
            int r8 = com.google.android.gms.appdatasearch.C142828y.m231758a(r10)
            r4.<init>(r5, r7, r8, r3)
            r1.mo117732a(r4)
            java.lang.String r4 = "WebPage"
            r1.f387606b = r4
            com.google.android.gms.appdatasearch.DocumentContents r13 = new com.google.android.gms.appdatasearch.DocumentContents
            java.lang.String r4 = r1.f387606b
            java.util.List r1 = r1.f387605a
            if (r1 == 0) goto L_0x0101
            int r3 = r1.size()
            com.google.android.gms.appdatasearch.DocumentSection[] r3 = new com.google.android.gms.appdatasearch.DocumentSection[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            r3 = r1
            com.google.android.gms.appdatasearch.DocumentSection[] r3 = (com.google.android.gms.appdatasearch.DocumentSection[]) r3
        L_0x0101:
            r13.<init>(r4, r3)
            com.google.android.gms.appdatasearch.DocumentId r8 = new com.google.android.gms.appdatasearch.DocumentId
            android.content.Context r1 = r0.f270337g
            java.lang.String r1 = r1.getPackageName()
            r8.<init>(r1, r6, r2)
            long r9 = java.lang.System.currentTimeMillis()
            com.google.android.gms.appdatasearch.UsageInfo r1 = new com.google.android.gms.appdatasearch.UsageInfo
            r11 = 1
            r12 = 0
            r14 = 1
            r15 = -1
            r16 = 0
            r17 = 0
            r7 = r1
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17)
            com.google.android.apps.gsa.shared.util.c.ca r2 = r0.f270338h
            com.google.android.apps.gsa.searchbox.a.a r3 = new com.google.android.apps.gsa.searchbox.a.a
            android.content.Context r4 = r0.f270337g
            r3.<init>(r4, r1)
            r2.mo85139d(r3)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7536bj.C96638a.mo78460a(com.google.android.libraries.searchbox.shared.suggestion.Suggestion):void");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
