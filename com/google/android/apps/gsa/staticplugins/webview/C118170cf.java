package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.p6968aa.C89007ae;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cf */
/* compiled from: PG */
final class C118170cf extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private static final C59071e f328040a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.cf");

    /* renamed from: b */
    private boolean f328041b = false;

    /* renamed from: c */
    private final C60870cx f328042c;

    /* renamed from: d */
    private IOException f328043d;

    /* renamed from: e */
    private InputStream f328044e;

    public C118170cf(C60870cx cxVar) {
        this.f328042c = cxVar;
    }

    /* renamed from: a */
    private final synchronized void m196302a() {
        if (this.f328041b) {
            IOException iOException = this.f328043d;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        this.f328041b = true;
        try {
            this.f328044e = new C89007ae(((C89021as) C90877ak.m148472f(this.f328042c)).mo82997b());
        } catch (C89013ak | C90457d | InterruptedException | ExecutionException e) {
            C59104x d = f328040a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ResponseWaitingIStream");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(33837)).mo56386p("WebView can't process input stream with a network request");
            IOException iOException2 = new IOException(e);
            this.f328043d = iOException2;
            this.f328044e = null;
            throw iOException2;
        }
    }

    public final int available() {
        m196302a();
        return ((C89007ae) this.f328044e).f241201a.mo82976a();
    }

    public final void close() {
        m196302a();
        ((C89007ae) this.f328044e).f241201a.mo82977b();
    }

    public final int read() {
        m196302a();
        return this.f328044e.read();
    }

    public final synchronized void reset() {
        m196302a();
        this.f328044e.reset();
    }

    public final long skip(long j) {
        m196302a();
        return this.f328044e.skip(j);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        m196302a();
        return this.f328044e.read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        m196302a();
        return this.f328044e.read(bArr, i, i2);
    }
}
