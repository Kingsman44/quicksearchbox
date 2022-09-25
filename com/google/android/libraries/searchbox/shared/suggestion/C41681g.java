package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.g */
/* compiled from: PG */
public final class C41681g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C41681g f109022b;

    /* renamed from: d */
    private static volatile C63010eb f109023d;

    /* renamed from: a */
    public String f109024a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f109025c;

    static {
        C41681g gVar = new C41681g();
        f109022b = gVar;
        C62942bv.registerDefaultInstance(C41681g.class, gVar);
    }

    private C41681g() {
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
                return newMessageInfo(f109022b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C41681g();
            case 4:
                return new C41680f();
            case 5:
                return f109022b;
            case 6:
                C63010eb ebVar = f109023d;
                if (ebVar == null) {
                    synchronized (C41681g.class) {
                        ebVar = f109023d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109022b);
                            f109023d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
