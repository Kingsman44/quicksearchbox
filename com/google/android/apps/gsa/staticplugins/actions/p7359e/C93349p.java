package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87501w;
import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.C87407f;
import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction;
import com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.C87480b;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.ImageInfo;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93399m;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C54971bb;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55400qz;
import com.google.p4152bb.p4153a.C55403rb;
import com.google.p4152bb.p4153a.C55409rh;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.p */
/* compiled from: PG */
public final class C93349p implements C87501w, C87407f {

    /* renamed from: a */
    final /* synthetic */ C93350q f260350a;

    /* renamed from: b */
    private final boolean f260351b;

    /* renamed from: c */
    private final boolean f260352c;

    /* renamed from: d */
    private final Query f260353d;

    /* renamed from: e */
    private final boolean f260354e;

    /* renamed from: f */
    private final int f260355f;

    /* renamed from: g */
    private final boolean f260356g;

    /* renamed from: h */
    private final boolean f260357h;

    /* renamed from: i */
    private final boolean f260358i;

    /* renamed from: j */
    private final boolean f260359j;

    /* renamed from: k */
    private final C87413a f260360k;

    public C93349p(C93350q qVar, boolean z, boolean z2, Query query, long j, boolean z3, boolean z4, boolean z5, boolean z6, C87413a aVar) {
        this.f260350a = qVar;
        this.f260351b = z;
        this.f260353d = query;
        boolean z7 = false;
        if (qVar.f260366f.mo87657a(query) && !query.mo84332bQ() && query.mo84420dA()) {
            z7 = true;
        }
        this.f260354e = z7;
        this.f260352c = z2;
        this.f260355f = (int) j;
        this.f260356g = z3;
        this.f260357h = z4;
        this.f260358i = z5;
        this.f260359j = z6;
        this.f260360k = aVar;
    }

    /* renamed from: n */
    private final CardDecision m153554n(C93358y yVar, boolean z) {
        if (z) {
            return m153555o(yVar, C54944ab.RECIPIENT);
        }
        C93332a p = m153556p(yVar);
        if (p == null) {
            C58485gu guVar = C93350q.f260361a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            return CardDecision.f236248b;
        }
        C87480b c = CardDecision.m141964c(p.mo87639a(p.f260295a), C54944ab.RECIPIENT);
        c.f236289b = true;
        return c.mo81459a();
    }

    /* renamed from: o */
    private final CardDecision m153555o(C93358y yVar, C54944ab abVar) {
        C87480b bVar;
        C93332a p = m153556p(yVar);
        if (p == null) {
            C58485gu guVar = C93350q.f260361a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            return CardDecision.f236248b;
        }
        Query query = this.f260353d;
        if (query == null || !query.mo84337bV()) {
            bVar = CardDecision.m141963b(p.mo87639a(p.f260295a), new TtsRequest(p.mo87639a(p.f260296b), false), abVar);
        } else {
            bVar = new C87480b();
            bVar.mo81467i(new TtsRequest(p.mo87639a(p.f260296b), false), abVar);
        }
        if (!p.f260297c) {
            bVar.mo81465g();
        } else {
            Query query2 = this.f260353d;
            if (query2 != null && query2.mo84337bV()) {
                bVar.mo81463e();
            }
        }
        bVar.f236289b = true;
        return bVar.mo81459a();
    }

    /* renamed from: p */
    private final C93332a m153556p(C93358y yVar) {
        Resources resources = this.f260350a.f260362b;
        return C93348o.m153553c(resources, resources, this.f260353d.mo84337bV(), this.f260360k, yVar, (C86124t) this.f260350a.f260364d.mo27525b());
    }

    /* renamed from: q */
    private static final List m153557q(List list) {
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Person) it.next()).f236373d;
            if (str != null) {
                d.add(str);
            }
        }
        return d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81494a(PermissionPuntAction permissionPuntAction) {
        TtsRequest ttsRequest = permissionPuntAction.f236021p;
        if (TtsRequest.m141979c(ttsRequest)) {
            return CardDecision.f236248b;
        }
        C58485gu guVar = C93350q.f260361a;
        C87480b bVar = new C87480b();
        bVar.f236289b = true;
        bVar.mo81467i(ttsRequest, C54944ab.UNKNOWN);
        bVar.f236288a = true;
        return bVar.mo81459a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81495b(PuntAction puntAction) {
        TtsRequest ttsRequest = puntAction.f236021p;
        if (TtsRequest.m141979c(ttsRequest)) {
            return CardDecision.f236248b;
        }
        C58485gu guVar = C93350q.f260361a;
        C87480b bVar = new C87480b();
        bVar.f236289b = true;
        bVar.mo81467i(ttsRequest, C54944ab.UNKNOWN);
        Query query = this.f260353d;
        if (query != null && query.mo84337bV() && puntAction.mo81133M()) {
            bVar.mo81462d(0);
            bVar.f236288a = true;
        }
        return bVar.mo81459a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo81496c(SearchError searchError) {
        return CardDecision.f236248b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81497d(SoundSearchResult soundSearchResult) {
        String str;
        if (TextUtils.isEmpty(soundSearchResult.f236031g)) {
            str = this.f260350a.f260365e.getString(R.string.message_sound_search_result_tts, new Object[]{soundSearchResult.f236030f});
        } else {
            str = this.f260350a.f260365e.getString(R.string.message_sound_search_result_with_artist_tts, new Object[]{soundSearchResult.f236030f, soundSearchResult.f236031g});
        }
        C87480b bVar = new C87480b();
        bVar.mo81467i(new TtsRequest(str, false), C54944ab.UNKNOWN);
        bVar.f236289b = true;
        return bVar.mo81459a();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo81498e(VoiceInteractionAction voiceInteractionAction) {
        TtsRequest ttsRequest;
        if (!voiceInteractionAction.mo81143O()) {
            return CardDecision.f236247a;
        }
        if (voiceInteractionAction.mo81142N() == null || (voiceInteractionAction.mo81142N().f146003a & 2) == 0) {
            ttsRequest = new TtsRequest(BuildConfig.FLAVOR, false);
        } else {
            C54976bg bgVar = voiceInteractionAction.f236039f.f144537e;
            if (bgVar == null) {
                bgVar = C54976bg.f144641o;
            }
            C55409rh rhVar = bgVar.f144653k;
            if (rhVar == null) {
                rhVar = C55409rh.f146001d;
            }
            ttsRequest = new TtsRequest(rhVar.f146005c, true);
        }
        C58485gu guVar = C93350q.f260361a;
        C87480b bVar = new C87480b();
        bVar.mo81467i(ttsRequest, C54944ab.UNKNOWN);
        bVar.f236289b = true;
        if (this.f260356g) {
            bVar.mo81465g();
        }
        return bVar.mo81459a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153583c(r1, r1.f236115a) != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0367 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x033b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo81499f(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r18) {
        /*
            r17 = this;
            r0 = r17
            r3 = r18
            com.google.common.b.gu r1 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q.f260361a
            r18.mo81077p()
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f260353d
            boolean r1 = r1.mo84326bK()
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x001d
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f260353d
            boolean r1 = r1.mo84332bQ()
            if (r1 == 0) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            boolean r2 = r0.f260358i
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.f260351b
            if (r2 == 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            boolean r4 = r0.f260356g
            if (r4 == 0) goto L_0x002f
            if (r2 == 0) goto L_0x0031
        L_0x002f:
            if (r1 == 0) goto L_0x0054
        L_0x0031:
            boolean r1 = r18.mo81077p()
            if (r1 == 0) goto L_0x0054
            boolean r1 = r0.f260351b
            if (r1 == 0) goto L_0x0047
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r1 = r3.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r1 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r1
            com.google.bb.a.la r2 = r1.f236115a
            boolean r1 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153583c(r1, r2)
            if (r1 == 0) goto L_0x0054
        L_0x0047:
            com.google.bb.a.mp r1 = r3.f236106l
            if (r1 != 0) goto L_0x0054
            boolean r1 = r18.mo81230aj()
            if (r1 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r1 = 0
            goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            if (r1 != 0) goto L_0x0060
            boolean r2 = r0.f260352c
            if (r2 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236247a
            goto L_0x0457
        L_0x0060:
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f260353d
            boolean r2 = r2.mo84332bQ()
            if (r2 == 0) goto L_0x0088
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f260353d
            boolean r2 = r2.mo84337bV()
            if (r2 == 0) goto L_0x0088
            boolean r2 = r0.f260357h
            if (r2 == 0) goto L_0x0088
            com.google.bb.a.jq r2 = r3.f236105k
            if (r2 != 0) goto L_0x0088
            com.google.android.apps.gsa.search.shared.actions.util.b r1 = new com.google.android.apps.gsa.search.shared.actions.util.b
            r1.<init>()
            r2 = 0
            r1.mo81462d(r2)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r1.mo81459a()
            goto L_0x0457
        L_0x0088:
            com.google.android.apps.gsa.staticplugins.actions.e.x r7 = new com.google.android.apps.gsa.staticplugins.actions.e.x
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r11 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.m
            com.google.android.apps.gsa.staticplugins.actions.e.q r2 = r0.f260350a
            android.content.Context r2 = r2.f260365e
            r11.<init>(r2)
            com.google.android.apps.gsa.staticplugins.actions.e.q r2 = r0.f260350a
            boolean r12 = r0.f260357h
            boolean r4 = r0.f260359j
            r13 = r4 ^ 1
            boolean r14 = r0.f260356g
            dagger.a r2 = r2.f260364d
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250778R
            long r4 = r2.mo79743a(r4)
            int r15 = (int) r4
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r10 = r0.f260351b
            com.google.android.apps.gsa.search.shared.actions.errors.a r2 = r0.f260360k
            int r11 = r0.f260355f
            com.google.bb.a.mp r4 = r3.f236106l
            if (r4 == 0) goto L_0x0107
            com.google.bb.a.pr r1 = r4.f145620c
            if (r1 != 0) goto L_0x00c0
            com.google.bb.a.pr r1 = com.google.p4152bb.p4153a.C55365pr.f145876l
        L_0x00c0:
            com.google.android.apps.gsa.staticplugins.actions.e.u r4 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r4.<init>(r7, r3, r1, r2)
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r3 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x00f8
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x00f0
            java.lang.Object r1 = r2.f169969b
            goto L_0x00f4
        L_0x00f0:
            java.lang.Object r1 = r2.mo58889c(r1)
        L_0x00f4:
            com.google.bb.a.lx r1 = (com.google.p4152bb.p4153a.C55263lx) r1
            r8 = r1
            goto L_0x00f9
        L_0x00f8:
            r8 = 0
        L_0x00f9:
            r1 = 0
            r5 = 0
            r6 = 1
            r9 = 0
            r2 = r7
            r3 = r4
            r4 = r1
            r7 = r9
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x0107:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r4 = r3.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r4 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r4
            boolean r4 = r4.mo81435e()
            if (r4 == 0) goto L_0x0189
            com.google.bb.a.nl r4 = r18.mo81219Z()
            com.google.protobuf.cq r4 = r4.f145692b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0189
            com.google.bb.a.jq r1 = r18.mo81233b()
            if (r1 == 0) goto L_0x0185
            int r2 = r1.f145291a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x0185
            com.google.android.apps.gsa.staticplugins.actions.e.u r4 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            if (r2 == 0) goto L_0x0133
            com.google.bb.a.pr r2 = r1.f145295e
            if (r2 != 0) goto L_0x0134
            com.google.bb.a.pr r2 = com.google.p4152bb.p4153a.C55365pr.f145876l
            goto L_0x0134
        L_0x0133:
            r2 = 0
        L_0x0134:
            com.google.bb.a.ab r5 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r4.<init>(r7, r3, r2, r5)
            com.google.bb.a.pr r2 = r1.f145295e
            if (r2 != 0) goto L_0x013f
            com.google.bb.a.pr r2 = com.google.p4152bb.p4153a.C55365pr.f145876l
        L_0x013f:
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r2 = r2.mo58857o(r3)
            if (r2 == 0) goto L_0x0176
            com.google.bb.a.pr r1 = r1.f145295e
            if (r1 != 0) goto L_0x0158
            com.google.bb.a.pr r1 = com.google.p4152bb.p4153a.C55365pr.f145876l
        L_0x0158:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x016e
            java.lang.Object r1 = r2.f169969b
            goto L_0x0172
        L_0x016e:
            java.lang.Object r1 = r2.mo58889c(r1)
        L_0x0172:
            com.google.bb.a.lx r1 = (com.google.p4152bb.p4153a.C55263lx) r1
            r8 = r1
            goto L_0x0177
        L_0x0176:
            r8 = 0
        L_0x0177:
            r1 = 0
            r5 = 0
            r6 = 1
            r9 = 0
            r2 = r7
            r3 = r4
            r4 = r1
            r7 = r9
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x0185:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x0457
        L_0x0189:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r4 = r3.f235985a
            boolean r4 = r4.mo81122j()
            if (r4 != 0) goto L_0x021d
            boolean r4 = r18.mo81133M()
            if (r4 != 0) goto L_0x019d
            boolean r4 = r18.mo81229ai()
            if (r4 != 0) goto L_0x021d
        L_0x019d:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r1 = r18.mo81062c()
            com.google.bb.a.nl r4 = r18.mo81219Z()
            com.google.bb.a.le r1 = r1.mo81111a(r4)
            if (r1 == 0) goto L_0x0204
            com.google.protobuf.cq r4 = r1.f145469b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0219
            com.google.protobuf.cq r1 = r1.f145469b
            int r4 = r7.f260377c
            com.google.bb.a.pr r1 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r1, r2, r4)
            if (r1 == 0) goto L_0x0219
            com.google.android.apps.gsa.staticplugins.actions.e.u r4 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r4.<init>(r7, r3, r1, r2)
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r3 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x01f5
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x01ed
            java.lang.Object r1 = r2.f169969b
            goto L_0x01f1
        L_0x01ed:
            java.lang.Object r1 = r2.mo58889c(r1)
        L_0x01f1:
            com.google.bb.a.lx r1 = (com.google.p4152bb.p4153a.C55263lx) r1
            r8 = r1
            goto L_0x01f6
        L_0x01f5:
            r8 = 0
        L_0x01f6:
            r1 = 0
            r5 = 0
            r6 = 1
            r9 = 0
            r2 = r7
            r3 = r4
            r4 = r1
            r7 = r9
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x0204:
            com.google.android.apps.gsa.search.shared.actions.modular.f r1 = r18.mo81210Q()
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r18.mo81062c()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "No ExecutionState for "
            java.lang.String r2 = r3.concat(r2)
            r1.mo81398b(r2)
        L_0x0219:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x0457
        L_0x021d:
            java.util.List r4 = r18.mo81223ac()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0229
            r4 = 0
            goto L_0x0233
        L_0x0229:
            java.lang.Object r4 = r4.get(r9)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument) r4
            com.google.bb.a.pr r4 = r4.mo81280o()
        L_0x0233:
            if (r4 == 0) goto L_0x027b
            com.google.android.apps.gsa.staticplugins.actions.e.u r1 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r1.<init>(r7, r3, r4, r2)
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r4.mo58887l(r2)
            com.google.protobuf.bf r3 = r4.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x026d
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r4.mo58887l(r2)
            com.google.protobuf.bf r3 = r4.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x0265
            java.lang.Object r2 = r2.f169969b
            goto L_0x0269
        L_0x0265:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0269:
            com.google.bb.a.lx r2 = (com.google.p4152bb.p4153a.C55263lx) r2
            r8 = r2
            goto L_0x026e
        L_0x026d:
            r8 = 0
        L_0x026e:
            r4 = 0
            r5 = 0
            r6 = 1
            r9 = 0
            r2 = r7
            r3 = r1
            r7 = r9
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x027b:
            com.google.bb.a.jq r4 = r3.f236105k
            if (r4 != 0) goto L_0x0293
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r1 = r3.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r1 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r1
            com.google.android.apps.gsa.search.shared.actions.util.i r1 = r1.f236270h
            boolean r1 = r1.mo81484i()
            if (r1 != 0) goto L_0x028f
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x0457
        L_0x028f:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236247a
            goto L_0x0457
        L_0x0293:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r5 = r3.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r5 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r5
            com.google.bb.a.la r6 = r5.f236115a
            boolean r13 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153583c(r5, r6)
            com.google.protobuf.cq r5 = r4.f145292b
            java.util.Iterator r5 = r5.iterator()
        L_0x02a3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x03fc
            java.lang.Object r6 = r5.next()
            com.google.bb.a.kc r6 = (com.google.p4152bb.p4153a.C55215kc) r6
            com.google.protobuf.bt r14 = com.google.p4152bb.p4153a.C55286mt.f145630d
            com.google.protobuf.bt r14 = com.google.protobuf.C62942bv.checkIsLite(r14)
            r6.mo58887l(r14)
            com.google.protobuf.bf r15 = r6.f169962ag
            com.google.protobuf.bs r14 = r14.f169971d
            boolean r14 = r15.mo58857o(r14)
            if (r14 == 0) goto L_0x02f4
            com.google.protobuf.bt r14 = com.google.p4152bb.p4153a.C55286mt.f145630d
            com.google.protobuf.bt r14 = com.google.protobuf.C62942bv.checkIsLite(r14)
            r6.mo58887l(r14)
            com.google.protobuf.bf r15 = r6.f169962ag
            com.google.protobuf.bs r9 = r14.f169971d
            java.lang.Object r9 = r15.mo58854l(r9)
            if (r9 != 0) goto L_0x02d8
            java.lang.Object r9 = r14.f169969b
            goto L_0x02dc
        L_0x02d8:
            java.lang.Object r9 = r14.mo58889c(r9)
        L_0x02dc:
            com.google.bb.a.mt r9 = (com.google.p4152bb.p4153a.C55286mt) r9
            com.google.protobuf.cq r14 = r9.f145632a
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0362
            com.google.protobuf.cq r9 = r9.f145632a
            int r14 = r7.f260377c
            com.google.bb.a.pr r14 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r9, r2, r14)
            boolean r9 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153582b(r6, r9)
            goto L_0x0364
        L_0x02f4:
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55286mt.f145629c
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r6.mo58887l(r9)
            com.google.protobuf.bf r14 = r6.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r9 = r14.mo58857o(r9)
            if (r9 == 0) goto L_0x033e
            if (r1 != 0) goto L_0x033b
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55286mt.f145629c
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r6.mo58887l(r9)
            com.google.protobuf.bf r14 = r6.f169962ag
            com.google.protobuf.bs r15 = r9.f169971d
            java.lang.Object r14 = r14.mo58854l(r15)
            if (r14 != 0) goto L_0x031f
            java.lang.Object r9 = r9.f169969b
            goto L_0x0323
        L_0x031f:
            java.lang.Object r9 = r9.mo58889c(r14)
        L_0x0323:
            com.google.bb.a.mt r9 = (com.google.p4152bb.p4153a.C55286mt) r9
            com.google.protobuf.cq r14 = r9.f145632a
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0362
            com.google.protobuf.cq r9 = r9.f145632a
            int r14 = r7.f260377c
            com.google.bb.a.pr r14 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r9, r2, r14)
            boolean r9 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153582b(r6, r9)
            r15 = 1
            goto L_0x0365
        L_0x033b:
            r9 = 0
            goto L_0x02a3
        L_0x033e:
            int r9 = r6.f145368b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r9 = r3.mo81211R(r9)
            if (r9 != 0) goto L_0x0351
            com.google.android.apps.gsa.search.shared.actions.modular.b r9 = r18.mo81210Q()
            int r14 = r6.f145368b
            r9.mo81401e(r14)
            r9 = 0
            goto L_0x0355
        L_0x0351:
            java.util.List r9 = r9.mo81269I(r6)
        L_0x0355:
            if (r9 == 0) goto L_0x0362
            int r14 = r7.f260377c
            com.google.bb.a.pr r14 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r9, r2, r14)
            boolean r9 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153582b(r6, r9)
            goto L_0x0364
        L_0x0362:
            r9 = 0
            r14 = 0
        L_0x0364:
            r15 = 0
        L_0x0365:
            if (r14 == 0) goto L_0x033b
            com.google.android.apps.gsa.staticplugins.actions.e.v r16 = new com.google.android.apps.gsa.staticplugins.actions.e.v
            int r5 = r6.f145368b
            if (r9 == 0) goto L_0x0371
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.RELATIONSHIP_CONFIRMATION
        L_0x036f:
            r6 = r1
            goto L_0x0390
        L_0x0371:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r1 = r3.mo81211R(r5)
            if (r1 != 0) goto L_0x0381
            com.google.android.apps.gsa.search.shared.actions.modular.b r1 = r18.mo81210Q()
            r1.mo81401e(r5)
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            goto L_0x0383
        L_0x0381:
            com.google.bb.a.ab r1 = r1.f236141b
        L_0x0383:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r1 = r1.mo56109e(r2)
            com.google.bb.a.ab r1 = (com.google.p4152bb.p4153a.C54944ab) r1
            goto L_0x036f
        L_0x0390:
            int r1 = r14.f145878a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03a9
            int r1 = r14.f145887j
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.m87544a(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r1 = r1.mo56109e(r2)
            com.google.bb.a.ab r1 = (com.google.p4152bb.p4153a.C54944ab) r1
            goto L_0x03ab
        L_0x03a9:
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
        L_0x03ab:
            r9 = r1
            r1 = r16
            r2 = r7
            r3 = r18
            r4 = r14
            r12 = r7
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            if (r15 == 0) goto L_0x03bd
            if (r10 == 0) goto L_0x03bd
            r4 = 1
            goto L_0x03be
        L_0x03bd:
            r4 = 0
        L_0x03be:
            boolean r6 = r12.f260376b
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r14.mo58887l(r1)
            com.google.protobuf.bf r2 = r14.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 == 0) goto L_0x03f1
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r14.mo58887l(r1)
            com.google.protobuf.bf r2 = r14.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x03e9
            java.lang.Object r1 = r1.f169969b
            goto L_0x03ed
        L_0x03e9:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x03ed:
            com.google.bb.a.lx r1 = (com.google.p4152bb.p4153a.C55263lx) r1
            r8 = r1
            goto L_0x03f2
        L_0x03f1:
            r8 = 0
        L_0x03f2:
            r2 = r12
            r3 = r16
            r5 = r11
            r7 = r13
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x03fc:
            r12 = r7
            boolean r1 = r18.mo81230aj()
            if (r1 != 0) goto L_0x0455
            com.google.bb.a.nl r1 = r18.mo81219Z()
            int r1 = r1.f145698h
            int r1 = com.google.p4152bb.p4153a.C55304nk.m87661a(r1)
            if (r1 != 0) goto L_0x0410
            r1 = 1
        L_0x0410:
            if (r1 != r8) goto L_0x042f
            if (r10 != 0) goto L_0x042f
            com.google.android.apps.gsa.staticplugins.actions.e.u r1 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            com.google.protobuf.cq r4 = r4.f145293c
            int r5 = r12.f260377c
            com.google.bb.a.pr r2 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r4, r2, r5)
            com.google.bb.a.ab r4 = com.google.p4152bb.p4153a.C54944ab.CONFIRMATION
            r1.<init>(r12, r3, r2, r4)
            r4 = 0
            r5 = 0
            r6 = 1
            r8 = 0
            r2 = r12
            r3 = r1
            r7 = r13
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x042f:
            boolean r5 = r12.f260375a
            if (r5 == 0) goto L_0x0455
            r5 = 2
            if (r1 != r5) goto L_0x0438
            r5 = r11
            goto L_0x0439
        L_0x0438:
            r5 = 0
        L_0x0439:
            com.google.protobuf.cq r1 = r4.f145294d
            int r4 = r12.f260377c
            com.google.bb.a.pr r1 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.m153584d(r1, r2, r4)
            com.google.android.apps.gsa.staticplugins.actions.e.u r4 = new com.google.android.apps.gsa.staticplugins.actions.e.u
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r4.<init>(r12, r3, r1, r2)
            r1 = 1
            boolean r6 = r12.f260376b
            r8 = 0
            r2 = r12
            r3 = r4
            r4 = r1
            r7 = r13
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r2.mo87648a(r3, r4, r5, r6, r7, r8)
            goto L_0x0457
        L_0x0455:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
        L_0x0457:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7359e.C93349p.mo81499f(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction):java.lang.Object");
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo81162g(ButtonAction buttonAction) {
        return CardDecision.f236248b;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo81163h(HelpAction helpAction) {
        String str;
        if (this.f260353d.mo84332bQ()) {
            Context context = this.f260350a.f260365e;
            C54971bb bbVar = C54971bb.DATE_DAY;
            int i = helpAction.f236049j;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    str = context.getString(R.string.offline_multimodel_help_action_implicit_tts);
                } else if (i2 == 1) {
                    str = context.getString(R.string.offline_multimodel_help_action_appreciation_tts);
                } else if (i2 != 2) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = context.getString(R.string.offline_multimodel_help_action_default_tts);
                }
                if (!TextUtils.isEmpty(str)) {
                    C87480b bVar = new C87480b();
                    bVar.mo81467i(new TtsRequest(str, false), C54944ab.UNKNOWN);
                    bVar.f236289b = true;
                    return bVar.mo81459a();
                }
            } else {
                throw null;
            }
        }
        return CardDecision.f236247a;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo81164i(com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r2 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.m
            com.google.android.apps.gsa.staticplugins.actions.e.q r3 = r0.f260350a
            android.content.Context r3 = r3.f260365e
            r2.<init>(r3)
            boolean r3 = r0.f260356g
            boolean r4 = r0.f260357h
            r5 = r1
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r5 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl) r5
            com.google.common.b.gu r6 = r5.f260517h
            java.util.List r7 = r5.f260516g
            int r7 = r7.size()
            com.google.android.apps.gsa.search.shared.actions.errors.a r8 = r0.f260360k
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x002a
            boolean r8 = r8.mo81179a()
            if (r8 == 0) goto L_0x002a
            r8 = 1
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            if (r8 == 0) goto L_0x0031
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018b
        L_0x0031:
            com.google.android.apps.gsa.search.shared.actions.util.b r8 = new com.google.android.apps.gsa.search.shared.actions.util.b
            r8.<init>()
            r8.f236289b = r10
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r11 = r1.f235985a
            boolean r11 = r11.mo81122j()
            if (r11 != 0) goto L_0x00e4
            com.google.bb.a.od r11 = r5.f260519j
            com.google.bb.a.pz r11 = r11.f145750c
            if (r11 != 0) goto L_0x0048
            com.google.bb.a.pz r11 = com.google.p4152bb.p4153a.C55373pz.f145913d
        L_0x0048:
            int r11 = r11.f145915a
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result r11 = r5.mo87664O(r11)
            if (r11 == 0) goto L_0x006a
            com.google.bb.a.oj r12 = r11.mo87672b(r10)
            com.google.protobuf.cq r12 = r12.f145774d
            int r12 = r12.size()
            if (r12 != 0) goto L_0x005d
            goto L_0x006a
        L_0x005d:
            com.google.bb.a.oj r11 = r11.mo87672b(r10)
            com.google.protobuf.cq r11 = r11.f145774d
            java.lang.Object r11 = r11.get(r9)
            com.google.bb.a.nl r11 = (com.google.p4152bb.p4153a.C55305nl) r11
            goto L_0x006c
        L_0x006a:
            com.google.bb.a.nl r11 = com.google.p4152bb.p4153a.C55305nl.f145689r
        L_0x006c:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r12 = r18.mo81062c()
            com.google.bb.a.le r11 = r12.mo81111a(r11)
            if (r11 != 0) goto L_0x0087
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.f260529a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Make state specific decision but state is null."
            r3 = 13588(0x3514, float:1.9041E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018b
        L_0x0087:
            com.google.protobuf.cq r12 = r11.f145469b
            int r12 = r12.size()
            if (r12 != 0) goto L_0x00a0
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.f260529a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Make state specific decision but prompt is null."
            r3 = 13587(0x3513, float:1.904E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018b
        L_0x00a0:
            com.google.protobuf.cq r11 = r11.f145469b
            java.lang.Object r9 = r11.get(r9)
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r5 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.m153677a(r9, r2, r5)
            int r11 = r9.f145878a
            r11 = r11 & 4
            if (r11 == 0) goto L_0x00b4
            goto L_0x012c
        L_0x00b4:
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x012c
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.bb.a.po r9 = (com.google.p4152bb.p4153a.C55362po) r9
            com.google.bb.a.pr r6 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.m153678b(r6, r7)
            com.google.z.c.v r6 = r6.f145881d
            if (r6 != 0) goto L_0x00ca
            com.google.z.c.v r6 = com.google.p5277z.p5282c.C68032v.f184320b
        L_0x00ca:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.bb.a.pr r7 = (com.google.p4152bb.p4153a.C55365pr) r7
            r6.getClass()
            r7.f145881d = r6
            int r6 = r7.f145878a
            r6 = r6 | 4
            r7.f145878a = r6
            com.google.protobuf.bv r6 = r9.build()
            r9 = r6
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9
            goto L_0x012c
        L_0x00e4:
            boolean r11 = r6.isEmpty()
            if (r11 == 0) goto L_0x00fb
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.f260529a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Answer prompt candidate list is empty."
            r3 = 13585(0x3511, float:1.9037E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018b
        L_0x00fb:
            com.google.bb.a.pr r6 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.m153678b(r6, r7)
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r5 = com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a.C93407a.m153677a(r6, r2, r5)
            if (r5 != 0) goto L_0x0109
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018b
        L_0x0109:
            int r7 = r6.f145878a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x012b
            com.google.bb.a.he r7 = r6.f145879b
            if (r7 != 0) goto L_0x0114
            com.google.bb.a.he r7 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0114:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r7 = r2.mo81378a(r7, r1, r9)
            boolean r9 = r7.mo81247f()
            if (r9 == 0) goto L_0x012b
            java.lang.String r7 = r7.mo81245d()
            if (r7 != 0) goto L_0x0126
            java.lang.String r7 = ""
        L_0x0126:
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r8.mo81466h(r7, r9)
        L_0x012b:
            r9 = r6
        L_0x012c:
            if (r5 == 0) goto L_0x013e
            if (r3 == 0) goto L_0x013e
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r6 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            java.lang.String r5 = r5.mo81245d()
            r6.<init>((java.lang.String) r5, (boolean) r10)
            com.google.bb.a.ab r5 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r8.mo81467i(r6, r5)
        L_0x013e:
            int r5 = r9.f145882e
            int r5 = r9.f145878a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0158
            com.google.z.c.v r5 = r9.f145881d
            if (r5 != 0) goto L_0x014c
            com.google.z.c.v r5 = com.google.p5277z.p5282c.C68032v.f184320b
        L_0x014c:
            r12 = r5
            long r13 = java.lang.System.currentTimeMillis()
            r15 = 0
            r16 = 1
            r11 = r8
            r11.mo81460b(r12, r13, r15, r16)
        L_0x0158:
            int r5 = r9.f145882e
            int r6 = com.google.p4152bb.p4153a.C55364pq.m87677a(r5)
            if (r6 != 0) goto L_0x0161
            goto L_0x016a
        L_0x0161:
            r7 = 2
            if (r6 != r7) goto L_0x016a
            if (r3 == 0) goto L_0x016a
            r8.mo81465g()
            goto L_0x0181
        L_0x016a:
            int r3 = com.google.p4152bb.p4153a.C55364pq.m87677a(r5)
            if (r3 != 0) goto L_0x0171
            goto L_0x0178
        L_0x0171:
            r5 = 3
            if (r3 != r5) goto L_0x0178
            r8.mo81463e()
            goto L_0x0181
        L_0x0178:
            if (r4 == 0) goto L_0x0181
            r3 = 0
            r8.mo81462d(r3)
            r8.f236288a = r10
        L_0x0181:
            java.util.List r1 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93399m.m153653a(r9, r2, r1)
            r8.f236293f = r1
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r8.mo81459a()
        L_0x018b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7359e.C93349p.mo81164i(com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer):java.lang.Object");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81165j(NarrativeNewsAction narrativeNewsAction) {
        C87480b bVar = new C87480b();
        C87449m mVar = new C87449m(this.f260350a.f260365e);
        C55365pr prVar = narrativeNewsAction.f236050f;
        if (!(prVar == null || (prVar.f145878a & 1) == 0)) {
            C55136he heVar = prVar.f145879b;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            bVar.mo81466h(heVar.f145133b, C54944ab.UNKNOWN);
        }
        if (!narrativeNewsAction.f235985a.f236005b) {
            bVar.mo81462d(0);
        }
        bVar.mo81464f();
        bVar.f236289b = true;
        bVar.f236293f = C93399m.m153653a(narrativeNewsAction.f236050f, mVar, (C87448l) null);
        return bVar.mo81459a();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81166k(ReadNotificationAction readNotificationAction) {
        C87480b bVar = new C87480b();
        bVar.mo81467i(readNotificationAction.f236055f, C54944ab.UNKNOWN);
        bVar.f236289b = true;
        return bVar.mo81459a();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81167l(ShowContactInformationAction showContactInformationAction) {
        CardDecision cardDecision;
        C93358y yVar;
        C93346m mVar;
        C93336c cVar;
        PersonDisambiguation personDisambiguation = showContactInformationAction.f236042f;
        CardDecision cardDecision2 = null;
        if (personDisambiguation == null || !personDisambiguation.mo81544m() || !personDisambiguation.f236395k.mo81601c()) {
            cardDecision = null;
        } else {
            Relationship relationship = personDisambiguation.f236395k.f236410c;
            if (relationship.mo81594e()) {
                cVar = C93348o.f260349g;
            } else {
                cVar = C93348o.f260348f;
            }
            String c = relationship.mo81591c();
            Parcelable parcelable = personDisambiguation.f236364c;
            parcelable.getClass();
            cardDecision = m153555o(new C93335b(cVar, c, ((Person) parcelable).f236373d), C54944ab.RELATIONSHIP_CONFIRMATION);
        }
        if (cardDecision != null) {
            return cardDecision;
        }
        if (personDisambiguation != null && personDisambiguation.mo81541i() && personDisambiguation.f236395k.mo81601c()) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 154;
            int i = showContactInformationAction.mo81066g().f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 256;
            ufVar2.f164264s = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            Relationship relationship2 = personDisambiguation.f236395k.f236410c;
            if (relationship2.mo81594e()) {
                mVar = C93348o.f260347e;
            } else {
                mVar = C93348o.f260346d;
            }
            cardDecision2 = m153554n(new C93345l(mVar, relationship2.mo81591c()), this.f260354e);
        }
        if (cardDecision2 != null) {
            return cardDecision2;
        }
        boolean z = false;
        if (!this.f260354e || (personDisambiguation != null && !personDisambiguation.f236395k.mo81601c())) {
            if (personDisambiguation == null || !personDisambiguation.mo81545n()) {
                return CardDecision.f236248b;
            }
            return m153554n(new C93343j(C93348o.f260344b, m153557q(personDisambiguation.f236363b), (C86124t) this.f260350a.f260364d.mo27525b(), personDisambiguation.mo81532a()), false);
        } else if (personDisambiguation == null || personDisambiguation.mo81541i()) {
            return m153555o(C93348o.f260345c, C54944ab.RECIPIENT);
        } else {
            if (!personDisambiguation.mo81543l()) {
                C93337d dVar = C93348o.f260343a;
                C58838bb.m90868c(personDisambiguation.mo81545n());
                if (!personDisambiguation.mo81544m()) {
                    yVar = new C93343j(dVar.f260316a, m153557q(personDisambiguation.f236363b), (C86124t) this.f260350a.f260364d.mo27525b(), personDisambiguation.mo81532a());
                } else {
                    List<Contact> list = personDisambiguation.f236411n;
                    if (list.size() > 1) {
                        z = true;
                    }
                    C58838bb.m90883r(z);
                    HashSet hashSet = new HashSet();
                    ArrayList d = C58597ky.m90213d(list.size());
                    for (Contact contact : list) {
                        if (contact.mo81526i()) {
                            String str = contact.f236355f;
                            if (hashSet.add(str.toLowerCase(Locale.getDefault()))) {
                                d.add(str);
                            }
                        }
                    }
                    if (d.size() <= 1) {
                        ArrayList d2 = C58597ky.m90213d(list.size());
                        for (Contact d3 : list) {
                            d2.add(d3.mo81519d());
                        }
                        yVar = new C93338e(dVar.f260318c, d2, (C86124t) this.f260350a.f260364d.mo27525b());
                    } else {
                        yVar = new C93340g(dVar.f260317b, d, (C86124t) this.f260350a.f260364d.mo27525b());
                    }
                }
                return m153554n(yVar, this.f260354e);
            }
            C58838bb.m90883r(personDisambiguation.mo81543l());
            return CardDecision.f236247a;
        }
    }

    /* renamed from: m */
    public final /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        String str;
        TtsRequest ttsRequest;
        VoiceDelightAction voiceDelightAction2 = voiceDelightAction;
        C87413a aVar = this.f260360k;
        if (aVar != null && aVar.mo81179a()) {
            int i = aVar.f236073b;
            int[] iArr = VoiceDelightAction.f236063f;
            int length = iArr.length;
            if (i <= 3) {
                String string = this.f260350a.f260362b.getString(iArr[i - 1]);
                C87480b bVar = new C87480b();
                bVar.mo81467i(new TtsRequest(string, false), C54944ab.UNKNOWN);
                bVar.f236289b = true;
                bVar.mo81465g();
                return bVar.mo81459a();
            }
        }
        C87480b bVar2 = new C87480b();
        C55400qz qzVar = voiceDelightAction2.f236064g;
        if ((qzVar.f145970a & 2) != 0) {
            C55365pr prVar = qzVar.f145972c;
            if (prVar == null) {
                prVar = C55365pr.f145876l;
            }
            C93351r.m153572a(prVar, this.f260356g, bVar2);
            if ((prVar.f145878a & 4) != 0) {
                C68032v vVar = prVar.f145881d;
                if (vVar == null) {
                    vVar = C68032v.f184320b;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = prVar.f145878a;
                bVar2.mo81460b(vVar, currentTimeMillis, 1 == (i2 & 1), (i2 & 2) != 0);
            }
        }
        if (voiceDelightAction2.f236064g.f145971b.size() > 0) {
            C55365pr prVar2 = voiceDelightAction2.f236064g.f145972c;
            if (prVar2 == null) {
                prVar2 = C55365pr.f145876l;
            }
            bVar2.f236289b = true;
            C62971cq cqVar = voiceDelightAction2.f236064g.f145971b;
            for (int i3 = 0; i3 < cqVar.size(); i3++) {
                C55403rb rbVar = (C55403rb) cqVar.get(i3);
                if ((rbVar.f145984a & 1) != 0) {
                    C55365pr prVar3 = rbVar.f145985b;
                    if (((prVar3 == null ? C55365pr.f145876l : prVar3).f145878a & 1) != 0) {
                        if (prVar3 == null) {
                            prVar3 = C55365pr.f145876l;
                        }
                        C55136he heVar = prVar3.f145879b;
                        if (heVar == null) {
                            heVar = C55136he.f145130j;
                        }
                        str = heVar.f145133b;
                    } else {
                        str = null;
                    }
                    if ((rbVar.f145984a & 4) != 0) {
                        C67402ar arVar = rbVar.f145987d;
                        if (arVar == null) {
                            arVar = C67402ar.f183192d;
                        }
                        ttsRequest = new TtsRequest((C67190ah) null, (List) null, arVar, (Uri) null, false);
                    } else {
                        C55365pr prVar4 = rbVar.f145985b;
                        if (((prVar4 == null ? C55365pr.f145876l : prVar4).f145878a & 2) != 0) {
                            if (prVar4 == null) {
                                prVar4 = C55365pr.f145876l;
                            }
                            C55136he heVar2 = prVar4.f145880c;
                            if (heVar2 == null) {
                                heVar2 = C55136he.f145130j;
                            }
                            ttsRequest = new TtsRequest(heVar2.f145133b, false);
                        } else {
                            ttsRequest = null;
                        }
                    }
                    ImageInfo imageInfo = (rbVar.f145984a & 2) != 0 ? new ImageInfo(rbVar.f145986c) : null;
                    if (i3 == cqVar.size() - 1) {
                        bVar2.mo81461c(new PromptSegment(str, ttsRequest, imageInfo, C93399m.m153653a(prVar2, (C87449m) null, (C87448l) null)));
                    } else {
                        bVar2.mo81461c(new PromptSegment(str, ttsRequest, imageInfo, (List) null));
                    }
                }
            }
            return bVar2.mo81459a();
        }
        C55400qz qzVar2 = voiceDelightAction2.f236064g;
        if ((qzVar2.f145970a & 2) == 0) {
            return CardDecision.f236248b;
        }
        C55365pr prVar5 = qzVar2.f145972c;
        if (prVar5 == null) {
            prVar5 = C55365pr.f145876l;
        }
        bVar2.f236289b = true;
        bVar2.mo81464f();
        if ((prVar5.f145878a & 1) != 0) {
            C55136he heVar3 = prVar5.f145879b;
            if (heVar3 == null) {
                heVar3 = C55136he.f145130j;
            }
            bVar2.mo81466h(heVar3.f145133b, C54944ab.UNKNOWN);
        }
        bVar2.f236293f = C93399m.m153653a(prVar5, (C87449m) null, (C87448l) null);
        return bVar2.mo81459a();
    }
}
