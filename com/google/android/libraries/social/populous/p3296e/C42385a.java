package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.a */
/* compiled from: PG */
public final class C42385a extends C42448c {

    /* renamed from: a */
    public C58485gu f111155a;

    /* renamed from: b */
    public C58833ax f111156b = C58836b.f156633a;

    /* renamed from: c */
    public C42264aq f111157c;

    /* renamed from: d */
    public C42549n f111158d;

    /* renamed from: e */
    public Long f111159e;

    /* renamed from: f */
    public Integer f111160f;

    /* renamed from: g */
    public byte f111161g;

    /* renamed from: h */
    public int f111162h;

    /* renamed from: i */
    private int f111163i;

    /* renamed from: j */
    private int f111164j;

    /* renamed from: k */
    private boolean f111165k;

    /* renamed from: l */
    private AutocompletionCallbackMetadata f111166l;

    /* renamed from: a */
    public final C42500d mo45365a() {
        C58485gu guVar;
        C42549n nVar;
        int i;
        AutocompletionCallbackMetadata autocompletionCallbackMetadata;
        if (this.f111161g == 15 && (guVar = this.f111155a) != null && (nVar = this.f111158d) != null && (i = this.f111162h) != 0 && (autocompletionCallbackMetadata = this.f111166l) != null) {
            return new C42402b(guVar, this.f111156b, this.f111157c, this.f111163i, this.f111164j, nVar, this.f111159e, this.f111165k, this.f111160f, i, autocompletionCallbackMetadata);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111155a == null) {
            sb.append(" results");
        }
        if ((this.f111161g & 1) == 0) {
            sb.append(" callbackNumber");
        }
        if ((this.f111161g & 2) == 0) {
            sb.append(" positionOffset");
        }
        if (this.f111158d == null) {
            sb.append(" queryState");
        }
        if ((this.f111161g & 4) == 0) {
            sb.append(" isLastCallback");
        }
        if (this.f111162h == 0) {
            sb.append(" resultsSourceType");
        }
        if (this.f111166l == null) {
            sb.append(" metadata");
        }
        if ((this.f111161g & 8) == 0) {
            sb.append(" containsPartialResults");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45366b(int i) {
        this.f111163i = i;
        this.f111161g = (byte) (this.f111161g | 1);
    }

    /* renamed from: c */
    public final void mo45367c(boolean z) {
        this.f111165k = z;
        this.f111161g = (byte) (this.f111161g | 4);
    }

    /* renamed from: d */
    public final void mo45368d(AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        if (autocompletionCallbackMetadata != null) {
            this.f111166l = autocompletionCallbackMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    /* renamed from: e */
    public final void mo45369e(int i) {
        this.f111164j = i;
        this.f111161g = (byte) (this.f111161g | 2);
    }
}
