package com.google.android.libraries.web.contrib.p3367d.p3370b.p3371a;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.browser.C43315k;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43462a;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43465b;
import com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a.C43464b;
import com.google.android.libraries.web.contrib.p3367d.p3370b.C43466a;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.d.b.a.b */
/* compiled from: PG */
public final class C43468b implements C43466a {

    /* renamed from: a */
    public final C43464b f113549a;

    /* renamed from: b */
    public final C43467a f113550b;

    /* renamed from: c */
    private final Fragment f113551c;

    public C43468b(Fragment fragment, C43464b bVar, C43467a aVar) {
        this.f113551c = fragment;
        this.f113549a = bVar;
        this.f113550b = aVar;
    }

    /* renamed from: a */
    public final void mo46536a() {
        if (this.f113549a.mo46534c()) {
            C43239d e = mo46541e();
            if (e != null) {
                e.mo46320a();
            }
            this.f113549a.mo46533b();
        }
    }

    /* renamed from: b */
    public final void mo46537b(String str) {
        C58838bb.m90884s(this.f113549a.mo46534c(), "Find in page session inactive!");
        C43464b bVar = this.f113549a;
        C43462a aVar = (C43462a) ((C43465b) bVar.f113537b.mo47045a()).toBuilder();
        aVar.copyOnWrite();
        C43465b bVar2 = (C43465b) aVar.instance;
        str.getClass();
        bVar2.f113541a |= 16;
        bVar2.f113546f = str;
        bVar.f113537b.mo47046b((C43465b) aVar.build());
        C43239d e = mo46541e();
        C58893dc.m90996a(e);
        e.mo46321b(str);
    }

    /* renamed from: c */
    public final void mo46538c() {
        C58838bb.m90884s(this.f113549a.mo46534c(), "Find in page session inactive!");
        if (!this.f113549a.mo46532a().isEmpty()) {
            C43239d e = mo46541e();
            C58893dc.m90996a(e);
            e.mo46322c();
        }
    }

    /* renamed from: d */
    public final void mo46539d() {
        C58838bb.m90884s(this.f113549a.mo46534c(), "Find in page session inactive!");
        if (!this.f113549a.mo46532a().isEmpty()) {
            C43239d e = mo46541e();
            C58893dc.m90996a(e);
            e.mo46323d();
        }
    }

    /* renamed from: e */
    public final C43239d mo46541e() {
        Fragment a = C43751j.m77264a(this.f113551c).mo46774a();
        if (a == null) {
            return null;
        }
        C43272a a2 = C43315k.m76418a((C43861g) a);
        C69664n.m101061g(a2, "<this>");
        C43891f d = a2.mo46411d(C43920i.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43914c i = ((C43920i) ((C43314j) d)).mo46769c();
        i.getClass();
        return C43909d.m77519a(i).mo46916d();
    }
}
