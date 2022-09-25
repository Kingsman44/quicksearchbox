package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.b */
/* compiled from: PG */
public final class C80305b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80305b f220379b;

    /* renamed from: c */
    private static volatile C63010eb f220380c;

    /* renamed from: a */
    public C62955cb f220381a = emptyBooleanList();

    static {
        C80305b bVar = new C80305b();
        f220379b = bVar;
        C62942bv.registerDefaultInstance(C80305b.class, bVar);
    }

    private C80305b() {
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
                return newMessageInfo(f220379b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001*", new Object[]{"a"});
            case 3:
                return new C80305b();
            case 4:
                return new C80278a();
            case 5:
                return f220379b;
            case 6:
                C63010eb ebVar = f220380c;
                if (ebVar == null) {
                    synchronized (C80305b.class) {
                        ebVar = f220380c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220379b);
                            f220380c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
