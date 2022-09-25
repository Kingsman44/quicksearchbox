package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import com.google.android.apps.gsa.binaries.satin.app.alz;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import dagger.hilt.C68286a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68225k;

/* renamed from: dagger.hilt.android.internal.managers.i */
/* compiled from: PG */
public final class C68326i implements C68288b {

    /* renamed from: a */
    private final Service f184677a;

    /* renamed from: b */
    private Object f184678b;

    /* renamed from: dagger.hilt.android.internal.managers.i$a */
    /* compiled from: PG */
    public interface C68327a {
        /* renamed from: rZ */
        alz mo60329rZ();
    }

    public C68326i(Service service) {
        this.f184677a = service;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        if (this.f184678b == null) {
            Application application = this.f184677a.getApplication();
            C68289c.m98631a(application instanceof C68288b, "Sting service must be attached to an @Sting Application. Found: %s", application.getClass());
            alz rZ = ((C68327a) C68286a.m98629a(application, C68327a.class)).mo60329rZ();
            rZ.f197725b = this.f184677a;
            C68225k.m98529a(rZ.f197725b, Service.class);
            this.f184678b = new amb(rZ.f197724a, rZ.f197725b);
        }
        return this.f184678b;
    }
}
