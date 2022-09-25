package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.ax */
/* compiled from: PG */
public final class C45553ax extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45553ax f119050d;

    /* renamed from: e */
    private static volatile C63010eb f119051e;

    /* renamed from: a */
    public C45558bb f119052a;

    /* renamed from: b */
    public String f119053b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C45567e f119054c;

    static {
        C45553ax axVar = new C45553ax();
        f119050d = axVar;
        C62942bv.registerDefaultInstance(C45553ax.class, axVar);
    }

    private C45553ax() {
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
                return newMessageInfo(f119050d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45553ax();
            case 4:
                return new C45552aw();
            case 5:
                return f119050d;
            case 6:
                C63010eb ebVar = f119051e;
                if (ebVar == null) {
                    synchronized (C45553ax.class) {
                        ebVar = f119051e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119050d);
                            f119051e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
