package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.android.libraries.search.n.ct */
/* compiled from: PG */
public final class C39666ct extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C39666ct f104415e;

    /* renamed from: f */
    public static final C62940bt f104416f;

    /* renamed from: h */
    private static volatile C63010eb f104417h;

    /* renamed from: a */
    public int f104418a;

    /* renamed from: b */
    public int f104419b = 0;

    /* renamed from: c */
    public Object f104420c;

    /* renamed from: d */
    public C39276az f104421d;

    /* renamed from: g */
    private byte f104422g = 2;

    static {
        C39666ct ctVar = new C39666ct();
        f104415e = ctVar;
        C62942bv.registerDefaultInstance(C39666ct.class, ctVar);
        f104416f = C62942bv.newSingularGeneratedExtension(C39670cx.f104424a, ctVar, ctVar, (C62958ce) null, 413019266, C63066gd.MESSAGE, C39666ct.class);
    }

    private C39666ct() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104422g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f104422g = b;
                return null;
            case 2:
                return newMessageInfo(f104415e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ဉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C66722az.class, C66709am.class, "d"});
            case 3:
                return new C39666ct();
            case 4:
                return new C39665cs();
            case 5:
                return f104415e;
            case 6:
                C63010eb ebVar = f104417h;
                if (ebVar == null) {
                    synchronized (C39666ct.class) {
                        ebVar = f104417h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104415e);
                            f104417h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
