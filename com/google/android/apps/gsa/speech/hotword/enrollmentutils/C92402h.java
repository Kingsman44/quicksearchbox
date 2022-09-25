package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.h */
/* compiled from: PG */
final class C92402h extends C90880an {

    /* renamed from: a */
    final /* synthetic */ String f257680a;

    /* renamed from: b */
    final /* synthetic */ Account f257681b;

    /* renamed from: c */
    final /* synthetic */ C66595bu f257682c;

    /* renamed from: d */
    final /* synthetic */ C90584f f257683d;

    /* renamed from: e */
    final /* synthetic */ C92399e f257684e;

    /* renamed from: f */
    final /* synthetic */ boolean f257685f;

    /* renamed from: g */
    final /* synthetic */ C92403i f257686g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92402h(C92403i iVar, String str, Account account, C66595bu buVar, C90584f fVar, C92399e eVar, boolean z) {
        super("sendEnrolmentFetcherRequestTask", 1, 12);
        this.f257686g = iVar;
        this.f257680a = str;
        this.f257681b = account;
        this.f257682c = buVar;
        this.f257683d = fVar;
        this.f257684e = eVar;
        this.f257685f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ IOException -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            r0 = 0
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.i r1 = r8.f257686g     // Catch:{ IOException -> 0x006d }
            java.lang.String r2 = r8.f257680a     // Catch:{ IOException -> 0x006d }
            android.accounts.Account r3 = r8.f257681b     // Catch:{ IOException -> 0x006d }
            com.google.speech.h.bu r4 = r8.f257682c     // Catch:{ IOException -> 0x006d }
            com.google.speech.h.a.k r2 = r1.mo87048f(r2, r3, r4, r0)     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.e r3 = r8.f257684e     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r4 = r8.f257683d     // Catch:{ IOException -> 0x006d }
            boolean r5 = r8.f257685f     // Catch:{ IOException -> 0x006d }
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f257688b     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_NULL_ENROLLMENT_FETCHER_RESPONSE     // Catch:{ IOException -> 0x006d }
            r1.mo83702b(r2)     // Catch:{ IOException -> 0x006d }
            r6 = 0
            goto L_0x0068
        L_0x001e:
            java.util.Map r2 = r1.mo87047c(r2, r3)     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.logger.b.i r3 = r1.f257688b     // Catch:{ IOException -> 0x006d }
            int r2 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92403i.m151725e(r4, r2, r3)     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r3 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ IOException -> 0x006d }
            if (r4 != r3) goto L_0x003b
            r3 = 4
            r6 = 1
            if (r5 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            r6 = 0
            goto L_0x0049
        L_0x0035:
            r7 = 3
            if (r2 == r7) goto L_0x0049
            if (r2 != r3) goto L_0x0033
            goto L_0x0049
        L_0x003b:
            com.google.common.f.e r2 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92403i.f257687a     // Catch:{ IOException -> 0x006d }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ IOException -> 0x006d }
            java.lang.String r3 = "Invalid model type-%s"
            r6 = 12512(0x30e0, float:1.7533E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56389s(r3, r4)     // Catch:{ IOException -> 0x006d }
            goto L_0x0033
        L_0x0049:
            if (r6 != 0) goto L_0x0068
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ IOException -> 0x006d }
            if (r4 == r2) goto L_0x0057
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f257688b     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_CANNOT_FAST_ENROLL_INVALID_MODEL_TYPE     // Catch:{ IOException -> 0x006d }
            r1.mo83702b(r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0068
        L_0x0057:
            if (r5 == 0) goto L_0x0061
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f257688b     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_CANNOT_FAST_ENROLL_TISID     // Catch:{ IOException -> 0x006d }
            r1.mo83702b(r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0068
        L_0x0061:
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f257688b     // Catch:{ IOException -> 0x006d }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_CANNOT_FAST_ENROLL_TDSID     // Catch:{ IOException -> 0x006d }
            r1.mo83702b(r2)     // Catch:{ IOException -> 0x006d }
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x006d }
            goto L_0x007a
        L_0x006d:
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.i r1 = r8.f257686g
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f257688b
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_IO_EXCEPTION
            r1.mo83702b(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92402h.call():java.lang.Object");
    }
}
