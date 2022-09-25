package com.google.android.libraries.storage.p3304a.p3305a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.storage.p3304a.p3307c.C42750c;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.android.libraries.storage.p3304a.p3313g.C42800c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.storage.a.a.c */
/* compiled from: PG */
public final class C42716c extends C42800c {

    /* renamed from: a */
    private final Context f111960a;

    /* renamed from: b */
    private final C42799b f111961b;

    /* renamed from: c */
    private final C42799b f111962c;

    /* renamed from: d */
    private final Object f111963d = new Object();

    /* renamed from: e */
    private String f111964e;

    /* renamed from: f */
    private final C42729p f111965f;

    public C42716c(C42715b bVar) {
        this.f111961b = new C42735v(bVar.f111958c);
        this.f111960a = bVar.f111956a;
        this.f111962c = bVar.f111957b;
        this.f111965f = bVar.f111959d;
    }

    /* renamed from: s */
    private final void m75446s() {
        if (this.f111962c == null) {
            throw new C42750c("Android backend cannot perform remote operations without a remote backend");
        }
    }

    /* renamed from: t */
    private final boolean m75447t(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.f111960a.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: b */
    public final Pair mo45812b(Uri uri) {
        if (!m75447t(uri)) {
            return this.f111961b.mo45812b(mo45818q(uri));
        }
        m75446s();
        return this.f111962c.mo45812b(uri);
    }

    /* renamed from: d */
    public final File mo45813d(Uri uri) {
        String str;
        if (!m75447t(uri)) {
            File a = new C42720g(this.f111960a, this.f111965f).mo45823a(uri);
            if (!C20674d.m38856e(this.f111960a)) {
                synchronized (this.f111963d) {
                    if (this.f111964e == null) {
                        this.f111964e = C42717d.m75456a(this.f111960a).getAbsolutePath();
                    }
                    str = this.f111964e;
                }
                if (!a.getAbsolutePath().startsWith(str)) {
                    throw new C42750c("Cannot access credential-protected data from direct boot");
                }
            }
            return a;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    /* renamed from: e */
    public final InputStream mo45814e(Uri uri) {
        if (!m75447t(uri)) {
            return this.f111961b.mo45814e(mo45818q(uri));
        }
        m75446s();
        return this.f111962c.mo45814e(uri);
    }

    /* renamed from: i */
    public final String mo45815i() {
        return "android";
    }

    /* renamed from: n */
    public final boolean mo45816n(Uri uri) {
        if (!m75447t(uri)) {
            return C42733t.m75495a(mo45818q(uri)).exists();
        }
        m75446s();
        return this.f111962c.mo45816n(uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Uri mo45817p(Uri uri) {
        try {
            C42718e a = C42719f.m75461a(this.f111960a);
            a.mo45822c(uri.getPath(), this.f111965f);
            return a.mo45820a();
        } catch (IllegalArgumentException e) {
            throw new C42764q((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Uri mo45818q(Uri uri) {
        if (!m75447t(uri)) {
            File d = mo45813d(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority(BuildConfig.FLAVOR).path("/");
            C58480gp e = C58485gu.m89837e();
            path.path(d.getAbsolutePath());
            return C42732s.m75494a(path, e);
        }
        throw new C42764q("Operation across authorities is not allowed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C42799b mo45819r() {
        return this.f111961b;
    }
}
