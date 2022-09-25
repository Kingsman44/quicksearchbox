package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b.b.r */
/* compiled from: PG */
public final class C50891r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50891r f132500b;

    /* renamed from: d */
    private static volatile C63010eb f132501d;

    /* renamed from: a */
    public C50890q f132502a;

    /* renamed from: c */
    private int f132503c;

    static {
        C50891r rVar = new C50891r();
        f132500b = rVar;
        C62942bv.registerDefaultInstance(C50891r.class, rVar);
    }

    private C50891r() {
    }

    /* renamed from: b */
    public static C63010eb m85975b() {
        return f132500b.getParserForType();
    }

    /* renamed from: a */
    public final boolean mo53487a() {
        return (this.f132503c & 1) != 0;
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
                return newMessageInfo(f132500b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50891r();
            case 4:
                return new C50884k();
            case 5:
                return f132500b;
            case 6:
                C63010eb ebVar = f132501d;
                if (ebVar == null) {
                    synchronized (C50891r.class) {
                        ebVar = f132501d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132500b);
                            f132501d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
