package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3940b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.q */
/* compiled from: PG */
final class C16173q implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47724a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47725b;

    /* renamed from: c */
    final /* synthetic */ C16075aa f47726c;

    public C16173q(C16075aa aaVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47726c = aaVar;
        this.f47724a = amVar;
        this.f47725b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Cursor a = C3940b.m11293a(this.f47726c.f47535a, this.f47724a, false, this.f47725b);
        try {
            Integer num = null;
            if (a.moveToFirst()) {
                if (!a.isNull(0)) {
                    num = Integer.valueOf(a.getInt(0));
                }
            }
            return num;
        } finally {
            a.close();
        }
    }
}
