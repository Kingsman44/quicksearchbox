package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.graphics.Bitmap;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.n */
/* compiled from: PG */
public final /* synthetic */ class C116058n implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321813a;

    /* renamed from: b */
    public final /* synthetic */ long f321814b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f321815c;

    public /* synthetic */ C116058n(C116070z zVar, long j, Bitmap bitmap) {
        this.f321813a = zVar;
        this.f321814b = j;
        this.f321815c = bitmap;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116070z zVar = this.f321813a;
        long j = this.f321814b;
        Bitmap bitmap = this.f321815c;
        File q = zVar.mo102447q(j);
        if (q == null) {
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(q);
            bitmap.compress(Bitmap.CompressFormat.WEBP, 60, fileOutputStream);
            fileOutputStream.close();
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } catch (IOException e) {
            C59104x c = C116070z.f321840a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RecentlyStorage");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30930)).mo56386p("Failed to save screenshot");
            return false;
        }
    }
}
