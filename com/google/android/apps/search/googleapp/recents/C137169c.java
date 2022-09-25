package com.google.android.apps.search.googleapp.recents;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.recents.c */
/* compiled from: PG */
public final /* synthetic */ class C137169c implements C137176j {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373240a;

    /* renamed from: b */
    public final /* synthetic */ Uri f373241b;

    public /* synthetic */ C137169c(C137177k kVar, Uri uri) {
        this.f373240a = kVar;
        this.f373241b = uri;
    }

    /* renamed from: a */
    public final Bitmap mo113579a() {
        C137177k kVar = this.f373240a;
        Uri uri = this.f373241b;
        if (uri == null) {
            return null;
        }
        try {
            return MediaStore.Images.Media.getBitmap(kVar.f373273g, uri);
        } catch (SecurityException e) {
            throw e;
        } catch (NullPointerException e2) {
            ((C58970a) ((C58970a) C137177k.f373267a.mo56225c()).mo56372aa(40932)).mo56389s("%s", "ContentResolver getBitmap: NullPointerException");
            throw new IOException("ContentResolver getBitmap: NullPointerException", e2);
        } catch (IOException e3) {
            ((C58970a) ((C58970a) ((C58970a) C137177k.f373267a.mo56225c()).mo56382g(e3)).mo56372aa(40931)).mo56386p("Exception: Failed to get screenshot bitmap.");
            return null;
        }
    }
}
