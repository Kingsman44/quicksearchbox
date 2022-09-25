package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import com.google.android.libraries.onegoogle.accountmenu.cards.p2354a.C30345a;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.o */
/* compiled from: PG */
public final class C30436o implements C30433l {

    /* renamed from: a */
    private final C3925ah f82233a;

    public C30436o(C3925ah ahVar) {
        this.f82233a = ahVar;
        new C30434m(ahVar);
        new C30435n(ahVar);
    }

    /* renamed from: a */
    public final List mo36012a() {
        String str;
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM StorageCardDecorationState", 0);
        this.f82233a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f82233a, a, false, (CancellationSignal) null);
        try {
            int b = C3939a.m11292b(a2, "accountIdentifier");
            int b2 = C3939a.m11292b(a2, "storageState");
            int b3 = C3939a.m11292b(a2, "lastDecorationConsumedTime");
            int b4 = C3939a.m11292b(a2, "totalTimesConsumed");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(b)) {
                    str = null;
                } else {
                    str = a2.getString(b);
                }
                if (a2.isNull(b2)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(b2);
                }
                C30345a a3 = C30345a.m56510a(str2);
                long j = a2.getLong(b3);
                int i = a2.getInt(b4);
                if (str == null) {
                    throw new NullPointerException("Null accountIdentifier");
                } else if (a3 != null) {
                    arrayList.add(new C30424c(str, a3, j, i));
                } else {
                    throw new NullPointerException("Null storageState");
                }
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }
}
