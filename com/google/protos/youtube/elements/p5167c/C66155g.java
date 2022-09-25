package com.google.protos.youtube.elements.p5167c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.c.g */
/* compiled from: PG */
public final class C66155g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66155g f179875g;

    /* renamed from: h */
    public static final C62940bt f179876h;

    /* renamed from: j */
    private static volatile C63010eb f179877j;

    /* renamed from: a */
    public int f179878a;

    /* renamed from: b */
    public C66166ck f179879b;

    /* renamed from: c */
    public int f179880c;

    /* renamed from: d */
    public double f179881d;

    /* renamed from: e */
    public int f179882e;

    /* renamed from: f */
    public int f179883f;

    /* renamed from: i */
    private byte f179884i = 2;

    static {
        C66155g gVar = new C66155g();
        f179875g = gVar;
        C62942bv.registerDefaultInstance(C66155g.class, gVar);
        f179876h = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, gVar, gVar, (C62958ce) null, 220544256, C63066gd.MESSAGE, C66155g.class);
    }

    private C66155g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179884i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179884i = b;
                return null;
            case 2:
                return newMessageInfo(f179875g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0004က\u0003\u0006ဌ\u0005\bင\u0007", new Object[]{"a", "b", C45240c.f118157a, C66149a.f179870a, "d", "e", C66153e.f179874a, C10662f.f35572a});
            case 3:
                return new C66155g();
            case 4:
                return new C66154f();
            case 5:
                return f179875g;
            case 6:
                C63010eb ebVar = f179877j;
                if (ebVar == null) {
                    synchronized (C66155g.class) {
                        ebVar = f179877j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179875g);
                            f179877j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
