package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.StreamKey;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.hls.a.o */
/* compiled from: PG */
public final class C3147o extends C3148p {

    /* renamed from: a */
    public static final C3147o f9303a = new C3147o(BuildConfig.FLAVOR, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C2680x) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: b */
    public final List f9304b;

    /* renamed from: c */
    public final List f9305c;

    /* renamed from: d */
    public final List f9306d;

    /* renamed from: e */
    public final List f9307e;

    /* renamed from: f */
    public final List f9308f;

    /* renamed from: g */
    public final List f9309g;

    /* renamed from: h */
    public final C2680x f9310h;

    /* renamed from: i */
    public final List f9311i;

    /* renamed from: j */
    public final Map f9312j;

    /* renamed from: k */
    public final List f9313k;

    public C3147o(String str, List list, List list2, List list3, List list4, List list5, List list6, C2680x xVar, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C3146n) list2.get(i)).f9297a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m9186c(list3, arrayList);
        m9186c(list4, arrayList);
        m9186c(list5, arrayList);
        m9186c(list6, arrayList);
        this.f9304b = Collections.unmodifiableList(arrayList);
        this.f9305c = Collections.unmodifiableList(list2);
        this.f9306d = Collections.unmodifiableList(list3);
        this.f9307e = Collections.unmodifiableList(list4);
        this.f9308f = Collections.unmodifiableList(list5);
        this.f9309g = Collections.unmodifiableList(list6);
        this.f9310h = xVar;
        this.f9311i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f9312j = Collections.unmodifiableMap(map);
        this.f9313k = Collections.unmodifiableList(list8);
    }

    /* renamed from: a */
    public static C3147o m9184a(String str) {
        Uri parse = Uri.parse(str);
        C2679w wVar = new C2679w();
        wVar.f7449a = "0";
        wVar.f7458j = "application/x-mpegURL";
        return new C3147o(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(new C3146n(parse, new C2680x(wVar), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C2680x) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: b */
    private static List m9185b(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                StreamKey streamKey = (StreamKey) list2.get(i3);
                if (streamKey.f7059b == i && streamKey.f7060c == i2) {
                    arrayList.add(obj);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static void m9186c(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C3145m) list.get(i)).f9294a;
            if (!list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo6767d(List list) {
        return new C3147o(this.f9314t, this.f9315u, m9185b(this.f9305c, 0, list), Collections.emptyList(), m9185b(this.f9307e, 1, list), m9185b(this.f9308f, 2, list), Collections.emptyList(), this.f9310h, this.f9311i, this.f9316v, this.f9312j, this.f9313k);
    }
}
