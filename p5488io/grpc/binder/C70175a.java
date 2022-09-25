package p5488io.grpc.binder;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58838bb;
import java.net.SocketAddress;

/* renamed from: io.grpc.binder.a */
/* compiled from: PG */
public final class C70175a extends SocketAddress {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Intent f187028a;

    public C70175a(Intent intent) {
        C58838bb.m90869d(intent.getComponent() != null, "Missing required component");
        this.f187028a = intent;
    }

    /* renamed from: a */
    public static C70175a m102186a(ComponentName componentName) {
        return new C70175a(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    /* renamed from: b */
    public static C70175a m102187b(Context context, Class cls) {
        return m102186a(new ComponentName(context, cls));
    }

    /* renamed from: c */
    public static C70175a m102188c(String str, String str2) {
        return m102186a(new ComponentName(str, str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70175a) {
            return this.f187028a.filterEquals(((C70175a) obj).f187028a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f187028a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage((String) null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f187028a);
        return "AndroidComponentAddress[" + valueOf + "]";
    }
}
