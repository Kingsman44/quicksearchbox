package com.google.android.apps.search.transcription.p10670f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.transcription.p10666b.C141757p;
import com.google.android.apps.search.transcription.p10670f.p10675d.C141862b;
import com.google.android.libraries.assistant.soda.C19247b;
import com.google.android.libraries.assistant.soda.C19387w;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66763ad;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66971gg;
import com.google.speech.p5218j.C66996he;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67153n;
import java.util.Map;

/* renamed from: com.google.android.apps.search.transcription.f.bb */
/* compiled from: PG */
public final /* synthetic */ class C141834bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141845bm f384904a;

    public /* synthetic */ C141834bb(C141845bm bmVar) {
        this.f384904a = bmVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        boolean z;
        C66964g gVar;
        C141845bm bmVar = this.f384904a;
        C141862b bVar = (C141862b) obj;
        String str2 = bVar.f384960c;
        ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41910)).mo56386p("Initialize Soda with language pack directory");
        int i = bVar.f384959b;
        C66763ad adVar = (C66763ad) C66764ae.f181577i.createBuilder();
        adVar.copyOnWrite();
        C66764ae aeVar = (C66764ae) adVar.instance;
        aeVar.f181581c = 3;
        aeVar.f181579a |= 2;
        String n = bmVar.f384923i.mo116832n();
        adVar.copyOnWrite();
        C66764ae aeVar2 = (C66764ae) adVar.instance;
        n.getClass();
        aeVar2.f181579a |= 8;
        aeVar2.f181583e = n;
        C66764ae aeVar3 = (C66764ae) adVar.build();
        C67153n a = bmVar.f384927m.mo56113h() ? ((C141807az) bmVar.f384927m.mo56107c()).mo116759a() : null;
        if (bmVar.f384928n.mo56113h()) {
            int i2 = bVar.f384959b;
            str = ((C141833ba) bmVar.f384928n.mo56107c()).mo116794a();
        } else {
            str = BuildConfig.FLAVOR;
        }
        C19387w B = C19247b.m36941B();
        B.mo24385z(str2);
        B.mo24379t(bmVar.f384923i.mo116840v());
        C141851bs bsVar = bmVar.f384923i;
        if (bsVar.mo116831m().equals("smart_dictation")) {
            z = false;
        } else {
            z = bsVar.mo116836r();
        }
        B.mo24371l(z);
        B.mo24370k((C66996he) bmVar.f384923i.mo116829k().orElse(null));
        B.mo24375p(bmVar.f384923i.mo116835q());
        C141852bt btVar = bmVar.f384929o;
        C141851bs bsVar2 = bmVar.f384923i;
        String n2 = bsVar2.mo116832n();
        Map map = btVar.f384948a.f384733a;
        if (map.containsKey(n2) && map.get(n2) != null) {
            gVar = (C66964g) map.get(n2);
        } else if (bsVar2.mo116831m().equals("smart_dictation")) {
            gVar = C66964g.DEFAULT_CONTINUOUS;
        } else if (bsVar2.mo116836r()) {
            gVar = C66964g.AMBIENT_CONTINUOUS;
        } else {
            gVar = C66964g.AMBIENT_ONESHOT;
        }
        B.mo24364e(gVar);
        B.mo24378s(bmVar.f384923i.mo116830l());
        B.mo24383x(new C141844bl(bmVar));
        B.mo24368i(aeVar3);
        B.mo24369j((C66971gg) bmVar.f384923i.mo116828j().orElse(null));
        B.mo24366g(a);
        B.mo24377r(bmVar.f384923i.mo116831m());
        B.mo24380u(str);
        C19389y C = B.mo24527C(bmVar.f384917c);
        C67152mz b = C.mo24529b();
        if (b == C67152mz.NO_ERROR) {
            C.mo24534g(bmVar.f384921g);
            return C60856cj.m92900i(C);
        }
        throw new C141757p(b);
    }
}
