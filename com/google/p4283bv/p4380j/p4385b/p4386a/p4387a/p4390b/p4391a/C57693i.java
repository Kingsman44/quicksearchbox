package com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60204do;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.protos.youtube.elements.C66198dl;

/* renamed from: com.google.bv.j.b.a.a.b.a.i */
/* compiled from: PG */
public final class C57693i extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C57693i f154080k;

    /* renamed from: l */
    public static final C62940bt f154081l;

    /* renamed from: n */
    private static volatile C63010eb f154082n;

    /* renamed from: a */
    public int f154083a;

    /* renamed from: b */
    public int f154084b = -1;

    /* renamed from: c */
    public int f154085c;

    /* renamed from: d */
    public C63204j f154086d;

    /* renamed from: e */
    public int f154087e;

    /* renamed from: f */
    public int f154088f;

    /* renamed from: g */
    public String f154089g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f154090h = -1;

    /* renamed from: i */
    public C60204do f154091i;

    /* renamed from: j */
    public C62995dn f154092j = C62995dn.f170057a;

    /* renamed from: m */
    private byte f154093m = 2;

    static {
        C57693i iVar = new C57693i();
        f154080k = iVar;
        C62942bv.registerDefaultInstance(C57693i.class, iVar);
        f154081l = C62942bv.newSingularGeneratedExtension(C66198dl.f180008b, iVar, iVar, (C62958ce) null, 270923820, C63066gd.MESSAGE, C57693i.class);
    }

    private C57693i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154093m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154093m = b;
                return null;
            case 2:
                return newMessageInfo(f154080k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0001\u0000\u0002\u0001င\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဈ\u0005\u0006င\u0006\bᐉ\u0007\nဌ\u0004\u000b2", new Object[]{"a", "b", C45240c.f118157a, C57691g.f154079a, "d", "e", C57686b.f154076a, C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a, C57689e.f154078a, "j", C57688d.f154077a});
            case 3:
                return new C57693i();
            case 4:
                return new C57685a();
            case 5:
                return f154080k;
            case 6:
                C63010eb ebVar = f154082n;
                if (ebVar == null) {
                    synchronized (C57693i.class) {
                        ebVar = f154082n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154080k);
                            f154082n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
