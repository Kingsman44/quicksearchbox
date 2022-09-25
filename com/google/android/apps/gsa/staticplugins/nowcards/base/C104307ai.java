package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91663b;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91668g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.p489g.p494d.C9159av;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9271o;
import com.google.android.apps.p489g.p494d.C9272p;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9275s;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58832aw;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7518af;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7834lr;
import com.google.p375ai.p378b.C8140x;
import com.google.protobuf.C62962ci;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ai */
/* compiled from: PG */
public abstract class C104307ai implements C91671j {

    /* renamed from: a */
    public static final C58839bc f290129a = C104305ag.f290127a;

    /* renamed from: i */
    private static final C59071e f290130i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.ai");

    /* renamed from: b */
    protected final CardRenderingContext f290131b;

    /* renamed from: c */
    protected volatile C7718hj f290132c;

    /* renamed from: d */
    public final ArrayList f290133d = new ArrayList();

    /* renamed from: e */
    int f290134e = -1;

    /* renamed from: f */
    public boolean f290135f;

    /* renamed from: g */
    public final C104308aj f290136g;

    /* renamed from: h */
    protected boolean f290137h = true;

    /* renamed from: j */
    private final Bundle f290138j = new Bundle();

    /* renamed from: k */
    private volatile C91667f f290139k;

    /* renamed from: l */
    private final C7718hj[] f290140l;

    /* renamed from: m */
    private C104306ah f290141m;

    /* renamed from: n */
    private int f290142n;

    /* renamed from: o */
    private final ArrayList f290143o = new ArrayList();

    /* renamed from: p */
    private C91671j f290144p;

    protected C104307ai(C7718hj hjVar, CardRenderingContext cardRenderingContext, C104308aj ajVar) {
        hjVar.getClass();
        this.f290132c = hjVar;
        this.f290140l = null;
        cardRenderingContext.getClass();
        this.f290131b = cardRenderingContext;
        this.f290136g = ajVar;
    }

    /* renamed from: E */
    public static long m172339E(C9278v vVar) {
        int hashCode;
        if ((vVar.f32192a & C89885b.NOW_VALUE) != 0) {
            C9159av avVar = vVar.f32217x;
            if (avVar == null) {
                avVar = C9159av.f31613g;
            }
            long[] jArr = new long[avVar.f31616b.size()];
            int i = 0;
            while (true) {
                C9159av avVar2 = vVar.f32217x;
                if (avVar2 == null) {
                    avVar2 = C9159av.f31613g;
                }
                if (i >= avVar2.f31616b.size()) {
                    break;
                }
                C9159av avVar3 = vVar.f32217x;
                if (avVar3 == null) {
                    avVar3 = C9159av.f31613g;
                }
                C7718hj hjVar = ((C9278v) avVar3.f31616b.get(i)).f32174H;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                jArr[i] = C91994m.m150995b(hjVar);
                i++;
            }
            hashCode = Arrays.hashCode(jArr);
        } else {
            hashCode = vVar.hashCode();
        }
        return (long) hashCode;
    }

    /* renamed from: G */
    public static void m172340G(List list, Object obj) {
        if (obj != null) {
            list.add(obj);
        }
    }

    /* renamed from: K */
    protected static final C7834lr m172341K(C7718hj hjVar) {
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 2) {
            if ((hjVar.f26955a & 1048576) == 0) {
                return null;
            }
            C7834lr lrVar = hjVar.f26984y;
            return lrVar == null ? C7834lr.f27467c : lrVar;
        } else if ((hjVar.f26955a & C89885b.S3REQUEST_VALUE) == 0) {
            return null;
        } else {
            C7834lr lrVar2 = hjVar.f26981v;
            return lrVar2 == null ? C7834lr.f27467c : lrVar2;
        }
    }

    /* renamed from: iV */
    private static void m172342iV(List list, int i, C7718hj hjVar) {
        C9278v vVar;
        int a;
        int i2 = i + 1;
        C9278v vVar2 = i2 < list.size() ? (C9278v) list.get(i2) : null;
        C9273q qVar = (C9273q) ((C9278v) list.get(i)).toBuilder();
        if ((((C9278v) qVar.instance).f32195b & 64) == 0) {
            qVar.copyOnWrite();
            C9278v vVar3 = (C9278v) qVar.instance;
            vVar3.f32195b |= 64;
            vVar3.f32181O = true;
        }
        if (vVar2 != null) {
            int i3 = vVar2.f32192a;
            if ((i3 & 33554432) != 0) {
                int i4 = vVar2.f32168B;
                qVar.copyOnWrite();
                C9278v vVar4 = (C9278v) qVar.instance;
                vVar4.f32192a = 33554432 | vVar4.f32192a;
                vVar4.f32168B = i4;
            } else if ((i3 & 16777216) != 0) {
                int i5 = vVar2.f32167A;
                qVar.copyOnWrite();
                C9278v vVar5 = (C9278v) qVar.instance;
                vVar5.f32192a = 16777216 | vVar5.f32192a;
                vVar5.f32167A = i5;
            }
        }
        if (hjVar.f26932D.size() > 0) {
            C9271o oVar = (C9271o) C9272p.f32079d.createBuilder();
            oVar.mo17464a(hjVar.f26932D);
            C8140x xVar = hjVar.f26931C;
            if (xVar == null) {
                xVar = C8140x.f28619f;
            }
            oVar.copyOnWrite();
            C9272p pVar = (C9272p) oVar.instance;
            xVar.getClass();
            pVar.f32083c = xVar;
            pVar.f32081a |= 1;
            qVar.copyOnWrite();
            C9278v vVar6 = (C9278v) qVar.instance;
            C9272p pVar2 = (C9272p) oVar.build();
            pVar2.getClass();
            vVar6.f32189W = pVar2;
            vVar6.f32195b |= 65536;
        }
        C9278v vVar7 = (C9278v) qVar.build();
        list.set(i, vVar7);
        if (vVar2 != null) {
            C7518af afVar = vVar7.f32219z;
            if (afVar == null) {
                afVar = C7518af.f26025j;
            }
            if ((afVar.f26027a & 1) == 0 || !vVar7.f32181O || !((vVar2.f32195b & 8) == 0 || (a = C9275s.m23704a(vVar2.f32178L)) == 0 || a != 3)) {
                C9273q qVar2 = (C9273q) vVar2.toBuilder();
                qVar2.copyOnWrite();
                C9278v vVar8 = (C9278v) qVar2.instance;
                vVar7.getClass();
                vVar8.f32182P = vVar7;
                vVar8.f32195b |= 128;
                vVar = (C9278v) qVar2.build();
            } else {
                C9273q qVar3 = (C9273q) vVar2.toBuilder();
                qVar3.copyOnWrite();
                C9278v vVar9 = (C9278v) qVar3.instance;
                vVar7.getClass();
                vVar9.f32182P = vVar7;
                vVar9.f32195b |= 128;
                qVar3.copyOnWrite();
                C9278v vVar10 = (C9278v) qVar3.instance;
                vVar10.f32178L = 1;
                vVar10.f32195b |= 8;
                vVar = (C9278v) qVar3.build();
            }
            list.set(i2, vVar);
        }
    }

    /* renamed from: F */
    public C9270n mo94045F(Context context) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo94046H(Context context, C9278v vVar, int i) {
        if ((vVar.f32192a & LinearLayoutManager.INVALID_OFFSET) == 0) {
            C9273q qVar = (C9273q) vVar.toBuilder();
            C7718hj hjVar = this.f290132c;
            qVar.copyOnWrite();
            C9278v vVar2 = (C9278v) qVar.instance;
            hjVar.getClass();
            vVar2.f32174H = hjVar;
            vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
            vVar = (C9278v) qVar.build();
        }
        C104336bk bkVar = this.f290136g.f290145a;
        C9277u a = C9277u.m23705a(vVar.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        C104348l b = bkVar.mo94096b(context, a);
        if (b != null) {
            boolean z = i >= this.f290133d.size();
            if (z) {
                this.f290133d.add(b);
            } else {
                this.f290133d.set(i, b);
            }
            b.mo86091a(this, vVar);
            if (vVar.f32175I) {
                C91901c cVar = this.f290136g.f290151g;
                if (vVar.f32174H == null) {
                    C62962ci ciVar = C7718hj.f26926ac;
                }
            }
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: I */
    public final boolean mo94047I() {
        return this.f290138j.getBoolean("QpCardViewAdapter.Expanded", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo94048J() {
        return false;
    }

    /* renamed from: a */
    public abstract C9270n mo94024a(Context context);

    /* renamed from: b */
    public C7718hj mo94031b() {
        C7718hj[] hjVarArr = this.f290140l;
        if (hjVarArr == null || hjVarArr.length != 1) {
            return null;
        }
        return hjVarArr[0];
    }

    /* renamed from: c */
    public final C1970e mo86081c() {
        if (this.f290140l == null) {
            return null;
        }
        return new C1970e(this.f290132c, this.f290140l);
    }

    /* renamed from: d */
    public C91663b mo86082d(C7718hj hjVar) {
        if (C58832aw.m90831a(this.f290132c, hjVar)) {
            return C91663b.m149981c(0);
        }
        ((C59052c) ((C59052c) f290130i.mo56226d()).mo56372aa(21935)).mo56354G("Invalid Entry provided to getCardIndexForEntry(): %s, not %s", this.f290132c, hjVar);
        return C91663b.f255651a;
    }

    /* renamed from: e */
    public final C91667f mo86083e() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [com.google.android.apps.gsa.staticplugins.nowcards.f.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo86084f(android.content.Context r13) {
        /*
            r12 = this;
            boolean r0 = r12.f290137h
            r1 = 0
            if (r0 == 0) goto L_0x007b
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r0 = r12.f290144p
            if (r0 != 0) goto L_0x0071
            com.google.ai.b.hj r3 = r12.f290132c
            boolean r0 = r12.mo94048J()
            if (r0 == 0) goto L_0x001a
            int r0 = r3.f26955a
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = r1
            goto L_0x006f
        L_0x001a:
            androidx.core.i.e r0 = r12.mo86081c()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r0.f5888a
            if (r2 == 0) goto L_0x0045
            r5 = r2
            com.google.ai.b.hj r5 = (com.google.p375ai.p378b.C7718hj) r5
            int r2 = r5.f26955a
            r4 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0045
            com.google.android.apps.gsa.staticplugins.nowcards.base.aj r11 = r12.f290136g
            com.google.android.apps.gsa.staticplugins.nowcards.g.af r2 = r11.f290149e
            java.lang.Object r0 = r0.f5889b
            r6 = r0
            com.google.ai.b.hj[] r6 = (com.google.p375ai.p378b.C7718hj[]) r6
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r7 = r12.f290131b
            com.google.android.apps.gsa.staticplugins.nowcards.g.ak r0 = new com.google.android.apps.gsa.staticplugins.nowcards.g.ak
            com.google.android.apps.gsa.staticplugins.nowcards.i.f r9 = r2.f292326a
            com.google.android.apps.gsa.shared.au.b.a r8 = r2.f292327b
            r10 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x006f
        L_0x0045:
            int r0 = r3.f26955a
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0058
            com.google.android.apps.gsa.staticplugins.nowcards.base.aj r0 = r12.f290136g
            com.google.android.apps.gsa.staticplugins.nowcards.f.e r2 = r0.f290150f
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r12.f290131b
            com.google.android.apps.gsa.staticplugins.nowcards.f.g r4 = new com.google.android.apps.gsa.staticplugins.nowcards.f.g
            r4.<init>(r3, r2, r0)
            r0 = r4
            goto L_0x006f
        L_0x0058:
            com.google.ai.b.lr r4 = m172341K(r3)
            if (r4 == 0) goto L_0x0018
            com.google.android.apps.gsa.staticplugins.nowcards.base.aj r8 = r12.f290136g
            com.google.android.apps.gsa.staticplugins.nowcards.g.ag r0 = r8.f290148d
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r5 = r12.f290131b
            com.google.android.apps.gsa.staticplugins.nowcards.g.ak r9 = new com.google.android.apps.gsa.staticplugins.nowcards.g.ak
            com.google.android.apps.gsa.staticplugins.nowcards.i.f r6 = r0.f292329b
            com.google.android.apps.gsa.shared.au.b.a r7 = r0.f292328a
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = r9
        L_0x006f:
            r12.f290144p = r0
        L_0x0071:
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r0 = r12.f290144p
            if (r0 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            com.google.android.apps.g.d.n r13 = r0.mo86084f(r13)
            return r13
        L_0x007b:
            com.google.ai.b.hj r0 = r12.f290132c
            int r0 = r0.f26985z
            int r0 = com.google.p375ai.p378b.C7713he.m22812a(r0)
            if (r0 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            r2 = 2
            if (r0 != r2) goto L_0x008e
            com.google.android.apps.g.d.n r0 = r12.mo94045F(r13)
            goto L_0x0092
        L_0x008e:
            com.google.android.apps.g.d.n r0 = r12.mo94024a(r13)
        L_0x0092:
            if (r0 != 0) goto L_0x0095
            return r1
        L_0x0095:
            java.util.ArrayList r1 = new java.util.ArrayList
            com.google.protobuf.cq r2 = r0.f32075b
            r1.<init>(r2)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00ec
            r2 = 0
            r3 = 0
        L_0x00a4:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x00c1
            java.lang.Object r4 = r1.get(r3)
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r4 = r4.f32196c
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r4)
            if (r4 != 0) goto L_0x00ba
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x00ba:
            com.google.android.apps.g.d.u r5 = com.google.android.apps.p489g.p494d.C9277u.CAP_MODULE
            if (r4 == r5) goto L_0x00c2
            int r3 = r3 + 1
            goto L_0x00a4
        L_0x00c1:
            r3 = -1
        L_0x00c2:
            if (r3 >= 0) goto L_0x00d1
            com.google.android.apps.g.d.v r13 = r12.mo94010u(r13)
            if (r13 != 0) goto L_0x00cb
            goto L_0x00ec
        L_0x00cb:
            r12.f290134e = r2
            r1.add(r2, r13)
            goto L_0x00d3
        L_0x00d1:
            r12.f290134e = r3
        L_0x00d3:
            androidx.core.i.e r13 = r12.mo86081c()
            if (r13 == 0) goto L_0x00e5
            java.lang.Object r13 = r13.f5888a
            if (r13 == 0) goto L_0x00e5
            int r2 = r12.f290134e
            com.google.ai.b.hj r13 = (com.google.p375ai.p378b.C7718hj) r13
            m172342iV(r1, r2, r13)
            goto L_0x00ec
        L_0x00e5:
            int r13 = r12.f290134e
            com.google.ai.b.hj r2 = com.google.p375ai.p378b.C7718hj.f26927af
            m172342iV(r1, r13, r2)
        L_0x00ec:
            com.google.protobuf.bn r13 = r0.toBuilder()
            com.google.android.apps.g.d.m r13 = (com.google.android.apps.p489g.p494d.C9269m) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.g.d.n r0 = (com.google.android.apps.p489g.p494d.C9270n) r0
            com.google.protobuf.cq r2 = com.google.android.apps.p489g.p494d.C9270n.emptyProtobufList()
            r0.f32075b = r2
            r13.mo17460a(r1)
            com.google.protobuf.bv r13 = r13.build()
            com.google.android.apps.g.d.n r13 = (com.google.android.apps.p489g.p494d.C9270n) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104307ai.mo86084f(android.content.Context):com.google.android.apps.g.d.n");
    }

    /* renamed from: g */
    public final C7718hj mo86085g() {
        return this.f290132c;
    }

    /* renamed from: h */
    public void mo86086h(C7718hj hjVar) {
        this.f290132c = hjVar;
        C91671j jVar = this.f290144p;
        if (jVar != null) {
            jVar.mo86086h(hjVar);
        }
    }

    /* renamed from: i */
    public final void mo86087i(boolean z) {
        this.f290135f = z;
    }

    /* renamed from: j */
    public final void mo86088j(int i) {
    }

    /* renamed from: k */
    public final void mo86089k(C91738a aVar) {
        C7718hj b = mo94031b();
        if (b == null) {
            b = this.f290132c;
        }
        aVar.mo86233a(b, false);
    }

    /* renamed from: l */
    public final void mo86090l(C7718hj hjVar, C7718hj hjVar2) {
        this.f290143o.clear();
        C7718hj[] hjVarArr = this.f290140l;
        if (hjVarArr != null) {
            int length = hjVarArr.length;
            do {
                length--;
                if (length < 0) {
                    return;
                }
            } while (!C58832aw.m90831a(this.f290140l[length], hjVar));
            this.f290140l[length] = hjVar2;
        }
    }

    /* renamed from: m */
    public final int mo86098m() {
        return this.f290142n;
    }

    /* renamed from: n */
    public final int mo86099n() {
        return this.f290133d.size();
    }

    /* renamed from: o */
    public final int mo86100o(C91668g gVar) {
        return this.f290133d.indexOf(gVar);
    }

    public final void onViewAttachedToWindow(View view) {
        ArrayList arrayList = this.f290133d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!((C104348l) arrayList.get(i)).f290310e.f32177K) {
                i = i2;
            } else {
                this.f290141m = new C104306ah(this);
                this.f290136g.f290147c.mo26881h(this.f290141m);
                return;
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C104306ah ahVar = this.f290141m;
        if (ahVar != null) {
            this.f290136g.f290147c.mo26883j(ahVar);
            this.f290141m = null;
        }
    }

    /* renamed from: p */
    public ViewGroup mo86101p() {
        return null;
    }

    /* renamed from: q */
    public final void mo86102q(C91668g gVar) {
        this.f290133d.remove(gVar);
    }

    /* renamed from: r */
    public final void mo86103r(boolean z) {
        this.f290138j.putBoolean("QpCardViewAdapter.Expanded", z);
    }

    /* renamed from: s */
    public final void mo86104s(int i) {
        this.f290142n = i;
        ArrayList arrayList = this.f290133d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C104348l) arrayList.get(i2)).mo94102A(true);
        }
    }

    /* renamed from: t */
    public final void mo86105t(List list) {
        new ArrayList(list);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C9278v mo94010u(Context context) {
        C7718hj hjVar = this.f290132c;
        if ((hjVar.f26955a & 524288) == 0) {
            return null;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.CAP_MODULE;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        C7518af afVar = hjVar.f26983x;
        if (afVar == null) {
            afVar = C7518af.f26025j;
        }
        if ((afVar.f26027a & 16) != 0) {
            C7518af afVar2 = hjVar.f26983x;
            if (afVar2 == null) {
                afVar2 = C7518af.f26025j;
            }
            int i = afVar2.f26033g;
            qVar.copyOnWrite();
            C9278v vVar2 = (C9278v) qVar.instance;
            vVar2.f32192a |= 33554432;
            vVar2.f32168B = i;
        }
        C7518af afVar3 = hjVar.f26983x;
        if (afVar3 == null) {
            afVar3 = C7518af.f26025j;
        }
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        afVar3.getClass();
        vVar3.f32219z = afVar3;
        vVar3.f32192a |= 8388608;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar4.f32174H = hjVar;
        vVar4.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        C9271o oVar = (C9271o) C9272p.f32079d.createBuilder();
        oVar.mo17464a(hjVar.f26932D);
        C8140x xVar = hjVar.f26931C;
        if (xVar == null) {
            xVar = C8140x.f28619f;
        }
        oVar.copyOnWrite();
        C9272p pVar = (C9272p) oVar.instance;
        xVar.getClass();
        pVar.f32083c = xVar;
        pVar.f32081a |= 1;
        qVar.copyOnWrite();
        C9278v vVar5 = (C9278v) qVar.instance;
        C9272p pVar2 = (C9272p) oVar.build();
        pVar2.getClass();
        vVar5.f32189W = pVar2;
        vVar5.f32195b |= 65536;
        return (C9278v) qVar.build();
    }

    protected C104307ai(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C104308aj ajVar) {
        hjVar.getClass();
        this.f290132c = hjVar;
        this.f290140l = hjVarArr;
        cardRenderingContext.getClass();
        this.f290131b = cardRenderingContext;
        this.f290136g = ajVar;
    }
}
