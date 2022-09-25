package com.google.assistant.p3991q.p3992a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4605f.p4607b.C61087i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.q.a.b */
/* compiled from: PG */
public final class C53057b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53057b f139051a;

    /* renamed from: e */
    private static volatile C63010eb f139052e;

    /* renamed from: b */
    private int f139053b;

    /* renamed from: c */
    private C61087i f139054c;

    /* renamed from: d */
    private byte f139055d = 2;

    static {
        C53057b bVar = new C53057b();
        f139051a = bVar;
        C62942bv.registerDefaultInstance(C53057b.class, bVar);
    }

    private C53057b() {
        emptyLongList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139055d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139055d = b;
                return null;
            case 2:
                return newMessageInfo(f139051a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C53057b();
            case 4:
                return new C53056a();
            case 5:
                return f139051a;
            case 6:
                C63010eb ebVar = f139052e;
                if (ebVar == null) {
                    synchronized (C53057b.class) {
                        ebVar = f139052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139051a);
                            f139052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
