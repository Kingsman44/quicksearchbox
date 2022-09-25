package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

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

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.x */
/* compiled from: PG */
public final class C64155x extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64155x f173452f;

    /* renamed from: g */
    public static final C62940bt f173453g;

    /* renamed from: h */
    private static volatile C63010eb f173454h;

    /* renamed from: a */
    public int f173455a;

    /* renamed from: b */
    public int f173456b = 0;

    /* renamed from: c */
    public Object f173457c;

    /* renamed from: d */
    public String f173458d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173459e = BuildConfig.FLAVOR;

    static {
        C64155x xVar = new C64155x();
        f173452f = xVar;
        C62942bv.registerDefaultInstance(C64155x.class, xVar);
        f173453g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, xVar, xVar, (C62958ce) null, 276182751, C63066gd.MESSAGE, C64155x.class);
    }

    private C64155x() {
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
                return newMessageInfo(f173452f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C64145n.class, C64141j.class, C64137f.class});
            case 3:
                return new C64155x();
            case 4:
                return new C64154w();
            case 5:
                return f173452f;
            case 6:
                C63010eb ebVar = f173454h;
                if (ebVar == null) {
                    synchronized (C64155x.class) {
                        ebVar = f173454h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173452f);
                            f173454h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
