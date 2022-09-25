package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.b */
/* compiled from: PG */
final class C42194b extends C42186as {

    /* renamed from: a */
    public GroupMetadata f110516a;

    /* renamed from: b */
    private String f110517b;

    /* renamed from: c */
    private String f110518c;

    /* renamed from: d */
    private C58485gu f110519d;

    /* renamed from: e */
    private C58485gu f110520e;

    /* renamed from: a */
    public final Group mo44871a() {
        if (this.f110517b != null && this.f110518c != null && this.f110516a != null && this.f110519d != null && this.f110520e != null) {
            return new AutoValue_Group(this.f110517b, this.f110518c, this.f110516a, this.f110519d, this.f110520e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f110517b == null) {
            sb.append(" key");
        }
        if (this.f110518c == null) {
            sb.append(" groupId");
        }
        if (this.f110516a == null) {
            sb.append(" metadata");
        }
        if (this.f110519d == null) {
            sb.append(" origins");
        }
        if (this.f110520e == null) {
            sb.append(" membersSnippet");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44872b(String str) {
        if (str != null) {
            this.f110518c = str;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    /* renamed from: c */
    public final void mo44873c(String str) {
        if (str != null) {
            this.f110517b = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: d */
    public final void mo44874d(C58485gu guVar) {
        if (guVar != null) {
            this.f110520e = guVar;
            return;
        }
        throw new NullPointerException("Null membersSnippet");
    }

    /* renamed from: e */
    public final void mo44875e(C58485gu guVar) {
        if (guVar != null) {
            this.f110519d = guVar;
            return;
        }
        throw new NullPointerException("Null origins");
    }
}
