package com.google.p4283bv.p4287b.p4288a.p4323c.p4336m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.m.f */
/* compiled from: PG */
public final class C56918f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56918f f151897f;

    /* renamed from: g */
    public static final C62940bt f151898g;

    /* renamed from: h */
    private static volatile C63010eb f151899h;

    /* renamed from: a */
    public int f151900a;

    /* renamed from: b */
    public String f151901b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151902c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151903d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56840e f151904e;

    static {
        C56918f fVar = new C56918f();
        f151897f = fVar;
        C62942bv.registerDefaultInstance(C56918f.class, fVar);
        f151898g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 242883324, C63066gd.MESSAGE, C56918f.class);
    }

    private C56918f() {
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
                return newMessageInfo(f151897f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56918f();
            case 4:
                return new C56917e();
            case 5:
                return f151897f;
            case 6:
                C63010eb ebVar = f151899h;
                if (ebVar == null) {
                    synchronized (C56918f.class) {
                        ebVar = f151899h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151897f);
                            f151899h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
