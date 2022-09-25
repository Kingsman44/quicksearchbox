package com.android.launcher3;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.RemoteViews;
import com.android.launcher3.DragLayer;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class LauncherAppWidgetHostView extends AppWidgetHostView implements DragLayer.TouchCompleteListener {
    private boolean mChildrenFocused;
    private final Context mContext;
    private final DragLayer mDragLayer;
    final LayoutInflater mInflater;
    private final CheckLongPressHelper mLongPressHelper;
    private int mPreviousOrientation;
    public float mScaleToFit = 1.0f;
    private float mSlop;
    private final StylusEventHelper mStylusEventHelper;
    public final PointF mTranslationForCentering = new PointF(0.0f, 0.0f);

    public LauncherAppWidgetHostView(Context context) {
        super(context);
        this.mContext = context;
        this.mLongPressHelper = new CheckLongPressHelper(this);
        this.mStylusEventHelper = new StylusEventHelper(this);
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mDragLayer = Launcher.getLauncher(context).mDragLayer;
        setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
        setBackgroundResource(R.drawable.widget_internal_focus_bg);
    }

    public final void cancelLongPress() {
        super.cancelLongPress();
        this.mLongPressHelper.cancelLongPress();
    }

    public final void clearChildFocus(View view) {
        super.clearChildFocus(view);
        setSelected(false);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.mChildrenFocused || keyEvent.getKeyCode() != 111 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.mChildrenFocused = false;
        requestFocus();
        return true;
    }

    public final boolean dispatchUnhandledMove(View view, int i) {
        return this.mChildrenFocused;
    }

    public final AppWidgetProviderInfo getAppWidgetInfo() {
        AppWidgetProviderInfo appWidgetInfo = super.getAppWidgetInfo();
        if (appWidgetInfo == null || (appWidgetInfo instanceof LauncherAppWidgetProviderInfo)) {
            return appWidgetInfo;
        }
        throw new IllegalStateException("Launcher widget must have LauncherAppWidgetProviderInfo");
    }

    public final int getDescendantFocusability() {
        if (this.mChildrenFocused) {
            return C89885b.S3REQUEST_VALUE;
        }
        return 393216;
    }

    /* access modifiers changed from: protected */
    public View getErrorView() {
        return this.mInflater.inflate(R.layout.appwidget_error, this, false);
    }

    public boolean isReinflateRequired() {
        return this.mPreviousOrientation != this.mContext.getResources().getConfiguration().orientation;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            this.mChildrenFocused = false;
            setSelected(false);
        }
        super.onFocusChanged(z, i, rect);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mLongPressHelper.cancelLongPress();
        }
        CheckLongPressHelper checkLongPressHelper = this.mLongPressHelper;
        if (checkLongPressHelper.mHasPerformedLongPress) {
            checkLongPressHelper.cancelLongPress();
            return true;
        } else if (this.mStylusEventHelper.checkAndPerformStylusEvent(motionEvent)) {
            this.mLongPressHelper.cancelLongPress();
            return true;
        } else {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                    } else if (Utilities.pointInView(this, motionEvent.getX(), motionEvent.getY(), this.mSlop)) {
                        return false;
                    } else {
                        this.mLongPressHelper.cancelLongPress();
                        return false;
                    }
                }
                this.mLongPressHelper.cancelLongPress();
                return false;
            }
            if (!this.mStylusEventHelper.mIsButtonPressed) {
                this.mLongPressHelper.postCheckForLongPress();
            }
            this.mDragLayer.mTouchCompleteListener = this;
            return false;
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.isTracking() && !this.mChildrenFocused && i == 66) {
            this.mChildrenFocused = true;
            ArrayList focusables = getFocusables(2);
            focusables.remove(this);
            int size = focusables.size();
            if (size != 0) {
                if (size == 1 && (getTag() instanceof ItemInfo)) {
                    ItemInfo itemInfo = (ItemInfo) getTag();
                    if (itemInfo.spanX == 1 && itemInfo.spanY == 1) {
                        ((View) focusables.get(0)).performClick();
                        this.mChildrenFocused = false;
                        return true;
                    }
                }
                ((View) focusables.get(0)).requestFocus();
                return true;
            }
            this.mChildrenFocused = false;
            i = 66;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (RuntimeException unused) {
            post(new Runnable() {
                public final void run() {
                    LauncherAppWidgetHostView launcherAppWidgetHostView = LauncherAppWidgetHostView.this;
                    launcherAppWidgetHostView.updateAppWidget(new RemoteViews(launcherAppWidgetHostView.getAppWidgetInfo().provider.getPackageName(), 0));
                }
            });
        }
    }

    public final void onTouchComplete() {
        CheckLongPressHelper checkLongPressHelper = this.mLongPressHelper;
        if (!checkLongPressHelper.mHasPerformedLongPress) {
            checkLongPressHelper.cancelLongPress();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
            } else if (Utilities.pointInView(this, motionEvent.getX(), motionEvent.getY(), this.mSlop)) {
                return false;
            } else {
                this.mLongPressHelper.cancelLongPress();
                return false;
            }
        }
        this.mLongPressHelper.cancelLongPress();
        return false;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        setSelected(this.mChildrenFocused && view2 != null);
        if (view2 != null) {
            view2.setFocusableInTouchMode(false);
        }
    }

    public final void updateAppWidget(RemoteViews remoteViews) {
        this.mPreviousOrientation = this.mContext.getResources().getConfiguration().orientation;
        try {
            super.updateAppWidget(remoteViews);
        } catch (Resources.NotFoundException unused) {
            super.updateAppWidget((RemoteViews) null);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mChildrenFocused || i != 66) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }
}
