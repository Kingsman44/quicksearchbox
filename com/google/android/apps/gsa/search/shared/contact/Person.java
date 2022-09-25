package com.google.android.apps.gsa.search.shared.contact;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55064en;
import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55067eq;
import com.google.p4152bb.p4153a.C55069es;
import com.google.p4152bb.p4153a.C55071eu;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55076ez;
import com.google.p4152bb.p4153a.C55078fa;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55097ft;
import com.google.p4152bb.p4153a.C55098fu;
import com.google.p4152bb.p4153a.C55099fv;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class Person implements Parcelable, C87521i {
    public static final Parcelable.Creator CREATOR = new C87519g();

    /* renamed from: v */
    private static final C59071e f236369v = C59071e.m91332i("com.google.android.apps.gsa.search.shared.contact.Person");

    /* renamed from: a */
    public final Locale f236370a;

    /* renamed from: b */
    public final long f236371b;

    /* renamed from: c */
    public final String f236372c;

    /* renamed from: d */
    public final String f236373d;

    /* renamed from: e */
    public final List f236374e;

    /* renamed from: f */
    public final List f236375f;

    /* renamed from: g */
    public final List f236376g;

    /* renamed from: h */
    public final List f236377h;

    /* renamed from: i */
    public final List f236378i;

    /* renamed from: j */
    public final List f236379j;

    /* renamed from: k */
    public final Map f236380k;

    /* renamed from: l */
    public double f236381l;

    /* renamed from: m */
    public boolean f236382m;

    /* renamed from: n */
    public String f236383n;

    /* renamed from: o */
    public String f236384o;

    /* renamed from: p */
    public Contact f236385p;

    /* renamed from: q */
    public long f236386q;

    /* renamed from: r */
    public long f236387r;

    /* renamed from: s */
    public final Set f236388s;

    /* renamed from: t */
    public final Set f236389t;

    /* renamed from: u */
    public int f236390u;

    /* renamed from: w */
    private C55370pw f236391w;

    public Person(long j, String str, String str2, Collection collection) {
        this.f236370a = Locale.ENGLISH;
        this.f236391w = C55370pw.UNKNOWN_SELECTION_TYPE;
        this.f236371b = j;
        this.f236372c = str;
        this.f236373d = str2;
        this.f236374e = new ArrayList();
        this.f236375f = new ArrayList();
        this.f236376g = new ArrayList();
        this.f236377h = new ArrayList();
        this.f236378i = new ArrayList();
        this.f236379j = new ArrayList();
        this.f236380k = new HashMap();
        this.f236388s = new HashSet();
        this.f236389t = new HashSet();
        mo81565p(collection);
        this.f236390u = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.p4152bb.p4153a.C55371px m142072G(com.google.p4152bb.p4153a.C55373pz r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.protobuf.cq r4 = r4.f145916b
            java.util.Iterator r4 = r4.iterator()
        L_0x000a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r4.next()
            com.google.bb.a.px r1 = (com.google.p4152bb.p4153a.C55371px) r1
            int r2 = r1.f145911c
            com.google.bb.a.pw r2 = com.google.p4152bb.p4153a.C55370pw.m87678a(r2)
            if (r2 != 0) goto L_0x0020
            com.google.bb.a.pw r2 = com.google.p4152bb.p4153a.C55370pw.UNKNOWN_SELECTION_TYPE
        L_0x0020:
            com.google.bb.a.pw r3 = com.google.p4152bb.p4153a.C55370pw.AUTOMATIC
            if (r2 == r3) goto L_0x0028
            com.google.bb.a.pw r3 = com.google.p4152bb.p4153a.C55370pw.USER_SELECTED
            if (r2 != r3) goto L_0x000a
        L_0x0028:
            return r1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.contact.Person.m142072G(com.google.bb.a.pz):com.google.bb.a.px");
    }

    /* renamed from: H */
    private static final C55373pz m142073H(int i) {
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
        return (C55373pz) pyVar.build();
    }

    /* renamed from: c */
    public static Person m142074c(Contact contact) {
        ArrayList<Contact> c = C58597ky.m90212c(contact);
        Person person = new Person((C87521i) c.get(0));
        for (Contact m : c) {
            m142077m(person, m);
        }
        return person;
    }

    /* renamed from: h */
    public static String m142075h(String str) {
        return (str == null || !str.endsWith("'s")) ? str : str.substring(0, str.length() - 2);
    }

    /* renamed from: l */
    public static List m142076l(List list, List list2) {
        Person person;
        ArrayList<Person> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Person person2 = (Person) it.next();
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    arrayList.add(person2);
                    break;
                }
                Person person3 = (Person) arrayList.get(i);
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        person = null;
                        break;
                    }
                    person = ((C87535w) it2.next()).mo81630a(person3, person2);
                    if (person != null) {
                        break;
                    }
                }
                if (person != null) {
                    arrayList.set(i, person);
                    break;
                }
                i++;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Person person4 : arrayList) {
            if (person4.f236382m) {
                arrayList3.add(person4);
            } else {
                arrayList2.add(person4);
            }
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    /* renamed from: m */
    public static void m142077m(Person person, Contact contact) {
        C87515c cVar = C87515c.EMAIL;
        int ordinal = contact.f236350a.ordinal();
        if (ordinal == 0) {
            person.f236375f.add(contact);
        } else if (ordinal == 1) {
            person.f236374e.add(contact);
        } else if (ordinal == 2) {
            person.f236376g.add(contact);
        } else if (ordinal == 3) {
            person.f236377h.add(contact);
        } else if (ordinal == 4) {
            List list = (List) person.f236380k.get(contact.f236356g);
            if (list == null) {
                list = new ArrayList();
                person.f236380k.put(contact.f236356g, list);
            }
            list.add(contact);
        }
    }

    @ProguardMustNotDelete
    public static List normalizeContacts(Iterable iterable) {
        Person person;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            long j = contact.f236351b;
            if (j > 0) {
                Long valueOf = Long.valueOf(j);
                if (linkedHashMap.containsKey(valueOf)) {
                    person = (Person) linkedHashMap.get(valueOf);
                } else {
                    Person person2 = new Person(contact);
                    linkedHashMap.put(valueOf, person2);
                    arrayList.add(person2);
                    person = person2;
                }
            } else {
                person = new Person(contact);
                arrayList.add(person);
            }
            m142077m(person, contact);
        }
        return arrayList;
    }

    /* renamed from: r */
    public static void m142078r(List list, List list2, C87512aa aaVar) {
        int i;
        List<String> c = aaVar.mo81618c((String) list2.get(0));
        Relationship a = aaVar.mo81616a((String) list2.get(0));
        if (c != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (String h : c) {
                String h2 = m142075h(h);
                if (!arrayList.contains(h2)) {
                    arrayList.add(h2);
                }
            }
            for (String str : arrayList) {
                if (!list2.contains(str)) {
                    list2.add(str);
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Person person = (Person) it.next();
            if (person.mo81527j() && (a == null || !person.mo81570u(a))) {
                ArrayList c2 = C58597ky.m90212c(person.f236373d.toLowerCase(Locale.US));
                if (Collections.unmodifiableSet(person.f236389t) != null && !Collections.unmodifiableSet(person.f236389t).isEmpty()) {
                    for (String lowerCase : Collections.unmodifiableSet(person.f236389t)) {
                        c2.add(lowerCase.toLowerCase(Locale.US));
                    }
                }
                int size = c2.size();
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i2 < size) {
                    String str2 = (String) c2.get(i2);
                    Iterator it2 = list2.iterator();
                    while (true) {
                        i = i2 + 1;
                        if (!it2.hasNext()) {
                            break;
                        }
                        String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.US);
                        if (str2.equals(lowerCase2)) {
                            z = true;
                        } else if (str2.contains(lowerCase2)) {
                            z2 = true;
                        }
                    }
                    i2 = i;
                }
                if (!z && z2) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    public static Person m142079x(C87514b bVar, String str, C55082fe feVar) {
        long j;
        ArrayList arrayList;
        C62971cq cqVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C55097ft ftVar;
        C55097ft ftVar2;
        C55097ft ftVar3;
        C87514b bVar2 = bVar;
        C55082fe feVar2 = feVar;
        boolean z = feVar2.f144933t;
        String str2 = feVar2.f144920g;
        if (!TextUtils.isEmpty(str2)) {
            try {
                j = ContentUris.parseId(Uri.parse(str2));
            } catch (UnsupportedOperationException e) {
                ((C59052c) ((C59052c) ((C59052c) f236369v.mo56225c()).mo56382g(e)).mo56372aa(9597)).mo56389s("ContactInformation has invalid ClientEntityId: %s", str2);
                return null;
            } catch (NumberFormatException e2) {
                ((C59052c) ((C59052c) ((C59052c) f236369v.mo56225c()).mo56382g(e2)).mo56372aa(9598)).mo56389s("ContactInformation has invalid ClientEntityId: %s", str2);
                return null;
            }
        } else {
            j = 0;
        }
        String str3 = feVar2.f144915b;
        String str4 = feVar2.f144919f;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        String str5 = feVar2.f144918e;
        C55370pw pwVar = C55370pw.UNKNOWN_SELECTION_TYPE;
        C55373pz pzVar = feVar2.f144922i;
        if (pzVar == null) {
            pzVar = C55373pz.f145913d;
        }
        C55371px G = m142072G(pzVar);
        String str6 = str4;
        C62971cq cqVar2 = feVar2.f144921h;
        boolean z2 = z;
        String str7 = str5;
        int i = 0;
        Contact contact = null;
        while (i < cqVar2.size()) {
            C55073ew ewVar = (C55073ew) cqVar2.get(i);
            ArrayList arrayList10 = arrayList9;
            if ((ewVar.f144882a & 2) != 0) {
                ftVar3 = ewVar.f144884c;
                if (ftVar3 == null) {
                    ftVar3 = C55097ft.f144980d;
                }
            } else {
                ftVar3 = null;
            }
            C62971cq cqVar3 = cqVar2;
            Contact contact2 = r7;
            HashMap hashMap2 = hashMap;
            ArrayList arrayList11 = arrayList8;
            ArrayList arrayList12 = arrayList7;
            ArrayList arrayList13 = arrayList6;
            ArrayList arrayList14 = arrayList5;
            String str8 = str3;
            ArrayList arrayList15 = arrayList4;
            Contact contact3 = new Contact(C87515c.PHONE_NUMBER, j, str7, str3, ewVar.f144883b, bVar2.mo81623c(ftVar3));
            arrayList15.add(contact2);
            if (G != null && G.f145910b == i) {
                C55370pw a = C55370pw.m87678a(G.f145911c);
                if (a == null) {
                    a = C55370pw.UNKNOWN_SELECTION_TYPE;
                }
                pwVar = a;
                contact = contact2;
            }
            i++;
            arrayList4 = arrayList15;
            arrayList9 = arrayList10;
            str3 = str8;
            cqVar2 = cqVar3;
            hashMap = hashMap2;
            arrayList8 = arrayList11;
            arrayList7 = arrayList12;
            arrayList6 = arrayList13;
            arrayList5 = arrayList14;
        }
        String str9 = str3;
        ArrayList arrayList16 = arrayList9;
        HashMap hashMap3 = hashMap;
        ArrayList arrayList17 = arrayList8;
        ArrayList arrayList18 = arrayList7;
        ArrayList arrayList19 = arrayList6;
        ArrayList arrayList20 = arrayList5;
        ArrayList arrayList21 = arrayList4;
        C55373pz pzVar2 = feVar2.f144924k;
        if (pzVar2 == null) {
            pzVar2 = C55373pz.f145913d;
        }
        C55371px G2 = m142072G(pzVar2);
        C62971cq cqVar4 = feVar2.f144923j;
        int i2 = 0;
        while (i2 < cqVar4.size()) {
            C55067eq eqVar = (C55067eq) cqVar4.get(i2);
            if ((eqVar.f144867a & 2) != 0) {
                ftVar2 = eqVar.f144869c;
                if (ftVar2 == null) {
                    ftVar2 = C55097ft.f144980d;
                }
            } else {
                ftVar2 = null;
            }
            C62971cq cqVar5 = cqVar4;
            Contact contact4 = r7;
            Contact contact5 = new Contact(C87515c.EMAIL, j, str7, str9, eqVar.f144868b, bVar2.mo81623c(ftVar2));
            ArrayList arrayList22 = arrayList20;
            arrayList22.add(contact4);
            if (G2 != null && G2.f145910b == i2) {
                C55370pw a2 = C55370pw.m87678a(G2.f145911c);
                if (a2 == null) {
                    a2 = C55370pw.UNKNOWN_SELECTION_TYPE;
                }
                contact = contact4;
                pwVar = a2;
            }
            i2++;
            arrayList20 = arrayList22;
            cqVar4 = cqVar5;
        }
        ArrayList arrayList23 = arrayList20;
        C55373pz pzVar3 = feVar2.f144926m;
        if (pzVar3 == null) {
            pzVar3 = C55373pz.f145913d;
        }
        C55371px G3 = m142072G(pzVar3);
        C62971cq cqVar6 = feVar2.f144925l;
        int i3 = 0;
        while (i3 < cqVar6.size()) {
            C55071eu euVar = (C55071eu) cqVar6.get(i3);
            C55112gh ghVar = euVar.f144878b;
            if (ghVar == null) {
                ghVar = C55112gh.f145017p;
            }
            if ((ghVar.f145019a & C89885b.HTTP_VALUE) != 0) {
                if ((euVar.f144877a & 2) != 0) {
                    ftVar = euVar.f144879c;
                    if (ftVar == null) {
                        ftVar = C55097ft.f144980d;
                    }
                } else {
                    ftVar = null;
                }
                String c = bVar2.mo81623c(ftVar);
                Contact contact6 = r7;
                cqVar = cqVar6;
                arrayList3 = arrayList23;
                Contact contact7 = new Contact(C87515c.POSTAL_ADDRESS, j, str7, str9, ghVar.f145028j, c);
                arrayList2 = arrayList19;
                arrayList2.add(contact6);
                if (G3 != null && G3.f145910b == i3) {
                    C55370pw a3 = C55370pw.m87678a(G3.f145911c);
                    if (a3 == null) {
                        a3 = C55370pw.UNKNOWN_SELECTION_TYPE;
                    }
                    contact = contact6;
                    pwVar = a3;
                }
            } else {
                cqVar = cqVar6;
                arrayList3 = arrayList23;
                arrayList2 = arrayList19;
            }
            i3++;
            bVar2 = bVar;
            arrayList19 = arrayList2;
            arrayList23 = arrayList3;
            cqVar6 = cqVar;
        }
        ArrayList arrayList24 = arrayList23;
        ArrayList arrayList25 = arrayList19;
        C55373pz pzVar4 = feVar2.f144928o;
        if (pzVar4 == null) {
            pzVar4 = C55373pz.f145913d;
        }
        C55371px G4 = m142072G(pzVar4);
        C62971cq cqVar7 = feVar2.f144927n;
        int i4 = 0;
        while (i4 < cqVar7.size()) {
            C55069es esVar = (C55069es) cqVar7.get(i4);
            C62971cq cqVar8 = cqVar7;
            Contact contact8 = r7;
            ArrayList arrayList26 = arrayList25;
            Contact contact9 = new Contact(C87515c.GAIA_ID, j, str7, str9, esVar.f144874c, (esVar.f144872a & 1) != 0 ? esVar.f144873b : null);
            ArrayList arrayList27 = arrayList18;
            arrayList27.add(contact8);
            if (G4 != null && G4.f145910b == i4) {
                C55370pw a4 = C55370pw.m87678a(G4.f145911c);
                if (a4 == null) {
                    a4 = C55370pw.UNKNOWN_SELECTION_TYPE;
                }
                contact = contact8;
                pwVar = a4;
            }
            i4++;
            arrayList18 = arrayList27;
            cqVar7 = cqVar8;
            arrayList25 = arrayList26;
        }
        ArrayList arrayList28 = arrayList25;
        ArrayList arrayList29 = arrayList18;
        C55373pz pzVar5 = feVar2.f144930q;
        if (pzVar5 == null) {
            pzVar5 = C55373pz.f145913d;
        }
        C55371px G5 = m142072G(pzVar5);
        C62971cq cqVar9 = feVar2.f144929p;
        C55370pw pwVar2 = pwVar;
        Contact contact10 = contact;
        int i5 = 0;
        while (i5 < cqVar9.size()) {
            C55064en enVar = (C55064en) cqVar9.get(i5);
            HashMap hashMap4 = hashMap3;
            List list = (List) hashMap4.get(enVar.f144861b);
            if (list == null) {
                list = new ArrayList();
                hashMap4.put(enVar.f144861b, list);
            }
            List list2 = list;
            C62971cq cqVar10 = cqVar9;
            C55370pw pwVar3 = pwVar2;
            Contact contact11 = r7;
            ArrayList arrayList30 = arrayList24;
            HashMap hashMap5 = hashMap4;
            ArrayList arrayList31 = arrayList21;
            C55064en enVar2 = enVar;
            Contact contact12 = contact10;
            long j2 = j;
            int i6 = i5;
            ArrayList arrayList32 = arrayList29;
            Contact contact13 = new Contact(C87515c.APP_SPECIFIC_ENDPOINT_ID, j, str7, str9, enVar.f144863d, enVar.f144864e);
            contact11.f236356g = enVar2.f144861b;
            contact11.f236357h = enVar2.f144862c;
            list2.add(contact11);
            if (G5 == null || G5.f145910b != i6) {
                pwVar2 = pwVar3;
                contact10 = contact12;
            } else {
                C55370pw a5 = C55370pw.m87678a(G5.f145911c);
                if (a5 == null) {
                    a5 = C55370pw.UNKNOWN_SELECTION_TYPE;
                }
                contact10 = contact11;
                pwVar2 = a5;
            }
            i5 = i6 + 1;
            arrayList29 = arrayList32;
            arrayList21 = arrayList31;
            cqVar9 = cqVar10;
            j = j2;
            arrayList24 = arrayList30;
            hashMap3 = hashMap5;
        }
        ArrayList arrayList33 = arrayList21;
        long j3 = j;
        ArrayList arrayList34 = arrayList24;
        Contact contact14 = contact10;
        ArrayList arrayList35 = arrayList29;
        C55370pw pwVar4 = pwVar2;
        HashMap hashMap6 = hashMap3;
        if (!feVar2.f144931r.isEmpty()) {
            arrayList = arrayList17;
            arrayList.add(new Contact(C87515c.PERSON, j3, str7, str9, feVar2.f144931r, "com.google"));
        } else {
            arrayList = arrayList17;
        }
        for (C55099fv fvVar : feVar2.f144932s) {
            ArrayList arrayList36 = arrayList16;
            arrayList36.add(new Contact(C87515c.PERSON, j3, str7, fvVar.f144989c, fvVar.f144990d, fvVar.f144988b));
        }
        Person person = new Person(j3, str7, str9, (Collection) null);
        person.f236382m = z2;
        person.mo81552D(arrayList33);
        person.mo81549A(arrayList34);
        person.mo81553E(arrayList28);
        person.mo81551C(arrayList35);
        person.mo81575z(hashMap6);
        person.mo81550B(arrayList);
        person.mo81554F(arrayList16);
        person.f236384o = str6;
        person.f236383n = str;
        C55370pw pwVar5 = pwVar4;
        if (pwVar5 == C55370pw.USER_SELECTED) {
            person.mo81568t(contact14);
        } else {
            Contact contact15 = contact14;
            if (pwVar5 == C55370pw.AUTOMATIC) {
                person.mo81567s(contact15);
            }
        }
        for (C55078fa faVar : feVar2.f144916c) {
            String str10 = faVar.f144904b;
            String str11 = faVar.f144905c;
            if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str10)) {
                ((C59052c) ((C59052c) f236369v.mo56225c()).mo56372aa(9596)).mo56354G("Received relationship with empty name: c=\"%s\", o=\"%s\".", str10, str11);
            } else {
                person.mo81564o(new Relationship(str11, str10));
            }
        }
        for (String n : feVar2.f144917d) {
            person.mo81563n(n);
        }
        return person;
    }

    /* renamed from: A */
    public final void mo81549A(List list) {
        this.f236375f.clear();
        this.f236375f.addAll(list);
    }

    /* renamed from: B */
    public final void mo81550B(List list) {
        this.f236378i.clear();
        this.f236378i.addAll(list);
    }

    /* renamed from: C */
    public final void mo81551C(List list) {
        this.f236377h.clear();
        this.f236377h.addAll(list);
    }

    /* renamed from: D */
    public final void mo81552D(List list) {
        this.f236374e.clear();
        List list2 = this.f236374e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            if (contact.mo81529l() && (contact.f236350a != C87515c.PHONE_NUMBER || !TextUtils.isEmpty(PhoneNumberUtils.normalizeNumber(contact.f236354e)))) {
                arrayList.add(contact);
            }
        }
        list2.addAll(arrayList);
    }

    /* renamed from: E */
    public final void mo81553E(List list) {
        this.f236376g.clear();
        this.f236376g.addAll(list);
    }

    /* renamed from: F */
    public final void mo81554F(List list) {
        this.f236379j.clear();
        this.f236379j.addAll(list);
    }

    /* renamed from: a */
    public final long mo81518a() {
        return this.f236371b;
    }

    /* renamed from: b */
    public final Uri mo81555b() {
        if (this.f236374e.size() != 1 || ((Contact) this.f236374e.get(0)).mo81527j()) {
            return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.f236371b);
        }
        return new Uri.Builder().scheme("tel").opaquePart(((Contact) this.f236374e.get(0)).f236354e).build();
    }

    /* renamed from: d */
    public final C55082fe mo81556d(C87514b bVar, Contact contact) {
        C55065eo eoVar = (C55065eo) C55082fe.f144912z.createBuilder();
        if (mo81527j()) {
            String str = this.f236373d;
            eoVar.copyOnWrite();
            C55082fe feVar = (C55082fe) eoVar.instance;
            str.getClass();
            feVar.f144914a |= 1;
            feVar.f144915b = str;
            String l = Long.toString(this.f236371b);
            eoVar.copyOnWrite();
            C55082fe feVar2 = (C55082fe) eoVar.instance;
            l.getClass();
            feVar2.f144914a |= 16;
            feVar2.f144920g = l;
        }
        if (!C58837ba.m90859h(this.f236372c)) {
            String str2 = this.f236372c;
            eoVar.copyOnWrite();
            C55082fe feVar3 = (C55082fe) eoVar.instance;
            str2.getClass();
            feVar3.f144914a |= 4;
            feVar3.f144918e = str2;
        }
        if (!this.f236388s.isEmpty()) {
            for (Relationship relationship : this.f236388s) {
                C55076ez ezVar = (C55076ez) C55078fa.f144901d.createBuilder();
                String str3 = relationship.f236405a;
                ezVar.copyOnWrite();
                C55078fa faVar = (C55078fa) ezVar.instance;
                str3.getClass();
                faVar.f144903a |= 2;
                faVar.f144905c = str3;
                String str4 = relationship.f236406b;
                ezVar.copyOnWrite();
                C55078fa faVar2 = (C55078fa) ezVar.instance;
                str4.getClass();
                faVar2.f144903a |= 1;
                faVar2.f144904b = str4;
                eoVar.copyOnWrite();
                C55082fe feVar4 = (C55082fe) eoVar.instance;
                C55078fa faVar3 = (C55078fa) ezVar.build();
                faVar3.getClass();
                C62971cq cqVar = feVar4.f144916c;
                if (!cqVar.mo58948c()) {
                    feVar4.f144916c = C62942bv.mutableCopy(cqVar);
                }
                feVar4.f144916c.add(faVar3);
            }
        }
        if (!this.f236389t.isEmpty()) {
            Set set = this.f236389t;
            eoVar.copyOnWrite();
            C55082fe feVar5 = (C55082fe) eoVar.instance;
            C62971cq cqVar2 = feVar5.f144917d;
            if (!cqVar2.mo58948c()) {
                feVar5.f144917d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) set, (List) feVar5.f144917d);
        }
        boolean z = false;
        for (int i = 0; i < this.f236374e.size(); i++) {
            Contact contact2 = (Contact) this.f236374e.get(i);
            contact2.mo81524h(bVar, eoVar);
            if (contact2.equals(contact)) {
                C55373pz H = m142073H(i);
                eoVar.copyOnWrite();
                C55082fe feVar6 = (C55082fe) eoVar.instance;
                H.getClass();
                feVar6.f144922i = H;
                feVar6.f144914a |= 32;
                z = true;
            }
        }
        for (int i2 = 0; i2 < this.f236375f.size(); i2++) {
            Contact contact3 = (Contact) this.f236375f.get(i2);
            contact3.mo81524h(bVar, eoVar);
            if (contact3.equals(contact)) {
                C55373pz H2 = m142073H(i2);
                eoVar.copyOnWrite();
                C55082fe feVar7 = (C55082fe) eoVar.instance;
                H2.getClass();
                feVar7.f144924k = H2;
                feVar7.f144914a |= 64;
                z = true;
            }
        }
        for (int i3 = 0; i3 < this.f236376g.size(); i3++) {
            Contact contact4 = (Contact) this.f236376g.get(i3);
            contact4.mo81524h(bVar, eoVar);
            if (contact4.equals(contact)) {
                C55373pz H3 = m142073H(i3);
                eoVar.copyOnWrite();
                C55082fe feVar8 = (C55082fe) eoVar.instance;
                H3.getClass();
                feVar8.f144926m = H3;
                feVar8.f144914a |= 128;
                z = true;
            }
        }
        for (int i4 = 0; i4 < this.f236377h.size(); i4++) {
            Contact contact5 = (Contact) this.f236377h.get(i4);
            contact5.mo81524h(bVar, eoVar);
            if (contact5.equals(contact)) {
                C55373pz H4 = m142073H(i4);
                eoVar.copyOnWrite();
                C55082fe feVar9 = (C55082fe) eoVar.instance;
                H4.getClass();
                feVar9.f144928o = H4;
                feVar9.f144914a |= 256;
                z = true;
            }
        }
        List i5 = mo81561i();
        for (int i6 = 0; i6 < i5.size(); i6++) {
            Contact contact6 = (Contact) i5.get(i6);
            contact6.mo81524h(bVar, eoVar);
            if (contact6.equals(contact)) {
                C55373pz H5 = m142073H(i6);
                eoVar.copyOnWrite();
                C55082fe feVar10 = (C55082fe) eoVar.instance;
                H5.getClass();
                feVar10.f144930q = H5;
                feVar10.f144914a |= 512;
                z = true;
            }
        }
        if (!this.f236378i.isEmpty()) {
            String str5 = ((Contact) this.f236378i.get(0)).f236354e;
            eoVar.copyOnWrite();
            C55082fe feVar11 = (C55082fe) eoVar.instance;
            str5.getClass();
            feVar11.f144914a |= 1024;
            feVar11.f144931r = str5;
        }
        for (Contact contact7 : this.f236379j) {
            C55098fu fuVar = (C55098fu) C55099fv.f144985e.createBuilder();
            String str6 = contact7.f236354e;
            fuVar.copyOnWrite();
            C55099fv fvVar = (C55099fv) fuVar.instance;
            str6.getClass();
            fvVar.f144987a |= 4;
            fvVar.f144990d = str6;
            String str7 = contact7.f236355f;
            fuVar.copyOnWrite();
            C55099fv fvVar2 = (C55099fv) fuVar.instance;
            str7.getClass();
            fvVar2.f144987a |= 1;
            fvVar2.f144988b = str7;
            String str8 = contact7.f236353d;
            fuVar.copyOnWrite();
            C55099fv fvVar3 = (C55099fv) fuVar.instance;
            str8.getClass();
            fvVar3.f144987a |= 2;
            fvVar3.f144989c = str8;
            C55099fv fvVar4 = (C55099fv) fuVar.build();
            eoVar.copyOnWrite();
            C55082fe feVar12 = (C55082fe) eoVar.instance;
            fvVar4.getClass();
            C62971cq cqVar3 = feVar12.f144932s;
            if (!cqVar3.mo58948c()) {
                feVar12.f144932s = C62942bv.mutableCopy(cqVar3);
            }
            feVar12.f144932s.add(fvVar4);
        }
        if (z) {
            C87515c cVar = contact.f236350a;
            if (!cVar.equals(C87515c.PHONE_NUMBER)) {
                C55373pz pzVar = C55373pz.f145913d;
                eoVar.copyOnWrite();
                C55082fe feVar13 = (C55082fe) eoVar.instance;
                pzVar.getClass();
                feVar13.f144922i = pzVar;
                feVar13.f144914a |= 32;
            }
            if (!cVar.equals(C87515c.EMAIL)) {
                C55373pz pzVar2 = C55373pz.f145913d;
                eoVar.copyOnWrite();
                C55082fe feVar14 = (C55082fe) eoVar.instance;
                pzVar2.getClass();
                feVar14.f144924k = pzVar2;
                feVar14.f144914a |= 64;
            }
            if (!cVar.equals(C87515c.POSTAL_ADDRESS)) {
                C55373pz pzVar3 = C55373pz.f145913d;
                eoVar.copyOnWrite();
                C55082fe feVar15 = (C55082fe) eoVar.instance;
                pzVar3.getClass();
                feVar15.f144926m = pzVar3;
                feVar15.f144914a |= 128;
            }
            if (!cVar.equals(C87515c.GAIA_ID)) {
                C55373pz pzVar4 = C55373pz.f145913d;
                eoVar.copyOnWrite();
                C55082fe feVar16 = (C55082fe) eoVar.instance;
                pzVar4.getClass();
                feVar16.f144928o = pzVar4;
                feVar16.f144914a |= 256;
            }
            if (!cVar.equals(C87515c.APP_SPECIFIC_ENDPOINT_ID)) {
                C55373pz pzVar5 = C55373pz.f145913d;
                eoVar.copyOnWrite();
                C55082fe feVar17 = (C55082fe) eoVar.instance;
                pzVar5.getClass();
                feVar17.f144930q = pzVar5;
                feVar17.f144914a |= 512;
            }
        }
        boolean z2 = this.f236382m;
        eoVar.copyOnWrite();
        C55082fe feVar18 = (C55082fe) eoVar.instance;
        feVar18.f144914a |= 8192;
        feVar18.f144933t = z2;
        return (C55082fe) eoVar.build();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo81521e() {
        return this.f236372c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Person) && ((Person) obj).f236371b == this.f236371b;
    }

    /* renamed from: f */
    public final String mo81523f() {
        return this.f236373d;
    }

    /* renamed from: g */
    public final String mo81559g() {
        String str = this.f236373d;
        if (str == null) {
            return null;
        }
        return str.toLowerCase(this.f236370a);
    }

    public final int hashCode() {
        return (int) this.f236371b;
    }

    /* renamed from: i */
    public final List mo81561i() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f236380k.keySet()) {
            arrayList.addAll((Collection) this.f236380k.get(str));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final boolean mo81527j() {
        return !TextUtils.isEmpty(this.f236373d);
    }

    /* renamed from: k */
    public final List mo81562k(Set set, Set set2) {
        List list;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C87515c cVar = C87515c.EMAIL;
            int ordinal = ((C87515c) it.next()).ordinal();
            if (ordinal == 0) {
                arrayList.addAll(this.f236375f);
            } else if (ordinal == 1) {
                arrayList.addAll(this.f236374e);
            } else if (ordinal == 2) {
                arrayList.addAll(this.f236376g);
            } else if (ordinal == 3) {
                arrayList.addAll(this.f236377h);
            } else if (ordinal != 4) {
                arrayList.addAll(this.f236377h);
                arrayList.addAll(this.f236375f);
                arrayList.addAll(this.f236374e);
                arrayList.addAll(this.f236376g);
            } else {
                if (set2 != null) {
                    list = new ArrayList();
                    C58565jt jtVar = new C58565jt(((C58759qy) set2).f156534a);
                    while (jtVar.hasNext()) {
                        C55361pn pnVar = (C55361pn) jtVar.next();
                        C62940bt r4 = C62942bv.checkIsLite(C55355ph.f145853f);
                        pnVar.mo58887l(r4);
                        if (pnVar.f169962ag.mo58857o(r4.f169971d)) {
                            C62940bt r42 = C62942bv.checkIsLite(C55355ph.f145853f);
                            pnVar.mo58887l(r42);
                            Object l = pnVar.f169962ag.mo58854l(r42.f169971d);
                            if (l == null) {
                                obj = r42.f169969b;
                            } else {
                                obj = r42.mo58889c(l);
                            }
                            String str = ((C55355ph) obj).f145856b;
                            if (this.f236380k.containsKey(str)) {
                                list.addAll((Collection) this.f236380k.get(str));
                            }
                        }
                    }
                } else {
                    list = mo81561i();
                }
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void mo81563n(String str) {
        this.f236389t.add(str);
    }

    /* renamed from: o */
    public final void mo81564o(Relationship relationship) {
        if (this.f236388s.contains(relationship)) {
            this.f236388s.remove(relationship);
        }
        this.f236388s.add(relationship);
    }

    /* renamed from: p */
    public final void mo81565p(Collection collection) {
        if (collection != null) {
            this.f236388s.addAll(collection);
        }
    }

    /* renamed from: q */
    public final void mo81566q() {
        this.f236385p = null;
        this.f236391w = C55370pw.UNKNOWN_SELECTION_TYPE;
    }

    public final String toString() {
        long j = this.f236371b;
        String str = this.f236373d;
        return "Person : ID = " + j + " : Name = " + str;
    }

    /* renamed from: u */
    public final boolean mo81570u(Relationship relationship) {
        return this.f236388s.contains(relationship);
    }

    /* renamed from: v */
    public final boolean mo81571v(C87521i iVar) {
        return iVar != null && iVar.mo81527j() && mo81527j() && this.f236373d.equals(iVar.mo81523f());
    }

    /* renamed from: w */
    public final boolean mo81572w() {
        return !TextUtils.isEmpty(this.f236384o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f236371b);
        parcel.writeDouble(this.f236381l);
        parcel.writeLong(this.f236386q);
        parcel.writeLong(this.f236387r);
        parcel.writeString(this.f236372c);
        parcel.writeString(this.f236373d);
        parcel.writeString(this.f236383n);
        parcel.writeByte(this.f236382m ? (byte) 1 : 0);
        parcel.writeList(this.f236374e);
        parcel.writeList(this.f236375f);
        parcel.writeList(this.f236376g);
        parcel.writeList(this.f236377h);
        parcel.writeString(this.f236384o);
        parcel.writeList(C58597ky.m90211b(this.f236388s));
        parcel.writeList(C58597ky.m90211b(this.f236389t));
        parcel.writeInt(this.f236390u);
        parcel.writeInt(this.f236391w.f145906f);
        parcel.writeParcelable(this.f236385p, i);
        parcel.writeList(this.f236378i);
        parcel.writeList(this.f236379j);
    }

    /* renamed from: z */
    public final void mo81575z(Map map) {
        this.f236380k.clear();
        this.f236380k.putAll(map);
    }

    /* renamed from: s */
    public final void mo81567s(Contact contact) {
        contact.getClass();
        this.f236385p = contact;
        this.f236391w = C55370pw.AUTOMATIC;
    }

    /* renamed from: t */
    public final void mo81568t(Contact contact) {
        contact.getClass();
        this.f236385p = contact;
        this.f236391w = C55370pw.USER_SELECTED;
    }

    public Person(C87521i iVar) {
        this(iVar.mo81518a(), iVar.mo81521e(), iVar.mo81523f(), (Collection) null);
    }

    /* renamed from: y */
    public final void mo81574y(Person person) {
        person.getClass();
        boolean z = false;
        if (this.f236382m && person.f236382m) {
            z = true;
        }
        this.f236382m = z;
        if (!person.f236388s.isEmpty()) {
            for (Relationship o : Collections.unmodifiableSet(person.f236388s)) {
                mo81564o(o);
            }
        }
        ArrayList b = C58597ky.m90211b(C58485gu.m89842j(this.f236374e));
        b.addAll(C58485gu.m89842j(person.f236374e));
        mo81552D(Contact.m142047g(b));
        ArrayList b2 = C58597ky.m90211b(C58485gu.m89842j(this.f236375f));
        b2.addAll(C58485gu.m89842j(person.f236375f));
        mo81549A(Contact.m142047g(b2));
        ArrayList b3 = C58597ky.m90211b(C58485gu.m89842j(this.f236376g));
        b3.addAll(C58485gu.m89842j(person.f236376g));
        mo81553E(Contact.m142047g(b3));
        C58485gu j = C58485gu.m89842j(person.f236377h);
        ArrayList d = C58597ky.m90213d(j.size() + this.f236377h.size());
        d.addAll(this.f236377h);
        d.addAll(j);
        mo81551C(Contact.m142047g(d));
        ArrayList b4 = C58597ky.m90211b(C58485gu.m89842j(this.f236378i));
        b4.addAll(C58485gu.m89842j(person.f236378i));
        mo81550B(Contact.m142047g(b4));
        ArrayList b5 = C58597ky.m90211b(C58485gu.m89842j(this.f236379j));
        b5.addAll(C58485gu.m89842j(person.f236379j));
        mo81554F(Contact.m142047g(b5));
        for (String str : C58495hd.m89898l(person.f236380k).keySet()) {
            List list = (List) C58495hd.m89898l(person.f236380k).get(str);
            if (!this.f236380k.containsKey(str)) {
                this.f236380k.put(str, list);
            } else {
                List list2 = (List) this.f236380k.get(str);
                list2.addAll(list);
                this.f236380k.put(str, Contact.m142047g(list2));
            }
        }
    }
}
