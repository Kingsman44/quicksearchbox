package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.b */
/* compiled from: PG */
public final class C104506b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C104506b f290663c;

    /* renamed from: d */
    private static volatile C63010eb f290664d;

    /* renamed from: a */
    public int f290665a;

    /* renamed from: b */
    public boolean f290666b;

    static {
        C104506b bVar = new C104506b();
        f290663c = bVar;
        C62942bv.registerDefaultInstance(C104506b.class, bVar);
    }

    private C104506b() {
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
                return newMessageInfo(f290663c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C104506b();
            case 4:
                return new C104483a();
            case 5:
                return f290663c;
            case 6:
                C63010eb ebVar = f290664d;
                if (ebVar == null) {
                    synchronized (C104506b.class) {
                        ebVar = f290664d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290663c);
                            f290664d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
