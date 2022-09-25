package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.t */
/* compiled from: PG */
public final class C136102t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136102t f370660c;

    /* renamed from: d */
    private static volatile C63010eb f370661d;

    /* renamed from: a */
    public int f370662a;

    /* renamed from: b */
    public boolean f370663b;

    static {
        C136102t tVar = new C136102t();
        f370660c = tVar;
        C62942bv.registerDefaultInstance(C136102t.class, tVar);
    }

    private C136102t() {
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
                return newMessageInfo(f370660c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136102t();
            case 4:
                return new C136101s();
            case 5:
                return f370660c;
            case 6:
                C63010eb ebVar = f370661d;
                if (ebVar == null) {
                    synchronized (C136102t.class) {
                        ebVar = f370661d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370660c);
                            f370661d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
