package androidx.slice.p194a;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.C4093a;
import androidx.slice.SliceItem;

/* renamed from: androidx.slice.a.a */
/* compiled from: PG */
public final class C4094a {

    /* renamed from: a */
    public SliceItem f13106a;

    /* renamed from: b */
    public IconCompat f13107b;

    /* renamed from: c */
    public int f13108c;

    /* renamed from: d */
    public CharSequence f13109d;

    /* renamed from: e */
    public CharSequence f13110e;

    /* renamed from: f */
    public boolean f13111f;

    /* renamed from: g */
    public int f13112g;

    /* renamed from: h */
    public SliceItem f13113h;

    /* renamed from: i */
    public String f13114i;

    /* renamed from: j */
    public int f13115j;

    /* renamed from: k */
    private PendingIntent f13116k;

    public C4094a(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        this.f13115j = 1;
        this.f13112g = -1;
        this.f13116k = pendingIntent;
        this.f13107b = iconCompat;
        this.f13109d = charSequence;
        this.f13108c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4094a(androidx.slice.SliceItem r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 5
            r7.f13108c = r0
            r0 = 1
            r7.f13115j = r0
            r1 = -1
            r7.f13112g = r1
            r7.f13113h = r8
            r2 = 0
            r3 = r2
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String r3 = "action"
            androidx.slice.SliceItem r8 = androidx.slice.p194a.C4101h.m11749b(r8, r3, r2, r2)
            if (r8 != 0) goto L_0x001b
            return
        L_0x001b:
            r7.f13106a = r8
            android.app.PendingIntent r2 = r8.mo8595c()
            r7.f13116k = r2
            androidx.slice.Slice r2 = r8.mo8596d()
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11757j(r2)
            if (r2 == 0) goto L_0x0039
            java.lang.Object r3 = r2.f13094d
            androidx.core.graphics.drawable.IconCompat r3 = (androidx.core.graphics.drawable.IconCompat) r3
            r7.f13107b = r3
            int r2 = m11738a(r2)
            r7.f13108c = r2
        L_0x0039:
            androidx.slice.Slice r2 = r8.mo8596d()
            java.lang.String r3 = "title"
            java.lang.String r4 = "text"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11758k(r2, r4, r3)
            if (r2 == 0) goto L_0x004d
            java.lang.CharSequence r2 = r2.mo8597e()
            r7.f13109d = r2
        L_0x004d:
            androidx.slice.Slice r2 = r8.mo8596d()
            java.lang.String r3 = "content_description"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11750c(r2, r4, r3)
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r2.f13094d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.f13110e = r2
        L_0x005f:
            java.lang.String r2 = r8.f13093c
            if (r2 != 0) goto L_0x0067
            r7.f13115j = r0
            goto L_0x00ce
        L_0x0067:
            int r3 = r2.hashCode()
            r5 = -868304044(0xffffffffcc3ebb54, float:-4.9999184E7)
            r6 = 2
            if (r3 == r5) goto L_0x0090
            r5 = 759128640(0x2d3f6240, float:1.0878909E-11)
            if (r3 == r5) goto L_0x0086
            r5 = 1250407999(0x4a87b63f, float:4447007.5)
            if (r3 == r5) goto L_0x007c
            goto L_0x009a
        L_0x007c:
            java.lang.String r3 = "date_picker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009a
            r2 = 1
            goto L_0x009b
        L_0x0086:
            java.lang.String r3 = "time_picker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009a
            r2 = 2
            goto L_0x009b
        L_0x0090:
            java.lang.String r3 = "toggle"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009a
            r2 = 0
            goto L_0x009b
        L_0x009a:
            r2 = -1
        L_0x009b:
            if (r2 == 0) goto L_0x00c2
            java.lang.String r3 = "millis"
            java.lang.String r5 = "long"
            if (r2 == r0) goto L_0x00b5
            if (r2 == r6) goto L_0x00a8
            r7.f13115j = r0
            goto L_0x00ce
        L_0x00a8:
            r0 = 4
            r7.f13115j = r0
            androidx.slice.SliceItem r0 = androidx.slice.p194a.C4101h.m11751d(r8, r5, r3)
            if (r0 == 0) goto L_0x00ce
            r0.mo8594b()
            goto L_0x00ce
        L_0x00b5:
            r0 = 3
            r7.f13115j = r0
            androidx.slice.SliceItem r0 = androidx.slice.p194a.C4101h.m11751d(r8, r5, r3)
            if (r0 == 0) goto L_0x00ce
            r0.mo8594b()
            goto L_0x00ce
        L_0x00c2:
            r7.f13115j = r6
            java.lang.String[] r0 = r8.f13091a
            java.lang.String r2 = "selected"
            boolean r0 = androidx.slice.C4093a.m11737a(r0, r2)
            r7.f13111f = r0
        L_0x00ce:
            androidx.slice.SliceItem r0 = r7.f13113h
            java.lang.String[] r0 = r0.f13091a
            java.lang.String r2 = "activity"
            androidx.slice.C4093a.m11737a(r0, r2)
            androidx.slice.Slice r0 = r8.mo8596d()
            java.lang.String r2 = "int"
            java.lang.String r3 = "priority"
            androidx.slice.SliceItem r0 = androidx.slice.p194a.C4101h.m11750c(r0, r2, r3)
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.mo8593a()
        L_0x00e9:
            r7.f13112g = r1
            androidx.slice.Slice r8 = r8.mo8596d()
            java.lang.String r0 = "action_key"
            androidx.slice.SliceItem r8 = androidx.slice.p194a.C4101h.m11750c(r8, r4, r0)
            if (r8 == 0) goto L_0x0101
            java.lang.Object r8 = r8.f13094d
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r8 = r8.toString()
            r7.f13114i = r8
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.p194a.C4094a.<init>(androidx.slice.SliceItem):void");
    }

    /* renamed from: a */
    public static int m11738a(SliceItem sliceItem) {
        if (C4093a.m11737a(sliceItem.f13091a, "show_label")) {
            return 6;
        }
        if (!C4093a.m11737a(sliceItem.f13091a, "no_tint")) {
            return 0;
        }
        return C4093a.m11737a(sliceItem.f13091a, "raw") ? C4093a.m11737a(sliceItem.f13091a, "large") ? 4 : 3 : C4093a.m11737a(sliceItem.f13091a, "large") ? 2 : 1;
    }

    /* renamed from: b */
    public final PendingIntent mo8605b() {
        PendingIntent pendingIntent = this.f13116k;
        return pendingIntent != null ? pendingIntent : this.f13106a.mo8595c();
    }

    /* renamed from: c */
    public final String mo8606c() {
        int i = this.f13115j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return "toggle";
        } else {
            if (i2 == 2) {
                return "date_picker";
            }
            if (i2 != 3) {
                return null;
            }
            return "time_picker";
        }
    }

    /* renamed from: d */
    public final boolean mo8607d() {
        return this.f13115j == 2;
    }
}
