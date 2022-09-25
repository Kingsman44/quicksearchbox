package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.y */
/* compiled from: PG */
public final class C124727y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124727y f344118c;

    /* renamed from: d */
    private static volatile C63010eb f344119d;

    /* renamed from: a */
    public int f344120a;

    /* renamed from: b */
    public C63088z f344121b = C63088z.f170246b;

    static {
        C124727y yVar = new C124727y();
        f344118c = yVar;
        C62942bv.registerDefaultInstance(C124727y.class, yVar);
    }

    private C124727y() {
        emptyProtobufList();
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
                return newMessageInfo(f344118c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124727y();
            case 4:
                return new C124726x();
            case 5:
                return f344118c;
            case 6:
                C63010eb ebVar = f344119d;
                if (ebVar == null) {
                    synchronized (C124727y.class) {
                        ebVar = f344119d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344118c);
                            f344119d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
