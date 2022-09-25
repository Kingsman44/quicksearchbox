package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.p046a.C0813f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33183h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2557b.C33185a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2557b.C33186b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33212a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33218g;
import com.google.apps.tiktok.dataservice.C46719bc;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.g */
/* compiled from: PG */
public final class C33193g extends C33209w implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C33196j f88776a;

    /* renamed from: c */
    private Context f88777c;

    /* renamed from: d */
    private final C2393x f88778d = new C2393x(this);

    /* renamed from: e */
    private boolean f88779e;

    @Deprecated
    public C33193g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C33196j mo17754z() {
        C33196j jVar = this.f88776a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f88779e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo38587b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f88777c == null) {
            this.f88777c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f88777c;
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
        return this.f88778d;
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
            C33192f.m61558a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C33190d dVar = mo17754z().f88790g;
            if (!(dVar == null || dVar.f88769b.getActivity() == null)) {
                dVar.f88772e = dVar.f88769b.registerForActivityResult(new C0813f(), new C33188b(dVar));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C33192f.m61558a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C33196j a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C33183h hVar = a.f88784a;
            C69664n.m101059e(hVar, "null cannot be cast to non-null type com.google.android.libraries.search.assistant.fluidactions.rendering.impl.SubscriptionControllerImpl");
            C33211y yVar = (C33211y) hVar;
            C46801dp dpVar = yVar.f88813a;
            C33186b bVar = yVar.f88814b;
            dpVar.mo50707a(new C46719bc(bVar.f88760f, new C33185a(bVar), C33186b.f88756b), new C33210x(yVar));
            View inflate = LayoutInflater.from(a.f88786c).inflate(R.layout.fa_form_root_view, (ViewGroup) null);
            C69664n.m101060f(inflate, "from(context).inflate(R.….fa_form_root_view, null)");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C33192f.m61558a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C33196j a = mo17754z();
            C33212a aVar = a.f88785b;
            int i = a.f88788e;
            C33184i iVar = a.f88789f;
            C69664n.m101061g(iVar, "themeConfig");
            aVar.f88819d.put(Integer.valueOf(i), iVar);
            b.close();
            return;
        } catch (Throwable th) {
            C33192f.m61558a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C33196j a = mo17754z();
            C33218g gVar = a.f88787d;
            if (gVar != null) {
                C59052c cVar = (C59052c) C33197k.f88801a.mo56224b();
                cVar.mo56379ah(new C59094n(50949));
                cVar.mo56386p("onDestroyView: Releasing views and resources");
                a.mo38589c(gVar);
                a.f88787d = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C33192f.m61558a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f88779e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C33192f.m61558a(th, th);
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
            C33192f.m61558a(th, th);
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
            if (!this.f88779e) {
                super.onAttach(context);
                if (this.f88776a == null) {
                    this.f88776a = ((C33198l) mo38592d().mo17653jN()).mo38590eV();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f88778d));
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
                C33192f.m61558a(th, th2);
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
