package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import com.android.launcher3.AutoInstallsLayout;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
public class DefaultLayoutParser extends AutoInstallsLayout {

    /* compiled from: PG */
    final class AppShortcutWithUriParser extends AutoInstallsLayout.AppShortcutParser {
        public AppShortcutWithUriParser() {
            super();
        }

        /* access modifiers changed from: protected */
        public final long invalidPackageOrClass(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "uri");
            if (TextUtils.isEmpty(attributeValue)) {
                Log.e("DefaultLayoutParser", "Skipping invalid <favorite> with no component or uri");
                return -1;
            }
            try {
                Intent parseUri = Intent.parseUri(attributeValue, 0);
                ResolveInfo resolveActivity = DefaultLayoutParser.this.mPackageManager.resolveActivity(parseUri, 65536);
                List<ResolveInfo> queryIntentActivities = DefaultLayoutParser.this.mPackageManager.queryIntentActivities(parseUri, 65536);
                int i = 0;
                while (true) {
                    if (i < queryIntentActivities.size()) {
                        ResolveInfo resolveInfo = queryIntentActivities.get(i);
                        if (resolveInfo.activityInfo.name.equals(resolveActivity.activityInfo.name) && resolveInfo.activityInfo.packageName.equals(resolveActivity.activityInfo.packageName)) {
                            break;
                        }
                        i++;
                    } else {
                        int size = queryIntentActivities.size();
                        ResolveInfo resolveInfo2 = null;
                        int i2 = 0;
                        while (i2 < size) {
                            try {
                                if ((DefaultLayoutParser.this.mPackageManager.getApplicationInfo(queryIntentActivities.get(i2).activityInfo.packageName, 0).flags & 1) != 0) {
                                    if (resolveInfo2 != null) {
                                        resolveActivity = null;
                                        break;
                                    }
                                    resolveInfo2 = queryIntentActivities.get(i2);
                                }
                                i2++;
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.w("DefaultLayoutParser", "Unable to get info about resolve results", e);
                            }
                        }
                        resolveActivity = resolveInfo2;
                        if (resolveActivity == null) {
                            Log.w("DefaultLayoutParser", "No preference or single system activity found for ".concat(String.valueOf(parseUri.toString())));
                            return -1;
                        }
                    }
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent launchIntentForPackage = DefaultLayoutParser.this.mPackageManager.getLaunchIntentForPackage(activityInfo.packageName);
                if (launchIntentForPackage == null) {
                    return -1;
                }
                launchIntentForPackage.setFlags(270532608);
                DefaultLayoutParser defaultLayoutParser = DefaultLayoutParser.this;
                return defaultLayoutParser.addShortcut(activityInfo.loadLabel(defaultLayoutParser.mPackageManager).toString(), launchIntentForPackage, 0);
            } catch (URISyntaxException e2) {
                Log.e("DefaultLayoutParser", "Unable to add meta-favorite: ".concat(String.valueOf(attributeValue)), e2);
                return -1;
            }
        }
    }

    /* compiled from: PG */
    final class MyFolderParser extends AutoInstallsLayout.FolderParser {
        public MyFolderParser() {
            super(DefaultLayoutParser.this.getFolderElementsMap());
        }

        public final long parseAndAdd(XmlResourceParser xmlResourceParser) {
            int attributeResourceValue$ar$ds = AutoInstallsLayout.getAttributeResourceValue$ar$ds(xmlResourceParser, "folderItems");
            if (attributeResourceValue$ar$ds != 0) {
                xmlResourceParser = DefaultLayoutParser.this.mSourceRes.getXml(attributeResourceValue$ar$ds);
                AutoInstallsLayout.beginDocument(xmlResourceParser, "folder");
            }
            return super.parseAndAdd(xmlResourceParser);
        }
    }

    /* compiled from: PG */
    final class PartnerFolderParser implements AutoInstallsLayout.TagParser {
        public PartnerFolderParser() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r4.mResources;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long parseAndAdd(android.content.res.XmlResourceParser r4) {
            /*
                r3 = this;
                com.android.launcher3.DefaultLayoutParser r4 = com.android.launcher3.DefaultLayoutParser.this
                android.content.pm.PackageManager r4 = r4.mPackageManager
                com.android.launcher3.Partner r4 = com.android.launcher3.Partner.get(r4)
                if (r4 == 0) goto L_0x0031
                android.content.res.Resources r0 = r4.mResources
                java.lang.String r1 = "xml"
                java.lang.String r4 = r4.mPackageName
                java.lang.String r2 = "partner_folder"
                int r4 = r0.getIdentifier(r2, r1, r4)
                if (r4 == 0) goto L_0x0031
                android.content.res.XmlResourceParser r4 = r0.getXml(r4)
                java.lang.String r1 = "folder"
                com.android.launcher3.AutoInstallsLayout.beginDocument(r4, r1)
                com.android.launcher3.AutoInstallsLayout$FolderParser r1 = new com.android.launcher3.AutoInstallsLayout$FolderParser
                com.android.launcher3.DefaultLayoutParser r2 = com.android.launcher3.DefaultLayoutParser.this
                java.util.HashMap r0 = r2.getFolderElementsMap(r0)
                r1.<init>(r0)
                long r0 = r1.parseAndAdd(r4)
                return r0
            L_0x0031:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.DefaultLayoutParser.PartnerFolderParser.parseAndAdd(android.content.res.XmlResourceParser):long");
        }
    }

    /* compiled from: PG */
    public final class ResolveParser implements AutoInstallsLayout.TagParser {
        private final AppShortcutWithUriParser mChildParser;

        protected ResolveParser() {
            this.mChildParser = new AppShortcutWithUriParser();
        }

        public final long parseAndAdd(XmlResourceParser xmlResourceParser) {
            int depth = xmlResourceParser.getDepth();
            long j = -1;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == 3) {
                    if (xmlResourceParser.getDepth() <= depth) {
                        return j;
                    }
                } else if (next == 2 && j <= -1) {
                    String name = xmlResourceParser.getName();
                    if ("favorite".equals(name)) {
                        j = this.mChildParser.parseAndAdd(xmlResourceParser);
                    } else {
                        Log.e("DefaultLayoutParser", "Fallback groups can contain only favorites, found ".concat(String.valueOf(name)));
                    }
                }
            }
        }
    }

    /* compiled from: PG */
    final class UriShortcutParser extends AutoInstallsLayout.ShortcutParser {
        public UriShortcutParser(DefaultLayoutParser defaultLayoutParser, Resources resources) {
            super(resources);
        }

        /* access modifiers changed from: protected */
        public final Intent parseIntent(XmlResourceParser xmlResourceParser) {
            String str;
            try {
                str = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "uri");
                try {
                    return Intent.parseUri(str, 0);
                } catch (URISyntaxException unused) {
                    Log.w("DefaultLayoutParser", "Shortcut has malformed uri: ".concat(String.valueOf(str)));
                    return null;
                }
            } catch (URISyntaxException unused2) {
                str = null;
                Log.w("DefaultLayoutParser", "Shortcut has malformed uri: ".concat(String.valueOf(str)));
                return null;
            }
        }
    }

    public DefaultLayoutParser(Context context, AppWidgetHost appWidgetHost, AutoInstallsLayout.LayoutParserCallback layoutParserCallback, Resources resources, int i) {
        super(context, appWidgetHost, layoutParserCallback, resources, i, "favorites");
    }

    /* access modifiers changed from: protected */
    public final HashMap getFolderElementsMap() {
        return getFolderElementsMap(this.mSourceRes);
    }

    /* access modifiers changed from: protected */
    public final HashMap getLayoutElementsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("favorite", new AppShortcutWithUriParser());
        hashMap.put("appwidget", new AutoInstallsLayout.AppWidgetParser());
        hashMap.put("shortcut", new UriShortcutParser(this, this.mSourceRes));
        hashMap.put("resolve", new ResolveParser());
        hashMap.put("folder", new MyFolderParser());
        hashMap.put("partner-folder", new PartnerFolderParser());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void parseContainerAndScreen(XmlResourceParser xmlResourceParser, long[] jArr) {
        jArr[0] = -100;
        String attributeValue = getAttributeValue(xmlResourceParser, "container");
        if (attributeValue != null) {
            jArr[0] = Long.valueOf(attributeValue).longValue();
        }
        jArr[1] = Long.parseLong(getAttributeValue(xmlResourceParser, "screen"));
    }

    public DefaultLayoutParser(Context context, AutoInstallsLayout.LayoutParserCallback layoutParserCallback, Resources resources, int i) {
        super(context, (AppWidgetHost) null, layoutParserCallback, resources, i, "resolve");
    }

    /* access modifiers changed from: package-private */
    public final HashMap getFolderElementsMap(Resources resources) {
        HashMap hashMap = new HashMap();
        hashMap.put("favorite", new AppShortcutWithUriParser());
        hashMap.put("shortcut", new UriShortcutParser(this, resources));
        return hashMap;
    }
}
