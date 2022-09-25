package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ct */
/* compiled from: PG */
public final class C62470ct extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62470ct f168670e;

    /* renamed from: f */
    private static volatile C63010eb f168671f;

    /* renamed from: a */
    public int f168672a;

    /* renamed from: b */
    public String f168673b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168674c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f168675d = C62942bv.emptyProtobufList();

    static {
        C62470ct ctVar = new C62470ct();
        f168670e = ctVar;
        C62942bv.registerDefaultInstance(C62470ct.class, ctVar);
    }

    private C62470ct() {
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
                return newMessageInfo(f168670e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62470ct();
            case 4:
                return new C62469cs();
            case 5:
                return f168670e;
            case 6:
                C63010eb ebVar = f168671f;
                if (ebVar == null) {
                    synchronized (C62470ct.class) {
                        ebVar = f168671f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168670e);
                            f168671f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
