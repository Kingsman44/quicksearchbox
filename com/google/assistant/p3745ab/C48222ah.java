package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.ab.ah */
/* compiled from: PG */
public final class C48222ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48222ah f124759b;

    /* renamed from: c */
    private static volatile C63010eb f124760c;

    /* renamed from: a */
    public String f124761a = BuildConfig.FLAVOR;

    static {
        C48222ah ahVar = new C48222ah();
        f124759b = ahVar;
        C62942bv.registerDefaultInstance(C48222ah.class, ahVar);
    }

    private C48222ah() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f124759b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C48222ah();
            case 4:
                return new C48221ag();
            case 5:
                return f124759b;
            case 6:
                C63010eb ebVar = f124760c;
                if (ebVar == null) {
                    synchronized (C48222ah.class) {
                        ebVar = f124760c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124759b);
                            f124760c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
