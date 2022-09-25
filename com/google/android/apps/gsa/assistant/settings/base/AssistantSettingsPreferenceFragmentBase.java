package com.google.android.apps.gsa.assistant.settings.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
import androidx.preference.C3983ai;
import androidx.preference.C3995au;
import androidx.preference.PreferenceScreen;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@ProguardMustNotDelete
@Deprecated
/* compiled from: PG */
public abstract class AssistantSettingsPreferenceFragmentBase extends C3983ai implements C9509k {

    /* renamed from: e */
    public static final C59071e f32963e = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase");

    /* renamed from: f */
    public C9508j f32964f;

    /* renamed from: g */
    public SwipeRefreshLayout f32965g;

    /* renamed from: h */
    private View f32966h;

    /* renamed from: i */
    private MaterialProgressBar f32967i;

    /* renamed from: j */
    private TextView f32968j;

    /* renamed from: k */
    private boolean f32969k = false;

    /* renamed from: l */
    private Set f32970l = new HashSet();

    /* renamed from: m */
    private AtomicInteger f32971m = new AtomicInteger();

    /* renamed from: b */
    private final void m24049b(boolean z) {
        int i;
        if (!isAdded()) {
            C59104x d = f32963e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsstSettingsPrefFrgBase");
            ((C59052c) ((C59052c) d).mo56372aa(330)).mo56386p("Not attached, bailing out.");
        } else if (this.f32966h == null || this.f32967i == null) {
            this.f32969k = true;
        } else {
            if (z) {
                i = 0;
            } else {
                i = getResources().getColor(R.color.assistant_settings_load_spinner_background);
            }
            this.f32968j.setVisibility(8);
            this.f32966h.setBackgroundColor(i);
            this.f32966h.setVisibility(0);
            this.f32967i.mo34165h();
        }
    }

    /* renamed from: A */
    public final void mo17759A(String str, Bundle bundle, int i) {
        C0167am activity = getActivity();
        if (activity != null) {
            ((C9512n) activity).mo17826G(str, bundle, i, (CharSequence) null, this);
        }
    }

    /* renamed from: B */
    public final void mo17760B(String str, Bundle bundle, CharSequence charSequence) {
        C0167am activity = getActivity();
        if (activity != null) {
            ((C9512n) activity).mo17826G(str, bundle, -1, charSequence, this);
        }
    }

    /* renamed from: C */
    public final void mo17761C(boolean z) {
        this.f32971m.incrementAndGet();
        SwipeRefreshLayout swipeRefreshLayout = this.f32965g;
        if (swipeRefreshLayout == null || !swipeRefreshLayout.f13509b) {
            m24049b(z);
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: D */
    public final void mo17762D(int i) {
        View view = getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.container);
            if (findViewById != null) {
                Snackbar.m79660p(findViewById, i, -1).mo48343h();
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: E */
    public final void mo17763E(String str) {
        View view = getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.container);
            if (findViewById != null) {
                Snackbar.m79661q((Context) null, findViewById, str, -1).mo48343h();
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: fY */
    public RecyclerView mo8406fY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView fY = super.mo8406fY(layoutInflater, viewGroup, bundle);
        if (mo17764m() != 0) {
            fY.setClipToPadding(false);
            fY.setPadding(fY.getPaddingLeft(), fY.getPaddingTop(), fY.getPaddingRight(), fY.getPaddingBottom() + getResources().getDimensionPixelSize(R.dimen.assistant_settings_list_padding_bottom));
        }
        return fY;
    }

    /* renamed from: fZ */
    public void mo8407fZ(Bundle bundle, String str) {
        C3995au auVar = this.f12807b;
        auVar.f12833e = "AssistantSettings";
        auVar.f12830b = null;
        auVar.f12830b = null;
        int n = mo17765n();
        if (n != 0) {
            C90476a aVar = C91018d.f254254a;
            super.mo8410gc();
            PreferenceScreen f = this.f12807b.mo8433f(requireContext(), n, (PreferenceScreen) null);
            Object obj = f;
            if (str != null) {
                Object l = f.mo8382l(str);
                if (l instanceof PreferenceScreen) {
                    obj = l;
                } else {
                    throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
                }
            }
            mo8413j((PreferenceScreen) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo17764m() {
        return R.color.assistant_settings_screen_dark_background;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo17765n() {
        return R.xml.assistant_empty_settings;
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9504g q = mo17768q();
        ((C9504g.C9505a) C47266f.m84076a(getActivity(), C9504g.C9505a.class)).mo17816a(q);
        q.f32991g = this;
        q.f32992h = q.f32991g;
        this.f32964f = q;
        if (q != null) {
            q.mo17804o(bundle);
        }
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext().getTheme().applyStyle(R.style.AssistantSettingsPreferenceItemBackground, true);
        View inflate = layoutInflater.inflate(R.layout.assistant_settings_template, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.refresh_layout);
        this.f32965g = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        this.f32965g.mo8792j(R.color.quantum_googblue500);
        View findViewById = inflate.findViewById(R.id.assistant_settings_loading_spinner_layout);
        this.f32966h = findViewById;
        C2043bi.m5562ap(findViewById, (float) getResources().getDimensionPixelSize(R.dimen.assistant_settings_loading_scrim_translation_z));
        this.f32967i = (MaterialProgressBar) inflate.findViewById(R.id.assistant_settings_loading_spinner);
        this.f32968j = (TextView) inflate.findViewById(R.id.assistant_settings_loading_spinner_summary);
        if (this.f32969k) {
            m24049b(false);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.content);
        viewGroup2.removeAllViews();
        View onCreateView = super.onCreateView(layoutInflater, viewGroup2, bundle);
        onCreateView.getClass();
        viewGroup2.addView(onCreateView);
        return inflate;
    }

    public void onDestroy() {
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17805p();
        }
        super.onDestroy();
    }

    public void onPause() {
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17806q();
        }
        super.onPause();
        if (this.f32965g.isEnabled()) {
            this.f32965g.mo8794l(false, false);
            this.f32965g.destroyDrawingCache();
            this.f32965g.clearAnimation();
        }
    }

    public void onResume() {
        super.onResume();
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17808s();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17809t(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17810u();
        }
    }

    public void onStop() {
        C9508j jVar = this.f32964f;
        if (jVar != null) {
            jVar.mo17811v();
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int m = mo17764m();
        if (m != 0) {
            view.setBackgroundColor(C1878d.m5128a(getActivity(), m));
        }
    }

    /* renamed from: p */
    public final C0391l mo17767p() {
        C0167am activity = getActivity();
        if (activity != null) {
            return new C0391l(activity);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C9504g mo17768q();

    /* renamed from: r */
    public final void mo17769r() {
        mo17770s(0, (Intent) null);
    }

    /* renamed from: s */
    public final void mo17770s(int i, Intent intent) {
        C0167am activity = getActivity();
        if (activity != null) {
            ((C9512n) activity).mo17825E(i, intent);
        }
    }

    /* renamed from: t */
    public final void mo17771t() {
        if (this.f32971m.decrementAndGet() <= 0) {
            this.f32971m.set(0);
            this.f32969k = false;
            View view = this.f32966h;
            if (!(view == null || this.f32967i == null)) {
                view.setBackground((Drawable) null);
                this.f32966h.setVisibility(8);
            }
            SwipeRefreshLayout swipeRefreshLayout = this.f32965g;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.mo8794l(false, false);
            }
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: u */
    public final void mo17772u() {
        C0167am activity = getActivity();
        if (activity instanceof C9511m) {
            ((C9511m) activity).mo17823B();
        }
    }

    /* renamed from: v */
    public final void mo17773v() {
        ViewGroup viewGroup;
        if (getView() != null && (viewGroup = (ViewGroup) getView().findViewById(R.id.content)) != null) {
            for (View removeView : this.f32970l) {
                viewGroup.removeView(removeView);
            }
            this.f32970l.clear();
        }
    }

    /* renamed from: w */
    public final void mo17774w(C90936cf cfVar) {
        C0167am activity = getActivity();
        if (activity instanceof C9511m) {
            ((C9511m) activity).mo17824D(cfVar);
        }
    }

    /* renamed from: x */
    public final C91097g mo17775x() {
        C0167am activity = getActivity();
        if (activity != null) {
            return ((C91098h) activity).mo17775x();
        }
        return null;
    }

    /* renamed from: y */
    public final void mo17776y(C0260w wVar) {
        wVar.show(requireFragmentManager(), "AsstSettingsPrefFrgDlg");
    }
}
