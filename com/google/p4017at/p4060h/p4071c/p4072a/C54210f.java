package com.google.p4017at.p4060h.p4071c.p4072a;

import com.google.p4283bv.p4287b.p4342b.C56947k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.at.h.c.a.f */
/* compiled from: PG */
public final class C54210f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54210f f142275c;

    /* renamed from: d */
    public static final C62940bt f142276d;

    /* renamed from: e */
    private static volatile C63010eb f142277e;

    /* renamed from: a */
    public int f142278a;

    /* renamed from: b */
    public C54208d f142279b;

    static {
        C54210f fVar = new C54210f();
        f142275c = fVar;
        C62942bv.registerDefaultInstance(C54210f.class, fVar);
        f142276d = C62942bv.newSingularGeneratedExtension(C56947k.f151990a, fVar, fVar, (C62958ce) null, 415207683, C63066gd.MESSAGE, C54210f.class);
    }

    private C54210f() {
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
                return newMessageInfo(f142275c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54210f();
            case 4:
                return new C54209e();
            case 5:
                return f142275c;
            case 6:
                C63010eb ebVar = f142277e;
                if (ebVar == null) {
                    synchronized (C54210f.class) {
                        ebVar = f142277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142275c);
                            f142277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
