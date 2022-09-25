package com.google.android.apps.search.googleapp.search.voicesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.ao */
/* compiled from: PG */
public final class C138711ao extends C138709am implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138713aq f377275a;

    /* renamed from: c */
    private Context f377276c;

    /* renamed from: d */
    private final C2393x f377277d = new C2393x(this);

    /* renamed from: e */
    private boolean f377278e;

    @Deprecated
    public C138711ao() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C138711ao m225292f(AccountId accountId) {
        C138711ao aoVar = new C138711ao();
        C68324h.m98669f(aoVar);
        C47247a.m84047b(aoVar, accountId);
        return aoVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114491b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f377276c == null) {
            this.f377276c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f377276c;
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
        return this.f377277d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C138713aq mo17754z() {
        C138713aq aqVar = this.f377275a;
        if (aqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f377278e) {
            return aqVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138710an.m225291a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        C47558bi a2;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138713aq j = mo17754z();
            C47558bi a3 = C47831fm.m85006a("VoiceSearchMainFragmentPeer#onCreateView");
            try {
                View inflate = layoutInflater.inflate(R.layout.googleapp_voice_search_top_level_fragment, viewGroup, false);
                inflate.getClass();
                C28306ab abVar = j.f377280b;
                abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(110325)));
                if (j.f377283e) {
                    if (j.mo114495b() == null) {
                        a2 = C47831fm.m85006a("VoiceSearchMainFragmentPeer#maybeAttachSearchBoxTranscriptionFragment");
                        C0154a aVar = new C0154a(j.f377282d.getChildFragmentManager());
                        AccountId accountId = j.f377279a;
                        C138916x xVar = new C138916x();
                        C68324h.m98669f(xVar);
                        C47247a.m84047b(xVar, accountId);
                        aVar.mo511h(R.id.googleapp_voice_search_container, xVar, "SEARCH_BOX_TRANSCRIPTION_FRAGMENT", 1);
                        aVar.mo509f();
                        a2.close();
                    }
                } else if (j.mo114494a() == null) {
                    a = C47831fm.m85006a("VoiceSearchMainFragmentPeer#maybeAttachRecordAudioFragment");
                    C0154a aVar2 = new C0154a(j.f377282d.getChildFragmentManager());
                    AccountId accountId2 = j.f377279a;
                    C138789d dVar = new C138789d();
                    C68324h.m98669f(dVar);
                    C47247a.m84047b(dVar, accountId2);
                    aVar2.mo689v(R.id.googleapp_voice_search_container, dVar, "RecordAudioFragmentPeer");
                    aVar2.mo509f();
                    a.close();
                }
                C139708c cVar = j.f377281c;
                C37258g gVar = C37182a.f98116gd;
                C69664n.m101060f(gVar, "GOOGLEAPP_VOICE_SEARCH_MAIN_FRAGMENT_CREATED");
                cVar.mo115177d(gVar);
                a3.close();
                C47831fm.m85019n();
                return inflate;
                throw th;
                throw th;
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C138710an.m225291a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f377278e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138710an.m225291a(th, th);
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
            C138710an.m225291a(th, th);
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
            if (!this.f377278e) {
                super.onAttach(context);
                if (this.f377275a == null) {
                    Object jN = mo114490a().mo17653jN();
                    boolean lR = ((C74176nj) jN).f206730b.f198027a.mo67157lR();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                    C139708c cVar = (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138711ao) {
                        C138711ao aoVar = (C138711ao) fragment;
                        C68225k.m98532d(aoVar);
                        this.f377275a = new C138713aq(lR, accountId, abVar, cVar, aoVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f377277d));
                    } else {
                        String obj = C138713aq.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C138710an.m225291a(th, th2);
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
