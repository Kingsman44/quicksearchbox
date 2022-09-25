package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.p5277z.p5282c.C68018h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4993d.C64794n;

/* renamed from: com.google.assistant.e.i.a.le */
/* compiled from: PG */
public final class C51532le extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51532le f134288e;

    /* renamed from: h */
    private static volatile C63010eb f134289h;

    /* renamed from: a */
    public int f134290a;

    /* renamed from: b */
    public C51953ff f134291b;

    /* renamed from: c */
    public C52003hb f134292c;

    /* renamed from: d */
    public C68018h f134293d;

    /* renamed from: f */
    private C64794n f134294f;

    /* renamed from: g */
    private byte f134295g = 2;

    static {
        C51532le leVar = new C51532le();
        f134288e = leVar;
        C62942bv.registerDefaultInstance(C51532le.class, leVar);
    }

    private C51532le() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134295g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134295g = b;
                return null;
            case 2:
                return newMessageInfo(f134288e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0005ᐉ\u0003", new Object[]{"a", "b", C10662f.f35572a, C45240c.f118157a, "d"});
            case 3:
                return new C51532le();
            case 4:
                return new C51531ld();
            case 5:
                return f134288e;
            case 6:
                C63010eb ebVar = f134289h;
                if (ebVar == null) {
                    synchronized (C51532le.class) {
                        ebVar = f134289h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134288e);
                            f134289h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
