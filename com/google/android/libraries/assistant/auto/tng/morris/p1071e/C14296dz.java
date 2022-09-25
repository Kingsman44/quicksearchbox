package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dz */
/* compiled from: PG */
public final class C14296dz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14296dz f43258b;

    /* renamed from: c */
    private static volatile C63010eb f43259c;

    /* renamed from: a */
    public C14302ee f43260a;

    static {
        C14296dz dzVar = new C14296dz();
        f43258b = dzVar;
        C62942bv.registerDefaultInstance(C14296dz.class, dzVar);
    }

    private C14296dz() {
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
                return newMessageInfo(f43258b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14296dz();
            case 4:
                return new C14295dy();
            case 5:
                return f43258b;
            case 6:
                C63010eb ebVar = f43259c;
                if (ebVar == null) {
                    synchronized (C14296dz.class) {
                        ebVar = f43259c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43258b);
                            f43259c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
