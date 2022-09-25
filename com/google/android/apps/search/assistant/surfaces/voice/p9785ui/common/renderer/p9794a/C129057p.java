package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C39991aa;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57743g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.hilt.p5299a.C68288b;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.p */
/* compiled from: PG */
public final class C129057p extends C129042ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129058q f354542a;

    /* renamed from: c */
    private Context f354543c;

    /* renamed from: d */
    private final C2393x f354544d = new C2393x(this);

    /* renamed from: e */
    private boolean f354545e;

    @Deprecated
    public C129057p() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129058q mo17754z() {
        C129058q qVar = this.f354542a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354545e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108820b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354543c == null) {
            this.f354543c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354543c;
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
        return this.f354544d;
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
            C129056o.m210664a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129056o.m210664a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_response_content_card, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129056o.m210664a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C129061t tVar = mo17754z().f354549d;
            ((C59052c) ((C59052c) C129037ak.f354499a.mo56224b()).mo56372aa(38118)).mo56386p("#MediaStateObserverImpl, unsubscribe from RequestContextMonitor.");
            if (((C129037ak) tVar).f354504f.isPresent()) {
                ((C129037ak) tVar).f354503e.mo40466c((C36908b) ((C129037ak) tVar).f354504f.get());
            }
            b.close();
            return;
        } catch (Throwable th) {
            C129056o.m210664a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354545e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129056o.m210664a(th, th);
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
            C129056o.m210664a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r6v13, types: [com.google.android.libraries.search.assistant.y.g.a.c, com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.t] */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        C57778j jVar;
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129058q a = mo17754z();
            a.f354546a.mo32553l();
            C21196h hVar = new C21196h(a.f354547b.getContext(), a.f354546a.mo32548g().mo26713a());
            C39991aa l = a.f354546a.mo32553l();
            C54201r rVar = a.f354548c.f354524b;
            if (rVar == null) {
                rVar = C54201r.f142243f;
            }
            C62940bt r3 = C62942bv.checkIsLite(C54192i.f142222b);
            rVar.mo58887l(r3);
            Object l2 = rVar.f169962ag.mo58854l(r3.f169971d);
            if (l2 == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l2);
            }
            l.mo42108a(hVar, (C57784p) obj);
            ((ViewGroup) view).addView(hVar);
            view.setPaddingRelative(a.mo108831a(R.dimen.assistant_eml_card_padding_left), a.mo108831a(R.dimen.assistant_eml_card_padding_top), a.mo108831a(R.dimen.assistant_eml_card_padding_right), a.mo108831a(R.dimen.assistant_eml_card_padding_bottom));
            C54201r rVar2 = a.f354548c.f354524b;
            if (rVar2 == null) {
                rVar2 = C54201r.f142243f;
            }
            C62940bt r0 = C62942bv.checkIsLite(C54192i.f142222b);
            rVar2.mo58887l(r0);
            Object l3 = rVar2.f169962ag.mo58854l(r0.f169971d);
            if (l3 == null) {
                obj2 = r0.f169969b;
            } else {
                obj2 = r0.mo58889c(l3);
            }
            C57776h hVar2 = ((C57784p) obj2).f154387d;
            if (hVar2 == null) {
                hVar2 = C57776h.f154365b;
            }
            Iterator it = hVar2.f154367a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = null;
                    break;
                }
                jVar = (C57778j) it.next();
                C57780l lVar = jVar.f154373c;
                if (lVar == null) {
                    lVar = C57780l.f154376c;
                }
                C62940bt r2 = C62942bv.checkIsLite(C57743g.f154270c);
                lVar.mo58887l(r2);
                if (lVar.f169962ag.mo58857o(r2.f169971d)) {
                    break;
                }
            }
            if (jVar != null) {
                ? r6 = a.f354549d;
                r6.f354504f = r6.f354503e.mo40464a(C36910d.MEDIA_CONTEXT_CHANGE, r6);
                r6.f354505g = C58833ax.m90834k(jVar);
                C58833ax b = r6.mo108812b();
                if (b.mo56113h()) {
                    r6.f354506h = b;
                    ((C129037ak) r6).mo108813d((MediaController) b.mo56107c());
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129056o.m210664a(th, th);
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
            if (!this.f354545e) {
                super.onAttach(context);
                if (this.f354542a == null) {
                    this.f354542a = ((C129059r) mo108821d().mo17653jN()).mo108832U();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354544d));
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
                C129056o.m210664a(th, th2);
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
