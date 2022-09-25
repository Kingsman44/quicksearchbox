package com.google.assistant.p4008y.p4015e;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.knowledge.p4671b.C61822o;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.y.e.d */
/* compiled from: PG */
public final class C53668d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53668d f140865e;

    /* renamed from: h */
    private static volatile C63010eb f140866h;

    /* renamed from: a */
    public int f140867a;

    /* renamed from: b */
    public int f140868b;

    /* renamed from: c */
    public C54188e f140869c;

    /* renamed from: d */
    public C53667c f140870d;

    /* renamed from: f */
    private C51715bm f140871f;

    /* renamed from: g */
    private byte f140872g = 2;

    static {
        C53668d dVar = new C53668d();
        f140865e = dVar;
        C62942bv.registerDefaultInstance(C53668d.class, dVar);
    }

    private C53668d() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140872g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140872g = b;
                return null;
            case 2:
                return newMessageInfo(f140865e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C61822o.m94478b(), C45240c.f118157a, C10662f.f35572a, "d"});
            case 3:
                return new C53668d();
            case 4:
                return new C53665a();
            case 5:
                return f140865e;
            case 6:
                C63010eb ebVar = f140866h;
                if (ebVar == null) {
                    synchronized (C53668d.class) {
                        ebVar = f140866h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140865e);
                            f140866h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
