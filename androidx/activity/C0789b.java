package androidx.activity;

import android.os.Bundle;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.C4087c;
import java.util.ArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: PG */
public final /* synthetic */ class C0789b implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f2731a;

    public /* synthetic */ C0789b(ComponentActivity componentActivity) {
        this.f2731a = componentActivity;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        ComponentActivity componentActivity = this.f2731a;
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.f2708i;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(activityResultRegistry.f2760d.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(activityResultRegistry.f2760d.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(activityResultRegistry.f2761e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f2764h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f2758b);
        return bundle;
    }
}
