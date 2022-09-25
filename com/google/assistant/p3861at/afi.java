package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afi */
/* compiled from: PG */
public final class afi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final afi f129156a;

    /* renamed from: c */
    private static volatile C63010eb f129157c;

    /* renamed from: b */
    private C62995dn f129158b = C62995dn.f170057a;

    static {
        afi afi = new afi();
        f129156a = afi;
        C62942bv.registerDefaultInstance(afi.class, afi);
    }

    private afi() {
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
                return newMessageInfo(f129156a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", afh.f129155a});
            case 3:
                return new afi();
            case 4:
                return new afg();
            case 5:
                return f129156a;
            case 6:
                C63010eb ebVar = f129157c;
                if (ebVar == null) {
                    synchronized (afi.class) {
                        ebVar = f129157c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129156a);
                            f129157c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
