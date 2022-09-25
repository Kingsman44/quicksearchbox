package com.google.android.sidekick.shared.remoteapi;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
public class CardRenderingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45329a();

    /* renamed from: a */
    public static final CardRenderingContext f118455a = new CardRenderingContext(C60866ct.f164955a, new Bundle()) {
    };

    /* renamed from: b */
    public final Object f118456b;

    /* renamed from: c */
    public final Bundle f118457c;

    /* renamed from: d */
    public Location f118458d;

    /* renamed from: e */
    private Future f118459e;

    @Deprecated
    public CardRenderingContext() {
        this(C60866ct.f164955a, new Bundle());
    }

    public CardRenderingContext(Future future, Bundle bundle) {
        this.f118456b = new Object();
        this.f118459e = future;
        this.f118457c = bundle;
    }

    /* renamed from: b */
    public static CardRenderingContext m80811b(Future future) {
        return new CardRenderingContext(future, new Bundle());
    }

    /* renamed from: a */
    public final int mo49306a() {
        int i;
        synchronized (this.f118456b) {
            i = this.f118457c.getInt("INCREASE_VIDEO_AUTOPLAY_LATENCY_MS", 0);
        }
        return i;
    }

    /* renamed from: c */
    public final RenderingContextParcelable mo49307c(String str, RenderingContextParcelable renderingContextParcelable) {
        synchronized (this.f118456b) {
            Bundle bundle = this.f118457c.getBundle("SPECIFIC_RENDERING_CONTEXT_CONTAINER_KEY");
            if (bundle == null) {
                bundle = new Bundle();
                this.f118457c.putBundle("SPECIFIC_RENDERING_CONTEXT_CONTAINER_KEY", bundle);
            }
            if (bundle.containsKey(str)) {
                RenderingContextParcelable renderingContextParcelable2 = (RenderingContextParcelable) bundle.getBundle(str).getParcelable("VALUE_KEY");
                return renderingContextParcelable2;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("VALUE_KEY", renderingContextParcelable);
            bundle.putBundle(str, bundle2);
            this.f118457c.putParcelable(str, renderingContextParcelable);
            return renderingContextParcelable;
        }
    }

    /* renamed from: d */
    public final void mo49308d() {
        Location location;
        synchronized (this.f118456b) {
            Future future = this.f118459e;
            if (future != null) {
                try {
                    location = (Location) C90877ak.m148472f(future);
                } catch (InterruptedException | ExecutionException unused) {
                    location = null;
                }
                this.f118458d = location;
                this.f118459e = null;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo49310e(boolean z) {
        synchronized (this.f118456b) {
            this.f118457c.putBoolean("YOUTUBE_APP_MEETS_REQUIREMENTS", z);
        }
    }

    /* renamed from: f */
    public final boolean mo49311f() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("YOUTUBE_APP_MEETS_REQUIREMENTS");
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo49312g() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("ASSISTANT_NOTIFICATION_ENABLE_KEY");
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo49313h() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("AMP_VIEWER_SUPPORTED_KEY", false);
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo49314i() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("FEED_IN_RECENT_ENABLED_KEY", false);
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo49315j() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("ENABLE_GESTALT_NO_HEADERS_A11Y", false);
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo49316k() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("ENABLE_GESTALT_NO_HEADERS_UI_KEY", false);
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo49317l() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("HQ_USE_FEED_V1P5_KEY", false);
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo49318m() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("ENABLE_URL_SHORTENING", false);
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo49319n() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("TALKBACK_ENABLED_KEY", false);
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo49320o() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("ENABLE_VIDEO_BUFFER_SMALL_SPINNER");
        }
        return z;
    }

    /* renamed from: p */
    public final boolean mo49321p() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("REMOVE_YOUTUBE_FRAGMENTS_BEFORE_ONE_TAP");
        }
        return z;
    }

    /* renamed from: q */
    public final boolean mo49322q() {
        boolean z;
        synchronized (this.f118456b) {
            z = this.f118457c.getBoolean("SHOULD_REUSE_ONE_YOUTUBE_FRAGMENT");
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this.f118456b) {
            mo49308d();
            parcel.writeBundle(this.f118457c);
            parcel.writeParcelable(this.f118458d, 0);
            parcel.writeParcelable((Parcelable) null, 0);
        }
    }

    public CardRenderingContext(Parcel parcel) {
        this.f118456b = new Object();
        this.f118457c = parcel.readBundle(CardRenderingContext.class.getClassLoader());
        this.f118458d = (Location) parcel.readParcelable(Location.class.getClassLoader());
        parcel.readParcelable(Location.class.getClassLoader());
    }
}
