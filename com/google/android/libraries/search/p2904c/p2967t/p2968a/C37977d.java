package com.google.android.libraries.search.p2904c.p2967t.p2968a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.core.p094f.C1888a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.t.a.d */
/* compiled from: PG */
public final class C37977d {

    /* renamed from: a */
    public static final C59071e f100611a = C59071e.m91332i("com.google.android.libraries.search.c.t.a.d");

    /* renamed from: b */
    public final Context f100612b;

    /* renamed from: c */
    public final Executor f100613c;

    public C37977d(Context context, Executor executor) {
        this.f100612b = context;
        this.f100613c = executor;
    }

    /* renamed from: a */
    public final void mo41184a(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f100612b.getSystemService("appops");
            if (appOpsManager == null) {
                ((C59052c) ((C59052c) f100611a.mo56226d()).mo56372aa(52900)).mo56386p("#audio# unable to get access to app ops manager for startOp");
            } else {
                appOpsManager.finishOp("android:record_audio", Process.myUid(), this.f100612b.getPackageName(), str);
            }
        }
    }

    /* renamed from: b */
    public final void mo41185b(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f100612b.getSystemService("appops");
            if (appOpsManager == null) {
                ((C59052c) ((C59052c) f100611a.mo56226d()).mo56372aa(52902)).mo56386p("#audio# unable to get access to app ops manager for startOp");
            } else {
                appOpsManager.startOp("android:record_audio", Process.myUid(), this.f100612b.getPackageName(), str, (String) null);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo41186c() {
        if (!C1888a.m5149c()) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f100612b.getSystemService("appops");
        if (appOpsManager == null) {
            ((C59052c) ((C59052c) f100611a.mo56226d()).mo56372aa(52903)).mo56386p("#audio# Unable to get access to app ops manager");
            return true;
        } else if (appOpsManager.unsafeCheckOpNoThrow("android:record_audio", Process.myUid(), this.f100612b.getPackageName()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo41187d(C60870cx cxVar, C60870cx cxVar2, String str) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C37976c(this, str, cxVar2)), this.f100613c);
    }
}
