package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ba */
/* compiled from: PG */
public final class C57376ba extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C57376ba f153276e;

    /* renamed from: g */
    private static volatile C63010eb f153277g;

    /* renamed from: a */
    public int f153278a;

    /* renamed from: b */
    public int f153279b = 0;

    /* renamed from: c */
    public Object f153280c;

    /* renamed from: d */
    public C57362an f153281d;

    /* renamed from: f */
    private byte f153282f = 2;

    static {
        C57376ba baVar = new C57376ba();
        f153276e = baVar;
        C62942bv.registerDefaultInstance(C57376ba.class, baVar);
    }

    private C57376ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153282f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153282f = b;
                return null;
            case 2:
                return newMessageInfo(f153276e, "\u0001\u0003\u0001\u0001\u0004\u0007\u0003\u0000\u0000\u0001\u0004ြ\u0000\u0005ြ\u0000\u0007ᐉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C57381bf.class, C57513u.class, "d"});
            case 3:
                return new C57376ba();
            case 4:
                return new C57374az();
            case 5:
                return f153276e;
            case 6:
                C63010eb ebVar = f153277g;
                if (ebVar == null) {
                    synchronized (C57376ba.class) {
                        ebVar = f153277g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153276e);
                            f153277g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
