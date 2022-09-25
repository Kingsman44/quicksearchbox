package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C143783cd;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C146412g;
import com.google.android.gms.wearable.C146527j;

/* renamed from: com.google.android.gms.wearable.internal.de */
/* compiled from: PG */
final class C146501de implements C143783cd {

    /* renamed from: a */
    final /* synthetic */ DataHolder f395695a;

    public C146501de(DataHolder dataHolder) {
        this.f395695a = dataHolder;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo118340b(Object obj) {
        try {
            ((C146412g) obj).mo88557e(new C146527j(this.f395695a));
        } finally {
            this.f395695a.close();
        }
    }

    /* renamed from: c */
    public final void mo118341c() {
        this.f395695a.close();
    }
}
