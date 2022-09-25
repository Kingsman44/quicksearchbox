package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8414d;

import android.view.ContextThemeWrapper;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40063a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40461e;
import com.google.common.base.C58833ax;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57758a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57759b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57760c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57761d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.d.a */
/* compiled from: PG */
public final class C109997a implements C40063a {

    /* renamed from: a */
    private final C40461e f306458a;

    /* renamed from: b */
    private final ContextThemeWrapper f306459b;

    /* renamed from: c */
    private final boolean f306460c;

    public C109997a(ContextThemeWrapper contextThemeWrapper, boolean z, boolean z2) {
        this.f306459b = contextThemeWrapper;
        this.f306458a = new C40461e(contextThemeWrapper, z);
        this.f306460c = z2;
    }

    /* renamed from: a */
    public final C58833ax mo42165a() {
        C58833ax a = this.f306458a.mo42165a();
        if (!a.mo56113h()) {
            return a;
        }
        C57759b bVar = ((C57761d) a.mo56107c()).f154346b;
        if (bVar == null) {
            bVar = C57759b.f154314B;
        }
        if (this.f306460c) {
            C57758a aVar = (C57758a) bVar.toBuilder();
            int a2 = C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, this.f306459b);
            aVar.copyOnWrite();
            C57759b bVar2 = (C57759b) aVar.instance;
            bVar2.f154317a |= 32768;
            bVar2.f154333q = a2;
            bVar = (C57759b) aVar.build();
        }
        C57760c cVar = (C57760c) ((C57761d) this.f306458a.mo42165a().mo56107c()).toBuilder();
        cVar.copyOnWrite();
        C57761d dVar = (C57761d) cVar.instance;
        bVar.getClass();
        dVar.f154346b = bVar;
        dVar.f154345a |= 1;
        return C58833ax.m90834k((C57761d) cVar.build());
    }
}
