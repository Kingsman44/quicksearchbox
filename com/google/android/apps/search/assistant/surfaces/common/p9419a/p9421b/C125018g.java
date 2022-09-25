package com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.a.b.g */
/* compiled from: PG */
public final class C125018g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125018g f344934c;

    /* renamed from: e */
    private static volatile C63010eb f344935e;

    /* renamed from: a */
    public int f344936a = 0;

    /* renamed from: b */
    public Object f344937b;

    /* renamed from: d */
    private byte f344938d = 2;

    static {
        C125018g gVar = new C125018g();
        f344934c = gVar;
        C62942bv.registerDefaultInstance(C125018g.class, gVar);
    }

    private C125018g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f344938d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f344938d = b;
                return null;
            case 2:
                return newMessageInfo(f344934c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003м\u0000", new Object[]{"b", "a", C125015d.class, C62912at.class, C125013b.class});
            case 3:
                return new C125018g();
            case 4:
                return new C125016e();
            case 5:
                return f344934c;
            case 6:
                C63010eb ebVar = f344935e;
                if (ebVar == null) {
                    synchronized (C125018g.class) {
                        ebVar = f344935e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344934c);
                            f344935e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
