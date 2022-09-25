package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85279a;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85282b;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85286f;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.k */
/* compiled from: PG */
public final class C99837k extends C86734a implements C85286f {

    /* renamed from: a */
    public static final C59071e f279300a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.n.k");

    /* renamed from: b */
    public final ContentResolver f279301b;

    /* renamed from: c */
    public final C91097g f279302c;

    /* renamed from: f */
    public final C21370a f279303f;

    /* renamed from: g */
    public final C22871g f279304g;

    /* renamed from: h */
    public final C22871g f279305h;

    /* renamed from: i */
    private final C87242k f279306i;

    /* renamed from: j */
    private final C84466a f279307j;

    public C99837k(ContentResolver contentResolver, C91097g gVar, C84466a aVar, C87242k kVar, C21370a aVar2, C22871g gVar2, C22871g gVar3) {
        super(C118575h.SILK_SHARE_API, "silkshare");
        this.f279301b = contentResolver;
        this.f279302c = gVar;
        this.f279307j = aVar;
        this.f279306i = kVar;
        this.f279303f = aVar2;
        this.f279304g = gVar2;
        this.f279305h = gVar3;
    }

    /* renamed from: c */
    private final C60870cx m165467c(String str) {
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(Uri.parse(str).toString());
            c.f241245k = 58;
            c.f241244j = true;
            C89020ar a = c.mo82989a();
            return this.f279304g.mo28209i(this.f279306i.mo80852a(mo80351ic(this.f279307j, "SilkShareWorker.showShareSheet", C118575h.SILK_SHARE_IMAGE_DOWNLOAD), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)), "downloadImage", new C99835i(str));
        } catch (MalformedURLException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: a */
    public final C60870cx mo78846a(C85282b bVar) {
        C85279a aVar = (C85279a) bVar;
        if (aVar.f231048d == null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            String str = aVar.f231047c;
            if (str != null) {
                intent.putExtra("android.intent.extra.TEXT", str).setType("text/plain");
            } else {
                String str2 = aVar.f231046b;
                if (str2 != null) {
                    intent.putExtra("android.intent.extra.TEXT", str2).setType("text/plain");
                }
            }
            this.f279302c.mo65089a(Intent.createChooser(intent, aVar.f231045a));
            return C60856cj.m92900i(C118826c.f331422a);
        }
        Build.VERSION.CODENAME.equals("Q");
        C22871g gVar = this.f279304g;
        String str3 = aVar.f231048d;
        str3.getClass();
        return gVar.mo28210j(m165467c(str3), "performDownloadAndShowSheet", new C99836j(this, bVar));
    }
}
