package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37668ho;
import com.google.android.libraries.search.p2904c.p2905a.C37323b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.e.a.c.b */
/* compiled from: PG */
public final class C37535b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C37535b f99718h;

    /* renamed from: i */
    private static volatile C63010eb f99719i;

    /* renamed from: a */
    public int f99720a;

    /* renamed from: b */
    public int f99721b = 0;

    /* renamed from: c */
    public Object f99722c;

    /* renamed from: d */
    public C37360ay f99723d;

    /* renamed from: e */
    public int f99724e;

    /* renamed from: f */
    public boolean f99725f;

    /* renamed from: g */
    public C37668ho f99726g;

    static {
        C37535b bVar = new C37535b();
        f99718h = bVar;
        C62942bv.registerDefaultInstance(C37535b.class, bVar);
    }

    private C37535b() {
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
                return newMessageInfo(f99718h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ြ\u0000\u0005ဉ\u0005\u0006ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C37323b.class, C30325g.f82003a, C39226b.m68656b()});
            case 3:
                return new C37535b();
            case 4:
                return new C37534a();
            case 5:
                return f99718h;
            case 6:
                C63010eb ebVar = f99719i;
                if (ebVar == null) {
                    synchronized (C37535b.class) {
                        ebVar = f99719i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99718h);
                            f99719i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
