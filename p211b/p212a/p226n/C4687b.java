package p211b.p212a.p226n;

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

/* renamed from: b.a.n.b */
/* compiled from: PG */
public final class C4687b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C4687b f14716h;

    /* renamed from: i */
    public static final C62940bt f14717i;

    /* renamed from: j */
    private static volatile C63010eb f14718j;

    /* renamed from: a */
    public int f14719a;

    /* renamed from: b */
    public boolean f14720b;

    /* renamed from: c */
    public String f14721c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C4659f f14722d;

    /* renamed from: e */
    public float f14723e;

    /* renamed from: f */
    public C4665l f14724f;

    /* renamed from: g */
    public boolean f14725g;

    static {
        C4687b bVar = new C4687b();
        f14716h = bVar;
        C62942bv.registerDefaultInstance(C4687b.class, bVar);
        f14717i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194532246, C63066gd.MESSAGE, C4687b.class);
    }

    private C4687b() {
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
                return newMessageInfo(f14716h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C4687b();
            case 4:
                return new C4686a();
            case 5:
                return f14716h;
            case 6:
                C63010eb ebVar = f14718j;
                if (ebVar == null) {
                    synchronized (C4687b.class) {
                        ebVar = f14718j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14716h);
                            f14718j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
