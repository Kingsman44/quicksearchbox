package com.google.p4283bv.p4345d.p4346a.p4348b.p4349a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.a.b.a.b */
/* compiled from: PG */
public final class C56963b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56963b f152014a;

    /* renamed from: e */
    private static volatile C63010eb f152015e;

    /* renamed from: b */
    private int f152016b;

    /* renamed from: c */
    private C57000j f152017c;

    /* renamed from: d */
    private byte f152018d = 2;

    static {
        C56963b bVar = new C56963b();
        f152014a = bVar;
        C62942bv.registerDefaultInstance(C56963b.class, bVar);
    }

    private C56963b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152018d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152018d = b;
                return null;
            case 2:
                return newMessageInfo(f152014a, "\u0000\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0001\u000eᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56963b();
            case 4:
                return new C56962a();
            case 5:
                return f152014a;
            case 6:
                C63010eb ebVar = f152015e;
                if (ebVar == null) {
                    synchronized (C56963b.class) {
                        ebVar = f152015e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152014a);
                            f152015e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
