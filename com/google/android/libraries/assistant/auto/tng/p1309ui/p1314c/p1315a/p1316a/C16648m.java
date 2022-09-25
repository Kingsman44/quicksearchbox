package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m */
/* compiled from: PG */
public final class C16648m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16648m f48760f;

    /* renamed from: h */
    private static volatile C63010eb f48761h;

    /* renamed from: a */
    public int f48762a;

    /* renamed from: b */
    public String f48763b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C16654s f48764c;

    /* renamed from: d */
    public C16654s f48765d;

    /* renamed from: e */
    public C62971cq f48766e = emptyProtobufList();

    /* renamed from: g */
    private byte f48767g = 2;

    static {
        C16648m mVar = new C16648m();
        f48760f = mVar;
        C62942bv.registerDefaultInstance(C16648m.class, mVar);
    }

    private C16648m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48767g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48767g = b;
                return null;
            case 2:
                return newMessageInfo(f48760f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0003ဉ\u0002\u0004Л\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "e", C16644i.class, "d"});
            case 3:
                return new C16648m();
            case 4:
                return new C16647l();
            case 5:
                return f48760f;
            case 6:
                C63010eb ebVar = f48761h;
                if (ebVar == null) {
                    synchronized (C16648m.class) {
                        ebVar = f48761h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48760f);
                            f48761h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
