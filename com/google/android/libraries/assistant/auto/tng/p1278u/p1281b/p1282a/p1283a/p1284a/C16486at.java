package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8867w.p8872c.C118754e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p883a.C13012b;
import com.google.android.libraries.assistant.auto.tng.common.p930o.C13299b;
import com.google.android.libraries.assistant.auto.tng.p1117q.C15533a;
import com.google.android.libraries.assistant.auto.tng.p1117q.C15534b;
import com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1165a.p1166a.C15758a;
import com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1165a.p1166a.C15759b;
import com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1165a.p1166a.C15760c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13194a;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13202c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51298cn;
import com.google.assistant.p3897e.p3917i.p3918a.C51302cr;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51305cu;
import com.google.assistant.p3897e.p3917i.p3918a.C51308cx;
import com.google.assistant.p3897e.p3917i.p3918a.C51310cz;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51323dl;
import com.google.assistant.p3897e.p3917i.p3918a.C51325dn;
import com.google.assistant.p3897e.p3917i.p3918a.C51329dr;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51340eb;
import com.google.assistant.p3897e.p3917i.p3918a.C51342ed;
import com.google.assistant.p3897e.p3917i.p3918a.C51343ee;
import com.google.assistant.p3897e.p3917i.p3918a.C51344ef;
import com.google.assistant.p3897e.p3917i.p3918a.C51353eo;
import com.google.assistant.p3897e.p3917i.p3918a.C51355eq;
import com.google.assistant.p3897e.p3917i.p3918a.C51357es;
import com.google.assistant.p3897e.p3917i.p3918a.C51358et;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52404qm;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.assistant.p3897e.p3921j.C52406qo;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52425rg;
import com.google.assistant.p3897e.p3921j.C52426rh;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p001a.p007b.p011b.p012a.C0031g;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.at */
/* compiled from: PG */
public final class C16486at {

    /* renamed from: a */
    public static final C59071e f48423a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.at");

    /* renamed from: b */
    private static final C58495hd f48424b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("android.permission.READ_CONTACTS", C51298cn.READ_CONTACTS);
        gzVar.mo55429h("android.permission.CALL_PHONE", C51298cn.CALL_PHONE);
        gzVar.mo55429h("android.permission.CALL_PRIVILEGED", C51298cn.CALL_PRIVILEGED);
        gzVar.mo55429h("android.permission.READ_CALL_LOG", C51298cn.READ_CALL_LOG);
        gzVar.mo55429h("android.permission.SEND_SMS", C51298cn.SEND_SMS);
        gzVar.mo55429h("android.permission.READ_SMS", C51298cn.READ_SMS);
        f48424b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    static int m33449a(AudioManager audioManager) {
        double streamVolume = (double) audioManager.getStreamVolume(3);
        double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
        Double.isNaN(streamVolume);
        Double.isNaN(streamMaxVolume);
        return (int) ((streamVolume / streamMaxVolume) * 100.0d);
    }

    /* renamed from: b */
    static C51334dw m33450b(Optional optional, C12991i iVar, AudioManager audioManager, C58833ax axVar, C51358et etVar, int i, boolean z, Context context, String str, boolean z2, boolean z3, Optional optional2, C15533a aVar, C21370a aVar2, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, int i2, C58833ax axVar6, C58833ax axVar7, C69464a aVar3, C69464a aVar4, String str2) {
        C51329dr drVar;
        Object obj;
        C12991i iVar2 = iVar;
        String str3 = str;
        C15533a aVar5 = aVar;
        C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
        if (optional.isPresent()) {
            String str4 = (String) optional.get();
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            str4.getClass();
            dwVar.f133685a |= 134217728;
            dwVar.f133709w = str4;
        }
        AudioManager audioManager2 = audioManager;
        if (audioManager.isStreamMute(3)) {
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            dwVar2.f133685a |= 4096;
            dwVar2.f133699m = true;
        }
        Map.EL.forEach(f48424b, new C16483aq(context, csVar));
        if (aVar5 == C15533a.GRANTED) {
            csVar.mo53574a(C51298cn.BIND_NOTIFICATION_LISTENER_SERVICE);
        } else if (aVar5 == C15533a.UNKNOWN) {
            ((C59052c) ((C59052c) f48423a.mo56226d()).mo56372aa(46337)).mo56386p("Could not determine notification access permission");
        }
        csVar.copyOnWrite();
        C51334dw dwVar3 = (C51334dw) csVar.instance;
        dwVar3.f133688b |= 33554432;
        dwVar3.f133674P = i2;
        if (!TextUtils.isEmpty(str)) {
            C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
            C52425rg rgVar = (C52425rg) C52426rh.f137553d.createBuilder();
            rgVar.copyOnWrite();
            C52426rh rhVar = (C52426rh) rgVar.instance;
            str.getClass();
            rhVar.f137555a |= 1;
            rhVar.f137556b = str3;
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            C52426rh rhVar2 = (C52426rh) rgVar.build();
            rhVar2.getClass();
            rjVar.f137566g = rhVar2;
            rjVar.f137560a |= 128;
            riVar.copyOnWrite();
            C52428rj rjVar2 = (C52428rj) riVar.instance;
            str.getClass();
            rjVar2.f137560a |= 8;
            rjVar2.f137563d = str3;
            csVar.copyOnWrite();
            C51334dw dwVar4 = (C51334dw) csVar.instance;
            C52428rj rjVar3 = (C52428rj) riVar.build();
            rjVar3.getClass();
            dwVar4.f133696j = rjVar3;
            dwVar4.f133685a |= 256;
        } else if (z2) {
            C52427ri riVar2 = (C52427ri) C52428rj.f137558m.createBuilder();
            riVar2.copyOnWrite();
            C52428rj rjVar4 = (C52428rj) riVar2.instance;
            rjVar4.f137560a |= 8;
            rjVar4.f137563d = "android-device";
            csVar.copyOnWrite();
            C51334dw dwVar5 = (C51334dw) csVar.instance;
            C52428rj rjVar5 = (C52428rj) riVar2.build();
            rjVar5.getClass();
            dwVar5.f133696j = rjVar5;
            dwVar5.f133685a |= 256;
        }
        if (axVar.mo56113h() && ((Boolean) aVar3.mo17428b()).booleanValue()) {
            csVar.copyOnWrite();
            C51334dw dwVar6 = (C51334dw) csVar.instance;
            dwVar6.f133705s = ((C51310cz) axVar.mo56107c()).f133578d;
            dwVar6.f133685a |= C89885b.NOW_VALUE;
        }
        if (z3) {
            drVar = C51329dr.DISCLOSED;
        } else {
            drVar = C51329dr.NOT_DISCLOSED;
        }
        csVar.copyOnWrite();
        C51334dw dwVar7 = (C51334dw) csVar.instance;
        dwVar7.f133667H = drVar.f133640d;
        dwVar7.f133688b |= 8192;
        if (audioManager.isBluetoothScoOn() && !audioManager.isBluetoothScoAvailableOffCall()) {
            C51302cr crVar = C51302cr.BLUETOOTH_CALL_ONLY;
            csVar.copyOnWrite();
            C51334dw dwVar8 = (C51334dw) csVar.instance;
            dwVar8.f133702p = crVar.f133557f;
            dwVar8.f133685a |= 65536;
        } else if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
            C51302cr crVar2 = C51302cr.BLUETOOTH;
            csVar.copyOnWrite();
            C51334dw dwVar9 = (C51334dw) csVar.instance;
            dwVar9.f133702p = crVar2.f133557f;
            dwVar9.f133685a |= 65536;
        } else if (audioManager.isWiredHeadsetOn()) {
            C51302cr crVar3 = C51302cr.WIRED_HEADSET;
            csVar.copyOnWrite();
            C51334dw dwVar10 = (C51334dw) csVar.instance;
            dwVar10.f133702p = crVar3.f133557f;
            dwVar10.f133685a |= 65536;
        } else {
            C51302cr crVar4 = C51302cr.PHONE;
            csVar.copyOnWrite();
            C51334dw dwVar11 = (C51334dw) csVar.instance;
            dwVar11.f133702p = crVar4.f133557f;
            dwVar11.f133685a |= 65536;
        }
        if (axVar2.mo56113h()) {
            C51344ef efVar = (C51344ef) axVar2.mo56107c();
            csVar.copyOnWrite();
            C51334dw dwVar12 = (C51334dw) csVar.instance;
            efVar.getClass();
            dwVar12.f133668I = efVar;
            dwVar12.f133688b |= 16384;
        }
        if (axVar3.mo56113h()) {
            axVar3.mo56107c();
            boolean booleanValue = ((Boolean) axVar3.mo56107c()).booleanValue();
            csVar.copyOnWrite();
            C51334dw dwVar13 = (C51334dw) csVar.instance;
            dwVar13.f133688b |= 268435456;
            dwVar13.f133675Q = booleanValue;
        }
        if (axVar4.mo56113h()) {
            C13299b bVar = (C13299b) axVar4.mo56107c();
            C51323dl a = bVar.mo21013a();
            csVar.copyOnWrite();
            C51334dw dwVar14 = (C51334dw) csVar.instance;
            dwVar14.f133680V = a.f133626f;
            dwVar14.f133689c |= 8;
            C51325dn b = bVar.mo21014b();
            csVar.copyOnWrite();
            C51334dw dwVar15 = (C51334dw) csVar.instance;
            dwVar15.f133681W = b.f133632d;
            dwVar15.f133689c |= 16;
        }
        if (axVar5.mo56113h()) {
            csVar.copyOnWrite();
            C51334dw dwVar16 = (C51334dw) csVar.instance;
            dwVar16.f133703q = ((C51333dv) axVar5.mo56107c()).f133656g;
            dwVar16.f133685a |= C89885b.S3REQUEST_VALUE;
        }
        if (axVar6.mo56113h()) {
            csVar.copyOnWrite();
            C51334dw dwVar17 = (C51334dw) csVar.instance;
            dwVar17.f133701o = ((C51305cu) axVar6.mo56107c()).f133565f;
            dwVar17.f133685a |= 16384;
        }
        if (axVar7.mo56113h() && ((Boolean) aVar3.mo17428b()).booleanValue()) {
            csVar.copyOnWrite();
            C51334dw dwVar18 = (C51334dw) csVar.instance;
            dwVar18.f133708v = ((C51308cx) axVar7.mo56107c()).f133572d;
            dwVar18.f133685a |= 33554432;
        }
        C51313db dbVar = C51313db.OPA;
        C12989g a2 = C12989g.m29225a(iVar2.f40385d);
        if (a2 == null) {
            a2 = C12989g.UNKNOWN;
        }
        if (a2 == C12989g.MORRIS) {
            csVar.copyOnWrite();
            C51334dw dwVar19 = (C51334dw) csVar.instance;
            dwVar19.f133711y = 3;
            dwVar19.f133685a |= 536870912;
            C62940bt r4 = C62942bv.checkIsLite(C13012b.f40423f);
            iVar.mo58887l(r4);
            if (iVar2.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt r42 = C62942bv.checkIsLite(C13012b.f40423f);
                iVar.mo58887l(r42);
                Object l = iVar2.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                C0031g gVar = ((C13012b) obj).f40426b;
                if (gVar == null) {
                    gVar = C0031g.f92d;
                }
                C0027c a3 = C0027c.m9a(gVar.f94a);
                if (a3 == null) {
                    a3 = C0027c.UNRECOGNIZED;
                }
                if (a3 == C0027c.MINI) {
                    dbVar = C51313db.GMM;
                }
            }
        }
        C51331dt dtVar = C51331dt.FULLY_TRUSTED;
        csVar.copyOnWrite();
        C51334dw dwVar20 = (C51334dw) csVar.instance;
        dwVar20.f133665F = dtVar.f133647e;
        dwVar20.f133688b |= 1024;
        if (optional2.isPresent() && ((Boolean) aVar4.mo17428b()).booleanValue()) {
            boolean booleanValue2 = ((Boolean) optional2.get()).booleanValue();
            csVar.copyOnWrite();
            C51334dw dwVar21 = (C51334dw) csVar.instance;
            dwVar21.f133688b |= 256;
            dwVar21.f133663D = booleanValue2;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str2.replace('_', '-'));
        String country = forLanguageTag.getCountry();
        csVar.copyOnWrite();
        C51334dw dwVar22 = (C51334dw) csVar.instance;
        country.getClass();
        dwVar22.f133685a |= 2;
        dwVar22.f133691e = country;
        String language = forLanguageTag.getLanguage();
        csVar.copyOnWrite();
        C51334dw dwVar23 = (C51334dw) csVar.instance;
        language.getClass();
        dwVar23.f133685a |= 1;
        dwVar23.f133690d = language;
        csVar.copyOnWrite();
        C51334dw dwVar24 = (C51334dw) csVar.instance;
        etVar.getClass();
        dwVar24.f133710x = etVar;
        dwVar24.f133685a = 268435456 | dwVar24.f133685a;
        csVar.copyOnWrite();
        C51334dw dwVar25 = (C51334dw) csVar.instance;
        dwVar25.f133685a |= 512;
        dwVar25.f133697k = i;
        C52406qo qoVar = (C52406qo) C52407qp.f137523d.createBuilder();
        long b2 = aVar2.mo26870b();
        qoVar.copyOnWrite();
        C52407qp qpVar = (C52407qp) qoVar.instance;
        qpVar.f137525a |= 1;
        qpVar.f137526b = b2 / 1000;
        csVar.copyOnWrite();
        C51334dw dwVar26 = (C51334dw) csVar.instance;
        C52407qp qpVar2 = (C52407qp) qoVar.build();
        qpVar2.getClass();
        dwVar26.f133693g = qpVar2;
        dwVar26.f133685a |= 16;
        C52404qm qmVar = (C52404qm) C52405qn.f137519c.createBuilder();
        String id = TimeZone.getDefault().getID();
        qmVar.copyOnWrite();
        C52405qn qnVar = (C52405qn) qmVar.instance;
        id.getClass();
        qnVar.f137521a |= 1;
        qnVar.f137522b = id;
        csVar.copyOnWrite();
        C51334dw dwVar27 = (C51334dw) csVar.instance;
        C52405qn qnVar2 = (C52405qn) qmVar.build();
        qnVar2.getClass();
        dwVar27.f133694h = qnVar2;
        dwVar27.f133685a |= 32;
        csVar.copyOnWrite();
        C51334dw dwVar28 = (C51334dw) csVar.instance;
        dwVar28.f133704r = dbVar.f133603s;
        dwVar28.f133685a |= 524288;
        csVar.copyOnWrite();
        C51334dw dwVar29 = (C51334dw) csVar.instance;
        dwVar29.f133689c |= 2;
        dwVar29.f133678T = z;
        return (C51334dw) csVar.build();
    }

    /* renamed from: c */
    static C51358et m33451c(Context context, PowerManager powerManager) {
        C51357es esVar;
        C51353eo eoVar = (C51353eo) C51358et.f133769d.createBuilder();
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            C51355eq eqVar = C51355eq.PORTRAIT;
            eoVar.copyOnWrite();
            C51358et etVar = (C51358et) eoVar.instance;
            etVar.f133773c = eqVar.f133762d;
            etVar.f133771a |= 8;
        } else if (i != 2) {
            C51355eq eqVar2 = C51355eq.UNKNOWN;
            eoVar.copyOnWrite();
            C51358et etVar2 = (C51358et) eoVar.instance;
            etVar2.f133773c = eqVar2.f133762d;
            etVar2.f133771a |= 8;
        } else {
            C51355eq eqVar3 = C51355eq.LANDSCAPE;
            eoVar.copyOnWrite();
            C51358et etVar3 = (C51358et) eoVar.instance;
            etVar3.f133773c = eqVar3.f133762d;
            etVar3.f133771a |= 8;
        }
        if (powerManager.isInteractive()) {
            esVar = C51357es.ON;
        } else {
            esVar = C51357es.OFF;
        }
        eoVar.copyOnWrite();
        C51358et etVar4 = (C51358et) eoVar.instance;
        etVar4.f133772b = esVar.f133768d;
        etVar4.f133771a |= 1;
        return (C51358et) eoVar.build();
    }

    /* renamed from: d */
    static C58833ax m33452d(C51334dw dwVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.device.properties";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.DeviceProperties";
        C63088z byteString = dwVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }

    /* renamed from: e */
    static C58833ax m33453e(C58833ax axVar, boolean z) {
        if (!axVar.mo56113h() || !((Boolean) axVar.mo56107c()).booleanValue()) {
            return z ? C58833ax.m90834k(C51333dv.SIGNED_IN_AND_OPTED_IN) : C58836b.f156633a;
        }
        return C58833ax.m90834k(C51333dv.SIGNED_OUT);
    }

    /* renamed from: f */
    static C60870cx m33454f(C58833ax axVar, C58833ax axVar2, Executor executor) {
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!((C13194a) axVar.mo56107c()).mo20972c()) {
            ((C59052c) ((C59052c) f48423a.mo56224b()).mo56372aa(46346)).mo56386p("No connected phone for contact permission");
            return C60856cj.m92900i(C58836b.f156633a);
        } else if (axVar2.mo56113h()) {
            return C60922j.m93045h(((C13194a) axVar.mo56107c()).mo20970a(), C47810es.m84966f(new C16485as(axVar2, executor)), executor);
        } else {
            ((C59052c) ((C59052c) f48423a.mo56226d()).mo56372aa(46345)).mo56386p("No contact upload data accessor");
            return C60856cj.m92900i(C58836b.f156633a);
        }
    }

    /* renamed from: g */
    static C60870cx m33455g(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C15533a.UNKNOWN);
        }
        return ((C15534b) axVar.mo56107c()).mo22394a();
    }

    /* renamed from: h */
    static C60870cx m33456h(C58833ax axVar, C58833ax axVar2, Executor executor) {
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C13194a aVar = (C13194a) axVar.mo56107c();
        if (!aVar.mo20972c()) {
            ((C59052c) ((C59052c) f48423a.mo56224b()).mo56372aa(46349)).mo56386p("No connected phone");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        boolean e = aVar.mo20974e();
        boolean d = aVar.mo20973d();
        boolean f = aVar.mo20975f();
        C51340eb ebVar = (C51340eb) C51342ed.f133723f.createBuilder();
        ebVar.copyOnWrite();
        C51342ed edVar = (C51342ed) ebVar.instance;
        edVar.f133725a |= 1;
        edVar.f133726b = d;
        ebVar.copyOnWrite();
        C51342ed edVar2 = (C51342ed) ebVar.instance;
        edVar2.f133725a |= 2;
        edVar2.f133727c = e;
        ebVar.copyOnWrite();
        C51342ed edVar3 = (C51342ed) ebVar.instance;
        edVar3.f133725a |= 4;
        edVar3.f133728d = f;
        if (axVar2.mo56113h()) {
            return C60922j.m93044g(aVar.mo20970a(), C47810es.m84963c(new C16482ap(aVar, (C13202c) axVar2.mo56107c(), ebVar)), executor);
        }
        ((C59052c) ((C59052c) f48423a.mo56226d()).mo56372aa(46344)).mo56386p("No device type checker");
        C51343ee eeVar = (C51343ee) C51344ef.f133730b.createBuilder();
        eeVar.mo53587a(ebVar);
        return C60856cj.m92900i(C58833ax.m90834k((C51344ef) eeVar.build()));
    }

    /* renamed from: i */
    static C60870cx m33457i(C16884b bVar) {
        return bVar.mo23066a();
    }

    /* renamed from: j */
    static C60870cx m33458j(C16884b bVar) {
        return bVar.mo23068c();
    }

    /* renamed from: k */
    static C60870cx m33459k(C32221c cVar) {
        return cVar.mo38005e();
    }

    /* renamed from: l */
    static boolean m33460l(Context context) {
        return (context == null || Settings.Global.getInt(context.getContentResolver(), "zen_mode", 0) == 0) ? false : true;
    }

    /* renamed from: m */
    static C60870cx m33461m(C15760c cVar) {
        C60870cx b = cVar.f46960a.mo20979b(cVar.f46961b);
        C118754e eVar = cVar.f46963d;
        Objects.requireNonNull(eVar);
        C15759b bVar = new C15759b(eVar);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(bVar), cVar.f46962c);
        C15758a aVar = C15758a.f46958a;
        return C60922j.m93044g(h, C47810es.m84963c(aVar), cVar.f46962c);
    }
}
