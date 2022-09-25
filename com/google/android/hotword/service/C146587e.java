package com.google.android.hotword.service;

import android.os.Binder;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.hotword.service.e */
/* compiled from: PG */
final class C146587e extends C146590h {

    /* renamed from: a */
    final /* synthetic */ HotwordService f395942a;

    public C146587e(HotwordService hotwordService) {
        this.f395942a = hotwordService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x033e A[SYNTHETIC, Splitter:B:114:0x033e] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.hotword.service.HotwordInformation mo123389a() {
        /*
            r51 = this;
            r1 = r51
            com.google.android.hotword.service.HotwordService r0 = r1.f395942a
            java.lang.String r2 = r0.f395917l
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r3 = android.os.Binder.getCallingUid()
            java.lang.String r0 = r0.getNameForUid(r3)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x001f
            com.google.android.hotword.service.HotwordService r0 = r1.f395942a
            r2 = 1640(0x668, float:2.298E-42)
            r0.mo123378d(r2)
        L_0x001f:
            com.google.android.hotword.service.HotwordService r2 = r1.f395942a
            dagger.a r0 = r2.f395911f
            java.lang.Object r0 = r0.mo27525b()
            r3 = r0
            com.google.android.apps.gsa.shared.m.b.f r3 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r3
            dagger.a r0 = r2.f395913h
            java.lang.Object r0 = r0.mo27525b()
            r4 = r0
            com.google.android.apps.gsa.speech.microdetection.a r4 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r4
            dagger.a r0 = r2.f395914i
            java.lang.Object r0 = r0.mo27525b()
            r5 = r0
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            boolean r7 = r4.mo87246t()
            boolean r0 = r4.mo87242p()
            boolean r6 = r3.mo83816e()
            r8 = 1
            if (r6 == 0) goto L_0x0057
            if (r0 != 0) goto L_0x0055
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250068e
            boolean r6 = r5.mo79746e(r6)
            if (r6 == 0) goto L_0x0057
        L_0x0055:
            r10 = 1
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            if (r10 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            boolean r6 = r3.mo83816e()
            if (r6 == 0) goto L_0x0070
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250068e
            boolean r6 = r5.mo79746e(r6)
            if (r6 == 0) goto L_0x0070
            r19 = 1
            goto L_0x0072
        L_0x0070:
            r19 = 0
        L_0x0072:
            if (r10 != 0) goto L_0x0080
            if (r0 != 0) goto L_0x0080
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250069f
            boolean r6 = r5.mo79746e(r6)
            if (r6 == 0) goto L_0x0080
            r11 = 1
            goto L_0x0081
        L_0x0080:
            r11 = r0
        L_0x0081:
            dagger.a r0 = r2.f395914i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            if (r11 == 0) goto L_0x00e2
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250069f
            boolean r6 = r0.mo79746e(r6)
            if (r6 == 0) goto L_0x00e2
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250257I
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x00a5
            android.content.SharedPreferences r0 = r2.f395919n
            java.lang.String r6 = "aae_settings_hotword_detector"
            boolean r0 = r0.getBoolean(r6, r8)
            if (r0 == 0) goto L_0x00e2
        L_0x00a5:
            dagger.a r0 = r2.f395921p
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.carassistant.e.c r0 = (com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c) r0
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f231768b
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250522t
            boolean r6 = r6.mo79746e(r12)
            if (r6 == 0) goto L_0x00be
            boolean r0 = r0.mo79346d()
            if (r0 == 0) goto L_0x00be
            goto L_0x00e2
        L_0x00be:
            dagger.a r0 = r2.f395914i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250307af
            boolean r6 = r0.mo79746e(r6)
            if (r6 != 0) goto L_0x00d6
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250508f
            boolean r6 = r0.mo79746e(r6)
            if (r6 == 0) goto L_0x00df
        L_0x00d6:
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250306ae
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r21 = 1
            goto L_0x00e4
        L_0x00e2:
            r21 = 0
        L_0x00e4:
            if (r21 == 0) goto L_0x0107
            dagger.a r0 = r2.f395922q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.v r0 = (com.google.android.apps.gsa.shared.util.C91123v) r0
            boolean r0 = r0.mo85390b()
            if (r0 == 0) goto L_0x0107
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250256H
            boolean r0 = r5.mo79746e(r0)
            if (r0 != 0) goto L_0x0107
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            java.lang.String r6 = r3.mo83863Z()
            r3.mo83832u(r0, r6)
        L_0x0107:
            java.lang.String r12 = "HotwordService"
            if (r7 == 0) goto L_0x0161
            java.lang.String r0 = r4.mo87229c()
            if (r0 == 0) goto L_0x015f
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250020cd
            boolean r13 = r5.mo79746e(r13)
            if (r13 == 0) goto L_0x015f
            boolean r13 = android.webkit.URLUtil.isValidUrl(r0)
            if (r13 == 0) goto L_0x015f
            java.lang.String r0 = r3.mo83863Z()     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r13 = r3.mo83827p()     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            dagger.a r14 = r2.f395920o     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            java.lang.Object r14 = r14.mo27525b()     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            com.google.android.libraries.mdi.download.fd r14 = (com.google.android.libraries.mdi.download.C29409fd) r14     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152173b(r0, r13, r14)     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x013c, InterruptedException -> 0x013a }
            goto L_0x015f
        L_0x013a:
            r0 = move-exception
            goto L_0x013d
        L_0x013c:
            r0 = move-exception
        L_0x013d:
            r18 = r0
            com.google.common.f.e r0 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r13 = r0.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r12)
            java.lang.String r14 = "MobileDataDownload encountered error when searching for model with locale %s and type %s! Assuming model is not downloaded."
            java.lang.String r15 = r3.mo83863Z()
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = r3.mo83827p()
            java.lang.String r16 = r0.name()
            r17 = 42153(0xa4a9, float:5.9069E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r18)).mo56372aa(r17)).mo56354G(r14, r15, r16)
            goto L_0x0178
        L_0x015f:
            r13 = r0
            goto L_0x0179
        L_0x0161:
            com.google.common.f.e r0 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r13, r12)
            java.lang.String r13 = r3.mo83863Z()
            r14 = 42150(0xa4a6, float:5.9065E-41)
            java.lang.String r15 = "language not supported! locale is %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r14)).mo56389s(r15, r13)
        L_0x0178:
            r13 = 0
        L_0x0179:
            java.lang.String r15 = r3.mo83863Z()
            dagger.a r0 = r2.f395911f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            java.lang.String r18 = r0.mo83830s()
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x021b
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            dagger.a r0 = r2.f395914i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250020cd
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x01e3
            android.net.Uri r0 = android.net.Uri.parse(r13)
            java.lang.String r6 = r0.getScheme()     // Catch:{ IOException -> 0x01c8 }
            if (r6 == 0) goto L_0x01dc
            dagger.a r6 = r2.f395924s     // Catch:{ IOException -> 0x01c8 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ IOException -> 0x01c8 }
            com.google.android.libraries.storage.a.k r6 = (com.google.android.libraries.storage.p3304a.C42813k) r6     // Catch:{ IOException -> 0x01c8 }
            boolean r0 = r6.mo45894h(r0)     // Catch:{ IOException -> 0x01c8 }
            if (r0 == 0) goto L_0x01dc
            dagger.a r0 = r2.f395924s
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.storage.a.k r0 = (com.google.android.libraries.storage.p3304a.C42813k) r0
            android.net.Uri r6 = android.net.Uri.parse(r13)
            byte[] r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152178g(r0, r6)
            goto L_0x01ed
        L_0x01c8:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r9, r12)
            java.lang.String r9 = "modelLocation was not a valid Mobstore URI! Will try using this as an asset filepath, but hotword model may break. Did MDD delete this model?"
            r8 = 42162(0xa4b2, float:5.9082E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r8)).mo56386p(r9)
        L_0x01dc:
            android.content.Context r0 = r2.f395925t
            byte[] r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152179h(r0, r13)
            goto L_0x01ed
        L_0x01e3:
            android.content.Context r0 = r2.f395925t
            com.google.android.apps.gsa.shared.speech.hotword.a.f r6 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152172a(r18)
            byte[] r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152177f(r0, r13, r15, r6)
        L_0x01ed:
            r23 = r0
            if (r23 == 0) goto L_0x021b
            com.google.android.apps.gsa.speech.microdetection.a.a.a r22 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7304a.C92488a.m152144a()     // Catch:{ RuntimeException -> 0x0207 }
            r24 = 16000(0x3e80, float:2.2421E-41)
            r25 = 1
            r26 = 0
            r27 = 1
            com.google.speech.micro.GoogleHotwordData r0 = r22.mo87258b(r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x0207 }
            java.lang.String r0 = r0.getHotwordModelId()     // Catch:{ RuntimeException -> 0x0207 }
            r9 = r0
            goto L_0x021c
        L_0x0207:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r12)
            java.lang.String r8 = "Cannot create GoogleHotwordData to get hotword model id."
            r9 = 42157(0xa4ad, float:5.9075E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)
        L_0x021b:
            r9 = r14
        L_0x021c:
            com.google.common.f.e r0 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r6, r12)
            java.lang.String r6 = "Model ID: %s"
            r8 = 42151(0xa4a7, float:5.9066E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56389s(r6, r9)
            com.google.common.f.e r0 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r6, r12)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r6 = 42152(0xa4a8, float:5.9068E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            if (r13 != 0) goto L_0x0249
            r6 = 1
            goto L_0x024a
        L_0x0249:
            r6 = 0
        L_0x024a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.common.b.hd r8 = com.google.android.apps.gsa.speech.hotword.C92354c.f257487a
            java.lang.Object r8 = r8.getOrDefault(r15, r14)
            java.lang.String r14 = "hotwordModelLocation is null %b, locale is %s, re-mapped Chinese locale %s"
            r0.mo56359L(r14, r6, r15, r8)
            com.google.android.hotword.service.HotwordInformation r43 = new com.google.android.hotword.service.HotwordInformation
            boolean r8 = r3.mo83819h()
            boolean r14 = r4.mo87250x()
            boolean r4 = r4.mo87251y()
            java.lang.String r0 = r3.mo83882ab()
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r3 = r3.mo83841D(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250843j
            boolean r28 = r5.mo79746e(r0)
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249867J
            long r0 = r5.mo79743a(r0)
            int r1 = (int) r0
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250028cl
            r29 = r1
            long r0 = r5.mo79743a(r0)
            int r1 = (int) r0
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250026cj
            boolean r30 = r5.mo79746e(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249963bZ
            boolean r31 = r5.mo79746e(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249929as
            boolean r0 = r5.mo79746e(r0)
            if (r0 == 0) goto L_0x029f
            r33 = r1
            r32 = r9
            r1 = 1
            goto L_0x02f1
        L_0x029f:
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249928ar
            boolean r0 = r5.mo79746e(r0)
            if (r0 != 0) goto L_0x02ad
        L_0x02a7:
            r33 = r1
            r32 = r9
        L_0x02ab:
            r1 = 0
            goto L_0x02f1
        L_0x02ad:
            dagger.a r0 = r2.f395912g
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r6 = r0.mo56113h()
            if (r6 != 0) goto L_0x02bc
            goto L_0x02a7
        L_0x02bc:
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            com.google.android.apps.gsa.q.a.e r0 = (com.google.android.apps.gsa.p6482q.p6483a.C84232e) r0     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            com.google.common.util.concurrent.cx r0 = r0.mo77694c()     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            boolean r0 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x02d8, InterruptedException -> 0x02d6 }
            r33 = r1
            r32 = r9
            r1 = r0
            goto L_0x02f1
        L_0x02d6:
            r0 = move-exception
            goto L_0x02d9
        L_0x02d8:
            r0 = move-exception
        L_0x02d9:
            com.google.common.f.e r6 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r6 = r6.mo56226d()
            r32 = r9
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r9, r12)
            java.lang.String r9 = "Encountered error when looking up fed-hot opt-in."
            r33 = r1
            r1 = 42161(0xa4b1, float:5.908E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r1)).mo56386p(r9)
            goto L_0x02ab
        L_0x02f1:
            dagger.a r0 = r2.f395911f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            boolean r34 = r0.mo83846I()
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250020cd
            boolean r37 = r5.mo79746e(r0)
            dagger.a r0 = r2.f395911f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            int r44 = r0.mo83855R()
            dagger.a r0 = r2.f395911f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            boolean r45 = r0.mo83823l()
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249874Q
            boolean r46 = r5.mo79746e(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249875R
            boolean r47 = r5.mo79746e(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249876S
            boolean r0 = r5.mo79746e(r0)
            if (r0 != 0) goto L_0x0336
        L_0x032f:
            r48 = r1
            r20 = r3
        L_0x0333:
            r0 = 0
            goto L_0x03cd
        L_0x0336:
            int r6 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147807e(r18)
            r9 = 1
            if (r6 != r9) goto L_0x033e
            goto L_0x032f
        L_0x033e:
            dagger.a r0 = r2.f395920o     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            com.google.android.libraries.mdi.download.fd r0 = (com.google.android.libraries.mdi.download.C29409fd) r0     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152180i(r6, r15, r0)     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x0359, InterruptedException -> 0x0357 }
            r27 = r0
            r48 = r1
            r20 = r3
            goto L_0x0373
        L_0x0357:
            r0 = move-exception
            goto L_0x035a
        L_0x0359:
            r0 = move-exception
        L_0x035a:
            com.google.common.f.e r20 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r9 = r20.mo56226d()
            r48 = r1
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r1, r12)
            java.lang.String r1 = "Encountered error when searching for %s DSP model, assuming model is not downloaded."
            r20 = r3
            r3 = 42156(0xa4ac, float:5.9073E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r0)).mo56372aa(r3)).mo56389s(r1, r15)
            r27 = 0
        L_0x0373:
            if (r27 != 0) goto L_0x0380
            dagger.a r0 = r2.f395923r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.k r0 = (com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.C18365k) r0
            r0.mo23845a(r6, r15)
        L_0x0380:
            com.google.al.c.c.a.c r0 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147805c(r5)
            if (r27 == 0) goto L_0x0333
            if (r0 == 0) goto L_0x0333
            int r24 = r6 + -1
            com.google.protobuf.dn r1 = r0.f29365a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x0333
            com.google.protobuf.dn r0 = r0.f29365a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Object r0 = r0.get(r3)
            com.google.al.c.c.a.f r0 = (com.google.p395al.p408c.p414c.p415a.C8456f) r0
            if (r0 == 0) goto L_0x03b8
            int r1 = r0.f29370b
            java.lang.String r0 = r0.f29371c
            java.util.UUID r26 = java.util.UUID.fromString(r0)
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.AutoValue_DspModelInformation r0 = new com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.AutoValue_DspModelInformation
            r22 = r0
            r23 = r15
            r25 = r1
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x03cd
        L_0x03b8:
            com.google.common.f.e r0 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r12)
            java.lang.String r1 = "Obtained DPS model URI, but missing model locations."
            r3 = 42155(0xa4ab, float:5.9072E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            goto L_0x0333
        L_0x03cd:
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249863F
            boolean r1 = r5.mo79746e(r1)
            dagger.a r3 = r2.f395914i
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249868K
            boolean r3 = r3.mo79746e(r6)
            if (r3 == 0) goto L_0x03eb
            boolean r3 = r2.mo123379e()
            if (r3 == 0) goto L_0x03eb
            r3 = 1
            goto L_0x03ec
        L_0x03eb:
            r3 = 0
        L_0x03ec:
            dagger.a r6 = r2.f395914i
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r6 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r6
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249869L
            boolean r6 = r6.mo79746e(r9)
            if (r6 == 0) goto L_0x0414
            boolean r6 = r2.mo123379e()
            if (r6 != 0) goto L_0x0412
            dagger.a r2 = r2.f395914i
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250076m
            boolean r2 = r2.mo79746e(r6)
            if (r2 == 0) goto L_0x0414
        L_0x0412:
            r2 = 1
            goto L_0x0415
        L_0x0414:
            r2 = 0
        L_0x0415:
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250004cN
            r50 = r2
            r49 = r3
            long r2 = r5.mo79743a(r6)
            int r3 = (int) r2
            r35 = r3
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249911aa
            boolean r36 = r5.mo79746e(r2)
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249919ai
            boolean r38 = r5.mo79746e(r2)
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249954bQ
            long r2 = r5.mo79743a(r2)
            j$.time.Duration r39 = p3186j$.time.Duration.ofSeconds(r2)
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250761A
            boolean r40 = r5.mo79746e(r2)
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249873P
            boolean r41 = r5.mo79746e(r2)
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249915ae
            boolean r42 = r5.mo79746e(r2)
            r6 = r43
            r2 = r32
            r9 = r10
            r10 = r14
            r12 = r4
            r14 = r20
            r16 = r28
            r17 = r29
            r20 = r33
            r22 = r30
            r23 = r31
            r24 = r48
            r25 = r34
            r26 = r37
            r27 = r44
            r28 = r45
            r29 = r46
            r30 = r47
            r31 = r0
            r32 = r1
            r33 = r49
            r34 = r50
            r37 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.hotword.service.C146587e.mo123389a():com.google.android.hotword.service.HotwordInformation");
    }

    /* renamed from: b */
    public final HotwordSettings mo123390b() {
        String nameForUid = this.f395942a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (!this.f395942a.f395917l.equals(nameForUid)) {
            this.f395942a.mo123378d(1639);
        }
        if (C58879cp.m90962d(nameForUid) || !this.f395942a.f395926u.mo119084c(nameForUid)) {
            C59104x d = HotwordService.f395906a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HotwordService");
            ((C59052c) ((C59052c) d).mo56372aa(42136)).mo56389s("%s is not a first party package, no operation will be done", nameForUid);
            throw new RemoteException();
        }
        C89994f fVar = (C89994f) this.f395942a.f395911f.mo27525b();
        C92486a aVar = (C92486a) this.f395942a.f395913h.mo27525b();
        boolean t = aVar.mo87246t();
        boolean p = aVar.mo87242p();
        boolean h = fVar.mo83819h();
        boolean z = fVar.mo83816e() && p;
        return new HotwordSettings(t, h, z, aVar.mo87250x(), !z && p, aVar.mo87251y());
    }

    /* renamed from: c */
    public final String mo123391c() {
        HotwordService hotwordService = this.f395942a;
        if (!hotwordService.f395917l.equals(hotwordService.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            this.f395942a.mo123378d(1635);
        }
        String nameForUid = this.f395942a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (!C58879cp.m90962d(nameForUid) && this.f395942a.f395926u.mo119084c(nameForUid)) {
            return ((C89994f) this.f395942a.f395911f.mo27525b()).mo83863Z();
        }
        C59104x d = HotwordService.f395906a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordService");
        ((C59052c) ((C59052c) d).mo56372aa(42137)).mo56389s("%s is not a first party package, no operation will be done", nameForUid);
        throw new RemoteException();
    }

    /* renamed from: d */
    public final void mo123392d() {
        C59104x b = HotwordService.f395906a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordService");
        ((C59052c) ((C59052c) b).mo56372aa(42138)).mo56386p("regenerateSpeakerIdModel");
        HotwordService hotwordService = this.f395942a;
        if (!hotwordService.f395917l.equals(hotwordService.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            this.f395942a.mo123378d(1642);
            return;
        }
        C118522by byVar = C118522by.RESTORE_SPEAKER_MODEL;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = 5;
        ((C118561t) this.f395942a.f395918m.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00dc, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123393e(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.hotword.service.HotwordService r0 = r6.f395942a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Binder.getCallingUid()
            java.lang.String[] r0 = r0.getPackagesForUid(r1)
            int r1 = r0.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0117
            r3 = r0[r2]
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0113
            com.google.android.hotword.service.HotwordService r0 = r6.f395942a
            com.google.android.gms.common.ac r0 = r0.f395926u
            boolean r0 = r0.mo119084c(r7)
            com.google.android.hotword.service.HotwordService r1 = r6.f395942a
            java.lang.String r1 = r1.f395917l
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00dc
            r1 = 1634(0x662, float:2.29E-42)
            if (r0 == 0) goto L_0x0039
            com.google.android.hotword.service.HotwordService r0 = r6.f395942a
            r0.mo123378d(r1)
            goto L_0x00f4
        L_0x0039:
            com.google.android.hotword.service.HotwordService r8 = r6.f395942a
            dagger.a r0 = r8.f395911f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            int r2 = android.os.Binder.getCallingUid()
            java.lang.String r8 = r8.getNameForUid(r2)
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r3.f164258m = r1
            com.google.common.o.ej r1 = com.google.common.p4552o.C59753ej.f161449e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.ei r1 = (com.google.common.p4552o.C59752ei) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.common.o.ej r3 = (com.google.common.p4552o.C59753ej) r3
            int r4 = r3.f161451a
            r5 = 1
            r4 = r4 | r5
            r3.f161451a = r4
            r3.f161452b = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.ej r1 = (com.google.common.p4552o.C59753ej) r1
            r1.getClass()
            r3.f164076J = r1
            int r1 = r3.f164146b
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r3.f164146b = r1
            if (r8 != 0) goto L_0x0099
            java.lang.String r8 = "UNKNOWN"
        L_0x0099:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r3 = r1.f164199c
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r1.f164199c = r3
            r1.f164127ah = r8
            int r8 = r0.mo83855R()
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r3 = r1.f164146b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r4
            r1.f164146b = r3
            r1.f164091Y = r8
            java.lang.String r8 = r0.mo83863Z()
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r8.getClass()
            int r1 = r0.f164199c
            r1 = r1 | r5
            r0.f164199c = r1
            r0.f164092Z = r8
            com.google.protobuf.bv r8 = r2.build()
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            r0 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r8, r0, r0, r0)
            goto L_0x00de
        L_0x00dc:
            if (r0 != 0) goto L_0x00f4
        L_0x00de:
            com.google.common.f.e r8 = com.google.android.hotword.service.HotwordService.f395906a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "HotwordService"
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "%s is not a first party package, no operation will be done"
            r1 = 42140(0xa49c, float:5.9051E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56389s(r0, r7)
            return
        L_0x00f4:
            java.lang.Class<androidx.annotation.b> r0 = androidx.annotation.C0826b.class
            boolean r0 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r0)
            if (r0 == 0) goto L_0x0100
            r6.mo123394f(r7, r8)
            return
        L_0x0100:
            com.google.android.hotword.service.HotwordService r0 = r6.f395942a
            dagger.a r0 = r0.f395915j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.c.cb r0 = (com.google.android.apps.gsa.shared.util.p7159c.C90932cb) r0
            com.google.android.hotword.service.d r1 = new com.google.android.hotword.service.d
            r1.<init>(r6, r7, r8)
            r0.mo85151p(r1)
            return
        L_0x0113:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0117:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r0 = android.os.Binder.getCallingUid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = "doesn't belong to the calling UID "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r8.<init>(r7)
            goto L_0x0136
        L_0x0135:
            throw r8
        L_0x0136:
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.hotword.service.C146587e.mo123393e(java.lang.String, boolean):void");
    }

    /* renamed from: f */
    public final void mo123394f(String str, boolean z) {
        if (z) {
            this.f395942a.f395907b.add(str);
            HotwordService hotwordService = this.f395942a;
            if (!hotwordService.f395909d) {
                hotwordService.f395908c.mo81944p();
                this.f395942a.f395908c.mo81943o(true);
                this.f395942a.f395909d = true;
                return;
            }
            return;
        }
        this.f395942a.f395907b.remove(str);
        HotwordService hotwordService2 = this.f395942a;
        if (hotwordService2.f395909d && hotwordService2.f395907b.isEmpty()) {
            this.f395942a.f395908c.mo81943o(false);
            this.f395942a.f395908c.mo81948t(false);
            this.f395942a.f395909d = false;
        }
    }

    /* renamed from: g */
    public final void mo123395g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        HotwordService hotwordService = this.f395942a;
        if (hotwordService.f395917l.equals(hotwordService.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            ((C89994f) this.f395942a.f395911f.mo27525b()).mo83813b(z);
        } else {
            this.f395942a.mo123378d(1636);
        }
    }

    /* renamed from: h */
    public final void mo123396h(int i, boolean z, String str) {
        HotwordService hotwordService = this.f395942a;
        if (hotwordService.f395917l.equals(hotwordService.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89994f) this.f395942a.f395911f.mo27525b()).mo83814c(i, z, str);
            return;
        }
        this.f395942a.mo123378d(1641);
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: i */
    public final boolean mo123397i() {
        String nameForUid = this.f395942a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (!this.f395942a.f395917l.equals(nameForUid)) {
            this.f395942a.mo123378d(1638);
        }
        if (!C58879cp.m90962d(nameForUid) && this.f395942a.f395926u.mo119084c(nameForUid)) {
            return ((C89331a) this.f395942a.f395910e.mo27525b()).mo83275a(1);
        }
        C59104x d = HotwordService.f395906a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordService");
        ((C59052c) ((C59052c) d).mo56372aa(42146)).mo56389s("%s is not a first party package, no operation will be done", nameForUid);
        throw new RemoteException();
    }

    /* renamed from: j */
    public final boolean mo123398j() {
        C58976aa aaVar = C58975e.f156826a;
        HotwordService hotwordService = this.f395942a;
        if (!hotwordService.f395917l.equals(hotwordService.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            this.f395942a.mo123378d(1637);
        }
        String nameForUid = this.f395942a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (!C58879cp.m90962d(nameForUid) && this.f395942a.f395926u.mo119084c(nameForUid)) {
            return ((C92486a) this.f395942a.f395913h.mo27525b()).mo87250x();
        }
        C59104x d = HotwordService.f395906a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordService");
        ((C59052c) ((C59052c) d).mo56372aa(42148)).mo56389s("%s is not a first party package, no operation will be done", nameForUid);
        throw new RemoteException();
    }
}
