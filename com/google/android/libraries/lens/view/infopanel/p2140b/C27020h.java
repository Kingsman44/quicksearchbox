package com.google.android.libraries.lens.view.infopanel.p2140b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66166ck;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.h */
/* compiled from: PG */
public final class C27020h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C27020h f73655c;

    /* renamed from: e */
    private static volatile C63010eb f73656e;

    /* renamed from: a */
    public String f73657a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C66166ck f73658b;

    /* renamed from: d */
    private byte f73659d = 2;

    static {
        C27020h hVar = new C27020h();
        f73655c = hVar;
        C62942bv.registerDefaultInstance(C27020h.class, hVar);
    }

    private C27020h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f73659d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f73659d = b;
                return null;
            case 2:
                return newMessageInfo(f73655c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ȉ\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C27020h();
            case 4:
                return new C27019g();
            case 5:
                return f73655c;
            case 6:
                C63010eb ebVar = f73656e;
                if (ebVar == null) {
                    synchronized (C27020h.class) {
                        ebVar = f73656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f73655c);
                            f73656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
