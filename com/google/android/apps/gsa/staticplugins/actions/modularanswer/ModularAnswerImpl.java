package com.google.android.apps.gsa.staticplugins.actions.modularanswer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.actions.core.C87407f;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.modular.C87467f;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55313nt;
import com.google.p4152bb.p4153a.C55315nv;
import com.google.p4152bb.p4153a.C55317nx;
import com.google.p4152bb.p4153a.C55323oc;
import com.google.p4152bb.p4153a.C55324od;
import com.google.p4152bb.p4153a.C55330oj;
import com.google.p4152bb.p4153a.C55342ov;
import com.google.p4152bb.p4153a.C55344ox;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.p4152bb.p4153a.C55419v;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class ModularAnswerImpl extends ModularAnswer implements C87448l {
    public static final Parcelable.Creator CREATOR = new C93409c();

    /* renamed from: f */
    public static final C59071e f260514f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl");

    /* renamed from: l */
    private static final C58827ar f260515l = new C58827ar(" ");

    /* renamed from: g */
    public final List f260516g;

    /* renamed from: h */
    public final C58485gu f260517h;

    /* renamed from: i */
    public final int f260518i;

    /* renamed from: j */
    public C55324od f260519j;

    /* renamed from: k */
    public Result f260520k;

    /* renamed from: m */
    private final C55421x f260521m;

    /* renamed from: n */
    private C58485gu f260522n;

    public ModularAnswerImpl(Parcel parcel) {
        super(parcel);
        C55324od odVar = (C55324od) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55324od.f145745j.getParserForType());
        odVar.getClass();
        this.f260519j = odVar;
        this.f260516g = parcel.createTypedArrayList(ResultGroup.CREATOR);
        this.f260518i = parcel.readInt();
        this.f260517h = C58485gu.m89842j(ProtoLiteParcelable.m147137h(parcel, C55365pr.f145876l.getParserForType()));
        this.f260521m = C55421x.m87686a(parcel.readInt());
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81164i(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return true;
    }

    /* renamed from: N */
    public final C55324od mo81151N() {
        if (this.f260519j.f145749b.size() == 0 && !this.f260516g.isEmpty()) {
            C55323oc ocVar = (C55323oc) this.f260519j.toBuilder();
            for (ResultGroup resultGroup : this.f260516g) {
                for (Result b : resultGroup.f260547b) {
                    C55330oj b2 = b.mo87672b(false);
                    ocVar.copyOnWrite();
                    C55324od odVar = (C55324od) ocVar.instance;
                    b2.getClass();
                    C62971cq cqVar = odVar.f145749b;
                    if (!cqVar.mo58948c()) {
                        odVar.f145749b = C62942bv.mutableCopy(cqVar);
                    }
                    odVar.f145749b.add(b2);
                }
            }
            this.f260519j = (C55324od) ocVar.build();
        }
        return this.f260519j;
    }

    /* renamed from: O */
    public final Result mo87664O(int i) {
        for (ResultGroup resultGroup : this.f260516g) {
            Iterator it = resultGroup.f260547b.iterator();
            while (true) {
                if (it.hasNext()) {
                    Result result = (Result) it.next();
                    if (result.f260545e == i) {
                        return result;
                    }
                }
            }
        }
        ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13575)).mo56387q("Can't find result with id [%d]", i);
        return null;
    }

    /* renamed from: P */
    public final C55240la mo87665P() {
        if (this.f260519j.f145752e.size() <= 0 || ((C55305nl) this.f260519j.f145752e.get(0)).f145692b.size() <= 0) {
            return null;
        }
        return (C55240la) ((C55305nl) this.f260519j.f145752e.get(0)).f145692b.get(0);
    }

    /* renamed from: Q */
    public final C87467f mo81210Q() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: T */
    public final C87429c mo81213T(C87449m mVar, C55134hc hcVar, Context context) {
        C55317nx nxVar;
        Object obj;
        Object obj2;
        Object obj3;
        C58485gu guVar;
        int i = hcVar.f145122b;
        if (this.f260522n == null) {
            C55373pz pzVar = this.f260519j.f145750c;
            if (pzVar == null) {
                pzVar = C55373pz.f145913d;
            }
            Result O = mo87664O(pzVar.f145915a);
            if (O == null) {
                guVar = C58485gu.m89845m();
            } else {
                guVar = C58485gu.m89842j(O.mo87672b(true).f145773c);
            }
            this.f260522n = guVar;
        }
        C58485gu guVar2 = this.f260522n;
        int size = guVar2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13579)).mo56387q("Couldn't find specific information with info id [%d].", i);
                nxVar = null;
                break;
            }
            nxVar = (C55317nx) guVar2.get(i2);
            i2++;
            if (nxVar.f145734b == i) {
                break;
            }
        }
        if (nxVar == null) {
            ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13572)).mo56386p("Couldn't find target info");
            return C87429c.f236122a;
        }
        int i3 = hcVar.f145123c;
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 7) {
            C62940bt r9 = C62942bv.checkIsLite(C55315nv.f145727c);
            nxVar.mo58887l(r9);
            if (!nxVar.f169962ag.mo58857o(r9.f169971d)) {
                ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13570)).mo56387q("Couldn't find contact name with info id [%d]", i);
            } else {
                C62940bt r7 = C62942bv.checkIsLite(C55315nv.f145727c);
                nxVar.mo58887l(r7);
                Object l = nxVar.f169962ag.mo58854l(r7.f169971d);
                if (l == null) {
                    obj = r7.f169969b;
                } else {
                    obj = r7.mo58889c(l);
                }
                return new C87429c(f260515l.mo56097d(C58431eu.m89654f(((C55315nv) obj).f145729a).mo55247g(new C93408b())));
            }
        } else if (ordinal != 34) {
            C62940bt r92 = C62942bv.checkIsLite(C55342ov.f145807c);
            nxVar.mo58887l(r92);
            if (!nxVar.f169962ag.mo58857o(r92.f169971d)) {
                ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13568)).mo56387q("Couldn't find text info with info id [%d]", i);
            } else {
                C62940bt r72 = C62942bv.checkIsLite(C55342ov.f145807c);
                nxVar.mo58887l(r72);
                Object l2 = nxVar.f169962ag.mo58854l(r72.f169971d);
                if (l2 == null) {
                    obj3 = r72.f169969b;
                } else {
                    obj3 = r72.mo58889c(l2);
                }
                return new C87429c(f260515l.mo56097d(((C55342ov) obj3).f145809a));
            }
        } else {
            C62940bt r0 = C62942bv.checkIsLite(C55344ox.f145811d);
            nxVar.mo58887l(r0);
            if (!nxVar.f169962ag.mo58857o(r0.f169971d)) {
                ((C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13571)).mo56387q("Couldn't find time information with info id [%d]", i);
            } else {
                C62940bt r73 = C62942bv.checkIsLite(C55344ox.f145811d);
                nxVar.mo58887l(r73);
                Object l3 = nxVar.f169962ag.mo58854l(r73.f169971d);
                if (l3 == null) {
                    obj2 = r73.f169969b;
                } else {
                    obj2 = r73.mo58889c(l3);
                }
                return new C87429c(C89407a.m145418a(context, ((C55344ox) obj2).f145814b, 1, true).toString());
            }
        }
        C59052c cVar = (C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13569);
        C55133hb a2 = C55133hb.m87600a(hcVar.f145123c);
        if (a2 == null) {
            a2 = C55133hb.NONE;
        }
        cVar.mo56389s("Couldn't fulfill the argument transformation [%s]", a2);
        return C87429c.f236122a;
    }

    /* renamed from: U */
    public final C87429c mo81214U(C55134hc hcVar) {
        int i = hcVar.f145123c;
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        if (a.ordinal() == 6) {
            return new C87429c(this.f260516g.size());
        }
        C59052c cVar = (C59052c) ((C59052c) f260514f.mo56226d()).mo56372aa(13574);
        C55133hb a2 = C55133hb.m87600a(hcVar.f145123c);
        if (a2 == null) {
            a2 = C55133hb.NONE;
        }
        cVar.mo56389s("Couldn't fulfill the constant transformation [%s]", a2);
        return C87429c.f236122a;
    }

    /* renamed from: W */
    public final C55213ka mo81216W(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: Z */
    public final C55305nl mo81219Z() {
        throw null;
    }

    /* renamed from: aa */
    public final String mo81221aa() {
        throw null;
    }

    /* renamed from: ah */
    public final boolean mo81228ah(List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return this.f260521m;
    }

    /* renamed from: hu */
    public final View mo81068hu(Context context) {
        C55313nt ntVar = this.f260519j.f145755h;
        if (ntVar == null) {
            ntVar = C55313nt.f145718f;
        }
        C55136he heVar = ntVar.f145723d;
        if (heVar == null) {
            heVar = C55136he.f145130j;
        }
        int i = 1;
        if ((heVar.f145132a & 1) == 0 || (ntVar.f145720a & 16) == 0) {
            return null;
        }
        C55136he heVar2 = ntVar.f145723d;
        if (heVar2 == null) {
            heVar2 = C55136he.f145130j;
        }
        String str = heVar2.f145133b;
        Resources resources = context.getResources();
        int a = C55419v.m87685a(ntVar.f145724e);
        if (a != 0) {
            i = a;
        }
        Drawable drawable = resources.getDrawable(C88511e.m142915b(i));
        OpaNonModularActionCompletionCard opaNonModularActionCompletionCard = (OpaNonModularActionCompletionCard) LayoutInflater.from(context).inflate(R.layout.opa_non_modular_action_confirmation_card, (ViewGroup) null);
        opaNonModularActionCompletionCard.f260523a.setText(str);
        opaNonModularActionCompletionCard.f260524b.setImageDrawable(drawable);
        opaNonModularActionCompletionCard.f260525c = this.f235989e;
        return opaNonModularActionCompletionCard;
    }

    /* renamed from: r */
    public final boolean mo81079r() {
        C55313nt ntVar = this.f260519j.f145755h;
        if (ntVar == null) {
            ntVar = C55313nt.f145718f;
        }
        return ntVar.f145722c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ProtoLiteParcelable.m147140k(this.f260519j, parcel);
        parcel.writeTypedList(this.f260516g);
        parcel.writeInt(this.f260518i);
        ProtoLiteParcelable.m147139j(this.f260517h, parcel);
        parcel.writeInt(this.f260521m.f146230cP);
    }

    public ModularAnswerImpl(C55324od odVar, List list, C58485gu guVar, C55421x xVar) {
        this.f260519j = odVar;
        this.f260516g = list;
        this.f260517h = guVar;
        this.f260521m = xVar;
        int size = list.size();
        C55313nt ntVar = odVar.f145755h;
        int i = (ntVar == null ? C55313nt.f145718f : ntVar).f145721b;
        this.f260518i = i > 0 ? i : size;
    }
}
