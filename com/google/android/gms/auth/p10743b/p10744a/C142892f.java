package com.google.android.gms.auth.p10743b.p10744a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.auth.b.a.f */
/* compiled from: PG */
public final class C142892f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142892f f387718c;

    /* renamed from: d */
    private static volatile C63010eb f387719d;

    /* renamed from: a */
    public int f387720a;

    /* renamed from: b */
    public C142900n f387721b;

    static {
        C142892f fVar = new C142892f();
        f387718c = fVar;
        C62942bv.registerDefaultInstance(C142892f.class, fVar);
    }

    private C142892f() {
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
                return newMessageInfo(f387718c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142892f();
            case 4:
                return new C142891e();
            case 5:
                return f387718c;
            case 6:
                C63010eb ebVar = f387719d;
                if (ebVar == null) {
                    synchronized (C142892f.class) {
                        ebVar = f387719d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387718c);
                            f387719d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
