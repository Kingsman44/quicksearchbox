package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.manager.o */
/* compiled from: PG */
public final class C5983o extends Fragment {

    /* renamed from: a */
    public final C5966a f17645a;

    /* renamed from: b */
    public final C5987s f17646b = new C5982n(this);

    /* renamed from: c */
    public C5514ad f17647c;

    /* renamed from: d */
    private final Set f17648d = new HashSet();

    /* renamed from: e */
    private C5983o f17649e;

    public C5983o() {
        C5966a aVar = new C5966a();
        this.f17645a = aVar;
    }

    /* renamed from: a */
    private final void m15414a() {
        C5983o oVar = this.f17649e;
        if (oVar != null) {
            oVar.f17648d.remove(this);
            this.f17649e = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m15414a();
            C5983o g = C5543d.m14321a(activity).f16791d.mo12428g(activity.getFragmentManager());
            this.f17649e = g;
            if (!equals(g)) {
                this.f17649e.f17648d.add(this);
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f17645a.mo12409b();
        m15414a();
    }

    public final void onDetach() {
        super.onDetach();
        m15414a();
    }

    public final void onStart() {
        super.onStart();
        this.f17645a.mo12410c();
    }

    public final void onStop() {
        super.onStop();
        this.f17645a.mo12411d();
    }

    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        return fragment + "{parent=" + valueOf + "}";
    }
}
