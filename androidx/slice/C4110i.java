package androidx.slice;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.p097i.C1970e;
import androidx.slice.p194a.C4094a;
import androidx.slice.p194a.C4101h;
import androidx.slice.widget.C4154j;
import androidx.slice.widget.C4160p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.slice.i */
/* compiled from: PG */
public final class C4110i {

    /* renamed from: a */
    public long f13135a;

    /* renamed from: b */
    public long f13136b;

    /* renamed from: c */
    public C4154j f13137c;

    /* renamed from: d */
    public List f13138d;

    /* renamed from: e */
    public final Bundle f13139e;

    /* renamed from: f */
    public C4094a f13140f;

    /* renamed from: g */
    private Slice f13141g;

    /* renamed from: h */
    private Context f13142h;

    /* renamed from: i */
    private C4160p f13143i;

    /* renamed from: j */
    private int f13144j;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4110i(android.content.Context r5, androidx.slice.Slice r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.f13141g = r6
            r4.f13142h = r5
            java.lang.String r5 = "ttl"
            java.lang.String r0 = "long"
            androidx.slice.SliceItem r5 = androidx.slice.p194a.C4101h.m11758k(r6, r0, r5)
            if (r5 == 0) goto L_0x0017
            long r1 = r5.mo8594b()
            r4.f13135a = r1
        L_0x0017:
            java.lang.String r5 = "last_updated"
            androidx.slice.SliceItem r5 = androidx.slice.p194a.C4101h.m11758k(r6, r0, r5)
            if (r5 == 0) goto L_0x0025
            long r0 = r5.mo8594b()
            r4.f13136b = r0
        L_0x0025:
            java.lang.String r5 = "bundle"
            java.lang.String r0 = "host_extras"
            androidx.slice.SliceItem r5 = androidx.slice.p194a.C4101h.m11750c(r6, r5, r0)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r5.f13094d
            boolean r0 = r5 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x003a
            android.os.Bundle r5 = (android.os.Bundle) r5
            r4.f13139e = r5
            goto L_0x003e
        L_0x003a:
            android.os.Bundle r5 = android.os.Bundle.EMPTY
            r4.f13139e = r5
        L_0x003e:
            androidx.slice.widget.j r5 = new androidx.slice.widget.j
            r5.<init>(r6)
            r4.f13137c = r5
            androidx.slice.widget.p r6 = r5.f13378a
            r4.f13143i = r6
            androidx.slice.widget.p r6 = r5.f13378a
            java.util.List r5 = r5.f13381d
            r0 = 1
            int r5 = androidx.slice.widget.C4154j.m11914b(r6, r0, r5)
            r4.f13144j = r5
            androidx.slice.widget.j r5 = r4.f13137c
            android.content.Context r6 = r4.f13142h
            androidx.slice.a.a r5 = r5.mo8744c(r6)
            r4.f13140f = r5
            androidx.slice.widget.j r5 = r4.f13137c
            java.util.List r5 = r5.f13381d
            r4.f13138d = r5
            if (r5 != 0) goto L_0x00b3
            androidx.slice.widget.p r5 = r4.f13143i
            if (r5 == 0) goto L_0x00b3
            androidx.slice.SliceItem r5 = r5.f13268m
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r0 = "list_item"
            r1 = 0
            r6[r1] = r0
            boolean r5 = androidx.slice.p194a.C4101h.m11756i(r5, r6)
            if (r5 == 0) goto L_0x00b3
            androidx.slice.widget.p r5 = r4.f13143i
            java.util.ArrayList r5 = r5.f13392d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0082:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x00ab
            java.lang.Object r0 = r5.get(r1)
            androidx.slice.SliceItem r0 = (androidx.slice.SliceItem) r0
            r2 = 0
            r3 = r2
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String r3 = "action"
            androidx.slice.SliceItem r0 = androidx.slice.p194a.C4101h.m11749b(r0, r3, r2, r2)
            if (r0 == 0) goto L_0x00a8
            androidx.slice.a.a r0 = new androidx.slice.a.a
            java.lang.Object r2 = r5.get(r1)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            r0.<init>(r2)
            r6.add(r0)
        L_0x00a8:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x00ab:
            int r5 = r6.size()
            if (r5 <= 0) goto L_0x00b3
            r4.f13138d = r6
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.C4110i.<init>(android.content.Context, androidx.slice.Slice):void");
    }

    /* renamed from: a */
    public final int mo8612a() {
        SliceItem k = C4101h.m11758k(this.f13141g, (String) null, "partial");
        if (!this.f13137c.mo8711d()) {
            return 0;
        }
        return k != null ? 1 : 2;
    }

    /* renamed from: b */
    public final int mo8613b() {
        SliceItem d;
        int i = this.f13144j;
        if ((i == 4 || i == 5) && (d = C4101h.m11751d(this.f13143i.f13394f, "int", "value")) != null) {
            return d.mo8593a();
        }
        return -1;
    }

    /* renamed from: c */
    public final PendingIntent mo8614c() {
        SliceItem sliceItem;
        if (this.f13144j != 4 || (sliceItem = this.f13143i.f13394f) == null) {
            return null;
        }
        return sliceItem.mo8595c();
    }

    /* renamed from: d */
    public final C1970e mo8615d() {
        int i = this.f13144j;
        if (i != 4 && i != 5) {
            return null;
        }
        SliceItem sliceItem = this.f13143i.f13394f;
        SliceItem d = C4101h.m11751d(sliceItem, "int", "max");
        SliceItem d2 = C4101h.m11751d(sliceItem, "int", "min");
        return new C1970e(Integer.valueOf(d2 != null ? d2.mo8593a() : 0), Integer.valueOf(d != null ? d.mo8593a() : 100));
    }

    /* renamed from: e */
    public final CharSequence mo8616e() {
        SliceItem sliceItem;
        C4160p pVar = this.f13143i;
        if (pVar == null || (sliceItem = pVar.f13391c) == null) {
            return null;
        }
        return (CharSequence) sliceItem.f13094d;
    }

    /* renamed from: f */
    public final CharSequence mo8617f() {
        C4160p pVar = this.f13143i;
        if (pVar == null || pVar.mo8751e() == null) {
            return null;
        }
        return (CharSequence) pVar.mo8751e().f13094d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r2.f13140f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo8618g() {
        /*
            r2 = this;
            androidx.slice.widget.p r0 = r2.f13143i
            r1 = 0
            if (r0 == 0) goto L_0x000e
            androidx.slice.SliceItem r0 = r0.f13390b
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.f13094d
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x001b
            androidx.slice.a.a r0 = r2.f13140f
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r0.f13109d
            return r0
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.C4110i.mo8618g():java.lang.CharSequence");
    }

    /* renamed from: h */
    public final List mo8619h() {
        ArrayList arrayList = new ArrayList();
        C4094a aVar = this.f13140f;
        if (aVar == null || !aVar.mo8607d()) {
            List list = this.f13138d;
            if (list == null || list.size() <= 0) {
                C4160p pVar = this.f13143i;
                if (pVar != null) {
                    arrayList.addAll(pVar.f13393e);
                }
            } else {
                for (int i = 0; i < this.f13138d.size(); i++) {
                    C4094a aVar2 = (C4094a) this.f13138d.get(i);
                    if (aVar2.mo8607d()) {
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final boolean mo8620i() {
        return C4093a.m11737a(this.f13141g.f13089e, "error");
    }

    /* renamed from: j */
    public final boolean mo8621j() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f13135a;
        return (j == 0 || j == -1 || currentTimeMillis <= j) ? false : true;
    }

    /* renamed from: k */
    public final boolean mo8622k() {
        return C4093a.m11737a(this.f13141g.f13089e, "permission_request");
    }
}
