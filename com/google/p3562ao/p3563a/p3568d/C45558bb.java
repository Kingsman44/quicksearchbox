package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.bb */
/* compiled from: PG */
public final class C45558bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45558bb f119057e;

    /* renamed from: f */
    private static volatile C63010eb f119058f;

    /* renamed from: a */
    public String f119059a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f119060b;

    /* renamed from: c */
    public C45585w f119061c;

    /* renamed from: d */
    public int f119062d;

    static {
        C45558bb bbVar = new C45558bb();
        f119057e = bbVar;
        C62942bv.registerDefaultInstance(C45558bb.class, bbVar);
    }

    private C45558bb() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f119057e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0004\t\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45558bb();
            case 4:
                return new C45557ba();
            case 5:
                return f119057e;
            case 6:
                C63010eb ebVar = f119058f;
                if (ebVar == null) {
                    synchronized (C45558bb.class) {
                        ebVar = f119058f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119057e);
                            f119058f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
