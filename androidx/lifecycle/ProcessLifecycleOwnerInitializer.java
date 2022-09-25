package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/* compiled from: PG */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        try {
            Class.forName("androidx.r.b");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            try {
                Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                cls.getMethod("create", new Class[]{Context.class}).invoke(newInstance, new Object[]{getContext()});
            } catch (Exception unused) {
                Log.d("ProcessLifecycleG3", "androidx.startup is not available, initializing using ProcessLifecycleOwnerInitializer instead.");
            }
        } catch (ClassNotFoundException unused2) {
            Context context = getContext();
            if (!C2388s.f6608a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2387r());
            }
            Context context2 = getContext();
            C2338am amVar = C2338am.f6534a;
            amVar.f6539f = new Handler();
            amVar.f6540g.mo5793e(C2382m.ON_CREATE);
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new C2336ak(amVar));
            return true;
        }
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
