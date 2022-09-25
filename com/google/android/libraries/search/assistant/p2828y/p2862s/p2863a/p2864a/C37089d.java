package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a;

import android.database.Cursor;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37123e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C37089d extends C69663m implements C69626l {
    public C37089d(Object obj) {
        super(1, obj, C37088c.class, "extractCallFromCursor", "extractCallFromCursor(Landroid/database/Cursor;)Lcom/google/android/libraries/search/assistant/requestcontext/topcontactparams/impl/call/Call;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(cursor, "p0");
        C37088c cVar = (C37088c) this.f186034c;
        String c = C37123e.m65882c(cursor, "number");
        if (c != null) {
            Long b = C37123e.m65881b(cursor, "date");
            Instant ofEpochMilli = b != null ? Instant.ofEpochMilli(b.longValue()) : null;
            if (ofEpochMilli != null) {
                Long b2 = C37123e.m65881b(cursor, "duration");
                Duration ofSeconds = b2 != null ? Duration.ofSeconds(b2.longValue()) : null;
                Integer a = C37123e.m65880a(cursor, "type");
                int i = 0;
                if (a != null) {
                    int intValue = a.intValue();
                    if (intValue == 1) {
                        i = 1;
                    } else if (intValue == 2) {
                        i = 2;
                    } else if (intValue == 3) {
                        i = 3;
                    }
                }
                if (i != 0 && (ofSeconds != null || i == 3)) {
                    return new C37086a(ofEpochMilli, ofSeconds, c, i);
                }
            }
        }
        return null;
    }
}
