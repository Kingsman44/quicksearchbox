package com.google.p4283bv.p4287b.p4288a.p4323c.p4331h;

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

/* renamed from: com.google.bv.b.a.c.h.b */
/* compiled from: PG */
public final class C56886b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56886b f151797d;

    /* renamed from: e */
    public static final C62940bt f151798e;

    /* renamed from: f */
    private static volatile C63010eb f151799f;

    /* renamed from: a */
    public int f151800a;

    /* renamed from: b */
    public String f151801b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151802c = BuildConfig.FLAVOR;

    static {
        C56886b bVar = new C56886b();
        f151797d = bVar;
        C62942bv.registerDefaultInstance(C56886b.class, bVar);
        f151798e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 299096745, C63066gd.MESSAGE, C56886b.class);
    }

    private C56886b() {
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
                return newMessageInfo(f151797d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56886b();
            case 4:
                return new C56885a();
            case 5:
                return f151797d;
            case 6:
                C63010eb ebVar = f151799f;
                if (ebVar == null) {
                    synchronized (C56886b.class) {
                        ebVar = f151799f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151797d);
                            f151799f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
