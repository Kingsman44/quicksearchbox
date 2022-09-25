package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.bh */
/* compiled from: PG */
public final class C71225bh extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C71225bh f190144g;

    /* renamed from: i */
    private static volatile C63010eb f190145i;

    /* renamed from: a */
    public int f190146a;

    /* renamed from: b */
    public C71222be f190147b;

    /* renamed from: c */
    public C71266cv f190148c;

    /* renamed from: d */
    public int f190149d;

    /* renamed from: e */
    public C71220bc f190150e;

    /* renamed from: f */
    public String f190151f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f190152h = 2;

    static {
        C71225bh bhVar = new C71225bh();
        f190144g = bhVar;
        C62942bv.registerDefaultInstance(C71225bh.class, bhVar);
    }

    private C71225bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190152h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190152h = b;
                return null;
            case 2:
                return newMessageInfo(f190144g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C71224bg.f190143a, "e", C10662f.f35572a});
            case 3:
                return new C71225bh();
            case 4:
                return new C71223bf();
            case 5:
                return f190144g;
            case 6:
                C63010eb ebVar = f190145i;
                if (ebVar == null) {
                    synchronized (C71225bh.class) {
                        ebVar = f190145i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190144g);
                            f190145i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
