package androidx.activity.result;

import androidx.activity.result.p046a.C0809b;

/* renamed from: androidx.activity.result.e */
/* compiled from: PG */
final class C0818e extends C0816c {

    /* renamed from: a */
    final /* synthetic */ String f2777a;

    /* renamed from: b */
    final /* synthetic */ C0809b f2778b;

    /* renamed from: c */
    final /* synthetic */ ActivityResultRegistry f2779c;

    public C0818e(ActivityResultRegistry activityResultRegistry, String str, C0809b bVar) {
        this.f2779c = activityResultRegistry;
        this.f2777a = str;
        this.f2778b = bVar;
    }

    /* renamed from: a */
    public final void mo525a() {
        this.f2779c.mo3362e(this.f2777a);
    }

    /* renamed from: b */
    public final void mo526b(Object obj) {
        Integer num = (Integer) this.f2779c.f2760d.get(this.f2777a);
        if (num != null) {
            this.f2779c.f2761e.add(this.f2777a);
            try {
                this.f2779c.mo3347a(num.intValue(), this.f2778b, obj);
            } catch (Exception e) {
                this.f2779c.f2761e.remove(this.f2777a);
                throw e;
            }
        } else {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f2778b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
