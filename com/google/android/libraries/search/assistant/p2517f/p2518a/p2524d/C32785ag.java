package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ag */
/* compiled from: PG */
public final class C32785ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C32785ag f87957e;

    /* renamed from: g */
    private static volatile C63010eb f87958g;

    /* renamed from: a */
    public C32840ch f87959a;

    /* renamed from: b */
    public C32879y f87960b;

    /* renamed from: c */
    public int f87961c;

    /* renamed from: d */
    public boolean f87962d;

    /* renamed from: f */
    private byte f87963f = 2;

    static {
        C32785ag agVar = new C32785ag();
        f87957e = agVar;
        C62942bv.registerDefaultInstance(C32785ag.class, agVar);
    }

    private C32785ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f87963f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f87963f = b;
                return null;
            case 2:
                return newMessageInfo(f87957e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\t\u0002Љ\u0003\f\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C32785ag();
            case 4:
                return new C32784af();
            case 5:
                return f87957e;
            case 6:
                C63010eb ebVar = f87958g;
                if (ebVar == null) {
                    synchronized (C32785ag.class) {
                        ebVar = f87958g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87957e);
                            f87958g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
