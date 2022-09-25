package com.google.android.libraries.web.contrib.p3358b.p3359a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3420k.C43863i;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43911f;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.b.a.h */
/* compiled from: PG */
public final class C43395h implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C43396i f113377a;

    public C43395h(C43396i iVar) {
        this.f113377a = iVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.webx_forward_button_label;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_arrow_forward_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.webx_forward_action_button;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 100502;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        C69664n.m101061g(view, "view");
        C69664n.m101061g(iVar, "clientVisualElement");
        C43262m mVar = this.f113377a.f113380c;
        C19559g.m37304c();
        C43863i iVar2 = C43756o.m77265a(((C43251d) mVar).f113024a).f114099h;
        if (iVar2 != null && !iVar2.mo46872a()) {
            C43308t a = C43309u.m76408a(iVar2.f114310a.f114326h.mo46855b());
            a.mo46403b();
            if (a.f113155e.mo46945l()) {
                C43914c i = a.f113155e.mo46769c();
                C69664n.m101058d(i);
                C43911f a2 = C43912g.m77530a(i);
                int c = a2.mo46928c();
                int a3 = a2.mo46926a();
                if (a3 != c) {
                    C43945v b = i.mo46411d(C43331ag.class);
                    C69664n.m101060f(b, "getPlugin(T::class.java)");
                    C43364i iVar3 = (C43364i) C43367l.f113293h.createBuilder();
                    String f = a2.mo46930f(a3);
                    iVar3.copyOnWrite();
                    C43367l lVar = (C43367l) iVar3.instance;
                    f.getClass();
                    lVar.f113295a |= 2;
                    lVar.f113297c = f;
                    C43366k kVar = C43366k.GO_FORWARD;
                    iVar3.copyOnWrite();
                    C43367l lVar2 = (C43367l) iVar3.instance;
                    lVar2.f113299e = kVar.f113292i;
                    lVar2.f113295a |= 8;
                    ((C43331ag) b).mo46449k((C43367l) iVar3.build());
                    a2.mo46931h(a3);
                }
            }
        }
    }
}
