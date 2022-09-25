package com.google.android.libraries.p1657ba.p1661b.p1662a.p1663a;

import android.content.Context;
import android.widget.Toast;
import com.google.android.libraries.p1657ba.p1664c.p1665a.C19644a;

/* renamed from: com.google.android.libraries.ba.b.a.a.b */
/* compiled from: PG */
public final class C19643b {

    /* renamed from: b */
    private static final int f54647b = Math.round(C19644a.f54649a * 168.0f);

    /* renamed from: a */
    public final Context f54648a;

    public C19643b(Context context) {
        this.f54648a = context;
    }

    /* renamed from: b */
    public static final void m37472b(Toast toast) {
        toast.setGravity(81, 0, f54647b);
        toast.show();
    }

    /* renamed from: a */
    public final void mo24966a(int i, Object... objArr) {
        m37472b(Toast.makeText(this.f54648a, this.f54648a.getString(i, objArr), 0));
    }
}
