package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cl */
/* compiled from: PG */
public final class C49320cl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49320cl f127467c;

    /* renamed from: d */
    private static volatile C63010eb f127468d;

    /* renamed from: a */
    public String f127469a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127470b = C62942bv.emptyProtobufList();

    static {
        C49320cl clVar = new C49320cl();
        f127467c = clVar;
        C62942bv.registerDefaultInstance(C49320cl.class, clVar);
    }

    private C49320cl() {
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
                return newMessageInfo(f127467c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C49320cl();
            case 4:
                return new C49319ck();
            case 5:
                return f127467c;
            case 6:
                C63010eb ebVar = f127468d;
                if (ebVar == null) {
                    synchronized (C49320cl.class) {
                        ebVar = f127468d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127467c);
                            f127468d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
