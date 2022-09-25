package com.google.p5261vr.p5266c9.p5267a.p5268a;

import com.google.p5261vr.p5266c9.p5267a.C67940b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.vr.c9.a.a.d */
/* compiled from: PG */
public final class C67939d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67939d f184130b;

    /* renamed from: c */
    public static final C62940bt f184131c;

    /* renamed from: d */
    private static volatile C63010eb f184132d;

    /* renamed from: a */
    public C62971cq f184133a = emptyProtobufList();

    static {
        C67939d dVar = new C67939d();
        f184130b = dVar;
        C62942bv.registerDefaultInstance(C67939d.class, dVar);
        f184131c = C62942bv.newSingularGeneratedExtension(C67940b.f184134c, dVar, dVar, (C62958ce) null, 298679738, C63066gd.MESSAGE, C67939d.class);
    }

    private C67939d() {
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
                return newMessageInfo(f184130b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C67937b.class});
            case 3:
                return new C67939d();
            case 4:
                return new C67938c();
            case 5:
                return f184130b;
            case 6:
                C63010eb ebVar = f184132d;
                if (ebVar == null) {
                    synchronized (C67939d.class) {
                        ebVar = f184132d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184130b);
                            f184132d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
