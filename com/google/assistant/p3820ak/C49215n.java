package com.google.assistant.p3820ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.n */
/* compiled from: PG */
public final class C49215n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49215n f127253d;

    /* renamed from: e */
    private static volatile C63010eb f127254e;

    /* renamed from: a */
    public int f127255a;

    /* renamed from: b */
    public C62971cq f127256b = emptyProtobufList();

    /* renamed from: c */
    public C49205d f127257c;

    static {
        C49215n nVar = new C49215n();
        f127253d = nVar;
        C62942bv.registerDefaultInstance(C49215n.class, nVar);
    }

    private C49215n() {
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
                return newMessageInfo(f127253d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C49214m.class, C45240c.f118157a});
            case 3:
                return new C49215n();
            case 4:
                return new C49206e();
            case 5:
                return f127253d;
            case 6:
                C63010eb ebVar = f127254e;
                if (ebVar == null) {
                    synchronized (C49215n.class) {
                        ebVar = f127254e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127253d);
                            f127254e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
