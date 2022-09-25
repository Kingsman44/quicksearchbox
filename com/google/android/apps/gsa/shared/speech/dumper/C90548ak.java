package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90995d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91001j;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91002k;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import dagger.C68214a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ak */
/* compiled from: PG */
public final class C90548ak implements C90991b {

    /* renamed from: d */
    private static final C59071e f253133d = C59071e.m91332i("com.google.android.apps.gsa.shared.speech.dumper.ak");

    /* renamed from: a */
    public final C90998g f253134a;

    /* renamed from: b */
    public final C68214a f253135b;

    /* renamed from: c */
    public final Map f253136c = new HashMap();

    /* renamed from: e */
    private final C68214a f253137e;

    /* renamed from: f */
    private final C90544ag f253138f;

    /* renamed from: g */
    private final C89994f f253139g;

    /* renamed from: h */
    private final C21378h f253140h;

    public C90548ak(C91022f fVar, C68214a aVar, C21378h hVar, C91002k kVar, C68214a aVar2, C90544ag agVar, C89994f fVar2) {
        this.f253140h = hVar;
        this.f253135b = aVar;
        this.f253137e = aVar2;
        this.f253138f = agVar;
        this.f253139g = fVar2;
        this.f253134a = new C90995d(hVar, C91001j.SPEECH_LOGGER, kVar);
        fVar.mo85301a(this);
    }

    /* renamed from: c */
    private static String m147688c(EventForDump eventForDump, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        int b = eventForDump.mo84653b();
        String a = C90551d.m147694a(b);
        if (b != 0) {
            sb.append(a);
            sb.append(" ");
            sb.append(eventForDump.mo84652a());
            sb.append(" ");
            return sb.toString();
        }
        throw null;
    }

    /* renamed from: e */
    private final void m147689e(String str, long j, String str2, int i) {
        if (!((C90021c) this.f253135b.mo27525b()).mo79746e(C90082eg.f250011cU)) {
            String str3 = " " + new SimpleDateFormat("MM/dd HH:mm:ss:SSS").format(new Date(j)) + " " + str2;
            if (!this.f253136c.containsKey(str)) {
                this.f253136c.put(str, new C58781rt(new C58425eo(i)));
            }
            ((Queue) this.f253136c.get(str)).add(str3);
            return;
        }
        this.f253134a.mo85270f(str, new C90546ai(j, str, str2));
    }

    /* renamed from: a */
    public final void mo84667a(C90552e eVar, EventForDump eventForDump, String str) {
        if (eventForDump.mo84653b() != 16) {
            int b = eventForDump.mo84653b();
            String a = C90551d.m147694a(b);
            if (b != 0) {
                String str2 = a + " " + eventForDump.mo84652a();
                if (((C90021c) this.f253135b.mo27525b()).mo79746e(C90082eg.f249881X) && ((eVar == C90552e.VOICE_MATCH || eVar == C90552e.SPEAKER_MODEL || eVar == C90552e.HW_ENROLLMENT_STATE) && (str.equals("Remove") || str.equals("false") || str.equals("2") || str.equals("4")))) {
                    C59071e eVar2 = f253133d;
                    ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(11120)).mo56354G("updateAppflow-%s %s", eVar, str2);
                    C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                    ((C89859i) this.f253137e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_TRACKER_START);
                    if (eVar == C90552e.SPEAKER_MODEL) {
                        ((C89859i) this.f253137e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_SPEAKER_MODEL_DELETED);
                        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
                        ayVar.copyOnWrite();
                        C59651be beVar = (C59651be) ayVar.instance;
                        beVar.f159935a |= 32768;
                        beVar.f159948n = str2;
                        C59651be beVar2 = (C59651be) ayVar.build();
                        ajVar.copyOnWrite();
                        C59687cb cbVar = (C59687cb) ajVar.instance;
                        beVar2.getClass();
                        cbVar.f160100al = beVar2;
                        cbVar.f160122c |= 16;
                        ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(11124)).mo56389s("speakerIdModelDeletionSource: %s", str2);
                    } else if (eVar == C90552e.VOICE_MATCH || eVar == C90552e.HW_ENROLLMENT_STATE) {
                        if (str.equals("4")) {
                            ((C89859i) this.f253137e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_INCOMPLETE);
                            C59601ay ayVar2 = (C59601ay) C59651be.f159929E.createBuilder();
                            ayVar2.copyOnWrite();
                            C59651be beVar3 = (C59651be) ayVar2.instance;
                            beVar3.f159935a |= 16384;
                            beVar3.f159947m = str2;
                            C59651be beVar4 = (C59651be) ayVar2.build();
                            ajVar.copyOnWrite();
                            C59687cb cbVar2 = (C59687cb) ajVar.instance;
                            beVar4.getClass();
                            cbVar2.f160100al = beVar4;
                            cbVar2.f160122c |= 16;
                            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(11123)).mo56389s("voiceMatchIncompleteSource: %s", str2);
                        } else {
                            C118826c.m197213c(this.f253138f.f253129b.mo46039a(new C90539ab(str2), C60826bg.f164896a));
                            ((C89859i) this.f253137e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_DISABLED);
                            C59601ay ayVar3 = (C59601ay) C59651be.f159929E.createBuilder();
                            ayVar3.copyOnWrite();
                            C59651be beVar5 = (C59651be) ayVar3.instance;
                            beVar5.f159935a |= 8192;
                            beVar5.f159946l = str2;
                            C59651be beVar6 = (C59651be) ayVar3.build();
                            ajVar.copyOnWrite();
                            C59687cb cbVar3 = (C59687cb) ajVar.instance;
                            beVar6.getClass();
                            cbVar3.f160100al = beVar6;
                            cbVar3.f160122c |= 16;
                            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(11121)).mo56389s("voiceMatchDisabledSource: %s", str2);
                        }
                    }
                    String x = ((C90021c) this.f253135b.mo27525b()).mo79758x(C90082eg.f249880W);
                    if (!x.isEmpty()) {
                        C59601ay ayVar4 = (C59601ay) C59651be.f159929E.createBuilder();
                        ayVar4.copyOnWrite();
                        C59651be beVar7 = (C59651be) ayVar4.instance;
                        x.getClass();
                        beVar7.f159935a |= C89885b.S3REQUEST_VALUE;
                        beVar7.f159950p = x;
                        C59651be beVar8 = (C59651be) ayVar4.build();
                        ajVar.copyOnWrite();
                        C59687cb cbVar4 = (C59687cb) ajVar.instance;
                        beVar8.getClass();
                        cbVar4.f160100al = beVar8;
                        cbVar4.f160122c |= 16;
                    }
                    String Z = this.f253139g.mo83863Z();
                    ajVar.copyOnWrite();
                    C59687cb cbVar5 = (C59687cb) ajVar.instance;
                    Z.getClass();
                    cbVar5.f160115b |= 4096;
                    cbVar5.f160048M = Z;
                    boolean M = this.f253139g.mo83850M();
                    ajVar.copyOnWrite();
                    C59687cb cbVar6 = (C59687cb) ajVar.instance;
                    cbVar6.f160115b |= 134217728;
                    cbVar6.f160091ac = M;
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.VOICE_MATCH_TRACKER_END;
                    fVar.f246203c = (C59687cb) ajVar.build();
                    ((C89859i) this.f253137e.mo27525b()).mo74236a(fVar.mo83699a());
                }
                m147689e(eVar.name(), System.currentTimeMillis(), m147688c(eventForDump, str), 20);
                return;
            }
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo84668b(int i, EventForDump eventForDump, String str) {
        if (eventForDump.mo84653b() != 16) {
            m147689e(i != 1 ? i != 2 ? i != 3 ? "VOICE_MATCH_ENROLLMENT" : "MODEL_DOWNLOAD_COMPLETE" : "MODEL_DOWNLOAD_REQUEST" : "SPEAKER_ID_FAILED", System.currentTimeMillis(), m147688c(eventForDump, str), 5);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ak");
    }
}
