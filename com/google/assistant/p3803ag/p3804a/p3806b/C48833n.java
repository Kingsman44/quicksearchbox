package com.google.assistant.p3803ag.p3804a.p3806b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.assistant.p3897e.p3921j.abj;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.b.n */
/* compiled from: PG */
public final class C48833n extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C48833n f126350k;

    /* renamed from: l */
    public static final C62940bt f126351l;

    /* renamed from: m */
    public static final C62940bt f126352m;

    /* renamed from: o */
    private static volatile C63010eb f126353o;

    /* renamed from: a */
    public C48832m f126354a;

    /* renamed from: b */
    public C63042fg f126355b;

    /* renamed from: c */
    public C48822c f126356c;

    /* renamed from: d */
    public C62971cq f126357d = emptyProtobufList();

    /* renamed from: e */
    public C58072d f126358e;

    /* renamed from: f */
    public boolean f126359f;

    /* renamed from: g */
    public String f126360g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f126361h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C48828i f126362i;

    /* renamed from: j */
    public C48824e f126363j;

    /* renamed from: n */
    private int f126364n;

    static {
        C48833n nVar = new C48833n();
        f126350k = nVar;
        C62942bv.registerDefaultInstance(C48833n.class, nVar);
        C48833n nVar2 = nVar;
        C48833n nVar3 = nVar;
        f126351l = C62942bv.newSingularGeneratedExtension(C49118hc.f127034a, nVar2, nVar3, (C62958ce) null, 100, C63066gd.MESSAGE, C48833n.class);
        f126352m = C62942bv.newSingularGeneratedExtension(abj.f134724i, nVar2, nVar3, (C62958ce) null, 100, C63066gd.MESSAGE, C48833n.class);
    }

    private C48833n() {
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
                return newMessageInfo(f126350k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဈ\u0006\tဉ\u0007\nဉ\b", new Object[]{C48004n.f124238a, "a", "b", C45240c.f118157a, "d", C48832m.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C48833n();
            case 4:
                return new C48820a();
            case 5:
                return f126350k;
            case 6:
                C63010eb ebVar = f126353o;
                if (ebVar == null) {
                    synchronized (C48833n.class) {
                        ebVar = f126353o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126350k);
                            f126353o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
