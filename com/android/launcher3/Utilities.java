package com.android.launcher3;

import android.app.Activity;
import android.app.SearchManager;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.util.ShadowGenerator;
import com.google.android.googlequicksearchbox.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class Utilities {
    public static final boolean ATLEAST_JB_MR1 = true;
    public static final boolean ATLEAST_JB_MR2 = true;
    public static final boolean ATLEAST_KITKAT = true;
    public static final boolean ATLEAST_LOLLIPOP = true;
    public static final boolean ATLEAST_LOLLIPOP_MR1 = true;
    public static final boolean ATLEAST_MARSHMALLOW = true;
    public static final boolean ATLEAST_NOUGAT = true;
    public static final boolean ATLEAST_O = true;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static final Canvas sCanvas;
    private static final int[] sLoc0 = new int[2];
    private static final int[] sLoc1 = new int[2];
    private static final Rect sOldBounds = new Rect();
    private static final Pattern sTrimPattern = Pattern.compile("^[\\s|\\p{javaSpaceChar}]*(.*)[\\s|\\p{javaSpaceChar}]*$");

    /* compiled from: PG */
    final class FixedSizeBitmapDrawable extends BitmapDrawable {
        public FixedSizeBitmapDrawable(Bitmap bitmap) {
            super((Resources) null, bitmap);
        }

        public final int getIntrinsicHeight() {
            return getBitmap().getWidth();
        }

        public final int getIntrinsicWidth() {
            return getBitmap().getWidth();
        }
    }

    static {
        Canvas canvas = new Canvas();
        sCanvas = canvas;
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 2));
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(availableProcessors + 1, availableProcessors + availableProcessors + 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static Bitmap addShadowToIcon(Bitmap bitmap) {
        return ShadowGenerator.getInstance().recreateIcon(bitmap);
    }

    public static Bitmap badgeIconForUser(Bitmap bitmap, UserHandleCompat userHandleCompat, Context context) {
        if (!ATLEAST_LOLLIPOP || userHandleCompat == null || UserHandleCompat.myUserHandle().equals(userHandleCompat)) {
            return bitmap;
        }
        Drawable userBadgedIcon = context.getPackageManager().getUserBadgedIcon(new FixedSizeBitmapDrawable(bitmap), userHandleCompat.getUser());
        if (userBadgedIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) userBadgedIcon).getBitmap();
        }
        return createIconBitmap(userBadgedIcon, context, 1.0f);
    }

    public static void badgeWithBitmap$ar$ds(Bitmap bitmap, Bitmap bitmap2, Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_badge_size);
        Canvas canvas = sCanvas;
        synchronized (canvas) {
            canvas.setBitmap(bitmap);
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(bitmap.getWidth() - dimensionPixelSize, bitmap.getHeight() - dimensionPixelSize, bitmap.getWidth(), bitmap.getHeight()), new Paint(2));
            canvas.setBitmap((Bitmap) null);
        }
    }

    public static int calculateTextHeight(float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) Math.ceil((double) (fontMetrics.bottom - fontMetrics.top));
    }

    public static Bitmap createBadgedIconBitmap(Drawable drawable, UserHandleCompat userHandleCompat, Context context) {
        return badgeIconForUser(createIconBitmap(drawable, context, 1.0f), userHandleCompat, context);
    }

    public static String createDbSelectionQuery(String str, Iterable iterable) {
        return String.format(Locale.ENGLISH, "%s IN (%s)", new Object[]{str, TextUtils.join(", ", iterable)});
    }

    public static Bitmap createIconBitmap(Cursor cursor, int i, Context context) {
        byte[] blob = cursor.getBlob(i);
        try {
            return createIconBitmap(BitmapFactory.decodeByteArray(blob, 0, blob.length), context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap createScaledBitmapWithoutShadow(Drawable drawable, Context context) {
        RectF rectF = new RectF();
        float min = Math.min(Math.min(rectF.left, rectF.right), rectF.top);
        float f = min < 0.010416667f ? 0.48958334f / (0.5f - min) : 1.0f;
        if (rectF.bottom < 0.03125f) {
            f = Math.min(f, 0.46875f / (0.5f - rectF.bottom));
        }
        return createIconBitmap(drawable, context, Math.min(1.0f, f));
    }

    public static float dpiFromPx(int i, DisplayMetrics displayMetrics) {
        return ((float) i) / (((float) displayMetrics.densityDpi) / 160.0f);
    }

    static int findDominantColorByHue$ar$ds(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int sqrt = (int) Math.sqrt((double) ((height * width) / 20));
        char c = 1;
        if (sqrt <= 0) {
            sqrt = 1;
        }
        float[] fArr = new float[3];
        float[] fArr2 = new float[360];
        char c2 = 0;
        int i = -1;
        float f = -1.0f;
        for (int i2 = 0; i2 < height; i2 += sqrt) {
            for (int i3 = 0; i3 < width; i3 += sqrt) {
                int pixel = bitmap2.getPixel(i3, i2);
                if (((pixel >> 24) & PrivateKeyType.INVALID) >= 128) {
                    Color.colorToHSV(pixel | -16777216, fArr);
                    int i4 = (int) fArr[0];
                    if (i4 >= 0 && i4 < 360) {
                        float f2 = fArr2[i4] + (fArr[1] * fArr[2]);
                        fArr2[i4] = f2;
                        if (f2 > f) {
                            i = i4;
                            f = f2;
                        }
                    }
                }
            }
        }
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        float f3 = -1.0f;
        int i6 = -16777216;
        while (i5 < height) {
            int i7 = 0;
            while (i7 < width) {
                int pixel2 = bitmap2.getPixel(i7, i5) | -16777216;
                Color.colorToHSV(pixel2, fArr);
                if (((int) fArr[c2]) == i) {
                    float f4 = fArr[c];
                    float f5 = fArr[2];
                    int i8 = ((int) (f4 * 100.0f)) + ((int) (f5 * 10000.0f));
                    float f6 = f4 * f5;
                    Float f7 = (Float) sparseArray.get(i8);
                    if (f7 != null) {
                        f6 += f7.floatValue();
                    }
                    sparseArray.put(i8, Float.valueOf(f6));
                    if (f6 > f3) {
                        i6 = pixel2;
                        f3 = f6;
                    }
                }
                i7 += sqrt;
                c = 1;
                c2 = 0;
            }
            i5 += sqrt;
            c = 1;
            c2 = 0;
        }
        return i6;
    }

    static Pair findSystemApk(String str, PackageManager packageManager) {
        for (ResolveInfo next : packageManager.queryBroadcastReceivers(new Intent(str), 0)) {
            if (!(next.activityInfo == null || (next.activityInfo.applicationInfo.flags & 1) == 0)) {
                String str2 = next.activityInfo.packageName;
                try {
                    return Pair.create(str2, packageManager.getResourcesForApplication(str2));
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("Launcher.Utilities", "Failed to find resources for ".concat(String.valueOf(str2)));
                }
            }
        }
        return null;
    }

    public static boolean findVacantCell(int[] iArr, int i, int i2, int i3, int i4, boolean[][] zArr) {
        int i5 = 0;
        while (true) {
            int i6 = i5 + i2;
            if (i6 <= i4) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + i;
                    if (i8 > i3) {
                        break;
                    }
                    boolean z = !zArr[i7][i5];
                    for (int i9 = i7; i9 < i8; i9++) {
                        for (int i10 = i5; i10 < i6; i10++) {
                            z = z && !zArr[i9][i10];
                            if (!z) {
                                break;
                            }
                        }
                    }
                    if (z) {
                        iArr[0] = i7;
                        iArr[1] = i5;
                        return true;
                    }
                    i7++;
                }
            } else {
                return false;
            }
            i5++;
        }
    }

    public static byte[] flattenBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.w("Launcher.Utilities", "Could not write bitmap");
            return null;
        }
    }

    public static int[] getCenterDeltaInScreenSpace$ar$ds(View view, View view2) {
        int[] iArr = sLoc0;
        view.getLocationInWindow(iArr);
        int[] iArr2 = sLoc1;
        view2.getLocationInWindow(iArr2);
        iArr[0] = (int) (((float) iArr[0]) + ((((float) view.getMeasuredWidth()) * view.getScaleX()) / 2.0f));
        iArr[1] = (int) (((float) iArr[1]) + ((((float) view.getMeasuredHeight()) * view.getScaleY()) / 2.0f));
        iArr2[0] = (int) (((float) iArr2[0]) + ((((float) view2.getMeasuredWidth()) * view2.getScaleX()) / 2.0f));
        int measuredHeight = (int) (((float) iArr2[1]) + ((((float) view2.getMeasuredHeight()) * view2.getScaleY()) / 2.0f));
        iArr2[1] = measuredHeight;
        return new int[]{iArr2[0] - iArr[0], measuredHeight - iArr[1]};
    }

    public static float getDescendantCoordRelativeToParent(View view, View view2, int[] iArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) iArr[0], (float) iArr[1]};
        View view3 = view;
        while (view3 != view2 && view3 != null) {
            arrayList.add(view3);
            view3 = (View) view3.getParent();
        }
        arrayList.add(view2);
        int size = arrayList.size();
        float f = 1.0f;
        for (int i = 0; i < size; i++) {
            View view4 = (View) arrayList.get(i);
            if (view4 != view || z) {
                fArr[0] = fArr[0] - ((float) view4.getScrollX());
                fArr[1] = fArr[1] - ((float) view4.getScrollY());
            }
            view4.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + ((float) view4.getLeft());
            fArr[1] = fArr[1] + ((float) view4.getTop());
            f *= view4.getScaleX();
        }
        iArr[0] = Math.round(fArr[0]);
        iArr[1] = Math.round(fArr[1]);
        return f;
    }

    private static int getIconBitmapSize() {
        return LauncherAppState.getInstance().mInvariantDeviceProfile.iconBitmapSize;
    }

    public static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences("com.android.launcher3.prefs", 0);
    }

    public static AppWidgetProviderInfo getSearchWidgetProvider(Context context) {
        ComponentName globalSearchActivity = ((SearchManager) context.getSystemService("search")).getGlobalSearchActivity();
        AppWidgetProviderInfo appWidgetProviderInfo = null;
        if (globalSearchActivity == null) {
            return null;
        }
        String packageName = globalSearchActivity.getPackageName();
        Iterator<AppWidgetProviderInfo> it = AppWidgetManager.getInstance(context).getInstalledProviders().iterator();
        while (it.hasNext()) {
            AppWidgetProviderInfo next = it.next();
            if (next.provider.getPackageName().equals(packageName)) {
                if (!ATLEAST_JB_MR1 || (next.widgetCategory & 4) != 0) {
                    return next;
                }
                if (appWidgetProviderInfo == null) {
                    appWidgetProviderInfo = next;
                }
            }
        }
        return appWidgetProviderInfo;
    }

    public static boolean isAllowRotationPrefEnabled(Context context) {
        int i;
        boolean z = false;
        if (ATLEAST_NOUGAT) {
            try {
                i = ((Integer) DisplayMetrics.class.getField("DENSITY_DEVICE_STABLE").get((Object) null)).intValue();
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
                i = 160;
            }
            Resources resources = context.getResources();
            if ((resources.getConfiguration().smallestScreenWidthDp * resources.getDisplayMetrics().densityDpi) / i >= 600) {
                z = true;
            }
        }
        return getPrefs(context).getBoolean("pref_allowRotation", z);
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isLauncherAppTarget(Intent intent) {
        if (intent != null && "android.intent.action.MAIN".equals(intent.getAction()) && intent.getComponent() != null && intent.getCategories() != null && intent.getCategories().size() == 1 && intent.hasCategory("android.intent.category.LAUNCHER") && TextUtils.isEmpty(intent.getDataString())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return true;
            }
            Set keySet = extras.keySet();
            if (keySet.size() != 1 || !keySet.contains("profile")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isPowerSaverOn(Context context) {
        return ATLEAST_LOLLIPOP && ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }

    public static boolean isPropertyEnabled$ar$ds() {
        return Log.isLoggable("launcher_dump_state", 2);
    }

    public static boolean isRtl(Resources resources) {
        return ATLEAST_JB_MR1 && resources.getConfiguration().getLayoutDirection() == 1;
    }

    static boolean isSystemApp(Context context, Intent intent) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        ComponentName component = intent.getComponent();
        if (component == null) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            str = null;
            if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
                str = resolveActivity.activityInfo.packageName;
            }
        } else {
            str = component.getPackageName();
        }
        if (str != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo == null || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 1) == 0) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean isViewAttachedToWindow(View view) {
        if (ATLEAST_KITKAT) {
            return view.isAttachedToWindow();
        }
        return view.getKeyDispatcherState() != null;
    }

    public static int longCompare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static void mapCoordInSelfToDescendent$ar$ds(View view, View view2, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) iArr[0], (float) iArr[1]};
        while (view != view2) {
            arrayList.add(view);
            view = (View) view.getParent();
        }
        arrayList.add(view2);
        Matrix matrix = new Matrix();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                View view3 = (View) arrayList.get(size);
                View view4 = size > 0 ? (View) arrayList.get(size - 1) : null;
                fArr[0] = fArr[0] + ((float) view3.getScrollX());
                fArr[1] = fArr[1] + ((float) view3.getScrollY());
                if (view4 != null) {
                    fArr[0] = fArr[0] - ((float) view4.getLeft());
                    fArr[1] = fArr[1] - ((float) view4.getTop());
                    view4.getMatrix().invert(matrix);
                    matrix.mapPoints(fArr);
                    view4.getScaleX();
                }
            } else {
                iArr[0] = Math.round(fArr[0]);
                iArr[1] = Math.round(fArr[1]);
                return;
            }
        }
    }

    public static boolean pointInView(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) view.getWidth()) + f3 && f2 < ((float) view.getHeight()) + f3;
    }

    public static int pxFromDp(float f, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static int pxFromSp(float f, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(2, f, displayMetrics));
    }

    public static void scaleRectAboutCenter(Rect rect, float f) {
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        rect.offset(-centerX, -centerY);
        if (f != 1.0f) {
            rect.left = (int) ((((float) rect.left) * f) + 0.5f);
            rect.top = (int) ((((float) rect.top) * f) + 0.5f);
            rect.right = (int) ((((float) rect.right) * f) + 0.5f);
            rect.bottom = (int) ((((float) rect.bottom) * f) + 0.5f);
        }
        rect.offset(centerX, centerY);
    }

    public static void sendCustomAccessibilityEvent(View view, int i, String str) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            view.onInitializeAccessibilityEvent(obtain);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static float shrinkRect(Rect rect, float f, float f2) {
        float min = Math.min(Math.min(f, f2), 1.0f);
        if (min < 1.0f) {
            int width = (int) (((float) rect.width()) * (f - min) * 0.5f);
            rect.left += width;
            rect.right -= width;
            int height = (int) (((float) rect.height()) * (f2 - min) * 0.5f);
            rect.top += height;
            rect.bottom -= height;
        }
        return min;
    }

    public static void startActivityForResultSafely(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
        } catch (SecurityException e) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
            String obj = intent.toString();
            Log.e("Launcher.Utilities", "Launcher does not have the permission to launch " + obj + ". Make sure to create a MAIN intent-filter for the corresponding activity or use the exported attribute for this activity.", e);
        }
    }

    public static void toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = sLoc0;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
    }

    public static void toLocalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = sLoc0;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
    }

    public static String trim(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return sTrimPattern.matcher(charSequence).replaceAll("$1");
    }

    public static Bitmap createIconBitmap(Bitmap bitmap, Context context) {
        int iconBitmapSize = getIconBitmapSize();
        if (iconBitmapSize == bitmap.getWidth() && iconBitmapSize == bitmap.getHeight()) {
            return bitmap;
        }
        return createIconBitmap((Drawable) new BitmapDrawable(context.getResources(), bitmap), context, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075 A[SYNTHETIC, Splitter:B:31:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap createIconBitmap(android.graphics.drawable.Drawable r10, android.content.Context r11, float r12) {
        /*
            android.graphics.Canvas r0 = sCanvas
            monitor-enter(r0)
            int r1 = getIconBitmapSize()     // Catch:{ all -> 0x00bd }
            boolean r2 = r10 instanceof android.graphics.drawable.PaintDrawable     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0015
            r11 = r10
            android.graphics.drawable.PaintDrawable r11 = (android.graphics.drawable.PaintDrawable) r11     // Catch:{ all -> 0x00bd }
            r11.setIntrinsicWidth(r1)     // Catch:{ all -> 0x00bd }
            r11.setIntrinsicHeight(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x0033
        L_0x0015:
            boolean r2 = r10 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2     // Catch:{ all -> 0x00bd }
            android.graphics.Bitmap r3 = r2.getBitmap()     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0033
            int r3 = r3.getDensity()     // Catch:{ all -> 0x00bd }
            if (r3 != 0) goto L_0x0033
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x00bd }
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch:{ all -> 0x00bd }
            r2.setTargetDensity(r11)     // Catch:{ all -> 0x00bd }
        L_0x0033:
            int r11 = r10.getIntrinsicWidth()     // Catch:{ all -> 0x00bd }
            int r2 = r10.getIntrinsicHeight()     // Catch:{ all -> 0x00bd }
            if (r11 <= 0) goto L_0x0052
            if (r2 <= 0) goto L_0x0052
            float r3 = (float) r11     // Catch:{ all -> 0x00bd }
            float r4 = (float) r2     // Catch:{ all -> 0x00bd }
            float r3 = r3 / r4
            if (r11 <= r2) goto L_0x004a
            float r11 = (float) r1     // Catch:{ all -> 0x00bd }
            float r11 = r11 / r3
            int r11 = (int) r11     // Catch:{ all -> 0x00bd }
            r2 = r11
            r11 = r1
            goto L_0x0054
        L_0x004a:
            if (r2 <= r11) goto L_0x0052
            float r11 = (float) r1     // Catch:{ all -> 0x00bd }
            float r11 = r11 * r3
            int r11 = (int) r11     // Catch:{ all -> 0x00bd }
            r2 = r1
            goto L_0x0054
        L_0x0052:
            r11 = r1
            r2 = r11
        L_0x0054:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00bd }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r1, r3)     // Catch:{ all -> 0x00bd }
            r0.setBitmap(r3)     // Catch:{ all -> 0x00bd }
            int r4 = r1 - r11
            int r4 = r4 / 2
            int r5 = r1 - r2
            int r5 = r5 / 2
            boolean r6 = ATLEAST_O     // Catch:{ all -> 0x00bd }
            r7 = 0
            if (r6 == 0) goto L_0x0072
            java.lang.String r6 = "android.graphics.drawable.AdaptiveIconDrawable"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0073
        L_0x0071:
        L_0x0072:
            r6 = r7
        L_0x0073:
            if (r6 == 0) goto L_0x0084
            java.lang.Class r8 = r10.getClass()     // Catch:{ all -> 0x00bd }
            boolean r8 = r6.isAssignableFrom(r8)     // Catch:{ all -> 0x00bd }
            if (r8 == 0) goto L_0x0084
            r8 = 1062165545(0x3f4f5c29, float:0.81)
            float r12 = r12 * r8
        L_0x0084:
            android.graphics.Rect r8 = sOldBounds     // Catch:{ all -> 0x00bd }
            android.graphics.Rect r9 = r10.getBounds()     // Catch:{ all -> 0x00bd }
            r8.set(r9)     // Catch:{ all -> 0x00bd }
            int r11 = r11 + r4
            int r2 = r2 + r5
            r10.setBounds(r4, r5, r11, r2)     // Catch:{ all -> 0x00bd }
            r0.save()     // Catch:{ all -> 0x00bd }
            int r1 = r1 / 2
            float r11 = (float) r1     // Catch:{ all -> 0x00bd }
            r0.scale(r12, r12, r11, r11)     // Catch:{ all -> 0x00bd }
            r10.draw(r0)     // Catch:{ all -> 0x00bd }
            r0.restore()     // Catch:{ all -> 0x00bd }
            r10.setBounds(r8)     // Catch:{ all -> 0x00bd }
            r0.setBitmap(r7)     // Catch:{ all -> 0x00bd }
            if (r6 == 0) goto L_0x00bb
            java.lang.Class r10 = r10.getClass()     // Catch:{ all -> 0x00bd }
            boolean r10 = r6.isAssignableFrom(r10)     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x00bb
            com.android.launcher3.util.ShadowGenerator r10 = com.android.launcher3.util.ShadowGenerator.getInstance()     // Catch:{ all -> 0x00bd }
            android.graphics.Bitmap r3 = r10.recreateIcon(r3)     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return r3
        L_0x00bd:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Utilities.createIconBitmap(android.graphics.drawable.Drawable, android.content.Context, float):android.graphics.Bitmap");
    }

    public static Bitmap createIconBitmap(String str, String str2, Context context) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (resourcesForApplication != null) {
                return createIconBitmap(resourcesForApplication.getDrawableForDensity(resourcesForApplication.getIdentifier(str2, (String) null, (String) null), LauncherAppState.getInstance().mInvariantDeviceProfile.fillResIconDpi), context, 1.0f);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
