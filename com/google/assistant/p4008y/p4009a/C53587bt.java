package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bt */
/* compiled from: PG */
public final class C53587bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53587bt f140644c;

    /* renamed from: e */
    private static volatile C63010eb f140645e;

    /* renamed from: a */
    public String f140646a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f140647b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f140648d;

    static {
        C53587bt btVar = new C53587bt();
        f140644c = btVar;
        C62942bv.registerDefaultInstance(C53587bt.class, btVar);
    }

    private C53587bt() {
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
                return newMessageInfo(f140644c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53587bt();
            case 4:
                return new C53586bs();
            case 5:
                return f140644c;
            case 6:
                C63010eb ebVar = f140645e;
                if (ebVar == null) {
                    synchronized (C53587bt.class) {
                        ebVar = f140645e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140644c);
                            f140645e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
