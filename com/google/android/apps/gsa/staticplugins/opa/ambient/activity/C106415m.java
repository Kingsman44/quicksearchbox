package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.lang.ref.WeakReference;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.m */
/* compiled from: PG */
final class C106415m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ WeakReference f296845a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f296846b;

    /* renamed from: c */
    final /* synthetic */ C92125t f296847c;

    /* renamed from: d */
    final /* synthetic */ ViewGroup f296848d;

    public C106415m(WeakReference weakReference, ViewGroup viewGroup, C92125t tVar, ViewGroup viewGroup2) {
        this.f296845a = weakReference;
        this.f296846b = viewGroup;
        this.f296847c = tVar;
        this.f296848d = viewGroup2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C106419n.f296855a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AADetailsHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(23050)).mo56386p("onFailure()");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        List<Optional> list = (List) obj;
        Fragment fragment = (Fragment) this.f296845a.get();
        if (fragment == null || fragment.isDetached()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        for (Optional optional : list) {
            if (optional.isPresent()) {
                try {
                    C58976aa aaVar2 = C58975e.f156826a;
                    View view = (View) optional.get();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams.width == 0) {
                        layoutParams.width = -1;
                    }
                    this.f296846b.addView(view);
                } catch (IllegalStateException e) {
                    C59104x c = C106419n.f296855a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AADetailsHelper");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23054)).mo56386p("Adding view failed!");
                }
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
            }
        }
        this.f296847c.mo86703h(this.f296848d);
    }
}
