package androidx.slice.widget;

import android.text.TextUtils;
import androidx.slice.C4093a;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.slice.widget.p */
/* compiled from: PG */
public final class C4160p extends C4130ah {

    /* renamed from: a */
    public SliceItem f13389a;

    /* renamed from: b */
    public SliceItem f13390b;

    /* renamed from: c */
    public SliceItem f13391c;

    /* renamed from: d */
    public final ArrayList f13392d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f13393e = new ArrayList();

    /* renamed from: f */
    public SliceItem f13394f;

    /* renamed from: g */
    public SliceItem f13395g;

    /* renamed from: h */
    public boolean f13396h;

    /* renamed from: i */
    public int f13397i;

    /* renamed from: j */
    public boolean f13398j;

    /* renamed from: k */
    public boolean f13399k;

    /* renamed from: l */
    public boolean f13400l;

    /* renamed from: r */
    private SliceItem f13401r;

    /* renamed from: s */
    private SliceItem f13402s;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (androidx.slice.p194a.C4101h.m11749b((androidx.slice.SliceItem) r13.get(0), "image", (java.lang.String[]) null, (java.lang.String[]) null) == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if ("image".equals(r3) == false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4160p(androidx.slice.SliceItem r12, int r13) {
        /*
            r11 = this;
            r11.<init>(r12, r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f13392d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f13393e = r0
            r0 = 0
            r11.f13397i = r0
            r1 = 1
            if (r13 != 0) goto L_0x0019
            r13 = 1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            java.lang.String[] r2 = r12.f13091a
            java.lang.String r3 = "end_of_section"
            boolean r2 = androidx.slice.C4093a.m11737a(r2, r3)
            if (r2 == 0) goto L_0x0026
            r11.f13399k = r1
        L_0x0026:
            r11.f13396h = r13
            boolean r13 = m11923k(r12)
            if (r13 == 0) goto L_0x0277
            java.lang.String[] r13 = new java.lang.String[r1]
            java.lang.String r2 = "title"
            r13[r0] = r2
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r3[r0] = r4
            java.util.List r13 = androidx.slice.p194a.C4101h.m11752e(r12, r4, r13, r3)
            int r3 = r13.size()
            java.lang.String r5 = "long"
            java.lang.String r6 = "slice"
            java.lang.String r7 = "action"
            if (r3 <= 0) goto L_0x0082
            java.lang.Object r3 = r13.get(r0)
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            java.lang.String r3 = r3.f13092b
            boolean r8 = r7.equals(r3)
            java.lang.String r9 = "image"
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r13.get(r0)
            androidx.slice.SliceItem r8 = (androidx.slice.SliceItem) r8
            r10 = r4
            java.lang.String[] r10 = (java.lang.String[]) r10
            androidx.slice.SliceItem r8 = androidx.slice.p194a.C4101h.m11749b(r8, r9, r4, r4)
            if (r8 != 0) goto L_0x007a
        L_0x0068:
            boolean r8 = r6.equals(r3)
            if (r8 != 0) goto L_0x007a
            boolean r8 = r5.equals(r3)
            if (r8 != 0) goto L_0x007a
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0082
        L_0x007a:
            java.lang.Object r13 = r13.get(r0)
            androidx.slice.SliceItem r13 = (androidx.slice.SliceItem) r13
            r11.f13401r = r13
        L_0x0082:
            r13 = 2
            java.lang.String[] r3 = new java.lang.String[r13]
            java.lang.String r8 = "shortcut"
            r3[r0] = r8
            r3[r1] = r2
            java.util.List r9 = androidx.slice.p194a.C4101h.m11752e(r12, r6, r3, r4)
            java.util.List r3 = androidx.slice.p194a.C4101h.m11752e(r12, r7, r3, r4)
            r9.addAll(r3)
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00b7
            java.lang.String r3 = r12.f13092b
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00b7
            androidx.slice.Slice r3 = r12.mo8596d()
            androidx.slice.SliceItem[] r3 = r3.f13088d
            java.util.List r3 = java.util.Arrays.asList(r3)
            int r3 = r3.size()
            if (r3 != r1) goto L_0x00b7
            r11.f13389a = r12
            goto L_0x00e0
        L_0x00b7:
            androidx.slice.SliceItem r3 = r11.f13401r
            if (r3 == 0) goto L_0x00d2
            int r3 = r9.size()
            if (r3 <= r1) goto L_0x00d2
            java.lang.Object r3 = r9.get(r0)
            androidx.slice.SliceItem r10 = r11.f13401r
            if (r3 != r10) goto L_0x00d2
            java.lang.Object r3 = r9.get(r1)
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            r11.f13389a = r3
            goto L_0x00e0
        L_0x00d2:
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x00e0
            java.lang.Object r3 = r9.get(r0)
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            r11.f13389a = r3
        L_0x00e0:
            java.util.ArrayList r3 = m11921i(r12)
            int r9 = r3.size()
            if (r9 != r1) goto L_0x0130
            java.lang.Object r9 = r3.get(r0)
            androidx.slice.SliceItem r9 = (androidx.slice.SliceItem) r9
            java.lang.String r9 = r9.f13092b
            boolean r9 = r7.equals(r9)
            if (r9 != 0) goto L_0x0106
            java.lang.Object r9 = r3.get(r0)
            androidx.slice.SliceItem r9 = (androidx.slice.SliceItem) r9
            java.lang.String r9 = r9.f13092b
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0130
        L_0x0106:
            java.lang.Object r6 = r3.get(r0)
            androidx.slice.SliceItem r6 = (androidx.slice.SliceItem) r6
            java.lang.String[] r13 = new java.lang.String[r13]
            r13[r0] = r8
            r13[r1] = r2
            boolean r13 = r6.mo8600h(r13)
            if (r13 != 0) goto L_0x0130
            java.lang.Object r13 = r3.get(r0)
            androidx.slice.SliceItem r13 = (androidx.slice.SliceItem) r13
            boolean r13 = m11923k(r13)
            if (r13 == 0) goto L_0x0130
            java.lang.Object r12 = r3.get(r0)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            java.util.ArrayList r3 = m11921i(r12)
            r13 = 1
            goto L_0x0131
        L_0x0130:
            r13 = 0
        L_0x0131:
            java.lang.String r6 = r12.f13093c
            java.lang.String r8 = "range"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x018b
            androidx.slice.SliceItem r6 = androidx.slice.p194a.C4101h.m11751d(r12, r7, r8)
            if (r6 == 0) goto L_0x0189
            if (r13 == 0) goto L_0x0144
            goto L_0x0189
        L_0x0144:
            androidx.slice.SliceItem r13 = r11.f13401r
            r3.remove(r13)
            int r13 = r3.size()
            if (r13 != r1) goto L_0x016f
            java.lang.Object r13 = r3.get(r0)
            androidx.slice.SliceItem r13 = (androidx.slice.SliceItem) r13
            boolean r13 = m11923k(r13)
            if (r13 == 0) goto L_0x018b
            java.lang.Object r12 = r3.get(r0)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            java.util.ArrayList r3 = m11921i(r12)
            r11.f13394f = r12
            androidx.slice.SliceItem r13 = r11.mo8749b()
            r3.remove(r13)
            goto L_0x018b
        L_0x016f:
            androidx.slice.SliceItem r13 = androidx.slice.p194a.C4101h.m11751d(r12, r7, r8)
            r11.f13394f = r13
            java.util.ArrayList r13 = m11921i(r13)
            androidx.slice.SliceItem r6 = r11.mo8749b()
            r13.remove(r6)
            androidx.slice.SliceItem r6 = r11.f13394f
            r3.remove(r6)
            r3.addAll(r13)
            goto L_0x018b
        L_0x0189:
            r11.f13394f = r12
        L_0x018b:
            java.lang.String r13 = "selection"
            java.lang.String r6 = r12.f13093c
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L_0x0197
            r11.f13395g = r12
        L_0x0197:
            int r12 = r3.size()
            if (r12 <= 0) goto L_0x0273
            androidx.slice.SliceItem r12 = r11.f13401r
            if (r12 == 0) goto L_0x01a4
            r3.remove(r12)
        L_0x01a4:
            androidx.slice.SliceItem r12 = r11.f13389a
            if (r12 == 0) goto L_0x01ab
            r3.remove(r12)
        L_0x01ab:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 0
        L_0x01b1:
            int r6 = r3.size()
            if (r13 >= r6) goto L_0x020c
            java.lang.Object r6 = r3.get(r13)
            androidx.slice.SliceItem r6 = (androidx.slice.SliceItem) r6
            java.lang.String r8 = "text"
            java.lang.String r9 = r6.f13092b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0206
            androidx.slice.SliceItem r8 = r11.f13390b
            java.lang.String r9 = "summary"
            if (r8 == 0) goto L_0x01d5
            java.lang.String[] r8 = r8.f13091a
            boolean r8 = androidx.slice.C4093a.m11737a(r8, r2)
            if (r8 != 0) goto L_0x01e8
        L_0x01d5:
            java.lang.String[] r8 = r6.f13091a
            boolean r8 = androidx.slice.C4093a.m11737a(r8, r2)
            if (r8 == 0) goto L_0x01e8
            java.lang.String[] r8 = r6.f13091a
            boolean r8 = androidx.slice.C4093a.m11737a(r8, r9)
            if (r8 != 0) goto L_0x01e8
            r11.f13390b = r6
            goto L_0x0209
        L_0x01e8:
            androidx.slice.SliceItem r8 = r11.f13391c
            if (r8 != 0) goto L_0x01f7
            java.lang.String[] r8 = r6.f13091a
            boolean r8 = androidx.slice.C4093a.m11737a(r8, r9)
            if (r8 != 0) goto L_0x01f7
            r11.f13391c = r6
            goto L_0x0209
        L_0x01f7:
            androidx.slice.SliceItem r8 = r11.f13402s
            if (r8 != 0) goto L_0x0209
            java.lang.String[] r8 = r6.f13091a
            boolean r8 = androidx.slice.C4093a.m11737a(r8, r9)
            if (r8 == 0) goto L_0x0209
            r11.f13402s = r6
            goto L_0x0209
        L_0x0206:
            r12.add(r6)
        L_0x0209:
            int r13 = r13 + 1
            goto L_0x01b1
        L_0x020c:
            androidx.slice.SliceItem r13 = r11.f13390b
            boolean r13 = m11922j(r13)
            if (r13 == 0) goto L_0x0219
            int r13 = r11.f13397i
            int r13 = r13 + r1
            r11.f13397i = r13
        L_0x0219:
            androidx.slice.SliceItem r13 = r11.f13391c
            boolean r13 = m11922j(r13)
            if (r13 == 0) goto L_0x0226
            int r13 = r11.f13397i
            int r13 = r13 + r1
            r11.f13397i = r13
        L_0x0226:
            androidx.slice.SliceItem r13 = r11.f13401r
            if (r13 == 0) goto L_0x0234
            java.lang.String r13 = r13.f13092b
            boolean r13 = r5.equals(r13)
            if (r13 == 0) goto L_0x0234
            r13 = 1
            goto L_0x0235
        L_0x0234:
            r13 = 0
        L_0x0235:
            int r2 = r12.size()
            if (r0 >= r2) goto L_0x0273
            java.lang.Object r2 = r12.get(r0)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            r3 = r4
            java.lang.String[] r3 = (java.lang.String[]) r3
            androidx.slice.SliceItem r3 = androidx.slice.p194a.C4101h.m11749b(r2, r7, r4, r4)
            java.lang.String r6 = r2.f13092b
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0259
            if (r13 != 0) goto L_0x0270
            java.util.ArrayList r13 = r11.f13392d
            r13.add(r2)
            r13 = 1
            goto L_0x0270
        L_0x0259:
            if (r3 == 0) goto L_0x026b
            androidx.slice.a.a r3 = new androidx.slice.a.a
            r3.<init>(r2)
            boolean r6 = r3.mo8607d()
            if (r6 == 0) goto L_0x026b
            java.util.ArrayList r6 = r11.f13393e
            r6.add(r3)
        L_0x026b:
            java.util.ArrayList r3 = r11.f13392d
            r3.add(r2)
        L_0x0270:
            int r0 = r0 + 1
            goto L_0x0235
        L_0x0273:
            r11.mo8711d()
            return
        L_0x0277:
            java.lang.String r12 = "RowContent"
            java.lang.String r13 = "Provided SliceItem is invalid for RowContent"
            android.util.Log.w(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4160p.<init>(androidx.slice.SliceItem, int):void");
    }

    /* renamed from: i */
    private static ArrayList m11921i(SliceItem sliceItem) {
        ArrayList arrayList = new ArrayList();
        for (SliceItem sliceItem2 : Arrays.asList(sliceItem.mo8596d().f13088d)) {
            if (m11924l(sliceItem, sliceItem2)) {
                arrayList.add(sliceItem2);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private static boolean m11922j(SliceItem sliceItem) {
        if (sliceItem != null) {
            return C4093a.m11737a(sliceItem.f13091a, "partial") || !TextUtils.isEmpty((CharSequence) sliceItem.f13094d);
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m11923k(SliceItem sliceItem) {
        if (sliceItem == null) {
            return false;
        }
        if ("slice".equals(sliceItem.f13092b) || "action".equals(sliceItem.f13092b)) {
            List asList = Arrays.asList(sliceItem.mo8596d().f13088d);
            if (C4093a.m11737a(sliceItem.f13091a, "see_more") && asList.isEmpty()) {
                return true;
            }
            for (int i = 0; i < asList.size(); i++) {
                if (m11924l(sliceItem, (SliceItem) asList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m11924l(SliceItem sliceItem, SliceItem sliceItem2) {
        if (sliceItem2.mo8600h("keywords", "ttl", "last_updated", "horizontal") || "content_description".equals(sliceItem2.f13093c) || "selection_option_key".equals(sliceItem2.f13093c) || "selection_option_value".equals(sliceItem2.f13093c)) {
            return false;
        }
        String str = sliceItem2.f13092b;
        if ("image".equals(str) || "text".equals(str) || "long".equals(str) || "action".equals(str) || "input".equals(str) || "slice".equals(str) || ("int".equals(str) && "range".equals(sliceItem.f13093c))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo8710a(C4137ao aoVar, C4143au auVar) {
        return aoVar.mo8718d(this, auVar);
    }

    /* renamed from: b */
    public final SliceItem mo8749b() {
        SliceItem sliceItem = this.f13394f;
        if (sliceItem == null) {
            return null;
        }
        List asList = Arrays.asList(sliceItem.mo8596d().f13088d);
        for (int i = 0; i < asList.size(); i++) {
            if ("image".equals(((SliceItem) asList.get(i)).f13092b)) {
                return (SliceItem) asList.get(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final SliceItem mo8750c() {
        if (!this.f13396h || this.f13398j) {
            return this.f13401r;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo8711d() {
        if (super.mo8711d()) {
            return (this.f13401r == null && this.f13389a == null && this.f13390b == null && this.f13391c == null && this.f13392d.size() <= 0 && this.f13394f == null && this.f13395g == null && !mo8752f()) ? false : true;
        }
        return false;
    }

    /* renamed from: e */
    public final SliceItem mo8751e() {
        SliceItem sliceItem = this.f13402s;
        return sliceItem == null ? this.f13391c : sliceItem;
    }

    /* renamed from: f */
    public final boolean mo8752f() {
        return "action".equals(this.f13268m.f13092b) && C4093a.m11737a(this.f13268m.mo8596d().f13089e, "see_more") && Arrays.asList(this.f13268m.mo8596d().f13088d).isEmpty();
    }
}
