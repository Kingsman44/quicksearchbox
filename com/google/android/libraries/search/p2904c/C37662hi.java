package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hi */
/* compiled from: PG */
public final class C37662hi extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C37662hi f100030g;

    /* renamed from: h */
    private static volatile C63010eb f100031h;

    /* renamed from: a */
    public int f100032a;

    /* renamed from: b */
    public int f100033b = 0;

    /* renamed from: c */
    public Object f100034c;

    /* renamed from: d */
    public C37360ay f100035d;

    /* renamed from: e */
    public boolean f100036e;

    /* renamed from: f */
    public C37773c f100037f;

    static {
        C37662hi hiVar = new C37662hi();
        f100030g = hiVar;
        C62942bv.registerDefaultInstance(C37662hi.class, hiVar);
    }

    private C37662hi() {
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
                return newMessageInfo(f100030g, "\u0001\u0005\u0001\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0003\tြ\u0000\nဉ\u0004\rြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C37668ho.class, C10662f.f35572a, C37703if.class});
            case 3:
                return new C37662hi();
            case 4:
                return new C37661hh();
            case 5:
                return f100030g;
            case 6:
                C63010eb ebVar = f100031h;
                if (ebVar == null) {
                    synchronized (C37662hi.class) {
                        ebVar = f100031h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100030g);
                            f100031h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
