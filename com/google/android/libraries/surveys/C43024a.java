package com.google.android.libraries.surveys;

import android.accounts.Account;
import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.android.libraries.surveys.internal.p3322b.C43035b;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.android.libraries.surveys.internal.view.C43091at;
import com.google.android.libraries.surveys.internal.view.C43092au;
import com.google.android.libraries.surveys.internal.view.C43165w;
import com.google.common.p4522b.C58485gu;
import com.google.p4281bu.p4282a.C56492ac;
import com.google.p4281bu.p4282a.C56493ad;
import com.google.p4281bu.p4282a.C56498ai;
import com.google.p4281bu.p4282a.C56499aj;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.protobuf.C62963cj;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64468bb;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64469bc;
import java.util.List;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68353ab;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68356ae;

/* renamed from: com.google.android.libraries.surveys.a */
/* compiled from: PG */
public class C43024a {
    /* renamed from: a */
    public static final void m75929a(C43030g gVar) {
        String str;
        boolean z;
        boolean z2;
        C43030g gVar2 = gVar;
        C43035b bVar = C43035b.f112558a;
        C43060i iVar = new C43060i();
        synchronized (C43035b.f112559b) {
            C64468bb bbVar = (C64468bb) C64469bc.f174866f.createBuilder();
            Integer num = gVar2.f112546c;
            if (num != null) {
                int intValue = num.intValue();
                bbVar.copyOnWrite();
                C64469bc bcVar = (C64469bc) bbVar.instance;
                bcVar.f174868a |= 1;
                bcVar.f174869b = intValue;
            }
            if (C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
                C43027d dVar = gVar2.f112552i;
                int i = 0;
                if (dVar != null) {
                    C43029f fVar = C43029f.FIRST_CARD_MODAL;
                    int ordinal = dVar.ordinal();
                    int i2 = ordinal != 0 ? ordinal != 1 ? 0 : 4 : 3;
                    bbVar.copyOnWrite();
                    C64469bc bcVar2 = (C64469bc) bbVar.instance;
                    bcVar2.f174871d = i2 - 2;
                    bcVar2.f174868a |= 2;
                }
                C43029f fVar2 = gVar2.f112551h;
                if (fVar2 != null) {
                    C43027d dVar2 = C43027d.CARD;
                    int ordinal2 = fVar2.ordinal();
                    if (ordinal2 == 0) {
                        i = 4;
                    } else if (ordinal2 == 1) {
                        i = 3;
                    }
                    bbVar.copyOnWrite();
                    C64469bc bcVar3 = (C64469bc) bbVar.instance;
                    bcVar3.f174872e = i - 2;
                    bcVar3.f174868a |= 4;
                }
            }
            if (C43035b.f112559b.get()) {
                int i3 = C43066o.f112626a;
                bVar.mo46058c(C43026c.SURVEY_ALREADY_RUNNING);
                bbVar.mo59280a(8);
                bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                return;
            }
            SurveyData surveyData = gVar2.f112549f;
            if (surveyData instanceof SurveyDataImpl) {
                SurveyDataImpl surveyDataImpl = (SurveyDataImpl) surveyData;
                bVar.f112561d = surveyDataImpl;
                bVar.f112560c = gVar2.f112547d;
                Activity activity = gVar2.f112544a;
                C21370a aVar = bVar.f112565h;
                if (C43066o.m75999t(surveyDataImpl.f112643f)) {
                    Log.w("SurveyController", "Cancelling show request since SurveyData was expired.");
                    bVar.mo46058c(C43026c.SURVEY_EXPIRED);
                    bbVar.mo59280a(9);
                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                    return;
                }
                activity.getPackageName();
                if (bVar.f112567j > ((SurveyDataImpl) gVar2.f112549f).f112643f) {
                    C43054c.m75960c(C68356ae.f184697a.mo6453a().mo60348a(C43054c.f112610b));
                    Log.w("SurveyController", "Cancelling show request since SurveyData was older than oldest valid trigger request.");
                    bVar.mo46058c(C43026c.SURVEY_EXPIRED);
                    bbVar.mo59280a(9);
                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                } else if (activity.isFinishing()) {
                    Log.w("SurveyController", "Cancelling show request since activity was finishing.");
                    bVar.mo46058c(C43026c.CLIENT_ACTIVITY_WAS_FINISHING);
                    bbVar.mo59280a(4);
                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                } else if (activity.isDestroyed()) {
                    Log.w("SurveyController", "Cancelling show request since activity was destroyed.");
                    bVar.mo46058c(C43026c.CLIENT_ACTIVITY_WAS_DESTROYED);
                    bbVar.mo59280a(3);
                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                } else {
                    SurveyDataImpl surveyDataImpl2 = bVar.f112561d;
                    C56532bp bpVar = surveyDataImpl2.f112640c;
                    if (bpVar == null) {
                        Log.w("SurveyController", "Survey payload was null.");
                    } else if (bpVar.f150969e.size() == 0) {
                        Log.w("SurveyController", "Survey contains no questions. Survey trigger id: ".concat(String.valueOf(surveyDataImpl2.f112638a)));
                        if (!TextUtils.isEmpty(surveyDataImpl2.f112642e)) {
                            Log.w("SurveyController", "No survey available reason: ".concat(String.valueOf(surveyDataImpl2.f112642e)));
                        }
                        C58485gu guVar = surveyDataImpl2.f112644g;
                        if (guVar != null && !guVar.isEmpty()) {
                            Log.w("SurveyController", "Backend errors are: ".concat(String.valueOf(String.valueOf(surveyDataImpl2.f112644g))));
                        }
                    } else {
                        if (C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
                            C43027d dVar3 = gVar2.f112552i;
                            C56493ad adVar = bVar.f112561d.f112640c.f150966b;
                            if (adVar == null) {
                                adVar = C56493ad.f150888f;
                            }
                            C62963cj cjVar = new C62963cj(adVar.f150893d, C56493ad.f150887e);
                            if (dVar3 != null) {
                                C43029f fVar3 = C43029f.FIRST_CARD_MODAL;
                                int ordinal3 = dVar3.ordinal();
                                if (ordinal3 == 0) {
                                    z = cjVar.contains(C56492ac.COMPLETION_STYLE_CARD);
                                } else if (ordinal3 == 1) {
                                    z = cjVar.contains(C56492ac.COMPLETION_STYLE_TOAST);
                                }
                                if (z) {
                                    C43029f fVar4 = gVar2.f112551h;
                                    C56499aj ajVar = bVar.f112561d.f112640c.f150967c;
                                    if (ajVar == null) {
                                        ajVar = C56499aj.f150905e;
                                    }
                                    C62963cj cjVar2 = new C62963cj(ajVar.f150909c, C56499aj.f150904d);
                                    if (fVar4 != null) {
                                        int ordinal4 = fVar4.ordinal();
                                        if (ordinal4 == 0) {
                                            z2 = cjVar2.contains(C56498ai.PROMPT_STYLE_FIRST_CARD_MODAL);
                                        } else if (ordinal4 == 1) {
                                            z2 = cjVar2.contains(C56498ai.PROMPT_STYLE_FIRST_CARD_NON_MODAL);
                                        }
                                        if (z2) {
                                        }
                                    }
                                    bVar.mo46058c(C43026c.INVALID_PROMPT_STYLE);
                                    bbVar.mo59280a(11);
                                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                                    return;
                                }
                            }
                            bVar.mo46058c(C43026c.INVALID_COMPLETION_STYLE);
                            bbVar.mo59280a(10);
                            bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                            return;
                        }
                        C43035b.m75938a();
                        Account account = gVar2.f112548e;
                        if (account == null) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = account.name;
                        }
                        bVar.f112562e = str;
                        bVar.f112563f = gVar2.f112550g;
                        C56532bp bpVar2 = bVar.f112561d.f112640c;
                        Answer answer = new Answer();
                        answer.f112630b = bVar.f112562e;
                        List list = bVar.f112563f;
                        if (list != null) {
                            answer.f112631c = C43066o.m75985f(list, activity);
                        }
                        answer.f112632d = bVar.f112564g;
                        answer.f112634f = bVar.f112566i;
                        if (activity instanceof C0167am) {
                            FragmentManager jw = ((C0167am) activity).mo545jw();
                            if (jw.f634a.mo671c("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                                SurveyDataImpl surveyDataImpl3 = bVar.f112561d;
                                String str2 = surveyDataImpl3.f112638a;
                                C56565cv cvVar = surveyDataImpl3.f112641d;
                                Integer d = C43035b.m75939d(bpVar2);
                                C43027d dVar4 = gVar2.f112552i;
                                C43029f fVar5 = gVar2.f112551h;
                                String str3 = bVar.f112568k;
                                C43092au auVar = new C43092au();
                                auVar.setArguments(C43091at.m76039l(str2, bpVar2, cvVar, answer, d, dVar4, fVar5));
                                C0154a aVar2 = new C0154a(jw);
                                aVar2.mo689v(gVar2.f112545b, auVar, "com.google.android.libraries.surveys.internal.PromptDialogFragment");
                                aVar2.mo505b(true);
                            } else {
                                Log.w("SurveyController", "PromptDialog was already open, bailing out.");
                            }
                        } else {
                            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                            if (fragmentManager.findFragmentByTag("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                                SurveyDataImpl surveyDataImpl4 = bVar.f112561d;
                                String str4 = surveyDataImpl4.f112638a;
                                C56565cv cvVar2 = surveyDataImpl4.f112641d;
                                Integer d2 = C43035b.m75939d(bpVar2);
                                C43027d dVar5 = gVar2.f112552i;
                                C43029f fVar6 = gVar2.f112551h;
                                String str5 = bVar.f112568k;
                                C43165w wVar = new C43165w();
                                wVar.setArguments(C43091at.m76039l(str4, bpVar2, cvVar2, answer, d2, dVar5, fVar6));
                                fragmentManager.beginTransaction().replace(gVar2.f112545b, wVar, "com.google.android.libraries.surveys.internal.PromptDialogFragment").commitAllowingStateLoss();
                            } else {
                                Log.w("SurveyController", "PromptDialog was already open, bailing out.");
                            }
                        }
                        bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                        return;
                    }
                    bVar.mo46058c(C43026c.INVALID_SURVEY_PAYLOAD);
                    bbVar.mo59280a(7);
                    bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                }
            } else {
                bVar.mo46058c(C43026c.INVALID_SURVEY_DATA_TYPE);
                bbVar.mo59280a(6);
                bVar.mo46057b((C64469bc) bbVar.build(), iVar, gVar2.f112544a);
                throw new IllegalArgumentException("Survey data is not the correct type.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0191, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75930b(com.google.android.libraries.surveys.C43170k r10) {
        /*
            com.google.android.libraries.surveys.internal.b.b r0 = com.google.android.libraries.surveys.internal.p3322b.C43035b.f112558a
            java.lang.String r1 = r10.f112869d
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            r0.f112566i = r1
            java.lang.String r1 = r0.f112566i
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = "SurveyController"
            java.lang.String r2 = "API key was not set by the client."
            android.util.Log.e(r1, r2)
        L_0x0019:
            java.lang.String r1 = r0.f112566i
            com.google.android.libraries.surveys.internal.a.a r2 = com.google.android.libraries.surveys.internal.p3321a.C43033a.f112554a
            com.google.android.libraries.surveys.internal.d.a.g r2 = r2.f112556c
            android.content.Context r3 = r10.f112866a
            java.lang.String r4 = r10.f112867b
            android.accounts.Account r5 = r10.f112870e
            if (r5 != 0) goto L_0x002a
            java.lang.String r5 = ""
            goto L_0x002c
        L_0x002a:
            java.lang.String r5 = r5.name
        L_0x002c:
            com.google.android.libraries.surveys.internal.d.b.e r1 = r2.mo46066a(r3, r4, r5, r1)
            com.google.android.libraries.surveys.j r2 = r10.f112868c
            r3 = r1
            com.google.android.libraries.surveys.internal.d.a.f r3 = (com.google.android.libraries.surveys.internal.p3325d.p3326a.C43043f) r3
            r3.f112603e = r2
            com.google.android.libraries.surveys.internal.e.i r2 = new com.google.android.libraries.surveys.internal.e.i
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.android.libraries.surveys.internal.p3322b.C43035b.f112559b
            monitor-enter(r3)
            java.lang.String r4 = r10.f112867b     // Catch:{ all -> 0x0192 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x0057
            java.lang.String r0 = "SurveyController"
            java.lang.String r1 = "No trigger ID set, ignoring show request."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0192 }
            com.google.android.libraries.surveys.j r10 = r10.f112868c     // Catch:{ all -> 0x0192 }
            if (r10 == 0) goto L_0x0055
            r10.mo33738b()     // Catch:{ all -> 0x0192 }
        L_0x0055:
            monitor-exit(r3)     // Catch:{ all -> 0x0192 }
            return
        L_0x0057:
            com.google.android.libraries.f.a r4 = r0.f112565h     // Catch:{ all -> 0x0192 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0192 }
            r0.f112564g = r4     // Catch:{ all -> 0x0192 }
            com.google.bu.a.de r0 = com.google.p4281bu.p4282a.C56575de.f151056d     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x0192 }
            com.google.bu.a.dd r0 = (com.google.p4281bu.p4282a.C56574dd) r0     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = r10.f112867b     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.bu.a.de r5 = (com.google.p4281bu.p4282a.C56575de) r5     // Catch:{ all -> 0x0192 }
            r4.getClass()     // Catch:{ all -> 0x0192 }
            r5.f151058a = r4     // Catch:{ all -> 0x0192 }
            android.content.Context r4 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b     // Catch:{ all -> 0x0192 }
            e.a.a.ag.a.ak r5 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68362ak.f184703a     // Catch:{ all -> 0x0192 }
            e.a.a.ag.a.al r5 = r5.mo6453a()     // Catch:{ all -> 0x0192 }
            boolean r4 = r5.mo60354c(r4)     // Catch:{ all -> 0x0192 }
            com.google.android.libraries.surveys.internal.p3328e.C43054c.m75960c(r4)     // Catch:{ all -> 0x0192 }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = r4.getLanguage()     // Catch:{ all -> 0x0192 }
            android.content.Context r5 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b     // Catch:{ all -> 0x0192 }
            boolean r5 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y.m98797c(r5)     // Catch:{ all -> 0x0192 }
            boolean r5 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75959b(r5)     // Catch:{ all -> 0x0192 }
            if (r5 == 0) goto L_0x00a0
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = r4.toLanguageTag()     // Catch:{ all -> 0x0192 }
        L_0x00a0:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.bu.a.de r5 = (com.google.p4281bu.p4282a.C56575de) r5     // Catch:{ all -> 0x0192 }
            com.google.protobuf.cq r6 = r5.f151059b     // Catch:{ all -> 0x0192 }
            boolean r7 = r6.mo58948c()     // Catch:{ all -> 0x0192 }
            if (r7 != 0) goto L_0x00b9
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)     // Catch:{ all -> 0x0192 }
            r5.f151059b = r6     // Catch:{ all -> 0x0192 }
        L_0x00b9:
            com.google.protobuf.cq r5 = r5.f151059b     // Catch:{ all -> 0x0192 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)     // Catch:{ all -> 0x0192 }
            boolean r4 = r10.f112871f     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.bu.a.de r5 = (com.google.p4281bu.p4282a.C56575de) r5     // Catch:{ all -> 0x0192 }
            r5.f151060c = r4     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0192 }
            com.google.bu.a.de r0 = (com.google.p4281bu.p4282a.C56575de) r0     // Catch:{ all -> 0x0192 }
            android.content.Context r4 = r10.f112866a     // Catch:{ all -> 0x0192 }
            com.google.bu.a.z r4 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75984e(r4)     // Catch:{ all -> 0x0192 }
            com.google.bu.a.f r5 = com.google.p4281bu.p4282a.C56580f.f151065c     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0192 }
            com.google.bu.a.e r5 = (com.google.p4281bu.p4282a.C56579e) r5     // Catch:{ all -> 0x0192 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x0192 }
            com.google.bu.a.f r6 = (com.google.p4281bu.p4282a.C56580f) r6     // Catch:{ all -> 0x0192 }
            r0.getClass()     // Catch:{ all -> 0x0192 }
            r6.f151067a = r0     // Catch:{ all -> 0x0192 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x0192 }
            com.google.bu.a.f r0 = (com.google.p4281bu.p4282a.C56580f) r0     // Catch:{ all -> 0x0192 }
            r4.getClass()     // Catch:{ all -> 0x0192 }
            r0.f151068b = r4     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r0 = r5.build()     // Catch:{ all -> 0x0192 }
            com.google.bu.a.f r0 = (com.google.p4281bu.p4282a.C56580f) r0     // Catch:{ all -> 0x0192 }
            com.google.android.libraries.surveys.internal.e.i r4 = new com.google.android.libraries.surveys.internal.e.i     // Catch:{ all -> 0x0192 }
            r4.<init>()     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "NetworkCallerGrpc"
            java.lang.String r1 = "Survey trigger request was null"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0192 }
            goto L_0x0118
        L_0x010a:
            java.util.concurrent.Executor r5 = com.google.android.libraries.surveys.internal.p3325d.C43051c.m75956a()     // Catch:{ all -> 0x0192 }
            com.google.android.libraries.surveys.internal.d.a.b r6 = new com.google.android.libraries.surveys.internal.d.a.b     // Catch:{ all -> 0x0192 }
            com.google.android.libraries.surveys.internal.d.a.f r1 = (com.google.android.libraries.surveys.internal.p3325d.p3326a.C43043f) r1     // Catch:{ all -> 0x0192 }
            r6.<init>(r1, r0, r4)     // Catch:{ all -> 0x0192 }
            r5.execute(r6)     // Catch:{ all -> 0x0192 }
        L_0x0118:
            com.google.protos.be.a.a.a.bg r0 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64473bg.f174875d     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bf r0 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64472bf) r0     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = r10.f112867b     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bg r4 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64473bg) r4     // Catch:{ all -> 0x0192 }
            r1.getClass()     // Catch:{ all -> 0x0192 }
            r4.f174877a = r1     // Catch:{ all -> 0x0192 }
            boolean r1 = r10.f112871f     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bg r4 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64473bg) r4     // Catch:{ all -> 0x0192 }
            r4.f174878b = r1     // Catch:{ all -> 0x0192 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bg r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64473bg) r1     // Catch:{ all -> 0x0192 }
            r4 = 0
            r1.f174879c = r4     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bg r0 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64473bg) r0     // Catch:{ all -> 0x0192 }
            android.content.Context r8 = r10.f112866a     // Catch:{ all -> 0x0192 }
            android.accounts.Account r10 = r10.f112870e     // Catch:{ all -> 0x0192 }
            if (r10 != 0) goto L_0x0152
            r10 = 0
        L_0x0150:
            r9 = r10
            goto L_0x0155
        L_0x0152:
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0192 }
            goto L_0x0150
        L_0x0155:
            android.content.Context r10 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b     // Catch:{ all -> 0x0192 }
            boolean r10 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a.m98703c(r10)     // Catch:{ all -> 0x0192 }
            boolean r10 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75960c(r10)     // Catch:{ all -> 0x0192 }
            if (r10 == 0) goto L_0x0190
            com.google.android.libraries.surveys.internal.e.g r4 = com.google.android.libraries.surveys.internal.p3328e.C43058g.m75965a()     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bh r10 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh.f174880c     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.au r10 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64460au) r10     // Catch:{ all -> 0x0192 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r1 = r10.instance     // Catch:{ all -> 0x0192 }
            com.google.protos.be.a.a.a.bh r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh) r1     // Catch:{ all -> 0x0192 }
            r0.getClass()     // Catch:{ all -> 0x0192 }
            r1.f174883b = r0     // Catch:{ all -> 0x0192 }
            r0 = 3
            r1.f174882a = r0     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x0192 }
            r5 = r10
            com.google.protos.be.a.a.a.bh r5 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh) r5     // Catch:{ all -> 0x0192 }
            long r0 = r2.f112619a     // Catch:{ all -> 0x0192 }
            com.google.protobuf.fg r6 = com.google.android.libraries.surveys.internal.p3328e.C43060i.m75976b(r0)     // Catch:{ all -> 0x0192 }
            com.google.protobuf.ar r7 = r2.mo46080a()     // Catch:{ all -> 0x0192 }
            r4.mo46078c(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0192 }
        L_0x0190:
            monitor-exit(r3)     // Catch:{ all -> 0x0192 }
            return
        L_0x0192:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0192 }
            goto L_0x0196
        L_0x0195:
            throw r10
        L_0x0196:
            goto L_0x0195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.C43024a.m75930b(com.google.android.libraries.surveys.k):void");
    }
}
