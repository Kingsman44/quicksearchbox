package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

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

/* renamed from: com.google.assistant.av.g.a.a.m */
/* compiled from: PG */
final class C50591m implements C18204ah {

    /* renamed from: a */
    private static final C65686l f131644a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.verticals.teleport.portable.proto.OnDeviceDeeplinkCacheService";
        f131644a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C50589k kVar = (C50589k) aoVar;
        if (((str.hashCode() == -1222502752 && str.equals("LookupDeeplink")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(kVar.mo53410a((C50584f) C18214ar.m35469b(sVar, C50584f.f131632b.getParserForType())), C50590l.f131643a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C50587i iVar = (C50587i) C50588j.f131638c.createBuilder();
        iVar.copyOnWrite();
        C50588j jVar = (C50588j) iVar.instance;
        hVar.getClass();
        jVar.f131641b = hVar;
        jVar.f131640a |= 1;
        return (C50588j) iVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f131644a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == -1222502752 && str.equals("LookupDeeplink")) ? (char) 0 : 65535) == 0) {
            return "assistant.verticals.teleport.portable.proto.LookupDeeplinkRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == -1222502752 && str.equals("LookupDeeplink")) ? (char) 0 : 65535) == 0) {
            return "assistant.verticals.teleport.portable.proto.LookupDeeplinkResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
