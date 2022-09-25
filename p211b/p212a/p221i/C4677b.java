package p211b.p212a.p221i;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;

/* renamed from: b.a.i.b */
/* compiled from: PG */
public final class C4677b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C4677b f14665h;

    /* renamed from: i */
    public static final C62940bt f14666i;

    /* renamed from: j */
    private static volatile C63010eb f14667j;

    /* renamed from: a */
    public int f14668a;

    /* renamed from: b */
    public C4665l f14669b;

    /* renamed from: c */
    public int f14670c;

    /* renamed from: d */
    public C62971cq f14671d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C4659f f14672e;

    /* renamed from: f */
    public float f14673f;

    /* renamed from: g */
    public boolean f14674g;

    static {
        C4677b bVar = new C4677b();
        f14665h = bVar;
        C62942bv.registerDefaultInstance(C4677b.class, bVar);
        f14666i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194755606, C63066gd.MESSAGE, C4677b.class);
    }

    private C4677b() {
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
                return newMessageInfo(f14665h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001a\u0004ဉ\u0002\u0005ခ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C4677b();
            case 4:
                return new C4676a();
            case 5:
                return f14665h;
            case 6:
                C63010eb ebVar = f14667j;
                if (ebVar == null) {
                    synchronized (C4677b.class) {
                        ebVar = f14667j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14665h);
                            f14667j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
