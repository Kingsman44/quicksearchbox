package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
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
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p4008y.p4009a.C53616y;
import com.google.assistant.p4008y.p4009a.C53617z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.g */
/* compiled from: PG */
public final class C127852g extends C127843aa implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C127855j f351889a;

    /* renamed from: c */
    private Context f351890c;

    /* renamed from: d */
    private final C2393x f351891d = new C2393x(this);

    /* renamed from: e */
    private boolean f351892e;

    @Deprecated
    public C127852g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C127855j mo17754z() {
        C127855j jVar = this.f351889a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f351892e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108239b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f351890c == null) {
            this.f351890c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f351890c;
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
        return this.f351891d;
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
            C127851f.m208910a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        C46755l lVar;
        ArrayList arrayList;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C127855j a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            inflate = layoutInflater.inflate(R.layout.assistant_learning_center_detailed_page_fragment, viewGroup, false);
            C28306ab abVar = a.f351899f;
            C0167am activity = a.f351904k.getActivity();
            activity.getClass();
            C28313c a2 = a.f351900g.mo33805a(C28427h.m53115a(140132));
            a2.mo33861i(C28439i.f77216b);
            a2.mo33859g(C28375ak.m53061c(142071));
            a2.mo33859g(C45954d.m82060a(a.f351895b));
            int i = C28485y.f77298f;
            C28439i b = abVar.mo33801b(activity.findViewById(16908290), a2);
            C127865t tVar = a.f351902i;
            tVar.getClass();
            tVar.mo108254b(b, C45954d.m82060a(a.f351895b));
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.assistant_learning_center_detailed_page_content);
            viewGroup2.getClass();
            RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.assistant_learning_center_detailed_page_recycler_view);
            a.f351901h = new LinearLayoutManager(a.f351898e);
            LinearLayoutManager linearLayoutManager = a.f351901h;
            linearLayoutManager.getClass();
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setLayerType(2, (Paint) null);
            C127865t tVar2 = a.f351902i;
            tVar2.getClass();
            a.f351903j = tVar2.mo108253a();
            recyclerView.setAdapter(a.f351903j);
            a.f351904k.requireActivity().f2707h.mo3339b(a.f351904k, a.f351906m);
            a.f351897d.mo50708b(a.f351896c.mo50244a(a.f351895b), C46788de.DONT_CARE, new C127854i());
            lVar = a.f351903j;
            lVar.getClass();
            arrayList = new ArrayList();
            a.f351905l = R.raw.detailed_card;
            Context context = a.f351898e;
            context.getClass();
            InputStream openRawResource = context.getResources().openRawResource(a.f351905l);
            C62921ba a3 = C62921ba.m95368a();
            C53616y yVar = (C53616y) C53617z.f140728c.createBuilder();
            C63088z byteString = ((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, openRawResource, a3)).toByteString();
            yVar.copyOnWrite();
            C53617z zVar = (C53617z) yVar.instance;
            byteString.getClass();
            zVar.f140730a |= 1;
            zVar.f140731b = byteString;
            arrayList.add((C53617z) yVar.build());
        } catch (IOException | NullPointerException e) {
            C59104x c = C127855j.f351894a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DpFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37626)).mo56386p("Error while loading OLC data.");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C127851f.m208910a(th, th2);
            }
            throw th;
        }
        lVar.mo50772a(arrayList);
        C47831fm.m85019n();
        return inflate;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f351892e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C127851f.m208910a(th, th);
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
            C127851f.m208910a(th, th);
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
            if (!this.f351892e) {
                super.onAttach(context);
                if (this.f351889a == null) {
                    Object jN = mo108240d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C127852g) {
                        C127852g gVar = (C127852g) fragment;
                        C68225k.m98532d(gVar);
                        this.f351889a = new C127855j(gVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), ((C74176nj) jN).mo70012v());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f351891d));
                    } else {
                        String obj = C127855j.class.toString();
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
                C127851f.m208910a(th, th2);
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
