package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cz */
/* compiled from: PG */
final class C16154cz implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47645a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47646b;

    /* renamed from: c */
    final /* synthetic */ C16156da f47647c;

    public C16154cz(C16156da daVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47647c = daVar;
        this.f47645a = amVar;
        this.f47646b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        byte[] bArr;
        Cursor a = C3940b.m11293a(this.f47647c.f47656a, this.f47645a, false, this.f47646b);
        try {
            int b = C3939a.m11292b(a, "id");
            int b2 = C3939a.m11292b(a, "candidate_suggestion_id");
            int b3 = C3939a.m11292b(a, "display_id");
            int b4 = C3939a.m11292b(a, "is_displayed_now");
            int b5 = C3939a.m11292b(a, "display_text");
            int b6 = C3939a.m11292b(a, "description");
            int b7 = C3939a.m11292b(a, "display_metadata");
            int b8 = C3939a.m11292b(a, "source");
            int b9 = C3939a.m11292b(a, "action_fulfillment_data");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                byte[] bArr2 = null;
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
                boolean z = a.getInt(b4) != 0;
                if (a.isNull(b5)) {
                    str4 = null;
                } else {
                    str4 = a.getString(b5);
                }
                if (a.isNull(b6)) {
                    str5 = null;
                } else {
                    str5 = a.getString(b6);
                }
                if (a.isNull(b7)) {
                    bArr = null;
                } else {
                    bArr = a.getBlob(b7);
                }
                C16335ai c = C16088an.m32966c(bArr);
                C16169m a2 = C16169m.m33196a(a.getInt(b8));
                if (!a.isNull(b9)) {
                    bArr2 = a.getBlob(b9);
                }
                arrayList.add(C16143co.m33093j(str, str2, str3, z, str4, str5, c, a2, C16088an.m32964a(bArr2)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
