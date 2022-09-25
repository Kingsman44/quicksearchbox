package com.google.android.apps.search.googleapp.startup.appinteractive;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.startup.appinteractive.f */
/* compiled from: PG */
public final class C139684f {

    /* renamed from: a */
    public final C139680b f379672a;

    /* renamed from: b */
    public C139683e f379673b;

    /* renamed from: c */
    public C139682d f379674c;

    /* renamed from: d */
    private final Fragment f379675d;

    /* renamed from: e */
    private boolean f379676e;

    public C139684f(Fragment fragment, C139680b bVar) {
        this.f379675d = fragment;
        this.f379672a = bVar;
    }

    /* renamed from: a */
    public final void mo115166a() {
        C139683e eVar = this.f379673b;
        if (eVar != null && this.f379675d.isResumed()) {
            C139680b bVar = this.f379672a;
            C19559g.m37304c();
            if (bVar.f379667a.f379677a && !this.f379676e) {
                eVar.mo111142a();
                this.f379676e = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo115167b(C139683e eVar) {
        C19559g.m37304c();
        if (!this.f379675d.getLifecycle().mo5789a().equals(C2383n.DESTROYED)) {
            this.f379673b = eVar;
            this.f379676e = false;
            C139682d dVar = this.f379674c;
            if (dVar == null) {
                this.f379675d.getLifecycle().mo5790b(new CriticalStartupUiInteractiveSubscriber$2(this));
            } else {
                this.f379672a.mo115164b(dVar);
            }
            C139682d dVar2 = new C139682d(this);
            this.f379674c = dVar2;
            C139680b bVar = this.f379672a;
            C19559g.m37304c();
            C58838bb.m90869d(!bVar.f379668b.contains(dVar2), "Listener has already been added");
            bVar.f379668b.add(dVar2);
            if (bVar.f379667a.f379677a) {
                C47558bi a = C47831fm.m85006a("CriticalStartupUiInteractivePublisher: call listener");
                try {
                    C60870cx a2 = bVar.f379670d.mo19398a(C47810es.m84977q(new C139679a(bVar, dVar2)));
                    a.mo51417a(a2);
                    bVar.f379669c.put(dVar2, a2);
                    a.close();
                    return;
                } catch (Throwable th) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                    } catch (Exception unused) {
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
