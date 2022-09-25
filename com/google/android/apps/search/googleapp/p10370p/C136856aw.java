package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.aw */
/* compiled from: PG */
public final class C136856aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C136856aw f372499e;

    /* renamed from: f */
    private static volatile C63010eb f372500f;

    /* renamed from: a */
    public int f372501a;

    /* renamed from: b */
    public long f372502b;

    /* renamed from: c */
    public long f372503c;

    /* renamed from: d */
    public C62995dn f372504d = C62995dn.f170057a;

    static {
        C136856aw awVar = new C136856aw();
        f372499e = awVar;
        C62942bv.registerDefaultInstance(C136856aw.class, awVar);
    }

    private C136856aw() {
    }

    /* renamed from: a */
    public final C62995dn mo113414a() {
        C62995dn dnVar = this.f372504d;
        if (!dnVar.f170058b) {
            this.f372504d = dnVar.mo58980a();
        }
        return this.f372504d;
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
                return newMessageInfo(f372499e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u00032", new Object[]{"a", "b", C45240c.f118157a, "d", C136854au.f372498a});
            case 3:
                return new C136856aw();
            case 4:
                return new C136855av();
            case 5:
                return f372499e;
            case 6:
                C63010eb ebVar = f372500f;
                if (ebVar == null) {
                    synchronized (C136856aw.class) {
                        ebVar = f372500f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372499e);
                            f372500f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
