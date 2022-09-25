package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ak */
/* compiled from: PG */
final class C16085ak implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47546a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47547b;

    /* renamed from: c */
    final /* synthetic */ C16087am f47548c;

    public C16085ak(C16087am amVar, C3930am amVar2, CancellationSignal cancellationSignal) {
        this.f47548c = amVar;
        this.f47546a = amVar2;
        this.f47547b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String string;
        Cursor a = C3940b.m11293a(this.f47548c.f47551a, this.f47546a, false, this.f47547b);
        try {
            int b = C3939a.m11292b(a, "candidate_suggestion_id");
            int b2 = C3939a.m11292b(a, "click_count");
            int b3 = C3939a.m11292b(a, "show_count");
            int b4 = C3939a.m11292b(a, "last_click_timestamp");
            int b5 = C3939a.m11292b(a, "last_show_timestamp");
            int b6 = C3939a.m11292b(a, "last_cleared_timestamp");
            int b7 = C3939a.m11292b(a, "dismissal_count");
            int b8 = C3939a.m11292b(a, "last_dismissal_timestamp");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                if (a.isNull(b)) {
                    string = null;
                } else {
                    string = a.getString(b);
                }
                arrayList.add(C16077ac.m32939j(string, a.getLong(b2), a.getLong(b3), a.getLong(b4), a.getLong(b5), a.getLong(b6), a.getLong(b7), a.getLong(b8)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
