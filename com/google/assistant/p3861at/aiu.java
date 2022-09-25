package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aiu */
/* compiled from: PG */
public final class aiu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aiu f129431f;

    /* renamed from: h */
    private static volatile C63010eb f129432h;

    /* renamed from: a */
    public int f129433a;

    /* renamed from: b */
    public int f129434b = 0;

    /* renamed from: c */
    public Object f129435c;

    /* renamed from: d */
    public ahd f129436d;

    /* renamed from: e */
    public C62961ch f129437e = emptyIntList();

    /* renamed from: g */
    private byte f129438g = 2;

    static {
        aiu aiu = new aiu();
        f129431f = aiu;
        C62942bv.registerDefaultInstance(aiu.class, aiu);
    }

    private aiu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129438g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129438g = b;
                return null;
            case 2:
                return newMessageInfo(f129431f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ᐼ\u0000\u0002ᐉ\u0002\u0004\u001e\u0005ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C45632al.class, "d", "e", air.m85752b(), ait.class});
            case 3:
                return new aiu();
            case 4:
                return new aip();
            case 5:
                return f129431f;
            case 6:
                C63010eb ebVar = f129432h;
                if (ebVar == null) {
                    synchronized (aiu.class) {
                        ebVar = f129432h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129431f);
                            f129432h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
