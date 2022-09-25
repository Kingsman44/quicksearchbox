package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wy */
/* compiled from: PG */
public final class C8138wy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8138wy f28609c;

    /* renamed from: e */
    private static volatile C63010eb f28610e;

    /* renamed from: a */
    public String f28611a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f28612b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f28613d;

    static {
        C8138wy wyVar = new C8138wy();
        f28609c = wyVar;
        C62942bv.registerDefaultInstance(C8138wy.class, wyVar);
    }

    private C8138wy() {
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
                return newMessageInfo(f28609c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8138wy();
            case 4:
                return new C8137wx();
            case 5:
                return f28609c;
            case 6:
                C63010eb ebVar = f28610e;
                if (ebVar == null) {
                    synchronized (C8138wy.class) {
                        ebVar = f28610e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28609c);
                            f28610e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
