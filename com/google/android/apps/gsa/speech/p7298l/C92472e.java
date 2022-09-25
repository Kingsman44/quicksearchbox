package com.google.android.apps.gsa.speech.p7298l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88183sf;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.amo;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5202d.p5203a.C66489b;
import com.google.speech.p5208h.C66579be;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.l.e */
/* compiled from: PG */
public final class C92472e {

    /* renamed from: A */
    public Query f257962A = Query.f252741b;

    /* renamed from: B */
    public boolean f257963B;

    /* renamed from: C */
    public C88183sf f257964C;

    /* renamed from: D */
    public boolean f257965D = false;

    /* renamed from: E */
    public boolean f257966E = false;

    /* renamed from: F */
    public boolean f257967F = false;

    /* renamed from: G */
    public int f257968G = 5;

    /* renamed from: H */
    private final String f257969H = "android-tv";

    /* renamed from: I */
    private final String f257970I = "intent-api";

    /* renamed from: J */
    private final String f257971J = "now-tv";

    /* renamed from: K */
    private final String f257972K = "service-api";

    /* renamed from: L */
    private final String f257973L = "voice-access";

    /* renamed from: M */
    private final String f257974M = "voice-ime";

    /* renamed from: N */
    private final String f257975N = "voice-search";

    /* renamed from: O */
    private boolean f257976O = true;

    /* renamed from: P */
    private boolean f257977P = false;

    /* renamed from: a */
    public C90536a f257978a = C90536a.VOICE_ACTIONS;

    /* renamed from: b */
    public C92460b f257979b;

    /* renamed from: c */
    public boolean f257980c = false;

    /* renamed from: d */
    public String f257981d = "en-US";

    /* renamed from: e */
    public List f257982e = C58485gu.m89845m();

    /* renamed from: f */
    public String f257983f;

    /* renamed from: g */
    public boolean f257984g;

    /* renamed from: h */
    public C92249k f257985h = C92249k.CONTACT_DIALING;

    /* renamed from: i */
    public C92252n f257986i = C92252n.ENDPOINTER_VOICESEARCH;

    /* renamed from: j */
    public int f257987j = 0;

    /* renamed from: k */
    public C92157ac f257988k;

    /* renamed from: l */
    public boolean f257989l = true;

    /* renamed from: m */
    public boolean f257990m = true;

    /* renamed from: n */
    public boolean f257991n = true;

    /* renamed from: o */
    public boolean f257992o = false;

    /* renamed from: p */
    public C66422b f257993p;

    /* renamed from: q */
    public C66422b f257994q;

    /* renamed from: r */
    public C66489b f257995r;

    /* renamed from: s */
    public String f257996s;

    /* renamed from: t */
    public String f257997t;

    /* renamed from: u */
    public amo f257998u;

    /* renamed from: v */
    public Long f257999v;

    /* renamed from: w */
    public boolean f258000w = true;

    /* renamed from: x */
    public boolean f258001x = true;

    /* renamed from: y */
    public String f258002y;

    /* renamed from: z */
    public C89061q f258003z;

    public C92472e(C86124t tVar) {
        this.f257977P = tVar.mo79746e(C90059dk.f249072ai);
    }

    /* renamed from: a */
    public final C92473f mo87218a() {
        C90536a aVar;
        C88183sf sfVar;
        int a;
        String str = this.f257996s;
        if (str == null) {
            C90536a aVar2 = this.f257978a;
            C90536a aVar3 = C90536a.INTENT_API;
            switch (aVar2.ordinal()) {
                case 0:
                    str = this.f257970I;
                    break;
                case 1:
                    str = this.f257972K;
                    break;
                case 2:
                case 4:
                case 6:
                case 7:
                case 8:
                    str = this.f257975N;
                    break;
                case 3:
                    str = this.f257974M;
                    break;
                case 5:
                    str = this.f257971J;
                    break;
                case 9:
                    str = this.f257969H;
                    break;
                case 10:
                    str = this.f257973L;
                    break;
                default:
                    throw new IllegalStateException("Unknown mode ".concat(String.valueOf(String.valueOf(aVar2))));
            }
        }
        String str2 = str;
        boolean z = false;
        if (this.f257997t == null) {
            List list = this.f257982e;
            boolean z2 = list != null && !list.isEmpty();
            C90536a aVar4 = this.f257978a;
            boolean z3 = this.f257977P && (sfVar = this.f257964C) != null && (sfVar.f238385a & 32) != 0 && ((a = C66579be.m97255a(sfVar.f238390f)) == 0 || a == 4);
            C90536a aVar5 = C90536a.INTENT_API;
            String str3 = "recognizer";
            switch (aVar4.ordinal()) {
                case 0:
                case 1:
                case 3:
                case 10:
                    if (true == z2) {
                        str3 = "multi-recognizer";
                        break;
                    }
                    break;
                case 2:
                    if (true == z2) {
                        str3 = "multi-voicesearch-web";
                        break;
                    } else {
                        str3 = "voicesearch-web";
                        break;
                    }
                case 4:
                    str3 = "sound-search";
                    break;
                case 5:
                    str3 = "sound-search-tv";
                    break;
                case 6:
                    break;
                case 7:
                    str3 = "voicesearch-clockwork";
                    break;
                case 8:
                    if (!z3) {
                        str3 = "pron-learning-tts";
                        break;
                    } else {
                        str3 = "pron-learning-v2";
                        break;
                    }
                case 9:
                    str3 = "assistant";
                    break;
                default:
                    throw new IllegalStateException("Unknown mode ".concat(String.valueOf(String.valueOf(aVar4))));
            }
            this.f257997t = str3;
        }
        if (this.f257999v == null) {
            this.f257999v = Long.valueOf(C90719ac.f253778a.f253779b.nextLong());
        }
        if (this.f257979b == null) {
            C92456a l = C92460b.m151978l();
            l.mo87171o(this.f257999v.longValue());
            this.f257979b = l.mo87157a();
        }
        long h = this.f257979b.mo87197h();
        if (this.f257999v.longValue() != h) {
            ((C59052c) ((C59052c) C92473f.f258004a.mo56226d()).mo56372aa(12809)).mo56351D("AudioInputParams requestId(%d) doesn't match SessionParams requestId(%d)", h, this.f257999v);
            int i = C90755l.f253831a;
        }
        if (this.f257978a == C90536a.VOICE_ACTIONS || (aVar = this.f257978a) == C90536a.SERVICE_API || aVar == C90536a.INTENT_API || aVar == C90536a.CLOCKWORK || aVar == C90536a.ANDROID_TV_SEARCH || aVar == C90536a.VOICE_ACCESS) {
            z = true;
        }
        this.f257976O = z;
        C90536a aVar6 = this.f257978a;
        C92460b bVar = this.f257979b;
        boolean z4 = this.f257980c;
        String str4 = this.f257981d;
        List list2 = this.f257982e;
        String str5 = this.f257983f;
        boolean z5 = this.f257984g;
        C92249k kVar = this.f257985h;
        C92252n nVar = this.f257986i;
        int i2 = this.f257987j;
        boolean z6 = this.f257989l;
        boolean z7 = this.f257990m;
        boolean z8 = this.f257991n;
        C66422b bVar2 = this.f257993p;
        boolean z9 = z8;
        C66422b bVar3 = this.f257994q;
        C66489b bVar4 = this.f257995r;
        C66422b bVar5 = bVar2;
        Long l2 = this.f257999v;
        l2.getClass();
        return new C92473f(aVar6, bVar, z4, str4, list2, str5, z5, kVar, nVar, i2, z6, z7, z9, bVar5, bVar3, bVar4, str2, l2.longValue(), this.f257997t, this.f257998u, false, this.f258000w, this.f258001x, this.f258002y, this.f258003z, this.f257992o, this.f257976O, this.f257962A, this.f257963B, this.f257988k, this.f257964C, this.f257966E, this.f257967F, this.f257968G);
    }
}
