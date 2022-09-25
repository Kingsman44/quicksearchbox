package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.l */
/* compiled from: PG */
public final class C24877l {

    /* renamed from: a */
    public final Bundle f67960a;

    public C24877l() {
        this.f67960a = new Bundle();
    }

    public C24877l(Bundle bundle) {
        this.f67960a = bundle;
    }

    /* renamed from: a */
    public final boolean mo30092a() {
        return this.f67960a.containsKey("gleams");
    }

    /* renamed from: b */
    public final RenderableGleam[] mo30093b() {
        Parcelable[] parcelableArray = this.f67960a.getParcelableArray("gleams");
        if (parcelableArray == null) {
            return null;
        }
        RenderableGleam[] renderableGleamArr = new RenderableGleam[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            renderableGleamArr[i] = (RenderableGleam) parcelableArray[i];
        }
        return renderableGleamArr;
    }

    /* renamed from: c */
    public final void mo30094c(boolean z) {
        this.f67960a.putBoolean("final_result", z);
    }

    /* renamed from: d */
    public final void mo30095d(RenderableGleam[] renderableGleamArr) {
        this.f67960a.putParcelableArray("gleams", renderableGleamArr);
    }

    /* renamed from: e */
    public final void mo30096e(int i) {
        this.f67960a.putInt("query_id", i);
    }

    /* renamed from: f */
    public final void mo30097f(String str) {
        this.f67960a.putString("session_id", str);
    }

    /* renamed from: g */
    public final void mo30098g(int i) {
        this.f67960a.putInt("source", i);
    }
}
