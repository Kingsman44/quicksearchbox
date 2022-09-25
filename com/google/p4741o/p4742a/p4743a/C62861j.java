package com.google.p4741o.p4742a.p4743a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.j */
/* compiled from: PG */
public final class C62861j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62861j f169746b;

    /* renamed from: c */
    private static volatile C63010eb f169747c;

    /* renamed from: a */
    public String f169748a = BuildConfig.FLAVOR;

    static {
        C62861j jVar = new C62861j();
        f169746b = jVar;
        C62942bv.registerDefaultInstance(C62861j.class, jVar);
    }

    private C62861j() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f169746b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003Ȉ", new Object[]{"a"});
            case 3:
                return new C62861j();
            case 4:
                return new C62860i();
            case 5:
                return f169746b;
            case 6:
                C63010eb ebVar = f169747c;
                if (ebVar == null) {
                    synchronized (C62861j.class) {
                        ebVar = f169747c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169746b);
                            f169747c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
