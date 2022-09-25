package com.google.apps.tiktok.account.p3606d;

import android.net.Uri;
import com.google.apps.tiktok.p3648i.p3649a.C47152c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.google.apps.tiktok.account.d.b */
/* compiled from: PG */
public final class C46076b {

    /* renamed from: a */
    private final C47152c f120936a;

    /* renamed from: b */
    private final C60887da f120937b;

    public C46076b(C47152c cVar, C60887da daVar) {
        this.f120936a = cVar;
        this.f120937b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo50185a() {
        return this.f120937b.mo19399b(C47810es.m84978r(new C46072a(this)));
    }

    /* renamed from: b */
    public final File mo50186b() {
        File a = this.f120936a.mo51053a();
        File parentFile = a.getParentFile();
        if (parentFile.mkdirs() || (parentFile.exists() && parentFile.isDirectory())) {
            return a;
        }
        throw new FileNotFoundException("Cannot create parent directory.");
    }

    /* renamed from: c */
    public final Uri mo50187c() {
        this.f120936a.mo51053a().getParentFile().mkdirs();
        C47152c cVar = this.f120936a;
        return cVar.f122775b.mo51052d(cVar.f122774a, cVar.f122776c);
    }
}
