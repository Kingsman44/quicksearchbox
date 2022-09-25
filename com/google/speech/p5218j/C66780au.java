package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.au */
/* compiled from: PG */
public final class C66780au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66780au f181613d;

    /* renamed from: e */
    private static volatile C63010eb f181614e;

    /* renamed from: a */
    public int f181615a;

    /* renamed from: b */
    public C62971cq f181616b = emptyProtobufList();

    /* renamed from: c */
    public String f181617c = BuildConfig.FLAVOR;

    static {
        C66780au auVar = new C66780au();
        f181613d = auVar;
        C62942bv.registerDefaultInstance(C66780au.class, auVar);
    }

    private C66780au() {
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
                return newMessageInfo(f181613d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C66778as.class, C45240c.f118157a});
            case 3:
                return new C66780au();
            case 4:
                return new C66779at();
            case 5:
                return f181613d;
            case 6:
                C63010eb ebVar = f181614e;
                if (ebVar == null) {
                    synchronized (C66780au.class) {
                        ebVar = f181614e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181613d);
                            f181614e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
