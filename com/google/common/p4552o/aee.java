package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aee */
/* compiled from: PG */
public final class aee extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aee f158447e;

    /* renamed from: f */
    private static volatile C63010eb f158448f;

    /* renamed from: a */
    public int f158449a;

    /* renamed from: b */
    public int f158450b = 0;

    /* renamed from: c */
    public Object f158451c;

    /* renamed from: d */
    public String f158452d = BuildConfig.FLAVOR;

    static {
        aee aee = new aee();
        f158447e = aee;
        C62942bv.registerDefaultInstance(aee.class, aee);
    }

    private aee() {
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
                return newMessageInfo(f158447e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new aee();
            case 4:
                return new aed();
            case 5:
                return f158447e;
            case 6:
                C63010eb ebVar = f158448f;
                if (ebVar == null) {
                    synchronized (aee.class) {
                        ebVar = f158448f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158447e);
                            f158448f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
