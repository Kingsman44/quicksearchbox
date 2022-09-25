package com.google.android.apps.gsa.staticplugins.p7388al;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.b;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83921h;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83989a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83990b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83991c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83993e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83994f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83995g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7006ax.C89330i;
import com.google.android.apps.gsa.shared.p7045k.C89823s;
import com.google.android.apps.gsa.shared.p7045k.C89826v;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92383g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92385i;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92388l;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92390n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.home.p1957e.C23766a;
import com.google.android.libraries.home.p1957e.C23769d;
import com.google.android.libraries.home.p1957e.C23770e;
import com.google.android.libraries.home.p1957e.C23773h;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49879cj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.q */
/* compiled from: PG */
public final class C93943q extends C83907bm {

    /* renamed from: b */
    public static final C59071e f262327b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.al.q");

    /* renamed from: A */
    public String f262328A;

    /* renamed from: B */
    public C23773h f262329B;

    /* renamed from: C */
    private boolean f262330C;

    /* renamed from: c */
    public C89826v f262331c;

    /* renamed from: d */
    public C22871g f262332d;

    /* renamed from: e */
    public C86124t f262333e;

    /* renamed from: f */
    public C68214a f262334f;

    /* renamed from: g */
    public C23770e f262335g;

    /* renamed from: h */
    public C93927ad f262336h;

    /* renamed from: i */
    public C92371d f262337i;

    /* renamed from: j */
    public C93946t f262338j;

    /* renamed from: k */
    public C89994f f262339k;

    /* renamed from: l */
    public C83893b f262340l;

    /* renamed from: m */
    public C93945s f262341m;

    /* renamed from: n */
    public C68214a f262342n;

    /* renamed from: o */
    public o f262343o;

    /* renamed from: p */
    public C89330i f262344p;

    /* renamed from: q */
    public final Map f262345q = new HashMap();

    /* renamed from: r */
    public final Map f262346r = new HashMap();

    /* renamed from: s */
    public final Map f262347s = new HashMap();

    /* renamed from: t */
    public C84002n f262348t;

    /* renamed from: u */
    public OpaPageLayout f262349u;

    /* renamed from: v */
    public Button f262350v;

    /* renamed from: w */
    public boolean f262351w;

    /* renamed from: x */
    public boolean f262352x;

    /* renamed from: y */
    public C83919f f262353y;

    /* renamed from: z */
    public C83923j f262354z;

    /* renamed from: l */
    public static final String m154975l(C92385i iVar) {
        C92383g gVar = iVar.f257637b;
        if (gVar == null) {
            gVar = C92383g.f257629d;
        }
        int i = gVar.f257631a & 1;
        C92383g gVar2 = iVar.f257637b;
        if (i != 0) {
            if (gVar2 == null) {
                gVar2 = C92383g.f257629d;
            }
            return gVar2.f257632b;
        }
        if (gVar2 == null) {
            gVar2 = C92383g.f257629d;
        }
        return gVar2.f257633c;
    }

    /* renamed from: m */
    private final boolean m154976m() {
        int n = m154977n();
        return n == 3 || n == 4;
    }

    /* renamed from: n */
    private final int m154977n() {
        int a;
        C92391o oVar = (C92391o) this.f262337i.f257558c.mo56109e(C92391o.f257641i);
        if ((oVar.f257643a & 32) == 0 || (a = C92390n.m151715a(oVar.f257649g)) == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo88220e(String str) {
        if (this.f262345q.containsKey(str)) {
            this.f262345q.remove(str);
        } else if (this.f262346r.containsKey(str)) {
            this.f262346r.remove(str);
        }
        mo88221g();
    }

    /* renamed from: g */
    public final void mo88221g() {
        int a;
        int a2;
        if (getActivity() == null) {
            ((C59052c) ((C59052c) f262327b.mo56226d()).mo56372aa(19352)).mo56386p("Fragment not attach to activity!");
            return;
        }
        if (this.f262348t.getItemCount() == 0 || (mo88225k() && mo88223i())) {
            HeaderLayout headerLayout = (HeaderLayout) this.f262349u.f228728c.findViewById(R.id.opa_header);
            if (!mo88225k()) {
                int a3 = C83921h.m133675a(this.f262353y.f228567c);
                if (a3 != 0 && a3 == 2) {
                    C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.prefTitle_assistant_speaker_id_devices, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                    if (!this.f262337i.f257558c.mo56113h() || (((a = C92388l.m151714a(((C92391o) this.f262337i.f257558c.mo56107c()).f257644b)) == 0 || a != 2) && ((a2 = C92388l.m151714a(((C92391o) this.f262337i.f257558c.mo56107c()).f257644b)) == 0 || a2 != 3))) {
                        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.assistant_settings_devices_category_speaker_id_supported, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                    } else {
                        C84018m.m133908c(headerLayout.f228719b, C5114a.m13988b(Locale.getDefault(), getString(R.string.assistant_settings_devices_category_parent_delegation), "GENDER", ((C92391o) this.f262337i.f257558c.mo56107c()).f257648f, "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
                    }
                } else {
                    C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.devices_select_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                    C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.devices_select_explanation, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                }
            } else if (mo88223i()) {
                C84018m.m133908c(headerLayout.f228718a, C5114a.m13988b(Locale.getDefault(), getString(R.string.devices_select_title_custodio_family_link), "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
                C84018m.m133908c(headerLayout.f228719b, C5114a.m13988b(Locale.getDefault(), getString(R.string.devices_select_explanation_custodio_family_link), "GENDER", ((C92391o) this.f262337i.f257558c.mo56107c()).f257648f, "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
            } else if (m154976m()) {
                C84018m.m133908c(headerLayout.f228718a, C5114a.m13988b(Locale.getDefault(), getString(R.string.devices_select_title_custodio_add_devices), "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
                C84018m.m133908c(headerLayout.f228719b, C5114a.m13988b(Locale.getDefault(), getString(R.string.devices_select_explanation_custodio_add_devices), "GENDER", ((C92391o) this.f262337i.f257558c.mo56107c()).f257648f, "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
            } else {
                C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.devices_select_title_custodio, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                C84018m.m133908c(headerLayout.f228719b, C5114a.m13988b(Locale.getDefault(), getString(R.string.devices_select_explanation_custodio), "GENDER", ((C92391o) this.f262337i.f257558c.mo56107c()).f257648f, "PERSON", ((C92391o) this.f262337i.f257558c.mo56107c()).f257647e), TextView.BufferType.NORMAL, headerLayout);
            }
            this.f262349u.f228726a.mo77360a().setVisibility(0);
            this.f262349u.f228728c.findViewById(R.id.scanning_animation).setVisibility(8);
            this.f262349u.f228728c.findViewById(R.id.opa_error_recycler_view).setVisibility(0);
            this.f262349u.f228728c.findViewById(R.id.device_loading_spinner).setVisibility(0);
        }
        ArrayList arrayList = new ArrayList();
        if (mo88225k() && mo88223i()) {
            for (C83993e eVar : this.f262345q.values()) {
                C93942p pVar = (C93942p) eVar;
                Iterator it = ((C92391o) this.f262337i.f257558c.mo56107c()).f257650h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (pVar.f262324a.b().equals(m154975l((C92385i) it.next()))) {
                            pVar.mo77441f(true);
                            arrayList.add(eVar);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            arrayList.addAll(this.f262345q.values());
        }
        if (!this.f262346r.isEmpty()) {
            arrayList.add(new C83995g(16));
            arrayList.add(new C83994f());
            arrayList.add(new C83995g(16));
            arrayList.add(new C83991c(getString(R.string.assistant_settings_devices_category_speaker_id_not_supported), true));
            arrayList.addAll(this.f262346r.values());
        }
        if (!this.f262347s.isEmpty()) {
            arrayList.add(new C83995g(16));
            arrayList.add(new C83994f());
            arrayList.add(new C83995g(16));
            arrayList.add(new C83991c(getString(R.string.assistant_settings_devices_category_heading_speaker_id_offline), true));
            arrayList.add(new C83991c(getString(R.string.assistant_settings_devices_category_description_speaker_id_offline), true));
            arrayList.add(new C83995g(16));
            arrayList.addAll(this.f262347s.values());
        }
        C84002n nVar = this.f262348t;
        nVar.f228831a = arrayList;
        nVar.mObservable.mo2879a();
        if (this.f262345q.values().isEmpty()) {
            this.f262350v.setEnabled(false);
        }
        for (C83993e eVar2 : this.f262345q.values()) {
            C93942p pVar2 = (C93942p) eVar2;
            if (!this.f262333e.mo79746e(C90082eg.f249998cH)) {
                pVar2.mo77441f(true);
            }
        }
    }

    /* renamed from: h */
    public final void mo88222h() {
        this.f262331c.mo83679g();
        this.f262344p.mo83257i();
        this.f262349u.f228728c.findViewById(R.id.device_loading_spinner).setVisibility(8);
        C84002n nVar = this.f262348t;
        if (nVar == null || nVar.getItemCount() == 0) {
            this.f262330C = true;
            this.f262354z = C83923j.f228570d;
            mo77318iT().mo77312a();
        }
    }

    /* renamed from: i */
    public final boolean mo88223i() {
        return ((C92391o) this.f262337i.f257558c.mo56107c()).f257650h.size() > 0;
    }

    /* renamed from: j */
    public final boolean mo88224j(String str) {
        return this.f262353y.f228566b.contains(str);
    }

    /* renamed from: k */
    public final boolean mo88225k() {
        return m154977n() == 2 || m154976m();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f262353y = (C83919f) ProtoParsers.m95522e(getArguments(), "DeviceScanConfig", C83919f.f228563e, C62921ba.m95368a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<String> stringArrayList;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.generic_device_scan, (ViewGroup) null);
        this.f262349u = opaPageLayout;
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.devices_scan_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        FooterLayout footerLayout = this.f262349u.f228726a;
        footerLayout.mo77362c(2);
        OpaPageLayout opaPageLayout2 = this.f262349u;
        int a = C83921h.m133675a(this.f262353y.f228567c);
        int i = 62525;
        if (a != 0 && a == 2) {
            i = 85361;
        }
        C28295m.m52919e(opaPageLayout2, new C28292j(i));
        int i2 = true != mo88225k() ? R.string.devices_select_action_button : R.string.device_select_parental_controls_action_button;
        Button a2 = footerLayout.mo77360a();
        this.f262350v = a2;
        a2.setEnabled(false);
        this.f262350v.setText(i2);
        this.f262350v.setOnClickListener(new C89943l(new C93931e(this)));
        this.f262350v.setVisibility(8);
        int i3 = mo88225k() ? mo88223i() ? R.string.device_select_parental_controls_device_list_back_button : R.string.device_select_parental_controls_skip_button : R.string.devices_scan_cancel_button;
        Button b = footerLayout.mo77361b();
        b.setText(i3);
        b.setOnClickListener(new C89943l(new C93932f(this)));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f262349u.f228728c.findViewById(R.id.scanning_animation);
        lottieAnimationView.mo9689a(new C93935i(this, lottieAnimationView));
        C89826v vVar = this.f262331c;
        vVar.f243141e.clear();
        if (!(bundle == null || (stringArrayList = bundle.getStringArrayList("ignored_device_ids")) == null)) {
            vVar.f243141e.addAll(stringArrayList);
        }
        return this.f262349u;
    }

    public final void onDestroy() {
        C89849ae aeVar;
        C89849ae aeVar2;
        super.onDestroy();
        if (!this.f262330C) {
            if (this.f262352x) {
                aeVar = C89849ae.FACE_MATCH_DEVICE_SELECTED;
            } else {
                aeVar = C89849ae.FACE_MATCH_DEVICE_SCAN_SCREEN_EXIT;
            }
            ((C89859i) this.f262334f.mo27525b()).mo83702b(aeVar);
            if (this.f262352x) {
                aeVar2 = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SELECTED;
            } else {
                aeVar2 = this.f262345q.isEmpty() ? C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SCAN_EXIT_WITH_NO_SUPPORTED_DEVICE_FOUND : C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SCAN_EXIT;
            }
            ((C89859i) this.f262334f.mo27525b()).mo83702b(aeVar2);
        }
    }

    public final void onResume() {
        super.onResume();
        Context context = getContext();
        C93927ad adVar = this.f262336h;
        new C90873ag(adVar.f262299b.mo28210j(((C89037bh) adVar.f262300c.mo27525b()).mo27378c(), "getConnectivityInfo", new C93925ab(adVar)), this.f262332d, "getCurrentWifiName", new C93933g(this, context)).mo85223a(new C93934h(this));
        RecyclerView recyclerView = (RecyclerView) this.f262349u.f228728c.findViewById(R.id.opa_error_recycler_view);
        C84002n nVar = new C84002n();
        this.f262348t = nVar;
        nVar.f228833c = false;
        nVar.f228834d = true;
        C83989a aVar = new C83989a();
        aVar.mo77434a();
        aVar.mo77435b();
        C83990b bVar = new C83990b(aVar);
        C84002n nVar2 = this.f262348t;
        nVar2.f228832b = bVar;
        recyclerView.setAdapter(nVar2);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f262332d.mo28213m("stop populating device", this.f262333e.mo79743a(C90082eg.f250088y), new C93929c(this));
        if (this.f262333e.mo79746e(C90082eg.f249997cG)) {
            C23769d.m44271d(C93930d.f262304a, new C23766a(getContext()), this.f262335g, C23769d.m44270b());
        }
        C89826v vVar = this.f262331c;
        C93936j jVar = new C93936j(this);
        vVar.f243142f.clear();
        vVar.f243138b.mo83670b(new C89823s(vVar, vVar.f243139c.mo79746e(C90082eg.f249997cG), jVar));
        int a = C83921h.m133675a(this.f262353y.f228567c);
        if (a != 0 && a == 2) {
            this.f262344p.mo83256h(getContext(), new C93939m(this));
        }
        C83919f fVar = this.f262353y;
        int a2 = C83921h.m133675a(fVar.f228567c);
        if (a2 != 0 && a2 == 2) {
            for (C49879cj cjVar : fVar.f228568d) {
                l lVar = new l(cjVar);
                String c = lVar.c();
                String Z = this.f262339k.mo83863Z();
                C58495hd r = this.f262333e.mo79752r(C90014bt.f247482hw);
                C58485gu c2 = this.f262333e.mo79745c(C90014bt.f247476hq);
                String b = b.b(c, Z, r);
                C58976aa aaVar = C58975e.f156826a;
                if (c2.contains(b)) {
                    C93942p pVar = new C93942p(this, lVar);
                    this.f262345q.put(cjVar.f129631b, pVar);
                    if (this.f262347s.containsKey(pVar.f262324a.b())) {
                        this.f262347s.remove(pVar.f262324a.b());
                    }
                } else {
                    ((C59052c) ((C59052c) f262327b.mo56224b()).mo56372aa(19346)).mo56389s("Adding speaker id locale unsupported VM supported device [name: %s]", lVar.d());
                    this.f262346r.put(cjVar.f129631b, new C93940n(this, lVar.d(), 3, lVar.c()));
                }
            }
            mo88221g();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("ignored_device_ids", new ArrayList(this.f262331c.f243141e));
    }

    public final void onStart() {
        super.onStart();
        this.f262345q.clear();
        this.f262346r.clear();
        if (mo88225k() && mo88223i()) {
            for (C92385i iVar : ((C92391o) this.f262337i.f257558c.mo56107c()).f257650h) {
                this.f262347s.put(m154975l(iVar), new C93941o(this, iVar.f257638c));
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f262331c.mo83679g();
        this.f262344p.mo83257i();
    }
}
