package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0516an;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.C130591a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53708bf;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62971cq;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.i */
/* compiled from: PG */
public final class C130649i extends C130613af implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130653m f357789a;

    /* renamed from: c */
    private Context f357790c;

    /* renamed from: d */
    private final C2393x f357791d = new C2393x(this);

    /* renamed from: e */
    private boolean f357792e;

    @Deprecated
    public C130649i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130653m mo17754z() {
        C130653m mVar = this.f357789a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357792e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo109754b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357790c == null) {
            this.f357790c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357790c;
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
        return this.f357791d;
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
            C130648h.m213043a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130653m a = mo17754z();
            a.f357803d.mo50429i(a.f357809j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130648h.m213043a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C130653m a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_ambient_feedback_dialog_fragment, viewGroup, false);
            if (a.f357807h.isEmpty()) {
                ((C59052c) ((C59052c) C130653m.f357800a.mo56226d()).mo56372aa(38942)).mo56386p("UserContext is null.");
            } else {
                ((TextView) inflate.findViewById(R.id.assistant_ambient_my_activity_text)).setMovementMethod(LinkMovementMethod.getInstance());
                Spinner spinner = (Spinner) inflate.findViewById(R.id.assistant_ambient_place_type_spinner);
                spinner.setAdapter(new ArrayAdapter(a.f357801b, 17367049, (List) DesugarArrays.stream((T[]) C53691ap.values()).map(C130650j.f357793a).collect(C58370cn.f155946a)));
                ((TextView) inflate.findViewById(R.id.assistant_ambient_place_type_text)).setVisibility(8);
                spinner.setVisibility(8);
                a.f357808i.clear();
                if (((C106596h) a.f357807h.get()).f297214i.isEmpty()) {
                    ((TextView) inflate.findViewById(R.id.assistant_ambient_place_question)).setText(R.string.assistant_ambient_no_places_inferred);
                    RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.assistant_ambient_place_radio);
                    C0516an anVar = new C0516an(a.f357801b, (AttributeSet) null);
                    anVar.setId(R.id.assistant_ambient_yes_empty);
                    anVar.setText(R.string.assistant_ambient_yes_empty);
                    radioGroup.addView(anVar);
                    C0516an anVar2 = new C0516an(a.f357801b, (AttributeSet) null);
                    anVar2.setId(R.id.assistant_ambient_no_empty);
                    anVar2.setText(R.string.assistant_ambient_no_empty);
                    radioGroup.addView(anVar2);
                    radioGroup.setOnCheckedChangeListener(new C130651k(anVar2, (TextView) inflate.findViewById(R.id.assistant_ambient_place_type_text), (Spinner) inflate.findViewById(R.id.assistant_ambient_place_type_spinner)));
                } else {
                    C62971cq<C53708bf> cqVar = ((C106596h) a.f357807h.get()).f297214i;
                    ((TextView) inflate.findViewById(R.id.assistant_ambient_place_question)).setText(R.string.assistant_ambient_are_you_at_place);
                    RadioGroup radioGroup2 = (RadioGroup) inflate.findViewById(R.id.assistant_ambient_place_radio);
                    Stream.Builder builder = Stream.CC.builder();
                    Stream.Builder builder2 = Stream.CC.builder();
                    Stream.Builder builder3 = Stream.CC.builder();
                    for (C53708bf bfVar : cqVar) {
                        C53692aq aqVar = bfVar.f140996c;
                        if (aqVar == null) {
                            aqVar = C53692aq.f140937k;
                        }
                        if ((aqVar.f140939a & 1) != 0) {
                            builder2.add(bfVar);
                        } else {
                            builder3.add(bfVar);
                        }
                    }
                    C58487gw gwVar = (C58487gw) builder2.build().collect(C58370cn.m89401a(C130664w.f357819a, C130665x.f357820a));
                    Collection.EL.stream(gwVar.map.keySet()).forEach(new C130666y(gwVar, builder, builder3));
                    Collection.EL.stream(((HashMap) builder3.build().collect(Collectors.groupingBy(C130667z.f357824a, C130608aa.f357716a, C58370cn.f155946a))).values()).map(C130609ab.f357717a).forEach(builder);
                    C58485gu guVar = (C58485gu) builder.build().sorted(Comparator.CC.comparing(C130659r.f357814a)).map(C130660s.f357815a).collect(C58370cn.f155946a);
                    int size = guVar.size();
                    for (int i = 0; i < size; i++) {
                        List list = (List) guVar.get(i);
                        C0516an anVar3 = new C0516an(a.f357801b, (AttributeSet) null);
                        C53692aq aqVar2 = (C53692aq) list.get(0);
                        C53691ap a2 = C53691ap.m86884a(aqVar2.f140943e);
                        if (a2 == null) {
                            a2 = C53691ap.UNSPECIFIED;
                        }
                        int ordinal = a2.ordinal();
                        if (ordinal == 4) {
                            str = a.f357801b.getString(R.string.assistant_ambient_feedback_home);
                        } else if (ordinal != 5) {
                            str = aqVar2.f140944f;
                        } else {
                            str = a.f357801b.getString(R.string.assistant_ambient_feedback_work);
                        }
                        anVar3.setText(str);
                        radioGroup2.addView(anVar3);
                        a.f357808i.put(Integer.valueOf(anVar3.getId()), list);
                    }
                    C0516an anVar4 = new C0516an(a.f357801b, (AttributeSet) null);
                    anVar4.setId(R.id.assistant_ambient_no_place_of_interest);
                    anVar4.setText(R.string.assistant_ambient_no_place_of_interest);
                    radioGroup2.addView(anVar4);
                    C0516an anVar5 = new C0516an(a.f357801b, (AttributeSet) null);
                    anVar5.setId(R.id.assistant_ambient_none_of_the_above);
                    anVar5.setText(R.string.assistant_ambient_none_of_the_above);
                    radioGroup2.addView(anVar5);
                    radioGroup2.setOnCheckedChangeListener(new C130652l(anVar5, (TextView) inflate.findViewById(R.id.assistant_ambient_place_type_text), (Spinner) inflate.findViewById(R.id.assistant_ambient_place_type_spinner)));
                }
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130648h.m213043a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357792e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130648h.m213043a(th, th);
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
            C130648h.m213043a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_ambient_save_button), new C130657p(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130648h.m213043a(th, th);
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
            if (!this.f357792e) {
                super.onAttach(context);
                if (this.f357789a == null) {
                    Object jN = mo109755d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C130649i) {
                        C130649i iVar = (C130649i) fragment;
                        C68225k.m98532d(iVar);
                        this.f357789a = new C130653m(context2, activity, iVar, (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C38469m) ((C74176nj) jN).f206730b.f199083v.mo17428b(), ((C74176nj) jN).f206730b.mo66083bc(), (C130591a) ((C74176nj) jN).f206730b.f198140cG.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357791d));
                    } else {
                        String obj = C130653m.class.toString();
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
                C130648h.m213043a(th, th2);
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
