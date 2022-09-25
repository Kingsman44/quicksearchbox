package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bt */
/* compiled from: PG */
final class C16121bt implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47598a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47599b;

    /* renamed from: c */
    final /* synthetic */ C16123bv f47600c;

    public C16121bt(C16123bv bvVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47600c = bvVar;
        this.f47598a = amVar;
        this.f47599b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        Cursor a = C3940b.m11293a(this.f47600c.f47604a, this.f47598a, false, this.f47599b);
        try {
            int b = C3939a.m11292b(a, "id");
            int b2 = C3939a.m11292b(a, "display_id");
            int b3 = C3939a.m11292b(a, "is_displayed_now");
            int b4 = C3939a.m11292b(a, "status");
            int b5 = C3939a.m11292b(a, "display_text");
            int b6 = C3939a.m11292b(a, "display_metadata");
            int b7 = C3939a.m11292b(a, "action_fulfillment_data");
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
                boolean z = a.getInt(b3) != 0;
                int i = C16114bm.m33034a()[a.getInt(b4)];
                if (a.isNull(b5)) {
                    str3 = null;
                } else {
                    str3 = a.getString(b5);
                }
                if (a.isNull(b6)) {
                    bArr = null;
                } else {
                    bArr = a.getBlob(b6);
                }
                C16335ai c = C16088an.m32966c(bArr);
                if (!a.isNull(b7)) {
                    bArr2 = a.getBlob(b7);
                }
                arrayList.add(C16115bn.m33035h(str, str2, z, i, str3, c, C16088an.m32964a(bArr2)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
