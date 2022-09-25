package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.g */
/* compiled from: PG */
public final class C36511g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36511g f95278c;

    /* renamed from: d */
    private static volatile C63010eb f95279d;

    /* renamed from: a */
    public int f95280a = 0;

    /* renamed from: b */
    public Object f95281b;

    static {
        C36511g gVar = new C36511g();
        f95278c = gVar;
        C62942bv.registerDefaultInstance(C36511g.class, gVar);
    }

    private C36511g() {
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
                return newMessageInfo(f95278c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C36508d.class, C36510f.class});
            case 3:
                return new C36511g();
            case 4:
                return new C36506b();
            case 5:
                return f95278c;
            case 6:
                C63010eb ebVar = f95279d;
                if (ebVar == null) {
                    synchronized (C36511g.class) {
                        ebVar = f95279d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95278c);
                            f95279d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
