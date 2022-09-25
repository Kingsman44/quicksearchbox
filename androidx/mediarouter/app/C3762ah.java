package androidx.mediarouter.app;

import android.view.View;

/* renamed from: androidx.mediarouter.app.ah */
/* compiled from: PG */
final class C3762ah implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MediaRouteExpandCollapseButton f12149a;

    public C3762ah(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f12149a = mediaRouteExpandCollapseButton;
    }

    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f12149a;
        boolean z = !mediaRouteExpandCollapseButton.f12069e;
        mediaRouteExpandCollapseButton.f12069e = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f12065a);
            this.f12149a.f12065a.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.f12149a;
            mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f12068d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f12066b);
            this.f12149a.f12066b.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = this.f12149a;
            mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f12067c);
        }
        View.OnClickListener onClickListener = this.f12149a.f12070f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
