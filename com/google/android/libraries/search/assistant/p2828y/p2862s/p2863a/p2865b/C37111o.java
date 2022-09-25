package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import android.database.Cursor;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37123e;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.o */
/* compiled from: PG */
final class C37111o extends C69665o implements C69626l {
    public C37111o() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(cursor, "it");
        String c = C37123e.m65882c(cursor, "contact_id");
        if (c == null) {
            return null;
        }
        String c2 = C37123e.m65882c(cursor, "account_type");
        String str = BuildConfig.FLAVOR;
        if (c2 == null) {
            c2 = str;
        }
        String c3 = C37123e.m65882c(cursor, "account_name");
        if (c3 != null) {
            str = c3;
        }
        return new C37109m(c, c2, str);
    }
}
