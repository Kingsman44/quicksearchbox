package androidx.activity.result;

import androidx.activity.result.p046a.C0809b;

/* renamed from: androidx.activity.result.d */
/* compiled from: PG */
final class C0817d extends C0816c {

    /* renamed from: a */
    final /* synthetic */ String f2774a;

    /* renamed from: b */
    final /* synthetic */ C0809b f2775b;

    /* renamed from: c */
    final /* synthetic */ ActivityResultRegistry f2776c;

    public C0817d(ActivityResultRegistry activityResultRegistry, String str, C0809b bVar) {
        this.f2776c = activityResultRegistry;
        this.f2774a = str;
        this.f2775b = bVar;
    }

    /* renamed from: a */
    public final void mo525a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo526b(Object obj) {
        Integer num = (Integer) this.f2776c.f2760d.get(this.f2774a);
        if (num != null) {
            this.f2776c.f2761e.add(this.f2774a);
            try {
                this.f2776c.mo3347a(num.intValue(), this.f2775b, obj);
            } catch (Exception e) {
                this.f2776c.f2761e.remove(this.f2774a);
                throw e;
            }
        } else {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f2775b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
