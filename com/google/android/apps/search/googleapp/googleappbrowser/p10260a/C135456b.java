package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.b */
/* compiled from: PG */
public final class C135456b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135456b f369035c;

    /* renamed from: d */
    private static volatile C63010eb f369036d;

    /* renamed from: a */
    public int f369037a;

    /* renamed from: b */
    public boolean f369038b;

    static {
        C135456b bVar = new C135456b();
        f369035c = bVar;
        C62942bv.registerDefaultInstance(C135456b.class, bVar);
    }

    private C135456b() {
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
                return newMessageInfo(f369035c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C135456b();
            case 4:
                return new C135455a();
            case 5:
                return f369035c;
            case 6:
                C63010eb ebVar = f369036d;
                if (ebVar == null) {
                    synchronized (C135456b.class) {
                        ebVar = f369036d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369035c);
                            f369036d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
