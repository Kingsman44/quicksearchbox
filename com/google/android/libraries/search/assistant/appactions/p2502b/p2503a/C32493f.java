package com.google.android.libraries.search.assistant.appactions.p2502b.p2503a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.appactions.b.a.f */
/* compiled from: PG */
public final class C32493f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32493f f87067d;

    /* renamed from: e */
    public static final C62940bt f87068e;

    /* renamed from: f */
    private static volatile C63010eb f87069f;

    /* renamed from: a */
    public int f87070a;

    /* renamed from: b */
    public C62971cq f87071b = emptyProtobufList();

    /* renamed from: c */
    public String f87072c = BuildConfig.FLAVOR;

    static {
        C32493f fVar = new C32493f();
        f87067d = fVar;
        C62942bv.registerDefaultInstance(C32493f.class, fVar);
        f87068e = C62942bv.newSingularGeneratedExtension(C32814bi.f87999a, fVar, fVar, (C62958ce) null, 391179243, C63066gd.MESSAGE, C32493f.class);
    }

    private C32493f() {
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
                return newMessageInfo(f87067d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C49330g.class, C45240c.f118157a});
            case 3:
                return new C32493f();
            case 4:
                return new C32492e();
            case 5:
                return f87067d;
            case 6:
                C63010eb ebVar = f87069f;
                if (ebVar == null) {
                    synchronized (C32493f.class) {
                        ebVar = f87069f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87067d);
                            f87069f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
