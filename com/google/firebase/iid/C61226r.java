package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.firebase.iid.r */
/* compiled from: PG */
public final class C61226r {

    /* renamed from: c */
    private static C61226r f165613c;

    /* renamed from: a */
    public Boolean f165614a = null;

    /* renamed from: b */
    public Boolean f165615b = null;

    private C61226r() {
    }

    /* renamed from: a */
    public static synchronized C61226r m93620a() {
        C61226r rVar;
        synchronized (C61226r.class) {
            if (f165613c == null) {
                f165613c = new C61226r();
            }
            rVar = f165613c;
        }
        return rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo57794b(Context context) {
        if (this.f165614a == null) {
            this.f165614a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f165614a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f165614a.booleanValue();
    }
}
