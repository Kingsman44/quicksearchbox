package com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.a.a.g */
/* compiled from: PG */
public final class C126876g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C126876g f349351b;

    /* renamed from: d */
    private static volatile C63010eb f349352d;

    /* renamed from: a */
    public C34053bp f349353a;

    /* renamed from: c */
    private byte f349354c = 2;

    static {
        C126876g gVar = new C126876g();
        f349351b = gVar;
        C62942bv.registerDefaultInstance(C126876g.class, gVar);
    }

    private C126876g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349354c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f349354c = b;
                return null;
            case 2:
                return newMessageInfo(f349351b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C126876g();
            case 4:
                return new C126875f();
            case 5:
                return f349351b;
            case 6:
                C63010eb ebVar = f349352d;
                if (ebVar == null) {
                    synchronized (C126876g.class) {
                        ebVar = f349352d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349351b);
                            f349352d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
