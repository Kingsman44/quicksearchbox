package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hd */
/* compiled from: PG */
public final class C116755hd extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323854a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.hd");

    /* renamed from: b */
    public static final C58485gu f323855b = C58485gu.m89842j(Arrays.asList(new Integer[]{32, 64, 128}));

    /* renamed from: A */
    public boolean f323856A;

    /* renamed from: B */
    public boolean f323857B;

    /* renamed from: C */
    public String f323858C;

    /* renamed from: D */
    public String f323859D;

    /* renamed from: E */
    public String f323860E;

    /* renamed from: F */
    public SearchError f323861F;

    /* renamed from: G */
    public final C68214a f323862G;

    /* renamed from: H */
    public boolean f323863H = false;

    /* renamed from: L */
    private final C68214a f323864L;

    /* renamed from: M */
    private final C68214a f323865M;

    /* renamed from: N */
    private final C68214a f323866N;

    /* renamed from: O */
    private final Resources f323867O;

    /* renamed from: P */
    private Query f323868P;

    /* renamed from: Q */
    private final C116754hc f323869Q;

    /* renamed from: c */
    public final C68214a f323870c;

    /* renamed from: d */
    public final C68214a f323871d;

    /* renamed from: e */
    public final C68214a f323872e;

    /* renamed from: f */
    public final C68214a f323873f;

    /* renamed from: g */
    public final C68214a f323874g;

    /* renamed from: h */
    public final SharedPreferences f323875h;

    /* renamed from: i */
    public final C86124t f323876i;

    /* renamed from: j */
    public final C85211a f323877j;

    /* renamed from: k */
    public final C85005h f323878k;

    /* renamed from: l */
    public final C22871g f323879l;

    /* renamed from: m */
    public final C21370a f323880m;

    /* renamed from: n */
    public final C9325m f323881n;

    /* renamed from: o */
    public int f323882o;

    /* renamed from: p */
    public int f323883p;

    /* renamed from: q */
    public int f323884q;

    /* renamed from: r */
    public ClientConfig f323885r;

    /* renamed from: s */
    public int f323886s = 0;

    /* renamed from: t */
    public Query f323887t;

    /* renamed from: u */
    public boolean f323888u;

    /* renamed from: v */
    public String f323889v;

    /* renamed from: w */
    public String f323890w;

    /* renamed from: x */
    public C116752ha f323891x;

    /* renamed from: y */
    public long f323892y = 0;

    /* renamed from: z */
    public boolean f323893z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116755hd(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, SharedPreferences sharedPreferences, C86124t tVar, Resources resources, C85211a aVar9, C85005h hVar, C22871g gVar, C22871g gVar2, C68214a aVar10, C68214a aVar11, C9325m mVar, C21370a aVar12) {
        super(aVar, 155);
        C68214a aVar13 = aVar;
        this.f323864L = aVar2;
        this.f323870c = aVar3;
        this.f323871d = aVar4;
        this.f323865M = aVar6;
        this.f323872e = aVar5;
        this.f323873f = aVar7;
        this.f323874g = aVar8;
        this.f323875h = sharedPreferences;
        this.f323876i = tVar;
        this.f323881n = mVar;
        this.f323887t = Query.f252741b;
        this.f323877j = aVar9;
        this.f323878k = hVar;
        this.f323879l = gVar;
        this.f323862G = aVar10;
        this.f323866N = aVar11;
        this.f323880m = aVar12;
        this.f323889v = BuildConfig.FLAVOR;
        this.f323890w = BuildConfig.FLAVOR;
        this.f323859D = BuildConfig.FLAVOR;
        this.f323860E = BuildConfig.FLAVOR;
        this.f323867O = resources;
        C116754hc hcVar = new C116754hc(this, gVar2);
        this.f323869Q = hcVar;
        hcVar.mo81997g();
    }

    /* renamed from: p */
    public static boolean m193878p(C116735gk gkVar, TtsState ttsState, C116786ih ihVar, C116836z zVar, Query query) {
        if (!query.mo84391cX() || query.mo84397cd()) {
            return false;
        }
        C116734gj gjVar = gkVar.f323791w;
        if (((!gjVar.mo102859j(query) || gjVar.f323726a != 3) && (!gkVar.mo102877R() || !query.mo84332bQ() || !zVar.mo102986P(query))) || ihVar.mo102941g() || ttsState.mo102764t()) {
            return true;
        }
        return false;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.PIXEL_SEARCH_STARTED, C87739bu.PLAY_TTS_NUDGE_LANGUAGE_PICKER_VOICE_SEARCH, C87739bu.SEARCH_PLATE_TEXT_SELECTED, C87739bu.SEARCH_PLATE_MIC_TAPPED, C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SELECTED, C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_AUTO_OPTION_SELECTED, C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_INTERACTION_MADE, C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_NUDGE_SHOWN, C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_CLOSED, C87739bu.STOP_PLAYING_AUDIO};
    }

    /* renamed from: e */
    public final String mo102923e() {
        if (this.f323857B) {
            return this.f323867O.getString(R.string.search_apps_web_and_more);
        }
        return null;
    }

    /* renamed from: g */
    public final void mo102924g(String str, int i, int i2) {
        Query query = ((C116735gk) this.f323872e.mo27525b()).f323783o;
        CharSequence charSequence = query.f252768g;
        if (TextUtils.equals(charSequence, str)) {
            int length = charSequence.length();
            ((C116735gk) this.f323872e.mo27525b()).mo102868F(query.mo84269aF(charSequence, Math.min(length, i), Math.min(length, i2)));
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchPlateState");
        C91005e c = fVar.mo85279c("mode");
        String a = C88927a.m144526a(this.f323883p);
        int i = this.f323884q;
        c.mo85276a(C90752i.m148229c(a + "/" + i));
        fVar.mo85279c("ext").mo85276a(C90752i.m148230d(Integer.valueOf(this.f323882o)));
        fVar.mo85279c("rec state").mo85276a(C90752i.m148230d(Integer.valueOf(this.f323886s)));
    }

    /* JADX WARNING: type inference failed for: r5v37, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: hr */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80408hr(long r5, com.google.android.apps.gsa.search.shared.service.ClientEventData r7) {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.service.b.bw r5 = r7.f236955a
            int r5 = r5.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r5)
            if (r5 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x000c:
            int r5 = r5.ordinal()
            r6 = 58
            r0 = 0
            if (r5 == r6) goto L_0x01ab
            r6 = 83
            r1 = 0
            r2 = 1
            if (r5 == r6) goto L_0x0144
            r6 = 116(0x74, float:1.63E-43)
            if (r5 == r6) goto L_0x0136
            r6 = 219(0xdb, float:3.07E-43)
            java.lang.String r0 = "language_switcher_auto_option_selected"
            if (r5 == r6) goto L_0x00f1
            r6 = 231(0xe7, float:3.24E-43)
            if (r5 == r6) goto L_0x00e1
            switch(r5) {
                case 233: goto L_0x00c2;
                case 234: goto L_0x0065;
                case 235: goto L_0x0057;
                case 236: goto L_0x0045;
                case 237: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0135
        L_0x002e:
            android.content.SharedPreferences r5 = r4.f323875h
            java.lang.String r6 = "language_switcher_nudge_impression_count"
            int r5 = r5.getInt(r6, r1)
            android.content.SharedPreferences r7 = r4.f323875h
            android.content.SharedPreferences$Editor r7 = r7.edit()
            int r5 = r5 + r2
            android.content.SharedPreferences$Editor r5 = r7.putInt(r6, r5)
            r5.apply()
            return
        L_0x0045:
            boolean r5 = r4.f323863H
            if (r5 == 0) goto L_0x0135
            dagger.a r5 = r4.f323866N
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.al.l.a r5 = (com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a) r5
            r5.mo79043i()
            r4.f323863H = r1
            return
        L_0x0057:
            android.content.SharedPreferences r5 = r4.f323875h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r0, r2)
            r5.apply()
            return
        L_0x0065:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.aan.f237092a
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r6.mo58887l(r5)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r7 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x007d
            java.lang.Object r5 = r5.f169969b
            goto L_0x0081
        L_0x007d:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x0081:
            com.google.android.apps.gsa.search.shared.service.b.aap r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.aap) r5
            boolean r6 = r4.f323863H
            if (r6 == 0) goto L_0x0092
            dagger.a r6 = r4.f323866N
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.al.l.a r6 = (com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a) r6
            r6.mo79043i()
        L_0x0092:
            r4.f323863H = r2
            com.google.android.apps.gsa.search.core.al.cu.a r6 = r4.f323877j
            r7 = 9
            r6.mo78796g(r7)
            dagger.a r6 = r4.f323866N
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.al.l.a r6 = (com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a) r6
            java.lang.String r7 = r5.f237097c
            boolean r5 = r5.f237096b
            com.google.common.util.concurrent.cx r5 = r6.mo79035a(r7, r5)
            com.google.android.libraries.gsa.k.g r6 = r4.f323879l
            com.google.android.apps.gsa.staticplugins.search.session.state.gt r7 = new com.google.android.apps.gsa.staticplugins.search.session.state.gt
            r7.<init>(r4)
            com.google.android.apps.gsa.shared.util.c.ag r0 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r1 = "Plays the TTS of the nudge when mic is not in recording state"
            r0.<init>(r5, r6, r1, r7)
            com.google.android.apps.gsa.staticplugins.search.session.state.gu r5 = new com.google.android.apps.gsa.staticplugins.search.session.state.gu
            r5.<init>(r4)
            r0.mo85223a(r5)
            return
        L_0x00c2:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r5 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r5 = r7.mo81913d(r5)
            if (r5 == 0) goto L_0x0135
            dagger.a r5 = r4.f323872e
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r5
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r6 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r6 = r7.mo81912b(r6)
            com.google.android.apps.gsa.shared.search.Query r6 = (com.google.android.apps.gsa.shared.search.Query) r6
            r5.mo80462q(r6)
            r4.mo80591ar()
            return
        L_0x00e1:
            android.content.SharedPreferences r5 = r4.f323875h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r6 = "language_switcher_interacted"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r6, r2)
            r5.apply()
            return
        L_0x00f1:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.aak.f237085a
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r6.mo58887l(r5)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r7 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x0109
            java.lang.Object r5 = r5.f169969b
            goto L_0x010d
        L_0x0109:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x010d:
            com.google.android.apps.gsa.search.shared.service.b.aam r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.aam) r5
            java.lang.String r6 = r5.f237089b
            com.google.protobuf.cq r7 = r5.f237090c
            dagger.a r3 = r4.f323862G
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r3 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r3
            r3.mo83906az(r6, r7, r2)
            int r6 = r5.f237088a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0135
            boolean r5 = r5.f237091d
            if (r5 == 0) goto L_0x0135
            android.content.SharedPreferences r5 = r4.f323875h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r0, r1)
            r5.apply()
        L_0x0135:
            return
        L_0x0136:
            r4.f323857B = r2
            java.lang.String r5 = r4.mo102923e()
            r4.f323858C = r5
            com.google.android.apps.gsa.search.core.al.cu.a r6 = r4.f323877j
            r6.mo78802m(r5)
            return
        L_0x0144:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r5 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r5 = r7.mo81913d(r5)
            if (r5 == 0) goto L_0x0155
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r5 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r5 = r7.mo81912b(r5)
            r0 = r5
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
        L_0x0155:
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f323876i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250670bO
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0168
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x0194
        L_0x0168:
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f323876i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247387gG
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x018c
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f323876i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90057di.f249005a
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0183
            com.google.android.apps.gsa.search.core.al.bp.h r5 = r4.f323878k
            com.google.common.util.concurrent.cx r5 = r5.mo78625i()
            goto L_0x0194
        L_0x0183:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x0194
        L_0x018c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
        L_0x0194:
            com.google.android.libraries.gsa.k.g r6 = r4.f323879l
            com.google.android.apps.gsa.staticplugins.search.session.state.gx r7 = new com.google.android.apps.gsa.staticplugins.search.session.state.gx
            r7.<init>(r4, r0)
            com.google.android.apps.gsa.shared.util.c.ag r1 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r2 = "Checks whether to start OPA for voice search"
            r1.<init>(r5, r6, r2, r7)
            com.google.android.apps.gsa.staticplugins.search.session.state.gy r5 = new com.google.android.apps.gsa.staticplugins.search.session.state.gy
            r5.<init>(r4, r0)
            r1.mo85223a(r5)
            return
        L_0x01ab:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88240ui.f238495a
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r6.mo58887l(r5)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r6.mo58857o(r5)
            if (r5 != 0) goto L_0x01c3
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x01c3:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88240ui.f238495a
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r6.mo58887l(r5)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r7 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x01db
            java.lang.Object r5 = r5.f169969b
            goto L_0x01df
        L_0x01db:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x01df:
            com.google.android.apps.gsa.search.shared.service.b.uk r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88242uk) r5
            java.lang.String r6 = r5.f238499b
            int r7 = r5.f238500c
            int r5 = r5.f238501d
            dagger.a r1 = r4.f323872e
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r1
            boolean r1 = r1.mo102879U()
            if (r1 == 0) goto L_0x01fb
            r4.f323891x = r0
            r4.mo102924g(r6, r7, r5)
            return
        L_0x01fb:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.search.session.state.ha r0 = new com.google.android.apps.gsa.staticplugins.search.session.state.ha
            r0.<init>(r6, r7, r5)
            r4.f323891x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116755hd.mo80408hr(long, com.google.android.apps.gsa.search.shared.service.ClientEventData):void");
    }

    /* renamed from: i */
    public final void mo102925i() {
        this.f323889v = BuildConfig.FLAVOR;
        this.f323890w = BuildConfig.FLAVOR;
        this.f323888u = false;
    }

    /* renamed from: j */
    public final void mo102926j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f323886s != i) {
            this.f323886s = i;
            this.f323877j.mo78796g(i);
        }
    }

    /* renamed from: k */
    public final void mo102927k(boolean z) {
        Query query;
        C116836z zVar = (C116836z) this.f323864L.mo27525b();
        C116735gk gkVar = (C116735gk) this.f323872e.mo27525b();
        if (zVar.mo102987Q() && !gkVar.mo102879U()) {
            query = Query.f252741b;
        } else if (gkVar.mo102879U() || !gkVar.mo102882Y()) {
            Query query2 = gkVar.f323783o;
            query = (!query2.mo84420dA() || !zVar.mo102998ac() || zVar.mo102989T()) ? query2 : query2.mo84283aT();
        } else {
            query = null;
        }
        if (query != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (z || !C58832aw.m90831a(this.f323868P, query)) {
                this.f323877j.mo78799j(query);
                this.f323868P = query;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo102928m(Query query) {
        return (((C116740gp) this.f323865M.mo27525b()).mo102912i() && ((C116836z) this.f323864L.mo27525b()).mo102990U()) || ((C116735gk) this.f323872e.mo27525b()).f323783o.mo84383cP(query);
    }

    /* renamed from: n */
    public final boolean mo102929n() {
        return this.f323875h.getBoolean("key_opa_eligible", false);
    }

    /* renamed from: o */
    public final boolean mo102930o(Query query) {
        HashSet hashSet = new HashSet(((C89994f) this.f323862G.mo27525b()).mo83890aj());
        hashSet.add(((C89994f) this.f323862G.mo27525b()).mo83885ae());
        if (!this.f323876i.mo79746e(C90110fh.f250695by) || !query.mo84395cb(this.f323876i.mo79745c(C90110fh.f250706l), this.f323876i.mo79745c(C90110fh.f250639ak))) {
            return false;
        }
        if (this.f323876i.mo79746e(C90110fh.f250687bq) || hashSet.size() > 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "SearchPlateState[Mode:" + C88927a.m144526a(this.f323883p) + "/" + this.f323884q + " Ext:" + this.f323882o + " Rec state:" + this.f323886s + "%]";
    }
}
