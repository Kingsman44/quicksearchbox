package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import androidx.lifecycle.LiveData;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.u */
/* compiled from: PG */
final class C30695u extends C30698x {

    /* renamed from: a */
    public final LiveData f82860a;

    /* renamed from: b */
    public final LiveData f82861b;

    public C30695u(LiveData liveData, LiveData liveData2) {
        this.f82860a = liveData;
        this.f82861b = liveData2;
    }

    /* renamed from: a */
    public final LiveData mo36380a() {
        return this.f82861b;
    }

    /* renamed from: b */
    public final LiveData mo36381b() {
        return this.f82860a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30698x) {
            C30698x xVar = (C30698x) obj;
            LiveData liveData = this.f82860a;
            if (liveData != null ? liveData.equals(xVar.mo36381b()) : xVar.mo36381b() == null) {
                LiveData liveData2 = this.f82861b;
                if (liveData2 != null ? liveData2.equals(xVar.mo36380a()) : xVar.mo36380a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82860a);
        String valueOf2 = String.valueOf(this.f82861b);
        return "CardsLiveDatas{importantCards=" + valueOf + ", commonActions=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        LiveData liveData = this.f82860a;
        int i2 = 0;
        if (liveData == null) {
            i = 0;
        } else {
            i = liveData.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        LiveData liveData2 = this.f82861b;
        if (liveData2 != null) {
            i2 = liveData2.hashCode();
        }
        return i3 ^ i2;
    }
}
