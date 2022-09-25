package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141758q;
import com.google.android.apps.search.transcription.p10667c.C141763a;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.transcription.f.bl */
/* compiled from: PG */
final class C141844bl implements C19347o {

    /* renamed from: a */
    final /* synthetic */ C141845bm f384914a;

    public C141844bl(C141845bm bmVar) {
        this.f384914a = bmVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        if ((r1 & 16777216) == 0) goto L_0x0155;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23782t(com.google.speech.p5218j.C67087ko r7) {
        /*
            r6 = this;
            com.google.android.apps.search.transcription.f.bm r0 = r6.f384914a
            com.google.apps.tiktok.tracing.dh r0 = r0.f384920f
            java.lang.String r1 = "handleSodaEvent"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            int r1 = r7.f182368a     // Catch:{ all -> 0x0183 }
            r2 = r1 & 2
            r3 = 1
            if (r2 == 0) goto L_0x00e2
            com.google.speech.j.kk r1 = r7.f182370c     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x0017
            com.google.speech.j.kk r1 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0183 }
        L_0x0017:
            int r2 = r1.f182354b     // Catch:{ all -> 0x0183 }
            if (r2 != r3) goto L_0x00ab
            java.lang.Object r1 = r1.f182355c     // Catch:{ all -> 0x0183 }
            com.google.speech.j.ix r1 = (com.google.speech.p5218j.C67042ix) r1     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.o r2 = com.google.android.apps.search.transcription.p10670f.C141921o.f385102d     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.n r2 = (com.google.android.apps.search.transcription.p10670f.C141920n) r2     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cq r3 = r1.f182230b     // Catch:{ all -> 0x0183 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.o r4 = (com.google.android.apps.search.transcription.p10670f.C141921o) r4     // Catch:{ all -> 0x0183 }
            r4.mo116889a()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cq r4 = r4.f385104a     // Catch:{ all -> 0x0183 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cq r3 = r1.f182230b     // Catch:{ all -> 0x0183 }
            int r3 = r3.size()     // Catch:{ all -> 0x0183 }
            float[] r3 = new float[r3]     // Catch:{ all -> 0x0183 }
            java.util.List r3 = com.google.common.p4575r.C60752i.m92731e(r3)     // Catch:{ all -> 0x0183 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.o r4 = (com.google.android.apps.search.transcription.p10670f.C141921o) r4     // Catch:{ all -> 0x0183 }
            r4.mo116890b()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cg r4 = r4.f385105b     // Catch:{ all -> 0x0183 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bt r3 = com.google.speech.p5218j.C66881d.f181827c     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x0183 }
            r1.mo58887l(r3)     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bf r4 = r1.f169962ag     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bs r3 = r3.f169971d     // Catch:{ all -> 0x0183 }
            int r3 = r4.mo58853k(r3)     // Catch:{ all -> 0x0183 }
            if (r3 == 0) goto L_0x009c
            com.google.protobuf.bt r3 = com.google.speech.p5218j.C66881d.f181827c     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x0183 }
            r1.mo58887l(r3)     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bf r1 = r1.f169962ag     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bs r4 = r3.f169971d     // Catch:{ all -> 0x0183 }
            java.lang.Object r1 = r1.mo58854l(r4)     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x007c
            java.lang.Object r1 = r3.f169969b     // Catch:{ all -> 0x0183 }
            goto L_0x0080
        L_0x007c:
            java.lang.Object r1 = r3.mo58889c(r1)     // Catch:{ all -> 0x0183 }
        L_0x0080:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0183 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.o r3 = (com.google.android.apps.search.transcription.p10670f.C141921o) r3     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cq r4 = r3.f385106c     // Catch:{ all -> 0x0183 }
            boolean r5 = r4.mo58948c()     // Catch:{ all -> 0x0183 }
            if (r5 != 0) goto L_0x0097
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)     // Catch:{ all -> 0x0183 }
            r3.f385106c = r4     // Catch:{ all -> 0x0183 }
        L_0x0097:
            com.google.protobuf.cq r3 = r3.f385106c     // Catch:{ all -> 0x0183 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r3)     // Catch:{ all -> 0x0183 }
        L_0x009c:
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bp r1 = r1.f384924j     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.o r2 = (com.google.android.apps.search.transcription.p10670f.C141921o) r2     // Catch:{ all -> 0x0183 }
            r1.mo116733g(r2)     // Catch:{ all -> 0x0183 }
            goto L_0x011c
        L_0x00ab:
            r4 = 2
            if (r2 != r4) goto L_0x011c
            java.lang.Object r1 = r1.f182355c     // Catch:{ all -> 0x0183 }
            com.google.speech.j.ju r1 = (com.google.speech.p5218j.C67066ju) r1     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.ay r2 = com.google.android.apps.search.transcription.p10670f.C141806ay.f384845d     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.ax r2 = (com.google.android.apps.search.transcription.p10670f.C141805ax) r2     // Catch:{ all -> 0x0183 }
            com.google.protobuf.cq r1 = r1.f182305b     // Catch:{ all -> 0x0183 }
            r4 = 0
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0183 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.ay r4 = (com.google.android.apps.search.transcription.p10670f.C141806ay) r4     // Catch:{ all -> 0x0183 }
            r1.getClass()     // Catch:{ all -> 0x0183 }
            int r5 = r4.f384847a     // Catch:{ all -> 0x0183 }
            r3 = r3 | r5
            r4.f384847a = r3     // Catch:{ all -> 0x0183 }
            r4.f384848b = r1     // Catch:{ all -> 0x0183 }
            com.google.protobuf.bv r1 = r2.build()     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.ay r1 = (com.google.android.apps.search.transcription.p10670f.C141806ay) r1     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bm r2 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bp r2 = r2.f384924j     // Catch:{ all -> 0x0183 }
            r2.mo116731e(r1)     // Catch:{ all -> 0x0183 }
            goto L_0x011c
        L_0x00e2:
            r1 = r1 & 8
            if (r1 == 0) goto L_0x011c
            com.google.speech.j.it r1 = r7.f182372e     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x00ec
            com.google.speech.j.it r1 = com.google.speech.p5218j.C67038it.f182220d     // Catch:{ all -> 0x0183 }
        L_0x00ec:
            int r1 = r1.f182222a     // Catch:{ all -> 0x0183 }
            r1 = r1 & r3
            if (r1 == 0) goto L_0x011c
            com.google.speech.j.it r1 = r7.f182372e     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x00f7
            com.google.speech.j.it r1 = com.google.speech.p5218j.C67038it.f182220d     // Catch:{ all -> 0x0183 }
        L_0x00f7:
            int r1 = r1.f182223b     // Catch:{ all -> 0x0183 }
            com.google.speech.j.is r1 = com.google.speech.p5218j.C67037is.m97413a(r1)     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x0101
            com.google.speech.j.is r1 = com.google.speech.p5218j.C67037is.START_OF_SPEECH     // Catch:{ all -> 0x0183 }
        L_0x0101:
            com.google.speech.j.is r2 = com.google.speech.p5218j.C67037is.START_OF_SPEECH     // Catch:{ all -> 0x0183 }
            if (r1 != r2) goto L_0x010d
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bp r1 = r1.f384924j     // Catch:{ all -> 0x0183 }
            r1.mo116735i()     // Catch:{ all -> 0x0183 }
            goto L_0x011c
        L_0x010d:
            com.google.speech.j.is r2 = com.google.speech.p5218j.C67037is.END_OF_SPEECH     // Catch:{ all -> 0x0183 }
            if (r1 == r2) goto L_0x0115
            com.google.speech.j.is r2 = com.google.speech.p5218j.C67037is.END_OF_UTTERANCE     // Catch:{ all -> 0x0183 }
            if (r1 != r2) goto L_0x011c
        L_0x0115:
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bp r1 = r1.f384924j     // Catch:{ all -> 0x0183 }
            r1.mo116727a()     // Catch:{ all -> 0x0183 }
        L_0x011c:
            int r1 = r7.f182368a     // Catch:{ all -> 0x0183 }
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0130
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.libraries.assistant.soda.d.k r1 = r1.f384918d     // Catch:{ all -> 0x0183 }
            com.google.speech.j.eg r2 = r7.f182379l     // Catch:{ all -> 0x0183 }
            if (r2 != 0) goto L_0x012d
            com.google.speech.j.eg r2 = com.google.speech.p5218j.C66917eg.f181904d     // Catch:{ all -> 0x0183 }
        L_0x012d:
            r1.mo24436a(r2)     // Catch:{ all -> 0x0183 }
        L_0x0130:
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bs r1 = r1.f384923i     // Catch:{ all -> 0x0183 }
            boolean r1 = r1.mo116841w()     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x0155
            int r1 = r7.f182368a     // Catch:{ all -> 0x0183 }
            r2 = r1 & 2
            if (r2 == 0) goto L_0x0141
            goto L_0x014e
        L_0x0141:
            r2 = r1 & 8
            if (r2 != 0) goto L_0x014e
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x014e
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0155
        L_0x014e:
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bp r1 = r1.f384924j     // Catch:{ all -> 0x0183 }
            r1.mo116734h(r7)     // Catch:{ all -> 0x0183 }
        L_0x0155:
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bs r1 = r1.f384923i     // Catch:{ all -> 0x0183 }
            j$.util.Optional r1 = r1.mo116827i()     // Catch:{ all -> 0x0183 }
            boolean r1 = r1.isPresent()     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x017d
            int r1 = r7.f182368a     // Catch:{ all -> 0x0183 }
            r1 = r1 & 32
            if (r1 == 0) goto L_0x017d
            com.google.speech.j.ih r7 = r7.f182373f     // Catch:{ all -> 0x0183 }
            if (r7 != 0) goto L_0x016f
            com.google.speech.j.ih r7 = com.google.speech.p5218j.C67026ih.f182188e     // Catch:{ all -> 0x0183 }
        L_0x016f:
            float r7 = r7.f182192c     // Catch:{ all -> 0x0183 }
            r1 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r1
            int r7 = (int) r7     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.bm r1 = r6.f384914a     // Catch:{ all -> 0x0183 }
            com.google.android.apps.search.transcription.f.af r1 = r1.f384930p     // Catch:{ all -> 0x0183 }
            r1.mo116745o(r7)     // Catch:{ all -> 0x0183 }
        L_0x017d:
            if (r0 == 0) goto L_0x0182
            r0.close()
        L_0x0182:
            return
        L_0x0183:
            r7 = move-exception
            if (r0 == 0) goto L_0x018e
            r0.close()     // Catch:{ all -> 0x018a }
            goto L_0x018e
        L_0x018a:
            r0 = move-exception
            com.google.android.apps.search.transcription.p10670f.C141841bi.m230173a(r7, r0)
        L_0x018e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.C141844bl.mo23782t(com.google.speech.j.ko):void");
    }

    /* renamed from: u */
    public final void mo23783u() {
        C47538ax c = this.f384914a.f384920f.mo51613c("handleStart");
        try {
            C141845bm bmVar = this.f384914a;
            C60870cx cxVar = bmVar.f384932r;
            if (cxVar != null) {
                C141842bj bjVar = new C141842bj();
                C60856cj.m92911t(cxVar, C47810es.m84974n(bjVar), bmVar.f384916b);
            }
            if (this.f384914a.f384919e.mo56113h()) {
                ((C141763a) this.f384914a.f384919e.mo56107c()).mo116711a();
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141841bi.m230173a(th, th);
        }
        throw th;
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        C47538ax c = this.f384914a.f384920f.mo51613c("handleStop");
        try {
            if (afVar == C19243af.ERROR) {
                this.f384914a.f384924j.mo116728b(new C141758q(3));
            } else {
                this.f384914a.f384924j.mo116732f();
            }
            if (this.f384914a.f384919e.mo56113h()) {
                ((C141763a) this.f384914a.f384919e.mo56107c()).mo116712b();
            }
            C141845bm bmVar = this.f384914a;
            C60870cx cxVar = bmVar.f384932r;
            if (cxVar != null) {
                C141843bk bkVar = new C141843bk(this);
                C60856cj.m92911t(cxVar, C47810es.m84974n(bkVar), bmVar.f384916b);
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141841bi.m230173a(th, th);
        }
        throw th;
    }
}
