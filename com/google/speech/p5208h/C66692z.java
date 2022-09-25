package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.speech.h.z */
/* compiled from: PG */
public final class C66692z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66692z f181426e;

    /* renamed from: f */
    public static final C62940bt f181427f;

    /* renamed from: g */
    private static volatile C63010eb f181428g;

    /* renamed from: a */
    public int f181429a;

    /* renamed from: b */
    public C62971cq f181430b = emptyProtobufList();

    /* renamed from: c */
    public boolean f181431c;

    /* renamed from: d */
    public String f181432d = BuildConfig.FLAVOR;

    static {
        C66692z zVar = new C66692z();
        f181426e = zVar;
        C62942bv.registerDefaultInstance(C66692z.class, zVar);
        f181427f = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, zVar, zVar, (C62958ce) null, 82185720, C63066gd.MESSAGE, C66692z.class);
    }

    private C66692z() {
    }

    /* renamed from: a */
    public final void mo59706a() {
        C62971cq cqVar = this.f181430b;
        if (!cqVar.mo58948c()) {
            this.f181430b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181426e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0004", new Object[]{"a", "b", C66545ab.class, C45240c.f118157a, "d"});
            case 3:
                return new C66692z();
            case 4:
                return new C66691y();
            case 5:
                return f181426e;
            case 6:
                C63010eb ebVar = f181428g;
                if (ebVar == null) {
                    synchronized (C66692z.class) {
                        ebVar = f181428g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181426e);
                            f181428g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
