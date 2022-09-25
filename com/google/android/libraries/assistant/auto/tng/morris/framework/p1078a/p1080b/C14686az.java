package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import android.media.Ringtone;
import android.provider.Telephony;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14157a;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14231bo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14235bs;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14347fw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14534mu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14535mv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14536mw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14579ol;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14580om;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15389q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az */
/* compiled from: PG */
public final class C14686az implements C14653a {

    /* renamed from: a */
    public static final C59071e f44351a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az");

    /* renamed from: b */
    public final C14157a f44352b;

    /* renamed from: c */
    public final Context f44353c;

    /* renamed from: d */
    public final C86124t f44354d;

    /* renamed from: e */
    public final C14685ay f44355e = new C14685ay();

    /* renamed from: f */
    public final C21370a f44356f;

    /* renamed from: g */
    public final Executor f44357g;

    /* renamed from: h */
    public Optional f44358h = Optional.empty();

    /* renamed from: i */
    public Optional f44359i = Optional.empty();

    /* renamed from: j */
    public boolean f44360j = false;

    /* renamed from: k */
    public boolean f44361k = false;

    /* renamed from: l */
    public boolean f44362l = false;

    /* renamed from: m */
    final String f44363m;

    /* renamed from: n */
    public Ringtone f44364n = null;

    /* renamed from: o */
    public Optional f44365o = Optional.empty();

    /* renamed from: p */
    private final Executor f44366p;

    public C14686az(C14157a aVar, Context context, C60887da daVar, C60888db dbVar, C86124t tVar, C21370a aVar2) {
        this.f44352b = aVar;
        this.f44353c = context;
        this.f44354d = tVar;
        this.f44356f = aVar2;
        this.f44363m = Telephony.Sms.getDefaultSmsPackage(context);
        this.f44357g = daVar;
        this.f44366p = dbVar;
    }

    /* renamed from: k */
    public static C14348fx m30815k(C14187c cVar, Context context) {
        C14347fw fwVar = (C14347fw) C14348fx.f43414h.createBuilder();
        String e = cVar.mo21517e();
        fwVar.copyOnWrite();
        e.getClass();
        ((C14348fx) fwVar.instance).f43416a = e;
        long b = cVar.mo21514b();
        fwVar.copyOnWrite();
        ((C14348fx) fwVar.instance).f43417b = b;
        int a = cVar.mo21513a();
        fwVar.copyOnWrite();
        ((C14348fx) fwVar.instance).f43421f = a;
        String h = cVar.mo21520h();
        fwVar.copyOnWrite();
        h.getClass();
        ((C14348fx) fwVar.instance).f43418c = h;
        Optional d = cVar.mo21516d(context);
        Objects.requireNonNull(fwVar);
        d.ifPresent(new C14681au(fwVar));
        return (C14348fx) fwVar.build();
    }

    /* renamed from: n */
    public static void m30816n(C14749d dVar) {
        C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
        C14534mu muVar = (C14534mu) C14536mw.f43962l.createBuilder();
        muVar.copyOnWrite();
        ((C14536mw) muVar.instance).f43964a = C14535mv.m30635b(6);
        baVar.copyOnWrite();
        C14219bc bcVar = (C14219bc) baVar.instance;
        C14536mw mwVar = (C14536mw) muVar.build();
        mwVar.getClass();
        bcVar.f43039b = mwVar;
        bcVar.f43038a = 4;
        dVar.mo21716c((C14219bc) baVar.build());
    }

    /* renamed from: o */
    public static void m30817o(C14749d dVar, C14533mt mtVar) {
        dVar.mo21716c(C14984b.m31503a(mtVar));
    }

    /* renamed from: q */
    public static void m30818q(C51805du duVar, C60214n nVar, C14749d dVar, boolean z, C14533mt mtVar, Duration duration) {
        dVar.mo21716c(C14984b.m31504b(duVar, nVar, "and.opa.morris.message", z, mtVar, duration));
    }

    /* renamed from: w */
    public static boolean m30819w(C14324f fVar) {
        C0027c a = C0027c.m9a(fVar.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a == C0027c.DRIVING_SCREEN) {
            return true;
        }
        C0027c a2 = C0027c.m9a(fVar.f43332a);
        if (a2 == null) {
            a2 = C0027c.UNRECOGNIZED;
        }
        return a2 == C0027c.MICRO || C14983a.m31501c(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44358h = Optional.empty();
        this.f44359i = Optional.empty();
        this.f44355e.mo21652a();
        this.f44360j = false;
        this.f44361k = false;
        this.f44362l = false;
        this.f44365o = Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C14239bw mo21654f(C14749d dVar) {
        C14239bw bwVar;
        Optional a = dVar.mo21714a(C14984b.m31508f());
        if (a.isEmpty()) {
            C59104x c = f44351a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(45392)).mo56386p("Failed to retrieve driving settings response");
            return C14239bw.f43093c;
        } else if (((C14221be) a.get()).f43043a == 13) {
            C14221be beVar = (C14221be) a.get();
            if (beVar.f43043a == 13) {
                bwVar = (C14239bw) beVar.f43044b;
            } else {
                bwVar = C14239bw.f43093c;
            }
            this.f44365o = Optional.m71637of(bwVar);
            C14221be beVar2 = (C14221be) a.get();
            if (beVar2.f43043a == 13) {
                return (C14239bw) beVar2.f43044b;
            }
            return C14239bw.f43093c;
        } else {
            C59104x c2 = f44351a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(45391)).mo56386p("DataSourceResponse does not have DrivingSettingsDataResponse");
            return C14239bw.f43093c;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14427iv ivVar;
        Optional optional;
        C14496lj ljVar;
        int i = 5;
        if (lfVar.f43800c == 5) {
            ivVar = (C14427iv) lfVar.f43801d;
        } else {
            ivVar = C14427iv.f43643o;
        }
        C58976aa aaVar = C58975e.f156826a;
        switch (ivVar.f43645a) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case -1:
            case 0:
                return false;
            case 1:
                if (this.f44352b.mo21499y(ivVar.f43646b)) {
                    C52686as m = mo21656m(dVar);
                    if (m.f138300h) {
                        Optional k = this.f44352b.mo21485k();
                        if (k.isPresent() && this.f44359i.isEmpty()) {
                            if (mo21660t(m, (C14187c) k.get())) {
                                optional = Optional.m71637of(C14496lj.MESSAGE_AUTO_READ_TASK);
                            } else {
                                optional = Optional.m71637of(C14496lj.INCOMING_MESSAGE_TASK);
                            }
                            this.f44359i = optional;
                        }
                        mo21659s(dVar);
                        break;
                    } else {
                        this.f44352b.mo21488n(false);
                        break;
                    }
                } else {
                    return false;
                }
            case 2:
                C60214n nVar = ivVar.f43655k;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                return mo21662v(dVar, nVar, false);
            case 3:
                if (!this.f44355e.f44345c.isEmpty()) {
                    m30817o(dVar, C14533mt.CANCEL_ON_MESSAGE);
                    m30818q((C51805du) this.f44355e.f44345c.get(), C60214n.f162914g, dVar, true, C14533mt.STARTUP_ON_GENERIC_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
                    this.f44358h = Optional.m71637of(C14496lj.MESSAGE_COMPOSE_TASK);
                    break;
                } else {
                    C59104x c = f44351a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
                    ((C59052c) ((C59052c) c).mo56372aa(45407)).mo56386p("#onUserTriggeredChangeMessage(): Missing ClientInput for change message.");
                    return false;
                }
            case 4:
                if (!this.f44355e.f44346d.isEmpty()) {
                    m30817o(dVar, C14533mt.CANCEL_ON_MESSAGE);
                    m30818q((C51805du) this.f44355e.f44346d.get(), C60214n.f162914g, dVar, true, C14533mt.STARTUP_ON_SEND_MESSAGE_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
                    this.f44358h = Optional.empty();
                    break;
                } else {
                    C59104x c2 = f44351a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
                    ((C59052c) ((C59052c) c2).mo56372aa(45410)).mo56386p("#onUserTriggeredSendMessage(): Missing ClientInput for sending message.");
                    return false;
                }
            case 5:
            case 18:
            case 21:
                this.f44358h = Optional.empty();
                this.f44355e.mo21652a();
                return true;
            case 6:
                if (!ivVar.f43649e) {
                    if (!this.f44355e.f44347e.isEmpty()) {
                        this.f44361k = false;
                        m30817o(dVar, C14533mt.CANCEL_ON_MESSAGE);
                        m30818q((C51805du) this.f44355e.f44347e.get(), C60214n.f162914g, dVar, true, C14533mt.STARTUP_ON_SEND_MESSAGE_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
                        this.f44358h = Optional.m71637of(C14496lj.MESSAGE_COMPOSE_TASK);
                        break;
                    } else {
                        C59104x c3 = f44351a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
                        ((C59052c) ((C59052c) c3).mo56372aa(45409)).mo56386p("#onUserTriggeredReplyMessage(): Missing ClientInput for Reply message.");
                        return false;
                    }
                } else {
                    long j = ivVar.f43646b;
                    this.f44352b.mo21488n(false);
                    if (this.f44352b.mo21494t(j)) {
                        C14187c cVar = (C14187c) this.f44352b.mo21485k().orElse(null);
                        if (cVar != null) {
                            if (this.f44354d.mo79746e(C90051dc.f248842ax)) {
                                dVar.mo21716c(C14984b.m31514l());
                            }
                            this.f44360j = true;
                            C60870cx o = cVar.mo21527o(this.f44354d.mo79746e(C90025cd.f248154l));
                            C14680at atVar = C14680at.f44337a;
                            C14749d dVar2 = dVar;
                            mo21658r(C60922j.m93044g(o, C47810es.m84963c(atVar), this.f44357g), C60214n.f162914g, dVar2, true, C14533mt.STARTUP_ON_GENERIC_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
                            this.f44358h = Optional.m71637of(C14496lj.MESSAGE_COMPOSE_TASK);
                            break;
                        } else {
                            C59104x c4 = f44351a.mo56225c();
                            c4.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
                            ((C59052c) ((C59052c) c4).mo56372aa(45408)).mo56386p("No active incoming messages to reply");
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            case 7:
                this.f44355e.mo21652a();
                this.f44358h = Optional.empty();
                m30816n(dVar);
                m30817o(dVar, C14533mt.CANCEL_ON_MESSAGE);
                return true;
            case 8:
                return mo21661u(ivVar.f43648d, false, dVar);
            case 9:
                if (this.f44360j) {
                    this.f44352b.mo21492r();
                }
                this.f44358h = Optional.m71637of(C14496lj.MESSAGE_SENT_TASK);
                this.f44355e.mo21652a();
                break;
            case 10:
                this.f44358h = Optional.m71637of(C14496lj.MESSAGE_COMPOSE_TASK);
                this.f44355e.mo21653b(ivVar);
                return true;
            case 11:
                this.f44358h = Optional.m71637of(C14496lj.MESSAGE_CONFIRM_TASK);
                this.f44355e.mo21653b(ivVar);
                return true;
            case 12:
                this.f44352b.mo21488n(false);
                this.f44352b.mo21493s(ivVar.f43646b);
                return mo21662v(dVar, C60214n.f162914g, false);
            case 13:
                boolean z = this.f44352b.mo21500z(ivVar.f43653i);
                mo21659s(dVar);
                return z;
            case 14:
                if (this.f44360j) {
                    this.f44352b.mo21490p();
                }
                if (this.f44361k) {
                    ljVar = C14496lj.MESSAGE_READ_TASK;
                } else {
                    ljVar = C14496lj.MESSAGE_REPLY_TASK;
                }
                this.f44358h = Optional.m71637of(ljVar);
                this.f44355e.mo21652a();
                this.f44355e.mo21653b(ivVar);
                break;
            case 15:
                if (!this.f44362l) {
                    boolean z2 = this.f44360j;
                    if (z2) {
                        z2 = mo21661u(true, true, dVar);
                    }
                    mo21659s(dVar);
                    if (this.f44354d.mo79746e(C90051dc.f248842ax)) {
                        C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
                        C14534mu muVar = (C14534mu) C14536mw.f43962l.createBuilder();
                        muVar.copyOnWrite();
                        ((C14536mw) muVar.instance).f43964a = C14535mv.m30635b(14);
                        baVar.copyOnWrite();
                        C14219bc bcVar = (C14219bc) baVar.instance;
                        C14536mw mwVar = (C14536mw) muVar.build();
                        mwVar.getClass();
                        bcVar.f43039b = mwVar;
                        bcVar.f43038a = 4;
                        dVar.mo21716c((C14219bc) baVar.build());
                    }
                    if (this.f44361k && this.f44355e.f44347e.isPresent()) {
                        this.f44358h = Optional.m71637of(C14496lj.MESSAGE_AUTO_DISMISS_REPLY_TASK);
                        this.f44361k = false;
                        break;
                    } else {
                        if (!this.f44358h.isEmpty()) {
                            this.f44355e.mo21652a();
                            if (!((C14496lj) this.f44358h.get()).equals(C14496lj.MESSAGE_SENT_TASK)) {
                                this.f44358h = Optional.empty();
                                break;
                            }
                        }
                        return z2;
                    }
                } else {
                    this.f44362l = false;
                    return false;
                }
            case 16:
                this.f44360j = this.f44352b.mo21498x(ivVar.f43653i) | this.f44360j;
                return false;
            case 17:
                C60214n nVar2 = ivVar.f43655k;
                if (nVar2 == null) {
                    nVar2 = C60214n.f162914g;
                }
                return mo21662v(dVar, nVar2, true);
            case 19:
                C60214n nVar3 = ivVar.f43655k;
                if (nVar3 == null) {
                    nVar3 = C60214n.f162914g;
                }
                C60214n nVar4 = nVar3;
                if (this.f44354d.mo79746e(C90051dc.f248827ai)) {
                    Optional k2 = this.f44352b.mo21485k();
                    if (!k2.isEmpty()) {
                        this.f44359i = Optional.m71637of(C14496lj.MESSAGE_ANNOUNCE_TASK);
                        this.f44352b.mo21489o(((C14187c) k2.get()).mo21518f());
                        m30816n(dVar);
                        C60870cx o2 = ((C14187c) k2.get()).mo21527o(false);
                        C14683aw awVar = C14683aw.f44340a;
                        C14749d dVar3 = dVar;
                        mo21658r(C60922j.m93044g(o2, C47810es.m84963c(awVar), this.f44357g), nVar4, dVar3, false, C14533mt.STARTUP_ON_GENERIC_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
                        this.f44362l = true;
                        break;
                    } else {
                        C59104x c5 = f44351a.mo56225c();
                        c5.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
                        ((C59052c) ((C59052c) c5).mo56372aa(45405)).mo56386p("No active incoming message to announce.");
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                this.f44358h = Optional.m71637of(C14496lj.ONGOING_CALL_EDUCATION_MESSAGE_TASK);
                this.f44355e.mo21652a();
                return true;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        C0027c a = C0027c.m9a(fVar.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a.equals(C0027c.DRIVING_SCREEN) && !C14983a.m31501c(fVar)) {
            C14231bo boVar = (C14231bo) C14232bp.f43070d.createBuilder();
            C14542nb nbVar = C14542nb.MESSAGE;
            boVar.copyOnWrite();
            ((C14232bp) boVar.instance).f43074c = nbVar.getNumber();
            dbVar.mo21543c((C14232bp) boVar.build());
        }
        C14488lb a2 = C14488lb.m30624a(fVar.f43335d);
        if (a2 == null) {
            a2 = C14488lb.UNRECOGNIZED;
        }
        if (a2.getNumber() >= 30) {
            C58976aa aaVar = C58975e.f156826a;
            int i = fVar.f43335d;
        } else if (this.f44358h.isPresent()) {
            dbVar.mo21542b((C14496lj) this.f44358h.get());
        } else if (this.f44359i.isPresent()) {
            dbVar.mo21542b((C14496lj) this.f44359i.get());
        }
    }

    /* renamed from: j */
    public final void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
        if (ljVar.equals(C14496lj.MESSAGE_AUTO_DISMISS_REPLY_TASK)) {
            this.f44358h = Optional.empty();
            this.f44355e.mo21652a();
        }
    }

    /* renamed from: l */
    public final C14580om mo21655l(C14685ay ayVar) {
        int a;
        C14579ol olVar = (C14579ol) C14580om.f44082d.createBuilder();
        String str = (String) ayVar.f44343a.get();
        olVar.copyOnWrite();
        str.getClass();
        ((C14580om) olVar.instance).f44084a = str;
        if (ayVar.f44344b.isPresent()) {
            C51012dc dcVar = (C51012dc) ayVar.f44344b.get();
            if ((dcVar.f132815a & 2) != 0 && ((a = C51014de.m86008a(dcVar.f132816b)) == 0 || a == 1)) {
                String str2 = dcVar.f132817c;
                olVar.copyOnWrite();
                str2.getClass();
                ((C14580om) olVar.instance).f44085b = str2;
            }
            C51012dc dcVar2 = dcVar.f132823i;
            if (((dcVar2 == null ? C51012dc.f132813k : dcVar2).f132815a & 32) != 0) {
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                String str3 = dcVar2.f132821g;
                olVar.copyOnWrite();
                str3.getClass();
                ((C14580om) olVar.instance).f44086c = str3;
            } else if ((dcVar.f132815a & 1024) != 0) {
                String str4 = this.f44363m;
                olVar.copyOnWrite();
                str4.getClass();
                ((C14580om) olVar.instance).f44086c = str4;
            }
        }
        return (C14580om) olVar.build();
    }

    /* renamed from: m */
    public final C52686as mo21656m(C14749d dVar) {
        C52686as asVar = mo21654f(dVar).f43095a;
        if (asVar != null) {
            return asVar;
        }
        C59104x c = f44351a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
        ((C59052c) ((C59052c) c).mo56372aa(45401)).mo56386p("Missing driving settings data from datasource");
        return C52686as.f138291q;
    }

    /* renamed from: p */
    public final void mo21657p() {
        C14682av avVar = new C14682av(this);
        C60856cj.m92903l(C47810es.m84977q(avVar), this.f44366p);
    }

    /* renamed from: r */
    public final void mo21658r(C60870cx cxVar, C60214n nVar, C14749d dVar, boolean z, C14533mt mtVar, Duration duration) {
        C14677aq aqVar = new C14677aq(nVar, dVar, z, mtVar, duration);
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(aqVar), this.f44357g), "Error sending client input", new Object[0]);
    }

    /* renamed from: s */
    public final void mo21659s(C14749d dVar) {
        if (this.f44354d.mo79746e(C90051dc.f248842ax)) {
            C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
            C14534mu muVar = (C14534mu) C14536mw.f43962l.createBuilder();
            muVar.copyOnWrite();
            ((C14536mw) muVar.instance).f43964a = C14535mv.m30635b(12);
            baVar.copyOnWrite();
            C14219bc bcVar = (C14219bc) baVar.instance;
            C14536mw mwVar = (C14536mw) muVar.build();
            mwVar.getClass();
            bcVar.f43039b = mwVar;
            bcVar.f43038a = 4;
            dVar.mo21716c((C14219bc) baVar.build());
        }
    }

    /* renamed from: t */
    public final boolean mo21660t(C52686as asVar, C14187c cVar) {
        if (!this.f44354d.mo79746e(C90051dc.f248770E)) {
            return false;
        }
        if (this.f44354d.mo79746e(C90051dc.f248827ai)) {
            if (C15389q.m32021a(asVar, this.f44354d) != 6) {
                return false;
            }
        } else if (!asVar.f138301i) {
            return false;
        }
        if ((!this.f44354d.mo79746e(C90051dc.f248828aj) || asVar.f138305m || !cVar.mo21525m()) && !cVar.mo21523k()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo21661u(boolean z, boolean z2, C14749d dVar) {
        Optional optional;
        this.f44360j = false;
        if (this.f44352b.mo21485k().isEmpty()) {
            return false;
        }
        boolean isPresent = this.f44359i.isPresent();
        if (!this.f44354d.mo79746e(C90051dc.f248842ax) || !z2) {
            m30816n(dVar);
        }
        this.f44352b.mo21488n(z);
        C52686as m = mo21656m(dVar);
        if (!m.f138300h) {
            this.f44359i = Optional.empty();
            return isPresent;
        }
        boolean u = this.f44352b.mo21495u();
        Optional k = this.f44352b.mo21485k();
        if (!u || !k.isPresent()) {
            this.f44359i = Optional.empty();
        } else {
            if (mo21660t(m, (C14187c) k.get())) {
                optional = Optional.m71637of(C14496lj.MESSAGE_AUTO_READ_TASK);
            } else {
                optional = Optional.m71637of(C14496lj.INCOMING_MESSAGE_TASK);
            }
            this.f44359i = optional;
        }
        if (isPresent || u) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo21662v(C14749d dVar, C60214n nVar, boolean z) {
        Optional k = this.f44352b.mo21485k();
        if (k.isEmpty()) {
            C59104x c = f44351a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(45406)).mo56386p("No active incoming messages to read");
            return false;
        }
        boolean z2 = ((C14239bw) this.f44365o.orElseGet(new C14678ar(this, dVar))).f43096b;
        if (!this.f44361k && z && !z2) {
            C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
            C14235bs bsVar = (C14235bs) C14237bu.f43088d.createBuilder();
            bsVar.copyOnWrite();
            ((C14237bu) bsVar.instance).f43090a = 3;
            bsVar.copyOnWrite();
            ((C14237bu) bsVar.instance).f43092c = true;
            baVar.copyOnWrite();
            C14219bc bcVar = (C14219bc) baVar.instance;
            C14237bu buVar = (C14237bu) bsVar.build();
            buVar.getClass();
            bcVar.f43039b = buVar;
            bcVar.f43038a = 17;
            dVar.mo21716c((C14219bc) baVar.build());
        }
        C14187c cVar = (C14187c) k.get();
        m30816n(dVar);
        if (this.f44354d.mo79746e(C90051dc.f248842ax)) {
            dVar.mo21716c(C14984b.m31514l());
        }
        C60870cx o = cVar.mo21527o(this.f44354d.mo79746e(C90025cd.f248154l));
        C14684ax axVar = new C14684ax(z, z2);
        C60214n nVar2 = nVar;
        C14749d dVar2 = dVar;
        mo21658r(C60922j.m93044g(o, C47810es.m84963c(axVar), this.f44357g), nVar2, dVar2, false, C14533mt.STARTUP_ON_GENERIC_TAP, Duration.ofNanos(this.f44356f.mo26872d()));
        this.f44358h = Optional.m71637of(C14496lj.MESSAGE_READ_TASK);
        this.f44359i = Optional.empty();
        this.f44352b.mo21491q(true);
        this.f44360j = true;
        this.f44361k = z;
        return true;
    }
}
