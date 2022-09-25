package com.google.android.libraries.p3332u.p3333a.p3335b;

import android.app.Activity;
import com.google.android.gms.gmscompliance.p10808ui.UncertifiedDeviceActivity;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.u.a.b.a */
/* compiled from: PG */
final class C43188a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Activity f112903a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43188a(Activity activity) {
        super(0);
        this.f112903a = activity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Activity activity = this.f112903a;
        if (activity instanceof UncertifiedDeviceActivity) {
            activity.finish();
        }
        return C69788q.f186170a;
    }
}
