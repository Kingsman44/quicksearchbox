package com.google.android.libraries.lens.common.text.selection.p2007b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.common.text.selection.b.b */
/* compiled from: PG */
public final class C24150b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24150b f65938d;

    /* renamed from: e */
    private static volatile C63010eb f65939e;

    /* renamed from: a */
    public boolean f65940a;

    /* renamed from: b */
    public boolean f65941b;

    /* renamed from: c */
    public boolean f65942c;

    static {
        C24150b bVar = new C24150b();
        f65938d = bVar;
        C62942bv.registerDefaultInstance(C24150b.class, bVar);
    }

    private C24150b() {
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
                return newMessageInfo(f65938d, "\u0000\u0003\u0000\u0000\u0002\r\u0003\u0000\u0000\u0000\u0002\u0007\u0005\u0007\r\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C24150b();
            case 4:
                return new C24149a();
            case 5:
                return f65938d;
            case 6:
                C63010eb ebVar = f65939e;
                if (ebVar == null) {
                    synchronized (C24150b.class) {
                        ebVar = f65939e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65938d);
                            f65939e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
