package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67091ks;
import com.google.speech.p5224k.p5225a.C67229g;
import com.google.speech.p5224k.p5225a.C67230h;
import com.google.speech.p5224k.p5225a.C67231i;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67240r;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67243u;
import com.google.speech.p5224k.p5225a.C67244v;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fh */
/* compiled from: PG */
final class C120341fh implements C17235c {

    /* renamed from: a */
    private final C120511h f334802a;

    /* renamed from: b */
    private final C119891j f334803b;

    /* renamed from: c */
    private final boolean f334804c;

    /* renamed from: d */
    private final long f334805d;

    public C120341fh(C120511h hVar, C119891j jVar, boolean z, long j) {
        this.f334802a = hVar;
        this.f334803b = jVar;
        this.f334804c = z;
        this.f334805d = j;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        C67229g gVar;
        C67239q qVar = (C67239q) ((C67244v) cdVar.mo58881i(C67244v.f182772t)).toBuilder();
        C62940bt btVar = C67244v.f182772t;
        C67239q qVar2 = (C67239q) C67244v.f182771s.createBuilder();
        if (!this.f334802a.mo104772d().isPresent() || this.f334804c) {
            qVar2.copyOnWrite();
            C67244v vVar = (C67244v) qVar2.instance;
            vVar.f182775b |= 8;
            vVar.f182789p = false;
            C67240r rVar = (C67240r) C67243u.f182767c.createBuilder();
            C67242t tVar = C67242t.NO_PREAMBLE;
            rVar.copyOnWrite();
            C67243u uVar = (C67243u) rVar.instance;
            uVar.f182770b = tVar.f182766u;
            uVar.f182769a |= 1;
            qVar2.copyOnWrite();
            C67244v vVar2 = (C67244v) qVar2.instance;
            C67243u uVar2 = (C67243u) rVar.build();
            uVar2.getClass();
            vVar2.f182787n = uVar2;
            vVar2.f182774a |= 536870912;
        } else {
            qVar2.copyOnWrite();
            C67244v vVar3 = (C67244v) qVar2.instance;
            vVar3.f182775b |= 8;
            vVar3.f182789p = true;
            C67240r rVar2 = (C67240r) C67243u.f182767c.createBuilder();
            C67242t tVar2 = C67242t.SEAMLESS_HOTWORD;
            rVar2.copyOnWrite();
            C67243u uVar3 = (C67243u) rVar2.instance;
            uVar3.f182770b = tVar2.f182766u;
            uVar3.f182769a |= 1;
            qVar2.copyOnWrite();
            C67244v vVar4 = (C67244v) qVar2.instance;
            C67243u uVar4 = (C67243u) rVar2.build();
            uVar4.getClass();
            vVar4.f182787n = uVar4;
            vVar4.f182774a |= 536870912;
            C67050je jeVar = (C67050je) this.f334802a.mo104772d().get();
            C67230h hVar = (C67230h) C67231i.f182719l.createBuilder();
            if ((jeVar.f182264a & 1) != 0) {
                C67048jc jcVar = jeVar.f182265b;
                if (jcVar == null) {
                    jcVar = C67048jc.f182253h;
                }
                String str = jcVar.f182261g;
                hVar.copyOnWrite();
                C67231i iVar = (C67231i) hVar.instance;
                str.getClass();
                iVar.f182721a |= 1;
                iVar.f182722b = str;
                C67048jc jcVar2 = jeVar.f182265b;
                if (jcVar2 == null) {
                    jcVar2 = C67048jc.f182253h;
                }
                float f = jcVar2.f182258d;
                hVar.copyOnWrite();
                C67231i iVar2 = (C67231i) hVar.instance;
                iVar2.f182721a |= 2;
                iVar2.f182723c = f;
                C67048jc jcVar3 = jeVar.f182265b;
                if (jcVar3 == null) {
                    jcVar3 = C67048jc.f182253h;
                }
                boolean z = jcVar3.f182259e;
                hVar.copyOnWrite();
                C67231i iVar3 = (C67231i) hVar.instance;
                iVar3.f182721a |= 64;
                iVar3.f182728h = z;
                C67048jc jcVar4 = jeVar.f182265b;
                if (jcVar4 == null) {
                    jcVar4 = C67048jc.f182253h;
                }
                String str2 = jcVar4.f182257c;
                if (str2.endsWith("ok_google")) {
                    gVar = C67229g.AOHD_OK_GOOGLE;
                } else if (str2.endsWith("x_google")) {
                    gVar = C67229g.AOHD_X_GOOGLE;
                } else {
                    gVar = C67229g.UNKNOWN;
                }
                hVar.copyOnWrite();
                C67231i iVar4 = (C67231i) hVar.instance;
                iVar4.f182727g = gVar.f182718e;
                iVar4.f182721a |= 32;
                C67048jc jcVar5 = jeVar.f182265b;
                if (jcVar5 == null) {
                    jcVar5 = C67048jc.f182253h;
                }
                hVar.mo59779a(jcVar5.f182257c);
            }
            if ((jeVar.f182264a & 2) != 0) {
                C67073ka kaVar = jeVar.f182266c;
                if (kaVar == null) {
                    kaVar = C67073ka.f182324f;
                }
                int i = kaVar.f182328c;
                hVar.copyOnWrite();
                C67231i iVar5 = (C67231i) hVar.instance;
                iVar5.f182721a |= 16;
                iVar5.f182725e = i;
            }
            if ((jeVar.f182264a & 4) != 0) {
                C67091ks ksVar = jeVar.f182267d;
                if (ksVar == null) {
                    ksVar = C67091ks.f182386h;
                }
                float f2 = ksVar.f182391d;
                hVar.copyOnWrite();
                C67231i iVar6 = (C67231i) hVar.instance;
                iVar6.f182721a |= 4;
                iVar6.f182724d = f2;
            }
            C67231i iVar7 = (C67231i) hVar.build();
            qVar2.copyOnWrite();
            C67244v vVar5 = (C67244v) qVar2.instance;
            iVar7.getClass();
            vVar5.f182788o = iVar7;
            vVar5.f182774a |= 1073741824;
        }
        qVar.mergeFrom((C67244v) qVar2.build());
        cdVar.mo58885m(btVar, (C67244v) qVar.build());
        C62940bt btVar2 = C66678l.f181385g;
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        C120507d a = this.f334802a.mo104768a();
        C119891j jVar = C119891j.DEFAULT_AUDIO_ENCODING;
        int ordinal = this.f334803b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            C67451at atVar = C67451at.LINEAR16;
            kVar.copyOnWrite();
            C66678l lVar = (C66678l) kVar.instance;
            lVar.f181389b = atVar.f183321p;
            lVar.f181388a |= 1;
        } else if (ordinal == 2) {
            C67451at atVar2 = C67451at.OGG_OPUS;
            kVar.copyOnWrite();
            C66678l lVar2 = (C66678l) kVar.instance;
            lVar2.f181389b = atVar2.f183321p;
            lVar2.f181388a |= 1;
        }
        int b = a.mo104781b();
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a = 2 | lVar3.f181388a;
        lVar3.f181390c = (float) b;
        if (a.mo104780a() > 1) {
            C59104x b2 = C120342fi.f334807b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b2).mo56372aa(34705)).mo56387q("#audioInfoFromSessionConfig: channel count was %d, getting preferred channel from hotword flags", a.mo104780a());
            long j = this.f334805d;
            if (j > -1 && j < ((long) a.mo104780a())) {
                long j2 = this.f334805d;
                kVar.copyOnWrite();
                C66678l lVar4 = (C66678l) kVar.instance;
                lVar4.f181388a |= 8;
                lVar4.f181392e = (int) j2;
            }
        }
        int a2 = a.mo104780a();
        kVar.copyOnWrite();
        C66678l lVar5 = (C66678l) kVar.instance;
        lVar5.f181388a |= 4;
        lVar5.f181391d = a2;
        cdVar.mo58885m(btVar2, (C66678l) kVar.build());
    }
}
