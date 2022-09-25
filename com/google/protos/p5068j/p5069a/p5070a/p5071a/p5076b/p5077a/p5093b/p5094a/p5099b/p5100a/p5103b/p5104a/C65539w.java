package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.w */
/* compiled from: PG */
public final class C65539w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65539w f178119c;

    /* renamed from: d */
    private static volatile C63010eb f178120d;

    /* renamed from: a */
    public String f178121a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f178122b;

    static {
        C65539w wVar = new C65539w();
        f178119c = wVar;
        C62942bv.registerDefaultInstance(C65539w.class, wVar);
    }

    private C65539w() {
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
                return newMessageInfo(f178119c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C65539w();
            case 4:
                return new C65538v();
            case 5:
                return f178119c;
            case 6:
                C63010eb ebVar = f178120d;
                if (ebVar == null) {
                    synchronized (C65539w.class) {
                        ebVar = f178120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178119c);
                            f178120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
