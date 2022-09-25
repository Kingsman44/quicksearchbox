package com.google.p337aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aa.b */
/* compiled from: PG */
public final class C6615b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6615b f19645c;

    /* renamed from: d */
    private static volatile C63010eb f19646d;

    /* renamed from: a */
    public int f19647a;

    /* renamed from: b */
    public String f19648b = BuildConfig.FLAVOR;

    static {
        C6615b bVar = new C6615b();
        f19645c = bVar;
        C62942bv.registerDefaultInstance(C6615b.class, bVar);
    }

    private C6615b() {
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
                return newMessageInfo(f19645c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C6615b();
            case 4:
                return new C6598a();
            case 5:
                return f19645c;
            case 6:
                C63010eb ebVar = f19646d;
                if (ebVar == null) {
                    synchronized (C6615b.class) {
                        ebVar = f19646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19645c);
                            f19646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
