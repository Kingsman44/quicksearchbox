package com.google.android.libraries.assistant.p1535p;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.p.a */
/* compiled from: PG */
public abstract class C18509a {
    /* renamed from: a */
    public abstract Bundle mo24019a();

    /* renamed from: b */
    public abstract C18522b mo24020b();

    @Deprecated
    /* renamed from: c */
    public final void mo24021c(String str) {
        mo24019a().putString("assistant_device_id", str);
    }

    @Deprecated
    /* renamed from: d */
    public final void mo24022d(ArrayList arrayList) {
        mo24019a().putParcelableArrayList("assistant_settings_device_info_extras", arrayList);
    }

    /* renamed from: e */
    public final void mo24023e(String str) {
        mo24019a().putString("extra_assistant_settings_entry_source", str);
    }

    /* renamed from: f */
    public abstract void mo24024f(String str);

    @Deprecated
    /* renamed from: g */
    public final void mo24025g(String str) {
        mo24019a().putString("assistant_settings_feature_action", str);
    }

    /* renamed from: h */
    public abstract void mo24026h(Bundle bundle);

    @Deprecated
    /* renamed from: i */
    public final void mo24027i(Integer num) {
        mo24019a().putInt("assistant_surface", num.intValue());
    }
}
