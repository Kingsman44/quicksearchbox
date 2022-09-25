package com.google.android.libraries.search.assistant.performer.p2757g;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33580e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.z */
/* compiled from: PG */
public final class C36108z implements C35472h {

    /* renamed from: a */
    public static final C59071e f94436a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.z");

    /* renamed from: b */
    public final C68214a f94437b;

    /* renamed from: c */
    public final C21370a f94438c;

    /* renamed from: d */
    private final C36029l f94439d;

    /* renamed from: e */
    private final Optional f94440e;

    /* renamed from: f */
    private final C60887da f94441f;

    public C36108z(Optional optional, C36029l lVar, C68214a aVar, C60887da daVar, C21370a aVar2) {
        this.f94439d = lVar;
        this.f94437b = aVar;
        this.f94440e = optional;
        this.f94441f = daVar;
        this.f94438c = aVar2;
    }

    /* renamed from: c */
    public static String m64515c(C52159hk hkVar) {
        if (hkVar == null || (hkVar.f136862a & 1) == 0) {
            return null;
        }
        C51098gh ghVar = hkVar.f136863b;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        return C36084bb.m64494a(ghVar);
    }

    /* renamed from: d */
    private final C60870cx m64516d(String str) {
        if (str == null) {
            return this.f94439d.mo39945a();
        }
        return this.f94439d.mo39946b(str).mo39937b();
    }

    /* renamed from: e */
    private final C60870cx m64517e(String str, long j, String str2) {
        C60870cx d = m64516d(str2);
        C36099q qVar = new C36099q(this, str2, str, j);
        return C60922j.m93045h(d, C47810es.m84966f(qVar), this.f94441f);
    }

    /* renamed from: f */
    private final C60870cx m64518f() {
        if (this.f94440e.isEmpty()) {
            return C60866ct.f164955a;
        }
        C60870cx a = ((C33580e) this.f94440e.get()).mo38993a();
        C36101s sVar = C36101s.f94425a;
        return C60846c.m92878g(a, Throwable.class, C47810es.m84963c(sVar), this.f94441f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018d A[Catch:{ g -> 0x034d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20766a(com.google.assistant.p3897e.p3921j.C51809dy r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "Cannot perform client op: "
            java.lang.String r3 = r1.f135936b
            com.google.common.f.e r4 = f94436a
            com.google.common.f.x r5 = r4.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "MediaControlPerformer"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "Triggering clientOp at media control %s"
            r8 = 52096(0xcb80, float:7.3002E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56389s(r6, r3)
            int r5 = r3.hashCode()     // Catch:{ g -> 0x034d }
            java.lang.String r6 = "media.SHUFFLE"
            java.lang.String r8 = "media.NEXT"
            java.lang.String r9 = "media.PREVIOUS"
            java.lang.String r10 = "media.SEEK_RELATIVE"
            java.lang.String r11 = "media.RESUME"
            java.lang.String r12 = "media.SET_REPEAT"
            java.lang.String r13 = "media.SEEK_TO_POSITION"
            java.lang.String r15 = "media.REPLAY_MEDIA_ITEM"
            r16 = 0
            r17 = 4
            switch(r5) {
                case -1674598467: goto L_0x009c;
                case -1543031824: goto L_0x0094;
                case -1447981948: goto L_0x008a;
                case -1444411262: goto L_0x0081;
                case -1431171252: goto L_0x0077;
                case -1424506244: goto L_0x006e;
                case -1355740809: goto L_0x0066;
                case -171300823: goto L_0x005e;
                case 1865141697: goto L_0x0056;
                case 1893440189: goto L_0x004e;
                case 1893603276: goto L_0x0044;
                case 1896492751: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x00a7
        L_0x003a:
            boolean r5 = r3.equals(r6)
            if (r5 == 0) goto L_0x00a7
            r5 = 9
            goto L_0x00a8
        L_0x0044:
            java.lang.String r5 = "media.STOP"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x00a7
            r5 = 7
            goto L_0x00a8
        L_0x004e:
            boolean r5 = r3.equals(r8)
            if (r5 == 0) goto L_0x00a7
            r5 = 0
            goto L_0x00a8
        L_0x0056:
            boolean r5 = r3.equals(r9)
            if (r5 == 0) goto L_0x00a7
            r5 = 1
            goto L_0x00a8
        L_0x005e:
            boolean r5 = r3.equals(r10)
            if (r5 == 0) goto L_0x00a7
            r5 = 4
            goto L_0x00a8
        L_0x0066:
            boolean r5 = r3.equals(r11)
            if (r5 == 0) goto L_0x00a7
            r5 = 3
            goto L_0x00a8
        L_0x006e:
            boolean r5 = r3.equals(r15)
            if (r5 == 0) goto L_0x00a7
            r5 = 8
            goto L_0x00a8
        L_0x0077:
            java.lang.String r5 = "media.PAUSE"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x00a7
            r5 = 2
            goto L_0x00a8
        L_0x0081:
            boolean r5 = r3.equals(r12)
            if (r5 == 0) goto L_0x00a7
            r5 = 10
            goto L_0x00a8
        L_0x008a:
            java.lang.String r5 = "media.SET_RATING"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x00a7
            r5 = 6
            goto L_0x00a8
        L_0x0094:
            boolean r5 = r3.equals(r13)
            if (r5 == 0) goto L_0x00a7
            r5 = 5
            goto L_0x00a8
        L_0x009c:
            java.lang.String r5 = "media.SET_PLAYBACK_RATE"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x00a7
            r5 = 11
            goto L_0x00a8
        L_0x00a7:
            r5 = -1
        L_0x00a8:
            java.lang.String r14 = "common_media_control_args"
            switch(r5) {
                case 0: goto L_0x0321;
                case 1: goto L_0x030a;
                case 2: goto L_0x02ea;
                case 3: goto L_0x02d3;
                case 4: goto L_0x0290;
                case 5: goto L_0x024d;
                case 6: goto L_0x0221;
                case 7: goto L_0x0201;
                case 8: goto L_0x019d;
                case 9: goto L_0x0166;
                case 10: goto L_0x012a;
                case 11: goto L_0x00b1;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED     // Catch:{ g -> 0x034d }
            goto L_0x0338
        L_0x00b1:
            java.lang.String r2 = "set_playback_rate_args"
            com.google.assistant.e.j.is r5 = com.google.assistant.p3897e.p3921j.C52194is.f136988e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r5)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.is r1 = (com.google.assistant.p3897e.p3921j.C52194is) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f136990a     // Catch:{ g -> 0x034d }
            r5 = r2 & 2
            if (r5 == 0) goto L_0x00c6
            goto L_0x00e8
        L_0x00c6:
            r6 = r2 & 4
            if (r6 != 0) goto L_0x00e8
            com.google.common.f.x r1 = r4.mo56226d()     // Catch:{ g -> 0x034d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ g -> 0x034d }
            r1.mo56378ag(r2, r7)     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "Neither playback_rate field nor relative_playback_rate_field is not set in SetPlaybackRateArgs."
            r4 = 52095(0xcb7f, float:7.3E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "Neither playback_rate nor relative_playback_rate_field in SetPlaybackRateArgs."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
            goto L_0x0129
        L_0x00e8:
            if (r5 == 0) goto L_0x010c
            r2 = r2 & 4
            if (r2 == 0) goto L_0x010c
            com.google.common.f.x r1 = r4.mo56226d()     // Catch:{ g -> 0x034d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ g -> 0x034d }
            r1.mo56378ag(r2, r7)     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "Both playback_rate field and relative_playback_rate_field are set in SetPlaybackRateArgs. Only one should be set."
            r4 = 52094(0xcb7e, float:7.2999E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "Both playback_rate and relative_playback_rate_field in SetPlaybackRateArgs. Only one should be set."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
            goto L_0x0129
        L_0x010c:
            com.google.assistant.e.j.hk r2 = r1.f136991b     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x0112
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x0112:
            java.lang.String r2 = m64515c(r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r4 = r0.m64516d(r2)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.o r5 = new com.google.android.libraries.search.assistant.performer.g.o     // Catch:{ g -> 0x034d }
            r5.<init>(r0, r2, r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.da r1 = r0.f94441f     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r5)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r4, r2, r1)     // Catch:{ g -> 0x034d }
        L_0x0129:
            return r1
        L_0x012a:
            java.lang.String r2 = "set_repeat_args"
            com.google.assistant.e.j.ja r4 = com.google.assistant.p3897e.p3921j.C52203ja.f137003d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r4)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.ja r1 = (com.google.assistant.p3897e.p3921j.C52203ja) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f137005a     // Catch:{ g -> 0x034d }
            r4 = 2
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0146
            int r2 = r1.f137007c     // Catch:{ g -> 0x034d }
            int r2 = com.google.assistant.p3897e.p3921j.C52201iz.m86539a(r2)     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x0147
        L_0x0146:
            r2 = 1
        L_0x0147:
            r4 = -1
            int r2 = r2 + r4
            r4 = 1
            if (r2 == r4) goto L_0x0152
            r5 = 2
            if (r2 == r5) goto L_0x0151
            r4 = 0
            goto L_0x0152
        L_0x0151:
            r4 = 2
        L_0x0152:
            com.google.assistant.e.j.hk r1 = r1.f137006b     // Catch:{ g -> 0x034d }
            if (r1 != 0) goto L_0x0158
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x0158:
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.l r2 = new com.google.android.libraries.search.assistant.performer.g.l     // Catch:{ g -> 0x034d }
            r2.<init>(r4)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r12, r1, r2)     // Catch:{ g -> 0x034d }
            return r1
        L_0x0166:
            r4 = 1
            java.lang.String r2 = "shuffle_args"
            com.google.assistant.e.j.je r5 = com.google.assistant.p3897e.p3921j.C52207je.f137009d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r5)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.je r1 = (com.google.assistant.p3897e.p3921j.C52207je) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f137011a     // Catch:{ g -> 0x034d }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0188
            int r2 = r1.f137013c     // Catch:{ g -> 0x034d }
            int r2 = com.google.assistant.p3897e.p3921j.C52206jd.m86540a(r2)     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x0184
            goto L_0x0188
        L_0x0184:
            r5 = 2
            if (r2 != r5) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r4 = 0
        L_0x0189:
            com.google.assistant.e.j.hk r1 = r1.f137012b     // Catch:{ g -> 0x034d }
            if (r1 != 0) goto L_0x018f
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x018f:
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.j r2 = new com.google.android.libraries.search.assistant.performer.g.j     // Catch:{ g -> 0x034d }
            r2.<init>(r4)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r6, r1, r2)     // Catch:{ g -> 0x034d }
            return r1
        L_0x019d:
            java.lang.String r2 = "replay_media_item_args"
            com.google.assistant.e.j.ik r4 = com.google.assistant.p3897e.p3921j.C52186ik.f136967d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r4)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.ik r1 = (com.google.assistant.p3897e.p3921j.C52186ik) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f136969a     // Catch:{ g -> 0x034d }
            r4 = 2
            r2 = r2 & r4
            if (r2 == 0) goto L_0x01f4
            com.google.assistant.e.j.wo r2 = r1.f136971c     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x01b7
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v     // Catch:{ g -> 0x034d }
        L_0x01b7:
            int r4 = r2.f137994a     // Catch:{ g -> 0x034d }
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x01e7
            com.google.assistant.e.j.hk r1 = r1.f136970b     // Catch:{ g -> 0x034d }
            if (r1 != 0) goto L_0x01c3
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x01c3:
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            int r2 = r2.f138003j     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r2)     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x01d1
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN     // Catch:{ g -> 0x034d }
        L_0x01d1:
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.PLAYLIST     // Catch:{ g -> 0x034d }
            boolean r2 = r2.equals(r4)     // Catch:{ g -> 0x034d }
            if (r2 == 0) goto L_0x01e0
            com.google.android.libraries.search.assistant.performer.g.x r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36106x.f94434a     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r15, r1, r2)     // Catch:{ g -> 0x034d }
            goto L_0x0200
        L_0x01e0:
            com.google.android.libraries.search.assistant.performer.g.y r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36107y.f94435a     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r15, r1, r2)     // Catch:{ g -> 0x034d }
            goto L_0x0200
        L_0x01e7:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "MediaItemMetadata type is not set."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
            goto L_0x0200
        L_0x01f4:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "ReplayMediaItemArgs metadata is not set."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
        L_0x0200:
            return r1
        L_0x0201:
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r14, r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = (com.google.assistant.p3897e.p3921j.C52159hk) r1     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r2 = r18.m64518f()     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.u r4 = new com.google.android.libraries.search.assistant.performer.g.u     // Catch:{ g -> 0x034d }
            r4.<init>(r0, r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.da r1 = r0.f94441f     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.s r4 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r2, r4, r1)     // Catch:{ g -> 0x034d }
            return r1
        L_0x0221:
            java.lang.String r2 = "set_rating_args"
            com.google.assistant.e.j.iw r4 = com.google.assistant.p3897e.p3921j.C52198iw.f136995d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r4)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.iw r1 = (com.google.assistant.p3897e.p3921j.C52198iw) r1     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r2 = r1.f136998b     // Catch:{ g -> 0x034d }
            if (r2 != 0) goto L_0x0235
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x0235:
            java.lang.String r2 = m64515c(r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r4 = r0.m64516d(r2)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.v r5 = new com.google.android.libraries.search.assistant.performer.g.v     // Catch:{ g -> 0x034d }
            r5.<init>(r0, r2, r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.da r1 = r0.f94441f     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r5)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r4, r2, r1)     // Catch:{ g -> 0x034d }
            return r1
        L_0x024d:
            java.lang.String r2 = "seek_to_position_args"
            com.google.assistant.e.j.io r5 = com.google.assistant.p3897e.p3921j.C52190io.f136978d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r5)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.io r1 = (com.google.assistant.p3897e.p3921j.C52190io) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f136980a     // Catch:{ g -> 0x034d }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0272
            long r4 = r1.f136982c     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = r1.f136981b     // Catch:{ g -> 0x034d }
            if (r1 != 0) goto L_0x0269
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x0269:
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.m64517e(r13, r4, r1)     // Catch:{ g -> 0x034d }
            goto L_0x028f
        L_0x0272:
            com.google.common.f.x r1 = r4.mo56226d()     // Catch:{ g -> 0x034d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ g -> 0x034d }
            r1.mo56378ag(r2, r7)     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "seek_off_set_ms field is not set in SeekToPositionArgs."
            r4 = 52093(0xcb7d, float:7.2998E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "No seek_off_set_ms in SeekToPositionArgs"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
        L_0x028f:
            return r1
        L_0x0290:
            java.lang.String r2 = "seek_relative_args"
            com.google.assistant.e.j.im r5 = com.google.assistant.p3897e.p3921j.C52188im.f136973d     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r2, r5)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.im r1 = (com.google.assistant.p3897e.p3921j.C52188im) r1     // Catch:{ g -> 0x034d }
            int r2 = r1.f136975a     // Catch:{ g -> 0x034d }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x02b5
            long r4 = r1.f136977c     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = r1.f136976b     // Catch:{ g -> 0x034d }
            if (r1 != 0) goto L_0x02ac
            com.google.assistant.e.j.hk r1 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
        L_0x02ac:
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.m64517e(r10, r4, r1)     // Catch:{ g -> 0x034d }
            goto L_0x02d2
        L_0x02b5:
            com.google.common.f.x r1 = r4.mo56226d()     // Catch:{ g -> 0x034d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ g -> 0x034d }
            r1.mo56378ag(r2, r7)     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "seek_off_set_ms field is not set in SeekRelativeArgs."
            r4 = 52092(0xcb7c, float:7.2996E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ g -> 0x034d }
            java.lang.String r2 = "No seek_offset_ms in SeekRelativeArgs"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
        L_0x02d2:
            return r1
        L_0x02d3:
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r14, r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = (com.google.assistant.p3897e.p3921j.C52159hk) r1     // Catch:{ g -> 0x034d }
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.w r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36105w.f94433a     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r11, r1, r2)     // Catch:{ g -> 0x034d }
            return r1
        L_0x02ea:
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r14, r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = (com.google.assistant.p3897e.p3921j.C52159hk) r1     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r2 = r18.m64518f()     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.t r4 = new com.google.android.libraries.search.assistant.performer.g.t     // Catch:{ g -> 0x034d }
            r4.<init>(r0, r1)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.da r1 = r0.f94441f     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.s r4 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r2, r4, r1)     // Catch:{ g -> 0x034d }
            return r1
        L_0x030a:
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r14, r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = (com.google.assistant.p3897e.p3921j.C52159hk) r1     // Catch:{ g -> 0x034d }
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.h r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36090h.f94406a     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r9, r1, r2)     // Catch:{ g -> 0x034d }
            return r1
        L_0x0321:
            com.google.assistant.e.j.hk r2 = com.google.assistant.p3897e.p3921j.C52159hk.f136860e     // Catch:{ g -> 0x034d }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ g -> 0x034d }
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r14, r2)     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.hk r1 = (com.google.assistant.p3897e.p3921j.C52159hk) r1     // Catch:{ g -> 0x034d }
            java.lang.String r1 = m64515c(r1)     // Catch:{ g -> 0x034d }
            com.google.android.libraries.search.assistant.performer.g.m r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36095m.f94414a     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = r0.mo39968b(r8, r1, r2)     // Catch:{ g -> 0x034d }
            return r1
        L_0x0338:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ g -> 0x034d }
            r4.<init>(r2)     // Catch:{ g -> 0x034d }
            r4.append(r3)     // Catch:{ g -> 0x034d }
            java.lang.String r2 = r4.toString()     // Catch:{ g -> 0x034d }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)     // Catch:{ g -> 0x034d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x034d }
            return r1
        L_0x034d:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r2 = "Failed to parse args for client op: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2757g.C36108z.mo20766a(com.google.assistant.e.j.dy):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo39968b(String str, String str2, C36081e eVar) {
        C60870cx d = m64516d(str2);
        C36091i iVar = new C36091i(this, str2, str, eVar);
        return C60922j.m93045h(d, C47810es.m84966f(iVar), this.f94441f);
    }
}
