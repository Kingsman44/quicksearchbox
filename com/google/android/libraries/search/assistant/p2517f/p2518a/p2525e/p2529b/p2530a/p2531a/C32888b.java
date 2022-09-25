package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a.p2531a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.f.a.e.b.a.a.b */
/* compiled from: PG */
public final class C32888b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32888b f88138d;

    /* renamed from: e */
    public static final C62940bt f88139e;

    /* renamed from: f */
    private static volatile C63010eb f88140f;

    /* renamed from: a */
    public int f88141a;

    /* renamed from: b */
    public String f88142b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f88143c = C62942bv.emptyProtobufList();

    static {
        C32888b bVar = new C32888b();
        f88138d = bVar;
        C62942bv.registerDefaultInstance(C32888b.class, bVar);
        f88139e = C62942bv.newSingularGeneratedExtension(C32814bi.f87999a, bVar, bVar, (C62958ce) null, 456993644, C63066gd.MESSAGE, C32888b.class);
    }

    private C32888b() {
    }

    /* renamed from: a */
    public final void mo38331a() {
        C62971cq cqVar = this.f88143c;
        if (!cqVar.mo58948c()) {
            this.f88143c = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f88138d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C32888b();
            case 4:
                return new C32887a();
            case 5:
                return f88138d;
            case 6:
                C63010eb ebVar = f88140f;
                if (ebVar == null) {
                    synchronized (C32888b.class) {
                        ebVar = f88140f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88138d);
                            f88140f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
