package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.telephony.PhoneNumberUtils;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.j */
/* compiled from: PG */
public final class C42100j {

    /* renamed from: a */
    public String f110055a;

    /* renamed from: b */
    public String f110056b;

    /* renamed from: c */
    int f110057c;

    /* renamed from: d */
    String f110058d;

    /* renamed from: e */
    int f110059e;

    /* renamed from: f */
    int f110060f;

    /* renamed from: a */
    public final ManualChannel mo44690a(Context context) {
        String str = this.f110056b;
        str.getClass();
        if (C42092b.m73794f(str)) {
            this.f110057c = 1;
        } else if (PhoneNumberUtils.formatNumberToE164(this.f110056b, C42092b.m73790b(context)) != null) {
            this.f110057c = 2;
        } else {
            this.f110057c = 0;
        }
        this.f110058d = C42096f.m73798c(this.f110056b);
        if (this.f110060f == 0) {
            this.f110060f = 1;
        }
        if (this.f110059e == 0) {
            this.f110059e = 1;
        }
        return new ManualChannel(this);
    }
}
