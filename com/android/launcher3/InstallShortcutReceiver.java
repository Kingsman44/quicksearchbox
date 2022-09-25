package com.android.launcher3;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.util.PackageManagerHelper;
import com.evernote.android.state.BuildConfig;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: PG */
public class InstallShortcutReceiver extends BroadcastReceiver {
    public static boolean mUseInstallQueue = false;
    private static final Object sLock = new Object();

    /* compiled from: PG */
    final class Decoder extends JSONObject {
        public final Intent launcherIntent = Intent.parseUri(getString("intent.launch"), 0);
        public final UserHandleCompat user;

        public Decoder(String str, Context context) {
            super(str);
            UserHandleCompat userHandleCompat;
            if (has("userHandle")) {
                userHandleCompat = UserManagerCompat.getInstance(context).getUserForSerialNumber(getLong("userHandle"));
            } else {
                userHandleCompat = UserHandleCompat.myUserHandle();
            }
            this.user = userHandleCompat;
            if (userHandleCompat == null) {
                throw new JSONException("Invalid user");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r3 = r0.mContext.getPackageManager().resolveActivity(r0.launchIntent, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.android.launcher3.InstallShortcutReceiver.PendingInstallShortcutInfo createPendingInfo(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.String r0 = "android.intent.extra.shortcut.INTENT"
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            boolean r0 = isValidExtraType(r4, r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "android.intent.extra.shortcut.ICON_RESOURCE"
            java.lang.Class<android.content.Intent$ShortcutIconResource> r2 = android.content.Intent.ShortcutIconResource.class
            boolean r0 = isValidExtraType(r4, r0, r2)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "android.intent.extra.shortcut.ICON"
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r0 = isValidExtraType(r4, r0, r2)
            if (r0 != 0) goto L_0x0020
            goto L_0x0069
        L_0x0020:
            com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo r0 = new com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo
            com.android.launcher3.compat.UserHandleCompat r2 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
            r0.<init>((android.content.Intent) r4, (com.android.launcher3.compat.UserHandleCompat) r2, (android.content.Context) r3)
            android.content.Intent r3 = r0.launchIntent
            if (r3 == 0) goto L_0x0069
            java.lang.String r4 = r0.label
            if (r4 != 0) goto L_0x0032
            goto L_0x0069
        L_0x0032:
            boolean r4 = r0.isLauncherActivity()
            if (r4 == 0) goto L_0x0039
            goto L_0x0068
        L_0x0039:
            boolean r3 = com.android.launcher3.Utilities.isLauncherAppTarget(r3)
            if (r3 == 0) goto L_0x0068
            com.android.launcher3.compat.UserHandleCompat r3 = r0.user
            com.android.launcher3.compat.UserHandleCompat r4 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0068
            android.content.Context r3 = r0.mContext
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.content.Intent r4 = r0.launchIntent
            r1 = 0
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r4, r1)
            if (r3 == 0) goto L_0x0068
            android.content.Context r4 = r0.mContext
            com.android.launcher3.compat.LauncherActivityInfoCompat r3 = com.android.launcher3.compat.LauncherActivityInfoCompat.fromResolveInfo(r3, r4)
            com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo r4 = new com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo
            android.content.Context r0 = r0.mContext
            r4.<init>((com.android.launcher3.compat.LauncherActivityInfoCompat) r3, (android.content.Context) r0)
            return r4
        L_0x0068:
            return r0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.InstallShortcutReceiver.createPendingInfo(android.content.Context, android.content.Intent):com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo");
    }

    private static PendingInstallShortcutInfo decode(String str, Context context) {
        try {
            Decoder decoder = new Decoder(str, context);
            if (decoder.optBoolean("isAppShortcut")) {
                LauncherActivityInfoCompat resolveActivity = LauncherAppsCompat.getInstance(context).resolveActivity(decoder.launcherIntent, decoder.user);
                if (resolveActivity == null) {
                    return null;
                }
                return new PendingInstallShortcutInfo(resolveActivity, context);
            } else if (decoder.optBoolean("isDeepShortcut")) {
                List queryForFullDetails = DeepShortcutManagerCompat.getInstance(context).queryForFullDetails(decoder.launcherIntent.getPackage(), Arrays.asList(new String[]{decoder.launcherIntent.getStringExtra("shortcut_id")}), decoder.user);
                if (queryForFullDetails.isEmpty()) {
                    return null;
                }
                return new PendingInstallShortcutInfo((ShortcutInfoCompat) queryForFullDetails.get(0), context);
            } else if (decoder.optBoolean("isAppWidget")) {
                int intExtra = decoder.launcherIntent.getIntExtra("appWidgetId", 0);
                AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
                if (appWidgetInfo != null && appWidgetInfo.provider.equals(decoder.launcherIntent.getComponent())) {
                    if (AppWidgetManagerCompat.getInstance(context).getUser(appWidgetInfo).equals(decoder.user)) {
                        return new PendingInstallShortcutInfo(appWidgetInfo, intExtra, context);
                    }
                }
                return null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("android.intent.extra.shortcut.INTENT", decoder.launcherIntent);
                intent.putExtra("android.intent.extra.shortcut.NAME", decoder.getString("name"));
                String optString = decoder.optString("icon");
                String optString2 = decoder.optString("iconResource");
                String optString3 = decoder.optString("iconResourcePackage");
                if (optString != null && !optString.isEmpty()) {
                    byte[] decode = Base64.decode(optString, 0);
                    intent.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeByteArray(decode, 0, decode.length));
                } else if (optString2 != null && !optString2.isEmpty()) {
                    Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                    shortcutIconResource.resourceName = optString2;
                    shortcutIconResource.packageName = optString3;
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", shortcutIconResource);
                }
                return new PendingInstallShortcutInfo(intent, decoder.user, context);
            }
        } catch (URISyntaxException | JSONException e) {
            Log.d("InstallShortcutReceiver", "Exception reading shortcut to add: ".concat(e.toString()));
            return null;
        }
    }

    static void disableAndFlushInstallQueue(Context context) {
        mUseInstallQueue = false;
        flushInstallQueue(context);
    }

    static void flushInstallQueue(Context context) {
        ArrayList arrayList;
        SharedPreferences prefs = Utilities.getPrefs(context);
        synchronized (sLock) {
            Set<String> stringSet = prefs.getStringSet("apps_to_install", (Set) null);
            if (stringSet == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String decode : stringSet) {
                    PendingInstallShortcutInfo decode2 = decode(decode, context);
                    if (decode2 != null) {
                        arrayList2.add(decode2);
                    }
                }
                prefs.edit().putStringSet("apps_to_install", new HashSet()).apply();
                arrayList = arrayList2;
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < size; i++) {
                PendingInstallShortcutInfo pendingInstallShortcutInfo = (PendingInstallShortcutInfo) arrayList.get(i);
                String intentPackage = getIntentPackage(pendingInstallShortcutInfo.launchIntent);
                if (TextUtils.isEmpty(intentPackage) || LauncherModel.isValidPackage(context, intentPackage, UserHandleCompat.myUserHandle())) {
                    arrayList3.add(pendingInstallShortcutInfo.getItemInfo());
                }
            }
            if (!arrayList3.isEmpty()) {
                LauncherAppState.getInstance().mModel.addAndBindAddedWorkspaceItems(context, arrayList3);
            }
        }
    }

    private static String getIntentPackage(Intent intent) {
        return intent.getComponent() == null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    public static HashSet getPendingShortcuts(Context context) {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = Utilities.getPrefs(context).getStringSet("apps_to_install", (Set) null);
        if (Utilities.isEmpty(stringSet)) {
            return hashSet;
        }
        for (String decoder : stringSet) {
            try {
                Decoder decoder2 = new Decoder(decoder, context);
                if (decoder2.optBoolean("isDeepShortcut")) {
                    hashSet.add(DeepShortcutKey.fromIntent(decoder2.launcherIntent, decoder2.user));
                }
            } catch (URISyntaxException | JSONException e) {
                Log.d("InstallShortcutReceiver", "Exception reading shortcut to add: ".concat(e.toString()));
            }
        }
        return hashSet;
    }

    private static boolean isValidExtraType(Intent intent, String str, Class cls) {
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        return parcelableExtra == null || cls.isInstance(parcelableExtra);
    }

    public static void queuePendingShortcutInfo(PendingInstallShortcutInfo pendingInstallShortcutInfo, Context context) {
        String str;
        HashSet hashSet;
        LauncherModel.Callbacks callback = LauncherAppState.getInstance().mModel.getCallback();
        SharedPreferences prefs = Utilities.getPrefs(context);
        synchronized (sLock) {
            try {
                if (pendingInstallShortcutInfo.activityInfo != null) {
                    str = new JSONStringer().object().key("intent.launch").value(pendingInstallShortcutInfo.launchIntent.toUri(0)).key("isAppShortcut").value(true).key("userHandle").value(UserManagerCompat.getInstance(pendingInstallShortcutInfo.mContext).getSerialNumberForUser(pendingInstallShortcutInfo.user)).endObject().toString();
                } else if (pendingInstallShortcutInfo.shortcutInfo != null) {
                    str = new JSONStringer().object().key("intent.launch").value(pendingInstallShortcutInfo.launchIntent.toUri(0)).key("isDeepShortcut").value(true).key("userHandle").value(UserManagerCompat.getInstance(pendingInstallShortcutInfo.mContext).getSerialNumberForUser(pendingInstallShortcutInfo.user)).endObject().toString();
                } else if (pendingInstallShortcutInfo.providerInfo != null) {
                    str = new JSONStringer().object().key("intent.launch").value(pendingInstallShortcutInfo.launchIntent.toUri(0)).key("isAppWidget").value(true).key("userHandle").value(UserManagerCompat.getInstance(pendingInstallShortcutInfo.mContext).getSerialNumberForUser(pendingInstallShortcutInfo.user)).endObject().toString();
                } else {
                    if (pendingInstallShortcutInfo.launchIntent.getAction() == null) {
                        pendingInstallShortcutInfo.launchIntent.setAction("android.intent.action.VIEW");
                    } else if (pendingInstallShortcutInfo.launchIntent.getAction().equals("android.intent.action.MAIN") && pendingInstallShortcutInfo.launchIntent.getCategories() != null && pendingInstallShortcutInfo.launchIntent.getCategories().contains("android.intent.category.LAUNCHER")) {
                        pendingInstallShortcutInfo.launchIntent.addFlags(270532608);
                    }
                    Context context2 = pendingInstallShortcutInfo.mContext;
                    Intent intent = pendingInstallShortcutInfo.launchIntent;
                    Object obj = pendingInstallShortcutInfo.label;
                    if (obj == null) {
                        try {
                            PackageManager packageManager = context2.getPackageManager();
                            obj = packageManager.getActivityInfo(intent.getComponent(), 0).loadLabel(packageManager);
                        } catch (PackageManager.NameNotFoundException unused) {
                            obj = BuildConfig.FLAVOR;
                        }
                    }
                    String obj2 = obj.toString();
                    Bitmap bitmap = (Bitmap) pendingInstallShortcutInfo.data.getParcelableExtra("android.intent.extra.shortcut.ICON");
                    Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) pendingInstallShortcutInfo.data.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                    JSONStringer value = new JSONStringer().object().key("intent.launch").value(pendingInstallShortcutInfo.launchIntent.toUri(0)).key("name").value(obj2);
                    if (bitmap != null) {
                        byte[] flattenBitmap = Utilities.flattenBitmap(bitmap);
                        value = value.key("icon").value(Base64.encodeToString(flattenBitmap, 0, flattenBitmap.length, 0));
                    }
                    if (shortcutIconResource != null) {
                        value = value.key("iconResource").value(shortcutIconResource.resourceName).key("iconResourcePackage").value(shortcutIconResource.packageName);
                    }
                    str = value.endObject().toString();
                }
            } catch (JSONException e) {
                Log.d("InstallShortcutReceiver", "Exception when adding shortcut: ".concat(e.toString()));
                str = null;
            }
            if (str != null) {
                Set<String> stringSet = prefs.getStringSet("apps_to_install", (Set) null);
                if (stringSet == null) {
                    hashSet = new HashSet(1);
                } else {
                    hashSet = new HashSet(stringSet);
                }
                hashSet.add(str);
                prefs.edit().putStringSet("apps_to_install", hashSet).apply();
            }
        }
        if (!mUseInstallQueue && callback != null) {
            flushInstallQueue(context);
        }
    }

    public static void removeFromInstallQueue(Context context, HashSet hashSet, UserHandleCompat userHandleCompat) {
        if (!hashSet.isEmpty()) {
            SharedPreferences prefs = Utilities.getPrefs(context);
            synchronized (sLock) {
                Set<String> stringSet = prefs.getStringSet("apps_to_install", (Set) null);
                if (!Utilities.isEmpty(stringSet)) {
                    HashSet hashSet2 = new HashSet(stringSet);
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        try {
                            Decoder decoder = new Decoder((String) it.next(), context);
                            if (hashSet.contains(getIntentPackage(decoder.launcherIntent)) && userHandleCompat.equals(decoder.user)) {
                                it.remove();
                            }
                        } catch (URISyntaxException | JSONException e) {
                            String obj = e.toString();
                            Log.d("InstallShortcutReceiver", "Exception reading shortcut to add: " + obj);
                            it.remove();
                        }
                    }
                    prefs.edit().putStringSet("apps_to_install", hashSet2).apply();
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        PendingInstallShortcutInfo createPendingInfo;
        if (!"com.android.launcher.action.INSTALL_SHORTCUT".equals(intent.getAction()) || (createPendingInfo = createPendingInfo(context, intent)) == null) {
            return;
        }
        if (createPendingInfo.isLauncherActivity() || PackageManagerHelper.hasPermissionForActivity(context, createPendingInfo.launchIntent, (String) null)) {
            queuePendingShortcutInfo(createPendingInfo, context);
        } else {
            Log.e("InstallShortcutReceiver", "Ignoring malicious intent ".concat(String.valueOf(createPendingInfo.launchIntent.toUri(0))));
        }
    }

    /* compiled from: PG */
    final class PendingInstallShortcutInfo {
        final LauncherActivityInfoCompat activityInfo;
        final Intent data;
        final String label;
        final Intent launchIntent;
        final Context mContext;
        final AppWidgetProviderInfo providerInfo;
        final ShortcutInfoCompat shortcutInfo;
        final UserHandleCompat user;

        public PendingInstallShortcutInfo(AppWidgetProviderInfo appWidgetProviderInfo, int i, Context context) {
            this.activityInfo = null;
            this.shortcutInfo = null;
            this.providerInfo = appWidgetProviderInfo;
            this.data = null;
            this.mContext = context;
            this.user = AppWidgetManagerCompat.getInstance(context).getUser(appWidgetProviderInfo);
            this.launchIntent = new Intent().setComponent(appWidgetProviderInfo.provider).putExtra("appWidgetId", i);
            this.label = appWidgetProviderInfo.label;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.android.launcher3.ItemInfo getItemInfo() {
            /*
                r11 = this;
                com.android.launcher3.compat.LauncherActivityInfoCompat r0 = r11.activityInfo
                if (r0 == 0) goto L_0x000c
                com.android.launcher3.ShortcutInfo r1 = new com.android.launcher3.ShortcutInfo
                android.content.Context r2 = r11.mContext
                r1.<init>((com.android.launcher3.compat.LauncherActivityInfoCompat) r0, (android.content.Context) r2)
                return r1
            L_0x000c:
                com.android.launcher3.shortcuts.ShortcutInfoCompat r0 = r11.shortcutInfo
                if (r0 == 0) goto L_0x0018
                com.android.launcher3.ShortcutInfo r1 = new com.android.launcher3.ShortcutInfo
                android.content.Context r2 = r11.mContext
                r1.<init>((com.android.launcher3.shortcuts.ShortcutInfoCompat) r0, (android.content.Context) r2)
                return r1
            L_0x0018:
                android.appwidget.AppWidgetProviderInfo r0 = r11.providerInfo
                r1 = 0
                if (r0 == 0) goto L_0x0053
                com.android.launcher3.LauncherAppWidgetProviderInfo r0 = com.android.launcher3.LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(r0)
                com.android.launcher3.LauncherAppWidgetInfo r2 = new com.android.launcher3.LauncherAppWidgetInfo
                android.content.Intent r3 = r11.launchIntent
                java.lang.String r4 = "appWidgetId"
                int r1 = r3.getIntExtra(r4, r1)
                android.content.ComponentName r3 = r0.provider
                r2.<init>(r1, r3)
                com.android.launcher3.LauncherAppState r1 = com.android.launcher3.LauncherAppState.getInstance()
                com.android.launcher3.InvariantDeviceProfile r1 = r1.mInvariantDeviceProfile
                int r3 = r0.minSpanX
                r2.minSpanX = r3
                int r3 = r0.minSpanY
                r2.minSpanY = r3
                int r3 = r0.spanX
                int r4 = r1.numColumns
                int r3 = java.lang.Math.min(r3, r4)
                r2.spanX = r3
                int r0 = r0.spanY
                int r1 = r1.numRows
                int r0 = java.lang.Math.min(r0, r1)
                r2.spanY = r0
                return r2
            L_0x0053:
                com.android.launcher3.LauncherAppState r0 = com.android.launcher3.LauncherAppState.getInstance()
                com.android.launcher3.LauncherModel r0 = r0.mModel
                android.content.Context r2 = r11.mContext
                android.content.Intent r3 = r11.data
                java.lang.String r4 = "android.intent.extra.shortcut.INTENT"
                android.os.Parcelable r4 = r3.getParcelableExtra(r4)
                android.content.Intent r4 = (android.content.Intent) r4
                java.lang.String r5 = "android.intent.extra.shortcut.NAME"
                java.lang.String r5 = r3.getStringExtra(r5)
                java.lang.String r6 = "android.intent.extra.shortcut.ICON"
                android.os.Parcelable r6 = r3.getParcelableExtra(r6)
                r7 = 0
                if (r4 != 0) goto L_0x007c
                java.lang.String r0 = "Launcher.Model"
                java.lang.String r1 = "Can't construct ShorcutInfo with null intent"
                android.util.Log.e(r0, r1)
                goto L_0x00d7
            L_0x007c:
                boolean r8 = r6 instanceof android.graphics.Bitmap
                r9 = 1
                if (r8 == 0) goto L_0x008b
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
                android.graphics.Bitmap r1 = com.android.launcher3.Utilities.createIconBitmap(r6, r2)
                r2 = r7
                r7 = r1
                r1 = 1
                goto L_0x00a5
            L_0x008b:
                java.lang.String r6 = "android.intent.extra.shortcut.ICON_RESOURCE"
                android.os.Parcelable r3 = r3.getParcelableExtra(r6)
                boolean r6 = r3 instanceof android.content.Intent.ShortcutIconResource
                if (r6 == 0) goto L_0x00a4
                r7 = r3
                android.content.Intent$ShortcutIconResource r7 = (android.content.Intent.ShortcutIconResource) r7
                java.lang.String r3 = r7.packageName
                java.lang.String r6 = r7.resourceName
                android.graphics.Bitmap r2 = com.android.launcher3.Utilities.createIconBitmap((java.lang.String) r3, (java.lang.String) r6, (android.content.Context) r2)
                r10 = r7
                r7 = r2
                r2 = r10
                goto L_0x00a5
            L_0x00a4:
                r2 = r7
            L_0x00a5:
                com.android.launcher3.ShortcutInfo r3 = new com.android.launcher3.ShortcutInfo
                r3.<init>()
                com.android.launcher3.compat.UserHandleCompat r6 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
                r3.user = r6
                if (r7 != 0) goto L_0x00bc
                com.android.launcher3.IconCache r6 = r0.mIconCache
                com.android.launcher3.compat.UserHandleCompat r7 = r3.user
                android.graphics.Bitmap r7 = r6.getDefaultIcon(r7)
                r3.usingFallbackIcon = r9
            L_0x00bc:
                r3.mIcon = r7
                java.lang.String r5 = com.android.launcher3.Utilities.trim(r5)
                r3.title = r5
                com.android.launcher3.compat.UserManagerCompat r0 = r0.mUserManager
                java.lang.CharSequence r5 = r3.title
                com.android.launcher3.compat.UserHandleCompat r6 = r3.user
                java.lang.CharSequence r0 = r0.getBadgedLabelForUser(r5, r6)
                r3.contentDescription = r0
                r3.intent = r4
                r3.customIcon = r1
                r3.iconResource = r2
                r7 = r3
            L_0x00d7:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.InstallShortcutReceiver.PendingInstallShortcutInfo.getItemInfo():com.android.launcher3.ItemInfo");
        }

        public final boolean isLauncherActivity() {
            return this.activityInfo != null;
        }

        public PendingInstallShortcutInfo(Intent intent, UserHandleCompat userHandleCompat, Context context) {
            this.data = intent;
            this.user = userHandleCompat;
            this.mContext = context;
            this.launchIntent = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
            this.label = intent.getStringExtra("android.intent.extra.shortcut.NAME");
            this.activityInfo = null;
            this.shortcutInfo = null;
            this.providerInfo = null;
        }

        public PendingInstallShortcutInfo(LauncherActivityInfoCompat launcherActivityInfoCompat, Context context) {
            this.data = null;
            this.mContext = context;
            this.activityInfo = launcherActivityInfoCompat;
            this.shortcutInfo = null;
            this.providerInfo = null;
            UserHandleCompat user2 = launcherActivityInfoCompat.getUser();
            this.user = user2;
            this.launchIntent = AppInfo.makeLaunchIntent(context, launcherActivityInfoCompat, user2);
            this.label = launcherActivityInfoCompat.getLabel().toString();
        }

        public PendingInstallShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
            this.data = null;
            this.shortcutInfo = shortcutInfoCompat;
            this.mContext = context;
            this.activityInfo = null;
            this.providerInfo = null;
            this.user = shortcutInfoCompat.getUserHandle();
            this.launchIntent = shortcutInfoCompat.makeIntent(context);
            this.label = shortcutInfoCompat.getShortLabel().toString();
        }
    }
}
