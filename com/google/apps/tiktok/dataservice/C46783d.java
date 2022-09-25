package com.google.apps.tiktok.dataservice;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.d */
/* compiled from: PG */
public abstract class C46783d extends ContentObserver {

    /* renamed from: a */
    private final C47770dh f122145a;

    /* renamed from: b */
    private final String f122146b;

    /* renamed from: c */
    private final Executor f122147c;

    protected C46783d(C47770dh dhVar, String str, Executor executor) {
        super((Handler) null);
        this.f122145a = dhVar;
        this.f122146b = str;
        this.f122147c = executor;
    }

    /* renamed from: b */
    private final void m83345b(boolean z, Uri uri) {
        this.f122147c.execute(C47810es.m84977q(new C46743c(this, z)));
    }

    /* renamed from: a */
    public abstract void mo21781a(boolean z);

    public final void onChange(boolean z) {
        if (C47831fm.m85027v()) {
            m83345b(z, (Uri) null);
            return;
        }
        C47538ax e = this.f122145a.mo51615e(this.f122146b, C47562bm.f123426a);
        try {
            m83345b(z, (Uri) null);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C46709b.m83237a(th, th);
        }
        throw th;
    }

    public final void onChange(boolean z, Uri uri) {
        if (C47831fm.m85027v()) {
            m83345b(z, uri);
            return;
        }
        C47538ax e = this.f122145a.mo51615e(this.f122146b, C47562bm.f123426a);
        try {
            m83345b(z, uri);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C46709b.m83237a(th, th);
        }
        throw th;
    }
}
