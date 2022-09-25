package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.bf */
/* compiled from: PG */
public final class C136866bf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136866bf f372518f;

    /* renamed from: g */
    private static volatile C63010eb f372519g;

    /* renamed from: a */
    public int f372520a;

    /* renamed from: b */
    public C62995dn f372521b = C62995dn.f170057a;

    /* renamed from: c */
    public long f372522c;

    /* renamed from: d */
    public boolean f372523d;

    /* renamed from: e */
    public C62995dn f372524e = C62995dn.f170057a;

    static {
        C136866bf bfVar = new C136866bf();
        f372518f = bfVar;
        C62942bv.registerDefaultInstance(C136866bf.class, bfVar);
    }

    private C136866bf() {
    }

    /* renamed from: a */
    public final C62995dn mo113416a() {
        C62995dn dnVar = this.f372521b;
        if (!dnVar.f170058b) {
            this.f372521b = dnVar.mo58980a();
        }
        return this.f372521b;
    }

    /* renamed from: b */
    public final C62995dn mo113417b() {
        C62995dn dnVar = this.f372524e;
        if (!dnVar.f170058b) {
            this.f372524e = dnVar.mo58980a();
        }
        return this.f372524e;
    }

    /* renamed from: c */
    public final boolean mo113418c(long j) {
        return this.f372524e.containsKey(Long.valueOf(j));
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
                return newMessageInfo(f372518f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u00012\u0002ဃ\u0000\u0003ဇ\u0001\u00042", new Object[]{"a", "b", C136865be.f372517a, C45240c.f118157a, "d", "e", C136863bc.f372516a});
            case 3:
                return new C136866bf();
            case 4:
                return new C136864bd();
            case 5:
                return f372518f;
            case 6:
                C63010eb ebVar = f372519g;
                if (ebVar == null) {
                    synchronized (C136866bf.class) {
                        ebVar = f372519g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372518f);
                            f372519g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
