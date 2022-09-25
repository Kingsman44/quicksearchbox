package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93600cx;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93601cy;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C55001ce;
import com.google.p4152bb.p4153a.C55003cg;
import com.google.p4152bb.p4153a.C55106gb;
import com.google.p4152bb.p4153a.C55111gg;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.p4152bb.p4153a.C55113gi;
import com.google.p4152bb.p4153a.C55114gj;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55188jc;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55260lu;
import com.google.p4152bb.p4153a.C55261lv;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
public class LocationArgument extends AmbiguousArgument {
    public static final Parcelable.Creator CREATOR = new C87452p();

    /* renamed from: i */
    public final C55114gj f236189i;

    /* renamed from: j */
    public final C55188jc f236190j;

    /* renamed from: k */
    private final C55114gj f236191k;

    public LocationArgument(C55213ka kaVar, Disambiguation disambiguation) {
        super(kaVar, disambiguation);
        Object obj;
        C55188jc jcVar;
        C62940bt r3 = C62942bv.checkIsLite(C55261lv.f145536f);
        kaVar.mo58887l(r3);
        Object l = kaVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C55261lv lvVar = (C55261lv) obj;
        C55114gj gjVar = lvVar.f145539b;
        this.f236191k = gjVar == null ? C55114gj.f145034g : gjVar;
        C55114gj gjVar2 = null;
        if ((lvVar.f145538a & 8) != 0) {
            jcVar = lvVar.f145541d;
            if (jcVar == null) {
                jcVar = C55188jc.f145269b;
            }
        } else {
            jcVar = null;
        }
        this.f236190j = jcVar;
        if ((lvVar.f145538a & 4) != 0 && (gjVar2 = lvVar.f145540c) == null) {
            gjVar2 = C55114gj.f145034g;
        }
        this.f236189i = gjVar2;
    }

    /* renamed from: G */
    public final boolean mo81267G(C93600cx cxVar) {
        C55112gh g = mo81312g();
        if (g == null || !g.f145028j.isEmpty() || (g.f145020b & 2) == 0) {
            return true;
        }
        C93602cz czVar = cxVar.f261316a;
        if (!czVar.mo82060w()) {
            return false;
        }
        C88509c cVar = czVar.f239227c;
        cVar.getClass();
        ((C93601cy) cVar).mo87997j(this);
        return false;
    }

    /* renamed from: H */
    public final C55213ka mo81268H(boolean z) {
        C55211jz jzVar = (C55211jz) mo81278m(this.f236140a).mo81279n().toBuilder();
        C55260lu luVar = (C55260lu) ((C55261lv) jzVar.mo58881i(C55261lv.f145536f)).toBuilder();
        luVar.copyOnWrite();
        C55261lv lvVar = (C55261lv) luVar.instance;
        lvVar.f145540c = null;
        int i = lvVar.f145538a & -5;
        lvVar.f145538a = i;
        if ((i & 2) != 0) {
            int i2 = 0;
            while (true) {
                C55114gj gjVar = ((C55261lv) luVar.instance).f145539b;
                if (gjVar == null) {
                    gjVar = C55114gj.f145034g;
                }
                if (i2 >= gjVar.f145037b.size()) {
                    break;
                }
                C55114gj gjVar2 = ((C55261lv) luVar.instance).f145539b;
                if (gjVar2 == null) {
                    gjVar2 = C55114gj.f145034g;
                }
                C55112gh ghVar = (C55112gh) gjVar2.f145037b.get(i2);
                if ((ghVar.f145020b & 2) != 0) {
                    C55003cg cgVar = ghVar.f145030l;
                    if (cgVar == null) {
                        cgVar = C55003cg.f144710c;
                    }
                    C55111gg ggVar = (C55111gg) C55112gh.f145017p.createBuilder();
                    ggVar.copyOnWrite();
                    C55112gh ghVar2 = (C55112gh) ggVar.instance;
                    cgVar.getClass();
                    ghVar2.f145030l = cgVar;
                    ghVar2.f145020b |= 2;
                    C55112gh ghVar3 = (C55112gh) ggVar.build();
                    C55114gj gjVar3 = ((C55261lv) luVar.instance).f145539b;
                    if (gjVar3 == null) {
                        gjVar3 = C55114gj.f145034g;
                    }
                    C55113gi giVar = (C55113gi) gjVar3.toBuilder();
                    giVar.copyOnWrite();
                    C55114gj gjVar4 = (C55114gj) giVar.instance;
                    ghVar3.getClass();
                    gjVar4.mo54195a();
                    gjVar4.f145037b.set(i2, ghVar3);
                    luVar.copyOnWrite();
                    C55261lv lvVar2 = (C55261lv) luVar.instance;
                    C55114gj gjVar5 = (C55114gj) giVar.build();
                    gjVar5.getClass();
                    lvVar2.f145539b = gjVar5;
                    lvVar2.f145538a |= 2;
                }
                i2++;
            }
        }
        jzVar.mo58885m(C55261lv.f145536f, (C55261lv) luVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: M */
    public final boolean mo81311M() {
        C55114gj gjVar = this.f236189i;
        return gjVar != null && gjVar.f145037b.size() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C87429c mo81257a(Object obj, C55133hb hbVar, Resources resources) {
        C55112gh g = mo81312g();
        if (g == null) {
            return C87429c.f236122a;
        }
        C55133hb hbVar2 = C55133hb.NONE;
        switch (hbVar.ordinal()) {
            case 24:
                return (g.f145019a & 16) != 0 ? new C87429c(g.f145022d) : C87429c.f236122a;
            case 25:
                return (g.f145019a & C89885b.NOW_VALUE) != 0 ? new C87429c(g.f145029k) : C87429c.f236122a;
            case 26:
                if ((g.f145020b & 2) != 0) {
                    C55003cg cgVar = g.f145030l;
                    if (cgVar == null) {
                        cgVar = C55003cg.f144710c;
                    }
                    int a = C55001ce.m87556a(cgVar.f144713b);
                    if (a == 0 || a == 1) {
                        return new C87429c(resources.getString(R.string.gsa_home));
                    }
                    return new C87429c(resources.getString(R.string.work));
                } else if ((g.f145019a & 1) != 0) {
                    return new C87429c(g.f145021c);
                } else {
                    C55106gb gbVar = g.f145033o;
                    if (gbVar == null) {
                        gbVar = C55106gb.f145002e;
                    }
                    if ((gbVar.f145004a & 2) == 0) {
                        return C87429c.f236122a;
                    }
                    C55106gb gbVar2 = g.f145033o;
                    if (gbVar2 == null) {
                        gbVar2 = C55106gb.f145002e;
                    }
                    return new C87429c(gbVar2.f145006c);
                }
            default:
                return C87429c.f236122a;
        }
    }

    /* renamed from: g */
    public final C55112gh mo81312g() {
        if (!mo81263C() || !((Disambiguation) this.f236203n).mo81543l()) {
            return null;
        }
        Parcelable parcelable = ((Disambiguation) this.f236203n).f236364c;
        parcelable.getClass();
        ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) parcelable;
        if (protoLiteParcelable.mo84192m()) {
            return (C55112gh) protoLiteParcelable.mo84190c(C55112gh.f145017p);
        }
        return null;
    }

    /* renamed from: h */
    public final C55114gj mo81313h() {
        C55113gi giVar = (C55113gi) this.f236191k.toBuilder();
        if (mo81263C()) {
            Disambiguation disambiguation = (Disambiguation) this.f236203n;
            giVar.copyOnWrite();
            ((C55114gj) giVar.instance).f145037b = C55114gj.emptyProtobufList();
            if (disambiguation.mo81543l()) {
                giVar.mo54194a(mo81312g());
            } else {
                for (ProtoLiteParcelable protoLiteParcelable : disambiguation.f236363b) {
                    if (protoLiteParcelable.mo84192m()) {
                        giVar.mo54194a((C55112gh) protoLiteParcelable.mo84190c(C55112gh.f145017p));
                    }
                }
            }
        }
        return (C55114gj) giVar.build();
    }

    /* renamed from: i */
    public final void mo81314i(C55112gh ghVar) {
        if (!mo81263C()) {
            mo81334P(new Disambiguation(ghVar.f145027i, C58597ky.m90212c(new ProtoLiteParcelable((MessageLite) ghVar)), false, true));
        }
        ((Disambiguation) this.f236203n).mo81535d(new ProtoLiteParcelable((MessageLite) ghVar), true);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Argument mo81278m(int i) {
        C55211jz jzVar = (C55211jz) mo81279n().toBuilder();
        jzVar.copyOnWrite();
        C55213ka kaVar = (C55213ka) jzVar.instance;
        kaVar.f145358a |= 1;
        kaVar.f145359b = i;
        return new LocationArgument((C55213ka) jzVar.build(), mo81313h());
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55260lu luVar = (C55260lu) C55261lv.f145535e.createBuilder();
        C55188jc jcVar = this.f236190j;
        if (jcVar != null) {
            luVar.copyOnWrite();
            C55261lv lvVar = (C55261lv) luVar.instance;
            lvVar.f145541d = jcVar;
            lvVar.f145538a |= 8;
        }
        C55114gj gjVar = this.f236189i;
        if (gjVar != null) {
            luVar.copyOnWrite();
            C55261lv lvVar2 = (C55261lv) luVar.instance;
            lvVar2.f145540c = gjVar;
            lvVar2.f145538a |= 4;
        }
        if (mo81263C()) {
            C55114gj h = mo81313h();
            luVar.copyOnWrite();
            C55261lv lvVar3 = (C55261lv) luVar.instance;
            h.getClass();
            lvVar3.f145539b = h;
            lvVar3.f145538a |= 2;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55261lv.f145536f, (C55261lv) luVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81358e(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
        parcel.writeParcelable((Parcelable) this.f236203n, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationArgument(com.google.p4152bb.p4153a.C55213ka r7, com.google.p4152bb.p4153a.C55114gj r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0005
            r4 = r0
            goto L_0x0040
        L_0x0005:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.protobuf.cq r2 = r8.f145037b
            java.util.Iterator r2 = r2.iterator()
        L_0x0010:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r2.next()
            com.google.bb.a.gh r3 = (com.google.p4152bb.p4153a.C55112gh) r3
            com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable r4 = new com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable
            r4.<init>((com.google.protobuf.MessageLite) r3)
            r1.add(r4)
            goto L_0x0010
        L_0x0025:
            com.google.protobuf.cq r2 = r8.f145037b
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L_0x0039
            com.google.protobuf.cq r2 = r8.f145037b
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.gh r2 = (com.google.p4152bb.p4153a.C55112gh) r2
            java.lang.String r2 = r2.f145027i
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r4 = new com.google.android.apps.gsa.search.shared.contact.Disambiguation
            r5 = 1
            r4.<init>(r2, r1, r3, r5)
        L_0x0040:
            r6.<init>(r7, r4)
            if (r8 != 0) goto L_0x0047
            com.google.bb.a.gj r8 = com.google.p4152bb.p4153a.C55114gj.f145034g
        L_0x0047:
            r6.f236191k = r8
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55261lv.f145536f
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r1 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r1)
            if (r7 != 0) goto L_0x005f
            java.lang.Object r7 = r8.f169969b
            goto L_0x0063
        L_0x005f:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x0063:
            com.google.bb.a.lv r7 = (com.google.p4152bb.p4153a.C55261lv) r7
            if (r7 == 0) goto L_0x006e
            com.google.bb.a.jc r8 = r7.f145541d
            if (r8 != 0) goto L_0x006f
            com.google.bb.a.jc r8 = com.google.p4152bb.p4153a.C55188jc.f145269b
            goto L_0x006f
        L_0x006e:
            r8 = r0
        L_0x006f:
            r6.f236190j = r8
            if (r7 == 0) goto L_0x0079
            com.google.bb.a.gj r0 = r7.f145540c
            if (r0 != 0) goto L_0x0079
            com.google.bb.a.gj r0 = com.google.p4152bb.p4153a.C55114gj.f145034g
        L_0x0079:
            r6.f236189i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument.<init>(com.google.bb.a.ka, com.google.bb.a.gj):void");
    }
}
