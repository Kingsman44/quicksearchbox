package com.google.p4283bv.p4287b.p4288a.p4323c.p4328e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.e.b */
/* compiled from: PG */
public final class C56874b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56874b f151748d;

    /* renamed from: e */
    public static final C62940bt f151749e;

    /* renamed from: f */
    private static volatile C63010eb f151750f;

    /* renamed from: a */
    public int f151751a;

    /* renamed from: b */
    public String f151752b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151753c = BuildConfig.FLAVOR;

    static {
        C56874b bVar = new C56874b();
        f151748d = bVar;
        C62942bv.registerDefaultInstance(C56874b.class, bVar);
        f151749e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 360908918, C63066gd.MESSAGE, C56874b.class);
    }

    private C56874b() {
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
                return newMessageInfo(f151748d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56874b();
            case 4:
                return new C56873a();
            case 5:
                return f151748d;
            case 6:
                C63010eb ebVar = f151750f;
                if (ebVar == null) {
                    synchronized (C56874b.class) {
                        ebVar = f151750f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151748d);
                            f151750f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
