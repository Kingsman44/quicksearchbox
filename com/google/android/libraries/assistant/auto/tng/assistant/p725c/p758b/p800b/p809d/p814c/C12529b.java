package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p814c;

import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.adn;
import com.google.assistant.p3897e.p3921j.ado;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C63088z;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.c.b */
/* compiled from: PG */
public final class C12529b {

    /* renamed from: a */
    public static final /* synthetic */ int f39459a = 0;

    /* renamed from: b */
    private static final C58528ij f39460b = C58528ij.m90015O("chat_message.SEND", "contact.LOOKUP", "credential.UPDATE", "device.MODIFY_SETTING", "device.REQUEST_PERMISSION", "precise_user_location.GET", "media.NEXT", "media.ON_DEVICE_LOOKUP", "media.PAUSE", "media.PREVIOUS", "media.REPLAY_MEDIA_ITEM", "media.RESUME", "media.SEEK_RELATIVE", "media.SEEK_TO_POSITION", "media.SET_PLAYBACK_RATE", "media.SET_RATING", "media.SET_REPEAT", "media.SHUFFLE", "media.STOP", "navigate.FETCH_CURRENT_STATUS", "notification.MARK_AS_READ", "notification.READ", "provider.OPEN", "provider.VERIFY", "sdk_actions.EXECUTE", "ui.THIRD_PARTY_EXIT_INDICATOR", "ui.THIRD_PARTY_START_INDICATOR", "ui.SHOW_NATIVE_FORM", "ui.SHOW_NOTIFICATION", "ui.SHOW_TEXT", "feedback.UPLOAD_CRASH_REPORT");

    /* renamed from: a */
    public static C51785da m28632a() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "call.CALL";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 3;
        return (C51785da) czVar.build();
    }

    /* renamed from: b */
    public static C51785da m28633b() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "media.PLAY_MEDIA";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.PlayMediaProperties";
        adn adn = (adn) ado.f134898b.createBuilder();
        adn.mo53675a(4);
        C63088z byteString = ((ado) adn.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a = 2 | kaVar2.f137059a;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        czVar.copyOnWrite();
        C51785da daVar3 = (C51785da) czVar.instance;
        kaVar3.getClass();
        daVar3.f135880d = kaVar3;
        daVar3.f135877a |= 4;
        return (C51785da) czVar.build();
    }

    /* renamed from: c */
    public static C51785da m28634c() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "notification.FETCH";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 3;
        return (C51785da) czVar.build();
    }

    /* renamed from: d */
    public static C51785da m28635d() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "notification.REPLY";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        return (C51785da) czVar.build();
    }

    /* renamed from: e */
    public static C51785da m28636e() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "tts.OUTPUT";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 3;
        return (C51785da) czVar.build();
    }

    /* renamed from: f */
    public static C51785da m28637f() {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "ui.CURRENT_ACTION_INDICATOR";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 13;
        return (C51785da) czVar.build();
    }

    /* renamed from: h */
    public static Set m28639h() {
        return (Set) Collection.EL.stream(f39460b).map(C12528a.f39458a).collect(C58370cn.f155947b);
    }

    /* renamed from: j */
    public static Set m28641j(boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "media.PREPARE_MEDIA";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.PlayMediaProperties";
        adn adn = (adn) ado.f134898b.createBuilder();
        adn.mo53675a(4);
        C63088z byteString = ((ado) adn.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a = 2 | kaVar2.f137059a;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        czVar.copyOnWrite();
        C51785da daVar3 = (C51785da) czVar.instance;
        kaVar3.getClass();
        daVar3.f135880d = kaVar3;
        daVar3.f135877a |= 4;
        return new C58759qy((C51785da) czVar.build());
    }

    /* renamed from: g */
    public static Set m28638g(boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "client.RECONNECT";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        return new C58759qy((C51785da) czVar.build());
    }

    /* renamed from: i */
    public static Set m28640i(boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.GET_SETTINGS";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return new C58759qy((C51785da) czVar.build());
    }
}
