package com.google.android.apps.gsa.search.core.google.p6790a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.opaonboarding.C83897bc;
import com.google.android.apps.gsa.search.core.google.p6790a.p6791a.C85776a;
import com.google.android.apps.gsa.search.core.p6491a.C84376v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3917i.p3918a.C51292ch;
import com.google.assistant.p3897e.p3917i.p3918a.C51293ci;
import com.google.assistant.p3897e.p3917i.p3918a.C51294cj;
import com.google.assistant.p3897e.p3917i.p3918a.C51295ck;
import com.google.assistant.p3897e.p3917i.p3918a.C51298cn;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51323dl;
import com.google.assistant.p3897e.p3917i.p3918a.C51325dn;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ar */
/* compiled from: PG */
public final class C85799ar {

    /* renamed from: a */
    public static final C59071e f231968a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.ar");

    /* renamed from: h */
    private static final C58495hd f231969h;

    /* renamed from: i */
    private static final C58495hd f231970i;

    /* renamed from: j */
    private static final C58495hd f231971j;

    /* renamed from: A */
    private final C68214a f231972A;

    /* renamed from: B */
    private final C68214a f231973B;

    /* renamed from: C */
    private final C68214a f231974C;

    /* renamed from: D */
    private final C68214a f231975D;

    /* renamed from: E */
    private final C68214a f231976E;

    /* renamed from: F */
    private final C68214a f231977F;

    /* renamed from: G */
    private final C22871g f231978G;

    /* renamed from: H */
    private final C58833ax f231979H;

    /* renamed from: I */
    private final C68214a f231980I;

    /* renamed from: J */
    private final C68214a f231981J;

    /* renamed from: K */
    private final C90851k f231982K;

    /* renamed from: b */
    public final C86124t f231983b;

    /* renamed from: c */
    public final C68214a f231984c;

    /* renamed from: d */
    public final C85817bi f231985d;

    /* renamed from: e */
    public final C22871g f231986e;

    /* renamed from: f */
    public final C68214a f231987f;

    /* renamed from: g */
    public final C68214a f231988g;

    /* renamed from: k */
    private final C68214a f231989k;

    /* renamed from: l */
    private final C68214a f231990l;

    /* renamed from: m */
    private final C68214a f231991m;

    /* renamed from: n */
    private final C68214a f231992n;

    /* renamed from: o */
    private final C68214a f231993o;

    /* renamed from: p */
    private final C68214a f231994p;

    /* renamed from: q */
    private final C68214a f231995q;

    /* renamed from: r */
    private final Context f231996r;

    /* renamed from: s */
    private final SharedPreferences f231997s;

    /* renamed from: t */
    private final boolean f231998t;

    /* renamed from: u */
    private final C68214a f231999u;

    /* renamed from: v */
    private final C85805ax f232000v;

    /* renamed from: w */
    private final C83897bc f232001w;

    /* renamed from: x */
    private final C58833ax f232002x;

    /* renamed from: y */
    private final C58833ax f232003y;

    /* renamed from: z */
    private final C58833ax f232004z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("android.permission.READ_CONTACTS", C51298cn.READ_CONTACTS);
        gzVar.mo55429h("android.permission.CALL_PHONE", C51298cn.CALL_PHONE);
        gzVar.mo55429h("android.permission.CALL_PRIVILEGED", C51298cn.CALL_PRIVILEGED);
        gzVar.mo55429h("android.permission.READ_CALL_LOG", C51298cn.READ_CALL_LOG);
        gzVar.mo55429h("android.permission.SEND_SMS", C51298cn.SEND_SMS);
        gzVar.mo55429h("android.permission.READ_SMS", C51298cn.READ_SMS);
        f231969h = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(0, C51323dl.PROJECTION_STATE_INACTIVE);
        gzVar2.mo55429h(1, C51323dl.PROJECTION_STATE_READY_TO_PROJECT);
        gzVar2.mo55429h(2, C51323dl.PROJECTION_STATE_ACTIVE_FOREGROUND);
        gzVar2.mo55429h(3, C51323dl.PROJECTION_STATE_ACTIVE_BACKGROUND);
        f231970i = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h("com.apple.carplay", C51325dn.CARPLAY);
        gzVar3.mo55429h("com.google.android-auto", C51325dn.ANDROID_AUTO);
        f231971j = gzVar3.mo55427f(false);
    }

    public C85799ar(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C86124t tVar, Context context, SharedPreferences sharedPreferences, boolean z, C68214a aVar8, C85805ax axVar, C68214a aVar9, C83897bc bcVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C68214a aVar10, C68214a aVar11, C85817bi biVar, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C22871g gVar, C22871g gVar2, C90851k kVar, C58833ax axVar5, C68214a aVar16, C68214a aVar17, C68214a aVar18, C68214a aVar19) {
        this.f231989k = aVar;
        this.f231990l = aVar2;
        this.f231991m = aVar3;
        this.f231992n = aVar4;
        this.f231993o = aVar5;
        this.f231994p = aVar6;
        this.f231995q = aVar7;
        this.f231983b = tVar;
        this.f231996r = context;
        this.f231997s = sharedPreferences;
        this.f231998t = z;
        this.f231999u = aVar8;
        this.f232000v = axVar;
        this.f231984c = aVar9;
        this.f232001w = bcVar;
        this.f232002x = axVar2;
        this.f232003y = axVar3;
        this.f232004z = axVar4;
        this.f231972A = aVar10;
        this.f231973B = aVar11;
        this.f231985d = biVar;
        this.f231974C = aVar12;
        this.f231975D = aVar13;
        this.f231976E = aVar14;
        this.f231977F = aVar15;
        this.f231978G = gVar;
        this.f231986e = gVar2;
        this.f231982K = kVar;
        this.f231979H = axVar5;
        this.f231980I = aVar16;
        this.f231987f = aVar17;
        this.f231981J = aVar18;
        this.f231988g = aVar19;
    }

    /* renamed from: c */
    private final C60870cx m137858c(C51303cs csVar, Query query) {
        boolean z = ((C89994f) this.f231984c.mo27525b()).mo83840z();
        C51331dt a = this.f231985d.mo79463a(query, false);
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar = C51334dw.f133657N;
        dwVar.f133688b |= 256;
        dwVar.f133663D = z;
        csVar.copyOnWrite();
        C51334dw dwVar2 = (C51334dw) csVar.instance;
        dwVar2.f133665F = a.f133647e;
        dwVar2.f133688b |= 1024;
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    private final void m137859d(AudioManager audioManager, C51303cs csVar) {
        BluetoothDevice remoteDevice;
        String str;
        if (!((C91077d) this.f231973B.mo27525b()).f254356c.mo85346a("android.permission.BLUETOOTH_CONNECT")) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C51294cj cjVar = (C51294cj) C51295ck.f133530b.createBuilder();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(1)) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                C51292ch chVar = (C51292ch) C51293ci.f133525d.createBuilder();
                String obj = audioDeviceInfo.getProductName().toString();
                chVar.copyOnWrite();
                C51293ci ciVar = (C51293ci) chVar.instance;
                obj.getClass();
                ciVar.f133527a |= 1;
                ciVar.f133528b = obj;
                if (BluetoothAdapter.checkBluetoothAddress(audioDeviceInfo.getAddress()) && (remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(audioDeviceInfo.getAddress())) != null) {
                    switch (remoteDevice.getBluetoothClass().getDeviceClass()) {
                        case 256:
                            str = "COMPUTER_UNCATEGORIZED";
                            break;
                        case 260:
                            str = "COMPUTER_DESKTOP";
                            break;
                        case 264:
                            str = "COMPUTER_SERVER";
                            break;
                        case 268:
                            str = "COMPUTER_LAPTOP";
                            break;
                        case 272:
                            str = "COMPUTER_HANDHELD_PC_PDA";
                            break;
                        case 276:
                            str = "COMPUTER_PALM_SIZE_PC_PDA";
                            break;
                        case 280:
                            str = "COMPUTER_WEARABLE";
                            break;
                        case 512:
                            str = "PHONE_UNCATEGORIZED";
                            break;
                        case 516:
                            str = "PHONE_CELLULAR";
                            break;
                        case 520:
                            str = "PHONE_CORDLESS";
                            break;
                        case 524:
                            str = "PHONE_SMART";
                            break;
                        case 528:
                            str = "PHONE_MODEM_OR_GATEWAY";
                            break;
                        case 532:
                            str = "PHONE_ISDN";
                            break;
                        case 1024:
                            str = "AUDIO_VIDEO_UNCATEGORIZED";
                            break;
                        case 1028:
                            str = "AUDIO_VIDEO_WEARABLE_HEADSET";
                            break;
                        case 1032:
                            str = "AUDIO_VIDEO_HANDSFREE";
                            break;
                        case 1040:
                            str = "AUDIO_VIDEO_MICROPHONE";
                            break;
                        case 1044:
                            str = "AUDIO_VIDEO_LOUDSPEAKER";
                            break;
                        case 1048:
                            str = "AUDIO_VIDEO_HEADPHONES";
                            break;
                        case 1052:
                            str = "AUDIO_VIDEO_PORTABLE_AUDIO";
                            break;
                        case 1056:
                            str = "AUDIO_VIDEO_CAR_AUDIO";
                            break;
                        case 1060:
                            str = "AUDIO_VIDEO_SET_TOP_BOX";
                            break;
                        case 1064:
                            str = "AUDIO_VIDEO_HIFI_AUDIO";
                            break;
                        case 1068:
                            str = "AUDIO_VIDEO_VCR";
                            break;
                        case 1072:
                            str = "AUDIO_VIDEO_VIDEO_CAMERA";
                            break;
                        case 1076:
                            str = "AUDIO_VIDEO_CAMCORDER";
                            break;
                        case 1080:
                            str = "AUDIO_VIDEO_VIDEO_MONITOR";
                            break;
                        case 1084:
                            str = "AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER";
                            break;
                        case 1088:
                            str = "AUDIO_VIDEO_VIDEO_CONFERENCING";
                            break;
                        case 1096:
                            str = "AUDIO_VIDEO_VIDEO_GAMING_TOY";
                            break;
                        case 1280:
                            str = "PERIPHERAL_NON_KEYBOARD_NON_POINTING";
                            break;
                        case 1344:
                            str = "PERIPHERAL_KEYBOARD";
                            break;
                        case 1408:
                            str = "PERIPHERAL_POINTING";
                            break;
                        case 1472:
                            str = "PERIPHERAL_KEYBOARD_POINTING";
                            break;
                        case 1792:
                            str = "WEARABLE_UNCATEGORIZED";
                            break;
                        case 1796:
                            str = "WEARABLE_WRIST_WATCH";
                            break;
                        case 1800:
                            str = "WEARABLE_PAGER";
                            break;
                        case 1804:
                            str = "WEARABLE_JACKET";
                            break;
                        case 1808:
                            str = "WEARABLE_HELMET";
                            break;
                        case 1812:
                            str = "WEARABLE_GLASSES";
                            break;
                        case 2048:
                            str = "TOY_UNCATEGORIZED";
                            break;
                        case 2052:
                            str = "TOY_ROBOT";
                            break;
                        case 2056:
                            str = "TOY_VEHICLE";
                            break;
                        case 2060:
                            str = "TOY_DOLL_ACTION_FIGURE";
                            break;
                        case 2064:
                            str = "TOY_CONTROLLER";
                            break;
                        case 2068:
                            str = "TOY_GAME";
                            break;
                        case 2304:
                            str = "HEALTH_UNCATEGORIZED";
                            break;
                        case 2308:
                            str = "HEALTH_BLOOD_PRESSURE";
                            break;
                        case 2312:
                            str = "HEALTH_THERMOMETER";
                            break;
                        case 2316:
                            str = "HEALTH_WEIGHING";
                            break;
                        case 2320:
                            str = "HEALTH_GLUCOSE";
                            break;
                        case 2324:
                            str = "HEALTH_PULSE_OXIMETER";
                            break;
                        case 2328:
                            str = "HEALTH_PULSE_RATE";
                            break;
                        case 2332:
                            str = "HEALTH_DATA_DISPLAY";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    chVar.copyOnWrite();
                    C51293ci ciVar2 = (C51293ci) chVar.instance;
                    ciVar2.f133527a |= 2;
                    ciVar2.f133529c = str;
                }
                C51293ci ciVar3 = (C51293ci) chVar.build();
                cjVar.copyOnWrite();
                C51295ck ckVar = (C51295ck) cjVar.instance;
                ciVar3.getClass();
                C62971cq cqVar = ckVar.f133532a;
                if (!cqVar.mo58948c()) {
                    ckVar.f133532a = C62942bv.mutableCopy(cqVar);
                }
                ckVar.f133532a.add(ciVar3);
            }
        }
        C51295ck ckVar2 = (C51295ck) cjVar.build();
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar4 = C51334dw.f133657N;
        ckVar2.getClass();
        dwVar.f133686aa = ckVar2;
        dwVar.f133689c |= 256;
    }

    /* renamed from: a */
    public final C60870cx mo79445a(Query query) {
        C60870cx cxVar;
        C51331dt dtVar;
        C51331dt dtVar2;
        C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
        ((C89994f) this.f231984c.mo27525b()).mo83839y();
        if (query.mo84464dr()) {
            C51319dh dhVar = C51319dh.SHOW_RESPONSE_TO_TRUSTED_USER_ALWAYS;
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            dwVar.f133664E = dhVar.f133616c;
            dwVar.f133688b |= 512;
        }
        if (query.mo84411cr()) {
            boolean z = !query.mo84363bw("android.opa.extra.EXTRA_BISTO_PR_DISALLOWED");
            if (z) {
                dtVar2 = C51331dt.FULLY_TRUSTED;
            } else {
                dtVar2 = C51331dt.UNTRUSTED;
            }
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            dwVar2.f133688b |= 256;
            dwVar2.f133663D = z;
            csVar.copyOnWrite();
            C51334dw dwVar3 = (C51334dw) csVar.instance;
            dwVar3.f133665F = dtVar2.f133647e;
            dwVar3.f133688b |= 1024;
            cxVar = C60866ct.f164955a;
        } else if (query.mo84324bI() && ((C89656k) this.f231972A.mo27525b()).mo83561p()) {
            boolean z2 = ((C89994f) this.f231984c.mo27525b()).mo83840z() && !query.mo84363bw("android.opa.extra.EXTRA_BISTO_PR_DISALLOWED");
            if (z2) {
                dtVar = C51331dt.FULLY_TRUSTED;
            } else {
                dtVar = C51331dt.UNTRUSTED;
            }
            csVar.copyOnWrite();
            C51334dw dwVar4 = (C51334dw) csVar.instance;
            dwVar4.f133688b |= 256;
            dwVar4.f133663D = z2;
            csVar.copyOnWrite();
            C51334dw dwVar5 = (C51334dw) csVar.instance;
            dwVar5.f133665F = dtVar.f133647e;
            dwVar5.f133688b |= 1024;
            cxVar = C60866ct.f164955a;
        } else if (query.mo84363bw("android.opa.extra.TRIGGERED_BY_HEADSET") && query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
            cxVar = m137858c(csVar, query);
        } else if (!query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA") && (query.mo84450de() || query.mo84463dq() || query.mo84363bw("android.opa.extra.TRIGGERED_BY_HEADSET"))) {
            cxVar = m137858c(csVar, query);
        } else if (this.f231983b.mo79746e(C90126fx.f251769p) && query.mo84363bw("android.opa.extra.TRIGGERED_BY_HEADSET") && query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
            C51331dt a = this.f231985d.mo79463a(query, false);
            csVar.copyOnWrite();
            C51334dw dwVar6 = (C51334dw) csVar.instance;
            dwVar6.f133688b |= 256;
            dwVar6.f133663D = true;
            csVar.copyOnWrite();
            C51334dw dwVar7 = (C51334dw) csVar.instance;
            dwVar7.f133665F = a.f133647e;
            dwVar7.f133688b |= 1024;
            cxVar = C60866ct.f164955a;
        } else if (!this.f231983b.mo79746e(C90014bt.f247391gK) || !this.f231979H.mo56113h() || !C84376v.m134658b(query)) {
            boolean A = ((C89994f) this.f231984c.mo27525b()).mo83835A();
            C51331dt a2 = this.f231985d.mo79463a(query, false);
            csVar.copyOnWrite();
            C51334dw dwVar8 = (C51334dw) csVar.instance;
            dwVar8.f133688b |= 256;
            dwVar8.f133663D = A;
            csVar.copyOnWrite();
            C51334dw dwVar9 = (C51334dw) csVar.instance;
            dwVar9.f133665F = a2.f133647e;
            dwVar9.f133688b |= 1024;
            cxVar = C60866ct.f164955a;
        } else {
            C22871g gVar = this.f231986e;
            cxVar = gVar.mo28209i(gVar.mo28209i(((C9799ae) ((C68214a) this.f231979H.mo56107c()).mo27525b()).mo18043c(), "Fill AOL in device properties.", new C85792ak(csVar)), "Fill Trust Level based on SVR and handle headset CUJs", new C85793al(this, csVar, query));
        }
        C60870cx j = this.f231978G.mo28210j(cxVar, "get dock status", new C85795an(this, csVar));
        C60870cx g = C60846c.m92878g(((C85776a) this.f231981J.mo27525b()).mo79439a(), Exception.class, C85796ao.f231961a, this.f231982K.mo85210c("get homegraph id"));
        return C60856cj.m92893b(j, g).mo57334a(new C85797ap(this, csVar, query, g), this.f231982K.mo85208a("get device properties"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0792  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x082d  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x089b  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x08fc  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x092e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0940  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x094a  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0967  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x099f  */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79446b(com.google.assistant.p3897e.p3917i.p3918a.C51303cs r24, com.google.android.apps.gsa.shared.search.Query r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "WithoutZwieback.Filler"
            dagger.a r0 = r1.f231989k
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.b r0 = (com.google.android.apps.gsa.search.core.p6805i.C86106b) r0
            java.lang.String r0 = r0.mo79727b()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            r6 = 1
            if (r5 != 0) goto L_0x0087
            com.google.assistant.e.j.rj r5 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.ri r5 = (com.google.assistant.p3897e.p3921j.C52427ri) r5
            boolean r7 = r25.mo84412cs()
            if (r7 == 0) goto L_0x005a
            com.google.assistant.e.j.rh r7 = com.google.assistant.p3897e.p3921j.C52426rh.f137553d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.rg r7 = (com.google.assistant.p3897e.p3921j.C52425rg) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.j.rh r8 = (com.google.assistant.p3897e.p3921j.C52426rh) r8
            r0.getClass()
            int r9 = r8.f137555a
            r9 = r9 | r6
            r8.f137555a = r9
            r8.f137556b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.j.rj r8 = (com.google.assistant.p3897e.p3921j.C52428rj) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.rh r7 = (com.google.assistant.p3897e.p3921j.C52426rh) r7
            r7.getClass()
            r8.f137566g = r7
            int r7 = r8.f137560a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r8.f137560a = r7
        L_0x005a:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.rj r7 = (com.google.assistant.p3897e.p3921j.C52428rj) r7
            r0.getClass()
            int r8 = r7.f137560a
            r8 = r8 | 8
            r7.f137560a = r8
            r7.f137563d = r0
            r24.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.rj r5 = (com.google.assistant.p3897e.p3921j.C52428rj) r5
            com.google.protobuf.ci r7 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            r5.getClass()
            r0.f133696j = r5
            int r5 = r0.f133685a
            r5 = r5 | 256(0x100, float:3.59E-43)
            r0.f133685a = r5
            goto L_0x00da
        L_0x0087:
            boolean r0 = r25.mo84403cj()
            if (r0 == 0) goto L_0x0097
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249691n
            boolean r0 = r0.mo79746e(r5)
            if (r0 != 0) goto L_0x00a7
        L_0x0097:
            boolean r0 = r25.mo84412cs()
            if (r0 == 0) goto L_0x00da
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250430cw
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x00da
        L_0x00a7:
            com.google.assistant.e.j.rj r0 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ri r0 = (com.google.assistant.p3897e.p3921j.C52427ri) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.rj r5 = (com.google.assistant.p3897e.p3921j.C52428rj) r5
            int r7 = r5.f137560a
            r7 = r7 | 8
            r5.f137560a = r7
            java.lang.String r7 = "android-device"
            r5.f137563d = r7
            r24.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.dw r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.rj r0 = (com.google.assistant.p3897e.p3921j.C52428rj) r0
            com.google.protobuf.ci r7 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            r0.getClass()
            r5.f133696j = r0
            int r0 = r5.f133685a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.f133685a = r0
        L_0x00da:
            dagger.a r0 = r1.f231995q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aa r0 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r0
            android.app.KeyguardManager r0 = r0.f230023b
            boolean r0 = r0.isDeviceLocked()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 == 0) goto L_0x00ef
            com.google.assistant.e.i.a.cz r0 = com.google.assistant.p3897e.p3917i.p3918a.C51310cz.DEVICE_LOCKED
            goto L_0x00f1
        L_0x00ef:
            com.google.assistant.e.i.a.cz r0 = com.google.assistant.p3897e.p3917i.p3918a.C51310cz.DEVICE_UNLOCKED
        L_0x00f1:
            r24.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.dw r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r5
            com.google.protobuf.ci r7 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            int r0 = r0.f133578d
            r5.f133705s = r0
            int r0 = r5.f133685a
            r7 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 | r7
            r5.f133685a = r0
            dagger.a r0 = r1.f231995q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aa r0 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r0
            com.google.android.apps.gsa.shared.s.a.a r5 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.app.KeyguardManager r0 = r0.f230023b     // Catch:{ all -> 0x09a3 }
            boolean r0 = r0.isKeyguardSecure()     // Catch:{ all -> 0x09a3 }
            if (r0 == 0) goto L_0x011a
            com.google.assistant.e.i.a.cx r0 = com.google.assistant.p3897e.p3917i.p3918a.C51308cx.DEVICE_LOCK_ENABLED
            goto L_0x011c
        L_0x011a:
            com.google.assistant.e.i.a.cx r0 = com.google.assistant.p3897e.p3917i.p3918a.C51308cx.DEVICE_LOCK_DISABLED
        L_0x011c:
            r24.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.dw r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r5
            int r0 = r0.f133572d
            r5.f133708v = r0
            int r0 = r5.f133685a
            r7 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r7
            r5.f133685a = r0
            dagger.a r0 = r1.f231995q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aa r0 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r0
            boolean r0 = r0.mo78228b()
            if (r0 == 0) goto L_0x013f
            com.google.assistant.e.i.a.df r0 = com.google.assistant.p3897e.p3917i.p3918a.C51317df.KEYGUARD_LOCKED
            goto L_0x0141
        L_0x013f:
            com.google.assistant.e.i.a.df r0 = com.google.assistant.p3897e.p3917i.p3918a.C51317df.KEYGUARD_UNLOCKED
        L_0x0141:
            r24.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.dw r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r5
            int r0 = r0.f133611d
            r5.f133706t = r0
            int r0 = r5.f133685a
            r8 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 | r8
            r5.f133685a = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90028cg.f248174d
            boolean r0 = r0.mo79746e(r5)
            r5 = 2
            if (r0 == 0) goto L_0x0172
            android.content.Context r0 = r1.f231996r
            boolean r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148281H(r0)
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            int r9 = r8.f133689c
            r9 = r9 | r5
            r8.f133689c = r9
            r8.f133678T = r0
        L_0x0172:
            dagger.a r0 = r1.f231980I
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.shared.h.a.fj r0 = (com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81215fj) r0
            com.google.protos.f.b.c.b r0 = r0.mo74971a()
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            int r0 = r0.getNumber()
            r8.f133682X = r0
            int r0 = r8.f133689c
            r0 = r0 | 32
            r8.f133689c = r0
            com.google.common.o.amo r0 = r3.f252760R
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90049da.f248759a
            boolean r8 = r8.mo79746e(r9)
            r9 = 16
            if (r8 == 0) goto L_0x01c2
            if (r0 == 0) goto L_0x01c2
            com.google.common.o.amo r8 = com.google.common.p4552o.amo.ANDROID_AUTO_EMBEDDED
            if (r0 != r8) goto L_0x01c2
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250428cu
            boolean r0 = r0.mo79746e(r8)
            if (r6 == r0) goto L_0x01b2
            r0 = 12
            goto L_0x01b4
        L_0x01b2:
            r0 = 16
        L_0x01b4:
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            int r10 = r8.f133688b
            r7 = r7 | r10
            r8.f133688b = r7
            r8.f133674P = r0
        L_0x01c2:
            r7 = 3
            dagger.a r0 = r1.f231974C     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            com.google.android.apps.gsa.staticplugins.actions.a.a.a r0 = (com.google.android.apps.gsa.staticplugins.actions.p7353a.p7354a.C93250a) r0     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            android.media.AudioManager r8 = r0.f260022a     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            int r8 = r8.getStreamVolume(r7)     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            double r10 = (double) r8     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            android.media.AudioManager r0 = r0.f260022a     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            int r0 = r0.getStreamMaxVolume(r7)     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            double r12 = (double) r0
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r12)
            double r10 = r10 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 * r12
            int r0 = (int) r10
            r24.copyOnWrite()     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            com.google.protobuf.bv r8 = r2.instance     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            int r10 = r8.f133685a     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            r10 = r10 | 512(0x200, float:7.175E-43)
            r8.f133685a = r10     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            r8.f133697k = r0     // Catch:{ InterruptedException -> 0x0209, TimeoutException -> 0x01f5 }
            goto L_0x0223
        L_0x01f5:
            r0 = move-exception
            com.google.common.f.e r8 = f231968a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r4)
            java.lang.String r10 = "Timed out while waiting for StreamVolumeManager"
            r11 = 7954(0x1f12, float:1.1146E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r11)).mo56386p(r10)
            goto L_0x0223
        L_0x0209:
            r0 = move-exception
            com.google.common.f.e r8 = f231968a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r4)
            java.lang.String r10 = "Interrupted while waiting for StreamVolumeManager"
            r11 = 7953(0x1f11, float:1.1145E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r11)).mo56386p(r10)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0223:
            com.google.assistant.e.j.qn r0 = com.google.assistant.p3897e.p3921j.C52405qn.f137519c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.qm r0 = (com.google.assistant.p3897e.p3921j.C52404qm) r0
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()
            java.lang.String r8 = r8.getID()
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.qn r10 = (com.google.assistant.p3897e.p3921j.C52405qn) r10
            r8.getClass()
            int r11 = r10.f137521a
            r11 = r11 | r6
            r10.f137521a = r11
            r10.f137522b = r8
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.qn r0 = (com.google.assistant.p3897e.p3921j.C52405qn) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            r0.getClass()
            r8.f133694h = r0
            int r0 = r8.f133685a
            r0 = r0 | 32
            r8.f133685a = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247444hK
            boolean r0 = r0.mo79746e(r8)
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r0 == 0) goto L_0x028c
            com.google.common.base.ax r0 = r1.f232002x
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x028c
            com.google.common.base.ax r0 = r1.f232002x
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bn r0 = (com.google.android.apps.gsa.nga.api.C74713bn) r0
            boolean r0 = r0.mo71078c()
            if (r0 == 0) goto L_0x028c
            r24.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            r0.f133670K = r5
            int r10 = r0.f133688b
            r10 = r10 | r8
            r0.f133688b = r10
        L_0x028c:
            java.lang.String r0 = "android.opa.extra.CLIENT_MODALITY_OVERRIDE"
            int r0 = r3.mo84263a(r0)
            com.google.assistant.e.i.a.cu r0 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.m86117a(r0)
            com.google.assistant.e.i.a.cu r10 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.UNKNOWN_MODALITY
            if (r0 == r10) goto L_0x02ad
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r0 = r0.f133565f
            r10.f133701o = r0
            int r0 = r10.f133685a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r10.f133685a = r0
            goto L_0x0336
        L_0x02ad:
            boolean r0 = r25.mo84420dA()
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r25.mo84399cf()
            if (r0 != 0) goto L_0x02bf
            boolean r0 = r25.mo84434dO()
            if (r0 == 0) goto L_0x02d3
        L_0x02bf:
            com.google.assistant.e.i.a.cu r0 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.VOICE_MODALITY
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r0 = r0.f133565f
            r10.f133701o = r0
            int r0 = r10.f133685a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r10.f133685a = r0
            goto L_0x0336
        L_0x02d3:
            boolean r0 = r25.mo84375cH()
            if (r0 == 0) goto L_0x02ed
            com.google.assistant.e.i.a.cu r0 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.IMAGE_TAP_LOCATION_MODALITY
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r0 = r0.f133565f
            r10.f133701o = r0
            int r0 = r10.f133685a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r10.f133685a = r0
            goto L_0x0336
        L_0x02ed:
            dagger.a r0 = r1.f231990l
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0336
            dagger.a r0 = r1.f231990l
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r0
            int r0 = r0.mo96436a()
            if (r0 == 0) goto L_0x0323
            com.google.assistant.e.i.a.cu r0 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.TYPING_MODALITY
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r0 = r0.f133565f
            r10.f133701o = r0
            int r0 = r10.f133685a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r10.f133685a = r0
            goto L_0x0336
        L_0x0323:
            com.google.assistant.e.i.a.cu r0 = com.google.assistant.p3897e.p3917i.p3918a.C51305cu.VOICE_MODALITY
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r0 = r0.f133565f
            r10.f133701o = r0
            int r0 = r10.f133685a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r10.f133685a = r0
        L_0x0336:
            dagger.a r0 = r1.f231990l
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x03a1
            dagger.a r0 = r1.f231990l
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r0
            dagger.a r10 = r0.f300687a
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r10 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r10
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247718mT
            boolean r10 = r10.mo79746e(r11)
            if (r10 == 0) goto L_0x0364
            r0 = 1
            goto L_0x0366
        L_0x0364:
            int r0 = r0.f300688b
        L_0x0366:
            com.google.assistant.e.i.a.ce r10 = com.google.assistant.p3897e.p3917i.p3918a.C51289ce.f133517c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.i.a.cc r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51287cc) r10
            if (r0 == r6) goto L_0x0376
            if (r0 == r5) goto L_0x0374
            r0 = 1
            goto L_0x0377
        L_0x0374:
            r0 = 3
            goto L_0x0377
        L_0x0376:
            r0 = 2
        L_0x0377:
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.i.a.ce r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51289ce) r11
            int r0 = r0 + -1
            r11.f133520b = r0
            int r0 = r11.f133519a
            r0 = r0 | r6
            r11.f133519a = r0
            com.google.protobuf.bv r0 = r10.build()
            com.google.assistant.e.i.a.ce r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51289ce) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            r0.getClass()
            r10.f133669J = r0
            int r0 = r10.f133688b
            r11 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r11
            r10.f133688b = r0
        L_0x03a1:
            android.content.Context r0 = r1.f231996r
            java.lang.String r10 = "audio"
            java.lang.Object r0 = r0.getSystemService(r10)
            r11 = r0
            android.media.AudioManager r11 = (android.media.AudioManager) r11
            android.content.Context r0 = r1.f231996r
            java.lang.Object r0 = r0.getSystemService(r10)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            boolean r0 = r0.isStreamMute(r7)
            r24.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.dw r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r10
            int r12 = r10.f133685a
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r10.f133685a = r12
            r10.f133699m = r0
            dagger.a r0 = r1.f231991m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            android.accounts.Account r10 = r0.mo79668a()
            if (r10 != 0) goto L_0x03d7
            r0 = 0
            goto L_0x03d9
        L_0x03d7:
            java.lang.String r0 = r10.name
        L_0x03d9:
            boolean r13 = r1.f231998t
            r14 = 131072(0x20000, float:1.83671E-40)
            r15 = 0
            if (r13 == 0) goto L_0x03f4
            com.google.assistant.e.i.a.dv r13 = com.google.assistant.p3897e.p3917i.p3918a.C51333dv.RETAIL_MODE
            r24.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.i.a.dw r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r12
            int r13 = r13.f133656g
            r12.f133703q = r13
            int r13 = r12.f133685a
            r13 = r13 | r14
            r12.f133685a = r13
            goto L_0x04c3
        L_0x03f4:
            if (r0 == 0) goto L_0x043a
            dagger.a r12 = r1.f231993o
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bg r12 = (com.google.android.apps.gsa.assistant.shared.bg) r12
            boolean r12 = r12.c(r0)
            if (r12 == 0) goto L_0x0412
            dagger.a r12 = r1.f231994p
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r12 = (com.google.android.apps.gsa.assistant.shared.bm) r12
            boolean r12 = r12.w()
            if (r12 != 0) goto L_0x0426
        L_0x0412:
            boolean r12 = r25.mo84399cf()
            if (r12 == 0) goto L_0x043a
            dagger.a r12 = r1.f231999u
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bc r12 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r12
            boolean r12 = r12.mo100628h(r0)
            if (r12 != 0) goto L_0x043a
        L_0x0426:
            com.google.assistant.e.i.a.dv r12 = com.google.assistant.p3897e.p3917i.p3918a.C51333dv.SIGNED_IN_AND_OPTED_IN
            r24.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.i.a.dw r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r13
            int r12 = r12.f133656g
            r13.f133703q = r12
            int r12 = r13.f133685a
            r12 = r12 | r14
            r13.f133685a = r12
            goto L_0x04c3
        L_0x043a:
            com.google.android.apps.gsa.search.core.i.t r12 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247318er
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x044e
            android.content.SharedPreferences r12 = r1.f231997s
            java.lang.String r13 = "opa_is_in_signed_out_mode_for_no_account"
            boolean r12 = r12.getBoolean(r13, r15)
            if (r12 != 0) goto L_0x04b1
        L_0x044e:
            com.google.android.apps.gsa.search.core.i.t r12 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247319es
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0472
            dagger.a r12 = r1.f231999u
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bc r12 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r12
            dagger.a r13 = r1.f231991m
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r13 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r13
            android.accounts.Account r13 = r13.mo79668a()
            boolean r12 = r12.mo100627g(r13)
            if (r12 != 0) goto L_0x04b1
        L_0x0472:
            dagger.a r12 = r1.f231991m
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r12 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r12
            android.accounts.Account r12 = r12.mo79668a()
            if (r12 != 0) goto L_0x048e
            dagger.a r12 = r1.f231999u
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bc r12 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r12
            boolean r12 = r12.mo100632l()
            if (r12 != 0) goto L_0x04b1
        L_0x048e:
            dagger.a r12 = r1.f231991m
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r12 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r12
            android.accounts.Account r12 = r12.mo79668a()
            if (r12 != 0) goto L_0x04a7
            com.google.android.apps.gsa.search.core.i.t r12 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250398cQ
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x04a7
            goto L_0x04b1
        L_0x04a7:
            com.google.android.apps.gsa.search.core.google.a.ax r12 = r1.f232000v
            com.google.assistant.e.i.a.db r12 = r12.mo79449a(r3)
            com.google.assistant.e.i.a.db r13 = com.google.assistant.p3897e.p3917i.p3918a.C51313db.EYES
            if (r12 != r13) goto L_0x04c3
        L_0x04b1:
            com.google.assistant.e.i.a.dv r12 = com.google.assistant.p3897e.p3917i.p3918a.C51333dv.SIGNED_OUT
            r24.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.i.a.dw r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r13
            int r12 = r12.f133656g
            r13.f133703q = r12
            int r12 = r13.f133685a
            r12 = r12 | r14
            r13.f133685a = r12
        L_0x04c3:
            boolean r12 = r25.mo84332bQ()
            if (r12 == 0) goto L_0x053d
            dagger.a r12 = r1.f231992n
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.assistant.settings.shared.ae r12 = (com.google.android.apps.gsa.assistant.settings.shared.ae) r12
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)
            java.util.Locale r0 = r12.d(r0)
            if (r0 != 0) goto L_0x04df
            java.util.Locale r0 = java.util.Locale.getDefault()
        L_0x04df:
            java.lang.String r12 = r0.getLanguage()
            r24.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.i.a.dw r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r13
            r12.getClass()
            int r14 = r13.f133685a
            r14 = r14 | r6
            r13.f133685a = r14
            r13.f133690d = r12
            java.lang.String r0 = r0.getCountry()
            r24.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.i.a.dw r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r12
            r0.getClass()
            int r13 = r12.f133685a
            r13 = r13 | r5
            r12.f133685a = r13
            r12.f133691e = r0
            boolean r0 = r25.mo84412cs()
            if (r0 == 0) goto L_0x053d
            dagger.a r0 = r1.f231977F
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.location.ae r0 = (com.google.android.apps.gsa.location.C74637ae) r0
            com.google.android.libraries.search.m.b.b r12 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_CAR_LO
            com.google.android.libraries.search.location.y r12 = com.google.android.libraries.search.location.C38726z.m68011d(r12)
            r13 = r12
            com.google.android.libraries.search.location.a r13 = (com.google.android.libraries.search.location.C38570a) r13
            r13.f101954b = r7
            com.google.android.libraries.search.location.z r12 = r12.mo41492a()
            com.google.common.util.concurrent.cx r0 = r0.mo71020c(r12)
            com.google.android.libraries.gsa.k.g r12 = r1.f231978G
            com.google.android.apps.gsa.search.core.google.a.ai r13 = new com.google.android.apps.gsa.search.core.google.a.ai
            r13.<init>(r2)
            com.google.android.apps.gsa.shared.util.c.ag r14 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r7 = "AAE get location information task"
            r14.<init>(r0, r12, r7, r13)
            com.google.android.apps.gsa.search.core.google.a.aj r0 = com.google.android.apps.gsa.search.core.google.p6790a.C85791aj.f231953a
            r14.mo85223a(r0)
        L_0x053d:
            boolean r0 = r25.mo84412cs()
            if (r0 == 0) goto L_0x062b
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250371bq
            boolean r0 = r0.mo79746e(r7)
            if (r0 != 0) goto L_0x054f
            goto L_0x05d7
        L_0x054f:
            dagger.a r0 = r1.f231975D
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.contacts.aa r0 = (com.google.android.apps.gsa.contacts.C74471aa) r0
            com.google.android.libraries.search.m.b.b r22 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_AUTO
            android.content.Context r7 = r0.f208553b
            java.lang.String r12 = "android.permission.READ_CONTACTS"
            boolean r7 = com.google.android.apps.gsa.shared.util.permissions.C91077d.m148794e(r7, r12)
            if (r7 != 0) goto L_0x0565
        L_0x0563:
            r0 = 0
            goto L_0x05c7
        L_0x0565:
            android.net.Uri r7 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.String r12 = "limit"
            java.lang.String r13 = "1"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r12, r13)
            android.net.Uri r17 = r7.build()
            com.google.android.apps.gsa.contacts.r r0 = r0.f208554c     // Catch:{ RuntimeException -> 0x059d, all -> 0x0599 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r0
            android.database.Cursor r12 = r16.b(r17, r18, r19, r20, r21, r22)     // Catch:{ RuntimeException -> 0x059d, all -> 0x0599 }
            if (r12 == 0) goto L_0x0563
            int r0 = r12.getCount()     // Catch:{ RuntimeException -> 0x0597 }
            r12.close()
            if (r0 <= 0) goto L_0x0563
            r0 = 1
            goto L_0x05c7
        L_0x0594:
            r0 = move-exception
            goto L_0x0625
        L_0x0597:
            r0 = move-exception
            goto L_0x059f
        L_0x0599:
            r0 = move-exception
            r12 = 0
            goto L_0x0625
        L_0x059d:
            r0 = move-exception
            r12 = 0
        L_0x059f:
            com.google.common.f.e r7 = com.google.android.apps.gsa.contacts.C74471aa.f208552a     // Catch:{ all -> 0x0594 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0594 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0594 }
            java.lang.String r14 = "DownloadedContacts"
            r7.mo56378ag(r13, r14)     // Catch:{ all -> 0x0594 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0594 }
            com.google.common.f.x r0 = r7.mo56382g(r0)     // Catch:{ all -> 0x0594 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0594 }
            r7 = 1947(0x79b, float:2.728E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r7)     // Catch:{ all -> 0x0594 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Could not retrieve number of contacts ..."
            r0.mo56386p(r7)     // Catch:{ all -> 0x0594 }
            if (r12 == 0) goto L_0x0563
            r12.close()
            goto L_0x0563
        L_0x05c7:
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r12 = r7.f133688b
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 | r13
            r7.f133688b = r12
            r7.f133677S = r0
        L_0x05d7:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250372br
            boolean r0 = r0.mo79746e(r7)
            if (r0 == 0) goto L_0x062b
            dagger.a r0 = r1.f231976E
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.assistant.auto.tng.common.o.a r0 = (com.google.android.libraries.assistant.auto.tng.common.p930o.C13298a) r0
            com.google.common.b.hd r7 = f231970i
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            com.google.assistant.e.i.a.dl r13 = com.google.assistant.p3897e.p3917i.p3918a.C51323dl.UNSPECIFIED_PROJECTION_STATE
            java.lang.Object r7 = r7.getOrDefault(r12, r13)
            com.google.assistant.e.i.a.dl r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51323dl) r7
            r24.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.i.a.dw r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r12
            int r7 = r7.f133626f
            r12.f133680V = r7
            int r7 = r12.f133689c
            r7 = r7 | 8
            r12.f133689c = r7
            com.google.common.b.hd r7 = f231971j
            java.lang.String r0 = r0.f41012a
            com.google.assistant.e.i.a.dn r12 = com.google.assistant.p3897e.p3917i.p3918a.C51325dn.UNSPECIFIED_TECHNOLOGY
            java.lang.Object r0 = r7.getOrDefault(r0, r12)
            com.google.assistant.e.i.a.dn r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51325dn) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133632d
            r7.f133681W = r0
            int r0 = r7.f133689c
            r0 = r0 | r9
            r7.f133689c = r0
            goto L_0x062b
        L_0x0625:
            if (r12 == 0) goto L_0x062a
            r12.close()
        L_0x062a:
            throw r0
        L_0x062b:
            com.google.android.apps.gsa.search.core.google.a.ax r0 = r1.f232000v
            com.google.assistant.e.i.a.db r0 = r0.mo79449a(r3)
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133603s
            r7.f133704r = r0
            int r0 = r7.f133685a
            r12 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r12
            r7.f133685a = r0
            boolean r0 = r11.isBluetoothScoOn()
            if (r0 == 0) goto L_0x0662
            boolean r0 = r11.isBluetoothScoAvailableOffCall()
            if (r0 != 0) goto L_0x0662
            com.google.assistant.e.i.a.cr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51302cr.BLUETOOTH_CALL_ONLY
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133557f
            r7.f133702p = r0
            int r0 = r7.f133685a
            r0 = r0 | r8
            r7.f133685a = r0
            goto L_0x06b7
        L_0x0662:
            boolean r0 = r11.isBluetoothScoOn()
            if (r0 != 0) goto L_0x06a5
            boolean r0 = r11.isBluetoothA2dpOn()
            if (r0 != 0) goto L_0x06a5
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247419gm
            boolean r0 = r0.mo79746e(r7)
            if (r0 == 0) goto L_0x0679
            goto L_0x06a5
        L_0x0679:
            boolean r0 = r11.isWiredHeadsetOn()
            if (r0 == 0) goto L_0x0692
            com.google.assistant.e.i.a.cr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51302cr.WIRED_HEADSET
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133557f
            r7.f133702p = r0
            int r0 = r7.f133685a
            r0 = r0 | r8
            r7.f133685a = r0
            goto L_0x06b7
        L_0x0692:
            com.google.assistant.e.i.a.cr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51302cr.PHONE
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133557f
            r7.f133702p = r0
            int r0 = r7.f133685a
            r0 = r0 | r8
            r7.f133685a = r0
            goto L_0x06b7
        L_0x06a5:
            com.google.assistant.e.i.a.cr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51302cr.BLUETOOTH
            r24.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.dw r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r7
            int r0 = r0.f133557f
            r7.f133702p = r0
            int r0 = r7.f133685a
            r0 = r0 | r8
            r7.f133685a = r0
        L_0x06b7:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248830al
            boolean r0 = r0.mo79746e(r7)
            r7 = 4
            if (r0 == 0) goto L_0x06ed
            com.google.common.base.ax r0 = r1.f232003y
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x06ed
            com.google.common.base.ax r0 = r1.f232003y
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.assistant.shared.az r0 = (com.google.android.apps.gsa.assistant.shared.az) r0
            boolean r0 = r0.l()
            if (r6 == r0) goto L_0x06da
            r0 = 2
            goto L_0x06db
        L_0x06da:
            r0 = 4
        L_0x06db:
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            int r0 = r0 + -1
            r8.f133711y = r0
            int r0 = r8.f133685a
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 | r12
            r8.f133685a = r0
        L_0x06ed:
            boolean r0 = r25.mo84404ck()
            if (r0 == 0) goto L_0x0720
            com.google.assistant.e.i.a.en r0 = com.google.assistant.p3897e.p3917i.p3918a.C51352en.f133752d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.em r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51351em) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.e.i.a.en r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51352en) r8
            int r12 = r8.f133754a
            r12 = r12 | r6
            r8.f133754a = r12
            r8.f133755b = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.en r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51352en) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            r0.getClass()
            r8.f133660A = r0
            int r0 = r8.f133688b
            r0 = r0 | r5
            r8.f133688b = r0
        L_0x0720:
            com.google.common.base.ax r0 = r1.f232004z
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0774
            com.google.common.base.ax r0 = r1.f232004z
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.assistant.shared.aa r0 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r0
            java.lang.String r0 = r0.mo65279c()
            if (r0 == 0) goto L_0x0774
            com.google.common.base.ax r0 = r1.f232004z
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.assistant.shared.aa r0 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r0
            java.lang.String r0 = r0.mo65279c()
            r0.getClass()
            com.google.assistant.e.j.rj r8 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.ri r8 = (com.google.assistant.p3897e.p3921j.C52427ri) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.assistant.e.j.rj r12 = (com.google.assistant.p3897e.p3921j.C52428rj) r12
            int r13 = r12.f137560a
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r12.f137560a = r13
            r12.f137571l = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.e.j.rj r0 = (com.google.assistant.p3897e.p3921j.C52428rj) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            r0.getClass()
            r8.f133696j = r0
            int r0 = r8.f133685a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r8.f133685a = r0
        L_0x0774:
            com.google.assistant.e.i.a.et r0 = com.google.assistant.p3897e.p3917i.p3918a.C51358et.f133769d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.eo r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51353eo) r0
            dagger.a r8 = r1.f231995q
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aa r8 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r8
            android.content.Context r8 = r8.f230022a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            if (r8 != r6) goto L_0x07a6
            com.google.assistant.e.i.a.eq r8 = com.google.assistant.p3897e.p3917i.p3918a.C51355eq.PORTRAIT
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.i.a.et r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51358et) r12
            int r8 = r8.f133762d
            r12.f133773c = r8
            int r8 = r12.f133771a
            r8 = r8 | 8
            r12.f133771a = r8
            goto L_0x07cf
        L_0x07a6:
            if (r8 != r5) goto L_0x07bc
            com.google.assistant.e.i.a.eq r8 = com.google.assistant.p3897e.p3917i.p3918a.C51355eq.LANDSCAPE
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.i.a.et r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51358et) r12
            int r8 = r8.f133762d
            r12.f133773c = r8
            int r8 = r12.f133771a
            r8 = r8 | 8
            r12.f133771a = r8
            goto L_0x07cf
        L_0x07bc:
            com.google.assistant.e.i.a.eq r8 = com.google.assistant.p3897e.p3917i.p3918a.C51355eq.UNKNOWN
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.i.a.et r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51358et) r12
            int r8 = r8.f133762d
            r12.f133773c = r8
            int r8 = r12.f133771a
            r8 = r8 | 8
            r12.f133771a = r8
        L_0x07cf:
            dagger.a r8 = r1.f231995q
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aa r8 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r8
            boolean r8 = r8.mo78230d()
            if (r8 == 0) goto L_0x07de
            goto L_0x07f5
        L_0x07de:
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249696s
            boolean r8 = r8.mo79746e(r12)
            if (r8 != 0) goto L_0x07e9
            goto L_0x07f8
        L_0x07e9:
            boolean r8 = r25.mo84456dj()
            if (r8 == 0) goto L_0x07f8
            boolean r8 = com.google.android.apps.gsa.search.core.p6491a.C84376v.m134658b(r25)
            if (r8 == 0) goto L_0x07f8
        L_0x07f5:
            com.google.assistant.e.i.a.es r8 = com.google.assistant.p3897e.p3917i.p3918a.C51357es.ON
            goto L_0x07fa
        L_0x07f8:
            com.google.assistant.e.i.a.es r8 = com.google.assistant.p3897e.p3917i.p3918a.C51357es.OFF
        L_0x07fa:
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.i.a.et r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51358et) r12
            int r8 = r8.f133768d
            r12.f133772b = r8
            int r8 = r12.f133771a
            r8 = r8 | r6
            r12.f133771a = r8
            r24.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.i.a.dw r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r8
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.et r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51358et) r0
            r0.getClass()
            r8.f133710x = r0
            int r0 = r8.f133685a
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 | r12
            r8.f133685a = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249662E
            boolean r0 = r0.mo79746e(r8)
            if (r0 == 0) goto L_0x084c
            dagger.a r0 = r1.f231973B
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.permissions.d r0 = (com.google.android.apps.gsa.shared.util.permissions.C91077d) r0
            com.google.common.b.hd r8 = f231969h
            com.google.android.apps.gsa.search.core.google.a.aq r12 = new com.google.android.apps.gsa.search.core.google.a.aq
            r12.<init>(r0, r2)
            p3186j$.util.Map.EL.forEach(r8, r12)
            android.content.Context r0 = r1.f231996r
            boolean r0 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r0)
            if (r0 == 0) goto L_0x084c
            com.google.assistant.e.i.a.cn r0 = com.google.assistant.p3897e.p3917i.p3918a.C51298cn.BIND_NOTIFICATION_LISTENER_SERVICE
            r2.mo53574a(r0)
        L_0x084c:
            android.content.Context r0 = r1.f231996r
            java.lang.String r8 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r8)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            if (r0 != 0) goto L_0x086d
            com.google.common.f.e r0 = f231968a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r4)
            java.lang.String r4 = "Null batteryManager"
            r7 = 7956(0x1f14, float:1.1149E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r4)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0895
        L_0x086d:
            long r7 = r0.getLongProperty(r7)
            r12 = -9223372036854775808
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x088c
            com.google.common.f.e r0 = f231968a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r4)
            java.lang.String r4 = "No battery percentage"
            r7 = 7955(0x1f13, float:1.1147E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r4)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0895
        L_0x088c:
            int r0 = (int) r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0895:
            boolean r4 = r0.mo56113h()
            if (r4 == 0) goto L_0x08ec
            com.google.assistant.e.i.a.cg r4 = com.google.assistant.p3897e.p3917i.p3918a.C51291cg.f133521c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.i.a.cf r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51290cf) r4
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.e.i.a.cg r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51291cg) r7
            int r8 = r7.f133523a
            r5 = r5 | r8
            r7.f133523a = r5
            r7.f133524b = r0
            com.google.protobuf.bv r0 = r4.build()
            com.google.assistant.e.i.a.cg r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51291cg) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.dw r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r4
            r0.getClass()
            com.google.assistant.e.i.a.cg r5 = r4.f133661B
            if (r5 == 0) goto L_0x08e5
            com.google.assistant.e.i.a.cg r7 = com.google.assistant.p3897e.p3917i.p3918a.C51291cg.f133521c
            if (r5 == r7) goto L_0x08e5
            com.google.protobuf.bn r5 = r7.createBuilder(r5)
            com.google.assistant.e.i.a.cf r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51290cf) r5
            r5.mergeFrom(r0)
            com.google.protobuf.bv r0 = r5.buildPartial()
            com.google.assistant.e.i.a.cg r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51291cg) r0
            r4.f133661B = r0
            goto L_0x08e7
        L_0x08e5:
            r4.f133661B = r0
        L_0x08e7:
            int r0 = r4.f133688b
            r0 = r0 | r9
            r4.f133688b = r0
        L_0x08ec:
            com.google.assistant.e.i.a.ex r0 = com.google.assistant.p3897e.p3917i.p3918a.C51362ex.f133780c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.eu r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51359eu) r0
            android.content.Context r4 = r1.f231996r
            boolean r4 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r4)
            if (r4 == 0) goto L_0x08ff
            com.google.assistant.e.i.a.ew r4 = com.google.assistant.p3897e.p3917i.p3918a.C51361ew.DARK_THEME
            goto L_0x0901
        L_0x08ff:
            com.google.assistant.e.i.a.ew r4 = com.google.assistant.p3897e.p3917i.p3918a.C51361ew.LIGHT_THEME
        L_0x0901:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.i.a.ex r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51362ex) r5
            int r4 = r4.f133779d
            r5.f133783b = r4
            int r4 = r5.f133782a
            r4 = r4 | r6
            r5.f133782a = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.ex r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51362ex) r0
            r24.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.dw r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r4
            r0.getClass()
            r4.f133671L = r0
            int r0 = r4.f133688b
            r5 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r5
            r4.f133688b = r0
            com.google.android.apps.gsa.opaonboarding.bc r0 = r1.f232001w
            if (r3 != 0) goto L_0x0930
        L_0x092e:
            r7 = 3
            goto L_0x0941
        L_0x0930:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f228529a
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250443dI
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x092e
            boolean r3 = r25.mo84412cs()
            if (r3 == 0) goto L_0x092e
            r7 = 6
        L_0x0941:
            boolean r0 = r0.mo77283a(r10, r7)
            if (r0 == 0) goto L_0x094a
            com.google.assistant.e.i.a.dr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51329dr.DISCLOSED
            goto L_0x094c
        L_0x094a:
            com.google.assistant.e.i.a.dr r0 = com.google.assistant.p3897e.p3917i.p3918a.C51329dr.NOT_DISCLOSED
        L_0x094c:
            r24.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.i.a.dw r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r3
            int r0 = r0.f133640d
            r3.f133667H = r0
            int r0 = r3.f133688b
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r3.f133688b = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90028cg.f248175e
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0995
            r24.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            r0.f133673O = r15
            int r3 = r0.f133688b
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 | r4
            r0.f133688b = r3
            android.content.Context r0 = r1.f231996r
            boolean r0 = com.google.android.apps.gsa.shared.util.C90731ao.m148192b(r0)
            if (r0 != 0) goto L_0x0987
            android.content.Context r0 = r1.f231996r
            boolean r0 = com.google.android.apps.gsa.shared.util.C90731ao.m148191a(r0)
            if (r0 == 0) goto L_0x0995
        L_0x0987:
            r24.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            r0.f133673O = r6
            int r3 = r0.f133688b
            r3 = r3 | r4
            r0.f133688b = r3
        L_0x0995:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231983b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251053bZ
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x09a2
            r1.m137859d(r11, r2)
        L_0x09a2:
            return
        L_0x09a3:
            r0 = move-exception
            goto L_0x09a6
        L_0x09a5:
            throw r0
        L_0x09a6:
            goto L_0x09a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85799ar.mo79446b(com.google.assistant.e.i.a.cs, com.google.android.apps.gsa.shared.search.Query):void");
    }
}
