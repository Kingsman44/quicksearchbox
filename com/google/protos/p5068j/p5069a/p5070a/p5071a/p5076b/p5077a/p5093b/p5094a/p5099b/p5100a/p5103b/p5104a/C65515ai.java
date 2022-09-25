package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ai */
/* compiled from: PG */
public final class C65515ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65515ai f178081c;

    /* renamed from: d */
    private static volatile C63010eb f178082d;

    /* renamed from: a */
    public String f178083a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f178084b = BuildConfig.FLAVOR;

    static {
        C65515ai aiVar = new C65515ai();
        f178081c = aiVar;
        C62942bv.registerDefaultInstance(C65515ai.class, aiVar);
    }

    private C65515ai() {
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
                return newMessageInfo(f178081c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C65515ai();
            case 4:
                return new C65514ah();
            case 5:
                return f178081c;
            case 6:
                C63010eb ebVar = f178082d;
                if (ebVar == null) {
                    synchronized (C65515ai.class) {
                        ebVar = f178082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178081c);
                            f178082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
