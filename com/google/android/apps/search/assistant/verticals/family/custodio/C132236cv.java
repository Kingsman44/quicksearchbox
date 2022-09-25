package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8679i;
import com.google.p427am.p432b.p433a.C8680j;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cv */
/* compiled from: PG */
public final class C132236cv {

    /* renamed from: a */
    public static final C59071e f360925a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.cv");

    /* renamed from: b */
    public final CustodioSelectorFragment f360926b;

    /* renamed from: c */
    public final Bundle f360927c;

    /* renamed from: d */
    public final C46485f f360928d;

    /* renamed from: e */
    public final C46801dp f360929e;

    /* renamed from: f */
    public final C132140a f360930f;

    /* renamed from: g */
    public final C132237a f360931g;

    /* renamed from: h */
    public final boolean f360932h;

    /* renamed from: i */
    public final C37215b f360933i;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cv$a */
    /* compiled from: PG */
    final class C132237a implements C46792di {
        public C132237a() {
        }

        /* renamed from: d */
        private final void m214894d() {
            C132236cv.this.f360933i.mo19974a(C37176a.f97023di);
            Bundle a = C132287ei.m214954a(C132236cv.this.f360926b.getString(R.string.assistant_custodio_fatal_error_title), C132236cv.this.f360926b.getString(R.string.assistant_custodio_fatal_error_body), C132236cv.this.f360926b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null);
            C132236cv cvVar = C132236cv.this;
            cvVar.f360928d.mo50482c(cvVar.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_dialog, a);
        }

        /* renamed from: e */
        private static final C8675e m214895e(Bundle bundle, C8660bl blVar) {
            String string = bundle.getString("supervised_oid");
            for (C8675e eVar : blVar.f29964b) {
                if (eVar.f29992a.equals(string)) {
                    return eVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132236cv.f360925a.mo56225c()).mo56382g(th)).mo56372aa(39563)).mo56386p("Failed to fetch required information");
            m214894d();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            Bundle bundle = C132236cv.this.f360927c.getBundle("device_id");
            C37215b bVar = C132236cv.this.f360933i;
            C37258g gVar = C37176a.f97034dt;
            C62940bt btVar = C63224d.f170804o;
            C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
            int b = C132361w.m215130b(C132236cv.this.f360927c);
            cVar.copyOnWrite();
            C63224d dVar = (C63224d) cVar.instance;
            char c = 65535;
            dVar.f170807b = b - 1;
            dVar.f170806a |= 1;
            boolean containsKey = C132236cv.this.f360927c.containsKey("account_name");
            cVar.copyOnWrite();
            C63224d dVar2 = (C63224d) cVar.instance;
            dVar2.f170806a |= 2;
            dVar2.f170808c = containsKey;
            boolean containsKey2 = C132236cv.this.f360927c.containsKey("supervised_oid");
            cVar.copyOnWrite();
            C63224d dVar3 = (C63224d) cVar.instance;
            dVar3.f170806a |= 4;
            dVar3.f170809d = containsKey2;
            boolean z = bundle != null && bundle.containsKey("cast_device_id");
            cVar.copyOnWrite();
            C63224d dVar4 = (C63224d) cVar.instance;
            dVar4.f170806a |= 8;
            dVar4.f170810e = z;
            boolean z2 = bundle != null && bundle.containsKey("libassistant_device_id");
            cVar.copyOnWrite();
            C63224d dVar5 = (C63224d) cVar.instance;
            dVar5.f170806a |= 16;
            dVar5.f170811f = z2;
            int size = blVar.f29964b.size();
            cVar.copyOnWrite();
            C63224d dVar6 = (C63224d) cVar.instance;
            dVar6.f170806a |= 64;
            dVar6.f170813h = size;
            long count = Collection.EL.stream(blVar.f29964b).filter(C132235cu.f360924a).count();
            cVar.copyOnWrite();
            C63224d dVar7 = (C63224d) cVar.instance;
            dVar7.f170806a |= 128;
            dVar7.f170814i = C60757n.m92748i(count);
            C8680j jVar = blVar.f29963a;
            if (jVar == null) {
                jVar = C8680j.f30003b;
            }
            int a = C8679i.m23367a(jVar.f30005a);
            if (a == 0) {
                a = 1;
            }
            cVar.copyOnWrite();
            C63224d dVar8 = (C63224d) cVar.instance;
            dVar8.f170812g = C132191bs.m214843a(a) - 1;
            dVar8.f170806a |= 32;
            bVar.mo19974a(gVar.mo40812e(btVar, (C63224d) cVar.build()));
            C8680j jVar2 = blVar.f29963a;
            if (jVar2 == null) {
                jVar2 = C8680j.f30003b;
            }
            int a2 = C8679i.m23367a(jVar2.f30005a);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 2) {
                if (a2 == 6) {
                    C132236cv.this.f360933i.mo19974a(C37176a.f97035du);
                    Bundle a3 = C132287ei.m214954a(C132236cv.this.f360926b.getString(R.string.assistant_custodio_child_punt_dialog_title), C132236cv.this.f360926b.getString(R.string.assistant_custodio_child_punt_dialog_body), C132236cv.this.f360926b.getString(R.string.assistant_custodio_child_punt_dialog_primary_button_text), "action_finish_activity", (String) null, (String) null);
                    C132236cv cvVar = C132236cv.this;
                    cvVar.f360928d.mo50482c(cvVar.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_dialog, a3);
                    return;
                } else if (!(a2 == 3 || a2 == 4)) {
                    C132236cv.this.f360933i.mo19974a(C37176a.f97036dv);
                    Bundle a4 = C132287ei.m214954a(C132236cv.this.f360926b.getString(R.string.assistant_custodio_member_punt_dialog_title), C132236cv.this.f360926b.getString(R.string.assistant_custodio_member_punt_dialog_body), C132236cv.this.f360926b.getString(R.string.assistant_custodio_member_punt_dialog_primary_button_text), "action_finish_activity", (String) null, (String) null);
                    C132236cv cvVar2 = C132236cv.this;
                    cvVar2.f360928d.mo50482c(cvVar2.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_dialog, a4);
                    return;
                }
            }
            String string = C132236cv.this.f360927c.getString("entry_point_id");
            if (string == null) {
                ((C59052c) ((C59052c) C132236cv.f360925a.mo56225c()).mo56372aa(39565)).mo56386p("Missing required argument entryPointId!");
                m214894d();
                return;
            }
            switch (string.hashCode()) {
                case -1410280908:
                    if (string.equals("as-rsp")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1272117067:
                    if (string.equals("fla-ps")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1247182279:
                    if (string.equals("gha-gs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -587559043:
                    if (string.equals("gha-mmv2-kd")) {
                        c = 9;
                        break;
                    }
                    break;
                case -7933803:
                    if (string.equals("gha-sds")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3122:
                    if (string.equals("as")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3434992:
                    if (string.equals("pcfc")) {
                        c = 5;
                        break;
                    }
                    break;
                case 62009815:
                    if (string.equals("gks-unicorn-enrollment")) {
                        c = 11;
                        break;
                    }
                    break;
                case 95466924:
                    if (string.equals("dg-ac")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1151923259:
                    if (string.equals("fla-ps-ad")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1823843082:
                    if (string.equals("gha-child-sla")) {
                        c = 10;
                        break;
                    }
                    break;
                case 2104657944:
                    if (string.equals("odyssey-dg")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Collection.EL.stream(blVar.f29964b).anyMatch(C132235cu.f360924a)) {
                        C132236cv cvVar3 = C132236cv.this;
                        cvVar3.f360928d.mo50482c(cvVar3.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_child_selection, C132236cv.this.f360927c);
                        return;
                    }
                    C132236cv cvVar4 = C132236cv.this;
                    cvVar4.f360928d.mo50482c(cvVar4.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_overview, C132236cv.this.f360927c);
                    return;
                case 7:
                    C8675e e = m214895e(C132236cv.this.f360927c, blVar);
                    Bundle a5 = C132361w.m215129a(C132236cv.this.f360927c);
                    a5.putBoolean("hide_add_another_kid_button", true);
                    a5.putBoolean("skip_child_presence_verification", true);
                    if (e == null) {
                        ((C59052c) ((C59052c) C132236cv.f360925a.mo56225c()).mo56372aa(39561)).mo56386p("No child specified in args for entrypoint which requires it!");
                        m214894d();
                        return;
                    } else if (e.f29995d) {
                        C132236cv cvVar5 = C132236cv.this;
                        if (cvVar5.f360932h) {
                            cvVar5.f360928d.mo50482c(cvVar5.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_settings_steady_state, a5);
                            return;
                        } else {
                            cvVar5.f360928d.mo50482c(cvVar5.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_settings, a5);
                            return;
                        }
                    } else {
                        C132236cv cvVar6 = C132236cv.this;
                        cvVar6.f360928d.mo50482c(cvVar6.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_overview, a5);
                        return;
                    }
                case 8:
                case 9:
                    Bundle a6 = C132361w.m215129a(C132236cv.this.f360927c);
                    a6.putBoolean("use_add_devices_text", true);
                    a6.putBoolean("skip_child_presence_verification", true);
                    a6.putBoolean("force_enable_settings_next_button", true);
                    a6.putBoolean("hide_add_another_kid_button", true);
                    C132236cv cvVar7 = C132236cv.this;
                    cvVar7.f360928d.mo50482c(cvVar7.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_overview, a6);
                    return;
                case 10:
                    if (m214895e(C132236cv.this.f360927c, blVar) == null) {
                        ((C59052c) ((C59052c) C132236cv.f360925a.mo56225c()).mo56372aa(39562)).mo56386p("No child specified in args for entrypoint which requires it!");
                        m214894d();
                        return;
                    }
                    Bundle a7 = C132361w.m215129a(C132236cv.this.f360927c);
                    a7.putBoolean("use_gha_child_sla_text_key", true);
                    a7.putBoolean("finish_flow_on_settings_page", true);
                    a7.putBoolean("skip_child_presence_verification", true);
                    a7.putBoolean("force_enable_settings_next_button", true);
                    C132236cv cvVar8 = C132236cv.this;
                    cvVar8.f360928d.mo50482c(cvVar8.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_settings, a7);
                    return;
                case 11:
                    C132236cv cvVar9 = C132236cv.this;
                    cvVar9.f360928d.mo50482c(cvVar9.f360926b).mo50508d(R.id.assistant_custodio_selector_fragment_to_gks_unicorn_enrollment, C132236cv.this.f360927c);
                    return;
                default:
                    ((C59052c) ((C59052c) C132236cv.f360925a.mo56225c()).mo56372aa(39564)).mo56389s("Unrecognized entry point ID: %s", string);
                    m214894d();
                    return;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C132236cv(CustodioSelectorFragment custodioSelectorFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, boolean z, C37215b bVar) {
        this.f360926b = custodioSelectorFragment;
        Bundle arguments = custodioSelectorFragment.getArguments();
        this.f360927c = arguments == null ? new Bundle() : arguments;
        this.f360928d = fVar;
        this.f360929e = dpVar;
        this.f360930f = aVar;
        this.f360932h = z;
        this.f360931g = new C132237a();
        this.f360933i = bVar;
    }
}
