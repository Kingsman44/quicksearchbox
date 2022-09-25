package p211b.p212a.p224l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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

/* renamed from: b.a.l.b */
/* compiled from: PG */
public final class C4683b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C4683b f14690h;

    /* renamed from: i */
    public static final C62940bt f14691i;

    /* renamed from: j */
    private static volatile C63010eb f14692j;

    /* renamed from: a */
    public int f14693a;

    /* renamed from: b */
    public C4665l f14694b;

    /* renamed from: c */
    public int f14695c;

    /* renamed from: d */
    public String f14696d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C4659f f14697e;

    /* renamed from: f */
    public float f14698f;

    /* renamed from: g */
    public boolean f14699g;

    static {
        C4683b bVar = new C4683b();
        f14690h = bVar;
        C62942bv.registerDefaultInstance(C4683b.class, bVar);
        f14691i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194752972, C63066gd.MESSAGE, C4683b.class);
    }

    private C4683b() {
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
                return newMessageInfo(f14690h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ခ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C4683b();
            case 4:
                return new C4682a();
            case 5:
                return f14690h;
            case 6:
                C63010eb ebVar = f14692j;
                if (ebVar == null) {
                    synchronized (C4683b.class) {
                        ebVar = f14692j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14690h);
                            f14692j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
