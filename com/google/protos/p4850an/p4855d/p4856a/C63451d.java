package com.google.protos.p4850an.p4855d.p4856a;

import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;
import com.google.protos.p4850an.p4855d.p4864i.C63579b;

/* renamed from: com.google.protos.an.d.a.d */
/* compiled from: PG */
public final class C63451d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63451d f171474g;

    /* renamed from: h */
    public static final C62940bt f171475h;

    /* renamed from: m */
    private static volatile C63010eb f171476m;

    /* renamed from: a */
    public int f171477a;

    /* renamed from: b */
    public C62971cq f171478b = emptyProtobufList();

    /* renamed from: c */
    public C63442ab f171479c;

    /* renamed from: d */
    public boolean f171480d;

    /* renamed from: e */
    public C62971cq f171481e = emptyProtobufList();

    /* renamed from: f */
    public int f171482f;

    /* renamed from: i */
    private C61748j f171483i;

    /* renamed from: j */
    private C63579b f171484j;

    /* renamed from: k */
    private C63461n f171485k;

    /* renamed from: l */
    private byte f171486l = 2;

    static {
        C63451d dVar = new C63451d();
        f171474g = dVar;
        C62942bv.registerDefaultInstance(C63451d.class, dVar);
        f171475h = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, dVar, dVar, (C62958ce) null, 54126012, C63066gd.MESSAGE, C63451d.class);
    }

    private C63451d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171486l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171486l = b;
                return null;
            case 2:
                return newMessageInfo(f171474g, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0002\u0004\u0001Л\u0004ဉ\u0007\u0005ဇ\b\u0006\u001b\u000bဌ\u000e\rᐉ\u000f\u0010ᐉ\u0010\u0011ᐉ\u0000", new Object[]{"a", "b", C63446af.class, C45240c.f118157a, "d", "e", C63457j.class, C10662f.f35572a, C63449b.f171473a, "j", C19621k.f54601a, "i"});
            case 3:
                return new C63451d();
            case 4:
                return new C63440a();
            case 5:
                return f171474g;
            case 6:
                C63010eb ebVar = f171476m;
                if (ebVar == null) {
                    synchronized (C63451d.class) {
                        ebVar = f171476m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171474g);
                            f171476m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
