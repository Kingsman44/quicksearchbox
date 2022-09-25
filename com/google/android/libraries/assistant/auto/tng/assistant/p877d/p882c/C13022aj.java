package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.aj */
/* compiled from: PG */
public final class C13022aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13022aj f40443c;

    /* renamed from: d */
    private static volatile C63010eb f40444d;

    /* renamed from: a */
    public int f40445a;

    /* renamed from: b */
    public String f40446b = BuildConfig.FLAVOR;

    static {
        C13022aj ajVar = new C13022aj();
        f40443c = ajVar;
        C62942bv.registerDefaultInstance(C13022aj.class, ajVar);
    }

    private C13022aj() {
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
                return newMessageInfo(f40443c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13022aj();
            case 4:
                return new C13021ai();
            case 5:
                return f40443c;
            case 6:
                C63010eb ebVar = f40444d;
                if (ebVar == null) {
                    synchronized (C13022aj.class) {
                        ebVar = f40444d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40443c);
                            f40444d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
