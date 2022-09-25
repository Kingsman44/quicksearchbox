package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.d */
/* compiled from: PG */
public final class C66881d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66881d f181826b;

    /* renamed from: c */
    public static final C62940bt f181827c;

    /* renamed from: d */
    private static volatile C63010eb f181828d;

    /* renamed from: a */
    public C62971cq f181829a = emptyProtobufList();

    static {
        C66881d dVar = new C66881d();
        f181826b = dVar;
        C62942bv.registerDefaultInstance(C66881d.class, dVar);
        f181827c = C62942bv.newRepeatedGeneratedExtension(C67042ix.f182227l, dVar, (C62958ce) null, 386458583, C63066gd.MESSAGE, false, C66881d.class);
    }

    private C66881d() {
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
                return newMessageInfo(f181826b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66786b.class});
            case 3:
                return new C66881d();
            case 4:
                return new C66849c();
            case 5:
                return f181826b;
            case 6:
                C63010eb ebVar = f181828d;
                if (ebVar == null) {
                    synchronized (C66881d.class) {
                        ebVar = f181828d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181826b);
                            f181828d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
