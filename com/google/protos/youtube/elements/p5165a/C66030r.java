package com.google.protos.youtube.elements.p5165a;

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

/* renamed from: com.google.protos.youtube.elements.a.r */
/* compiled from: PG */
public final class C66030r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66030r f179573e;

    /* renamed from: f */
    public static final C62940bt f179574f;

    /* renamed from: h */
    private static volatile C63010eb f179575h;

    /* renamed from: a */
    public int f179576a;

    /* renamed from: b */
    public String f179577b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f179578c;

    /* renamed from: d */
    public CommandOuterClass$Command f179579d;

    /* renamed from: g */
    private byte f179580g = 2;

    static {
        C66030r rVar = new C66030r();
        f179573e = rVar;
        C62942bv.registerDefaultInstance(C66030r.class, rVar);
        f179574f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, rVar, rVar, (C62958ce) null, 315252720, C63066gd.MESSAGE, C66030r.class);
    }

    private C66030r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179580g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179580g = b;
                return null;
            case 2:
                return newMessageInfo(f179573e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ခ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66030r();
            case 4:
                return new C66029q();
            case 5:
                return f179573e;
            case 6:
                C63010eb ebVar = f179575h;
                if (ebVar == null) {
                    synchronized (C66030r.class) {
                        ebVar = f179575h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179573e);
                            f179575h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
