package com.google.android.gms.feedback.p10795a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.feedback.C144205j;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.p10795a.p10796a.C144192b;
import java.io.File;
import java.util.List;

/* renamed from: com.google.android.gms.feedback.a.b */
/* compiled from: PG */
public final class C144193b implements Runnable {

    /* renamed from: a */
    private final Context f390597a;

    /* renamed from: b */
    private final C144189a f390598b;

    /* renamed from: c */
    private final long f390599c;

    public C144193b(Context context, C144189a aVar, long j) {
        this.f390597a = context;
        this.f390598b = aVar;
        this.f390599c = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        List list = null;
        try {
            C144192b bVar = new C144192b((byte[]) null);
            bVar.f390596b = bVar.mo119734b();
            List<FileTeleporter> a = this.f390598b.mo27016a();
            File cacheDir = this.f390597a.getCacheDir();
            if (!(a == null || a.isEmpty() || cacheDir == null)) {
                for (FileTeleporter fileTeleporter : a) {
                    fileTeleporter.f390586e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(bVar.mo119733a()));
            list = a;
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        long j = this.f390599c;
        C143918bg.m233956b(C144205j.m234444a(C144205j.m234448e(this.f390597a).f389929D, FeedbackOptions.m234419a(list), bundle, j));
    }
}
