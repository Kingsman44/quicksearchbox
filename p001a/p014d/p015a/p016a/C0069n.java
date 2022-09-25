package p001a.p014d.p015a.p016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4887at.p4888a.p4889a.C63813p;

/* renamed from: a.d.a.a.n */
/* compiled from: PG */
public final class C0069n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f188d = new C0066k();

    /* renamed from: h */
    public static final C0069n f189h;

    /* renamed from: i */
    private static volatile C63010eb f190i;

    /* renamed from: a */
    public String f191a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f192b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62961ch f193c = emptyIntList();

    /* renamed from: e */
    public C63813p f194e;

    /* renamed from: f */
    public String f195f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f196g;

    static {
        C0069n nVar = new C0069n();
        f189h = nVar;
        C62942bv.registerDefaultInstance(C0069n.class, nVar);
    }

    private C0069n() {
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
                return newMessageInfo(f189h, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001Ȉ\u0002,\u0003\t\u0004Ȉ\u0005Ț\u0007\f", new Object[]{"a", C45240c.f118157a, "e", C10662f.f35572a, "b", C30325g.f82003a});
            case 3:
                return new C0069n();
            case 4:
                return new C0068m();
            case 5:
                return f189h;
            case 6:
                C63010eb ebVar = f190i;
                if (ebVar == null) {
                    synchronized (C0069n.class) {
                        ebVar = f190i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189h);
                            f190i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
