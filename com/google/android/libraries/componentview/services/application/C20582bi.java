package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6003v;
import com.bumptech.glide.C6007z;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.p1701a.p1702a.C20528a;
import com.google.android.libraries.componentview.services.p1701a.p1702a.C20532e;
import com.google.android.libraries.glide.p1823b.C22004a;
import com.google.android.libraries.glide.p1823b.C22006c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.services.application.bi */
/* compiled from: PG */
public final class C20582bi implements C20586bm {

    /* renamed from: a */
    public final Context f57769a;

    /* renamed from: b */
    private final C20579bf f57770b;

    /* renamed from: c */
    private final ExecutorService f57771c;

    /* renamed from: d */
    private final Executor f57772d;

    /* renamed from: e */
    private final C20601ca f57773e;

    public C20582bi(C20579bf bfVar, Executor executor, ExecutorService executorService, Context context, C20601ca caVar) {
        this.f57770b = bfVar;
        this.f57772d = executor;
        this.f57771c = executorService;
        this.f57773e = caVar;
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context2).getBaseContext();
            if (baseContext.getApplicationContext() == null) {
                break;
            }
            context2 = baseContext;
        }
        Context applicationContext = context2.getApplicationContext();
        this.f57769a = applicationContext;
        C5543d a = C5543d.m14321a(applicationContext);
        if (a != null) {
            C6003v a2 = a.f16789b.mo12092a();
            a2.f17680a.mo12275e(C20532e.class, InputStream.class, new C20528a());
            C6003v a3 = a.f16789b.mo12092a();
            a3.f17680a.mo12275e(C22004a.class, ByteBuffer.class, new C22006c());
            return;
        }
        boolean n = C20482m.m38446n(context);
        C20614e eVar = new C20614e();
        eVar.mo25535e(C19742a.GLIDE_INITIALIZATION_ERROR);
        eVar.f57822b = "Unable to update Glide module ";
        C20520h.m38499d(n, "GlideImageLoader", eVar.mo25531a(), caVar, new Object[0]);
    }

    /* renamed from: c */
    private final void m38619c(C6007z zVar, ImageView imageView) {
        C20580bg bgVar = new C20580bg(this, zVar, imageView);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bgVar.run();
        } else {
            this.f57772d.execute(bgVar);
        }
    }

    /* renamed from: a */
    public final C60870cx mo25520a(String str, byte[] bArr, ImageView imageView) {
        SettableFuture settableFuture = new SettableFuture();
        Context context = this.f57769a;
        m38619c(C5543d.m14323c(context).mo12423b(context).mo11872j(new C22004a(str, bArr)).mo12442d(new C20581bh(str, settableFuture, this.f57773e)), imageView);
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo25521b(String str, ImageView imageView) {
        C6007z zVar;
        SettableFuture settableFuture = new SettableFuture();
        if (str.startsWith("data:image/") || "android.resource".equals(Uri.parse(str).getScheme())) {
            Context context = this.f57769a;
            zVar = C5543d.m14323c(context).mo12423b(context).mo11873k(str);
        } else {
            Context context2 = this.f57769a;
            zVar = C5543d.m14323c(context2).mo12423b(context2).mo11872j(new C20532e(str, this.f57770b, this.f57771c, this.f57773e));
        }
        zVar.mo12442d(new C20581bh(str, settableFuture, this.f57773e));
        m38619c(zVar, imageView);
        return settableFuture;
    }
}
