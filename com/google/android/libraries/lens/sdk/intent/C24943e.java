package com.google.android.libraries.lens.sdk.intent;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: com.google.android.libraries.lens.sdk.intent.e */
/* compiled from: PG */
public final class C24943e {

    /* renamed from: a */
    public final Bundle f68071a;

    public C24943e() {
        this.f68071a = new Bundle();
    }

    public C24943e(Bundle bundle) {
        this.f68071a = bundle;
    }

    /* renamed from: a */
    public final long mo30165a() {
        return this.f68071a.getLong("handover_session_id");
    }

    /* renamed from: b */
    public final IBinder mo30166b() {
        return this.f68071a.getBinder("lens_activity_binder");
    }

    /* renamed from: c */
    public final LensImage mo30167c() {
        return (LensImage) this.f68071a.getParcelable("postcapture_image");
    }

    /* renamed from: d */
    public final String mo30168d() {
        return this.f68071a.getString("caller_package");
    }

    /* renamed from: e */
    public final String mo30169e() {
        return this.f68071a.getString("launch_error_message");
    }

    /* renamed from: f */
    public final boolean mo30170f() {
        return this.f68071a.containsKey("lens_activity_binder");
    }

    /* renamed from: g */
    public final void mo30171g(String str) {
        this.f68071a.putString("caller_package", str);
    }

    /* renamed from: h */
    public final void mo30172h(RectF[] rectFArr) {
        this.f68071a.putParcelableArray("external_gleam_boxes", rectFArr);
    }

    /* renamed from: i */
    public final void mo30173i(int i) {
        this.f68071a.putInt("intent_type", i);
    }

    /* renamed from: j */
    public final void mo30174j(boolean z) {
        this.f68071a.putBoolean("is_from_incognito", z);
    }

    /* renamed from: k */
    public final void mo30175k(IBinder iBinder) {
        this.f68071a.putBinder("lens_activity_binder", iBinder);
    }

    /* renamed from: l */
    public final void mo30176l(LensImage lensImage) {
        this.f68071a.putParcelable("postcapture_image", lensImage);
    }

    /* renamed from: m */
    public final void mo30177m(RectF rectF) {
        this.f68071a.putParcelable("region_of_interest", rectF);
    }

    /* renamed from: n */
    public final void mo30178n(long j) {
        this.f68071a.putLong("request_lens_time_nanos", j);
    }

    /* renamed from: o */
    public final void mo30179o() {
        this.f68071a.putInt("transition_type", 0);
    }
}
