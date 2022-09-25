package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.C81845a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81569l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6389l.p6390a.C81843a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82123a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.t */
/* compiled from: PG */
public final class C81865t implements C81845a {

    /* renamed from: a */
    public static final C59071e f223856a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.t");

    /* renamed from: b */
    public final C82123a f223857b;

    /* renamed from: c */
    public final C22871g f223858c;

    /* renamed from: d */
    public final C22871g f223859d;

    /* renamed from: e */
    public final C81819l f223860e;

    /* renamed from: f */
    public final C83363m f223861f = new C83363m();

    /* renamed from: g */
    public final C83363m f223862g = new C83363m();

    /* renamed from: h */
    public final C83358h f223863h;

    /* renamed from: i */
    public final C83357g f223864i;

    /* renamed from: j */
    public final C83357g f223865j;

    /* renamed from: k */
    public final AtomicBoolean f223866k;

    /* renamed from: l */
    public C81848c f223867l;

    /* renamed from: m */
    public final C81843a f223868m;

    /* renamed from: n */
    public final C81569l f223869n;

    /* renamed from: o */
    private final ComponentName f223870o;

    /* renamed from: p */
    private final C81850e f223871p;

    public C81865t(C82123a aVar, Context context, C22871g gVar, C22871g gVar2, C81819l lVar, C81843a aVar2, C81569l lVar2) {
        C83361k kVar = new C83361k(false, C81519a.class);
        this.f223864i = kVar;
        C83361k kVar2 = new C83361k(false, C81519a.class);
        this.f223865j = kVar2;
        this.f223866k = new AtomicBoolean(false);
        this.f223871p = new C81864s(this);
        this.f223857b = aVar;
        this.f223858c = gVar;
        this.f223859d = gVar2;
        this.f223860e = lVar;
        this.f223868m = aVar2;
        Context context2 = context;
        this.f223870o = new ComponentName(context, TransparentAssistUiActivityInSearch.class);
        this.f223869n = lVar2;
        this.f223863h = C83349aj.m132651f(lVar.mo75154g(), lVar.mo75151d(), lVar.mo75163p(), lVar.mo75166s(), lVar.mo75149b(), kVar2, kVar, C81859n.f223849a);
    }

    /* renamed from: b */
    private final synchronized void m130109b() {
        C59071e eVar = f223856a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
        ((C59052c) ((C59052c) b).mo56372aa(6285)).mo56386p("finishTransparentAssistUiActivity");
        C81848c cVar = this.f223867l;
        if (cVar != null) {
            try {
                cVar.mo75374e();
            } catch (RemoteException e) {
                C59104x c = f223856a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6287)).mo56386p("Failed to finish remote activity");
            }
        } else {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
            ((C59052c) ((C59052c) d).mo56372aa(6286)).mo56386p("finish called for non existing activity");
        }
    }

    /* renamed from: c */
    private final synchronized void m130110c() {
        if (this.f223867l != null) {
            C59104x d = f223856a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
            ((C59052c) ((C59052c) d).mo56372aa(6296)).mo56386p("startActivity. Activity ref still present. Not starting new Activity");
        } else if (this.f223866k.getAndSet(true)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x b = f223856a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
            ((C59052c) ((C59052c) b).mo56372aa(6294)).mo56386p("startTransparentAssistUiActivity");
            this.f223868m.mo75369a(6);
            C82123a aVar = this.f223857b;
            ComponentName componentName = this.f223870o;
            C81850e eVar = this.f223871p;
            Bundle bundle = new Bundle();
            eVar.asBinder();
            bundle.putBinder("controller", eVar);
            aVar.mo75522j(new Intent().setComponent(componentName).putExtra("controller_container", bundle));
        }
    }

    /* renamed from: a */
    public final synchronized void mo75377a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            m130110c();
        } else {
            m130109b();
        }
    }
}
