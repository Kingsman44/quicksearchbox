package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: androidx.savedstate.a */
/* compiled from: PG */
public final class C4085a implements C4087c {

    /* renamed from: a */
    public final Set f13075a = new LinkedHashSet();

    public C4085a(C4088d dVar) {
        dVar.mo8585b("androidx.savedstate.Restarter", this);
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f13075a));
        return bundle;
    }
}
