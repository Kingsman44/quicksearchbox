package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e.b.g */
/* compiled from: PG */
final class C78248g extends C78243b {

    /* renamed from: a */
    private final Optional f215391a;

    /* renamed from: b */
    private final Optional f215392b;

    /* renamed from: c */
    private final e f215393c;

    /* renamed from: d */
    private final boolean f215394d;

    /* renamed from: e */
    private final int f215395e;

    /* renamed from: f */
    private final int f215396f;

    /* renamed from: g */
    private final int f215397g;

    public C78248g(int i, int i2, Optional optional, Optional optional2, e eVar, int i3, boolean z) {
        this.f215397g = i;
        this.f215395e = i2;
        this.f215391a = optional;
        this.f215392b = optional2;
        this.f215393c = eVar;
        this.f215396f = i3;
        this.f215394d = z;
    }

    /* renamed from: a */
    public final e mo73169a() {
        return this.f215393c;
    }

    /* renamed from: c */
    public final Optional mo73170c() {
        return this.f215392b;
    }

    /* renamed from: d */
    public final Optional mo73171d() {
        return this.f215391a;
    }

    /* renamed from: e */
    public final boolean mo73172e() {
        return this.f215394d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78243b) {
            C78243b bVar = (C78243b) obj;
            return this.f215397g == bVar.mo73175h() && this.f215395e == bVar.mo73173f() && this.f215391a.equals(bVar.mo73171d()) && this.f215392b.equals(bVar.mo73170c()) && this.f215393c.equals(bVar.mo73169a()) && this.f215396f == bVar.mo73174g() && this.f215394d == bVar.mo73172e();
        }
    }

    /* renamed from: f */
    public final int mo73173f() {
        return this.f215395e;
    }

    /* renamed from: g */
    public final int mo73174g() {
        return this.f215396f;
    }

    /* renamed from: h */
    public final int mo73175h() {
        return this.f215397g;
    }

    public final int hashCode() {
        return ((((((((((((this.f215397g ^ 1000003) * 1000003) ^ this.f215395e) * 1000003) ^ this.f215391a.hashCode()) * 1000003) ^ this.f215392b.hashCode()) * 1000003) ^ this.f215393c.hashCode()) * 1000003) ^ this.f215396f) * 1000003) ^ (true != this.f215394d ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        int i = this.f215397g;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "EXECUTING" : "IDLE" : "HALF_LISTENING" : "FULL_LISTENING";
        switch (this.f215395e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "CANCELLATION";
                break;
            case 3:
                str = "OPENING_ZEROSTATE";
                break;
            case 4:
                str = "OPENING_TYPING_MODE";
                break;
            case 5:
                str = "NON_VOICE_INTERACTION";
                break;
            case 6:
                str = "UTTERANCE_DONE";
                break;
            case 7:
                str = "CLOSE_MIC_MUSIC_SEARCH_REQUEST";
                break;
            case 8:
                str = "RETRY";
                break;
            case 9:
                str = "RETRY_WHILE_NOT_LISTENING";
                break;
            case 10:
                str = "TACTILE_SHELF_OPENED";
                break;
            default:
                str = "OAUTH_USER_RECOVERABLE_ERROR";
                break;
        }
        String valueOf = String.valueOf(this.f215391a);
        String valueOf2 = String.valueOf(this.f215392b);
        String num = Integer.toString(this.f215393c.ca);
        int i2 = this.f215396f;
        String str3 = i2 != 1 ? i2 != 2 ? "NO_UI" : "TITAN_INPUT_PLATE" : "NGA_INPUT_PLATE";
        boolean z = this.f215394d;
        return "AssistantState{state=" + str2 + ", cause=" + str + ", invocationTime=" + valueOf + ", identifier=" + valueOf2 + ", opaTriggerType=" + num + ", uiType=" + str3 + ", isOptimizedOnShowInvcation=" + z + "}";
    }
}
