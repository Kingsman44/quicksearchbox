package com.google.android.play.core.p3538g;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.g.aw */
/* compiled from: PG */
public abstract class C45137aw {
    /* renamed from: j */
    public static C45137aw m80340j(Bundle bundle) {
        return new C45113a(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract int mo48945a();

    /* renamed from: b */
    public abstract int mo48946b();

    /* renamed from: c */
    public abstract int mo48947c();

    /* renamed from: d */
    public abstract long mo48948d();

    /* renamed from: e */
    public abstract long mo48949e();

    @Deprecated
    /* renamed from: f */
    public abstract PendingIntent mo48951f();

    /* renamed from: g */
    public abstract List mo48952g();

    /* renamed from: h */
    public abstract List mo48953h();

    /* renamed from: i */
    public abstract List mo48955i();

    /* renamed from: k */
    public final List mo48971k() {
        return mo48952g() != null ? new ArrayList(mo48952g()) : new ArrayList();
    }

    /* renamed from: l */
    public final List mo48972l() {
        if (mo48953h() != null) {
            return new ArrayList(mo48953h());
        }
        return new ArrayList();
    }

    /* renamed from: m */
    public final boolean mo48973m() {
        int c = mo48947c();
        return c == 0 || c == 5 || c == 6 || c == 7;
    }
}
