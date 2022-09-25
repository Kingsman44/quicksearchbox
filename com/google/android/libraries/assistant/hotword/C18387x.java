package com.google.android.libraries.assistant.hotword;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.micro.GoogleHotwordData;
import com.google.speech.micro.GoogleHotwordRecognizer;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.assistant.hotword.x */
/* compiled from: PG */
public final class C18387x {

    /* renamed from: a */
    private static final C59071e f52196a = C59071e.m91332i("com.google.android.libraries.assistant.hotword.x");

    /* renamed from: b */
    private HotwordResult f52197b = null;

    /* renamed from: c */
    private int f52198c = 0;

    /* renamed from: d */
    private int f52199d = 0;

    /* renamed from: e */
    private final int f52200e;

    /* renamed from: f */
    private final int f52201f;

    /* renamed from: g */
    private final GoogleHotwordData f52202g;

    /* renamed from: h */
    private final GoogleHotwordRecognizer f52203h;

    /* renamed from: i */
    private KeyguardManager f52204i;

    /* renamed from: j */
    private final int f52205j;

    /* renamed from: k */
    private final boolean f52206k;

    /* renamed from: l */
    private final SpeakerIdModel f52207l;

    /* renamed from: m */
    private final String f52208m;

    /* renamed from: n */
    private final Context f52209n;

    /* renamed from: o */
    private final boolean f52210o;

    /* renamed from: p */
    private final boolean f52211p;

    /* renamed from: q */
    private final long f52212q;

    public C18387x(C18386w wVar) {
        this.f52207l = wVar.mo23870f();
        this.f52200e = wVar.mo23865b();
        this.f52201f = wVar.mo23866c();
        this.f52202g = wVar.mo23871g();
        this.f52206k = wVar.mo23875j();
        this.f52203h = wVar.mo23872h();
        this.f52208m = wVar.mo23874i();
        this.f52209n = wVar.mo23868e();
        this.f52210o = wVar.mo23876k();
        this.f52211p = wVar.mo23877l();
        this.f52212q = wVar.mo23867d();
        this.f52205j = wVar.mo23864a();
    }

    /* renamed from: d */
    public static C18385v m35837d(int i, int i2, GoogleHotwordData googleHotwordData, GoogleHotwordRecognizer googleHotwordRecognizer) {
        C18372i iVar = new C18372i();
        iVar.f52125b = i;
        byte b = iVar.f52131h;
        iVar.f52126c = i2;
        iVar.f52131h = (byte) (b | 6);
        if (googleHotwordData != null) {
            iVar.f52127d = googleHotwordData;
            iVar.f52128e = googleHotwordRecognizer;
            iVar.mo23862e(true);
            iVar.mo23863f(false);
            iVar.mo23860c(0);
            iVar.f52124a = 2;
            iVar.f52131h = (byte) (1 | iVar.f52131h);
            return iVar;
        }
        throw new NullPointerException("Null hotwordData");
    }

    /* renamed from: e */
    private static GoogleHotwordRecognizer.GoogleHotwordResult.HotwordResult m35838e(GoogleHotwordRecognizer.GoogleHotwordResult.HotwordResult[] hotwordResultArr) {
        if (hotwordResultArr == null || (r0 = hotwordResultArr.length) == 0) {
            return null;
        }
        for (GoogleHotwordRecognizer.GoogleHotwordResult.HotwordResult hotwordResult : hotwordResultArr) {
            if (hotwordResult != null && hotwordResult.hotwordFired()) {
                return hotwordResult;
            }
        }
        return hotwordResultArr[0];
    }

    /* renamed from: a */
    public final HotwordResult mo23896a(InputStream inputStream, C18382s sVar, int i, int i2, int i3, int i4, int i5) {
        GoogleHotwordRecognizer.GoogleHotwordResult process = this.f52203h.process(sVar.mo23890d(), i, i2);
        int i6 = this.f52198c;
        if (i6 != 0) {
            i = i6;
        } else if (i == 0) {
            i = 0;
        }
        this.f52198c = i + i2;
        boolean hotwordDetected = process.hotwordDetected();
        if (hotwordDetected) {
            this.f52199d = 1;
        }
        if (this.f52199d == 1 && this.f52197b == null) {
            this.f52197b = mo23897b(this.f52203h, process, i5);
        }
        if (hotwordDetected) {
            byte[] e = sVar.mo23891e(i4, i2);
            if (this.f52201f != 3) {
                HotwordResult hotwordResult = this.f52197b;
                if (hotwordResult == null) {
                    return null;
                }
                C90599p n = hotwordResult.mo84696n();
                n.mo84714c(C58833ax.m90834k(e));
                n.mo84723l(this.f52198c);
                return n.mo84712a();
            }
            HotwordResult hotwordResult2 = this.f52197b;
            if (hotwordResult2 == null) {
                return null;
            }
            int i7 = (i4 * 20) / 1000;
            int i8 = i7 * 25;
            byte[] bArr = new byte[i8];
            int i9 = 0;
            while (i9 < i8) {
                int read = inputStream.read(bArr, i9, i7);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                } else if (read < 0) {
                    break;
                } else {
                    i9 += read;
                }
            }
            int length = e.length;
            byte[] bArr2 = new byte[(length + i9)];
            System.arraycopy(e, 0, bArr2, 0, length);
            System.arraycopy(bArr, 0, bArr2, length, i9);
            C90599p n2 = hotwordResult2.mo84696n();
            n2.mo84714c(C58833ax.m90834k(bArr2));
            return n2.mo84712a();
        } else if (!this.f52206k || i2 >= i3) {
            return null;
        } else {
            GoogleHotwordRecognizer.GoogleHotwordResult.HotwordResult e2 = m35838e(process.getHotwordResults());
            float hotwordScore = e2 != null ? e2.getHotwordScore() : 0.0f;
            C90599p F = HotwordResult.m147742F();
            F.mo84728q(this.f52200e);
            F.mo84719h(true);
            F.mo84731t(hotwordScore);
            F.mo84721j(this.f52205j);
            if (this.f52202g.isSpeakerVerificationEnabled()) {
                F.mo84727p(this.f52202g.maxNumImpostorAttemptsForVoiceUnlock());
            }
            return F.mo84712a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        if (r11.f52204i.isDeviceLocked() != false) goto L_0x00e9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.speech.hotword.HotwordResult mo23897b(com.google.speech.micro.GoogleHotwordRecognizer r12, com.google.speech.micro.GoogleHotwordRecognizer.GoogleHotwordResult r13, int r14) {
        /*
            r11 = this;
            com.google.speech.micro.GoogleHotwordRecognizer$GoogleHotwordResult$HotwordResult[] r0 = r13.getHotwordResults()
            com.google.speech.micro.GoogleHotwordRecognizer$GoogleHotwordResult$HotwordResult r0 = m35838e(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0020
            float r2 = r0.getHotwordScore()
            float r3 = r0.getHotwordPower()
            float r4 = r0.getBackgroundPower()
            boolean r5 = r0.hotwordLowConfidence()
            java.lang.String r0 = r0.getPhrase()
            goto L_0x0025
        L_0x0020:
            r2 = 0
            r0 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0025:
            com.google.android.apps.gsa.shared.speech.hotword.p r6 = com.google.android.apps.gsa.shared.speech.hotword.HotwordResult.m147742F()
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r8 = r6
            com.google.android.apps.gsa.shared.speech.hotword.a r8 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r8
            r8.f253212b = r7
            r6.mo84717f(r14)
            int r14 = r11.f52200e
            r6.mo84728q(r14)
            boolean r14 = r11.f52206k
            r6.mo84719h(r14)
            long r9 = r11.f52212q
            r6.mo84720i(r9)
            r14 = 1
            r6.mo84732u(r14)
            r6.mo84731t(r2)
            com.google.speech.micro.GoogleHotwordData r2 = r11.f52202g
            java.lang.String r2 = r2.getHotwordModelId()
            r8.f253211a = r2
            r6.mo84722k(r3)
            r6.mo84715d(r4)
            r6.mo84726o(r5)
            r8.f253215e = r0
            int r0 = r11.f52205j
            r6.mo84721j(r0)
            com.google.speech.micro.GoogleHotwordData r0 = r11.f52202g
            boolean r0 = r0.isSpeakerVerificationEnabled()
            if (r0 == 0) goto L_0x0072
            com.google.speech.micro.GoogleHotwordData r0 = r11.f52202g
            int r0 = r0.maxNumImpostorAttemptsForVoiceUnlock()
            r6.mo84727p(r0)
        L_0x0072:
            int r0 = r11.f52201f
            if (r0 == r14) goto L_0x0101
            r2 = 2
            if (r0 == r2) goto L_0x0083
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x0134
        L_0x007e:
            r6.mo84733v(r0)
            goto L_0x0134
        L_0x0083:
            com.google.speech.micro.GoogleHotwordRecognizer$GoogleHotwordResult$SpeakerResult r13 = r13.getSpeakerResult()
            if (r13 == 0) goto L_0x0094
            float[] r0 = r13.getSpeakerScores()
            r0 = r0[r1]
            boolean r3 = r13.isSpeakerDetected()
            goto L_0x0097
        L_0x0094:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x00fa
            boolean r3 = r11.f52210o
            if (r3 == 0) goto L_0x00e9
            android.content.Context r3 = r11.f52209n
            if (r3 != 0) goto L_0x00b2
            com.google.common.f.e r3 = f52196a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Trying to retrieve device screen lock state with a null context!"
            r5 = 47216(0xb870, float:6.6164E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            int r3 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x00c9
        L_0x00b2:
            android.app.KeyguardManager r4 = r11.f52204i
            if (r4 != 0) goto L_0x00c0
            java.lang.String r4 = "keyguard"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            r11.f52204i = r3
        L_0x00c0:
            android.app.KeyguardManager r3 = r11.f52204i
            boolean r3 = r3.isDeviceLocked()
            if (r3 == 0) goto L_0x00c9
            goto L_0x00e9
        L_0x00c9:
            boolean r3 = r13.isShouldAdapt()     // Catch:{ IllegalStateException -> 0x00e9 }
            if (r3 == 0) goto L_0x00e9
            com.google.speech.micro.GoogleHotwordRecognizer$AdaptSpeakerModelResult r12 = r12.adaptSpeakerModel(r1)
            byte[] r12 = r12.getSpeakerModel()
            r6.mo84730s(r14)
            if (r12 == 0) goto L_0x00e9
            boolean r1 = r11.f52211p
            if (r1 != 0) goto L_0x00e9
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = new com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel
            java.lang.String r3 = r11.f52208m
            r1.<init>(r3, r12)
            r8.f253214d = r1
        L_0x00e9:
            r6.mo84733v(r2)
            r6.mo84735x(r14)
            boolean r12 = r13.isAuthenticated()
            r6.mo84736y(r12)
            r6.mo84734w(r0)
            goto L_0x0134
        L_0x00fa:
            r6.mo84733v(r2)
            r6.mo84734w(r0)
            goto L_0x0134
        L_0x0101:
            boolean r13 = r11.f52210o
            if (r13 == 0) goto L_0x0131
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r13 = r11.f52207l
            if (r13 != 0) goto L_0x011e
            byte[] r12 = r12.newSpeakerFromProcessedAudio()     // Catch:{ UnsupportedOperationException -> 0x010e }
            goto L_0x0126
        L_0x010e:
            r12 = move-exception
            com.google.common.f.e r13 = f52196a
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r14 = "Exception from newSpeakerFromProcessedAudio"
            r0 = 47207(0xb867, float:6.6151E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r12)).mo56372aa(r0)).mo56386p(r14)
            throw r12
        L_0x011e:
            com.google.speech.micro.GoogleHotwordRecognizer$AdaptSpeakerModelResult r12 = r12.adaptSpeakerModel(r1)
            byte[] r12 = r12.getSpeakerModel()
        L_0x0126:
            if (r12 == 0) goto L_0x0131
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r13 = new com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel
            java.lang.String r0 = r11.f52208m
            r13.<init>(r0, r12)
            r8.f253214d = r13
        L_0x0131:
            r6.mo84733v(r14)
        L_0x0134:
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r12 = r6.mo84712a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18387x.mo23897b(com.google.speech.micro.GoogleHotwordRecognizer, com.google.speech.micro.GoogleHotwordRecognizer$GoogleHotwordResult, int):com.google.android.apps.gsa.shared.speech.hotword.HotwordResult");
    }

    /* renamed from: c */
    public final void mo23898c() {
        GoogleHotwordRecognizer googleHotwordRecognizer = this.f52203h;
        if (googleHotwordRecognizer != null) {
            try {
                googleHotwordRecognizer.close();
            } catch (UnsatisfiedLinkError e) {
                ((C59052c) ((C59052c) ((C59052c) f52196a.mo56226d()).mo56382g(e)).mo56372aa(47214)).mo56386p("UnsatisfiedLinkError on close.");
                int i = C90755l.f253831a;
            }
        }
    }
}
