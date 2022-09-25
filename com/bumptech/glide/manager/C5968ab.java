package com.bumptech.glide.manager;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.ab */
/* compiled from: PG */
public final class C5968ab extends Fragment {

    /* renamed from: a */
    public final C5966a f17631a;

    /* renamed from: b */
    public final C5987s f17632b = new C5967aa(this);

    /* renamed from: c */
    public C5514ad f17633c;

    /* renamed from: d */
    public Fragment f17634d;

    /* renamed from: e */
    private final Set f17635e = new HashSet();

    /* renamed from: f */
    private C5968ab f17636f;

    public C5968ab() {
        C5966a aVar = new C5966a();
        this.f17631a = aVar;
    }

    /* renamed from: a */
    public static FragmentManager m15390a(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: c */
    private final void m15391c() {
        C5968ab abVar = this.f17636f;
        if (abVar != null) {
            abVar.f17635e.remove(this);
            this.f17636f = null;
        }
    }

    /* renamed from: b */
    public final void mo12413b(Context context, FragmentManager fragmentManager) {
        m15391c();
        C5968ab e = C5543d.m14321a(context).f16791d.mo12426e(fragmentManager, (Fragment) null);
        this.f17636f = e;
        if (!equals(e)) {
            this.f17636f.f17635e.add(this);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager a = m15390a(this);
        if (a != null) {
            try {
                mo12413b(getContext(), a);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f17631a.mo12409b();
        m15391c();
    }

    public final void onDetach() {
        super.onDetach();
        this.f17634d = null;
        m15391c();
    }

    public final void onStart() {
        super.onStart();
        this.f17631a.mo12410c();
    }

    public final void onStop() {
        super.onStop();
        this.f17631a.mo12411d();
    }

    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f17634d;
        }
        String valueOf = String.valueOf(parentFragment);
        return fragment + "{parent=" + valueOf + "}";
    }
}
