package p5535j.p5536a.p5543b.p5544a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.a.f */
/* compiled from: PG */
public final class C70942f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C70942f f189155g;

    /* renamed from: h */
    private static volatile C63010eb f189156h;

    /* renamed from: a */
    public int f189157a;

    /* renamed from: b */
    public int f189158b;

    /* renamed from: c */
    public int f189159c;

    /* renamed from: d */
    public float f189160d;

    /* renamed from: e */
    public int f189161e;

    /* renamed from: f */
    public int f189162f;

    static {
        C70942f fVar = new C70942f();
        f189155g = fVar;
        C62942bv.registerDefaultInstance(C70942f.class, fVar);
    }

    private C70942f() {
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
                return newMessageInfo(f189155g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C70940d.f189154a, C45240c.f118157a, C70938b.f189153a, "d", "e", C10662f.f35572a});
            case 3:
                return new C70942f();
            case 4:
                return new C70937a();
            case 5:
                return f189155g;
            case 6:
                C63010eb ebVar = f189156h;
                if (ebVar == null) {
                    synchronized (C70942f.class) {
                        ebVar = f189156h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189155g);
                            f189156h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
