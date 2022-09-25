package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.preference.ai */
/* compiled from: PG */
public abstract class C3983ai extends Fragment implements C3994at, C3992ar, C3993as, C4001b {

    /* renamed from: Zh */
    private final Handler f12804Zh = new C3975aa(this, Looper.getMainLooper());

    /* renamed from: Zi */
    private final Runnable f12805Zi = new C3976ab(this);

    /* renamed from: a */
    public final C3978ad f12806a = new C3978ad(this);

    /* renamed from: b */
    public C3995au f12807b;

    /* renamed from: c */
    public RecyclerView f12808c;

    /* renamed from: d */
    public Runnable f12809d;

    /* renamed from: e */
    private boolean f12810e;

    /* renamed from: f */
    private boolean f12811f;

    /* renamed from: g */
    private int f12812g = R.layout.preference_list_fragment;

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo8405f() {
        PreferenceScreen gi = mo8412gi();
        if (gi != null) {
            this.f12808c.setAdapter(new C3990ap(gi));
            gi.mo8334A();
        }
    }

    /* renamed from: fY */
    public RecyclerView mo8406fY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView2.setAccessibilityDelegateCompat(new C3997aw(recyclerView2));
        return recyclerView2;
    }

    /* renamed from: fZ */
    public abstract void mo8407fZ(Bundle bundle, String str);

    /* renamed from: ga */
    public final void mo8408ga(int i) {
        mo8410gc();
        mo8413j(this.f12807b.mo8433f(requireContext(), i, mo8412gi()));
    }

    /* renamed from: gb */
    public void mo8409gb(Preference preference) {
        C0260w wVar;
        Fragment fragment = this;
        boolean z = false;
        while (!z && fragment != null) {
            if (fragment instanceof C3979ae) {
                z = ((C3979ae) fragment).mo8402a();
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C3979ae)) {
            z = ((C3979ae) getContext()).mo8402a();
        }
        if (z) {
            return;
        }
        if ((!(getActivity() instanceof C3979ae) || !((C3979ae) getActivity()).mo8402a()) && getParentFragmentManager().f634a.mo671c("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f12748t;
                wVar = new C4011g();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                wVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f12748t;
                wVar = new C4016l();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                wVar.setArguments(bundle2);
            } else if (preference instanceof MultiSelectListPreference) {
                String str3 = preference.f12748t;
                wVar = new C4019o();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                wVar.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            wVar.setTargetFragment(this, 0);
            wVar.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: gc */
    public final void mo8410gc() {
        if (this.f12807b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* renamed from: gg */
    public final Preference mo8411gg(CharSequence charSequence) {
        C3995au auVar = this.f12807b;
        if (auVar == null) {
            return null;
        }
        return auVar.mo8431d(charSequence);
    }

    /* renamed from: gi */
    public final PreferenceScreen mo8412gi() {
        C3995au auVar = this.f12807b;
        if (auVar == null) {
            return null;
        }
        return auVar.f12834f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r2.f12807b;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8413j(androidx.preference.PreferenceScreen r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0028
            androidx.preference.au r0 = r2.f12807b
            androidx.preference.PreferenceScreen r1 = r0.f12834f
            if (r3 == r1) goto L_0x0028
            if (r1 == 0) goto L_0x000d
            r1.mo8336C()
        L_0x000d:
            r0.f12834f = r3
            r3 = 1
            r2.f12810e = r3
            boolean r0 = r2.f12811f
            if (r0 == 0) goto L_0x0028
            android.os.Handler r0 = r2.f12804Zh
            boolean r0 = r0.hasMessages(r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            android.os.Handler r0 = r2.f12804Zh
            android.os.Message r3 = r0.obtainMessage(r3)
            r3.sendToTarget()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3983ai.mo8413j(androidx.preference.PreferenceScreen):void");
    }

    /* renamed from: k */
    public boolean mo8414k(Preference preference) {
        if (preference.f12750v == null) {
            return false;
        }
        Fragment fragment = this;
        boolean z = false;
        while (!z && fragment != null) {
            if (fragment instanceof C3980af) {
                z = ((C3980af) fragment).mo8403a();
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C3980af)) {
            z = ((C3980af) getContext()).mo8403a();
        }
        if (z) {
            return true;
        }
        if ((getActivity() instanceof C3980af) && ((C3980af) getActivity()).mo8403a()) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle q = preference.mo8365q();
        Fragment a = parentFragmentManager.mo475h().mo586a(requireActivity().getClassLoader(), preference.f12750v);
        a.setArguments(q);
        a.setTargetFragment(this, 0);
        C0154a aVar = new C0154a(parentFragmentManager);
        aVar.mo689v(((View) requireView().getParent()).getId(), a, (String) null);
        aVar.mo686s((String) null);
        aVar.mo505b(false);
        return true;
    }

    /* renamed from: l */
    public final void mo8415l() {
        boolean z = false;
        Fragment fragment = this;
        while (!z && fragment != null) {
            if (fragment instanceof C3981ag) {
                z = ((C3981ag) fragment).mo8404a();
            }
            fragment = fragment.getParentFragment();
        }
        if (!z && (getContext() instanceof C3981ag)) {
            z = ((C3981ag) getContext()).mo8404a();
        }
        if (!z && (getActivity() instanceof C3981ag)) {
            ((C3981ag) getActivity()).mo8404a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        C3995au auVar = new C3995au(requireContext());
        this.f12807b = auVar;
        auVar.f12837i = this;
        mo8407fZ(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes((AttributeSet) null, C3999ay.f12856h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f12812g = obtainStyledAttributes.getResourceId(0, this.f12812g);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f12812g, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView fY = mo8406fY(cloneInContext, viewGroup2, bundle);
            if (fY != null) {
                this.f12808c = fY;
                fY.addItemDecoration$ar$ds(this.f12806a);
                this.f12806a.mo8400a(drawable);
                if (dimensionPixelSize != -1) {
                    this.f12806a.mo8401b(dimensionPixelSize);
                }
                this.f12806a.f12797a = z;
                if (this.f12808c.getParent() == null) {
                    viewGroup2.addView(this.f12808c);
                }
                this.f12804Zh.post(this.f12805Zi);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.f12804Zh.removeCallbacks(this.f12805Zi);
        this.f12804Zh.removeMessages(1);
        if (this.f12810e) {
            this.f12808c.setAdapter((C0640fb) null);
            PreferenceScreen gi = mo8412gi();
            if (gi != null) {
                gi.mo8336C();
            }
        }
        this.f12808c = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen gi = mo8412gi();
        if (gi != null) {
            Bundle bundle2 = new Bundle();
            gi.mo8373x(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        C3995au auVar = this.f12807b;
        auVar.f12835g = this;
        auVar.f12836h = this;
    }

    public void onStop() {
        super.onStop();
        C3995au auVar = this.f12807b;
        auVar.f12835g = null;
        auVar.f12836h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen gi;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (gi = mo8412gi()) == null)) {
            gi.mo8372w(bundle2);
        }
        if (this.f12810e) {
            mo8405f();
            Runnable runnable = this.f12809d;
            if (runnable != null) {
                runnable.run();
                this.f12809d = null;
            }
        }
        this.f12811f = true;
    }
}
