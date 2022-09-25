package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ak */
/* compiled from: PG */
public final class C56230ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56230ak f149771c;

    /* renamed from: d */
    private static volatile C63010eb f149772d;

    /* renamed from: a */
    public int f149773a;

    /* renamed from: b */
    public C56226ag f149774b;

    static {
        C56230ak akVar = new C56230ak();
        f149771c = akVar;
        C62942bv.registerDefaultInstance(C56230ak.class, akVar);
    }

    private C56230ak() {
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
                return newMessageInfo(f149771c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56230ak();
            case 4:
                return new C56229aj();
            case 5:
                return f149771c;
            case 6:
                C63010eb ebVar = f149772d;
                if (ebVar == null) {
                    synchronized (C56230ak.class) {
                        ebVar = f149772d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149771c);
                            f149772d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
