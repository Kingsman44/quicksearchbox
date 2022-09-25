package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.an */
/* compiled from: PG */
public final class C121831an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121831an f338063c;

    /* renamed from: d */
    private static volatile C63010eb f338064d;

    /* renamed from: a */
    public String f338065a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f338066b;

    static {
        C121831an anVar = new C121831an();
        f338063c = anVar;
        C62942bv.registerDefaultInstance(C121831an.class, anVar);
    }

    private C121831an() {
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
                return newMessageInfo(f338063c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C121831an();
            case 4:
                return new C121829al();
            case 5:
                return f338063c;
            case 6:
                C63010eb ebVar = f338064d;
                if (ebVar == null) {
                    synchronized (C121831an.class) {
                        ebVar = f338064d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338063c);
                            f338064d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
