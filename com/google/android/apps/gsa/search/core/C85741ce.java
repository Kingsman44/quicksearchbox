package com.google.android.apps.gsa.search.core;

import android.content.SharedPreferences;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.contact.C87512aa;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.geller.p1815c.C21761b;
import com.google.android.libraries.geller.p1815c.C21763d;
import com.google.android.libraries.geller.p1815c.C21764e;
import com.google.android.libraries.geller.p1815c.C21765f;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.search.core.ce */
/* compiled from: PG */
public final class C85741ce implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public static final Object f231803a = new Object();

    /* renamed from: g */
    private static final C59071e f231804g = C59071e.m91332i("com.google.android.apps.gsa.search.core.ce");

    /* renamed from: b */
    public final Map f231805b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map f231806c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map f231807d = new ConcurrentHashMap();

    /* renamed from: e */
    public final C87512aa f231808e;

    /* renamed from: f */
    public final String f231809f;

    /* renamed from: h */
    private final Map f231810h = new ConcurrentHashMap();

    /* renamed from: i */
    private final C86338r f231811i;

    /* renamed from: j */
    private final C90931ca f231812j;

    /* renamed from: k */
    private final C86054o f231813k;

    /* renamed from: l */
    private String f231814l = BuildConfig.FLAVOR;

    public C85741ce(C86338r rVar, C87512aa aaVar, C90931ca caVar, C86054o oVar, String str) {
        aaVar.getClass();
        this.f231808e = aaVar;
        rVar.getClass();
        this.f231811i = rVar;
        this.f231812j = caVar;
        this.f231813k = oVar;
        this.f231809f = str;
        rVar.registerOnSharedPreferenceChangeListener(this);
        mo79391c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r5 = (java.util.Set) r3.f231807d.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r5 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r5.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r0 = (java.lang.String) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r4.equals(r3.f231808e.mo81617b(r0)) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        monitor-enter(r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m137773i(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.Object r0 = f231803a
            monitor-enter(r0)
            r1 = 0
            if (r5 == 0) goto L_0x003e
            java.util.Map r2 = r3.f231807d     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            monitor-enter(r0)
            java.util.Map r2 = r3.f231807d     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x003b }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            if (r5 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.util.Iterator r5 = r5.iterator()
        L_0x0021:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.apps.gsa.search.shared.contact.aa r2 = r3.f231808e
            java.lang.String r2 = r2.mo81617b(r0)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0021
            return r0
        L_0x003a:
            return r1
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return r1
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0043:
            throw r4
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85741ce.m137773i(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    private final void m137774j(Relationship relationship, String str) {
        String str2 = relationship.f236406b;
        String i = m137773i(str2, str);
        synchronized (f231803a) {
            if (i != null) {
                C21765f.m40883b(i, str, this.f231806c);
                C21765f.m40883b(str, i, this.f231807d);
            }
            C21765f.m40882a(str2, str, this.f231805b);
            C21765f.m40883b(str, str2, this.f231810h);
            C21765f.m40882a(relationship.f236405a, str, this.f231806c);
            C21765f.m40882a(str, relationship.f236405a, this.f231807d);
        }
    }

    /* renamed from: k */
    private static final void m137775k(Map map, C85740cd cdVar) {
        for (Map.Entry entry : map.entrySet()) {
            for (Object a : (Set) entry.getValue()) {
                cdVar.mo79205a(entry.getKey(), a);
            }
        }
    }

    /* renamed from: a */
    public final Set mo79389a(Person person) {
        boolean containsKey;
        Set<String> set;
        Object obj = f231803a;
        synchronized (obj) {
            containsKey = this.f231810h.containsKey(person.f236372c);
        }
        if (person.f236372c == null || !containsKey) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        new HashSet();
        synchronized (obj) {
            set = (Set) this.f231810h.get(person.f236372c);
        }
        if (set != null) {
            for (String str : set) {
                hashSet.add(new Relationship(str, str));
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo79390b(Relationship relationship, Person person) {
        C58801sm G = C58485gu.m89846n(new C85764e(relationship, person)).listIterator(0);
        while (G.hasNext()) {
            C85673bx bxVar = (C85673bx) G.next();
            Relationship b = bxVar.mo79204b();
            Person a = bxVar.mo79203a();
            m137774j(b, a.f236372c);
            a.mo81564o(b);
        }
        this.f231812j.mo85139d(new C85738cb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo79391c() {
        byte[] bArr;
        try {
            String string = this.f231811i.getString(this.f231809f, (String) null);
            if (string != null) {
                bArr = Base64.decode(string, 0);
                if (bArr != null) {
                    try {
                        C21764e eVar = (C21764e) C62942bv.parseFrom((C62942bv) C21764e.f60067e, bArr, C62921ba.m95368a());
                        synchronized (f231803a) {
                            this.f231806c.clear();
                            this.f231807d.clear();
                            this.f231805b.clear();
                            this.f231810h.clear();
                        }
                        for (C21763d dVar : eVar.f60070b) {
                            String str = dVar.f60066c;
                            Relationship a = this.f231808e.mo81616a(dVar.f60065b);
                            if (a != null) {
                                m137774j(a, str);
                            }
                        }
                        for (C21763d dVar2 : eVar.f60071c) {
                            String str2 = dVar2.f60066c;
                            Relationship a2 = this.f231808e.mo81616a(dVar2.f60065b);
                            if (a2 != null) {
                                mo79392d(a2, str2);
                            }
                        }
                        this.f231814l = eVar.f60072d;
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) f231804g.mo56226d()).mo56382g(e)).mo56372aa(7500)).mo56386p("Couldn't load relationship contact mapping.");
                        int i = C90755l.f253831a;
                    }
                }
            }
        } catch (ClassCastException unused) {
            bArr = this.f231811i.mo80079e(this.f231809f, (byte[]) null);
        }
    }

    /* renamed from: d */
    public final void mo79392d(Relationship relationship, String str) {
        String str2 = relationship.f236406b;
        String i = m137773i(str2, str);
        synchronized (f231803a) {
            if (i != null) {
                C21765f.m40883b(i, str, this.f231806c);
                C21765f.m40883b(str, i, this.f231807d);
                C21765f.m40883b(str2, str, this.f231805b);
            }
            C21765f.m40882a(str, str2, this.f231810h);
        }
    }

    /* renamed from: e */
    public final void mo79393e(Relationship relationship, Person person) {
        this.f231812j.mo85139d(new C85739cc(this, relationship, person));
    }

    /* renamed from: f */
    public final void mo79394f() {
        C21761b bVar = (C21761b) C21764e.f60067e.createBuilder();
        Object obj = f231803a;
        synchronized (obj) {
            m137775k(this.f231806c, new C85675bz(bVar));
        }
        synchronized (obj) {
            m137775k(this.f231810h, new C85681ca(bVar));
        }
        String g = C58837ba.m90858g(this.f231813k.mo79659F());
        bVar.copyOnWrite();
        C21764e eVar = (C21764e) bVar.instance;
        eVar.f60069a |= 1;
        eVar.f60072d = g;
        C90748e.m148224b();
        byte[] byteArray = ((C21764e) bVar.build()).toByteArray();
        C86337q b = this.f231811i.mo80076b();
        b.mo80073h(this.f231809f, Base64.encodeToString(byteArray, 0));
        b.apply();
    }

    /* renamed from: g */
    public final void mo79395g(Collection collection) {
        boolean containsKey;
        Set<String> set;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Person person = (Person) it.next();
            String str = person.f236372c;
            HashSet hashSet = null;
            if (!mo79396h()) {
                Object obj = f231803a;
                synchronized (obj) {
                    containsKey = this.f231807d.containsKey(str);
                }
                if (str != null && containsKey) {
                    new HashSet();
                    synchronized (obj) {
                        set = (Set) this.f231807d.get(str);
                    }
                    if (set != null) {
                        HashSet hashSet2 = new HashSet();
                        for (String str2 : set) {
                            String b = this.f231808e.mo81617b(str2);
                            if (b != null) {
                                hashSet2.add(new Relationship(str2, b));
                            }
                        }
                        if (!hashSet2.isEmpty()) {
                            hashSet = hashSet2;
                        }
                    }
                }
            }
            Set a = mo79389a(person);
            person.mo81565p(hashSet);
            person.f236388s.removeAll(a);
        }
    }

    /* renamed from: h */
    public final boolean mo79396h() {
        return this.f231809f.equalsIgnoreCase("opa_relationship_contact_info") && !this.f231814l.equalsIgnoreCase(C58837ba.m90858g(this.f231813k.mo79659F()));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("opa_relationship_contact_info".equals(str)) {
            mo79391c();
        }
    }

    public final String toString() {
        String str;
        synchronized (f231803a) {
            str = "Relationship to Contact: " + this.f231806c.toString() + "\nCanonical to Contact: " + this.f231805b.toString() + "\nContact to relationship: " + this.f231807d.toString() + "\nContact to removed relationship: " + this.f231810h.toString();
        }
        return str;
    }
}
