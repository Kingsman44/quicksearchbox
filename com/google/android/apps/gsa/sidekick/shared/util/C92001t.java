package com.google.android.apps.gsa.sidekick.shared.util;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7668fn;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8144xd;
import com.google.p375ai.p378b.C8150xj;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.t */
/* compiled from: PG */
public final class C92001t extends C91954ae implements C90991b {

    /* renamed from: a */
    private final List f256500a = new ArrayList(1);

    /* renamed from: b */
    private LinkedList f256501b = new LinkedList();

    /* renamed from: c */
    private final long f256502c;

    /* renamed from: d */
    private C92000s f256503d = new C92000s();

    public C92001t(long j) {
        this.f256502c = j;
    }

    /* renamed from: e */
    public static C92005x m151012e(C7718hj hjVar) {
        C92004w wVar = (C92004w) C92005x.f256507g.createBuilder();
        C7669fo foVar = hjVar.f26968i;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        wVar.copyOnWrite();
        C92005x xVar = (C92005x) wVar.instance;
        foVar.getClass();
        xVar.f256510b = foVar;
        int i = 1;
        xVar.f256509a |= 1;
        int a = C8144xd.m22956a(hjVar.f26929A);
        if (a == 0) {
            a = 1;
        }
        wVar.copyOnWrite();
        C92005x xVar2 = (C92005x) wVar.instance;
        xVar2.f256511c = a - 1;
        xVar2.f256509a |= 2;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        wVar.copyOnWrite();
        C92005x xVar3 = (C92005x) wVar.instance;
        xVar3.f256512d = a2.f27108J;
        xVar3.f256509a |= 4;
        String a3 = C91984c.m150952a(hjVar);
        if (!TextUtils.isEmpty(a3)) {
            wVar.copyOnWrite();
            C92005x xVar4 = (C92005x) wVar.instance;
            a3.getClass();
            xVar4.f256509a |= 8;
            xVar4.f256514f = a3;
        }
        if ((hjVar.f26955a & 1073741824) != 0) {
            C7874nd ndVar = hjVar.f26938J;
            if (ndVar == null) {
                ndVar = C7874nd.f27577J;
            }
            C91950aa aaVar = (C91950aa) C91951ab.f256440h.createBuilder();
            if ((ndVar.f27589a & 512) != 0) {
                C8150xj xjVar = ndVar.f27600l;
                if (xjVar == null) {
                    xjVar = C8150xj.f28657d;
                }
                String str = xjVar.f28660b;
                aaVar.copyOnWrite();
                C91951ab abVar = (C91951ab) aaVar.instance;
                str.getClass();
                abVar.f256442a |= 1;
                abVar.f256443b = str;
            }
            if ((ndVar.f27589a & 128) != 0) {
                C8150xj xjVar2 = ndVar.f27597i;
                if (xjVar2 == null) {
                    xjVar2 = C8150xj.f28657d;
                }
                String str2 = xjVar2.f28660b;
                aaVar.copyOnWrite();
                C91951ab abVar2 = (C91951ab) aaVar.instance;
                str2.getClass();
                abVar2.f256442a |= 2;
                abVar2.f256444c = str2;
            }
            if ((ndVar.f27589a & 268435456) != 0) {
                int a4 = C56992b.m88249a(ndVar.f27580B);
                if (a4 != 0) {
                    i = a4;
                }
                aaVar.copyOnWrite();
                C91951ab abVar3 = (C91951ab) aaVar.instance;
                abVar3.f256442a |= 4;
                abVar3.f256445d = i - 1;
            }
            if ((ndVar.f27589a & 8388608) != 0) {
                C7669fo foVar2 = ndVar.f27612x;
                if (foVar2 == null) {
                    foVar2 = C7669fo.f26633e;
                }
                String str3 = foVar2.f26636b;
                aaVar.copyOnWrite();
                C91951ab abVar4 = (C91951ab) aaVar.instance;
                str3.getClass();
                abVar4.f256442a |= 8;
                abVar4.f256446e = str3;
                C7669fo foVar3 = ndVar.f27612x;
                if (foVar3 == null) {
                    foVar3 = C7669fo.f26633e;
                }
                long j = foVar3.f26638d;
                aaVar.copyOnWrite();
                C91951ab abVar5 = (C91951ab) aaVar.instance;
                abVar5.f256442a |= 16;
                abVar5.f256447f = j;
            }
            if ((ndVar.f27589a & 8) != 0) {
                long j2 = ndVar.f27594f;
                aaVar.copyOnWrite();
                C91951ab abVar6 = (C91951ab) aaVar.instance;
                abVar6.f256442a |= 32;
                abVar6.f256448g = j2;
            }
            C91951ab abVar7 = (C91951ab) aaVar.build();
            wVar.copyOnWrite();
            C92005x xVar5 = (C92005x) wVar.instance;
            abVar7.getClass();
            C62971cq cqVar = xVar5.f256513e;
            if (!cqVar.mo58948c()) {
                xVar5.f256513e = C62942bv.mutableCopy(cqVar);
            }
            xVar5.f256513e.add(abVar7);
        }
        return (C92005x) wVar.build();
    }

    /* renamed from: f */
    public static StringBuilder m151013f(C7669fo foVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("{d:");
        sb.append(foVar.f26636b);
        sb.append(" id:");
        sb.append(foVar.f26638d);
        sb.append(" t:");
        C7668fn a = C7668fn.m22799a(foVar.f26637c);
        if (a == null) {
            a = C7668fn.TYPE_UNDEFINED;
        }
        sb.append(a.name());
        sb.append("}");
        return sb;
    }

    /* renamed from: g */
    public static List m151014g(List list, C58817ah ahVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object apply : list) {
            arrayList.add(m151012e((C7718hj) ahVar.apply(apply)));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static void m151015h(C91006f fVar, String str, C92005x xVar) {
        StringBuilder sb;
        if (xVar == null) {
            fVar.mo85280d(str, 0);
            return;
        }
        StringBuilder sb2 = new StringBuilder("cid");
        if ((xVar.f256509a & 1) != 0) {
            C7669fo foVar = xVar.f256510b;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            sb = m151013f(foVar);
        } else {
            sb = new StringBuilder();
            sb.append(":");
            sb.append(true != TextUtils.isEmpty((CharSequence) null) ? null : "(EMPTY)");
        }
        sb2.append(sb);
        sb2.append(" tab:");
        int a = C8144xd.m22956a(xVar.f256511c);
        sb2.append((a == 0 || a == 1) ? "UNKNOWN_TAB" : a != 2 ? a != 3 ? a != 4 ? a != 5 ? a != 9 ? "null" : "MAX_TAB_VALUE" : "RECENTS_TAB" : "ASSISTANT_HQ_TAB" : "UPDATES_TAB" : "INTERESTS_TAB");
        if ((xVar.f256509a & 4) != 0) {
            sb2.append(" type:");
            C7746ik a2 = C7746ik.m22834a(xVar.f256512d);
            if (a2 == null) {
                a2 = C7746ik.UNKNOWN;
            }
            sb2.append(a2.name());
        }
        fVar.mo85280d(str, 0).mo85276a(C90752i.m148229c(sb2.toString()));
        if (!xVar.f256514f.isEmpty()) {
            fVar.mo85285l(new C91998q(xVar));
        }
        for (C91951ab abVar : xVar.f256513e) {
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85279c("*n");
            if ((abVar.f256442a & 1) != 0) {
                e.mo85279c("title").mo85276a(C90752i.m148233g(abVar.f256443b));
            }
            if ((abVar.f256442a & 2) != 0) {
                e.mo85279c("text").mo85276a(C90752i.m148233g(abVar.f256444c));
            }
            if ((abVar.f256442a & 4) != 0) {
                e.mo85279c("channel").mo85276a(C90752i.m148230d(Integer.valueOf(abVar.f256445d)));
            }
            if ((abVar.f256442a & 32) != 0) {
                e.mo85279c("expiration_s").mo85276a(C90752i.m148230d(Long.valueOf(abVar.f256448g)));
            }
            int i = abVar.f256442a;
            if ((i & 8) != 0 || (i & 16) != 0) {
                e.mo85279c("cid").mo85276a(C90752i.m148229c("{d:" + abVar.f256446e + " id:" + abVar.f256447f + "}"));
            }
        }
    }

    /* renamed from: n */
    private final void m151016n(C91006f fVar, C92007z zVar) {
        C92005x xVar;
        C92005x xVar2;
        if ((zVar.f256517a & 4) != 0) {
            fVar.mo85279c("sessionToken").mo85276a(C90752i.m148229c(zVar.f256522f));
        }
        C91999r a = C91999r.m151010a(zVar);
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            String str = a.f256494f;
            C92005x xVar3 = zVar.f256520d;
            if (xVar3 == null) {
                xVar3 = C92005x.f256507g;
            }
            m151015h(fVar, str, xVar3);
        } else if (ordinal == 1) {
            String str2 = a.f256494f;
            C92005x xVar4 = zVar.f256519c;
            if (xVar4 == null) {
                xVar4 = C92005x.f256507g;
            }
            m151015h(fVar, str2, xVar4);
        } else if (ordinal == 2) {
            m151015h(fVar, a.f256494f, (C92005x) zVar.f256518b.get(0));
        } else if (ordinal == 3) {
            m151015h(fVar, a.f256494f, (C92005x) null);
        } else if (ordinal == 4) {
            m151015h(fVar, a.f256494f, (C92005x) null);
            C91006f e = fVar.mo85281e((Object) null);
            String str3 = C91999r.Cluster.f256494f;
            if ((2 & zVar.f256517a) != 0) {
                xVar = zVar.f256520d;
                if (xVar == null) {
                    xVar = C92005x.f256507g;
                }
            } else {
                xVar = null;
            }
            m151015h(e, str3, xVar);
            C91006f e2 = fVar.mo85281e((Object) null);
            String str4 = C91999r.Group.f256494f;
            if ((1 & zVar.f256517a) != 0) {
                xVar2 = zVar.f256519c;
                if (xVar2 == null) {
                    xVar2 = C92005x.f256507g;
                }
            } else {
                xVar2 = null;
            }
            m151015h(e2, str4, xVar2);
        }
        if (zVar.f256521e.size() > 0) {
            C91006f e3 = fVar.mo85281e((Object) null);
            for (C92007z n : zVar.f256521e) {
                m151016n(e3, n);
            }
        }
        if (C91999r.SingleEntry != a && zVar.f256518b.size() > 0) {
            for (C92005x h : zVar.f256518b) {
                m151015h(fVar.mo85281e((Object) null), "e", h);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        C92000s sVar = this.f256503d;
        sVar.f256495a.add(m151012e(hjVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85912b(C7718hj hjVar, C7726hr hrVar) {
        this.f256503d.f256497c = C58833ax.m90834k(m151012e(hjVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo85913d(C7718hj hjVar) {
        this.f256503d.f256498d = C58833ax.m90834k(m151012e(hjVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryTreeMetadata");
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(this.f256502c)));
        if (this.f256500a.isEmpty()) {
            fVar.mo85292s(C90752i.m148229c("NO or ONLY NULL trees processed"));
            return;
        }
        for (C92007z n : this.f256500a) {
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85291r("root");
            m151016n(e, n);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hV */
    public final void mo85802hV(C7726hr hrVar) {
        this.f256501b.push(this.f256503d);
        this.f256503d = new C92000s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo86657i() {
        C92007z a = this.f256503d.mo86671a();
        C92000s sVar = (C92000s) this.f256501b.pop();
        this.f256503d = sVar;
        sVar.f256496b.add(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo86658j(C7744ii iiVar) {
        this.f256503d.f256499e = C58833ax.m90834k(C91955af.m150906c(iiVar));
        this.f256500a.add(this.f256503d.mo86671a());
        this.f256503d = new C92000s();
        this.f256501b = new LinkedList();
    }
}
