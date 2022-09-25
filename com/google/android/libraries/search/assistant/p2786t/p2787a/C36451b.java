package com.google.android.libraries.search.assistant.p2786t.p2787a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36485i;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36511g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.b */
/* compiled from: PG */
public final class C36451b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36451b f95174d;

    /* renamed from: e */
    private static volatile C63010eb f95175e;

    /* renamed from: a */
    public int f95176a;

    /* renamed from: b */
    public C36485i f95177b;

    /* renamed from: c */
    public C36511g f95178c;

    static {
        C36451b bVar = new C36451b();
        f95174d = bVar;
        C62942bv.registerDefaultInstance(C36451b.class, bVar);
    }

    private C36451b() {
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
                return newMessageInfo(f95174d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36451b();
            case 4:
                return new C36405a();
            case 5:
                return f95174d;
            case 6:
                C63010eb ebVar = f95175e;
                if (ebVar == null) {
                    synchronized (C36451b.class) {
                        ebVar = f95175e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95174d);
                            f95175e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
