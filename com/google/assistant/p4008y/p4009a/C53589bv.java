package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bv */
/* compiled from: PG */
public final class C53589bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53589bv f140649c;

    /* renamed from: e */
    private static volatile C63010eb f140650e;

    /* renamed from: a */
    public String f140651a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f140652b = emptyProtobufList();

    /* renamed from: d */
    private int f140653d;

    static {
        C53589bv bvVar = new C53589bv();
        f140649c = bvVar;
        C62942bv.registerDefaultInstance(C53589bv.class, bvVar);
    }

    private C53589bv() {
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
                return newMessageInfo(f140649c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C53587bt.class});
            case 3:
                return new C53589bv();
            case 4:
                return new C53588bu();
            case 5:
                return f140649c;
            case 6:
                C63010eb ebVar = f140650e;
                if (ebVar == null) {
                    synchronized (C53589bv.class) {
                        ebVar = f140650e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140649c);
                            f140650e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
