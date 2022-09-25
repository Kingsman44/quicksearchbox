package com.google.android.apps.gsa.staticplugins.p7960g.p7963c;

import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.c.d */
/* compiled from: PG */
final class C101283d extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C101285f f282674a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101283d(C101285f fVar, C90929bz bzVar) {
        super("LoadImage", bzVar, 1, 8);
        this.f282674a = fVar;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.graphics.Bitmap, java.lang.Object] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo77936a(java.lang.Object[] r6) {
        /*
            r5 = this;
            android.net.Uri[] r6 = (android.net.Uri[]) r6
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7960g.p7963c.C101285f.f282677a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 13854(0x361e, float:1.9414E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 0
            r2 = r6[r1]
            java.lang.String r3 = "Trying to load: %s"
            r0.mo56389s(r3, r2)
            r0 = 0
            com.google.android.apps.gsa.staticplugins.g.c.f r2 = r5.f282674a     // Catch:{ IOException -> 0x0041, all -> 0x003a }
            com.google.android.libraries.ay.a r2 = r2.f54539k     // Catch:{ IOException -> 0x0041, all -> 0x003a }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ IOException -> 0x0041, all -> 0x003a }
            r6 = r6[r1]     // Catch:{ IOException -> 0x0041, all -> 0x003a }
            java.io.InputStream r6 = com.google.android.libraries.gsa.util.C23335a.m43765b(r2, r6)     // Catch:{ IOException -> 0x0041, all -> 0x003a }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x0038, all -> 0x0033 }
            if (r6 == 0) goto L_0x0045
            com.google.common.p4541l.C59337t.m92221a(r6)
            return r0
        L_0x0033:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x003b
        L_0x0038:
            goto L_0x0043
        L_0x003a:
            r6 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            com.google.common.p4541l.C59337t.m92221a(r0)
        L_0x0040:
            throw r6
        L_0x0041:
            r6 = r0
        L_0x0043:
            if (r6 != 0) goto L_0x0046
        L_0x0045:
            return r0
        L_0x0046:
            com.google.common.p4541l.C59337t.m92221a(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7960g.p7963c.C101283d.mo77936a(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ((C59052c) ((C59052c) C101285f.f282677a.mo56226d()).mo56372aa(13856)).mo56386p("Unable to load image from url");
            this.f282674a.mo92219a(C89849ae.SHARE_SCREENSHOT_FAILED);
            this.f282674a.f54539k.mo24855e();
            Toast.makeText(this.f282674a.f54539k.getApplicationContext(), R.string.assist_share_screenshot_failure, 1).show();
            return;
        }
        ((C59052c) ((C59052c) C101285f.f282677a.mo56224b()).mo56372aa(13855)).mo56386p("screenshot image is loaded.");
        this.f282674a.f282680d.setImageBitmap(bitmap);
        this.f282674a.f282679c.setImageBitmap(bitmap);
        this.f282674a.mo92219a(C89849ae.SHARE_SCREENSHOT_URI_SAVED);
        C101285f fVar = this.f282674a;
        int i = fVar.f282686j;
        int round = Math.round(((float) fVar.f282680d.getDrawable().getBounds().height()) * 0.75f);
        int round2 = Math.round(((float) fVar.f282680d.getDrawable().getBounds().width()) * 0.75f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round2, round);
        layoutParams.leftMargin = (fVar.f282685i - round2) / 2;
        layoutParams.topMargin = Math.round((((float) i) * 0.25f) / 4.0f);
        fVar.f282680d.setLayoutParams(layoutParams);
        C101285f fVar2 = this.f282674a;
        fVar2.mo92221i();
        fVar2.mo92220h(true);
    }
}
