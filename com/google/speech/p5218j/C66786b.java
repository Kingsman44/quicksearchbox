package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b */
/* compiled from: PG */
public final class C66786b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66786b f181624d;

    /* renamed from: f */
    private static volatile C63010eb f181625f;

    /* renamed from: a */
    public int f181626a;

    /* renamed from: b */
    public int f181627b;

    /* renamed from: c */
    public C62971cq f181628c = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private int f181629e;

    static {
        C66786b bVar = new C66786b();
        f181624d = bVar;
        C62942bv.registerDefaultInstance(C66786b.class, bVar);
    }

    private C66786b() {
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
                return newMessageInfo(f181624d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001a", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C66786b();
            case 4:
                return new C66695a();
            case 5:
                return f181624d;
            case 6:
                C63010eb ebVar = f181625f;
                if (ebVar == null) {
                    synchronized (C66786b.class) {
                        ebVar = f181625f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181624d);
                            f181625f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
