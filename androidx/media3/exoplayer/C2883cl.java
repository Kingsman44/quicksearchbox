package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2863f;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3066bd;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.cl */
/* compiled from: PG */
final class C2883cl implements C3066bd, C2863f {

    /* renamed from: a */
    final /* synthetic */ C2887cp f8139a;

    /* renamed from: b */
    private final C2885cn f8140b;

    /* renamed from: c */
    private C3065bc f8141c;

    /* renamed from: d */
    private C2862e f8142d;

    public C2883cl(C2887cp cpVar, C2885cn cnVar) {
        this.f8139a = cpVar;
        this.f8141c = cpVar.f8155e;
        this.f8142d = cpVar.f8156f;
        this.f8140b = cnVar;
    }

    /* renamed from: g */
    private final boolean m8021g(int i, C3036as asVar) {
        C3036as asVar2 = null;
        if (asVar != null) {
            C2885cn cnVar = this.f8140b;
            int i2 = 0;
            while (true) {
                if (i2 >= cnVar.f8148c.size()) {
                    break;
                } else if (((C3036as) cnVar.f8148c.get(i2)).f7207d == asVar.f7207d) {
                    asVar2 = asVar.mo6972b(Pair.create(cnVar.f8147b, asVar.f7204a));
                    break;
                } else {
                    i2++;
                }
            }
            if (asVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.f8140b.f8149d;
        C3065bc bcVar = this.f8141c;
        if (bcVar.f8907a != i3 || !C2612ak.m6951aa(bcVar.f8908b, asVar2)) {
            this.f8141c = this.f8139a.f8155e.mo7002a(i3, asVar2, 0);
        }
        C2862e eVar = this.f8142d;
        if (eVar.f8044a == i3 && C2612ak.m6951aa(eVar.f8045b, asVar2)) {
            return true;
        }
        this.f8142d = this.f8139a.f8156f.mo6607a(i3, asVar2);
        return true;
    }

    /* renamed from: eO */
    public final void mo6405eO(int i, C3036as asVar, C3032ao aoVar) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7004c(aoVar);
        }
    }

    /* renamed from: eP */
    public final void mo6406eP(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7006e(ajVar, aoVar);
        }
    }

    /* renamed from: eQ */
    public final void mo6407eQ(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7008g(ajVar, aoVar);
        }
    }

    /* renamed from: eR */
    public final void mo6408eR(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7010i(ajVar, aoVar, iOException, z);
        }
    }

    /* renamed from: eS */
    public final void mo6409eS(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7012k(ajVar, aoVar);
        }
    }

    /* renamed from: eT */
    public final void mo6410eT(int i, C3036as asVar, C3032ao aoVar) {
        if (m8021g(i, asVar)) {
            this.f8141c.mo7014m(aoVar);
        }
    }
}
