package com.google.assistant.p3803ag.p3809c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ef */
/* compiled from: PG */
public final class C49040ef extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49040ef f126835e;

    /* renamed from: g */
    private static volatile C63010eb f126836g;

    /* renamed from: a */
    public int f126837a;

    /* renamed from: b */
    public C49036eb f126838b;

    /* renamed from: c */
    public C62971cq f126839c = emptyProtobufList();

    /* renamed from: d */
    public C62961ch f126840d = emptyIntList();

    /* renamed from: f */
    private int f126841f;

    static {
        C49040ef efVar = new C49040ef();
        f126835e = efVar;
        C62942bv.registerDefaultInstance(C49040ef.class, efVar);
    }

    private C49040ef() {
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
                return newMessageInfo(f126835e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b\u0005'", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, C49039ee.class, "d"});
            case 3:
                return new C49040ef();
            case 4:
                return new C49037ec();
            case 5:
                return f126835e;
            case 6:
                C63010eb ebVar = f126836g;
                if (ebVar == null) {
                    synchronized (C49040ef.class) {
                        ebVar = f126836g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126835e);
                            f126836g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
