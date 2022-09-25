package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5101a.p5102a;

import com.google.assistant.p3897e.p3921j.p3926e.C51870cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.a.a.b */
/* compiled from: PG */
public final class C65505b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65505b f178063b;

    /* renamed from: c */
    private static volatile C63010eb f178064c;

    /* renamed from: a */
    public C51870cd f178065a;

    static {
        C65505b bVar = new C65505b();
        f178063b = bVar;
        C62942bv.registerDefaultInstance(C65505b.class, bVar);
    }

    private C65505b() {
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
                return newMessageInfo(f178063b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C65505b();
            case 4:
                return new C65504a();
            case 5:
                return f178063b;
            case 6:
                C63010eb ebVar = f178064c;
                if (ebVar == null) {
                    synchronized (C65505b.class) {
                        ebVar = f178064c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178063b);
                            f178064c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
