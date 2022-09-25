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

/* renamed from: com.google.speech.j.kg */
/* compiled from: PG */
public final class C67079kg extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C67079kg f182340h;

    /* renamed from: j */
    private static volatile C63010eb f182341j;

    /* renamed from: a */
    public int f182342a;

    /* renamed from: b */
    public C62971cq f182343b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public float f182344c;

    /* renamed from: d */
    public float f182345d;

    /* renamed from: e */
    public C67095kw f182346e;

    /* renamed from: f */
    public C67091ks f182347f;

    /* renamed from: g */
    public C67024if f182348g;

    /* renamed from: i */
    private byte f182349i = 2;

    static {
        C67079kg kgVar = new C67079kg();
        f182340h = kgVar;
        C62942bv.registerDefaultInstance(C67079kg.class, kgVar);
    }

    private C67079kg() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59769a() {
        C62971cq cqVar = this.f182343b;
        if (!cqVar.mo58948c()) {
            this.f182343b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182349i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182349i = b;
                return null;
            case 2:
                return newMessageInfo(f182340h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0000\u0001\u001a\u0002ခ\u0000\u0003ခ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u000bဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C67079kg();
            case 4:
                return new C67078kf();
            case 5:
                return f182340h;
            case 6:
                C63010eb ebVar = f182341j;
                if (ebVar == null) {
                    synchronized (C67079kg.class) {
                        ebVar = f182341j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182340h);
                            f182341j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
