package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.u */
/* compiled from: PG */
public final class C65537u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65537u f178116b;

    /* renamed from: c */
    private static volatile C63010eb f178117c;

    /* renamed from: a */
    public String f178118a = BuildConfig.FLAVOR;

    static {
        C65537u uVar = new C65537u();
        f178116b = uVar;
        C62942bv.registerDefaultInstance(C65537u.class, uVar);
    }

    private C65537u() {
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
                return newMessageInfo(f178116b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C65537u();
            case 4:
                return new C65536t();
            case 5:
                return f178116b;
            case 6:
                C63010eb ebVar = f178117c;
                if (ebVar == null) {
                    synchronized (C65537u.class) {
                        ebVar = f178117c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178116b);
                            f178117c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
