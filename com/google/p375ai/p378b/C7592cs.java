package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cs */
/* compiled from: PG */
public final class C7592cs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7592cs f26238e;

    /* renamed from: g */
    private static volatile C63010eb f26239g;

    /* renamed from: a */
    public int f26240a;

    /* renamed from: b */
    public String f26241b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8178yk f26242c;

    /* renamed from: d */
    public int f26243d;

    /* renamed from: f */
    private byte f26244f = 2;

    static {
        C7592cs csVar = new C7592cs();
        f26238e = csVar;
        C62942bv.registerDefaultInstance(C7592cs.class, csVar);
    }

    private C7592cs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26244f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26244f = b;
                return null;
            case 2:
                return newMessageInfo(f26238e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C7681g.m22803b()});
            case 3:
                return new C7592cs();
            case 4:
                return new C7591cr();
            case 5:
                return f26238e;
            case 6:
                C63010eb ebVar = f26239g;
                if (ebVar == null) {
                    synchronized (C7592cs.class) {
                        ebVar = f26239g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26238e);
                            f26239g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
