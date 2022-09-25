package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.ContactsContract;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55352pe;
import com.google.p4152bb.p4153a.C55353pf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.s */
/* compiled from: PG */
public final class C33163s implements C33148d {

    /* renamed from: a */
    public static final C59071e f88709a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.e.s");

    /* renamed from: b */
    static final String[] f88710b = {"_id", "lookup", "display_name"};

    /* renamed from: c */
    static final String[] f88711c = {"contact_id", "lookup", "display_name", "data1", "data2", "data3"};

    /* renamed from: d */
    static final String[] f88712d = {"contact_id", "lookup", "display_name", "data1", "data2", "data3"};

    /* renamed from: e */
    static final String[] f88713e = {"contact_id", "lookup", "account_name", "account_type", "sourceid", "raw_contact_id"};

    /* renamed from: f */
    static final String[] f88714f = {"contact_id", "lookup", "account_type", "mimetype", "data1", "data3", "_id"};

    /* renamed from: g */
    public final Context f88715g;

    /* renamed from: h */
    public final C46877q f88716h;

    /* renamed from: i */
    public final PackageManager f88717i;

    /* renamed from: j */
    public final C60887da f88718j;

    /* renamed from: k */
    private final AccountId f88719k;

    /* renamed from: l */
    private final C46128f f88720l;

    public C33163s(Context context, AccountId accountId, C46128f fVar, C46877q qVar, PackageManager packageManager, C60887da daVar) {
        this.f88715g = context;
        this.f88719k = accountId;
        this.f88720l = fVar;
        this.f88716h = qVar;
        this.f88717i = packageManager;
        this.f88718j = daVar;
    }

    /* renamed from: b */
    private static String m61525b(int i) {
        String d = new C58827ar(",").mo56097d(Collections.nCopies(i, "?"));
        return "(" + d + ")";
    }

    /* renamed from: a */
    public final C60870cx mo38557a(long j, List list) {
        C60870cx cxVar;
        if (this.f88715g.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            C60838bs g = this.f88716h.mo50872b(ContactsContract.Contacts.CONTENT_URI, f88710b, "_id = ?", new String[]{Long.toString(j)}, (String) null).f121591a.mo57272e(C47810es.m84970j(C33154j.f88697a), this.f88718j).mo57275g();
            C60838bs g2 = this.f88716h.mo50872b(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f88711c, "contact_id = ?", new String[]{Long.toString(j)}, (String) null).f121591a.mo57272e(C47810es.m84970j(new C33152h(this)), this.f88718j).mo57275g();
            C60838bs g3 = this.f88716h.mo50872b(ContactsContract.CommonDataKinds.Email.CONTENT_URI, f88712d, "contact_id = ?", new String[]{Long.toString(j)}, (String) null).f121591a.mo57272e(C47810es.m84970j(C33150f.f88692a), this.f88718j).mo57275g();
            C60870cx h = C60922j.m93045h(this.f88720l.mo50215b(this.f88719k), C47810es.m84966f(new C33151g(this, j)), this.f88718j);
            ArrayList c = C58597ky.m90212c(g, g2, g3, h);
            if (!list.isEmpty()) {
                C58485gu n = C58485gu.m89846n(Long.valueOf(j));
                if (list.isEmpty()) {
                    cxVar = C60856cj.m92900i(new HashMap());
                } else {
                    HashMap hashMap = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C51058ev evVar = (C51058ev) it.next();
                        int i = evVar.f132943a;
                        if ((i & 1) == 0) {
                            long j2 = j;
                        } else if ((i & 256) == 0 || (i & 1024) == 0) {
                            long j3 = j;
                        } else {
                            String str = evVar.f132944b;
                            C55352pe peVar = (C55352pe) C55353pf.f145846d.createBuilder();
                            String str2 = evVar.f132951i;
                            peVar.copyOnWrite();
                            C55353pf pfVar = (C55353pf) peVar.instance;
                            str2.getClass();
                            pfVar.f145849a |= 2;
                            pfVar.f145851c = str2;
                            String str3 = evVar.f132953k;
                            peVar.copyOnWrite();
                            C55353pf pfVar2 = (C55353pf) peVar.instance;
                            str3.getClass();
                            pfVar2.f145849a |= 1;
                            pfVar2.f145850b = str3;
                            hashMap.put(str, C58485gu.m89846n((C55353pf) peVar.build()));
                            long j4 = j;
                        }
                    }
                    int i2 = 0;
                    for (List size : hashMap.values()) {
                        i2 += size.size();
                    }
                    C58724pq pqVar = (C58724pq) n;
                    String[] strArr = new String[(pqVar.f156474d + i2 + i2)];
                    C58801sm G = n.listIterator(0);
                    int i3 = 0;
                    while (G.hasNext()) {
                        strArr[i3] = String.valueOf(((Long) G.next()).longValue());
                        i3++;
                    }
                    HashMap hashMap2 = new HashMap();
                    for (String str4 : hashMap.keySet()) {
                        List<C55353pf> list2 = (List) hashMap.get(str4);
                        list2.getClass();
                        for (C55353pf pfVar3 : list2) {
                            String str5 = pfVar3.f145851c;
                            strArr[i3] = str5;
                            String str6 = pfVar3.f145850b;
                            strArr[i3 + i2] = str6;
                            int i4 = i3 + 1;
                            C33146b bVar = new C33146b();
                            bVar.f88686a = str5;
                            bVar.f88687b = str6;
                            C33162r a = bVar.mo38551a();
                            ArrayList arrayList = (ArrayList) hashMap2.get(a);
                            if (arrayList == null) {
                                hashMap2.put(a, C58597ky.m90212c(str4));
                            } else {
                                arrayList.add(str4);
                            }
                            i3 = i4;
                        }
                    }
                    cxVar = this.f88716h.mo50872b(ContactsContract.Data.CONTENT_URI, f88714f, String.format("%s in %s AND %s in %s AND %s in %s", new Object[]{"contact_id", m61525b(pqVar.f156474d), "account_type", m61525b(i2), "mimetype", m61525b(i2)}), strArr, (String) null).f121591a.mo57272e(C47810es.m84970j(new C33149e(this, hashMap2)), this.f88718j).mo57275g();
                }
                c.add(cxVar);
            } else {
                cxVar = null;
            }
            return C47638k.m84750a(c).mo51520a(new C33158n(cxVar, j, g, g2, g3, h), this.f88718j);
        }
        ((C59052c) ((C59052c) f88709a.mo56224b()).mo56372aa(51194)).mo56386p("query(): READ_CONTACTS permission is not granted.");
        return C60856cj.m92900i(Optional.empty());
    }
}
