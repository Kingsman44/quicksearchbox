package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3741aa.C48169d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.t */
/* compiled from: PG */
public final class C124204t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124204t f342960c;

    /* renamed from: d */
    private static volatile C63010eb f342961d;

    /* renamed from: a */
    public String f342962a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C48169d f342963b;

    static {
        C124204t tVar = new C124204t();
        f342960c = tVar;
        C62942bv.registerDefaultInstance(C124204t.class, tVar);
    }

    private C124204t() {
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
                return newMessageInfo(f342960c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C124204t();
            case 4:
                return new C124203s();
            case 5:
                return f342960c;
            case 6:
                C63010eb ebVar = f342961d;
                if (ebVar == null) {
                    synchronized (C124204t.class) {
                        ebVar = f342961d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342960c);
                            f342961d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
