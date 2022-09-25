package androidx.p190r;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.googlequicksearchbox.R;
import java.util.HashSet;

/* renamed from: androidx.r.b */
/* compiled from: PG */
public final class C4060b extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C4062d();
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            if (C4059a.f12945a == null) {
                synchronized (C4059a.f12946b) {
                    if (C4059a.f12945a == null) {
                        C4059a.f12945a = new C4059a(context);
                    }
                }
            }
            Class<?> cls = getClass();
            C4059a aVar = C4059a.f12945a;
            try {
                Trace.beginSection("Startup");
                Bundle bundle = aVar.f12949e.getPackageManager().getProviderInfo(new ComponentName(aVar.f12949e, cls), 128).metaData;
                String string = aVar.f12949e.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, (String) null))) {
                            Class<?> cls2 = Class.forName(str);
                            if (C4061c.class.isAssignableFrom(cls2)) {
                                aVar.f12948d.add(cls2);
                            }
                        }
                    }
                    for (Class a : aVar.f12948d) {
                        aVar.mo8494a(a, hashSet);
                    }
                }
                Trace.endSection();
                return true;
            } catch (ClassNotFoundException e) {
                throw new C4062d(e);
            } catch (PackageManager.NameNotFoundException e2) {
                try {
                    throw new C4062d(e2);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
