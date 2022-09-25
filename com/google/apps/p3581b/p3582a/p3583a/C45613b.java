package com.google.apps.p3581b.p3582a.p3583a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.b.a.a.b */
/* compiled from: PG */
public final class C45613b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45613b f119979c;

    /* renamed from: d */
    private static volatile C63010eb f119980d;

    /* renamed from: a */
    public int f119981a;

    /* renamed from: b */
    public String f119982b = BuildConfig.FLAVOR;

    static {
        C45613b bVar = new C45613b();
        f119979c = bVar;
        C62942bv.registerDefaultInstance(C45613b.class, bVar);
    }

    private C45613b() {
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
                return newMessageInfo(f119979c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C45613b();
            case 4:
                return new C45612a();
            case 5:
                return f119979c;
            case 6:
                C63010eb ebVar = f119980d;
                if (ebVar == null) {
                    synchronized (C45613b.class) {
                        ebVar = f119980d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119979c);
                            f119980d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
