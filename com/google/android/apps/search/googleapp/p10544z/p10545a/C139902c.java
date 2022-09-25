package com.google.android.apps.search.googleapp.p10544z.p10545a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.z.a.c */
/* compiled from: PG */
public final class C139902c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C139902c f380315b;

    /* renamed from: c */
    public static final C62965cl f380316c = new C62965cl(C139905f.f380322c, C139905f.UNKNOWN);

    /* renamed from: d */
    private static volatile C63010eb f380317d;

    /* renamed from: a */
    public C62995dn f380318a = C62995dn.f170057a;

    static {
        C139902c cVar = new C139902c();
        f380315b = cVar;
        C62942bv.registerDefaultInstance(C139902c.class, cVar);
    }

    private C139902c() {
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
                return newMessageInfo(f380315b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001࠲", new Object[]{"a", C139901b.f380314a, C139905f.m227514b()});
            case 3:
                return new C139902c();
            case 4:
                return new C139900a();
            case 5:
                return f380315b;
            case 6:
                C63010eb ebVar = f380317d;
                if (ebVar == null) {
                    synchronized (C139902c.class) {
                        ebVar = f380317d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380315b);
                            f380317d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
