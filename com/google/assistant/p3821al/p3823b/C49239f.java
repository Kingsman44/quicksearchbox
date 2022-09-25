package com.google.assistant.p3821al.p3823b;

import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.al.b.f */
/* compiled from: PG */
public final class C49239f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49239f f127295c;

    /* renamed from: d */
    public static final C62940bt f127296d;

    /* renamed from: e */
    private static volatile C63010eb f127297e;

    /* renamed from: a */
    public int f127298a;

    /* renamed from: b */
    public C63042fg f127299b;

    static {
        C49239f fVar = new C49239f();
        f127295c = fVar;
        C62942bv.registerDefaultInstance(C49239f.class, fVar);
        f127296d = C62942bv.newSingularGeneratedExtension(C61690bd.f166668a, fVar, fVar, (C62958ce) null, 1011, C63066gd.MESSAGE, C49239f.class);
    }

    private C49239f() {
        emptyProtobufList();
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
                return newMessageInfo(f127295c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C49239f();
            case 4:
                return new C49238e();
            case 5:
                return f127295c;
            case 6:
                C63010eb ebVar = f127297e;
                if (ebVar == null) {
                    synchronized (C49239f.class) {
                        ebVar = f127297e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127295c);
                            f127297e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
