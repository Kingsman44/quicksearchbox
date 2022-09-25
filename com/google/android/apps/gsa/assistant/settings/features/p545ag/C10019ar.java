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
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81011b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.button.MaterialButton;
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
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4538j.p4539a.C59306d;
import com.google.common.p4538j.p4539a.C59310h;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.ar */
/* compiled from: PG */
public final class C10019ar extends C10039e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10022au f34217a;

    /* renamed from: c */
    private Context f34218c;

    /* renamed from: d */
    private final C2393x f34219d = new C2393x(this);

    /* renamed from: e */
    private boolean f34220e;

    @Deprecated
    public C10019ar() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18186b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34218c == null) {
            this.f34218c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34218c;
    }

    /* renamed from: f */
    public final C10022au mo17754z() {
        C10022au auVar = this.f34217a;
        if (auVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34220e) {
            return auVar;
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
        return this.f34219d;
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
            C10018aq.m24795a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10022au f = mo17754z();
            C73778a.m108339b(f.f34225c);
            View inflate = layoutInflater.inflate(R.layout.guacamole_context_settings_zero_state_fragment, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.guacamole_settings_unavailable_description);
            C81011b a = f.f34226d.mo74776a();
            a.name();
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                i = R.string.guacamole_settings_unavailable_account_description;
            } else if (ordinal != 11) {
                i = R.string.guacamole_settings_unavailable_device_description;
                if (!(ordinal == 2 || ordinal == 3)) {
                    if (ordinal == 4) {
                        i = R.string.guacamole_settings_unavailable_locale_description_v2;
                    } else if (ordinal == 6) {
                        i = R.string.guacamole_settings_unavailable_data_description;
                    } else if (ordinal != 7) {
                        if (ordinal != 8) {
                            ((C58970a) ((C58970a) C10022au.f34223a.mo56226d()).mo56372aa(984)).mo56389s("#MWW No predefined messages for %s, falling back to DEVICE_UNSUPPORTED message.", a);
                        } else {
                            i = R.string.guacamole_settings_unavailable_multilang_description;
                        }
                    }
                }
            } else {
                i = R.string.guacamole_settings_unavailable_work_profile_description;
            }
            textView.setText(i);
            String x = f.f34224b.mo79758x(C90126fx.f251784po);
            if (!C58837ba.m90859h(x)) {
                Resources resources = f.f34225c.getResources();
                String string = resources.getString(i);
                String string2 = resources.getString(R.string.guacamole_settings_link_content_description);
                textView.setContentDescription(string + " " + string2);
                C58528ij ijVar = C59306d.f157466a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                if (!"a".matches("[a-z0-9-]+")) {
                    throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
                } else if (!C59306d.f157466a.contains("a")) {
                    C59306d.m92152c(C59310h.m92153a(x), "a", linkedHashMap);
                    C59306d.m92151b(resources.getString(R.string.guacamole_settings_link_text), "a", arrayList);
                    String str = C59306d.m92150a("a", linkedHashMap, arrayList).f157465a;
                    textView.append(" ");
                    textView.append(Html.fromHtml(str, 63));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    throw new IllegalArgumentException("Element \"a\" is not supported.");
                }
            }
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.guacamole_settings_unavailable_button);
            C81011b a2 = f.f34226d.mo74776a();
            if (a2 == C81011b.LOCALE_UNSUPPORTED || a2 == C81011b.NGA_ON_DEVICE_DISABLED) {
                ((C58970a) ((C58970a) C10022au.f34223a.mo56224b()).mo56372aa(985)).mo56389s("#MWW Adding deep link button to Assistant Language Settings. %s", a2);
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new C10021at(f));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C10018aq.m24795a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34220e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10018aq.m24795a(th, th);
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
            C10018aq.m24795a(th, th);
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
            if (!this.f34220e) {
                super.onAttach(context);
                if (this.f34217a == null) {
                    Object jN = mo18203a().mo17653jN();
                    C91090a aVar = (C91090a) ((C74178nm) jN).f207136c.f205763f.mo17428b();
                    C90021c cVar = (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10019ar) {
                        C10019ar arVar = (C10019ar) fragment;
                        C68225k.m98532d(arVar);
                        this.f34217a = new C10022au(aVar, cVar, arVar, ((C74178nm) jN).f207130a.a.mo68166cX());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34219d));
                    } else {
                        String obj = C10022au.class.toString();
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
                C10018aq.m24795a(th, th2);
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
