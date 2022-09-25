package androidx.appsearch.p047a;

import androidx.p060c.C0977g;
import androidx.p060c.C0979i;
import androidx.p060c.C0984n;
import java.util.Collection;
import java.util.Map;

/* renamed from: androidx.appsearch.a.ae */
/* compiled from: PG */
public final class C0832ae {

    /* renamed from: a */
    public C0979i f2794a = new C0979i(0);

    /* renamed from: b */
    public C0979i f2795b = new C0979i(0);

    /* renamed from: c */
    public C0977g f2796c = new C0977g();

    /* renamed from: d */
    public C0977g f2797d = new C0977g();

    /* renamed from: e */
    public C0977g f2798e = new C0977g();

    /* renamed from: f */
    public boolean f2799f = false;

    /* renamed from: g */
    public boolean f2800g = false;

    /* renamed from: a */
    public final void mo3383a() {
        if (this.f2800g) {
            C0977g gVar = new C0977g(this.f2796c.f3122d);
            for (Map.Entry entry : this.f2796c.entrySet()) {
                gVar.put((String) entry.getKey(), new C0979i((Collection) entry.getValue()));
            }
            this.f2796c = gVar;
            this.f2797d = C0833af.m2687a(this.f2797d);
            this.f2794a = new C0979i(this.f2794a);
            this.f2795b = new C0979i(this.f2795b);
            this.f2798e = new C0977g((C0984n) this.f2798e);
            this.f2800g = false;
        }
    }
}
