package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92509c;
import com.google.android.libraries.assistant.soda.C19247b;
import com.google.android.libraries.assistant.soda.C19387w;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67125lz;
import com.google.speech.p5218j.C67131me;
import com.google.speech.p5218j.C67139mm;
import com.google.speech.p5218j.C67152mz;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.q */
/* compiled from: PG */
public final /* synthetic */ class C92411q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C92413s f257711a;

    /* renamed from: b */
    public final /* synthetic */ List f257712b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f257713c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f257714d;

    /* renamed from: e */
    public final /* synthetic */ boolean f257715e;

    /* renamed from: f */
    public final /* synthetic */ int f257716f;

    public /* synthetic */ C92411q(C92413s sVar, List list, int i, C60870cx cxVar, C60870cx cxVar2, boolean z) {
        this.f257711a = sVar;
        this.f257712b = list;
        this.f257716f = i;
        this.f257713c = cxVar;
        this.f257714d = cxVar2;
        this.f257715e = z;
    }

    public final Object call() {
        C92413s sVar = this.f257711a;
        List list = this.f257712b;
        int i = this.f257716f;
        C60870cx cxVar = this.f257713c;
        C60870cx cxVar2 = this.f257714d;
        boolean z = this.f257715e;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        String a = C92509c.m152171a(sVar.f257719a.mo83863Z(), sVar.f257719a.mo83827p(), sVar.f257722d, (C29409fd) sVar.f257723e.mo27525b(), (C42813k) sVar.f257724f.mo27525b(), sVar.f257720b.mo79746e(C90082eg.f250020cd));
        C19387w B = C19247b.m36941B();
        B.mo24385z((String) ((C58833ax) C60856cj.m92909r(cxVar)).mo56109e(BuildConfig.FLAVOR));
        boolean z2 = false;
        B.mo24382w(C60790c.m92793a(sVar.f257722d.getCacheDir().getAbsolutePath(), "soda-enrollment/"));
        B.mo24376q(a);
        B.mo24372m(true);
        B.mo24381v(true);
        B.mo24363d(true);
        if (C92413s.m151756h(i) && axVar.mo56113h()) {
            B.mo24358A((String) axVar.mo56107c());
        }
        C19389y C = B.mo24527C(sVar.f257721c);
        if (!C.f54240f.mo56113h()) {
            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SODA_NOT_PRESENT);
            sVar.mo87055e("not running Soda Voice Match enrollment: SODA not present");
            return C92413s.m151754f(i);
        } else if (C.mo24536i()) {
            sVar.mo87055e("not running Soda Voice Match enrollment: SODA already in use");
            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SODA_ALREADY_IN_USE);
            return C92413s.m151754f(i);
        } else if (C.mo24530c() != C67152mz.NO_ERROR) {
            sVar.mo87055e("Not running Soda Voice Match enrollment: Soda init failed");
            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SODA_INIT_FAILED);
            return C92413s.m151754f(i);
        } else {
            C92418x xVar = (C92418x) C92419y.f257739e.createBuilder();
            boolean g = C92413s.m151755g(i);
            boolean h = C92413s.m151756h(i);
            if (g) {
                if (i == 3) {
                    z2 = true;
                }
                C67139mm c = sVar.mo87053c(C67125lz.DEFAULT_TEXT_DEPENDENT, list, C, z2);
                if (c != null) {
                    boolean z3 = c.f182499b;
                    if (z && z3) {
                        String ab = sVar.f257719a.mo83882ab();
                        if (ab == null) {
                            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_ACCOUNT_OR_RESULT);
                        } else if ((c.f182498a & 8) != 0) {
                            C67131me meVar = c.f182500c;
                            if (meVar == null) {
                                meVar = C67131me.f182477b;
                            }
                            C63088z zVar = (C63088z) Collections.unmodifiableMap(meVar.f182479a).get(sVar.f257719a.mo83886af());
                            if (zVar == null) {
                                sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_MODEL_BYTES);
                                sVar.mo87055e("TD Enrollment error - modelBytes are null during Soda enrollment");
                            } else {
                                sVar.f257719a.mo83845H(new SpeakerIdModel(ab, zVar.mo59174N()), true, EventForDump.m147676e(8, "saving hotword model generated by SODA during enrollment"));
                                z3 = true;
                            }
                        } else {
                            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_SPEAKER_MODEL);
                            sVar.mo87055e("TD Enrollment error - no sid model during Soda enrollment");
                        }
                        z3 = false;
                    }
                    xVar.copyOnWrite();
                    C92419y yVar = (C92419y) xVar.instance;
                    yVar.f257741a |= 1;
                    yVar.f257742b = z3;
                    xVar.copyOnWrite();
                    C92419y yVar2 = (C92419y) xVar.instance;
                    yVar2.f257744d = c;
                    yVar2.f257741a |= 4;
                }
            }
            ((C90548ak) sVar.f257725g.mo27525b()).mo84668b(4, EventForDump.m147676e(8, "Soda Td enrollment result:  " + ((C92419y) xVar.instance).f257742b), BuildConfig.FLAVOR);
            if (h) {
                C67139mm c2 = sVar.mo87053c(C67125lz.TEXT_INDEPENDENT, list, C, i == 3);
                boolean z4 = c2 != null && c2.f182499b;
                xVar.copyOnWrite();
                C92419y yVar3 = (C92419y) xVar.instance;
                yVar3.f257741a |= 2;
                yVar3.f257743c = z4;
            }
            C90548ak akVar = (C90548ak) sVar.f257725g.mo27525b();
            C92419y yVar4 = (C92419y) xVar.instance;
            Object obj = "not run";
            String obj2 = ((yVar4.f257741a & 1) != 0 ? Boolean.valueOf(yVar4.f257742b) : obj).toString();
            C92419y yVar5 = (C92419y) xVar.instance;
            if ((yVar5.f257741a & 2) != 0) {
                obj = Boolean.valueOf(yVar5.f257743c);
            }
            akVar.mo84668b(4, EventForDump.m147676e(8, "Soda enrollment result: TD = " + obj2 + ", TI = " + obj.toString()), BuildConfig.FLAVOR);
            C.mo24533f();
            if ((g && !((C92419y) xVar.instance).f257742b) || (h && !((C92419y) xVar.instance).f257743c)) {
                return (C92419y) xVar.build();
            }
            sVar.mo87054d(C89849ae.SODA_ENROLLMENT_SAVE_SUCCESS);
            return (C92419y) xVar.build();
        }
    }
}
