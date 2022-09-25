package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.e */
/* compiled from: PG */
public final /* synthetic */ class C84130e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84131f f229061a;

    /* renamed from: b */
    public final /* synthetic */ Uri f229062b;

    public /* synthetic */ C84130e(C84131f fVar, Uri uri) {
        this.f229061a = fVar;
        this.f229062b = uri;
    }

    public final void run() {
        C84131f fVar = this.f229061a;
        Uri uri = this.f229062b;
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.f241239e = false;
            c.f241245k = 5;
            C89020ar a = c.mo82989a();
            C89012aj ajVar = fVar.f229064b;
            ajVar.mo27495f(a, C89009ag.f241207b, ajVar.mo27510b(C89066v.f241382a));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C84131f.f229063a.mo56226d()).mo56382g(e)).mo56372aa(7046)).mo56386p("Error logging request");
        }
    }
}
