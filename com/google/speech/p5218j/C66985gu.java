package com.google.speech.p5218j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gu */
/* compiled from: PG */
public final class C66985gu extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C66985gu f182075h;

    /* renamed from: j */
    private static volatile C63010eb f182076j;

    /* renamed from: a */
    public int f182077a;

    /* renamed from: b */
    public boolean f182078b;

    /* renamed from: c */
    public C62971cq f182079c = emptyProtobufList();

    /* renamed from: d */
    public int f182080d = 1200;

    /* renamed from: e */
    public C66969ge f182081e;

    /* renamed from: f */
    public C66979go f182082f;

    /* renamed from: g */
    public boolean f182083g = true;

    /* renamed from: i */
    private byte f182084i = 2;

    static {
        C66985gu guVar = new C66985gu();
        f182075h = guVar;
        C62942bv.registerDefaultInstance(C66985gu.class, guVar);
    }

    private C66985gu() {
    }

    /* renamed from: a */
    public final void mo59759a() {
        C62971cq cqVar = this.f182079c;
        if (!cqVar.mo58948c()) {
            this.f182079c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182084i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182084i = b;
                return null;
            case 2:
                return newMessageInfo(f182075h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0004\u0006ဉ\n\tဇ\f", new Object[]{"a", "b", C45240c.f118157a, C66981gq.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C66985gu();
            case 4:
                return new C66984gt();
            case 5:
                return f182075h;
            case 6:
                C63010eb ebVar = f182076j;
                if (ebVar == null) {
                    synchronized (C66985gu.class) {
                        ebVar = f182076j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182075h);
                            f182076j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
