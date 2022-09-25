package com.google.android.p3545q.p3547b;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.net.URL;
import java.util.concurrent.Executor;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.b.d */
/* compiled from: PG */
public final class C45211d implements C45213f {

    /* renamed from: a */
    public static final C59071e f117975a = C59071e.m91331h();

    /* renamed from: b */
    public static final String f117976b;

    /* renamed from: c */
    public static final Uri f117977c;

    /* renamed from: d */
    public final Uri f117978d;

    /* renamed from: e */
    public final Context f117979e;

    /* renamed from: f */
    public final URL f117980f;

    /* renamed from: g */
    private final Executor f117981g;

    /* renamed from: h */
    private final C69613f f117982h;

    /* renamed from: i */
    private Typeface f117983i;

    static {
        String str = File.pathSeparator;
        f117976b = "fonts" + str + "XITSMath-Regular.otf";
        Uri parse = Uri.parse("https://www.gstatic.com/external_hosted/xits_font/XITSMath-Regular.otf");
        C69664n.m101060f(parse, "parse(\"https://www.gstat…nt/$XITS_FONT_FILE_NAME\")");
        f117977c = parse;
    }

    public C45211d(Context context, Executor executor, Uri uri) {
        URL url;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(uri, "xitsSourceUri");
        this.f117981g = executor;
        this.f117978d = uri;
        this.f117982h = new C69747m(new C45210c(context));
        Context applicationContext = context.getApplicationContext();
        C69664n.m101060f(applicationContext, "context.applicationContext");
        this.f117979e = applicationContext;
        try {
            url = new URL(uri.toString());
        } catch (Throwable unused) {
            url = null;
        }
        this.f117980f = url;
    }

    /* renamed from: a */
    public final Typeface mo49053a() {
        if (this.f117983i == null) {
            Typeface typeface = null;
            try {
                if (mo49055c().exists()) {
                    typeface = Typeface.createFromFile(mo49055c());
                }
            } catch (RuntimeException e) {
                C59052c cVar = (C59052c) ((C59052c) f117975a.mo56226d()).mo56382g(e);
                File c = mo49055c();
                cVar.mo56379ah(new C59094n(54675));
                cVar.mo56389s("Failed to load XITS font from '%s'", c);
            }
            this.f117983i = typeface;
        }
        return this.f117983i;
    }

    /* renamed from: b */
    public final C60870cx mo49054b() {
        SettableFuture settableFuture = new SettableFuture();
        this.f117981g.execute(new C45209b(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final File mo49055c() {
        return (File) this.f117982h.mo5768a();
    }
}
