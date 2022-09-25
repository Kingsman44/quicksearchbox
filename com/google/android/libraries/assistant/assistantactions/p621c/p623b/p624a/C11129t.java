package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11228a;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11241b;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11246g;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11247h;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11248i;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4152bb.p4153a.C55421x;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.t */
/* compiled from: PG */
public final class C11129t implements C11204b {

    /* renamed from: a */
    public static final C59071e f36469a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.a.t");

    /* renamed from: f */
    private static final SimpleDateFormat f36470f = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

    /* renamed from: b */
    public final C11241b f36471b;

    /* renamed from: c */
    public final C11228a f36472c;

    /* renamed from: d */
    public C55421x f36473d = C55421x.UNKNOWN_ACTION_TYPE;

    /* renamed from: e */
    public int f36474e = 7;

    /* renamed from: g */
    private final C60887da f36475g;

    /* renamed from: h */
    private final C60950i f36476h;

    /* renamed from: i */
    private final C11248i f36477i;

    /* renamed from: j */
    private final C11270g f36478j;

    /* renamed from: k */
    private C11247h f36479k;

    public C11129t(C60887da daVar, C11241b bVar, C11228a aVar, C60950i iVar, C11270g gVar) {
        this.f36475g = daVar;
        this.f36471b = bVar;
        this.f36472c = aVar;
        this.f36476h = iVar;
        this.f36477i = C11248i.f36668a;
        this.f36478j = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        return C58836b.f156633a;
    }

    /* JADX WARNING: type inference failed for: r5v58, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r7v101, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r7v104, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d1, code lost:
        if (r6 == com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03f5, code lost:
        if (r5 != false) goto L_0x058d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo19610b(com.google.assistant.p3897e.p3921j.C52091ex r17, com.google.assistant.p3897e.p3917i.p3918a.C51406gn r18, com.google.android.libraries.assistant.assistantactions.p620b.C11054a r19, android.content.Context r20, com.google.common.base.C58833ax r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            int r3 = r1.f133894f
            com.google.assistant.e.i.a.gi r3 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r3)
            if (r3 != 0) goto L_0x0010
            com.google.assistant.e.i.a.gi r3 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0010:
            java.lang.String r4 = "controller_state"
            java.lang.String r3 = r3.name()
            r0.mo19611c(r4, r3)
            com.google.assistant.e.j.zt r3 = r1.f133893e
            if (r3 != 0) goto L_0x001f
            com.google.assistant.e.j.zt r3 = com.google.assistant.p3897e.p3921j.C52654zt.f138233e
        L_0x001f:
            int r3 = r3.f138236b
            int r3 = com.google.assistant.p3897e.p3921j.C52648zn.m86683b(r3)
            r4 = 1
            if (r3 != 0) goto L_0x0029
            r3 = 1
        L_0x0029:
            java.lang.String r5 = "mic_args"
            java.lang.String r3 = com.google.assistant.p3897e.p3921j.C52648zn.m86682a(r3)
            r0.mo19611c(r5, r3)
            com.google.assistant.e.j.e.ff r3 = r1.f133892d
            if (r3 != 0) goto L_0x0038
            com.google.assistant.e.j.e.ff r3 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x0038:
            int r3 = r3.f136323g
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r3)
            if (r3 != 0) goto L_0x0042
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x0042:
            java.lang.String r5 = "feature_type"
            java.lang.String r3 = r3.name()
            r0.mo19611c(r5, r3)
            int r3 = r1.f133889a
            r3 = r3 & 4
            r5 = 0
            if (r3 == 0) goto L_0x0054
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            java.lang.String r6 = "show_native_form_args"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.mo19611c(r6, r3)
            int r3 = r1.f133889a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x00f6
            com.google.assistant.e.j.e.ff r3 = r1.f133892d
            if (r3 != 0) goto L_0x006a
            com.google.assistant.e.j.e.ff r3 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x006a:
            int r6 = r3.f136326j
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.m86449a(r6)
            if (r6 != 0) goto L_0x0074
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x0074:
            java.lang.String r7 = "rendering_strategy"
            java.lang.String r6 = r6.name()
            r0.mo19611c(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.google.protobuf.cq r3 = r3.f136319c
            java.util.Iterator r3 = r3.iterator()
        L_0x0088:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00ed
            java.lang.Object r7 = r3.next()
            com.google.assistant.e.j.e.fa r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r7
            boolean r8 = r7.f136298c
            if (r8 != 0) goto L_0x0088
            java.lang.String r8 = "["
            r6.append(r8)
            com.google.protobuf.cq r7 = r7.f136299d
            java.util.Iterator r7 = r7.iterator()
        L_0x00a3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e7
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.e.ew r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r8
            boolean r9 = r8.f136290d
            if (r9 != 0) goto L_0x00a3
            java.lang.String r9 = "("
            r6.append(r9)
            com.google.protobuf.cq r8 = r8.f136288b
            java.util.Iterator r8 = r8.iterator()
        L_0x00be:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e1
            java.lang.Object r9 = r8.next()
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            boolean r10 = r9.f136281i
            if (r10 != 0) goto L_0x00be
            int r9 = r9.f136277e
            com.google.assistant.e.j.e.er r9 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r9)
            java.lang.String r9 = r9.name()
            r6.append(r9)
            java.lang.String r9 = " "
            r6.append(r9)
            goto L_0x00be
        L_0x00e1:
            java.lang.String r8 = ")"
            r6.append(r8)
            goto L_0x00a3
        L_0x00e7:
            java.lang.String r7 = "] "
            r6.append(r7)
            goto L_0x0088
        L_0x00ed:
            java.lang.String r3 = "native_form"
            java.lang.String r6 = r6.toString()
            r0.mo19611c(r3, r6)
        L_0x00f6:
            java.lang.String r3 = "dismiss_after_call"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0.mo19611c(r3, r6)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            com.google.assistant.e.j.e.fc r6 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
            int r7 = r1.f133889a
            r8 = r7 & 4
            if (r8 == 0) goto L_0x011e
            com.google.assistant.e.j.e.ff r6 = r1.f133892d
            if (r6 != 0) goto L_0x0114
            com.google.assistant.e.j.e.ff r6 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x0114:
            int r6 = r6.f136324h
            com.google.assistant.e.j.e.fc r6 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.m86447a(r6)
            if (r6 != 0) goto L_0x011e
            com.google.assistant.e.j.e.fc r6 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
        L_0x011e:
            r8 = 2
            r7 = r7 & r8
            if (r7 == 0) goto L_0x01c8
            com.google.common.base.ax r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11115f.m26404a(r18)
            com.google.assistant.e.j.e.hb r9 = r1.f133891c
            if (r9 != 0) goto L_0x012c
            com.google.assistant.e.j.e.hb r9 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x012c:
            boolean r10 = r21.mo56113h()
            if (r10 == 0) goto L_0x01b9
            java.lang.String r10 = r9.f136479b
            java.lang.Object r11 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r11 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r11
            java.lang.String r11 = r11.mo19665a()
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x01b9
            int r10 = r1.f133889a
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0171
            com.google.protobuf.bn r7 = r9.toBuilder()
            com.google.assistant.e.j.e.gu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51995gu) r7
            com.google.assistant.e.i.a.gc r9 = r1.f133900l
            if (r9 != 0) goto L_0x0156
            com.google.assistant.e.i.a.gc r9 = com.google.assistant.p3897e.p3917i.p3918a.C51395gc.f133843d
        L_0x0156:
            java.lang.String r9 = r9.f133846b
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.e.j.e.hb r10 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r10
            r9.getClass()
            int r11 = r10.f136478a
            r11 = r11 | r4
            r10.f136478a = r11
            r10.f136479b = r9
            com.google.protobuf.bv r7 = r7.build()
            r9 = r7
            com.google.assistant.e.j.e.hb r9 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r9
            goto L_0x01b9
        L_0x0171:
            boolean r10 = r7.mo56113h()
            if (r10 == 0) goto L_0x01b9
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.e.i.a.av r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r7
            int r7 = r7.f133429a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x01b9
            com.google.protobuf.bn r7 = r9.toBuilder()
            com.google.assistant.e.j.e.gu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51995gu) r7
            android.content.res.Resources r9 = r20.getResources()
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Object r11 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r11 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r11
            java.lang.String r11 = r11.mo19665a()
            r10[r5] = r11
            r11 = 2132085213(0x7f1509dd, float:1.9810618E38)
            java.lang.String r9 = r9.getString(r11, r10)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.e.j.e.hb r10 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r10
            r9.getClass()
            int r11 = r10.f136478a
            r11 = r11 | r4
            r10.f136478a = r11
            r10.f136479b = r9
            com.google.protobuf.bv r7 = r7.build()
            r9 = r7
            com.google.assistant.e.j.e.hb r9 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r9
        L_0x01b9:
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26582l(r9)
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26586p(r7, r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r9, r7)
        L_0x01c8:
            int r7 = r1.f133889a
            r7 = r7 & r4
            java.lang.String r9 = "ContactLookupFeatureImpl"
            if (r7 == 0) goto L_0x023d
            com.google.common.base.ax r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11115f.m26404a(r18)
            com.google.assistant.e.j.e.hb r10 = r1.f133891c
            if (r10 != 0) goto L_0x01d9
            com.google.assistant.e.j.e.hb r10 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x01d9:
            int r11 = r1.f133889a
            r11 = r11 & r8
            if (r11 == 0) goto L_0x020e
            boolean r11 = r21.mo56113h()
            if (r11 == 0) goto L_0x020e
            java.lang.String r10 = r10.f136479b
            java.lang.Object r11 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r11 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r11
            java.lang.String r11 = r11.mo19665a()
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x020e
            int r10 = r1.f133889a
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x01fd
            goto L_0x023d
        L_0x01fd:
            boolean r10 = r7.mo56113h()
            if (r10 == 0) goto L_0x020e
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.e.i.a.av r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r7
            int r7 = r7.f133429a
            r7 = r7 & r4
            if (r7 != 0) goto L_0x023d
        L_0x020e:
            int r7 = r1.f133889a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x023d
            com.google.common.f.e r7 = f36469a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r10, r9)
            java.lang.String r10 = "created client op TtsOutput"
            r11 = 42906(0xa79a, float:6.0124E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r11)).mo56386p(r10)
            com.google.assistant.e.j.aos r7 = r1.f133890b
            if (r7 != 0) goto L_0x022c
            com.google.assistant.e.j.aos r7 = com.google.assistant.p3897e.p3921j.aos.f135519e
        L_0x022c:
            java.lang.String r10 = "speech_output_args"
            java.lang.String r11 = "assistant.api.client_op.SpeechOutputArgs"
            java.lang.String r12 = "tts.OUTPUT"
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26575e(r12, r10, r11, r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r10, r7)
        L_0x023d:
            int r7 = r1.f133889a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x026b
            com.google.common.f.e r7 = f36469a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r10, r9)
            java.lang.String r10 = "created client op ShowNativeForm"
            r11 = 42902(0xa796, float:6.0119E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r11)).mo56386p(r10)
            com.google.assistant.e.j.e.ff r7 = r1.f133892d
            if (r7 != 0) goto L_0x025c
            com.google.assistant.e.j.e.ff r7 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x025c:
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26580j(r7)
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26586p(r7, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r7, r6)
        L_0x026b:
            int r6 = r1.f133889a
            r6 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x029b
            com.google.common.f.e r6 = f36469a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r9)
            java.lang.String r7 = "created client op RequestPermission"
            r10 = 42901(0xa795, float:6.0117E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r10)).mo56386p(r7)
            com.google.assistant.e.j.rt r6 = r1.f133903o
            if (r6 != 0) goto L_0x028a
            com.google.assistant.e.j.rt r6 = com.google.assistant.p3897e.p3921j.C52438rt.f137645h
        L_0x028a:
            java.lang.String r7 = "device_request_permission_args"
            java.lang.String r10 = "assistant.api.client_op.DeviceRequestPermissionArgs"
            java.lang.String r11 = "device.REQUEST_PERMISSION"
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26575e(r11, r7, r10, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r7, r6)
        L_0x029b:
            java.util.Collection r6 = r3.mo54949B()
            java.util.Iterator r6 = r6.iterator()
        L_0x02a3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02e0
            java.lang.Object r7 = r6.next()
            com.google.assistant.e.j.dy r7 = (com.google.assistant.p3897e.p3921j.C51809dy) r7
            java.lang.String r7 = r7.f135936b
            java.lang.String r10 = "ui.SHOW_NATIVE_FORM"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x02a3
            int r6 = r1.f133894f
            com.google.assistant.e.i.a.gi r7 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r6)
            if (r7 != 0) goto L_0x02c3
            com.google.assistant.e.i.a.gi r7 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x02c3:
            com.google.assistant.e.i.a.gi r10 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            if (r7 == r10) goto L_0x02d3
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r6)
            if (r6 != 0) goto L_0x02cf
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x02cf:
            com.google.assistant.e.i.a.gi r7 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE
            if (r6 != r7) goto L_0x02e0
        L_0x02d3:
            com.google.assistant.e.j.e.o r6 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26577g(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r7, r6)
        L_0x02e0:
            int r6 = r1.f133889a
            r7 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x030b
            com.google.common.f.e r6 = f36469a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r9)
            java.lang.String r7 = "StartDictationArgs is present."
            r10 = 42905(0xa799, float:6.0123E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r10)).mo56386p(r7)
            com.google.protos.f.b.b.a.n r6 = r1.f133906r
            if (r6 != 0) goto L_0x0300
            com.google.protos.f.b.b.a.n r6 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n
        L_0x0300:
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26583m(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r7, r6)
        L_0x030b:
            com.google.common.base.ax r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26376i(r18)
            boolean r7 = r6.mo56113h()
            r11 = 10
            r12 = 12
            r13 = 6
            if (r7 == 0) goto L_0x05db
            java.lang.Object r7 = r6.mo56107c()
            com.google.assistant.e.i.a.il r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r7
            int r7 = r7.f134045a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x05db
            java.lang.Object r6 = r6.mo56107c()
            com.google.assistant.e.i.a.il r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r6
            com.google.assistant.e.j.nk r6 = r6.f134051g
            if (r6 != 0) goto L_0x0332
            com.google.assistant.e.j.nk r6 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
        L_0x0332:
            boolean r7 = r21.mo56113h()
            if (r7 == 0) goto L_0x0345
            boolean r7 = r2.mo19521b(r12)
            if (r7 != 0) goto L_0x0345
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            goto L_0x0836
        L_0x0345:
            com.google.common.f.e r7 = f36469a
            com.google.common.f.x r14 = r7.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r9)
            java.lang.String r15 = "chat_message.SEND ClientOp args is present"
            r5 = 42923(0xa7ab, float:6.0148E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r5)).mo56386p(r15)
            java.lang.String r5 = r6.f137334g
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0378
            int r5 = r6.f137328a
            if (r5 != r11) goto L_0x0365
            goto L_0x0378
        L_0x0365:
            com.google.common.f.x r5 = r7.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r9)
            java.lang.String r6 = "Not creating client op chat_message.SEND, text string was empty"
            r7 = 42925(0xa7ad, float:6.0151E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x05db
        L_0x0378:
            boolean r5 = r21.mo56113h()
            if (r5 == 0) goto L_0x058d
            java.lang.Object r5 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r5 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r5
            java.lang.String r5 = r5.mo19666b()
            int r14 = r0.f36474e
            int r15 = r14 + -1
            if (r14 == 0) goto L_0x058b
            r14 = 5
            java.lang.String r11 = ""
            if (r15 == 0) goto L_0x03d7
            if (r15 == r4) goto L_0x03b8
            if (r15 == r14) goto L_0x0399
            goto L_0x03f9
        L_0x0399:
            com.google.assistant.e.j.pj r15 = r6.f137331d
            if (r15 != 0) goto L_0x039f
            com.google.assistant.e.j.pj r15 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x039f:
            int r15 = r15.f137437b
            if (r15 != r13) goto L_0x03f9
            com.google.assistant.e.j.pj r15 = r6.f137331d
            if (r15 != 0) goto L_0x03a9
            com.google.assistant.e.j.pj r15 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03a9:
            int r12 = r15.f137437b
            if (r12 != r13) goto L_0x03b2
            java.lang.Object r12 = r15.f137438c
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x03b3
        L_0x03b2:
            r12 = r11
        L_0x03b3:
            boolean r5 = com.google.common.base.C58890d.m90990e(r12, r5)
            goto L_0x03f5
        L_0x03b8:
            com.google.assistant.e.j.pj r12 = r6.f137331d
            if (r12 != 0) goto L_0x03be
            com.google.assistant.e.j.pj r12 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03be:
            int r12 = r12.f137437b
            if (r12 != r8) goto L_0x03f9
            com.google.assistant.e.j.pj r12 = r6.f137331d
            if (r12 != 0) goto L_0x03c8
            com.google.assistant.e.j.pj r12 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03c8:
            int r15 = r12.f137437b
            if (r15 != r8) goto L_0x03d1
            java.lang.Object r12 = r12.f137438c
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x03d2
        L_0x03d1:
            r12 = r11
        L_0x03d2:
            boolean r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11118i.m26424i(r12, r5)
            goto L_0x03f5
        L_0x03d7:
            com.google.assistant.e.j.pj r12 = r6.f137331d
            if (r12 != 0) goto L_0x03dd
            com.google.assistant.e.j.pj r12 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03dd:
            int r12 = r12.f137437b
            if (r12 != r4) goto L_0x03f9
            com.google.assistant.e.j.pj r12 = r6.f137331d
            if (r12 != 0) goto L_0x03e7
            com.google.assistant.e.j.pj r12 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03e7:
            int r15 = r12.f137437b
            if (r15 != r4) goto L_0x03f0
            java.lang.Object r12 = r12.f137438c
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x03f1
        L_0x03f0:
            r12 = r11
        L_0x03f1:
            boolean r5 = r12.equals(r5)
        L_0x03f5:
            if (r5 == 0) goto L_0x03f9
            goto L_0x058d
        L_0x03f9:
            com.google.android.libraries.assistant.assistantactions.c.d.a r5 = r0.f36472c
            r5.mo19637g()
            java.lang.Object r5 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r5 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r5
            com.google.protobuf.bn r12 = r6.toBuilder()
            com.google.assistant.e.j.my r12 = (com.google.assistant.p3897e.p3921j.C52308my) r12
            com.google.assistant.e.j.pj r15 = r6.f137330c
            if (r15 == 0) goto L_0x0417
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.assistant.e.j.nk r10 = (com.google.assistant.p3897e.p3921j.C52321nk) r10
            r10.f137330c = r15
        L_0x0417:
            com.google.assistant.e.c.c.gh r10 = r6.f137333f
            if (r10 == 0) goto L_0x04b5
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.assistant.e.c.c.gg r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r10
            java.lang.String r15 = r5.mo19668d()
            java.lang.String r8 = "com.google.android.googlequicksearchbox.sms"
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x0465
            com.google.protobuf.bv r8 = r10.instance
            com.google.assistant.e.c.c.gh r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r8
            int r15 = r8.f133012b
            if (r15 != r4) goto L_0x043a
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x043c
        L_0x043a:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x043c:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.es r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r15 = r8.instance
            com.google.assistant.e.c.c.ev r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r15
            int r13 = r15.f132943a
            r13 = r13 | r4
            r15.f132943a = r13
            r15.f132944b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.c.c.gh r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r11
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r8.getClass()
            r11.f133013c = r8
            r11.f133012b = r4
            goto L_0x04a3
        L_0x0465:
            com.google.protobuf.bv r8 = r10.instance
            com.google.assistant.e.c.c.gh r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r8
            int r11 = r8.f133012b
            if (r11 != r4) goto L_0x0472
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x0474
        L_0x0472:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0474:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.es r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r8
            java.lang.String r11 = r5.mo19668d()
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.assistant.e.c.c.ev r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r13
            r11.getClass()
            int r15 = r13.f132943a
            r15 = r15 | r4
            r13.f132943a = r15
            r13.f132944b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.c.c.gh r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r11
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r8.getClass()
            r11.f133013c = r8
            r11.f133012b = r4
        L_0x04a3:
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.assistant.e.j.nk r8 = (com.google.assistant.p3897e.p3921j.C52321nk) r8
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.e.c.c.gh r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r10
            r10.getClass()
            r8.f137333f = r10
        L_0x04b5:
            java.lang.String r8 = r6.f137334g
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.assistant.e.j.nk r10 = (com.google.assistant.p3897e.p3921j.C52321nk) r10
            r8.getClass()
            r10.f137334g = r8
            int r8 = r0.f36474e
            int r10 = r8 + -1
            if (r8 == 0) goto L_0x0589
            if (r10 == 0) goto L_0x0546
            if (r10 == r4) goto L_0x0514
            if (r10 == r14) goto L_0x04e2
            com.google.common.f.x r5 = r7.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r9)
            java.lang.String r8 = "Unknown endPointType."
            r10 = 42878(0xa77e, float:6.0085E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r10)).mo56386p(r8)
            goto L_0x0576
        L_0x04e2:
            com.google.assistant.e.j.pj r8 = r6.f137331d
            if (r8 != 0) goto L_0x04e8
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x04e8:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.j.pi r8 = (com.google.assistant.p3897e.p3921j.C52373pi) r8
            java.lang.String r5 = r5.mo19666b()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.pj r10 = (com.google.assistant.p3897e.p3921j.C52374pj) r10
            r5.getClass()
            r11 = 6
            r10.f137437b = r11
            r10.f137438c = r5
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.nk r5 = (com.google.assistant.p3897e.p3921j.C52321nk) r5
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r8.getClass()
            r5.f137331d = r8
            goto L_0x0576
        L_0x0514:
            com.google.assistant.e.j.pj r8 = r6.f137331d
            if (r8 != 0) goto L_0x051a
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x051a:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.j.pi r8 = (com.google.assistant.p3897e.p3921j.C52373pi) r8
            java.lang.String r5 = r5.mo19666b()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.pj r10 = (com.google.assistant.p3897e.p3921j.C52374pj) r10
            r5.getClass()
            r11 = 2
            r10.f137437b = r11
            r10.f137438c = r5
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.nk r5 = (com.google.assistant.p3897e.p3921j.C52321nk) r5
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r8.getClass()
            r5.f137331d = r8
            goto L_0x0576
        L_0x0546:
            com.google.assistant.e.j.pj r8 = r6.f137331d
            if (r8 != 0) goto L_0x054c
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x054c:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.j.pi r8 = (com.google.assistant.p3897e.p3921j.C52373pi) r8
            java.lang.String r5 = r5.mo19666b()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.pj r10 = (com.google.assistant.p3897e.p3921j.C52374pj) r10
            r5.getClass()
            r10.f137437b = r4
            r10.f137438c = r5
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.nk r5 = (com.google.assistant.p3897e.p3921j.C52321nk) r5
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r8.getClass()
            r5.f137331d = r8
        L_0x0576:
            boolean r5 = r6.f137335h
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            r6.f137335h = r5
            com.google.protobuf.bv r5 = r12.build()
            r6 = r5
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            goto L_0x0592
        L_0x0589:
            r5 = 0
            throw r5
        L_0x058b:
            r5 = 0
            throw r5
        L_0x058d:
            com.google.android.libraries.assistant.assistantactions.c.d.a r5 = r0.f36472c
            r5.mo19638h()
        L_0x0592:
            boolean r5 = r21.mo56113h()
            if (r5 == 0) goto L_0x05b7
            com.google.bb.a.x r5 = r0.f36473d
            if (r5 == 0) goto L_0x05b7
            r5 = 12
            boolean r8 = r2.mo19521b(r5)
            if (r8 == 0) goto L_0x05b7
            com.google.android.libraries.assistant.assistantactions.c.d.b r5 = r0.f36471b
            com.google.bb.a.x r8 = r0.f36473d
            com.google.bj.c.e.f r10 = com.google.p4184bj.p4193c.p4200e.C55998f.COMPLETED
            java.lang.Object r11 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r11 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r11
            java.lang.String r11 = r11.mo19669e()
            r5.mo19661e(r8, r10, r11)
        L_0x05b7:
            com.google.android.libraries.assistant.assistantactions.d.g r5 = r0.f36478j
            java.lang.String r8 = "chat_message.SEND"
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g.m26597a(r5, r2, r8)
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26579i(r6)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r3.mo54920x(r8, r5)
            com.google.common.f.x r5 = r7.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r9)
            java.lang.String r6 = "Created client op chat_message.SEND"
            r7 = 42924(0xa7ac, float:6.015E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
        L_0x05db:
            int r5 = r1.f133889a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x05f2
            com.google.assistant.e.j.zt r5 = r1.f133893e
            if (r5 != 0) goto L_0x05e7
            com.google.assistant.e.j.zt r5 = com.google.assistant.p3897e.p3921j.C52654zt.f138233e
        L_0x05e7:
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26578h(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.mo54920x(r6, r5)
        L_0x05f2:
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11115f.m26404a(r18)
            boolean r6 = r5.mo56113h()
            if (r6 != 0) goto L_0x05fe
            goto L_0x0783
        L_0x05fe:
            java.lang.Object r6 = r5.mo56107c()
            com.google.assistant.e.i.a.av r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r6
            java.lang.Object r5 = r5.mo56107c()
            com.google.assistant.e.i.a.av r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r5
            int r5 = r5.f133429a
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0748
            com.google.common.f.e r5 = f36469a
            com.google.common.f.x r7 = r5.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "Call ClientOp args is present"
            r10 = 42898(0xa792, float:6.0113E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56386p(r8)
            com.google.assistant.e.j.mf r6 = r6.f133430b
            if (r6 != 0) goto L_0x0628
            com.google.assistant.e.j.mf r6 = com.google.assistant.p3897e.p3921j.C52289mf.f137258j
        L_0x0628:
            boolean r7 = r21.mo56113h()
            if (r7 == 0) goto L_0x06fa
            java.lang.String r7 = r6.f137262c
            java.lang.Object r8 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r8 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r8
            java.lang.String r8 = r8.mo19666b()
            boolean r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11118i.m26424i(r7, r8)
            if (r7 != 0) goto L_0x06fa
            com.google.common.f.x r7 = r5.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "Update CallArgs to apply AUM resolved results."
            r10 = 42900(0xa794, float:6.0116E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56386p(r8)
            com.google.android.libraries.assistant.assistantactions.c.d.a r7 = r0.f36472c
            r7.mo19633c()
            java.lang.Object r7 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r7 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r7
            com.google.assistant.e.j.mf r8 = com.google.assistant.p3897e.p3921j.C52289mf.f137258j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.mc r8 = (com.google.assistant.p3897e.p3921j.C52286mc) r8
            java.lang.String r7 = r7.mo19666b()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.mf r10 = (com.google.assistant.p3897e.p3921j.C52289mf) r10
            r7.getClass()
            r10.f137262c = r7
            int r7 = r0.f36474e
            switch(r7) {
                case 1: goto L_0x068e;
                case 2: goto L_0x068b;
                case 3: goto L_0x0688;
                case 4: goto L_0x0685;
                case 5: goto L_0x0682;
                case 6: goto L_0x067f;
                case 7: goto L_0x067c;
                default: goto L_0x0679;
            }
        L_0x0679:
            java.lang.String r10 = "null"
            goto L_0x0690
        L_0x067c:
            java.lang.String r10 = "EMPTY"
            goto L_0x0690
        L_0x067f:
            java.lang.String r10 = "APP_UNIQUE_ID"
            goto L_0x0690
        L_0x0682:
            java.lang.String r10 = "GAIA_ID"
            goto L_0x0690
        L_0x0685:
            java.lang.String r10 = "DEVICE_ID"
            goto L_0x0690
        L_0x0688:
            java.lang.String r10 = "USERNAME"
            goto L_0x0690
        L_0x068b:
            java.lang.String r10 = "PHONE_NUMBER"
            goto L_0x0690
        L_0x068e:
            java.lang.String r10 = "EMAIL"
        L_0x0690:
            if (r7 == 0) goto L_0x06f8
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.mf r7 = (com.google.assistant.p3897e.p3921j.C52289mf) r7
            r7.f137263d = r10
            boolean r7 = r6.f137268i
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.mf r10 = (com.google.assistant.p3897e.p3921j.C52289mf) r10
            r10.f137268i = r7
            boolean r7 = r6.f137265f
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.mf r10 = (com.google.assistant.p3897e.p3921j.C52289mf) r10
            r10.f137265f = r7
            boolean r7 = r6.f137264e
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.mf r10 = (com.google.assistant.p3897e.p3921j.C52289mf) r10
            r10.f137264e = r7
            int r7 = r6.f137260a
            r10 = 6
            if (r7 != r10) goto L_0x06d4
            java.lang.Object r6 = r6.f137261b
            com.google.assistant.e.c.c.gh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r6
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.mf r7 = (com.google.assistant.p3897e.p3921j.C52289mf) r7
            r6.getClass()
            r7.f137261b = r6
            r7.f137260a = r10
            goto L_0x06f1
        L_0x06d4:
            r10 = 10
            if (r7 != r10) goto L_0x06e1
            java.lang.Object r6 = r6.f137261b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L_0x06e2
        L_0x06e1:
            r6 = 0
        L_0x06e2:
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.mf r7 = (com.google.assistant.p3897e.p3921j.C52289mf) r7
            r7.f137260a = r10
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.f137261b = r6
        L_0x06f1:
            com.google.protobuf.bv r6 = r8.build()
            com.google.assistant.e.j.mf r6 = (com.google.assistant.p3897e.p3921j.C52289mf) r6
            goto L_0x06ff
        L_0x06f8:
            r6 = 0
            throw r6
        L_0x06fa:
            com.google.android.libraries.assistant.assistantactions.c.d.a r7 = r0.f36472c
            r7.mo19634d()
        L_0x06ff:
            boolean r7 = r21.mo56113h()
            if (r7 == 0) goto L_0x0724
            com.google.bb.a.x r7 = r0.f36473d
            if (r7 == 0) goto L_0x0724
            r7 = 12
            boolean r7 = r2.mo19521b(r7)
            if (r7 == 0) goto L_0x0724
            com.google.android.libraries.assistant.assistantactions.c.d.b r7 = r0.f36471b
            com.google.bb.a.x r8 = r0.f36473d
            com.google.bj.c.e.f r10 = com.google.p4184bj.p4193c.p4200e.C55998f.COMPLETED
            java.lang.Object r11 = r21.mo56107c()
            com.google.android.libraries.assistant.assistantactions.c.d.d r11 = (com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11243d) r11
            java.lang.String r11 = r11.mo19669e()
            r7.mo19661e(r8, r10, r11)
        L_0x0724:
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26571a(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r3.mo54920x(r7, r6)
            com.google.android.libraries.assistant.assistantactions.d.g r6 = r0.f36478j
            java.lang.String r7 = "call.CALL"
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g.m26597a(r6, r2, r7)
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r9)
            java.lang.String r6 = "created client op call.Call"
            r7 = 42899(0xa793, float:6.0114E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0783
        L_0x0748:
            int r5 = r6.f133429a
            r7 = 2
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0783
            com.google.common.f.e r5 = f36469a
            com.google.common.f.x r7 = r5.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "VideoCall ClientOp args is present"
            r10 = 42896(0xa790, float:6.011E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56386p(r8)
            com.google.assistant.e.j.apn r6 = r6.f133431c
            if (r6 != 0) goto L_0x0767
            com.google.assistant.e.j.apn r6 = com.google.assistant.p3897e.p3921j.apn.f135563g
        L_0x0767:
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26585o(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r3.mo54920x(r7, r6)
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r9)
            java.lang.String r6 = "Creating client op VideoCall"
            r7 = 42897(0xa791, float:6.0112E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
        L_0x0783:
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11115f.m26404a(r18)
            boolean r6 = r5.mo56113h()
            if (r6 == 0) goto L_0x0802
            java.lang.Object r6 = r5.mo56107c()
            com.google.assistant.e.i.a.av r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r6
            int r6 = r6.f133429a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0802
            r6 = 35
            boolean r2 = r2.mo19521b(r6)
            if (r2 != 0) goto L_0x07a2
            goto L_0x07bb
        L_0x07a2:
            boolean r2 = r21.mo56113h()
            if (r2 == 0) goto L_0x07c1
            com.google.common.f.e r2 = f36469a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r9)
            java.lang.String r3 = "Does not support applying AUM result to provider.OPEN ClientOp"
            r5 = 42922(0xa7aa, float:6.0147E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
        L_0x07bb:
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            goto L_0x0836
        L_0x07c1:
            com.google.common.f.e r2 = f36469a
            com.google.common.f.x r6 = r2.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r9)
            java.lang.String r7 = "provider.OPEN ClientOp args is present"
            r8 = 42920(0xa7a8, float:6.0144E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
            java.lang.Object r5 = r5.mo56107c()
            com.google.assistant.e.i.a.av r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r5
            com.google.assistant.e.j.ada r5 = r5.f133432d
            if (r5 != 0) goto L_0x07e0
            com.google.assistant.e.j.ada r5 = com.google.assistant.p3897e.p3921j.ada.f134865f
        L_0x07e0:
            java.lang.String r6 = "open_provider_args"
            java.lang.String r7 = "assistant.api.client_op.OpenProviderArgs"
            java.lang.String r8 = "provider.OPEN"
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26575e(r8, r6, r7, r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.mo54920x(r6, r5)
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r9)
            java.lang.String r5 = "Creating client op provider.OPEN"
            r6 = 42921(0xa7a9, float:6.0145E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r5)
        L_0x0802:
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26376i(r18)
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x081f
            int r2 = r1.f133889a
            r5 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r5
            if (r2 == 0) goto L_0x081f
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26576f()
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo54920x(r6, r2)
        L_0x081f:
            java.util.Collection r2 = r3.mo54949B()
            java.util.Iterator r2 = r2.iterator()
        L_0x0827:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0836
            java.lang.Object r5 = r2.next()
            com.google.assistant.e.j.dy r5 = (com.google.assistant.p3897e.p3921j.C51809dy) r5
            java.lang.String r5 = r5.f135936b
            goto L_0x0827
        L_0x0836:
            boolean r2 = r3.mo54954G()
            java.lang.String r5 = "fulfillment_result"
            if (r2 != 0) goto L_0x08bd
            int r1 = r1.f133894f
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r1)
            if (r2 != 0) goto L_0x0848
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0848:
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            if (r2 == r6) goto L_0x085c
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r1)
            if (r1 != 0) goto L_0x0854
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0854:
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE
            if (r1 != r2) goto L_0x0859
            goto L_0x085c
        L_0x0859:
            r1 = r17
            goto L_0x0860
        L_0x085c:
            com.google.assistant.e.j.ex r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26589a(r17)
        L_0x0860:
            com.google.android.libraries.assistant.assistantactions.c.d.h r2 = r0.f36479k
            if (r2 == 0) goto L_0x08af
            int r2 = r3.f155874b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "client_op_size"
            r0.mo19611c(r6, r2)
            java.util.Set r2 = r3.mo54951D()
            java.util.Iterator r2 = r2.iterator()
        L_0x0877:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x08af
            java.lang.Object r6 = r2.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.util.List r7 = r3.mo55277g(r6)
            java.util.Iterator r7 = r7.iterator()
        L_0x088b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0877
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.dy r8 = (com.google.assistant.p3897e.p3921j.C51809dy) r8
            java.util.Locale r9 = java.util.Locale.US
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r6
            java.lang.String r8 = r8.f135936b
            r11[r4] = r8
            java.lang.String r8 = "%d - %s"
            java.lang.String r8 = java.lang.String.format(r9, r8, r11)
            java.lang.String r9 = "client_op"
            r0.mo19611c(r9, r8)
            goto L_0x088b
        L_0x08af:
            java.lang.String r2 = "on-device execution"
            r0.mo19611c(r5, r2)
            com.google.assistant.e.e.a.j r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26565a(r3, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            return r1
        L_0x08bd:
            com.google.common.f.e r1 = f36469a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r9)
            java.lang.String r2 = "FA failed to fulfill ContactLookup on-device."
            r3 = 42879(0xa77f, float:6.0086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            java.lang.String r1 = "fallback to server, no preset ClientOps"
            r0.mo19611c(r5, r1)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11129t.mo19610b(com.google.assistant.e.j.ex, com.google.assistant.e.i.a.gn, com.google.android.libraries.assistant.assistantactions.b.a, android.content.Context, com.google.common.base.ax):com.google.common.base.ax");
    }

    /* renamed from: c */
    public final void mo19611c(String str, Object obj) {
        C11247h hVar = this.f36479k;
        if (hVar != null) {
            hVar.f36667b.add(new C11246g(str, obj.toString()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: com.google.common.b.gu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x06f4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo19605d(android.content.Context r32, com.google.assistant.p3897e.p3921j.C52081en r33, com.google.android.libraries.assistant.assistantactions.p620b.C11054a r34) {
        /*
            r31 = this;
            r8 = r31
            r0 = r33
            r9 = r34
            com.google.common.f.e r1 = f36469a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ContactLookupFeatureImpl"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "#interaction %d"
            com.google.protobuf.cq r3 = r0.f136684d
            int r3 = r3.size()
            r4 = 42885(0xa785, float:6.0095E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56387q(r2, r3)
            com.google.protobuf.cq r1 = r0.f136684d
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L_0x0879
            com.google.protobuf.cq r1 = r0.f136684d
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90133n(r1)
            com.google.assistant.e.j.ep r1 = (com.google.assistant.p3897e.p3921j.C52083ep) r1
            int r3 = r1.f136692b
            r4 = 3
            if (r3 != r4) goto L_0x003c
            java.lang.Object r3 = r1.f136693c
            com.google.assistant.e.j.ek r3 = (com.google.assistant.p3897e.p3921j.C52078ek) r3
            goto L_0x003e
        L_0x003c:
            com.google.assistant.e.j.ek r3 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x003e:
            int r3 = r3.f136674b
            if (r3 != r4) goto L_0x0879
            int r3 = r1.f136692b
            if (r3 != r4) goto L_0x004b
            java.lang.Object r1 = r1.f136693c
            com.google.assistant.e.j.ek r1 = (com.google.assistant.p3897e.p3921j.C52078ek) r1
            goto L_0x004d
        L_0x004b:
            com.google.assistant.e.j.ek r1 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x004d:
            int r3 = r1.f136674b
            if (r3 != r4) goto L_0x0056
            java.lang.Object r1 = r1.f136675c
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            goto L_0x0058
        L_0x0056:
            com.google.assistant.e.j.ec r1 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0058:
            com.google.assistant.e.j.ex r0 = r0.f136685e
            if (r0 != 0) goto L_0x005e
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x005e:
            r10 = r0
            com.google.assistant.e.j.eb r0 = r1.f136655c
            if (r0 != 0) goto L_0x0065
            com.google.assistant.e.j.eb r0 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x0065:
            com.google.protobuf.cq r0 = r0.f136650a
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            java.lang.String r5 = r3.f137065b
            java.lang.String r6 = "person_result"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x006b
            com.google.assistant.e.j.ka r5 = r3.f137066c
            if (r5 != 0) goto L_0x0087
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0087:
            java.lang.String r6 = "assistant.api.dialog_state.values.Person"
            java.lang.String r5 = r5.f137060b
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x006b
            com.google.assistant.e.j.ka r0 = r3.f137066c     // Catch:{ ct -> 0x00a6 }
            if (r0 != 0) goto L_0x0097
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00a6 }
        L_0x0097:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x00a6 }
            com.google.assistant.e.j.ade r3 = com.google.assistant.p3897e.p3921j.ade.f134877h     // Catch:{ ct -> 0x00a6 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x00a6 }
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0     // Catch:{ ct -> 0x00a6 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x00a6 }
            goto L_0x00c1
        L_0x00a6:
            r0 = move-exception
            com.google.common.f.e r3 = f36469a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "ContactLookupFeatureImpl"
            r3.mo56378ag(r5, r6)
            java.lang.String r5 = "Incompatible person proto implementations."
            r6 = 42880(0xa780, float:6.0088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x00c1
        L_0x00bf:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x00c1:
            com.google.common.base.ax r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11118i.m26419d(r1)
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26592d(r10)
            com.google.common.base.ax r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26593e(r10)
            boolean r7 = r0.mo56113h()
            if (r7 != 0) goto L_0x00db
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0878
        L_0x00db:
            r7 = 36
            boolean r7 = r9.mo19521b(r7)
            r11 = 10
            if (r7 == 0) goto L_0x012f
            com.google.android.libraries.assistant.assistantactions.c.d.i r7 = r8.f36477i
            com.google.android.libraries.assistant.assistantactions.c.d.h r12 = new com.google.android.libraries.assistant.assistantactions.c.d.h
            r12.<init>()
            java.util.ArrayDeque r13 = r7.f36669b
            monitor-enter(r13)
            java.util.ArrayDeque r14 = r7.f36669b     // Catch:{ all -> 0x012c }
            r14.add(r12)     // Catch:{ all -> 0x012c }
        L_0x00f4:
            java.util.ArrayDeque r14 = r7.f36669b     // Catch:{ all -> 0x012c }
            int r14 = r14.size()     // Catch:{ all -> 0x012c }
            if (r14 <= r11) goto L_0x0102
            java.util.ArrayDeque r14 = r7.f36669b     // Catch:{ all -> 0x012c }
            r14.removeFirst()     // Catch:{ all -> 0x012c }
            goto L_0x00f4
        L_0x0102:
            monitor-exit(r13)     // Catch:{ all -> 0x012c }
            r8.f36479k = r12
            java.lang.String r7 = "feature_name"
            java.lang.Class r12 = r31.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r8.mo19611c(r7, r12)
            java.lang.String r7 = "invocation_time"
            java.text.SimpleDateFormat r12 = f36470f
            com.google.common.v.i r13 = r8.f36476h
            j$.time.Instant r13 = r13.mo57444a()
            long r13 = r13.toEpochMilli()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.String r12 = r12.format(r13)
            r8.mo19611c(r7, r12)
            goto L_0x012f
        L_0x012c:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x012c }
            throw r0
        L_0x012f:
            boolean r7 = r5.mo56113h()
            r12 = 0
            if (r7 == 0) goto L_0x0143
            java.lang.Object r7 = r5.mo56107c()
            com.google.assistant.e.i.a.ax r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51254ax) r7
            int r7 = r7.f133436a
            r7 = r7 & r2
            if (r7 == 0) goto L_0x0143
            r7 = 1
            goto L_0x0144
        L_0x0143:
            r7 = 0
        L_0x0144:
            java.lang.String r13 = "call_params"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.mo19611c(r13, r7)
            boolean r7 = r6.mo56113h()
            if (r7 == 0) goto L_0x0160
            java.lang.Object r7 = r6.mo56107c()
            com.google.assistant.e.i.a.in r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51460in) r7
            int r7 = r7.f134054a
            r7 = r7 & r2
            if (r7 == 0) goto L_0x0160
            r7 = 1
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            java.lang.String r13 = "message_params"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.mo19611c(r13, r7)
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x0185
            boolean r5 = r6.mo56113h()
            if (r5 != 0) goto L_0x0185
            java.lang.String r0 = "fulfillment_result"
            java.lang.String r1 = "fallback to server"
            r8.mo19611c(r0, r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0878
        L_0x0185:
            boolean r5 = r3.mo56113h()
            if (r5 == 0) goto L_0x01ad
            java.lang.Object r5 = r3.mo56107c()
            com.google.assistant.e.j.pf r5 = (com.google.assistant.p3897e.p3921j.C52370pf) r5
            boolean r5 = r5.f137430d
            if (r5 == 0) goto L_0x01ad
            java.lang.String r0 = "always_return_contact_lookup_result"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r8.mo19611c(r0, r1)
            java.lang.String r0 = "fulfillment_result"
            java.lang.String r1 = "fallback to server"
            r8.mo19611c(r0, r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0878
        L_0x01ad:
            java.lang.String r5 = "always_return_contact_lookup_result"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            r8.mo19611c(r5, r6)
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26592d(r10)
            com.google.common.base.ax r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e.m26593e(r10)
            com.google.assistant.e.i.a.gn r7 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
            com.google.bb.a.x r13 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            r8.f36473d = r13
            boolean r13 = r5.mo56113h()
            if (r13 == 0) goto L_0x01e7
            java.lang.Object r13 = r5.mo56107c()
            com.google.assistant.e.i.a.ax r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51254ax) r13
            int r13 = r13.f133436a
            r13 = r13 & r2
            if (r13 == 0) goto L_0x01e7
            com.google.bb.a.x r6 = com.google.p4152bb.p4153a.C55421x.PHONE_CALL_CONTACT
            r8.f36473d = r6
            java.lang.Object r5 = r5.mo56107c()
            com.google.assistant.e.i.a.ax r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51254ax) r5
            com.google.assistant.e.i.a.gn r5 = r5.f133437b
            if (r5 != 0) goto L_0x01e5
            com.google.assistant.e.i.a.gn r5 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
        L_0x01e5:
            r13 = r5
            goto L_0x020a
        L_0x01e7:
            boolean r5 = r6.mo56113h()
            if (r5 == 0) goto L_0x0209
            java.lang.Object r5 = r6.mo56107c()
            com.google.assistant.e.i.a.in r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51460in) r5
            int r5 = r5.f134054a
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0209
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.GENERIC_SEND_MESSAGE
            r8.f36473d = r5
            java.lang.Object r5 = r6.mo56107c()
            com.google.assistant.e.i.a.in r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51460in) r5
            com.google.assistant.e.i.a.gn r5 = r5.f134055b
            if (r5 != 0) goto L_0x01e5
            com.google.assistant.e.i.a.gn r5 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
            goto L_0x01e5
        L_0x0209:
            r13 = r7
        L_0x020a:
            r5 = 7
            r8.f36474e = r5
            com.google.common.base.ax r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11115f.m26404a(r13)
            boolean r7 = r6.mo56113h()
            r14 = 2
            if (r7 == 0) goto L_0x023f
            java.lang.Object r6 = r6.mo56107c()
            com.google.assistant.e.i.a.av r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r6
            int r6 = r6.f133429a
            r6 = r6 & r2
            if (r6 == 0) goto L_0x023f
            com.google.common.f.e r6 = f36469a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r15 = "ContactLookupFeatureImpl"
            r6.mo56378ag(r7, r15)
            java.lang.String r7 = "Set EndPointType to PHONE_NUMBER..."
            r15 = 42909(0xa79d, float:6.0128E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r15)).mo56386p(r7)
            r8.f36474e = r14
            com.google.android.libraries.assistant.assistantactions.c.d.a r6 = r8.f36472c
            r6.mo19635e()
        L_0x023f:
            com.google.common.base.ax r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26376i(r13)
            boolean r7 = r6.mo56113h()
            r15 = 4
            if (r7 == 0) goto L_0x02b5
            java.lang.Object r6 = r6.mo56107c()
            com.google.assistant.e.i.a.il r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r6
            int r7 = r6.f134045a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x02b5
            com.google.assistant.e.j.nk r6 = r6.f134051g
            if (r6 != 0) goto L_0x025c
            com.google.assistant.e.j.nk r6 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
        L_0x025c:
            java.lang.String r7 = r6.f137334g
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x02b5
            com.google.assistant.e.j.pj r7 = r6.f137331d
            if (r7 != 0) goto L_0x026a
            com.google.assistant.e.j.pj r7 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x026a:
            int r7 = r7.f137437b
            if (r7 != r2) goto L_0x0270
            r4 = 1
            goto L_0x02ae
        L_0x0270:
            com.google.assistant.e.j.pj r6 = r6.f137331d
            if (r6 != 0) goto L_0x0277
            com.google.assistant.e.j.pj r7 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0278
        L_0x0277:
            r7 = r6
        L_0x0278:
            int r7 = r7.f137437b
            r5 = 6
            if (r7 != r5) goto L_0x027f
            r4 = 6
            goto L_0x02ae
        L_0x027f:
            if (r6 != 0) goto L_0x0284
            com.google.assistant.e.j.pj r5 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0285
        L_0x0284:
            r5 = r6
        L_0x0285:
            int r5 = r5.f137437b
            if (r5 != r15) goto L_0x028b
            r4 = 4
            goto L_0x02ae
        L_0x028b:
            if (r6 != 0) goto L_0x0290
            com.google.assistant.e.j.pj r5 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0291
        L_0x0290:
            r5 = r6
        L_0x0291:
            int r5 = r5.f137437b
            if (r5 != r14) goto L_0x0297
            r4 = 2
            goto L_0x02ae
        L_0x0297:
            if (r6 != 0) goto L_0x029c
            com.google.assistant.e.j.pj r5 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x029d
        L_0x029c:
            r5 = r6
        L_0x029d:
            int r5 = r5.f137437b
            if (r5 != r4) goto L_0x02a2
            goto L_0x02ae
        L_0x02a2:
            if (r6 != 0) goto L_0x02a6
            com.google.assistant.e.j.pj r6 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02a6:
            int r4 = r6.f137437b
            r5 = 5
            if (r4 != r5) goto L_0x02ad
            r4 = 5
            goto L_0x02ae
        L_0x02ad:
            r4 = 7
        L_0x02ae:
            r8.f36474e = r4
            com.google.android.libraries.assistant.assistantactions.c.d.a r4 = r8.f36472c
            r4.mo19636f()
        L_0x02b5:
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0
            com.google.protobuf.cq r0 = r0.f134885g
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.assistantactions.c.b.a.r r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11127r.f36463a
            j$.util.stream.Stream r0 = r0.map(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r4)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.String r5 = "use_dis"
            r6 = 13
            boolean r7 = r9.mo19521b(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.mo19611c(r5, r7)
            boolean r5 = r9.mo19521b(r6)
            if (r5 == 0) goto L_0x0348
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11118i.m26419d(r1)
            boolean r5 = r1.mo56113h()
            if (r5 == 0) goto L_0x0324
            java.lang.Object r5 = r1.mo56107c()
            com.google.assistant.e.j.pf r5 = (com.google.assistant.p3897e.p3921j.C52370pf) r5
            com.google.assistant.e.j.pn r5 = r5.f137427a
            if (r5 == 0) goto L_0x0324
            java.lang.Object r5 = r1.mo56107c()
            com.google.assistant.e.j.pf r5 = (com.google.assistant.p3897e.p3921j.C52370pf) r5
            com.google.assistant.e.j.pn r5 = r5.f137427a
            if (r5 != 0) goto L_0x0308
            com.google.assistant.e.j.pn r5 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0308:
            int r5 = r5.f137446a
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0324
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.pf r1 = (com.google.assistant.p3897e.p3921j.C52370pf) r1
            com.google.assistant.e.j.pn r1 = r1.f137427a
            if (r1 != 0) goto L_0x0319
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0319:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x031f
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x031f:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0326
        L_0x0324:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0326:
            boolean r5 = r1.mo56113h()
            if (r5 == 0) goto L_0x0369
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.ade r1 = (com.google.assistant.p3897e.p3921j.ade) r1
            com.google.protobuf.cq r1 = r1.f134885g
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.r r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11127r.f36463a
            j$.util.stream.Stream r1 = r1.map(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r4)
            r4 = r1
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
            goto L_0x0369
        L_0x0348:
            com.google.assistant.e.j.pn r1 = r13.f133895g
            if (r1 != 0) goto L_0x034e
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x034e:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x0354
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0354:
            com.google.protobuf.cq r1 = r1.f134885g
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.r r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11127r.f36463a
            j$.util.stream.Stream r1 = r1.map(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r4)
            r4 = r1
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
        L_0x0369:
            java.lang.String r1 = "client_person_count"
            int r5 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.mo19611c(r1, r5)
            java.lang.String r1 = "server_person_count"
            int r5 = r4.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.mo19611c(r1, r5)
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            r1.mo55396h(r4)
            int r5 = r0.size()
            r7 = 0
            r16 = 0
        L_0x0391:
            if (r7 >= r5) goto L_0x06ce
            java.lang.Object r17 = r0.get(r7)
            r11 = r17
            com.google.assistant.e.j.yp r11 = (com.google.assistant.p3897e.p3921j.C52623yp) r11
            int r15 = r4.size()
            r14 = 0
            r19 = 0
        L_0x03a2:
            if (r14 >= r15) goto L_0x0694
            java.lang.Object r20 = r4.get(r14)
            r2 = r20
            com.google.assistant.e.j.yp r2 = (com.google.assistant.p3897e.p3921j.C52623yp) r2
            com.google.protobuf.cq r6 = r11.f138166c
            com.google.protobuf.cq r12 = r2.f138166c
            boolean r22 = r6.isEmpty()
            if (r22 != 0) goto L_0x0673
            boolean r22 = r12.isEmpty()
            if (r22 == 0) goto L_0x03cb
            r22 = r0
        L_0x03be:
            r30 = r3
            r25 = r4
            r27 = r5
            r29 = r15
        L_0x03c6:
            r0 = 0
            r17 = 4
            goto L_0x0680
        L_0x03cb:
            r22 = r0
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            java.lang.String r6 = r6.f138158c
            java.lang.Object r12 = r12.get(r0)
            com.google.assistant.e.j.yn r12 = (com.google.assistant.p3897e.p3921j.C52621yn) r12
            java.lang.String r0 = r12.f138158c
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x0675
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0675
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x03f1
            goto L_0x03be
        L_0x03f1:
            com.google.protobuf.cq r0 = r11.f138169f
            com.google.protobuf.cq r6 = r2.f138169f
            java.util.Iterator r0 = r0.iterator()
        L_0x03f9:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0527
            java.lang.Object r12 = r0.next()
            com.google.assistant.e.j.yv r12 = (com.google.assistant.p3897e.p3921j.C52629yv) r12
            java.util.Iterator r23 = r6.iterator()
            r24 = 0
        L_0x040b:
            boolean r25 = r23.hasNext()
            if (r25 == 0) goto L_0x0509
            java.lang.Object r25 = r23.next()
            r26 = r0
            r0 = r25
            com.google.assistant.e.j.yv r0 = (com.google.assistant.p3897e.p3921j.C52629yv) r0
            r25 = r4
            r4 = 13
            boolean r20 = r9.mo19521b(r4)
            r21 = 1
            r20 = r20 ^ 1
            int r4 = r12.f138182a
            r18 = 2
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0437
            int r4 = r0.f138182a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0437
            r4 = 1
            goto L_0x0438
        L_0x0437:
            r4 = 0
        L_0x0438:
            if (r4 == 0) goto L_0x044a
            r27 = r5
            java.lang.String r5 = r12.f138184c
            r28 = r6
            java.lang.String r6 = r0.f138184c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x044e
            r5 = 1
            goto L_0x044f
        L_0x044a:
            r27 = r5
            r28 = r6
        L_0x044e:
            r5 = 0
        L_0x044f:
            int r6 = r12.f138182a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0469
            int r6 = r0.f138182a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0469
            java.lang.String r6 = r12.f138186e
            r29 = r15
            java.lang.String r15 = r0.f138186e
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L_0x046b
            r6 = 1
            goto L_0x046c
        L_0x0469:
            r29 = r15
        L_0x046b:
            r6 = 0
        L_0x046c:
            int r15 = r12.f138182a
            r17 = 4
            r15 = r15 & 4
            if (r15 == 0) goto L_0x04f6
            int r15 = r0.f138182a
            r15 = r15 & 4
            if (r15 == 0) goto L_0x04f6
            java.lang.String r15 = r12.f138185d
            r30 = r3
            java.lang.String r3 = r0.f138185d
            boolean r3 = r15.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x04f8
            if (r4 == 0) goto L_0x04f8
            if (r5 != 0) goto L_0x048c
            if (r6 == 0) goto L_0x04f8
        L_0x048c:
            if (r20 == 0) goto L_0x04f4
            com.google.assistant.e.j.yr r3 = r12.f138183b
            if (r3 != 0) goto L_0x0494
            com.google.assistant.e.j.yr r3 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x0494:
            com.google.assistant.e.j.yd r3 = r3.f138174c
            if (r3 != 0) goto L_0x049a
            com.google.assistant.e.j.yd r3 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x049a:
            com.google.protobuf.cq r3 = r3.f138137a
            com.google.assistant.e.j.yr r0 = r0.f138183b
            if (r0 != 0) goto L_0x04a2
            com.google.assistant.e.j.yr r0 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x04a2:
            com.google.assistant.e.j.yd r0 = r0.f138174c
            if (r0 != 0) goto L_0x04a8
            com.google.assistant.e.j.yd r0 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x04a8:
            com.google.protobuf.cq r0 = r0.f138137a
            java.util.Iterator r3 = r3.iterator()
        L_0x04ae:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04f4
            java.lang.Object r4 = r3.next()
            com.google.assistant.e.j.yz r4 = (com.google.assistant.p3897e.p3921j.C52633yz) r4
            java.util.Iterator r5 = r0.iterator()
            r6 = 0
        L_0x04bf:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x04ec
            java.lang.Object r15 = r5.next()
            com.google.assistant.e.j.yz r15 = (com.google.assistant.p3897e.p3921j.C52633yz) r15
            r20 = r0
            int r0 = r4.f138194a
            r18 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x04e9
            int r0 = r15.f138194a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x04e9
            java.lang.String r0 = r4.f138196c
            java.lang.String r15 = r15.f138196c
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x04e9
            r0 = r20
            r6 = 1
            goto L_0x04bf
        L_0x04e9:
            r0 = r20
            goto L_0x04bf
        L_0x04ec:
            r20 = r0
            if (r6 != 0) goto L_0x04f1
            goto L_0x04f8
        L_0x04f1:
            r0 = r20
            goto L_0x04ae
        L_0x04f4:
            r0 = 1
            goto L_0x04f9
        L_0x04f6:
            r30 = r3
        L_0x04f8:
            r0 = 0
        L_0x04f9:
            r24 = r0 | r24
            r4 = r25
            r0 = r26
            r5 = r27
            r6 = r28
            r15 = r29
            r3 = r30
            goto L_0x040b
        L_0x0509:
            r26 = r0
            r30 = r3
            r25 = r4
            r27 = r5
            r28 = r6
            r29 = r15
            if (r24 != 0) goto L_0x0519
            goto L_0x03c6
        L_0x0519:
            r4 = r25
            r0 = r26
            r5 = r27
            r6 = r28
            r15 = r29
            r3 = r30
            goto L_0x03f9
        L_0x0527:
            r30 = r3
            r25 = r4
            r27 = r5
            r29 = r15
            com.google.assistant.e.j.yt r0 = r11.f138165b
            if (r0 != 0) goto L_0x0535
            com.google.assistant.e.j.yt r0 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x0535:
            com.google.protobuf.cq r0 = r0.f138179b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x066f
            com.google.assistant.e.j.yt r0 = r11.f138165b
            if (r0 != 0) goto L_0x0543
            com.google.assistant.e.j.yt r0 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x0543:
            com.google.protobuf.cq r0 = r0.f138179b
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.assistant.e.j.yj r0 = (com.google.assistant.p3897e.p3921j.C52617yj) r0
            com.google.protobuf.cq r0 = r0.f138148a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x066f
            r0 = 10
            r9.mo19521b(r0)
            boolean r3 = r9.mo19521b(r0)
            if (r3 == 0) goto L_0x067d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.protobuf.cq r4 = r11.f138169f
            java.util.Iterator r4 = r4.iterator()
        L_0x056a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0588
            java.lang.Object r5 = r4.next()
            com.google.assistant.e.j.yv r5 = (com.google.assistant.p3897e.p3921j.C52629yv) r5
            com.google.assistant.e.j.yr r5 = r5.f138183b
            if (r5 != 0) goto L_0x057c
            com.google.assistant.e.j.yr r5 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x057c:
            com.google.assistant.e.j.yd r5 = r5.f138174c
            if (r5 != 0) goto L_0x0582
            com.google.assistant.e.j.yd r5 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x0582:
            com.google.protobuf.cq r5 = r5.f138137a
            r3.addAll(r5)
            goto L_0x056a
        L_0x0588:
            com.google.assistant.e.j.yt r4 = r11.f138165b
            if (r4 != 0) goto L_0x058e
            com.google.assistant.e.j.yt r4 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x058e:
            com.google.protobuf.cq r4 = r4.f138179b
            java.util.Iterator r4 = r4.iterator()
        L_0x0594:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05a6
            java.lang.Object r5 = r4.next()
            com.google.assistant.e.j.yj r5 = (com.google.assistant.p3897e.p3921j.C52617yj) r5
            com.google.protobuf.cq r5 = r5.f138148a
            r3.addAll(r5)
            goto L_0x0594
        L_0x05a6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.assistant.e.j.yt r2 = r2.f138165b
            if (r2 != 0) goto L_0x05b1
            com.google.assistant.e.j.yt r2 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x05b1:
            com.google.protobuf.cq r2 = r2.f138179b
            java.util.Iterator r2 = r2.iterator()
        L_0x05b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05c9
            java.lang.Object r5 = r2.next()
            com.google.assistant.e.j.yj r5 = (com.google.assistant.p3897e.p3921j.C52617yj) r5
            com.google.protobuf.cq r5 = r5.f138148a
            r4.addAll(r5)
            goto L_0x05b7
        L_0x05c9:
            int r2 = r3.size()
            r5 = 0
        L_0x05ce:
            if (r5 >= r2) goto L_0x066f
            java.lang.Object r6 = r3.get(r5)
            com.google.assistant.e.j.yz r6 = (com.google.assistant.p3897e.p3921j.C52633yz) r6
            int r12 = r6.f138194a
            r15 = 4
            r12 = r12 & r15
            if (r12 == 0) goto L_0x065b
            int r12 = r4.size()
            r0 = 0
        L_0x05e1:
            if (r0 >= r12) goto L_0x067d
            java.lang.Object r17 = r4.get(r0)
            r20 = r2
            r2 = r17
            com.google.assistant.e.j.yz r2 = (com.google.assistant.p3897e.p3921j.C52633yz) r2
            r23 = r3
            int r3 = r6.f138194a
            r3 = r3 & r15
            if (r3 != 0) goto L_0x05f8
            r24 = r4
            r3 = 0
            goto L_0x05fb
        L_0x05f8:
            r24 = r4
            r3 = 1
        L_0x05fb:
            int r4 = r2.f138194a
            r4 = r4 & r15
            if (r4 != 0) goto L_0x0602
            r15 = 0
            goto L_0x0603
        L_0x0602:
            r15 = 1
        L_0x0603:
            if (r3 != r15) goto L_0x0607
            r3 = 1
            goto L_0x0608
        L_0x0607:
            r3 = 0
        L_0x0608:
            if (r4 == 0) goto L_0x064c
            com.google.assistant.e.j.yf r3 = r6.f138197d
            if (r3 != 0) goto L_0x0610
            com.google.assistant.e.j.yf r3 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0610:
            com.google.assistant.e.j.yf r2 = r2.f138197d
            if (r2 != 0) goto L_0x0616
            com.google.assistant.e.j.yf r2 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0616:
            int r4 = r3.f138140a
            r15 = 1
            r4 = r4 & r15
            if (r4 == 0) goto L_0x062d
            int r4 = r2.f138140a
            r4 = r4 & r15
            if (r4 == 0) goto L_0x062d
            java.lang.String r4 = r3.f138141b
            java.lang.String r15 = r2.f138141b
            boolean r4 = r4.equals(r15)
            if (r4 == 0) goto L_0x062d
            r4 = 1
            goto L_0x062e
        L_0x062d:
            r4 = 0
        L_0x062e:
            int r15 = r3.f138140a
            r17 = 4
            r15 = r15 & 4
            if (r15 == 0) goto L_0x064a
            int r15 = r2.f138140a
            r15 = r15 & 4
            if (r15 == 0) goto L_0x064a
            java.lang.String r3 = r3.f138143d
            java.lang.String r2 = r2.f138143d
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x064a
            if (r4 == 0) goto L_0x064a
            r3 = 1
            goto L_0x064e
        L_0x064a:
            r3 = 0
            goto L_0x064e
        L_0x064c:
            r17 = 4
        L_0x064e:
            int r0 = r0 + 1
            if (r3 == 0) goto L_0x0653
            goto L_0x0663
        L_0x0653:
            r2 = r20
            r3 = r23
            r4 = r24
            r15 = 4
            goto L_0x05e1
        L_0x065b:
            r20 = r2
            r23 = r3
            r24 = r4
            r17 = 4
        L_0x0663:
            int r5 = r5 + 1
            r2 = r20
            r3 = r23
            r4 = r24
            r0 = 10
            goto L_0x05ce
        L_0x066f:
            r17 = 4
            r0 = 1
            goto L_0x0680
        L_0x0673:
            r22 = r0
        L_0x0675:
            r30 = r3
            r25 = r4
            r27 = r5
            r29 = r15
        L_0x067d:
            r17 = 4
            r0 = 0
        L_0x0680:
            r19 = r0 | r19
            int r14 = r14 + 1
            r0 = r22
            r4 = r25
            r5 = r27
            r15 = r29
            r3 = r30
            r2 = 1
            r6 = 13
            r12 = 0
            goto L_0x03a2
        L_0x0694:
            r22 = r0
            r30 = r3
            r25 = r4
            r27 = r5
            r17 = 4
            if (r19 != 0) goto L_0x06ba
            com.google.common.f.e r0 = f36469a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ContactLookupFeatureImpl"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "person is unknown"
            r3 = 42892(0xa78c, float:6.0104E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            r1.mo55395g(r11)
            r16 = 1
        L_0x06ba:
            int r7 = r7 + 1
            r0 = r22
            r4 = r25
            r5 = r27
            r3 = r30
            r2 = 1
            r6 = 13
            r11 = 10
            r12 = 0
            r14 = 2
            r15 = 4
            goto L_0x0391
        L_0x06ce:
            r30 = r3
            java.lang.String r0 = "has_unknown_person_on_client"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            r8.mo19611c(r0, r2)
            if (r16 != 0) goto L_0x06f4
            com.google.android.libraries.assistant.assistantactions.c.d.a r0 = r8.f36472c
            r0.mo19639i()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            r1 = r31
            r2 = r10
            r3 = r13
            r4 = r34
            r5 = r32
            com.google.common.base.ax r0 = r1.mo19610b(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0878
        L_0x06f4:
            r0 = 12
            boolean r0 = r9.mo19521b(r0)
            if (r0 == 0) goto L_0x0856
            boolean r0 = r30.mo56113h()
            if (r0 == 0) goto L_0x0856
            int r0 = r8.f36474e
            if (r0 == 0) goto L_0x0854
            r2 = 7
            if (r0 == r2) goto L_0x0856
            com.google.common.b.gu r0 = r1.mo55394f()
            java.lang.Object r1 = r30.mo56107c()
            com.google.assistant.e.j.pf r1 = (com.google.assistant.p3897e.p3921j.C52370pf) r1
            com.google.assistant.e.j.pn r1 = r1.f137427a
            if (r1 != 0) goto L_0x0719
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0719:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x071f
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x071f:
            java.lang.String r11 = r1.f134883e
            com.google.common.v.i r1 = r8.f36476h
            java.lang.String r2 = r13.f133905q
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x076b
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "fa-contactlookup"
            r5 = 0
            r3[r5] = r4
            j$.time.Instant r1 = r1.mo57444a()
            long r4 = r1.toEpochMilli()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "%s-%d"
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            com.google.protobuf.bn r2 = r13.toBuilder()
            com.google.assistant.e.i.a.fy r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51390fy) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.i.a.gn r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r3
            r1.getClass()
            int r4 = r3.f133889a
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r5
            r3.f133889a = r4
            r3.f133905q = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.i.a.gn r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r1
            goto L_0x076c
        L_0x076b:
            r1 = r13
        L_0x076c:
            java.lang.String r12 = r1.f133905q
            java.lang.Object r1 = r30.mo56107c()
            com.google.assistant.e.j.pf r1 = (com.google.assistant.p3897e.p3921j.C52370pf) r1
            com.google.android.libraries.assistant.assistantactions.c.d.e r14 = new com.google.android.libraries.assistant.assistantactions.c.d.e
            r14.<init>()
            java.lang.String r2 = ""
            r14.f36653b = r2
            java.lang.String r2 = ""
            r14.f36654c = r2
            java.lang.String r2 = ""
            r14.f36655d = r2
            java.lang.String r2 = ""
            r14.f36656e = r2
            if (r12 == 0) goto L_0x084c
            r14.f36652a = r12
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.assistantactions.c.b.a.j r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11119j.f36441a
            j$.util.stream.Stream r0 = r0.filter(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r2)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.assistant.e.j.pn r3 = r1.f137427a
            if (r3 != 0) goto L_0x07aa
            com.google.assistant.e.j.pn r4 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
            goto L_0x07ab
        L_0x07aa:
            r4 = r3
        L_0x07ab:
            int r4 = r4.f137446a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x07d1
            if (r3 != 0) goto L_0x07b5
            com.google.assistant.e.j.pn r3 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x07b5:
            com.google.assistant.e.c.c.gh r1 = r3.f137451f
            if (r1 != 0) goto L_0x07bb
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x07bb:
            int r3 = r1.f133012b
            r4 = 1
            if (r3 != r4) goto L_0x07c5
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x07c7
        L_0x07c5:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x07c7:
            java.lang.String r1 = r1.f132944b
            r2.mo55395g(r1)
            com.google.common.b.gu r1 = r2.mo55394f()
            goto L_0x07ec
        L_0x07d1:
            com.google.protobuf.cq r1 = r1.f137428b
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.g r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11116g.f36438a
            j$.util.stream.Stream r1 = r1.map(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2.mo55396h(r1)
            com.google.common.b.gu r1 = r2.mo55394f()
        L_0x07ec:
            r5 = r1
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.google.android.libraries.assistant.assistantactions.c.d.b r1 = r8.f36471b
            com.google.bb.a.x r2 = r8.f36473d
            com.google.common.util.concurrent.cx r7 = r1.mo19657a(r11, r2, r0, r12)
            com.google.android.libraries.assistant.assistantactions.c.b.a.k r6 = new com.google.android.libraries.assistant.assistantactions.c.b.a.k
            r1 = r6
            r2 = r31
            r3 = r14
            r4 = r11
            r9 = r6
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.da r1 = r8.f36475g
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93045h(r7, r9, r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.l r7 = new com.google.android.libraries.assistant.assistantactions.c.b.a.l
            r1 = r7
            r4 = r0
            r5 = r15
            r6 = r11
            r0 = r7
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.da r1 = r8.f36475g
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r9, r0, r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.m r7 = new com.google.android.libraries.assistant.assistantactions.c.b.a.m
            r1 = r7
            r4 = r15
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.da r1 = r8.f36475g
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r7, r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.n r1 = new com.google.android.libraries.assistant.assistantactions.c.b.a.n
            r1.<init>(r8, r14)
            com.google.common.util.concurrent.da r2 = r8.f36475g
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.libraries.assistant.assistantactions.c.b.a.s r7 = new com.google.android.libraries.assistant.assistantactions.c.b.a.s
            r1 = r7
            r2 = r31
            r3 = r10
            r4 = r13
            r5 = r34
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.da r1 = r8.f36475g
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r7, r1)
            goto L_0x0878
        L_0x084c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sessionId"
            r0.<init>(r1)
            throw r0
        L_0x0854:
            r0 = 0
            throw r0
        L_0x0856:
            com.google.common.f.e r0 = f36469a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ContactLookupFeatureImpl"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Failed to disambiguate contact (AUM not enabled), fallback to server"
            r2 = 42890(0xa78a, float:6.0102E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.String r0 = "fulfillment_result"
            java.lang.String r1 = "fallback to server"
            r8.mo19611c(r0, r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0878:
            return r0
        L_0x0879:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11129t.mo19605d(android.content.Context, com.google.assistant.e.j.en, com.google.android.libraries.assistant.assistantactions.b.a):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        return C11203a.m26544b(this, context, ffVar, uhVar, exVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}
