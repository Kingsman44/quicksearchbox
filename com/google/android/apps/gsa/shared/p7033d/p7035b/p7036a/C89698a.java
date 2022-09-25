package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.shared.d.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C89698a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ HotwordResult f242838a;

    public /* synthetic */ C89698a(HotwordResult hotwordResult) {
        this.f242838a = hotwordResult;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        int i;
        int e = this.f242838a.mo84685e();
        if (e == 1) {
            i = 16;
        } else if (e == 2) {
            i = 12;
        } else {
            throw new IllegalArgumentException("Unsupported channel count");
        }
        return Integer.valueOf(i);
    }
}
