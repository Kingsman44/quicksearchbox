package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.i */
/* compiled from: PG */
public final class C45571i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45571i f119099e;

    /* renamed from: f */
    private static volatile C63010eb f119100f;

    /* renamed from: a */
    public C45558bb f119101a;

    /* renamed from: b */
    public C45587y f119102b;

    /* renamed from: c */
    public C45569g f119103c;

    /* renamed from: d */
    public String f119104d = BuildConfig.FLAVOR;

    static {
        C45571i iVar = new C45571i();
        f119099e = iVar;
        C62942bv.registerDefaultInstance(C45571i.class, iVar);
    }

    private C45571i() {
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
                return newMessageInfo(f119099e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45571i();
            case 4:
                return new C45570h();
            case 5:
                return f119099e;
            case 6:
                C63010eb ebVar = f119100f;
                if (ebVar == null) {
                    synchronized (C45571i.class) {
                        ebVar = f119100f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119099e);
                            f119100f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
