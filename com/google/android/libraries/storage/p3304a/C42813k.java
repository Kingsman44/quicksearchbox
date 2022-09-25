package com.google.android.libraries.storage.p3304a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42747h;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.storage.a.k */
/* compiled from: PG */
public final class C42813k {

    /* renamed from: a */
    public final Map f112076a;

    /* renamed from: b */
    public final Map f112077b;

    /* renamed from: c */
    public final List f112078c;

    public C42813k(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: k */
    private static final Uri m75636k(Uri uri) {
        return uri.buildUpon().fragment((String) null).build();
    }

    /* renamed from: l */
    private final C42776f m75637l(Uri uri) {
        C58485gu n = m75639n(uri);
        C42772e eVar = new C42772e();
        eVar.f112028a = this;
        eVar.f112029b = m75638m(uri.getScheme());
        eVar.f112031d = this.f112078c;
        eVar.f112030c = n;
        eVar.f112032e = uri;
        if (!n.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = n.listIterator(n.size());
                while (listIterator.hasPrevious()) {
                    ((C42805h) listIterator.previous()).mo45884f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment((String) null).build();
            }
        }
        eVar.f112033f = uri;
        return new C42776f(eVar);
    }

    /* renamed from: m */
    private final C42799b m75638m(String str) {
        C42799b bVar = (C42799b) this.f112076a.get(str);
        if (bVar != null) {
            return bVar;
        }
        throw new C42768u(String.format("Cannot open, unregistered backend: %s", new Object[]{str}));
    }

    /* renamed from: n */
    private final C58485gu m75639n(Uri uri) {
        C58480gp e = C58485gu.m89837e();
        C58485gu a = C42747h.m75524a(uri);
        int size = a.size();
        int i = 0;
        while (i < size) {
            String str = (String) a.get(i);
            C42805h hVar = (C42805h) this.f112077b.get(str);
            if (hVar != null) {
                e.mo55395g(hVar);
                i++;
            } else {
                String valueOf = String.valueOf(uri);
                throw new C42768u("No such transform: " + str + ": " + valueOf);
            }
        }
        return e.mo55394f().mo55401lD();
    }

    /* renamed from: a */
    public final long mo45887a(Uri uri) {
        C42776f l = m75637l(uri);
        return l.f112039b.mo45825a(l.f112043f);
    }

    /* renamed from: b */
    public final Iterable mo45888b(Uri uri) {
        C42799b m = m75638m(uri.getScheme());
        C58485gu<C42805h> n = m75639n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        for (Uri buildUpon : m.mo45829h(m75636k(uri))) {
            Uri build = buildUpon.buildUpon().encodedFragment(encodedFragment).build();
            if (!n.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) C58557jl.m90131l(arrayList2);
                    for (C42805h e : n) {
                        e.mo45883e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final Object mo45889c(Uri uri, C42797g gVar) {
        return gVar.mo34512a(m75637l(uri));
    }

    /* renamed from: d */
    public final void mo45890d(Uri uri) {
        m75638m(uri.getScheme()).mo45830j(m75636k(uri));
    }

    /* renamed from: e */
    public final void mo45891e(Uri uri) {
        m75638m(uri.getScheme()).mo45831k(m75636k(uri));
    }

    /* renamed from: f */
    public final void mo45892f(Uri uri) {
        C42776f l = m75637l(uri);
        l.f112039b.mo45832l(l.f112043f);
    }

    /* renamed from: g */
    public final void mo45893g(Uri uri, Uri uri2) {
        C42776f l = m75637l(uri);
        C42776f l2 = m75637l(uri2);
        C42799b bVar = l.f112039b;
        if (bVar == l2.f112039b) {
            bVar.mo45833m(l.f112043f, l2.f112043f);
            return;
        }
        throw new C42768u("Cannot rename file across backends");
    }

    /* renamed from: h */
    public final boolean mo45894h(Uri uri) {
        C42776f l = m75637l(uri);
        return l.f112039b.mo45816n(l.f112043f);
    }

    /* renamed from: i */
    public final boolean mo45895i(Uri uri) {
        return m75638m(uri.getScheme()).mo45834o(m75636k(uri));
    }

    @Deprecated
    /* renamed from: j */
    public final void mo45896j(Uri uri) {
        if (mo45894h(uri)) {
            if (!mo45895i(uri)) {
                mo45892f(uri);
                return;
            }
            for (Uri j : mo45888b(uri)) {
                mo45896j(j);
            }
            mo45891e(uri);
        }
    }

    public C42813k(List list, List list2, List list3) {
        this.f112076a = new HashMap();
        this.f112077b = new HashMap();
        this.f112078c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42799b bVar = (C42799b) it.next();
            if (TextUtils.isEmpty(bVar.mo45815i())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                C42799b bVar2 = (C42799b) this.f112076a.put(bVar.mo45815i(), bVar);
                if (bVar2 != null) {
                    String canonicalName = bVar2.getClass().getCanonicalName();
                    String canonicalName2 = bVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Cannot override Backend " + canonicalName + " with " + canonicalName2);
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C42805h hVar = (C42805h) it2.next();
            if (TextUtils.isEmpty(hVar.mo45881c())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                C42805h hVar2 = (C42805h) this.f112077b.put(hVar.mo45881c(), hVar);
                if (hVar2 != null) {
                    String canonicalName3 = hVar2.getClass().getCanonicalName();
                    String canonicalName4 = hVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Cannot to override Transform " + canonicalName3 + " with " + canonicalName4);
                }
            }
        }
        this.f112078c.addAll(list3);
    }
}
