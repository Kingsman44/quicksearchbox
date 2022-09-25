package com.google.android.libraries.p579ar.sceneviewer.notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.notification.ChipNotification */
/* compiled from: PG */
public final class ChipNotification {
    private static final int FADE_IN_DURATION_MS = 500;
    private static final int FADE_OUT_DURATION_MS = 250;
    private final View chip;
    private ViewPropertyAnimator fadeInAnimator;
    private ViewPropertyAnimator fadeOutAnimator;
    private final ImageView imageView;
    private boolean shown = false;
    private final TextView textView;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.notification.ChipNotification$Content */
    /* compiled from: PG */
    public enum Content {
        NO_NETWORK_CONNECTION(Integer.valueOf(C10737R.string.no_network_connection_notification_body), Integer.valueOf(C10737R.C10738drawable.wifi_signal_bad)),
        SLOW_NETWORK_CONNECTION(Integer.valueOf(C10737R.string.degraded_network_connection_notification_body), Integer.valueOf(C10737R.C10738drawable.wifi_connected_no_internet));
        
        private final Integer imageResourceId;
        private final Integer textResourceId;

        private Content(Integer num, Integer num2) {
            this.textResourceId = num;
            this.imageResourceId = num2;
        }

        public static Content fromProto(Types.ChipNotificationContent chipNotificationContent) {
            Types.ChipNotificationContent chipNotificationContent2 = Types.ChipNotificationContent.NO_NETWORK_CONNECTION;
            int ordinal = chipNotificationContent.ordinal();
            if (ordinal != 0) {
                return ordinal != 1 ? NO_NETWORK_CONNECTION : SLOW_NETWORK_CONNECTION;
            }
            return NO_NETWORK_CONNECTION;
        }

        public Integer getImageResourceId() {
            return this.imageResourceId;
        }

        public Integer getTextResourceId() {
            return this.textResourceId;
        }
    }

    public ChipNotification(LayoutInflater layoutInflater, ViewGroup viewGroup, View view) {
        View inflate = layoutInflater.inflate(C10737R.layout.chip_notification, viewGroup);
        this.textView = (TextView) inflate.findViewById(C10737R.C10739id.text);
        this.imageView = (ImageView) inflate.findViewById(C10737R.C10739id.image);
        View findViewById = inflate.findViewById(C10737R.C10739id.chip_notification);
        this.chip = findViewById;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.addRule(3, view.getId());
        findViewById.setLayoutParams(layoutParams);
    }

    public void hide() {
        if (this.shown) {
            this.shown = false;
            ViewPropertyAnimator viewPropertyAnimator = this.fadeInAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.fadeOutAnimator = AnimationUtilities.animateVisibility(this.chip, false, FADE_OUT_DURATION_MS);
        }
    }

    public void show(int i, int i2) {
        this.textView.setText(i);
        this.imageView.setImageResource(i2);
        if (!this.shown) {
            this.shown = true;
            ViewPropertyAnimator viewPropertyAnimator = this.fadeOutAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.fadeInAnimator = AnimationUtilities.animateVisibility(this.chip, true, FADE_IN_DURATION_MS);
        }
    }

    public void show(Types.ChipNotificationContent chipNotificationContent) {
        Content fromProto = Content.fromProto(chipNotificationContent);
        show(fromProto.getTextResourceId().intValue(), fromProto.getImageResourceId().intValue());
    }
}
