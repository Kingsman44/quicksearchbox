package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.s */
/* compiled from: PG */
public final class C65535s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65535s f178113b;

    /* renamed from: c */
    private static volatile C63010eb f178114c;

    /* renamed from: a */
    public String f178115a = BuildConfig.FLAVOR;

    static {
        C65535s sVar = new C65535s();
        f178113b = sVar;
        C62942bv.registerDefaultInstance(C65535s.class, sVar);
    }

    private C65535s() {
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
                return newMessageInfo(f178113b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C65535s();
            case 4:
                return new C65534r();
            case 5:
                return f178113b;
            case 6:
                C63010eb ebVar = f178114c;
                if (ebVar == null) {
                    synchronized (C65535s.class) {
                        ebVar = f178114c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178113b);
                            f178114c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
