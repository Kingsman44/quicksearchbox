package com.google.android.apps.search.googleapp.discover.p10190h;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import androidx.core.p096h.C1951d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3506c.C44581b;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.discover.h.c */
/* compiled from: PG */
public final class C134349c extends C134354h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134351e f365951a;

    /* renamed from: c */
    private Context f365952c;

    /* renamed from: d */
    private final C2393x f365953d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f365954e = new C47515ab(this);

    /* renamed from: f */
    private boolean f365955f;

    @Deprecated
    public C134349c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134351e mo17754z() {
        C134351e eVar = this.f365951a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365955f) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111753b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365952c == null) {
            this.f365952c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365952c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f365954e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f365953d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f365954e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f365954e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f365954e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f365954e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f365954e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        String string;
        super.onCreateDialog(bundle);
        C134351e a = mo17754z();
        View inflate = LayoutInflater.from(a.f365957a.getContext()).inflate(R.layout.googleapp_discover_debug_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.googleapp_discover_stack_trace);
        if (textView != null) {
            Bundle arguments = a.f365957a.getArguments();
            String str2 = "None";
            if (!(arguments == null || (string = arguments.getString("stack_trace", str2)) == null)) {
                str2 = string;
            }
            textView.setText(str2);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.googleapp_discover_system_info);
        if (textView2 != null) {
            Context requireContext = a.f365957a.requireContext();
            C69664n.m101060f(requireContext, "fragment.requireContext()");
            try {
                str = requireContext.getPackageManager().getPackageInfo(requireContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Unknown";
            }
            Locale locale = C1897j.m5167d(C1894g.m5157a(requireContext.getResources().getConfiguration())).f5774b.f5775a.get(0);
            String str3 = Build.DEVICE;
            String str4 = Build.MODEL;
            int i = Build.VERSION.SDK_INT;
            Spanned a2 = C1951d.m5280a(C69764m.m101223c("\n      <b>Device</b>: " + str3 + "\n      <br/><b>Model</b>: " + str4 + "\n      <br/><b>Android Version</b>: " + i + "\n      <br/><b>App Version</b>: " + str + "\n      <br><b>App Language:</b>: " + locale + "\n      "), 0);
            C69664n.m101060f(a2, "fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY)");
            textView2.setText(a2);
        }
        C44581b a3 = a.f365959c.mo110993a(a.f365957a.requireContext(), Optional.empty());
        a3.mo47607z(inflate);
        a3.mo47601t(R.string.googleapp_discover_debug_dialog_positive_button_label, new C47752cq(a.f365958b, "Debug dialog clicked.", new C134350d(a)));
        C0392m create = a3.create();
        C69664n.m101060f(create, "@Delegate\n  fun onCreate…    )\n      .create()\n  }");
        return create;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f365954e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f365954e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f365954e.mo51376d();
        try {
            super.onDetach();
            this.f365955f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f365954e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f365954e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f365954e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f365954e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f365954e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f365954e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f365954e.mo51381i();
        try {
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134348b.m217972a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f365954e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f365954e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f365954e;
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
        C47515ab abVar = this.f365954e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f365954e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f365954e;
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
        this.f365954e.mo51381i();
        try {
            if (!this.f365955f) {
                super.onAttach(context);
                if (this.f365951a == null) {
                    this.f365951a = ((C134352f) mo111757d().mo17653jN()).mo111755bK();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f365954e, this.f365953d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f365954e;
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
                C134348b.m217972a(th, th2);
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
