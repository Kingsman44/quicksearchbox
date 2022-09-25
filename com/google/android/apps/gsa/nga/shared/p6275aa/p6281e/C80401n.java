package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.n */
/* compiled from: PG */
public final class C80401n extends C62942bv implements C80402o {

    /* renamed from: k */
    public static final C80401n f220656k;

    /* renamed from: m */
    private static volatile C63010eb f220657m;

    /* renamed from: a */
    public C62971cq f220658a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f220659b = emptyProtobufList();

    /* renamed from: c */
    public C62961ch f220660c = emptyIntList();

    /* renamed from: d */
    public C62995dn f220661d = C62995dn.f170057a;

    /* renamed from: e */
    public C80391d f220662e;

    /* renamed from: f */
    public boolean f220663f;

    /* renamed from: g */
    public int f220664g;

    /* renamed from: h */
    public int f220665h;

    /* renamed from: i */
    public C65196fc f220666i;

    /* renamed from: j */
    public C80396i f220667j;

    /* renamed from: l */
    private byte f220668l = 2;

    static {
        C80401n nVar = new C80401n();
        f220656k = nVar;
        C62942bv.registerDefaultInstance(C80401n.class, nVar);
    }

    private C80401n() {
    }

    /* renamed from: a */
    public final int mo74309a() {
        return this.f220658a.size();
    }

    /* renamed from: b */
    public final int mo74310b() {
        return this.f220659b.size();
    }

    /* renamed from: c */
    public final int mo74311c() {
        return this.f220661d.size();
    }

    /* renamed from: d */
    public final C65196fc mo74312d() {
        C65196fc fcVar = this.f220666i;
        return fcVar == null ? C65196fc.f176453l : fcVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220668l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220668l = b;
                return null;
            case 2:
                return newMessageInfo(f220656k, "\u0000\n\u0000\u0000\u0001\f\n\u0001\u0003\u0004\u0001Л\u0003'\u0004в\u0005\t\u0006\u001b\u0007\u0007\b\f\nЉ\u000b\f\fЉ", new Object[]{"a", C80394g.class, C45240c.f118157a, "d", C80400m.f220655a, "e", "b", C52232kc.class, C10662f.f35572a, C30325g.f82003a, "i", C19618h.f54585a, "j"});
            case 3:
                return new C80401n();
            case 4:
                return new C80399l();
            case 5:
                return f220656k;
            case 6:
                C63010eb ebVar = f220657m;
                if (ebVar == null) {
                    synchronized (C80401n.class) {
                        ebVar = f220657m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220656k);
                            f220657m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final void mo74321e() {
        C62971cq cqVar = this.f220658a;
        if (!cqVar.mo58948c()) {
            this.f220658a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: f */
    public final void mo74322f() {
        C62971cq cqVar = this.f220659b;
        if (!cqVar.mo58948c()) {
            this.f220659b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: g */
    public final void mo74323g() {
        C62961ch chVar = this.f220660c;
        if (!chVar.mo58948c()) {
            this.f220660c = C62942bv.mutableCopy(chVar);
        }
    }
}
