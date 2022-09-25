package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93600cx;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55011co;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.p4152bb.p4153a.C55301nh;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public abstract class Argument implements Cloneable, Parcelable {

    /* renamed from: a */
    public final int f236140a;

    /* renamed from: b */
    public final C54944ab f236141b;

    /* renamed from: c */
    public final int f236142c;

    /* renamed from: d */
    public final Spanned f236143d;

    /* renamed from: e */
    public ModularAction f236144e;

    /* renamed from: f */
    public C55136he f236145f;

    /* renamed from: g */
    public List f236146g = Collections.emptyList();

    /* renamed from: h */
    public boolean f236147h = false;

    /* renamed from: i */
    private final String f236148i;

    /* renamed from: j */
    private List f236149j = new ArrayList();

    /* renamed from: k */
    private List f236150k;

    protected Argument(int i, C54944ab abVar) {
        this.f236140a = i;
        this.f236141b = abVar;
        this.f236142c = 0;
        this.f236145f = null;
        this.f236148i = null;
        this.f236143d = null;
    }

    /* renamed from: A */
    public static boolean m141690A(Argument argument, Argument argument2) {
        if (argument != null && argument2 != null) {
            return argument.mo81259hA(argument2);
        }
        return (argument == null) == (argument2 == null);
    }

    /* renamed from: B */
    public boolean mo81262B() {
        return false;
    }

    /* renamed from: C */
    public abstract boolean mo81263C();

    /* renamed from: D */
    public boolean mo81264D() {
        return mo81263C() && mo81275j() == 0;
    }

    /* renamed from: E */
    public boolean mo81265E() {
        return false;
    }

    /* renamed from: F */
    public boolean mo81266F(C55005ci ciVar) {
        if (ciVar == null) {
            return true;
        }
        C62940bt r0 = C62942bv.checkIsLite(C55011co.f144731b);
        ciVar.mo58887l(r0);
        return ciVar.f169962ag.mo58857o(r0.f169971d);
    }

    /* renamed from: G */
    public boolean mo81267G(C93600cx cxVar) {
        return true;
    }

    /* renamed from: H */
    public C55213ka mo81268H(boolean z) {
        return mo81279n();
    }

    /* renamed from: I */
    public List mo81269I(C55215kc kcVar) {
        Object obj;
        if (mo81263C()) {
            return null;
        }
        C62940bt r0 = C62942bv.checkIsLite(C55301nh.f145684c);
        kcVar.mo58887l(r0);
        if (!kcVar.f169962ag.mo58857o(r0.f169971d)) {
            return null;
        }
        C62940bt r02 = C62942bv.checkIsLite(C55301nh.f145684c);
        kcVar.mo58887l(r02);
        Object l = kcVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return ((C55301nh) obj).f145686a;
    }

    /* renamed from: J */
    public final void mo81270J(C87439c cVar) {
        if (!this.f236149j.contains(cVar)) {
            this.f236149j.add(cVar);
            this.f236150k = null;
        }
    }

    /* renamed from: K */
    public final void mo81271K(C87439c cVar) {
        if (this.f236149j.remove(cVar)) {
            this.f236150k = null;
        }
    }

    /* renamed from: L */
    public void mo81272L() {
        throw null;
    }

    /* renamed from: c */
    public abstract C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources);

    public final /* synthetic */ Object clone() {
        return mo81278m(this.f236140a);
    }

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hA */
    public boolean mo81259hA(Argument argument) {
        return C58832aw.m90831a(this.f236143d, argument.f236143d);
    }

    /* renamed from: hB */
    public abstract boolean mo81260hB();

    /* renamed from: j */
    public int mo81275j() {
        return 0;
    }

    /* renamed from: k */
    public int mo81276k() {
        throw new UnsupportedOperationException("The argument can't be processed by ArgumentProcessorsFactory and thus doesn't support this function");
    }

    /* renamed from: l */
    public int mo81277l() {
        return this.f236142c;
    }

    /* renamed from: m */
    public abstract Argument mo81278m(int i);

    /* renamed from: n */
    public C55213ka mo81279n() {
        C55211jz jzVar = (C55211jz) C55213ka.f145356g.createBuilder();
        int i = this.f236140a;
        jzVar.copyOnWrite();
        C55213ka kaVar = (C55213ka) jzVar.instance;
        kaVar.f145358a |= 1;
        kaVar.f145359b = i;
        int i2 = this.f236141b.f144530R;
        jzVar.copyOnWrite();
        C55213ka kaVar2 = (C55213ka) jzVar.instance;
        kaVar2.f145358a |= 16;
        kaVar2.f145362e = i2;
        int i3 = this.f236142c;
        jzVar.copyOnWrite();
        C55213ka kaVar3 = (C55213ka) jzVar.instance;
        kaVar3.f145358a |= 32;
        kaVar3.f145363f = i3;
        C55136he heVar = this.f236145f;
        if (heVar != null) {
            jzVar.copyOnWrite();
            C55213ka kaVar4 = (C55213ka) jzVar.instance;
            kaVar4.f145361d = heVar;
            kaVar4.f145358a |= 4;
        }
        if (!TextUtils.isEmpty(this.f236148i)) {
            String str = this.f236148i;
            jzVar.copyOnWrite();
            C55213ka kaVar5 = (C55213ka) jzVar.instance;
            str.getClass();
            kaVar5.f145358a |= 2;
            kaVar5.f145360c = str;
        }
        return (C55213ka) jzVar.build();
    }

    /* renamed from: o */
    public C55365pr mo81280o() {
        throw new UnsupportedOperationException("The argument can't be processed by ArgumentProcessorsFactory and thus doesn't support this function");
    }

    /* renamed from: p */
    public abstract Object mo81281p(C87440d dVar);

    /* renamed from: q */
    public String mo81282q() {
        return null;
    }

    /* renamed from: r */
    public List mo81283r() {
        return C58485gu.m89845m();
    }

    /* renamed from: s */
    public List mo81284s() {
        return C58485gu.m89845m();
    }

    /* renamed from: t */
    public final List mo81285t() {
        if (this.f236150k == null) {
            this.f236150k = C58597ky.m90211b(this.f236149j);
        }
        return this.f236150k;
    }

    /* renamed from: u */
    public void mo81286u(C89933d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo81287v() {
        for (C87439c a : mo81285t()) {
            a.mo81346a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo81288w() {
        for (C87439c c : mo81285t()) {
            c.mo81352c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo81289x() {
        for (C87439c d : mo81285t()) {
            d.mo81353d();
        }
    }

    /* renamed from: y */
    public void mo81290y(ModularAction modularAction) {
        this.f236144e = modularAction;
        this.f236146g = new ArrayList();
        for (C55005ci ciVar : this.f236144e.mo81219Z().f145707q) {
            if ((ciVar.f144716a & 1) != 0 && ciVar.f144717b == this.f236140a) {
                this.f236146g.add(ciVar);
            }
        }
    }

    /* renamed from: z */
    public boolean mo81291z() {
        return false;
    }

    protected Argument(Argument argument, int i) {
        this.f236140a = i;
        this.f236141b = argument.f236141b;
        this.f236142c = argument.f236142c;
        this.f236145f = argument.f236145f;
        this.f236148i = argument.f236148i;
        this.f236143d = argument.f236143d;
    }

    protected Argument(C55213ka kaVar) {
        this.f236140a = kaVar.f145359b;
        this.f236141b = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(kaVar.f145362e)).mo56109e(C54944ab.UNKNOWN);
        this.f236142c = kaVar.f145363f;
        int i = kaVar.f145358a;
        if ((i & 4) != 0) {
            C55136he heVar = kaVar.f145361d;
            this.f236145f = heVar == null ? C55136he.f145130j : heVar;
            this.f236148i = null;
            this.f236143d = null;
        } else if ((i & 2) != 0) {
            this.f236145f = null;
            String str = kaVar.f145360c;
            this.f236148i = str;
            this.f236143d = Html.fromHtml(str);
        } else {
            this.f236145f = null;
            this.f236143d = null;
            this.f236148i = null;
        }
    }
}
