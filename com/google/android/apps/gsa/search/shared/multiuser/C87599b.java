package com.google.android.apps.gsa.search.shared.multiuser;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.b */
/* compiled from: PG */
public final class C87599b extends C8848a implements C87601d {
    public C87599b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
    }

    /* renamed from: e */
    public final void mo81736e(List list) {
        Parcel gA = mo17260gA();
        gA.writeTypedList(list);
        mo17263hf(3, gA);
    }

    /* renamed from: f */
    public final void mo81737f(Bitmap bitmap) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bitmap);
        mo17263hf(2, gA);
    }

    /* renamed from: g */
    public final void mo81738g() {
        mo17263hf(1, mo17260gA());
    }
}
