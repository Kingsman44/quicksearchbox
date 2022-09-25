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

/* renamed from: com.google.bv.b.a.c.h.f */
/* compiled from: PG */
public final class C56890f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56890f f151811d;

    /* renamed from: e */
    public static final C62940bt f151812e;

    /* renamed from: f */
    private static volatile C63010eb f151813f;

    /* renamed from: a */
    public int f151814a;

    /* renamed from: b */
    public String f151815b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151816c = BuildConfig.FLAVOR;

    static {
        C56890f fVar = new C56890f();
        f151811d = fVar;
        C62942bv.registerDefaultInstance(C56890f.class, fVar);
        f151812e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 383958816, C63066gd.MESSAGE, C56890f.class);
    }

    private C56890f() {
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
                return newMessageInfo(f151811d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56890f();
            case 4:
                return new C56889e();
            case 5:
                return f151811d;
            case 6:
                C63010eb ebVar = f151813f;
                if (ebVar == null) {
                    synchronized (C56890f.class) {
                        ebVar = f151813f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151811d);
                            f151813f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
