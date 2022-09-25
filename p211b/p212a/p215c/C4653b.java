package p211b.p212a.p215c;

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

/* renamed from: b.a.c.b */
/* compiled from: PG */
public final class C4653b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C4653b f14587h;

    /* renamed from: i */
    public static final C62940bt f14588i;

    /* renamed from: j */
    private static volatile C63010eb f14589j;

    /* renamed from: a */
    public int f14590a;

    /* renamed from: b */
    public C4665l f14591b;

    /* renamed from: c */
    public boolean f14592c;

    /* renamed from: d */
    public String f14593d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C4659f f14594e;

    /* renamed from: f */
    public float f14595f;

    /* renamed from: g */
    public boolean f14596g;

    static {
        C4653b bVar = new C4653b();
        f14587h = bVar;
        C62942bv.registerDefaultInstance(C4653b.class, bVar);
        f14588i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194769325, C63066gd.MESSAGE, C4653b.class);
    }

    private C4653b() {
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
                return newMessageInfo(f14587h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ခ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C4653b();
            case 4:
                return new C4652a();
            case 5:
                return f14587h;
            case 6:
                C63010eb ebVar = f14589j;
                if (ebVar == null) {
                    synchronized (C4653b.class) {
                        ebVar = f14589j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14587h);
                            f14589j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
