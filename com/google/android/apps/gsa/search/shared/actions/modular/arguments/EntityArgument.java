package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.ComponentName;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.actions.util.C87482d;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55007ck;
import com.google.p4152bb.p4153a.C55018cv;
import com.google.p4152bb.p4153a.C55027dd;
import com.google.p4152bb.p4153a.C55029df;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55177is;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.p4152bb.p4153a.C55234kv;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55246lg;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.p4152bb.p4153a.C55301nh;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.p4747b.p4748a.p4749a.C62920a;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class EntityArgument extends AmbiguousArgument {
    public static final Parcelable.Creator CREATOR = new C87445i();

    /* renamed from: i */
    public final C55177is f236164i;

    /* renamed from: j */
    public String f236165j;

    /* renamed from: k */
    public C55029df f236166k;

    /* renamed from: l */
    public boolean f236167l;

    /* renamed from: m */
    private final List f236168m;

    /* compiled from: PG */
    public class Entity implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C87446j();

        /* renamed from: a */
        final String f236169a;

        /* renamed from: b */
        public final Spanned f236170b;

        /* renamed from: c */
        final String f236171c;

        /* renamed from: d */
        public final Spanned f236172d;

        /* renamed from: e */
        public String f236173e;

        /* renamed from: f */
        public final Bitmap f236174f;

        /* renamed from: g */
        final String f236175g;

        /* renamed from: h */
        final String f236176h;

        /* renamed from: i */
        final String f236177i;

        /* renamed from: j */
        final C55136he f236178j;

        /* renamed from: k */
        public final List f236179k;

        /* renamed from: l */
        public final int f236180l;

        /* renamed from: m */
        public final int f236181m;

        /* renamed from: n */
        private final boolean f236182n;

        public Entity(String str, String str2, String str3, Bitmap bitmap, int i, String str4, String str5, String str6, C55136he heVar, List list, boolean z, int i2) {
            this.f236169a = str;
            if (!TextUtils.isEmpty(str)) {
                this.f236170b = Html.fromHtml(str);
            } else {
                this.f236170b = null;
            }
            this.f236171c = str2;
            if (!TextUtils.isEmpty(str2)) {
                this.f236172d = Html.fromHtml(str2);
            } else {
                this.f236172d = null;
            }
            this.f236173e = str3;
            this.f236174f = bitmap;
            this.f236181m = i;
            this.f236175g = str4;
            this.f236176h = str5;
            this.f236177i = str6;
            this.f236179k = list;
            this.f236182n = z;
            this.f236180l = i2;
            this.f236178j = heVar;
        }

        /* renamed from: a */
        public final boolean mo81303a() {
            return this.f236179k.contains(C55018cv.CLIENT);
        }

        /* renamed from: b */
        public final boolean mo81304b() {
            return this.f236179k.contains(C55018cv.COMPANION);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Integer num;
            parcel.writeString(this.f236169a);
            parcel.writeString(this.f236171c);
            parcel.writeString(this.f236173e);
            parcel.writeParcelable(this.f236174f, i);
            int i2 = this.f236181m;
            if (i2 == 0) {
                num = null;
            } else {
                num = Integer.valueOf(i2 - 1);
            }
            parcel.writeValue(num);
            parcel.writeString(this.f236175g);
            parcel.writeString(this.f236176h);
            parcel.writeString(this.f236177i);
            ProtoLiteParcelable.m147140k(this.f236178j, parcel);
            parcel.writeIntArray(C62920a.m95367a(this.f236179k));
            parcel.writeByte(this.f236182n ? (byte) 1 : 0);
            parcel.writeInt(this.f236180l);
        }
    }

    protected EntityArgument(Parcel parcel, ClassLoader classLoader) {
        this((C55213ka) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55213ka.f145356g.getParserForType()), (Disambiguation) parcel.readParcelable(classLoader));
        this.f236165j = parcel.readString();
        this.f236166k = (C55029df) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55029df.f144771d.getParserForType());
        this.f236167l = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: i */
    public static Disambiguation m141745i(C55213ka kaVar) {
        Object obj;
        int i;
        C62940bt r0 = C62942bv.checkIsLite(C55235kw.f145427j);
        kaVar.mo58887l(r0);
        Object l = kaVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55235kw kwVar = (C55235kw) obj;
        if (kwVar == null || kwVar.getSerializedSize() == 0) {
            return null;
        }
        C58485gu i2 = C58485gu.m89841i(C58431eu.m89654f(kwVar.f145431c).mo55247g(new C87444h(kwVar)).mo55248h());
        Disambiguation disambiguation = new Disambiguation(kwVar.f145430b, i2, false, true);
        C55373pz pzVar = kwVar.f145432d;
        if (pzVar == null) {
            pzVar = C55373pz.f145913d;
        }
        Iterator it = pzVar.f145916b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C55371px pxVar = (C55371px) it.next();
            C55370pw a = C55370pw.m87678a(pxVar.f145911c);
            if (a == null) {
                a = C55370pw.UNKNOWN_SELECTION_TYPE;
            }
            if (a == C55370pw.AUTOMATIC && (i = pxVar.f145910b) >= 0 && i < i2.size()) {
                disambiguation.mo81535d((Entity) i2.get(pxVar.f145910b), true);
                break;
            }
        }
        return disambiguation;
    }

    /* renamed from: E */
    public final boolean mo81265E() {
        return this.f236167l;
    }

    /* renamed from: F */
    public boolean mo81266F(C55005ci ciVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55007ck.f144721d);
        ciVar.mo58887l(r0);
        Object l = ciVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55007ck ckVar = (C55007ck) obj;
        if ((ckVar.f144723a & 1) == 0) {
            return false;
        }
        C55018cv a = C55018cv.m87558a(ckVar.f144724b);
        if (a == null) {
            a = C55018cv.UNKNOWN_SOURCE;
        }
        Entity g = mo81300g();
        if (g == null) {
            return false;
        }
        C55133hb hbVar = C55133hb.NONE;
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return C87482d.m141995a(g.f236179k);
        }
        if (ordinal == 2) {
            return g.mo81303a();
        }
        if (ordinal != 3) {
            return true;
        }
        return g.mo81304b();
    }

    /* renamed from: I */
    public final List mo81269I(C55215kc kcVar) {
        Object obj;
        if (mo81263C() && !mo81291z() && !mo81260hB()) {
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
        return C87431e.m141673d(((C55301nh) obj).f145686a, mo81263C() ? ((Disambiguation) this.f236203n).f236363b.size() : 0);
    }

    /* renamed from: L */
    public final void mo81272L() {
        this.f236167l = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C55213ka mo81299M(boolean z) {
        Entity entity;
        C55234kv kvVar = (C55234kv) C55235kw.f145426i.createBuilder();
        C55177is isVar = this.f236164i;
        if (isVar != null) {
            kvVar.copyOnWrite();
            C55235kw kwVar = (C55235kw) kvVar.instance;
            kwVar.f145433e = isVar;
            kwVar.f145429a |= 4;
        }
        kvVar.mo54211c(this.f236168m);
        if (!z || !mo81263C()) {
            C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
            jzVar.mo58885m(C55235kw.f145427j, (C55235kw) kvVar.build());
            return (C55213ka) jzVar.build();
        }
        Disambiguation disambiguation = (Disambiguation) this.f236203n;
        String str = disambiguation.f236362a;
        if (str != null) {
            kvVar.copyOnWrite();
            C55235kw kwVar2 = (C55235kw) kvVar.instance;
            kwVar2.f145429a |= 1;
            kwVar2.f145430b = str;
        }
        List<Entity> list = disambiguation.f236363b;
        if (disambiguation.mo81543l()) {
            Parcelable parcelable = disambiguation.f236364c;
            parcelable.getClass();
            entity = (Entity) parcelable;
        } else {
            entity = null;
        }
        int i = 0;
        for (Entity entity2 : list) {
            C55246lg lgVar = (C55246lg) C55247lh.f145477k.createBuilder();
            if (!TextUtils.isEmpty(entity2.f236169a)) {
                String str2 = entity2.f236169a;
                lgVar.copyOnWrite();
                C55247lh lhVar = (C55247lh) lgVar.instance;
                str2.getClass();
                lhVar.f145479a |= 1;
                lhVar.f145480b = str2;
            }
            if (!TextUtils.isEmpty(entity2.f236171c)) {
                String str3 = entity2.f236171c;
                lgVar.copyOnWrite();
                C55247lh lhVar2 = (C55247lh) lgVar.instance;
                str3.getClass();
                lhVar2.f145479a |= 4;
                lhVar2.f145481c = str3;
            }
            if (!TextUtils.isEmpty(entity2.f236173e)) {
                String str4 = entity2.f236173e;
                lgVar.copyOnWrite();
                C55247lh lhVar3 = (C55247lh) lgVar.instance;
                str4.getClass();
                lhVar3.f145479a |= 32;
                lhVar3.f145483e = str4;
            }
            int i2 = entity2.f236181m;
            if (i2 != 0) {
                lgVar.copyOnWrite();
                C55247lh lhVar4 = (C55247lh) lgVar.instance;
                lhVar4.f145484f = i2 - 1;
                lhVar4.f145479a |= 64;
            }
            if (!TextUtils.isEmpty(entity2.f236175g)) {
                String str5 = entity2.f236175g;
                lgVar.copyOnWrite();
                C55247lh lhVar5 = (C55247lh) lgVar.instance;
                str5.getClass();
                lhVar5.f145479a |= 16;
                lhVar5.f145482d = str5;
            }
            String str6 = entity2.f236176h;
            if (str6 != null) {
                lgVar.copyOnWrite();
                C55247lh lhVar6 = (C55247lh) lgVar.instance;
                lhVar6.f145479a |= 16;
                lhVar6.f145482d = str6;
            }
            if (!TextUtils.isEmpty(entity2.f236177i)) {
                String str7 = entity2.f236177i;
                lgVar.copyOnWrite();
                C55247lh lhVar7 = (C55247lh) lgVar.instance;
                str7.getClass();
                lhVar7.f145479a |= 128;
                lhVar7.f145485g = str7;
            }
            C55136he heVar = entity2.f236178j;
            if (heVar != null) {
                lgVar.copyOnWrite();
                C55247lh lhVar8 = (C55247lh) lgVar.instance;
                lhVar8.f145487j = heVar;
                lhVar8.f145479a |= 512;
            }
            List<C55018cv> list2 = entity2.f236179k;
            lgVar.copyOnWrite();
            C55247lh lhVar9 = (C55247lh) lgVar.instance;
            C62961ch chVar = lhVar9.f145486h;
            if (!chVar.mo58948c()) {
                lhVar9.f145486h = C62942bv.mutableCopy(chVar);
            }
            for (C55018cv cvVar : list2) {
                lhVar9.f145486h.mo58916g(cvVar.f144751f);
            }
            kvVar.mo54212d((C55247lh) lgVar.build());
            if (entity == entity2) {
                C55372py pyVar = (C55372py) C55373pz.f145913d.createBuilder();
                C55368pu puVar = (C55368pu) C55371px.f145907d.createBuilder();
                puVar.copyOnWrite();
                C55371px pxVar = (C55371px) puVar.instance;
                pxVar.f145909a |= 1;
                pxVar.f145910b = i;
                C55370pw pwVar = C55370pw.USER_SELECTED;
                puVar.copyOnWrite();
                C55371px pxVar2 = (C55371px) puVar.instance;
                pxVar2.f145911c = pwVar.f145906f;
                pxVar2.f145909a |= 4;
                pyVar.mo54253a(puVar);
                kvVar.copyOnWrite();
                C55235kw kwVar3 = (C55235kw) kvVar.instance;
                C55373pz pzVar = (C55373pz) pyVar.build();
                pzVar.getClass();
                kwVar3.f145432d = pzVar;
                kwVar3.f145429a |= 2;
            }
            i++;
        }
        C55211jz jzVar2 = (C55211jz) super.mo81279n().toBuilder();
        jzVar2.mo58885m(C55235kw.f145427j, (C55235kw) kvVar.build());
        return (C55213ka) jzVar2.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C87429c mo81257a(Object obj, C55133hb hbVar, Resources resources) {
        Entity entity = (Entity) obj;
        C55133hb hbVar2 = C55133hb.NONE;
        C55018cv cvVar = C55018cv.UNKNOWN_SOURCE;
        switch (hbVar.ordinal()) {
            case 17:
                Spanned spanned = entity.f236170b;
                if (spanned == null) {
                    return C87429c.f236122a;
                }
                return new C87429c(spanned.toString());
            case 18:
                String str = entity.f236175g;
                if (str == null) {
                    return C87429c.f236122a;
                }
                return new C87429c(str);
            case 20:
                String str2 = entity.f236175g;
                if (str2 == null) {
                    return C87429c.f236122a;
                }
                ComponentName b = C89235z.m145130b(Uri.parse(str2));
                return b != null ? new C87429c(b.flattenToString()) : C87429c.f236122a;
            case 21:
                String str3 = entity.f236176h;
                if (str3 == null) {
                    return C87429c.f236122a;
                }
                return new C87429c(str3);
            case 22:
                String str4 = entity.f236177i;
                return str4 == null ? C87429c.f236122a : new C87429c(str4);
            case 23:
                C55136he heVar = entity.f236178j;
                String obj2 = entity.f236170b.toString();
                int i = this.f236140a;
                if (heVar == null || (heVar.f145132a & 1) == 0) {
                    return C87429c.f236122a;
                }
                int size = heVar.f145138g.size();
                if (size == 0) {
                    return new C87429c(heVar.f145133b);
                }
                Object[] objArr = new Object[size];
                for (int i2 = 0; i2 < size; i2++) {
                    C55134hc hcVar = (C55134hc) heVar.f145138g.get(i2);
                    if ((hcVar.f145121a & 4) != 0) {
                        objArr[i2] = hcVar.f145124d;
                    } else {
                        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
                        if (a == null) {
                            a = C55133hb.NONE;
                        }
                        if (a != C55133hb.ENTITY_TITLE || hcVar.f145122b != i) {
                            return C87429c.f236122a;
                        }
                        objArr[i2] = obj2;
                    }
                }
                return new C87429c(String.format(heVar.f145133b, objArr));
            default:
                return C87429c.f236122a;
        }
    }

    /* renamed from: g */
    public final Entity mo81300g() {
        Disambiguation disambiguation = (Disambiguation) this.f236203n;
        if (disambiguation == null || !disambiguation.mo81543l()) {
            return null;
        }
        Parcelable parcelable = disambiguation.f236364c;
        parcelable.getClass();
        return (Entity) parcelable;
    }

    /* renamed from: h */
    public EntityArgument mo81278m(int i) {
        return new EntityArgument(this, i);
    }

    /* renamed from: k */
    public final int mo81276k() {
        C55029df dfVar = this.f236166k;
        if (dfVar != null) {
            C62940bt r1 = C62942bv.checkIsLite(C55027dd.f144768c);
            dfVar.mo58887l(r1);
            if (dfVar.f169962ag.mo58857o(r1.f169971d)) {
                return 16442;
            }
        }
        throw new IllegalStateException("No processing request or unexpected processing request");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f236180l;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo81277l() {
        /*
            r1 = this;
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r0 = r1.mo81300g()
            if (r0 == 0) goto L_0x000b
            int r0 = r0.f236180l
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            int r0 = r1.f236142c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.mo81277l():int");
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        return mo81299M(true);
    }

    /* renamed from: o */
    public final C55365pr mo81280o() {
        C55029df dfVar = this.f236166k;
        if (dfVar == null) {
            return null;
        }
        C55365pr prVar = dfVar.f144775c;
        return prVar == null ? C55365pr.f145876l : prVar;
    }

    /* renamed from: p */
    public Object mo81281p(C87440d dVar) {
        return dVar.mo81356c(this);
    }

    /* renamed from: q */
    public final String mo81282q() {
        return this.f236165j;
    }

    /* renamed from: u */
    public final void mo81286u(C89933d dVar) {
        Entity g = mo81300g();
        if (g != null) {
            boolean a = g.mo81303a();
            boolean b = g.mo81304b();
            boolean a2 = C87482d.m141995a(g.f236179k);
            dVar.f246419q = a;
            dVar.f246421s = a2;
            dVar.f246420r = b;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81299M(false), parcel);
        parcel.writeParcelable((Parcelable) this.f236203n, i);
        parcel.writeString(this.f236165j);
        ProtoLiteParcelable.m147140k(this.f236166k, parcel);
        parcel.writeInt(this.f236167l ? 1 : 0);
    }

    /* renamed from: z */
    public final boolean mo81291z() {
        return !mo81263C() || ((Disambiguation) this.f236203n).mo81541i();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected EntityArgument(EntityArgument entityArgument, int i) {
        super(entityArgument, entityArgument.mo81263C() ? new Disambiguation((Disambiguation) entityArgument.f236203n) : null, i);
        this.f236164i = entityArgument.f236164i;
        this.f236165j = entityArgument.f236165j;
        this.f236168m = entityArgument.f236168m;
        this.f236166k = entityArgument.f236166k;
        this.f236167l = entityArgument.f236167l;
    }

    public EntityArgument(C55213ka kaVar, Disambiguation disambiguation) {
        super(kaVar, disambiguation);
        Object obj;
        C55177is isVar;
        C62940bt r3 = C62942bv.checkIsLite(C55235kw.f145427j);
        kaVar.mo58887l(r3);
        Object l = kaVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C55235kw kwVar = (C55235kw) obj;
        if ((kwVar.f145429a & 4) != 0) {
            isVar = kwVar.f145433e;
            if (isVar == null) {
                isVar = C55177is.f145255c;
            }
        } else {
            isVar = null;
        }
        this.f236164i = isVar;
        this.f236168m = kwVar.f145434f;
    }

    public EntityArgument(C55213ka kaVar, C55029df dfVar) {
        this(kaVar, m141745i(kaVar));
        this.f236166k = dfVar;
        this.f236167l = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EntityArgument(com.google.p4152bb.p4153a.C55213ka r5, java.util.List r6) {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r0 = new com.google.android.apps.gsa.search.shared.contact.Disambiguation
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r5.mo58887l(r1)
            com.google.protobuf.bf r2 = r5.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0018
            java.lang.Object r1 = r1.f169969b
            goto L_0x001c
        L_0x0018:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x001c:
            com.google.bb.a.kw r1 = (com.google.p4152bb.p4153a.C55235kw) r1
            java.lang.String r1 = r1.f145430b
            r2 = 0
            r3 = 1
            r0.<init>(r1, r6, r2, r3)
            r4.<init>((com.google.p4152bb.p4153a.C55213ka) r5, (com.google.android.apps.gsa.search.shared.contact.Disambiguation) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.<init>(com.google.bb.a.ka, java.util.List):void");
    }
}
