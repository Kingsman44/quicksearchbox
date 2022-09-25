package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.sp */
/* compiled from: PG */
public final class C60511sp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60511sp f163810d;

    /* renamed from: e */
    private static volatile C63010eb f163811e;

    /* renamed from: a */
    public int f163812a;

    /* renamed from: b */
    public int f163813b;

    /* renamed from: c */
    public String f163814c = BuildConfig.FLAVOR;

    static {
        C60511sp spVar = new C60511sp();
        f163810d = spVar;
        C62942bv.registerDefaultInstance(C60511sp.class, spVar);
    }

    private C60511sp() {
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
                return newMessageInfo(f163810d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C60510so.f163809a, C45240c.f118157a});
            case 3:
                return new C60511sp();
            case 4:
                return new C60509sn();
            case 5:
                return f163810d;
            case 6:
                C63010eb ebVar = f163811e;
                if (ebVar == null) {
                    synchronized (C60511sp.class) {
                        ebVar = f163811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163810d);
                            f163811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
