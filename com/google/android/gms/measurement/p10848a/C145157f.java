package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.f */
/* compiled from: PG */
public final class C145157f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C145157f f392343f;

    /* renamed from: g */
    private static volatile C63010eb f392344g;

    /* renamed from: a */
    public int f392345a;

    /* renamed from: b */
    public C145167p f392346b;

    /* renamed from: c */
    public C145161j f392347c;

    /* renamed from: d */
    public boolean f392348d;

    /* renamed from: e */
    public String f392349e = BuildConfig.FLAVOR;

    static {
        C145157f fVar = new C145157f();
        f392343f = fVar;
        C62942bv.registerDefaultInstance(C145157f.class, fVar);
    }

    private C145157f() {
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
                return newMessageInfo(f392343f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C145157f();
            case 4:
                return new C145156e();
            case 5:
                return f392343f;
            case 6:
                C63010eb ebVar = f392344g;
                if (ebVar == null) {
                    synchronized (C145157f.class) {
                        ebVar = f392344g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392343f);
                            f392344g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
