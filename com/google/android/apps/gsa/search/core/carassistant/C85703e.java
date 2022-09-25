package com.google.android.apps.gsa.search.core.carassistant;

import android.net.Uri;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.e */
/* compiled from: PG */
public final class C85703e extends C85735m {

    /* renamed from: a */
    public Query f231746a;

    /* renamed from: b */
    public Uri f231747b;

    /* renamed from: c */
    public String f231748c;

    /* renamed from: d */
    public String f231749d;

    /* renamed from: e */
    public String f231750e;

    /* renamed from: f */
    public byte f231751f;

    /* renamed from: g */
    private int f231752g;

    /* renamed from: h */
    private long f231753h;

    /* renamed from: i */
    private QueryTriggerType f231754i;

    /* renamed from: j */
    private boolean f231755j;

    /* renamed from: k */
    private boolean f231756k;

    /* renamed from: a */
    public final C85736n mo79337a() {
        QueryTriggerType queryTriggerType;
        if (this.f231751f == 63 && (queryTriggerType = this.f231754i) != null) {
            return new C85712f(this.f231746a, this.f231747b, this.f231752g, this.f231753h, queryTriggerType, this.f231755j, this.f231748c, this.f231749d, this.f231756k, this.f231750e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f231751f & 1) == 0) {
            sb.append(" samplingRateHz");
        }
        if ((this.f231751f & 2) == 0) {
            sb.append(" externalStartTimeMillis");
        }
        if (this.f231754i == null) {
            sb.append(" triggerType");
        }
        if ((this.f231751f & 4) == 0) {
            sb.append(" reopenUriForFollowOn");
        }
        if ((this.f231751f & 8) == 0) {
            sb.append(" isDeviceTriggered");
        }
        if ((this.f231751f & 16) == 0) {
            sb.append(" audioSessionId");
        }
        if ((this.f231751f & 32) == 0) {
            sb.append(" queryRequestId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo79338b(long j) {
        this.f231753h = j;
        this.f231751f = (byte) (this.f231751f | 2);
    }

    /* renamed from: c */
    public final void mo79339c(boolean z) {
        this.f231756k = z;
        this.f231751f = (byte) (this.f231751f | 8);
    }

    /* renamed from: d */
    public final void mo79340d(boolean z) {
        this.f231755j = z;
        this.f231751f = (byte) (this.f231751f | 4);
    }

    /* renamed from: e */
    public final void mo79341e(int i) {
        this.f231752g = i;
        this.f231751f = (byte) (this.f231751f | 1);
    }

    /* renamed from: f */
    public final void mo79342f(QueryTriggerType queryTriggerType) {
        if (queryTriggerType != null) {
            this.f231754i = queryTriggerType;
            return;
        }
        throw new NullPointerException("Null triggerType");
    }
}
