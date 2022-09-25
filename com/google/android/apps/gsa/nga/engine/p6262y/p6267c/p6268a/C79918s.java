package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.s */
/* compiled from: PG */
public final class C79918s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79918s f219055d;

    /* renamed from: e */
    private static volatile C63010eb f219056e;

    /* renamed from: a */
    public int f219057a;

    /* renamed from: b */
    public String f219058b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f219059c = C62942bv.emptyProtobufList();

    static {
        C79918s sVar = new C79918s();
        f219055d = sVar;
        C62942bv.registerDefaultInstance(C79918s.class, sVar);
    }

    private C79918s() {
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
                return newMessageInfo(f219055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79918s();
            case 4:
                return new C79917r();
            case 5:
                return f219055d;
            case 6:
                C63010eb ebVar = f219056e;
                if (ebVar == null) {
                    synchronized (C79918s.class) {
                        ebVar = f219056e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219055d);
                            f219056e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
