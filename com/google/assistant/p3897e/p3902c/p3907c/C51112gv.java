package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gv */
/* compiled from: PG */
public final class C51112gv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51112gv f133031d;

    /* renamed from: e */
    private static volatile C63010eb f133032e;

    /* renamed from: a */
    public int f133033a;

    /* renamed from: b */
    public float f133034b;

    /* renamed from: c */
    public String f133035c = BuildConfig.FLAVOR;

    static {
        C51112gv gvVar = new C51112gv();
        f133031d = gvVar;
        C62942bv.registerDefaultInstance(C51112gv.class, gvVar);
    }

    private C51112gv() {
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
                return newMessageInfo(f133031d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ခ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51112gv();
            case 4:
                return new C51111gu();
            case 5:
                return f133031d;
            case 6:
                C63010eb ebVar = f133032e;
                if (ebVar == null) {
                    synchronized (C51112gv.class) {
                        ebVar = f133032e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133031d);
                            f133032e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
