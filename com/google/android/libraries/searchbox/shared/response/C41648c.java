package com.google.android.libraries.searchbox.shared.response;

import com.google.android.libraries.searchbox.shared.suggestion.C41674an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.response.c */
/* compiled from: PG */
public final class C41648c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C41648c f108869b;

    /* renamed from: d */
    private static volatile C63010eb f108870d;

    /* renamed from: a */
    public C62971cq f108871a = emptyProtobufList();

    /* renamed from: c */
    private byte f108872c = 2;

    static {
        C41648c cVar = new C41648c();
        f108869b = cVar;
        C62942bv.registerDefaultInstance(C41648c.class, cVar);
    }

    private C41648c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f108872c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f108872c = b;
                return null;
            case 2:
                return newMessageInfo(f108869b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C41674an.class});
            case 3:
                return new C41648c();
            case 4:
                return new C41647b();
            case 5:
                return f108869b;
            case 6:
                C63010eb ebVar = f108870d;
                if (ebVar == null) {
                    synchronized (C41648c.class) {
                        ebVar = f108870d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108869b);
                            f108870d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
