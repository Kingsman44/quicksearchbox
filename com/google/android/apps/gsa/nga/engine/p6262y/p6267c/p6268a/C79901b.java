package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.b */
/* compiled from: PG */
public final class C79901b extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C79901b f219000n;

    /* renamed from: p */
    private static volatile C63010eb f219001p;

    /* renamed from: a */
    public int f219002a;

    /* renamed from: b */
    public C79885g f219003b;

    /* renamed from: c */
    public C79891m f219004c;

    /* renamed from: d */
    public float f219005d;

    /* renamed from: e */
    public boolean f219006e;

    /* renamed from: f */
    public String f219007f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public float f219008g;

    /* renamed from: h */
    public String f219009h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f219010i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f219011j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public float f219012k;

    /* renamed from: l */
    public boolean f219013l;

    /* renamed from: m */
    public float f219014m;

    /* renamed from: o */
    private byte f219015o = 2;

    static {
        C79901b bVar = new C79901b();
        f219000n = bVar;
        C62942bv.registerDefaultInstance(C79901b.class, bVar);
    }

    private C79901b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219015o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219015o = b;
                return null;
            case 2:
                return newMessageInfo(f219000n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဈ\u0006\bဈ\u0007\tခ\t\nဇ\n\u000bခ\u000b\fဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "m", "j"});
            case 3:
                return new C79901b();
            case 4:
                return new C79900a();
            case 5:
                return f219000n;
            case 6:
                C63010eb ebVar = f219001p;
                if (ebVar == null) {
                    synchronized (C79901b.class) {
                        ebVar = f219001p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219000n);
                            f219001p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
