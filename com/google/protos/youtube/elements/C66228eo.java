package com.google.protos.youtube.elements;

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

/* renamed from: com.google.protos.youtube.elements.eo */
/* compiled from: PG */
public final class C66228eo extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C66228eo f180093f;

    /* renamed from: g */
    public static final C62940bt f180094g;

    /* renamed from: i */
    private static volatile C63010eb f180095i;

    /* renamed from: a */
    public int f180096a;

    /* renamed from: b */
    public int f180097b;

    /* renamed from: c */
    public int f180098c;

    /* renamed from: d */
    public float f180099d;

    /* renamed from: e */
    public float f180100e;

    /* renamed from: h */
    private byte f180101h = 2;

    static {
        C66228eo eoVar = new C66228eo();
        f180093f = eoVar;
        C62942bv.registerDefaultInstance(C66228eo.class, eoVar);
        f180094g = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, eoVar, eoVar, (C62958ce) null, 168774549, C63066gd.MESSAGE, C66228eo.class);
    }

    private C66228eo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180101h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180101h = b;
                return null;
            case 2:
                return newMessageInfo(f180093f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66228eo();
            case 4:
                return new C66227en();
            case 5:
                return f180093f;
            case 6:
                C63010eb ebVar = f180095i;
                if (ebVar == null) {
                    synchronized (C66228eo.class) {
                        ebVar = f180095i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180093f);
                            f180095i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
