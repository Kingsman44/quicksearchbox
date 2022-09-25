package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.g */
/* compiled from: PG */
public final class C128668g implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C128670i f353707a;

    public C128668g(C128670i iVar) {
        this.f353707a = iVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59052c cVar = (C59052c) C128670i.f353709a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "SidePanelVPContentSrc");
        cVar.mo56379ah(new C59094n(37938));
        cVar.mo56386p("VoicePlateStateResponse stream completed");
        this.f353707a.mo108609c();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C128670i.f353709a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "SidePanelVPContentSrc");
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(37939));
        cVar2.mo56386p("VoicePlateStateResponse stream error");
        this.f353707a.mo108609c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a2, code lost:
        if (r2 == 3) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128667f.m209974b(r3) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128667f.m209974b(r3) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20123c(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bw r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw) r10
            java.lang.String r0 = "response"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.i r1 = r9.f353707a
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.f r2 = r1.f353710b
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            int r3 = r10.f352470b
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.m209216a(r3)
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.c.a r4 = com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9749c.C128659a.UNINITIALIZED
            int r3 = r3.ordinal()
            r4 = 4
            r5 = 2
            r6 = 3
            r7 = 1
            if (r3 == r7) goto L_0x0057
            if (r3 == r5) goto L_0x003a
            if (r3 == r6) goto L_0x0028
        L_0x0026:
            r3 = 4
            goto L_0x0076
        L_0x0028:
            int r3 = r10.f352470b
            if (r3 != r4) goto L_0x0031
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi) r3
            goto L_0x0033
        L_0x0031:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi.f352422f
        L_0x0033:
            boolean r3 = r3.f352428e
            if (r3 == 0) goto L_0x0038
            goto L_0x0026
        L_0x0038:
            r3 = 3
            goto L_0x0076
        L_0x003a:
            int r3 = r10.f352470b
            if (r3 != r6) goto L_0x0043
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm) r3
            goto L_0x0045
        L_0x0043:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm.f352436f
        L_0x0045:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bf r3 = r3.f352440c
            if (r3 != 0) goto L_0x004b
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bf r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128084bf.f352418c
        L_0x004b:
            java.lang.String r8 = "response.halfListening.audioLevel"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            boolean r3 = com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128667f.m209974b(r3)
            if (r3 == 0) goto L_0x0075
            goto L_0x0073
        L_0x0057:
            int r3 = r10.f352470b
            if (r3 != r5) goto L_0x0060
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk) r3
            goto L_0x0062
        L_0x0060:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk.f352429f
        L_0x0062:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bf r3 = r3.f352433c
            if (r3 != 0) goto L_0x0068
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bf r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128084bf.f352418c
        L_0x0068:
            java.lang.String r8 = "response.fullListening.audioLevel"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            boolean r3 = com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128667f.m209974b(r3)
            if (r3 == 0) goto L_0x0075
        L_0x0073:
            r3 = 2
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            r2.f353704c = r3
            r2.mo108608a()
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.voiceplatevisibility.impl.a r2 = r1.f353718j
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            int r3 = r10.f352470b
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.m209216a(r3)
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r8 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.IDLE
            if (r3 != r8) goto L_0x009f
            int r3 = r10.f352470b
            if (r3 != r7) goto L_0x0093
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq) r3
            goto L_0x0095
        L_0x0093:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq.f352444d
        L_0x0095:
            int r3 = r3.f352447b
            int r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128094bp.m209213a(r3)
            if (r3 != 0) goto L_0x00a0
            r3 = 1
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            int r8 = r2.f353755c
            if (r8 == r3) goto L_0x00a9
            r2.f353755c = r3
            r2.mo108619a()
        L_0x00a9:
            int r2 = r10.f352470b
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.m209216a(r2)
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0179
            if (r2 == r7) goto L_0x0143
            if (r2 == r5) goto L_0x010c
            if (r2 == r6) goto L_0x00bd
            goto L_0x01ab
        L_0x00bd:
            int r2 = r10.f352470b
            if (r2 != r4) goto L_0x00c6
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi) r2
            goto L_0x00c8
        L_0x00c6:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi.f352422f
        L_0x00c8:
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.f352426c
            if (r2 != 0) goto L_0x00ce
            com.google.android.apps.gsa.nga.shared.v.io r2 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
        L_0x00ce:
            java.lang.String r3 = "response.executing.utteranceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.f353712d = r2
            int r2 = r10.f352470b
            if (r2 != r4) goto L_0x00de
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi) r2
            goto L_0x00e0
        L_0x00de:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi.f352422f
        L_0x00e0:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r2 = r2.f352425b
            if (r2 != 0) goto L_0x00e6
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv.f352463c
        L_0x00e6:
            java.lang.String r2 = r2.f352466b
            java.lang.String r3 = "response.executing.transcription.transcription"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.f353713e = r2
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.drltranscription.impl.a r2 = r1.f353717i
            int r5 = r10.f352470b
            if (r5 != r4) goto L_0x00fa
            java.lang.Object r4 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi) r4
            goto L_0x00fc
        L_0x00fa:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi r4 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi.f352422f
        L_0x00fc:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r4 = r4.f352425b
            if (r4 != 0) goto L_0x0102
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r4 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv.f352463c
        L_0x0102:
            java.lang.String r4 = r4.f352466b
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r3)
            r2.mo108618b(r4)
            goto L_0x01ab
        L_0x010c:
            int r2 = r10.f352470b
            if (r2 != r6) goto L_0x0115
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm) r2
            goto L_0x0117
        L_0x0115:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm.f352436f
        L_0x0117:
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.f352441d
            if (r2 != 0) goto L_0x011d
            com.google.android.apps.gsa.nga.shared.v.io r2 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
        L_0x011d:
            java.lang.String r3 = "response.halfListening.utteranceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.f353712d = r2
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.drltranscription.impl.a r2 = r1.f353717i
            int r3 = r10.f352470b
            if (r3 != r6) goto L_0x012f
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm) r3
            goto L_0x0131
        L_0x012f:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128091bm.f352436f
        L_0x0131:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r3 = r3.f352439b
            if (r3 != 0) goto L_0x0137
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv.f352463c
        L_0x0137:
            java.lang.String r3 = r3.f352466b
            java.lang.String r4 = "response.halfListening.transcription.transcription"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r2.mo108617a(r3)
            goto L_0x01ab
        L_0x0143:
            int r2 = r10.f352470b
            if (r2 != r5) goto L_0x014c
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk) r2
            goto L_0x014e
        L_0x014c:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk.f352429f
        L_0x014e:
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.f352434d
            if (r2 != 0) goto L_0x0154
            com.google.android.apps.gsa.nga.shared.v.io r2 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
        L_0x0154:
            java.lang.String r3 = "response.fullListening.utteranceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.f353712d = r2
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.drltranscription.impl.a r2 = r1.f353717i
            int r3 = r10.f352470b
            if (r3 != r5) goto L_0x0166
            java.lang.Object r3 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk) r3
            goto L_0x0168
        L_0x0166:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bk r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128089bk.f352429f
        L_0x0168:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r3 = r3.f352432b
            if (r3 != 0) goto L_0x016e
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bv r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv.f352463c
        L_0x016e:
            java.lang.String r3 = r3.f352466b
            java.lang.String r4 = "response.fullListening.transcription.transcription"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r2.mo108617a(r3)
            goto L_0x01ab
        L_0x0179:
            int r2 = r10.f352470b
            if (r2 != r7) goto L_0x0182
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq) r2
            goto L_0x0184
        L_0x0182:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq.f352444d
        L_0x0184:
            int r2 = r2.f352447b
            int r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128094bp.m209213a(r2)
            if (r2 != 0) goto L_0x018d
            goto L_0x01a4
        L_0x018d:
            if (r2 == r7) goto L_0x01a4
            int r2 = r10.f352470b
            if (r2 != r7) goto L_0x0198
            java.lang.Object r2 = r10.f352471c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq) r2
            goto L_0x019a
        L_0x0198:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq.f352444d
        L_0x019a:
            int r2 = r2.f352447b
            int r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128094bp.m209213a(r2)
            if (r2 == 0) goto L_0x01ab
            if (r2 != r6) goto L_0x01ab
        L_0x01a4:
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.drltranscription.impl.a r2 = r1.f353717i
            java.lang.String r3 = r1.f353713e
            r2.mo108618b(r3)
        L_0x01ab:
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.c r1 = r1.f353711c
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r0 = r1.f353698c
            int r2 = r10.f352470b
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.m209216a(r2)
            if (r0 != r3) goto L_0x01bb
            goto L_0x01d8
        L_0x01bb:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r0 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.m209216a(r2)
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt.EXECUTING
            if (r0 != r2) goto L_0x01d8
            kotlinx.coroutines.cp r0 = r1.f353697b
            r2 = 0
            if (r0 == 0) goto L_0x01cb
            r0.mo62723u(r2)
        L_0x01cb:
            kotlinx.coroutines.aw r0 = r1.f353696a
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.b r3 = new com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.b
            r3.<init>(r1, r10, r2)
            kotlinx.coroutines.cp r10 = kotlinx.coroutines.C71803m.m105043d(r0, r2, r2, r3, r6)
            r1.f353697b = r10
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128668g.mo20123c(java.lang.Object):void");
    }
}
