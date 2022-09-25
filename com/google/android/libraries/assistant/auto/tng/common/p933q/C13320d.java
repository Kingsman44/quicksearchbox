package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.content.pm.ResolveInfo;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.d */
/* compiled from: PG */
public final /* synthetic */ class C13320d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13320d f41043a = new C13320d();

    private /* synthetic */ C13320d() {
    }

    public final Object apply(Object obj) {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        return (resolveInfo == null || resolveInfo.activityInfo == null) ? BuildConfig.FLAVOR : resolveInfo.activityInfo.packageName;
    }
}
