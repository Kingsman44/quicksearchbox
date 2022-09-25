package com.google.android.libraries.lens.view.p2078at;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.C1783a;
import androidx.core.content.C1845a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.staticplugins.p7554bs.p7559e.C96721a;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.lens.view.p2151m.C27280g;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.srpx.C28045k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.at.b */
/* compiled from: PG */
public final class C25519b implements C25537t, C27654a {

    /* renamed from: b */
    private static final C58974d f69483b = C58974d.m91135i("ActivityIntentOpener");

    /* renamed from: a */
    public C25802e f69484a = C25802e.NONE;

    /* renamed from: c */
    private final C58425eo f69485c;

    /* renamed from: d */
    private final Activity f69486d;

    /* renamed from: e */
    private final Map f69487e = new EnumMap(C25802e.class);

    /* renamed from: f */
    private final Map f69488f = new EnumMap(C25802e.class);

    /* renamed from: g */
    private final C27280g f69489g;

    /* renamed from: h */
    private final C25070bo f69490h;

    /* renamed from: i */
    private final C25043ao f69491i;

    /* renamed from: j */
    private final C28045k f69492j;

    /* renamed from: k */
    private final boolean f69493k;

    /* renamed from: l */
    private final boolean f69494l;

    /* renamed from: m */
    private final boolean f69495m;

    /* renamed from: n */
    private C25535r f69496n;

    /* renamed from: o */
    private final C96721a f69497o;

    public C25519b(Activity activity, C27280g gVar, C96721a aVar, C25070bo boVar, C27655b bVar, C25043ao aoVar, C28045k kVar, boolean z, boolean z2, boolean z3) {
        this.f69486d = activity;
        this.f69489g = gVar;
        this.f69497o = aVar;
        this.f69490h = boVar;
        this.f69491i = aoVar;
        this.f69492j = kVar;
        this.f69493k = z2;
        this.f69494l = z3;
        this.f69495m = z;
        bVar.mo33143a(this);
        this.f69485c = new C58425eo(3);
    }

    /* renamed from: g */
    public static final void m47002g(C27658e eVar, String str, String str2) {
        if (str2 != null) {
            eVar.mo33149f(str, str2);
        }
    }

    /* renamed from: k */
    private final boolean m47003k(Intent intent) {
        try {
            C1845a.m5059b(this.f69486d, intent, (Bundle) null);
            return true;
        } catch (ActivityNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f69483b.mo56226d()).mo56382g(e)).mo56372aa(50129)).mo56389s("attemptStartActivity(): failed to start activity for %s", intent);
            return false;
        }
    }

    /* renamed from: l */
    private final boolean m47004l(Intent intent) {
        String path;
        Uri data = intent.getData();
        if (!(data == null || intent.getAction() == null || (((path = data.getPath()) != null && !this.f69494l && path.toLowerCase(Locale.getDefault()).endsWith(".pdf")) || !"android.intent.action.VIEW".equals(intent.getAction()) || (!"http".equals(data.getScheme()) && !"https".equals(data.getScheme()))))) {
            try {
                return this.f69489g.mo32810b(data, (Bundle) null);
            } catch (ActivityNotFoundException e) {
                ((C58970a) ((C58970a) ((C58970a) f69483b.mo56226d()).mo56382g(e)).mo56372aa(50130)).mo56389s("maybeDispatchToCCT(): failed to launch CCT for %s", data);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C58833ax mo30552a() {
        return C58833ax.m90833j(this.f69496n);
    }

    /* renamed from: b */
    public final synchronized void mo30553b() {
        for (Map.Entry entry : this.f69488f.entrySet()) {
            C25536s sVar = (C25536s) this.f69487e.get(entry.getKey());
            if (sVar == null) {
                this.f69490h.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_INTENT_OPENER_DISPATCH_TO_CALLBACK_SUCCESS_RATE, 0);
                if (this.f69493k) {
                    this.f69491i.mo30238d(C59203do.f157270a);
                }
            } else {
                sVar.mo30290a(((C25481a) entry.getValue()).mo30515a(), ((C25481a) entry.getValue()).mo30516b());
            }
        }
        this.f69488f.clear();
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        String str;
        String str2;
        if (!this.f69485c.isEmpty()) {
            eVar.mo33150g("ActivityIntentOpener");
            Iterator it = this.f69485c.iterator();
            int i = 0;
            while (it.hasNext()) {
                Intent intent = (Intent) it.next();
                int i2 = i + 1;
                eVar.mo33148e("intent " + i, BuildConfig.FLAVOR);
                m47002g(eVar, "action", intent.getAction());
                m47002g(eVar, "type", intent.getType());
                if (intent.getData() == null) {
                    str = null;
                } else {
                    Uri data = intent.getData();
                    data.getClass();
                    str = data.toString();
                }
                m47002g(eVar, "data", str);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str3 : extras.keySet()) {
                        Object obj = extras.get(str3);
                        if (obj == null) {
                            str2 = null;
                        } else {
                            str2 = String.format("%s, %s", new Object[]{str3, obj});
                        }
                        m47002g(eVar, "extra", str2);
                    }
                }
                i = i2;
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo30554d(C25802e eVar, C25536s sVar) {
        if (eVar != C25802e.NONE) {
            this.f69487e.put(eVar, sVar);
        } else {
            throw new IllegalArgumentException("NONE value for IntentCallbackId is reserved.");
        }
    }

    /* renamed from: e */
    public final void mo30555e(C25535r rVar) {
        this.f69496n = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00dd, code lost:
        if (m47003k((android.content.Intent) r0.mo56107c()) != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0109, code lost:
        if (m47003k(r3) != false) goto L_0x0120;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30556f(android.content.Intent r8) {
        /*
            r7 = this;
            com.google.common.b.eo r0 = r7.f69485c
            r0.add(r8)
            android.content.Intent r0 = com.google.android.libraries.lens.view.utils.C28133v.m52415a(r8)
            if (r0 != 0) goto L_0x000c
            r0 = r8
        L_0x000c:
            java.lang.String r1 = "ae-action"
            java.lang.String r2 = r0.getScheme()
            boolean r1 = r1.equals(r2)
            r2 = 1
            if (r1 == 0) goto L_0x0023
            com.google.android.libraries.lens.view.at.r r8 = r7.f69496n
            r8.getClass()
            r8.mo30589G(r0)
            goto L_0x0120
        L_0x0023:
            android.net.Uri r0 = r8.getData()
            if (r0 == 0) goto L_0x00df
            boolean r1 = r7.f69495m
            if (r1 == 0) goto L_0x00df
            com.google.android.libraries.lens.view.srpx.k r1 = r7.f69492j
            boolean r1 = r1.mo33500e(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = com.google.android.libraries.lens.view.srpx.C28045k.m52256b(r0)
            if (r1 == 0) goto L_0x00df
            com.google.android.apps.gsa.staticplugins.bs.e.a r1 = r7.f69497o
            dagger.a r1 = r1.f270553a
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78207n()
            if (r1 != 0) goto L_0x004f
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x00cd
        L_0x004f:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r1.<init>(r3)
            java.lang.String r3 = "q"
            java.lang.String r3 = r0.getQueryParameter(r3)
            com.google.android.apps.search.googleapp.search.e.g r4 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.search.e.e r4 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r4
            r3.getClass()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r5
            int r6 = r5.f373769a
            r6 = r6 | r2
            r5.f373769a = r6
            r5.f373770b = r3
            java.lang.String r0 = r0.toString()
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3
            r0.getClass()
            int r5 = r3.f373769a
            r5 = r5 | 16
            r3.f373769a = r5
            r3.f373775g = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r0 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r0
            r0.f373774f = r2
            int r3 = r0.f373769a
            r3 = r3 | 8
            r0.f373769a = r3
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.search.googleapp.search.e.g r0 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r0
            com.google.android.apps.search.googleapp.h.i r3 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()
            com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            r3.mo112776k(r4)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            r3.mo112775j(r0)
            com.google.android.apps.search.googleapp.h.j r0 = r3.mo112766a()
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r1, r0)
            java.lang.String r0 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION"
            r3 = 2
            r1.putExtra(r0, r3)
            java.lang.String r0 = "SKIP_EXIT_ANIMATION"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "source"
            java.lang.String r3 = "and.lens.button"
            r1.putExtra(r0, r3)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x00cd:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r0 = r0.mo56107c()
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r7.m47003k(r0)
            if (r0 != 0) goto L_0x0120
        L_0x00df:
            boolean r0 = r7.m47004l(r8)
            if (r0 != 0) goto L_0x0120
            android.net.Uri r0 = r8.getData()
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r0 != 0) goto L_0x00ee
            goto L_0x010c
        L_0x00ee:
            java.lang.String r3 = r0.toString()
            boolean r3 = com.google.android.libraries.lens.view.utils.C28133v.m52421g(r3)
            if (r3 == 0) goto L_0x010c
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1)
            r3.setData(r0)
            java.lang.String r0 = "com.google.android.gms"
            r3.setPackage(r0)
            boolean r0 = r7.m47003k(r3)
            if (r0 == 0) goto L_0x010c
            goto L_0x0120
        L_0x010c:
            java.lang.String r0 = r8.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011b
            r0 = 0
            android.content.Intent r8 = android.content.Intent.createChooser(r8, r0)
        L_0x011b:
            boolean r8 = r7.m47003k(r8)
            return r8
        L_0x0120:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2078at.C25519b.mo30556f(android.content.Intent):boolean");
    }

    /* renamed from: h */
    public final synchronized void mo30557h(int i, Intent intent) {
        if (this.f69484a == C25802e.NONE) {
            ((C58970a) ((C58970a) f69483b.mo56226d()).mo56372aa(50128)).mo56387q("Received result for request code %s but there is no pending callback.", 1234);
            this.f69490h.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_INTENT_OPENER_DISPATCH_TO_CALLBACK_SUCCESS_RATE, 0);
            if (this.f69493k) {
                this.f69491i.mo30238d(C59203do.f157270a);
                return;
            }
            return;
        }
        C25536s sVar = (C25536s) this.f69487e.get(this.f69484a);
        if (sVar != null) {
            this.f69490h.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_INTENT_OPENER_DISPATCH_TO_CALLBACK_SUCCESS_RATE, 1);
            if (this.f69493k) {
                this.f69491i.mo30238d(1.0d);
            }
            if (this.f69484a != C25802e.LEGACY_API_CALLBACK) {
                sVar.mo30290a(i, intent);
                this.f69484a = C25802e.NONE;
            } else if (sVar.mo30290a(i, intent)) {
                this.f69487e.remove(this.f69484a);
                this.f69484a = C25802e.NONE;
            }
        } else if (this.f69484a == C25802e.LEGACY_API_CALLBACK) {
            ((C58970a) ((C58970a) f69483b.mo56226d()).mo56372aa(50127)).mo56387q("Received result for request code %s but no callback found.", 1234);
            this.f69490h.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_INTENT_OPENER_DISPATCH_TO_CALLBACK_SUCCESS_RATE, 0);
            if (this.f69493k) {
                this.f69491i.mo30238d(C59203do.f157270a);
            }
        } else {
            ((C58970a) ((C58970a) f69483b.mo56226d()).mo56372aa(50126)).mo56389s("Storing in pending intent results (%s).", this.f69484a.name());
            this.f69488f.put(this.f69484a, new C25521d(i, intent));
        }
    }

    /* renamed from: i */
    public final void mo30558i(Intent intent, C25802e eVar) {
        C58838bb.m90866a((C25536s) this.f69487e.get(eVar), "No callback associated with this ID.");
        this.f69484a = eVar;
        C1783a.m4903b(this.f69486d, intent, 1234, (Bundle) null);
    }

    @Deprecated
    /* renamed from: j */
    public final void mo30559j(Intent intent, C25536s sVar) {
        if (((C25536s) this.f69487e.get(C25802e.LEGACY_API_CALLBACK)) != null) {
            ((C58970a) ((C58970a) f69483b.mo56226d()).mo56372aa(50131)).mo56386p("Failed to start activity for result. Has pending callback.");
            return;
        }
        this.f69487e.put(C25802e.LEGACY_API_CALLBACK, sVar);
        mo30558i(intent, C25802e.LEGACY_API_CALLBACK);
    }
}
