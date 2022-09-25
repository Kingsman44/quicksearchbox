package com.google.android.apps.gsa.shared.util;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.content.C1882h;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.base.C58869cf;
import com.google.common.base.C58879cp;
import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.protobuf.C63088z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.bp */
/* compiled from: PG */
public final class C90772bp {

    /* renamed from: a */
    public static final Charset f253863a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C59071e f253864b = C59071e.m91332i("com.google.android.apps.gsa.shared.util.bp");

    /* renamed from: A */
    public static boolean m148274A(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.equals(str)) {
                return true;
            }
            if (str2.endsWith("*") && str.startsWith(str2.substring(0, str2.length() - 1))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m148275B(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: C */
    public static boolean m148276C(Uri uri) {
        return C58890d.m90990e(uri.getAuthority(), "/android_asset") && C58890d.m90990e(uri.getScheme(), "file");
    }

    /* renamed from: D */
    public static boolean m148277D(Context context) {
        BluetoothAdapter defaultAdapter;
        if (context == null || context.getApplicationContext() == null || C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH") != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m148278E(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        String c = C58890d.m90988c(scheme);
        if ("file".equals(c) || "content".equals(c) || "android.resource".equals(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m148279F(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.launcher", 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: G */
    public static boolean m148280G(Context context) {
        if (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m148281H(Context context) {
        if (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "zen_mode", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m148282I(Context context) {
        PowerManager powerManager;
        if (context == null || context.getApplicationContext() == null || (powerManager = (PowerManager) context.getApplicationContext().getSystemService("power")) == null || !powerManager.isPowerSaveMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static boolean m148283J(Context context) {
        try {
            return ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        } catch (VerifyError e) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56225c()).mo56382g(e)).mo56372aa(11343)).mo56393w("API version: %d, Kitkat API version: %d", Build.VERSION.SDK_INT, 19);
            return false;
        }
    }

    /* renamed from: K */
    public static boolean m148284K(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled();
    }

    /* renamed from: L */
    public static boolean m148285L(String str, String str2) {
        return TextUtils.equals(m148310r(str), m148310r(str2));
    }

    /* renamed from: M */
    public static boolean m148286M(Context context, boolean z) {
        if (context == null || context.getApplicationContext() == null || C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH_ADMIN") != 0) {
            return false;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (z) {
            return defaultAdapter.enable();
        }
        return defaultAdapter.disable();
    }

    /* renamed from: N */
    public static byte[] m148287N(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        byte[] d = C59332o.m92213d(open);
        open.close();
        return d;
    }

    /* renamed from: O */
    public static byte[] m148288O(Resources resources, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = resources.openRawResource(i);
            try {
                byte[] d = C59332o.m92213d(inputStream);
                C59337t.m92221a(inputStream);
                return d;
            } catch (IOException e) {
                e = e;
                try {
                    ((C59052c) ((C59052c) ((C59052c) f253864b.mo56225c()).mo56382g(e)).mo56372aa(11345)).mo56387q("Failed to load raw resource %d", i);
                    C59337t.m92221a(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    C59337t.m92221a(inputStream2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56225c()).mo56382g(e)).mo56372aa(11345)).mo56387q("Failed to load raw resource %d", i);
            C59337t.m92221a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C59337t.m92221a(inputStream2);
            throw th;
        }
    }

    /* renamed from: P */
    public static byte[] m148289P(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: Q */
    public static String m148290Q(String str) {
        return str.endsWith("FollowOn") ? str.substring(0, str.length() - 8) : str;
    }

    /* renamed from: R */
    public static Map m148291R(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String quote = Pattern.quote("&");
            String quote2 = Pattern.quote("=");
            for (String trim : str.split(quote)) {
                String trim2 = trim.trim();
                if (!TextUtils.isEmpty(trim2)) {
                    String[] split = trim2.split(quote2);
                    if (split.length == 2) {
                        hashMap.put(split[0].trim(), split[1].trim());
                    } else {
                        throw new IllegalArgumentException("Cannot parse key-value pair: ".concat(String.valueOf(trim2)));
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: S */
    private static boolean m148292S(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        try {
            for (String str : bundle.keySet()) {
                bundle.get(str);
            }
            return true;
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56226d()).mo56382g(e)).mo56372aa(11341)).mo56386p("Error probing the bundle");
            return false;
        }
    }

    /* renamed from: a */
    public static Intent m148293a(Intent intent) {
        if (intent != null && m148292S(intent.getExtras())) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    public static Bitmap m148294b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m148295c(android.content.Context r3, android.net.Uri r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0056
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ all -> 0x0047 }
            android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r4)     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0011
            com.google.common.p4541l.C59337t.m92221a(r0)
            return r0
        L_0x0011:
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r4 = r1.openAssetFile(r4, r2)     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0020
            com.google.common.p4541l.C59337t.m92221a(r0)
        L_0x001c:
            r1.release()
            return r0
        L_0x0020:
            java.io.FileInputStream r2 = r4.createInputStream()     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x002d
            com.google.common.p4541l.C59337t.m92221a(r0)
            m148316x(r4)
            goto L_0x001c
        L_0x002d:
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x003f }
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromResourceStream(r3, r0, r2, r0)     // Catch:{ all -> 0x003f }
            com.google.common.p4541l.C59337t.m92221a(r2)
            m148316x(r4)
            r1.release()
            return r3
        L_0x003f:
            r3 = move-exception
            r0 = r2
            goto L_0x004a
        L_0x0042:
            r3 = move-exception
            goto L_0x004a
        L_0x0044:
            r3 = move-exception
            r4 = r0
            goto L_0x004a
        L_0x0047:
            r3 = move-exception
            r4 = r0
            r1 = r4
        L_0x004a:
            com.google.common.p4541l.C59337t.m92221a(r0)
            m148316x(r4)
            if (r1 == 0) goto L_0x0055
            r1.release()
        L_0x0055:
            throw r3
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C90772bp.m148295c(android.content.Context, android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: d */
    public static Drawable m148296d(Context context, Uri uri) {
        Pair k = m148303k(context, uri);
        try {
            return ((Resources) k.first).getDrawable(((Integer) k.second).intValue());
        } catch (Resources.NotFoundException unused) {
            throw new FileNotFoundException("Resource does not exist: ".concat(String.valueOf(String.valueOf(uri))));
        }
    }

    /* renamed from: e */
    public static Drawable m148297e(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(uri.toString());
            if (parseInt == 0) {
                return null;
            }
            return context.getResources().getDrawable(parseInt);
        } catch (NumberFormatException unused) {
            return m148296d(context, uri);
        }
    }

    /* renamed from: f */
    public static Bundle m148298f(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 11);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            Bundle bundle = new Bundle();
            bundle.readFromParcel(obtain);
            obtain.recycle();
            return m148299g(bundle);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56226d()).mo56382g(e)).mo56372aa(11334)).mo56386p("Error decoding base64 encoded bundle.");
            return null;
        }
    }

    /* renamed from: g */
    public static Bundle m148299g(Bundle bundle) {
        if (m148292S(bundle)) {
            return bundle;
        }
        return null;
    }

    /* renamed from: h */
    public static Bundle m148300h(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    /* renamed from: i */
    public static Parcelable m148301i(C63088z zVar, Parcelable.Creator creator) {
        return m148302j(zVar.mo59174N(), creator);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public static Parcelable m148302j(byte[] bArr, Parcelable.Creator creator) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable parcelable = (Parcelable) creator.createFromParcel(obtain);
            obtain.recycle();
            return parcelable;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56225c()).mo56382g(e)).mo56372aa(11335)).mo56386p("Failed to unmarshall");
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: k */
    public static Pair m148303k(Context context, Uri uri) {
        Resources resources;
        int i;
        if ("android.resource".equals(uri.getScheme())) {
            String authority = uri.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                if (TextUtils.equals(authority, "com.google.android.googlequicksearchbox") || TextUtils.equals(authority, "android")) {
                    resources = context.getResources();
                } else {
                    try {
                        resources = context.getPackageManager().getResourcesForApplication(authority);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new FileNotFoundException("Failed to get resources: ".concat(e.toString()));
                    }
                }
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(String.valueOf(uri))));
                        }
                    } else if (size == 2) {
                        i = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(String.valueOf(uri))));
                    }
                    if (i != 0) {
                        return new Pair(resources, Integer.valueOf(i));
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(String.valueOf(uri))));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(String.valueOf(uri))));
            }
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(String.valueOf(uri))));
        }
        throw new FileNotFoundException("Not an android.resource URI: ".concat(String.valueOf(String.valueOf(uri))));
    }

    /* renamed from: l */
    public static C58485gu m148304l(String str) {
        if (TextUtils.isEmpty(str)) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginArray();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                e.mo55395g(jsonReader.nextString());
            }
            jsonReader.endArray();
            C58485gu f = e.mo55394f();
            try {
                C59337t.m92223c(jsonReader);
                return f;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        } catch (IOException e3) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56226d()).mo56382g(e3)).mo56372aa(11336)).mo56386p("IOException reading string map from JSON");
            try {
                C59337t.m92223c(jsonReader);
                return null;
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        } catch (Throwable th) {
            try {
                C59337t.m92223c(jsonReader);
                throw th;
            } catch (IOException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    /* renamed from: m */
    public static C63088z m148305m(Parcelable parcelable) {
        byte[] bArr;
        try {
            bArr = m148289P(parcelable);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f253864b.mo56226d()).mo56382g(e)).mo56372aa(11337)).mo56386p("Failed to marshall Parcelable ");
            bArr = null;
        }
        if (bArr == null) {
            return C63088z.f170246b;
        }
        return C63088z.m96139A(bArr);
    }

    /* renamed from: n */
    public static InputStream m148306n(AssetManager assetManager, Uri uri) {
        return assetManager.open(C58879cp.m90963e(uri.getPath()));
    }

    /* renamed from: o */
    public static InputStream m148307o(ContentResolver contentResolver, Uri uri) {
        return C23335a.m43765b(contentResolver, uri);
    }

    /* renamed from: p */
    public static String m148308p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        String encodeToString = Base64.encodeToString(obtain.marshall(), 11);
        obtain.recycle();
        return encodeToString;
    }

    /* renamed from: q */
    public static String m148309q(String str) {
        return str.replaceFirst("file", "https").replaceFirst("/android_asset", "/appassets.androidplatform.net/assets");
    }

    /* renamed from: r */
    public static String m148310r(String str) {
        List i = C58869cf.m90936b(new C58903m('-')).mo56155i(str);
        if (i.size() == 1) {
            return str;
        }
        return (String) i.get(0);
    }

    /* renamed from: s */
    public static String m148311s() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder(locale.getLanguage().toLowerCase(Locale.US));
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country.toUpperCase(Locale.US));
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static String m148312t(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append("-");
            sb.append(variant);
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append("-");
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public static Locale m148313u(String str) {
        String[] split = str.split("-");
        int length = split.length;
        if (length == 1) {
            return new Locale(split[0]);
        }
        if (length == 2) {
            if (split[1].equals("Hant") || split[1].equals("Hans")) {
                return new Locale(split[0], BuildConfig.FLAVOR, split[1]);
            }
            return new Locale(split[0], split[1]);
        } else if (length == 3) {
            return new Locale(split[0], split[2], split[1]);
        } else {
            ((C59052c) ((C59052c) f253864b.mo56226d()).mo56372aa(11339)).mo56389s("Unsupported locale format: %s", str);
            return null;
        }
    }

    /* renamed from: v */
    public static Map m148314v(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: w */
    public static final Map m148315w(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.beginObject();
                while (jsonReader.peek() == JsonToken.NAME) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
                try {
                    C59337t.m92223c(jsonReader);
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) f253864b.mo56226d()).mo56382g(e2)).mo56372aa(11340)).mo56386p("IOException reading string map from JSON");
                try {
                    C59337t.m92223c(jsonReader);
                    return null;
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            } catch (Throwable th) {
                try {
                    C59337t.m92223c(jsonReader);
                    throw th;
                } catch (IOException e4) {
                    throw new AssertionError(e4);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: x */
    public static void m148316x(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: y */
    public static void m148317y(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: z */
    public static void m148318z(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        if (i != 0) {
            textView.setVisibility(0);
            textView.setText(i);
            return;
        }
        textView.setVisibility(8);
    }
}
