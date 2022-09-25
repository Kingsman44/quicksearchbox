package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.ff */
/* compiled from: PG */
public final class C53204ff extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53204ff f139458a;

    /* renamed from: b */
    public static final C62940bt f139459b;

    /* renamed from: c */
    private static volatile C63010eb f139460c;

    static {
        C53204ff ffVar = new C53204ff();
        f139458a = ffVar;
        C62942bv.registerDefaultInstance(C53204ff.class, ffVar);
        f139459b = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, ffVar, ffVar, (C62958ce) null, 115, C63066gd.MESSAGE, C53204ff.class);
    }

    private C53204ff() {
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
                return newMessageInfo(f139458a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53204ff();
            case 4:
                return new C53203fe();
            case 5:
                return f139458a;
            case 6:
                C63010eb ebVar = f139460c;
                if (ebVar == null) {
                    synchronized (C53204ff.class) {
                        ebVar = f139460c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139458a);
                            f139460c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
