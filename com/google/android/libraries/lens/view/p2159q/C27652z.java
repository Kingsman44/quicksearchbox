package com.google.android.libraries.lens.view.p2159q;

import android.content.Context;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.q.z */
/* compiled from: PG */
public final class C27652z {

    /* renamed from: a */
    public static final C58974d f75504a = C58974d.m91135i("MddBundledModelUtils");

    /* renamed from: b */
    public static final boolean f75505b;

    /* renamed from: c */
    public final Context f75506c;

    /* renamed from: d */
    public final C26034j f75507d;

    static {
        ClassLoader classLoader = C27580aa.class.getClassLoader();
        boolean z = false;
        if (classLoader != null) {
            try {
                classLoader.loadClass("com.google.android.libraries.lens.view.download.MddBundledModelsEnabled");
                z = true;
            } catch (Exception unused) {
            }
        }
        f75505b = z;
    }

    public C27652z(Context context, C26034j jVar) {
        this.f75506c = context;
        this.f75507d = jVar;
    }
}
