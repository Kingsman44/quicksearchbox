package com.android.launcher3;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.android.launcher3.AutoInstallsLayout;
import com.android.launcher3.DefaultLayoutParser;
import com.google.android.googlequicksearchbox.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
public final class CommonAppTypeParser implements AutoInstallsLayout.LayoutParserCallback {
    final Context mContext;
    private final long mItemId;
    final int mResId;
    Intent parsedIntent;
    ContentValues parsedValues;

    /* compiled from: PG */
    final class MyLayoutParser extends DefaultLayoutParser {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public MyLayoutParser() {
            /*
                r3 = this;
                com.android.launcher3.CommonAppTypeParser.this = r4
                android.content.Context r0 = r4.mContext
                android.content.res.Resources r1 = r0.getResources()
                int r2 = r4.mResId
                r3.<init>(r0, r4, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CommonAppTypeParser.MyLayoutParser.<init>(com.android.launcher3.CommonAppTypeParser):void");
        }

        /* access modifiers changed from: protected */
        public final long addShortcut(String str, Intent intent, int i) {
            if (i == 0) {
                CommonAppTypeParser.this.parsedIntent = intent;
            }
            return super.addShortcut(str, intent, i);
        }

        public final void parseValues() {
            XmlResourceParser xml = this.mSourceRes.getXml(this.mLayoutId);
            try {
                beginDocument(xml, this.mRootTag);
                new DefaultLayoutParser.ResolveParser().parseAndAdd(xml);
            } catch (IOException | XmlPullParserException e) {
                Log.e("CommonAppTypeParser", "Unable to parse default app info", e);
            }
            xml.close();
        }
    }

    public CommonAppTypeParser(long j, int i, Context context) {
        this.mItemId = j;
        this.mContext = context;
        this.mResId = getResourceForItemType$ar$edu(i);
    }

    public static int getResourceForItemType$ar$edu(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return R.xml.app_target_phone;
                case 2:
                    return R.xml.app_target_messenger;
                case 3:
                    return R.xml.app_target_email;
                case 4:
                    return R.xml.app_target_browser;
                case 5:
                    return R.xml.app_target_gallery;
                case 6:
                    return R.xml.app_target_camera;
                default:
                    return 0;
            }
        } else {
            throw null;
        }
    }

    public final long generateNewItemId() {
        return this.mItemId;
    }

    public final long insertAndCheck(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        this.parsedValues = contentValues;
        contentValues.put("iconType", (Integer) null);
        contentValues.put("iconPackage", (String) null);
        contentValues.put("iconResource", (String) null);
        byte[] bArr = null;
        contentValues.put("icon", (byte[]) null);
        return 1;
    }
}
