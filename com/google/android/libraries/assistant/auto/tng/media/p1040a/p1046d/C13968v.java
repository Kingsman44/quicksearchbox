package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.C12108a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13928e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.v */
/* compiled from: PG */
public final class C13968v extends C22538o {

    /* renamed from: a */
    public static final C59071e f42527a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.d.v");

    /* renamed from: b */
    public final C68214a f42528b;

    /* renamed from: c */
    public final C69464a f42529c;

    /* renamed from: d */
    public final C60887da f42530d;

    /* renamed from: e */
    public final C21370a f42531e;

    /* renamed from: f */
    public final C12108a f42532f;

    /* renamed from: g */
    public final C69464a f42533g;

    /* renamed from: h */
    public final C69464a f42534h;

    /* renamed from: i */
    public final C69464a f42535i;

    /* renamed from: j */
    public final C15481g f42536j;

    /* renamed from: k */
    public final C13928e f42537k;

    /* renamed from: l */
    private final C36029l f42538l;

    /* renamed from: m */
    private final Optional f42539m;

    public C13968v(C36029l lVar, C68214a aVar, C69464a aVar2, C60887da daVar, C21370a aVar3, C12108a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C15481g gVar, C13928e eVar, Optional optional) {
        this.f42538l = lVar;
        this.f42528b = aVar;
        this.f42529c = aVar2;
        this.f42530d = daVar;
        this.f42531e = aVar3;
        this.f42532f = aVar4;
        this.f42533g = aVar5;
        this.f42534h = aVar6;
        this.f42536j = gVar;
        this.f42537k = eVar;
        this.f42539m = optional;
        this.f42535i = aVar7;
    }

    /* renamed from: c */
    private final C60870cx m30257c(C52159hk hkVar, String str) {
        String f = m30260f(hkVar);
        return m30258d(str, f, new C13934a(this, f, str));
    }

    /* renamed from: d */
    private final C60870cx m30258d(String str, String str2, C13920d dVar) {
        C60870cx b = mo21375b(str2);
        C13957k kVar = new C13957k(this, str2, str, dVar);
        return C60922j.m93045h(b, C47810es.m84966f(kVar), this.f42530d);
    }

    /* renamed from: e */
    private final C60870cx m30259e(String str, long j, String str2) {
        C60870cx b = mo21375b(str2);
        C13953g gVar = new C13953g(this, str2, str, j);
        return C60922j.m93045h(b, C47810es.m84966f(gVar), this.f42530d);
    }

    /* renamed from: f */
    private static String m30260f(C52159hk hkVar) {
        if (hkVar == null || (hkVar.f136862a & 1) == 0) {
            return null;
        }
        C51098gh ghVar = hkVar.f136863b;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        return C13983h.m30276c(ghVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r19, com.google.android.libraries.gsa.conversation.clientop.C22434e r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = r1.f135936b
            com.google.common.f.e r3 = f42527a
            com.google.common.f.x r4 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "MediaControlPerformer"
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "Triggering clientOp at media control %s"
            r7 = 45200(0xb090, float:6.3339E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r5, r2)
            int r4 = r2.hashCode()
            java.lang.String r5 = "media.SHUFFLE"
            java.lang.String r7 = "media.STOP"
            java.lang.String r8 = "media.NEXT"
            java.lang.String r9 = "media.PREVIOUS"
            java.lang.String r10 = "media.SEEK_RELATIVE"
            java.lang.String r11 = "media.RESUME"
            java.lang.String r12 = "media.PAUSE"
            java.lang.String r13 = "media.SET_REPEAT"
            java.lang.String r14 = "media.SEEK_TO_POSITION"
            java.lang.String r15 = "media.REPLAY_MEDIA_ITEM"
            r16 = 0
            r17 = 4
            r0 = 2
            switch(r4) {
                case -1674598467: goto L_0x009b;
                case -1543031824: goto L_0x0093;
                case -1447981948: goto L_0x0089;
                case -1444411262: goto L_0x0080;
                case -1431171252: goto L_0x0078;
                case -1424506244: goto L_0x006f;
                case -1355740809: goto L_0x0067;
                case -171300823: goto L_0x005f;
                case 1865141697: goto L_0x0057;
                case 1893440189: goto L_0x004f;
                case 1893603276: goto L_0x0047;
                case 1896492751: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00a6
        L_0x003d:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00a6
            r2 = 9
            goto L_0x00a7
        L_0x0047:
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x00a6
            r2 = 7
            goto L_0x00a7
        L_0x004f:
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00a6
            r2 = 0
            goto L_0x00a7
        L_0x0057:
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x005f:
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x00a6
            r2 = 4
            goto L_0x00a7
        L_0x0067:
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x00a6
            r2 = 3
            goto L_0x00a7
        L_0x006f:
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x00a6
            r2 = 8
            goto L_0x00a7
        L_0x0078:
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x00a6
            r2 = 2
            goto L_0x00a7
        L_0x0080:
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x00a6
            r2 = 10
            goto L_0x00a7
        L_0x0089:
            java.lang.String r4 = "media.SET_RATING"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00a6
            r2 = 6
            goto L_0x00a7
        L_0x0093:
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00a6
            r2 = 5
            goto L_0x00a7
        L_0x009b:
            java.lang.String r4 = "media.SET_PLAYBACK_RATE"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00a6
            r2 = 11
            goto L_0x00a7
        L_0x00a6:
            r2 = -1
        L_0x00a7:
            java.lang.String r4 = "common_media_control_args"
            switch(r2) {
                case 0: goto L_0x03ad;
                case 1: goto L_0x038e;
                case 2: goto L_0x035b;
                case 3: goto L_0x031f;
                case 4: goto L_0x02d4;
                case 5: goto L_0x0289;
                case 6: goto L_0x0255;
                case 7: goto L_0x0222;
                case 8: goto L_0x01b7;
                case 9: goto L_0x0179;
                case 10: goto L_0x0137;
                case 11: goto L_0x00b4;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r2 = r18
            com.google.android.libraries.gsa.conversation.clientop.d r0 = new com.google.android.libraries.gsa.conversation.clientop.d
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x00ba
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x00ba:
            com.google.assistant.e.j.is r1 = com.google.assistant.p3897e.p3921j.C52194is.f136988e
            com.google.protobuf.eb r1 = r1.getParserForType()
            java.lang.String r2 = "set_playback_rate_args"
            com.google.protobuf.MessageLite r0 = m41992m(r0, r2, r1)
            com.google.assistant.e.j.is r0 = (com.google.assistant.p3897e.p3921j.C52194is) r0
            int r1 = r0.f136990a
            r2 = r1 & 2
            if (r2 == 0) goto L_0x00cf
            goto L_0x00f3
        L_0x00cf:
            r4 = r1 & 4
            if (r4 != 0) goto L_0x00f3
            com.google.common.f.x r0 = r3.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = "Neither playback_rate field nor relative_playback_rate_field is not set in SetPlaybackRateArgs."
            r2 = 45199(0xb08f, float:6.3337E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "Neither playback_rate nor relative_playback_rate_field in SetPlaybackRateArgs."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x00f0:
            r2 = r18
            goto L_0x0136
        L_0x00f3:
            if (r2 == 0) goto L_0x0117
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0117
            com.google.common.f.x r0 = r3.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = "Both playback_rate field and relative_playback_rate_field are set in SetPlaybackRateArgs. Only one should be set."
            r2 = 45198(0xb08e, float:6.3336E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "Both playback_rate and relative_playback_rate_field in SetPlaybackRateArgs. Only one should be set."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x00f0
        L_0x0117:
            com.google.assistant.e.j.hk r1 = r0.f136991b
            if (r1 != 0) goto L_0x011d
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x011d:
            java.lang.String r1 = m30260f(r1)
            r2 = r18
            com.google.common.util.concurrent.cx r3 = r2.mo21375b(r1)
            com.google.android.libraries.assistant.auto.tng.media.a.d.d r4 = new com.google.android.libraries.assistant.auto.tng.media.a.d.d
            r4.<init>(r2, r1, r0)
            com.google.common.util.concurrent.da r0 = r2.f42530d
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r3, r1, r0)
        L_0x0136:
            return r0
        L_0x0137:
            r3 = 1
            r2 = r18
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x0140
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0140:
            com.google.assistant.e.j.ja r4 = com.google.assistant.p3897e.p3921j.C52203ja.f137003d
            com.google.protobuf.eb r4 = r4.getParserForType()
            java.lang.String r5 = "set_repeat_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r5, r4)
            com.google.assistant.e.j.ja r1 = (com.google.assistant.p3897e.p3921j.C52203ja) r1
            int r4 = r1.f137005a
            r4 = r4 & r0
            if (r4 == 0) goto L_0x015b
            int r4 = r1.f137007c
            int r4 = com.google.assistant.p3897e.p3921j.C52201iz.m86539a(r4)
            if (r4 != 0) goto L_0x015c
        L_0x015b:
            r4 = 1
        L_0x015c:
            r5 = -1
            int r4 = r4 + r5
            if (r4 == r3) goto L_0x0164
            if (r4 == r0) goto L_0x0165
            r0 = 0
            goto L_0x0165
        L_0x0164:
            r0 = 1
        L_0x0165:
            com.google.assistant.e.j.hk r1 = r1.f137006b
            if (r1 != 0) goto L_0x016b
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x016b:
            java.lang.String r1 = m30260f(r1)
            com.google.android.libraries.assistant.auto.tng.media.a.d.j r3 = new com.google.android.libraries.assistant.auto.tng.media.a.d.j
            r3.<init>(r0)
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r13, r1, r3)
            return r0
        L_0x0179:
            r3 = 1
            r2 = r18
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x0182
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0182:
            com.google.assistant.e.j.je r4 = com.google.assistant.p3897e.p3921j.C52207je.f137009d
            com.google.protobuf.eb r4 = r4.getParserForType()
            java.lang.String r6 = "shuffle_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r6, r4)
            com.google.assistant.e.j.je r1 = (com.google.assistant.p3897e.p3921j.C52207je) r1
            int r4 = r1.f137011a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x01a2
            int r4 = r1.f137013c
            int r4 = com.google.assistant.p3897e.p3921j.C52206jd.m86540a(r4)
            if (r4 != 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            if (r4 != r0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            com.google.assistant.e.j.hk r0 = r1.f137012b
            if (r0 != 0) goto L_0x01a9
            com.google.assistant.e.j.hk r0 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x01a9:
            java.lang.String r0 = m30260f(r0)
            com.google.android.libraries.assistant.auto.tng.media.a.d.f r1 = new com.google.android.libraries.assistant.auto.tng.media.a.d.f
            r1.<init>(r3)
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r5, r0, r1)
            return r0
        L_0x01b7:
            r2 = r18
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x01bf
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x01bf:
            com.google.assistant.e.j.ik r3 = com.google.assistant.p3897e.p3921j.C52186ik.f136967d
            com.google.protobuf.eb r3 = r3.getParserForType()
            java.lang.String r4 = "replay_media_item_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r4, r3)
            com.google.assistant.e.j.ik r1 = (com.google.assistant.p3897e.p3921j.C52186ik) r1
            int r3 = r1.f136969a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0215
            com.google.assistant.e.j.wo r0 = r1.f136971c
            if (r0 != 0) goto L_0x01d8
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x01d8:
            int r3 = r0.f137994a
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0208
            com.google.assistant.e.j.hk r1 = r1.f136970b
            if (r1 != 0) goto L_0x01e4
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x01e4:
            java.lang.String r1 = m30260f(r1)
            int r0 = r0.f138003j
            com.google.assistant.e.j.wn r0 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r0)
            if (r0 != 0) goto L_0x01f2
            com.google.assistant.e.j.wn r0 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x01f2:
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.PLAYLIST
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0201
            com.google.android.libraries.assistant.auto.tng.media.a.d.o r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13961o.f42515a
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r15, r1, r0)
            goto L_0x0221
        L_0x0201:
            com.google.android.libraries.assistant.auto.tng.media.a.d.p r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13962p.f42516a
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r15, r1, r0)
            goto L_0x0221
        L_0x0208:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "MediaItemMetadata type is not set."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0221
        L_0x0215:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "ReplayMediaItemArgs metadata is not set."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0221:
            return r0
        L_0x0222:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x022a
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x022a:
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.hk r0 = (com.google.assistant.p3897e.p3921j.C52159hk) r0
            j$.util.Optional r1 = r2.f42539m
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0249
            j$.util.Optional r1 = r2.f42539m
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.assistant.auto.tng.assistant.c.c.a r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r1
            r1.mo20845e()
        L_0x0249:
            com.google.android.libraries.assistant.auto.tng.media.a.c.e r1 = r2.f42537k
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97588dA
            r1.mo21359c(r3)
            com.google.common.util.concurrent.cx r0 = r2.m30257c(r0, r7)
            return r0
        L_0x0255:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x025d
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x025d:
            com.google.assistant.e.j.iw r1 = com.google.assistant.p3897e.p3921j.C52198iw.f136995d
            com.google.protobuf.eb r1 = r1.getParserForType()
            java.lang.String r3 = "set_rating_args"
            com.google.protobuf.MessageLite r0 = m41992m(r0, r3, r1)
            com.google.assistant.e.j.iw r0 = (com.google.assistant.p3897e.p3921j.C52198iw) r0
            com.google.assistant.e.j.hk r1 = r0.f136998b
            if (r1 != 0) goto L_0x0271
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x0271:
            java.lang.String r1 = m30260f(r1)
            com.google.common.util.concurrent.cx r3 = r2.mo21375b(r1)
            com.google.android.libraries.assistant.auto.tng.media.a.d.t r4 = new com.google.android.libraries.assistant.auto.tng.media.a.d.t
            r4.<init>(r2, r1, r0)
            com.google.common.util.concurrent.da r0 = r2.f42530d
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r3, r1, r0)
            return r0
        L_0x0289:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x0291
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0291:
            com.google.assistant.e.j.io r1 = com.google.assistant.p3897e.p3921j.C52190io.f136978d
            com.google.protobuf.eb r1 = r1.getParserForType()
            java.lang.String r4 = "seek_to_position_args"
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.io r0 = (com.google.assistant.p3897e.p3921j.C52190io) r0
            int r1 = r0.f136980a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x02b6
            long r3 = r0.f136982c
            com.google.assistant.e.j.hk r0 = r0.f136981b
            if (r0 != 0) goto L_0x02ad
            com.google.assistant.e.j.hk r0 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x02ad:
            java.lang.String r0 = m30260f(r0)
            com.google.common.util.concurrent.cx r0 = r2.m30259e(r14, r3, r0)
            goto L_0x02d3
        L_0x02b6:
            com.google.common.f.x r0 = r3.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = "seek_off_set_ms field is not set in SeekToPositionArgs."
            r3 = 45197(0xb08d, float:6.3334E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "No seek_off_set_ms in SeekToPositionArgs"
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x02d3:
            return r0
        L_0x02d4:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x02dc
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x02dc:
            com.google.assistant.e.j.im r1 = com.google.assistant.p3897e.p3921j.C52188im.f136973d
            com.google.protobuf.eb r1 = r1.getParserForType()
            java.lang.String r4 = "seek_relative_args"
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.im r0 = (com.google.assistant.p3897e.p3921j.C52188im) r0
            int r1 = r0.f136975a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0301
            long r3 = r0.f136977c
            com.google.assistant.e.j.hk r0 = r0.f136976b
            if (r0 != 0) goto L_0x02f8
            com.google.assistant.e.j.hk r0 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
        L_0x02f8:
            java.lang.String r0 = m30260f(r0)
            com.google.common.util.concurrent.cx r0 = r2.m30259e(r10, r3, r0)
            goto L_0x031e
        L_0x0301:
            com.google.common.f.x r0 = r3.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = "seek_off_set_ms field is not set in SeekRelativeArgs."
            r3 = 45196(0xb08c, float:6.3333E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "No seek_offset_ms in SeekRelativeArgs"
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a.m30266a(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x031e:
            return r0
        L_0x031f:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x0327
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0327:
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.hk r0 = (com.google.assistant.p3897e.p3921j.C52159hk) r0
            j$.util.Optional r1 = r2.f42539m
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0346
            j$.util.Optional r1 = r2.f42539m
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.assistant.auto.tng.assistant.c.c.a r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r1
            r1.mo20844d()
        L_0x0346:
            com.google.android.libraries.assistant.auto.tng.media.a.c.e r1 = r2.f42537k
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97589dB
            r1.mo21359c(r3)
            java.lang.String r0 = m30260f(r0)
            com.google.android.libraries.assistant.auto.tng.media.a.d.b r1 = new com.google.android.libraries.assistant.auto.tng.media.a.d.b
            r1.<init>(r2)
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r11, r0, r1)
            return r0
        L_0x035b:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x0363
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0363:
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.hk r0 = (com.google.assistant.p3897e.p3921j.C52159hk) r0
            j$.util.Optional r1 = r2.f42539m
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0382
            j$.util.Optional r1 = r2.f42539m
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.assistant.auto.tng.assistant.c.c.a r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r1
            r1.mo20843c()
        L_0x0382:
            com.google.android.libraries.assistant.auto.tng.media.a.c.e r1 = r2.f42537k
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97639dz
            r1.mo21359c(r3)
            com.google.common.util.concurrent.cx r0 = r2.m30257c(r0, r12)
            return r0
        L_0x038e:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x0396
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0396:
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.hk r0 = (com.google.assistant.p3897e.p3921j.C52159hk) r0
            java.lang.String r0 = m30260f(r0)
            com.google.android.libraries.assistant.auto.tng.media.a.d.m r1 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13959m.f42513a
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r9, r0, r1)
            return r0
        L_0x03ad:
            r2 = r18
            com.google.assistant.e.j.dw r0 = r1.f135938d
            if (r0 != 0) goto L_0x03b5
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x03b5:
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.MessageLite r0 = m41992m(r0, r4, r1)
            com.google.assistant.e.j.hk r0 = (com.google.assistant.p3897e.p3921j.C52159hk) r0
            j$.util.Optional r1 = r2.f42539m
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x03d4
            j$.util.Optional r1 = r2.f42539m
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.assistant.auto.tng.assistant.c.c.a r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r1
            r1.mo20842b()
        L_0x03d4:
            com.google.android.libraries.assistant.auto.tng.media.a.c.e r1 = r2.f42537k
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97638dy
            r1.mo21359c(r3)
            java.lang.String r0 = m30260f(r0)
            com.google.android.libraries.assistant.auto.tng.media.a.d.e r1 = new com.google.android.libraries.assistant.auto.tng.media.a.d.e
            r1.<init>(r2)
            com.google.common.util.concurrent.cx r0 = r2.m30258d(r8, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13968v.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo21375b(String str) {
        if (str == null) {
            return this.f42538l.mo39945a();
        }
        return this.f42538l.mo39946b(str).mo39937b();
    }
}
