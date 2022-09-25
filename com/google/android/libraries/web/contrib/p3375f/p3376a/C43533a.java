package com.google.android.libraries.web.contrib.p3375f.p3376a;

import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0631et;
import android.view.MenuItem;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* renamed from: com.google.android.libraries.web.contrib.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43533a implements C0631et {

    /* renamed from: a */
    public final /* synthetic */ C43535c f113681a;

    /* renamed from: b */
    public final /* synthetic */ C28452b f113682b;

    public /* synthetic */ C43533a(C43535c cVar, C28452b bVar) {
        this.f113681a = cVar;
        this.f113682b = bVar;
    }

    /* renamed from: a */
    public final boolean mo2855a(MenuItem menuItem) {
        C43535c cVar = this.f113681a;
        C28452b bVar = this.f113682b;
        C58801sm G = ((C58485gu) cVar.f113685b.f113688c).listIterator(0);
        while (G.hasNext()) {
            C43541a aVar = (C43541a) G.next();
            if (((C0480t) menuItem).f1682a == aVar.mo46594a()) {
                C47538ax c = cVar.f113685b.f113687b.mo51613c("overflow menu item onClick");
                try {
                    if (aVar.mo46595b() != 0) {
                        cVar.f113685b.f113689d.mo33853c(C28442l.m53142h().mo33894a(), bVar.mo33908b(Integer.valueOf(((C0480t) menuItem).f1682a)));
                    }
                    aVar.mo46597d();
                    if (c == null) {
                        return true;
                    }
                    c.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
        throw th;
    }
}
