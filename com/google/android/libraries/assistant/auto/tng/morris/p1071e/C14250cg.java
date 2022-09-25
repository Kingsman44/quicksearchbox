package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cg */
/* compiled from: PG */
public final class C14250cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14250cg f43120c;

    /* renamed from: d */
    private static volatile C63010eb f43121d;

    /* renamed from: a */
    public boolean f43122a;

    /* renamed from: b */
    public boolean f43123b;

    static {
        C14250cg cgVar = new C14250cg();
        f43120c = cgVar;
        C62942bv.registerDefaultInstance(C14250cg.class, cgVar);
    }

    private C14250cg() {
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
                return newMessageInfo(f43120c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14250cg();
            case 4:
                return new C14249cf();
            case 5:
                return f43120c;
            case 6:
                C63010eb ebVar = f43121d;
                if (ebVar == null) {
                    synchronized (C14250cg.class) {
                        ebVar = f43121d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43120c);
                            f43121d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
