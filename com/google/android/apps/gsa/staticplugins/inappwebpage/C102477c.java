package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.base.C58837ba;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.c */
/* compiled from: PG */
final class C102477c extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C102480f f286006a;

    /* renamed from: b */
    private final SettableFuture f286007b;

    /* renamed from: c */
    private final Uri f286008c;

    /* renamed from: d */
    private final C102496v f286009d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102477c(C102480f fVar, SettableFuture settableFuture, Uri uri, C102496v vVar) {
        super("FileRetrieval", 1, 8);
        this.f286006a = fVar;
        this.f286007b = settableFuture;
        this.f286008c = uri;
        this.f286009d = vVar;
    }

    public final void run() {
        InputStream inputStream;
        try {
            if (C90772bp.m148276C(this.f286008c)) {
                inputStream = C90772bp.m148306n(this.f286006a.f286028h.getAssets(), this.f286008c);
            } else {
                inputStream = C90772bp.m148307o(this.f286006a.f286028h.getContentResolver(), this.f286008c);
            }
            C58885cv cvVar = new C58885cv(inputStream);
            this.f286009d.mo93314a(new C84563w("Got InputStream for %s", this.f286008c));
            this.f286007b.mo57356n(new C102456a(C102480f.m169938a(this.f286008c, "text/html; charset=utf-8", cvVar), inputStream));
        } catch (IOException e) {
            this.f286009d.mo93314a(new C84563w("Exception reading file: %s", C58837ba.m90858g(e.getMessage())));
            this.f286007b.mo57357o(e);
        }
    }
}
