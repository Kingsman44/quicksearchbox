package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9862b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.c */
/* compiled from: PG */
public final class C129921c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C129921c f356374b;

    /* renamed from: c */
    public static final C62965cl f356375c = new C62965cl(C129918b.f356370f, C129918b.UNRECOGNIZED);

    /* renamed from: d */
    private static volatile C63010eb f356376d;

    /* renamed from: a */
    public C62995dn f356377a = C62995dn.f170057a;

    static {
        C129921c cVar = new C129921c();
        f356374b = cVar;
        C62942bv.registerDefaultInstance(C129921c.class, cVar);
    }

    private C129921c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f356374b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C129920b.f356373a});
            case 3:
                return new C129921c();
            case 4:
                return new C129919a();
            case 5:
                return f356374b;
            case 6:
                C63010eb ebVar = f356376d;
                if (ebVar == null) {
                    synchronized (C129921c.class) {
                        ebVar = f356376d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356374b);
                            f356376d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
