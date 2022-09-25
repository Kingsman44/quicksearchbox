package androidx.work.impl.p204a.p206b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C4380ad;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.f */
/* compiled from: PG */
public abstract class C4431f extends C4434i {

    /* renamed from: e */
    private final BroadcastReceiver f14111e = new C4430e(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4431f(Context context, C4595b bVar) {
        super(context, bVar);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    public abstract IntentFilter mo9376a();

    /* renamed from: c */
    public abstract void mo9378c(Intent intent);

    /* renamed from: d */
    public final void mo9380d() {
        C4380ad.m12560h().mo9309a(C4432g.f14112a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.f14115a.registerReceiver(this.f14111e, mo9376a());
    }

    /* renamed from: e */
    public final void mo9381e() {
        C4380ad.m12560h().mo9309a(C4432g.f14112a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.f14115a.unregisterReceiver(this.f14111e);
    }
}
