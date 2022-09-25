package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20159e;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20160f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20162h;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20166l;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20584bk;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56426e;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.c.h */
/* compiled from: PG */
public class C20306h extends C19898a {

    /* renamed from: a */
    public C20160f f57051a;

    /* renamed from: b */
    private final C20609ci f57052b;

    /* renamed from: c */
    private final C20601ca f57053c;

    /* renamed from: d */
    private C56426e f57054d;

    public C20306h(C56425d dVar, Context context, C20537f fVar, C20609ci ciVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f57052b = ciVar;
        this.f57053c = caVar;
    }

    /* renamed from: n */
    private final Intent m38200n(C20166l lVar) {
        if (lVar != null) {
            try {
                return Intent.parseUri(lVar.f56572b, 0);
            } catch (URISyntaxException e) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_APP_URI);
                G.mo25536f("Invalid URI in parseLaunchInfo!");
                G.mo25532b(e);
                C20520h.m38498c("AppActionComponent", G.mo25531a(), this.f57053c, new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: o */
    private final void m38201o(boolean z) {
        C56426e eVar = this.f57054d;
        if (eVar != null) {
            int i = true != z ? 2 : 1;
            eVar.copyOnWrite();
            C56429h hVar = (C56429h) eVar.instance;
            C56429h hVar2 = C56429h.f150547k;
            hVar.f150552d = i - 1;
            hVar.f150549a |= 4;
            this.f57053c.mo25489d((String) null, C20585bl.m38625b(new C20585bl((C56429h) this.f57054d.build(), i == 1 ? C20584bk.SHOW : C20584bk.HIDE)), ((C56429h) this.f57054d.instance).f150557i, (Map) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C19926b bVar = this.f57051a.f56557e;
        return bVar == null ? C19926b.f55754e : bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f57051a.f56554b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20159e eVar = (C20159e) this.f57051a.toBuilder();
            eVar.copyOnWrite();
            C20160f fVar = (C20160f) eVar.instance;
            fVar.f56554b = dVar;
            fVar.f56553a |= 1;
            this.f57051a = (C20160f) eVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        C56426e eVar2 = this.f57054d;
        cVar.copyOnWrite();
        C56425d dVar2 = (C56425d) cVar.instance;
        C56429h hVar = (C56429h) eVar2.build();
        hVar.getClass();
        dVar2.f150542d = hVar;
        dVar2.f150539a |= 4;
        cVar.mo58885m(C20160f.f56551g, this.f57051a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r2 = r4;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25129h(android.view.View r9) {
        /*
            r8 = this;
            com.google.android.libraries.componentview.components.c.a.f r0 = r8.f57051a
            com.google.android.libraries.componentview.components.c.a.d r0 = r0.f56555c
            if (r0 != 0) goto L_0x0008
            com.google.android.libraries.componentview.components.c.a.d r0 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20158d.f56547b
        L_0x0008:
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            com.google.protobuf.cq r0 = r0.f56549a
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r0.next()
            com.google.android.libraries.componentview.components.c.a.h r4 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20162h) r4
            int r5 = r4.f56561a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0048
            com.google.android.libraries.componentview.components.c.a.j r5 = r4.f56563c
            if (r5 != 0) goto L_0x002c
            com.google.android.libraries.componentview.components.c.a.j r5 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20164j.f56564c
        L_0x002c:
            java.lang.String r6 = r5.f56566a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            java.lang.String r6 = r5.f56566a
            android.content.Context r7 = r8.f55670f     // Catch:{ NameNotFoundException -> 0x0042 }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0042 }
            r7.getApplicationInfo(r6, r3)     // Catch:{ NameNotFoundException -> 0x0042 }
            r6 = 1
            goto L_0x0044
        L_0x0042:
            r6 = 0
        L_0x0044:
            boolean r5 = r5.f56567b
            if (r6 == r5) goto L_0x0014
        L_0x0048:
            r2 = r4
        L_0x0049:
            if (r2 != 0) goto L_0x0054
            r0 = 8
            r9.setVisibility(r0)
            r8.m38201o(r3)
            return
        L_0x0054:
            r8.m38201o(r1)
            com.google.android.libraries.componentview.components.c.g r0 = new com.google.android.libraries.componentview.components.c.g
            r0.<init>(r8, r2)
            r9.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1689c.C20306h.mo25129h(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20160f.f56551g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f57051a = (C20160f) obj;
        C56429h hVar = dVar.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        this.f57054d = (C56426e) hVar.toBuilder();
    }

    /* renamed from: m */
    public final void mo25351m(C20162h hVar) {
        C56426e eVar;
        C20166l lVar = hVar.f56562b;
        if (lVar == null) {
            lVar = C20166l.f56569c;
        }
        Intent n = m38200n(lVar);
        if (!((hVar.f56561a & 1) == 0 || n == null)) {
            C20166l lVar2 = hVar.f56562b;
            if (lVar2 == null) {
                lVar2 = C20166l.f56569c;
            }
            if (lVar2.f56572b.contains("GOOGLE_SEARCH") && !n.hasExtra("ved")) {
                C20520h.m38497b(3, "AppActionComponent", (Throwable) null, "Attaching ved to GSA Search intent", new Object[0]);
                n.putExtra("ved", ((C56429h) this.f57054d.instance).f150556h);
            }
        }
        if ((hVar.f56561a & 1) == 0 || n == null || !this.f57052b.mo21040b(n)) {
            C20598by G = mo25418G();
            G.mo25535e(C19742a.EMPTY_RESOURCE);
            G.mo25536f("AppAction not handled: ".concat(String.valueOf(String.valueOf(hVar))));
            C20520h.m38498c("AppActionComponent", G.mo25531a(), this.f57053c, new Object[0]);
            return;
        }
        C20166l lVar3 = hVar.f56562b;
        if (lVar3 == null) {
            lVar3 = C20166l.f56569c;
        }
        if (!lVar3.f56572b.contains("GOOGLE_SEARCH") && (eVar = this.f57054d) != null && ((C56429h) eVar.instance).f150551c) {
            C20601ca caVar = this.f57053c;
            C20613d dVar = new C20613d();
            C20166l lVar4 = hVar.f56562b;
            if (lVar4 == null) {
                lVar4 = C20166l.f56569c;
            }
            dVar.mo25529b(lVar4.f56572b);
            dVar.mo25530c(((C56429h) this.f57054d.instance).f150556h);
            C56429h hVar2 = (C56429h) this.f57054d.instance;
            dVar.f57816c = hVar2.f150555g;
            dVar.f57817d = hVar2.f150558j;
            caVar.mo21037a(dVar.mo25528a());
        }
    }
}
