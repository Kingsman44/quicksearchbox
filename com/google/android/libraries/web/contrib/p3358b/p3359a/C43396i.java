package com.google.android.libraries.web.contrib.p3358b.p3359a;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.android.libraries.web.coordinator.internal.fragment.C43757p;
import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.coordinator.p3400b.p3401a.C43736e;
import com.google.android.libraries.web.p3404e.C43769e;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.b.a.i */
/* compiled from: PG */
public final class C43396i {

    /* renamed from: a */
    public final C43402c f113378a;

    /* renamed from: b */
    public final Fragment f113379b;

    /* renamed from: c */
    public final C43262m f113380c;

    /* renamed from: d */
    private final C47429i f113381d;

    public C43396i(C43402c cVar, Fragment fragment, C47429i iVar, C43262m mVar) {
        C69664n.m101061g(cVar, "actionButtonInflater");
        C69664n.m101061g(fragment, "fragment");
        this.f113378a = cVar;
        this.f113379b = fragment;
        this.f113381d = iVar;
        this.f113380c = mVar;
        C69664n.m101061g(fragment, "<this>");
        C19559g.m37304c();
        C47426f.m84293a(iVar.mo51262a(C43769e.m77285b((C43731a) new WebModelProvider(C43757p.m77267b(fragment)).mo47072a(C43736e.class))), new C43394g(this));
    }
}
