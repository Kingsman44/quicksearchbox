package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.o */
/* compiled from: PG */
public final class C17319o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17319o f50151c;

    /* renamed from: d */
    private static volatile C63010eb f50152d;

    /* renamed from: a */
    public int f50153a;

    /* renamed from: b */
    public C62910ar f50154b;

    static {
        C17319o oVar = new C17319o();
        f50151c = oVar;
        C62942bv.registerDefaultInstance(C17319o.class, oVar);
    }

    private C17319o() {
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
                return newMessageInfo(f50151c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C17319o();
            case 4:
                return new C17318n();
            case 5:
                return f50151c;
            case 6:
                C63010eb ebVar = f50152d;
                if (ebVar == null) {
                    synchronized (C17319o.class) {
                        ebVar = f50152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50151c);
                            f50152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
