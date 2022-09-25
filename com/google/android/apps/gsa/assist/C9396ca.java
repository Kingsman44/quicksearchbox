package com.google.android.apps.gsa.assist;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assist.ca */
/* compiled from: PG */
abstract class C9396ca {

    /* renamed from: a */
    public final VoiceInteractionSession.Request f32564a;

    /* renamed from: b */
    protected boolean f32565b;

    /* renamed from: c */
    final /* synthetic */ C9397cb f32566c;

    protected C9396ca(C9397cb cbVar, VoiceInteractionSession.Request request) {
        this.f32566c = cbVar;
        this.f32564a = request;
        this.f32565b = cbVar.f32617n;
    }

    /* renamed from: n */
    public static final String m23871n(VoiceInteractor.Prompt prompt) {
        return prompt != null ? prompt.getVisualPrompt().toString() : BuildConfig.FLAVOR;
    }

    /* renamed from: o */
    private final String m23872o(String str) {
        return String.format("%s is not supported by %s", new Object[]{str, getClass().getSimpleName()});
    }

    /* renamed from: a */
    public abstract int mo17556a();

    /* renamed from: b */
    public VoiceInteractor.Prompt mo17557b() {
        return null;
    }

    /* renamed from: c */
    public void mo17558c() {
        throw new UnsupportedOperationException(m23872o("sendAbortResult"));
    }

    /* renamed from: d */
    public String mo17559d() {
        return null;
    }

    /* renamed from: e */
    public void mo17560e(Bundle bundle) {
        throw new UnsupportedOperationException(m23872o("sendIntermediateResult"));
    }

    /* renamed from: f */
    public void mo17561f(Bundle bundle) {
        throw new UnsupportedOperationException(m23872o("sendResult"));
    }

    /* renamed from: g */
    public void mo17562g() {
        throw new UnsupportedOperationException(m23872o("sendCompleteResult"));
    }

    /* renamed from: h */
    public void mo17563h(boolean z, Bundle bundle) {
        throw new UnsupportedOperationException(m23872o("sendConfirmationResult"));
    }

    /* renamed from: i */
    public void mo17575i(List list, Bundle bundle) {
        throw new UnsupportedOperationException(m23872o("sendIntermediatePickOptionResult"));
    }

    /* renamed from: j */
    public void mo17576j(List list, Bundle bundle) {
        throw new UnsupportedOperationException(m23872o("sendPickOptionResult"));
    }

    /* renamed from: k */
    public VoiceInteractor.PickOptionRequest.Option[] mo17577k() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0304  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17591l() {
        /*
            r24 = this;
            r0 = r24
            com.google.android.apps.gsa.assist.cb r1 = r0.f32566c
            int r2 = r24.mo17556a()
            boolean r3 = r1.f32617n
            java.lang.String r4 = ""
            r5 = 0
            if (r3 == 0) goto L_0x001d
            android.app.VoiceInteractor$Prompt r3 = r24.mo17557b()
            if (r3 == 0) goto L_0x001d
            java.lang.CharSequence r3 = r3.getVoicePromptAt(r5)
            java.lang.String r4 = r3.toString()
        L_0x001d:
            android.app.VoiceInteractor$Prompt r3 = r24.mo17557b()
            java.lang.String r3 = m23871n(r3)
            java.lang.String r6 = r24.mo17559d()
            android.service.voice.VoiceInteractionSession$Request r7 = r0.f32564a
            android.os.Bundle r7 = r7.getExtras()
            android.app.VoiceInteractor$PickOptionRequest$Option[] r8 = r24.mo17577k()
            boolean r9 = r0.f32565b
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            r11 = 1
            if (r11 != r10) goto L_0x003e
            java.lang.String r4 = " "
        L_0x003e:
            r12 = 2
            if (r2 == r12) goto L_0x029f
            if (r2 != 0) goto L_0x004b
            r0 = r1
            r20 = r3
            r17 = r9
            r2 = 0
            goto L_0x02a4
        L_0x004b:
            com.google.bb.a.pb r13 = com.google.p4152bb.p4153a.C55349pb.f145830g
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.bb.a.pa r13 = (com.google.p4152bb.p4153a.C55348pa) r13
            com.google.bb.a.ad r14 = com.google.p4152bb.p4153a.C54946ad.f144531h
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bb.a.ac r14 = (com.google.p4152bb.p4153a.C54945ac) r14
            com.google.bb.a.af r15 = com.google.p4152bb.p4153a.C54948af.f144541h
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.bb.a.ae r15 = (com.google.p4152bb.p4153a.C54947ae) r15
            com.google.bb.a.x r10 = com.google.p4152bb.p4153a.C55421x.THIRD_PARTY_VOICE_INTERACTION_API
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.af r5 = (com.google.p4152bb.p4153a.C54948af) r5
            int r10 = r10.f146230cP
            r5.f144544b = r10
            int r10 = r5.f144543a
            r10 = r10 | r11
            r5.f144543a = r10
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.ad r5 = (com.google.p4152bb.p4153a.C54946ad) r5
            com.google.protobuf.bv r10 = r15.build()
            com.google.bb.a.af r10 = (com.google.p4152bb.p4153a.C54948af) r10
            r10.getClass()
            r5.f144536d = r10
            int r10 = r5.f144533a
            r10 = r10 | 16
            r5.f144533a = r10
            com.google.bb.a.bg r5 = com.google.p4152bb.p4153a.C54976bg.f144641o
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.bf r5 = (com.google.p4152bb.p4153a.C54975bf) r5
            com.google.bb.a.rh r10 = com.google.p4152bb.p4153a.C55409rh.f146001d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.bb.a.rg r10 = (com.google.p4152bb.p4153a.C55408rg) r10
            com.google.bb.a.rn r15 = com.google.p4152bb.p4153a.C55415rn.f146023d
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.bb.a.rm r15 = (com.google.p4152bb.p4153a.C55414rm) r15
            com.google.bb.a.b r7 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142021c(r7)
            if (r7 == 0) goto L_0x00b9
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.bb.a.rn r12 = (com.google.p4152bb.p4153a.C55415rn) r12
            r12.f146026b = r7
            int r7 = r12.f146025a
            r7 = r7 | r11
            r12.f146025a = r7
        L_0x00b9:
            r7 = 3
            if (r2 != r7) goto L_0x00cb
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55407rf.f145997c
            com.google.bb.a.rf r7 = com.google.p4152bb.p4153a.C55407rf.f145996b
            r15.mo58885m(r6, r7)
        L_0x00c3:
            r22 = r1
            r20 = r3
            r17 = r9
            goto L_0x0209
        L_0x00cb:
            if (r2 != r11) goto L_0x00f2
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55405rd.f145991e
            com.google.bb.a.rd r8 = com.google.p4152bb.p4153a.C55405rd.f145990d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.bb.a.rc r8 = (com.google.p4152bb.p4153a.C55404rc) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.bb.a.rd r12 = (com.google.p4152bb.p4153a.C55405rd) r12
            r6.getClass()
            int r0 = r12.f145993a
            r0 = r0 | r11
            r12.f145993a = r0
            r12.f145994b = r6
            com.google.protobuf.bv r0 = r8.build()
            com.google.bb.a.rd r0 = (com.google.p4152bb.p4153a.C55405rd) r0
            r15.mo58885m(r7, r0)
            goto L_0x00c3
        L_0x00f2:
            r0 = 4
            if (r2 != r0) goto L_0x00c3
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55413rl.f146016e
            com.google.bb.a.rl r6 = com.google.p4152bb.p4153a.C55413rl.f146015d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.bb.a.ri r6 = (com.google.p4152bb.p4153a.C55410ri) r6
            if (r8 != 0) goto L_0x010d
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r22 = r1
            r20 = r3
            r17 = r9
            r7 = 0
        L_0x010a:
            r9 = 4
            goto L_0x01e5
        L_0x010d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r12 = r8.length
            r0 = 0
        L_0x0114:
            if (r0 >= r12) goto L_0x01dd
            r11 = r8[r0]
            com.google.bb.a.rk r17 = com.google.p4152bb.p4153a.C55412rk.f146007f
            com.google.protobuf.bn r17 = r17.createBuilder()
            r18 = r8
            r8 = r17
            com.google.bb.a.rj r8 = (com.google.p4152bb.p4153a.C55411rj) r8
            java.lang.CharSequence r17 = r11.getLabel()
            if (r17 == 0) goto L_0x014d
            java.lang.CharSequence r17 = r11.getLabel()
            r19 = r12
            java.lang.String r12 = r17.toString()
            r8.copyOnWrite()
            r17 = r9
            com.google.protobuf.bv r9 = r8.instance
            com.google.bb.a.rk r9 = (com.google.p4152bb.p4153a.C55412rk) r9
            r12.getClass()
            r20 = r3
            int r3 = r9.f146009a
            r16 = 1
            r3 = r3 | 1
            r9.f146009a = r3
            r9.f146010b = r12
            goto L_0x0153
        L_0x014d:
            r20 = r3
            r17 = r9
            r19 = r12
        L_0x0153:
            int r3 = r11.countSynonyms()
            r9 = 0
        L_0x0158:
            if (r9 >= r3) goto L_0x0195
            java.lang.CharSequence r12 = r11.getSynonymAt(r9)
            if (r12 == 0) goto L_0x018a
            java.lang.CharSequence r12 = r11.getSynonymAt(r9)
            java.lang.String r12 = r12.toString()
            r8.copyOnWrite()
            r21 = r3
            com.google.protobuf.bv r3 = r8.instance
            com.google.bb.a.rk r3 = (com.google.p4152bb.p4153a.C55412rk) r3
            r12.getClass()
            r22 = r1
            com.google.protobuf.cq r1 = r3.f146011c
            boolean r23 = r1.mo58948c()
            if (r23 != 0) goto L_0x0184
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r1)
            r3.f146011c = r1
        L_0x0184:
            com.google.protobuf.cq r1 = r3.f146011c
            r1.add(r12)
            goto L_0x018e
        L_0x018a:
            r22 = r1
            r21 = r3
        L_0x018e:
            int r9 = r9 + 1
            r3 = r21
            r1 = r22
            goto L_0x0158
        L_0x0195:
            r22 = r1
            android.os.Bundle r1 = r11.getExtras()
            com.google.bb.a.b r1 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142021c(r1)
            if (r1 == 0) goto L_0x01b1
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.bb.a.rk r3 = (com.google.p4152bb.p4153a.C55412rk) r3
            r3.f146013e = r1
            int r1 = r3.f146009a
            r9 = 4
            r1 = r1 | r9
            r3.f146009a = r1
            goto L_0x01b2
        L_0x01b1:
            r9 = 4
        L_0x01b2:
            int r1 = r11.getIndex()
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.bb.a.rk r3 = (com.google.p4152bb.p4153a.C55412rk) r3
            int r11 = r3.f146009a
            r12 = 2
            r11 = r11 | r12
            r3.f146009a = r11
            r3.f146012d = r1
            com.google.protobuf.bv r1 = r8.build()
            com.google.bb.a.rk r1 = (com.google.p4152bb.p4153a.C55412rk) r1
            r7.add(r1)
            int r0 = r0 + 1
            r9 = r17
            r8 = r18
            r12 = r19
            r3 = r20
            r1 = r22
            r11 = 1
            goto L_0x0114
        L_0x01dd:
            r22 = r1
            r20 = r3
            r17 = r9
            goto L_0x010a
        L_0x01e5:
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.bb.a.rl r0 = (com.google.p4152bb.p4153a.C55413rl) r0
            com.google.protobuf.cq r1 = r0.f146018a
            boolean r3 = r1.mo58948c()
            if (r3 != 0) goto L_0x01fa
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r1)
            r0.f146018a = r1
        L_0x01fa:
            com.google.protobuf.cq r0 = r0.f146018a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r0)
            com.google.protobuf.bv r0 = r6.build()
            com.google.bb.a.rl r0 = (com.google.p4152bb.p4153a.C55413rl) r0
            r15.mo58885m(r2, r0)
            r2 = 4
        L_0x0209:
            com.google.protobuf.bv r0 = r15.build()
            com.google.bb.a.rn r0 = (com.google.p4152bb.p4153a.C55415rn) r0
            r10.copyOnWrite()
            com.google.protobuf.bv r1 = r10.instance
            com.google.bb.a.rh r1 = (com.google.p4152bb.p4153a.C55409rh) r1
            r0.getClass()
            r1.f146004b = r0
            int r0 = r1.f146003a
            r3 = 1
            r0 = r0 | r3
            r1.f146003a = r0
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.bb.a.rh r0 = (com.google.p4152bb.p4153a.C55409rh) r0
            r4.getClass()
            int r1 = r0.f146003a
            r3 = 2
            r1 = r1 | r3
            r0.f146003a = r1
            r0.f146005c = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.bb.a.bg r0 = (com.google.p4152bb.p4153a.C54976bg) r0
            com.google.protobuf.bv r1 = r10.build()
            com.google.bb.a.rh r1 = (com.google.p4152bb.p4153a.C55409rh) r1
            r1.getClass()
            r0.f144653k = r1
            int r1 = r0.f144643a
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r0.f144643a = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.bb.a.bg r0 = (com.google.p4152bb.p4153a.C54976bg) r0
            int r1 = r0.f144643a
            r1 = r1 | 8
            r0.f144643a = r1
            r1 = 1
            r0.f144647e = r1
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.bb.a.ad r0 = (com.google.p4152bb.p4153a.C54946ad) r0
            com.google.protobuf.bv r1 = r5.build()
            com.google.bb.a.bg r1 = (com.google.p4152bb.p4153a.C54976bg) r1
            r1.getClass()
            r0.f144537e = r1
            int r1 = r0.f144533a
            r1 = r1 | 32
            r0.f144533a = r1
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.bb.a.pb r0 = (com.google.p4152bb.p4153a.C55349pb) r0
            com.google.protobuf.bv r1 = r14.build()
            com.google.bb.a.ad r1 = (com.google.p4152bb.p4153a.C54946ad) r1
            r1.getClass()
            r0.mo54249a()
            com.google.protobuf.cq r0 = r0.f145835d
            r0.add(r1)
            com.google.protobuf.bv r0 = r13.build()
            r5 = r0
            com.google.bb.a.pb r5 = (com.google.p4152bb.p4153a.C55349pb) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r22
            dagger.a r9 = r0.f32611h
            r10 = 0
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = com.google.android.apps.gsa.search.shared.actions.ActionData.m141431u(r5, r6, r7, r8, r9, r10)
            goto L_0x02a6
        L_0x029f:
            r0 = r1
            r20 = r3
            r17 = r9
        L_0x02a4:
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
        L_0x02a6:
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f32627x
            java.lang.String r5 = "and.gsa.d.gvis"
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84275aL(r5)
            com.google.common.o.amo r5 = com.google.android.apps.gsa.assist.C9397cb.f32568b
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84272aI(r5)
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r5 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r6 = 0
            r5.<init>((java.lang.String) r4, (boolean) r6)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "notification-message"
            r4.putParcelable(r6, r5)
            java.lang.String r5 = "android.speech.extra.ACTION_DATA"
            r4.putParcelable(r5, r1)
            com.google.android.apps.gsa.shared.search.f r1 = r3.mo84480i()
            r3 = 6
            r1.mo84562U(r3)
            r5 = 0
            r7 = 1024(0x400, double:5.06E-321)
            r1.mo84572d(r5, r7)
            r1.mo84589u(r4)
            com.google.android.apps.gsa.shared.search.Query r1 = r1.mo84568a()
            com.google.android.apps.gsa.assist.GsaVoiceInteractionView r3 = r0.f32618o
            if (r3 == 0) goto L_0x02f4
            com.google.android.apps.gsa.searchplate.SearchPlate r3 = r3.f32315b
            r4 = r20
            r3.mo82688p(r4)
            com.google.android.apps.gsa.assist.by r4 = r0.f32626w
            r4.f32544a = r3
            com.google.android.apps.gsa.assist.GsaVoiceInteractionView r3 = r0.f32618o
            com.google.android.apps.gsa.shared.util.bb r3 = r3.f32314a
            r4.f32545b = r3
        L_0x02f4:
            com.google.android.apps.gsa.assist.by r3 = r0.f32626w
            r3.f32546c = r2
            r4 = 2
            if (r2 == r4) goto L_0x02fd
            if (r2 != 0) goto L_0x0300
        L_0x02fd:
            r2 = 0
            r3.f32547d = r2
        L_0x0300:
            com.google.android.apps.gsa.search.shared.service.aa r2 = r0.f32619p
            if (r2 == 0) goto L_0x030f
            r3 = 0
            r2.mo81947s(r3)
            if (r17 == 0) goto L_0x030f
            com.google.android.apps.gsa.search.shared.service.aa r2 = r0.f32619p
            r2.mo81931b(r1)
        L_0x030f:
            com.google.common.util.concurrent.cx r1 = r0.f32607d
            com.google.android.apps.gsa.assist.C9397cb.m23887i(r1)
            r1 = 1
            r0.setKeepAwake(r1)
            com.google.android.apps.gsa.shared.util.c.bz r2 = r0.f32609f
            com.google.android.apps.gsa.assist.bs r3 = new com.google.android.apps.gsa.assist.bs
            r3.<init>(r0)
            r4 = 30000(0x7530, double:1.4822E-319)
            com.google.common.util.concurrent.cx r2 = r2.mo85137b(r3, r4)
            r0.f32607d = r2
            r0 = r24
            r0.f32565b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assist.C9396ca.mo17591l():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo17592m() {
        if (this.f32564a.isActive()) {
            return true;
        }
        C59104x c = C9397cb.f32567a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new Error())).mo56372aa('@')).mo56386p("Trying to use inactive request.");
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s: prompt=%s, extras=%s,", new Object[]{this.f32564a.getClass().getSimpleName(), mo17557b(), this.f32564a.getExtras()}));
        if (mo17559d() != null) {
            sb.append(String.format(" command=%s,", new Object[]{mo17559d()}));
        }
        if (mo17577k() != null && mo17577k().length > 0) {
            VoiceInteractor.PickOptionRequest.Option[] k = mo17577k();
            sb.append(" options=");
            int length = k.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%s,", new Object[]{k[i].getLabel()}));
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
