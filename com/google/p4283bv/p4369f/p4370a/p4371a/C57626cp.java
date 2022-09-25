package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cp */
/* compiled from: PG */
public final class C57626cp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57626cp f153922b;

    /* renamed from: c */
    private static volatile C63010eb f153923c;

    /* renamed from: a */
    public String f153924a = BuildConfig.FLAVOR;

    static {
        C57626cp cpVar = new C57626cp();
        f153922b = cpVar;
        C62942bv.registerDefaultInstance(C57626cp.class, cpVar);
    }

    private C57626cp() {
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
                return newMessageInfo(f153922b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C57626cp();
            case 4:
                return new C57625co();
            case 5:
                return f153922b;
            case 6:
                C63010eb ebVar = f153923c;
                if (ebVar == null) {
                    synchronized (C57626cp.class) {
                        ebVar = f153923c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153922b);
                            f153923c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
