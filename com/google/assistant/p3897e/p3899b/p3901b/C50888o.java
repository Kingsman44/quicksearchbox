package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63063ga;

/* renamed from: com.google.assistant.e.b.b.o */
/* compiled from: PG */
public final class C50888o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50888o f132488c;

    /* renamed from: d */
    private static volatile C63010eb f132489d;

    /* renamed from: a */
    public int f132490a;

    /* renamed from: b */
    public C63063ga f132491b;

    static {
        C50888o oVar = new C50888o();
        f132488c = oVar;
        C62942bv.registerDefaultInstance(C50888o.class, oVar);
    }

    private C50888o() {
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
                return newMessageInfo(f132488c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C50888o();
            case 4:
                return new C50887n();
            case 5:
                return f132488c;
            case 6:
                C63010eb ebVar = f132489d;
                if (ebVar == null) {
                    synchronized (C50888o.class) {
                        ebVar = f132489d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132488c);
                            f132489d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
