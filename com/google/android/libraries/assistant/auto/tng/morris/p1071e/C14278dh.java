package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dh */
/* compiled from: PG */
public final class C14278dh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C14278dh f43183g;

    /* renamed from: i */
    private static volatile C63010eb f43184i;

    /* renamed from: a */
    public int f43185a = 0;

    /* renamed from: b */
    public Object f43186b;

    /* renamed from: c */
    public C14603pi f43187c;

    /* renamed from: d */
    public C14603pi f43188d;

    /* renamed from: e */
    public C14603pi f43189e;

    /* renamed from: f */
    public C14603pi f43190f;

    /* renamed from: h */
    private byte f43191h = 2;

    static {
        C14278dh dhVar = new C14278dh();
        f43183g = dhVar;
        C62942bv.registerDefaultInstance(C14278dh.class, dhVar);
    }

    private C14278dh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43191h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43191h = b;
                return null;
            case 2:
                return newMessageInfo(f43183g, "\u0000\u000e\u0001\u0000\u0001\u000f\u000e\u0000\u0000\t\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004м\u0000\u0005Љ\u0006Љ\u0007Љ\b<\u0000\t<\u0000\n<\u0000\f<\u0000\rЉ\u000eм\u0000\u000fм\u0000", new Object[]{"b", "a", C14223bg.class, C14630t.class, C14329fe.class, C14288dr.class, C45240c.f118157a, "d", "e", C14266cw.class, C14628r.class, C14346fv.class, C14541na.class, C10662f.f35572a, C14307ej.class, C14322ey.class});
            case 3:
                return new C14278dh();
            case 4:
                return new C14276df();
            case 5:
                return f43183g;
            case 6:
                C63010eb ebVar = f43184i;
                if (ebVar == null) {
                    synchronized (C14278dh.class) {
                        ebVar = f43184i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43183g);
                            f43184i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
