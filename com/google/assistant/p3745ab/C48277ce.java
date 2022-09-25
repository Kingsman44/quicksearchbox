package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ce */
/* compiled from: PG */
public final class C48277ce extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48277ce f124864e;

    /* renamed from: f */
    private static volatile C63010eb f124865f;

    /* renamed from: a */
    public int f124866a;

    /* renamed from: b */
    public String f124867b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48273ca f124868c;

    /* renamed from: d */
    public C48275cc f124869d;

    static {
        C48277ce ceVar = new C48277ce();
        f124864e = ceVar;
        C62942bv.registerDefaultInstance(C48277ce.class, ceVar);
    }

    private C48277ce() {
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
                return newMessageInfo(f124864e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48277ce();
            case 4:
                return new C48276cd();
            case 5:
                return f124864e;
            case 6:
                C63010eb ebVar = f124865f;
                if (ebVar == null) {
                    synchronized (C48277ce.class) {
                        ebVar = f124865f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124864e);
                            f124865f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
