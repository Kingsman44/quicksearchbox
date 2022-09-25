package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import dagger.hilt.p5299a.C68289c;

/* compiled from: PG */
public class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a */
    public Fragment f184654a;

    /* renamed from: b */
    public LayoutInflater f184655b;

    /* renamed from: c */
    public LayoutInflater f184656c;

    /* renamed from: d */
    private final C2389t f184657d;

    /* renamed from: a */
    public final Fragment mo60322a() {
        C68289c.m98632b(this.f184654a, "The fragment has already been destroyed.");
        return this.f184654a;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f184656c == null) {
            if (this.f184655b == null) {
                this.f184655b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f184656c = this.f184655b.cloneInContext(this);
        }
        return this.f184656c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        C683131 r2 = new C2389t() {
            /* renamed from: eN */
            public final void mo416eN(C2391v vVar, C2382m mVar) {
                if (mVar == C2382m.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.f184654a = null;
                    viewComponentManager$FragmentContextWrapper.f184655b = null;
                    viewComponentManager$FragmentContextWrapper.f184656c = null;
                }
            }
        };
        this.f184657d = r2;
        this.f184655b = null;
        this.f184654a = fragment;
        fragment.getLifecycle().mo5790b(r2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, android.support.p031v4.app.Fragment r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f184657d = r0
            r1.f184655b = r2
            r1.f184654a = r3
            androidx.lifecycle.o r2 = r3.getLifecycle()
            r2.mo5790b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, android.support.v4.app.Fragment):void");
    }
}
