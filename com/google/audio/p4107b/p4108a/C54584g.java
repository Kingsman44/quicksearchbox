package com.google.audio.p4107b.p4108a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.g */
/* compiled from: PG */
public final class C54584g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54584g f143307f;

    /* renamed from: g */
    private static volatile C63010eb f143308g;

    /* renamed from: a */
    public int f143309a;

    /* renamed from: b */
    public C62961ch f143310b = emptyIntList();

    /* renamed from: c */
    public String f143311c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f143312d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f143313e;

    static {
        C54584g gVar = new C54584g();
        f143307f = gVar;
        C62942bv.registerDefaultInstance(C54584g.class, gVar);
    }

    private C54584g() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f143307f, "\u0001\u0004\u0000\u0001\u0002\r\u0004\u0000\u0001\u0000\u0002\u001e\u0004ဈ\u0002\u0007ဈ\u0007\rဌ\b", new Object[]{"a", "b", C54587j.f143321a, C45240c.f118157a, "d", "e", C54583f.f143306a});
            case 3:
                return new C54584g();
            case 4:
                return new C54582e();
            case 5:
                return f143307f;
            case 6:
                C63010eb ebVar = f143308g;
                if (ebVar == null) {
                    synchronized (C54584g.class) {
                        ebVar = f143308g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143307f);
                            f143308g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
