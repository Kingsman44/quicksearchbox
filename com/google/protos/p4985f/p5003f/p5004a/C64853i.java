package com.google.protos.p4985f.p5003f.p5004a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3989p.p3990a.C53048j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5127o.C65695u;

/* renamed from: com.google.protos.f.f.a.i */
/* compiled from: PG */
public final class C64853i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64853i f175746e;

    /* renamed from: f */
    public static final C62940bt f175747f;

    /* renamed from: g */
    private static volatile C63010eb f175748g;

    /* renamed from: a */
    public int f175749a;

    /* renamed from: b */
    public C64849e f175750b;

    /* renamed from: c */
    public C53048j f175751c;

    /* renamed from: d */
    public boolean f175752d;

    static {
        C64853i iVar = new C64853i();
        f175746e = iVar;
        C62942bv.registerDefaultInstance(C64853i.class, iVar);
        f175747f = C62942bv.newSingularGeneratedExtension(C65695u.f178492a, iVar, iVar, (C62958ce) null, 330609823, C63066gd.MESSAGE, C64853i.class);
    }

    private C64853i() {
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
                return newMessageInfo(f175746e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64853i();
            case 4:
                return new C64852h();
            case 5:
                return f175746e;
            case 6:
                C63010eb ebVar = f175748g;
                if (ebVar == null) {
                    synchronized (C64853i.class) {
                        ebVar = f175748g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175746e);
                            f175748g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
