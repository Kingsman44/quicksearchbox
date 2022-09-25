package com.google.protos.p4850an.p4855d.p4856a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.ab */
/* compiled from: PG */
public final class C63442ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63442ab f171454e;

    /* renamed from: f */
    private static volatile C63010eb f171455f;

    /* renamed from: a */
    public int f171456a;

    /* renamed from: b */
    public String f171457b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f171458c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f171459d = BuildConfig.FLAVOR;

    static {
        C63442ab abVar = new C63442ab();
        f171454e = abVar;
        C62942bv.registerDefaultInstance(C63442ab.class, abVar);
    }

    private C63442ab() {
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
                return newMessageInfo(f171454e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63442ab();
            case 4:
                return new C63441aa();
            case 5:
                return f171454e;
            case 6:
                C63010eb ebVar = f171455f;
                if (ebVar == null) {
                    synchronized (C63442ab.class) {
                        ebVar = f171455f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171454e);
                            f171455f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
