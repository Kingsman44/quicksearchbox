package com.google.lens.p4698d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58124d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.f */
/* compiled from: PG */
public final class C62167f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62167f f167824h;

    /* renamed from: j */
    private static volatile C63010eb f167825j;

    /* renamed from: a */
    public int f167826a;

    /* renamed from: b */
    public long f167827b;

    /* renamed from: c */
    public float f167828c;

    /* renamed from: d */
    public int f167829d;

    /* renamed from: e */
    public C58124d f167830e;

    /* renamed from: f */
    public C62961ch f167831f = emptyIntList();

    /* renamed from: g */
    public float f167832g;

    /* renamed from: i */
    private byte f167833i = 2;

    static {
        C62167f fVar = new C62167f();
        f167824h = fVar;
        C62942bv.registerDefaultInstance(C62167f.class, fVar);
    }

    private C62167f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167833i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167833i = b;
                return null;
            case 2:
                return newMessageInfo(f167824h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဂ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005\u0016\u0006ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C62167f();
            case 4:
                return new C62166e();
            case 5:
                return f167824h;
            case 6:
                C63010eb ebVar = f167825j;
                if (ebVar == null) {
                    synchronized (C62167f.class) {
                        ebVar = f167825j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167824h);
                            f167825j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
