package com.google.assistant.p3897e.p3921j.p3924c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.g */
/* compiled from: PG */
public final class C51736g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51736g f135725d;

    /* renamed from: f */
    private static volatile C63010eb f135726f;

    /* renamed from: a */
    public int f135727a = 0;

    /* renamed from: b */
    public Object f135728b;

    /* renamed from: c */
    public String f135729c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f135730e;

    static {
        C51736g gVar = new C51736g();
        f135725d = gVar;
        C62942bv.registerDefaultInstance(C51736g.class, gVar);
    }

    private C51736g() {
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
                return newMessageInfo(f135725d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဿ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C51731b.f135717a, C51735f.class});
            case 3:
                return new C51736g();
            case 4:
                return new C51733d();
            case 5:
                return f135725d;
            case 6:
                C63010eb ebVar = f135726f;
                if (ebVar == null) {
                    synchronized (C51736g.class) {
                        ebVar = f135726f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135725d);
                            f135726f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
