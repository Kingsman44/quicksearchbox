package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* compiled from: PG */
public final class CustodioDowntimeSettingsFragment extends C132313fg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132167ba f360527a;

    /* renamed from: c */
    private Context f360528c;

    /* renamed from: d */
    private final C2393x f360529d = new C2393x(this);

    /* renamed from: e */
    private boolean f360530e;

    @Deprecated
    public CustodioDowntimeSettingsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132167ba mo17754z() {
        C132167ba baVar = this.f360527a;
        if (baVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360530e) {
            return baVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110420b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360528c == null) {
            this.f360528c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360528c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f360529d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C132167ba a = mo17754z();
            a.f360748f.mo50429i(a.f360750h);
            a.f360748f.mo50429i(a.f360751i);
            a.f360744b.setHasOptionsMenu(true);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (mo17754z().f360754l) {
            menuInflater.inflate(R.menu.assistant_custodio_downtime_fragment_menu, menu);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132167ba a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_custodio_downtime_settings, viewGroup, false);
            String string = a.f360745c.getString("entry_point_id");
            String string2 = a.f360745c.getString("supervised_oid");
            if (string2 == null || string == null) {
                throw new IllegalStateException("CustodioSettingsFragmentPeer not provided required argument!");
            }
            inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_primary_button).setOnClickListener(new C132134av(a));
            inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_secondary_button).setOnClickListener(new C132135aw(a));
            inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_days_container).setOnClickListener(new C132136ax(a));
            inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_time_container).setOnClickListener(new C132137ay(a));
            a.f360747e.mo50707a(a.f360749g.mo110501a(string, C58485gu.m89846n(string2), false), a.f360752j);
            inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_toggle_wrapper).setOnClickListener(new C132138az((CompoundButton) inflate.findViewById(R.id.assistant_fragment_custodio_downtime_settings_switch_compat)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360530e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f122869b.mo51373a("Fragment:onOptionsItemSelected");
        try {
            this.f54442o.mo24732O();
            C132167ba a2 = mo17754z();
            boolean z = false;
            if (menuItem.getItemId() == R.id.assistant_custodio_fragment_menu_item_delete_downtime_schedule) {
                C132173bd bdVar = a2.f360755m;
                if (bdVar == null) {
                    ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56372aa(39532)).mo56386p("Selected delete when deleteMenuItemListener is null");
                    a2.mo110511a();
                } else {
                    AlertDialog create = new AlertDialog.Builder(bdVar.f360765d.f360744b.getContext()).create();
                    create.setTitle(bdVar.f360765d.f360744b.getString(R.string.assistant_custodio_downtime_fragment_delete_dialog_title));
                    String string = bdVar.f360765d.f360744b.getString(R.string.assistant_custodio_downtime_fragment_delete_dialog_body);
                    Object[] objArr = new Object[4];
                    objArr[0] = "GENDER";
                    C8628ag agVar = bdVar.f360762a.f29994c;
                    if (agVar == null) {
                        agVar = C8628ag.f29890g;
                    }
                    int a3 = C8627af.m23352a(agVar.f29896e);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    objArr[1] = C132167ba.m214804d(a3);
                    objArr[2] = "PERSON";
                    C8628ag agVar2 = bdVar.f360762a.f29994c;
                    if (agVar2 == null) {
                        agVar2 = C8628ag.f29890g;
                    }
                    objArr[3] = agVar2.f29893b;
                    create.setMessage(C5114a.m13988b(Locale.getDefault(), string, objArr));
                    create.setButton(-1, bdVar.f360765d.f360744b.getString(R.string.assistant_custodio_downtime_fragment_menu_delete_dialog_confirm_button), new C132171bb(bdVar));
                    create.setButton(-2, bdVar.f360765d.f360744b.getString(R.string.assistant_custodio_settings_downtime_cancel_button), new C132172bc());
                    create.show();
                    z = true;
                }
            }
            if (a != null) {
                a.close();
            }
            return z;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f360753k.mo19974a(C37176a.f96953cR);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f360753k.mo19974a(C37176a.f96952cQ);
            e.close();
            return;
        } catch (Throwable th) {
            C132132at.m214772a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f360530e) {
                super.onAttach(context);
                if (this.f360527a == null) {
                    Object jN = mo110613d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof CustodioDowntimeSettingsFragment) {
                        CustodioDowntimeSettingsFragment custodioDowntimeSettingsFragment = (CustodioDowntimeSettingsFragment) fragment;
                        C68225k.m98532d(custodioDowntimeSettingsFragment);
                        this.f360527a = new C132167ba(custodioDowntimeSettingsFragment, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C132140a) ((C74176nj) jN).f206730b.f198027a.f199474fh.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360529d));
                    } else {
                        String obj = C132167ba.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C132132at.m214772a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
