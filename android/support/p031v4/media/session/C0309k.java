package android.support.p031v4.media.session;

import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.k */
/* compiled from: PG */
class C0309k extends C0300b {

    /* renamed from: a */
    private final WeakReference f1039a;

    public C0309k(C0310l lVar) {
        this.f1039a = new WeakReference(lVar);
    }

    /* renamed from: a */
    public final void mo904a(boolean z) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(11, Boolean.valueOf(z), (Bundle) null);
        }
    }

    /* renamed from: b */
    public final void mo906b(String str, Bundle bundle) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(1, str, bundle);
        }
    }

    /* renamed from: c */
    public void mo907c(Bundle bundle) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(7, bundle, (Bundle) null);
        }
    }

    /* renamed from: d */
    public void mo908d(MediaMetadataCompat mediaMetadataCompat) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(3, mediaMetadataCompat, (Bundle) null);
        }
    }

    /* renamed from: e */
    public final void mo909e(PlaybackStateCompat playbackStateCompat) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(2, playbackStateCompat, (Bundle) null);
        }
    }

    /* renamed from: f */
    public void mo910f(List list) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(5, list, (Bundle) null);
        }
    }

    /* renamed from: g */
    public void mo911g(CharSequence charSequence) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(6, charSequence, (Bundle) null);
        }
    }

    /* renamed from: h */
    public final void mo912h(int i) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(9, Integer.valueOf(i), (Bundle) null);
        }
    }

    /* renamed from: i */
    public void mo913i() {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(8, (Object) null, (Bundle) null);
        }
    }

    /* renamed from: j */
    public final void mo914j() {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(13, (Object) null, (Bundle) null);
        }
    }

    /* renamed from: k */
    public final void mo915k(int i) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(12, Integer.valueOf(i), (Bundle) null);
        }
    }

    /* renamed from: l */
    public void mo916l(ParcelableVolumeInfo parcelableVolumeInfo) {
        C0310l lVar = (C0310l) this.f1039a.get();
        if (lVar != null) {
            lVar.mo1014m(4, parcelableVolumeInfo != null ? new C0314p(parcelableVolumeInfo.f990b) : null, (Bundle) null);
        }
    }
}
