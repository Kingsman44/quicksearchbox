package com.google.protos.p4850an.p4854c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.protos.an.c.d */
/* compiled from: PG */
public final class C63415d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63415d f171377b;

    /* renamed from: c */
    public static final C62940bt f171378c;

    /* renamed from: h */
    private static volatile C63010eb f171379h;

    /* renamed from: a */
    public C63408ai f171380a;

    /* renamed from: d */
    private int f171381d;

    /* renamed from: e */
    private C63425n f171382e;

    /* renamed from: f */
    private C61752n f171383f;

    /* renamed from: g */
    private byte f171384g = 2;

    static {
        C63415d dVar = new C63415d();
        f171377b = dVar;
        C62942bv.registerDefaultInstance(C63415d.class, dVar);
        f171378c = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, dVar, dVar, (C62958ce) null, 50246186, C63066gd.MESSAGE, C63415d.class);
    }

    private C63415d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171384g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171384g = b;
                return null;
            case 2:
                return newMessageInfo(f171377b, "\u0001\u0003\u0000\u0001\u0001\u0013\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0007ᐉ\u0005\u0013ᐉ\t", new Object[]{"d", "a", "e", C10662f.f35572a});
            case 3:
                return new C63415d();
            case 4:
                return new C63414c();
            case 5:
                return f171377b;
            case 6:
                C63010eb ebVar = f171379h;
                if (ebVar == null) {
                    synchronized (C63415d.class) {
                        ebVar = f171379h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171377b);
                            f171379h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
