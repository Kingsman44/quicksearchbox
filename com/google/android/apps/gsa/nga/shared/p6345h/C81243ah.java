package com.google.android.apps.gsa.nga.shared.p6345h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ah */
/* compiled from: PG */
public final class C81243ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81243ah f222417c;

    /* renamed from: d */
    private static volatile C63010eb f222418d;

    /* renamed from: a */
    public int f222419a;

    /* renamed from: b */
    public String f222420b = BuildConfig.FLAVOR;

    static {
        C81243ah ahVar = new C81243ah();
        f222417c = ahVar;
        C62942bv.registerDefaultInstance(C81243ah.class, ahVar);
    }

    private C81243ah() {
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
                return newMessageInfo(f222417c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81243ah();
            case 4:
                return new C81242ag();
            case 5:
                return f222417c;
            case 6:
                C63010eb ebVar = f222418d;
                if (ebVar == null) {
                    synchronized (C81243ah.class) {
                        ebVar = f222418d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222417c);
                            f222418d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
