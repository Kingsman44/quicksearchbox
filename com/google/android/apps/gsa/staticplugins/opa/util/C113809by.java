package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Activity;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.search.shared.p6930h.C87558a;
import com.google.android.apps.gsa.search.shared.p6930h.C87559b;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.by */
/* compiled from: PG */
public final class C113809by {

    /* renamed from: a */
    public final Activity f315204a;

    /* renamed from: b */
    public final C73906a f315205b;

    /* renamed from: c */
    private final C91097g f315206c;

    /* renamed from: d */
    private final C58881cr f315207d;

    /* renamed from: e */
    private final C87559b f315208e;

    /* renamed from: f */
    private final C87558a f315209f;

    /* renamed from: g */
    private final C86314e f315210g;

    public C113809by(C91097g gVar, Activity activity, C87559b bVar, C87558a aVar, C58881cr crVar, C86314e eVar, C73906a aVar2) {
        this.f315206c = gVar;
        this.f315204a = activity;
        this.f315208e = bVar;
        this.f315209f = aVar;
        this.f315207d = crVar;
        this.f315210g = eVar;
        this.f315205b = aVar2;
    }

    /* renamed from: a */
    public final void mo100658a() {
        this.f315208e.mo81681b(this.f315204a, this.f315209f);
    }

    /* renamed from: b */
    public final void mo100659b() {
        ((C114513a) this.f315207d.mo6453a()).mo101361a();
    }

    /* renamed from: c */
    public final void mo100660c() {
        C114513a aVar = (C114513a) this.f315207d.mo6453a();
        C90461c cVar = new C90461c();
        if (aVar.f317548a == null) {
            aVar.mo101363d(cVar, 0, C58836b.f156633a);
        }
    }

    /* renamed from: d */
    public final void mo100661d() {
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        c.mo24023e("opa");
        this.f315206c.mo65090b(c.mo24020b().mo24031a(), new C113808bx(this));
    }

    /* renamed from: e */
    public final void mo100662e() {
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "help_menu";
        c.mo24023e("opa");
        this.f315206c.mo65090b(c.mo24020b().mo24031a(), new C91095e());
    }

    /* renamed from: f */
    public final boolean mo100663f() {
        C86314e eVar = this.f315210g;
        if (eVar == null) {
            return false;
        }
        eVar.mo80029b();
        return true;
    }
}
