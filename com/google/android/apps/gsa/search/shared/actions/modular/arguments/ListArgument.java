package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93600cx;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55138hg;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55258ls;
import com.google.p4152bb.p4153a.C55259lt;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class ListArgument extends Argument {
    public static final Parcelable.Creator CREATOR = new C87451o();

    /* renamed from: i */
    public final Argument f236185i;

    /* renamed from: j */
    public final C55136he f236186j;

    /* renamed from: k */
    public final int f236187k;

    /* renamed from: l */
    public List f236188l;

    private ListArgument(ListArgument listArgument, int i) {
        super((Argument) listArgument, i);
        this.f236185i = listArgument.f236185i;
        this.f236186j = listArgument.f236186j;
        this.f236188l = listArgument.f236188l;
        this.f236187k = listArgument.f236187k;
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        ModularAction modularAction = this.f236144e;
        if (this.f236188l.isEmpty() || modularAction == null) {
            return false;
        }
        for (Integer intValue : this.f236188l) {
            int intValue2 = intValue.intValue();
            if (modularAction.mo81211R(intValue2) == null) {
                modularAction.mo81210Q().mo81403g(intValue2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final boolean mo81264D() {
        ModularAction modularAction = this.f236144e;
        if (this.f236188l.isEmpty() || modularAction == null) {
            return false;
        }
        for (Integer intValue : this.f236188l) {
            int intValue2 = intValue.intValue();
            Argument R = modularAction.mo81211R(intValue2);
            if (R == null) {
                modularAction.mo81210Q().mo81403g(intValue2);
                return false;
            } else if (R.mo81263C() && !R.mo81264D()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean mo81267G(C93600cx cxVar) {
        for (Integer intValue : this.f236188l) {
            if (!this.f236144e.mo81211R(intValue.intValue()).mo81267G(cxVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C() && !this.f236188l.isEmpty()) {
            C55133hb hbVar = C55133hb.NONE;
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            int ordinal = a.ordinal();
            C55138hg hgVar = null;
            if (ordinal == 0) {
                ArrayList arrayList = new ArrayList();
                for (Integer intValue : this.f236188l) {
                    Argument R = this.f236144e.mo81211R(intValue.intValue());
                    if (R.mo81263C()) {
                        arrayList.add(R.mo81250c(mVar, hcVar, resources));
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new C87429c((Collection) arrayList);
                }
                this.f236144e.mo81210Q().mo81395a("ListArgument transformation failed because one or multiple sub-arguments' ArgumentValues are not set", mo81279n(), (Throwable) null);
            } else if (ordinal == 42) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hcVar.f145126f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue2 = ((Integer) it.next()).intValue();
                    int size = intValue2 < 0 ? this.f236188l.size() + intValue2 : intValue2;
                    if (size < 0 || size >= this.f236188l.size()) {
                        this.f236144e.mo81210Q().mo81398b(String.format("ListArgument transformation failed because of invalid listItemPosition %d out of range for list of length %d", new Object[]{Integer.valueOf(intValue2), Integer.valueOf(this.f236188l.size())}));
                    } else {
                        arrayList2.add(Integer.valueOf(intValue2 + 1));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    if ((hcVar.f145121a & 16) != 0 && (hgVar = hcVar.f145127g) == null) {
                        hgVar = C55138hg.f145142g;
                    }
                    return new C87429c(C87431e.m141674e(hgVar, arrayList2));
                }
            } else if (ordinal == 43) {
                ArrayList arrayList3 = new ArrayList();
                for (Integer intValue3 : this.f236188l) {
                    Argument R2 = this.f236144e.mo81211R(intValue3.intValue());
                    if (R2.mo81263C()) {
                        C55130gz gzVar = (C55130gz) C55134hc.f145119i.createBuilder();
                        C55133hb hbVar2 = C55133hb.NONE;
                        gzVar.copyOnWrite();
                        C55134hc hcVar2 = (C55134hc) gzVar.instance;
                        hcVar2.f145123c = hbVar2.f145118S;
                        hcVar2.f145121a |= 2;
                        arrayList3.add(R2.mo81250c(mVar, (C55134hc) gzVar.build(), resources).mo81245d());
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if ((hcVar.f145121a & 16) != 0 && (hgVar = hcVar.f145127g) == null) {
                        hgVar = C55138hg.f145142g;
                    }
                    return new C87429c(C87431e.m141674e(hgVar, arrayList3));
                }
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: m */
    public final Argument mo81278m(int i) {
        return new ListArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55258ls lsVar = (C55258ls) C55259lt.f145526f.createBuilder();
        List list = this.f236188l;
        lsVar.copyOnWrite();
        C55259lt ltVar = (C55259lt) lsVar.instance;
        C62961ch chVar = ltVar.f145530b;
        if (!chVar.mo58948c()) {
            ltVar.f145530b = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) list, (List) ltVar.f145530b);
        C55213ka n = this.f236185i.mo81279n();
        lsVar.copyOnWrite();
        C55259lt ltVar2 = (C55259lt) lsVar.instance;
        n.getClass();
        ltVar2.f145531c = n;
        ltVar2.f145529a |= 1;
        C55136he heVar = this.f236186j;
        lsVar.copyOnWrite();
        C55259lt ltVar3 = (C55259lt) lsVar.instance;
        heVar.getClass();
        ltVar3.f145532d = heVar;
        ltVar3.f145529a |= 2;
        int i = this.f236187k;
        if (i > 0) {
            lsVar.copyOnWrite();
            C55259lt ltVar4 = (C55259lt) lsVar.instance;
            ltVar4.f145529a |= 4;
            ltVar4.f145533e = i;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55259lt.f145527g, (C55259lt) lsVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81366m();
    }

    /* renamed from: r */
    public final List mo81283r() {
        return this.f236188l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
        parcel.writeParcelable(this.f236185i, i);
    }

    public ListArgument(C55213ka kaVar, Argument argument) {
        super(kaVar);
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55259lt.f145527g);
        kaVar.mo58887l(r0);
        Object l = kaVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55259lt ltVar = (C55259lt) obj;
        this.f236185i = argument;
        C55136he heVar = ltVar.f145532d;
        this.f236186j = heVar == null ? C55136he.f145130j : heVar;
        this.f236188l = ltVar.f145530b;
        this.f236187k = ltVar.f145533e;
    }
}
