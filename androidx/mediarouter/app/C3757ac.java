package androidx.mediarouter.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.p175a.C3685au;
import com.google.android.googlequicksearchbox.R;
import java.util.List;
import java.util.Set;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.mediarouter.app.ac */
/* compiled from: PG */
final class C3757ac extends ArrayAdapter {

    /* renamed from: a */
    final float f12080a;

    /* renamed from: b */
    final /* synthetic */ C3758ad f12081b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3757ac(C3758ad adVar, Context context, List list) {
        super(context, 0, list);
        this.f12081b = adVar;
        this.f12080a = C3763ai.m10920a(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int i3 = 0;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            C3758ad adVar = this.f12081b;
            C3758ad.m10898o((LinearLayout) view.findViewById(R.id.volume_item_container), adVar.f12145z);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = adVar.f12144y;
            layoutParams.height = adVar.f12144y;
            findViewById.setLayoutParams(layoutParams);
        }
        C3685au auVar = (C3685au) getItem(i);
        if (auVar != null) {
            boolean z = auVar.f11867g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(auVar.f11864d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            C3763ai.m10926g(viewGroup.getContext(), mediaRouteVolumeSlider, this.f12081b.f12135p);
            mediaRouteVolumeSlider.setTag(auVar);
            this.f12081b.f12086C.put(auVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.mo7947a(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (this.f12081b.mo7958C(auVar)) {
                    mediaRouteVolumeSlider.setMax(auVar.f11874n);
                    mediaRouteVolumeSlider.setProgress(auVar.f11873m);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.f12081b.f12142w);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (z) {
                i2 = PrivateKeyType.INVALID;
            } else {
                i2 = (int) (this.f12080a * 255.0f);
            }
            imageView.setAlpha(i2);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
            if (true == this.f12081b.f12140u.contains(auVar)) {
                i3 = 4;
            }
            linearLayout.setVisibility(i3);
            Set set = this.f12081b.f12138s;
            if (set != null && set.contains(auVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    public final boolean isEnabled(int i) {
        return false;
    }
}
