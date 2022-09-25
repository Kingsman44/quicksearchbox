package com.google.assistant.p3897e.p3915h.p3916a;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.p3771w.C48422i;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.h.a.b */
/* compiled from: PG */
public final class C51227b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51227b f133373f;

    /* renamed from: h */
    private static volatile C63010eb f133374h;

    /* renamed from: a */
    public int f133375a;

    /* renamed from: b */
    public C19088t f133376b;

    /* renamed from: c */
    public C48422i f133377c;

    /* renamed from: d */
    public C60218r f133378d;

    /* renamed from: e */
    public int f133379e;

    /* renamed from: g */
    private byte f133380g = 2;

    static {
        C51227b bVar = new C51227b();
        f133373f = bVar;
        C62942bv.registerDefaultInstance(C51227b.class, bVar);
    }

    private C51227b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133380g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133380g = b;
                return null;
            case 2:
                return newMessageInfo(f133373f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C51228c.f133381a});
            case 3:
                return new C51227b();
            case 4:
                return new C51226a();
            case 5:
                return f133373f;
            case 6:
                C63010eb ebVar = f133374h;
                if (ebVar == null) {
                    synchronized (C51227b.class) {
                        ebVar = f133374h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133373f);
                            f133374h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
