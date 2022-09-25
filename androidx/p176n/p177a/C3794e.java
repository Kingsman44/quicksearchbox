package androidx.p176n.p177a;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;

/* renamed from: androidx.n.a.e */
/* compiled from: PG */
final class C3794e extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C3796g f12232a;

    /* renamed from: b */
    final /* synthetic */ C3795f f12233b;

    public C3794e(C3795f fVar, C3796g gVar) {
        this.f12233b = fVar;
        this.f12232a = gVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        try {
            return this.f12233b.mo8023a();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f12232a.mo8025a((C3798i) obj);
    }
}
