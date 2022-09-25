package com.android.launcher3;

import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.android.launcher3.InstallShortcutReceiver;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.compat.PinItemRequestCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.widget.PendingAddWidgetInfo;
import com.android.launcher3.widget.WidgetCell;
import com.android.launcher3.widget.WidgetHostViewLoader;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class AddItemActivity extends BaseActivity implements View.OnTouchListener {
    public LauncherAppState mApp;
    private AppWidgetHost mAppWidgetHost;
    private AppWidgetManagerCompat mAppWidgetManager;
    private InvariantDeviceProfile mIdp;
    private final PointF mLastTouchPos = new PointF();
    private int mPendingBindWidgetId;
    private PendingAddWidgetInfo mPendingWidgetInfo;
    private PinItemRequestCompat mRequest;
    private WidgetCell mWidgetCell;
    private Bundle mWidgetOptions;

    /* compiled from: PG */
    final class PinShortcutRequestActivityInfo extends ShortcutConfigActivityInfo {
        private final ShortcutInfoCompat mInfo;

        public PinShortcutRequestActivityInfo(ShortcutInfoCompat shortcutInfoCompat) {
            super(new ComponentName(shortcutInfoCompat.getPackage(), "pinned-shortcut"), shortcutInfoCompat.getUserHandle());
            this.mInfo = shortcutInfoCompat;
        }

        public final Drawable getFullResIcon(IconCache iconCache) {
            return DeepShortcutManagerCompat.getInstance(LauncherAppState.sContext).getShortcutIconDrawable(this.mInfo, AddItemActivity.this.mApp.mInvariantDeviceProfile.fillResIconDpi);
        }

        public final CharSequence getLabel() {
            return this.mInfo.getShortLabel();
        }

        public final boolean isPersistable() {
            return false;
        }

        public final boolean startConfigActivity(Activity activity, int i) {
            throw new RuntimeException("Not supported");
        }
    }

    private final void acceptWidget(int i) {
        InstallShortcutReceiver.queuePendingShortcutInfo(new InstallShortcutReceiver.PendingInstallShortcutInfo(this.mRequest.getAppWidgetProviderInfo(this), i, (Context) this), this);
        this.mWidgetOptions.putInt("appWidgetId", i);
        this.mRequest.accept(this.mWidgetOptions);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (i == 1) {
            if (intent != null) {
                i3 = intent.getIntExtra("appWidgetId", this.mPendingBindWidgetId);
            } else {
                i3 = this.mPendingBindWidgetId;
            }
            if (i2 == -1) {
                acceptWidget(i3);
                return;
            }
            this.mAppWidgetHost.deleteAppWidgetId(i3);
            this.mPendingBindWidgetId = -1;
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCancelClick(View view) {
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        float f;
        super.onCreate(bundle);
        PinItemRequestCompat pinItemRequest = PinItemRequestCompat.getPinItemRequest(getIntent());
        this.mRequest = pinItemRequest;
        if (pinItemRequest == null) {
            finish();
            return;
        }
        LauncherAppState instance = LauncherAppState.getInstance();
        this.mApp = instance;
        InvariantDeviceProfile invariantDeviceProfile = instance.mInvariantDeviceProfile;
        this.mIdp = invariantDeviceProfile;
        this.mDeviceProfile = invariantDeviceProfile.getDeviceProfile(getApplicationContext());
        setContentView(R.layout.add_item_confirmation_activity);
        this.mWidgetCell = (WidgetCell) findViewById(R.id.widget_cell);
        if (this.mRequest.getRequestType() == 1) {
            this.mWidgetCell.applyFromShortcutInfo(new PinShortcutRequestActivityInfo(new ShortcutInfoCompat(this.mRequest.getShortcutInfo())), this.mApp.mWidgetCache);
            this.mWidgetCell.ensurePreview();
        } else {
            LauncherAppWidgetProviderInfo fromProviderInfo$ar$ds = LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(this.mRequest.getAppWidgetProviderInfo(this));
            int i = fromProviderInfo$ar$ds.minSpanX;
            InvariantDeviceProfile invariantDeviceProfile2 = this.mIdp;
            if (i > invariantDeviceProfile2.numColumns || fromProviderInfo$ar$ds.minSpanY > invariantDeviceProfile2.numRows) {
                finish();
            } else {
                this.mAppWidgetManager = AppWidgetManagerCompat.getInstance(this);
                this.mAppWidgetHost = new AppWidgetHost(this, 1024);
                PendingAddWidgetInfo pendingAddWidgetInfo = new PendingAddWidgetInfo(this, fromProviderInfo$ar$ds);
                this.mPendingWidgetInfo = pendingAddWidgetInfo;
                pendingAddWidgetInfo.spanX = Math.min(this.mIdp.numColumns, fromProviderInfo$ar$ds.spanX);
                this.mPendingWidgetInfo.spanY = Math.min(this.mIdp.numRows, fromProviderInfo$ar$ds.spanY);
                this.mWidgetOptions = WidgetHostViewLoader.getDefaultOptionsForWidget(this, this.mPendingWidgetInfo);
                this.mWidgetCell.applyFromAppWidgetProviderInfo(fromProviderInfo$ar$ds, this.mApp.mWidgetCache);
                Bundle extras = this.mRequest.getExtras();
                Bitmap bitmap = null;
                if (extras != null && (extras.get("appWidgetPreview") instanceof RemoteViews)) {
                    RemoteViews remoteViews = (RemoteViews) extras.get("appWidgetPreview");
                    int i2 = this.mWidgetCell.getPreviewSize()[0];
                    DeviceProfile deviceProfile = this.mDeviceProfile;
                    int i3 = deviceProfile.cellWidthPx * fromProviderInfo$ar$ds.spanX;
                    int i4 = deviceProfile.cellHeightPx * fromProviderInfo$ar$ds.spanY;
                    try {
                        View apply = remoteViews.apply(this, new FrameLayout(this));
                        apply.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                        int measuredWidth = apply.getMeasuredWidth();
                        int measuredHeight = apply.getMeasuredHeight();
                        apply.layout(0, 0, measuredWidth, measuredHeight);
                        if (measuredWidth > i2) {
                            f = ((float) i2) / ((float) measuredWidth);
                            measuredHeight = (int) (((float) measuredHeight) * f);
                        } else {
                            f = 1.0f;
                            i2 = measuredWidth;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i2, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(f, f);
                        apply.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        bitmap = createBitmap;
                    } catch (Exception unused) {
                    }
                }
                if (bitmap != null) {
                    this.mWidgetCell.applyPreview(bitmap);
                } else {
                    this.mWidgetCell.ensurePreview();
                }
            }
        }
        this.mWidgetCell.setOnTouchListener(this);
    }

    public void onPlaceAutomaticallyClick(View view) {
        if (this.mRequest.getRequestType() == 1) {
            InstallShortcutReceiver.queuePendingShortcutInfo(new InstallShortcutReceiver.PendingInstallShortcutInfo(new ShortcutInfoCompat(this.mRequest.getShortcutInfo()), (Context) this), this);
            this.mRequest.accept();
            finish();
            return;
        }
        int allocateAppWidgetId = this.mAppWidgetHost.allocateAppWidgetId();
        this.mPendingBindWidgetId = allocateAppWidgetId;
        if (this.mAppWidgetManager.bindAppWidgetIdIfAllowed(allocateAppWidgetId, this.mRequest.getAppWidgetProviderInfo(this), this.mWidgetOptions)) {
            acceptWidget(this.mPendingBindWidgetId);
            return;
        }
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
        intent.putExtra("appWidgetId", this.mPendingBindWidgetId);
        intent.putExtra("appWidgetProvider", this.mPendingWidgetInfo.componentName);
        intent.putExtra("appWidgetProviderProfile", this.mRequest.getAppWidgetProviderInfo(this).getProfile());
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mPendingBindWidgetId = bundle.getInt("state.widget.id", this.mPendingBindWidgetId);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state.widget.id", this.mPendingBindWidgetId);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.mLastTouchPos.set(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}
