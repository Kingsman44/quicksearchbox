package com.google.android.libraries.search.p2904c.p2933j.p2934a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.b */
/* compiled from: PG */
public final class C37731b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C37731b f100162b;

    /* renamed from: d */
    private static volatile C63010eb f100163d;

    /* renamed from: a */
    public String f100164a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f100165c;

    static {
        C37731b bVar = new C37731b();
        f100162b = bVar;
        C62942bv.registerDefaultInstance(C37731b.class, bVar);
    }

    private C37731b() {
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
                return newMessageInfo(f100162b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C37731b();
            case 4:
                return new C37706a();
            case 5:
                return f100162b;
            case 6:
                C63010eb ebVar = f100163d;
                if (ebVar == null) {
                    synchronized (C37731b.class) {
                        ebVar = f100163d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100162b);
                            f100163d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
