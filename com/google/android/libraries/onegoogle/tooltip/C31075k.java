package com.google.android.libraries.onegoogle.tooltip;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30928o;
import com.google.android.libraries.onegoogle.common.C30929p;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.k */
/* compiled from: PG */
public final class C31075k extends Fragment implements C30928o {

    /* renamed from: a */
    public boolean f83707a = false;

    /* renamed from: b */
    public C31079o f83708b;

    /* renamed from: c */
    public final C30929p f83709c = new C30929p(this);

    /* renamed from: d */
    public C31074j f83710d;

    /* renamed from: e */
    public boolean f83711e;

    /* renamed from: f */
    private boolean f83712f;

    /* renamed from: a */
    public final void mo36800a() {
        C31079o oVar = this.f83708b;
        if (oVar != null) {
            oVar.mo36806a();
            this.f83708b = null;
        }
        mo36801b();
    }

    /* renamed from: b */
    public final void mo36801b() {
        if (getActivity() != null && !getActivity().isFinishing() && isAdded() && !isRemoving()) {
            C0154a aVar = new C0154a(getParentFragmentManager());
            aVar.mo516m(this);
            aVar.mo505b(true);
        }
    }

    /* renamed from: e */
    public final boolean mo36411e() {
        return this.f83710d != null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        this.f83707a = bundle != null && bundle.getBoolean("SHOW_STATE_KEY");
        if (bundle == null) {
            z = false;
        }
        this.f83712f = z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_tooltip_fragment, viewGroup);
    }

    public final void onDestroy() {
        C31074j jVar;
        C31079o oVar = this.f83708b;
        if (oVar != null) {
            oVar.mo36806a();
        }
        if (!this.f83711e && (jVar = this.f83710d) != null) {
            ((C31069e) ((C31068d) jVar).f83694a).f83699d.onDismiss();
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("SHOW_STATE_KEY", this.f83707a);
        this.f83711e = true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.f83712f && !this.f83707a) {
            mo36801b();
        }
        this.f83709c.mo36610c(new C31071g(this));
    }
}
