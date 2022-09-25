package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
public class MdnsServiceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145119e();

    /* renamed from: a */
    public static final Charset f392166a = Charset.forName("us-ascii");

    /* renamed from: b */
    public static final Charset f392167b = Charset.forName("utf-8");

    /* renamed from: c */
    public final String f392168c;

    /* renamed from: d */
    public final String[] f392169d;

    /* renamed from: e */
    public final String[] f392170e;

    /* renamed from: f */
    public final int f392171f;

    /* renamed from: g */
    public final String f392172g;

    /* renamed from: h */
    public final String f392173h;

    /* renamed from: i */
    final List f392174i;

    /* renamed from: j */
    final List f392175j;

    /* renamed from: k */
    public final int f392176k;

    /* renamed from: l */
    private final List f392177l;

    /* renamed from: m */
    private final C58495hd f392178m;

    /* compiled from: PG */
    public final class TextEntry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145120f();

        /* renamed from: a */
        public final String f392179a;

        /* renamed from: b */
        private final byte[] f392180b;

        public TextEntry(String str, byte[] bArr) {
            this.f392179a = str;
            this.f392180b = (byte[]) bArr.clone();
        }

        /* renamed from: a */
        public final byte[] mo120613a() {
            return (byte[]) this.f392180b.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextEntry)) {
                return false;
            }
            TextEntry textEntry = (TextEntry) obj;
            return this.f392179a.equals(textEntry.f392179a) && Arrays.equals(this.f392180b, textEntry.f392180b);
        }

        public final int hashCode() {
            return (this.f392179a.hashCode() * 31) + Arrays.hashCode(this.f392180b);
        }

        public final String toString() {
            String str = this.f392179a;
            String str2 = new String(this.f392180b, MdnsServiceInfo.f392167b);
            return str + "=" + str2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234106y(parcel, 1, this.f392179a);
            C143947c.m234094m(parcel, 2, mo120613a());
            C143947c.m234083b(parcel, a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0041 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MdnsServiceInfo(java.lang.String r2, java.lang.String[] r3, java.util.List r4, java.lang.String[] r5, int r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.util.List r10, int r11) {
        /*
            r1 = this;
            r1.<init>()
            r1.f392168c = r2
            r1.f392169d = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f392177l = r2
            if (r4 == 0) goto L_0x0013
            r2.addAll(r4)
        L_0x0013:
            r1.f392170e = r5
            r1.f392171f = r6
            r1.f392172g = r7
            r1.f392173h = r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f392174i = r2
            if (r9 == 0) goto L_0x0027
            r2.addAll(r9)
        L_0x0027:
            r3 = 0
            if (r10 != 0) goto L_0x002c
            r4 = r3
            goto L_0x0031
        L_0x002c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r10)
        L_0x0031:
            r1.f392175j = r4
            if (r4 != 0) goto L_0x0098
            int r4 = r2.size()
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89838f(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0041:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.nio.charset.Charset r6 = f392167b
            byte[] r5 = r5.getBytes(r6)
            int r7 = r5.length
            if (r7 != 0) goto L_0x0058
        L_0x0056:
            r7 = r3
            goto L_0x008e
        L_0x0058:
            r8 = 61
            r9 = 0
            int r8 = com.google.common.p4575r.C60747d.m92719a(r5, r8, r9, r7)
            if (r8 >= 0) goto L_0x0074
            com.google.android.gms.mdns.MdnsServiceInfo$TextEntry r7 = new com.google.android.gms.mdns.MdnsServiceInfo$TextEntry
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = f392166a
            r8.<init>(r5, r9)
            java.lang.String r5 = ""
            byte[] r5 = r5.getBytes(r6)
            r7.<init>(r8, r5)
            goto L_0x008e
        L_0x0074:
            if (r8 != 0) goto L_0x0077
            goto L_0x0056
        L_0x0077:
            com.google.android.gms.mdns.MdnsServiceInfo$TextEntry r6 = new com.google.android.gms.mdns.MdnsServiceInfo$TextEntry
            java.lang.String r9 = new java.lang.String
            byte[] r10 = java.util.Arrays.copyOf(r5, r8)
            java.nio.charset.Charset r0 = f392166a
            r9.<init>(r10, r0)
            int r8 = r8 + 1
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r8, r7)
            r6.<init>(r9, r5)
            r7 = r6
        L_0x008e:
            if (r7 == 0) goto L_0x0041
            r4.mo55395g(r7)
            goto L_0x0041
        L_0x0094:
            com.google.common.b.gu r4 = r4.mo55394f()
        L_0x0098:
            int r2 = r4.size()
            java.util.HashMap r2 = com.google.common.p4522b.C58662ni.m90351j(r2)
            java.util.Iterator r3 = r4.iterator()
        L_0x00a4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r4 = r3.next()
            com.google.android.gms.mdns.MdnsServiceInfo$TextEntry r4 = (com.google.android.gms.mdns.MdnsServiceInfo.TextEntry) r4
            java.lang.String r5 = r4.f392179a
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x00a4
            byte[] r4 = r4.mo120613a()
            r2.put(r5, r4)
            goto L_0x00a4
        L_0x00c6:
            com.google.common.b.hd r2 = com.google.common.p4522b.C58495hd.m89898l(r2)
            r1.f392178m = r2
            r1.f392176k = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdns.MdnsServiceInfo.<init>(java.lang.String, java.lang.String[], java.util.List, java.lang.String[], int, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    /* renamed from: a */
    public final Map mo120610a() {
        C58490gz j = C58495hd.m89896j(this.f392178m.size());
        C58800sl lA = this.f392178m.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            j.mo55429h((String) entry.getKey(), new String((byte[]) entry.getValue(), f392167b));
        }
        return j.mo55427f(true);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "Name: %s, subtypes: %s, ip: %s, port: %d", new Object[]{this.f392168c, TextUtils.join(",", this.f392177l), this.f392172g, Integer.valueOf(this.f392171f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f392168c);
        C143947c.m234107z(parcel, 3, this.f392169d);
        C143947c.m234078A(parcel, 4, new ArrayList(this.f392177l));
        C143947c.m234107z(parcel, 5, this.f392170e);
        C143947c.m234089h(parcel, 6, this.f392171f);
        C143947c.m234106y(parcel, 7, this.f392172g);
        C143947c.m234106y(parcel, 8, this.f392173h);
        C143947c.m234078A(parcel, 9, this.f392174i);
        C143947c.m234080C(parcel, 10, this.f392175j);
        C143947c.m234089h(parcel, 11, this.f392176k);
        C143947c.m234083b(parcel, a);
    }
}
