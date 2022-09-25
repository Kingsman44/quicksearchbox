package com.google.protos.p4985f.p5030q;

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

/* renamed from: com.google.protos.f.q.cw */
/* compiled from: PG */
final class C65131cw implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176297a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.FlagSettingService";
        f176297a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C65129cu cuVar = (C65129cu) aoVar;
        if (((str.hashCode() == 2017982705 && str.equals("GetFlags")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(cuVar.mo39650a((C65128ct) C18214ar.m35469b(sVar, C65128ct.f176292b.getParserForType())), C65130cv.f176296a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65120cl clVar = (C65120cl) C65121cm.f176280c.createBuilder();
        clVar.copyOnWrite();
        C65121cm cmVar = (C65121cm) clVar.instance;
        hVar.getClass();
        cmVar.f176283b = hVar;
        cmVar.f176282a |= 1;
        return (C65121cm) clVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176297a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 2017982705 && str.equals("GetFlags")) ? (char) 0 : 65535) == 0) {
            return "assistant.portable.GetFlagsRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 2017982705 && str.equals("GetFlags")) ? (char) 0 : 65535) == 0) {
            return "assistant.portable.Flags";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
