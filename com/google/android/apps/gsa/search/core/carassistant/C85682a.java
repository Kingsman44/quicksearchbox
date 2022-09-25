package com.google.android.apps.gsa.search.core.carassistant;

import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.a */
/* compiled from: PG */
public final class C85682a extends C85730h {

    /* renamed from: a */
    public Query f231691a;

    /* renamed from: b */
    public String f231692b;

    /* renamed from: c */
    public String f231693c;

    /* renamed from: d */
    public String f231694d;

    /* renamed from: e */
    public String f231695e;

    /* renamed from: f */
    public C63088z f231696f;

    /* renamed from: g */
    public byte f231697g;

    /* renamed from: h */
    public int f231698h;

    /* renamed from: i */
    private boolean f231699i;

    /* renamed from: j */
    private C58485gu f231700j;

    /* renamed from: k */
    private C58485gu f231701k;

    /* renamed from: a */
    public final CarAssistantSessionManager.CarAssistantSessionRequest mo79306a() {
        int i;
        String str;
        C58485gu guVar;
        C58485gu guVar2;
        C63088z zVar;
        if (this.f231697g != 31 || (i = this.f231698h) == 0 || (str = this.f231695e) == null || (guVar = this.f231700j) == null || (guVar2 = this.f231701k) == null || (zVar = this.f231696f) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f231698h == 0) {
                sb.append(" type");
            }
            if (this.f231695e == null) {
                sb.append(" mediaFacetAppPackageName");
            }
            if ((this.f231697g & 1) == 0) {
                sb.append(" sessionStartTime");
            }
            if ((this.f231697g & 2) == 0) {
                sb.append(" isInitialFusionRequest");
            }
            if ((this.f231697g & 4) == 0) {
                sb.append(" isEmbeddedDebugQuery");
            }
            if ((this.f231697g & 8) == 0) {
                sb.append(" dropOngoingQueries");
            }
            if ((this.f231697g & 16) == 0) {
                sb.append(" isSubsequentRequestInUiSession");
            }
            if (this.f231700j == null) {
                sb.append(" notifications");
            }
            if (this.f231701k == null) {
                sb.append(" legacyNotifications");
            }
            if (this.f231696f == null) {
                sb.append(" clientInputData");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest(i, this.f231691a, (HotwordDetectedEventData) null, this.f231692b, this.f231693c, this.f231694d, str, 0, this.f231699i, false, false, false, guVar, guVar2, zVar);
    }

    /* renamed from: b */
    public final void mo79307b(boolean z) {
        this.f231699i = z;
        this.f231697g = (byte) (this.f231697g | 2);
    }

    /* renamed from: c */
    public final void mo79308c(C58485gu guVar) {
        if (guVar != null) {
            this.f231701k = guVar;
            return;
        }
        throw new NullPointerException("Null legacyNotifications");
    }

    /* renamed from: d */
    public final void mo79309d(C58485gu guVar) {
        if (guVar != null) {
            this.f231700j = guVar;
            return;
        }
        throw new NullPointerException("Null notifications");
    }
}
