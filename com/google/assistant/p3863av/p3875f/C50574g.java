package com.google.assistant.p3863av.p3875f;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18209am;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;

/* renamed from: com.google.assistant.av.f.g */
/* compiled from: PG */
final class C50574g implements C18204ah {

    /* renamed from: a */
    private static final C65686l f131613a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.verticals.productivity.RemindersService";
        f131613a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C50572e eVar = (C50572e) aoVar;
        if (((str.hashCode() == 1140440867 && str.equals("ListReminders")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(eVar.mo53409a((C50569b) C18214ar.m35469b(sVar, C50569b.f131604b.getParserForType())), C50573f.f131612a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C50575h hVar2 = (C50575h) C50576i.f131614c.createBuilder();
        hVar2.copyOnWrite();
        C50576i iVar = (C50576i) hVar2.instance;
        hVar.getClass();
        iVar.f131617b = hVar;
        iVar.f131616a |= 1;
        return (C50576i) hVar2.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f131613a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 1140440867 && str.equals("ListReminders")) ? (char) 0 : 65535) == 0) {
            return "assistant.verticals.productivity.ListRemindersRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 1140440867 && str.equals("ListReminders")) ? (char) 0 : 65535) == 0) {
            return "assistant.verticals.productivity.ListRemindersResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
