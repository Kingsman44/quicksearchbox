package androidx.mediarouter.p175a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.a.z */
/* compiled from: PG */
public final class C3753z {

    /* renamed from: a */
    public static final C3753z f12042a = new C3753z(new Bundle(), (List) null);

    /* renamed from: b */
    public final Bundle f12043b;

    /* renamed from: c */
    List f12044c;

    public C3753z(Bundle bundle, List list) {
        this.f12043b = bundle;
        this.f12044c = list;
    }

    /* renamed from: a */
    public static C3753z m10882a(Bundle bundle) {
        if (bundle != null) {
            return new C3753z(bundle, (List) null);
        }
        return null;
    }

    /* renamed from: b */
    public final List mo7925b() {
        mo7926c();
        return new ArrayList(this.f12044c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7926c() {
        if (this.f12044c == null) {
            ArrayList<String> stringArrayList = this.f12043b.getStringArrayList("controlCategories");
            this.f12044c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f12044c = Collections.emptyList();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo7927d() {
        mo7926c();
        return this.f12044c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3753z)) {
            return false;
        }
        C3753z zVar = (C3753z) obj;
        mo7926c();
        zVar.mo7926c();
        return this.f12044c.equals(zVar.f12044c);
    }

    public final int hashCode() {
        mo7926c();
        return this.f12044c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(mo7925b().toArray()) + " }";
    }
}
