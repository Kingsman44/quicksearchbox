package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jk */
/* compiled from: PG */
public final class C67056jk extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C67056jk f182276e;

    /* renamed from: h */
    private static volatile C63010eb f182277h;

    /* renamed from: a */
    public float f182278a;

    /* renamed from: b */
    public String f182279b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f182280c;

    /* renamed from: d */
    public int f182281d;

    /* renamed from: f */
    private int f182282f;

    /* renamed from: g */
    private byte f182283g = 2;

    static {
        C67056jk jkVar = new C67056jk();
        f182276e = jkVar;
        C62942bv.registerDefaultInstance(C67056jk.class, jkVar);
    }

    private C67056jk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182283g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182283g = b;
                return null;
            case 2:
                return newMessageInfo(f182276e, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ခ\u0001\u0004ဈ\u0003\u0006ဌ\u0005\u0007င\u0006", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, C67054ji.f182275a, "d"});
            case 3:
                return new C67056jk();
            case 4:
                return new C67053jh();
            case 5:
                return f182276e;
            case 6:
                C63010eb ebVar = f182277h;
                if (ebVar == null) {
                    synchronized (C67056jk.class) {
                        ebVar = f182277h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182276e);
                            f182277h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
