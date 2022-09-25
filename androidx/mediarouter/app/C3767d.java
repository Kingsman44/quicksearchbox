package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.p033v7.widget.C0678gm;

/* renamed from: androidx.mediarouter.app.d */
/* compiled from: PG */
final class C3767d extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ MediaRouteButton f12167a;

    /* renamed from: b */
    private final int f12168b;

    /* renamed from: c */
    private final Context f12169c;

    public C3767d(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.f12167a = mediaRouteButton;
        this.f12168b = i;
        this.f12169c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void onCancelled(Drawable drawable) {
        if (drawable != null) {
            MediaRouteButton.f12045a.put(this.f12168b, drawable.getConstantState());
        }
        this.f12167a.f12055h = null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (((Drawable.ConstantState) MediaRouteButton.f12045a.get(this.f12168b)) != null) {
            return null;
        }
        return C0678gm.m2375e().mo3100c(this.f12169c, this.f12168b);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            onCancelled(drawable);
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.f12045a.get(this.f12168b);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            this.f12167a.f12055h = null;
        }
        this.f12167a.mo7933c(drawable);
    }
}
