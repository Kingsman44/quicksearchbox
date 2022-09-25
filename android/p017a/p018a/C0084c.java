package android.p017a.p018a;

import java.security.PrivilegedAction;

/* renamed from: android.a.a.c */
/* compiled from: PG */
final class C0084c implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ Class f229a;

    /* renamed from: b */
    final /* synthetic */ String f230b = "/android/icumessageformat/ICUConfig.properties";

    public C0084c(Class cls) {
        this.f229a = cls;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return this.f229a.getResourceAsStream(this.f230b);
    }
}
