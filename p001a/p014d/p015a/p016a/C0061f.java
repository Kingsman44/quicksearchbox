package p001a.p014d.p015a.p016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.f */
/* compiled from: PG */
public final class C0061f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C0061f f159h;

    /* renamed from: i */
    private static volatile C63010eb f160i;

    /* renamed from: a */
    public int f161a;

    /* renamed from: b */
    public String f162b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f163c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f164d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f165e = emptyProtobufList();

    /* renamed from: f */
    public C0065j f166f;

    /* renamed from: g */
    public C62971cq f167g = C62942bv.emptyProtobufList();

    static {
        C0061f fVar = new C0061f();
        f159h = fVar;
        C62942bv.registerDefaultInstance(C0061f.class, fVar);
    }

    private C0061f() {
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
                return newMessageInfo(f159h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003\b\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C0065j.class, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C0061f();
            case 4:
                return new C0060e();
            case 5:
                return f159h;
            case 6:
                C63010eb ebVar = f160i;
                if (ebVar == null) {
                    synchronized (C0061f.class) {
                        ebVar = f160i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159h);
                            f160i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
