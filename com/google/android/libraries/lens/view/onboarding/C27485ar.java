package com.google.android.libraries.lens.view.onboarding;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.bottompanelscrollview.BottomPanelScrollView;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.account.p3603a.C45954d;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.abb;
import com.google.common.p4552o.abc;
import com.google.common.p4552o.adn;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59928cj;
import com.google.common.p4552o.p4563i.C59930cl;
import com.google.lens.p4711m.C62632i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ar */
/* compiled from: PG */
public final class C27485ar extends C27504bj implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27493az f75157a;

    /* renamed from: b */
    private Context f75158b;

    /* renamed from: c */
    private final C2393x f75159c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f75160d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75161e;

    /* renamed from: f */
    private boolean f75162f;

    @Deprecated
    public C27485ar() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27493az mo17754z() {
        C27493az azVar = this.f75157a;
        if (azVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75162f) {
            return azVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33019b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75158b == null) {
            this.f75158b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75158b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75160d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75159c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75160d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75160d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75160d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f75160d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75160d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C27493az a = mo17754z();
        LayoutInflater layoutInflater = a.f75182c.getLayoutInflater();
        Context requireContext = a.f75182c.requireContext();
        if (C62632i.m94823h(a.f75186g.mo32701h())) {
            requireContext = C44534d.m78716c(new ContextThemeWrapper(a.f75182c.getContext(), 2132150995));
            layoutInflater = layoutInflater.cloneInContext(requireContext);
        }
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.onboarding_warm_welcome_dialog, (ViewGroup) null);
        BottomPanelScrollView bottomPanelScrollView = (BottomPanelScrollView) viewGroup.findViewById(R.id.lens_warm_welcome_container);
        bottomPanelScrollView.mo17754z().f69985d = new C27487at(a, bottomPanelScrollView);
        a.mo33026b(bottomPanelScrollView, bottomPanelScrollView.mo17754z().f69984c);
        Context context = a.f75182c.getContext();
        C47770dh dhVar = a.f75188i;
        View findViewById = viewGroup.findViewById(R.id.text_tos_container);
        TextView textView = (TextView) viewGroup.findViewById(R.id.text_tos);
        findViewById.setContentDescription(context.getString(R.string.lens_onboarding_warm_welcome_tos_body_1) + "\n" + context.getString(R.string.lens_onboarding_warm_welcome_tos_body_2));
        SpannableString spannableString = new SpannableString(String.valueOf(context.getString(R.string.lens_onboarding_warm_welcome_tos_body_1)).concat("  "));
        int textSize = (int) textView.getTextSize();
        int lineSpacingExtra = ((int) textView.getLineSpacingExtra()) + textSize;
        Drawable drawable = context.getDrawable(R.drawable.quantum_gm_ic_expand_more_vd_theme_24);
        drawable.getClass();
        Drawable drawable2 = context.getDrawable(R.drawable.quantum_gm_ic_expand_less_vd_theme_24);
        drawable2.getClass();
        drawable.setBounds(0, 0, lineSpacingExtra, lineSpacingExtra);
        drawable2.setBounds(0, 0, lineSpacingExtra, lineSpacingExtra);
        int length = spannableString.length();
        spannableString.setSpan(new C27492ay(drawable, textSize), length - 1, length, 0);
        C27489av avVar = r8;
        C27489av avVar2 = new C27489av((TextView) viewGroup.findViewById(R.id.text_tos_expandable), drawable2, drawable, spannableString, textSize, length, textView);
        findViewById.setOnClickListener(new C47591co(dhVar, "Toggle TOS", avVar));
        textView.setText(spannableString);
        if (a.mo33028d()) {
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.text_account_name_holder);
            ((ViewGroup) viewGroup.findViewById(R.id.account_info_container)).setVisibility(0);
            textView2.setText((String) a.f75180a.mo56111f());
        }
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.text_tos_pp);
        String string = a.f75182c.getContext().getString(R.string.lens_onboarding_warm_welcome_tos_links);
        C27488au auVar = new C27488au(a, viewGroup);
        Spannable spannable = (Spannable) Html.fromHtml(string);
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            String url = uRLSpan.getURL();
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new C27490aw(auVar, url), spanStart, spanEnd, 0);
        }
        textView3.setText(spannable);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setPaintFlags(textView3.getPaintFlags() & -9);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup.findViewById(R.id.onboarding_animation);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.text_title);
        if (a.f75181b.f70642a.f70649b == C25980d.TRANSLATE) {
            lottieAnimationView.mo9698i(R.raw.onboarding_translate);
            textView4.setText(R.string.lens_onboarding_warm_welcome_dialog_title_translate);
        } else if (a.f75181b.f70642a.f70649b == C25980d.EDUCATION) {
            lottieAnimationView.mo9698i(R.raw.onboarding_education);
            textView4.setText(R.string.lens_onboarding_warm_welcome_dialog_title_education);
        } else if (a.mo33027c()) {
            lottieAnimationView.mo9698i(R.raw.onboarding_animation_for_gallery);
            textView4.setText(R.string.lens_onboarding_warm_welcome_dialog_title_for_gallery);
        } else {
            lottieAnimationView.mo9698i(R.raw.onboarding_animation);
        }
        C28448r rVar = a.f75187h;
        C28446p a2 = C28447q.m53152a(126855);
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        C59928cj cjVar = (C59928cj) C59930cl.f161974c.createBuilder();
        cjVar.copyOnWrite();
        C59930cl clVar = (C59930cl) cjVar.instance;
        clVar.f161977b = 1;
        clVar.f161976a |= 1;
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        C59930cl clVar2 = (C59930cl) cjVar.build();
        clVar2.getClass();
        biVar.f161898f = clVar2;
        biVar.f161893a |= 1024;
        a2.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
        a2.mo33898b(C45954d.m82060a(a.f75189j.f69824a));
        rVar.mo33855a(a2.mo33897a());
        C44581b bVar = new C44581b(requireContext, 2132150995);
        bVar.mo47607z(viewGroup);
        bVar.f1347a.f1336q = new C27486as(a);
        C0392m create = bVar.create();
        C28306ab abVar = a.f75190k;
        C28313c a3 = abVar.f76990a.mo33805a(C28427h.m53115a(51784));
        a3.mo33859g(C45954d.m82060a(a.f75189j.f69824a));
        abVar.mo33801b(viewGroup, a3);
        boolean f = a.f75185f.mo30536f("android.permission.CAMERA");
        adn adn = (adn) ado.f158388g.createBuilder();
        abb abb = (abb) abc.f158180c.createBuilder();
        abb.copyOnWrite();
        abc abc = (abc) abb.instance;
        abc.f158182a |= 2;
        abc.f158183b = !f;
        adn.copyOnWrite();
        ado ado = (ado) adn.instance;
        abc abc2 = (abc) abb.build();
        abc2.getClass();
        ado.f158393c = abc2;
        ado.f158391a |= 4;
        ado ado2 = (ado) adn.build();
        C28306ab abVar2 = a.f75190k;
        View findViewById2 = viewGroup.findViewById(R.id.lens_onboarding_open_gallery_button);
        C28313c a4 = a.f75190k.f76990a.mo33805a(C28427h.m53115a(130908));
        a4.mo33858f(new C28353e(C25686g.f69825a, ado2));
        abVar2.mo33801b(findViewById2, a4);
        C28306ab abVar3 = a.f75190k;
        View findViewById3 = viewGroup.findViewById(R.id.lens_onboarding_open_camera_button);
        C28313c a5 = a.f75190k.f76990a.mo33805a(C28427h.m53115a(97256));
        a5.mo33858f(new C28353e(C25686g.f69825a, ado2));
        abVar3.mo33801b(findViewById3, a5);
        C28306ab abVar4 = a.f75190k;
        View findViewById4 = viewGroup.findViewById(R.id.lens_onboarding_more_button);
        C28313c a6 = a.f75190k.f76990a.mo33805a(C28427h.m53115a(140956));
        a6.mo33858f(new C28353e(C25686g.f69825a, ado2));
        abVar4.mo33801b(findViewById4, a6);
        if (a.mo33028d()) {
            a.f75190k.mo33801b(viewGroup.findViewById(R.id.account_info_container), a.f75190k.f76990a.mo33805a(C28427h.m53115a(131523)));
        }
        DialogVisualElements.m53173a(a.f75182c, create, new C27491ax(a));
        return create;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f75161e = false;
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f75160d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f75160d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75160d.mo51376d();
        try {
            super.onDetach();
            this.f75162f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f75160d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75160d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75160d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75160d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f75160d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f75161e) {
                    View a = C47393f.m84230a(this);
                    C47400m a2 = C47389c.m84226a(getContext());
                    a2.f123128b = a;
                    C27498bd.m51187a(a2, mo17754z());
                    this.f75161e = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75160d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75160d.mo51381i();
        try {
            if (!getShowsDialog() && !this.f75161e) {
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = view;
                C27498bd.m51187a(a, mo17754z());
                this.f75161e = true;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27484aq.m51171a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75160d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75160d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75160d;
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
        C47515ab abVar = this.f75160d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75160d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75160d;
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
        this.f75160d.mo51381i();
        try {
            if (!this.f75162f) {
                super.onAttach(context);
                if (this.f75157a == null) {
                    Object jN = mo33045d().mo17653jN();
                    C58833ax axVar = (C58833ax) ((C74176nj) jN).f206836d.f205439u.mo17428b();
                    C21370a aVar = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                    C25989d dVar = (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27485ar) {
                        C27485ar arVar = (C27485ar) fragment;
                        C68225k.m98532d(arVar);
                        C27493az azVar = new C27493az(axVar, aVar, dVar, arVar, (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25197ac) ((C74176nj) jN).f206730b.f198027a.f199551hE.mo17428b(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C25540w) ((C74176nj) jN).f206836d.f205269ak.mo17428b(), (C28448r) ((C74176nj) jN).f206677a.b.f200191et.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        this.f75157a = azVar;
                        azVar.f75199l = this;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f75160d, this.f75159c));
                    } else {
                        String obj = C27493az.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f75160d;
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C27484aq.m51171a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
