package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.appsearch.p048b.C0863b;
import androidx.p060c.C0979i;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: androidx.appsearch.a.g */
/* compiled from: PG */
public final class C0842g {

    /* renamed from: a */
    private final String f2822a;

    /* renamed from: b */
    private ArrayList f2823b = new ArrayList();

    /* renamed from: c */
    private final Set f2824c = new C0979i(0);

    /* renamed from: d */
    private boolean f2825d = false;

    public C0842g(String str) {
        this.f2822a = str;
    }

    /* renamed from: a */
    public final C0853r mo3394a() {
        Bundle bundle = new Bundle();
        bundle.putString("schemaType", this.f2822a);
        bundle.putParcelableArrayList("properties", this.f2823b);
        this.f2825d = true;
        return new C0853r(bundle);
    }

    /* renamed from: b */
    public final void mo3395b(C0850o oVar) {
        if (this.f2825d) {
            this.f2823b = new ArrayList(this.f2823b);
            this.f2825d = false;
        }
        String e = oVar.mo3406e();
        if (this.f2824c.add(e)) {
            this.f2823b.add(oVar.f2833a);
            return;
        }
        throw new C0863b("Property defined more than once: ".concat(String.valueOf(e)));
    }
}
