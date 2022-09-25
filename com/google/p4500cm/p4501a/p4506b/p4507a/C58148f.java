package com.google.p4500cm.p4501a.p4506b.p4507a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.b.a.f */
/* compiled from: PG */
public final class C58148f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C58148f f155452f;

    /* renamed from: g */
    private static volatile C63010eb f155453g;

    /* renamed from: a */
    public int f155454a;

    /* renamed from: b */
    public String f155455b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f155456c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f155457d = emptyProtobufList();

    /* renamed from: e */
    public C58144b f155458e;

    static {
        C58148f fVar = new C58148f();
        f155452f = fVar;
        C62942bv.registerDefaultInstance(C58148f.class, fVar);
    }

    private C58148f() {
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
                return newMessageInfo(f155452f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C58146d.class, "e"});
            case 3:
                return new C58148f();
            case 4:
                return new C58147e();
            case 5:
                return f155452f;
            case 6:
                C63010eb ebVar = f155453g;
                if (ebVar == null) {
                    synchronized (C58148f.class) {
                        ebVar = f155453g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155452f);
                            f155453g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
