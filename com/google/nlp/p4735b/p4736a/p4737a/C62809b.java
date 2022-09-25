package com.google.nlp.p4735b.p4736a.p4737a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4735b.p4736a.p4738b.C62833o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.a.b */
/* compiled from: PG */
public final class C62809b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62809b f169609e;

    /* renamed from: g */
    private static volatile C63010eb f169610g;

    /* renamed from: a */
    public int f169611a;

    /* renamed from: b */
    public int f169612b = 0;

    /* renamed from: c */
    public Object f169613c;

    /* renamed from: d */
    public int f169614d;

    /* renamed from: f */
    private byte f169615f = 2;

    static {
        C62809b bVar = new C62809b();
        f169609e = bVar;
        C62942bv.registerDefaultInstance(C62809b.class, bVar);
    }

    private C62809b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169615f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169615f = b;
                return null;
            case 2:
                return newMessageInfo(f169609e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ျ\u0000\u0002ᐼ\u0000\u0004ဌ\u0003", new Object[]{C45240c.f118157a, "b", "a", C62833o.class, "d", C62812e.f169622a});
            case 3:
                return new C62809b();
            case 4:
                return new C62808a();
            case 5:
                return f169609e;
            case 6:
                C63010eb ebVar = f169610g;
                if (ebVar == null) {
                    synchronized (C62809b.class) {
                        ebVar = f169610g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169609e);
                            f169610g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
