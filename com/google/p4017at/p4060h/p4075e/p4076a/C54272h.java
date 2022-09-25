package com.google.p4017at.p4060h.p4075e.p4076a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.e.a.h */
/* compiled from: PG */
public final class C54272h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54272h f142512f;

    /* renamed from: h */
    private static volatile C63010eb f142513h;

    /* renamed from: a */
    public int f142514a;

    /* renamed from: b */
    public C62971cq f142515b = emptyProtobufList();

    /* renamed from: c */
    public C54271g f142516c;

    /* renamed from: d */
    public boolean f142517d;

    /* renamed from: e */
    public String f142518e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f142519g = 2;

    static {
        C54272h hVar = new C54272h();
        f142512f = hVar;
        C62942bv.registerDefaultInstance(C54272h.class, hVar);
    }

    private C54272h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142519g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142519g = b;
                return null;
            case 2:
                return newMessageInfo(f142512f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0002\u0002Л\u0003ᐉ\u0000\u0004ဇ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C54269e.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C54272h();
            case 4:
                return new C54267c();
            case 5:
                return f142512f;
            case 6:
                C63010eb ebVar = f142513h;
                if (ebVar == null) {
                    synchronized (C54272h.class) {
                        ebVar = f142513h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142512f);
                            f142513h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
