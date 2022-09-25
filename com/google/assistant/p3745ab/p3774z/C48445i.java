package com.google.assistant.p3745ab.p3774z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.z.i */
/* compiled from: PG */
public final class C48445i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48445i f125168a;

    /* renamed from: d */
    private static volatile C63010eb f125169d;

    /* renamed from: b */
    private int f125170b;

    /* renamed from: c */
    private C48444h f125171c;

    static {
        C48445i iVar = new C48445i();
        f125168a = iVar;
        C62942bv.registerDefaultInstance(C48445i.class, iVar);
    }

    private C48445i() {
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f125168a, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0000\fဉ\f", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48445i();
            case 4:
                return new C48441e();
            case 5:
                return f125168a;
            case 6:
                C63010eb ebVar = f125169d;
                if (ebVar == null) {
                    synchronized (C48445i.class) {
                        ebVar = f125169d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125168a);
                            f125169d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
