package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.q */
/* compiled from: PG */
public final class C65533q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65533q f178110b;

    /* renamed from: c */
    private static volatile C63010eb f178111c;

    /* renamed from: a */
    public String f178112a = BuildConfig.FLAVOR;

    static {
        C65533q qVar = new C65533q();
        f178110b = qVar;
        C62942bv.registerDefaultInstance(C65533q.class, qVar);
    }

    private C65533q() {
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
                return newMessageInfo(f178110b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C65533q();
            case 4:
                return new C65532p();
            case 5:
                return f178110b;
            case 6:
                C63010eb ebVar = f178111c;
                if (ebVar == null) {
                    synchronized (C65533q.class) {
                        ebVar = f178111c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178110b);
                            f178111c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
