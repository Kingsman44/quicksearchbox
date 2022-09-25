package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.app.PendingIntent;
import android.content.Context;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55156hy;
import com.google.p4152bb.p4153a.C55240la;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.k */
/* compiled from: PG */
public final class C93279k implements C93277i {

    /* renamed from: b */
    private static final C59071e f260115b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.k");

    /* renamed from: a */
    final C87594r f260116a;

    /* renamed from: c */
    private final Context f260117c;

    public C93279k(Context context, C22871g gVar, C22871g gVar2) {
        this.f260117c = context;
        this.f260116a = new C87594r(context, gVar, gVar2);
    }

    /* renamed from: a */
    public final boolean mo87608a(C55240la laVar) {
        C62940bt r0 = C62942bv.checkIsLite(C55156hy.f145198h);
        laVar.mo58887l(r0);
        return laVar.f169962ag.mo58857o(r0.f169971d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.bb.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.bb.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.google.bb.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.support.v4.media.RatingCompat} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0207, code lost:
        if (r14 == false) goto L_0x02e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87609b(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r14, com.google.p4152bb.p4153a.C55240la r15) {
        /*
            r13 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r15.mo58887l(r0)
            com.google.protobuf.bf r1 = r15.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x02e7
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r14 = r14.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r14 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r14
            com.google.android.apps.gsa.search.shared.actions.util.i r0 = r14.f236270h
            boolean r0 = r0.mo81484i()
            r1 = 0
            if (r0 != 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r15.mo58887l(r0)
            com.google.protobuf.bf r2 = r15.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0037
            java.lang.Object r0 = r0.f169969b
            goto L_0x003b
        L_0x0037:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x003b:
            com.google.bb.a.hy r0 = (com.google.p4152bb.p4153a.C55156hy) r0
            int r0 = r0.f145205f
            com.google.bb.a.hl r0 = com.google.p4152bb.p4153a.C55143hl.m87608a(r0)
            if (r0 != 0) goto L_0x0047
            com.google.bb.a.hl r0 = com.google.p4152bb.p4153a.C55143hl.UNKNOWN_COMMAND
        L_0x0047:
            com.google.bb.a.hl r2 = com.google.p4152bb.p4153a.C55143hl.PLAY_FROM_SEARCH
            r3 = 1
            if (r0 == r2) goto L_0x0053
            com.google.bb.a.hl r2 = com.google.p4152bb.p4153a.C55143hl.PLAY_FROM_URI
            if (r0 != r2) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r0 = 0
            goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            com.google.bb.a.pn r2 = r14.mo81433d()
            java.lang.String r2 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r2)
            com.google.bb.a.pn r14 = r14.mo81433d()
            r4 = 0
            if (r14 != 0) goto L_0x0065
        L_0x0063:
            r14 = r4
            goto L_0x0096
        L_0x0065:
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r14.mo58887l(r5)
            com.google.protobuf.bf r6 = r14.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r6.mo58857o(r5)
            if (r5 == 0) goto L_0x0063
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r14.mo58887l(r5)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r14 = r14.mo58854l(r6)
            if (r14 != 0) goto L_0x008e
            java.lang.Object r14 = r5.f169969b
            goto L_0x0092
        L_0x008e:
            java.lang.Object r14 = r5.mo58889c(r14)
        L_0x0092:
            com.google.bb.a.ph r14 = (com.google.p4152bb.p4153a.C55355ph) r14
            java.lang.String r14 = r14.f145857c
        L_0x0096:
            android.content.ComponentName r14 = android.content.ComponentName.unflattenFromString(r14)
            com.google.android.apps.gsa.search.shared.media.r r5 = r13.f260116a
            android.util.Pair r14 = r5.mo81726e(r14, r2, r0)
            java.lang.Object r14 = r14.first
            android.support.v4.media.session.v r14 = (android.support.p031v4.media.session.C0320v) r14
            if (r14 == 0) goto L_0x02e6
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r15.mo58887l(r0)
            com.google.protobuf.bf r15 = r15.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r15 = r15.mo58854l(r2)
            if (r15 != 0) goto L_0x00bc
            java.lang.Object r15 = r0.f169969b
            goto L_0x00c0
        L_0x00bc:
            java.lang.Object r15 = r0.mo58889c(r15)
        L_0x00c0:
            com.google.bb.a.hy r15 = (com.google.p4152bb.p4153a.C55156hy) r15
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r15.f145205f
            android.support.v4.media.session.q r0 = r14.mo1037e()
            int r2 = r15.f145205f
            com.google.bb.a.hl r2 = com.google.p4152bb.p4153a.C55143hl.m87608a(r2)
            if (r2 != 0) goto L_0x00d4
            com.google.bb.a.hl r2 = com.google.p4152bb.p4153a.C55143hl.UNKNOWN_COMMAND
        L_0x00d4:
            int r2 = r2.ordinal()
            r5 = 3
            r6 = 0
            r8 = 4
            r9 = 2
            java.lang.String r10 = "MediaControlHandler"
            switch(r2) {
                case 1: goto L_0x02aa;
                case 2: goto L_0x025e;
                case 3: goto L_0x0227;
                case 4: goto L_0x0222;
                case 5: goto L_0x021a;
                case 6: goto L_0x0215;
                case 7: goto L_0x0210;
                case 8: goto L_0x020b;
                case 9: goto L_0x01bc;
                case 10: goto L_0x0103;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r0, r10)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            r0 = 13497(0x34b9, float:1.8913E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r0)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            int r15 = r15.f145205f
            com.google.bb.a.hl r15 = com.google.p4152bb.p4153a.C55143hl.m87608a(r15)
            if (r15 != 0) goto L_0x02e1
            com.google.bb.a.hl r15 = com.google.p4152bb.p4153a.C55143hl.UNKNOWN_COMMAND
            goto L_0x02e1
        L_0x0103:
            int r0 = r15.f145201b
            r2 = 7
            if (r0 != r2) goto L_0x01a8
            java.lang.Object r15 = r15.f145202c
            com.google.bb.a.ht r15 = (com.google.p4152bb.p4153a.C55151ht) r15
            int r0 = r15.f145185b
            int r0 = com.google.p4152bb.p4153a.C55150hs.m87610a(r0)
            if (r0 != 0) goto L_0x0115
            r0 = 1
        L_0x0115:
            int r15 = r15.f145184a
            long r11 = (long) r15
            int r0 = r0 + -1
            if (r0 == r3) goto L_0x016c
            if (r0 == r9) goto L_0x0188
            if (r0 == r5) goto L_0x0135
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Unknown fromPosition type."
            r0 = 13500(0x34bc, float:1.8918E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
        L_0x0132:
            r14 = 0
            goto L_0x0207
        L_0x0135:
            android.support.v4.media.MediaMetadataCompat r15 = r14.mo1036d()
            if (r15 != 0) goto L_0x014e
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Fail to get metadata from current media session."
            r0 = 13504(0x34c0, float:1.8923E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x0132
        L_0x014e:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0165
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Position offset is positive when seeking from the end."
            r0 = 13503(0x34bf, float:1.8922E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x0132
        L_0x0165:
            java.lang.String r0 = "android.media.metadata.DURATION"
            long r4 = r15.mo816a(r0)
            goto L_0x0187
        L_0x016c:
            android.support.v4.media.session.PlaybackStateCompat r15 = r14.mo1038f()
            if (r15 != 0) goto L_0x0185
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Fail to get playback state from current media session."
            r0 = 13502(0x34be, float:1.892E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x0132
        L_0x0185:
            long r4 = r15.f995b
        L_0x0187:
            long r11 = r11 + r4
        L_0x0188:
            int r15 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x019f
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Can't seek to a negative position."
            r0 = 13501(0x34bd, float:1.8919E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x0132
        L_0x019f:
            android.support.v4.media.session.q r14 = r14.mo1037e()
            r14.mo1024i(r11)
        L_0x01a6:
            r14 = 1
            goto L_0x0207
        L_0x01a8:
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "seekToCommand of media control execution is null."
            r0 = 13499(0x34bb, float:1.8916E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x02e6
        L_0x01bc:
            int r0 = r15.f145201b
            r2 = 6
            if (r0 != r2) goto L_0x01c6
            java.lang.Object r15 = r15.f145202c
            com.google.bb.a.hx r15 = (com.google.p4152bb.p4153a.C55155hx) r15
            goto L_0x01c8
        L_0x01c6:
            com.google.bb.a.hx r15 = com.google.p4152bb.p4153a.C55155hx.f145193b
        L_0x01c8:
            int r0 = r14.mo1033a()
            int r15 = r15.f145195a
            int r2 = com.google.p4152bb.p4153a.C55167ii.m87615a(r15)
            if (r2 != 0) goto L_0x01d5
            goto L_0x01dc
        L_0x01d5:
            if (r2 != r9) goto L_0x01dc
            android.support.v4.media.RatingCompat r4 = android.support.p031v4.media.RatingCompat.m611g(r0)
            goto L_0x01fb
        L_0x01dc:
            int r0 = com.google.p4152bb.p4153a.C55167ii.m87615a(r15)
            if (r0 != 0) goto L_0x01e3
            goto L_0x01ec
        L_0x01e3:
            if (r0 != r8) goto L_0x01ec
            com.google.android.apps.gsa.search.shared.media.r r15 = r13.f260116a
            android.support.v4.media.RatingCompat r4 = r15.mo81723b(r14)
            goto L_0x01fb
        L_0x01ec:
            int r15 = com.google.p4152bb.p4153a.C55167ii.m87615a(r15)
            if (r15 != 0) goto L_0x01f3
            goto L_0x01fb
        L_0x01f3:
            if (r15 != r5) goto L_0x01fb
            com.google.android.apps.gsa.search.shared.media.r r15 = r13.f260116a
            android.support.v4.media.RatingCompat r4 = r15.mo81724c(r14)
        L_0x01fb:
            if (r4 != 0) goto L_0x01ff
            goto L_0x0132
        L_0x01ff:
            android.support.v4.media.session.q r14 = r14.mo1037e()
            r14.mo1026k(r4)
            goto L_0x01a6
        L_0x0207:
            if (r14 == 0) goto L_0x02e6
            goto L_0x02e0
        L_0x020b:
            r0.mo1031p()
            goto L_0x02e0
        L_0x0210:
            r0.mo1017b()
            goto L_0x02e0
        L_0x0215:
            r0.mo1018c()
            goto L_0x02e0
        L_0x021a:
            r0.mo1024i(r6)
            r0.mo1030o()
            goto L_0x02e0
        L_0x0222:
            r0.mo1029n()
            goto L_0x02e0
        L_0x0227:
            int r14 = r15.f145201b
            r1 = 8
            if (r14 != r1) goto L_0x0232
            java.lang.Object r14 = r15.f145202c
            com.google.bb.a.hv r14 = (com.google.p4152bb.p4153a.C55153hv) r14
            goto L_0x0234
        L_0x0232:
            com.google.bb.a.hv r14 = com.google.p4152bb.p4153a.C55153hv.f145187d
        L_0x0234:
            java.lang.String r14 = r14.f145190b
            int r2 = r15.f145201b
            if (r2 != r1) goto L_0x023f
            java.lang.Object r5 = r15.f145202c
            com.google.bb.a.hv r5 = (com.google.p4152bb.p4153a.C55153hv) r5
            goto L_0x0241
        L_0x023f:
            com.google.bb.a.hv r5 = com.google.p4152bb.p4153a.C55153hv.f145187d
        L_0x0241:
            int r5 = r5.f145189a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x0255
            if (r2 != r1) goto L_0x024d
            java.lang.Object r15 = r15.f145202c
            com.google.bb.a.hv r15 = (com.google.p4152bb.p4153a.C55153hv) r15
            goto L_0x024f
        L_0x024d:
            com.google.bb.a.hv r15 = com.google.p4152bb.p4153a.C55153hv.f145187d
        L_0x024f:
            com.google.bb.a.b r4 = r15.f145191c
            if (r4 != 0) goto L_0x0255
            com.google.bb.a.b r4 = com.google.p4152bb.p4153a.C54969b.f144589b
        L_0x0255:
            android.os.Bundle r15 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142020b(r4)
            r0.mo1025j(r14, r15)
            goto L_0x02e0
        L_0x025e:
            int r2 = r15.f145201b
            r5 = 5
            if (r2 != r5) goto L_0x0297
            java.lang.Object r1 = r15.f145202c
            com.google.bb.a.hp r1 = (com.google.p4152bb.p4153a.C55147hp) r1
            java.lang.String r1 = r1.f145178b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            int r2 = r15.f145201b
            if (r2 != r5) goto L_0x0276
            java.lang.Object r6 = r15.f145202c
            com.google.bb.a.hp r6 = (com.google.p4152bb.p4153a.C55147hp) r6
            goto L_0x0278
        L_0x0276:
            com.google.bb.a.hp r6 = com.google.p4152bb.p4153a.C55147hp.f145175d
        L_0x0278:
            int r6 = r6.f145177a
            r6 = r6 & r9
            if (r6 == 0) goto L_0x028c
            if (r2 != r5) goto L_0x0284
            java.lang.Object r15 = r15.f145202c
            com.google.bb.a.hp r15 = (com.google.p4152bb.p4153a.C55147hp) r15
            goto L_0x0286
        L_0x0284:
            com.google.bb.a.hp r15 = com.google.p4152bb.p4153a.C55147hp.f145175d
        L_0x0286:
            com.google.bb.a.b r4 = r15.f145179c
            if (r4 != 0) goto L_0x028c
            com.google.bb.a.b r4 = com.google.p4152bb.p4153a.C54969b.f144589b
        L_0x028c:
            android.os.Bundle r15 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142020b(r4)
            r0.mo1021f(r1, r15)
            r13.mo87610c(r14)
            goto L_0x02e0
        L_0x0297:
            com.google.common.f.e r14 = f260115b
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "Can't execute PLAY_FROM_URI command because playFromUriCommand is null."
            r0 = 13498(0x34ba, float:1.8915E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x02e6
        L_0x02aa:
            int r1 = r15.f145201b
            if (r1 != r8) goto L_0x02b3
            java.lang.Object r1 = r15.f145202c
            com.google.bb.a.hn r1 = (com.google.p4152bb.p4153a.C55145hn) r1
            goto L_0x02b5
        L_0x02b3:
            com.google.bb.a.hn r1 = com.google.p4152bb.p4153a.C55145hn.f145169d
        L_0x02b5:
            java.lang.String r1 = r1.f145172b
            int r2 = r15.f145201b
            if (r2 != r8) goto L_0x02c0
            java.lang.Object r5 = r15.f145202c
            com.google.bb.a.hn r5 = (com.google.p4152bb.p4153a.C55145hn) r5
            goto L_0x02c2
        L_0x02c0:
            com.google.bb.a.hn r5 = com.google.p4152bb.p4153a.C55145hn.f145169d
        L_0x02c2:
            int r5 = r5.f145171a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x02d6
            if (r2 != r8) goto L_0x02ce
            java.lang.Object r15 = r15.f145202c
            com.google.bb.a.hn r15 = (com.google.p4152bb.p4153a.C55145hn) r15
            goto L_0x02d0
        L_0x02ce:
            com.google.bb.a.hn r15 = com.google.p4152bb.p4153a.C55145hn.f145169d
        L_0x02d0:
            com.google.bb.a.b r4 = r15.f145173c
            if (r4 != 0) goto L_0x02d6
            com.google.bb.a.b r4 = com.google.p4152bb.p4153a.C54969b.f144589b
        L_0x02d6:
            android.os.Bundle r15 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142020b(r4)
            r0.mo1020e(r1, r15)
            r13.mo87610c(r14)
        L_0x02e0:
            return r3
        L_0x02e1:
            java.lang.String r0 = "Unknown command type: %s"
            r14.mo56389s(r0, r15)
        L_0x02e6:
            return r1
        L_0x02e7:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Illegal ExecutionInfo! canHandleExecutionInfo() should be called prior to calling executeExecutionInfo()"
            r14.<init>(r15)
            goto L_0x02f0
        L_0x02ef:
            throw r14
        L_0x02f0:
            goto L_0x02ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93279k.mo87609b(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction, com.google.bb.a.la):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo87610c(C0320v vVar) {
        PendingIntent c = vVar.mo1035c();
        if (c != null) {
            try {
                c.send();
            } catch (PendingIntent.CanceledException e) {
                C59104x c2 = f260115b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "MediaControlHandler");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(13495)).mo56386p("Failed to send session activity.");
            }
        } else {
            C59104x c3 = f260115b.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "MediaControlHandler");
            ((C59052c) ((C59052c) c3).mo56372aa(13494)).mo56386p("Session activity is null. Fallback to Context#startActivity.");
            Context context = this.f260117c;
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(vVar.mo1039g()));
        }
    }
}
