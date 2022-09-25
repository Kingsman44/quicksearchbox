package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.view.ContextThemeWrapper;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.i */
/* compiled from: PG */
public final class C136091i {

    /* renamed from: a */
    public static final C59071e f370637a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.i");

    /* renamed from: b */
    public final C46855i f370638b;

    /* renamed from: c */
    public final C136106x f370639c;

    /* renamed from: d */
    public final Set f370640d;

    /* renamed from: e */
    public final List f370641e;

    /* renamed from: f */
    public final C28306ab f370642f;

    /* renamed from: g */
    public final Context f370643g;

    /* renamed from: h */
    public final C46852f f370644h = new C136090h(this);

    /* renamed from: i */
    private final C136070b f370645i;

    public C136091i(C136070b bVar, C46855i iVar, C136106x xVar, Set set, List list, C28306ab abVar) {
        this.f370645i = bVar;
        this.f370638b = iVar;
        this.f370639c = xVar;
        this.f370640d = set;
        this.f370641e = list;
        this.f370642f = abVar;
        this.f370643g = new ContextThemeWrapper(bVar.requireContext(), 2132150922);
    }

    /* renamed from: a */
    public final void mo112748a(C136102t tVar) {
        if (this.f370645i.getChildFragmentManager().f634a.mo671c("GAB_ACTION_FRAGMENT") == null) {
            C0154a aVar = new C0154a(this.f370645i.getChildFragmentManager());
            Collection.EL.stream(this.f370640d).map(new C136085c(tVar)).filter(C136086d.f370632a).map(C136087e.f370633a).sorted(Comparator.CC.comparingInt(new C136088f(this))).forEach(new C136089g(aVar));
            aVar.mo509f();
        }
    }
}
