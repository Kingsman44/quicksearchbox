package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ou */
/* compiled from: PG */
public final class C14588ou extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14588ou f44101b;

    /* renamed from: c */
    private static volatile C63010eb f44102c;

    /* renamed from: a */
    public int f44103a;

    static {
        C14588ou ouVar = new C14588ou();
        f44101b = ouVar;
        C62942bv.registerDefaultInstance(C14588ou.class, ouVar);
    }

    private C14588ou() {
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
                return newMessageInfo(f44101b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14588ou();
            case 4:
                return new C14587ot();
            case 5:
                return f44101b;
            case 6:
                C63010eb ebVar = f44102c;
                if (ebVar == null) {
                    synchronized (C14588ou.class) {
                        ebVar = f44102c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44101b);
                            f44102c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
