package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5059c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60668yk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.c.b */
/* compiled from: PG */
public final class C65429b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65429b f177864b;

    /* renamed from: f */
    private static volatile C63010eb f177865f;

    /* renamed from: a */
    public C62961ch f177866a = emptyIntList();

    /* renamed from: c */
    private int f177867c;

    /* renamed from: d */
    private C60668yk f177868d;

    /* renamed from: e */
    private byte f177869e = 2;

    static {
        C65429b bVar = new C65429b();
        f177864b = bVar;
        C62942bv.registerDefaultInstance(C65429b.class, bVar);
    }

    private C65429b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177869e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177869e = b;
                return null;
            case 2:
                return newMessageInfo(f177864b, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003ᐉ\u0002\u0004\u0016", new Object[]{C45240c.f118157a, "d", "a"});
            case 3:
                return new C65429b();
            case 4:
                return new C65428a();
            case 5:
                return f177864b;
            case 6:
                C63010eb ebVar = f177865f;
                if (ebVar == null) {
                    synchronized (C65429b.class) {
                        ebVar = f177865f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177864b);
                            f177865f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
