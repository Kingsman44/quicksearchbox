package com.google.android.apps.search.googleapp.compliance;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.compliance.am */
/* compiled from: PG */
public final class C133588am extends C133620be implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133593ar f363936a;

    /* renamed from: c */
    private Context f363937c;

    /* renamed from: d */
    private final C2393x f363938d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f363939e = new C47515ab(this);

    /* renamed from: f */
    private boolean f363940f;

    /* renamed from: g */
    private boolean f363941g;

    @Deprecated
    public C133588am() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133593ar mo17754z() {
        C133593ar arVar = this.f363936a;
        if (arVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363941g) {
            return arVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111280b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363937c == null) {
            this.f363937c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363937c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f363939e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f363938d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f363939e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f363939e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f363939e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f363939e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            super.onCreate(bundle);
            C133593ar a = mo17754z();
            a.f363955j.mo110997e(a.f363946a);
            a.f363949d.mo50429i(a.f363951f.f363991a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f363939e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C133593ar a = mo17754z();
            a.f363947b.mo111251g(a.f363946a.requireDialog());
            View inflate = layoutInflater.inflate(R.layout.googleapp_cookie_personalization_fragment, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.googleapp_compliance_cookie_consent_cookie_explanation)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) inflate.findViewById(R.id.googleapp_compliance_cookie_personalization_reject)).setMovementMethod(LinkMovementMethod.getInstance());
            a.f363946a.requireDialog().setOnShowListener(new C133590ao(a));
            ((SwitchMaterial) inflate.findViewById(R.id.googleapp_compliance_ads_customization_switch)).setOnCheckedChangeListener(new C47754cs(a.f363950e, new C133591ap(a), "Update ads preference"));
            ((SwitchMaterial) inflate.findViewById(R.id.googleapp_compliance_search_customization_switch)).setOnCheckedChangeListener(new C47754cs(a.f363950e, new C133592aq(a), "Update search preference"));
            Context context = a.f363946a.getContext();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            String string = a.f363946a.getString(R.string.googleapp_compliance_browsing_data_explanation);
            String string2 = a.f363946a.getString(R.string.googleapp_compliance_browsing_data_instruction_list);
            arrayList.add(string + "\n\n" + string2);
            ArrayList arrayList2 = new ArrayList();
            String string3 = a.f363946a.getString(R.string.googleapp_compliance_ad_id_explanation);
            String string4 = a.f363946a.getString(R.string.googleapp_compliance_ad_id_instruction);
            String string5 = a.f363946a.getString(R.string.googleapp_compliance_ad_id_instruction_list);
            arrayList2.add(string3 + "\n\n" + string4 + "\n\n" + string5);
            hashMap.put(a.f363946a.getString(R.string.googleapp_compliance_manage_ad_id), arrayList2);
            hashMap.put(a.f363946a.getString(R.string.googleapp_compliance_manage_browsing_data), arrayList);
            ((ExpandableListView) inflate.findViewById(R.id.googleapp_compliance_expandable_list)).setAdapter(new C133530a(context, hashMap));
            this.f363940f = false;
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f363939e.mo51374b();
        try {
            super.onDestroy();
            C133593ar a = mo17754z();
            a.f363951f.mo111292a();
            a.f363947b.mo111252h();
            b.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f363939e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f363939e.mo51376d();
        try {
            super.onDetach();
            this.f363941g = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f363939e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f363939e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f363939e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f363939e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f363939e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f363940f) {
                    View a = C47393f.m84230a(this);
                    C47400m a2 = C47389c.m84226a(getContext());
                    a2.f123128b = a;
                    C133598aw.m216820a(a2, mo17754z());
                    this.f363940f = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f363939e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f363939e.mo51381i();
        try {
            if (!getShowsDialog() && !this.f363940f) {
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = view;
                C133598aw.m216820a(a, mo17754z());
                this.f363940f = true;
            }
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133587al.m216809a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f363939e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f363939e.mo51381i();
        try {
            if (!this.f363941g) {
                super.onAttach(context);
                if (this.f363936a == null) {
                    this.f363936a = ((C133599ax) mo111296d().mo17653jN()).mo111289bz();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f363939e, this.f363938d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f363939e;
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
                C133587al.m216809a(th, th2);
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
