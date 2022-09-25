package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d;

import android.database.Cursor;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.d.e */
/* compiled from: PG */
public final class C37123e {
    /* renamed from: a */
    public static final Integer m65880a(Cursor cursor, String str) {
        C69664n.m101061g(cursor, "<this>");
        C69664n.m101061g(cursor, "cursor");
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return null;
            }
            return Integer.valueOf(cursor.getInt(columnIndex));
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C37122d.f96691a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(52520));
            cVar.mo56389s("Exception in getInt from column: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public static final Long m65881b(Cursor cursor, String str) {
        C69664n.m101061g(cursor, "<this>");
        C69664n.m101061g(cursor, "cursor");
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return null;
            }
            return Long.valueOf(cursor.getLong(columnIndex));
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C37122d.f96691a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(52522));
            cVar.mo56389s("Exception in getLong from column: %s", str);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m65882c(Cursor cursor, String str) {
        C69664n.m101061g(cursor, "<this>");
        C69664n.m101061g(cursor, "cursor");
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return null;
            }
            String string = cursor.getString(columnIndex);
            if (!C69664n.m101066l(string, BuildConfig.FLAVOR)) {
                return string;
            }
            return null;
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C37122d.f96691a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(52524));
            cVar.mo56389s("Exception in getString from column: %s", str);
            return null;
        }
    }
}
