package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16633ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ap */
/* compiled from: PG */
public final class C16683ap implements C16702r {

    /* renamed from: a */
    public static final /* synthetic */ int f48835a = 0;

    /* renamed from: b */
    private static final C59071e f48836b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ap");

    /* renamed from: c */
    private static final int[] f48837c = {135874, 135875, 135876};

    /* renamed from: d */
    private static final C58495hd f48838d;

    /* renamed from: e */
    private static final C58495hd f48839e;

    /* renamed from: f */
    private static final C58528ij f48840f = C58528ij.m90012L(C51936ep.MESSAGE, C51936ep.READ_MESSAGE, C51936ep.REPLY_MESSAGE);

    /* renamed from: g */
    private final Context f48841g;

    static {
        C58490gz gzVar = new C58490gz(4);
        C13529e eVar = C13529e.SHARE_LOCATION;
        Integer valueOf = Integer.valueOf(R.drawable.quantum_gm_ic_my_location_gm_blue300_48);
        C16633ae aeVar = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar.copyOnWrite();
        C16636ah ahVar = (C16636ah) aeVar.instance;
        ahVar.f48729b = 2;
        ahVar.f48728a |= 1;
        gzVar.mo55429h(eVar, new C16693i(141561, valueOf, (C16636ah) aeVar.build()));
        C13529e eVar2 = C13529e.SHARE_ETA;
        Integer valueOf2 = Integer.valueOf(R.drawable.quantum_gm_ic_share_eta_gm_blue300_48);
        C16633ae aeVar2 = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar2.copyOnWrite();
        C16636ah ahVar2 = (C16636ah) aeVar2.instance;
        ahVar2.f48729b = 2;
        ahVar2.f48728a |= 1;
        gzVar.mo55429h(eVar2, new C16693i(141562, valueOf2, (C16636ah) aeVar2.build()));
        C13529e eVar3 = C13529e.CALL_SENDER;
        Integer valueOf3 = Integer.valueOf(R.drawable.product_logo_dialer_color_48);
        C16633ae aeVar3 = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar3.copyOnWrite();
        C16636ah ahVar3 = (C16636ah) aeVar3.instance;
        ahVar3.f48729b = 2;
        ahVar3.f48728a |= 1;
        gzVar.mo55429h(eVar3, new C16693i(143383, valueOf3, (C16636ah) aeVar3.build()));
        C13529e eVar4 = C13529e.CALL_NUMBER;
        C16633ae aeVar4 = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar4.copyOnWrite();
        C16636ah ahVar4 = (C16636ah) aeVar4.instance;
        ahVar4.f48729b = 2;
        ahVar4.f48728a |= 1;
        gzVar.mo55429h(eVar4, new C16693i(146686, valueOf3, (C16636ah) aeVar4.build()));
        C13529e eVar5 = C13529e.NAVIGATE;
        Integer valueOf4 = Integer.valueOf(R.drawable.quantum_gm_ic_navigation_gm_blue300_48);
        C16633ae aeVar5 = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar5.copyOnWrite();
        C16636ah ahVar5 = (C16636ah) aeVar5.instance;
        ahVar5.f48729b = 2;
        ahVar5.f48728a |= 1;
        gzVar.mo55429h(eVar5, new C16693i(150326, valueOf4, (C16636ah) aeVar5.build()));
        f48838d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("reply_button_id", 136364);
        gzVar2.mo55429h("custom_reply_button_id", 136364);
        gzVar2.mo55429h("confirmation_button_id", 136369);
        gzVar2.mo55429h("change_button_id", 136368);
        f48839e = gzVar2.mo55427f(false);
    }

    public C16683ap(Context context) {
        this.f48841g = context;
    }

    /* renamed from: b */
    private static C16662b m33741b(C16662b bVar, C51953ff ffVar, C16724al alVar) {
        C12989g a = C12989g.m29225a(alVar.f48918r);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a != C12989g.MORRIS) {
            return bVar;
        }
        if (bVar != null) {
            C16627a aVar = (C16627a) bVar.toBuilder();
            aVar.copyOnWrite();
            C16662b bVar2 = (C16662b) aVar.instance;
            ffVar.getClass();
            bVar2.f48811j = ffVar;
            bVar2.f48802a |= 8;
            return (C16662b) aVar.build();
        } else if (ffVar.equals(C51953ff.f136315l)) {
            return null;
        } else {
            C16627a aVar2 = (C16627a) C16662b.f48800l.createBuilder();
            aVar2.copyOnWrite();
            C16662b bVar3 = (C16662b) aVar2.instance;
            ffVar.getClass();
            bVar3.f48811j = ffVar;
            bVar3.f48802a |= 8;
            return (C16662b) aVar2.build();
        }
    }

    /* renamed from: c */
    private static C16651p m33742c(Optional optional) {
        if (optional.isPresent()) {
            C16650o oVar = (C16650o) C16651p.f48768c.createBuilder();
            String str = (String) optional.get();
            oVar.copyOnWrite();
            C16651p pVar = (C16651p) oVar.instance;
            str.getClass();
            pVar.f48770a = 4;
            pVar.f48771b = str;
            return (C16651p) oVar.build();
        }
        C16650o oVar2 = (C16650o) C16651p.f48768c.createBuilder();
        oVar2.copyOnWrite();
        C16651p pVar2 = (C16651p) oVar2.instance;
        pVar2.f48770a = 2;
        pVar2.f48771b = Integer.valueOf(R.drawable.quantum_ic_account_circle_white_48);
        return (C16651p) oVar2.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x037d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p3186j$.util.Optional m33744e(com.google.assistant.p3897e.p3902c.p3907c.C50969bn r16, com.google.assistant.p3897e.p3902c.p3907c.C50965bj r17, com.google.assistant.p3897e.p3921j.p3926e.C51936ep r18, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r3
            int r4 = r1.f132673b
            r5 = 3
            if (r4 != r5) goto L_0x03fc
            int r4 = r0.f132680a
            r6 = 4
            r4 = r4 & r6
            if (r4 == 0) goto L_0x03fc
            java.lang.Object r4 = r1.f132674c
            com.google.assistant.e.c.c.hx r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r4
            int r7 = r4.f133122b
            java.lang.String r8 = ""
            r9 = 1
            if (r7 != r9) goto L_0x0029
            java.lang.Object r4 = r4.f133123c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x002a
        L_0x0029:
            r4 = r8
        L_0x002a:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r7
            int r10 = r1.f132673b
            if (r10 != r5) goto L_0x003b
            java.lang.Object r10 = r1.f132674c
            com.google.assistant.e.c.c.hx r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r10
            goto L_0x003d
        L_0x003b:
            com.google.assistant.e.c.c.hx r10 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x003d:
            int r10 = r10.f133121a
            r10 = r10 & 16
            r11 = 2
            if (r10 == 0) goto L_0x0084
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            int r12 = r1.f132673b
            if (r12 != r5) goto L_0x0055
            java.lang.Object r1 = r1.f132674c
            com.google.assistant.e.c.c.hx r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r1
            goto L_0x0057
        L_0x0055:
            com.google.assistant.e.c.c.hx r1 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0057:
            com.google.assistant.e.c.c.dc r1 = r1.f133126f
            if (r1 != 0) goto L_0x005d
            com.google.assistant.e.c.c.dc r1 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x005d:
            java.lang.String r1 = r1.f132817c
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r5
            r1.getClass()
            r5.f48770a = r9
            r5.f48771b = r1
            com.google.protobuf.bv r1 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r1
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r5
            r1.getClass()
            r5.f48777c = r1
            int r1 = r5.f48775a
            r1 = r1 | r11
            r5.f48775a = r1
        L_0x0084:
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r4)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r1 = m33742c(r1)
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r5
            r1.getClass()
            r5.f48778d = r1
            int r1 = r5.f48775a
            r1 = r1 | r6
            r5.f48775a = r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m.f48760f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.l r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16647l) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r5
            r4.getClass()
            int r10 = r5.f48762a
            r10 = r10 | r9
            r5.f48762a = r10
            r5.f48763b = r4
            com.google.protobuf.bv r4 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r5
            r4.getClass()
            r5.f48764c = r4
            int r4 = r5.f48762a
            r4 = r4 | r6
            r5.f48762a = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            r3.mo22943b(r1)
            r7.clear()
            com.google.assistant.e.c.c.du r0 = r0.f132683d
            if (r0 != 0) goto L_0x00df
            com.google.assistant.e.c.c.du r0 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x00df:
            com.google.protobuf.cq r0 = r0.f132875f
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r4 = 0
        L_0x00e7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03e3
            java.lang.Object r5 = r0.next()
            com.google.assistant.e.c.c.dr r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r5
            int r4 = r4 + r9
            int r10 = r5.f132855b
            if (r10 == r11) goto L_0x00fc
            r13 = r19
            goto L_0x03e0
        L_0x00fc:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.z r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z) r10
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u.f48779f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.t r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16655t) r12
            int r13 = r5.f132855b
            if (r13 != r11) goto L_0x0115
            java.lang.Object r13 = r5.f132856c
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0116
        L_0x0115:
            r13 = r8
        L_0x0116:
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r14
            r13.getClass()
            r14.f48722b = r9
            r14.f48723c = r13
            com.google.protobuf.bv r13 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r13
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r14
            r13.getClass()
            r14.f48782b = r13
            int r13 = r14.f48781a
            r13 = r13 | r9
            r14.f48781a = r13
            int r13 = r5.f132854a
            r13 = r13 & 16
            if (r13 == 0) goto L_0x0169
            java.lang.String r13 = r5.f132861h
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r14
            r13.getClass()
            r14.f48722b = r9
            r14.f48723c = r13
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r10
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r13
            r10.getClass()
            r13.f48783c = r10
            int r10 = r13.f48781a
            r10 = r10 | r11
            r13.f48781a = r10
            goto L_0x019e
        L_0x0169:
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r13
            int r14 = r13.f48722b
            if (r14 != r9) goto L_0x0179
            r13.f48722b = r1
            r14 = 0
            r13.f48723c = r14
        L_0x0179:
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r13
            r13.f48724d = r11
            int r14 = r13.f48721a
            r14 = r14 | r6
            r13.f48721a = r14
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r10
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r13
            r10.getClass()
            r13.f48783c = r10
            int r10 = r13.f48781a
            r10 = r10 | r11
            r13.f48781a = r10
        L_0x019e:
            int r10 = r5.f132855b
            if (r10 != r11) goto L_0x01a7
            java.lang.Object r10 = r5.f132856c
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x01a8
        L_0x01a7:
            r10 = r8
        L_0x01a8:
            int r13 = r10.hashCode()
            r14 = 2255103(0x2268ff, float:3.160072E-39)
            if (r13 == r14) goto L_0x01c1
            r14 = 2702129(0x293b31, float:3.786489E-39)
            if (r13 == r14) goto L_0x01b7
            goto L_0x01cb
        L_0x01b7:
            java.lang.String r13 = "Work"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x01cb
            r10 = 1
            goto L_0x01cc
        L_0x01c1:
            java.lang.String r13 = "Home"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x01cb
            r10 = 0
            goto L_0x01cc
        L_0x01cb:
            r10 = -1
        L_0x01cc:
            if (r10 == 0) goto L_0x026f
            if (r10 == r9) goto L_0x023d
            com.google.assistant.e.j.e.ep r10 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x020b
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r13.f48770a = r11
            r14 = 2131234078(0x7f080d1e, float:1.8084312E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f48771b = r14
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r7.copyOnWrite()
            com.google.protobuf.bv r13 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r13
            r10.getClass()
            r13.f48777c = r10
            int r10 = r13.f48775a
            r10 = r10 | r11
            r13.f48775a = r10
            goto L_0x02a0
        L_0x020b:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r13.f48770a = r11
            r14 = 2131234636(0x7f080f4c, float:1.8085443E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f48771b = r14
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r7.copyOnWrite()
            com.google.protobuf.bv r13 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r13
            r10.getClass()
            r13.f48777c = r10
            int r10 = r13.f48775a
            r10 = r10 | r11
            r13.f48775a = r10
            goto L_0x02a0
        L_0x023d:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r13.f48770a = r11
            r14 = 2131235251(0x7f0811b3, float:1.808669E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f48771b = r14
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r7.copyOnWrite()
            com.google.protobuf.bv r13 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r13
            r10.getClass()
            r13.f48777c = r10
            int r10 = r13.f48775a
            r10 = r10 | r11
            r13.f48775a = r10
            goto L_0x02a0
        L_0x026f:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r13.f48770a = r11
            r14 = 2131234229(0x7f080db5, float:1.8084618E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f48771b = r14
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r7.copyOnWrite()
            com.google.protobuf.bv r13 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r13
            r10.getClass()
            r13.f48777c = r10
            int r10 = r13.f48775a
            r10 = r10 | r11
            r13.f48775a = r10
        L_0x02a0:
            com.google.protobuf.bv r10 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r10
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r13
            r10.getClass()
            r13.f48784d = r10
            int r10 = r13.f48781a
            r10 = r10 | r6
            r13.f48781a = r10
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r10
            int r13 = r5.f132857d
            if (r13 != r6) goto L_0x02c8
            java.lang.Object r13 = r5.f132858e
            com.google.assistant.e.c.c.dg r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r13
            goto L_0x02ca
        L_0x02c8:
            com.google.assistant.e.c.c.dg r13 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x02ca:
            int r13 = r13.f132829a
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0311
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r13
            int r14 = r5.f132857d
            if (r14 != r6) goto L_0x02e1
            java.lang.Object r5 = r5.f132858e
            com.google.assistant.e.c.c.dg r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r5
            goto L_0x02e3
        L_0x02e1:
            com.google.assistant.e.c.c.dg r5 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x02e3:
            com.google.assistant.e.j.du r5 = r5.f132833e
            if (r5 != 0) goto L_0x02e9
            com.google.assistant.e.j.du r5 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x02e9:
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r14
            r5.getClass()
            r14.f49077c = r5
            r14.f49076b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            com.google.protobuf.bv r13 = r13.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r13
            r13.getClass()
            r5.f48966b = r13
            int r13 = r5.f48965a
            r13 = r13 | r9
            r5.f48965a = r13
            r13 = r19
            goto L_0x0369
        L_0x0311:
            com.google.assistant.e.j.e.ep r13 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x0328
            r13 = r19
            boolean r14 = r13.f48915o
            if (r14 == 0) goto L_0x032a
            int r14 = r5.f132854a
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0326
            goto L_0x032a
        L_0x0326:
            r14 = 1
            goto L_0x032b
        L_0x0328:
            r13 = r19
        L_0x032a:
            r14 = 0
        L_0x032b:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r15 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r15 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r15
            if (r14 == 0) goto L_0x033a
            java.lang.String r5 = java.lang.String.valueOf(r4)
            goto L_0x0344
        L_0x033a:
            int r14 = r5.f132855b
            if (r14 != r11) goto L_0x0343
            java.lang.Object r5 = r5.f132856c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0344
        L_0x0343:
            r5 = r8
        L_0x0344:
            r15.copyOnWrite()
            com.google.protobuf.bv r14 = r15.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r14
            r5.getClass()
            r14.f49076b = r9
            r14.f49077c = r5
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            com.google.protobuf.bv r14 = r15.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r14
            r14.getClass()
            r5.f48966b = r14
            int r14 = r5.f48965a
            r14 = r14 | r9
            r5.f48965a = r14
        L_0x0369:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r5
            com.google.assistant.e.j.e.ep r14 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            boolean r14 = r14.equals(r2)
            if (r9 == r14) goto L_0x037d
            r14 = 146286(0x23b6e, float:2.0499E-40)
            goto L_0x0380
        L_0x037d:
            r14 = 153777(0x258b1, float:2.15487E-40)
        L_0x0380:
            r5.copyOnWrite()
            com.google.protobuf.bv r15 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r15 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r15
            int r1 = r15.f48978a
            r1 = r1 | r9
            r15.f48978a = r1
            r15.f48979b = r14
            com.google.protobuf.bv r1 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r1
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            r1.getClass()
            r5.f48968d = r1
            int r1 = r5.f48965a
            r1 = r1 | r6
            r5.f48965a = r1
            com.google.protobuf.bv r1 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r5
            r1.getClass()
            r5.f48785e = r1
            int r1 = r5.f48781a
            r1 = r1 | 8
            r5.f48781a = r1
            com.google.protobuf.bv r1 = r12.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r5
            r1.getClass()
            com.google.protobuf.cq r10 = r5.f48807f
            boolean r12 = r10.mo58948c()
            if (r12 != 0) goto L_0x03db
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)
            r5.f48807f = r10
        L_0x03db:
            com.google.protobuf.cq r5 = r5.f48807f
            r5.add(r1)
        L_0x03e0:
            r1 = 0
            goto L_0x00e7
        L_0x03e3:
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            int r1 = r0.f48802a
            r1 = r1 | r9
            r0.f48802a = r1
            r0.f48803b = r9
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            return r0
        L_0x03fc:
            com.google.common.f.e r0 = f48836b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Contact header is missing either selectedContact or disambiguationList and cannot be rendered."
            r2 = 46807(0xb6d7, float:6.559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16683ap.m33744e(com.google.assistant.e.c.c.bn, com.google.assistant.e.c.c.bj, com.google.assistant.e.j.e.ep, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.al):j$.util.Optional");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r5 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16342ap.m33337a(((com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar) r2.get(0)).f48118c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0844, code lost:
        if ((r13.f132815a & 32) != 0) goto L_0x0846;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p3186j$.util.Optional m33745f(com.google.assistant.p3897e.p3921j.p3926e.C51941eu r19, java.util.List r20, com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16665d r21, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al r22, com.google.assistant.p3897e.p3921j.p3926e.C51936ep r23, java.lang.String r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r4 = r22
            r5 = r23
            int r2 = r1.f136277e
            r3 = 16
            if (r2 != r3) goto L_0x0013
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.bn r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r1
            goto L_0x0015
        L_0x0013:
            com.google.assistant.e.c.c.bn r1 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x0015:
            com.google.assistant.e.c.c.bj r2 = r1.f132682c
            if (r2 != 0) goto L_0x001b
            com.google.assistant.e.c.c.bj r2 = com.google.assistant.p3897e.p3902c.p3907c.C50965bj.f132670e
        L_0x001b:
            int r6 = r2.f132675d
            int r7 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            r8 = 3
            r10 = 6
            java.lang.String r11 = ""
            r12 = 0
            r13 = 8
            r14 = 4
            r15 = 2
            r3 = 1
            if (r7 != 0) goto L_0x002f
            goto L_0x038d
        L_0x002f:
            if (r7 != r15) goto L_0x038d
            boolean r7 = r4.f48916p
            if (r7 == 0) goto L_0x038d
            java.lang.String r1 = r4.f48917q
            j$.util.Optional r2 = r21.mo22953b()
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x0388
            java.lang.Object r2 = r2.get()
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0388
            j$.util.Optional r2 = r21.mo22953b()
            java.lang.Object r2 = r2.get()
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r5
            int r6 = r5.f48802a
            r6 = r6 | r3
            r5.f48802a = r6
            r5.f48803b = r3
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0086
            java.lang.Object r5 = r2.get(r12)
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ar r5 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar) r5
            int r5 = r5.f48118c
            int r5 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16342ap.m33337a(r5)
            if (r5 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            if (r5 != r13) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m.f48760f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.l r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16647l) r6
            android.content.Context r7 = r0.f48841g
            r9 = 2132093014(0x7f152856, float:1.982644E38)
            java.lang.String r7 = r7.getString(r9)
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r9
            r7.getClass()
            int r13 = r9.f48762a
            r13 = r13 | r3
            r9.f48762a = r13
            r9.f48763b = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r9
            r9.f48776b = r15
            int r13 = r9.f48775a
            r13 = r13 | r3
            r9.f48775a = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r7
            r7.getClass()
            r9.f48764c = r7
            int r7 = r9.f48762a
            r7 = r7 | r14
            r9.f48762a = r7
            boolean r7 = com.google.common.base.C58837ba.m90859h(r1)
            if (r7 == 0) goto L_0x00e4
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            goto L_0x0220
        L_0x00e4:
            if (r5 != 0) goto L_0x00ee
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            goto L_0x0220
        L_0x00ee:
            android.content.Context r5 = r0.f48841g
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.DIAL"
            r7.<init>(r9)
            java.util.List r5 = r5.queryIntentActivities(r7, r12)
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x021a
            java.lang.Object r5 = r5.get(r12)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r1)
            android.content.pm.ActivityInfo r1 = r5.activityInfo
            java.lang.String r1 = r1.packageName
            android.content.Intent r1 = r7.setPackage(r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r5
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r7
            java.lang.String r1 = r1.toUri(r3)
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r9
            r1.getClass()
            r9.f49076b = r10
            r9.f49077c = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r7
            r7.getClass()
            r1.f48966b = r7
            int r7 = r1.f48965a
            r7 = r7 | r3
            r1.f48965a = r7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r7
            int r9 = r7.f48978a
            r9 = r9 | r3
            r7.f48978a = r9
            r9 = 147188(0x23ef4, float:2.06254E-40)
            r7.f48979b = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r1
            r1.getClass()
            r7.f48968d = r1
            int r1 = r7.f48965a
            r1 = r1 | r14
            r7.f48965a = r1
            com.google.protobuf.bv r1 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i.f48739j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.h r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h) r5
            android.content.Context r7 = r0.f48841g
            r9 = 2132089438(0x7f151a5e, float:1.9819188E38)
            java.lang.String r7 = r7.getString(r9)
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r9
            r7.getClass()
            int r10 = r9.f48741a
            r10 = r10 | r15
            r9.f48741a = r10
            r9.f48743c = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah.f48726c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ae r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16633ae) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah) r9
            r9.f48729b = r8
            int r8 = r9.f48728a
            r8 = r8 | r3
            r9.f48728a = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah) r7
            r7.getClass()
            r8.f48744d = r7
            int r7 = r8.f48741a
            r7 = r7 | r14
            r8.f48741a = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.g r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16642g.f48735c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.f r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16641f) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.g r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16642g) r8
            r8.f48738b = r15
            int r9 = r8.f48737a
            r9 = r9 | r3
            r8.f48737a = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.g r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16642g) r7
            r7.getClass()
            r8.f48745e = r7
            int r7 = r8.f48741a
            r9 = 8
            r7 = r7 | r9
            r8.f48741a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r7
            r1.getClass()
            r7.f48748h = r1
            int r1 = r7.f48741a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r7.f48741a = r1
            r6.mo22946a(r5)
        L_0x021a:
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
        L_0x0220:
            r4.mo22943b(r1)
            int r1 = r2.size()
        L_0x0227:
            if (r12 >= r1) goto L_0x037d
            java.lang.Object r5 = r2.get(r12)
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ar r5 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar) r5
            com.google.assistant.s.a.nu r5 = r5.f48117b
            if (r5 != 0) goto L_0x0235
            com.google.assistant.s.a.nu r5 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
        L_0x0235:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w.f48787e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.v r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16657v) r6
            java.lang.String r7 = r5.f140240e
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r8
            r7.getClass()
            int r9 = r8.f48789a
            r9 = r9 | r3
            r8.f48789a = r9
            r8.f48790b = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r8
            com.google.assistant.e.c.c.dc r9 = r5.f140244i
            if (r9 != 0) goto L_0x0266
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0266:
            java.lang.String r9 = r9.f132817c
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r9.getClass()
            r10.f48770a = r3
            r10.f48771b = r9
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r8
            r8.getClass()
            r9.f48777c = r8
            int r8 = r9.f48775a
            r8 = r8 | r15
            r9.f48775a = r8
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r8
            java.lang.String r9 = r5.f140240e
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r9.getClass()
            r10.f48770a = r14
            r10.f48771b = r9
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r8
            r8.getClass()
            r9.f48778d = r8
            int r8 = r9.f48775a
            r8 = r8 | r14
            r9.f48775a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r7
            r7.getClass()
            r8.f48791c = r7
            int r7 = r8.f48789a
            r7 = r7 | r14
            r8.f48789a = r7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r8
            int r9 = r5.f140237b
            r10 = 5
            if (r9 != r10) goto L_0x02ed
            java.lang.Object r9 = r5.f140238c
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x02ee
        L_0x02ed:
            r9 = r11
        L_0x02ee:
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r9.getClass()
            r10.f49076b = r3
            r10.f49077c = r9
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r8
            r8.getClass()
            r9.f48966b = r8
            int r8 = r9.f48965a
            r8 = r8 | r3
            r9.f48965a = r8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r8
            com.google.assistant.s.a.jb r5 = r5.f140246k
            if (r5 != 0) goto L_0x0321
            com.google.assistant.s.a.jb r5 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x0321:
            int r5 = r5.f139799d
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r9
            int r10 = r9.f48978a
            r10 = r10 | r3
            r9.f48978a = r10
            r9.f48979b = r5
            com.google.protobuf.bv r5 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r5
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r8
            r5.getClass()
            r8.f48968d = r5
            int r5 = r8.f48965a
            r5 = r5 | r14
            r8.f48965a = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r5
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r7
            r7.getClass()
            r5.f48792d = r7
            int r7 = r5.f48789a
            r8 = 8
            r7 = r7 | r8
            r5.f48789a = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r5
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r6
            r6.getClass()
            r5.mo22950b()
            com.google.protobuf.cq r5 = r5.f48805d
            r5.add(r6)
            int r12 = r12 + 1
            goto L_0x0227
        L_0x037d:
            com.google.protobuf.bv r1 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x038c
        L_0x0388:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x038c:
            return r1
        L_0x038d:
            int r7 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            if (r7 != 0) goto L_0x0395
            goto L_0x073b
        L_0x0395:
            if (r7 != r10) goto L_0x073b
            boolean r7 = r4.f48903c
            if (r7 == 0) goto L_0x073b
            boolean r2 = r4.f48906f
            if (r2 == 0) goto L_0x056d
            com.google.assistant.e.c.c.du r1 = r1.f132683d
            if (r1 != 0) goto L_0x03a5
            com.google.assistant.e.c.c.du r1 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x03a5:
            com.google.protobuf.cq r1 = r1.f132875f
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x03b3:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0553
            java.lang.Object r4 = r1.next()
            com.google.assistant.e.c.c.dr r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r4
            int r6 = r4.f132855b
            if (r6 != r15) goto L_0x03b3
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w.f48787e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.v r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16657v) r6
            int r7 = r4.f132855b
            if (r7 != r15) goto L_0x03d4
            java.lang.Object r7 = r4.f132856c
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x03d5
        L_0x03d4:
            r7 = r11
        L_0x03d5:
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r8
            r7.getClass()
            int r9 = r8.f48789a
            r9 = r9 | r3
            r8.f48789a = r9
            r8.f48790b = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r7
            int r8 = r4.f132854a
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0429
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r8
            com.google.assistant.e.c.c.dc r9 = r4.f132864k
            if (r9 != 0) goto L_0x0402
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0402:
            java.lang.String r9 = r9.f132817c
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r9.getClass()
            r10.f48770a = r3
            r10.f48771b = r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r8
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r9
            r8.getClass()
            r9.f48777c = r8
            int r8 = r9.f48775a
            r8 = r8 | r15
            r9.f48775a = r8
        L_0x0429:
            int r8 = r4.f132855b
            if (r8 != r15) goto L_0x0432
            java.lang.Object r8 = r4.f132856c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0433
        L_0x0432:
            r8 = r11
        L_0x0433:
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r8 = m33742c(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r9
            r8.getClass()
            r9.f48778d = r8
            int r8 = r9.f48775a
            r8 = r8 | r14
            r9.f48775a = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r8
            r7.getClass()
            r8.f48791c = r7
            int r7 = r8.f48789a
            r7 = r7 | r14
            r8.f48789a = r7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r7
            int r8 = r4.f132857d
            if (r8 != r14) goto L_0x0474
            java.lang.Object r8 = r4.f132858e
            com.google.assistant.e.c.c.dg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r8
            goto L_0x0476
        L_0x0474:
            com.google.assistant.e.c.c.dg r8 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0476:
            int r8 = r8.f132829a
            r9 = 8
            r8 = r8 & r9
            if (r8 == 0) goto L_0x04bc
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r8
            int r9 = r4.f132857d
            if (r9 != r14) goto L_0x048e
            java.lang.Object r4 = r4.f132858e
            com.google.assistant.e.c.c.dg r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r4
            goto L_0x0490
        L_0x048e:
            com.google.assistant.e.c.c.dg r4 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0490:
            com.google.assistant.e.j.du r4 = r4.f132833e
            if (r4 != 0) goto L_0x0496
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0496:
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r9
            r4.getClass()
            r9.f49077c = r4
            r9.f49076b = r15
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r8
            r8.getClass()
            r4.f48966b = r8
            int r8 = r4.f48965a
            r8 = r8 | r3
            r4.f48965a = r8
            goto L_0x04f3
        L_0x04bc:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r8
            int r9 = r4.f132855b
            if (r9 != r15) goto L_0x04cd
            java.lang.Object r4 = r4.f132856c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x04ce
        L_0x04cd:
            r4 = r11
        L_0x04ce:
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r9
            r4.getClass()
            r9.f49076b = r3
            r9.f49077c = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r8
            r8.getClass()
            r4.f48966b = r8
            int r8 = r4.f48965a
            r8 = r8 | r3
            r4.f48965a = r8
        L_0x04f3:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r4
            com.google.assistant.e.j.e.ep r8 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            boolean r8 = r8.equals(r5)
            if (r3 == r8) goto L_0x0507
            r8 = 146285(0x23b6d, float:2.04989E-40)
            goto L_0x050a
        L_0x0507:
            r8 = 153776(0x258b0, float:2.15486E-40)
        L_0x050a:
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r9
            int r10 = r9.f48978a
            r10 = r10 | r3
            r9.f48978a = r10
            r9.f48979b = r8
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r4
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r8
            r4.getClass()
            r8.f48968d = r4
            int r4 = r8.f48965a
            r4 = r4 | r14
            r8.f48965a = r4
            com.google.protobuf.bv r4 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r7
            r4.getClass()
            r7.f48792d = r4
            int r4 = r7.f48789a
            r8 = 8
            r4 = r4 | r8
            r7.f48789a = r4
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r4
            r2.mo22944c(r4)
            goto L_0x03b3
        L_0x0553:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            int r4 = r1.f48802a
            r4 = r4 | r3
            r1.f48802a = r4
            r1.f48803b = r3
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x073a
        L_0x056d:
            com.google.assistant.e.c.c.du r1 = r1.f132683d
            if (r1 != 0) goto L_0x0573
            com.google.assistant.e.c.c.du r1 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0573:
            com.google.protobuf.cq r1 = r1.f132875f
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0581:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0722
            java.lang.Object r4 = r1.next()
            com.google.assistant.e.c.c.dr r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r4
            int r5 = r4.f132855b
            if (r5 != r15) goto L_0x0581
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k.f48751g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.j r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16645j) r5
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.z r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z) r6
            int r7 = r4.f132855b
            if (r7 != r15) goto L_0x05aa
            java.lang.Object r7 = r4.f132856c
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x05ab
        L_0x05aa:
            r7 = r11
        L_0x05ab:
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r8
            r7.getClass()
            r8.f48722b = r3
            r8.f48723c = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r6
            r6.getClass()
            r7.f48754b = r6
            int r6 = r7.f48753a
            r6 = r6 | r3
            r7.f48753a = r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r6
            int r7 = r4.f132854a
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0613
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r7
            com.google.assistant.e.c.c.dc r8 = r4.f132864k
            if (r8 != 0) goto L_0x05ec
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x05ec:
            java.lang.String r8 = r8.f132817c
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r9
            r8.getClass()
            r9.f48770a = r3
            r9.f48771b = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r8
            r7.getClass()
            r8.f48777c = r7
            int r7 = r8.f48775a
            r7 = r7 | r15
            r8.f48775a = r7
        L_0x0613:
            int r7 = r4.f132855b
            if (r7 != r15) goto L_0x061c
            java.lang.Object r7 = r4.f132856c
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x061d
        L_0x061c:
            r7 = r11
        L_0x061d:
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r7 = m33742c(r7)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r8
            r7.getClass()
            r8.f48778d = r7
            int r7 = r8.f48775a
            r7 = r7 | r14
            r8.f48775a = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r7
            r6.getClass()
            r7.f48756d = r6
            int r6 = r7.f48753a
            r6 = r6 | r14
            r7.f48753a = r6
            int r6 = r4.f132857d
            if (r6 != r14) goto L_0x0656
            java.lang.Object r6 = r4.f132858e
            com.google.assistant.e.c.c.dg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r6
            goto L_0x0658
        L_0x0656:
            com.google.assistant.e.c.c.dg r6 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0658:
            int r6 = r6.f132829a
            r7 = 8
            r6 = r6 & r7
            if (r6 == 0) goto L_0x06bf
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r7
            int r8 = r4.f132857d
            if (r8 != r14) goto L_0x0678
            java.lang.Object r4 = r4.f132858e
            com.google.assistant.e.c.c.dg r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r4
            goto L_0x067a
        L_0x0678:
            com.google.assistant.e.c.c.dg r4 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x067a:
            com.google.assistant.e.j.du r4 = r4.f132833e
            if (r4 != 0) goto L_0x0680
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0680:
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r8
            r4.getClass()
            r8.f49077c = r4
            r8.f49076b = r15
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r7
            r7.getClass()
            r4.f48966b = r7
            int r7 = r4.f48965a
            r7 = r7 | r3
            r4.f48965a = r7
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r6
            r4.getClass()
            r6.f48757e = r4
            int r4 = r6.f48753a
            r7 = 8
            r4 = r4 | r7
            r6.f48753a = r4
            goto L_0x0717
        L_0x06bf:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r7
            int r8 = r4.f132855b
            if (r8 != r15) goto L_0x06d8
            java.lang.Object r4 = r4.f132856c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x06d9
        L_0x06d8:
            r4 = r11
        L_0x06d9:
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r8
            r4.getClass()
            r8.f49076b = r3
            r8.f49077c = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r7
            r7.getClass()
            r4.f48966b = r7
            int r7 = r4.f48965a
            r7 = r7 | r3
            r4.f48965a = r7
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r6
            r4.getClass()
            r6.f48757e = r4
            int r4 = r6.f48753a
            r7 = 8
            r4 = r4 | r7
            r6.f48753a = r4
        L_0x0717:
            com.google.protobuf.bv r4 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r4
            r2.mo22942a(r4)
            goto L_0x0581
        L_0x0722:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            int r4 = r1.f48802a
            r4 = r4 | r3
            r1.f48802a = r4
            r1.f48803b = r3
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
        L_0x073a:
            return r1
        L_0x073b:
            int r7 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            if (r7 != 0) goto L_0x0743
            goto L_0x09e9
        L_0x0743:
            r9 = 8
            if (r7 != r9) goto L_0x09e9
            boolean r7 = r4.f48907g
            if (r7 == 0) goto L_0x09e9
            com.google.assistant.e.c.c.du r1 = r1.f132683d
            if (r1 != 0) goto L_0x0751
            com.google.assistant.e.c.c.du r1 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0751:
            com.google.protobuf.cq r1 = r1.f132875f
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x075f
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x09e8
        L_0x075f:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r2
            java.util.Iterator r4 = r1.iterator()
            r5 = 0
        L_0x076c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x09bb
            java.lang.Object r6 = r4.next()
            com.google.assistant.e.c.c.dr r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r6
            int r5 = r5 + r3
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k.f48751g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.j r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16645j) r7
            int r9 = r6.f132855b
            if (r9 == 0) goto L_0x078f
            if (r9 == r15) goto L_0x078d
            if (r9 == r10) goto L_0x078b
            r9 = 0
            goto L_0x0790
        L_0x078b:
            r9 = 2
            goto L_0x0790
        L_0x078d:
            r9 = 1
            goto L_0x0790
        L_0x078f:
            r9 = 3
        L_0x0790:
            int r13 = r9 + -1
            r17 = 0
            if (r9 == 0) goto L_0x09ba
            if (r13 == 0) goto L_0x07d1
            if (r13 == r3) goto L_0x079d
            r16 = 16
            goto L_0x07f5
        L_0x079d:
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r9
            int r13 = r9.f48753a
            r16 = 16
            r13 = r13 | 16
            r9.f48753a = r13
            r9.f48758f = r3
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.z r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z) r9
            int r13 = r6.f132855b
            if (r13 != r10) goto L_0x07bf
            java.lang.Object r13 = r6.f132856c
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x07c0
        L_0x07bf:
            r13 = r11
        L_0x07c0:
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r8
            r13.getClass()
            r8.f48722b = r15
            r8.f48723c = r13
            r17 = r9
            goto L_0x07f5
        L_0x07d1:
            r16 = 16
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.z r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z) r8
            int r9 = r6.f132855b
            if (r9 != r15) goto L_0x07e4
            java.lang.Object r9 = r6.f132856c
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x07e5
        L_0x07e4:
            r9 = r11
        L_0x07e5:
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r13
            r9.getClass()
            r13.f48722b = r3
            r13.f48723c = r9
            r17 = r8
        L_0x07f5:
            if (r17 != 0) goto L_0x0807
            com.google.common.f.e r4 = f48836b
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "Missing provider title."
            r6 = 46814(0xb6de, float:6.56E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            goto L_0x09bb
        L_0x0807:
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r8
            com.google.protobuf.bv r9 = r17.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad) r9
            r9.getClass()
            r8.f48754b = r9
            int r9 = r8.f48753a
            r9 = r9 | r3
            r8.f48753a = r9
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r8
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r9
            com.google.assistant.e.c.c.dc r13 = r6.f132864k
            if (r13 != 0) goto L_0x0834
            com.google.assistant.e.c.c.dc r13 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0834:
            int r13 = r13.f132815a
            r13 = r13 & r15
            if (r13 == 0) goto L_0x083a
            goto L_0x0846
        L_0x083a:
            com.google.assistant.e.c.c.dc r13 = r6.f132864k
            if (r13 != 0) goto L_0x0840
            com.google.assistant.e.c.c.dc r13 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0840:
            int r13 = r13.f132815a
            r13 = r13 & 32
            if (r13 == 0) goto L_0x0896
        L_0x0846:
            com.google.assistant.e.c.c.dc r13 = r6.f132864k
            if (r13 != 0) goto L_0x084f
            com.google.assistant.e.c.c.dc r17 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            r10 = r17
            goto L_0x0850
        L_0x084f:
            r10 = r13
        L_0x0850:
            int r10 = r10.f132815a
            r10 = r10 & r15
            if (r10 == 0) goto L_0x086a
            if (r13 != 0) goto L_0x0859
            com.google.assistant.e.c.c.dc r13 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0859:
            java.lang.String r10 = r13.f132817c
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r10.getClass()
            r13.f48770a = r3
            r13.f48771b = r10
            goto L_0x087f
        L_0x086a:
            if (r13 != 0) goto L_0x086e
            com.google.assistant.e.c.c.dc r13 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x086e:
            java.lang.String r10 = r13.f132821g
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r13
            r10.getClass()
            r12 = 5
            r13.f48770a = r12
            r13.f48771b = r10
        L_0x087f:
            com.google.protobuf.bv r10 = r9.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r12
            r10.getClass()
            r12.f48777c = r10
            int r10 = r12.f48775a
            r10 = r10 | r15
            r12.f48775a = r10
        L_0x0896:
            r9.clear()
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r10.f48770a = r15
            r12 = 2131234280(0x7f080de8, float:1.8084721E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10.f48771b = r12
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r9
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r10
            r9.getClass()
            r10.f48778d = r9
            int r9 = r10.f48775a
            r9 = r9 | r14
            r10.f48775a = r9
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r8
            r8.getClass()
            r9.f48756d = r8
            int r8 = r9.f48753a
            r8 = r8 | r14
            r9.f48753a = r8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r10
            int r12 = r10.f48978a
            r12 = r12 | r3
            r10.f48978a = r12
            r12 = 148065(0x24261, float:2.07483E-40)
            r10.f48979b = r12
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r9
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r10
            r9.getClass()
            r10.f48968d = r9
            int r9 = r10.f48965a
            r9 = r9 | r14
            r10.f48965a = r9
            int r9 = r6.f132857d
            if (r9 != r14) goto L_0x091a
            java.lang.Object r9 = r6.f132858e
            com.google.assistant.e.c.c.dg r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r9
            goto L_0x091c
        L_0x091a:
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x091c:
            int r9 = r9.f132829a
            r10 = 8
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0962
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r9
            int r10 = r6.f132857d
            if (r10 != r14) goto L_0x0934
            java.lang.Object r6 = r6.f132858e
            com.google.assistant.e.c.c.dg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r6
            goto L_0x0936
        L_0x0934:
            com.google.assistant.e.c.c.dg r6 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0936:
            com.google.assistant.e.j.du r6 = r6.f132833e
            if (r6 != 0) goto L_0x093c
            com.google.assistant.e.j.du r6 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x093c:
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r6.getClass()
            r10.f49077c = r6
            r10.f49076b = r15
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r6
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r9
            r9.getClass()
            r6.f48966b = r9
            int r9 = r6.f48965a
            r9 = r9 | r3
            r6.f48965a = r9
            goto L_0x0993
        L_0x0962:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r6
            java.lang.String r9 = java.lang.String.valueOf(r5)
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r9.getClass()
            r10.f49076b = r3
            r10.f49077c = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r9
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r6
            r6.getClass()
            r9.f48966b = r6
            int r6 = r9.f48965a
            r6 = r6 | r3
            r9.f48965a = r6
        L_0x0993:
            com.google.protobuf.bv r6 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r6
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r8
            r6.getClass()
            r8.f48757e = r6
            int r6 = r8.f48753a
            r9 = 8
            r6 = r6 | r9
            r8.f48753a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r6
            r2.mo22942a(r6)
            r8 = 3
            r10 = 6
            r12 = 0
            goto L_0x076c
        L_0x09ba:
            throw r17
        L_0x09bb:
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r4
            com.google.protobuf.cq r4 = r4.f48806e
            int r4 = r4.size()
            int r1 = r1.size()
            if (r4 != r1) goto L_0x09e4
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            int r4 = r1.f48802a
            r4 = r4 | r3
            r1.f48802a = r4
            r1.f48803b = r3
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x09e8
        L_0x09e4:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x09e8:
            return r1
        L_0x09e9:
            int r3 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            if (r3 != 0) goto L_0x09f0
            goto L_0x09fc
        L_0x09f0:
            r7 = 7
            if (r3 != r7) goto L_0x09fc
            boolean r3 = r4.f48904d
            if (r3 == 0) goto L_0x09fc
            j$.util.Optional r1 = m33744e(r1, r2, r5, r4)
            return r1
        L_0x09fc:
            int r1 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            if (r1 != 0) goto L_0x0a03
            goto L_0x0a26
        L_0x0a03:
            r3 = 5
            if (r1 != r3) goto L_0x0a26
            boolean r1 = r4.f48908h
            if (r1 != 0) goto L_0x0a0e
            boolean r1 = r4.f48912l
            if (r1 == 0) goto L_0x0a26
        L_0x0a0e:
            com.google.common.b.ij r1 = f48840f
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0a26
            r1 = r2
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            j$.util.Optional r1 = m33743d(r1, r2, r3, r4, r5, r6)
            return r1
        L_0x0a26:
            com.google.common.f.e r1 = f48836b
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unable to process contact selection form field args."
            r3 = 46808(0xb6d8, float:6.5592E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16683ap.m33745f(com.google.assistant.e.j.e.eu, java.util.List, com.google.android.libraries.assistant.auto.tng.ui.c.d, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.al, com.google.assistant.e.j.e.ep, java.lang.String):j$.util.Optional");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r20 = r12;
        r21 = r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b mo22976a(com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al r24, com.google.assistant.p3897e.p3921j.C51809dy r25, com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16665d r26) {
        /*
            r23 = this;
            r7 = r24
            r8 = r25
            com.google.assistant.e.j.dw r0 = r8.f135938d
            if (r0 != 0) goto L_0x000a
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x000a:
            com.google.assistant.e.j.e.ff r1 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.eb r1 = r1.getParserForType()
            java.lang.String r2 = "show_native_form_args"
            j$.util.Optional r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16701q.m33772a(r0, r2, r1)
            boolean r0 = r9.isEmpty()
            r10 = 0
            if (r0 == 0) goto L_0x002c
            com.google.common.f.e r0 = f48836b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Missing client op args."
            r2 = 46793(0xb6c9, float:6.5571E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return r10
        L_0x002c:
            java.lang.Object r0 = r9.get()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            int r0 = r0.f136323g
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r0)
            if (r0 != 0) goto L_0x003c
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x003c:
            r11 = r0
            java.lang.Object r0 = r9.get()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            java.lang.String r12 = r0.f136320d
            java.lang.Object r0 = r9.get()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            com.google.protobuf.cq r0 = r0.f136319c
            java.util.Iterator r13 = r0.iterator()
        L_0x0051:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x077c
            java.lang.Object r0 = r13.next()
            com.google.assistant.e.j.e.fa r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r0
            boolean r1 = r0.f136298c
            if (r1 != 0) goto L_0x0051
            com.google.protobuf.cq r14 = r0.f136299d
            java.util.Iterator r15 = r14.iterator()
        L_0x0067:
            boolean r0 = r15.hasNext()
            r6 = 16
            r5 = 1
            if (r0 == 0) goto L_0x0724
            java.lang.Object r0 = r15.next()
            com.google.assistant.e.j.e.ew r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r0
            boolean r1 = r0.f136290d
            if (r1 != 0) goto L_0x0067
            com.google.protobuf.cq r0 = r0.f136288b
            java.util.Iterator r1 = r0.iterator()
        L_0x0080:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x070c
            java.lang.Object r2 = r1.next()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            boolean r3 = r2.f136281i
            if (r3 != 0) goto L_0x0080
            int r3 = r2.f136277e
            if (r3 != r6) goto L_0x00ab
            r0 = r23
            r1 = r2
            r2 = r14
            r3 = r26
            r4 = r24
            r10 = 1
            r5 = r11
            r16 = 16
            r6 = r12
            j$.util.Optional r0 = r0.m33745f(r1, r2, r3, r4, r5, r6)
        L_0x00a5:
            r20 = r12
            r21 = r13
            goto L_0x0716
        L_0x00ab:
            r10 = 1
            r16 = 16
            r5 = 3
            java.lang.String r6 = ""
            r4 = 2
            if (r3 != r5) goto L_0x0300
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.PAY_FOR_GAS
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0300
            boolean r3 = r7.f48910j
            if (r3 == 0) goto L_0x0300
            int r1 = r2.f136277e
            if (r1 != r5) goto L_0x00c9
            java.lang.Object r1 = r2.f136278f
            com.google.assistant.e.c.c.hx r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r1
            goto L_0x00cb
        L_0x00c9:
            com.google.assistant.e.c.c.hx r1 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x00cb:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m.f48760f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.l r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16647l) r2
            int r3 = r1.f133122b
            if (r3 != r10) goto L_0x00dc
            java.lang.Object r1 = r1.f133123c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00dd
        L_0x00dc:
            r1 = r6
        L_0x00dd:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r3
            r1.getClass()
            int r5 = r3.f48762a
            r5 = r5 | r10
            r3.f48762a = r5
            r3.f48763b = r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r3
            r3.f48776b = r4
            int r5 = r3.f48775a
            r5 = r5 | r10
            r3.f48775a = r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r1
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r3
            r1.getClass()
            r3.f48764c = r1
            int r1 = r3.f48762a
            r5 = 4
            r1 = r1 | r5
            r3.f48762a = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y.f48794d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.x r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16659x) r2
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.x r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16708x.f48876a
            j$.util.stream.Stream r0 = r0.filter(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ae r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16672ae.f48826a
            j$.util.stream.Stream r0 = r0.filter(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ag r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16674ag.f48830a
            java.util.Comparator r5 = p3186j$.util.Comparator.CC.naturalOrder()
            java.util.Comparator r3 = p3186j$.util.Comparator.CC.comparing(r3, r5)
            j$.util.stream.Stream r0 = r0.sorted(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.y r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16709y.f48877a
            j$.util.stream.Stream r0 = r0.map(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.z r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16710z.f48878a
            j$.util.stream.Stream r0 = r0.filter(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.aa r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16668aa.f48822a
            j$.util.stream.Stream r0 = r0.filter(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ab r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16669ab.f48823a
            java.lang.Object[] r0 = r0.toArray(r3)
            com.google.assistant.e.c.c.ah[] r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah[]) r0
            int r3 = r0.length
            if (r3 == r4) goto L_0x0179
            com.google.common.f.e r0 = f48836b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Missing yes or no buttons and cannot be rendered."
            r2 = 46800(0xb6d0, float:6.5581E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x00a5
        L_0x0179:
            r3 = 0
            r5 = 0
        L_0x017b:
            if (r3 >= r4) goto L_0x02d3
            r4 = r0[r3]
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r17 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i.f48739j
            com.google.protobuf.bn r17 = r17.createBuilder()
            r18 = r0
            r0 = r17
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.h r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h) r0
            r19 = r6
            int r6 = r4.f132596b
            if (r6 != r10) goto L_0x0196
            java.lang.Object r6 = r4.f132597c
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0198
        L_0x0196:
            r6 = r19
        L_0x0198:
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r10
            r6.getClass()
            r20 = r12
            int r12 = r10.f48741a
            r21 = r13
            r13 = 2
            r12 = r12 | r13
            r10.f48741a = r12
            r10.f48743c = r6
            r6 = 1
            int r5 = r5 + r6
            if (r5 != r13) goto L_0x01e0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d.f48730c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.c r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16638c) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r12
            r12.f48733b = r13
            int r13 = r12.f48732a
            r13 = r13 | r6
            r12.f48732a = r13
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r10
            r10.getClass()
            r6.f48746f = r10
            int r10 = r6.f48741a
            r10 = r10 | 16
            r6.f48741a = r10
        L_0x01e0:
            int r6 = r4.f132598d
            r10 = 3
            if (r6 != r10) goto L_0x01ea
            java.lang.Object r6 = r4.f132599e
            com.google.assistant.e.c.c.dg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r6
            goto L_0x01ec
        L_0x01ea:
            com.google.assistant.e.c.c.dg r6 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01ec:
            int r6 = r6.f132829a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0254
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r10
            int r12 = r4.f132598d
            r13 = 3
            if (r12 != r13) goto L_0x020c
            java.lang.Object r4 = r4.f132599e
            com.google.assistant.e.c.c.dg r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r4
            goto L_0x020e
        L_0x020c:
            com.google.assistant.e.c.c.dg r4 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x020e:
            com.google.assistant.e.j.du r4 = r4.f132833e
            if (r4 != 0) goto L_0x0214
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0214:
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r12
            r4.getClass()
            r12.f49077c = r4
            r4 = 2
            r12.f49076b = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r10.getClass()
            r4.f48966b = r10
            int r10 = r4.f48965a
            r12 = 1
            r10 = r10 | r12
            r4.f48965a = r10
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            r4.getClass()
            r6.f48748h = r4
            int r4 = r6.f48741a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r6.f48741a = r4
            goto L_0x02ad
        L_0x0254:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r10
            int r12 = r4.f132596b
            r13 = 1
            if (r12 != r13) goto L_0x026e
            java.lang.Object r4 = r4.f132597c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0270
        L_0x026e:
            r4 = r19
        L_0x0270:
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r12
            r4.getClass()
            r12.f49076b = r13
            r12.f49077c = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r10.getClass()
            r4.f48966b = r10
            int r10 = r4.f48965a
            r10 = r10 | r13
            r4.f48965a = r10
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            r4.getClass()
            r6.f48748h = r4
            int r4 = r6.f48741a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r6.f48741a = r4
        L_0x02ad:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r0
            r0.getClass()
            r4.mo22948a()
            com.google.protobuf.cq r4 = r4.f48797b
            r4.add(r0)
            int r3 = r3 + 1
            r0 = r18
            r6 = r19
            r12 = r20
            r13 = r21
            r4 = 2
            r10 = 1
            goto L_0x017b
        L_0x02d3:
            r20 = r12
            r21 = r13
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r3
            int r4 = r3.f48802a
            r5 = 1
            r4 = r4 | r5
            r3.f48802a = r4
            r3.f48803b = r5
            r0.mo22943b(r1)
            r0.mo22945d(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0716
        L_0x0300:
            r19 = r6
            r20 = r12
            r21 = r13
            int r3 = r2.f136277e
            r4 = 3
            if (r3 != r4) goto L_0x052a
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.WHATS_NEW
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x052a
            boolean r3 = r7.f48914n
            if (r3 == 0) goto L_0x052a
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            int r2 = r1.f48802a
            r3 = 1
            r2 = r2 | r3
            r1.f48802a = r2
            r1.f48803b = r3
            java.util.Iterator r1 = r14.iterator()
        L_0x0332:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x051e
            java.lang.Object r2 = r1.next()
            com.google.assistant.e.j.e.ew r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r2
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m.f48760f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.l r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16647l) r3
            com.google.protobuf.cq r2 = r2.f136288b
            java.util.Iterator r2 = r2.iterator()
            r4 = r19
        L_0x034e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04ff
            java.lang.Object r5 = r2.next()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            int r6 = r5.f136277e
            r10 = 3
            if (r6 != r10) goto L_0x03af
            java.lang.Object r4 = r5.f136278f
            com.google.assistant.e.c.c.hx r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r4
            int r6 = r4.f133122b
            r10 = 1
            if (r6 != r10) goto L_0x036d
            java.lang.Object r4 = r4.f133123c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x036f
        L_0x036d:
            r4 = r19
        L_0x036f:
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r6
            r4.getClass()
            int r12 = r6.f48762a
            r12 = r12 | r10
            r6.f48762a = r12
            r6.f48763b = r4
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r12
            r13 = 2
            r12.f48776b = r13
            int r13 = r12.f48775a
            r13 = r13 | r10
            r12.f48775a = r13
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r6
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r10
            r6.getClass()
            r10.f48764c = r6
            int r6 = r10.f48762a
            r12 = 4
            r6 = r6 | r12
            r10.f48762a = r6
        L_0x03af:
            int r6 = r5.f136277e
            r10 = 17
            if (r6 != r10) goto L_0x04f8
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i.f48739j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.h r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h) r6
            int r12 = r5.f136277e
            if (r12 != r10) goto L_0x03c6
            java.lang.Object r12 = r5.f136278f
            com.google.assistant.e.c.c.ah r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r12
            goto L_0x03c8
        L_0x03c6:
            com.google.assistant.e.c.c.ah r12 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x03c8:
            int r13 = r12.f132596b
            r10 = 1
            if (r13 != r10) goto L_0x03d2
            java.lang.Object r10 = r12.f132597c
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x03d4
        L_0x03d2:
            r10 = r19
        L_0x03d4:
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r12
            r10.getClass()
            int r13 = r12.f48741a
            r22 = r1
            r1 = 2
            r13 = r13 | r1
            r12.f48741a = r13
            r12.f48743c = r10
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d.f48730c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.c r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16638c) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r12
            r12.f48733b = r1
            int r1 = r12.f48732a
            r13 = 1
            r1 = r1 | r13
            r12.f48732a = r1
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r1
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r10
            r10.getClass()
            r1.f48746f = r10
            int r10 = r1.f48741a
            r10 = r10 | 16
            r1.f48741a = r10
            int r1 = r5.f136277e
            r10 = 17
            if (r1 != r10) goto L_0x0422
            java.lang.Object r1 = r5.f136278f
            com.google.assistant.e.c.c.ah r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r1
            goto L_0x0424
        L_0x0422:
            com.google.assistant.e.c.c.ah r1 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0424:
            int r10 = r1.f132598d
            r12 = 3
            if (r10 != r12) goto L_0x042e
            java.lang.Object r1 = r1.f132599e
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            goto L_0x0430
        L_0x042e:
            com.google.assistant.e.c.c.dg r1 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0430:
            int r1 = r1.f132829a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x04a5
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r1
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r10
            int r12 = r5.f136277e
            r13 = 17
            if (r12 != r13) goto L_0x0451
            java.lang.Object r5 = r5.f136278f
            com.google.assistant.e.c.c.ah r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r5
            goto L_0x0453
        L_0x0451:
            com.google.assistant.e.c.c.ah r5 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0453:
            int r12 = r5.f132598d
            r13 = 3
            if (r12 != r13) goto L_0x045d
            java.lang.Object r5 = r5.f132599e
            com.google.assistant.e.c.c.dg r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r5
            goto L_0x045f
        L_0x045d:
            com.google.assistant.e.c.c.dg r5 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x045f:
            com.google.assistant.e.j.du r5 = r5.f132833e
            if (r5 != 0) goto L_0x0465
            com.google.assistant.e.j.du r5 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0465:
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r12
            r5.getClass()
            r12.f49077c = r5
            r5 = 2
            r12.f49076b = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r10.getClass()
            r5.f48966b = r10
            int r10 = r5.f48965a
            r12 = 1
            r10 = r10 | r12
            r5.f48965a = r10
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r5
            r1.getClass()
            r5.f48748h = r1
            int r1 = r5.f48741a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r5.f48741a = r1
            goto L_0x04f4
        L_0x04a5:
            r13 = 3
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r1
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r4.getClass()
            r12 = 1
            r10.f49076b = r12
            r10.f49077c = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r10 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r10
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r5
            r5.getClass()
            r10.f48966b = r5
            int r5 = r10.f48965a
            r5 = r5 | r12
            r10.f48965a = r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r5
            r1.getClass()
            r5.f48748h = r1
            int r1 = r5.f48741a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r5.f48741a = r1
        L_0x04f4:
            r3.mo22946a(r6)
            goto L_0x04fb
        L_0x04f8:
            r22 = r1
            r13 = 3
        L_0x04fb:
            r1 = r22
            goto L_0x034e
        L_0x04ff:
            r22 = r1
            r13 = 3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r2
            r2.getClass()
            r1.mo22949a()
            com.google.protobuf.cq r1 = r1.f48804c
            r1.add(r2)
            r1 = r22
            goto L_0x0332
        L_0x051e:
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0716
        L_0x052a:
            int r3 = r2.f136277e
            r4 = 6
            if (r3 != r4) goto L_0x0702
            boolean r3 = r7.f48902b
            if (r3 == 0) goto L_0x0702
            java.lang.Object r0 = r2.f136278f
            com.google.assistant.e.c.c.du r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r0
            com.google.protobuf.cq r0 = r0.f132875f
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0545:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x06e8
            java.lang.Object r2 = r0.next()
            com.google.assistant.e.c.c.dr r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r2
            int r3 = r2.f132855b
            r4 = 2
            if (r3 != r4) goto L_0x06d6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w.f48787e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.v r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16657v) r3
            int r5 = r2.f132855b
            if (r5 != r4) goto L_0x0567
            java.lang.Object r4 = r2.f132856c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0569
        L_0x0567:
            r4 = r19
        L_0x0569:
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r5
            r4.getClass()
            int r6 = r5.f48789a
            r10 = 1
            r6 = r6 | r10
            r5.f48789a = r6
            r5.f48790b = r4
            int r4 = r2.f132854a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x05d9
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r4
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r5
            com.google.assistant.e.c.c.dc r6 = r2.f132864k
            if (r6 != 0) goto L_0x0597
            com.google.assistant.e.c.c.dc r6 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0597:
            java.lang.String r6 = r6.f132817c
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r6.getClass()
            r12 = 1
            r10.f48770a = r12
            r10.f48771b = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r6
            r5.getClass()
            r6.f48777c = r5
            int r5 = r6.f48775a
            r10 = 2
            r5 = r5 | r10
            r6.f48775a = r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r5
            r4.getClass()
            r5.f48791c = r4
            int r4 = r5.f48789a
            r6 = 4
            r4 = r4 | r6
            r5.f48789a = r4
            goto L_0x05fb
        L_0x05d9:
            com.google.common.f.e r4 = f48836b
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 46810(0xb6da, float:6.5595E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            int r5 = r2.f132855b
            r6 = 2
            if (r5 != r6) goto L_0x05f4
            java.lang.Object r5 = r2.f132856c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x05f6
        L_0x05f4:
            r5 = r19
        L_0x05f6:
            java.lang.String r6 = "List item is missing image. Item = %s"
            r4.mo56389s(r6, r5)
        L_0x05fb:
            int r4 = r2.f132857d
            r5 = 4
            if (r4 != r5) goto L_0x0605
            java.lang.Object r4 = r2.f132858e
            com.google.assistant.e.c.c.dg r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r4
            goto L_0x0607
        L_0x0605:
            com.google.assistant.e.c.c.dg r4 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0607:
            int r4 = r4.f132829a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0670
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r4
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r5
            int r6 = r2.f132857d
            r10 = 4
            if (r6 != r10) goto L_0x0627
            java.lang.Object r2 = r2.f132858e
            com.google.assistant.e.c.c.dg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r2
            goto L_0x0629
        L_0x0627:
            com.google.assistant.e.c.c.dg r2 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0629:
            com.google.assistant.e.j.du r2 = r2.f132833e
            if (r2 != 0) goto L_0x062f
            com.google.assistant.e.j.du r2 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x062f:
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r6
            r2.getClass()
            r6.f49077c = r2
            r2 = 2
            r6.f49076b = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r2
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r5
            r5.getClass()
            r2.f48966b = r5
            int r5 = r2.f48965a
            r6 = 1
            r5 = r5 | r6
            r2.f48965a = r5
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r4
            r2.getClass()
            r4.f48792d = r2
            int r2 = r4.f48789a
            r2 = r2 | 8
            r4.f48789a = r2
            r12 = 2
            goto L_0x06cb
        L_0x0670:
            r10 = 4
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r4
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r5
            int r6 = r2.f132855b
            r12 = 2
            if (r6 != r12) goto L_0x068b
            java.lang.Object r2 = r2.f132856c
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x068d
        L_0x068b:
            r2 = r19
        L_0x068d:
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r6
            r2.getClass()
            r13 = 1
            r6.f49076b = r13
            r6.f49077c = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r2
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r5
            r5.getClass()
            r2.f48966b = r5
            int r5 = r2.f48965a
            r5 = r5 | r13
            r2.f48965a = r5
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r4
            r2.getClass()
            r4.f48792d = r2
            int r2 = r4.f48789a
            r2 = r2 | 8
            r4.f48789a = r2
        L_0x06cb:
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r2
            r1.mo22944c(r2)
            goto L_0x0545
        L_0x06d6:
            r10 = 4
            r12 = 2
            com.google.common.f.e r2 = f48836b
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "List item is missing title and could not be rendered."
            r4 = 46809(0xb6d9, float:6.5593E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0545
        L_0x06e8:
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            int r2 = r0.f48802a
            r3 = 1
            r2 = r2 | r3
            r0.f48802a = r2
            r0.f48803b = r3
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0716
        L_0x0702:
            r12 = r20
            r13 = r21
            r5 = 1
            r6 = 16
            r10 = 0
            goto L_0x0080
        L_0x070c:
            r20 = r12
            r21 = r13
            r16 = 16
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0716:
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x071d
            goto L_0x072e
        L_0x071d:
            r12 = r20
            r13 = r21
            r10 = 0
            goto L_0x0067
        L_0x0724:
            r20 = r12
            r21 = r13
            r16 = 16
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x072e:
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0775
            java.lang.Object r1 = r9.get()
            com.google.assistant.e.j.e.ff r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r1
            boolean r1 = r1.f136327k
            if (r1 == 0) goto L_0x0764
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            int r2 = r1.f48802a
            r2 = r2 | 16
            r1.f48802a = r2
            r2 = 1
            r1.f48812k = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x0764:
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            java.lang.Object r1 = r9.get()
            com.google.assistant.e.j.e.ff r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = m33741b(r0, r1, r7)
            return r0
        L_0x0775:
            r12 = r20
            r13 = r21
            r10 = 0
            goto L_0x0051
        L_0x077c:
            com.google.common.f.e r0 = f48836b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 46792(0xb6c8, float:6.557E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "ClientOp cannot be parsed -- either missing args or is not yet supported. clientOp = %s"
            java.lang.String r2 = r8.f135936b
            r0.mo56389s(r1, r2)
            java.lang.Object r0 = r9.get()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            r1 = 0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = m33741b(r1, r0, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16683ap.mo22976a(com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.al, com.google.assistant.e.j.dy, com.google.android.libraries.assistant.auto.tng.ui.c.d):com.google.android.libraries.assistant.auto.tng.ui.c.a.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0244  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p3186j$.util.Optional m33743d(com.google.assistant.p3897e.p3902c.p3907c.C50965bj r20, java.util.List r21, com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16665d r22, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al r23, com.google.assistant.p3897e.p3921j.p3926e.C51936ep r24, java.lang.String r25) {
        /*
            r0 = r20
            r1 = r23
            r2 = r24
            r3 = r25
            int r4 = r0.f132673b
            r5 = 3
            if (r4 != r5) goto L_0x09a8
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a) r4
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m.f48760f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.l r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16647l) r6
            int r7 = r0.f132673b
            if (r7 != r5) goto L_0x0026
            java.lang.Object r7 = r0.f132674c
            com.google.assistant.e.c.c.hx r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r7
            goto L_0x0028
        L_0x0026:
            com.google.assistant.e.c.c.hx r7 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0028:
            int r8 = r7.f133122b
            java.lang.String r9 = ""
            r10 = 1
            if (r8 != r10) goto L_0x0034
            java.lang.Object r7 = r7.f133123c
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0035
        L_0x0034:
            r7 = r9
        L_0x0035:
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r8
            r7.getClass()
            int r11 = r8.f48762a
            r11 = r11 | r10
            r8.f48762a = r11
            r8.f48763b = r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r8
            int r11 = r0.f132673b
            if (r11 != r5) goto L_0x0057
            java.lang.Object r12 = r0.f132674c
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            goto L_0x0059
        L_0x0057:
            com.google.assistant.e.c.c.hx r12 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0059:
            int r12 = r12.f133121a
            r12 = r12 & 16
            r13 = 2
            r14 = 0
            if (r12 == 0) goto L_0x010c
            if (r11 != r5) goto L_0x0068
            java.lang.Object r11 = r0.f132674c
            com.google.assistant.e.c.c.hx r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r11
            goto L_0x006a
        L_0x0068:
            com.google.assistant.e.c.c.hx r11 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x006a:
            com.google.assistant.e.c.c.dc r11 = r11.f133126f
            if (r11 != 0) goto L_0x0070
            com.google.assistant.e.c.c.dc r11 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0070:
            java.lang.String r11 = r11.f132817c
            boolean r12 = r1.f48911k
            if (r12 == 0) goto L_0x00c3
            int r12 = r11.length()
            r15 = 46
            if (r12 != r15) goto L_0x00c3
            r12 = 10
            java.lang.String r15 = r11.substring(r14, r12)
            java.lang.String r14 = "autoimage:"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x008d
            goto L_0x00c3
        L_0x008d:
            java.lang.String r12 = r11.substring(r12)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            java.util.UUID.fromString(r12)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r14
            r11.getClass()
            r14.f48770a = r5
            r14.f48771b = r11
            com.google.protobuf.bv r11 = r12.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r11
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r12
            r11.getClass()
            r12.f48777c = r11
            int r11 = r12.f48775a
            r11 = r11 | r13
            r12.f48775a = r11
            goto L_0x010c
        L_0x00c2:
        L_0x00c3:
            int r12 = r0.f132673b
            if (r12 != r5) goto L_0x00cc
            java.lang.Object r12 = r0.f132674c
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            goto L_0x00ce
        L_0x00cc:
            com.google.assistant.e.c.c.hx r12 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x00ce:
            com.google.assistant.e.c.c.dc r12 = r12.f133126f
            if (r12 != 0) goto L_0x00d4
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00d4:
            int r12 = r12.f132816b
            int r12 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r12)
            if (r12 != 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            if (r12 != r10) goto L_0x010c
        L_0x00df:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r14 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r14
            r11.getClass()
            r14.f48770a = r10
            r14.f48771b = r11
            com.google.protobuf.bv r11 = r12.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r11
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r12
            r11.getClass()
            r12.f48777c = r11
            int r11 = r12.f48775a
            r11 = r11 | r13
            r12.f48775a = r11
        L_0x010c:
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r7 = m33742c(r7)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r11
            r7.getClass()
            r11.f48778d = r7
            int r7 = r11.f48775a
            r7 = r7 | 4
            r11.f48775a = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r8
            r7.getClass()
            r8.f48764c = r7
            int r7 = r8.f48762a
            r7 = r7 | 4
            r8.f48762a = r7
            com.google.common.b.ij r7 = f48840f
            boolean r7 = r7.contains(r2)
            r8 = 5
            if (r7 == 0) goto L_0x0210
            int r7 = r0.f132673b
            if (r7 != r5) goto L_0x0150
            java.lang.Object r7 = r0.f132674c
            com.google.assistant.e.c.c.hx r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r7
            goto L_0x0152
        L_0x0150:
            com.google.assistant.e.c.c.hx r7 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0152:
            com.google.assistant.e.c.c.dc r7 = r7.f133126f
            if (r7 != 0) goto L_0x0158
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0158:
            int r7 = r7.f132815a
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0210
            int r7 = r0.f132673b
            if (r7 != r5) goto L_0x0167
            java.lang.Object r0 = r0.f132674c
            com.google.assistant.e.c.c.hx r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r0
            goto L_0x0169
        L_0x0167:
            com.google.assistant.e.c.c.hx r0 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0169:
            com.google.assistant.e.c.c.dc r0 = r0.f133126f
            if (r0 != 0) goto L_0x016f
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x016f:
            com.google.assistant.e.c.c.dc r0 = r0.f132823i
            if (r0 != 0) goto L_0x0175
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0175:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r11 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r11
            int r12 = r0.f132815a
            r14 = r12 & 32
            if (r14 == 0) goto L_0x019c
            java.lang.String r0 = r0.f132821g
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r12
            r0.getClass()
            r12.f48770a = r8
            r12.f48771b = r0
            goto L_0x01af
        L_0x019c:
            r12 = r12 & r13
            if (r12 == 0) goto L_0x01af
            java.lang.String r0 = r0.f132817c
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r12
            r0.getClass()
            r12.f48770a = r10
            r12.f48771b = r0
        L_0x01af:
            com.google.protobuf.bv r0 = r11.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r0
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r11
            r0.getClass()
            r11.f48777c = r0
            int r0 = r11.f48775a
            r0 = r0 | r13
            r11.f48775a = r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r11
            r11.f48770a = r13
            r12 = 2131234913(0x7f081061, float:1.8086005E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.f48771b = r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r0
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r11
            r0.getClass()
            r11.f48778d = r0
            int r0 = r11.f48775a
            r0 = r0 | 4
            r11.f48775a = r0
            com.google.protobuf.bv r0 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r0
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r7
            r0.getClass()
            r7.f48765d = r0
            int r0 = r7.f48762a
            r0 = r0 | 8
            r7.f48762a = r0
        L_0x0210:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.g r0 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.g
            r0.<init>()
            r7 = 0
            r0.mo22969d(r7)
            r0.mo22968c(r7)
            r0.mo22967b(r7)
            boolean r7 = r1.f48913m
            if (r7 == 0) goto L_0x023b
            j$.util.Optional r7 = r22.mo22952a()
            boolean r11 = r7.isPresent()
            if (r11 == 0) goto L_0x023b
            java.lang.Object r7 = r7.get()
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x023b
            r7 = 1
            goto L_0x023c
        L_0x023b:
            r7 = 0
        L_0x023c:
            java.lang.String r11 = "reply_button_id"
            if (r7 != 0) goto L_0x0244
            r19 = r9
            goto L_0x030f
        L_0x0244:
            com.google.common.b.gp r12 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r14 = r21.iterator()
            r15 = 0
            r16 = 0
        L_0x024f:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x0304
            java.lang.Object r17 = r14.next()
            com.google.assistant.e.j.e.ew r17 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r17
            com.google.protobuf.bn r17 = r17.toBuilder()
            r8 = r17
            com.google.assistant.e.j.e.ev r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r8
            r5 = 0
        L_0x0264:
            com.google.protobuf.bv r13 = r8.instance
            com.google.assistant.e.j.e.ew r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r13
            com.google.protobuf.cq r13 = r13.f136288b
            int r13 = r13.size()
            if (r5 >= r13) goto L_0x02f1
            com.google.protobuf.bv r13 = r8.instance
            com.google.assistant.e.j.e.ew r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r13
            com.google.protobuf.cq r13 = r13.f136288b
            java.lang.Object r13 = r13.get(r5)
            com.google.assistant.e.j.e.eu r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r13
            java.lang.String r10 = r13.f136279g
            r19 = r9
            int r9 = r10.hashCode()
            r20 = r14
            r14 = -1065052621(0xffffffffc0849633, float:-4.143335)
            if (r9 == r14) goto L_0x029b
            r14 = 264336741(0xfc17565, float:1.9076488E-29)
            if (r9 == r14) goto L_0x0291
            goto L_0x02a3
        L_0x0291:
            java.lang.String r9 = "custom_reply_button_id"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x02a3
            r9 = 1
            goto L_0x02a4
        L_0x029b:
            boolean r9 = r10.equals(r11)
            if (r9 == 0) goto L_0x02a3
            r9 = 0
            goto L_0x02a4
        L_0x02a3:
            r9 = -1
        L_0x02a4:
            if (r9 == 0) goto L_0x02ca
            r10 = 1
            if (r9 == r10) goto L_0x02aa
            goto L_0x02e8
        L_0x02aa:
            boolean r9 = r13.f136281i
            if (r9 == 0) goto L_0x02e8
            com.google.protobuf.bn r9 = r13.toBuilder()
            com.google.assistant.e.j.e.eq r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            int r13 = r10.f136273a
            r13 = r13 | 32
            r10.f136273a = r13
            r13 = 0
            r10.f136281i = r13
            r8.mo53760c(r5, r9)
            r16 = 1
            goto L_0x02e8
        L_0x02ca:
            boolean r9 = r13.f136281i
            if (r9 != 0) goto L_0x02e8
            com.google.protobuf.bn r9 = r13.toBuilder()
            com.google.assistant.e.j.e.eq r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            int r13 = r10.f136273a
            r13 = r13 | 32
            r10.f136273a = r13
            r13 = 1
            r10.f136281i = r13
            r8.mo53760c(r5, r9)
            r15 = 1
        L_0x02e8:
            int r5 = r5 + 1
            r14 = r20
            r9 = r19
            r10 = 1
            goto L_0x0264
        L_0x02f1:
            r19 = r9
            r20 = r14
            com.google.protobuf.bv r5 = r8.build()
            com.google.assistant.e.j.e.ew r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r5
            r12.mo55395g(r5)
            r5 = 3
            r8 = 5
            r10 = 1
            r13 = 2
            goto L_0x024f
        L_0x0304:
            r19 = r9
            if (r15 == 0) goto L_0x030f
            if (r16 == 0) goto L_0x030f
            com.google.common.b.gu r5 = r12.mo55394f()
            goto L_0x0311
        L_0x030f:
            r5 = r21
        L_0x0311:
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
            r8.<init>()
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>()
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.w r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16707w.f48875a
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ac r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16670ac.f48824a
            j$.util.stream.Stream r5 = r5.flatMap(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ad r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16671ad.f48825a
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ae r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16672ae.f48826a
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.af r12 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.af
            r12.<init>(r8, r10, r9)
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ag r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16674ag.f48830a
            java.util.Comparator r12 = p3186j$.util.Comparator.CC.comparing(r12)
            j$.util.stream.Stream r5 = r5.sorted(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ah r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16675ah.f48831a
            j$.util.stream.Stream r5 = r5.map(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ai r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16676ai.f48832a
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.aj r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16677aj.f48833a
            j$.util.stream.Stream r5 = r5.filter(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ak r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16678ak.f48834a
            java.lang.Object[] r5 = r5.toArray(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.al[] r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16679al[]) r5
            int r12 = r5.length
            r13 = 1
            if (r12 != r13) goto L_0x0378
            int r10 = r10.get()
            if (r10 != 0) goto L_0x0375
            r10 = 1
            goto L_0x0376
        L_0x0375:
            r10 = 0
        L_0x0376:
            r12 = 1
            goto L_0x0379
        L_0x0378:
            r10 = 0
        L_0x0379:
            r0.mo22968c(r10)
            r10 = 2
            if (r12 != r10) goto L_0x0387
            int r9 = r9.get()
            if (r9 != 0) goto L_0x0387
            r9 = 1
            goto L_0x0388
        L_0x0387:
            r9 = 0
        L_0x0388:
            r0.mo22969d(r9)
            r0.mo22967b(r7)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.an r7 = r0.mo22966a()
            int r8 = r8.get()
            if (r8 != 0) goto L_0x03a4
            com.google.protobuf.bv r2 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x05e5
        L_0x03a4:
            boolean r8 = r7.mo22971b()
            if (r8 != 0) goto L_0x03c4
            boolean r8 = r7.mo22972c()
            if (r8 != 0) goto L_0x03c4
            com.google.common.f.e r2 = f48836b
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Doesn't have send and change or reply buttons and cannot be rendered."
            r5 = 46815(0xb6df, float:6.5602E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x05e5
        L_0x03c4:
            r8 = 0
            r9 = 0
        L_0x03c6:
            if (r8 >= r12) goto L_0x05db
            r10 = r5[r8]
            com.google.assistant.e.c.c.ah r13 = r10.mo22964a()
            int r14 = r13.f132596b
            r15 = 1
            if (r14 != r15) goto L_0x03d8
            java.lang.Object r14 = r13.f132597c
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x03da
        L_0x03d8:
            r14 = r19
        L_0x03da:
            java.lang.String r10 = r10.mo22965b()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r15 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i.f48739j
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.h r15 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h) r15
            r15.copyOnWrite()
            r20 = r5
            com.google.protobuf.bv r5 = r15.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r5
            r14.getClass()
            r16 = r12
            int r12 = r5.f48741a
            r1 = 2
            r12 = r12 | r1
            r5.f48741a = r12
            r5.f48743c = r14
            boolean r5 = r7.mo22972c()
            if (r5 == 0) goto L_0x0435
            int r9 = r9 + 1
            if (r9 != r1) goto L_0x0435
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d.f48730c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.c r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16638c) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r12
            r12.f48733b = r1
            int r1 = r12.f48732a
            r14 = 1
            r1 = r1 | r14
            r12.f48732a = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r1
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r5
            r5.getClass()
            r1.f48746f = r5
            int r5 = r1.f48741a
            r5 = r5 | 16
            r1.f48741a = r5
        L_0x0435:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r1
            boolean r5 = r10.isEmpty()
            java.lang.String r12 = "change_button_id"
            if (r5 != 0) goto L_0x04db
            com.google.assistant.e.j.e.ep r5 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0495
            boolean r5 = r7.mo22972c()
            if (r5 == 0) goto L_0x0495
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r5
            boolean r14 = r10.equals(r12)
            r2 = 1
            if (r2 == r14) goto L_0x0466
            r14 = 148071(0x24267, float:2.07492E-40)
            goto L_0x0469
        L_0x0466:
            r14 = 148066(0x24262, float:2.07485E-40)
        L_0x0469:
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r2
            r21 = r9
            int r9 = r2.f48978a
            r18 = 1
            r9 = r9 | 1
            r2.f48978a = r9
            r2.f48979b = r14
            com.google.protobuf.bv r2 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            r2.getClass()
            r5.f48968d = r2
            int r2 = r5.f48965a
            r2 = r2 | 4
            r5.f48965a = r2
            goto L_0x04dd
        L_0x0495:
            r21 = r9
            com.google.common.b.hd r2 = f48839e
            boolean r5 = r2.containsKey(r10)
            if (r5 == 0) goto L_0x04dd
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r5
            java.lang.Object r2 = r2.get(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r9
            int r14 = r9.f48978a
            r18 = 1
            r14 = r14 | 1
            r9.f48978a = r14
            r9.f48979b = r2
            com.google.protobuf.bv r2 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            r2.getClass()
            r5.f48968d = r2
            int r2 = r5.f48965a
            r2 = r2 | 4
            r5.f48965a = r2
            goto L_0x04dd
        L_0x04db:
            r21 = r9
        L_0x04dd:
            int r2 = r13.f132598d
            r5 = 3
            if (r2 != r5) goto L_0x04e7
            java.lang.Object r2 = r13.f132599e
            com.google.assistant.e.c.c.dg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r2
            goto L_0x04e9
        L_0x04e7:
            com.google.assistant.e.c.c.dg r2 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x04e9:
            int r2 = r2.f132829a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0531
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r2
            int r5 = r13.f132598d
            r9 = 3
            if (r5 != r9) goto L_0x0501
            java.lang.Object r5 = r13.f132599e
            com.google.assistant.e.c.c.dg r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r5
            goto L_0x0503
        L_0x0501:
            com.google.assistant.e.c.c.dg r5 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0503:
            com.google.assistant.e.j.du r5 = r5.f132833e
            if (r5 != 0) goto L_0x0509
            com.google.assistant.e.j.du r5 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0509:
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r9 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r9
            r5.getClass()
            r9.f49077c = r5
            r5 = 2
            r9.f49076b = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r2
            r2.getClass()
            r5.f48966b = r2
            int r2 = r5.f48965a
            r9 = 1
            r2 = r2 | r9
            r5.f48965a = r2
            goto L_0x056a
        L_0x0531:
            r9 = 1
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r2
            int r5 = r13.f132596b
            if (r5 != r9) goto L_0x0543
            java.lang.Object r5 = r13.f132597c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0545
        L_0x0543:
            r5 = r19
        L_0x0545:
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r13
            r5.getClass()
            r13.f49076b = r9
            r13.f49077c = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r5
            r2.getClass()
            r5.f48966b = r2
            int r2 = r5.f48965a
            r2 = r2 | r9
            r5.f48965a = r2
        L_0x056a:
            boolean r2 = r7.mo22971b()
            if (r2 == 0) goto L_0x0582
            boolean r2 = r7.mo22970a()
            if (r2 != 0) goto L_0x0582
            boolean r2 = r3.equals(r11)
            if (r2 == 0) goto L_0x0582
            boolean r2 = r10.equals(r11)
            if (r2 != 0) goto L_0x05a2
        L_0x0582:
            boolean r2 = r7.mo22972c()
            if (r2 == 0) goto L_0x05b2
            java.lang.String r2 = "confirmation_button_id"
            boolean r5 = r3.equals(r2)
            if (r5 == 0) goto L_0x0596
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x05a2
        L_0x0596:
            boolean r2 = r3.equals(r12)
            if (r2 == 0) goto L_0x05b2
            boolean r2 = r10.equals(r12)
            if (r2 == 0) goto L_0x05b2
        L_0x05a2:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r2
            int r5 = r2.f48965a
            r9 = 2
            r5 = r5 | r9
            r2.f48965a = r5
            r5 = 1
            r2.f48967c = r5
        L_0x05b2:
            r15.copyOnWrite()
            com.google.protobuf.bv r2 = r15.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r1
            r1.getClass()
            r2.f48748h = r1
            int r1 = r2.f48741a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.f48741a = r1
            r6.mo22946a(r15)
            int r8 = r8 + 1
            r5 = r20
            r9 = r21
            r1 = r23
            r2 = r24
            r12 = r16
            goto L_0x03c6
        L_0x05db:
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r1)
        L_0x05e5:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x05f0
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x05f0:
            java.lang.Object r1 = r2.get()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r1
            r4.mo22943b(r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.an r0 = r0.mo22966a()
            r1 = r23
            boolean r2 = r1.f48919s
            if (r2 == 0) goto L_0x060b
            boolean r2 = r0.mo22970a()
            if (r2 == 0) goto L_0x060b
            r2 = 1
            goto L_0x060c
        L_0x060b:
            r2 = 0
        L_0x060c:
            boolean r1 = r1.f48919s
            if (r1 != 0) goto L_0x061e
            boolean r1 = r0.mo22970a()
            if (r1 == 0) goto L_0x061e
            boolean r0 = r0.mo22971b()
            if (r0 == 0) goto L_0x061e
            r0 = 1
            goto L_0x061f
        L_0x061e:
            r0 = 0
        L_0x061f:
            if (r2 != 0) goto L_0x0623
            if (r0 == 0) goto L_0x098e
        L_0x0623:
            j$.util.Optional r0 = r22.mo22952a()
            java.lang.Object r0 = r0.get()
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y.f48794d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.x r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16659x) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y) r2
            int r3 = r2.f48796a
            r5 = 1
            r3 = r3 | r5
            r2.f48796a = r3
            r2.f48798c = r5
            r2 = 0
            r7 = 0
        L_0x0646:
            int r3 = r0.size()
            if (r7 >= r3) goto L_0x0976
            java.lang.Object r3 = r0.get(r7)
            com.google.android.libraries.assistant.auto.tng.f.d.a.f r3 = (com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f) r3
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i.f48739j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.h r5 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h) r5
            java.lang.String r6 = r3.f41480e
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r8
            r6.getClass()
            int r9 = r8.f48741a
            r10 = 2
            r9 = r9 | r10
            r8.f48741a = r9
            r8.f48743c = r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah.f48726c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ae r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16633ae) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah) r8
            r9 = 3
            r8.f48729b = r9
            int r10 = r8.f48728a
            r11 = 1
            r10 = r10 | r11
            r8.f48728a = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah) r6
            r6.getClass()
            r8.f48744d = r6
            int r6 = r8.f48741a
            r6 = r6 | 4
            r8.f48741a = r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d.f48730c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.c r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16638c) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r8
            r10 = 5
            r8.f48733b = r10
            int r10 = r8.f48732a
            r11 = 1
            r10 = r10 | r11
            r8.f48732a = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d) r6
            r6.getClass()
            r8.f48746f = r6
            int r6 = r8.f48741a
            r6 = r6 | 16
            r8.f48741a = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            int r8 = r6.f48741a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r6.f48741a = r8
            r8 = 0
            r6.f48747g = r8
            int r6 = r3.f41478c
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r6 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.m29814a(r6)
            if (r6 != 0) goto L_0x06e8
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r6 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
        L_0x06e8:
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r8 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.TEXT_REPLY
            if (r6 != r8) goto L_0x06fc
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            int r8 = r6.f48741a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r6.f48741a = r8
            r8 = 1
            r6.f48747g = r8
        L_0x06fc:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t.f49073f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s) r6
            int r8 = r3.f41476a
            int r10 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13438a.m29704a(r8)
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x0974
            if (r11 == 0) goto L_0x07a2
            r10 = 1
            if (r11 == r10) goto L_0x0756
            r10 = 2
            if (r11 == r10) goto L_0x0719
        L_0x0716:
            r11 = 5
            goto L_0x07de
        L_0x0719:
            com.google.common.f.e r8 = f48836b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r10 = 46795(0xb6cb, float:6.5574E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r10)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r10 = r3.f41476a
            r11 = 7
            if (r10 != r11) goto L_0x0734
            java.lang.Object r10 = r3.f41477b
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0736
        L_0x0734:
            r10 = r19
        L_0x0736:
            java.lang.String r12 = "Setting TrackingActionData's Suggestion Id %s"
            r8.mo56389s(r12, r10)
            int r8 = r3.f41476a
            if (r8 != r11) goto L_0x0744
            java.lang.Object r8 = r3.f41477b
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0746
        L_0x0744:
            r8 = r19
        L_0x0746:
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r8.getClass()
            r11 = 5
            r10.f49076b = r11
            r10.f49077c = r8
            goto L_0x0716
        L_0x0756:
            r10 = 6
            if (r8 != r10) goto L_0x075e
            java.lang.Object r8 = r3.f41477b
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0760
        L_0x075e:
            r8 = r19
        L_0x0760:
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0716
            com.google.common.f.e r8 = f48836b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r11 = 46796(0xb6cc, float:6.5575E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r11)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r11 = r3.f41476a
            if (r11 != r10) goto L_0x0780
            java.lang.Object r11 = r3.f41477b
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x0782
        L_0x0780:
            r11 = r19
        L_0x0782:
            java.lang.String r12 = "Setting TrackingActionData's intentUrl %s"
            r8.mo56389s(r12, r11)
            int r8 = r3.f41476a
            if (r8 != r10) goto L_0x0790
            java.lang.Object r8 = r3.f41477b
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0792
        L_0x0790:
            r8 = r19
        L_0x0792:
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r11
            r8.getClass()
            r11.f49076b = r10
            r11.f49077c = r8
            goto L_0x0716
        L_0x07a2:
            com.google.common.f.e r8 = f48836b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r10 = 46794(0xb6ca, float:6.5572E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r10)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r10 = r3.f41476a
            r11 = 5
            if (r10 != r11) goto L_0x07bd
            java.lang.Object r10 = r3.f41477b
            com.google.assistant.e.j.du r10 = (com.google.assistant.p3897e.p3921j.C51805du) r10
            goto L_0x07bf
        L_0x07bd:
            com.google.assistant.e.j.du r10 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x07bf:
            java.lang.String r12 = "Setting TrackingActionData's clientInput %s"
            r8.mo56389s(r12, r10)
            int r8 = r3.f41476a
            if (r8 != r11) goto L_0x07cd
            java.lang.Object r8 = r3.f41477b
            com.google.assistant.e.j.du r8 = (com.google.assistant.p3897e.p3921j.C51805du) r8
            goto L_0x07cf
        L_0x07cd:
            com.google.assistant.e.j.du r8 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x07cf:
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r10
            r8.getClass()
            r10.f49077c = r8
            r8 = 2
            r10.f49076b = r8
        L_0x07de:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r8 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r10
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t) r6
            r6.getClass()
            r10.f48966b = r6
            int r6 = r10.f48965a
            r12 = 1
            r6 = r6 | r12
            r10.f48965a = r6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r6
            int[] r10 = f48837c
            r10 = r10[r2]
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r13
            int r14 = r13.f48978a
            r14 = r14 | r12
            r13.f48978a = r14
            r13.f48979b = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r10
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r6
            r6.getClass()
            r10.f48968d = r6
            int r6 = r10.f48965a
            r6 = r6 | 4
            r10.f48965a = r6
            com.google.common.b.hd r6 = f48838d
            int r10 = r3.f41478c
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r10 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.m29814a(r10)
            if (r10 != 0) goto L_0x083c
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r10 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
        L_0x083c:
            boolean r10 = r6.containsKey(r10)
            if (r10 == 0) goto L_0x0906
            int r3 = r3.f41478c
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r3 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.m29814a(r3)
            if (r3 != 0) goto L_0x084c
            com.google.android.libraries.assistant.auto.tng.f.d.a.e r3 = com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e.UNRECOGNIZED
        L_0x084c:
            java.lang.Object r3 = r6.get(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ao r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16682ao) r3
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi.f48976c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bh r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh) r6
            java.lang.Integer r10 = r3.mo22975c()
            int r10 = r10.intValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r12
            int r13 = r12.f48978a
            r14 = 1
            r13 = r13 | r14
            r12.f48978a = r13
            r12.f48979b = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r10
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi) r6
            r6.getClass()
            r10.f48968d = r6
            int r6 = r10.f48965a
            r6 = r6 | 4
            r10.f48965a = r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah r6 = r3.mo22973a()
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r10
            r6.getClass()
            r10.f48744d = r6
            int r6 = r10.f48741a
            r6 = r6 | 4
            r10.f48741a = r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.n r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n) r6
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p.f48768c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.o r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o) r10
            java.lang.Integer r3 = r3.mo22974b()
            int r3 = r3.intValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r12
            r13 = 2
            r12.f48770a = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.f48771b = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r3
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p) r10
            r10.getClass()
            r3.f48777c = r10
            int r10 = r3.f48775a
            r10 = r10 | r13
            r3.f48775a = r10
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r3
            r10 = 0
            r3.f48776b = r10
            int r12 = r3.f48775a
            r13 = 1
            r12 = r12 | r13
            r3.f48775a = r12
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r3
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s) r6
            r6.getClass()
            r3.f48742b = r6
            int r6 = r3.f48741a
            r6 = r6 | r13
            r3.f48741a = r6
            goto L_0x0907
        L_0x0906:
            r10 = 0
        L_0x0907:
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r3
            com.google.protobuf.bv r6 = r8.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r6
            r6.getClass()
            r3.f48748h = r6
            int r6 = r3.f48741a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r3.f48741a = r6
            if (r7 != 0) goto L_0x095b
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r3
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r3 = r3.f48748h
            if (r3 != 0) goto L_0x092b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x092b:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bd r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r6
            int r7 = r6.f48965a
            r8 = 2
            r7 = r7 | r8
            r6.f48965a = r7
            r7 = 1
            r6.f48967c = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be) r3
            r3.getClass()
            r6.f48748h = r3
            int r3 = r6.f48741a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r6.f48741a = r3
            r7 = 0
            goto L_0x095c
        L_0x095b:
            r8 = 2
        L_0x095c:
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r3
            int r3 = r3.f48741a
            r6 = 1
            r3 = r3 & r6
            if (r3 != 0) goto L_0x0968
            int r2 = r2 + 1
        L_0x0968:
            com.google.protobuf.bv r3 = r5.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r3 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r3
            r1.mo22947a(r3)
            int r7 = r7 + r6
            goto L_0x0646
        L_0x0974:
            r0 = 0
            throw r0
        L_0x0976:
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y) r0
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r1
            r0.getClass()
            r1.mo22951c()
            com.google.protobuf.cq r1 = r1.f48809h
            r1.add(r0)
        L_0x098e:
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            int r1 = r0.f48802a
            r2 = 1
            r1 = r1 | r2
            r0.f48802a = r1
            r0.f48803b = r2
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r0 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            return r0
        L_0x09a8:
            com.google.common.f.e r0 = f48836b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Contact header is missing selectedContact and cannot be rendered."
            r2 = 46802(0xb6d2, float:6.5584E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16683ap.m33743d(com.google.assistant.e.c.c.bj, java.util.List, com.google.android.libraries.assistant.auto.tng.ui.c.d, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.al, com.google.assistant.e.j.e.ep, java.lang.String):j$.util.Optional");
    }
}
