package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables.Wiggle;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.bl */
/* compiled from: PG */
public final class C128507bl implements C46792di {

    /* renamed from: a */
    final /* synthetic */ Wiggle f353400a;

    public C128507bl(Wiggle wiggle) {
        this.f353400a = wiggle;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128508bm.f353401a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38878));
        cVar.mo56386p("#MWW Failed to update wiggle UI state.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.surfaces.voice.o.c.d.h r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h) r11
            java.lang.String r0 = "data"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.Wiggle r0 = r10.f353400a
            int r11 = r11.f353467b
            com.google.android.apps.search.assistant.surfaces.voice.o.c.d.f r11 = com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f.m209785a(r11)
            if (r11 != 0) goto L_0x0013
            com.google.android.apps.search.assistant.surfaces.voice.o.c.d.f r11 = com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED
        L_0x0013:
            int r11 = r11.ordinal()
            r1 = 2
            if (r11 == r1) goto L_0x0023
            r2 = 3
            if (r11 == r2) goto L_0x0020
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.i r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables.C130323i.HIDDEN
            goto L_0x0025
        L_0x0020:
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.i r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables.C130323i.RECOGNITION
            goto L_0x0025
        L_0x0023:
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.i r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables.C130323i.IDLE
        L_0x0025:
            java.lang.String r2 = "state"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.h r0 = r0.f357189a
            java.lang.String r2 = "targetState"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            r0.f357212e = r11
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.i r2 = r0.f357212e
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.i r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables.C130323i.HIDDEN
            r4 = 0
            if (r2 != r3) goto L_0x003c
            r2 = 4
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 != 0) goto L_0x0048
            h.f.a.l r3 = r0.f357211d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo5761a(r5)
        L_0x0048:
            java.util.Map r3 = r0.f357210c
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r3 = p3186j$.util.Map.EL.getOrDefault(r3, r11, r5)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.g r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.g
            r6.<init>(r0, r2)
            android.animation.ValueAnimator r2 = r0.f357216i
            if (r2 == 0) goto L_0x0065
            r2.cancel()
        L_0x0065:
            j$.time.Duration r2 = r0.f357208a
            boolean r2 = r2.isZero()
            r7 = 1
            if (r2 != 0) goto L_0x009e
            float r2 = r0.f357214g
            int r8 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x009e
        L_0x0075:
            float[] r8 = new float[r1]
            r8[r4] = r2
            r8[r7] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r8)
            j$.time.Duration r3 = r0.f357208a
            long r8 = r3.toMillis()
            r2.setDuration(r8)
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.e r3 = new com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.e
            r3.<init>(r0, r2)
            r2.addUpdateListener(r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.f r3 = new com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.f
            r3.<init>(r6)
            r2.addListener(r3)
            r2.start()
            r0.f357216i = r2
            goto L_0x00a3
        L_0x009e:
            r0.f357214g = r3
            r6.mo5672a()
        L_0x00a3:
            java.util.Map r2 = r0.f357209b
            java.lang.Object r11 = p3186j$.util.Map.EL.getOrDefault(r2, r11, r5)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            android.animation.ValueAnimator r2 = r0.f357215h
            if (r2 == 0) goto L_0x00b6
            r2.cancel()
        L_0x00b6:
            j$.time.Duration r2 = r0.f357208a
            boolean r2 = r2.isZero()
            if (r2 != 0) goto L_0x00e6
            float r2 = r0.f357213f
            int r3 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            goto L_0x00e6
        L_0x00c5:
            float[] r1 = new float[r1]
            r1[r4] = r2
            r1[r7] = r11
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofFloat(r1)
            j$.time.Duration r1 = r0.f357208a
            long r1 = r1.toMillis()
            r11.setDuration(r1)
            com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.d r1 = new com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.d
            r1.<init>(r0, r11)
            r11.addUpdateListener(r1)
            r11.start()
            r0.f357215h = r11
            return
        L_0x00e6:
            r0.f357213f = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b.C128507bl.mo18078b(java.lang.Object):void");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
