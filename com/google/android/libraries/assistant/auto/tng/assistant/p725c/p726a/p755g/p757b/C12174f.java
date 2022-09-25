package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67190ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.b.f */
/* compiled from: PG */
public final class C12174f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C12174f f38872d;

    /* renamed from: f */
    private static volatile C63010eb f38873f;

    /* renamed from: a */
    public int f38874a;

    /* renamed from: b */
    public C67190ah f38875b;

    /* renamed from: c */
    public int f38876c = 3;

    /* renamed from: e */
    private byte f38877e = 2;

    static {
        C12174f fVar = new C12174f();
        f38872d = fVar;
        C62942bv.registerDefaultInstance(C12174f.class, fVar);
    }

    private C12174f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38877e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38877e = b;
                return null;
            case 2:
                return newMessageInfo(f38872d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C12172d.f38871a});
            case 3:
                return new C12174f();
            case 4:
                return new C12171c();
            case 5:
                return f38872d;
            case 6:
                C63010eb ebVar = f38873f;
                if (ebVar == null) {
                    synchronized (C12174f.class) {
                        ebVar = f38873f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38872d);
                            f38873f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
