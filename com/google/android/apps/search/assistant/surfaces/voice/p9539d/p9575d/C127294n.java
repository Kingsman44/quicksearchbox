package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.n */
/* compiled from: PG */
public final class C127294n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127294n f350576c;

    /* renamed from: e */
    private static volatile C63010eb f350577e;

    /* renamed from: a */
    public int f350578a;

    /* renamed from: b */
    public C34053bp f350579b;

    /* renamed from: d */
    private byte f350580d = 2;

    static {
        C127294n nVar = new C127294n();
        f350576c = nVar;
        C62942bv.registerDefaultInstance(C127294n.class, nVar);
    }

    private C127294n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350580d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350580d = b;
                return null;
            case 2:
                return newMessageInfo(f350576c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127294n();
            case 4:
                return new C127293m();
            case 5:
                return f350576c;
            case 6:
                C63010eb ebVar = f350577e;
                if (ebVar == null) {
                    synchronized (C127294n.class) {
                        ebVar = f350577e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350576c);
                            f350577e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
