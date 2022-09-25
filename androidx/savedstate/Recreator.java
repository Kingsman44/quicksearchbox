package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class Recreator implements C2389t {

    /* renamed from: a */
    private final C4091g f13073a;

    public Recreator(C4091g gVar) {
        C69664n.m101061g(gVar, "owner");
        this.f13073a = gVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == C2382m.ON_CREATE) {
            vVar.getLifecycle().mo5791c(this);
            Bundle a = this.f13073a.getSavedStateRegistry().mo8584a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C4086b.class);
                            C69664n.m101060f(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    C69664n.m101060f(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((C4086b) newInstance).mo5786f(this.f13073a);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException("Class " + next + " wasn't found", e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
