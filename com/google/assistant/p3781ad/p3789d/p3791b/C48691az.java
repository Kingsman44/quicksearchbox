package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.az */
/* compiled from: PG */
public final class C48691az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48691az f125967d;

    /* renamed from: e */
    private static volatile C63010eb f125968e;

    /* renamed from: a */
    public int f125969a;

    /* renamed from: b */
    public String f125970b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f125971c = C62995dn.f170057a;

    static {
        C48691az azVar = new C48691az();
        f125967d = azVar;
        C62942bv.registerDefaultInstance(C48691az.class, azVar);
    }

    private C48691az() {
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
                return newMessageInfo(f125967d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဈ\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C48690ay.f125966a});
            case 3:
                return new C48691az();
            case 4:
                return new C48689ax();
            case 5:
                return f125967d;
            case 6:
                C63010eb ebVar = f125968e;
                if (ebVar == null) {
                    synchronized (C48691az.class) {
                        ebVar = f125968e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125967d);
                            f125968e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
