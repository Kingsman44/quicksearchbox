package com.android.launcher3;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
public final class InvariantDeviceProfile {
    int defaultLayoutId;
    public int fillResIconDpi;
    public int hotseatAllAppsRank;
    float hotseatIconSize;
    public int iconBitmapSize;
    public float iconSize;
    public float iconTextSize;
    DeviceProfile landscapeProfile;
    public int minAllAppsPredictionColumns;
    float minHeightDps;
    float minWidthDps;
    String name;
    public int numColumns;
    public int numFolderColumns;
    public int numFolderRows;
    public int numHotseatIcons;
    public int numRows;
    DeviceProfile portraitProfile;

    public InvariantDeviceProfile() {
    }

    public InvariantDeviceProfile(Context context) {
        Display display;
        DisplayMetrics displayMetrics;
        Point point;
        Point point2;
        ArrayList arrayList;
        float f;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        Point point3 = new Point();
        Point point4 = new Point();
        defaultDisplay.getCurrentSizeRange(point3, point4);
        this.minWidthDps = Utilities.dpiFromPx(Math.min(point3.x, point3.y), displayMetrics2);
        final float dpiFromPx = Utilities.dpiFromPx(Math.min(point4.x, point4.y), displayMetrics2);
        this.minHeightDps = dpiFromPx;
        final float f2 = this.minWidthDps;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new InvariantDeviceProfile("Super Short Stubby", 255.0f, 300.0f, 2, 3, 2, 3, 3, 48.0f, 13.0f, 3, 48.0f, R.xml.default_workspace_3x3));
        arrayList2.add(new InvariantDeviceProfile("Shorter Stubby", 255.0f, 400.0f, 3, 3, 3, 3, 3, 48.0f, 13.0f, 3, 48.0f, R.xml.default_workspace_3x3));
        arrayList2.add(new InvariantDeviceProfile("Short Stubby", 275.0f, 420.0f, 3, 4, 3, 4, 4, 48.0f, 13.0f, 5, 48.0f, R.xml.default_workspace_4x4));
        arrayList2.add(new InvariantDeviceProfile("Stubby", 255.0f, 450.0f, 3, 4, 3, 4, 4, 48.0f, 13.0f, 5, 48.0f, R.xml.default_workspace_4x4));
        arrayList2.add(new InvariantDeviceProfile("Nexus S", 296.0f, 491.33f, 4, 4, 4, 4, 4, 48.0f, 13.0f, 5, 48.0f, R.xml.default_workspace_4x4));
        arrayList2.add(new InvariantDeviceProfile("Nexus 4", 359.0f, 567.0f, 4, 4, 4, 4, 4, 60.0f, 13.0f, 5, 56.0f, R.xml.default_workspace_4x4));
        arrayList2.add(new InvariantDeviceProfile("Nexus 5", 335.0f, 567.0f, 4, 4, 4, 4, 4, 60.0f, 13.0f, 5, 56.0f, R.xml.default_workspace_4x4));
        arrayList2.add(new InvariantDeviceProfile("Large Phone", 406.0f, 694.0f, 5, 5, 4, 4, 4, 64.0f, 14.4f, 5, 56.0f, R.xml.default_workspace_5x5));
        arrayList2.add(new InvariantDeviceProfile("Nexus 7", 575.0f, 904.0f, 5, 6, 4, 5, 4, 72.0f, 14.4f, 7, 60.0f, R.xml.default_workspace_5x6));
        arrayList2.add(new InvariantDeviceProfile("Nexus 10", 727.0f, 1207.0f, 5, 6, 4, 5, 4, 76.0f, 14.4f, 7, 76.0f, R.xml.default_workspace_5x6));
        arrayList2.add(new InvariantDeviceProfile("20-inch Tablet", 1527.0f, 2527.0f, 7, 7, 6, 6, 4, 100.0f, 20.0f, 7, 72.0f, R.xml.default_workspace_5x6));
        Collections.sort(arrayList2, new Comparator() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                InvariantDeviceProfile invariantDeviceProfile = (InvariantDeviceProfile) obj;
                InvariantDeviceProfile invariantDeviceProfile2 = (InvariantDeviceProfile) obj2;
                return Float.compare(InvariantDeviceProfile.dist$ar$ds(f2, dpiFromPx, invariantDeviceProfile.minWidthDps, invariantDeviceProfile.minHeightDps), InvariantDeviceProfile.dist$ar$ds(f2, dpiFromPx, invariantDeviceProfile2.minWidthDps, invariantDeviceProfile2.minHeightDps));
            }
        });
        float f3 = this.minWidthDps;
        float f4 = this.minHeightDps;
        InvariantDeviceProfile invariantDeviceProfile = (InvariantDeviceProfile) arrayList2.get(0);
        if (dist$ar$ds(f3, f4, invariantDeviceProfile.minWidthDps, invariantDeviceProfile.minHeightDps) == 0.0f) {
            display = defaultDisplay;
            displayMetrics = displayMetrics2;
            arrayList = arrayList2;
            point = point3;
            point2 = point4;
        } else {
            InvariantDeviceProfile invariantDeviceProfile2 = new InvariantDeviceProfile();
            int i = 0;
            float f5 = 0.0f;
            while (i < arrayList2.size() && ((float) i) < 3.0f) {
                InvariantDeviceProfile invariantDeviceProfile3 = (InvariantDeviceProfile) arrayList2.get(i);
                Point point5 = point4;
                Point point6 = point3;
                Display display2 = defaultDisplay;
                DisplayMetrics displayMetrics3 = displayMetrics2;
                ArrayList arrayList3 = arrayList2;
                int i2 = i;
                InvariantDeviceProfile invariantDeviceProfile4 = invariantDeviceProfile2;
                float f6 = f5;
                InvariantDeviceProfile invariantDeviceProfile5 = new InvariantDeviceProfile(invariantDeviceProfile3.name, invariantDeviceProfile3.minWidthDps, invariantDeviceProfile3.minHeightDps, invariantDeviceProfile3.numRows, invariantDeviceProfile3.numColumns, invariantDeviceProfile3.numFolderRows, invariantDeviceProfile3.numFolderColumns, invariantDeviceProfile3.minAllAppsPredictionColumns, invariantDeviceProfile3.iconSize, invariantDeviceProfile3.iconTextSize, invariantDeviceProfile3.numHotseatIcons, invariantDeviceProfile3.hotseatIconSize, invariantDeviceProfile3.defaultLayoutId);
                float dist$ar$ds = dist$ar$ds(f3, f4, invariantDeviceProfile5.minWidthDps, invariantDeviceProfile5.minHeightDps);
                if (Float.compare(dist$ar$ds, 0.0f) == 0) {
                    f = Float.POSITIVE_INFINITY;
                } else {
                    f = (float) (100000.0d / Math.pow((double) dist$ar$ds, 5.0d));
                }
                f5 = f6 + f;
                invariantDeviceProfile5.multiply$ar$ds(f);
                InvariantDeviceProfile invariantDeviceProfile6 = invariantDeviceProfile4;
                invariantDeviceProfile6.iconSize += invariantDeviceProfile5.iconSize;
                invariantDeviceProfile6.iconTextSize += invariantDeviceProfile5.iconTextSize;
                invariantDeviceProfile6.hotseatIconSize += invariantDeviceProfile5.hotseatIconSize;
                i = i2 + 1;
                Context context2 = context;
                invariantDeviceProfile2 = invariantDeviceProfile6;
                point4 = point5;
                point3 = point6;
                defaultDisplay = display2;
                displayMetrics2 = displayMetrics3;
                arrayList2 = arrayList3;
            }
            display = defaultDisplay;
            displayMetrics = displayMetrics2;
            InvariantDeviceProfile invariantDeviceProfile7 = invariantDeviceProfile2;
            point = point3;
            point2 = point4;
            invariantDeviceProfile7.multiply$ar$ds(1.0f / f5);
            invariantDeviceProfile = invariantDeviceProfile7;
            arrayList = arrayList2;
        }
        InvariantDeviceProfile invariantDeviceProfile8 = (InvariantDeviceProfile) arrayList.get(0);
        this.numRows = invariantDeviceProfile8.numRows;
        this.numColumns = invariantDeviceProfile8.numColumns;
        int i3 = invariantDeviceProfile8.numHotseatIcons;
        this.numHotseatIcons = i3;
        this.hotseatAllAppsRank = i3 >> 1;
        this.defaultLayoutId = invariantDeviceProfile8.defaultLayoutId;
        this.numFolderRows = invariantDeviceProfile8.numFolderRows;
        this.numFolderColumns = invariantDeviceProfile8.numFolderColumns;
        this.minAllAppsPredictionColumns = invariantDeviceProfile8.minAllAppsPredictionColumns;
        float f7 = invariantDeviceProfile.iconSize;
        this.iconSize = f7;
        DisplayMetrics displayMetrics4 = displayMetrics;
        int pxFromDp = Utilities.pxFromDp(f7, displayMetrics4);
        this.iconBitmapSize = pxFromDp;
        this.iconTextSize = invariantDeviceProfile.iconTextSize;
        this.hotseatIconSize = invariantDeviceProfile.hotseatIconSize;
        int[] iArr = {120, 160, 213, 240, 320, 480, 640};
        int i4 = 640;
        for (int i5 = 6; i5 >= 0; i5--) {
            int i6 = iArr[i5];
            if ((((float) i6) * 48.0f) / 160.0f >= ((float) pxFromDp)) {
                i4 = i6;
            }
        }
        this.fillResIconDpi = i4;
        Partner partner = Partner.get(context.getPackageManager());
        if (partner != null) {
            partner.applyInvariantDeviceProfileOverrides(this, displayMetrics4);
        }
        Point point7 = new Point();
        display.getRealSize(point7);
        int min = Math.min(point7.x, point7.y);
        int max = Math.max(point7.x, point7.y);
        Context context3 = context;
        Point point8 = point;
        Point point9 = point2;
        this.landscapeProfile = new DeviceProfile(context3, this, point8, point9, max, min, true);
        this.portraitProfile = new DeviceProfile(context3, this, point8, point9, min, max, false);
    }

    static final float dist$ar$ds(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    private final void multiply$ar$ds(float f) {
        this.iconSize *= f;
        this.iconTextSize *= f;
        this.hotseatIconSize *= f;
    }

    public final DeviceProfile getDeviceProfile(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? this.landscapeProfile : this.portraitProfile;
    }

    public InvariantDeviceProfile(String str, float f, float f2, int i, int i2, int i3, int i4, int i5, float f3, float f4, int i6, float f5, int i7) {
        if ((i6 & 1) != 0) {
            this.name = str;
            this.minWidthDps = f;
            this.minHeightDps = f2;
            this.numRows = i;
            this.numColumns = i2;
            this.numFolderRows = i3;
            this.numFolderColumns = i4;
            this.minAllAppsPredictionColumns = i5;
            this.iconSize = f3;
            this.iconTextSize = f4;
            this.numHotseatIcons = i6;
            this.hotseatIconSize = f5;
            this.defaultLayoutId = i7;
            return;
        }
        throw new RuntimeException("All Device Profiles must have an odd number of hotseat spaces");
    }
}
