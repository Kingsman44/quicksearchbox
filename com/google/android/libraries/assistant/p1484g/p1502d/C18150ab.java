package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.g.d.ab */
/* compiled from: PG */
public final class C18150ab extends C8848a implements C18152ad {
    public C18150ab(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.assistant.directactions.sender.IRequestDirectActionsCallback");
    }

    /* renamed from: a */
    public final void mo20095a(List list) {
        Parcel gA = mo17260gA();
        gA.writeTypedList(list);
        mo17263hf(1, gA);
    }
}
