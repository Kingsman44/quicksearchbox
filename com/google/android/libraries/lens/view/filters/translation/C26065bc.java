package com.google.android.libraries.lens.view.filters.translation;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.material.p2206b.C28506b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bc */
/* compiled from: PG */
public final class C26065bc extends C26227u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26070bh f70853a;

    /* renamed from: b */
    private Context f70854b;

    /* renamed from: c */
    private final C2393x f70855c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70856d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70857e;

    @Deprecated
    public C26065bc() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31272b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70854b == null) {
            this.f70854b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70854b;
    }

    /* renamed from: f */
    public final C26070bh mo17754z() {
        C26070bh bhVar = this.f70853a;
        if (bhVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70857e) {
            return bhVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70856d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70855c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70856d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70856d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70856d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70856d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f70856d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f70856d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70856d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C26070bh f = mo17754z();
        f.f70867g = C44534d.m78716c(new ContextThemeWrapper(f.f70862b.getContext(), 2132150715));
        f.f70868h = LayoutInflater.from(f.f70867g);
        C44581b bVar = new C44581b(f.f70867g, true != f.f70861a.f70852k ? 2132149372 : 2132149373);
        C26063ba baVar = f.f70861a;
        LayoutInflater layoutInflater = f.f70868h;
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.lens_translate_dialog, (ViewGroup) null);
        if (baVar.f70844c != 0) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.lens_translate_dialog_icon);
            if (!baVar.f70845d) {
                imageView.setImageTintList((ColorStateList) null);
            }
            imageView.setImageResource(baVar.f70844c);
            imageView.setVisibility(0);
        }
        if (!baVar.f70846e.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(R.id.lens_translate_dialog_title);
            textView.setText(baVar.f70846e);
            textView.setVisibility(0);
        }
        if (!baVar.f70847f.isEmpty()) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.lens_translate_dialog_subtitle);
            textView2.setText(baVar.f70847f);
            textView2.setVisibility(0);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.lens_translate_dialog_subtext);
        if (baVar.f70850i) {
            Context context = f.f70867g;
            context.getClass();
            SpannableString spannableString = new SpannableString("\n".concat(String.valueOf(context.getString(R.string.lens_translate_charges_may_apply_disclaimer))));
            Context context2 = f.f70867g;
            TypedValue typedValue = new TypedValue();
            Context context3 = f.f70867g;
            context3.getClass();
            context3.getTheme().resolveAttribute(R.attr.textAppearanceCaption, typedValue, true);
            spannableString.setSpan(new TextAppearanceSpan(context2, typedValue.resourceId, C28506b.m53284a(f.f70867g, R.attr.colorOnSurfaceVariant)), 0, spannableString.length(), 33);
            ((RadioButton) inflate.findViewById(R.id.lens_translate_download_dialog_radiobutton_any_network)).append(spannableString);
            ((RadioGroup) inflate.findViewById(R.id.lens_translate_dialog_radiogroup)).setVisibility(0);
        }
        if (!baVar.f70849h.isEmpty()) {
            TextView textView4 = (TextView) inflate.findViewById(R.id.lens_translate_dialog_message);
            textView4.setText(baVar.f70849h);
            textView4.setVisibility(0);
        }
        if (!baVar.f70848g.isEmpty()) {
            textView3.setText(baVar.f70848g);
            textView3.setVisibility(0);
        }
        bVar.mo47607z(inflate);
        bVar.f1347a.f1333n = false;
        bVar.mo47595n();
        bVar.mo47594m();
        C26126i iVar = f.f70861a.f70842a;
        if (iVar == null) {
            iVar = C26126i.f70993c;
        }
        bVar.mo47602u(iVar.f70995a, new C47752cq(f.f70866f, "Click Positive", new C26066bd(f)));
        C26126i iVar2 = f.f70861a.f70843b;
        if (iVar2 == null) {
            iVar2 = C26126i.f70993c;
        }
        bVar.mo47599r(iVar2.f70995a, new C47752cq(f.f70866f, "Click Negative", new C26067be(f)));
        C0392m create = bVar.create();
        create.setCanceledOnTouchOutside(false);
        DialogVisualElements.m53173a(f.f70862b, create, new C26068bf(f));
        return create;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70856d.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70856d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70856d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70856d.mo51376d();
        try {
            super.onDetach();
            this.f70857e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f70856d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70856d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70856d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70856d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70856d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70856d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f70856d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70856d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26064bb.m48120a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70856d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70856d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70856d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70856d;
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
        C47515ab abVar = this.f70856d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70856d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70856d;
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
        this.f70856d.mo51381i();
        try {
            if (!this.f70857e) {
                super.onAttach(context);
                if (this.f70853a == null) {
                    Object jN = mo31446a().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C26063ba baVar = (C26063ba) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C26063ba.f70840l, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(baVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26065bc) {
                        C26065bc bcVar = (C26065bc) fragment;
                        C68225k.m98532d(bcVar);
                        this.f70853a = new C26070bh(baVar, bcVar, (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70856d, this.f70855c));
                    } else {
                        String obj = C26070bh.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70856d;
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
                C26064bb.m48120a(th, th2);
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
