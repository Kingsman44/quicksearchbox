package com.google.android.libraries.search.assistant.p2825x.p2827b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66944fg;

/* renamed from: com.google.android.libraries.search.assistant.x.b.d */
/* compiled from: PG */
public final class C36824d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36824d f95969b;

    /* renamed from: c */
    private static volatile C63010eb f95970c;

    /* renamed from: a */
    public C66944fg f95971a;

    static {
        C36824d dVar = new C36824d();
        f95969b = dVar;
        C62942bv.registerDefaultInstance(C36824d.class, dVar);
    }

    private C36824d() {
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
                return newMessageInfo(f95969b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C36824d();
            case 4:
                return new C36823c();
            case 5:
                return f95969b;
            case 6:
                C63010eb ebVar = f95970c;
                if (ebVar == null) {
                    synchronized (C36824d.class) {
                        ebVar = f95970c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95969b);
                            f95970c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
