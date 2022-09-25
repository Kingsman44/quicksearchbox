package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.b */
/* compiled from: PG */
public final class C25319b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25319b f68888c;

    /* renamed from: d */
    private static volatile C63010eb f68889d;

    /* renamed from: a */
    public long f68890a;

    /* renamed from: b */
    public long f68891b;

    static {
        C25319b bVar = new C25319b();
        f68888c = bVar;
        C62942bv.registerDefaultInstance(C25319b.class, bVar);
    }

    private C25319b() {
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
                return newMessageInfo(f68888c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C25319b();
            case 4:
                return new C25292a();
            case 5:
                return f68888c;
            case 6:
                C63010eb ebVar = f68889d;
                if (ebVar == null) {
                    synchronized (C25319b.class) {
                        ebVar = f68889d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68888c);
                            f68889d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
