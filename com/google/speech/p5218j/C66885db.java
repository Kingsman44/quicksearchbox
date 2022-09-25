package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.db */
/* compiled from: PG */
public final class C66885db extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66885db f181841d;

    /* renamed from: e */
    private static volatile C63010eb f181842e;

    /* renamed from: a */
    public int f181843a;

    /* renamed from: b */
    public boolean f181844b;

    /* renamed from: c */
    public String f181845c = BuildConfig.FLAVOR;

    static {
        C66885db dbVar = new C66885db();
        f181841d = dbVar;
        C62942bv.registerDefaultInstance(C66885db.class, dbVar);
    }

    private C66885db() {
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
                return newMessageInfo(f181841d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဇ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C66885db();
            case 4:
                return new C66884da();
            case 5:
                return f181841d;
            case 6:
                C63010eb ebVar = f181842e;
                if (ebVar == null) {
                    synchronized (C66885db.class) {
                        ebVar = f181842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181841d);
                            f181842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
