package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.ah */
/* compiled from: PG */
public final class C45537ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45537ah f119019c;

    /* renamed from: d */
    private static volatile C63010eb f119020d;

    /* renamed from: a */
    public int f119021a;

    /* renamed from: b */
    public String f119022b = BuildConfig.FLAVOR;

    static {
        C45537ah ahVar = new C45537ah();
        f119019c = ahVar;
        C62942bv.registerDefaultInstance(C45537ah.class, ahVar);
    }

    private C45537ah() {
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
                return newMessageInfo(f119019c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C45537ah();
            case 4:
                return new C45536ag();
            case 5:
                return f119019c;
            case 6:
                C63010eb ebVar = f119020d;
                if (ebVar == null) {
                    synchronized (C45537ah.class) {
                        ebVar = f119020d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119019c);
                            f119020d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
