package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lv */
/* compiled from: PG */
public final class C53382lv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53382lv f140078d;

    /* renamed from: e */
    private static volatile C63010eb f140079e;

    /* renamed from: a */
    public int f140080a;

    /* renamed from: b */
    public String f140081b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f140082c = emptyProtobufList();

    static {
        C53382lv lvVar = new C53382lv();
        f140078d = lvVar;
        C62942bv.registerDefaultInstance(C53382lv.class, lvVar);
    }

    private C53382lv() {
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
                return newMessageInfo(f140078d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C53381lu.class});
            case 3:
                return new C53382lv();
            case 4:
                return new C53379ls();
            case 5:
                return f140078d;
            case 6:
                C63010eb ebVar = f140079e;
                if (ebVar == null) {
                    synchronized (C53382lv.class) {
                        ebVar = f140079e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140078d);
                            f140079e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
