package com.google.android.libraries.p579ar.sceneviewer.notification;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.notification.NotificationView */
/* compiled from: PG */
public final class NotificationView extends FrameLayout {
    AppCompatTextView highVisibilityView;
    AppCompatTextView lowVisibilityView;
    private Notification persistentNotification = null;
    private Integer temporaryStringRes = null;

    public NotificationView(Context context) {
        super(context);
    }

    private void removePersistent() {
        this.persistentNotification = null;
        if (this.temporaryStringRes == null) {
            setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void removeTemporaryString() {
        this.temporaryStringRes = null;
        Notification notification = this.persistentNotification;
        if (notification == null) {
            setVisibility(8);
        } else {
            showPersistent(notification);
        }
    }

    private void setVisibleInternal(int i, C10741a aVar) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (aVar == C10741a.LOW) {
            appCompatTextView = this.lowVisibilityView;
        } else {
            appCompatTextView = this.highVisibilityView;
        }
        if (aVar == C10741a.LOW) {
            appCompatTextView2 = this.highVisibilityView;
        } else {
            appCompatTextView2 = this.lowVisibilityView;
        }
        appCompatTextView.setText(i);
        appCompatTextView.setVisibility(0);
        appCompatTextView2.setVisibility(8);
        setVisibility(0);
    }

    private void showPersistent(Notification notification) {
        this.persistentNotification = notification;
        if (this.temporaryStringRes == null || getVisibility() == 8) {
            removeCallbacks(new NotificationView$$ExternalSyntheticLambda0(this));
            if (!notification.equals(Notification.NONE)) {
                setVisibleInternal(notification.f35695u.intValue(), notification.f35696v);
            }
        }
    }

    private void showTemporary(Notification notification, int i) {
        this.temporaryStringRes = notification.f35695u;
        removeCallbacks(new NotificationView$$ExternalSyntheticLambda0(this));
        if (!notification.equals(Notification.NONE)) {
            setVisibleInternal(notification.f35695u.intValue(), notification.f35696v);
        }
        postDelayed(new NotificationView$$ExternalSyntheticLambda0(this), (long) i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(C10737R.C10739id.low_visibility_view);
        appCompatTextView.getClass();
        this.lowVisibilityView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(C10737R.C10739id.high_visibility_view);
        appCompatTextView2.getClass();
        this.highVisibilityView = appCompatTextView2;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            removeCallbacks(new NotificationView$$ExternalSyntheticLambda0(this));
            this.temporaryStringRes = null;
        }
    }

    public void show(Types.Notification notification) {
        Notification a = Notification.m25741a(notification);
        ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action = a.f35698x;
        if (action != null) {
            ViewerLogger.getInstance().logAction(action);
        }
        if (a.f35695u != null) {
            Integer num = a.f35697w;
            if (num != null) {
                showTemporary(a, num.intValue());
            } else {
                showPersistent(a);
            }
        } else {
            removePersistent();
        }
    }

    public NotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
