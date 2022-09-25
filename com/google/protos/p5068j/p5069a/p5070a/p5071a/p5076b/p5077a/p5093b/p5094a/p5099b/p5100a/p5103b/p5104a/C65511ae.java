package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ae */
/* compiled from: PG */
public final class C65511ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65511ae f178074c;

    /* renamed from: d */
    private static volatile C63010eb f178075d;

    /* renamed from: a */
    public String f178076a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f178077b = BuildConfig.FLAVOR;

    static {
        C65511ae aeVar = new C65511ae();
        f178074c = aeVar;
        C62942bv.registerDefaultInstance(C65511ae.class, aeVar);
    }

    private C65511ae() {
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
                return newMessageInfo(f178074c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C65511ae();
            case 4:
                return new C65510ad();
            case 5:
                return f178074c;
            case 6:
                C63010eb ebVar = f178075d;
                if (ebVar == null) {
                    synchronized (C65511ae.class) {
                        ebVar = f178075d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178074c);
                            f178075d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
