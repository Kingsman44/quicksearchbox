package p211b.p212a.p213a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;

/* renamed from: b.a.a.b */
/* compiled from: PG */
public final class C4647b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C4647b f14568g;

    /* renamed from: h */
    public static final C62940bt f14569h;

    /* renamed from: i */
    private static volatile C63010eb f14570i;

    /* renamed from: a */
    public int f14571a;

    /* renamed from: b */
    public String f14572b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C4659f f14573c;

    /* renamed from: d */
    public C4665l f14574d;

    /* renamed from: e */
    public int f14575e = 1;

    /* renamed from: f */
    public boolean f14576f;

    static {
        C4647b bVar = new C4647b();
        f14568g = bVar;
        C62942bv.registerDefaultInstance(C4647b.class, bVar);
        f14569h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194529996, C63066gd.MESSAGE, C4647b.class);
    }

    private C4647b() {
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
                return newMessageInfo(f14568g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0005ဉ\u0003\u0006ဌ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C4648c.f14577a, C10662f.f35572a});
            case 3:
                return new C4647b();
            case 4:
                return new C4646a();
            case 5:
                return f14568g;
            case 6:
                C63010eb ebVar = f14570i;
                if (ebVar == null) {
                    synchronized (C4647b.class) {
                        ebVar = f14570i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14568g);
                            f14570i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
