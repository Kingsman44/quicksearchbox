package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.dm */
/* compiled from: PG */
public final class C48314dm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48314dm f124952e;

    /* renamed from: f */
    private static volatile C63010eb f124953f;

    /* renamed from: a */
    public String f124954a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f124955b;

    /* renamed from: c */
    public int f124956c;

    /* renamed from: d */
    public int f124957d;

    static {
        C48314dm dmVar = new C48314dm();
        f124952e = dmVar;
        C62942bv.registerDefaultInstance(C48314dm.class, dmVar);
    }

    private C48314dm() {
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
                return newMessageInfo(f124952e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\f\u0007\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48314dm();
            case 4:
                return new C48311dj();
            case 5:
                return f124952e;
            case 6:
                C63010eb ebVar = f124953f;
                if (ebVar == null) {
                    synchronized (C48314dm.class) {
                        ebVar = f124953f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124952e);
                            f124953f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
