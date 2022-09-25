package com.google.android.gms.libs.p10830b.p10831a;

import com.google.p4017at.p4046e.p4047a.p4048a.C53929j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.libs.b.a.b */
/* compiled from: PG */
public final class C144834b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C144834b f391670b;

    /* renamed from: c */
    private static volatile C63010eb f391671c;

    /* renamed from: a */
    public C53929j f391672a;

    static {
        C144834b bVar = new C144834b();
        f391670b = bVar;
        C62942bv.registerDefaultInstance(C144834b.class, bVar);
    }

    private C144834b() {
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
                return newMessageInfo(f391670b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C144834b();
            case 4:
                return new C144833a();
            case 5:
                return f391670b;
            case 6:
                C63010eb ebVar = f391671c;
                if (ebVar == null) {
                    synchronized (C144834b.class) {
                        ebVar = f391671c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f391670b);
                            f391671c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
