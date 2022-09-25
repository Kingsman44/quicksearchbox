package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.iw */
/* compiled from: PG */
public final class C50054iw extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50054iw f130133f;

    /* renamed from: g */
    private static volatile C63010eb f130134g;

    /* renamed from: a */
    public int f130135a;

    /* renamed from: b */
    public C50046io f130136b;

    /* renamed from: c */
    public C50049ir f130137c;

    /* renamed from: d */
    public C50053iv f130138d;

    /* renamed from: e */
    public C50051it f130139e;

    static {
        C50054iw iwVar = new C50054iw();
        f130133f = iwVar;
        C62942bv.registerDefaultInstance(C50054iw.class, iwVar);
    }

    private C50054iw() {
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
                return newMessageInfo(f130133f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0005\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C50054iw();
            case 4:
                return new C50047ip();
            case 5:
                return f130133f;
            case 6:
                C63010eb ebVar = f130134g;
                if (ebVar == null) {
                    synchronized (C50054iw.class) {
                        ebVar = f130134g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130133f);
                            f130134g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
