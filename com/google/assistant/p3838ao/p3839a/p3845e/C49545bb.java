package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bb */
/* compiled from: PG */
public final class C49545bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49545bb f127844b;

    /* renamed from: c */
    public static final C62940bt f127845c;

    /* renamed from: d */
    private static volatile C63010eb f127846d;

    /* renamed from: a */
    public C62971cq f127847a = C62942bv.emptyProtobufList();

    static {
        C49545bb bbVar = new C49545bb();
        f127844b = bbVar;
        C62942bv.registerDefaultInstance(C49545bb.class, bbVar);
        f127845c = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, bbVar, bbVar, (C62958ce) null, 266879543, C63066gd.MESSAGE, C49545bb.class);
    }

    private C49545bb() {
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
                return newMessageInfo(f127844b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C49545bb();
            case 4:
                return new C49544ba();
            case 5:
                return f127844b;
            case 6:
                C63010eb ebVar = f127846d;
                if (ebVar == null) {
                    synchronized (C49545bb.class) {
                        ebVar = f127846d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127844b);
                            f127846d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
