package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.d */
/* compiled from: PG */
public final class C65520d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65520d f178092b;

    /* renamed from: c */
    private static volatile C63010eb f178093c;

    /* renamed from: a */
    public String f178094a = BuildConfig.FLAVOR;

    static {
        C65520d dVar = new C65520d();
        f178092b = dVar;
        C62942bv.registerDefaultInstance(C65520d.class, dVar);
    }

    private C65520d() {
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
                return newMessageInfo(f178092b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C65520d();
            case 4:
                return new C65519c();
            case 5:
                return f178092b;
            case 6:
                C63010eb ebVar = f178093c;
                if (ebVar == null) {
                    synchronized (C65520d.class) {
                        ebVar = f178093c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178092b);
                            f178093c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
