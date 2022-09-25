package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.j */
/* compiled from: PG */
final class C114490j implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f317458a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f317459b;

    /* renamed from: c */
    final /* synthetic */ C114491k f317460c;

    public C114490j(C114491k kVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f317460c = kVar;
        this.f317458a = amVar;
        this.f317459b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Cursor a = C3940b.m11293a(this.f317460c.f317461a, this.f317458a, false, this.f317459b);
        try {
            int b = C3939a.m11292b(a, "groupingKey");
            int b2 = C3939a.m11292b(a, "notificationArgs");
            int b3 = C3939a.m11292b(a, "uniqueId");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                byte[] bArr = null;
                if (a.isNull(b)) {
                    str = null;
                } else {
                    str = a.getString(b);
                }
                if (!a.isNull(b2)) {
                    bArr = a.getBlob(b2);
                }
                arrayList.add(C114493m.m189779d(str, bArr, a.getLong(b3)));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }
}
