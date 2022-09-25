package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.b */
/* compiled from: PG */
public final class C103137b extends C103122al implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C103171i f287834a;

    /* renamed from: c */
    private Context f287835c;

    /* renamed from: d */
    private final C2393x f287836d = new C2393x(this);

    /* renamed from: e */
    private boolean f287837e;

    @Deprecated
    public C103137b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C103137b m171023a(C80269x xVar) {
        C103137b bVar = new C103137b();
        C68324h.m98669f(bVar);
        C47243l.m84039a(bVar, xVar);
        return bVar;
    }

    /* renamed from: b */
    public final C103171i mo17754z() {
        C103171i iVar = this.f287834a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287837e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo93628d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f287835c == null) {
            this.f287835c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f287835c;
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
        return this.f287836d;
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
            C103110a.m170952a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C103171i b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.nga_pie_assist_shelf_followup_fragment, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.nga_pie_assist_shelf_followup_container);
            for (C80271z zVar : b.f287896a.f220272a) {
                View inflate2 = layoutInflater.inflate(R.layout.nga_pie_assist_shelf_actions_item, linearLayout, false);
                ((TextView) inflate2.findViewById(R.id.nga_pie_assist_shelf_followup_item_first_line)).setText(zVar.f220276b);
                ((TextView) inflate2.findViewById(R.id.nga_pie_assist_shelf_followup_item_second_line)).setText(b.f287897b.getString(R.string.nga_pie_assist_shelf_followup_query, new Object[]{zVar.f220277c}));
                linearLayout.addView(inflate2);
                inflate2.setOnClickListener(new C103164c(b, zVar));
            }
            inflate.findViewById(R.id.nga_pie_assist_shelf_followup_mic).setOnClickListener(new C103166d(b));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C103110a.m170952a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f287837e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C103110a.m170952a(th, th);
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
            C103110a.m170952a(th, th);
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
            if (!this.f287837e) {
                super.onAttach(context);
                if (this.f287834a == null) {
                    Object jN = mo93629f().mo17653jN();
                    Bundle a = ((C74178nm) jN).mo70044a();
                    C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C80269x xVar = (C80269x) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C80269x.f220270b, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                    C68225k.m98532d(xVar);
                    Context context2 = (Context) ((C74178nm) jN).f207136c.f205710e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C103137b) {
                        C103137b bVar = (C103137b) fragment;
                        C68225k.m98532d(bVar);
                        this.f287834a = new C103171i(xVar, context2, bVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f287836d));
                    } else {
                        String obj = C103171i.class.toString();
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
                C103110a.m170952a(th, th2);
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
