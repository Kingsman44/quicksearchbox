package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ak */
/* compiled from: PG */
public final class C65517ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65517ak f178085b;

    /* renamed from: c */
    private static volatile C63010eb f178086c;

    /* renamed from: a */
    public String f178087a = BuildConfig.FLAVOR;

    static {
        C65517ak akVar = new C65517ak();
        f178085b = akVar;
        C62942bv.registerDefaultInstance(C65517ak.class, akVar);
    }

    private C65517ak() {
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
                return newMessageInfo(f178085b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C65517ak();
            case 4:
                return new C65516aj();
            case 5:
                return f178085b;
            case 6:
                C63010eb ebVar = f178086c;
                if (ebVar == null) {
                    synchronized (C65517ak.class) {
                        ebVar = f178086c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178085b);
                            f178086c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
