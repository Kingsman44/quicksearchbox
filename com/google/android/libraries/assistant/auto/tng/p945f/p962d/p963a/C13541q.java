package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.q */
/* compiled from: PG */
public final class C13541q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13541q f41491d;

    /* renamed from: e */
    private static volatile C63010eb f41492e;

    /* renamed from: a */
    public String f41493a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f41494b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f41495c;

    static {
        C13541q qVar = new C13541q();
        f41491d = qVar;
        C62942bv.registerDefaultInstance(C13541q.class, qVar);
    }

    private C13541q() {
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
                return newMessageInfo(f41491d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13541q();
            case 4:
                return new C13540p();
            case 5:
                return f41491d;
            case 6:
                C63010eb ebVar = f41492e;
                if (ebVar == null) {
                    synchronized (C13541q.class) {
                        ebVar = f41492e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41491d);
                            f41492e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
