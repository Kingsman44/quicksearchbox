package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12972ad;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12980al;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12981am;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12968d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13021ai;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13022aj;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.p892a.C13172a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apb;
import com.google.assistant.p3897e.p3921j.apc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.voiceplate.FusionVoicePlateFragment */
/* compiled from: PG */
public final class FusionVoicePlateFragment extends C13182i implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C13174b f40779a;

    /* renamed from: c */
    private Context f40780c;

    /* renamed from: d */
    private final C2393x f40781d = new C2393x(this);

    /* renamed from: e */
    private boolean f40782e;

    @Deprecated
    public FusionVoicePlateFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C13174b mo17754z() {
        C13174b bVar = this.f40779a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f40782e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo20947b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f40780c == null) {
            this.f40780c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f40780c;
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
        return this.f40781d;
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
            C13171a.m29399a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C13174b a = mo17754z();
            a.f40793f.mo19974a(C37179a.f97579cs);
            a.f40794g.mo50828h(R.id.fusion_voice_plate_voice_plate_state_subscription, a.f40790c.mo20325a(), a.f40795h);
            a.f40794g.mo50828h(R.id.fusion_voice_plate_remote_actions_ui_resp_subscription, a.f40791d.mo20884a(), a.f40797j);
            a.f40794g.mo50828h(R.id.fusion_voice_plate_remote_actions_voice_resp_subscription, a.f40791d.mo20885b(), a.f40798k);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C13171a.m29399a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C13174b a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f40793f.mo19974a(C37179a.f97580ct);
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fusion_voice_plate_fragment, viewGroup, false);
            a.f40792e.mo50707a(a.f40802o.mo23062a(), a.f40796i);
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C13171a.m29399a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            b.close();
            return;
        } catch (Throwable th) {
            C13171a.m29399a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f40782e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C13171a.m29399a(th, th);
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
            C13171a.m29399a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        Throwable th;
        C12986d dVar;
        C12981am amVar;
        C58833ax axVar;
        C12989g gVar;
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C13174b a = mo17754z();
            View view = a.f40789b.getView();
            view.getClass();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.voice_plate_view_stub);
            if (viewStub == null) {
                C59104x d = C13174b.f40784a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FusionVPFragment");
                ((C59052c) ((C59052c) d).mo56372aa(44673)).mo56386p("Start VoicePlate called when stub is missing, cancel any existing requests and dismiss");
                a.f40790c.mo20326b();
                a.f40791d.mo20887d();
                C47393f.m84237h(new C13172a(false), view);
            } else {
                Intent a2 = a.f40813z.mo20174a();
                C58976aa aaVar = C58975e.f156826a;
                if (a2 == null) {
                    C59104x d2 = C13174b.f40784a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "FusionVPFragment");
                    ((C59052c) ((C59052c) d2).mo56372aa(44651)).mo56386p("No Intent found in the voice plate fragment host.");
                    dVar = a.f40813z.mo20175b();
                } else {
                    if (((Boolean) a.f40807t.mo17428b()).booleanValue()) {
                        long c = a.f40805r.mo26871c();
                        Uri data = a2.getData();
                        if (data == null || (!C12968d.m29211c(data) && !C12968d.m29212d(data))) {
                            axVar = C58836b.f156633a;
                        } else {
                            String stringExtra = a2.getStringExtra("android.intent.extra.REFERRER");
                            if (stringExtra == null) {
                                stringExtra = "unknown";
                            }
                            String path = data.getPath();
                            if (path != null && C12968d.m29211c(data)) {
                                path = path.substring(4);
                            }
                            Uri build = data.buildUpon().scheme("https").authority("assistant.google.com").path(path).build();
                            apb apb = (apb) apc.f135542e.createBuilder();
                            build.getClass();
                            String uri = build.toString();
                            apb.copyOnWrite();
                            apc apc = (apc) apb.instance;
                            uri.getClass();
                            apc.f135544a |= 1;
                            apc.f135545b = uri;
                            apb.copyOnWrite();
                            apc apc2 = (apc) apb.instance;
                            apc2.f135544a |= 4;
                            apc2.f135546c = stringExtra;
                            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                            jzVar.copyOnWrite();
                            C52230ka kaVar = (C52230ka) jzVar.instance;
                            kaVar.f137059a |= 1;
                            kaVar.f137060b = "assistant.api.client_input.UrlIntentInput";
                            C63088z byteString = ((apc) apb.build()).toByteString();
                            jzVar.copyOnWrite();
                            C52230ka kaVar2 = (C52230ka) jzVar.instance;
                            byteString.getClass();
                            kaVar2.f137059a |= 2;
                            kaVar2.f137061c = byteString;
                            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                            dsVar.copyOnWrite();
                            C51805du duVar = (C51805du) dsVar.instance;
                            duVar.f135926a |= 1;
                            duVar.f135927b = "url.INTENT";
                            dsVar.mo53729a("url_intent_input", (C52230ka) jzVar.build());
                            C51805du duVar2 = (C51805du) dsVar.build();
                            if (C12968d.m29211c(data)) {
                                gVar = C12989g.AUTO_PROJECTED;
                            } else if (C12968d.m29212d(data)) {
                                gVar = C12989g.AUTO_EMBEDDED;
                            } else {
                                gVar = C12989g.UNKNOWN;
                            }
                            C12985c a3 = C12967c.m29204a(gVar, "and.assistant.deeplink", c);
                            C12967c.m29207d(a3, duVar2);
                            axVar = C58833ax.m90834k((C12986d) a3.build());
                        }
                        if (axVar.mo56113h()) {
                            dVar = (C12986d) axVar.mo56107c();
                        }
                    }
                    String stringExtra2 = a2.getStringExtra("query");
                    if (stringExtra2 == null || !((Boolean) a.f40806s.mo17428b()).booleanValue()) {
                        C58833ax a4 = C12968d.m29209a(a2);
                        if (a4.mo56113h()) {
                            a4.mo56107c();
                            C12986d dVar2 = (C12986d) a4.mo56107c();
                            C12985c cVar = (C12985c) dVar2.toBuilder();
                            C12991i iVar = dVar2.f40370d;
                            if (iVar == null) {
                                iVar = C12991i.f40380k;
                            }
                            C12987e eVar = (C12987e) iVar.toBuilder();
                            eVar.copyOnWrite();
                            C12991i iVar2 = (C12991i) eVar.instance;
                            iVar2.f40382a = 2 | iVar2.f40382a;
                            iVar2.f40384c = true;
                            cVar.copyOnWrite();
                            C12986d dVar3 = (C12986d) cVar.instance;
                            C12991i iVar3 = (C12991i) eVar.build();
                            iVar3.getClass();
                            dVar3.f40370d = iVar3;
                            dVar3.f40367a |= 128;
                            dVar = (C12986d) cVar.build();
                        } else if (!a.f40804q.mo56113h() || !a2.hasExtra((String) a.f40804q.mo56107c())) {
                            dVar = a.f40813z.mo20175b();
                        } else {
                            C12986d b = a.f40813z.mo20175b();
                            C12985c cVar2 = (C12985c) b.toBuilder();
                            if (b.f40368b == 1) {
                                amVar = (C12981am) b.f40369c;
                            } else {
                                amVar = C12981am.f40353d;
                            }
                            C12980al alVar = (C12980al) amVar.toBuilder();
                            String stringExtra3 = a2.getStringExtra((String) a.f40804q.mo56107c());
                            stringExtra3.getClass();
                            alVar.copyOnWrite();
                            C12981am amVar2 = (C12981am) alVar.instance;
                            amVar2.f40355a = 2 | amVar2.f40355a;
                            amVar2.f40357c = stringExtra3;
                            C12981am amVar3 = (C12981am) alVar.build();
                            cVar2.copyOnWrite();
                            C12986d dVar4 = (C12986d) cVar2.instance;
                            amVar3.getClass();
                            dVar4.f40369c = amVar3;
                            dVar4.f40368b = 1;
                            dVar = (C12986d) cVar2.build();
                        }
                    } else {
                        C59104x b2 = C13174b.f40784a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "FusionVPFragment");
                        ((C59052c) ((C59052c) b2).mo56372aa(44650)).mo56386p("This is a query with a string extra, so we should send it directly, since it's coming from the command line");
                        C12986d b3 = a.f40813z.mo20175b();
                        C12985c cVar3 = (C12985c) b3.toBuilder();
                        C12991i iVar4 = b3.f40370d;
                        if (iVar4 == null) {
                            iVar4 = C12991i.f40380k;
                        }
                        C12987e eVar2 = (C12987e) iVar4.toBuilder();
                        eVar2.copyOnWrite();
                        C12991i iVar5 = (C12991i) eVar2.instance;
                        iVar5.f40382a |= 2;
                        iVar5.f40384c = true;
                        cVar3.copyOnWrite();
                        C12986d dVar5 = (C12986d) cVar3.instance;
                        C12991i iVar6 = (C12991i) eVar2.build();
                        iVar6.getClass();
                        dVar5.f40370d = iVar6;
                        dVar5.f40367a |= 128;
                        C12972ad adVar = (C12972ad) C12973ae.f40345c.createBuilder();
                        C13018af afVar = (C13018af) C13023ak.f40447c.createBuilder();
                        C13021ai aiVar = (C13021ai) C13022aj.f40443c.createBuilder();
                        aiVar.copyOnWrite();
                        C13022aj ajVar = (C13022aj) aiVar.instance;
                        ajVar.f40445a |= 1;
                        ajVar.f40446b = stringExtra2;
                        C13022aj ajVar2 = (C13022aj) aiVar.build();
                        afVar.copyOnWrite();
                        C13023ak akVar = (C13023ak) afVar.instance;
                        ajVar2.getClass();
                        akVar.f40450b = ajVar2;
                        akVar.f40449a = 1;
                        adVar.copyOnWrite();
                        C12973ae aeVar = (C12973ae) adVar.instance;
                        C13023ak akVar2 = (C13023ak) afVar.build();
                        akVar2.getClass();
                        aeVar.f40348b = akVar2;
                        aeVar.f40347a |= 1;
                        cVar3.copyOnWrite();
                        C12986d dVar6 = (C12986d) cVar3.instance;
                        C12973ae aeVar2 = (C12973ae) adVar.build();
                        aeVar2.getClass();
                        dVar6.f40369c = aeVar2;
                        dVar6.f40368b = 2;
                        dVar = (C12986d) cVar3.build();
                    }
                }
                C59104x b4 = C13174b.f40784a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "FusionVPFragment");
                ((C59052c) ((C59052c) b4).mo56372aa(44671)).mo56386p("Starting voice plate");
                a.f40810w = true;
                a.f40809v = false;
                a.f40800m.mo22995g(viewStub, dVar);
                a.f40793f.mo19974a(C37179a.f97505bX);
                a.f40790c.mo20328d(dVar);
                a.f40793f.mo19974a(C37179a.f97506bY);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th2) {
            C13171a.m29399a(th, th2);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C13174b a = mo17754z();
            C59104x b = C13174b.f40784a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FusionVPFragment");
            ((C59052c) ((C59052c) b).mo56372aa(44669)).mo56386p("Stopping voice plate");
            a.f40800m.mo22990b(true);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C13171a.m29399a(th, th);
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
            if (!this.f40782e) {
                super.onAttach(context);
                if (this.f40779a == null) {
                    this.f40779a = ((C13179f) mo20964d().mo17653jN()).mo20962eK();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f40781d));
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
                C13171a.m29399a(th, th2);
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
