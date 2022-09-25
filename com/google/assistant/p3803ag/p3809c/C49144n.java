package com.google.assistant.p3803ag.p3809c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.n */
/* compiled from: PG */
public final class C49144n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49144n f127085e;

    /* renamed from: g */
    private static volatile C63010eb f127086g;

    /* renamed from: a */
    public int f127087a;

    /* renamed from: b */
    public C62971cq f127088b = emptyProtobufList();

    /* renamed from: c */
    public boolean f127089c;

    /* renamed from: d */
    public C62971cq f127090d = emptyProtobufList();

    /* renamed from: f */
    private int f127091f;

    static {
        C49144n nVar = new C49144n();
        f127085e = nVar;
        C62942bv.registerDefaultInstance(C49144n.class, nVar);
    }

    private C49144n() {
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
                return newMessageInfo(f127085e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0005ဇ\u0001", new Object[]{C10662f.f35572a, "a", "b", C49143m.class, "d", C49141k.class, C45240c.f118157a});
            case 3:
                return new C49144n();
            case 4:
                return new C49088g();
            case 5:
                return f127085e;
            case 6:
                C63010eb ebVar = f127086g;
                if (ebVar == null) {
                    synchronized (C49144n.class) {
                        ebVar = f127086g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127085e);
                            f127086g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
