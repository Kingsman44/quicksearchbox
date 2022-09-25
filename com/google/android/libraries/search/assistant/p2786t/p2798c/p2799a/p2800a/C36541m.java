package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.m */
/* compiled from: PG */
public final class C36541m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36541m f95314d;

    /* renamed from: e */
    private static volatile C63010eb f95315e;

    /* renamed from: a */
    public int f95316a;

    /* renamed from: b */
    public C36608k f95317b;

    /* renamed from: c */
    public C36603f f95318c;

    static {
        C36541m mVar = new C36541m();
        f95314d = mVar;
        C62942bv.registerDefaultInstance(C36541m.class, mVar);
    }

    private C36541m() {
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
                return newMessageInfo(f95314d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36541m();
            case 4:
                return new C36540l();
            case 5:
                return f95314d;
            case 6:
                C63010eb ebVar = f95315e;
                if (ebVar == null) {
                    synchronized (C36541m.class) {
                        ebVar = f95315e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95314d);
                            f95315e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
