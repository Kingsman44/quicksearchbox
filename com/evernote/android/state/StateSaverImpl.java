package com.evernote.android.state;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.evernote.android.state.Injector;
import java.util.Map;

/* compiled from: PG */
final class StateSaverImpl {
    private final Map mInjectors;

    public StateSaverImpl(Map map) {
        this.mInjectors = map;
    }

    private Injector getInjector(Class cls) {
        Injector injector;
        Injector injector2 = (Injector) this.mInjectors.get(cls);
        if (injector2 != null || this.mInjectors.containsKey(cls)) {
            return injector2;
        }
        String name = cls.getName();
        if (name.startsWith(StateSaver.ANDROID_PREFIX) || name.startsWith(StateSaver.JAVA_PREFIX)) {
            return null;
        }
        try {
            injector = (Injector) Class.forName(name + StateSaver.SUFFIX).newInstance();
        } catch (Exception unused) {
            injector = getInjector(cls.getSuperclass());
        }
        this.mInjectors.put(cls, injector);
        return injector;
    }

    private Injector safeGet(Object obj, Injector injector) {
        try {
            Injector injector2 = getInjector(obj.getClass());
            return injector2 == null ? injector : injector2;
        } catch (Exception e) {
            new StringBuilder("Unable to inject state for ").append(obj);
            throw new RuntimeException("Unable to inject state for ".concat(String.valueOf(obj)), e);
        }
    }

    public Parcelable restoreInstanceState(View view, Parcelable parcelable) {
        if (parcelable != null) {
            return ((Injector.View) safeGet(view, Injector.View.DEFAULT)).restore(view, parcelable);
        }
        return null;
    }

    public Parcelable saveInstanceState(View view, Parcelable parcelable) {
        return ((Injector.View) safeGet(view, Injector.View.DEFAULT)).save(view, parcelable);
    }

    public void setEnabledForAllActivitiesAndSupportFragments(Application application, boolean z) {
        if (AndroidLifecycleCallbacks.INSTANCE.mEnabled != z) {
            if (z) {
                application.registerActivityLifecycleCallbacks(AndroidLifecycleCallbacks.INSTANCE);
            } else {
                application.unregisterActivityLifecycleCallbacks(AndroidLifecycleCallbacks.INSTANCE);
            }
            AndroidLifecycleCallbacks.INSTANCE.mEnabled = z;
        }
    }

    public void restoreInstanceState(Object obj, Bundle bundle) {
        if (bundle != null) {
            ((Injector.Object) safeGet(obj, Injector.Object.DEFAULT)).restore(obj, bundle);
        }
    }

    public void saveInstanceState(Object obj, Bundle bundle) {
        ((Injector.Object) safeGet(obj, Injector.Object.DEFAULT)).save(obj, bundle);
    }
}
