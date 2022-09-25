package androidx.appsearch.p047a;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appsearch.p053e.C0880a;
import androidx.appsearch.p053e.C0881b;
import com.evernote.android.state.BuildConfig;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.appsearch.a.w */
/* compiled from: PG */
public final class C0858w {

    /* renamed from: a */
    final Bundle f2846a;

    /* renamed from: b */
    public final String f2847b;

    /* renamed from: c */
    public final String f2848c;

    /* renamed from: d */
    public final long f2849d;

    /* renamed from: e */
    private final Bundle f2850e;

    /* renamed from: f */
    private Integer f2851f;

    public C0858w(Bundle bundle) {
        bundle.getClass();
        this.f2846a = bundle;
        Bundle bundle2 = (Bundle) bundle.getParcelable("properties");
        bundle2.getClass();
        this.f2850e = bundle2;
        String string = bundle.getString("id");
        string.getClass();
        this.f2847b = string;
        String string2 = bundle.getString("schemaType");
        string2.getClass();
        this.f2848c = string2;
        this.f2849d = bundle.getLong("creationTimestampMillis", System.currentTimeMillis());
    }

    /* renamed from: q */
    private static Object m2733q(String str, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AppSearchGenericDocumen", "Error casting to requested type for path \"" + str + "\"", e);
            return null;
        }
    }

    /* renamed from: r */
    private static void m2734r(String str, String str2, int i) {
        if (i > 1) {
            Log.w("AppSearchGenericDocumen", "The value for \"" + str2 + "\" contains " + i + " elements. Only the first one will be returned from getProperty" + str + "(). Try getProperty" + str + "Array().");
        }
    }

    /* renamed from: a */
    public final int mo3440a() {
        return this.f2846a.getInt("score", 0);
    }

    /* renamed from: b */
    public final long mo3441b(String str) {
        int length;
        long[] l = mo3452l(str);
        if (l == null || (length = l.length) == 0) {
            return 0;
        }
        m2734r("Long", str, length);
        return l[0];
    }

    /* renamed from: c */
    public final long mo3442c() {
        return this.f2846a.getLong("ttlMillis", 0);
    }

    /* renamed from: e */
    public final C0858w mo3443e(String str) {
        int length;
        C0858w[] m = mo3453m(str);
        if (m == null || (length = m.length) == 0) {
            return null;
        }
        m2734r("Document", str, length);
        return m[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0858w)) {
            return false;
        }
        return C0880a.m2763b(this.f2846a, ((C0858w) obj).f2846a);
    }

    /* renamed from: g */
    public final Object mo3446g(Class cls) {
        return C0856u.m2718b().mo3429a(cls).fromGenericDocument(this);
    }

    /* renamed from: h */
    public final String mo3447h() {
        return this.f2846a.getString("namespace", BuildConfig.FLAVOR);
    }

    public final int hashCode() {
        if (this.f2851f == null) {
            this.f2851f = Integer.valueOf(C0880a.m2762a(this.f2846a));
        }
        return this.f2851f.intValue();
    }

    /* renamed from: i */
    public final Set mo3449i() {
        return Collections.unmodifiableSet(this.f2850e.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3450j(C0881b bVar) {
        bVar.mo3490a("{\n");
        bVar.mo3492c();
        bVar.mo3490a("namespace: \"");
        bVar.mo3490a(mo3447h());
        bVar.mo3490a("\",\n");
        bVar.mo3490a("id: \"");
        bVar.mo3490a(this.f2847b);
        bVar.mo3490a("\",\n");
        bVar.mo3490a("score: ");
        bVar.mo3490a(Integer.valueOf(mo3440a()).toString());
        bVar.mo3490a(",\n");
        bVar.mo3490a("schemaType: \"");
        bVar.mo3490a(this.f2848c);
        bVar.mo3490a("\",\n");
        bVar.mo3490a("creationTimestampMillis: ");
        bVar.mo3490a(Long.valueOf(this.f2849d).toString());
        bVar.mo3490a(",\n");
        bVar.mo3490a("timeToLiveMillis: ");
        bVar.mo3490a(Long.valueOf(mo3442c()).toString());
        bVar.mo3490a(",\n");
        bVar.mo3490a("properties: {\n");
        String[] strArr = (String[]) mo3449i().toArray(new String[0]);
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            Object f = mo3445f(strArr[i]);
            bVar.mo3492c();
            String str = strArr[i];
            str.getClass();
            f.getClass();
            bVar.mo3490a("\"");
            bVar.mo3490a(str);
            bVar.mo3490a("\": [");
            if (f instanceof C0858w[]) {
                C0858w[] wVarArr = (C0858w[]) f;
                int i2 = 0;
                while (true) {
                    int length = wVarArr.length;
                    if (i2 >= length) {
                        break;
                    }
                    bVar.mo3490a("\n");
                    bVar.mo3492c();
                    wVarArr[i2].mo3450j(bVar);
                    if (i2 != length - 1) {
                        bVar.mo3490a(",");
                    }
                    bVar.mo3490a("\n");
                    bVar.mo3491b();
                    i2++;
                }
                bVar.mo3490a("]");
            } else {
                int length2 = Array.getLength(f);
                for (int i3 = 0; i3 < length2; i3++) {
                    Object obj = Array.get(f, i3);
                    if (obj instanceof String) {
                        bVar.mo3490a("\"");
                        bVar.mo3490a((String) obj);
                        bVar.mo3490a("\"");
                    } else if (obj instanceof byte[]) {
                        bVar.mo3490a(Arrays.toString((byte[]) obj));
                    } else {
                        bVar.mo3490a(obj.toString());
                    }
                    if (i3 != length2 - 1) {
                        bVar.mo3490a(", ");
                    } else {
                        bVar.mo3490a("]");
                    }
                }
            }
            if (i != strArr.length - 1) {
                bVar.mo3490a(",\n");
            }
            bVar.mo3491b();
        }
        bVar.mo3490a("\n");
        bVar.mo3490a("}");
        bVar.mo3491b();
        bVar.mo3490a("\n");
        bVar.mo3490a("}");
    }

    /* renamed from: k */
    public final boolean mo3451k(String str) {
        int length;
        boolean[] zArr = (boolean[]) m2733q(str, mo3445f(str), boolean[].class);
        if (zArr == null || (length = zArr.length) == 0) {
            return false;
        }
        m2734r("Boolean", str, length);
        return zArr[0];
    }

    /* renamed from: l */
    public final long[] mo3452l(String str) {
        return (long[]) m2733q(str, mo3445f(str), long[].class);
    }

    /* renamed from: m */
    public final C0858w[] mo3453m(String str) {
        return (C0858w[]) m2733q(str, mo3445f(str), C0858w[].class);
    }

    /* renamed from: n */
    public final String[] mo3454n(String str) {
        return (String[]) m2733q(str, mo3445f(str), String[].class);
    }

    /* renamed from: o */
    public final byte[][] mo3455o(String str) {
        return (byte[][]) m2733q(str, mo3445f(str), byte[][].class);
    }

    public final String toString() {
        C0881b bVar = new C0881b();
        mo3450j(bVar);
        return bVar.f2953a.toString();
    }

    /* renamed from: d */
    public static C0858w m2731d(Object obj) {
        obj.getClass();
        return C0856u.m2718b().mo3429a(obj.getClass()).toGenericDocument(obj);
    }

    /* renamed from: f */
    public final Object mo3445f(String str) {
        str.getClass();
        int i = 0;
        Object p = m2732p(new C0829ab(str), 0, this.f2846a);
        if (p instanceof Bundle) {
            return new C0858w[]{new C0858w((Bundle) p)};
        } else if (p instanceof List) {
            List list = (List) p;
            byte[][] bArr = new byte[list.size()][];
            while (i < list.size()) {
                Bundle bundle = (Bundle) list.get(i);
                if (bundle == null) {
                    Log.e("AppSearchGenericDocumen", "The inner bundle is null at " + i + ", for path: " + str);
                } else {
                    byte[] byteArray = bundle.getByteArray("byteArray");
                    if (byteArray == null) {
                        Log.e("AppSearchGenericDocumen", "The bundle at " + i + " contains a null byte[].");
                    } else {
                        bArr[i] = byteArray;
                    }
                }
                i++;
            }
            return bArr;
        } else if (!(p instanceof Parcelable[])) {
            return p;
        } else {
            Parcelable[] parcelableArr = (Parcelable[]) p;
            C0858w[] wVarArr = new C0858w[parcelableArr.length];
            while (i < parcelableArr.length) {
                Parcelable parcelable = parcelableArr[i];
                if (parcelable == null) {
                    Log.e("AppSearchGenericDocumen", "The inner bundle is null at " + i + ", for path: " + str);
                } else if (!(parcelable instanceof Bundle)) {
                    Log.e("AppSearchGenericDocumen", "The inner element at " + i + " is a " + parcelableArr[i].getClass() + ", not a Bundle for path: " + str);
                } else {
                    wVarArr[i] = new C0858w((Bundle) parcelable);
                }
                i++;
            }
            return wVarArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.os.Parcelable[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.os.Parcelable[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m2732p(androidx.appsearch.p047a.C0829ab r8, int r9, android.os.Bundle r10) {
        /*
            r10.getClass()
            java.lang.String r0 = "properties"
            android.os.Bundle r10 = r10.getBundle(r0)
            r10.getClass()
        L_0x000c:
            int r1 = r8.mo3376a()
            r2 = 0
            if (r9 >= r1) goto L_0x0243
            androidx.appsearch.a.aa r1 = r8.mo3377b(r9)
            java.lang.String r3 = r1.f2788a
            java.lang.Object r10 = r10.get(r3)
            if (r10 != 0) goto L_0x0020
            return r2
        L_0x0020:
            int r1 = r1.f2789b
            r3 = -1
            if (r1 == r3) goto L_0x00a2
            boolean r4 = r10 instanceof java.lang.String[]
            if (r4 == 0) goto L_0x0039
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r4 = r10.length
            if (r1 >= r4) goto L_0x0036
            int r4 = r1 + 1
            java.lang.Object[] r10 = java.util.Arrays.copyOfRange(r10, r1, r4)
            goto L_0x00a2
        L_0x0036:
            r10 = r2
            goto L_0x00a2
        L_0x0039:
            boolean r4 = r10 instanceof long[]
            if (r4 == 0) goto L_0x0049
            long[] r10 = (long[]) r10
            int r4 = r10.length
            if (r1 >= r4) goto L_0x0036
            int r4 = r1 + 1
            long[] r10 = java.util.Arrays.copyOfRange(r10, r1, r4)
            goto L_0x00a2
        L_0x0049:
            boolean r4 = r10 instanceof double[]
            if (r4 == 0) goto L_0x0059
            double[] r10 = (double[]) r10
            int r4 = r10.length
            if (r1 >= r4) goto L_0x0036
            int r4 = r1 + 1
            double[] r10 = java.util.Arrays.copyOfRange(r10, r1, r4)
            goto L_0x00a2
        L_0x0059:
            boolean r4 = r10 instanceof boolean[]
            if (r4 == 0) goto L_0x0069
            boolean[] r10 = (boolean[]) r10
            int r4 = r10.length
            if (r1 >= r4) goto L_0x0036
            int r4 = r1 + 1
            boolean[] r10 = java.util.Arrays.copyOfRange(r10, r1, r4)
            goto L_0x00a2
        L_0x0069:
            boolean r4 = r10 instanceof java.util.List
            if (r4 == 0) goto L_0x007c
            java.util.List r10 = (java.util.List) r10
            int r4 = r10.size()
            if (r1 >= r4) goto L_0x0036
            int r4 = r1 + 1
            java.util.List r10 = r10.subList(r1, r4)
            goto L_0x00a2
        L_0x007c:
            boolean r4 = r10 instanceof android.os.Parcelable[]
            if (r4 == 0) goto L_0x008a
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r4 = r10.length
            if (r1 >= r4) goto L_0x0036
            r10 = r10[r1]
            android.os.Bundle r10 = (android.os.Bundle) r10
            goto L_0x00a2
        L_0x008a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported value type: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        L_0x00a2:
            if (r10 == 0) goto L_0x0242
            int r1 = r8.mo3376a()
            int r1 = r1 + r3
            if (r9 != r1) goto L_0x00ad
            goto L_0x0242
        L_0x00ad:
            boolean r1 = r10 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00b8
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.os.Bundle r10 = r10.getBundle(r0)
            goto L_0x00cb
        L_0x00b8:
            boolean r1 = r10 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x022a
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r1 = r10.length
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x00cf
            r10 = r10[r4]
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.os.Bundle r10 = r10.getBundle(r0)
        L_0x00cb:
            int r9 = r9 + 1
            goto L_0x000c
        L_0x00cf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r5 = 0
        L_0x00d5:
            if (r5 >= r1) goto L_0x00e9
            int r6 = r9 + 1
            r7 = r10[r5]
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r6 = m2732p(r8, r6, r7)
            if (r6 == 0) goto L_0x00e6
            r0.add(r6)
        L_0x00e6:
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e9:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x00f1
            goto L_0x0211
        L_0x00f1:
            java.lang.Object r8 = r0.get(r4)
            boolean r9 = r8 instanceof java.lang.String[]
            if (r9 == 0) goto L_0x0124
            r8 = 0
            r9 = 0
        L_0x00fb:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x010c
            java.lang.Object r10 = r0.get(r8)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r10 = r10.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x00fb
        L_0x010c:
            java.lang.String[] r2 = new java.lang.String[r9]
            r8 = 0
            r9 = 0
        L_0x0110:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0211
            java.lang.Object r10 = r0.get(r8)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r4, r2, r9, r1)
            int r9 = r9 + r1
            int r8 = r8 + 1
            goto L_0x0110
        L_0x0124:
            boolean r9 = r8 instanceof long[]
            if (r9 == 0) goto L_0x0153
            r8 = 0
            r9 = 0
        L_0x012a:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x013b
            java.lang.Object r10 = r0.get(r8)
            long[] r10 = (long[]) r10
            int r10 = r10.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x012a
        L_0x013b:
            long[] r2 = new long[r9]
            r8 = 0
            r9 = 0
        L_0x013f:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0211
            java.lang.Object r10 = r0.get(r8)
            long[] r10 = (long[]) r10
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r4, r2, r9, r1)
            int r9 = r9 + r1
            int r8 = r8 + 1
            goto L_0x013f
        L_0x0153:
            boolean r9 = r8 instanceof double[]
            if (r9 == 0) goto L_0x0182
            r8 = 0
            r9 = 0
        L_0x0159:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x016a
            java.lang.Object r10 = r0.get(r8)
            double[] r10 = (double[]) r10
            int r10 = r10.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0159
        L_0x016a:
            double[] r2 = new double[r9]
            r8 = 0
            r9 = 0
        L_0x016e:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0211
            java.lang.Object r10 = r0.get(r8)
            double[] r10 = (double[]) r10
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r4, r2, r9, r1)
            int r9 = r9 + r1
            int r8 = r8 + 1
            goto L_0x016e
        L_0x0182:
            boolean r9 = r8 instanceof boolean[]
            if (r9 == 0) goto L_0x01b1
            r8 = 0
            r9 = 0
        L_0x0188:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0199
            java.lang.Object r10 = r0.get(r8)
            boolean[] r10 = (boolean[]) r10
            int r10 = r10.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0188
        L_0x0199:
            boolean[] r2 = new boolean[r9]
            r8 = 0
            r9 = 0
        L_0x019d:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0211
            java.lang.Object r10 = r0.get(r8)
            boolean[] r10 = (boolean[]) r10
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r4, r2, r9, r1)
            int r9 = r9 + r1
            int r8 = r8 + 1
            goto L_0x019d
        L_0x01b1:
            boolean r9 = r8 instanceof java.util.List
            if (r9 == 0) goto L_0x01e2
            r8 = 0
            r9 = 0
        L_0x01b7:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x01cb
            java.lang.Object r10 = r0.get(r8)
            java.util.List r10 = (java.util.List) r10
            int r10 = r10.size()
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x01b7
        L_0x01cb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
        L_0x01d0:
            int r8 = r0.size()
            if (r4 >= r8) goto L_0x0211
            java.lang.Object r8 = r0.get(r4)
            java.util.List r8 = (java.util.List) r8
            r2.addAll(r8)
            int r4 = r4 + 1
            goto L_0x01d0
        L_0x01e2:
            boolean r9 = r8 instanceof android.os.Parcelable[]
            if (r9 == 0) goto L_0x0212
            r8 = 0
            r9 = 0
        L_0x01e8:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x01f9
            java.lang.Object r10 = r0.get(r8)
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r10 = r10.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x01e8
        L_0x01f9:
            android.os.Parcelable[] r2 = new android.os.Parcelable[r9]
            r8 = 0
            r9 = 0
        L_0x01fd:
            int r10 = r0.size()
            if (r8 >= r10) goto L_0x0211
            java.lang.Object r10 = r0.get(r8)
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r4, r2, r9, r1)
            int r9 = r9 + r1
            int r8 = r8 + 1
            goto L_0x01fd
        L_0x0211:
            return r2
        L_0x0212:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected property type: "
            r10.<init>(r0)
            r10.append(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
        L_0x022a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to apply path to document; no nested value found: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r10.concat(r8)
            java.lang.String r9 = "AppSearchGenericDocumen"
            android.util.Log.e(r9, r8)
            return r2
        L_0x0242:
            return r10
        L_0x0243:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.p047a.C0858w.m2732p(androidx.appsearch.a.ab, int, android.os.Bundle):java.lang.Object");
    }
}
