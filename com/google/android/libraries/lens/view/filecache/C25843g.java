package com.google.android.libraries.lens.view.filecache;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import com.google.android.libraries.lens.view.p2154p.p2157c.C27545a;
import com.google.common.p4526f.C59052c;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.lens.view.filecache.g */
/* compiled from: PG */
public final /* synthetic */ class C25843g implements C25838b {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f70203a;

    public /* synthetic */ C25843g(Bitmap bitmap) {
        this.f70203a = bitmap;
    }

    /* renamed from: b */
    public final void mo30984b(OutputStream outputStream) {
        Bitmap bitmap = this.f70203a;
        ((C59052c) ((C59052c) C27545a.f75333a.mo56224b()).mo56372aa(49309)).mo56393w("Writing PDF from image of size (%d, %d)", bitmap.getWidth(), bitmap.getHeight());
        PdfDocument pdfDocument = new PdfDocument();
        try {
            PdfDocument.Page startPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(bitmap.getWidth(), bitmap.getHeight(), 0).create());
            startPage.getCanvas().drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
            pdfDocument.finishPage(startPage);
            pdfDocument.writeTo(outputStream);
        } finally {
            pdfDocument.close();
        }
    }
}
