package androidx.work.impl;

import android.content.Context;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.s */
/* compiled from: PG */
public final class C4563s extends C3937a {

    /* renamed from: c */
    private final Context f14410c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4563s(Context context, int i, int i2) {
        super(i, i2);
        C69664n.m101061g(context, "mContext");
        this.f14410c = context;
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        if (this.f12597b >= 10) {
            dVar.mo8254m(new Object[]{"reschedule_needed", 1});
            return;
        }
        this.f14410c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
