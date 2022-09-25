package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.binaries.satin.app.C74177nk;
import dagger.hilt.C68286a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: dagger.hilt.android.internal.managers.h */
/* compiled from: PG */
public class C68324h implements C68288b {

    /* renamed from: a */
    private volatile Object f184674a;

    /* renamed from: b */
    private final Object f184675b = new Object();

    /* renamed from: c */
    private final Fragment f184676c;

    /* renamed from: dagger.hilt.android.internal.managers.h$a */
    /* compiled from: PG */
    public interface C68325a {
        /* renamed from: eh */
        C74177nk mo60328eh();
    }

    public C68324h(Fragment fragment) {
        this.f184676c = fragment;
    }

    /* renamed from: e */
    public static final Context m98668e(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: f */
    public static final void m98669f(Fragment fragment) {
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo51145d(Fragment fragment) {
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        if (this.f184674a == null) {
            synchronized (this.f184675b) {
                if (this.f184674a == null) {
                    C68289c.m98632b(this.f184676c.getHost(), "Sting Fragments must be attached before creating the component.");
                    Fragment fragment = this.f184676c;
                    C68289c.m98631a(fragment.getHost() instanceof C68288b, "Sting Fragments must be attached to an @Sting Activity. Found: %s", fragment.getHost().getClass());
                    mo51145d(this.f184676c);
                    C74177nk eh = ((C68325a) C68286a.m98629a(this.f184676c.getHost(), C68325a.class)).mo60328eh();
                    eh.f207100a = this.f184676c;
                    this.f184674a = eh.mo70017a();
                }
            }
        }
        return this.f184674a;
    }
}
