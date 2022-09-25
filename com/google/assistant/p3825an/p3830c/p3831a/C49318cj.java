package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cj */
/* compiled from: PG */
public final class C49318cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49318cj f127463c;

    /* renamed from: d */
    private static volatile C63010eb f127464d;

    /* renamed from: a */
    public String f127465a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f127466b = BuildConfig.FLAVOR;

    static {
        C49318cj cjVar = new C49318cj();
        f127463c = cjVar;
        C62942bv.registerDefaultInstance(C49318cj.class, cjVar);
    }

    private C49318cj() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f127463c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C49318cj();
            case 4:
                return new C49317ci();
            case 5:
                return f127463c;
            case 6:
                C63010eb ebVar = f127464d;
                if (ebVar == null) {
                    synchronized (C49318cj.class) {
                        ebVar = f127464d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127463c);
                            f127464d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
