package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.b */
/* compiled from: PG */
public final class C60135b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60135b f162669d;

    /* renamed from: e */
    private static volatile C63010eb f162670e;

    /* renamed from: a */
    public int f162671a;

    /* renamed from: b */
    public C60189d f162672b;

    /* renamed from: c */
    public C62961ch f162673c = emptyIntList();

    static {
        C60135b bVar = new C60135b();
        f162669d = bVar;
        C62942bv.registerDefaultInstance(C60135b.class, bVar);
    }

    private C60135b() {
        emptyProtobufList();
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
                return newMessageInfo(f162669d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001e", new Object[]{"a", "b", C45240c.f118157a, C59715c.m92492b()});
            case 3:
                return new C60135b();
            case 4:
                return new C60108a();
            case 5:
                return f162669d;
            case 6:
                C63010eb ebVar = f162670e;
                if (ebVar == null) {
                    synchronized (C60135b.class) {
                        ebVar = f162670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162669d);
                            f162670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
