package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.sm */
/* compiled from: PG */
public final class C60508sm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60508sm f163805c;

    /* renamed from: d */
    private static volatile C63010eb f163806d;

    /* renamed from: a */
    public int f163807a;

    /* renamed from: b */
    public String f163808b = BuildConfig.FLAVOR;

    static {
        C60508sm smVar = new C60508sm();
        f163805c = smVar;
        C62942bv.registerDefaultInstance(C60508sm.class, smVar);
    }

    private C60508sm() {
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
                return newMessageInfo(f163805c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60508sm();
            case 4:
                return new C60507sl();
            case 5:
                return f163805c;
            case 6:
                C63010eb ebVar = f163806d;
                if (ebVar == null) {
                    synchronized (C60508sm.class) {
                        ebVar = f163806d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163805c);
                            f163806d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
