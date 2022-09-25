package com.google.protos.p4850an.p4855d.p4858c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.al */
/* compiled from: PG */
public final class C63504al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63504al f171767b;

    /* renamed from: f */
    private static volatile C63010eb f171768f;

    /* renamed from: a */
    public String f171769a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f171770c;

    /* renamed from: d */
    private C63389bg f171771d;

    /* renamed from: e */
    private byte f171772e = 2;

    static {
        C63504al alVar = new C63504al();
        f171767b = alVar;
        C62942bv.registerDefaultInstance(C63504al.class, alVar);
    }

    private C63504al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171772e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171772e = b;
                return null;
            case 2:
                return newMessageInfo(f171767b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "d", "a"});
            case 3:
                return new C63504al();
            case 4:
                return new C63503ak();
            case 5:
                return f171767b;
            case 6:
                C63010eb ebVar = f171768f;
                if (ebVar == null) {
                    synchronized (C63504al.class) {
                        ebVar = f171768f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171767b);
                            f171768f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
