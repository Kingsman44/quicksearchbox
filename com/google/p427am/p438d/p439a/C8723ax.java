package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ax */
/* compiled from: PG */
public final class C8723ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8723ax f30057b;

    /* renamed from: c */
    private static volatile C63010eb f30058c;

    /* renamed from: a */
    public boolean f30059a;

    static {
        C8723ax axVar = new C8723ax();
        f30057b = axVar;
        C62942bv.registerDefaultInstance(C8723ax.class, axVar);
    }

    private C8723ax() {
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
                return newMessageInfo(f30057b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C8723ax();
            case 4:
                return new C8722aw();
            case 5:
                return f30057b;
            case 6:
                C63010eb ebVar = f30058c;
                if (ebVar == null) {
                    synchronized (C8723ax.class) {
                        ebVar = f30058c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30057b);
                            f30058c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
