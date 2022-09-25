package com.google.p4653i.p4654a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.ao */
/* compiled from: PG */
public final class C61674ao extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C61674ao f166610g;

    /* renamed from: i */
    private static volatile C63010eb f166611i;

    /* renamed from: a */
    public int f166612a;

    /* renamed from: b */
    public C61710t f166613b;

    /* renamed from: c */
    public long f166614c;

    /* renamed from: d */
    public int f166615d;

    /* renamed from: e */
    public boolean f166616e;

    /* renamed from: f */
    public C61710t f166617f;

    /* renamed from: h */
    private byte f166618h = 2;

    static {
        C61674ao aoVar = new C61674ao();
        f166610g = aoVar;
        C62942bv.registerDefaultInstance(C61674ao.class, aoVar);
    }

    private C61674ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166618h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166618h = b;
                return null;
            case 2:
                return newMessageInfo(f166610g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C61674ao();
            case 4:
                return new C61673an();
            case 5:
                return f166610g;
            case 6:
                C63010eb ebVar = f166611i;
                if (ebVar == null) {
                    synchronized (C61674ao.class) {
                        ebVar = f166611i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166610g);
                            f166611i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
