package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.yg */
/* compiled from: PG */
public final class C8174yg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f28718c = new C8170yc();

    /* renamed from: i */
    public static final C8174yg f28719i;

    /* renamed from: j */
    private static volatile C63010eb f28720j;

    /* renamed from: a */
    public int f28721a;

    /* renamed from: b */
    public C62961ch f28722b = emptyIntList();

    /* renamed from: d */
    public C62971cq f28723d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f28724e = emptyProtobufList();

    /* renamed from: f */
    public long f28725f;

    /* renamed from: g */
    public long f28726g;

    /* renamed from: h */
    public C63088z f28727h = C63088z.f170246b;

    static {
        C8174yg ygVar = new C8174yg();
        f28719i = ygVar;
        C62942bv.registerDefaultInstance(C8174yg.class, ygVar);
    }

    private C8174yg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f28719i, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0003\u0000\u0001\u001e\u0002\u001b\u0003ဂ\u0001\u0005\u001b\u0007ဂ\u0002\u000bည\u0003", new Object[]{"a", "b", C8173yf.m22963b(), "e", C7805kp.class, C10662f.f35572a, "d", C7677fw.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C8174yg();
            case 4:
                return new C8171yd();
            case 5:
                return f28719i;
            case 6:
                C63010eb ebVar = f28720j;
                if (ebVar == null) {
                    synchronized (C8174yg.class) {
                        ebVar = f28720j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28719i);
                            f28720j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
