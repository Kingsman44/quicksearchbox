package com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
public final class OpaAmbientUiStatus implements C73912w {

    /* renamed from: a */
    public boolean f306843a;

    /* renamed from: b */
    public boolean f306844b;

    /* renamed from: c */
    public boolean f306845c;

    /* renamed from: d */
    C60870cx f306846d;

    /* renamed from: e */
    public int f306847e;

    /* renamed from: f */
    int f306848f;

    /* renamed from: g */
    final C110016c f306849g;

    /* renamed from: h */
    public final Set f306850h = new HashSet();

    /* renamed from: i */
    private final C22871g f306851i;

    /* renamed from: j */
    private final LifecycleObserver f306852j;

    /* compiled from: PG */
    class LifecycleObserver implements C2376g {
        public LifecycleObserver() {
        }

        /* renamed from: g */
        private final void m183406g() {
            OpaAmbientUiStatus.this.f306849g.mo98297a(false);
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            m183406g();
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            m183406g();
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public OpaAmbientUiStatus(C22871g gVar, C110016c cVar) {
        this.f306851i = gVar;
        this.f306849g = cVar;
        this.f306852j = new LifecycleObserver();
    }

    /* renamed from: h */
    private final void m183398h() {
        C60870cx cxVar = this.f306846d;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f306846d = null;
        }
    }

    /* renamed from: a */
    public final int mo65445a() {
        int i = this.f306848f;
        return i != 0 ? i : this.f306847e;
    }

    /* renamed from: b */
    public final void mo65446b() {
        this.f306848f = this.f306847e;
    }

    /* renamed from: c */
    public final void mo65447c() {
        this.f306848f = 0;
    }

    /* renamed from: d */
    public final boolean mo65448d(Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras == null || !extras.getBoolean("launch_ambient_mode_from_assist", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo98392e(C2391v vVar) {
        vVar.getLifecycle().mo5790b(this.f306852j);
    }

    /* renamed from: f */
    public final void mo98393f(C110121g gVar) {
        this.f306850h.add(new WeakReference(gVar));
        m183398h();
        this.f306847e = 2;
        this.f306850h.size();
    }

    /* renamed from: g */
    public final void mo98394g(C110121g gVar) {
        Iterator it = this.f306850h.iterator();
        while (it.hasNext()) {
            C110121g gVar2 = (C110121g) ((WeakReference) it.next()).get();
            if (gVar2 == null || gVar2.equals(gVar)) {
                it.remove();
            }
        }
        if (this.f306850h.isEmpty()) {
            m183398h();
            this.f306846d = this.f306851i.mo28208h("SET_CHARGING_AMBIENT_STATUS_TO_INACTIVE_TASK", 10000, new C110120f(this));
        }
    }
}
