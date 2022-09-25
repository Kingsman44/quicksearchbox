package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.C129180b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129245h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129246i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C52128gg;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.t */
/* compiled from: PG */
public final class C129378t extends C129358ao implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129379u f355291a;

    /* renamed from: c */
    private Context f355292c;

    /* renamed from: d */
    private final C2393x f355293d = new C2393x(this);

    /* renamed from: e */
    private boolean f355294e;

    @Deprecated
    public C129378t() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129379u mo17754z() {
        C129379u uVar = this.f355291a;
        if (uVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355294e) {
            return uVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108989b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355292c == null) {
            this.f355292c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355292c;
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
        return this.f355293d;
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
            C129377s.m211222a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C129364f fVar;
        C129360b bVar;
        C129360b bVar2;
        C129360b bVar3;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129379u a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            FragmentManager childFragmentManager = a.f355295a.getChildFragmentManager();
            if (childFragmentManager.f634a.mo670b(R.id.assistant_device_setting_error_text) == null) {
                C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
                String str = a.f355297c.f355289d;
                guVar.copyOnWrite();
                C52003hb hbVar = (C52003hb) guVar.instance;
                str.getClass();
                hbVar.f136478a |= 1;
                hbVar.f136479b = str;
                guVar.copyOnWrite();
                C52003hb hbVar2 = (C52003hb) guVar.instance;
                hbVar2.f136480c = 1;
                hbVar2.f136478a |= 2;
                C52003hb hbVar3 = (C52003hb) guVar.build();
                C0154a aVar = new C0154a(childFragmentManager);
                AccountId accountId = a.f355296b;
                C129245h hVar = (C129245h) C129246i.f355015d.createBuilder();
                hVar.copyOnWrite();
                C129246i iVar = (C129246i) hVar.instance;
                hbVar3.getClass();
                iVar.f355018b = hbVar3;
                iVar.f355017a |= 1;
                aVar.mo511h(R.id.assistant_device_setting_error_text, C129244g.m211012f(accountId, (C129246i) hVar.build()), (String) null, 1);
                aVar.mo509f();
            }
            if (childFragmentManager.f634a.mo670b(R.id.assistant_device_setting_error_setting_snippet) == null) {
                int i = a.f355297c.f355287b;
                if (i == 5) {
                    C52128gg ggVar = (C52128gg) C52131gj.f136789h.createBuilder();
                    C129374p pVar = a.f355297c;
                    if (pVar.f355287b == 5) {
                        bVar = (C129360b) pVar.f355288c;
                    } else {
                        bVar = C129360b.f355262e;
                    }
                    String str2 = bVar.f355265b;
                    ggVar.copyOnWrite();
                    C52131gj gjVar = (C52131gj) ggVar.instance;
                    str2.getClass();
                    gjVar.f136791a |= 16;
                    gjVar.f136796f = str2;
                    C129374p pVar2 = a.f355297c;
                    if (pVar2.f355287b == 5) {
                        bVar2 = (C129360b) pVar2.f355288c;
                    } else {
                        bVar2 = C129360b.f355262e;
                    }
                    String str3 = bVar2.f355267d;
                    ggVar.copyOnWrite();
                    C52131gj gjVar2 = (C52131gj) ggVar.instance;
                    str3.getClass();
                    gjVar2.f136791a |= 2;
                    gjVar2.f136793c = str3;
                    C129374p pVar3 = a.f355297c;
                    if (pVar3.f355287b == 5) {
                        bVar3 = (C129360b) pVar3.f355288c;
                    } else {
                        bVar3 = C129360b.f355262e;
                    }
                    String str4 = bVar3.f355266c;
                    ggVar.copyOnWrite();
                    C52131gj gjVar3 = (C52131gj) ggVar.instance;
                    str4.getClass();
                    gjVar3.f136791a |= 32;
                    gjVar3.f136797g = str4;
                    ggVar.copyOnWrite();
                    C52131gj gjVar4 = (C52131gj) ggVar.instance;
                    gjVar4.f136795e = 0;
                    gjVar4.f136791a |= 8;
                    C0154a aVar2 = new C0154a(childFragmentManager);
                    aVar2.mo511h(R.id.assistant_device_setting_error_setting_snippet, C129180b.m210881a(a.f355296b, (C52131gj) ggVar.build()), (String) null, 1);
                    aVar2.mo509f();
                } else if (i == 6) {
                    C0154a aVar3 = new C0154a(childFragmentManager);
                    AccountId accountId2 = a.f355296b;
                    C129374p pVar4 = a.f355297c;
                    if (pVar4.f355287b == 6) {
                        fVar = (C129364f) pVar4.f355288c;
                    } else {
                        fVar = C129364f.f355269f;
                    }
                    C129368j jVar = new C129368j();
                    C68324h.m98669f(jVar);
                    C47247a.m84047b(jVar, accountId2);
                    C47243l.m84039a(jVar, fVar);
                    aVar3.mo511h(R.id.assistant_device_setting_error_setting_snippet, jVar, (String) null, 1);
                    aVar3.mo509f();
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129377s.m211222a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.assistant_device_setting_error, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129377s.m211222a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355294e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129377s.m211222a(th, th);
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
            C129377s.m211222a(th, th);
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
            if (!this.f355294e) {
                super.onAttach(context);
                if (this.f355291a == null) {
                    this.f355291a = ((C129380v) mo108990d().mo17653jN()).mo109010an();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355293d));
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
                C129377s.m211222a(th, th2);
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
