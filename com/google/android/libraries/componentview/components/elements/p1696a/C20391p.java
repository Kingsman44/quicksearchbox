package com.google.android.libraries.componentview.components.elements.p1696a;

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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.p */
/* compiled from: PG */
public final class C20391p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C20391p f57342g;

    /* renamed from: h */
    public static final C62940bt f57343h;

    /* renamed from: j */
    private static volatile C63010eb f57344j;

    /* renamed from: a */
    public int f57345a;

    /* renamed from: b */
    public C56425d f57346b;

    /* renamed from: c */
    public String f57347c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f57348d;

    /* renamed from: e */
    public String f57349e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f57350f;

    /* renamed from: i */
    private byte f57351i = 2;

    static {
        C20391p pVar = new C20391p();
        f57342g = pVar;
        C62942bv.registerDefaultInstance(C20391p.class, pVar);
        f57343h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, pVar, pVar, (C62958ce) null, 115683933, C63066gd.MESSAGE, C20391p.class);
    }

    private C20391p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57351i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57351i = b;
                return null;
            case 2:
                return newMessageInfo(f57342g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005ဈ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C20391p();
            case 4:
                return new C20390o();
            case 5:
                return f57342g;
            case 6:
                C63010eb ebVar = f57344j;
                if (ebVar == null) {
                    synchronized (C20391p.class) {
                        ebVar = f57344j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57342g);
                            f57344j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
