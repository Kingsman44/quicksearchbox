package com.google.android.apps.gsa.search.shared.actions;

import android.content.Context;
import android.databinding.C0118a;
import android.os.Parcel;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public abstract class AbstractVoiceAction implements VoiceAction {

    /* renamed from: f */
    private static final C59071e f235983f = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.AbstractVoiceAction");

    /* renamed from: g */
    private static final C58528ij f235984g = C58528ij.m90014N(4, 72, 13, 14, 50);

    /* renamed from: a */
    public ActionExecutionState f235985a;

    /* renamed from: b */
    public MatchingProviderInfo f235986b;

    /* renamed from: c */
    public int f235987c;

    /* renamed from: d */
    public String f235988d;

    /* renamed from: e */
    public String f235989e;

    protected AbstractVoiceAction() {
        this.f235985a = new ActionExecutionState();
    }

    protected AbstractVoiceAction(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.f235985a = (ActionExecutionState) parcel.readParcelable(classLoader);
        this.f235986b = (MatchingProviderInfo) parcel.readParcelable(classLoader);
        this.f235988d = parcel.readString();
        this.f235989e = parcel.readString();
    }

    /* renamed from: A */
    public final boolean mo81051A() {
        return this.f235985a.mo81122j();
    }

    /* renamed from: B */
    public final boolean mo81052B() {
        return this.f235985a.mo81115e() || this.f235985a.mo81117f() || this.f235985a.mo81123k() || this.f235985a.mo81113c();
    }

    /* renamed from: C */
    public final boolean mo81053C() {
        return this.f235985a.mo81123k();
    }

    /* renamed from: D */
    public final boolean mo81054D() {
        C55361pn d;
        Object obj;
        MatchingProviderInfo f = mo81065f();
        if (f == null || (d = f.mo81433d()) == null) {
            return false;
        }
        C62940bt r1 = C62942bv.checkIsLite(C55355ph.f145853f);
        d.mo58887l(r1);
        if (!d.f169962ag.mo58857o(r1.f169971d)) {
            return false;
        }
        C62940bt r12 = C62942bv.checkIsLite(C55355ph.f145853f);
        d.mo58887l(r12);
        Object l = d.f169962ag.mo58854l(r12.f169971d);
        if (l == null) {
            obj = r12.f169969b;
        } else {
            obj = r12.mo58889c(l);
        }
        return ((C55355ph) obj).f145858d;
    }

    /* renamed from: E */
    public final boolean mo81055E() {
        C0118a.m96d(f235983f.mo56224b(), "Action canceled", 9530, C58979ad.FULL);
        return this.f235985a.mo81125m((byte) 4);
    }

    /* renamed from: F */
    public final boolean mo81056F() {
        return this.f235985a.mo81124l();
    }

    /* renamed from: G */
    public final void mo81057G() {
        this.f235985a.mo81126n();
    }

    /* renamed from: H */
    public final void mo81058H() {
        this.f235985a.f236004a = 2;
    }

    /* renamed from: I */
    public final void mo81059I() {
        ActionExecutionState actionExecutionState = this.f235985a;
        boolean z = true;
        if (!actionExecutionState.mo81121i() && !actionExecutionState.mo81118g()) {
            z = false;
        }
        actionExecutionState.f236005b = z;
        actionExecutionState.mo81125m((byte) 5);
    }

    /* renamed from: J */
    public final void mo81060J(int i) {
        this.f235987c = i;
        this.f235985a.f236004a = 1;
    }

    /* renamed from: K */
    public final void mo81061K() {
        ActionExecutionState actionExecutionState = this.f235985a;
        actionExecutionState.f236005b = true;
        actionExecutionState.mo81125m((byte) 3);
    }

    /* renamed from: c */
    public ActionExecutionState mo81062c() {
        return this.f235985a;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C87456t mo81064e() {
        return null;
    }

    /* renamed from: f */
    public MatchingProviderInfo mo81065f() {
        return this.f235986b;
    }

    /* renamed from: g */
    public C55421x mo81066g() {
        return C55421x.UNKNOWN_ACTION_TYPE;
    }

    /* renamed from: gS */
    public void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        fVar.mo85288o("execution state", this.f235985a);
    }

    /* renamed from: ht */
    public final int mo81067ht() {
        return this.f235987c;
    }

    /* renamed from: hu */
    public View mo81068hu(Context context) {
        return null;
    }

    /* renamed from: hv */
    public final String mo81069hv() {
        return this.f235988d;
    }

    /* renamed from: hw */
    public final String mo81070hw() {
        return this.f235989e;
    }

    /* renamed from: hx */
    public final void mo81071hx(int i, Long l, CardDecision cardDecision, C55421x xVar) {
        Integer valueOf = (!f235984g.contains(Integer.valueOf(i)) || !cardDecision.f236255i) ? null : Integer.valueOf((int) cardDecision.f236257k);
        int i2 = 0;
        if (i == 4) {
            MatchingProviderInfo f = mo81065f();
            if (f != null) {
                if (f.mo81435e()) {
                    i = 4;
                    i2 = 1;
                } else if (f.f236270h.f236312a.size() == 1) {
                    i = 4;
                    i2 = 2;
                } else if (f.f236270h.mo81484i()) {
                    i2 = 3;
                } else {
                    i = 4;
                    i2 = 4;
                }
            }
            i = 4;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a = 2 | ufVar.f164093a;
        ufVar.f164258m = i;
        int i3 = xVar.f146230cP;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 256;
        ufVar2.f164264s = i3;
        if (l != null) {
            String b = C39191a.m68623b(l.longValue());
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar3.f164093a |= 4;
            ufVar3.f164259n = b;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164146b |= 128;
            ufVar4.f164071E = intValue;
        }
        if (i2 != 0) {
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164074H = i2 - 1;
            ufVar5.f164146b |= 1024;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: hy */
    public final void mo81072hy() {
        this.f235985a.f236004a = 3;
    }

    /* renamed from: j */
    public void mo81073j(C89933d dVar) {
    }

    /* renamed from: m */
    public final void mo81074m(String str) {
        this.f235988d = str;
    }

    /* renamed from: n */
    public final void mo81075n(String str) {
        this.f235989e = str;
    }

    /* renamed from: o */
    public void mo81076o(MatchingProviderInfo matchingProviderInfo) {
        this.f235986b = matchingProviderInfo;
    }

    /* renamed from: p */
    public final boolean mo81077p() {
        MatchingProviderInfo f = mo81065f();
        if (mo81052B() || this.f235985a.mo81119h()) {
            return false;
        }
        if (f == null || !f.mo81435e()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo81078q(VoiceAction voiceAction) {
        return voiceAction != null && voiceAction.getClass() == getClass() && (mo81082u() || voiceAction.mo81066g() == mo81066g());
    }

    /* renamed from: r */
    public boolean mo81079r() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo81080s() {
        return this.f235985a.f236005b;
    }

    /* renamed from: t */
    public boolean mo81081t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo81082u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo81083v() {
        return this.f235985a.mo81115e();
    }

    /* renamed from: w */
    public final boolean mo81084w() {
        return this.f235985a.mo81117f();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f235985a, i);
        parcel.writeParcelable(this.f235986b, i);
        parcel.writeString(this.f235988d);
        parcel.writeString(this.f235989e);
    }

    /* renamed from: x */
    public final boolean mo81086x() {
        return this.f235985a.mo81118g();
    }

    /* renamed from: y */
    public final boolean mo81087y() {
        return this.f235985a.mo81119h();
    }

    /* renamed from: z */
    public final boolean mo81088z() {
        return this.f235985a.mo81121i();
    }
}
