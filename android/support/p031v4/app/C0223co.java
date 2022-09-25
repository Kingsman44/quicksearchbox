package android.support.p031v4.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2380k;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;

/* renamed from: android.support.v4.app.co */
/* compiled from: PG */
final class C0223co implements C2380k, C4091g, C2371bs {

    /* renamed from: a */
    public C2393x f844a = null;

    /* renamed from: b */
    public C4090f f845b = null;

    /* renamed from: c */
    private final Fragment f846c;

    /* renamed from: d */
    private final C2370br f847d;

    /* renamed from: e */
    private C2363bk f848e;

    public C0223co(Fragment fragment, C2370br brVar) {
        this.f846c = fragment;
        this.f847d = brVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo726a() {
        if (this.f844a == null) {
            this.f844a = new C2393x(this);
            this.f845b = C4089e.m11719a(this);
        }
    }

    public final /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        Application application;
        C2363bk defaultViewModelProviderFactory = this.f846c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f846c.mDefaultFactory)) {
            this.f848e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f848e == null) {
            Context applicationContext = this.f846c.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f848e = new C2354bb(application, this, this.f846c.getArguments());
        }
        return this.f848e;
    }

    public final C2384o getLifecycle() {
        mo726a();
        return this.f844a;
    }

    public final C4088d getSavedStateRegistry() {
        mo726a();
        return this.f845b.f13082a;
    }

    public final C2370br getViewModelStore() {
        mo726a();
        return this.f847d;
    }
}
