package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.ads.interactivemedia.p367v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anu */
/* compiled from: PG */
final class anu implements Handler.Callback {

    /* renamed from: a */
    protected final long f21061a;

    /* renamed from: b */
    protected boolean f21062b;

    /* renamed from: c */
    protected final ContentProgressProvider f21063c;

    /* renamed from: d */
    private final ans f21064d;

    /* renamed from: e */
    private final List f21065e;

    public anu() {
        this.f21062b = false;
        this.f21065e = new ArrayList(1);
        this.f21061a = 200;
        this.f21064d = new ans(new Handler(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15046a(ant ant) {
        this.f21065e.add(ant);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15047b(ant ant) {
        this.f21065e.remove(ant);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15048c() {
        if (!this.f21062b) {
            this.f21062b = true;
            this.f21064d.mo15043b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo15049d() {
        if (this.f21062b) {
            this.f21062b = false;
            this.f21064d.mo15044c();
        }
    }

    /* renamed from: e */
    public VideoProgressUpdate mo15050e() {
        VideoProgressUpdate contentProgress = this.f21063c.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0 || i == 1) {
            VideoProgressUpdate e = mo15050e();
            for (ant a : this.f21065e) {
                a.mo14971a(e);
            }
            this.f21064d.mo15045d(this.f21061a);
        } else if (i == 2) {
            this.f21064d.mo15042a();
        }
        return true;
    }

    public anu(ContentProgressProvider contentProgressProvider) {
        this();
        this.f21063c = contentProgressProvider;
    }
}
