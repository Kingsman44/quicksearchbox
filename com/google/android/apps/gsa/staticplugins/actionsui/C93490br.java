package com.google.android.apps.gsa.staticplugins.actionsui;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.android.apps.gsa.shared.util.C91068o;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.br */
/* compiled from: PG */
final class C93490br extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C93491bs f260913a;

    public C93490br(C93491bs bsVar) {
        this.f260913a = bsVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap a = C91068o.m148774a(this.f260913a.f260916h.getContext().getContentResolver(), ((Long[]) objArr)[0].longValue());
        if (a != null) {
            return a;
        }
        C93491bs bsVar = this.f260913a;
        if (bsVar.f260918j != null) {
            return null;
        }
        bsVar.f260918j = bsVar.getResources().getDrawable(R.drawable.googlenow_help_avatar);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.f260913a.mo87801g();
        if (bitmap != null) {
            this.f260913a.f260916h.setImageBitmap(bitmap);
            return;
        }
        C93491bs bsVar = this.f260913a;
        bsVar.f260916h.setImageDrawable(bsVar.f260918j);
    }
}
