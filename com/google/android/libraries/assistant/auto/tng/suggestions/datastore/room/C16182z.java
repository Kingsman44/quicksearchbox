package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.z */
/* compiled from: PG */
final class C16182z implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47736a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47737b;

    /* renamed from: c */
    final /* synthetic */ C16075aa f47738c;

    public C16182z(C16075aa aaVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47738c = aaVar;
        this.f47736a = amVar;
        this.f47737b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        Cursor a = C3940b.m11293a(this.f47738c.f47535a, this.f47736a, false, this.f47737b);
        try {
            int b = C3939a.m11292b(a, "id");
            int b2 = C3939a.m11292b(a, "display_text");
            int b3 = C3939a.m11292b(a, "description");
            int b4 = C3939a.m11292b(a, "locale");
            int b5 = C3939a.m11292b(a, "source");
            int b6 = C3939a.m11292b(a, "created_time_ms");
            int b7 = C3939a.m11292b(a, "metadata");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                byte[] bArr = null;
                if (a.isNull(b)) {
                    str = null;
                } else {
                    str = a.getString(b);
                }
                if (a.isNull(b2)) {
                    str2 = null;
                } else {
                    str2 = a.getString(b2);
                }
                if (a.isNull(b3)) {
                    str3 = null;
                } else {
                    str3 = a.getString(b3);
                }
                if (a.isNull(b4)) {
                    str4 = null;
                } else {
                    str4 = a.getString(b4);
                }
                C16169m a2 = C16169m.m33196a(a.getInt(b5));
                if (a.isNull(b6)) {
                    l = null;
                } else {
                    l = Long.valueOf(a.getLong(b6));
                }
                if (!a.isNull(b7)) {
                    bArr = a.getBlob(b7);
                }
                arrayList.add(C16170n.m33197h(str, str2, str3, str4, a2, l, C16088an.m32965b(bArr)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
