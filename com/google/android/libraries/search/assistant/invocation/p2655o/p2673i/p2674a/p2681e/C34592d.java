package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.d */
/* compiled from: PG */
public final class C34592d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34592d f91897b;

    /* renamed from: d */
    private static volatile C63010eb f91898d;

    /* renamed from: a */
    public C67087ko f91899a;

    /* renamed from: c */
    private byte f91900c = 2;

    static {
        C34592d dVar = new C34592d();
        f91897b = dVar;
        C62942bv.registerDefaultInstance(C34592d.class, dVar);
    }

    private C34592d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91900c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f91900c = b;
                return null;
            case 2:
                return newMessageInfo(f91897b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C34592d();
            case 4:
                return new C34591c();
            case 5:
                return f91897b;
            case 6:
                C63010eb ebVar = f91898d;
                if (ebVar == null) {
                    synchronized (C34592d.class) {
                        ebVar = f91898d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91897b);
                            f91898d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
