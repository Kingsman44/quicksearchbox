package androidx.activity;

import android.os.Bundle;
import androidx.activity.p045a.C0788b;
import androidx.activity.result.ActivityResultRegistry;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: androidx.activity.c */
/* compiled from: PG */
public final /* synthetic */ class C0790c implements C0788b {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f2732a;

    public /* synthetic */ C0790c(ComponentActivity componentActivity) {
        this.f2732a = componentActivity;
    }

    /* renamed from: a */
    public final void mo531a() {
        ComponentActivity componentActivity = this.f2732a;
        Bundle a = componentActivity.f2706g.f13082a.mo8584a("android:support:activity-result");
        if (a != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.f2708i;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                activityResultRegistry.f2761e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                activityResultRegistry.f2758b = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                activityResultRegistry.f2764h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (activityResultRegistry.f2760d.containsKey(str)) {
                        Integer num = (Integer) activityResultRegistry.f2760d.remove(str);
                        if (!activityResultRegistry.f2764h.containsKey(str)) {
                            activityResultRegistry.f2759c.remove(num);
                        }
                    }
                    activityResultRegistry.mo3361d(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }
}
