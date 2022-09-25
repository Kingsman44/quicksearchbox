package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.contact.C87514b;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.search.shared.contact.RelationshipStatus;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.common.p4522b.C58733pz;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55173io;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55218kf;
import com.google.p4152bb.p4153a.C55219kg;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class PersonArgument extends AmbiguousArgument {
    public static final Parcelable.Creator CREATOR = new C87455s();

    /* renamed from: i */
    public final C55173io f236198i;

    /* renamed from: j */
    public boolean f236199j;

    public PersonArgument(PersonArgument personArgument, PersonDisambiguation personDisambiguation, int i) {
        super(personArgument, personDisambiguation, i);
        this.f236198i = personArgument.f236198i;
        this.f236199j = personArgument.f236199j;
    }

    /* renamed from: M */
    protected static final C87429c m141803M(Contact contact, C55133hb hbVar) {
        C55133hb hbVar2 = C55133hb.NONE;
        switch (hbVar.ordinal()) {
            case 9:
            case 10:
            case 15:
            case 16:
                if (contact.mo81529l()) {
                    return new C87429c(contact.f236354e);
                }
                break;
            case 11:
                if (contact.mo81529l()) {
                    return new C87429c(contact.mo81519d());
                }
                break;
            case 12:
                if (contact.mo81526i()) {
                    return new C87429c(contact.f236355f);
                }
                break;
        }
        return C87429c.f236122a;
    }

    /* renamed from: N */
    private final C55213ka m141804N(boolean z) {
        C55218kf kfVar = (C55218kf) C55219kg.f145373d.createBuilder();
        C55173io ioVar = this.f236198i;
        if (ioVar != null) {
            kfVar.copyOnWrite();
            C55219kg kgVar = (C55219kg) kfVar.instance;
            kgVar.f145378c = ioVar;
            kgVar.f145376a |= 2;
        }
        if (mo81263C()) {
            C55093fp q = ((PersonDisambiguation) this.f236203n).mo81578q(C87514b.m142145a((Resources) null), z);
            kfVar.copyOnWrite();
            C55219kg kgVar2 = (C55219kg) kfVar.instance;
            q.getClass();
            kgVar2.f145377b = q;
            kgVar2.f145376a |= 1;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55219kg.f145374e, (C55219kg) kfVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: H */
    public final C55213ka mo81268H(boolean z) {
        return m141804N(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[RETURN] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo81269I(com.google.p4152bb.p4153a.C55215kc r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r0 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r0
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r2 = r0.mo81543l()
            if (r2 == 0) goto L_0x0013
            boolean r2 = r6.mo81317h()
            if (r2 == 0) goto L_0x0026
        L_0x0013:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55221ki.f145381l
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r3 = r7.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 != 0) goto L_0x0027
        L_0x0026:
            return r1
        L_0x0027:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55221ki.f145381l
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r7 = r7.mo58854l(r3)
            if (r7 != 0) goto L_0x003d
            java.lang.Object r7 = r2.f169969b
            goto L_0x0041
        L_0x003d:
            java.lang.Object r7 = r2.mo58889c(r7)
        L_0x0041:
            com.google.bb.a.ki r7 = (com.google.p4152bb.p4153a.C55221ki) r7
            if (r0 == 0) goto L_0x007c
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r2 = r0.f236395k
            boolean r3 = r0.mo81541i()
            boolean r4 = r0.mo81544m()
            boolean r5 = r2.mo81601c()
            if (r5 == 0) goto L_0x0077
            if (r3 == 0) goto L_0x0066
            com.google.protobuf.cq r3 = r7.f145385c
            com.google.protobuf.cq r4 = r7.f145384b
            com.google.android.apps.gsa.search.shared.contact.Relationship r2 = r2.f236410c
            boolean r2 = r2.mo81594e()
            java.util.List r2 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141672c(r3, r4, r2)
            goto L_0x0078
        L_0x0066:
            if (r4 == 0) goto L_0x0077
            com.google.protobuf.cq r3 = r7.f145387e
            com.google.protobuf.cq r4 = r7.f145386d
            com.google.android.apps.gsa.search.shared.contact.Relationship r2 = r2.f236410c
            boolean r2 = r2.mo81594e()
            java.util.List r2 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141672c(r3, r4, r2)
            goto L_0x0078
        L_0x0077:
            r2 = r1
        L_0x0078:
            if (r2 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            return r2
        L_0x007c:
            if (r0 == 0) goto L_0x0132
            boolean r2 = r0.mo81541i()
            if (r2 == 0) goto L_0x0086
            goto L_0x0132
        L_0x0086:
            boolean r2 = r0.mo81607C()
            if (r2 == 0) goto L_0x008f
            com.google.protobuf.cq r7 = r7.f145391i
            return r7
        L_0x008f:
            boolean r2 = r0.mo81544m()
            if (r2 == 0) goto L_0x0125
            java.util.Set r2 = r0.f236392h
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 == 0) goto L_0x00af
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r7 = r6.f236144e
            com.google.android.apps.gsa.search.shared.actions.modular.b r7 = r7.mo81210Q()
            java.lang.String r0 = "PersonArgument with unkown mode"
            com.google.bb.a.ka r2 = r6.m141804N(r3)
            r7.mo81395a(r0, r2, r1)
            goto L_0x0124
        L_0x00af:
            boolean r2 = r0.mo81543l()
            if (r2 != 0) goto L_0x0124
            java.util.List r0 = r0.f236411n
            if (r0 != 0) goto L_0x00ba
            return r1
        L_0x00ba:
            int r1 = r0.size()
            if (r1 <= r3) goto L_0x00c2
            r1 = 1
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            com.google.common.base.C58838bb.m90883r(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x00cf:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00eb
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.search.shared.contact.Contact r4 = (com.google.android.apps.gsa.search.shared.contact.Contact) r4
            boolean r5 = r4.mo81526i()
            if (r5 == 0) goto L_0x00cf
            java.lang.String r4 = r4.f236355f
            java.lang.Object r4 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141671b(r4)
            r1.add(r4)
            goto L_0x00cf
        L_0x00eb:
            int r1 = r1.size()
            if (r1 > r3) goto L_0x011d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00fe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.search.shared.contact.Contact r2 = (com.google.android.apps.gsa.search.shared.contact.Contact) r2
            java.lang.String r2 = r2.mo81519d()
            r1.add(r2)
            goto L_0x00fe
        L_0x0112:
            com.google.protobuf.cq r7 = r7.f145390h
            int r0 = r1.size()
            java.util.List r7 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141673d(r7, r0)
            return r7
        L_0x011d:
            com.google.protobuf.cq r7 = r7.f145389g
            java.util.List r7 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141673d(r7, r1)
            return r7
        L_0x0124:
            return r1
        L_0x0125:
            com.google.protobuf.cq r7 = r7.f145388f
            java.util.List r0 = r0.f236363b
            int r0 = r0.size()
            java.util.List r7 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e.m141673d(r7, r0)
            return r7
        L_0x0132:
            com.google.protobuf.cq r7 = r7.f145383a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument.mo81269I(com.google.bb.a.kc):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C87429c mo81257a(Object obj, C55133hb hbVar, Resources resources) {
        Person person = (Person) obj;
        if (hbVar == C55133hb.CONTACT_NAME) {
            if (person.mo81527j()) {
                return new C87429c(person.f236373d);
            }
            if (mo81263C()) {
                PersonDisambiguation personDisambiguation = (PersonDisambiguation) this.f236203n;
                if (personDisambiguation.f236362a != null) {
                    return new C87429c(C90763bg.m148261a(personDisambiguation.mo81532a()));
                }
            }
        } else if (hbVar == C55133hb.CONTACT_URI) {
            return new C87429c(person.mo81555b());
        }
        return C87429c.f236122a;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) this.f236203n;
        if (mo81263C()) {
            C55133hb hbVar = C55133hb.NONE;
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 8) {
                return personDisambiguation.f236395k.mo81600b() ? new C87429c(personDisambiguation.f236395k.f236410c.mo81592d()) : C87429c.f236122a;
            }
            if (ordinal == 13) {
                return new C87429c(personDisambiguation.mo81532a());
            }
        }
        C55133hb a2 = C55133hb.m87600a(hcVar.f145123c);
        if (a2 == null) {
            a2 = C55133hb.NONE;
        }
        if (a2 == C55133hb.CONTACT_NAME || a2 == C55133hb.CONTACT_URI) {
            return super.mo81250c(mVar, hcVar, resources);
        }
        if (!mo81263C() || !personDisambiguation.mo81544m()) {
            return C87429c.f236122a;
        }
        if (personDisambiguation.mo81543l()) {
            Parcelable parcelable = personDisambiguation.f236412o;
            parcelable.getClass();
            Contact contact = (Contact) parcelable;
            C55133hb a3 = C55133hb.m87600a(hcVar.f145123c);
            if (a3 == null) {
                a3 = C55133hb.NONE;
            }
            return m141803M(contact, a3);
        }
        C55133hb a4 = C55133hb.m87600a(hcVar.f145123c);
        if (a4 == null) {
            a4 = C55133hb.NONE;
        }
        switch (a4.ordinal()) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
                List list = personDisambiguation.f236411n;
                if (list == null) {
                    return C87429c.f236122a;
                }
                return C87431e.m141670a(list, hcVar, new C87454r(hcVar), C87431e.f236137a);
            default:
                return C87429c.f236122a;
        }
    }

    /* renamed from: h */
    public final boolean mo81317h() {
        return this.f236199j && mo81263C() && ((PersonDisambiguation) this.f236203n).f236395k.mo81601c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hA */
    public final boolean mo81259hA(Argument argument) {
        Relationship relationship;
        if (!(argument instanceof PersonArgument)) {
            return false;
        }
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) this.f236203n;
        PersonDisambiguation personDisambiguation2 = (PersonDisambiguation) ((PersonArgument) argument).f236203n;
        if (!Disambiguation.m142057k(personDisambiguation, personDisambiguation2)) {
            return false;
        }
        if (personDisambiguation == null || personDisambiguation2 == null) {
            return true;
        }
        RelationshipStatus relationshipStatus = personDisambiguation.f236395k;
        RelationshipStatus relationshipStatus2 = personDisambiguation2.f236395k;
        if (relationshipStatus == null || relationshipStatus2 == null) {
            if ((relationshipStatus == null) != (relationshipStatus2 == null)) {
                return false;
            }
            return true;
        }
        Relationship relationship2 = relationshipStatus.f236410c;
        if (relationship2 == null || (relationship = relationshipStatus2.f236410c) == null) {
            if (relationship2 != relationshipStatus2.f236410c) {
                return false;
            }
            return true;
        } else if (relationship2.equals(relationship) && relationshipStatus.f236408a == relationshipStatus2.f236408a && relationshipStatus.f236409b == relationshipStatus2.f236409b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return ((super.mo81260hB() && !mo81318i()) || mo81317h()) && !mo81291z();
    }

    /* renamed from: i */
    public final boolean mo81318i() {
        return mo81263C() && ((PersonDisambiguation) this.f236203n).mo81544m() && ((PersonDisambiguation) this.f236203n).mo81607C();
    }

    /* renamed from: j */
    public final int mo81275j() {
        if (mo81318i()) {
            return 2;
        }
        if (mo81291z()) {
            return mo81317h() ? 4 : 3;
        }
        return 0;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Argument mo81278m(int i) {
        return new PersonArgument(this, mo81263C() ? ((PersonDisambiguation) this.f236203n).clone() : null, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        return m141804N(true);
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81360g(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(m141804N(false), parcel);
        parcel.writeParcelable((Parcelable) this.f236203n, i);
        parcel.writeByte(this.f236199j ? (byte) 1 : 0);
    }

    /* renamed from: z */
    public final boolean mo81291z() {
        return mo81263C() && ((PersonDisambiguation) this.f236203n).mo81541i();
    }

    public PersonArgument(C55213ka kaVar, PersonDisambiguation personDisambiguation) {
        super(kaVar, personDisambiguation);
        C55173io ioVar;
        Object obj;
        C62940bt r3 = C62942bv.checkIsLite(C55219kg.f145374e);
        kaVar.mo58887l(r3);
        if (kaVar.f169962ag.mo58857o(r3.f169971d)) {
            C62940bt r32 = C62942bv.checkIsLite(C55219kg.f145374e);
            kaVar.mo58887l(r32);
            Object l = kaVar.f169962ag.mo58854l(r32.f169971d);
            if (l == null) {
                obj = r32.f169969b;
            } else {
                obj = r32.mo58889c(l);
            }
            ioVar = ((C55219kg) obj).f145378c;
            if (ioVar == null) {
                ioVar = C55173io.f145247b;
            }
        } else {
            ioVar = null;
        }
        this.f236198i = ioVar;
    }

    /* renamed from: g */
    public final Set mo81316g() {
        if (mo81263C()) {
            return ((PersonDisambiguation) this.f236203n).f236392h;
        }
        return C58733pz.f156496a;
    }
}
