package com.google.knowledge.p4661a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.b */
/* compiled from: PG */
public final class C61765b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61765b f166847c;

    /* renamed from: d */
    private static volatile C63010eb f166848d;

    /* renamed from: a */
    public int f166849a;

    /* renamed from: b */
    public String f166850b = BuildConfig.FLAVOR;

    static {
        C61765b bVar = new C61765b();
        f166847c = bVar;
        C62942bv.registerDefaultInstance(C61765b.class, bVar);
    }

    private C61765b() {
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
                return newMessageInfo(f166847c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C61765b();
            case 4:
                return new C61734a();
            case 5:
                return f166847c;
            case 6:
                C63010eb ebVar = f166848d;
                if (ebVar == null) {
                    synchronized (C61765b.class) {
                        ebVar = f166848d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166847c);
                            f166848d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
