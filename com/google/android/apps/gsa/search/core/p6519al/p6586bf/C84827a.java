package com.google.android.apps.gsa.search.core.p6519al.p6586bf;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.al.bf.a */
/* compiled from: PG */
public final class C84827a extends C84837d {

    /* renamed from: a */
    private final C58833ax f230513a;

    /* renamed from: b */
    private final int f230514b;

    public C84827a(int i, C58833ax axVar) {
        if (i != 0) {
            this.f230514b = i;
            this.f230513a = axVar;
            return;
        }
        throw new NullPointerException("Null youtubeDeletionState");
    }

    /* renamed from: a */
    public final C58833ax mo78514a() {
        return this.f230513a;
    }

    /* renamed from: b */
    public final int mo78515b() {
        return this.f230514b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84837d) {
            C84837d dVar = (C84837d) obj;
            return this.f230514b == dVar.mo78515b() && this.f230513a.equals(dVar.mo78514a());
        }
    }

    public final int hashCode() {
        return ((this.f230514b ^ 1000003) * 1000003) ^ this.f230513a.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.f230514b) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "VALID";
                break;
            case 3:
                str = "STALE";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "SIGNED_OUT";
                break;
            case 6:
                str = "MULTI_ACCOUNTS";
                break;
            case 7:
                str = "WATCH_PAUSED";
                break;
            default:
                str = "NO_DELETION";
                break;
        }
        String obj = this.f230513a.toString();
        return "YoutubeDeletionData{youtubeDeletionState=" + str + ", youtubeDeletionTimestamp=" + obj + "}";
    }
}
