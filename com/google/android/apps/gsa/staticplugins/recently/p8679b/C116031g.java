package com.google.android.apps.gsa.staticplugins.recently.p8679b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.FileInputStream;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.b.g */
/* compiled from: PG */
public final /* synthetic */ class C116031g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116032h f321726a;

    /* renamed from: b */
    public final /* synthetic */ long f321727b;

    public /* synthetic */ C116031g(C116032h hVar, long j) {
        this.f321726a = hVar;
        this.f321727b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116032h hVar = this.f321726a;
        long j = this.f321727b;
        String str = hVar.f321731d;
        str.getClass();
        FileInputStream fileInputStream = new FileInputStream(hVar.mo102426a(str, j));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
        fileInputStream.close();
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new CancellationException();
    }
}
