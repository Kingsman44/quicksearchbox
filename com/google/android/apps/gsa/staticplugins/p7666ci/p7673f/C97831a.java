package com.google.android.apps.gsa.staticplugins.p7666ci.p7673f;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.provider.ContactsContract;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.f.a */
/* compiled from: PG */
public final /* synthetic */ class C97831a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C97834d f273193a;

    /* renamed from: b */
    public final /* synthetic */ long f273194b;

    public /* synthetic */ C97831a(C97834d dVar, long j) {
        this.f273193a = dVar;
        this.f273194b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Bitmap bitmap;
        C97834d dVar = this.f273193a;
        long j = this.f273194b;
        Bitmap bitmap2 = null;
        if (dVar.f273199c.mo79746e(C90069du.f249728f)) {
            try {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(dVar.f273198b, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j));
                if (openContactPhotoInputStream != null) {
                    bitmap = BitmapFactory.decodeStream(openContactPhotoInputStream);
                    try {
                        openContactPhotoInputStream.close();
                    } catch (IOException e) {
                        C59104x c = C97834d.f273197a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "PCP.TopContactHelper");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30356)).mo56386p("IOException while closing closeable");
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap2);
                    Paint paint = new Paint(1);
                    canvas.drawCircle(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f, ((float) bitmap.getWidth()) / 2.0f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                }
            } catch (SecurityException e2) {
                C59104x c2 = C97834d.f273197a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "PCP.TopContactHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(30355)).mo56386p("Could not get contact photo");
            }
        }
        return C58833ax.m90833j(bitmap2);
    }
}
