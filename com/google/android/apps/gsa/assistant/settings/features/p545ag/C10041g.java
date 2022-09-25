package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C9985a;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C9997m;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10028e;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10029f;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.staticplugins.nga.p8098w.p8099a.C104231e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18519g;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18521i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4538j.p4539a.C59306d;
import com.google.common.p4538j.p4539a.C59310h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.g */
/* compiled from: PG */
public final class C10041g extends C10037c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10054t f34261a;

    /* renamed from: c */
    private Context f34262c;

    /* renamed from: d */
    private final C2393x f34263d = new C2393x(this);

    /* renamed from: e */
    private boolean f34264e;

    @Deprecated
    public C10041g() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18198b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34262c == null) {
            this.f34262c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34262c;
    }

    /* renamed from: f */
    public final C10054t mo17754z() {
        C10054t tVar = this.f34261a;
        if (tVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34264e) {
            return tVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f34263d;
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
            C10040f.m24825a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10054t f = mo17754z();
            C73778a.m108339b(f.f34290l);
            View inflate = layoutInflater.inflate(R.layout.guacamole_context_settings_fragment, viewGroup, false);
            f.f34287i.mo33801b(inflate, f.f34288j.mo33805a(C28427h.m53115a(127336)));
            int i = ItemView.a;
            TextView d = inflate.findViewById(R.id.guacamole_settings_description).d();
            String x = f.f34284f.mo79758x(C90126fx.f251784po);
            if (!C58837ba.m90859h(x)) {
                Resources resources = f.f34290l.getResources();
                String string = resources.getString(R.string.guacamole_settings_description);
                String string2 = resources.getString(R.string.guacamole_settings_link_content_description);
                d.setContentDescription(string + " " + string2);
                C58528ij ijVar = C59306d.f157466a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                if (!"a".matches("[a-z0-9-]+")) {
                    throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
                } else if (!C59306d.f157466a.contains("a")) {
                    C59306d.m92152c(C59310h.m92153a(x), "a", linkedHashMap);
                    C59306d.m92151b(resources.getString(R.string.guacamole_settings_link_text), "a", arrayList);
                    d.append(Html.fromHtml("<br>".concat(C59306d.m92150a("a", linkedHashMap, arrayList).f157465a), 63));
                    d.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    throw new IllegalArgumentException("Element \"a\" is not supported.");
                }
            }
            Resources a = ((C73841bf) f.f34294p.mo27525b()).mo65322a();
            C58528ij b = f.mo18210b();
            C58800sl lA = C10054t.f34283e.values().iterator();
            while (lA.hasNext()) {
                C10053s sVar = (C10053s) lA.next();
                ItemView findViewById = inflate.findViewById(sVar.mo18168a());
                int dimensionPixelSize = f.f34290l.getResources().getDimensionPixelSize(R.dimen.guacamole_settings_textview_spacing);
                findViewById.e().setPadding(dimensionPixelSize, 0, 0, 0);
                TextView d2 = findViewById.d();
                d2.setPadding(dimensionPixelSize, 0, 0, 0);
                d2.setText(a.getText(sVar.mo18169b()));
                d2.setVisibility(0);
                findViewById.setEnabled(false);
                findViewById.setVisibility(true != sVar.mo18209f(b) ? 8 : 0);
                Switch t = findViewById.t();
                t.setChecked(false);
                f.f34287i.mo33801b(t, f.f34288j.mo33805a(C28427h.m53115a(sVar.mo18170c())));
            }
            C18521i a2 = C18521i.m35984a(f.f34291m.f52484d);
            if (a2 == null) {
                a2 = C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED;
            }
            C58528ij F = C58528ij.m90006F(new C62963cj(f.f34291m.f52483b, C18519g.f52479c));
            a2.name();
            C58528ij ijVar2 = (C58528ij) Collection.EL.stream(C10054t.f34283e.values()).filter(new C10042h(F)).collect(C58370cn.f155947b);
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                f.mo18211c(ijVar2, true);
            } else if (ordinal == 2) {
                f.mo18211c(ijVar2, false);
            } else if (ordinal != 3) {
                a2.name();
            } else {
                f.f34295q = (C58485gu) Collection.EL.stream(ijVar2).map(new C10048n(inflate)).collect(C58370cn.f155946a);
            }
            C46801dp dpVar = f.f34286h;
            C9985a aVar = f.f34289k;
            dpVar.mo50707a(new C46719bc(((C10029f) ((C9997m) aVar).f34185e).f34236b, new C10028e(((C9997m) aVar).f34187g), C10029f.f34235a), new C10050p(f, inflate));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C10040f.m24825a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34264e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10040f.m24825a(th, th);
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
            C10040f.m24825a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            Collection.EL.stream(mo17754z().f34295q).forEach(C10047m.f34270a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10040f.m24825a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C10056v.class, new C10055u(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C10054t f = mo17754z();
            C58800sl lA = C10054t.f34283e.values().iterator();
            while (lA.hasNext()) {
                C10053s sVar = (C10053s) lA.next();
                int a = sVar.mo18168a();
                int i = ItemView.a;
                Switch t = view.findViewById(a).t();
                t.setOnClickListener(new C10049o(f, t, sVar));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10040f.m24825a(th, th);
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

    /* JADX WARNING: type inference failed for: r11v0, types: [com.google.android.apps.gsa.assistant.settings.features.ag.a.a, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f34264e) {
                super.onAttach(context);
                if (this.f34261a == null) {
                    Object jN = mo18197a().mo17653jN();
                    C90021c cVar = (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                    C28443m mVar = (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b();
                    C46801dp dpVar = (C46801dp) ((C74178nm) jN).f207138e.mo17428b();
                    C28306ab abVar = (C28306ab) ((C74178nm) jN).f207130a.a.f202880fS.mo17428b();
                    C28310af afVar = (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b();
                    ? jY = ((C74178nm) jN).f207130a.a.mo68538jY();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10041g) {
                        C10041g gVar = (C10041g) fragment;
                        C68225k.m98532d(gVar);
                        C104231e cX = ((C74178nm) jN).f207130a.a.mo68166cX();
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C18519g gVar2 = (C18519g) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C18519g.f52480e, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(gVar2);
                        this.f34261a = new C10054t(cVar, mVar, dpVar, abVar, afVar, jY, gVar, cX, gVar2, ((C74178nm) jN).f207130a.aG(), (ProxyIntentStarter) ((C74178nm) jN).f207130a.kP.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207136c.f205646cp));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34263d));
                    } else {
                        String obj = C10054t.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C10040f.m24825a(th2, th3);
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
