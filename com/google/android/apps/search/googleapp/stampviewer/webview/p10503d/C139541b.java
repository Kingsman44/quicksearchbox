package com.google.android.apps.search.googleapp.stampviewer.webview.p10503d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.AppCompatImageButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139377c;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10503d.C139544e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.d.b */
/* compiled from: PG */
public final class C139541b extends C139548h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139544e f379378a;

    /* renamed from: c */
    private Context f379379c;

    /* renamed from: d */
    private final C2393x f379380d = new C2393x(this);

    /* renamed from: e */
    private boolean f379381e;

    @Deprecated
    public C139541b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139544e mo17754z() {
        C139544e eVar = this.f379378a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379381e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo115045b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379379c == null) {
            this.f379379c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379379c;
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
        return this.f379380d;
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
            C139540a.m226811a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139544e a = mo17754z();
            C46801dp dpVar = a.f379389f;
            C139377c cVar = a.f379390g;
            C56610b bVar = a.f379388e.f379032b;
            if (bVar == null) {
                bVar = C56610b.f151140k;
            }
            dpVar.mo50707a(cVar.mo114936a(bVar.f151143b), new C139544e.C139545a());
            View inflate = layoutInflater.inflate(R.layout.googleapp_heart_button_fragment, viewGroup, false);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) inflate.findViewById(R.id.googleapp_stamp_viewer_actionbutton_heart);
            C28306ab abVar = a.f379387d;
            abVar.mo33801b(appCompatImageButton, abVar.f76990a.mo33805a(C28427h.m53115a(134709)));
            appCompatImageButton.setOnClickListener(new C47591co(a.f379386c, "Click heart button", new C139542c(a)));
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) inflate.findViewById(R.id.googleapp_stamp_viewer_actionbutton_unheart);
            C28306ab abVar2 = a.f379387d;
            abVar2.mo33801b(appCompatImageButton2, abVar2.f76990a.mo33805a(C28427h.m53115a(137673)));
            appCompatImageButton2.setOnClickListener(new C47591co(a.f379386c, "Click unheart button", new C139543d(a)));
            appCompatImageButton2.setVisibility(8);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139540a.m226811a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379381e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139540a.m226811a(th, th);
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
            C139540a.m226811a(th, th);
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
            if (!this.f379381e) {
                super.onAttach(context);
                if (this.f379378a == null) {
                    this.f379378a = ((C139546f) mo115050d().mo17653jN()).mo115048dR();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379380d));
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
                C139540a.m226811a(th, th2);
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
