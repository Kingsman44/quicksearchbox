package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.mediarouter.p175a.C3685au;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: androidx.mediarouter.app.g */
/* compiled from: PG */
final class C3770g extends ArrayAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final LayoutInflater f12172a;

    /* renamed from: b */
    private final Drawable f12173b;

    /* renamed from: c */
    private final Drawable f12174c;

    /* renamed from: d */
    private final Drawable f12175d;

    /* renamed from: e */
    private final Drawable f12176e;

    public C3770g(Context context, List list) {
        super(context, 0, list);
        this.f12172a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.f12173b = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(0, 0));
        this.f12174c = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f12175d = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f12176e = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r0 != null) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x000c
            android.view.LayoutInflater r8 = r6.f12172a
            r1 = 2131626021(0x7f0e0825, float:1.8879266E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        L_0x000c:
            java.lang.Object r7 = r6.getItem(r7)
            androidx.mediarouter.a.au r7 = (androidx.mediarouter.p175a.C3685au) r7
            r9 = 2131433406(0x7f0b17be, float:1.8488597E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131433404(0x7f0b17bc, float:1.8488593E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.f11864d
            r9.setText(r2)
            java.lang.String r2 = r7.f11865e
            int r3 = r7.f11868h
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L_0x0033
            if (r3 != r4) goto L_0x0045
        L_0x0033:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0045
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L_0x0054
        L_0x0045:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L_0x0054:
            boolean r9 = r7.f11867g
            r8.setEnabled(r9)
            r9 = 2131433405(0x7f0b17bd, float:1.8488595E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x00ae
            android.net.Uri r0 = r7.f11866f
            if (r0 == 0) goto L_0x0094
            android.content.Context r1 = r6.getContext()     // Catch:{ IOException -> 0x007c }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x007c }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x007c }
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch:{ IOException -> 0x007c }
            if (r0 == 0) goto L_0x0094
            goto L_0x00ab
        L_0x007c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r2 = "MediaRouteChooserDialog"
            android.util.Log.w(r2, r0, r1)
        L_0x0094:
            int r0 = r7.f11872l
            if (r0 == r4) goto L_0x00a9
            if (r0 == r5) goto L_0x00a6
            boolean r7 = r7.mo7762i()
            if (r7 == 0) goto L_0x00a3
            android.graphics.drawable.Drawable r0 = r6.f12176e
            goto L_0x00ab
        L_0x00a3:
            android.graphics.drawable.Drawable r0 = r6.f12173b
            goto L_0x00ab
        L_0x00a6:
            android.graphics.drawable.Drawable r0 = r6.f12175d
            goto L_0x00ab
        L_0x00a9:
            android.graphics.drawable.Drawable r0 = r6.f12174c
        L_0x00ab:
            r9.setImageDrawable(r0)
        L_0x00ae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C3770g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean isEnabled(int i) {
        return ((C3685au) getItem(i)).f11867g;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C3685au auVar = (C3685au) getItem(i);
        if (auVar.f11867g) {
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (!(imageView == null || progressBar == null)) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            auVar.mo7758e();
        }
    }
}
