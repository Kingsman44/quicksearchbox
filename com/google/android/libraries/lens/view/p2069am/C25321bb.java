package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.bb */
/* compiled from: PG */
public final class C25321bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25321bb f68892c;

    /* renamed from: d */
    private static volatile C63010eb f68893d;

    /* renamed from: a */
    public String f68894a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f68895b;

    static {
        C25321bb bbVar = new C25321bb();
        f68892c = bbVar;
        C62942bv.registerDefaultInstance(C25321bb.class, bbVar);
    }

    private C25321bb() {
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
                return newMessageInfo(f68892c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C25321bb();
            case 4:
                return new C25320ba();
            case 5:
                return f68892c;
            case 6:
                C63010eb ebVar = f68893d;
                if (ebVar == null) {
                    synchronized (C25321bb.class) {
                        ebVar = f68893d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68892c);
                            f68893d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
