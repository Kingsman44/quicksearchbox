package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.i */
/* compiled from: PG */
final class C6761i implements C6707a {
    private String appState;
    private String eventId;
    private Long nativeTime;
    private Boolean nativeViewAttached;
    private C6726as nativeViewBounds;
    private Boolean nativeViewHidden;
    private C6726as nativeViewVisibleBounds;
    private Double nativeVolume;
    private String queryId;

    public C6707a appState(String str) {
        if (str != null) {
            this.appState = str;
            return this;
        }
        throw new NullPointerException("Null appState");
    }

    public C6734b build() {
        String str = this.queryId == null ? " queryId" : BuildConfig.FLAVOR;
        if (this.eventId == null) {
            str = str.concat(" eventId");
        }
        if (this.appState == null) {
            str = String.valueOf(str).concat(" appState");
        }
        if (this.nativeTime == null) {
            str = String.valueOf(str).concat(" nativeTime");
        }
        if (this.nativeVolume == null) {
            str = String.valueOf(str).concat(" nativeVolume");
        }
        if (this.nativeViewAttached == null) {
            str = String.valueOf(str).concat(" nativeViewAttached");
        }
        if (this.nativeViewHidden == null) {
            str = String.valueOf(str).concat(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            str = String.valueOf(str).concat(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            str = String.valueOf(str).concat(" nativeViewVisibleBounds");
        }
        if (str.isEmpty()) {
            return new C6762j(this.queryId, this.eventId, this.appState, this.nativeTime.longValue(), this.nativeVolume.doubleValue(), this.nativeViewAttached.booleanValue(), this.nativeViewHidden.booleanValue(), this.nativeViewBounds, this.nativeViewVisibleBounds);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public C6707a eventId(String str) {
        if (str != null) {
            this.eventId = str;
            return this;
        }
        throw new NullPointerException("Null eventId");
    }

    public C6707a nativeTime(long j) {
        this.nativeTime = Long.valueOf(j);
        return this;
    }

    public C6707a nativeViewAttached(boolean z) {
        this.nativeViewAttached = Boolean.valueOf(z);
        return this;
    }

    public C6707a nativeViewBounds(C6726as asVar) {
        if (asVar != null) {
            this.nativeViewBounds = asVar;
            return this;
        }
        throw new NullPointerException("Null nativeViewBounds");
    }

    public C6707a nativeViewHidden(boolean z) {
        this.nativeViewHidden = Boolean.valueOf(z);
        return this;
    }

    public C6707a nativeViewVisibleBounds(C6726as asVar) {
        if (asVar != null) {
            this.nativeViewVisibleBounds = asVar;
            return this;
        }
        throw new NullPointerException("Null nativeViewVisibleBounds");
    }

    public C6707a nativeVolume(double d) {
        this.nativeVolume = Double.valueOf(d);
        return this;
    }

    public C6707a queryId(String str) {
        if (str != null) {
            this.queryId = str;
            return this;
        }
        throw new NullPointerException("Null queryId");
    }
}
