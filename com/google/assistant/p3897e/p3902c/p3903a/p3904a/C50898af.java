package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.af */
/* compiled from: PG */
public final class C50898af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50898af f132518c;

    /* renamed from: d */
    private static volatile C63010eb f132519d;

    /* renamed from: a */
    public int f132520a;

    /* renamed from: b */
    public String f132521b = BuildConfig.FLAVOR;

    static {
        C50898af afVar = new C50898af();
        f132518c = afVar;
        C62942bv.registerDefaultInstance(C50898af.class, afVar);
    }

    private C50898af() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f132518c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50898af();
            case 4:
                return new C50897ae();
            case 5:
                return f132518c;
            case 6:
                C63010eb ebVar = f132519d;
                if (ebVar == null) {
                    synchronized (C50898af.class) {
                        ebVar = f132519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132518c);
                            f132519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
