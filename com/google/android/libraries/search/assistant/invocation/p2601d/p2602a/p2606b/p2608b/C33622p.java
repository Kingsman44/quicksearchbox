package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.p */
/* compiled from: PG */
public final class C33622p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33622p f89851c;

    /* renamed from: e */
    private static volatile C63010eb f89852e;

    /* renamed from: a */
    public int f89853a = 0;

    /* renamed from: b */
    public Object f89854b;

    /* renamed from: d */
    private byte f89855d = 2;

    static {
        C33622p pVar = new C33622p();
        f89851c = pVar;
        C62942bv.registerDefaultInstance(C33622p.class, pVar);
    }

    private C33622p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89855d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f89855d = b;
                return null;
            case 2:
                return newMessageInfo(f89851c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C33610d.class, C33626t.class});
            case 3:
                return new C33622p();
            case 4:
                return new C33620n();
            case 5:
                return f89851c;
            case 6:
                C63010eb ebVar = f89852e;
                if (ebVar == null) {
                    synchronized (C33622p.class) {
                        ebVar = f89852e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89851c);
                            f89852e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
