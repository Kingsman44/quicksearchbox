package android.support.p031v4.app;

import android.os.Bundle;

/* renamed from: android.support.v4.app.ba */
/* compiled from: PG */
final class C0182ba extends C0173as {

    /* renamed from: a */
    final /* synthetic */ FragmentManager f754a;

    public C0182ba(FragmentManager fragmentManager) {
        this.f754a = fragmentManager;
    }

    /* renamed from: a */
    public final Fragment mo586a(ClassLoader classLoader, String str) {
        return Fragment.instantiate(this.f754a.f647n.f742c, str, (Bundle) null);
    }
}
