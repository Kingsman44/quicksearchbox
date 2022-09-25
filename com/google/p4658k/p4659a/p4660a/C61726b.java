package com.google.p4658k.p4659a.p4660a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.k.a.a.b */
/* compiled from: PG */
public final class C61726b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61726b f166762c;

    /* renamed from: d */
    private static volatile C63010eb f166763d;

    /* renamed from: a */
    public int f166764a;

    /* renamed from: b */
    public boolean f166765b = true;

    static {
        C61726b bVar = new C61726b();
        f166762c = bVar;
        C62942bv.registerDefaultInstance(C61726b.class, bVar);
    }

    private C61726b() {
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
                return newMessageInfo(f166762c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61726b();
            case 4:
                return new C61725a();
            case 5:
                return f166762c;
            case 6:
                C63010eb ebVar = f166763d;
                if (ebVar == null) {
                    synchronized (C61726b.class) {
                        ebVar = f166763d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166762c);
                            f166763d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
