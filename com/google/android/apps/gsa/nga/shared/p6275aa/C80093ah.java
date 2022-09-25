package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ah */
/* compiled from: PG */
public final class C80093ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80093ah f219789d;

    /* renamed from: e */
    private static volatile C63010eb f219790e;

    /* renamed from: a */
    public int f219791a;

    /* renamed from: b */
    public int f219792b;

    /* renamed from: c */
    public C123733b f219793c;

    static {
        C80093ah ahVar = new C80093ah();
        f219789d = ahVar;
        C62942bv.registerDefaultInstance(C80093ah.class, ahVar);
    }

    private C80093ah() {
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
                return newMessageInfo(f219789d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80093ah();
            case 4:
                return new C80092ag();
            case 5:
                return f219789d;
            case 6:
                C63010eb ebVar = f219790e;
                if (ebVar == null) {
                    synchronized (C80093ah.class) {
                        ebVar = f219790e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219789d);
                            f219790e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
