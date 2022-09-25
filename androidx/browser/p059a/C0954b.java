package androidx.browser.p059a;

import android.os.Bundle;

/* renamed from: androidx.browser.a.b */
/* compiled from: PG */
public final class C0954b {

    /* renamed from: a */
    public final Integer f3052a;

    /* renamed from: b */
    public final Integer f3053b;

    public C0954b(Integer num, Integer num2) {
        this.f3052a = num;
        this.f3053b = num2;
    }

    /* renamed from: a */
    public final Bundle mo3570a() {
        Bundle bundle = new Bundle();
        Integer num = this.f3052a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f3053b;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        return bundle;
    }
}
