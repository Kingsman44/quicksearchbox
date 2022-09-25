package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.p10795a.p10796a.C144192b;
import com.google.android.gms.googlehelp.C144293i;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.List;

/* renamed from: com.google.android.gms.googlehelp.internal.common.a */
/* compiled from: PG */
public final class C144294a implements Runnable {

    /* renamed from: a */
    private final Context f390826a;

    /* renamed from: b */
    private final GoogleHelp f390827b;

    /* renamed from: c */
    private final C144189a f390828c;

    /* renamed from: d */
    private final long f390829d;

    public C144294a(Context context, GoogleHelp googleHelp, C144189a aVar, long j) {
        this.f390826a = context;
        this.f390827b = googleHelp;
        this.f390828c = aVar;
        this.f390829d = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        List list = null;
        try {
            C144192b bVar = new C144192b((byte[]) null);
            bVar.f390596b = bVar.mo119734b();
            List<FileTeleporter> a = this.f390828c.mo27016a();
            File cacheDir = this.f390826a.getCacheDir();
            if (!(a == null || a.isEmpty() || cacheDir == null)) {
                for (FileTeleporter fileTeleporter : a) {
                    fileTeleporter.f390586e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(bVar.mo119733a()));
            list = a;
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        FeedbackOptions a2 = FeedbackOptions.m234419a(list);
        C144297ac b = C144293i.m234538b(this.f390826a);
        GoogleHelp googleHelp = this.f390827b;
        long j = this.f390829d;
        C143851w wVar = b.f389929D;
        C144317l lVar = new C144317l(wVar, a2, bundle, j, googleHelp);
        wVar.mo119159d(lVar);
        C143918bg.m233956b(lVar);
    }
}
