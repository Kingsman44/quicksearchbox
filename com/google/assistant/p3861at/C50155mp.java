package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mp */
/* compiled from: PG */
public final class C50155mp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50155mp f130389e;

    /* renamed from: f */
    private static volatile C63010eb f130390f;

    /* renamed from: a */
    public String f130391a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130392b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f130393c;

    /* renamed from: d */
    public C50133lu f130394d;

    static {
        C50155mp mpVar = new C50155mp();
        f130389e = mpVar;
        C62942bv.registerDefaultInstance(C50155mp.class, mpVar);
    }

    private C50155mp() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f130389e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\f\u0006\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50155mp();
            case 4:
                return new C50154mo();
            case 5:
                return f130389e;
            case 6:
                C63010eb ebVar = f130390f;
                if (ebVar == null) {
                    synchronized (C50155mp.class) {
                        ebVar = f130390f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130389e);
                            f130390f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
