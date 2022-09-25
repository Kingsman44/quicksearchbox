package com.google.android.youtube.player;

import com.google.android.youtube.player.p3561b.C45466ay;
import com.google.android.youtube.player.p3561b.C45468b;
import com.google.android.youtube.player.p3561b.C45504x;
import java.security.AccessControlException;

/* renamed from: com.google.android.youtube.player.l */
final class C45516l implements C45468b {

    /* renamed from: a */
    final /* synthetic */ YouTubeEmbedSupportFragment f118968a;

    public /* synthetic */ C45516l(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment) {
        this.f118968a = youTubeEmbedSupportFragment;
    }

    /* renamed from: a */
    public final void mo49620a(boolean z) {
        C45466ay ayVar = this.f118968a.f118841b;
        int i = 2;
        if (!ayVar.f118879a.isEmpty()) {
            if (!z) {
                throw new AccessControlException("Permission denied: unauthorized usage of Ad Events API");
            }
        } else if (!z) {
            i = 3;
        }
        ayVar.f118880b = i;
    }

    /* renamed from: i */
    public final void mo44072i(C45504x xVar) {
        this.f118968a.f118841b.mo49616c(xVar);
    }
}
