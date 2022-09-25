package com.google.android.libraries.componentview.components.p1682a.p1683a;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.a.a.v */
/* compiled from: PG */
public final class C19777v extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C19777v f55255h;

    /* renamed from: i */
    public static final C62940bt f55256i;

    /* renamed from: k */
    private static volatile C63010eb f55257k;

    /* renamed from: a */
    public int f55258a;

    /* renamed from: b */
    public C62971cq f55259b = emptyProtobufList();

    /* renamed from: c */
    public C56425d f55260c;

    /* renamed from: d */
    public C56425d f55261d;

    /* renamed from: e */
    public String f55262e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f55263f;

    /* renamed from: g */
    public boolean f55264g;

    /* renamed from: j */
    private byte f55265j = 2;

    static {
        C19777v vVar = new C19777v();
        f55255h = vVar;
        C62942bv.registerDefaultInstance(C19777v.class, vVar);
        f55256i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, vVar, vVar, (C62958ce) null, 155442255, C63066gd.MESSAGE, C19777v.class);
    }

    private C19777v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55265j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55265j = b;
                return null;
            case 2:
                return newMessageInfo(f55255h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C19777v();
            case 4:
                return new C19776u();
            case 5:
                return f55255h;
            case 6:
                C63010eb ebVar = f55257k;
                if (ebVar == null) {
                    synchronized (C19777v.class) {
                        ebVar = f55257k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55255h);
                            f55257k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
