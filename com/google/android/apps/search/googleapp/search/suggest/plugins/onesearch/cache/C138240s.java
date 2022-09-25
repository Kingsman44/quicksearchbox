package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s */
/* compiled from: PG */
public final class C138240s extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138240s f376117f;

    /* renamed from: h */
    private static volatile C63010eb f376118h;

    /* renamed from: a */
    public int f376119a;

    /* renamed from: b */
    public C62995dn f376120b = C62995dn.f170057a;

    /* renamed from: c */
    public C62995dn f376121c;

    /* renamed from: d */
    public C62995dn f376122d;

    /* renamed from: e */
    public boolean f376123e;

    /* renamed from: g */
    private byte f376124g;

    static {
        C138240s sVar = new C138240s();
        f376117f = sVar;
        C62942bv.registerDefaultInstance(C138240s.class, sVar);
    }

    private C138240s() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f376121c = dnVar;
        this.f376122d = dnVar;
        this.f376124g = 2;
    }

    /* renamed from: a */
    public final C62995dn mo114211a() {
        C62995dn dnVar = this.f376120b;
        if (!dnVar.f170058b) {
            this.f376120b = dnVar.mo58980a();
        }
        return this.f376120b;
    }

    /* renamed from: b */
    public final C62995dn mo114212b() {
        C62995dn dnVar = this.f376121c;
        if (!dnVar.f170058b) {
            this.f376121c = dnVar.mo58980a();
        }
        return this.f376121c;
    }

    /* renamed from: c */
    public final C62995dn mo114213c() {
        C62995dn dnVar = this.f376122d;
        if (!dnVar.f170058b) {
            this.f376122d = dnVar.mo58980a();
        }
        return this.f376122d;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f376124g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f376124g = b;
                return null;
            case 2:
                return newMessageInfo(f376117f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0003\u0000\u0002\u0002в\u00042\u0005в\u0006ဇ\u0000", new Object[]{"a", C45240c.f118157a, C138237p.f376114a, "b", C138238q.f376115a, "d", C138239r.f376116a, "e"});
            case 3:
                return new C138240s();
            case 4:
                return new C138236o();
            case 5:
                return f376117f;
            case 6:
                C63010eb ebVar = f376118h;
                if (ebVar == null) {
                    synchronized (C138240s.class) {
                        ebVar = f376118h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376117f);
                            f376118h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
