package com.google.p4129b.p4136c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.e */
/* compiled from: PG */
public final class C54757e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54757e f143671d;

    /* renamed from: e */
    private static volatile C63010eb f143672e;

    /* renamed from: a */
    public int f143673a;

    /* renamed from: b */
    public C54776x f143674b;

    /* renamed from: c */
    public String f143675c = BuildConfig.FLAVOR;

    static {
        C54757e eVar = new C54757e();
        f143671d = eVar;
        C62942bv.registerDefaultInstance(C54757e.class, eVar);
    }

    private C54757e() {
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
                return newMessageInfo(f143671d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54757e();
            case 4:
                return new C54755c();
            case 5:
                return f143671d;
            case 6:
                C63010eb ebVar = f143672e;
                if (ebVar == null) {
                    synchronized (C54757e.class) {
                        ebVar = f143672e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143671d);
                            f143672e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
