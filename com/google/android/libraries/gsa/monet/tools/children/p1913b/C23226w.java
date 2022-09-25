package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.internal.p1887a.C22960ac;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22967aj;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.w */
/* compiled from: PG */
public final class C23226w {

    /* renamed from: a */
    public final C23215l f63665a;

    /* renamed from: b */
    public C23078ai f63666b;

    /* renamed from: c */
    public C23225v f63667c;

    /* renamed from: d */
    private final C22945j f63668d;

    /* renamed from: e */
    private final C23224u f63669e;

    public C23226w(String str, C22945j jVar) {
        this.f63668d = jVar;
        C23224u uVar = new C23224u(this, jVar);
        this.f63669e = uVar;
        C23215l lVar = new C23215l(str, uVar);
        this.f63665a = lVar;
        jVar.mo28343n(lVar);
        if (jVar.mo28316z()) {
            lVar.mo28563a(jVar.mo28336e());
        }
        C22960ac acVar = (C22960ac) jVar;
        acVar.f63140b.mo28328a();
        C22967aj ajVar = acVar.f63142d;
        ajVar.mo28349b();
        List list = (List) ajVar.f63172a.get(str);
        if (list == null) {
            list = new ArrayList();
            ajVar.f63172a.put(str, list);
        }
        C23067b.m43230c(!list.contains(lVar), "That listener was already registered for child %s", str);
        list.add(lVar);
        if (ajVar.mo28351d()) {
            int e = ajVar.mo28352e(str);
            if (e == 2) {
                lVar.mo28678c(ajVar.mo28337f(str));
            } else if (e == 3) {
                lVar.mo28677b(ajVar.mo28337f(str));
            }
        }
    }

    /* renamed from: a */
    public final C23129y mo28691a() {
        C23067b.m43234g(mo28694d(), "Child '%s' is not loaded, cannot retrieve type.", this.f63665a.f63639a);
        C23129y yVar = this.f63665a.f63640b;
        yVar.getClass();
        return yVar;
    }

    /* renamed from: b */
    public final String mo28692b() {
        C23067b.m43234g(mo28694d(), "Child '%s' is not loaded, cannot retrieve id.", this.f63665a.f63639a);
        return this.f63668d.mo28341k(this.f63665a.f63639a);
    }

    /* renamed from: c */
    public final void mo28693c(C23225v vVar) {
        C23067b.m43233f(this.f63667c == null, "Listener already set.");
        this.f63667c = vVar;
        if (mo28694d()) {
            C23129y yVar = this.f63665a.f63640b;
            yVar.getClass();
            vVar.mo28682a(yVar);
        }
    }

    /* renamed from: d */
    public final boolean mo28694d() {
        if (!this.f63665a.mo28680e()) {
            return false;
        }
        C23078ai aiVar = this.f63666b;
        aiVar.getClass();
        return aiVar.f63429c;
    }
}
