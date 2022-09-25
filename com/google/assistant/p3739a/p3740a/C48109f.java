package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.f */
/* compiled from: PG */
public final class C48109f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48109f f124515d;

    /* renamed from: e */
    private static volatile C63010eb f124516e;

    /* renamed from: a */
    public String f124517a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f124518b;

    /* renamed from: c */
    public String f124519c = BuildConfig.FLAVOR;

    static {
        C48109f fVar = new C48109f();
        f124515d = fVar;
        C62942bv.registerDefaultInstance(C48109f.class, fVar);
    }

    private C48109f() {
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
                return newMessageInfo(f124515d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48109f();
            case 4:
                return new C48108e();
            case 5:
                return f124515d;
            case 6:
                C63010eb ebVar = f124516e;
                if (ebVar == null) {
                    synchronized (C48109f.class) {
                        ebVar = f124516e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124515d);
                            f124516e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
