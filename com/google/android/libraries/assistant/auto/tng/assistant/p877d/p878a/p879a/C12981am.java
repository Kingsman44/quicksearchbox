package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.am */
/* compiled from: PG */
public final class C12981am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C12981am f40353d;

    /* renamed from: e */
    private static volatile C63010eb f40354e;

    /* renamed from: a */
    public int f40355a;

    /* renamed from: b */
    public C13901e f40356b;

    /* renamed from: c */
    public String f40357c = BuildConfig.FLAVOR;

    static {
        C12981am amVar = new C12981am();
        f40353d = amVar;
        C62942bv.registerDefaultInstance(C12981am.class, amVar);
    }

    private C12981am() {
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
                return newMessageInfo(f40353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C12981am();
            case 4:
                return new C12980al();
            case 5:
                return f40353d;
            case 6:
                C63010eb ebVar = f40354e;
                if (ebVar == null) {
                    synchronized (C12981am.class) {
                        ebVar = f40354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40353d);
                            f40354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
