package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.a.g */
/* compiled from: PG */
public final class C127532g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127532g f351167b;

    /* renamed from: d */
    private static volatile C63010eb f351168d;

    /* renamed from: a */
    public C34039bb f351169a;

    /* renamed from: c */
    private byte f351170c = 2;

    static {
        C127532g gVar = new C127532g();
        f351167b = gVar;
        C62942bv.registerDefaultInstance(C127532g.class, gVar);
    }

    private C127532g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f351170c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f351170c = b;
                return null;
            case 2:
                return newMessageInfo(f351167b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C127532g();
            case 4:
                return new C127531f();
            case 5:
                return f351167b;
            case 6:
                C63010eb ebVar = f351168d;
                if (ebVar == null) {
                    synchronized (C127532g.class) {
                        ebVar = f351168d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351167b);
                            f351168d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
