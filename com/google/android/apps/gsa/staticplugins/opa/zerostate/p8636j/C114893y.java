package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.y */
/* compiled from: PG */
public final class C114893y {

    /* renamed from: c */
    private static final C59071e f318762c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.y");

    /* renamed from: a */
    public final Map f318763a = new HashMap();

    /* renamed from: b */
    public LinearLayoutManager f318764b = null;

    /* renamed from: d */
    private final C114777aa f318765d;

    /* renamed from: e */
    private final C114804ba f318766e;

    /* renamed from: f */
    private final C114860dc f318767f;

    /* renamed from: g */
    private final C114735e f318768g;

    /* renamed from: h */
    private final C114799aw f318769h;

    public C114893y(Activity activity, C114777aa aaVar, C114800ax axVar, C114804ba baVar, C114860dc dcVar, C114735e eVar) {
        this.f318765d = aaVar;
        this.f318766e = baVar;
        this.f318767f = dcVar;
        this.f318768g = eVar;
        this.f318769h = axVar.mo101603a(activity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101688a(com.google.assistant.p3994s.p3995a.C53287ih r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ba r0 = r4.f318766e
            r0.mo101607a(r5)
            int r0 = r5.f139696b
            java.lang.String r1 = ""
            r2 = 3
            if (r0 != r2) goto L_0x0011
            java.lang.Object r0 = r5.f139697c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0040
            int r0 = r5.f139696b
            r3 = 4
            if (r0 != r3) goto L_0x0022
            java.lang.Object r0 = r5.f139697c
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0022:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.aw r0 = r4.f318769h
            r0.f318703a = r1
            r0.mo101664b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.aw r0 = r4.f318769h
            r0.mo101665c()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r0 = r4.f318768g
            r0.mo101560h(r2, r5)
            return
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r0 = r4.f318768g
            r0.mo101560h(r3, r5)
            return
        L_0x0040:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dc r1 = r4.f318767f
            android.content.Intent r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142325x(r0)
            r2 = 0
            r1.mo101659d(r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r0 = r4.f318768g
            r1 = 2
            r0.mo101560h(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114893y.mo101688a(com.google.assistant.s.a.ih):void");
    }

    /* renamed from: b */
    public final void mo101689b(C53287ih ihVar) {
        this.f318766e.mo101607a(ihVar);
        this.f318768g.mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT);
        if ((ihVar.f139695a & 8) != 0) {
            String str = ihVar.f139701g;
            if (!this.f318763a.containsKey(str)) {
                ((C59052c) ((C59052c) f318762c.mo56226d()).mo56372aa(29532)).mo56389s("#isReadyToScroll(): deepLinkId not found: %s", str);
            } else if (this.f318764b == null) {
                ((C59052c) ((C59052c) f318762c.mo56226d()).mo56372aa(29531)).mo56386p("#isReadyToScroll(): Zero State view has no layout manager attached.");
            } else {
                C114892x xVar = (C114892x) this.f318763a.get(ihVar.f139701g);
                xVar.getClass();
                C114777aa aaVar = this.f318765d;
                LinearLayoutManager linearLayoutManager = this.f318764b;
                linearLayoutManager.getClass();
                Context context = (Context) aaVar.f318503a.mo17428b();
                context.getClass();
                Activity activity = (Activity) aaVar.f318504b.mo17428b();
                activity.getClass();
                C114893y yVar = (C114893y) aaVar.f318505c.mo17428b();
                yVar.getClass();
                C114839ci ciVar = (C114839ci) aaVar.f318506d.mo17428b();
                ciVar.getClass();
                C114742l lVar = (C114742l) aaVar.f318507e.mo17428b();
                lVar.getClass();
                C114735e eVar = (C114735e) aaVar.f318508f.mo17428b();
                eVar.getClass();
                C114894z zVar = new C114894z(context, activity, yVar, ciVar, lVar, eVar, linearLayoutManager);
                zVar.f2449g = xVar.mo101675b() + 1;
                zVar.f318771f = xVar;
                zVar.f318772n = ihVar;
                LinearLayoutManager linearLayoutManager2 = this.f318764b;
                linearLayoutManager2.getClass();
                linearLayoutManager2.startSmoothScroll(zVar);
                return;
            }
            mo101688a(ihVar);
            return;
        }
        this.f318768g.mo101560h(1, ihVar);
    }
}
