package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.aj */
/* compiled from: PG */
public final class C62671aj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62671aj f169200f;

    /* renamed from: g */
    private static volatile C63010eb f169201g;

    /* renamed from: a */
    public int f169202a;

    /* renamed from: b */
    public int f169203b;

    /* renamed from: c */
    public boolean f169204c;

    /* renamed from: d */
    public C62971cq f169205d = emptyProtobufList();

    /* renamed from: e */
    public String f169206e;

    static {
        C62671aj ajVar = new C62671aj();
        f169200f = ajVar;
        C62942bv.registerDefaultInstance(C62671aj.class, ajVar);
    }

    private C62671aj() {
        emptyProtobufList();
        emptyProtobufList();
        this.f169206e = BuildConfig.FLAVOR;
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
                return newMessageInfo(f169200f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0002\u0004\u001b\u0007ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C62696x.class, "e"});
            case 3:
                return new C62671aj();
            case 4:
                return new C62670ai();
            case 5:
                return f169200f;
            case 6:
                C63010eb ebVar = f169201g;
                if (ebVar == null) {
                    synchronized (C62671aj.class) {
                        ebVar = f169201g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169200f);
                            f169201g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
