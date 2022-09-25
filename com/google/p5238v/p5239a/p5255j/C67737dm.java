package com.google.p5238v.p5239a.p5255j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dm */
/* compiled from: PG */
public final class C67737dm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67737dm f183778b;

    /* renamed from: c */
    private static volatile C63010eb f183779c;

    /* renamed from: a */
    public String f183780a = BuildConfig.FLAVOR;

    static {
        C67737dm dmVar = new C67737dm();
        f183778b = dmVar;
        C62942bv.registerDefaultInstance(C67737dm.class, dmVar);
    }

    private C67737dm() {
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
                return newMessageInfo(f183778b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C67737dm();
            case 4:
                return new C67736dl();
            case 5:
                return f183778b;
            case 6:
                C63010eb ebVar = f183779c;
                if (ebVar == null) {
                    synchronized (C67737dm.class) {
                        ebVar = f183779c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183778b);
                            f183779c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
