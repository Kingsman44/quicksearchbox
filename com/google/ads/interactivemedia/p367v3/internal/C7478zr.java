package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zr */
/* compiled from: PG */
public final class C7478zr extends C7481zu {

    /* renamed from: a */
    public static final C7478zr f24602a = new C7478zr(BuildConfig.FLAVOR, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C6864cy) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: b */
    public final List f24603b;

    /* renamed from: c */
    public final List f24604c;

    /* renamed from: d */
    public final List f24605d;

    /* renamed from: e */
    public final List f24606e;

    /* renamed from: f */
    public final C6864cy f24607f;

    /* renamed from: g */
    public final List f24608g;

    /* renamed from: h */
    public final Map f24609h;

    /* renamed from: i */
    public final List f24610i;

    public C7478zr(String str, List list, List list2, List list3, List list4, List list5, List list6, C6864cy cyVar, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C7477zq) list2.get(i)).f24596a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m22700c(list3, arrayList);
        m22700c(list4, arrayList);
        m22700c(list5, arrayList);
        m22700c(list6, arrayList);
        this.f24603b = Collections.unmodifiableList(arrayList);
        this.f24604c = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f24605d = Collections.unmodifiableList(list4);
        this.f24606e = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f24607f = cyVar;
        this.f24608g = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f24609h = Collections.unmodifiableMap(map);
        this.f24610i = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static C7478zr m22699b(String str) {
        Uri parse = Uri.parse(str);
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S("0");
        cxVar.mo15609K("application/x-mpegURL");
        return new C7478zr(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(new C7477zq(parse, cxVar.mo15625a(), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C6864cy) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: c */
    private static void m22700c(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C7476zp) list.get(i)).f24593a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static List m22701d(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                C7289sr srVar = (C7289sr) list2.get(i3);
                if (srVar.f23761b == i && srVar.f23762c == i2) {
                    arrayList.add(obj);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16457a(List list) {
        return new C7478zr(this.f24637p, this.f24638q, m22701d(this.f24604c, 0, list), Collections.emptyList(), m22701d(this.f24605d, 1, list), m22701d(this.f24606e, 2, list), Collections.emptyList(), this.f24607f, this.f24608g, this.f24639r, this.f24609h, this.f24610i);
    }
}
