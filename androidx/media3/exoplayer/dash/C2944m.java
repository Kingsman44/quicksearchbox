package androidx.media3.exoplayer.dash;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.exoplayer.p151k.C3257w;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.dash.m */
/* compiled from: PG */
final class C2944m implements C3257w {

    /* renamed from: a */
    final /* synthetic */ DashMediaSource f8451a;

    public C2944m(DashMediaSource dashMediaSource) {
        this.f8451a = dashMediaSource;
    }

    /* renamed from: a */
    public final void mo6828a() {
        this.f8451a.f8279d.mo7250c(LinearLayoutManager.INVALID_OFFSET);
        IOException iOException = this.f8451a.f8280e;
        if (iOException != null) {
            throw iOException;
        }
    }
}
