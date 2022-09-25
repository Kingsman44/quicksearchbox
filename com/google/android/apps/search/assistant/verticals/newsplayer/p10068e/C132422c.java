package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import com.google.android.gms.cast.framework.media.C143497bc;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.c */
/* compiled from: PG */
public final /* synthetic */ class C132422c implements C143497bc {

    /* renamed from: a */
    public final /* synthetic */ C132441v f361435a;

    public /* synthetic */ C132422c(C132441v vVar) {
        this.f361435a = vVar;
    }

    /* renamed from: d */
    public final void mo6035d(long j, long j2) {
        C132441v vVar = this.f361435a;
        C47538ax c = vVar.f361467b.mo51613c("remoteMediaClient#onProgressUpdated");
        try {
            if (vVar.f361475j) {
                if (j >= 0 && j2 > 0) {
                    vVar.f361477l = C62948a.m95459j(j);
                    vVar.f361478m = C62948a.m95459j(j2);
                    vVar.mo110727v();
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
