package p5535j.p5536a.p5543b.p5544a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.a.l */
/* compiled from: PG */
public final class C70948l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C70948l f189170g;

    /* renamed from: h */
    private static volatile C63010eb f189171h;

    /* renamed from: a */
    public int f189172a;

    /* renamed from: b */
    public int f189173b;

    /* renamed from: c */
    public int f189174c;

    /* renamed from: d */
    public int f189175d;

    /* renamed from: e */
    public long f189176e;

    /* renamed from: f */
    public String f189177f = BuildConfig.FLAVOR;

    static {
        C70948l lVar = new C70948l();
        f189170g = lVar;
        C62942bv.registerDefaultInstance(C70948l.class, lVar);
    }

    private C70948l() {
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
                Object[] objArr = new Object[8];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C70947k.f189169a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = "d";
                objArr[6] = "e";
                objArr[7] = C10662f.f35572a;
                return newMessageInfo(f189170g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဈ\u0004", objArr);
            case 3:
                return new C70948l();
            case 4:
                return new C70946j();
            case 5:
                return f189170g;
            case 6:
                C63010eb ebVar = f189171h;
                if (ebVar == null) {
                    synchronized (C70948l.class) {
                        ebVar = f189171h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189170g);
                            f189171h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
