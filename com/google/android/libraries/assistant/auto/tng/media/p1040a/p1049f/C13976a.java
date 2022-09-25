package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52177ib;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52180ie;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.f.a */
/* compiled from: PG */
public final class C13976a {

    /* renamed from: a */
    private static final C59071e f42554a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.f.a");

    /* renamed from: a */
    public static C52070ec m30266a(C52235kf kfVar, String str) {
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = str;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        ecVar.f136654b = kgVar3;
        ecVar.f136653a |= 1;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: b */
    public static C52070ec m30267b(String str) {
        if (str == null) {
            ((C59052c) ((C59052c) f42554a.mo56226d()).mo56372aa(45246)).mo56389s("%s", "No active media controller.");
            return m30266a(C52235kf.NOT_FOUND, "No active media controller.");
        }
        ((C59052c) ((C59052c) f42554a.mo56226d()).mo56372aa(45245)).mo56389s("%s", "Failed to get active media controller.");
        return m30269d(str, C52179id.MEDIA_SESSION_UNSUPPORTED, "Failed to get active media controller.");
    }

    /* renamed from: c */
    public static C52070ec m30268c(Optional optional, Optional optional2, Optional optional3, Optional optional4, C69464a aVar) {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        if (optional4.isPresent()) {
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.UNKNOWN;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            String obj = ((CharSequence) optional4.get()).toString();
            kdVar.copyOnWrite();
            C52236kg kgVar2 = (C52236kg) kdVar.instance;
            obj.getClass();
            kgVar2.f137091a |= 2;
            kgVar2.f137093c = obj;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar3 = (C52236kg) kdVar.build();
            kgVar3.getClass();
            ecVar.f136654b = kgVar3;
            ecVar.f136653a |= 1;
        } else {
            C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar2 = ((Boolean) aVar.mo17428b()).booleanValue() ? C52235kf.IGNORE : C52235kf.OK;
            kdVar2.copyOnWrite();
            C52236kg kgVar4 = (C52236kg) kdVar2.instance;
            kgVar4.f137092b = kfVar2.f137088t;
            kgVar4.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar2 = (C52070ec) dzVar.instance;
            C52236kg kgVar5 = (C52236kg) kdVar2.build();
            kgVar5.getClass();
            ecVar2.f136654b = kgVar5;
            ecVar2.f136653a |= 1;
        }
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        if (optional.isPresent()) {
            eaVar.mo53780b(m30271f("play_media_op_result", "assistant.api.client_op.PlayMediaOpResult", ((C52180ie) optional.get()).toByteString()));
        }
        if (optional2.isPresent()) {
            eaVar.mo53780b(m30271f("media_initiation_op_result", "assistant.api.client_op.MediaInitiationOpResult", ((C52163ho) optional2.get()).toByteString()));
        }
        if (optional3.isPresent()) {
            eaVar.mo53780b((C52232kc) optional3.get());
        }
        if (((C52069eb) eaVar.instance).f136650a.size() > 0) {
            dzVar.copyOnWrite();
            C52070ec ecVar3 = (C52070ec) dzVar.instance;
            C52069eb ebVar = (C52069eb) eaVar.build();
            ebVar.getClass();
            ecVar3.f136655c = ebVar;
            ecVar3.f136653a |= 2;
        }
        return (C52070ec) dzVar.build();
    }

    /* renamed from: d */
    public static C52070ec m30269d(String str, C52179id idVar, CharSequence charSequence) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        C52177ib ibVar = (C52177ib) C52180ie.f136954d.createBuilder();
        ibVar.copyOnWrite();
        C52180ie ieVar = (C52180ie) ibVar.instance;
        ieVar.f136957b = idVar.f136953B;
        ieVar.f136956a |= 2;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "play_media_op_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = ((C52180ie) ibVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.PlayMediaOpResult";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        ((C59052c) ((C59052c) f42554a.mo56226d()).mo56372aa(45247)).mo56354G("Media app %s returned Error: %s", str, charSequence);
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.UNKNOWN;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        String str2 = "Package: " + str + " Error: " + charSequence.toString();
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = str2;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        ecVar.f136654b = kgVar3;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: e */
    public static C52180ie m30270e(C52179id idVar, Long l) {
        C52177ib ibVar = (C52177ib) C52180ie.f136954d.createBuilder();
        if (idVar != null) {
            ibVar.copyOnWrite();
            C52180ie ieVar = (C52180ie) ibVar.instance;
            ieVar.f136957b = idVar.f136953B;
            ieVar.f136956a |= 2;
        }
        if (l != null) {
            long longValue = l.longValue();
            ibVar.copyOnWrite();
            C52180ie ieVar2 = (C52180ie) ibVar.instance;
            ieVar2.f136956a |= 4;
            ieVar2.f136958c = longValue;
        }
        return (C52180ie) ibVar.build();
    }

    /* renamed from: f */
    private static C52232kc m30271f(String str, String str2, C63088z zVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = zVar;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = str2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }
}
