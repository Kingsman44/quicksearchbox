package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.a.x */
/* compiled from: PG */
public final class C37730x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37730x f100158c;

    /* renamed from: d */
    private static volatile C63010eb f100159d;

    /* renamed from: a */
    public int f100160a;

    /* renamed from: b */
    public String f100161b = BuildConfig.FLAVOR;

    static {
        C37730x xVar = new C37730x();
        f100158c = xVar;
        C62942bv.registerDefaultInstance(C37730x.class, xVar);
    }

    private C37730x() {
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
                return newMessageInfo(f100158c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37730x();
            case 4:
                return new C37729w();
            case 5:
                return f100158c;
            case 6:
                C63010eb ebVar = f100159d;
                if (ebVar == null) {
                    synchronized (C37730x.class) {
                        ebVar = f100159d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100158c);
                            f100159d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
