package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.android.apps.gsa.assistant.shared.appactions.ChatBubbleDialogLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.v;
import com.google.android.apps.gsa.assistant.shared.appactions.w;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49849bg;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.s */
/* compiled from: PG */
public final class C10421s extends C10284cc implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C10199ae f35140b;

    /* renamed from: c */
    private Context f35141c;

    /* renamed from: d */
    private final C2393x f35142d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f35143e = new C47515ab(this);

    /* renamed from: f */
    private boolean f35144f;

    @Deprecated
    public C10421s() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C10421s m25380a(C10263h hVar) {
        C10421s sVar = new C10421s();
        C68324h.m98669f(sVar);
        C47243l.m84039a(sVar, hVar);
        return sVar;
    }

    /* renamed from: b */
    public final C10199ae mo17754z() {
        C10199ae aeVar = this.f35140b;
        if (aeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f35144f) {
            return aeVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo18376d() {
        return new C47243l(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f35141c == null) {
            this.f35141c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f35141c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f35143e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f35142d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f35143e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f35143e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f35143e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f35143e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            super.onCreate(bundle);
            C10199ae b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            b.f34640r.mo50429i(b.f34641s);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f35143e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C49849bg bgVar;
        super.onCreateDialog(bundle);
        C10199ae b = mo17754z();
        Context context = b.f34625c.getContext();
        C44565p pVar = new C44565p(context, 2132148310);
        b.f34624b = View.inflate(context, R.layout.app_shortcut_dialog, (ViewGroup) null);
        pVar.setContentView(b.f34624b, new ViewGroup.LayoutParams(-1, -2));
        pVar.setCanceledOnTouchOutside(true);
        pVar.setOnShowListener(new C28458c(b.f34625c, new C10422t(b)));
        boolean booleanValue = Boolean.valueOf(b.f34625c.getResources().getConfiguration().orientation == 2).booleanValue();
        View findViewById = b.f34624b.findViewById(R.id.shortcut_dialog);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        if (booleanValue) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            b.f34625c.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.heightPixels > b.mo18336a(R.dimen.dialog_landscape_top_margin)) {
                marginLayoutParams.height = displayMetrics.heightPixels - b.mo18336a(R.dimen.dialog_landscape_top_margin);
            }
        } else {
            marginLayoutParams.height = -2;
        }
        findViewById.setLayoutParams(marginLayoutParams);
        findViewById.requestLayout();
        ChatBubbleDialogLayout findViewById2 = b.f34624b.findViewById(R.id.chat_bubble_dialog_layout);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        marginLayoutParams2.leftMargin = b.mo18336a(true != booleanValue ? R.dimen.chat_bubble_dialog_layout_margin_start : R.dimen.chat_bubble_dialog_layout_margin_start_landscape);
        marginLayoutParams2.topMargin = b.mo18336a(true != booleanValue ? R.dimen.chat_bubble_dialog_layout_margin_top : R.dimen.chat_bubble_dialog_layout_margin_top_landscape);
        marginLayoutParams2.rightMargin = b.mo18336a(true != booleanValue ? R.dimen.chat_bubble_dialog_layout_margin_end : R.dimen.chat_bubble_dialog_layout_margin_end_landscape);
        marginLayoutParams2.bottomMargin = b.mo18336a(true != booleanValue ? R.dimen.chat_bubble_dialog_layout_margin_bottom : R.dimen.chat_bubble_dialog_layout_margin_bottom_landscape);
        findViewById2.setLayoutParams(marginLayoutParams2);
        Boolean valueOf = Boolean.valueOf(booleanValue);
        LinearLayout linearLayout = (LinearLayout) findViewById2.findViewById(R.id.assistant_shortcuts_header);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = findViewById2.a(true != valueOf.booleanValue() ? R.dimen.chat_bubble_dialog_header_margin_top : R.dimen.chat_bubble_dialog_header_margin_top_landscape);
        layoutParams.bottomMargin = findViewById2.a(true != valueOf.booleanValue() ? R.dimen.chat_bubble_dialog_header_margin_bottom : R.dimen.chat_bubble_dialog_header_margin_bottom_landscape);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.requestLayout();
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.user_avatar);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        int a = findViewById2.a(true != valueOf.booleanValue() ? R.dimen.chat_bubble_dialog_user_avatar_size : R.dimen.chat_bubble_dialog_user_avatar_size_landscape);
        layoutParams2.height = a;
        layoutParams2.width = a;
        imageView.setLayoutParams(layoutParams2);
        imageView.requestLayout();
        FrameLayout frameLayout = (FrameLayout) findViewById2.findViewById(R.id.user_chat_bubble_and_edit_icon);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams3.bottomMargin = findViewById2.a(true != valueOf.booleanValue() ? R.dimen.chat_bubble_dialog_shortcut_container_margin_bottom : R.dimen.chat_bubble_dialog_shortcut_container_margin_bottom_landscape);
        frameLayout.setLayoutParams(marginLayoutParams3);
        frameLayout.requestLayout();
        LinearLayout linearLayout2 = (LinearLayout) findViewById2.findViewById(R.id.google_chat_bubble_tail_arc);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        layoutParams3.bottomMargin = findViewById2.a(true != valueOf.booleanValue() ? R.dimen.chat_bubble_dialog_action_container_margin_bottom : R.dimen.chat_bubble_dialog_action_container_margin_bottom_landscape);
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.requestLayout();
        findViewById2.requestLayout();
        C10263h hVar = b.f34626d;
        if (hVar.f34792b == 5) {
            ChatBubbleDialogLayout findViewById3 = b.f34624b.findViewById(R.id.chat_bubble_dialog_layout);
            C10197ac acVar = new C10197ac(b);
            v e = w.e();
            e.b(2);
            C10263h hVar2 = b.f34626d;
            if (hVar2.f34792b == 5) {
                bgVar = (C49849bg) hVar2.f34793c;
            } else {
                bgVar = C49849bg.f129546d;
            }
            e.c(bgVar);
            findViewById3.b(acVar, e.a());
        } else {
            C10325al alVar = b.f34627e;
            C49838aw awVar = hVar.f34795e;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            new C90873ag(alVar.mo18425g(awVar.f129507b, b.f34626d.f34794d), b.f34632j, "Initial dialog layout", new C10427y(b)).mo85223a(C10428z.f35151a);
        }
        return pVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f35143e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f35143e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f35143e.mo51376d();
        try {
            super.onDetach();
            this.f35144f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f35143e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f35143e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f35143e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f35143e.mo51377e();
        try {
            super.onResume();
            mo17754z().f34624b.setVisibility(0);
            e.close();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f35143e.mo51381i();
        try {
            super.onStart();
            C44565p pVar = (C44565p) mo17754z().f34625c.getDialog();
            pVar.getClass();
            pVar.mo47541h().mo47519v(3);
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f35143e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f35143e.mo51381i();
        try {
            this.f54441a.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10420r.m25379a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f35143e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f35143e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f35143e;
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
        C47515ab abVar = this.f35143e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f35143e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f35143e;
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
        this.f35143e.mo51381i();
        try {
            if (!this.f35144f) {
                super.onAttach(context);
                if (this.f35140b == null) {
                    Object jN = mo18377f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10421s) {
                        C10421s sVar = (C10421s) fragment;
                        C68225k.m98532d(sVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10263h hVar = (C10263h) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10263h.f34789f, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(hVar);
                        this.f35140b = new C10199ae(sVar, hVar, (C10325al) ((C74178nm) jN).f207136c.f205576bY.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202324I), ((C74178nm) jN).mo70076r(), (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), (InputMethodManager) ((C74178nm) jN).f207130a.d.f201569bb.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), ((C74178nm) jN).mo70064f(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), Optional.m71637of((C87568k) ((C74178nm) jN).f207130a.a.f202812eD.mo17428b()), Optional.m71637of(C68219e.m98518a(((C74178nm) jN).f207130a.b.f199963ad)), Optional.m71637of(C68219e.m98518a(((C74178nm) jN).f207130a.a.f202696bu)), ((C74178nm) jN).mo70063e(), (C46439e) ((C74178nm) jN).f207139f.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f35143e, this.f35142d));
                    } else {
                        String obj = C10199ae.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f35143e;
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
                C10420r.m25379a(th2, th3);
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
