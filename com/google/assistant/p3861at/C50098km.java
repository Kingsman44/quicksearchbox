package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.km */
/* compiled from: PG */
public final class C50098km extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50098km f130243c;

    /* renamed from: d */
    private static volatile C63010eb f130244d;

    /* renamed from: a */
    public C62971cq f130245a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62961ch f130246b = emptyIntList();

    static {
        C50098km kmVar = new C50098km();
        f130243c = kmVar;
        C62942bv.registerDefaultInstance(C50098km.class, kmVar);
    }

    private C50098km() {
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
                return newMessageInfo(f130243c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u0016", new Object[]{"a", "b"});
            case 3:
                return new C50098km();
            case 4:
                return new C50097kl();
            case 5:
                return f130243c;
            case 6:
                C63010eb ebVar = f130244d;
                if (ebVar == null) {
                    synchronized (C50098km.class) {
                        ebVar = f130244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130243c);
                            f130244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
