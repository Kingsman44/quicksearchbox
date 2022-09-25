package com.google.p4283bv.p4287b.p4288a.p4289a.p4299d;

import com.google.p4283bv.p4412k.p4413a.C57834b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.d.f */
/* compiled from: PG */
public final class C56678f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56678f f151288c;

    /* renamed from: d */
    private static volatile C63010eb f151289d;

    /* renamed from: a */
    public int f151290a;

    /* renamed from: b */
    public C57834b f151291b;

    static {
        C56678f fVar = new C56678f();
        f151288c = fVar;
        C62942bv.registerDefaultInstance(C56678f.class, fVar);
    }

    private C56678f() {
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
                return newMessageInfo(f151288c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56678f();
            case 4:
                return new C56677e();
            case 5:
                return f151288c;
            case 6:
                C63010eb ebVar = f151289d;
                if (ebVar == null) {
                    synchronized (C56678f.class) {
                        ebVar = f151289d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151288c);
                            f151289d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
