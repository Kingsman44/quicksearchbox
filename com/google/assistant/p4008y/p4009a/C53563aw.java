package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.aw */
/* compiled from: PG */
public final class C53563aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53563aw f140577c;

    /* renamed from: e */
    private static volatile C63010eb f140578e;

    /* renamed from: a */
    public C62971cq f140579a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public boolean f140580b;

    /* renamed from: d */
    private int f140581d;

    static {
        C53563aw awVar = new C53563aw();
        f140577c = awVar;
        C62942bv.registerDefaultInstance(C53563aw.class, awVar);
    }

    private C53563aw() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f140577c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C53563aw();
            case 4:
                return new C53562av();
            case 5:
                return f140577c;
            case 6:
                C63010eb ebVar = f140578e;
                if (ebVar == null) {
                    synchronized (C53563aw.class) {
                        ebVar = f140578e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140577c);
                            f140578e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
