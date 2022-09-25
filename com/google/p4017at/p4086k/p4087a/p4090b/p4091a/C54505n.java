package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.n */
/* compiled from: PG */
public final class C54505n extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54505n f143114h;

    /* renamed from: j */
    private static volatile C63010eb f143115j;

    /* renamed from: a */
    public long f143116a;

    /* renamed from: b */
    public C54493b f143117b;

    /* renamed from: c */
    public C54510s f143118c;

    /* renamed from: d */
    public C54501j f143119d;

    /* renamed from: e */
    public boolean f143120e;

    /* renamed from: f */
    public C57784p f143121f;

    /* renamed from: g */
    public C54495d f143122g;

    /* renamed from: i */
    private byte f143123i = 2;

    static {
        C54505n nVar = new C54505n();
        f143114h = nVar;
        C62942bv.registerDefaultInstance(C54505n.class, nVar);
    }

    private C54505n() {
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143123i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143123i = b;
                return null;
            case 2:
                return newMessageInfo(f143114h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0002\u0001\u0003\u0002\t\u0003\t\u0005Љ\u0007\u0007\bЉ\t\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54505n();
            case 4:
                return new C54504m();
            case 5:
                return f143114h;
            case 6:
                C63010eb ebVar = f143115j;
                if (ebVar == null) {
                    synchronized (C54505n.class) {
                        ebVar = f143115j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143114h);
                            f143115j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
