package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.KeyboardPreparer$bringKeyboardUpIfFieldIsFocused$2", mo61344c = "KeyboardPreparer.kt", mo61345d = "invokeSuspend", mo61346e = {155, 173})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bb */
/* compiled from: PG */
final class C125838bb extends C69572j implements C69630p {

    /* renamed from: a */
    int f346796a;

    /* renamed from: b */
    int f346797b;

    /* renamed from: c */
    final /* synthetic */ C125850bn f346798c;

    /* renamed from: d */
    final /* synthetic */ C125049ad f346799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125838bb(C125850bn bnVar, C125049ad adVar, C69577g gVar) {
        super(2, gVar);
        this.f346798c = bnVar;
        this.f346799d = adVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125838bb) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f346797b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 == r4) goto L_0x0013
            int r1 = r10.f346796a
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            goto L_0x00a3
        L_0x0013:
            int r1 = r10.f346796a
            p5462h.C69714l.m101134b(r11)
            r5 = r1
            r1 = r10
            goto L_0x003d
        L_0x001b:
            p5462h.C69714l.m101134b(r11)
            r1 = r10
            r11 = 0
        L_0x0020:
            int r11 = r11 + r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r5 = r1.f346798c
            j$.time.Duration r6 = r5.f346851e
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ba r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.ba
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r8 = r1.f346799d
            r7.<init>(r5, r8, r2)
            r1.f346796a = r11
            r1.f346797b = r4
            long r5 = com.google.common.p4580v.p4582b.C60942a.m93083a(r6)
            java.lang.Object r5 = kotlinx.coroutines.C71745ea.m104930b(r5, r7, r1)
            if (r5 == r0) goto L_0x00da
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x003d:
            com.google.android.apps.search.assistant.surfaces.dictation.a.aj r11 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125055aj) r11
            if (r11 == 0) goto L_0x0048
            boolean r11 = r11.f345026a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            goto L_0x0049
        L_0x0048:
            r11 = r2
        L_0x0049:
            if (r11 != 0) goto L_0x006b
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.f346847a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r11.mo56374ac(r4, r6)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36718(0x8f6e, float:5.1453E-41)
            r6.<init>(r7)
            r11.mo56379ah(r6)
            java.lang.String r6 = "Keyboard-up IPC timed out [SD]"
            r11.mo56386p(r6)
            r11 = r5
            r5 = 0
            goto L_0x00b5
        L_0x006b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r11, r6)
            if (r6 == 0) goto L_0x00a9
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.f346847a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r11.mo56374ac(r4, r6)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36717(0x8f6d, float:5.1451E-41)
            r6.<init>(r7)
            r11.mo56379ah(r6)
            java.lang.String r6 = "Sending the keyboard-up IPC failed. [SD]"
            r11.mo56386p(r6)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r11 = r1.f346798c
            j$.time.Duration r11 = r11.f346852f
            r1.f346796a = r5
            r6 = 2
            r1.f346797b = r6
            java.lang.Object r11 = com.google.common.p4580v.p4582b.C60942a.m93084b(r11, r1)
            if (r11 == r0) goto L_0x00a8
            r11 = r1
            r1 = r5
        L_0x00a3:
            r5 = 0
            r9 = r1
            r1 = r11
            r11 = r9
            goto L_0x00b5
        L_0x00a8:
            return r0
        L_0x00a9:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r11, r6)
            if (r11 == 0) goto L_0x00d4
            r11 = r5
            r5 = 1
        L_0x00b5:
            if (r5 != 0) goto L_0x00b9
            goto L_0x0020
        L_0x00b9:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.f346847a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 36716(0x8f6c, float:5.145E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Keyboard-up IPC succeeded after %s attempts [SD]"
            r0.mo56387q(r1, r11)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            return r11
        L_0x00d4:
            h.g r11 = new h.g
            r11.<init>()
            throw r11
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125838bb.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125838bb(this.f346798c, this.f346799d, gVar);
    }
}
