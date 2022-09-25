package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.f */
/* compiled from: PG */
public final class C128105f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128105f f352477c;

    /* renamed from: e */
    private static volatile C63010eb f352478e;

    /* renamed from: a */
    public int f352479a;

    /* renamed from: b */
    public C51986gl f352480b;

    /* renamed from: d */
    private byte f352481d = 2;

    static {
        C128105f fVar = new C128105f();
        f352477c = fVar;
        C62942bv.registerDefaultInstance(C128105f.class, fVar);
    }

    private C128105f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352481d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352481d = b;
                return null;
            case 2:
                return newMessageInfo(f352477c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C128105f();
            case 4:
                return new C128104e();
            case 5:
                return f352477c;
            case 6:
                C63010eb ebVar = f352478e;
                if (ebVar == null) {
                    synchronized (C128105f.class) {
                        ebVar = f352478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352477c);
                            f352478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
