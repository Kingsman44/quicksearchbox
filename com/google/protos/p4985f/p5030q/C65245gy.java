package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18295o;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.android.libraries.assistant.gallium.framework.p1505a.p1506a.C18196b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;
import p3186j$.util.Objects;

/* renamed from: com.google.protos.f.q.gy */
/* compiled from: PG */
final class C65245gy implements C18204ah {

    /* renamed from: a */
    public static final /* synthetic */ int f176542a = 0;

    /* renamed from: b */
    private static final C65686l f176543b;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.PortableAssistantStreamService";
        f176543b = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C65237gq gqVar = (C65237gq) aoVar;
        if (((str.hashCode() == -787012093 && str.equals("ConversationStream")) ? (char) 0 : 65535) == 0) {
            C65682h hVar = (C65682h) C18214ar.m35469b(sVar, C65682h.f178459f.getParserForType());
            C18295o k = C18295o.m35609k(dVar, str, hVar, "type.googleapis.com/assistant.portable.PortableAssistantResponse", C65191ey.f176424p.getParserForType());
            C18297q qVar = new C18297q();
            Objects.requireNonNull(k);
            qVar.f51916a = C58833ax.m90834k(new C65239gs(k));
            qVar.f51917b = C58833ax.m90834k(new C65240gt(k));
            C65682h b = dVar.mo23658b(hVar, qVar);
            C18196b.m35442a(dVar, C60922j.m93044g(C60922j.m93045h(gqVar.mo59365a(), C47810es.m84966f(new C65241gu(k)), dVar.mo23659c()), C47810es.m84963c(new C65242gv(dVar, hVar)), dVar.mo23659c()), new C65243gw(k, dVar, hVar));
            return C60856cj.m92900i(C18214ar.m35470c(b, "type.googleapis.com/gallium.Handle"));
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65246gz gzVar = (C65246gz) C65248ha.f176548c.createBuilder();
        gzVar.copyOnWrite();
        C65248ha haVar = (C65248ha) gzVar.instance;
        hVar.getClass();
        haVar.f176551b = hVar;
        haVar.f176550a |= 1;
        return (C65248ha) gzVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176543b;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == -787012093 && str.equals("ConversationStream")) ? (char) 0 : 65535) == 0) {
            return "assistant.portable.PortableAssistantRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == -787012093 && str.equals("ConversationStream")) ? (char) 0 : 65535) == 0) {
            return "assistant.portable.PortableAssistantResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
