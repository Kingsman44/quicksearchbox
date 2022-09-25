package com.google.android.remotesearch;

import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.p4152bb.p4153a.C54946ad;

/* renamed from: com.google.android.remotesearch.n */
/* compiled from: PG */
final class C45228n implements C89784a {

    /* renamed from: a */
    final /* synthetic */ C54946ad f118021a;

    /* renamed from: b */
    final /* synthetic */ Query f118022b;

    /* renamed from: c */
    final /* synthetic */ RemoteSearchService f118023c;

    public C45228n(RemoteSearchService remoteSearchService, C54946ad adVar, Query query) {
        this.f118023c = remoteSearchService;
        this.f118021a = adVar;
        this.f118022b = query;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49086a(java.util.List r11) {
        /*
            r10 = this;
            com.google.android.remotesearch.RemoteSearchService r0 = r10.f118023c
            com.google.android.apps.gsa.shared.i.a r0 = r0.f118002n
            if (r10 != r0) goto L_0x00fc
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00fc
            r0 = 0
            java.lang.Object r11 = r11.get(r0)
            r3 = r11
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r3 = (com.google.android.apps.gsa.search.shared.actions.VoiceAction) r3
            boolean r11 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.PuntAction
            if (r11 == 0) goto L_0x0027
            com.google.common.f.e r11 = com.google.android.remotesearch.RemoteSearchService.f117989a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r0 = "Can't send punt action back"
            r1 = 54270(0xd3fe, float:7.6048E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0027:
            com.google.bb.a.ad r11 = r10.f118021a
            int r1 = r11.f144533a
            r1 = r1 & 32
            r2 = 0
            if (r1 == 0) goto L_0x006a
            com.google.bb.a.bg r11 = r11.f144537e
            if (r11 != 0) goto L_0x0036
            com.google.bb.a.bg r11 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x0036:
            com.google.protobuf.bt r1 = com.google.p5277z.p5282c.C68026p.f184307c
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r11.mo58887l(r1)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r4 = r1.f169971d
            java.lang.Object r11 = r11.mo58854l(r4)
            if (r11 != 0) goto L_0x004c
            java.lang.Object r11 = r1.f169969b
            goto L_0x0050
        L_0x004c:
            java.lang.Object r11 = r1.mo58889c(r11)
        L_0x0050:
            com.google.z.c.p r11 = (com.google.p5277z.p5282c.C68026p) r11
            com.google.protobuf.cq r1 = r11.f184309a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x006a
            com.google.protobuf.cq r11 = r11.f184309a
            java.lang.Object r11 = r11.get(r0)
            com.google.z.c.n r11 = (com.google.p5277z.p5282c.C68024n) r11
            com.google.z.c.v r11 = r11.f184300a
            if (r11 != 0) goto L_0x0068
            com.google.z.c.v r11 = com.google.p5277z.p5282c.C68032v.f184320b
        L_0x0068:
            r4 = r11
            goto L_0x006b
        L_0x006a:
            r4 = r2
        L_0x006b:
            com.google.android.remotesearch.RemoteSearchService r11 = r10.f118023c
            dagger.a r11 = r11.f117995g
            java.lang.Object r11 = r11.mo27525b()
            r1 = r11
            com.google.android.apps.gsa.search.shared.d.c r1 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r1
            r1.mo81653o()
            com.google.bb.a.ad r11 = r10.f118021a
            com.google.bb.a.af r11 = r11.f144536d
            if (r11 != 0) goto L_0x0081
            com.google.bb.a.af r11 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0081:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C54982bm.f144670c
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r11 = r11.mo58857o(r0)
            if (r11 == 0) goto L_0x00e3
            com.google.bb.a.ad r11 = r10.f118021a
            com.google.bb.a.af r11 = r11.f144536d
            if (r11 != 0) goto L_0x009c
            com.google.bb.a.af r11 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x009c:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C54982bm.f144670c
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r11 = r11.mo58854l(r2)
            if (r11 != 0) goto L_0x00b2
            java.lang.Object r11 = r0.f169969b
            goto L_0x00b6
        L_0x00b2:
            java.lang.Object r11 = r0.mo58889c(r11)
        L_0x00b6:
            com.google.bb.a.bm r11 = (com.google.p4152bb.p4153a.C54982bm) r11
            com.google.android.speech.embedded.TaggerResult r0 = new com.google.android.speech.embedded.TaggerResult
            com.google.speech.grammar.pumpkin.q r2 = com.google.speech.grammar.pumpkin.C66525q.f180929f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.speech.grammar.pumpkin.p r2 = (com.google.speech.grammar.pumpkin.C66524p) r2
            java.lang.String r11 = r11.f144672a
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.speech.grammar.pumpkin.q r5 = (com.google.speech.grammar.pumpkin.C66525q) r5
            r11.getClass()
            int r6 = r5.f180931a
            r6 = r6 | 2
            r5.f180931a = r6
            r5.f180932b = r11
            com.google.protobuf.bv r11 = r2.build()
            com.google.speech.grammar.pumpkin.q r11 = (com.google.speech.grammar.pumpkin.C66525q) r11
            com.google.common.o.te r2 = com.google.common.p4552o.C60527te.f163903c
            r0.<init>(r11, r2)
            r9 = r0
            goto L_0x00e4
        L_0x00e3:
            r9 = r2
        L_0x00e4:
            com.google.bb.a.ad r2 = r10.f118021a
            r5 = 0
            java.lang.String r6 = ""
            r7 = 0
            com.google.android.apps.gsa.shared.search.Query r11 = r10.f118022b
            java.lang.CharSequence r11 = r11.f252768g
            java.lang.String r8 = com.google.android.apps.gsa.shared.util.C90741ay.m148210b(r11)
            r1.mo81661w(r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.android.remotesearch.RemoteSearchService r11 = r10.f118023c
            com.google.android.apps.gsa.shared.search.Query r0 = r10.f118022b
            r11.mo49061e(r0)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.remotesearch.C45228n.mo49086a(java.util.List):void");
    }
}
