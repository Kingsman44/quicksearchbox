package androidx.p182p.p185c;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.c.c */
/* compiled from: PG */
public final class C3941c {
    /* renamed from: a */
    public static final Set m11295a(String str) {
        Character ch;
        C69664n.m101061g(str, "createStatement");
        if (str.length() == 0) {
            return C69498ao.f185920a;
        }
        String substring = str.substring(C69764m.m101185B(str, '(', 0, 6) + 1, C69764m.m101187D(str, ')'));
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < substring.length()) {
            char charAt = substring.charAt(i);
            int i4 = i3 + 1;
            if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == charAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (charAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push('[');
                }
            } else if (charAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (charAt == ',' && arrayDeque.isEmpty()) {
                String substring2 = substring.substring(i2 + 1, i3);
                C69664n.m101060f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int length = substring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    int a = C69664n.m101055a(substring2.charAt(true != z ? i5 : length), 32);
                    if (!z) {
                        if (a > 0) {
                            z = true;
                        } else {
                            i5++;
                        }
                    } else if (a > 0) {
                        break;
                    } else {
                        length--;
                    }
                }
                arrayList.add(substring2.subSequence(i5, length + 1).toString());
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
        String substring3 = substring.substring(i2 + 1);
        C69664n.m101060f(substring3, "this as java.lang.String).substring(startIndex)");
        arrayList.add(C69764m.m101197q(substring3).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            String str2 = (String) next;
            String[] strArr = C3942d.f12610a;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                } else if (C69764m.m101234m(str2, strArr[i6])) {
                    arrayList2.add(next);
                    break;
                } else {
                    i6++;
                }
            }
        }
        return C69540x.m100846ab(arrayList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        p5462h.p5472e.C69598b.m101013a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        throw r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.p182p.p185c.C3942d m11296b(androidx.p186q.p187a.C4049d r5, java.lang.String r6) {
        /*
            h.a.a.q r0 = new h.a.a.q
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PRAGMA table_info(`"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = "`)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.database.Cursor r1 = r5.mo8242b(r1)
            java.lang.String r2 = "database.query(\"PRAGMA table_info(`$tableName`)\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            int r2 = r1.getColumnCount()     // Catch:{ all -> 0x008f }
            if (r2 <= 0) goto L_0x0040
            java.lang.String r2 = "name"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x008f }
        L_0x002d:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = r1.getString(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "cursor.getString(nameIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x008f }
            r0.add(r3)     // Catch:{ all -> 0x008f }
            goto L_0x002d
        L_0x0040:
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            h.a.a.k r1 = r0.f185913a
            r1.mo61117j()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT * FROM sqlite_master WHERE `name` = '"
            r1.<init>(r3)
            r1.append(r6)
            r3 = 39
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.database.Cursor r5 = r5.mo8242b(r1)
            java.lang.String r1 = "database.query(\n        …tableName'\"\n            )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "sql"
            if (r1 == 0) goto L_0x0076
            int r1 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x0078
        L_0x0076:
            java.lang.String r1 = ""
        L_0x0078:
            p5462h.p5472e.C69598b.m101013a(r5, r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            java.util.Set r5 = m11295a(r1)
            androidx.p.c.d r1 = new androidx.p.c.d
            r1.<init>(r6, r0, r5)
            return r1
        L_0x0088:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            throw r0
        L_0x008f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r6 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r5)
            goto L_0x0097
        L_0x0096:
            throw r6
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.p185c.C3941c.m11296b(androidx.q.a.d, java.lang.String):androidx.p.c.d");
    }
}
