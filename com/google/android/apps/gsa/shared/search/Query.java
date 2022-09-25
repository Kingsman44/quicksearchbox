package com.google.android.apps.gsa.shared.search;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p7194x.C91167a;
import com.google.android.apps.gsa.shared.search.p7138b.C90487c;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.C90741ay;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91012l;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.googlequicksearchbox.C146542e;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.common.base.C58824ao;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
public class Query implements Parcelable, C91012l, C90964a {
    public static final Parcelable.Creator CREATOR = new C90497e();

    /* renamed from: V */
    private static final ThreadLocal f252739V = new ThreadLocal();

    /* renamed from: a */
    public static final C59071e f252740a = C59071e.m91332i("com.google.android.apps.gsa.shared.search.Query");
    @Deprecated

    /* renamed from: b */
    public static volatile Query f252741b = new Query();

    /* renamed from: c */
    public static final C91167a f252742c = new C91167a(new C21375e());

    /* renamed from: A */
    public final int f252743A;

    /* renamed from: B */
    public final boolean f252744B;

    /* renamed from: C */
    public final long f252745C;

    /* renamed from: D */
    public final LatencyEvents f252746D;

    /* renamed from: E */
    public final long f252747E;

    /* renamed from: F */
    public final long f252748F;

    /* renamed from: G */
    public final long f252749G;

    /* renamed from: H */
    public final int f252750H;

    /* renamed from: I */
    public final long f252751I;

    /* renamed from: J */
    public final long f252752J;

    /* renamed from: K */
    public final long f252753K;

    /* renamed from: L */
    public final String f252754L;

    /* renamed from: M */
    public final C58495hd f252755M;

    /* renamed from: N */
    public final HotwordResultMetadata f252756N;

    /* renamed from: O */
    public final String f252757O;

    /* renamed from: P */
    public final String f252758P;

    /* renamed from: Q */
    public final String f252759Q;

    /* renamed from: R */
    public final amo f252760R;

    /* renamed from: S */
    public final C90208n f252761S;

    /* renamed from: T */
    public final int f252762T;

    /* renamed from: U */
    public C90488d f252763U;

    /* renamed from: W */
    private final String f252764W;

    /* renamed from: d */
    public final long f252765d;

    /* renamed from: e */
    public final long f252766e;

    /* renamed from: f */
    public final QueryTriggerType f252767f;

    /* renamed from: g */
    public final CharSequence f252768g;

    /* renamed from: h */
    public final String f252769h;

    /* renamed from: i */
    public final String f252770i;

    /* renamed from: j */
    public final C58485gu f252771j;

    /* renamed from: k */
    public final String f252772k;

    /* renamed from: l */
    public final String f252773l;

    /* renamed from: m */
    public final String f252774m;

    /* renamed from: n */
    public final int f252775n;

    /* renamed from: o */
    public final int f252776o;

    /* renamed from: p */
    public final int f252777p;

    /* renamed from: q */
    public final String f252778q;

    /* renamed from: r */
    public final C58495hd f252779r;

    /* renamed from: s */
    public final long f252780s;

    /* renamed from: t */
    public final Long f252781t;

    /* renamed from: u */
    public final byte[] f252782u;

    /* renamed from: v */
    public final C60456qs f252783v;

    /* renamed from: w */
    public final int f252784w;

    /* renamed from: x */
    public final Location f252785x;

    /* renamed from: y */
    public final Bundle f252786y;

    /* renamed from: z */
    public final Uri f252787z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Query() {
        /*
            r54 = this;
            r14 = r54
            r0 = r54
            com.google.android.apps.gsa.shared.logger.latency.LatencyEvents r1 = new com.google.android.apps.gsa.shared.logger.latency.LatencyEvents
            r24 = r1
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r1.<init>(r2, r4, r6, r8, r10)
            r1 = 0
            r3 = 0
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            com.google.android.apps.gsa.shared.search.QueryTriggerType r40 = com.google.android.apps.gsa.shared.search.QueryTriggerType.USER
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            com.google.android.apps.gsa.shared.monet.b.af.n r50 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB
            r51 = 0
            r52 = 0
            com.google.android.apps.gsa.shared.search.b.d r53 = com.google.android.apps.gsa.shared.search.p7138b.C90488d.f252873g
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r24, r25, r27, r29, r31, r32, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            com.google.android.apps.gsa.shared.search.b.g r0 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.shared.search.b.e r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90489e) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.shared.search.b.g r1 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r1
            int r2 = r1.f252886a
            r2 = r2 | 64
            r1.f252886a = r2
            java.lang.String r2 = "web"
            r1.f252892g = r2
            r1 = r54
            com.google.android.apps.gsa.shared.search.b.d r2 = r1.f252763U
            com.google.android.apps.gsa.shared.search.b.d r3 = com.google.android.apps.gsa.shared.search.p7138b.C90488d.f252873g
            com.google.protobuf.bn r2 = r3.createBuilder(r2)
            com.google.android.apps.gsa.shared.search.b.c r2 = (com.google.android.apps.gsa.shared.search.p7138b.C90487c) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.shared.search.b.d r3 = (com.google.android.apps.gsa.shared.search.p7138b.C90488d) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.shared.search.b.g r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r0
            r0.getClass()
            r3.f252879e = r0
            int r0 = r3.f252875a
            r0 = r0 | 8
            r3.f252875a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.gsa.shared.search.b.d r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90488d) r0
            r1.f252763U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.Query.<init>():void");
    }

    /* renamed from: ac */
    public static Query m147222ac(C90498f fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        fVar.mo84562U(1);
        long j = 0;
        fVar.mo84572d(131072, 0);
        fVar.mo84572d(2199023255552L, 0);
        fVar.mo84572d(8192, 0);
        fVar.mo84572d(512, 0);
        fVar.mo84572d(137438953472L, 0);
        fVar.mo84572d(281474976710656L, 0);
        fVar.mo84573e(16, 0);
        fVar.mo84573e(16384, 0);
        fVar.mo84552K(-2, -2);
        fVar.mo84572d(16384, true != z ? 0 : 16384);
        fVar.mo84572d(2097152, true != z2 ? 0 : 2097152);
        fVar.mo84572d(8388608, true != z4 ? 0 : 8388608);
        fVar.mo84572d(134217728, true != z5 ? 0 : 134217728);
        fVar.mo84572d(128, true != z6 ? 0 : 128);
        fVar.mo84572d(549755813888L, true != z3 ? 0 : 549755813888L);
        fVar.mo84572d(1024, (z4 || z7) ? 0 : 1024);
        if (true == z7) {
            j = 4096;
        }
        fVar.mo84573e(4096, j);
        fVar.mo84577i();
        fVar.mo84564W(0);
        fVar.mo84549H((Long) null);
        fVar.f252993k = null;
        fVar.f252965C = true;
        if (fVar.f253003u) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            fVar.mo84547F((Uri) null, 0, false);
        }
        Bundle bundle = fVar.f253000r;
        if (bundle != null) {
            if (bundle.containsKey("android.opa.extra.CONVERSATION_DELTA")) {
                fVar.f253000r.remove("android.opa.extra.CONVERSATION_DELTA");
            }
            if (fVar.f253000r.containsKey("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
                fVar.f253000r.remove("android.opa.extra.QUERY_INITIATED_BY_NGA");
            }
            if (fVar.f253000r.containsKey("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI")) {
                fVar.f253000r.remove("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI");
            }
            if (fVar.f253000r.containsKey("android.opa.extra.AUDIO_SESSION_ID")) {
                fVar.f253000r.remove("android.opa.extra.AUDIO_SESSION_ID");
            }
        }
        return fVar.mo84568a();
    }

    /* renamed from: bv */
    public static boolean m147223bv(Query query, Query query2) {
        if (query.mo84346be() != null ? !query.mo84346be().equals(query2.mo84346be()) : query2.mo84346be() != null) {
            return false;
        }
        CharSequence charSequence = query.f252768g;
        CharSequence charSequence2 = query2.f252768g;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            if (length2 == 0) {
                return true;
            }
            length = 0;
        }
        int a = C23341f.m43774a(charSequence, 0, length);
        int a2 = C23341f.m43774a(charSequence2, 0, length2);
        if (a < 0) {
            if (a2 >= 0) {
                return false;
            }
            return true;
        } else if (a2 < 0) {
            return false;
        } else {
            while (a >= 0 && a2 >= 0) {
                if (Character.toLowerCase(charSequence.charAt(a)) != Character.toLowerCase(charSequence2.charAt(a2))) {
                    return false;
                }
                a = C23341f.m43774a(charSequence, a + 1, length);
                a2 = C23341f.m43774a(charSequence2, a2 + 1, length2);
            }
            if (a >= 0 || a2 >= 0 || Character.isWhitespace(charSequence.charAt(length - 1)) != Character.isWhitespace(charSequence2.charAt(length2 - 1))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: dw */
    public static boolean m147224dw(CharSequence charSequence, int i) {
        if (i != -2) {
            return i >= 0 && i <= charSequence.length();
        }
        return true;
    }

    /* renamed from: ec */
    private final String m147225ec() {
        ArrayList arrayList = new ArrayList();
        if (mo84318bC()) {
            arrayList.add("action-expected");
        }
        if (mo84321bF()) {
            arrayList.add("assist");
        }
        if (mo84323bH()) {
            arrayList.add("auto-retried");
        }
        if (mo84325bJ()) {
            arrayList.add("captcha-requested");
        }
        if (mo84326bK()) {
            arrayList.add("clockwork");
        }
        if (mo84329bN()) {
            arrayList.add("device-triggered");
        }
        if (mo84330bO()) {
            arrayList.add("dialog-turn");
        }
        if (mo84331bP()) {
            arrayList.add("direct-embedded");
        }
        if (mo84333bR()) {
            arrayList.add("embedded-text");
        }
        if (mo84334bS()) {
            arrayList.add("embedded-voice");
        }
        if (TextUtils.isEmpty(mo84352bk())) {
            arrayList.add("empty-suggest");
        }
        if (mo84336bU()) {
            arrayList.add("external-audio");
        }
        if (mo84337bV()) {
            arrayList.add("eyes-free");
        }
        if (mo84397cd()) {
            arrayList.add("back-stack");
        }
        if (mo84398ce()) {
            arrayList.add("barge-in");
        }
        if (mo84399cf()) {
            arrayList.add("clockwork-opa");
        }
        if (mo84402ci()) {
            arrayList.add("now-screen");
        }
        if (mo84403cj()) {
            arrayList.add("opa");
        }
        if (mo84401ch()) {
            arrayList.add("gmm");
        }
        if (mo84412cs()) {
            arrayList.add("gearhead");
        }
        if (mo84413ct()) {
            arrayList.add("gearhead-demand-space");
        }
        if (mo84415cv()) {
            arrayList.add("hybrid-query");
        }
        if (mo84368cA()) {
            arrayList.add("md-hotword-detection");
        }
        if (mo84371cD()) {
            arrayList.add("native-music-with-mid");
        }
        if (mo84379cL()) {
            arrayList.add("query-text-from-voice");
        }
        if (this.f252744B) {
            arrayList.add("reopen-for-followon");
        }
        if (mo84381cN()) {
            arrayList.add("restored-state");
        }
        if (mo84382cO()) {
            arrayList.add("rewritten");
        }
        if (mo84384cQ()) {
            arrayList.add("secondary-search");
        }
        if (mo84386cS()) {
            arrayList.add("speech-endpointing");
        }
        if (mo84466dt()) {
            arrayList.add("untrusted");
        }
        if (mo84423dD()) {
            arrayList.add("voice-unlock");
        }
        if (mo84465ds()) {
            arrayList.add("unified-ime");
        }
        if (mo84471dz()) {
            arrayList.add("voice-ime");
        }
        if (mo84426dG()) {
            arrayList.add("full-srp");
        }
        if (mo84427dH()) {
            arrayList.add("opaque-actions");
        }
        if (mo84431dL()) {
            arrayList.add("play-tts");
        }
        if (mo84432dM()) {
            arrayList.add("resend-last-recording");
        }
        if (mo84435dP()) {
            arrayList.add("search-graph");
        }
        if (mo84406cm()) {
            arrayList.add("pixel-launcher-apps-search");
        }
        if (mo84405cl()) {
            arrayList.add("pixel-launcher-all-apps-search");
        }
        return new C58827ar(", ").mo56097d(arrayList);
    }

    /* renamed from: ed */
    private static String m147226ed(int i) {
        return i != -2 ? Integer.toString(i) : "end";
    }

    /* renamed from: ee */
    private final String m147227ee() {
        QueryTriggerType queryTriggerType = this.f252767f;
        QueryTriggerType queryTriggerType2 = QueryTriggerType.USER;
        int ordinal = queryTriggerType.ordinal();
        if (ordinal == 37) {
            return "opa-srp-result-click";
        }
        if (ordinal == 42) {
            return "inspire-refresh";
        }
        switch (ordinal) {
            case 0:
                return "user";
            case 1:
                return "intent";
            case 2:
                return "prefetch";
            case 3:
                return "predictive";
            case 4:
                return "webview";
            case 5:
                return "hotword";
            case 6:
                return "bthandsfree";
            case 7:
                return "wiredheadset";
            case 8:
                return "follow-on";
            case 9:
                return "history-refresh";
            case 10:
                return "corpus-selector";
            case 11:
                return "conversational-follow-on";
            case 12:
                return "doodle";
            default:
                switch (ordinal) {
                    case 15:
                        return "proxy-voice-button";
                    case 16:
                        return "action-escape-hatch";
                    case 17:
                        return "intent-api";
                    default:
                        switch (ordinal) {
                            case 19:
                                return "voice-action";
                            case 20:
                                return "music-search-intent";
                            case 21:
                                return "bisto";
                            case 22:
                                return "gearhead-screen-mic";
                            case 23:
                                return "gearhead-controller";
                            case 24:
                                return "gearhead-hardware-mic";
                            case 25:
                                return "gearhead-direct-action";
                            case 26:
                                return "unified-ime";
                            case 27:
                                return "voice-ime";
                            case 28:
                                return "opa-suggestion-chip";
                            case 29:
                                return "opa-text-editor";
                            case 30:
                                return "opa-hq-suggestion-chip";
                            case 31:
                                return "opa-proactive-notification";
                            default:
                                String valueOf = String.valueOf(queryTriggerType);
                                return "unknown(" + valueOf + ")";
                        }
                }
        }
    }

    /* renamed from: ef */
    private final String m147228ef() {
        long j = this.f252765d & 15;
        if (j == 0) {
            return "text";
        }
        if (j == 1) {
            return "voice";
        }
        if (j == 2) {
            return "music";
        }
        if (j == 3) {
            return "sentinel";
        }
        if (j == 6) {
            return "notificationAnnouncement";
        }
        if (j == 10) {
            return "networkTtsRequest";
        }
        if (j == 11) {
            return "localTtsRequest";
        }
        if (j == 7) {
            return "transcription";
        }
        if (j == 9) {
            return "assistData";
        }
        if (j == 12) {
            return "lobby";
        }
        if (j == 14) {
            return "opaEyes";
        }
        return "unknown(" + j + ")";
    }

    /* renamed from: eg */
    private static String m147229eg(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* renamed from: eh */
    private static void m147230eh(C91006f fVar, String str, String str2) {
        if (str2 != null) {
            fVar.mo85279c(str).mo85276a(C90752i.m148229c(str2));
        }
    }

    /* renamed from: ei */
    private static void m147231ei(C91006f fVar, String str, String str2) {
        if (str2 != null) {
            fVar.mo85279c(str).mo85276a(C90752i.m148233g(str2));
        }
    }

    /* renamed from: ej */
    private final C90498f m147232ej(String str, QueryTriggerType queryTriggerType) {
        Bundle bundle = new Bundle();
        bundle.putString("application-id-override", "gearhead");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("user-agent-suffix", str);
        }
        C90498f i = mo84480i();
        i.mo84562U(1);
        i.mo84572d(0, 1024);
        i.mo84561T(QueryTriggerType.USER);
        i.mo84572d(131072, 0);
        i.mo84572d(2199023255552L, 0);
        i.mo84572d(8192, 0);
        i.mo84572d(512, 0);
        i.mo84572d(137438953472L, 0);
        i.mo84577i();
        i.mo84552K(-2, -2);
        i.mo84572d(0, 16384);
        i.mo84572d(0, 2097152);
        i.mo84572d(0, 549755813888L);
        i.mo84564W(0);
        i.mo84549H((Long) null);
        i.mo84561T(queryTriggerType);
        i.mo84589u(bundle);
        return i;
    }

    /* renamed from: A */
    public final Query mo84238A() {
        C90498f i = mo84480i();
        i.mo84572d(0, 68719476736L);
        return i.mo84568a();
    }

    /* renamed from: B */
    public final Query mo84239B() {
        C90498f i = mo84480i();
        i.mo84572d(0, 2199023255552L);
        return i.mo84568a();
    }

    /* renamed from: C */
    public final Query mo84240C() {
        C90498f i = mo84480i();
        i.mo84572d(0, 33554432);
        return i.mo84568a();
    }

    /* renamed from: D */
    public final Query mo84241D() {
        C90498f i = mo84480i();
        i.mo84573e(0, 8);
        return i.mo84568a();
    }

    /* renamed from: E */
    public final Query mo84242E() {
        C90498f i = mo84480i();
        i.mo84561T(QueryTriggerType.HISTORY_REFRESH);
        return i.mo84568a();
    }

    /* renamed from: F */
    public final Query mo84243F() {
        C90498f i = mo84480i();
        i.mo84572d(0, 562949953421312L);
        i.mo84573e(0, 128);
        return i.mo84568a();
    }

    /* renamed from: G */
    public final Query mo84244G(boolean z) {
        if (z) {
            C90498f i = mo84480i();
            i.mo84572d(0, 562949953421312L);
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(562949953421312L, 0);
        return i2.mo84568a();
    }

    /* renamed from: H */
    public final Query mo84245H(int i, boolean z, QueryTriggerType queryTriggerType) {
        C90498f i2 = mo84480i();
        i2.mo84562U(i);
        i2.mo84572d(0, 562949953421312L);
        i2.mo84572d(131072, 0);
        i2.mo84572d(2199023255552L, 0);
        i2.mo84572d(8192, 0);
        i2.mo84572d(512, 0);
        i2.mo84552K(-2, -2);
        i2.mo84572d(16384, 0);
        i2.mo84572d(2097152, 0);
        i2.mo84564W(0);
        i2.mo84549H((Long) null);
        if (queryTriggerType != null) {
            i2.mo84561T(queryTriggerType);
        }
        if (z) {
            i2.mo84572d(0, 1024);
        }
        return i2.mo84568a();
    }

    /* renamed from: I */
    public final Query mo84246I() {
        return mo84241D().mo84244G(true);
    }

    /* renamed from: J */
    public final Query mo84247J() {
        C90498f i = mo84480i();
        i.mo84576h();
        i.mo84579k();
        i.mo84572d(1024, 0);
        i.mo84570ab();
        i.mo84558Q(SystemClock.elapsedRealtime());
        i.mo84569aa();
        return i.mo84568a();
    }

    /* renamed from: K */
    public final Query mo84248K() {
        C90498f i = mo84480i();
        i.mo84572d(0, 262144);
        i.mo84573e(0, 64);
        return i.mo84568a();
    }

    /* renamed from: L */
    public final Query mo84249L(CharSequence charSequence) {
        C90498f i = mo84480i();
        i.mo84546E(charSequence);
        i.mo84561T(QueryTriggerType.PREFETCH);
        i.mo84578j();
        i.mo84559R(0);
        i.mo84572d(0, 4194304);
        return i.mo84568a();
    }

    /* renamed from: M */
    public final Query mo84250M() {
        C90498f i = mo84480i();
        i.mo84572d(0, 2305843009213693952L);
        return i.mo84568a();
    }

    /* renamed from: N */
    public final Query mo84251N(CharSequence charSequence, boolean z) {
        C90498f i = mo84480i();
        i.mo84546E(charSequence);
        i.mo84552K(true != z ? -2 : 0, -2);
        i.mo84561T(QueryTriggerType.INTENT);
        i.mo84562U(0);
        return i.mo84568a();
    }

    /* renamed from: P */
    public final Query mo84253P() {
        C90498f i = mo84480i();
        i.mo84572d(0, 1048576);
        return i.mo84568a();
    }

    /* renamed from: Q */
    public final Query mo84254Q() {
        C90498f i = mo84480i();
        i.mo84573e(0, 4);
        return i.mo84568a();
    }

    /* renamed from: R */
    public final Query mo84255R(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        C90498f i = mo84480i();
        i.mo84562U(11);
        i.mo84572d(0, 1024);
        i.mo84589u(bundle);
        return i.mo84568a();
    }

    /* renamed from: S */
    public final Query mo84256S(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        C90498f i = mo84480i();
        i.mo84562U(10);
        i.mo84572d(0, 1024);
        i.mo84589u(bundle);
        return i.mo84568a();
    }

    /* renamed from: T */
    public final Query mo84257T() {
        C90498f i = mo84480i();
        i.mo84579k();
        return i.mo84568a();
    }

    /* renamed from: U */
    public final Query mo84258U() {
        C90498f i = mo84480i();
        i.mo84576h();
        i.mo84579k();
        i.mo84572d(0, 8192);
        i.mo84569aa();
        return i.mo84568a();
    }

    /* renamed from: V */
    public final Query mo84259V() {
        C90498f i = mo84480i();
        i.mo84562U(3);
        return i.mo84568a();
    }

    /* renamed from: W */
    public final String mo27493W() {
        return "Velvet.Query";
    }

    /* renamed from: X */
    public final Query mo84260X(boolean z) {
        if (z) {
            C90498f i = mo84480i();
            i.mo84572d(0, 16384);
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(16384, 0);
        return i2.mo84568a();
    }

    /* renamed from: Y */
    public final Query mo84261Y(boolean z) {
        C90498f i = mo84480i();
        i.mo84572d(140737488355328L, true != z ? 140737488355328L : 0);
        return i.mo84568a();
    }

    /* renamed from: Z */
    public final Query mo84262Z() {
        C90498f i = mo84480i();
        i.mo84562U(0);
        return i.mo84568a();
    }

    /* renamed from: a */
    public final int mo84263a(String str) {
        Bundle bundle = this.f252786y;
        if (bundle != null) {
            return bundle.getInt(str, 0);
        }
        return 0;
    }

    /* renamed from: aA */
    public final Query mo84264aA(String str, Bundle bundle) {
        Bundle g = mo84477g();
        if (g == null) {
            g = new Bundle();
        }
        g.putAll(bundle);
        boolean z = true;
        g.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        C90498f i = mo84480i();
        i.mo84554M(str, false);
        i.mo84551J(amo.OPA_ANDROID);
        i.mo84589u(g);
        Uri uri = (Uri) bundle.getParcelable("android.speech.extra.AUDIO_CONTENT_URI");
        if (uri != null) {
            int i2 = bundle.getInt("android.speech.extra.AUDIO_FREQUENCY");
            if (i2 == 0) {
                z = false;
            }
            C58838bb.m90869d(z, "Please set audioFrequency");
            i.mo84547F(uri, i2, false);
        }
        return i.mo84568a();
    }

    /* renamed from: aB */
    public final Query mo84265aB() {
        C90498f i = mo84480i();
        i.mo84572d(0, 1073741824);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* renamed from: aC */
    public final Query mo84266aC(String str, C90504l lVar) {
        C90498f i = mo84480i();
        i.mo84562U(0);
        i.mo84546E(lVar.mo84512d());
        int length = lVar.mo84512d().length();
        i.mo84552K(length, length);
        i.mo84588t(lVar.mo84510b(), true);
        int a = lVar.mo84509a();
        if (a != i.f252992j) {
            i.mo84571b();
            i.mo84562U(0);
            i.f252992j = a;
            i.f252965C = true;
        }
        i.mo84557P(lVar.mo84513e());
        i.mo84560S(lVar.mo84515f());
        i.mo84544C(lVar.mo84517h());
        i.mo84591w(lVar.mo84511c());
        i.mo84543B(str);
        i.mo84567Z(lVar.mo84516g());
        i.mo84572d(137438953472L, 0);
        i.mo84577i();
        if (lVar.mo84520j()) {
            i.mo84572d(0, 1125899906842624L);
        }
        if (lVar.mo84521k()) {
            i.mo84572d(0, 536870912);
            i.mo84573e(0, 72057594037927936L);
            i.mo84582n("query-header-visibility", 2);
        } else if (lVar.mo84519i()) {
            i.mo84572d(0, 536870912);
            i.mo84582n("query-header-visibility", 1);
        } else {
            i.mo84572d(536870912, 0);
            i.mo84573e(72057594037927936L, 0);
            i.mo84574f("query-header-visibility");
        }
        return i.mo84568a();
    }

    /* renamed from: aD */
    public final Query mo84267aD(Map map) {
        C90498f i = mo84480i();
        i.mo84544C(map);
        return i.mo84568a();
    }

    /* renamed from: aE */
    public final Query mo84268aE(CharSequence charSequence, boolean z) {
        QueryTriggerType queryTriggerType;
        if (C90741ay.m148211c(this.f252768g, charSequence)) {
            return this;
        }
        C90498f i = mo84480i();
        if (z) {
            queryTriggerType = this.f252767f;
        } else {
            queryTriggerType = QueryTriggerType.USER;
        }
        i.mo84561T(queryTriggerType);
        i.mo84562U(0);
        i.mo84546E(charSequence);
        int length = charSequence.length();
        i.mo84552K(length, length);
        return i.mo84568a();
    }

    /* renamed from: aF */
    public final Query mo84269aF(CharSequence charSequence, int i, int i2) {
        C58838bb.m90877l(m147224dw(charSequence, i), "selectionStart bad %s %s", charSequence, i);
        C58838bb.m90877l(m147224dw(charSequence, i2), "selectionEnd bad %s %s", charSequence, i2);
        if (!C90741ay.m148211c(this.f252768g, charSequence)) {
            C90498f i3 = mo84480i();
            i3.mo84561T(QueryTriggerType.USER);
            i3.mo84562U(0);
            i3.mo84546E(charSequence);
            i3.mo84552K(i, i2);
            return i3.mo84568a();
        } else if (i == mo84367c() && i2 == mo84315b()) {
            return this;
        } else {
            C90498f i4 = mo84480i();
            i4.mo84561T(QueryTriggerType.USER);
            i4.mo84552K(i, i2);
            return i4.mo84568a();
        }
    }

    /* renamed from: aG */
    public final Query mo84270aG(CharSequence charSequence, C58485gu guVar, long j, boolean z) {
        C90498f i = mo84480i();
        i.mo84546E(charSequence);
        if (!C58832aw.m90831a(guVar, i.f252987e)) {
            i.f252987e = guVar;
            i.f252965C = true;
        }
        i.mo84555N(j);
        i.mo84552K(-2, -2);
        i.mo84572d(0, (true != z ? 0 : 17179869184L) | 2048);
        i.mo84551J(this.f252760R);
        i.mo84561T(this.f252767f);
        return i.mo84568a();
    }

    /* renamed from: aH */
    public final Query mo84271aH(long j) {
        C58838bb.m90868c(j != 0);
        C90498f i = mo84480i();
        i.mo84548G(j);
        i.mo84573e(0, 1024);
        return i.mo84568a();
    }

    /* renamed from: aI */
    public final Query mo84272aI(amo amo) {
        C90498f i = mo84480i();
        i.mo84551J(amo);
        return i.mo84568a();
    }

    /* renamed from: aJ */
    public final Query mo84273aJ(boolean z) {
        if (z) {
            C90498f i = mo84480i();
            i.mo84572d(0, 144115188075855872L);
            i.mo84543B(this.f252772k);
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(144115188075855872L, 0);
        i2.mo84543B(this.f252772k);
        return i2.mo84568a();
    }

    /* renamed from: aK */
    public final Query mo84274aK(String str) {
        C90498f i = mo84480i();
        i.mo84553L(str);
        return i.mo84568a();
    }

    /* renamed from: aL */
    public final Query mo84275aL(String str) {
        C90498f i = mo84480i();
        i.mo84554M(str, false);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* renamed from: aM */
    public final Query mo84276aM(int i) {
        C90498f i2 = mo84480i();
        i2.mo84556O(i);
        return i2.mo84568a();
    }

    /* renamed from: aN */
    public final Query mo84277aN() {
        C90498f i = mo84480i();
        i.mo84572d(0, 4194304);
        return i.mo84568a();
    }

    /* renamed from: aO */
    public final Query mo84278aO(String str, String str2) {
        C90498f i = mo84480i();
        i.mo84584p(str, str2);
        return i.mo84568a();
    }

    /* renamed from: aP */
    public final Query mo84279aP(long j) {
        C90498f i = mo84480i();
        i.mo84558Q(j);
        return i.mo84568a();
    }

    /* renamed from: aQ */
    public final Query mo84280aQ(long j) {
        C90498f i = mo84480i();
        i.mo84559R(j);
        return i.mo84568a();
    }

    /* renamed from: aR */
    public final Query mo84281aR(Query query) {
        C90498f i = mo84480i();
        i.mo84559R(query.f252745C);
        i.mo84558Q(query.f252747E);
        return i.mo84568a();
    }

    /* renamed from: aS */
    public final Query mo84282aS(Map map) {
        C90498f i = mo84480i();
        Bundle g = mo84477g();
        if (g == null) {
            g = new Bundle();
        }
        g.putBundle("android.search.extra.SUGGEST_CGI_PARAMETERS", C90772bp.m148300h(map));
        i.mo84589u(g);
        return i.mo84568a();
    }

    /* renamed from: aT */
    public final Query mo84283aT() {
        C90498f i = mo84480i();
        i.mo84572d(0, 72057594037927936L);
        return i.mo84568a();
    }

    /* renamed from: aU */
    public final Query mo84284aU(boolean z) {
        if (z) {
            C90498f i = mo84480i();
            i.mo84572d(0, 128);
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(128, 0);
        return i2.mo84568a();
    }

    /* renamed from: aV */
    public final Query mo84285aV(long j) {
        C90498f i = mo84480i();
        i.mo84583o("text-search-timestamp", j);
        return i.mo84568a();
    }

    /* renamed from: aW */
    public final Query mo84286aW(QueryTriggerType queryTriggerType) {
        C90498f i = mo84480i();
        i.mo84561T(queryTriggerType);
        return i.mo84568a();
    }

    /* renamed from: aX */
    public final Query mo84287aX() {
        C90498f i = mo84480i();
        i.mo84573e(0, 32);
        return i.mo84568a();
    }

    /* renamed from: aY */
    public final Query mo84288aY() {
        C90498f i = mo84480i();
        i.mo84572d(0, 1024);
        return i.mo84568a();
    }

    /* renamed from: aZ */
    public final Query mo84289aZ(byte[] bArr) {
        C90498f i = mo84480i();
        i.mo84563V(bArr);
        return i.mo84568a();
    }

    /* renamed from: aa */
    public final Query mo84290aa(Uri uri, Bundle bundle, int i) {
        C90498f i2 = mo84480i();
        i2.mo84562U(7);
        i2.mo84572d(512, 0);
        i2.mo84572d(1024, 0);
        i2.mo84547F(uri, i, false);
        i2.mo84549H(Long.valueOf(this.f252749G));
        i2.mo84589u(bundle);
        return i2.mo84568a();
    }

    /* renamed from: ab */
    public final Query mo84291ab() {
        C90498f i = mo84480i();
        i.mo84572d(0, 2147483648L);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* renamed from: ad */
    public final Query mo84292ad() {
        C90498f i = mo84480i();
        i.mo84569aa();
        i.mo84572d(9007199254740992L, 0);
        i.mo84572d(35184372088832L, 0);
        i.mo84556O(0);
        if (mo84364bx("android.speech.extra.ACTION_DATA")) {
            Bundle bundle = new Bundle(this.f252786y);
            bundle.remove("android.speech.extra.ACTION_DATA");
            i.mo84589u(bundle);
        }
        return m147222ac(i, mo84337bV(), mo84412cs(), mo84413ct(), mo84326bK(), mo84319bD(), mo84390cW(), mo84446da()).mo84286aW(QueryTriggerType.FOLLOW_ON);
    }

    /* renamed from: ae */
    public final Query mo84293ae() {
        return m147222ac(mo84480i(), mo84337bV(), mo84412cs(), mo84413ct(), mo84326bK(), mo84319bD(), mo84390cW(), mo84446da()).mo84286aW(QueryTriggerType.CONVERSATIONAL_FOLLOW_ON);
    }

    /* renamed from: af */
    public final Query mo84294af() {
        return m147222ac(mo84480i(), false, false, false, false, false, false, false).mo84286aW(QueryTriggerType.USER);
    }

    /* renamed from: ag */
    public final Query mo84295ag(boolean z, boolean z2, boolean z3) {
        if (z) {
            return m147222ac(mo84480i(), z3, false, false, false, false, false, false).mo84286aW(QueryTriggerType.PROXY_VOICE_BUTTON);
        }
        if (z2) {
            return m147222ac(mo84480i(), z3, false, false, false, false, false, false).mo84286aW(QueryTriggerType.WIRED_HEADSET_BUTTON);
        }
        return m147222ac(mo84480i(), z3, false, false, false, false, false, false).mo84286aW(QueryTriggerType.BT_HEADSET_BUTTON);
    }

    /* renamed from: ah */
    public final Query mo84296ah() {
        return m147222ac(mo84480i(), false, false, false, false, false, false, false).mo84286aW(QueryTriggerType.HOTWORD);
    }

    /* renamed from: ai */
    public final Query mo84297ai() {
        C90498f i = mo84480i();
        i.mo84572d(0, 4611686018427387904L);
        return i.mo84568a();
    }

    /* renamed from: aj */
    public final Query mo84298aj(Uri uri, int i, boolean z) {
        C90498f i2 = mo84480i();
        i2.mo84562U(1);
        i2.mo84572d(512, 0);
        i2.mo84547F(uri, i, z);
        i2.mo84549H((Long) null);
        return i2.mo84568a();
    }

    /* renamed from: ak */
    public final Query mo84299ak(C60456qs qsVar) {
        C90498f i = mo84480i();
        i.mo84585q(qsVar);
        return i.mo84568a();
    }

    /* renamed from: al */
    public final Query mo84300al(int i) {
        C90498f i2 = mo84480i();
        i2.mo84586r(i);
        return i2.mo84568a();
    }

    /* renamed from: am */
    public final Query mo84301am() {
        C90498f i = mo84480i();
        i.mo84573e(0, 2);
        i.mo84572d(0, 16384);
        return i.mo84568a();
    }

    /* renamed from: an */
    public final Query mo84302an(String str, boolean z) {
        C90498f i = mo84480i();
        i.mo84580l(str, z);
        return i.mo84568a();
    }

    /* renamed from: ao */
    public final Query mo84303ao(String str, byte[] bArr) {
        C90498f i = mo84480i();
        i.mo84581m(str, bArr);
        return i.mo84568a();
    }

    /* renamed from: ap */
    public final Query mo84304ap(byte[] bArr) {
        C90498f i = mo84480i();
        i.mo84581m("android.opa.extra.CONVERSATION_DELTA", bArr);
        return i.mo84568a();
    }

    /* renamed from: aq */
    public final Query mo84305aq(String str) {
        C90498f i = mo84480i();
        i.mo84588t(str, true);
        i.f252966D = true;
        return i.mo84568a();
    }

    /* renamed from: ar */
    public final Query mo84306ar(String str) {
        C90498f i = mo84480i();
        Bundle g = mo84477g();
        if (g == null) {
            g = new Bundle();
        }
        g.putString("android.search.extra.EVENT_ID", str);
        i.mo84589u(g);
        i.f252966D = true;
        return i.mo84568a();
    }

    /* renamed from: as */
    public final Query mo84307as(Bundle bundle) {
        C90498f i = mo84480i();
        i.mo84589u(bundle);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* renamed from: at */
    public final Query mo84308at() {
        C90498f i = mo84480i();
        i.mo84573e(0, 2048);
        i.mo84573e(0, 2);
        i.mo84572d(16384, 0);
        return i.mo84568a();
    }

    /* renamed from: au */
    public final Query mo84309au() {
        C90498f i = mo84480i();
        i.mo84572d(0, 2097152);
        i.mo84572d(0, 16384);
        return i.mo84568a();
    }

    /* renamed from: av */
    public final Query mo84310av(HotwordResultMetadata hotwordResultMetadata) {
        C90498f i = mo84480i();
        HotwordResultMetadata hotwordResultMetadata2 = i.f252974L;
        boolean z = true;
        if (hotwordResultMetadata2 != null && hotwordResultMetadata2.equals(hotwordResultMetadata)) {
            z = false;
        }
        i.f252965C = z;
        i.f252974L = hotwordResultMetadata;
        return i.mo84568a();
    }

    /* renamed from: aw */
    public final Query mo84311aw(String str, int i) {
        C90498f i2 = mo84480i();
        i2.mo84582n(str, i);
        return i2.mo84568a();
    }

    /* renamed from: ax */
    public final Query mo84312ax(String str) {
        C90498f i = mo84480i();
        i.mo84591w(str);
        return i.mo84568a();
    }

    /* renamed from: ay */
    public final Query mo84313ay(String str, long j) {
        C90498f i = mo84480i();
        i.mo84583o(str, j);
        return i.mo84568a();
    }

    /* renamed from: az */
    public final Query mo84314az() {
        C90498f i = mo84480i();
        i.mo84572d(0, 1152921504606846976L);
        return i.mo84568a();
    }

    /* renamed from: b */
    public final int mo84315b() {
        int i = this.f252776o;
        return i == -2 ? this.f252768g.length() : i;
    }

    /* renamed from: bA */
    public final boolean mo84316bA() {
        return this.f252747E > 0;
    }

    /* renamed from: bB */
    public final boolean mo84317bB() {
        return this.f252745C > 0;
    }

    /* renamed from: bC */
    public final boolean mo84318bC() {
        return (this.f252765d & 4294967296L) != 0;
    }

    /* renamed from: bD */
    public final boolean mo84319bD() {
        return (this.f252765d & 134217728) != 0;
    }

    /* renamed from: bE */
    public final boolean mo84320bE() {
        return mo84346be().equals("web.app");
    }

    /* renamed from: bF */
    public final boolean mo84321bF() {
        return mo84433dN() && !mo84426dG() && !mo84326bK() && !mo84369cB() && !mo84385cR() && !mo84462dp() && !mo84337bV() && !mo84329bN() && !mo84434dO();
    }

    /* renamed from: bG */
    public final boolean mo84322bG() {
        return (this.f252765d & 15) == 9;
    }

    /* renamed from: bH */
    public final boolean mo84323bH() {
        return (this.f252765d & 137438953472L) != 0;
    }

    /* renamed from: bI */
    public final boolean mo84324bI() {
        return (this.f252766e & 2) != 0;
    }

    /* renamed from: bJ */
    public final boolean mo84325bJ() {
        return (this.f252765d & 16777216) != 0;
    }

    /* renamed from: bK */
    public final boolean mo84326bK() {
        return (this.f252765d & 8388608) != 0;
    }

    /* renamed from: bL */
    public final boolean mo84327bL() {
        return (this.f252766e & 65536) != 0;
    }

    /* renamed from: bM */
    public final boolean mo84328bM() {
        return this.f252767f == QueryTriggerType.CONVERSATIONAL_FOLLOW_ON;
    }

    /* renamed from: bN */
    public final boolean mo84329bN() {
        return (this.f252765d & 4503599627370496L) != 0;
    }

    /* renamed from: bO */
    public final boolean mo84330bO() {
        return mo84420dA() || mo84329bN() || mo84387cT();
    }

    /* renamed from: bP */
    public final boolean mo84331bP() {
        return (!mo84415cv() && mo84334bS()) || mo84333bR();
    }

    /* renamed from: bQ */
    public final boolean mo84332bQ() {
        return mo84333bR() || mo84334bS();
    }

    /* renamed from: bR */
    public final boolean mo84333bR() {
        return (this.f252765d & 68719476736L) != 0;
    }

    /* renamed from: bS */
    public final boolean mo84334bS() {
        return (this.f252765d & 17179869184L) != 0;
    }

    /* renamed from: bT */
    public final boolean mo84335bT() {
        return mo84420dA() && mo84334bS() && !this.f252770i.isEmpty();
    }

    /* renamed from: bU */
    public final boolean mo84336bU() {
        return (this.f252765d & 33554432) != 0;
    }

    /* renamed from: bV */
    public final boolean mo84337bV() {
        return (this.f252765d & 16384) != 0;
    }

    /* renamed from: bW */
    public final boolean mo84338bW() {
        return this.f252767f == QueryTriggerType.FOLLOW_ON;
    }

    /* renamed from: bX */
    public final boolean mo84339bX() {
        return (this.f252766e & 8192) != 0;
    }

    /* renamed from: bY */
    public final boolean mo84340bY() {
        return (this.f252765d & 281474976710656L) != 0;
    }

    /* renamed from: bZ */
    public final boolean mo84341bZ() {
        return (this.f252765d & 36028797018963968L) != 0;
    }

    /* renamed from: ba */
    public final Query mo84342ba(int i) {
        C58838bb.m90883r(mo84420dA());
        C90498f i2 = mo84480i();
        i2.mo84564W(i);
        return i2.mo84568a();
    }

    /* renamed from: bb */
    public final Query mo84343bb(boolean z) {
        if (z) {
            C90498f i = mo84480i();
            i.mo84572d(0, 274877906944L);
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(274877906944L, 0);
        return i2.mo84568a();
    }

    /* renamed from: bc */
    public final Query mo84344bc(String str) {
        C90498f i = mo84480i();
        i.mo84565X(str);
        return i.mo84568a();
    }

    /* renamed from: bd */
    public final Query mo84345bd() {
        C90498f i = mo84480i();
        i.mo84572d(1024, 0);
        return i.mo84568a();
    }

    /* renamed from: be */
    public final String mo84346be() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        return gVar.f252892g;
    }

    /* renamed from: bf */
    public final String mo84347bf(String str) {
        Bundle bundle = this.f252786y;
        if (bundle != null) {
            return bundle.getString(str, (String) null);
        }
        return null;
    }

    /* renamed from: bg */
    public final String mo84348bg() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 512) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252895j;
    }

    /* renamed from: bh */
    public final String mo84349bh() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 256) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252894i;
    }

    /* renamed from: bi */
    public final String mo84350bi() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 2048) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252897l;
    }

    /* renamed from: bj */
    public final String mo84351bj() {
        return (String) C58833ax.m90833j(mo84347bf("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME")).mo56105a(C58833ax.m90833j(mo84347bf("android.opa.extra.FOREGROUND_APP_TRIGGERED_ON"))).mo56111f();
    }

    /* renamed from: bk */
    public final String mo84352bk() {
        if (this.f252768g.length() == 0) {
            return this.f252768g.toString();
        }
        return C23341f.m43778e(this.f252768g);
    }

    /* renamed from: bl */
    public final String mo84353bl() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 1024) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252896k;
    }

    /* renamed from: bm */
    public final String mo84354bm() {
        C90488d dVar = this.f252763U;
        if ((dVar.f252875a & 16) != 0) {
            return dVar.f252880f;
        }
        return null;
    }

    /* renamed from: bn */
    public final String mo84355bn() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 4096) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252898m;
    }

    /* renamed from: bo */
    public final String mo84356bo() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 2) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252888c;
    }

    /* renamed from: bp */
    public final String mo84357bp() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 8192) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252899n;
    }

    /* renamed from: bq */
    public final String mo84358bq() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 8388608) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252909x;
    }

    /* renamed from: br */
    public final String mo84359br() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        if ((gVar.f252886a & 4) == 0) {
            return null;
        }
        C90491g gVar2 = this.f252763U.f252879e;
        if (gVar2 == null) {
            gVar2 = C90491g.f252884z;
        }
        return gVar2.f252889d;
    }

    /* renamed from: bs */
    public final String mo84360bs(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        if (equals(f252741b)) {
            return "Query[EMPTY]";
        }
        String bf = mo84347bf("android.search.extra.PARENT_EVENT_ID");
        LatencyEvents latencyEvents = this.f252746D;
        StringBuilder sb = new StringBuilder("{");
        C58827ar c = C58827ar.m90818c(',');
        C58824ao aoVar = new C58824ao(c, c);
        long j = latencyEvents.f246437a;
        String str61 = null;
        if (j != 0) {
            str = "applicationCreate=" + j;
        } else {
            str = null;
        }
        long j2 = latencyEvents.f246438b;
        if (j2 != 0) {
            str2 = "newSearchIntent=" + j2;
        } else {
            str2 = null;
        }
        Object[] objArr = new Object[3];
        long j3 = latencyEvents.f246440d;
        if (j3 != 0) {
            str3 = "activityCreate=" + j3;
        } else {
            str3 = null;
        }
        objArr[0] = str3;
        long j4 = latencyEvents.f246441e;
        if (j4 != 0) {
            str4 = "queryEntryBegin=" + j4;
        } else {
            str4 = null;
        }
        objArr[1] = str4;
        long j5 = latencyEvents.f246439c;
        if (j5 != 0) {
            str61 = "externalSearchIntent=" + j5;
        }
        objArr[2] = str61;
        aoVar.mo56100g(sb, new C58825ap(objArr, str, str2));
        sb.append('}');
        String sb2 = sb.toString();
        String ef = m147228ef();
        String ee = m147227ee();
        String obj2 = obj.toString();
        String be = mo84346be();
        int i = this.f252777p;
        long j6 = this.f252780s;
        Long l = this.f252781t;
        if (l != null) {
            new StringBuilder(" mResendAudioRequestId=").append(l);
            str5 = " mResendAudioRequestId=".concat(l.toString());
        } else {
            str5 = BuildConfig.FLAVOR;
        }
        String ed = m147226ed(mo84367c());
        String ed2 = m147226ed(mo84315b());
        String ec = m147225ec();
        if (mo84355bn() != null) {
            String valueOf = String.valueOf(mo84355bn());
            str6 = BuildConfig.FLAVOR;
            str7 = ", source=".concat(valueOf);
        } else {
            str6 = BuildConfig.FLAVOR;
            str7 = str6;
        }
        amo amo = this.f252760R;
        if (amo != null) {
            str9 = str7;
            str8 = ec;
            str10 = ", searchClient=" + amo.f159234au;
        } else {
            str8 = ec;
            str9 = str7;
            str10 = str6;
        }
        Location location = this.f252785x;
        String concat = location != null ? ", location-override=".concat(location.toString()) : str6;
        if (mo84356bo() != null) {
            str11 = concat;
            str12 = ", stick=".concat(String.valueOf(mo84356bo()));
        } else {
            str11 = concat;
            str12 = str6;
        }
        if (mo84349bh() != null) {
            str13 = str12;
            str14 = ", ludocid=".concat(String.valueOf(mo84349bh()));
        } else {
            str13 = str12;
            str14 = str6;
        }
        String concat2 = bf != null ? ", ei=".concat(bf) : str6;
        if (mo84348bg() != null) {
            str15 = concat2;
            str16 = ", immersiveBasePage=".concat(String.valueOf(mo84348bg()));
        } else {
            str15 = concat2;
            str16 = str6;
        }
        if (mo84350bi() != null) {
            str17 = str16;
            str18 = ", miniappLandingPage=".concat(String.valueOf(mo84350bi()));
        } else {
            str17 = str16;
            str18 = str6;
        }
        String str62 = str18;
        String str63 = true != mo84377cJ() ? str6 : ", ignore prefetching";
        if (mo84353bl() != null) {
            str19 = str63;
            str20 = ", richCardImmersiveVertical=".concat(String.valueOf(mo84353bl()));
        } else {
            str19 = str63;
            str20 = str6;
        }
        if (!this.f252779r.isEmpty()) {
            str21 = str20;
            str22 = ", persist-cgi-parameters=".concat(String.valueOf(String.valueOf(this.f252779r)));
        } else {
            str21 = str20;
            str22 = str6;
        }
        Uri uri = this.f252787z;
        if (uri != null) {
            str23 = str22;
            str24 = ", recording-uri=".concat(uri.toString());
        } else {
            str23 = str22;
            str24 = str6;
        }
        int i2 = this.f252743A;
        if (i2 != 0) {
            str26 = str24;
            str25 = str14;
            str27 = ", audio-sampling-rate=" + i2;
        } else {
            str26 = str24;
            str25 = str14;
            str27 = str6;
        }
        if (mo84317bB()) {
            String str64 = str27;
            str29 = str64;
            str28 = str10;
            str30 = ", submission-time=" + this.f252745C;
        } else {
            str29 = str27;
            str28 = str10;
            str30 = str6;
        }
        String concat3 = sb2.length() > 2 ? ", latency-events=".concat(sb2) : str6;
        if (mo84316bA()) {
            String str65 = concat3;
            str31 = str65;
            str32 = ", submission-elapsed-time=" + this.f252747E;
        } else {
            str31 = concat3;
            str32 = str6;
        }
        int i3 = this.f252784w;
        if (i3 != 0) {
            str34 = str32;
            str33 = ", speechie-mode=" + i3;
        } else {
            str33 = str6;
            str34 = str32;
        }
        long j7 = this.f252748F;
        if (j7 > 0) {
            str36 = str33;
            str35 = str34;
            str37 = ", speech-duration-ms=" + j7;
        } else {
            str35 = str34;
            str36 = str33;
            str37 = str6;
        }
        int i4 = this.f252750H;
        if (i4 != 0) {
            str38 = ", uiToLaunchForVoiceSearch=" + i4;
        } else {
            str38 = str6;
        }
        String str66 = this.f252772k;
        String concat4 = str66 != null ? ", original-url=".concat(str66) : str6;
        String str67 = this.f252774m;
        if (str67 != null) {
            str39 = concat4;
            str40 = ", non-search-url=".concat(str67);
        } else {
            str39 = concat4;
            str40 = str6;
        }
        if (mo84359br() != null) {
            str41 = str40;
            str42 = ", fragment=".concat(String.valueOf(mo84359br()));
        } else {
            str41 = str40;
            str42 = str6;
        }
        if (!this.f252755M.isEmpty()) {
            str43 = str42;
            str44 = ", clockwork-parameters=".concat(String.valueOf(String.valueOf(this.f252755M)));
        } else {
            str43 = str42;
            str44 = str6;
        }
        String str68 = this.f252778q;
        if (str68 != null) {
            str45 = str44;
            str46 = ", PageToken=".concat(str68);
        } else {
            str45 = str44;
            str46 = str6;
        }
        String str69 = this.f252754L;
        if (str69 != null) {
            str47 = str46;
            str48 = ", LanguageOverride=".concat(str69);
        } else {
            str47 = str46;
            str48 = str6;
        }
        String str70 = this.f252769h;
        if (str70 != null) {
            str49 = str48;
            str50 = ", Mid=".concat(str70);
        } else {
            str49 = str48;
            str50 = str6;
        }
        HotwordResultMetadata hotwordResultMetadata = this.f252756N;
        if (hotwordResultMetadata != null) {
            str51 = str50;
            str52 = ", hotwordMetadata=".concat(hotwordResultMetadata.toString());
        } else {
            str51 = str50;
            str52 = str6;
        }
        String str71 = this.f252757O;
        if (str71 != null) {
            str53 = str52;
            str54 = ", toolbeltState=".concat(str71);
        } else {
            str53 = str52;
            str54 = str6;
        }
        if (mo84357bp() != null) {
            str55 = str54;
            str56 = ", ved=".concat(String.valueOf(mo84357bp()));
        } else {
            str55 = str54;
            str56 = str6;
        }
        if (mo84354bm() != null) {
            str57 = str56;
            str58 = ", sessionType=".concat(String.valueOf(mo84354bm()));
        } else {
            str57 = str56;
            str58 = str6;
        }
        String str72 = this.f252759Q;
        if (str72 != null) {
            str59 = str58;
            str60 = ", seiParamForLocationPromptReload=".concat(str72);
        } else {
            str59 = str58;
            str60 = str6;
        }
        return "Query[" + ef + " from " + ee + ": \"" + obj2 + "\"/" + be + "@" + i + " CID=" + j6 + str5 + ", sel-" + ed + ":" + ed2 + ", " + str8 + str9 + str28 + str11 + str13 + str25 + str15 + str17 + str62 + str19 + str21 + str23 + str26 + str29 + str30 + str31 + str35 + str36 + str37 + str38 + str39 + str41 + str43 + str45 + str47 + str49 + str51 + str53 + str55 + str57 + str59 + str60 + (true != mo84364bx("android.opa.extra.CONVERSATION_DELTA") ? str6 : ", has ConversationDelta") + (mo84441dV() != null ? ", has SuggestionsParams" : str6) + "] is from QSB? " + mo84407cn();
    }

    /* renamed from: bt */
    public final boolean mo84361bt() {
        if (mo84330bO() || mo84403cj()) {
            return true;
        }
        return mo84374cG() && mo84364bx("android.speech.extra.ACTION_DATA");
    }

    /* renamed from: bu */
    public final boolean mo84362bu() {
        return !mo84392cY() || !this.f252770i.isEmpty();
    }

    /* renamed from: bw */
    public final boolean mo84363bw(String str) {
        Bundle bundle = this.f252786y;
        return bundle != null && bundle.getBoolean(str, false);
    }

    /* renamed from: bx */
    public final boolean mo84364bx(String str) {
        Bundle bundle = this.f252786y;
        return bundle != null && bundle.containsKey(str);
    }

    /* renamed from: by */
    public final boolean mo84365by() {
        return (this.f252766e & 2097152) != 0;
    }

    /* renamed from: bz */
    public final boolean mo84366bz() {
        return this.f252787z != null;
    }

    /* renamed from: c */
    public final int mo84367c() {
        int i = this.f252775n;
        return i == -2 ? this.f252768g.length() : i;
    }

    /* renamed from: cA */
    public final boolean mo84368cA() {
        return (this.f252765d & 1152921504606846976L) != 0;
    }

    /* renamed from: cB */
    public final boolean mo84369cB() {
        return (this.f252765d & 15) == 2;
    }

    /* renamed from: cC */
    public final boolean mo84370cC() {
        return mo84369cB() && mo84403cj();
    }

    /* renamed from: cD */
    public final boolean mo84371cD() {
        return ((this.f252765d & 274877906944L) == 0 || !mo84369cB() || this.f252769h == null) ? false : true;
    }

    /* renamed from: cE */
    public final boolean mo84372cE() {
        return (this.f252765d & 15) == 10;
    }

    /* renamed from: cF */
    public final boolean mo84373cF() {
        return (this.f252765d & 15) == 13;
    }

    /* renamed from: cG */
    public final boolean mo84374cG() {
        return (this.f252765d & 15) == 6;
    }

    /* renamed from: cH */
    public final boolean mo84375cH() {
        return (this.f252765d & 15) == 14;
    }

    /* renamed from: cI */
    public final boolean mo84376cI() {
        return (this.f252766e & 16384) != 0;
    }

    /* renamed from: cJ */
    public final boolean mo84377cJ() {
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        return gVar.f252904s;
    }

    /* renamed from: cK */
    public final boolean mo84378cK() {
        return (this.f252765d & 268435456) != 0;
    }

    /* renamed from: cL */
    public final boolean mo84379cL() {
        return (this.f252765d & 2048) != 0;
    }

    /* renamed from: cM */
    public final boolean mo84380cM() {
        return mo84397cd() || mo84323bH() || mo84341bZ();
    }

    /* renamed from: cN */
    public final boolean mo84381cN() {
        return (this.f252765d & 8192) != 0;
    }

    /* renamed from: cO */
    public final boolean mo84382cO() {
        return (this.f252765d & 524288) != 0;
    }

    /* renamed from: cP */
    public final boolean mo84383cP(Query query) {
        return this.f252780s == query.f252780s;
    }

    /* renamed from: cQ */
    public final boolean mo84384cQ() {
        return (this.f252765d & 4096) != 0;
    }

    /* renamed from: cR */
    public final boolean mo84385cR() {
        return (this.f252765d & 15) == 3;
    }

    /* renamed from: cS */
    public final boolean mo84386cS() {
        return (this.f252765d & 140737488355328L) == 0;
    }

    /* renamed from: cT */
    public final boolean mo84387cT() {
        return (this.f252766e & 16) != 0;
    }

    /* renamed from: cU */
    public final boolean mo84388cU() {
        if (mo84326bK() || mo84403cj() || mo84410cq() || mo84339bX()) {
            return false;
        }
        return (!mo84412cs() || !mo84333bR()) && !mo84376cI() && mo84391cX();
    }

    /* renamed from: cV */
    public final boolean mo84389cV() {
        return (!mo84391cX() && mo84420dA()) || (mo84370cC() && !mo84391cX());
    }

    /* renamed from: cW */
    public final boolean mo84390cW() {
        return (this.f252765d & 128) != 0;
    }

    /* renamed from: cX */
    public final boolean mo84391cX() {
        if (!this.f252770i.isEmpty()) {
            return mo84392cY() || mo84420dA();
        }
        return false;
    }

    /* renamed from: cY */
    public final boolean mo84392cY() {
        return (this.f252765d & 15) == 0;
    }

    /* renamed from: cZ */
    public final boolean mo84393cZ() {
        return mo84392cY() && mo84403cj();
    }

    /* renamed from: ca */
    public final boolean mo84394ca() {
        return this.f252767f == QueryTriggerType.ACTION_ESCAPE_HATCH;
    }

    /* renamed from: cb */
    public final boolean mo84395cb(C58485gu guVar, C58485gu guVar2) {
        if (guVar.isEmpty()) {
            return !guVar2.contains(mo84355bn());
        }
        return guVar.contains(mo84355bn());
    }

    /* renamed from: cc */
    public final boolean mo84396cc() {
        long j = this.f252765d;
        return ((562949953421312L & j) == 0 || (j & 134217728) == 0) ? false : true;
    }

    /* renamed from: cd */
    public final boolean mo84397cd() {
        return (this.f252765d & 131072) != 0;
    }

    /* renamed from: ce */
    public final boolean mo84398ce() {
        return (this.f252765d & 2251799813685248L) != 0;
    }

    /* renamed from: cf */
    public final boolean mo84399cf() {
        long j = this.f252765d;
        return ((562949953421312L & j) == 0 || (j & 8388608) == 0) ? false : true;
    }

    /* renamed from: cg */
    public final boolean mo84400cg() {
        return (this.f252765d & 2199023255552L) != 0;
    }

    /* renamed from: ch */
    public final boolean mo84401ch() {
        return (this.f252766e & 8) != 0;
    }

    /* renamed from: ci */
    public final boolean mo84402ci() {
        return (this.f252765d & 18014398509481984L) != 0;
    }

    /* renamed from: cj */
    public final boolean mo84403cj() {
        long j = this.f252765d;
        return (562949953421312L & j) != 0 && (8388608 & j) == 0 && (j & 134217728) == 0;
    }

    /* renamed from: ck */
    public final boolean mo84404ck() {
        return (this.f252765d & 562949953421312L) != 0 && mo84401ch();
    }

    /* renamed from: cl */
    public final boolean mo84405cl() {
        return (this.f252766e & 64) != 0;
    }

    /* renamed from: cm */
    public final boolean mo84406cm() {
        return (this.f252765d & 262144) != 0;
    }

    /* renamed from: cn */
    public final boolean mo84407cn() {
        return (this.f252765d & 2305843009213693952L) != 0;
    }

    /* renamed from: co */
    public final boolean mo84408co() {
        return (this.f252765d & 8589934592L) != 0;
    }

    /* renamed from: cp */
    public final boolean mo84409cp() {
        return (this.f252766e & 524288) != 0;
    }

    /* renamed from: cq */
    public final boolean mo84410cq() {
        return (this.f252766e & 4) != 0;
    }

    /* renamed from: cr */
    public final boolean mo84411cr() {
        return (this.f252766e & 2048) != 0;
    }

    /* renamed from: cs */
    public final boolean mo84412cs() {
        return (this.f252765d & 2097152) != 0;
    }

    /* renamed from: ct */
    public final boolean mo84413ct() {
        return (this.f252765d & 549755813888L) != 0;
    }

    /* renamed from: cu */
    public final boolean mo84414cu() {
        return this.f252767f == QueryTriggerType.HISTORY_REFRESH;
    }

    /* renamed from: cv */
    public final boolean mo84415cv() {
        return (this.f252765d & 9007199254740992L) != 0;
    }

    /* renamed from: cw */
    public final boolean mo84416cw() {
        return (this.f252766e & 72057594037927936L) != 0;
    }

    /* renamed from: cx */
    public final boolean mo84417cx() {
        return (this.f252766e & 128) != 0;
    }

    /* renamed from: cy */
    public final boolean mo84418cy() {
        return (this.f252765d & 15) == 12;
    }

    /* renamed from: cz */
    public final boolean mo84419cz() {
        long j = this.f252765d & 15;
        return j == 11 || j == 10;
    }

    /* renamed from: dA */
    public final boolean mo84420dA() {
        return (this.f252765d & 15) == 1;
    }

    /* renamed from: dB */
    public final boolean mo84421dB() {
        return (this.f252765d & 4611686018427387904L) != 0;
    }

    /* renamed from: dC */
    public final boolean mo84422dC() {
        return mo84420dA() && mo84403cj();
    }

    /* renamed from: dD */
    public final boolean mo84423dD() {
        return (this.f252765d & 256) != 0;
    }

    /* renamed from: dE */
    public final boolean mo84424dE() {
        return (this.f252766e & 32768) != 0;
    }

    /* renamed from: dF */
    public final boolean mo84425dF() {
        return mo84346be().equals("web");
    }

    /* renamed from: dG */
    public final boolean mo84426dG() {
        return (this.f252765d & 4194304) != 0;
    }

    /* renamed from: dH */
    public final boolean mo84427dH() {
        return (this.f252765d & 1073741824) != 0;
    }

    /* renamed from: dI */
    public final boolean mo84428dI() {
        return (this.f252765d & 65536) != 0;
    }

    /* renamed from: dJ */
    public final boolean mo84429dJ() {
        return mo84392cY() || mo84420dA() || mo84369cB();
    }

    /* renamed from: dK */
    public final boolean mo84430dK() {
        return mo84429dJ() && mo84435dP() && !mo84422dC();
    }

    /* renamed from: dL */
    public final boolean mo84431dL() {
        return (this.f252765d & 1024) != 0;
    }

    /* renamed from: dM */
    public final boolean mo84432dM() {
        return (this.f252765d & 512) != 0;
    }

    /* renamed from: dN */
    public final boolean mo84433dN() {
        return mo84425dF() && this.f252777p == 0;
    }

    /* renamed from: dO */
    public final boolean mo84434dO() {
        return mo84403cj() || (this.f252765d & 35184372088832L) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r5 != false) goto L_0x009c;
     */
    /* renamed from: dP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84435dP() {
        /*
            r9 = this;
            boolean r0 = r9.mo84388cU()
            r1 = 1
            if (r0 != 0) goto L_0x009c
            boolean r0 = r9.mo84420dA()
            r2 = 0
            if (r0 == 0) goto L_0x0024
            boolean r0 = r9.mo84326bK()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r9.mo84403cj()
            if (r0 == 0) goto L_0x009c
            long r4 = r9.f252765d
            r6 = 144115188075855872(0x200000000000000, double:4.7783097267364807E-299)
            long r4 = r4 & r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x009c
        L_0x0024:
            long r4 = r9.f252765d
            r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r4 = r4 & r6
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0054
            boolean r4 = r9.mo84326bK()
            if (r4 != 0) goto L_0x0040
            boolean r4 = r9.mo84403cj()
            if (r4 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r4 = 0
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            boolean r5 = r9.mo84438dS()
            if (r5 == 0) goto L_0x004f
            boolean r5 = r9.mo84391cX()
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r4 != 0) goto L_0x0054
            if (r5 != 0) goto L_0x009c
        L_0x0054:
            long r4 = r9.f252765d
            r6 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r6 = r6 & r4
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            boolean r6 = r9.mo84326bK()
            if (r6 != 0) goto L_0x009c
        L_0x0066:
            r6 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r4 = r4 & r6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x007c
            boolean r2 = r9.mo84412cs()
            if (r2 != 0) goto L_0x009c
            boolean r2 = r9.mo84413ct()
            if (r2 != 0) goto L_0x009c
        L_0x007c:
            boolean r2 = r9.mo84369cB()
            if (r2 == 0) goto L_0x0088
            boolean r2 = r9.mo84403cj()
            if (r2 == 0) goto L_0x009c
        L_0x0088:
            boolean r2 = r9.mo84373cF()
            if (r2 != 0) goto L_0x009c
            boolean r2 = r9.mo84469dx()
            if (r2 != 0) goto L_0x009c
            boolean r2 = r9.mo84376cI()
            if (r2 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            return r0
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.Query.mo84435dP():boolean");
    }

    /* renamed from: dQ */
    public final boolean mo84436dQ() {
        return (this.f252765d & 536870912) != 0;
    }

    /* renamed from: dR */
    public final boolean mo84437dR() {
        return (this.f252765d & 67108864) == 0;
    }

    /* renamed from: dS */
    public final boolean mo84438dS() {
        return (this.f252765d & 274877906944L) != 0;
    }

    /* renamed from: dT */
    public final byte[] mo84439dT() {
        return this.f252786y.getByteArray("android.opa.extra.CONVERSATION_DELTA");
    }

    /* renamed from: dU */
    public final byte[] mo84440dU(String str) {
        Bundle bundle = this.f252786y;
        if (bundle != null) {
            return bundle.getByteArray(str);
        }
        return null;
    }

    /* renamed from: dV */
    public final byte[] mo84441dV() {
        Bundle bundle = this.f252786y;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray("android.opa.extra.SUGGESTIONS_PARAMS");
    }

    /* renamed from: dW */
    public final Query mo84442dW(Parcelable parcelable, Parcelable parcelable2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        bundle.putParcelable("notification-sender", parcelable2);
        C90498f i = mo84480i();
        i.mo84562U(6);
        i.mo84572d(16384, 16384);
        i.mo84572d(0, 1024);
        i.mo84589u(bundle);
        return i.mo84568a();
    }

    /* renamed from: dX */
    public final Query mo84443dX(Uri uri, int i, boolean z, long j, String str, QueryTriggerType queryTriggerType) {
        C90498f ej = m147232ej(str, queryTriggerType);
        ej.mo84547F(uri, i, z);
        ej.mo84586r(1);
        ej.mo84593y(this.f252746D.mo83792a(j));
        return ej.mo84568a();
    }

    /* renamed from: dY */
    public final Query mo84444dY(long j, String str, QueryTriggerType queryTriggerType) {
        C90498f ej = m147232ej(str, queryTriggerType);
        ej.mo84593y(this.f252746D.mo83792a(j));
        return ej.mo84568a();
    }

    /* renamed from: dZ */
    public final Query mo84445dZ() {
        C90498f i = mo84480i();
        i.mo84572d(0, 70368744177664L);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* renamed from: da */
    public final boolean mo84446da() {
        return (this.f252766e & 4096) != 0;
    }

    /* renamed from: db */
    public final boolean mo84447db() {
        return (this.f252765d & 15) == 7;
    }

    /* renamed from: dc */
    public final boolean mo84448dc() {
        return this.f252767f == QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED;
    }

    /* renamed from: dd */
    public final boolean mo84449dd() {
        return this.f252767f == QueryTriggerType.BISTO;
    }

    /* renamed from: de */
    public final boolean mo84450de() {
        return this.f252767f == QueryTriggerType.BT_HEADSET_BUTTON;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: df */
    public final boolean mo84452df() {
        return this.f252767f == QueryTriggerType.CORPUS_SELECTOR;
    }

    /* renamed from: dg */
    public final boolean mo84453dg() {
        return this.f252767f == QueryTriggerType.GEARHEAD_CONTROLLER;
    }

    /* renamed from: dh */
    public final boolean mo84454dh() {
        return this.f252767f == QueryTriggerType.GEARHEAD_HARDWARE_MIC;
    }

    /* renamed from: di */
    public final boolean mo84455di() {
        return this.f252767f == QueryTriggerType.GEARHEAD_SCREEN_MIC;
    }

    /* renamed from: dj */
    public final boolean mo84456dj() {
        return this.f252767f == QueryTriggerType.HOTWORD || this.f252767f == QueryTriggerType.OPA_MORRIS_HOTWORD;
    }

    /* renamed from: dk */
    public final boolean mo84457dk() {
        return this.f252767f == QueryTriggerType.OPA_MORRIS_HOTWORD || this.f252767f == QueryTriggerType.OPA_MORRIS_GENERIC;
    }

    /* renamed from: dl */
    public final boolean mo84458dl() {
        return this.f252767f == QueryTriggerType.OPA_MORRIS_HOTWORD;
    }

    /* renamed from: dm */
    public final boolean mo84459dm() {
        return this.f252767f == QueryTriggerType.PROXY_VOICE_BUTTON;
    }

    /* renamed from: dn */
    public final boolean mo84460dn() {
        return this.f252767f == QueryTriggerType.USER || this.f252767f == QueryTriggerType.AGA_SEARCHPLATE_MIC;
    }

    /* renamed from: do */
    public final boolean mo84461do() {
        return (this.f252766e & 262144) != 0;
    }

    /* renamed from: dp */
    public final boolean mo84462dp() {
        return this.f252767f == QueryTriggerType.WEBVIEW;
    }

    /* renamed from: dq */
    public final boolean mo84463dq() {
        return this.f252767f == QueryTriggerType.WIRED_HEADSET_BUTTON;
    }

    /* renamed from: dr */
    public final boolean mo84464dr() {
        return (this.f252766e & 32) != 0;
    }

    /* renamed from: ds */
    public final boolean mo84465ds() {
        return this.f252767f == QueryTriggerType.UNIFIED_IME;
    }

    /* renamed from: dt */
    public final boolean mo84466dt() {
        return (this.f252765d & 2147483648L) != 0;
    }

    /* renamed from: du */
    public final boolean mo84467du() {
        return mo84474eb() != 1;
    }

    /* renamed from: dv */
    public final boolean mo84468dv() {
        if (mo84339bX()) {
            return false;
        }
        if (mo84369cB() || mo84420dA() || mo84403cj() || mo84399cf() || mo84373cF()) {
            return true;
        }
        return (mo84392cY() && !this.f252770i.isEmpty()) || mo84333bR();
    }

    /* renamed from: dx */
    public final boolean mo84469dx() {
        return mo84410cq() && !mo84403cj();
    }

    /* renamed from: dy */
    public final boolean mo84470dy() {
        return this.f252767f == QueryTriggerType.VOICE_ACTION;
    }

    /* renamed from: dz */
    public final boolean mo84471dz() {
        return this.f252767f == QueryTriggerType.VOICE_IME;
    }

    /* renamed from: e */
    public final int mo84472e() {
        if (mo84420dA()) {
            return this.f252750H;
        }
        return 0;
    }

    /* renamed from: ea */
    public final Query mo84473ea() {
        C90498f i = mo84480i();
        i.mo84572d(0, 4398046511104L);
        i.mo84543B(this.f252772k);
        return i.mo84568a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: eb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84474eb() {
        /*
            r9 = this;
            java.lang.String r0 = r9.mo84346be()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 5
            r4 = 7
            r5 = 4
            r6 = 6
            r7 = 2
            r8 = 1
            switch(r1) {
                case -1857627214: goto L_0x0059;
                case -764028567: goto L_0x004f;
                case -763740848: goto L_0x0045;
                case 117588: goto L_0x003b;
                case 1222272135: goto L_0x0031;
                case 1222272944: goto L_0x0027;
                case 1222284848: goto L_0x001d;
                case 1222292087: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0063
        L_0x0013:
            java.lang.String r1 = "web.vid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 3
            goto L_0x0064
        L_0x001d:
            java.lang.String r1 = "web.nws"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 5
            goto L_0x0064
        L_0x0027:
            java.lang.String r1 = "web.bks"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 7
            goto L_0x0064
        L_0x0031:
            java.lang.String r1 = "web.app"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 4
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 0
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "web.shop"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 6
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "web.isch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 2
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "summons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x0063:
            r0 = -1
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0072;
                case 2: goto L_0x0071;
                case 3: goto L_0x0070;
                case 4: goto L_0x006f;
                case 5: goto L_0x006e;
                case 6: goto L_0x006b;
                case 7: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            return r8
        L_0x0068:
            r0 = 8
            return r0
        L_0x006b:
            r0 = 9
            return r0
        L_0x006e:
            return r3
        L_0x006f:
            return r4
        L_0x0070:
            return r6
        L_0x0071:
            return r5
        L_0x0072:
            return r2
        L_0x0073:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.Query.mo84474eb():int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Query query = (Query) obj;
        if (this.f252765d == query.f252765d && this.f252766e == query.f252766e && this.f252775n == query.f252775n && this.f252776o == query.f252776o && this.f252777p == query.f252777p && this.f252780s == query.f252780s && this.f252784w == query.f252784w && this.f252743A == query.f252743A && this.f252744B == query.f252744B && this.f252745C == query.f252745C && this.f252747E == query.f252747E && this.f252748F == query.f252748F && this.f252749G == query.f252749G && this.f252750H == query.f252750H && this.f252751I == query.f252751I && this.f252752J == query.f252752J && this.f252753K == query.f252753K && this.f252762T == query.f252762T && this.f252767f == query.f252767f) {
            CharSequence charSequence = this.f252768g;
            CharSequence charSequence2 = query.f252768g;
            return charSequence.toString().contentEquals(query.f252768g) && C58832aw.m90831a(this.f252769h, query.f252769h) && C58832aw.m90831a(this.f252770i, query.f252770i) && C58832aw.m90831a(this.f252771j, query.f252771j) && C58832aw.m90831a(this.f252772k, query.f252772k) && C58832aw.m90831a(this.f252773l, query.f252773l) && C58832aw.m90831a(this.f252774m, query.f252774m) && C58832aw.m90831a(this.f252778q, query.f252778q) && C58832aw.m90831a(this.f252779r, query.f252779r) && C58832aw.m90831a(this.f252781t, query.f252781t) && Arrays.equals(this.f252782u, query.f252782u) && C58832aw.m90831a(this.f252783v, query.f252783v) && C58832aw.m90831a(this.f252785x, query.f252785x) && C58832aw.m90831a(this.f252786y, query.f252786y) && C58832aw.m90831a(this.f252787z, query.f252787z) && C58832aw.m90831a(this.f252746D, query.f252746D) && C58832aw.m90831a(this.f252754L, query.f252754L) && C58832aw.m90831a(this.f252755M, query.f252755M) && C58832aw.m90831a(this.f252756N, query.f252756N) && C58832aw.m90831a(this.f252757O, query.f252757O) && C58832aw.m90831a(this.f252758P, query.f252758P) && C58832aw.m90831a(this.f252759Q, query.f252759Q) && this.f252760R == query.f252760R && this.f252761S == query.f252761S && C58832aw.m90831a(this.f252764W, query.f252764W) && C58832aw.m90831a(this.f252763U, query.f252763U);
        }
    }

    /* renamed from: f */
    public final long mo84476f(String str) {
        Bundle bundle = this.f252786y;
        if (bundle != null) {
            return bundle.getLong(str, 0);
        }
        return 0;
    }

    /* renamed from: g */
    public final Bundle mo84477g() {
        Bundle bundle = this.f252786y;
        if (bundle == null) {
            return null;
        }
        return (Bundle) bundle.clone();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (equals(f252741b)) {
            fVar.mo85291r("Query[EMPTY]");
            return;
        }
        fVar.mo85291r("Query[" + m147228ef() + "/" + m147227ee() + "/" + mo84346be() + "@" + this.f252777p + "]");
        String ec = m147225ec();
        if (!ec.isEmpty()) {
            fVar.mo85292s(C90752i.m148229c(ec));
        }
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(Long.toHexString(this.f252765d)));
        String str = "\"" + this.f252768g.toString() + "\"";
        if (!this.f252768g.toString().equals(this.f252770i)) {
            str = str + " (\"" + this.f252770i + "\")";
        }
        m147231ei(fVar, "query chars", str);
        Bundle bundle = this.f252786y;
        String string = bundle != null ? bundle.getString("android.search.extra.EVENT_ID") : null;
        if (string != null) {
            m147231ei(fVar, "event ID", string);
        }
        m147230eh(fVar, "commit ID", Long.valueOf(this.f252780s).toString());
        m147230eh(fVar, "resend audio request ID", m147229eg(this.f252781t));
        m147230eh(fVar, "selection", mo84367c() + ":" + m147226ed(mo84315b()));
        m147231ei(fVar, "location override", m147229eg(this.f252785x));
        m147231ei(fVar, "stick", mo84356bo());
        m147231ei(fVar, "ludocid", mo84349bh());
        m147231ei(fVar, "immersiveBasePage", mo84348bg());
        m147231ei(fVar, "richCardImmersiveVertical", mo84353bl());
        m147231ei(fVar, "miniappLandingPage", mo84350bi());
        m147231ei(fVar, "isPrefetchIgnored", Boolean.valueOf(mo84377cJ()).toString());
        C58495hd hdVar = this.f252779r;
        if (hdVar != null && !hdVar.isEmpty()) {
            m147231ei(fVar, "persist CGI parameters", m147229eg(this.f252779r));
        }
        C58495hd hdVar2 = this.f252755M;
        if (hdVar2 != null && !hdVar2.isEmpty()) {
            m147231ei(fVar, "clockwork parameters", m147229eg(this.f252755M));
        }
        m147231ei(fVar, "original url", this.f252772k);
        m147231ei(fVar, "non-search url", this.f252774m);
        m147231ei(fVar, "webapp state fragment", m147229eg(mo84359br()));
        m147230eh(fVar, "recording URI", m147229eg(this.f252787z));
        m147230eh(fVar, "audio sampling rate", Integer.valueOf(this.f252743A).toString());
        m147230eh(fVar, "reopenForFollowOn", Boolean.valueOf(this.f252744B).toString());
        m147230eh(fVar, "submission time", Long.valueOf(this.f252745C).toString());
        m147230eh(fVar, "latency events", m147229eg(this.f252746D));
        m147230eh(fVar, "submission elapsed time", Long.valueOf(this.f252747E).toString());
        int i = this.f252750H;
        if (i != 0) {
            m147230eh(fVar, "UI to launch for voice search", Integer.valueOf(i).toString());
        }
        m147230eh(fVar, "language override", this.f252754L);
        m147230eh(fVar, "mid", m147229eg(this.f252769h));
        m147230eh(fVar, "speechie mode", Integer.valueOf(this.f252784w).toString());
        String bp = mo84357bp();
        if (bp != null) {
            m147230eh(fVar, "visual element data", bp);
        }
        if (mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            m147230eh(fVar, "conversation delta size", Integer.valueOf(mo84439dT().length).toString());
        }
        byte[] dV = mo84441dV();
        if (dV != null) {
            m147230eh(fVar, "suggestions params size", Integer.valueOf(dV.length).toString());
        }
        m147230eh(fVar, "source", mo84355bn());
    }

    /* renamed from: h */
    public final Parcelable mo84478h(String str) {
        Bundle bundle = this.f252786y;
        if (bundle != null) {
            return bundle.getParcelable(str);
        }
        return null;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{Long.valueOf(this.f252765d), Long.valueOf(this.f252766e), this.f252767f, this.f252768g, this.f252769h, this.f252770i, this.f252771j, this.f252772k, this.f252773l, this.f252774m, Integer.valueOf(this.f252775n), Integer.valueOf(this.f252776o), Integer.valueOf(this.f252777p), this.f252778q, this.f252779r, Long.valueOf(this.f252780s), this.f252781t, this.f252783v, Integer.valueOf(this.f252784w), this.f252785x, this.f252786y, this.f252787z, Integer.valueOf(this.f252743A), Boolean.valueOf(this.f252744B), Long.valueOf(this.f252745C), this.f252746D, Long.valueOf(this.f252747E), Long.valueOf(this.f252748F), Long.valueOf(this.f252749G), Integer.valueOf(this.f252750H), Long.valueOf(this.f252751I), Long.valueOf(this.f252752J), Long.valueOf(this.f252753K), this.f252754L, this.f252755M, this.f252756N, this.f252757O, this.f252758P, this.f252759Q, this.f252760R, this.f252761S, this.f252764W, Integer.valueOf(this.f252762T), this.f252763U}) * 31) + Arrays.hashCode(this.f252782u);
    }

    /* renamed from: i */
    public final C90498f mo84480i() {
        ThreadLocal threadLocal = f252739V;
        C90498f fVar = (C90498f) threadLocal.get();
        if (fVar == null) {
            fVar = new C90498f();
            threadLocal.set(fVar);
        }
        C58976aa aaVar = C58975e.f156826a;
        fVar.f252983a = this;
        fVar.f252984b = this.f252765d;
        fVar.f252985c = this.f252766e;
        fVar.f252986d = this.f252768g;
        fVar.f252987e = this.f252771j;
        fVar.f252988f = null;
        fVar.f252989g = this.f252774m;
        fVar.f252990h = this.f252775n;
        fVar.f252991i = this.f252776o;
        fVar.f252995m = this.f252780s;
        fVar.f252996n = this.f252781t;
        fVar.f252992j = this.f252777p;
        fVar.f252994l = this.f252779r;
        fVar.f252997o = this.f252783v;
        fVar.f252998p = this.f252782u;
        fVar.f252999q = this.f252785x;
        fVar.f253000r = this.f252786y;
        fVar.f253001s = this.f252787z;
        fVar.f253002t = this.f252743A;
        fVar.f253003u = this.f252744B;
        fVar.f253004v = this.f252745C;
        fVar.f253005w = this.f252746D;
        fVar.f253006x = this.f252747E;
        fVar.f253007y = this.f252748F;
        fVar.f253008z = this.f252749G;
        fVar.f252963A = this.f252750H;
        fVar.f252964B = this.f252751I;
        fVar.f252965C = false;
        fVar.f252966D = false;
        fVar.f252967E = this.f252752J;
        fVar.f252968F = this.f252753K;
        fVar.f252969G = this.f252767f;
        fVar.f252970H = this.f252755M;
        fVar.f252971I = this.f252784w;
        fVar.f252993k = this.f252778q;
        fVar.f252972J = this.f252754L;
        fVar.f252973K = this.f252769h;
        fVar.f252974L = this.f252756N;
        fVar.f252975M = this.f252757O;
        fVar.f252976N = this.f252758P;
        fVar.f252977O = this.f252759Q;
        fVar.f252978P = this.f252760R;
        fVar.f252980R = this.f252762T;
        C90491g gVar = this.f252763U.f252879e;
        if (gVar == null) {
            gVar = C90491g.f252884z;
        }
        fVar.f252982T = (C90489e) C90491g.f252884z.createBuilder(gVar);
        fVar.f252981S = (C90487c) C90488d.f252873g.createBuilder(this.f252763U);
        fVar.mo84567Z(mo84359br());
        String be = mo84346be();
        if (be != null) {
            C90489e eVar = fVar.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 64;
            gVar2.f252892g = be;
        } else {
            C90489e eVar2 = fVar.f252982T;
            eVar2.copyOnWrite();
            C90491g gVar3 = (C90491g) eVar2.instance;
            gVar3.f252886a &= -65;
            gVar3.f252892g = C90491g.f252884z.f252892g;
        }
        fVar.mo84557P(mo84356bo());
        fVar.mo84566Y(mo84358bq());
        fVar.mo84594z(mo84349bh());
        fVar.mo84590v(mo84348bg());
        fVar.mo84550I(mo84353bl());
        fVar.mo84554M(mo84355bn(), true);
        fVar.mo84565X(mo84357bp());
        fVar.mo84553L(mo84354bm());
        if (mo84347bf("android.search.extra.EVENT_ID") != null) {
            Bundle g = mo84477g();
            g.getClass();
            fVar.f253000r = g;
            fVar.f253000r.remove("android.search.extra.EVENT_ID");
        }
        return fVar;
    }

    /* renamed from: j */
    public final Query mo84481j(Query query) {
        C90498f i = mo84480i();
        i.mo84587s(query.f252780s);
        i.mo84548G(query.f252749G);
        i.mo84592x(query.f252751I);
        i.mo84593y(query.f252746D);
        return i.mo84568a();
    }

    @Deprecated
    /* renamed from: k */
    public final Query mo84482k(Query query) {
        C90498f i = mo84480i();
        i.mo84587s(query.f252780s);
        i.mo84548G(query.f252749G);
        i.mo84592x(query.f252751I);
        i.mo84593y(query.f252746D);
        i.mo84572d(16384, true != query.mo84337bV() ? 0 : 16384);
        return i.mo84568a();
    }

    /* renamed from: l */
    public final Query mo84483l(LatencyEvents latencyEvents) {
        C90498f i = mo84480i();
        i.mo84593y(new LatencyEvents(latencyEvents.f246437a, latencyEvents.f246438b, latencyEvents.f246440d, SystemClock.elapsedRealtime(), latencyEvents.f246439c).mo83792a(this.f252746D.f246439c));
        return i.mo84568a();
    }

    /* renamed from: m */
    public final Query mo84484m() {
        C90498f i = mo84480i();
        i.mo84578j();
        i.mo84579k();
        i.mo84572d(137438953472L, 0);
        i.mo84572d(36028797018963968L, 0);
        i.mo84577i();
        i.mo84585q((C60456qs) null);
        i.mo84563V((byte[]) null);
        i.mo84559R(0);
        i.mo84569aa();
        return i.mo84568a();
    }

    /* renamed from: n */
    public final Query mo84485n() {
        C90498f i = mo84480i();
        i.mo84590v((String) null);
        i.mo84574f("query-header-visibility");
        C90489e eVar = i.f252982T;
        eVar.copyOnWrite();
        C90491g gVar = (C90491g) eVar.instance;
        C90491g gVar2 = C90491g.f252884z;
        gVar.f252886a &= -16385;
        gVar.f252900o = 0;
        i.mo84574f("EXTRA_FOOTER_VISIBILITY");
        i.mo84573e(72057594037927936L, 0);
        return i.mo84568a();
    }

    /* renamed from: o */
    public final Query mo84486o() {
        C90498f i = mo84480i();
        i.mo84572d(262144, 0);
        i.mo84573e(64, 0);
        return i.mo84568a();
    }

    /* renamed from: p */
    public final Query mo84487p() {
        C90498f i = mo84480i();
        i.mo84572d(2305843009213693952L, 0);
        return i.mo84568a();
    }

    /* renamed from: q */
    public final Query mo84488q() {
        C90498f i = mo84480i();
        i.mo84561T(QueryTriggerType.USER);
        i.mo84562U(0);
        i.mo84546E(BuildConfig.FLAVOR);
        i.mo84552K(-2, -2);
        return i.mo84568a();
    }

    /* renamed from: r */
    public final Query mo84489r() {
        C90498f i = mo84480i();
        i.mo84573e(524288, 0);
        return i.mo84568a();
    }

    /* renamed from: s */
    public final Query mo84490s(String str, Map map) {
        C90498f i = mo84480i();
        i.mo84562U(0);
        i.mo84572d(512, 0);
        i.mo84572d(0, 8388608);
        i.mo84572d(1024, 0);
        i.mo84549H((Long) null);
        i.mo84546E(str);
        i.mo84572d(0, 67108864);
        if (map != null) {
            i.f252965C |= !map.equals(i.f252970H);
            i.f252970H = map;
        }
        return i.mo84568a();
    }

    /* renamed from: t */
    public final Query mo84491t(Uri uri) {
        C90498f i = mo84480i();
        i.mo84562U(1);
        i.mo84572d(512, 0);
        i.mo84572d(0, 8388608);
        i.mo84572d(0, 33554432);
        i.mo84572d(1024, 0);
        i.mo84547F(uri, 0, false);
        i.mo84549H((Long) null);
        i.mo84572d(0, 67108864);
        return i.mo84568a();
    }

    public final String toString() {
        return mo84360bs(this.f252768g);
    }

    /* renamed from: u */
    public final Query mo84493u() {
        C90498f i = mo84480i();
        i.mo84575g();
        i.mo84572d(32768, 0);
        i.mo84572d(65536, 0);
        i.mo84578j();
        i.mo84570ab();
        i.mo84558Q(SystemClock.elapsedRealtime());
        i.f252966D = true;
        if ((this.f252766e & 1024) != 0) {
            i.mo84573e(1024, 0);
        } else {
            i.mo84579k();
        }
        return i.mo84568a();
    }

    /* renamed from: v */
    public final Query mo84494v() {
        C90498f i = mo84480i();
        i.mo84572d(0, 4503599627370496L);
        i.mo84572d(0, 1024);
        return i.mo84568a();
    }

    /* renamed from: w */
    public final Query mo84495w() {
        C90498f i = mo84480i();
        i.mo84572d(0, 281474976710656L);
        return i.mo84568a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Integer num;
        parcel.writeLong(this.f252765d);
        parcel.writeLong(this.f252766e);
        CharSequence charSequence = this.f252768g;
        TextUtils.writeToParcel(charSequence, parcel, i);
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            parcel.writeInt(r3);
            for (CorrectionSpan correctionSpan : (CorrectionSpan[]) spanned.getSpans(0, spanned.length(), CorrectionSpan.class)) {
                parcel.writeInt(spanned.getSpanStart(correctionSpan));
                parcel.writeInt(spanned.getSpanEnd(correctionSpan));
                parcel.writeInt(spanned.getSpanFlags(correctionSpan));
                parcel.writeString(correctionSpan.f253765a);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.f252771j);
        parcel.writeString(this.f252772k);
        parcel.writeString(this.f252774m);
        parcel.writeInt(this.f252775n);
        parcel.writeInt(this.f252776o);
        parcel.writeBundle(C90772bp.m148300h(this.f252779r));
        parcel.writeInt(this.f252777p);
        parcel.writeString(this.f252778q);
        parcel.writeLong(this.f252780s);
        parcel.writeValue(this.f252781t);
        parcel.writeByteArray(this.f252782u);
        parcel.writeParcelable(this.f252785x, 0);
        parcel.writeBundle(this.f252786y);
        parcel.writeParcelable(this.f252787z, 0);
        parcel.writeLong(this.f252745C);
        parcel.writeParcelable(this.f252746D, 0);
        parcel.writeLong(this.f252747E);
        parcel.writeLong(this.f252748F);
        parcel.writeLong(this.f252749G);
        parcel.writeInt(this.f252750H);
        parcel.writeLong(this.f252751I);
        parcel.writeLong(this.f252752J);
        parcel.writeLong(this.f252753K);
        parcel.writeInt(this.f252743A);
        parcel.writeByte(this.f252744B ? (byte) 1 : 0);
        parcel.writeParcelable(this.f252767f, 0);
        parcel.writeBundle(C90772bp.m148300h(this.f252755M));
        parcel.writeInt(this.f252784w);
        parcel.writeString(this.f252754L);
        parcel.writeString(this.f252769h);
        parcel.writeParcelable(this.f252756N, i);
        parcel.writeString(this.f252757O);
        parcel.writeString(this.f252758P);
        parcel.writeString(this.f252759Q);
        amo amo = this.f252760R;
        if (amo == null) {
            num = null;
        } else {
            num = Integer.valueOf(amo.f159234au);
        }
        parcel.writeValue(num);
        parcel.writeInt(this.f252761S.f251999l);
        parcel.writeString(this.f252764W);
        parcel.writeInt(this.f252762T);
        byte[] byteArray = this.f252763U.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    /* renamed from: x */
    public final Query mo84497x() {
        C90498f i = mo84480i();
        i.mo84576h();
        i.mo84561T(QueryTriggerType.ACTION_ESCAPE_HATCH);
        i.mo84562U(0);
        i.mo84579k();
        i.mo84570ab();
        i.mo84558Q(SystemClock.elapsedRealtime());
        i.mo84543B(this.f252772k);
        i.mo84569aa();
        return i.mo84568a();
    }

    /* renamed from: y */
    public final Query mo84498y() {
        C58838bb.m90884s(!mo84428dI(), "Received an auth failure for request without tokens.");
        if ((this.f252765d & 32768) != 0) {
            C90498f i = mo84480i();
            i.mo84572d(32768, 0);
            i.mo84572d(0, 65536);
            i.mo84578j();
            return i.mo84568a();
        }
        C90498f i2 = mo84480i();
        i2.mo84572d(0, 32768);
        i2.mo84578j();
        return i2.mo84568a();
    }

    /* renamed from: z */
    public final Query mo84499z() {
        C90498f i = mo84480i();
        i.mo84572d(0, 131072);
        i.mo84576h();
        i.mo84579k();
        i.mo84572d(137438953472L, 0);
        i.mo84572d(1024, 0);
        i.mo84570ab();
        i.mo84558Q(SystemClock.elapsedRealtime());
        i.mo84543B(this.f252772k);
        i.mo84569aa();
        return i.mo84568a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Query(long r9, long r11, java.lang.CharSequence r13, com.google.common.p4522b.C58485gu r14, java.lang.String r15, java.lang.String r16, int r17, int r18, int r19, java.lang.String r20, java.util.Map r21, long r22, java.lang.Long r24, byte[] r25, com.google.common.p4552o.C60456qs r26, android.location.Location r27, android.os.Bundle r28, android.net.Uri r29, long r30, com.google.android.apps.gsa.shared.logger.latency.LatencyEvents r32, long r33, long r35, long r37, int r39, long r40, long r42, long r44, int r46, boolean r47, com.google.android.apps.gsa.shared.search.QueryTriggerType r48, java.util.Map r49, int r50, java.lang.String r51, java.lang.String r52, com.google.android.apps.gsa.shared.speech.HotwordResultMetadata r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, com.google.common.p4552o.amo r57, com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n r58, java.lang.String r59, int r60, com.google.android.apps.gsa.shared.search.p7138b.C90488d r61) {
        /*
            r8 = this;
            r0 = r8
            r1 = r15
            r2 = r21
            r3 = r22
            r8.<init>()
            r5 = r9
            r0.f252765d = r5
            r5 = r11
            r0.f252766e = r5
            if (r13 != 0) goto L_0x0014
            java.lang.String r5 = ""
            goto L_0x0015
        L_0x0014:
            r5 = r13
        L_0x0015:
            r0.f252768g = r5
            r6 = r14
            r0.f252771j = r6
            r0.f252772k = r1
            if (r1 == 0) goto L_0x0030
            java.lang.String r6 = "#"
            boolean r7 = r15.contains(r6)
            if (r7 == 0) goto L_0x0030
            java.lang.String[] r1 = r15.split(r6)
            r6 = 0
            r1 = r1[r6]
            r0.f252773l = r1
            goto L_0x0032
        L_0x0030:
            r0.f252773l = r1
        L_0x0032:
            r1 = r16
            r0.f252774m = r1
            r1 = r17
            r0.f252775n = r1
            r1 = r18
            r0.f252776o = r1
            r1 = r19
            r0.f252777p = r1
            r1 = r20
            r0.f252778q = r1
            if (r2 != 0) goto L_0x004d
            com.google.common.b.hd r1 = com.google.common.p4522b.C58729pv.f156485a
            r0.f252779r = r1
            goto L_0x005d
        L_0x004d:
            boolean r1 = r2 instanceof com.google.common.p4522b.C58495hd
            if (r1 == 0) goto L_0x0057
            r1 = r2
            com.google.common.b.hd r1 = (com.google.common.p4522b.C58495hd) r1
            r0.f252779r = r1
            goto L_0x005d
        L_0x0057:
            com.google.common.b.hd r1 = com.google.common.p4522b.C58495hd.m89898l(r21)
            r0.f252779r = r1
        L_0x005d:
            r0.f252780s = r3
            r1 = r24
            r0.f252781t = r1
            r1 = r25
            r0.f252782u = r1
            r1 = r26
            r0.f252783v = r1
            r1 = r27
            r0.f252785x = r1
            r1 = r28
            r0.f252786y = r1
            r1 = r29
            r0.f252787z = r1
            r1 = r46
            r0.f252743A = r1
            r1 = r47
            r0.f252744B = r1
            r1 = r30
            r0.f252745C = r1
            r1 = r32
            r0.f252746D = r1
            r1 = r33
            r0.f252747E = r1
            r1 = r35
            r0.f252748F = r1
            r1 = r37
            r0.f252749G = r1
            r1 = r39
            r0.f252750H = r1
            r1 = r40
            r0.f252751I = r1
            r1 = r44
            r0.f252753K = r1
            r1 = r48
            r0.f252767f = r1
            if (r49 != 0) goto L_0x00aa
            com.google.common.b.hd r1 = com.google.common.p4522b.C58729pv.f156485a
            r0.f252755M = r1
            goto L_0x00b0
        L_0x00aa:
            com.google.common.b.hd r1 = com.google.common.p4522b.C58495hd.m89898l(r49)
            r0.f252755M = r1
        L_0x00b0:
            r1 = r50
            r0.f252784w = r1
            r1 = r51
            r0.f252754L = r1
            r1 = r52
            r0.f252769h = r1
            r1 = r53
            r0.f252756N = r1
            r1 = r54
            r0.f252757O = r1
            r1 = 0
            int r6 = (r42 > r1 ? 1 : (r42 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00d1
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x00d3
            r0.f252752J = r3
            goto L_0x00d5
        L_0x00d1:
            r1 = r42
        L_0x00d3:
            r0.f252752J = r1
        L_0x00d5:
            int r1 = r5.length()
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = r5.toString()
            goto L_0x00e4
        L_0x00e0:
            java.lang.String r1 = com.google.android.libraries.gsa.util.C23341f.m43777d(r5)
        L_0x00e4:
            r0.f252770i = r1
            r1 = r55
            r0.f252758P = r1
            r1 = r56
            r0.f252759Q = r1
            r1 = r57
            r0.f252760R = r1
            r1 = r58
            r0.f252761S = r1
            r1 = r59
            r0.f252764W = r1
            r1 = r60
            r0.f252762T = r1
            r1 = r61
            r0.f252763U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.Query.<init>(long, long, java.lang.CharSequence, com.google.common.b.gu, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.util.Map, long, java.lang.Long, byte[], com.google.common.o.qs, android.location.Location, android.os.Bundle, android.net.Uri, long, com.google.android.apps.gsa.shared.logger.latency.LatencyEvents, long, long, long, int, long, long, long, int, boolean, com.google.android.apps.gsa.shared.search.QueryTriggerType, java.util.Map, int, java.lang.String, java.lang.String, com.google.android.apps.gsa.shared.speech.HotwordResultMetadata, java.lang.String, java.lang.String, java.lang.String, com.google.common.o.amo, com.google.android.apps.gsa.shared.monet.b.af.n, java.lang.String, int, com.google.android.apps.gsa.shared.search.b.d):void");
    }

    /* renamed from: O */
    public final Query mo84252O(CharSequence charSequence, C90491g gVar, Parcelable parcelable, boolean z, C58881cr crVar) {
        QueryTriggerType queryTriggerType;
        gVar.getClass();
        C90498f i = mo84480i();
        if ((gVar.f252886a & 1048576) != 0) {
            i.mo84584p("android.search.extra.PARENT_EVENT_ID", gVar.f252906u);
        }
        boolean z2 = false;
        if (gVar.f252907v) {
            i.mo84554M("and.opa.ash", false);
        }
        if ((gVar.f252886a & 64) != 0) {
            i.mo84588t(gVar.f252892g, false);
        } else {
            i.mo84588t("web", false);
        }
        if (gVar.f252890e) {
            queryTriggerType = QueryTriggerType.DOODLE;
        } else {
            queryTriggerType = z ? QueryTriggerType.PREDICTIVE : QueryTriggerType.INTENT;
        }
        i.mo84561T(queryTriggerType);
        i.mo84546E(charSequence);
        int length = charSequence.length();
        i.mo84552K(length, length);
        i.mo84562U(0);
        if ((gVar.f252886a & 1) != 0) {
            Location location = (Location) C90772bp.m148301i(gVar.f252887b, Location.CREATOR);
            i.f252965C |= !C58832aw.m90831a(location, i.f252999q);
            i.f252999q = location;
        }
        if ((gVar.f252886a & 4) != 0) {
            i.mo84567Z(gVar.f252889d);
        }
        if ((gVar.f252886a & 2) != 0) {
            i.mo84557P(gVar.f252888c);
        }
        if ((gVar.f252886a & 256) != 0) {
            i.mo84594z(gVar.f252894i);
        }
        if ((gVar.f252886a & 512) != 0) {
            i.mo84590v(gVar.f252895j);
        }
        if ((gVar.f252886a & 1024) != 0) {
            i.mo84550I(gVar.f252896k);
        }
        if ((gVar.f252886a & 2048) != 0) {
            String str = gVar.f252897l;
            boolean z3 = i.f252965C;
            C90491g gVar2 = (C90491g) i.f252982T.instance;
            if ((gVar2.f252886a & 2048) != 0) {
                z2 = true;
            }
            i.f252965C = C90498f.m147527c(z2, gVar2.f252897l, str) | z3;
            if (str != null) {
                C90489e eVar = i.f252982T;
                eVar.copyOnWrite();
                C90491g gVar3 = (C90491g) eVar.instance;
                gVar3.f252886a |= 2048;
                gVar3.f252897l = str;
            } else {
                C90489e eVar2 = i.f252982T;
                eVar2.copyOnWrite();
                C90491g gVar4 = (C90491g) eVar2.instance;
                gVar4.f252886a &= -2049;
                gVar4.f252897l = C90491g.f252884z.f252897l;
            }
        }
        if ((gVar.f252886a & 8192) != 0) {
            i.mo84565X(gVar.f252899n);
        }
        if ((gVar.f252886a & 8388608) != 0) {
            i.mo84566Y(gVar.f252909x);
        }
        if ((gVar.f252886a & C89885b.HTTP_VALUE) != 0) {
            i.mo84545D(gVar.f252904s);
        }
        if ((gVar.f252886a & 524288) != 0) {
            if (gVar.f252905t) {
                i.mo84572d(0, 18014398509481984L);
            } else {
                i.mo84572d(18014398509481984L, 0);
            }
        }
        if (gVar.f252910y.containsKey("hl")) {
            try {
                C62995dn dnVar = gVar.f252910y;
                if (dnVar.containsKey("hl")) {
                    i.mo84544C(C58495hd.m89900n("hl", (String) dnVar.get("hl")));
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                C59104x c = f252740a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Velvet.Query");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11022)).mo56386p("Could not parse the search options proto, leaving fields at default values.");
            }
        }
        if (parcelable != null) {
            if (i.f253000r == null) {
                i.f253000r = new Bundle();
            }
            i.f253000r.putParcelable("android.speech.extra.ACTION_DATA", parcelable);
            i.f252965C = true;
        }
        i.mo84582n("query-header-visibility", gVar.f252900o);
        int i2 = gVar.f252886a;
        if ((131072 & i2) != 0) {
            if (crVar != null && ((C146542e) crVar).f395760a.f395749i.mo123331d().mo5941a(gVar.f252903r)) {
                i.mo84562U(13);
                i.mo84542A(gVar.f252903r);
                i.mo84543B(gVar.f252903r);
                i.mo84582n("query-header-visibility", 2);
                i.mo84572d(0, 536870912);
                i.mo84573e(0, 72057594037927936L);
            }
        } else if ((i2 & 65536) != 0 && gVar.f252902q) {
            i.mo84582n("query-header-visibility", 2);
            i.mo84572d(0, 536870912);
            i.mo84573e(0, 72057594037927936L);
        }
        return i.mo84568a();
    }
}
