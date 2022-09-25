package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.engine.grammar.C76134l;
import com.google.android.apps.gsa.nga.engine.grammar.C76138p;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cu */
/* compiled from: PG */
public final class C82851cu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82851cu f225915d;

    /* renamed from: f */
    private static volatile C63010eb f225916f;

    /* renamed from: a */
    public int f225917a;

    /* renamed from: b */
    public C76134l f225918b;

    /* renamed from: c */
    public C76138p f225919c;

    /* renamed from: e */
    private byte f225920e = 2;

    static {
        C82851cu cuVar = new C82851cu();
        f225915d = cuVar;
        C62942bv.registerDefaultInstance(C82851cu.class, cuVar);
    }

    private C82851cu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225920e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225920e = b;
                return null;
            case 2:
                return newMessageInfo(f225915d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C82851cu();
            case 4:
                return new C82850ct();
            case 5:
                return f225915d;
            case 6:
                C63010eb ebVar = f225916f;
                if (ebVar == null) {
                    synchronized (C82851cu.class) {
                        ebVar = f225916f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225915d);
                            f225916f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
