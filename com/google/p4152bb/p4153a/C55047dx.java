package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.dx */
/* compiled from: PG */
public final class C55047dx extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C55047dx f144820j;

    /* renamed from: k */
    public static final C62940bt f144821k;

    /* renamed from: m */
    private static volatile C63010eb f144822m;

    /* renamed from: a */
    public int f144823a;

    /* renamed from: b */
    public C62971cq f144824b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f144825c = emptyProtobufList();

    /* renamed from: d */
    public int f144826d;

    /* renamed from: e */
    public boolean f144827e;

    /* renamed from: f */
    public boolean f144828f;

    /* renamed from: g */
    public String f144829g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f144830h = emptyProtobufList();

    /* renamed from: i */
    public String f144831i = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f144832l = 2;

    static {
        C55047dx dxVar = new C55047dx();
        f144820j = dxVar;
        C62942bv.registerDefaultInstance(C55047dx.class, dxVar);
        f144821k = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, dxVar, dxVar, (C62958ce) null, 70736605, C63066gd.MESSAGE, C55047dx.class);
    }

    private C55047dx() {
    }

    /* renamed from: a */
    public final void mo54176a() {
        C62971cq cqVar = this.f144824b;
        if (!cqVar.mo58948c()) {
            this.f144824b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144832l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144832l = b;
                return null;
            case 2:
                return newMessageInfo(f144820j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u001b\u0002င\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006\u001b\u0007\u001b\bဈ\u0004", new Object[]{"a", "b", C55038do.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, C55042ds.class, C19618h.f54585a, C55040dq.class, "i"});
            case 3:
                return new C55047dx();
            case 4:
                return new C55036dm();
            case 5:
                return f144820j;
            case 6:
                C63010eb ebVar = f144822m;
                if (ebVar == null) {
                    synchronized (C55047dx.class) {
                        ebVar = f144822m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144820j);
                            f144822m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
