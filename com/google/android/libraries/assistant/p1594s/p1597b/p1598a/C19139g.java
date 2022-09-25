package com.google.android.libraries.assistant.p1594s.p1597b.p1598a;

import com.google.assistant.p3781ad.p3789d.p3790a.C48562o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.a.g */
/* compiled from: PG */
public final class C19139g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19139g f53609b;

    /* renamed from: d */
    private static volatile C63010eb f53610d;

    /* renamed from: a */
    public C62971cq f53611a = emptyProtobufList();

    /* renamed from: c */
    private byte f53612c = 2;

    static {
        C19139g gVar = new C19139g();
        f53609b = gVar;
        C62942bv.registerDefaultInstance(C19139g.class, gVar);
    }

    private C19139g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53612c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53612c = b;
                return null;
            case 2:
                return newMessageInfo(f53609b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C48562o.class});
            case 3:
                return new C19139g();
            case 4:
                return new C19138f();
            case 5:
                return f53609b;
            case 6:
                C63010eb ebVar = f53610d;
                if (ebVar == null) {
                    synchronized (C19139g.class) {
                        ebVar = f53610d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53609b);
                            f53610d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
