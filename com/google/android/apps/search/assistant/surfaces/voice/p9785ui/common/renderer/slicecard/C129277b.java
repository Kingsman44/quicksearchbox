package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.C129265a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a.C129267b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a.C129268c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a.C129270e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a.C129271f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.assistant.p3897e.p3921j.ajr;
import com.google.assistant.p3897e.p3921j.ajt;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.b */
/* compiled from: PG */
public final class C129277b extends C129286k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129279d f355085a;

    /* renamed from: c */
    private Context f355086c;

    /* renamed from: d */
    private final C2393x f355087d = new C2393x(this);

    /* renamed from: e */
    private boolean f355088e;

    @Deprecated
    public C129277b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129279d mo17754z() {
        C129279d dVar = this.f355085a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355088e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108949b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355086c == null) {
            this.f355086c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355086c;
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
        return this.f355087d;
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
            C129264a.m211047a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129279d a = mo17754z();
            C46855i iVar = a.f355093d;
            C129265a aVar = a.f355092c;
            Uri parse = Uri.parse(a.f355091b.f135241b);
            C69664n.m101061g(parse, "sliceUri");
            C71803m.m105043d(((C129271f) aVar).f355063c, (C69585o) null, (C71424ay) null, new C129267b((C129271f) aVar, parse, (C69577g) null), 3);
            iVar.mo50828h(R.id.assistant_slice_card_slice_update, new C129268c((C129271f) aVar, parse), new C129278c(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129264a.m211047a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            int a = ajr.m86309a(mo17754z().f355091b.f135246g);
            if (a != 0) {
                if (a == 3) {
                    view = layoutInflater.inflate(R.layout.assistant_app_actions_slice_card, viewGroup, false);
                    C47831fm.m85019n();
                    return view;
                }
            }
            view = layoutInflater.inflate(R.layout.assistant_default_slice_card, viewGroup, false);
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C129264a.m211047a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C129279d a = mo17754z();
            C129265a aVar = a.f355092c;
            Uri parse = Uri.parse(a.f355091b.f135241b);
            C69664n.m101061g(parse, "sliceUri");
            C71803m.m105043d(((C129271f) aVar).f355063c, (C69585o) null, (C71424ay) null, new C129270e(parse, (C129271f) aVar, (C69577g) null), 3);
            b.close();
            return;
        } catch (Throwable th) {
            C129264a.m211047a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355088e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129264a.m211047a(th, th);
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
            C129264a.m211047a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129279d a = mo17754z();
            C129285j a2 = C129279d.m211075a(view);
            int a3 = ajt.m86310a(a.f355091b.f135243d);
            int i = 1;
            if (a3 == 0) {
                a3 = 1;
            }
            int i2 = a3 - 1;
            if (i2 != 1) {
                i = 2;
                if (i2 == 2) {
                    i = 3;
                }
            }
            a2.mo108937a(i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129264a.m211047a(th, th);
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
            if (!this.f355088e) {
                super.onAttach(context);
                if (this.f355085a == null) {
                    this.f355085a = ((C129280e) mo108952d().mo17653jN()).mo108950Z();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355087d));
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
                C129264a.m211047a(th, th2);
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
