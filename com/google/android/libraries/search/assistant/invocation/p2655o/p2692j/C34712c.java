package com.google.android.libraries.search.assistant.invocation.p2655o.p2692j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.j.c */
/* compiled from: PG */
public final class C34712c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34712c f92130c;

    /* renamed from: d */
    public static final C62940bt f92131d;

    /* renamed from: e */
    private static volatile C63010eb f92132e;

    /* renamed from: a */
    public int f92133a;

    /* renamed from: b */
    public String f92134b = BuildConfig.FLAVOR;

    static {
        C34712c cVar = new C34712c();
        f92130c = cVar;
        C62942bv.registerDefaultInstance(C34712c.class, cVar);
        f92131d = C62942bv.newSingularGeneratedExtension(C34053bp.f90753a, cVar, cVar, (C62958ce) null, 1, C63066gd.MESSAGE, C34712c.class);
    }

    private C34712c() {
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
                return newMessageInfo(f92130c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34712c();
            case 4:
                return new C34709b();
            case 5:
                return f92130c;
            case 6:
                C63010eb ebVar = f92132e;
                if (ebVar == null) {
                    synchronized (C34712c.class) {
                        ebVar = f92132e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92130c);
                            f92132e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
