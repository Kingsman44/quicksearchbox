package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.et */
/* compiled from: PG */
public final class C80772et extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80772et f221682c;

    /* renamed from: d */
    private static volatile C63010eb f221683d;

    /* renamed from: a */
    public C80771es f221684a;

    /* renamed from: b */
    public int f221685b;

    static {
        C80772et etVar = new C80772et();
        f221682c = etVar;
        C62942bv.registerDefaultInstance(C80772et.class, etVar);
    }

    private C80772et() {
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
                return newMessageInfo(f221682c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C80772et();
            case 4:
                return new C80766en();
            case 5:
                return f221682c;
            case 6:
                C63010eb ebVar = f221683d;
                if (ebVar == null) {
                    synchronized (C80772et.class) {
                        ebVar = f221683d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221682c);
                            f221683d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
