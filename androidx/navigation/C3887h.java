package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C2383n;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.h */
/* compiled from: PG */
public final class C3887h {
    /* renamed from: a */
    public static final C3892m m11189a(Context context, C3825ax axVar, Bundle bundle, C2383n nVar, C3810ai aiVar, String str, Bundle bundle2) {
        C69664n.m101061g(axVar, "destination");
        C69664n.m101061g(nVar, "hostLifecycleState");
        C69664n.m101061g(str, "id");
        return new C3892m(context, axVar, bundle, nVar, aiVar, str, bundle2);
    }

    /* renamed from: b */
    public static /* synthetic */ C3892m m11190b(Context context, C3825ax axVar, Bundle bundle, C2383n nVar, C3810ai aiVar) {
        String uuid = UUID.randomUUID().toString();
        C69664n.m101060f(uuid, "randomUUID().toString()");
        return m11189a(context, axVar, bundle, nVar, aiVar, uuid, (Bundle) null);
    }
}
