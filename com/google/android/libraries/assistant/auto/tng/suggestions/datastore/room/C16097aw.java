package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aw */
/* compiled from: PG */
final class C16097aw implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47568a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47569b;

    /* renamed from: c */
    final /* synthetic */ C16100az f47570c;

    public C16097aw(C16100az azVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47570c = azVar;
        this.f47568a = amVar;
        this.f47569b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Cursor a = C3940b.m11293a(this.f47570c.f47577a, this.f47568a, false, this.f47569b);
        try {
            int b = C3939a.m11292b(a, "id");
            int b2 = C3939a.m11292b(a, "display_type");
            int b3 = C3939a.m11292b(a, "num_suggestions");
            int b4 = C3939a.m11292b(a, "length");
            int b5 = C3939a.m11292b(a, "width");
            int b6 = C3939a.m11292b(a, "font_size");
            int b7 = C3939a.m11292b(a, "max_display_text_length");
            int b8 = C3939a.m11292b(a, "generation_timestamp");
            int b9 = C3939a.m11292b(a, "display_metadata");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                byte[] bArr = null;
                if (a.isNull(b)) {
                    str = null;
                } else {
                    str = a.getString(b);
                }
                C16090ap apVar = C16090ap.values()[a.getInt(b2)];
                int i = a.getInt(b3);
                float f = a.getFloat(b4);
                float f2 = a.getFloat(b5);
                int i2 = a.getInt(b6);
                int i3 = a.getInt(b7);
                long j = a.getLong(b8);
                if (!a.isNull(b9)) {
                    bArr = a.getBlob(b9);
                }
                arrayList.add(C16091aq.m32981j(str, apVar, i, f, f2, i2, i3, j, C16088an.m32967d(bArr)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
