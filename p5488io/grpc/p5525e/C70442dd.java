package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import java.net.URI;
import p5488io.grpc.C70339dj;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70346dq;
import p5488io.grpc.C70719ex;

/* renamed from: io.grpc.e.dd */
/* compiled from: PG */
public final class C70442dd extends C70346dq {
    /* renamed from: a */
    public final int mo57973a() {
        return 5;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C70345dp mo57975c(URI uri, C70339dj djVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        C58838bb.m90866a(path, "targetPath");
        C58838bb.m90879n(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new C70441dc(substring, djVar, C70460dv.f187797p, new C58872ci(), C70719ex.m103402b(getClass().getClassLoader()));
    }

    /* renamed from: d */
    public final String mo57976d() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo57977e() {
        return true;
    }
}
