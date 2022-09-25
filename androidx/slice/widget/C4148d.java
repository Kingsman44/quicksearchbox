package androidx.slice.widget;

import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.C4093a;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.slice.widget.d */
/* compiled from: PG */
public final class C4148d {

    /* renamed from: a */
    public SliceItem f13345a;

    /* renamed from: b */
    public SliceItem f13346b;

    /* renamed from: c */
    public final ArrayList f13347c;

    /* renamed from: d */
    public SliceItem f13348d;

    /* renamed from: e */
    public int f13349e;

    /* renamed from: f */
    public IconCompat f13350f;

    /* renamed from: g */
    public SliceItem f13351g;

    /* renamed from: h */
    public int f13352h = -1;

    /* renamed from: i */
    public SliceItem f13353i;

    /* renamed from: j */
    public SliceItem f13354j;

    /* renamed from: k */
    private int f13355k;

    public C4148d(SliceItem sliceItem) {
        List list;
        ArrayList arrayList = new ArrayList();
        this.f13347c = arrayList;
        String str = sliceItem.f13092b;
        if (C4093a.m11737a(sliceItem.f13091a, "shortcut") || (!"slice".equals(str) && !"action".equals(str))) {
            String str2 = sliceItem.f13092b;
            if (!"content_description".equals(sliceItem.f13093c)) {
                if (!sliceItem.mo8600h("keywords", "ttl", "last_updated") && ("text".equals(str2) || "long".equals(str2) || "image".equals(str2))) {
                    arrayList.add(sliceItem);
                }
            }
        } else {
            List asList = Arrays.asList(sliceItem.mo8596d().f13088d);
            Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                SliceItem sliceItem2 = (SliceItem) it.next();
                if (("action".equals(sliceItem2.f13092b) || "slice".equals(sliceItem2.f13092b)) && !"date_picker".equals(sliceItem2.f13093c) && !"time_picker".equals(sliceItem2.f13093c)) {
                    list = Arrays.asList(sliceItem2.mo8596d().f13088d);
                    if (new C4094a(sliceItem2).mo8607d()) {
                        this.f13354j = sliceItem2;
                    } else {
                        this.f13345a = (SliceItem) asList.get(0);
                    }
                }
            }
            if ("action".equals(str)) {
                this.f13345a = sliceItem;
            }
            this.f13349e = 0;
            this.f13355k = 0;
            m11907b(asList);
            if (this.f13349e == 0 && this.f13355k == 0 && list != null) {
                m11907b(list);
            }
        }
        mo8737a();
    }

    /* renamed from: b */
    private final void m11907b(List list) {
        for (int i = 0; i < list.size(); i++) {
            SliceItem sliceItem = (SliceItem) list.get(i);
            String str = sliceItem.f13092b;
            if (this.f13346b == null && ("date_picker".equals(sliceItem.f13093c) || "time_picker".equals(sliceItem.f13093c))) {
                this.f13346b = sliceItem;
            } else if ("content_description".equals(sliceItem.f13093c)) {
                this.f13348d = sliceItem;
            } else if (this.f13349e < 2 && ("text".equals(str) || "long".equals(str))) {
                SliceItem sliceItem2 = this.f13353i;
                if (sliceItem2 == null || (!C4093a.m11737a(sliceItem2.f13091a, "title") && C4093a.m11737a(sliceItem.f13091a, "title"))) {
                    this.f13353i = sliceItem;
                }
                if (!C4093a.m11737a(sliceItem.f13091a, "overlay")) {
                    this.f13349e++;
                    this.f13347c.add(sliceItem);
                } else if (this.f13351g == null) {
                    this.f13351g = sliceItem;
                }
            } else if (this.f13355k <= 0 && "image".equals(sliceItem.f13092b)) {
                this.f13352h = C4094a.m11738a(sliceItem);
                this.f13355k++;
                this.f13350f = (IconCompat) sliceItem.f13094d;
                this.f13347c.add(sliceItem);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8737a() {
        if (this.f13346b == null) {
            return this.f13347c.size() > 0 && this.f13347c.size() <= 3;
        }
        return true;
    }
}
