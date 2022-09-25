package com.google.android.apps.gsa.staticplugins.p7960g.p7963c;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.gsa.assist.p507f.C9411a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.c.e */
/* compiled from: PG */
final class C101284e extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C101285f f282675a;

    /* renamed from: b */
    private final Context f282676b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101284e(C101285f fVar, C90929bz bzVar, Context context) {
        super("ShareScreenshot", bzVar, 1, 8);
        this.f282675a = fVar;
        this.f282676b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ((C59052c) ((C59052c) C101285f.f282677a.mo56226d()).mo56372aa(13857)).mo56386p("SaveScreenshotToUriTask#doInBackground");
        return this.f282675a.f282684h.mo17665a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        C9411a aVar = (C9411a) obj;
        if (aVar == null || aVar.f32698a == null) {
            ((C59052c) ((C59052c) C101285f.f282677a.mo56226d()).mo56372aa(13858)).mo56386p("Screenshot failed to save.");
            this.f282675a.mo92219a(C89849ae.SHARE_SCREENSHOT_FAILED);
            Toast.makeText(this.f282676b.getApplicationContext(), true != this.f282675a.f282684h.f32703a ? R.string.assist_share_screenshot_failure : R.string.assist_share_screenshot_off, 1).show();
            C101285f fVar = this.f282675a;
            fVar.mo92221i();
            fVar.mo92220h(false);
            this.f282675a.f54539k.mo24855e();
            return;
        }
        ((C59052c) ((C59052c) C101285f.f282677a.mo56224b()).mo56372aa(13859)).mo56386p("screenshot is saved.");
        C101285f fVar2 = this.f282675a;
        fVar2.f282683g = aVar.f32698a;
        Uri uri = fVar2.f282683g;
        if (fVar2.f282681e == null) {
            fVar2.f282681e = new C101283d(fVar2, fVar2.f282678b);
        }
        fVar2.f282681e.mo85242e(uri);
        fVar2.f282682f = null;
    }
}
