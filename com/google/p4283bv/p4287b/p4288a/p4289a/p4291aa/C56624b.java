package com.google.p4283bv.p4287b.p4288a.p4289a.p4291aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.aa.b */
/* compiled from: PG */
public final class C56624b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56624b f151183c;

    /* renamed from: d */
    private static volatile C63010eb f151184d;

    /* renamed from: a */
    public int f151185a;

    /* renamed from: b */
    public long f151186b;

    static {
        C56624b bVar = new C56624b();
        f151183c = bVar;
        C62942bv.registerDefaultInstance(C56624b.class, bVar);
    }

    private C56624b() {
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
                return newMessageInfo(f151183c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56624b();
            case 4:
                return new C56623a();
            case 5:
                return f151183c;
            case 6:
                C63010eb ebVar = f151184d;
                if (ebVar == null) {
                    synchronized (C56624b.class) {
                        ebVar = f151184d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151183c);
                            f151184d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
