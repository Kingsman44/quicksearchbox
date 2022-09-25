package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.support.p033v7.widget.C0673gh;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111585j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Future;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.aa */
/* compiled from: PG */
public final class C112721aa extends C112920hk {

    /* renamed from: a */
    public static final C59071e f312467a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.aa");

    /* renamed from: d */
    private static final C121537f f312468d = C121537f.m200840b("Tapas/AppShortcutsRenderer", C121511c.f337208a);

    /* renamed from: b */
    public final C112925hp f312469b;

    /* renamed from: c */
    public final C86124t f312470c;

    /* renamed from: e */
    private final C112794ct f312471e;

    /* renamed from: f */
    private final LauncherApps f312472f;

    /* renamed from: g */
    private final C111585j f312473g;

    /* renamed from: h */
    private final C22871g f312474h;

    public C112721aa(Context context, C112794ct ctVar, C112925hp hpVar, C111585j jVar, C22871g gVar, C86124t tVar) {
        this.f312471e = ctVar;
        this.f312472f = (LauncherApps) context.getSystemService("launcherapps");
        this.f312469b = hpVar;
        this.f312473g = jVar;
        this.f312474h = gVar;
        this.f312470c = tVar;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 114783;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99685f(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es r5, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez r6, android.support.p033v7.widget.C0673gh r7, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g r8) {
        /*
            r4 = this;
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            j$.util.Optional r7 = r6.mo100224x()
            boolean r8 = r7.isEmpty()
            java.lang.String r0 = "AppShortcutsRenderer"
            if (r8 == 0) goto L_0x0021
            com.google.common.f.e r5 = f312467a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "#handleOnClick: iconShortcut is absent"
            r7 = 27779(0x6c83, float:3.8927E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ct r8 = r4.f312471e
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r2 = 104947(0x199f3, float:1.47062E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            r2 = 19
            r8.mo99739a(r2, r6, r5, r1)
            java.lang.Object r5 = r7.get()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bi r5 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi) r5
            j$.util.Optional r5 = r5.mo99962d()
            boolean r6 = r5.isPresent()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r5 = r5.get()
            android.content.pm.ShortcutInfo r5 = (android.content.pm.ShortcutInfo) r5
            android.content.pm.LauncherApps r6 = r4.f312472f     // Catch:{ IllegalStateException -> 0x005c, ActivityNotFoundException -> 0x005a }
            r7 = 0
            r6.startShortcut(r5, r7, r7)     // Catch:{ IllegalStateException -> 0x005c, ActivityNotFoundException -> 0x005a }
            return
        L_0x005a:
            r6 = move-exception
            goto L_0x005d
        L_0x005c:
            r6 = move-exception
        L_0x005d:
            com.google.common.f.e r7 = f312467a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "#handleOnClick - failed to launch shortcut - %s"
            r0 = 27778(0x6c82, float:3.8925E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r6)).mo56372aa(r0)).mo56389s(r8, r5)
            java.lang.String r6 = r5.getPackage()
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x0078
            r6 = r7
        L_0x0078:
            java.lang.String r8 = r5.getId()
            if (r8 != 0) goto L_0x007f
            r8 = r7
        L_0x007f:
            java.lang.CharSequence r5 = r5.getShortLabel()
            if (r5 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r7 = r5
        L_0x0087:
            com.google.android.apps.search.assistant.platform.i.e.a.f r5 = f312468d
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startShortcutFailed_"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "_"
            r0.append(r6)
            r0.append(r8)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r5.mo105240i(r6)
            return
        L_0x00ad:
            com.google.common.f.e r5 = f312467a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "#handleOnClick: can't launch since shortcutInfo is absent"
            r7 = 27777(0x6c81, float:3.8924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112721aa.mo99685f(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez, android.support.v7.widget.gh, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g):void");
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C59071e eVar = f312467a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
        ((C59052c) ((C59052c) b).mo56372aa(27783)).mo56386p("#renderView()");
        C112919hj hjVar = (C112919hj) ghVar;
        Optional x = ezVar.mo100224x();
        if (x.isEmpty()) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27788)).mo56386p("#renderView: iconShortcutSuggestionParams is absent");
            hjVar.itemView.setVisibility(8);
            return;
        }
        Optional d2 = ((C113284bi) x.get()).mo99962d();
        if (d2.isEmpty()) {
            C59104x d3 = eVar.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
            ((C59052c) ((C59052c) d3).mo56372aa(27787)).mo56386p("#renderView: iconShortcut is absent");
            hjVar.itemView.setVisibility(8);
            return;
        }
        Optional a = ((C113284bi) x.get()).mo99959a();
        if (a.isEmpty()) {
            C59104x d4 = eVar.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
            ((C59052c) ((C59052c) d4).mo56372aa(27786)).mo56386p("#renderView: appLabel future is absent");
            hjVar.itemView.setVisibility(8);
            return;
        }
        C113286bk b2 = this.f312473g.mo99184b((ShortcutInfo) d2.get());
        String L = ezVar.mo100199L();
        C112725ae aeVar = new C112725ae();
        aeVar.f312483a = hjVar.f312954b;
        aeVar.f312484b = hjVar.f312953a;
        aeVar.mo99702b(L);
        aeVar.f312486d = Optional.m71637of(b2);
        hjVar.itemView.setVisibility(0);
        if (C90877ak.m148480n((Future) a.get())) {
            Optional optional = (Optional) C90877ak.m148474h((Future) a.get());
            if (optional.isPresent()) {
                aeVar.f312485c = Optional.m71637of(((CharSequence) optional.get()).toString());
                this.f312469b.mo99783b(aeVar.mo99701a());
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
                ((C59052c) ((C59052c) b3).mo56372aa(27785)).mo56354G("renderTextAndIcon for shortcut label %s, app label %s", L, optional.get());
            } else if (!this.f312470c.mo79746e(C90063do.f249525fF)) {
                hjVar.itemView.setVisibility(8);
            }
        } else {
            this.f312469b.mo99783b(aeVar.mo99701a());
            new C90873ag((C60870cx) a.get(), this.f312474h, "transform app label", new C112955y(this, aeVar, hjVar, L)).mo85223a(new C112956z(this, ezVar, hjVar));
        }
    }
}
