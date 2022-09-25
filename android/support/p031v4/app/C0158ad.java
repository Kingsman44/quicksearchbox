package android.support.p031v4.app;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0815b;
import androidx.activity.result.p046a.C0809b;
import androidx.p054b.p055a.p058c.C0895a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: android.support.v4.app.ad */
/* compiled from: PG */
final class C0158ad extends C0162ah {

    /* renamed from: a */
    final /* synthetic */ C0895a f697a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f698b;

    /* renamed from: c */
    final /* synthetic */ C0809b f699c;

    /* renamed from: d */
    final /* synthetic */ C0815b f700d;

    /* renamed from: e */
    final /* synthetic */ Fragment f701e;

    public C0158ad(Fragment fragment, C0895a aVar, AtomicReference atomicReference, C0809b bVar, C0815b bVar2) {
        this.f701e = fragment;
        this.f697a = aVar;
        this.f698b = atomicReference;
        this.f699c = bVar;
        this.f700d = bVar2;
    }

    /* renamed from: a */
    public final void mo524a() {
        this.f698b.set(((ActivityResultRegistry) this.f697a.mo523a((Object) null)).mo3360c(this.f701e.generateActivityResultKey(), this.f701e, this.f699c, this.f700d));
    }
}
