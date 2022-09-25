package com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a;

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

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.j.a.b */
/* compiled from: PG */
public final class C34707b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34707b f92125c;

    /* renamed from: d */
    public static final C62940bt f92126d;

    /* renamed from: e */
    private static volatile C63010eb f92127e;

    /* renamed from: a */
    public int f92128a;

    /* renamed from: b */
    public String f92129b = BuildConfig.FLAVOR;

    static {
        C34707b bVar = new C34707b();
        f92125c = bVar;
        C62942bv.registerDefaultInstance(C34707b.class, bVar);
        f92126d = C62942bv.newSingularGeneratedExtension(C34053bp.f90753a, bVar, bVar, (C62958ce) null, 2, C63066gd.MESSAGE, C34707b.class);
    }

    private C34707b() {
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
                return newMessageInfo(f92125c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34707b();
            case 4:
                return new C34706a();
            case 5:
                return f92125c;
            case 6:
                C63010eb ebVar = f92127e;
                if (ebVar == null) {
                    synchronized (C34707b.class) {
                        ebVar = f92127e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92125c);
                            f92127e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
