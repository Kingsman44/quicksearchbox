package com.google.android.libraries.assistant.pcp.datastore.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3940b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.m */
/* compiled from: PG */
final class C18626m implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f52649a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f52650b;

    /* renamed from: c */
    final /* synthetic */ C18627n f52651c;

    public C18626m(C18627n nVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f52651c = nVar;
        this.f52649a = amVar;
        this.f52650b = cancellationSignal;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        Cursor a = C3940b.m11293a(this.f52651c.f52652a, this.f52649a, false, this.f52650b);
        try {
            C58480gp e = C58485gu.m89837e();
            while (a.moveToNext()) {
                if (a.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = a.getBlob(0);
                }
                e.mo55395g(C18619f.m36083a(bArr));
            }
            return e.mo55394f();
        } finally {
            a.close();
        }
    }
}
