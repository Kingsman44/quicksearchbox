package com.google.p343ac.p346b.p348b.p349a.p350a.p351a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p343ac.p358e.p359a.p360a.C6665b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.b.a.a.a.c */
/* compiled from: PG */
public final class C6640c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6640c f19864e;

    /* renamed from: f */
    private static volatile C63010eb f19865f;

    /* renamed from: a */
    public int f19866a;

    /* renamed from: b */
    public C6665b f19867b;

    /* renamed from: c */
    public String f19868c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62995dn f19869d = C62995dn.f170057a;

    static {
        C6640c cVar = new C6640c();
        f19864e = cVar;
        C62942bv.registerDefaultInstance(C6640c.class, cVar);
    }

    private C6640c() {
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
                return newMessageInfo(f19864e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", C6639b.f19863a});
            case 3:
                return new C6640c();
            case 4:
                return new C6638a();
            case 5:
                return f19864e;
            case 6:
                C63010eb ebVar = f19865f;
                if (ebVar == null) {
                    synchronized (C6640c.class) {
                        ebVar = f19865f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19864e);
                            f19865f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
