package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127390b;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127392d;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127393e;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127375b;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.p9583a.C127373a;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.p9583a.C127374b;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9588c.C127387a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127448f;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46459k;
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
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.g */
/* compiled from: PG */
public final class C127399g extends C127403k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C127400h f350802a;

    /* renamed from: c */
    private Context f350803c;

    /* renamed from: d */
    private final C2393x f350804d = new C2393x(this);

    /* renamed from: e */
    private boolean f350805e;

    @Deprecated
    public C127399g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C127400h mo17754z() {
        C127400h hVar = this.f350802a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f350805e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108049b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f350803c == null) {
            this.f350803c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f350803c;
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
        return this.f350804d;
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
            C127398f.m208339a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C127379d dVar;
        C127383h hVar;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C127400h a = mo17754z();
            C127381f fVar = a.f350809d;
            int i = fVar.f350767a;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    C127390b bVar = a.f350808c;
                    if (i == 1) {
                        dVar = (C127379d) fVar.f350768b;
                    } else {
                        dVar = C127379d.f350760d;
                    }
                    String path = Uri.parse(dVar.f350764c).getPath();
                    if (C127393e.m208332a(path)) {
                        ((C59052c) ((C59052c) C127390b.f350790a.mo56226d()).mo56372aa(37439)).mo56386p("No deeplinkPath provided, skip deeplink data conversion.");
                    } else {
                        String a2 = C127387a.m208324a(path);
                        C69464a aVar = (C69464a) bVar.f350793d.get(a2);
                        if (aVar == null) {
                            ((C59052c) ((C59052c) C127390b.f350790a.mo56226d()).mo56372aa(37438)).mo56389s("No deeplink data converter found for given key %s", a2);
                        } else {
                            C127375b a3 = ((C127373a) aVar.mo17428b()).mo108038a(dVar);
                            if (a3.f350747a == 1) {
                                C127418e eVar = (C127418e) a3.f350748b;
                            } else {
                                C127418e eVar2 = C127418e.f350849g;
                            }
                            C46459k.m82829b(bVar.f350792c.mo108045a(a3), "Failed to send deeplink entry request for deeplink data", new Object[0]);
                        }
                    }
                } else if (i3 == 1) {
                    C127390b bVar2 = a.f350808c;
                    if (i == 2) {
                        hVar = (C127383h) fVar.f350768b;
                    } else {
                        hVar = C127383h.f350769e;
                    }
                    String str = hVar.f350772b;
                    Context context = bVar2.f350791b;
                    if (TextUtils.isEmpty(str)) {
                        ((C59052c) ((C59052c) C127393e.f350798a.mo56226d()).mo56372aa(37446)).mo56386p("No Calling package name provided.");
                    } else if (C143701ac.m233450a(context).mo119084c(str)) {
                        String path2 = Uri.parse(hVar.f350773c).getPath();
                        if (C127393e.m208332a(path2)) {
                            ((C59052c) ((C59052c) C127390b.f350790a.mo56226d()).mo56372aa(37442)).mo56386p("No deeplink path provided, skip legacy session deeplink data conversion.");
                        } else {
                            C69464a aVar2 = (C69464a) bVar2.f350794e.get(path2);
                            if (aVar2 == null) {
                                ((C59052c) ((C59052c) C127390b.f350790a.mo56226d()).mo56372aa(37441)).mo56389s("No legacy session deeplink data converter found for given key %s", path2);
                            } else {
                                C127375b a4 = ((C127374b) aVar2.mo17428b()).mo108040a();
                                if (a4.f350747a == 1) {
                                    C127418e eVar3 = (C127418e) a4.f350748b;
                                } else {
                                    C127418e eVar4 = C127418e.f350849g;
                                }
                                C46459k.m82829b(bVar2.f350792c.mo108045a(a4), "Failed to send deeplink entry request for session deeplink data", new Object[0]);
                            }
                        }
                    }
                    ((C59052c) ((C59052c) C127390b.f350790a.mo56225c()).mo56372aa(37443)).mo56389s("Untrusted calling package : %s for session deeplink data.", hVar.f350772b);
                } else if (i3 == 2) {
                    ((C59052c) ((C59052c) C127400h.f350806a.mo56225c()).mo56372aa(37430)).mo56386p("deeplink data type must be specified.");
                }
                C0167am activity = a.f350807b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                C47831fm.m85019n();
                return;
            }
            throw null;
        } catch (Throwable th) {
            C127398f.m208339a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f350805e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C127398f.m208339a(th, th);
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
            C127398f.m208339a(th, th);
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
            if (!this.f350805e) {
                super.onAttach(context);
                if (this.f350802a == null) {
                    Object jN = mo108051d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C127399g) {
                        C127399g gVar = (C127399g) fragment;
                        C68225k.m98532d(gVar);
                        C127392d dVar = new C127392d((C127448f) ((C74176nj) jN).f206730b.f198027a.f199330cw.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b());
                        aso aso = ((C74176nj) jN).f206677a.d;
                        C127390b bVar = new C127390b((Context) ((C74176nj) jN).f206677a.g.mo17428b(), dVar, C58495hd.m89901o("/services/invoke", aso.f201585br, "/interpreter", aso.f201586bs), C58729pv.f156485a);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C127381f fVar = (C127381f) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C127381f.f350765c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(fVar);
                        this.f350802a = new C127400h(gVar, bVar, fVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f350804d));
                    } else {
                        String obj = C127400h.class.toString();
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
                C127398f.m208339a(th, th2);
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
