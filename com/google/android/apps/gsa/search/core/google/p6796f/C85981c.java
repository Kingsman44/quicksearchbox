package com.google.android.apps.gsa.search.core.google.p6796f;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.f.c */
/* compiled from: PG */
public final class C85981c {

    /* renamed from: i */
    private static final C59071e f232492i = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.f.c");

    /* renamed from: a */
    public Uri f232493a;

    /* renamed from: b */
    public String f232494b;

    /* renamed from: c */
    public final Map f232495c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f232496d = new HashMap();

    /* renamed from: e */
    public final Map f232497e = new HashMap();

    /* renamed from: f */
    public final Map f232498f = new HashMap();

    /* renamed from: g */
    public Map f232499g;

    /* renamed from: h */
    public byte[] f232500h;

    /* renamed from: a */
    public static Map m138234a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(Uri.encode((String) entry.getKey()), Uri.encode((String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    private static final void m138235h(Map map, List list) {
        HashSet hashSet = new HashSet(map.keySet());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            i += map2.size();
            map.putAll(map2);
        }
        if (map.size() < hashSet.size() + i) {
            HashSet hashSet2 = new HashSet();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                for (String str : ((Map) it2.next()).keySet()) {
                    if (!hashSet.add(str)) {
                        hashSet2.add(str);
                    }
                }
            }
            if (!hashSet2.isEmpty()) {
                throw new IllegalStateException("Overlapping in UriRequestData for the following keys: ".concat(hashSet2.toString()));
            }
        }
    }

    /* renamed from: b */
    public final void mo79636b(C85981c... cVarArr) {
        for (C85981c cVar : cVarArr) {
            Uri uri = cVar.f232493a;
            if (uri != null) {
                mo79640f(uri);
            }
        }
        for (C85981c cVar2 : cVarArr) {
            String str = cVar2.f232494b;
            if (str != null) {
                mo79639e(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C85981c cVar3 : cVarArr) {
            arrayList.add(cVar3.f232495c);
        }
        m138235h(this.f232495c, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C85981c cVar4 : cVarArr) {
            arrayList2.add(cVar4.f232496d);
        }
        m138235h(this.f232496d, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (C85981c cVar5 : cVarArr) {
            arrayList3.add(cVar5.f232497e);
        }
        m138235h(this.f232497e, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (C85981c cVar6 : cVarArr) {
            arrayList4.add(cVar6.f232498f);
        }
        m138235h(this.f232498f, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Map map = this.f232499g;
        if (map != null) {
            arrayList5.add(map);
        }
        for (C85981c cVar7 : cVarArr) {
            Map map2 = cVar7.f232499g;
            if (map2 != null) {
                arrayList5.add(map2);
            }
        }
        if (!arrayList5.isEmpty()) {
            Map map3 = (Map) arrayList5.remove(arrayList5.size() - 1);
            this.f232499g = map3;
            m138235h(map3, arrayList5);
        }
        for (C85981c cVar8 : cVarArr) {
            byte[] bArr = cVar8.f232500h;
        }
    }

    /* renamed from: d */
    public final void mo79638d(String str, String str2) {
        mo79637c(this.f232495c, Uri.encode(str), Uri.encode(str2));
    }

    /* renamed from: e */
    public final void mo79639e(String str) {
        C58838bb.m90884s(this.f232494b == null, "URL fragment shouldn't be overwritten.");
        this.f232494b = str;
    }

    /* renamed from: f */
    public final void mo79640f(Uri uri) {
        C58838bb.m90884s(this.f232493a == null, "Base Uri shouldn't be overwritten");
        this.f232493a = uri;
    }

    /* renamed from: g */
    public final void mo79641g() {
        mo79637c(this.f232495c, "async", "_fmt:pb");
    }

    /* renamed from: c */
    public final void mo79637c(Map map, String str, Object obj) {
        obj.getClass();
        if ((obj instanceof String) && TextUtils.isEmpty((String) obj) && !str.equals("q")) {
            ((C59052c) ((C59052c) f232492i.mo56226d()).mo56372aa(8186)).mo56389s("URL param or header with a key: \"%s\" has an empty value.", str);
        }
        Object put = map.put(str, obj);
        if (put == null) {
            return;
        }
        if (put.equals(obj)) {
            C59052c cVar = (C59052c) f232492i.mo56226d();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(8185)).mo56354G("URL param or header written twice with same value. Key: %s, value: \"%s\"", str, put);
            return;
        }
        ((C59052c) ((C59052c) f232492i.mo56226d()).mo56372aa(8184)).mo56359L("URL param or header written twice. Key: %s, old value: \"%s\", new value: \"%s\"", str, put, obj);
        int i = C90755l.f253831a;
    }
}
