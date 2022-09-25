package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.C78739e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.C78747a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80845ax;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80852bd;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.p.a.b */
/* compiled from: PG */
public final class C78749b implements C78747a {

    /* renamed from: c */
    private static final C59071e f216789c = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.p.a.b");

    /* renamed from: a */
    public final C78850a f216790a;

    /* renamed from: b */
    public final PendingIntent f216791b;

    /* renamed from: d */
    private final C22871g f216792d;

    /* renamed from: e */
    private final C83358h f216793e;

    /* renamed from: f */
    private SettableFuture f216794f;

    public C78749b(C78850a aVar, C22871g gVar, C83358h hVar, C78739e eVar) {
        this.f216790a = aVar;
        this.f216792d = gVar;
        this.f216793e = hVar;
        this.f216791b = eVar.mo73593a("com.google.android.apps.googlequicksearchbox.nga.ON_SCREENSHOT_FINISHED");
    }

    /* renamed from: a */
    public final synchronized void mo73599a() {
        if (!((C80852bd) this.f216793e.mo76657c()).mo74696b().contains(C80845ax.TAKE_SCREENSHOT)) {
            C60856cj.m92898g();
        } else if (this.f216794f == null) {
            SettableFuture settableFuture = new SettableFuture();
            this.f216792d.mo28212l("[NGA] takeScreenshot", new C78748a(this));
            this.f216794f = settableFuture;
        }
    }

    /* renamed from: b */
    public final synchronized void mo73600b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            C78751d dVar = new C78751d(extras.getBoolean("success", false), (Uri) extras.getParcelable("uri"));
            SettableFuture settableFuture = this.f216794f;
            if (settableFuture != null) {
                Uri uri = dVar.f216800b;
                if (!dVar.f216799a || uri == null) {
                    settableFuture.mo57357o(new IOException("System UI could not take screenshot."));
                } else {
                    settableFuture.mo57356n(uri);
                }
                this.f216794f = null;
                return;
            }
            ((C59052c) ((C59052c) f216789c.mo56226d()).mo56372aa(5298)).mo56386p("No active callback for screenshot result.");
        }
    }
}
