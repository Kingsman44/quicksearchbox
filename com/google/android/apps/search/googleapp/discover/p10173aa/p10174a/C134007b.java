package com.google.android.apps.search.googleapp.discover.p10173aa.p10174a;

import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.a.b */
/* compiled from: PG */
public final class C134007b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134007b f365024c;

    /* renamed from: d */
    private static volatile C63010eb f365025d;

    /* renamed from: a */
    public int f365026a;

    /* renamed from: b */
    public int f365027b;

    static {
        C134007b bVar = new C134007b();
        f365024c = bVar;
        C62942bv.registerDefaultInstance(C134007b.class, bVar);
    }

    private C134007b() {
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
                return newMessageInfo(f365024c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C134591i.m218305b()});
            case 3:
                return new C134007b();
            case 4:
                return new C134006a();
            case 5:
                return f365024c;
            case 6:
                C63010eb ebVar = f365025d;
                if (ebVar == null) {
                    synchronized (C134007b.class) {
                        ebVar = f365025d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365024c);
                            f365025d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
