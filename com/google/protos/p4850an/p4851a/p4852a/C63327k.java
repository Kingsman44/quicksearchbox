package com.google.protos.p4850an.p4851a.p4852a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.k */
/* compiled from: PG */
public final class C63327k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63327k f171155c;

    /* renamed from: e */
    private static volatile C63010eb f171156e;

    /* renamed from: a */
    public C62995dn f171157a = C62995dn.f170057a;

    /* renamed from: b */
    public C63329m f171158b;

    /* renamed from: d */
    private int f171159d;

    static {
        C63327k kVar = new C63327k();
        f171155c = kVar;
        C62942bv.registerDefaultInstance(C63327k.class, kVar);
    }

    private C63327k() {
    }

    /* renamed from: a */
    public final C62995dn mo59205a() {
        C62995dn dnVar = this.f171157a;
        if (!dnVar.f170058b) {
            this.f171157a = dnVar.mo58980a();
        }
        return this.f171157a;
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
                return newMessageInfo(f171155c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0001\u0000\u0000\u00012\u0004ဉ\u0002", new Object[]{"d", "a", C63326j.f171154a, "b"});
            case 3:
                return new C63327k();
            case 4:
                return new C63325i();
            case 5:
                return f171155c;
            case 6:
                C63010eb ebVar = f171156e;
                if (ebVar == null) {
                    synchronized (C63327k.class) {
                        ebVar = f171156e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171155c);
                            f171156e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
