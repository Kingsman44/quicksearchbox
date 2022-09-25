package androidx.p182p.p185c;

import android.database.Cursor;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.c.a */
/* compiled from: PG */
public final class C3939a {
    /* renamed from: a */
    public static final int m11291a(Cursor cursor, String str) {
        C69664n.m101061g(cursor, C45240c.f118157a);
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m11292b(Cursor cursor, String str) {
        String str2;
        C69664n.m101061g(cursor, C45240c.f118157a);
        int a = m11291a(cursor, str);
        if (a >= 0) {
            return a;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C69664n.m101060f(columnNames, "c.columnNames");
            Object[] objArr = (Object[]) columnNames;
            C69664n.m101061g(objArr, "<this>");
            StringBuilder sb = new StringBuilder();
            C69664n.m101061g(objArr, "<this>");
            sb.append(BuildConfig.FLAVOR);
            int i = 0;
            for (Object obj : objArr) {
                i++;
                if (i > 1) {
                    sb.append(", ");
                }
                C69764m.m101218a(sb, obj, (C69626l) null);
            }
            sb.append(BuildConfig.FLAVOR);
            str2 = sb.toString();
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
