package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p728a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.a.c */
/* compiled from: PG */
public final class C11988c {

    /* renamed from: a */
    public static final C59071e f38495a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.a.c");

    /* renamed from: b */
    public final Context f38496b;

    /* renamed from: c */
    public final Executor f38497c;

    public C11988c(Context context, Executor executor) {
        this.f38496b = context;
        this.f38497c = executor;
    }

    /* renamed from: a */
    public final void mo20352a() {
        if (Build.VERSION.SDK_INT >= 31) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f38496b.getSystemService("appops");
            if (appOpsManager == null) {
                ((C59052c) ((C59052c) f38495a.mo56226d()).mo56372aa(43952)).mo56386p("#audio# Unable to get access to app ops manager");
            } else {
                appOpsManager.finishOp("android:record_audio", Process.myUid(), this.f38496b.getPackageName(), C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_MIC));
            }
        }
    }
}
